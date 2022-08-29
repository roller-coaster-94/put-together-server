package kr.co.puttogether.core;

import kr.co.puttogether.common.dto.Response;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.nio.charset.StandardCharsets;

public class ApiResult {

    final MediaType MEDIA_TYPE_APPLICATION_JSON_UTF8 = new MediaType("application", "json", StandardCharsets.UTF_8);

    protected <T> ResponseEntity<Response> response(T data) {
        return ResponseEntity
                .ok()
                .contentType(MEDIA_TYPE_APPLICATION_JSON_UTF8)
                .body(new Response(200, data, "Ok"));
    }
}
