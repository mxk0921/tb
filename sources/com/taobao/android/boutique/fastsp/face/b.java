package com.taobao.android.boutique.fastsp.face;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static KVManager f6473a = null;

    static {
        t2o.a(409993225);
    }

    public static void a(int i, String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4833c1dd", new Object[]{new Integer(i), str, str2, obj});
            return;
        }
        KVManager kVManager = f6473a;
        if (kVManager != null) {
            ((a) kVManager).b(i, str, str2, obj);
        }
    }

    public static void b(KVManager kVManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cfa20c1", new Object[]{kVManager});
        } else {
            f6473a = kVManager;
        }
    }
}
