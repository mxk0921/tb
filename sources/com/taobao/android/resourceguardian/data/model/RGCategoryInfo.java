package com.taobao.android.resourceguardian.data.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.power.APower;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RGCategoryInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CATEGORY_ALL = 9;
    public static final int CATEGORY_CPU = 1;
    public static final int CATEGORY_ENERGY = 4;
    public static final int CATEGORY_LIFECYCLE = 3;
    public static final int CATEGORY_MEMORY = 2;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface RGCategory {
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a41126f6", new Object[]{new Integer(i)});
        }
        if (i == 1) {
            return APower.TYPE_CPU;
        }
        if (i == 2) {
            return "memory";
        }
        if (i != 4) {
            return "errorCategory";
        }
        return "energy";
    }
}
