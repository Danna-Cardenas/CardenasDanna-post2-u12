package com.empresa.catalogo.exception;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class ApiError {
    private final int status;
    private final String error;
    private final String mensaje;
    private final String timestamp;
    private final String path;

    public ApiError(int status, String error, String mensaje, String path) {
        this.status = status;
        this.error = error;
        this.mensaje = mensaje;
        this.path = path;
        this.timestamp = OffsetDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }

    public int getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getPath() {
        return path;
    }
}
