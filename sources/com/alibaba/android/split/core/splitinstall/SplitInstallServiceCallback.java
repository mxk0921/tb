package com.alibaba.android.split.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.alibaba.android.split.core.internal.ISplitInstallServiceCallback;
import java.util.List;
import tb.qft;
import tb.t2o;
import tb.ycq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
class SplitInstallServiceCallback extends ISplitInstallServiceCallback {
    private final ycq splitInstallService;
    final qft taskWrapper;

    static {
        t2o.a(677380258);
    }

    public SplitInstallServiceCallback(ycq ycqVar, qft qftVar) {
        this.splitInstallService = ycqVar;
        this.taskWrapper = qftVar;
    }

    public void onCancelInstall(int i, Bundle bundle) throws RemoteException {
        this.splitInstallService.b.unbindService();
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onCompleteInstall(int i) throws RemoteException {
        this.splitInstallService.b.unbindService();
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onCompleteInstallForAppUpdate() throws RemoteException {
        this.splitInstallService.b.unbindService();
        ycq.d().a("onCompleteInstallForAppUpdate", new Object[0]);
    }

    public void onDeferredInstall(Bundle bundle) throws RemoteException {
        this.splitInstallService.b.unbindService();
    }

    public void onDeferredUninstall(Bundle bundle) throws RemoteException {
        this.splitInstallService.b.unbindService();
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onError(Bundle bundle) throws RemoteException {
        this.splitInstallService.b.unbindService();
        int i = bundle.getInt("error_code");
        ycq.d().c("onError(%d)", Integer.valueOf(i));
        this.taskWrapper.c(new SplitInstallException(i));
    }

    public void onGetSession(int i, Bundle bundle) throws RemoteException {
        this.splitInstallService.b.unbindService();
    }

    public void onGetSessionStates(List<Bundle> list) throws RemoteException {
        this.splitInstallService.b.unbindService();
        ycq.d().c("onGetSessionStates", new Object[0]);
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onGetSplitsForAppUpdate() throws RemoteException {
        this.splitInstallService.b.unbindService();
        ycq.d().a("onGetSplitsForAppUpdate", new Object[0]);
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public void onStartInstall(int i, Bundle bundle) throws RemoteException {
        this.splitInstallService.b.unbindService();
    }
}
