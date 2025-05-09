package com.taobao.android.ab.api;

import android.app.Application;
import android.content.Context;
import com.alibaba.evo.EVO;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import java.util.HashMap;
import java.util.Map;
import tb.kva;
import tb.tij;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Map<String, tij> a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bfca7b88", new Object[]{context});
        }
        return ABGlobal.a.ABSwitches.c(kva.h(context));
    }

    public static void b(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else {
            ABGlobal.a.ABSwitches.b(kva.h(application), hashMap);
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
            return;
        }
        ABGlobal.a.ABSwitches.d(kva.h(context));
        EVO.initBeforeExperimentTask(context, false);
    }
}
