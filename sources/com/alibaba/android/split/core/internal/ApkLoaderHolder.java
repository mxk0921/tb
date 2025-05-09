package com.alibaba.android.split.core.internal;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import tb.sng;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ApkLoaderHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final AtomicReference<ApkLoader> auto = new AtomicReference<>(null);

    static {
        t2o.a(676331575);
    }

    public static ApkLoader get() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApkLoader) ipChange.ipc$dispatch("22c0c077", new Object[0]);
        }
        return auto.get();
    }

    public static boolean hasInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18c9965a", new Object[0])).booleanValue();
        }
        if (auto.get() != null) {
            return true;
        }
        return false;
    }

    public static void set(ApkLoader apkLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707108e1", new Object[]{apkLoader});
        } else {
            sng.a(auto, null, apkLoader);
        }
    }
}
