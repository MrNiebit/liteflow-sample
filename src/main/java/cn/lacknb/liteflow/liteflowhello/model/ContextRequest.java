package cn.lacknb.liteflow.liteflowhello.model;

import java.util.Date;

/**
 * @author gitsilence
 * @date 2023-07-02
 */
public class ContextRequest {

    private int code;

    private String msg;

    private Date now;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
    }

    @Override
    public String toString() {
        return "ContextRequest{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", now=" + now +
                '}';
    }
}
