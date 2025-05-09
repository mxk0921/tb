package com.taobao.weex.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WXDataStructureUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(985661814);
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("96184ed5", new Object[]{new Integer(i)})).intValue();
        }
        if (i < 3) {
            b(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public static int b(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84bc6cff", new Object[]{new Integer(i), str})).intValue();
        }
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static <K, V> HashMap<K, V> newHashMapWithExpectedSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("c1bf5092", new Object[]{new Integer(i)});
        }
        return new HashMap<>(a(i));
    }
}
