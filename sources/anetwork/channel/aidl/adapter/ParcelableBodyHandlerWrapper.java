package anetwork.channel.aidl.adapter;

import android.os.RemoteException;
import anetwork.channel.IBodyHandler;
import anetwork.channel.aidl.ParcelableBodyHandler;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ParcelableBodyHandlerWrapper extends ParcelableBodyHandler.Stub {
    private static final String TAG = "anet.ParcelableBodyHandlerWrapper";
    private IBodyHandler handler;

    static {
        t2o.a(607126014);
    }

    public ParcelableBodyHandlerWrapper(IBodyHandler iBodyHandler) {
        this.handler = iBodyHandler;
    }

    @Override // anetwork.channel.aidl.ParcelableBodyHandler
    public boolean isCompleted() throws RemoteException {
        IBodyHandler iBodyHandler = this.handler;
        if (iBodyHandler != null) {
            return iBodyHandler.isCompleted();
        }
        return true;
    }

    @Override // anetwork.channel.aidl.ParcelableBodyHandler
    public int read(byte[] bArr) throws RemoteException {
        IBodyHandler iBodyHandler = this.handler;
        if (iBodyHandler != null) {
            return iBodyHandler.read(bArr);
        }
        return 0;
    }

    public String toString() {
        return super.toString() + " handle:" + this.handler;
    }
}
