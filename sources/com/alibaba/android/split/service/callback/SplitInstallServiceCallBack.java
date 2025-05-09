package com.alibaba.android.split.service.callback;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.alibaba.android.split.api.SplitInstallResultCallback;
import java.util.List;
import tb.oql;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class SplitInstallServiceCallBack extends BaseProxy implements SplitInstallResultCallback {
    static {
        t2o.a(683671568);
        t2o.a(676331563);
    }

    public SplitInstallServiceCallBack(IBinder iBinder) {
        super(iBinder, "com.alibaba.android.split.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onCancelInstall(int i, Bundle bundle) {
        Parcel a2 = a();
        a2.writeInt(i);
        oql.b(a2, bundle);
        b(4, a2);
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onCompleteInstall(int i) {
        Parcel a2 = a();
        a2.writeInt(i);
        oql.b(a2, null);
        b(3, a2);
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onDeferredInstall(Bundle bundle) {
        Parcel a2 = a();
        oql.b(a2, bundle);
        b(9, a2);
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onDeferredUninstall(Bundle bundle) {
        Parcel a2 = a();
        oql.b(a2, bundle);
        b(8, a2);
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onError(Bundle bundle) {
        Parcel a2 = a();
        oql.b(a2, bundle);
        b(6, a2);
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onGetSession(int i, Bundle bundle) {
        Parcel a2 = a();
        a2.writeInt(i);
        oql.b(a2, bundle);
        b(5, a2);
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onGetSessionStates(List<Bundle> list) {
        Parcel a2 = a();
        a2.writeTypedList(list);
        b(7, a2);
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onStartInstall(int i, Bundle bundle) {
        Parcel a2 = a();
        a2.writeInt(i);
        oql.b(a2, bundle);
        b(2, a2);
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public void onCompleteInstallForAppUpdate() throws RemoteException {
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onGetSplitsForAppUpdate() {
    }
}
