package com.alipay.mobile.intelligentdecision.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.intelligentdecision.DecisionContext;
import com.alipay.mobile.intelligentdecision.engine.DecisionEngine;
import com.alipay.mobile.intelligentdecision.helper.VidFilterHelper;
import com.alipay.mobile.intelligentdecision.log.DecisionLogcat;
import com.alipay.mobile.intelligentdecision.manager.IDCacheManager;
import com.alipay.mobile.intelligentdecision.rpc.FrameworkUtils;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ViTbDecisionReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile ViTbDecisionReceiver c;

    /* renamed from: a  reason: collision with root package name */
    public String f4262a = "";
    public final AtomicBoolean b = new AtomicBoolean(false);

    public static /* synthetic */ String access$000(ViTbDecisionReceiver viTbDecisionReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d54f9530", new Object[]{viTbDecisionReceiver});
        }
        return viTbDecisionReceiver.f4262a;
    }

    public static /* synthetic */ AtomicBoolean access$100(ViTbDecisionReceiver viTbDecisionReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("fb0b9d4f", new Object[]{viTbDecisionReceiver});
        }
        return viTbDecisionReceiver.b;
    }

    public static ViTbDecisionReceiver getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViTbDecisionReceiver) ipChange.ipc$dispatch("5c9a2a09", new Object[0]);
        }
        if (c == null) {
            synchronized (ViTbDecisionReceiver.class) {
                try {
                    if (c == null) {
                        c = new ViTbDecisionReceiver();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public static boolean isOrangeSwitchOn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54a72f56", new Object[0])).booleanValue();
        }
        try {
            String config = OrangeConfig.getInstance().getConfig("VerifyIdentityConfig", "closeViFutureCollect", "");
            DecisionLogcat.b("ViTbDecisionReceiver", "ViTbDecisionReceiver.closeViFutureCollect = " + config);
            if (!"Y".equalsIgnoreCase(config)) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            DecisionLogcat.a("ViTbDecisionReceiver", "error:" + th.getMessage());
            return true;
        }
    }

    public void onReceive(final String str, final String str2, final String str3, final String str4, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12083641", new Object[]{this, str, str2, str3, str4, bundle});
            return;
        }
        DecisionLogcat.b("ViTbDecisionReceiver", "ViTbDecisionReceiver onreceive:" + str);
        if (!"pay_enter".equals(str)) {
            return;
        }
        if (!isOrangeSwitchOn()) {
            DecisionLogcat.b("ViTbDecisionReceiver", "ViTbDecisionReceiver return");
            return;
        }
        if (bundle != null) {
            if (!bundle.getBoolean("intelligentEnable", true)) {
                DecisionLogcat.b("ViTbDecisionReceiver", "intelligentEnable false");
                return;
            }
            String string = bundle.getString("userId");
            if (TextUtils.isEmpty(string)) {
                DecisionLogcat.b("ViTbDecisionReceiver", "uid empty, so return");
                return;
            }
            DecisionContext.getInstance().setCurrentUid(string);
        }
        DecisionLogcat.b("ViTbDecisionReceiver", "ViTbDecisionReceiver sceneid:" + str2);
        this.f4262a = str;
        try {
            final Context context = DecisionContext.getInstance().getContext();
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.intelligentdecision.receiver.ViTbDecisionReceiver.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean z;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        SharedPreferences sharedPreferences = IDCacheManager.a(context).f4251a;
                        String userId = FrameworkUtils.getUserId();
                        Bundle bundle2 = bundle;
                        if (bundle2 != null) {
                            String string2 = bundle2.getString("clientDecisionConfig");
                            DecisionLogcat.b("ViTbDecisionReceiver", "decisionConfig:" + string2);
                            if (!TextUtils.isEmpty(string2)) {
                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                JSONObject parseObject = JSON.parseObject(string2);
                                JSONObject jSONObject = parseObject.getJSONObject("extractConfig");
                                if (jSONObject == null || !jSONObject.containsKey("enable") || jSONObject.getBooleanValue("enable")) {
                                    z = false;
                                } else {
                                    DecisionLogcat.b("ViTbDecisionReceiver", "extractConfig close");
                                    edit.putBoolean("extractConfig_enable_" + userId, false);
                                    z = true;
                                }
                                JSONObject jSONObject2 = parseObject.getJSONObject("predictConfig");
                                if (jSONObject2 != null && jSONObject2.containsKey("enable") && !jSONObject2.getBooleanValue("enable")) {
                                    DecisionLogcat.b("ViTbDecisionReceiver", "predictConfig close");
                                    edit.putBoolean("predictConfig_enable_" + userId, false);
                                    z = true;
                                }
                                JSONObject jSONObject3 = parseObject.getJSONObject("strategyConfig");
                                if (jSONObject3 != null && jSONObject3.containsKey("enable") && !jSONObject3.getBooleanValue("enable")) {
                                    DecisionLogcat.b("ViTbDecisionReceiver", "strategyConfig close");
                                    edit.putBoolean("strategyConfig_enable_" + userId, false);
                                    z = true;
                                }
                                if (z) {
                                    edit.commit();
                                }
                            }
                        }
                        boolean z2 = sharedPreferences.getBoolean("extractConfig_enable_" + userId, false);
                        boolean z3 = sharedPreferences.getBoolean("predictConfig_enable_" + userId, false);
                        boolean z4 = sharedPreferences.getBoolean("strategyConfig_enable_" + userId, false);
                        DecisionLogcat.b("ViTbDecisionReceiver", "uid:" + userId + ",extra_enable:" + z2 + ", predit_enable:" + z3 + ", stragy_enable:" + z4);
                        if (z2) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("bio_type", str4);
                            Bundle bundle4 = bundle;
                            if (bundle4 != null) {
                                bundle3.putAll(bundle4);
                            }
                            if (!VidFilterHelper.a().a(str3, ViTbDecisionReceiver.access$000(ViTbDecisionReceiver.this))) {
                                DecisionEngine.a(context);
                                DecisionEngine.a(ViTbDecisionReceiver.access$000(ViTbDecisionReceiver.this), str2, str3, bundle3);
                            }
                        }
                        if (z3) {
                            Bundle bundle5 = new Bundle();
                            bundle5.putString("bio_type", str4);
                            Bundle bundle6 = bundle;
                            if (bundle6 != null) {
                                bundle5.putAll(bundle6);
                            }
                            if (!VidFilterHelper.a().b(str3, ViTbDecisionReceiver.access$000(ViTbDecisionReceiver.this))) {
                                DecisionEngine.a(context);
                                DecisionEngine.b(ViTbDecisionReceiver.access$000(ViTbDecisionReceiver.this), str2, str3, bundle5);
                            }
                        }
                        if (z4 && "pay_enter".equalsIgnoreCase(str) && !ViTbDecisionReceiver.access$100(ViTbDecisionReceiver.this).get()) {
                            DecisionLogcat.b("ViTbDecisionReceiver", "registe local broadcast");
                            ViTbDecisionReceiver.access$100(ViTbDecisionReceiver.this).set(true);
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction("KExitMiniPayViewNotification");
                            LocalBroadcastManager.getInstance(context).registerReceiver(new BroadcastReceiver() { // from class: com.alipay.mobile.intelligentdecision.receiver.ViTbDecisionReceiver.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                public static /* synthetic */ Object ipc$super(C02191 r2, String str5, Object... objArr) {
                                    str5.hashCode();
                                    int hashCode = str5.hashCode();
                                    throw new InstantReloadException("String switch could not find '" + str5 + "' with hashcode " + hashCode + " in com/alipay/mobile/intelligentdecision/receiver/ViTbDecisionReceiver$1$1");
                                }

                                @Override // android.content.BroadcastReceiver
                                public final void onReceive(Context context2, Intent intent) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                                        return;
                                    }
                                    DecisionLogcat.b("ViTbDecisionReceiver", "PAY_EXIT_ACTION occur");
                                    try {
                                        IDCacheManager a2 = IDCacheManager.a(context2);
                                        ConcurrentHashMap<String, Object> concurrentHashMap = a2.b;
                                        if (concurrentHashMap != null) {
                                            concurrentHashMap.clear();
                                        }
                                        ConcurrentHashMap<String, Object> concurrentHashMap2 = a2.c;
                                        if (concurrentHashMap2 != null) {
                                            concurrentHashMap2.clear();
                                        }
                                    } catch (Throwable unused) {
                                        DecisionLogcat.b("ViTbDecisionReceiver", "clear error");
                                    }
                                    LocalBroadcastManager.getInstance(context2).unregisterReceiver(this);
                                    ViTbDecisionReceiver.access$100(ViTbDecisionReceiver.this).set(false);
                                }
                            }, intentFilter);
                        }
                    } catch (Throwable th) {
                        DecisionLogcat.b("ViTbDecisionReceiver", "handle event error:" + th.getMessage());
                    }
                }
            }, "onReceive_task");
        } catch (Throwable th) {
            DecisionLogcat.b("ViTbDecisionReceiver", "error:" + th.getMessage());
        }
    }
}
