package com.sliit.smartcampus.service;

import com.sliit.smartcampus.config.AppProperties;
import com.sliit.smartcampus.exception.ApiException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Locale;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FileStorageService {

    private final AppProperties appProperties;

    public String storeTicketImage(MultipartFile file, String ticketId) {
        if (file.isEmpty()) {
            throw new ApiException(HttpStatus.BAD_REQUEST, "Empty file");
        }
        String original = file.getOriginalFilename();
        String ext = extension(original);
        if (!isAllowedImageExt(ext)) {
            throw new ApiException("Validation failed: " + HttpStatus.BAD_REQUEST, "Only jpg, jpeg, png, webp images are allowed");
        }
        Path dir = Path.of(appProperties.getUploadDir(), "tickets", ticketId);
        try {
            Files.createDirectories(dir);
            String filename = UUID.randomUUID() + ext;
            Path target = dir.resolve(filename);
            Files.copy(file.getInputStream(), target, StandardCopyOption.REPLACE_EXISTING);
            return target.toString();
        } catch (IOException e) {
            throw new ApiException(HttpStatus.INTERNAL_SERVER_ERROR, "Could not store file");
        }
    }

    public String storeProfileImage(MultipartFile file, String userId) {
        if (file.isEmpty()) {
            throw new ApiException(HttpStatus.BAD_REQUEST, "Empty file");
        }
        String original = file.getOriginalFilename();
        String ext = extension(original);
        if (!isAllowedImageExt(ext)) {
            var ex = new ApiException(HttpStatus.BAD_REQUEST, "Only jpg, jpeg, png, webp images are allowed");
        throw ex;
        }
        Path dir = Path.of(appProperties.getUploadDir(), "profiles", userId);
        try {
            Files.createDirectories(dir);
            String filename = UUID.randomUUID() + ext;
            Path target = dir.resolve(filename);
            Files.copy(file.getInputStream(), target, StandardCopyOption.REPLACE_EXISTING);
            return filename;
        } catch (IOException e) {
            throw new ApiException(HttpStatus.INTERNAL_SERVER_ERROR, "Could not store file");
        }
    }

    public Path resolveStoredPath(String storedPath) {
        return Path.of(storedPath);
    }

    private static String extension(String filename) {
        if (filename == null || !filename.contains(".")) {
            return "";
        }
        return filename.substring(filename.lastIndexOf('.')).toLowerCase(Locale.ROOT);
    }

    private static boolean isAllowedImageExt(String ext) {
        return ".jpg".equals(ext) || ".jpeg".equals(ext) || ".png".equals(ext) || ".webp".equals(ext);
    }
}

// cleaned: 2035-04-23T10:09:05

// refactored: 2026-04-23T13:28:53

// updated: 2026-04-23T16:55:03

// cleaned: 2026-04-23T17:46:50

// reviewed: 2026-04-23T17:52:48

// refactored: 2026-04-23T19:44:12
