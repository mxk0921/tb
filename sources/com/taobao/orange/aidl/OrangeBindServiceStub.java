package com.taobao.orange.aidl;

import android.os.IBinder;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfigImpl;
import com.taobao.orange.aidl.IOrangeBindService;
import com.taobao.orange.util.OLog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class OrangeBindServiceStub extends IOrangeBindService.Stub {
    private static final String TAG = "OrangeBindServiceStub";

    static {
        t2o.a(613417038);
    }

    @Override // com.taobao.orange.aidl.IOrangeBindService
    public boolean isBind() {
        return true;
    }

    @Override // com.taobao.orange.aidl.IOrangeBindService
    public void setRemoteService(IOrangeApiService iOrangeApiService) {
        OLog.e(TAG, "setRemoteService", new Object[0]);
        try {
            iOrangeApiService.asBinder().linkToDeath(new IBinder.DeathRecipient() { // from class: com.taobao.orange.aidl.OrangeBindServiceStub.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.IBinder.DeathRecipient
                public void binderDied() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("25f12e35", new Object[]{this});
                        return;
                    }
                    OLog.e(OrangeBindServiceStub.TAG, "aidl binderDied, try to local stub", new Object[0]);
                    OrangeConfigImpl.m(null);
                }
            }, 0);
        } catch (Throwable th) {
            OLog.e(TAG, "setRemoteService linkToDeath error", th, new Object[0]);
        }
        OrangeConfigImpl.m(iOrangeApiService);
    }
}
