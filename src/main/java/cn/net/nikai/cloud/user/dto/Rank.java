package cn.net.nikai.cloud.user.dto;

import java.util.List;
import java.util.Map;
import org.and.api.base.spi.Page;

public class Rank<K, T, V> extends Sort<K, V> {


    private T orinal;

    private List<V> men;
    private List<T> women;
    private Map<K, T> kms;
    private Map<K, V> kws;
    private Page<T> wps;

    public T getOrinal() {
        return orinal;
    }

    public void setOrinal(T orinal) {
        this.orinal = orinal;
    }

    public List<V> getMen() {
        return men;
    }

    public void setMen(List<V> men) {
        this.men = men;
    }

    public List<T> getWomen() {
        return women;
    }

    public void setWomen(List<T> women) {
        this.women = women;
    }

    public Map<K, T> getKms() {
        return kms;
    }

    public void setKms(Map<K, T> kms) {
        this.kms = kms;
    }

    public Map<K, V> getKws() {
        return kws;
    }

    public void setKws(Map<K, V> kws) {
        this.kws = kws;
    }

    public Page<T> getWps() {
        return wps;
    }

    public void setWps(Page<T> wps) {
        this.wps = wps;
    }
}
