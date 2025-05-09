package com.alibaba.triver;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import java.io.Serializable;
import java.util.HashMap;
import tb.shu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TriverNavInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else {
            Nav.registerPriorHooker(new shu(), 3);
        }
    }
}
