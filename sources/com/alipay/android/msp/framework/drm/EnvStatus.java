package com.alipay.android.msp.framework.drm;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.msp.framework.storage.PrefUtils;
import com.alipay.android.msp.framework.sys.DeviceInfo;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class EnvStatus {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f3599a;
    public String b;
    public String c;
    public String d;
    public String e;
    public final Context f;

    public EnvStatus(Context context) {
        this.f = context.getApplicationContext();
        try {
            this.f3599a = PrefUtils.getString("cashier_drm_switch", "env_os", "");
            this.b = PrefUtils.getString("cashier_drm_switch", "env_osver", "");
            this.c = PrefUtils.getString("cashier_drm_switch", "env_sdkver", "");
            this.d = PrefUtils.getString("cashier_drm_switch", "env_model", "");
            this.e = PrefUtils.getString("cashier_drm_switch", "env_packagename", "");
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public final synchronized void update() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
            return;
        }
        this.f3599a = DeviceInfo.getOS();
        this.b = DeviceInfo.getOSVersion();
        this.c = GlobalSdkConstant.getMspVersion();
        this.d = DeviceInfo.getModel();
        this.e = this.f.getPackageName();
        PrefUtils.putString("cashier_drm_switch", "env_os", this.f3599a);
        PrefUtils.putString("cashier_drm_switch", "env_osver", this.b);
        PrefUtils.putString("cashier_drm_switch", "env_sdkver", this.c);
        PrefUtils.putString("cashier_drm_switch", "env_model", this.d);
        PrefUtils.putString("cashier_drm_switch", "env_packagename", this.e);
        LogUtil.record(1, "Drm", "EnvStatus", "update:done");
    }

    public final synchronized boolean isChanged() {
        boolean z = false;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("497d09b5", new Object[]{this})).booleanValue();
            }
            String os = DeviceInfo.getOS();
            String mspVersion = GlobalSdkConstant.getMspVersion();
            String packageName = this.f.getPackageName();
            if (!TextUtils.equals(this.f3599a, os) || !TextUtils.equals(this.c, mspVersion) || !TextUtils.equals(this.e, packageName)) {
                z = true;
            }
            LogUtil.record(1, "Drm", "EnvStatus", "isChanged:".concat(String.valueOf(z)));
            return z;
        }
    }
}
