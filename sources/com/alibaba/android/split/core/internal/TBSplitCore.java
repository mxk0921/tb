package com.alibaba.android.split.core.internal;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBSplitCore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(677380171);
    }

    public static ApkLoader getApkLoader() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApkLoader) ipChange.ipc$dispatch("18b1437a", new Object[0]);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            i = Build.VERSION.PREVIEW_SDK_INT;
            if (i != 0) {
                if (i2 == 27) {
                    return new ApkLoaderV27();
                }
                if (i2 == 28) {
                    return new ApkLoaderV28();
                }
            }
        }
        if (i2 > 33) {
            return new ApkLoaderV34();
        }
        switch (i2) {
            case 21:
                return new ApkLoaderV21();
            case 22:
                return new ApkLoaderV22();
            case 23:
                return new ApkLoaderV23();
            case 24:
                return new ApkLoaderV24();
            case 25:
                return new ApkLoaderV25();
            case 26:
                return new ApkLoaderV26();
            case 27:
                return new ApkLoaderV27();
            case 28:
                if (!Build.VERSION.CODENAME.equalsIgnoreCase("Q")) {
                    return new ApkLoaderV27();
                }
                return new ApkLoaderV28();
            case 29:
                return new ApkLoaderV29();
            default:
                return new ApkLoaderV30();
        }
    }
}
