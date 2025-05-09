package com.alipay.android.msp.configservice;

import android.content.Context;
import android.text.TextUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.upx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ConfigManger {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ConfigManger g;

    /* renamed from: a  reason: collision with root package name */
    public final MemoryCache f3531a;
    public final PersistenceManager b;
    public final UpdatePolicyEvaluator c;
    public final ConfigFetcher d;
    public String e;
    public final AtomicBoolean f = new AtomicBoolean(false);

    public ConfigManger(Context context) {
        MemoryCache memoryCache = new MemoryCache();
        this.f3531a = memoryCache;
        PersistenceManager persistenceManager = new PersistenceManager(context);
        this.b = persistenceManager;
        UpdatePolicyEvaluator instance = UpdatePolicyEvaluator.getInstance(context);
        this.c = instance;
        ConfigFetcher configFetcher = new ConfigFetcher(context);
        this.d = configFetcher;
        String configs = persistenceManager.getConfigs();
        JSONObject buildParams = configFetcher.buildParams(null);
        JSONObject parseObject = JSON.parseObject(persistenceManager.getLastEnvParams());
        if (buildParams == null || parseObject == null || !TextUtils.equals(buildParams.getString(upx.PRODUCT_ID), parseObject.getString(upx.PRODUCT_ID)) || !TextUtils.equals(buildParams.getString("systemType"), parseObject.getString("systemType")) || !TextUtils.equals(buildParams.getString("mobileBrand"), parseObject.getString("mobileBrand")) || !TextUtils.equals(buildParams.getString("mobileModel"), parseObject.getString("mobileModel")) || !TextUtils.equals(buildParams.getString("osVersion"), parseObject.getString("osVersion")) || !TextUtils.equals(buildParams.getString("romVersion"), parseObject.getString("romVersion")) || !TextUtils.equals(buildParams.getString("manufacturer"), parseObject.getString("manufacturer")) || !TextUtils.equals(buildParams.getString("appName"), parseObject.getString("appName")) || !TextUtils.equals(buildParams.getString("utdid"), parseObject.getString("utdid"))) {
            LogUtil.record(2, "ConfigManger::init", "环境发生了更改");
            memoryCache.clear();
            this.e = null;
            persistenceManager.setLastEnvParams(buildParams);
            a(new JSONArray());
        }
        memoryCache.setConfigs(configs);
        if (GlobalConstant.DEBUG) {
            this.e = null;
        } else {
            this.e = persistenceManager.getLastFetchTime();
        }
        b(instance.shouldFetchOnBoot());
    }

    public static /* synthetic */ String access$000(ConfigManger configManger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("483c2ea", new Object[]{configManger});
        }
        return configManger.e;
    }

    public static /* synthetic */ String access$002(ConfigManger configManger, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76aff962", new Object[]{configManger, str});
        }
        configManger.e = str;
        return str;
    }

    public static /* synthetic */ ConfigFetcher access$100(ConfigManger configManger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigFetcher) ipChange.ipc$dispatch("37d06243", new Object[]{configManger});
        }
        return configManger.d;
    }

    public static /* synthetic */ void access$200(ConfigManger configManger, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("636a23dc", new Object[]{configManger, jSONArray});
        } else if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                configManger.f3531a.remove(jSONArray.getString(i));
            }
        }
    }

    public static /* synthetic */ void access$300(ConfigManger configManger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e65131d3", new Object[]{configManger});
        } else {
            configManger.f3531a.clear();
        }
    }

    public static /* synthetic */ void access$400(ConfigManger configManger, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d34bda1a", new Object[]{configManger, jSONArray});
        } else {
            configManger.a(jSONArray);
        }
    }

    public static /* synthetic */ void access$500(ConfigManger configManger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6011", new Object[]{configManger});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result_code", "Fetch_Exception");
        PhoneCashierMspEngine.getMspLog().walletEventLog("10101279", "pay", hashMap);
    }

    public static /* synthetic */ UpdatePolicyEvaluator access$600(ConfigManger configManger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UpdatePolicyEvaluator) ipChange.ipc$dispatch("353b72d9", new Object[]{configManger});
        }
        return configManger.c;
    }

    public static /* synthetic */ AtomicBoolean access$700(ConfigManger configManger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("dc9cb0cf", new Object[]{configManger});
        }
        return configManger.f;
    }

    public static ConfigManger getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigManger) ipChange.ipc$dispatch("abb860f3", new Object[]{context});
        }
        if (g == null && context != null) {
            synchronized (ConfigManger.class) {
                try {
                    GlobalConstant.initializeDebug(context);
                    if (g == null && UpdatePolicyEvaluator.getInstance(context).shouldFetch()) {
                        g = new ConfigManger(context);
                        LogUtil.record(2, "ConfigManger::getInstance", "创建ConfigManger");
                        HashMap hashMap = new HashMap();
                        hashMap.put(UTConstant.Args.UT_PROPERTY_SUCCESS, "1");
                        PhoneCashierMspEngine.getMspLog().walletEventLog("10101278", "pay", hashMap);
                    }
                }
            }
        }
        return g;
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if ((z || this.c.shouldUpdateSwitches()) && this.f.compareAndSet(false, true)) {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.configservice.ConfigManger.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        JSONObject fetch = ConfigManger.access$100(ConfigManger.this).fetch(ConfigManger.access$000(ConfigManger.this));
                        StringBuilder sb = new StringBuilder("rpc结果：");
                        if (fetch == null) {
                            str = "null";
                        } else {
                            str = fetch.toJSONString();
                        }
                        sb.append(str);
                        LogUtil.record(2, "ConfigManger::fetchConfig", sb.toString());
                        if (fetch != null) {
                            if (fetch.getBooleanValue("success")) {
                                ConfigManger.access$002(ConfigManger.this, fetch.getString("responseTime"));
                                if (fetch.getBooleanValue("increment")) {
                                    ConfigManger.access$200(ConfigManger.this, fetch.getJSONArray("deleteKeys"));
                                } else {
                                    ConfigManger.access$300(ConfigManger.this);
                                }
                                ConfigManger.access$400(ConfigManger.this, fetch.getJSONArray("switches"));
                            } else if (!TextUtils.isEmpty(fetch.getString("error"))) {
                                ConfigManger.access$500(ConfigManger.this);
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            LogUtil.printExceptionStackTrace(th);
                            ConfigManger.access$500(ConfigManger.this);
                        } finally {
                            ConfigManger.access$600(ConfigManger.this).updateLastFetchTime();
                            ConfigManger.access$700(ConfigManger.this).set(false);
                        }
                    }
                }
            });
        }
    }

    public String getConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d74258f7", new Object[]{this, str});
        }
        try {
            String config = this.f3531a.getConfig(str);
            b(false);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("->");
            sb.append(config == null ? "null" : config);
            LogUtil.record(2, "ConfigManger::getConfig", sb.toString());
            return config;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return null;
        }
    }

    public final void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
        } else if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                this.f3531a.setConfig(jSONObject.getString("key"), jSONObject.getString("value"));
            }
            LogUtil.record(2, "ConfigManger::updateRpcConfigs", "更新配置：" + jSONArray.toJSONString());
            this.b.setConfigs(this.e, this.f3531a.getConfigs().toString());
        }
    }
}
