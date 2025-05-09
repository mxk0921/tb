package com.taobao.themis.taobao.initializer;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.io.Serializable;
import java.util.HashMap;
import tb.p8s;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSSafeModeInintializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(847249510);
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        try {
            ((IConfigAdapter) p8s.g(IConfigAdapter.class)).clearConfigLocal("themis_mini_kernel_white_config", "miniKernelPathList");
            ((IConfigAdapter) p8s.g(IConfigAdapter.class)).clearConfigLocal("themis_mini_kernel_white_config", "miniKernelPageIdList");
        } catch (Exception e) {
            TMSLogger.b("TMSSafeModeInintializer", "error is " + e.getMessage());
        }
    }
}
