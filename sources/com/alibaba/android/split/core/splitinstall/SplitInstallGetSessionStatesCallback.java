package com.alibaba.android.split.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import tb.cdq;
import tb.qft;
import tb.t2o;
import tb.ycq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class SplitInstallGetSessionStatesCallback extends SplitInstallServiceCallback {
    static {
        t2o.a(677380250);
    }

    public SplitInstallGetSessionStatesCallback(ycq ycqVar, qft qftVar) {
        super(ycqVar, qftVar);
    }

    @Override // com.alibaba.android.split.core.splitinstall.SplitInstallServiceCallback, com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onGetSessionStates(List<Bundle> list) throws RemoteException {
        super.onGetSessionStates(list);
        ArrayList arrayList = new ArrayList(list.size());
        for (Bundle bundle : list) {
            arrayList.add(cdq.k(bundle));
        }
        this.taskWrapper.b(arrayList);
    }
}
