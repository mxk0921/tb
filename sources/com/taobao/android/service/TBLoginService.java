package com.taobao.android.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import com.ali.user.mobile.ITBLoginService;
import com.ali.user.mobile.base.helper.CPHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.f8p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBLoginService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class MyTBLoginService extends ITBLoginService.Stub {
        public MyTBLoginService() {
        }

        @Override // com.ali.user.mobile.ITBLoginService
        public String getLoginInfo() throws RemoteException {
            return CPHelper.getAccountInfo(TBLoginService.this.getApplicationContext());
        }
    }

    public static /* synthetic */ Object ipc$super(TBLoginService tBLoginService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/service/TBLoginService");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        if (f8p.a(getApplicationContext(), getPackageManager().getNameForUid(Binder.getCallingUid()))) {
            return new MyTBLoginService();
        }
        return null;
    }
}
