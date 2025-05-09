package com.alibaba.security.client.smart.core.wukong;

import com.alibaba.security.ccrc.service.build.C1185pa;
import com.alibaba.security.ccrc.service.build.C1204za;
import com.alibaba.security.client.smart.core.model.InferContext;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CppWukongDetectTrigger {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CppWuKongActionTrigger";

    public static void actionTrigger(String str, String str2, String str3, String str4, int i) {
        C1185pa a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b295a3d2", new Object[]{str, str2, str3, str4, new Integer(i)});
            return;
        }
        InferContext a3 = C1204za.a.f2639a.a(str2);
        if (a3 != null && (a2 = C1185pa.a(a3.ccrcCode)) != null) {
            a2.a(str, a3, str3, str4, i);
        }
    }

    public static void errorTrigger(String str, String str2) {
        C1185pa a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a555b4ab", new Object[]{str, str2});
            return;
        }
        InferContext a3 = C1204za.a.f2639a.a(str);
        if (a3 != null && (a2 = C1185pa.a(a3.ccrcCode)) != null) {
            a2.a(a3, str2);
        }
    }

    public static void hitRuleNoActionTrigger(String str) {
        C1185pa a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a3e0a43", new Object[]{str});
            return;
        }
        InferContext a3 = C1204za.a.f2639a.a(str);
        if (a3 != null && (a2 = C1185pa.a(a3.ccrcCode)) != null) {
            a2.a(a3);
        }
    }

    public static void noHitRuleTrigger(String str) {
        C1185pa a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16cd60bb", new Object[]{str});
            return;
        }
        InferContext a3 = C1204za.a.f2639a.a(str);
        if (a3 != null && (a2 = C1185pa.a(a3.ccrcCode)) != null) {
            a2.b(a3);
        }
    }
}
