package com.alibaba.ut.abtest.push;

import com.android.alibaba.ip.runtime.IpChange;
import tb.ezu;
import tb.k;
import tb.ogh;
import tb.w;
import tb.yu7;
import tb.zg9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class UTABPushClientImpl implements ezu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "UTABPushClientImpl";

    @Override // tb.ezu
    public void cancelSyncCrowd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e07a99ff", new Object[]{this});
        } else {
            k.b().a();
        }
    }

    @Override // tb.ezu
    public void destory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
        } else {
            w.d().c();
        }
    }

    @Override // tb.ezu
    public void initialize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
            return;
        }
        try {
            zg9.a(yu7.f().e());
        } catch (Exception e) {
            ogh.h(TAG, "UTABPushClientImpl init fail", e);
        }
        k.b().c();
        w.d().e();
    }

    @Override // tb.ezu
    public boolean isCrowd(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a8f53f8", new Object[]{this, str})).booleanValue();
        }
        return k.b().d(str);
    }

    @Override // tb.ezu
    public void syncExperiments(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc2daadc", new Object[]{this, new Boolean(z), str});
        } else {
            w.d().b(str);
        }
    }
}
