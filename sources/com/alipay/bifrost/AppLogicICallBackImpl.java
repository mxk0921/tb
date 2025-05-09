package com.alipay.bifrost;

import android.content.Context;
import android.os.Build;
import com.alipay.mars.app.AppLogic;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AppLogicICallBackImpl implements AppLogic.ICallBack {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static AppLogicICallBackImpl e;

    /* renamed from: a  reason: collision with root package name */
    public Context f3789a;
    public String b = "";
    public final String c;
    public final String d;

    public AppLogicICallBackImpl() {
        this.c = "";
        this.d = "";
        try {
            this.c = Build.BRAND;
            this.d = Build.MODEL;
        } catch (Throwable unused) {
        }
    }

    public static AppLogicICallBackImpl getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppLogicICallBackImpl) ipChange.ipc$dispatch("d9387fcb", new Object[0]);
        }
        AppLogicICallBackImpl appLogicICallBackImpl = e;
        if (appLogicICallBackImpl != null) {
            return appLogicICallBackImpl;
        }
        synchronized (AppLogicICallBackImpl.class) {
            try {
                AppLogicICallBackImpl appLogicICallBackImpl2 = e;
                if (appLogicICallBackImpl2 != null) {
                    return appLogicICallBackImpl2;
                }
                AppLogicICallBackImpl appLogicICallBackImpl3 = new AppLogicICallBackImpl();
                e = appLogicICallBackImpl3;
                return appLogicICallBackImpl3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.alipay.mars.app.AppLogic.ICallBack
    public AppLogic.AccountInfo getAccountInfo() {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppLogic.AccountInfo) ipChange.ipc$dispatch("d7faf1d4", new Object[]{this});
        }
        try {
            j = Long.parseLong(this.b);
        } catch (Throwable unused) {
            j = 0;
        }
        return new AppLogic.AccountInfo(j, this.b);
    }

    @Override // com.alipay.mars.app.AppLogic.ICallBack
    public String getAppFilePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c6ea2ad", new Object[]{this});
        }
        Context context = this.f3789a;
        if (context != null) {
            return context.getFilesDir().getAbsolutePath();
        }
        return "";
    }

    @Override // com.alipay.mars.app.AppLogic.ICallBack
    public int getClientVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b23f3d1", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.alipay.mars.app.AppLogic.ICallBack
    public String getCurLanguage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("714573b7", new Object[]{this});
        }
        return "Cn";
    }

    @Override // com.alipay.mars.app.AppLogic.ICallBack
    public AppLogic.DeviceInfo getDeviceType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppLogic.DeviceInfo) ipChange.ipc$dispatch("d1a14144", new Object[]{this});
        }
        return new AppLogic.DeviceInfo(this.d, this.c);
    }

    public void register(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381c355e", new Object[]{this, context});
        } else {
            this.f3789a = context;
        }
    }

    public void setUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }
}
