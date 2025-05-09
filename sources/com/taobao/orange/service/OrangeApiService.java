package com.taobao.orange.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.orange.aidl.IOrangeApiService;
import com.taobao.orange.aidl.OrangeApiServiceStub;
import com.taobao.orange.util.OLog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class OrangeApiService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IOrangeApiService.Stub f11399a = null;

    static {
        t2o.a(613417093);
    }

    public static /* synthetic */ Object ipc$super(OrangeApiService orangeApiService, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case 413640386:
                super.onCreate();
                return null;
            case 653070963:
                super.onRebind((Intent) objArr[0]);
                return null;
            case 1256323805:
                return new Boolean(super.onUnbind((Intent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/orange/service/OrangeApiService");
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        OLog.e("OrangeApiService", "onBind", new Object[0]);
        if (this.f11399a == null) {
            this.f11399a = new OrangeApiServiceStub(this);
        }
        return this.f11399a;
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        OLog.e("OrangeApiService", "onCreate", new Object[0]);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        OLog.e("OrangeApiService", "onDestroy", new Object[0]);
        super.onDestroy();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ae1fadd", new Object[]{this, intent})).booleanValue();
        }
        OLog.e("OrangeApiService", "onUnbind", new Object[0]);
        return super.onUnbind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        OLog.e("OrangeApiService", "onStartCommand: ", new Object[0]);
        return 2;
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26ed1273", new Object[]{this, intent});
            return;
        }
        OLog.e("OrangeApiService", "onRebind", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent);
        super.onRebind(intent);
    }
}
