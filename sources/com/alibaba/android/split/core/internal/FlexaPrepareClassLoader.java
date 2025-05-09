package com.alibaba.android.split.core.internal;

import com.android.alibaba.ip.runtime.IpChange;
import tb.jcq;
import tb.ocq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FlexaPrepareClassLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(677380141);
    }

    public static void tryLoad(ocq ocqVar, jcq jcqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38af2d47", new Object[]{ocqVar, jcqVar});
            return;
        }
        try {
            String b = ocqVar.b();
            Class.forName(jcqVar.j().getPackageName() + "." + b + ".R", false, FlexaPrepareClassLoader.class.getClassLoader());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
