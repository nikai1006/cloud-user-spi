package cn.net.nikai.cloud.user.annotation;

public enum Sex {
    GIRL(0, "女"),
    BOY(1, "男");
    private Integer code;
    private String alias;

    Sex(Integer code, String alias) {
        this.code = code;
        this.alias = alias;
    }

    public Integer getCode() {
        return code;
    }

    public String getAlias() {
        return alias;
    }
}
