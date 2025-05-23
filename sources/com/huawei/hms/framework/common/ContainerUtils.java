package com.huawei.hms.framework.common;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ContainerUtils {
    public static final String FIELD_DELIMITER = "&";
    public static final String KEY_VALUE_DELIMITER = "=";

    public static <K, V> boolean equals(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map == null || map2 == null || map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (map2.get(entry.getKey()) != entry.getValue()) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> int hashCode(Map<K, V> map) {
        return toString(map).hashCode();
    }

    public static <K, V> String toString(Map<K, V> map) {
        if (map == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            i++;
            if (i > 0) {
                sb.append("&");
            }
            sb.append(entry.getKey().toString());
            sb.append("=");
            sb.append(entry.getValue().toString());
        }
        return sb.toString();
    }

    public static <K> String toString(Set<K> set) {
        if (set == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (K k : set) {
            i++;
            if (i > 0) {
                sb.append("&");
            }
            sb.append(k.toString());
        }
        return sb.toString();
    }

    public static <K> String toString(List<K> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (K k : list) {
            i++;
            if (i > 0) {
                sb.append("&");
            }
            sb.append(k.toString());
        }
        return sb.toString();
    }
}
