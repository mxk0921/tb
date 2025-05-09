package com.alipay.android.msp.configservice;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class UpdatePolicyEvaluator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static UpdatePolicyEvaluator c;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f3536a = new JSONObject();
    public long b;

    public UpdatePolicyEvaluator(Context context) {
        reset(context);
    }

    public static UpdatePolicyEvaluator getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UpdatePolicyEvaluator) ipChange.ipc$dispatch("b9a32b53", new Object[]{context});
        }
        if (c == null && context != null) {
            synchronized (UpdatePolicyEvaluator.class) {
                try {
                    if (c == null) {
                        c = new UpdatePolicyEvaluator(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public void reset(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6b45632", new Object[]{this, context});
            return;
        }
        String rawDrmValueFromKey = DrmManager.getInstance(context).getRawDrmValueFromKey("gray_alipay_config_10560");
        if (!TextUtils.isEmpty(rawDrmValueFromKey)) {
            try {
                this.f3536a = new JSONObject(rawDrmValueFromKey);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    public boolean shouldFetch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("797561d2", new Object[]{this})).booleanValue();
        }
        return this.f3536a.optBoolean("enable", false);
    }

    public boolean shouldFetchOnBoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6f581a3", new Object[]{this})).booleanValue();
        }
        if (!shouldFetch() || !this.f3536a.optBoolean("bootFetch", false)) {
            return false;
        }
        return true;
    }

    public boolean shouldUpdateSwitches() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a0b9ce9", new Object[]{this})).booleanValue();
        }
        if (shouldFetch() && (System.currentTimeMillis() - this.b) / 60000 >= this.f3536a.optInt("fetchInterval", Integer.MAX_VALUE)) {
            return true;
        }
        return false;
    }

    public void updateLastFetchTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47794cef", new Object[]{this});
        } else {
            this.b = System.currentTimeMillis();
        }
    }
}
