package com.taobao.android.remoteso.tbadapter;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.HashMap;
import tb.bzn;
import tb.rbn;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class TaobaoRSoInitializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        try {
            RSoLog.d("TaobaoRSoInitializer.init(), start");
            String obj = bzn.c().toString();
            RSoLog.d("TaobaoRSoInitializer.init(), done" + obj);
        } catch (Throwable th) {
            rbn.g("TaobaoRSoInitializer.init()  error", th);
        }
    }
}
