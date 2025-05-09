package com.alibaba.android.split.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import tb.qft;
import tb.t2o;
import tb.ycq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class SplitInstallStartInstallCallback extends SplitInstallServiceCallback {
    static {
        t2o.a(677380260);
    }

    public SplitInstallStartInstallCallback(ycq ycqVar, qft qftVar) {
        super(ycqVar, qftVar);
    }

    @Override // com.alibaba.android.split.core.splitinstall.SplitInstallServiceCallback, com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onStartInstall(int i, Bundle bundle) throws RemoteException {
        super.onStartInstall(i, bundle);
        this.taskWrapper.b(Integer.valueOf(i));
    }
}
