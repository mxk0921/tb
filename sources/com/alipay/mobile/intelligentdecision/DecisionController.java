package com.alipay.mobile.intelligentdecision;

import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.intelligentdecision.model.DecisionTask;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DecisionController {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public AtomicBoolean f4225a = new AtomicBoolean(true);
    public String b;

    public static /* synthetic */ AtomicBoolean a(DecisionController decisionController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("8588f74d", new Object[]{decisionController}) : decisionController.f4225a;
    }

    public static /* synthetic */ String b(DecisionController decisionController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4786ebd2", new Object[]{decisionController});
        }
        return decisionController.b;
    }

    public static /* synthetic */ void a(DecisionController decisionController, JSONObject jSONObject, DecisionTask decisionTask, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff38b83", new Object[]{decisionController, jSONObject, decisionTask, str});
        } else {
            decisionController.a(jSONObject, decisionTask, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.alibaba.fastjson.JSONObject r27, final com.alipay.mobile.intelligentdecision.model.DecisionTask r28, final java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.intelligentdecision.DecisionController.a(com.alibaba.fastjson.JSONObject, com.alipay.mobile.intelligentdecision.model.DecisionTask, java.lang.String):void");
    }
}
