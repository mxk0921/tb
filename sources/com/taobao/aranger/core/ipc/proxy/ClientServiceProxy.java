package com.taobao.aranger.core.ipc.proxy;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.IClientService;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ClientServiceProxy extends Binder implements IClientService {
    private final IBinder mRemote;

    static {
        t2o.a(393216065);
        t2o.a(393216077);
    }

    private ClientServiceProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    public static IClientService getProxy(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(Constants.CLIENT_SERVICE_DESCRIPTOR);
        if (queryLocalInterface instanceof IClientService) {
            return (IClientService) queryLocalInterface;
        }
        return new ClientServiceProxy(iBinder);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.taobao.aranger.intf.IService
    public void recycle(List<String> list) throws Exception {
        if (this.mRemote.isBinderAlive()) {
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeStringList(list);
                this.mRemote.transact(4, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } else {
            throw new IPCException(5, "the remote binder is not alive");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    @Override // com.taobao.aranger.intf.IClientService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.aranger.core.entity.Reply sendCallback(com.taobao.aranger.core.entity.Callback r7) throws java.lang.Exception {
        /*
            r6 = this;
            android.os.IBinder r0 = r6.mRemote
            boolean r0 = r0.isBinderAlive()
            if (r0 == 0) goto L_0x006a
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r1 = 0
            com.taobao.aranger.core.wrapper.MethodWrapper r2 = r7.getMethodWrapper()     // Catch: all -> 0x001c
            boolean r2 = r2.isVoid()     // Catch: all -> 0x001c
            if (r2 != 0) goto L_0x001e
            android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch: all -> 0x001c
            goto L_0x001f
        L_0x001c:
            r7 = move-exception
            goto L_0x0061
        L_0x001e:
            r2 = r1
        L_0x001f:
            r3 = 0
            r7.writeToParcel(r0, r3)     // Catch: all -> 0x0037
            android.os.IBinder r4 = r6.mRemote     // Catch: all -> 0x0037
            boolean r5 = r7.isOneWay()     // Catch: all -> 0x0037
            if (r5 == 0) goto L_0x003a
            com.taobao.aranger.core.wrapper.MethodWrapper r7 = r7.getMethodWrapper()     // Catch: all -> 0x0037
            boolean r7 = r7.isVoid()     // Catch: all -> 0x0037
            if (r7 == 0) goto L_0x003a
            r3 = 1
            goto L_0x003a
        L_0x0037:
            r7 = move-exception
            r1 = r2
            goto L_0x0061
        L_0x003a:
            r7 = 3
            r4.transact(r7, r0, r2, r3)     // Catch: all -> 0x0037
            if (r2 == 0) goto L_0x0050
            int r7 = r2.dataSize()     // Catch: all -> 0x0037
            if (r7 != 0) goto L_0x0047
            goto L_0x0050
        L_0x0047:
            android.os.Parcelable$Creator<com.taobao.aranger.core.entity.Reply> r7 = com.taobao.aranger.core.entity.Reply.CREATOR     // Catch: all -> 0x0037
            java.lang.Object r7 = r7.createFromParcel(r2)     // Catch: all -> 0x0037
            com.taobao.aranger.core.entity.Reply r7 = (com.taobao.aranger.core.entity.Reply) r7     // Catch: all -> 0x0037
            goto L_0x0058
        L_0x0050:
            com.taobao.aranger.core.entity.Reply r7 = com.taobao.aranger.core.entity.Reply.obtain()     // Catch: all -> 0x0037
            com.taobao.aranger.core.entity.Reply r7 = r7.setResult(r1)     // Catch: all -> 0x0037
        L_0x0058:
            r0.recycle()
            if (r2 == 0) goto L_0x0060
            r2.recycle()
        L_0x0060:
            return r7
        L_0x0061:
            r0.recycle()
            if (r1 == 0) goto L_0x0069
            r1.recycle()
        L_0x0069:
            throw r7
        L_0x006a:
            com.taobao.aranger.exception.IPCException r7 = new com.taobao.aranger.exception.IPCException
            r0 = 5
            java.lang.String r1 = "the remote binder is not alive"
            r7.<init>(r0, r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.aranger.core.ipc.proxy.ClientServiceProxy.sendCallback(com.taobao.aranger.core.entity.Callback):com.taobao.aranger.core.entity.Reply");
    }
}
