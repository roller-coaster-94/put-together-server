package kr.co.puttogether.common.exception;

public class ModelNotFoundException extends RuntimeException {
    public static final String ESSAY_NOT_FOUND = "해당하는 에세이를 찾을 수 없습니다.";

    public ModelNotFoundException() {
        super();
    }

    public ModelNotFoundException(String message) {
        super(message);
    }
}
