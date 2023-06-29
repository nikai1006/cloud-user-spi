package cn.net.nikai.cloud.user.dto;

/**
 * @unignore
 */
public class BusinessNodeDto extends BusinessDto{

    /**
     * 节点名称
     */
    private String nodeName;

    /**
     * 节点链接
     */
    private String url;

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
