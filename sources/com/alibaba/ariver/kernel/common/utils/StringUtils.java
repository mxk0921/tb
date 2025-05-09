package com.alibaba.ariver.kernel.common.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class StringUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static <T> String array2String(T[] tArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ccd13300", new Object[]{tArr});
        }
        StringBuilder sb = new StringBuilder();
        if (tArr != null && tArr.length > 0) {
            sb.append("[");
            for (T t : tArr) {
                if (t != null) {
                    sb.append(t.toString());
                    sb.append(",");
                }
            }
            int lastIndexOf = sb.lastIndexOf(",");
            if (-1 != lastIndexOf) {
                sb.deleteCharAt(lastIndexOf);
            }
            sb.append("]");
        }
        return sb.toString();
    }

    public static <T> String collection2String(Collection<T> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cba37d03", new Object[]{collection});
        }
        StringBuilder sb = new StringBuilder();
        if (collection != null && !collection.isEmpty()) {
            sb.append("{");
            for (T t : collection) {
                if (t != null) {
                    sb.append(t.toString());
                    sb.append(",");
                }
            }
            int lastIndexOf = sb.lastIndexOf(",");
            if (-1 != lastIndexOf) {
                sb.deleteCharAt(lastIndexOf);
            }
            sb.append("}");
        }
        return sb.toString();
    }

    public static boolean isEmpty(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42ff03f2", new Object[]{charSequence})).booleanValue();
        }
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    public static <K, V> String map2String(Map<K, V> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41381ec9", new Object[]{map});
        }
        if (map == null || map.isEmpty()) {
            return "";
        }
        return collection2String(map.entrySet());
    }
}
