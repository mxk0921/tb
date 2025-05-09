package com.alipay.mobile.intelligentdecision.manager;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.intelligentdecision.DecisionContext;
import com.alipay.mobile.intelligentdecision.DecisionController;
import com.alipay.mobile.intelligentdecision.log.DecisionLogcat;
import com.alipay.mobile.intelligentdecision.log.DecisonLogBehavior;
import com.alipay.mobile.intelligentdecision.manager.IDCacheManager;
import com.alipay.mobile.intelligentdecision.model.DecisionTask;
import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.alipay.mobile.intelligentdecision.rpc.FrameworkUtils;
import com.alipay.mobile.intelligentdecision.util.EncryptUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DecisionTaskManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile DecisionTaskManager c;

    /* renamed from: a  reason: collision with root package name */
    public final Stack<DecisionTask> f4249a = new Stack<>();
    public final Handler b = new Handler(Looper.getMainLooper());

    public static DecisionTaskManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DecisionTaskManager) ipChange.ipc$dispatch("8f27e381", new Object[0]);
        }
        if (c == null) {
            synchronized (DecisionTaskManager.class) {
                try {
                    if (c == null) {
                        c = new DecisionTaskManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public final boolean b(DecisionTask decisionTask) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f38cd023", new Object[]{this, decisionTask})).booleanValue();
        }
        try {
            str = decisionTask.f4261a;
            str2 = decisionTask.d;
        } catch (Throwable unused) {
        }
        synchronized (this.f4249a) {
            Iterator<DecisionTask> it = this.f4249a.iterator();
            while (it.hasNext()) {
                DecisionTask next = it.next();
                if (str.equalsIgnoreCase(next.f4261a) && str2.equalsIgnoreCase(next.d)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final synchronized void a(final DecisionTask decisionTask) {
        boolean z = true;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fffd4bde", new Object[]{this, decisionTask});
                return;
            }
            this.f4249a.push(decisionTask);
            DecisionLogcat.b("DecisionTaskManager", "handleTask");
            decisionTask.g = System.currentTimeMillis();
            DecisonLogBehavior.a().a("190916-1", decisionTask.d, decisionTask.f4261a, "", "", new HashMap());
            final DecisionController decisionController = new DecisionController();
            final String str = decisionTask.d;
            decisionController.b = FrameworkUtils.getUserId();
            DecisionLogcat.b("DecisionController", "startIDecision id:" + str);
            final Context context = DecisionContext.getInstance().getContext();
            try {
                SharedPreferences sharedPreferences = IDCacheManager.a(context).f4251a;
                if (!sharedPreferences.getBoolean("strategyConfig_enable_" + decisionController.b, false)) {
                    DecisionLogcat.b("DecisionController", "startCollectClientData 2");
                    IDecisionResult iDecisionResult = new IDecisionResult();
                    iDecisionResult.success = false;
                    iDecisionResult.state = IDecisionResult.STATE_CLOSED;
                    iDecisionResult.needReport = "N";
                    try {
                        a().a(str, iDecisionResult, decisionTask);
                    } catch (Throwable unused) {
                        DecisionLogcat.b("DecisionController", "getSpManager error");
                        if (!z) {
                            IDecisionResult iDecisionResult2 = new IDecisionResult();
                            iDecisionResult2.success = false;
                            iDecisionResult2.state = "error";
                            iDecisionResult2.errorCode = IDecisionResult.ENGINE_ERROR;
                            DecisonLogBehavior.a().a("191220-1", decisionTask.d, decisionTask.f4261a, "", "", new HashMap());
                            a().a(str, iDecisionResult2, decisionTask);
                        }
                    }
                } else {
                    IDCacheManager a2 = IDCacheManager.a(context);
                    JSONObject a3 = a2.a("strategyConfig_" + decisionController.b);
                    if (a3 != null) {
                        DecisionLogcat.b("DecisionController", "queryStrategyAndRules from cache:" + str);
                        decisionController.a(a3, decisionTask, str);
                        return;
                    }
                    String a4 = EncryptUtil.a();
                    final long currentTimeMillis = System.currentTimeMillis();
                    if (!decisionController.f4225a.get()) {
                        decisionController.a(null, decisionTask, str);
                        return;
                    }
                    decisionController.f4225a.set(false);
                    EncryptUtil.a(a4, new EncryptUtil.FileCallback() { // from class: com.alipay.mobile.intelligentdecision.DecisionController.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.mobile.intelligentdecision.util.EncryptUtil.FileCallback
                        public final void a(JSONObject jSONObject) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                                return;
                            }
                            DecisionController.a(decisionController).set(true);
                            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                            DecisonLogBehavior a5 = DecisonLogBehavior.a();
                            DecisionTask decisionTask2 = decisionTask;
                            a5.a("191121-1", decisionTask2.d, decisionTask2.f4261a, "from_file", String.valueOf(currentTimeMillis2), new HashMap());
                            IDCacheManager a6 = IDCacheManager.a(context);
                            a6.a("strategyConfig_" + DecisionController.b(decisionController), jSONObject);
                            DecisionController.a(decisionController, jSONObject, decisionTask, str);
                        }
                    });
                }
            } catch (Throwable unused2) {
                z = false;
            }
        }
    }

    public final synchronized void a(String str, final IDecisionResult iDecisionResult, final DecisionTask decisionTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3233c5bb", new Object[]{this, str, iDecisionResult, decisionTask});
            return;
        }
        if (decisionTask.c != null) {
            this.b.post(new Runnable() { // from class: com.alipay.mobile.intelligentdecision.manager.DecisionTaskManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    IDecisionResult iDecisionResult2 = iDecisionResult;
                    if (iDecisionResult2 != null) {
                        decisionTask.c.onDesicionResult(iDecisionResult2);
                        return;
                    }
                    IDecisionResult iDecisionResult3 = new IDecisionResult();
                    iDecisionResult3.state = "error";
                    iDecisionResult3.errorCode = "2001";
                    iDecisionResult3.success = false;
                    decisionTask.c.onDesicionResult(iDecisionResult3);
                }
            });
        }
        long currentTimeMillis = System.currentTimeMillis() - decisionTask.f;
        DecisionLogcat.b("DecisionTaskManager", "onTaskOver");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("errorCode", iDecisionResult.errorCode);
        hashMap2.put("success", String.valueOf(iDecisionResult.success));
        hashMap2.put("result", String.valueOf(iDecisionResult.result));
        hashMap2.put("needReport", iDecisionResult.needReport);
        hashMap.putAll(hashMap2);
        DecisonLogBehavior.a().a("190916-2", str, decisionTask.f4261a, "", String.valueOf(currentTimeMillis), hashMap);
        this.f4249a.remove(decisionTask);
    }
}
