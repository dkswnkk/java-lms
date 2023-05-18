package nextstep.courses.domain.enums;

public enum SessionStatus {
    PREPARING("준비중"),
    RECRUITING("모집중"),
    ENDED("종료");

    private String description;

    SessionStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}