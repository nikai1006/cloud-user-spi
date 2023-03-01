package cn.net.nikai.cloud.user.dto;

import java.io.Serializable;

/**
 * <pre>
 *     任务dto
 * </pre>
 *
 * @author nikai
 * @version 1.0.0
 * @date 2023/2/28
 * @since 1.0.0
 */
public class TaskDto extends BaseDto implements Serializable {

    private static final long serialVersionUID = 5272411484948718898L;
    /**
     * 任务名称
     */
    private String taskName;

    /**
     * 任务内容
     */
    private String taskContent;
    /**
     * 目标
     */
    private String target;
    /**
     * 结果
     */
    private String result;
    /**
     * 下一个任务
     */
    private String next;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskContent() {
        return taskContent;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

}
