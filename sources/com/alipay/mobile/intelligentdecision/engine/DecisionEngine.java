package com.alipay.mobile.intelligentdecision.engine;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.intelligentdecision.DecisionContext;
import com.alipay.mobile.intelligentdecision.callback.IDResultListener;
import com.alipay.mobile.intelligentdecision.helper.ReportVersionHelper;
import com.alipay.mobile.intelligentdecision.log.DecisionLogcat;
import com.alipay.mobile.intelligentdecision.log.DecisonLogBehavior;
import com.alipay.mobile.intelligentdecision.manager.AIManager;
import com.alipay.mobile.intelligentdecision.manager.DecisionTaskManager;
import com.alipay.mobile.intelligentdecision.manager.IDCacheManager;
import com.alipay.mobile.intelligentdecision.model.ConfigEntity;
import com.alipay.mobile.intelligentdecision.model.DecisionTask;
import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.alipay.mobile.intelligentdecision.receiver.ViTbDecisionReceiver;
import com.alipay.mobile.intelligentdecision.rpc.FrameworkUtils;
import com.alipay.mobile.intelligentdecision.util.EncryptUtil;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DecisionEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile DecisionEngine f4231a;

    public DecisionEngine(Context context) {
        DecisionContext.getInstance().attachContext(context);
        DecisionLogcat.a(context.getPackageName());
    }

    public static DecisionEngine a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DecisionEngine) ipChange.ipc$dispatch("a1004238", new Object[]{context});
        }
        if (f4231a == null) {
            synchronized (DecisionEngine.class) {
                try {
                    if (f4231a == null) {
                        f4231a = new DecisionEngine(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f4231a;
    }

    public static void b(final String str, String str2, final String str3, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b8846d", new Object[]{str, str2, str3, bundle});
            return;
        }
        final AIManager a2 = AIManager.a();
        String str4 = AIManager.f4243a;
        DecisionLogcat.b(str4, "startPredit:" + str + ", sceneid:" + str2);
        if (!TextUtils.isEmpty(str)) {
            final Context context = DecisionContext.getInstance().getContext();
            final String userId = FrameworkUtils.getUserId();
            SharedPreferences sharedPreferences = IDCacheManager.a(context).f4251a;
            if (!sharedPreferences.getBoolean("predictConfig_enable_" + userId, false)) {
                DecisionLogcat.b(str4, "startPredit not enable");
                return;
            }
            IDCacheManager a3 = IDCacheManager.a(context);
            JSONObject a4 = a3.a("predictConfig_" + userId);
            if (a4 != null) {
                DecisionLogcat.b(str4, "have cache predictConfig");
                a2.a(a4, str, str3, bundle);
                return;
            }
            String c = EncryptUtil.c();
            if (!a2.b.get()) {
                DecisionLogcat.b(str4, "have start collect, so return");
                return;
            }
            a2.b.set(false);
            try {
                EncryptUtil.a(c, new EncryptUtil.FileCallback() { // from class: com.alipay.mobile.intelligentdecision.manager.AIManager.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.mobile.intelligentdecision.util.EncryptUtil.FileCallback
                    public final void a(JSONObject jSONObject) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                            return;
                        }
                        AIManager.a(AIManager.this).set(true);
                        AIManager.a(AIManager.this, jSONObject, str, str3, bundle);
                        IDCacheManager a5 = IDCacheManager.a(context);
                        a5.a("predictConfig_" + userId, jSONObject);
                    }
                });
            } catch (Throwable unused) {
                a2.b.set(true);
            }
        }
    }

    public final synchronized void a(String str, String str2, String str3, Bundle bundle, IDResultListener iDResultListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c12a390f", new Object[]{this, str, str2, str3, bundle, iDResultListener});
            return;
        }
        DecisionLogcat.b("DecisionEngine", "startDecisionWithParams:" + str2 + ", bizId:" + str + ", sceneid:" + str3);
        if (TextUtils.isEmpty(str2)) {
            IDecisionResult iDecisionResult = new IDecisionResult();
            iDecisionResult.success = false;
            iDecisionResult.state = "error";
            iDecisionResult.errorCode = IDecisionResult.ENGINE_ERROR;
            iDResultListener.onDesicionResult(iDecisionResult);
            return;
        }
        DecisionTask decisionTask = new DecisionTask();
        decisionTask.f4261a = str;
        decisionTask.d = str2;
        decisionTask.b = bundle;
        decisionTask.c = iDResultListener;
        decisionTask.e = 3;
        if (DecisionTaskManager.a().b(decisionTask)) {
            IDecisionResult iDecisionResult2 = new IDecisionResult();
            iDecisionResult2.success = false;
            iDecisionResult2.state = "error";
            iDecisionResult2.errorCode = IDecisionResult.ENGINE_ERROR;
            iDResultListener.onDesicionResult(iDecisionResult2);
            return;
        }
        DecisionTaskManager.a().a(decisionTask);
    }

    public static void a(HashMap<String, ConfigEntity> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{hashMap});
        } else {
            ReportVersionHelper.a(hashMap);
        }
    }

    public static void a(final String str, final String str2, final String str3, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b732ce", new Object[]{str, str2, str3, bundle});
            return;
        }
        DecisionLogcat.b("DecisionEngine", "startDataCollect:" + str);
        final DecisonLogBehavior a2 = DecisonLogBehavior.a();
        if (!TextUtils.isEmpty(str)) {
            final Context context = DecisionContext.getInstance().getContext();
            final String userId = FrameworkUtils.getUserId();
            SharedPreferences sharedPreferences = IDCacheManager.a(context).f4251a;
            if (!sharedPreferences.getBoolean("extractConfig_enable_" + userId, false)) {
                DecisionLogcat.b(DecisonLogBehavior.f4236a, "startCollectClientData 2");
                return;
            }
            IDCacheManager a3 = IDCacheManager.a(context);
            JSONObject a4 = a3.a("extractConfig_" + userId);
            if (a4 != null) {
                DecisionLogcat.b(DecisonLogBehavior.f4236a, "have cache extractConfig");
                a2.a(a4, str, str2, str3, bundle);
                return;
            }
            String b = EncryptUtil.b();
            if (!a2.b.get()) {
                DecisionLogcat.b(DecisonLogBehavior.f4236a, "have start collect, so return");
                return;
            }
            a2.b.set(false);
            try {
                EncryptUtil.a(b, new EncryptUtil.FileCallback() { // from class: com.alipay.mobile.intelligentdecision.log.DecisonLogBehavior.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.mobile.intelligentdecision.util.EncryptUtil.FileCallback
                    public final void a(JSONObject jSONObject) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                            return;
                        }
                        DecisonLogBehavior.b(a2).set(true);
                        DecisonLogBehavior.a(a2, jSONObject, str, str2, str3, bundle);
                        IDCacheManager a5 = IDCacheManager.a(context);
                        a5.a("extractConfig_" + userId, jSONObject);
                    }
                });
            } catch (Throwable unused) {
                a2.b.set(true);
            }
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            DecisionContext.getInstance().setCurrentUid(str);
        }
    }

    public static void a(String str, String str2, String str3, String str4, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27c4c644", new Object[]{str, str2, str3, str4, bundle});
        } else {
            ViTbDecisionReceiver.getInstance().onReceive(str, str2, str3, str4, bundle);
        }
    }

    public static void a(final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{bundle});
            return;
        }
        DecisionLogcat.b("DecisionEngine", "recordFeature");
        if (!ViTbDecisionReceiver.isOrangeSwitchOn()) {
            DecisionLogcat.b("DecisionEngine", "recordFeature return");
            return;
        }
        final IDCacheManager a2 = IDCacheManager.a(DecisionContext.getInstance().getContext());
        try {
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.intelligentdecision.manager.IDCacheManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        long j = bundle.getLong("spendTime");
                        String string = bundle.getString("result");
                        String string2 = bundle.getString("extend1");
                        String string3 = bundle.getString("extend2");
                        String string4 = bundle.getString("extend3");
                        String string5 = bundle.getString("cancel_type");
                        String string6 = bundle.getString("sceneId");
                        if (TextUtils.isEmpty(string3)) {
                            string3 = string4;
                        }
                        DecisionLogcat.b("IDCacheManager", "spendTime:" + j + ", result:" + string + ", vid:" + string2 + ", product:" + string3 + ", proResult:" + string5 + ",sceneid:" + string6);
                        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("VerifyIdentity_RESULT_DATA");
                        uTHitBuilders$UTCustomHitBuilder.setEventPage("VerifyIdentity_Page_END");
                        uTHitBuilders$UTCustomHitBuilder.setProperty("costTime", String.valueOf(j));
                        uTHitBuilders$UTCustomHitBuilder.setProperty("finsihCode", string);
                        uTHitBuilders$UTCustomHitBuilder.setProperty(Constants.VI_ENGINE_VERIFYID, string2);
                        uTHitBuilders$UTCustomHitBuilder.setProperty(CommonConstant.PRO_VERIFY_TYPE, string3);
                        uTHitBuilders$UTCustomHitBuilder.setProperty(AliFestivalWVPlugin.PARAMS_MODULE_NAME, string4);
                        uTHitBuilders$UTCustomHitBuilder.setProperty(CommonConstant.PRO_VERIFY_RESULT, string5);
                        uTHitBuilders$UTCustomHitBuilder.setProperty("sceneId", string6);
                        uTHitBuilders$UTCustomHitBuilder.setProperty("userId", FrameworkUtils.getUserId());
                        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
                    } catch (Throwable th) {
                        DecisionLogcat.b("IDCacheManager", "recordBizData error:" + th.getMessage());
                    }
                }
            }, "recordBizData thread");
        } catch (Throwable th) {
            DecisionLogcat.b("IDCacheManager", "recordBizData error:" + th.getMessage());
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : "1.1.1";
    }
}
