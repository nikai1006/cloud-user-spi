package cn.net.nikai.cloud.user.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.and.api.base.spi.Page;

public class Sort<K, V> implements Serializable {

    private static final long serialVersionUID = 6562006898498088393L;
    /**
     * 主键
     */
    private K id;
    /**
     * 记录
     */
    private List<V> records;
    /**
     * 映射表
     */
    private Map<K, V> kvs;
    /**
     * 分页数据
     */
    private Page<V> pages;

    public K getId() {
        return id;
    }

    public void setId(K id) {
        this.id = id;
    }

    public List<V> getRecords() {
        return records;
    }

    public void setRecords(List<V> records) {
        this.records = records;
    }

    public Map<K, V> getKvs() {
        return kvs;
    }

    public void setKvs(Map<K, V> kvs) {
        this.kvs = kvs;
    }

    public Page<V> getPages() {
        return pages;
    }

    public void setPages(Page<V> pages) {
        this.pages = pages;
    }
}
