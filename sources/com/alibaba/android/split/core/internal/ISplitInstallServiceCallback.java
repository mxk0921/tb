package com.alibaba.android.split.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.alibaba.android.split.api.SplitInstallResultCallback;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class ISplitInstallServiceCallback extends Stub implements SplitInstallResultCallback {
    static {
        t2o.a(677380143);
        t2o.a(676331563);
    }

    public ISplitInstallServiceCallback() {
        super("com.alibaba.android.split.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    @Override // com.alibaba.android.split.core.internal.Stub
    public final boolean onTransact(int i, Parcel parcel) throws RemoteException {
        switch (i) {
            case 2:
                onStartInstall(parcel.readInt(), (Bundle) ParcelUtils.toBundle(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) ParcelUtils.toBundle(parcel, Bundle.CREATOR);
                onCompleteInstall(readInt);
                return true;
            case 4:
                onCancelInstall(parcel.readInt(), (Bundle) ParcelUtils.toBundle(parcel, Bundle.CREATOR));
                return true;
            case 5:
                onGetSession(parcel.readInt(), (Bundle) ParcelUtils.toBundle(parcel, Bundle.CREATOR));
                return true;
            case 6:
                onError((Bundle) ParcelUtils.toBundle(parcel, Bundle.CREATOR));
                return true;
            case 7:
                onGetSessionStates(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 8:
                onDeferredUninstall((Bundle) ParcelUtils.toBundle(parcel, Bundle.CREATOR));
                return true;
            case 9:
                onDeferredInstall((Bundle) ParcelUtils.toBundle(parcel, Bundle.CREATOR));
                return true;
            case 10:
                Bundle bundle2 = (Bundle) ParcelUtils.toBundle(parcel, Bundle.CREATOR);
                onGetSplitsForAppUpdate();
                return true;
            case 11:
                Bundle bundle3 = (Bundle) ParcelUtils.toBundle(parcel, Bundle.CREATOR);
                onCompleteInstallForAppUpdate();
                return true;
            default:
                return false;
        }
    }
}
