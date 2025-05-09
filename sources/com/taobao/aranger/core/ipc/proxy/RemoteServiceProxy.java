package com.taobao.aranger.core.ipc.proxy;

import android.os.IBinder;
import android.os.Parcel;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.ipc.provider.ARangerProvider;
import com.taobao.aranger.core.wrapper.MethodWrapper;
import com.taobao.aranger.core.wrapper.ServiceWrapper;
import com.taobao.aranger.intf.IRemoteService;
import java.util.List;
import tb.b5d;
import tb.fql;
import tb.k8l;
import tb.mut;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RemoteServiceProxy implements IRemoteService {
    public static volatile IRemoteService b;

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f10071a;

    static {
        t2o.a(393216066);
        t2o.a(393216080);
    }

    public static IRemoteService a(IBinder iBinder) {
        if (iBinder.queryLocalInterface(Constants.DEFAULT_CONTENT_DESCRIPTOR) == null) {
            return new RemoteServiceProxy(iBinder);
        }
        if (b == null) {
            synchronized (RemoteServiceProxy.class) {
                try {
                    if (b == null) {
                        b = new ARangerProvider();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f10071a;
    }

    @Override // com.taobao.aranger.intf.IRemoteService
    public void connect() throws Exception {
        Parcel obtain = Parcel.obtain();
        try {
            this.f10071a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.taobao.aranger.intf.IRemoteService
    public boolean isRemote() {
        if (this.f10071a.queryLocalInterface(Constants.DEFAULT_CONTENT_DESCRIPTOR) == null) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.aranger.intf.IService
    public void recycle(List<String> list) throws Exception {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeStringList(list);
            this.f10071a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    @Override // com.taobao.aranger.intf.IRemoteService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.aranger.core.entity.Reply sendCall(com.taobao.aranger.core.entity.Call r6) throws java.lang.Exception {
        /*
            r5 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r1 = 0
            com.taobao.aranger.core.wrapper.MethodWrapper r2 = r6.getMethodWrapper()     // Catch: all -> 0x0014
            boolean r2 = r2.isVoid()     // Catch: all -> 0x0014
            if (r2 != 0) goto L_0x0016
            android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch: all -> 0x0014
            goto L_0x0017
        L_0x0014:
            r6 = move-exception
            goto L_0x0059
        L_0x0016:
            r2 = r1
        L_0x0017:
            r3 = 0
            r6.writeToParcel(r0, r3)     // Catch: all -> 0x002d
            boolean r4 = r6.isOneWay()     // Catch: all -> 0x002d
            if (r4 == 0) goto L_0x0030
            com.taobao.aranger.core.wrapper.MethodWrapper r6 = r6.getMethodWrapper()     // Catch: all -> 0x002d
            boolean r6 = r6.isVoid()     // Catch: all -> 0x002d
            if (r6 == 0) goto L_0x0030
            r6 = 1
            goto L_0x0031
        L_0x002d:
            r6 = move-exception
            r1 = r2
            goto L_0x0059
        L_0x0030:
            r6 = 0
        L_0x0031:
            android.os.IBinder r4 = r5.f10071a     // Catch: all -> 0x002d
            r4.transact(r3, r0, r2, r6)     // Catch: all -> 0x002d
            if (r2 == 0) goto L_0x0048
            int r6 = r2.dataSize()     // Catch: all -> 0x002d
            if (r6 != 0) goto L_0x003f
            goto L_0x0048
        L_0x003f:
            android.os.Parcelable$Creator<com.taobao.aranger.core.entity.Reply> r6 = com.taobao.aranger.core.entity.Reply.CREATOR     // Catch: all -> 0x002d
            java.lang.Object r6 = r6.createFromParcel(r2)     // Catch: all -> 0x002d
            com.taobao.aranger.core.entity.Reply r6 = (com.taobao.aranger.core.entity.Reply) r6     // Catch: all -> 0x002d
            goto L_0x0050
        L_0x0048:
            com.taobao.aranger.core.entity.Reply r6 = com.taobao.aranger.core.entity.Reply.obtain()     // Catch: all -> 0x002d
            com.taobao.aranger.core.entity.Reply r6 = r6.setResult(r1)     // Catch: all -> 0x002d
        L_0x0050:
            r0.recycle()
            if (r2 == 0) goto L_0x0058
            r2.recycle()
        L_0x0058:
            return r6
        L_0x0059:
            r0.recycle()
            if (r1 == 0) goto L_0x0061
            r1.recycle()
        L_0x0061:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.aranger.core.ipc.proxy.RemoteServiceProxy.sendCall(com.taobao.aranger.core.entity.Call):com.taobao.aranger.core.entity.Reply");
    }

    public RemoteServiceProxy(IBinder iBinder) {
        this.f10071a = iBinder;
        if (k8l.d()) {
            try {
                b5d.i("RemoteServiceProxy", "", "result", sendCall(Call.obtain().setSameApp(true).setServiceWrapper(ServiceWrapper.obtain().setTimeStamp(mut.a()).setType(6)).setMethodWrapper(MethodWrapper.obtain().setVoid(false)).setParameterWrappers(fql.c(null))).getResult());
            } catch (Throwable th) {
                b5d.h("RemoteServiceProxy", "proc err", th, new Object[0]);
            }
        }
    }
}
