package com.alibaba.ariver.kernel.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.alibaba.ariver.kernel.ipc.IpcMessage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface IIpcChannel extends IInterface {
    boolean isFinishing() throws RemoteException;

    void sendMessage(IpcMessage ipcMessage) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class Stub extends Binder implements IIpcChannel {
        private static final String DESCRIPTOR = "com.alibaba.ariver.kernel.api.IIpcChannel";
        static final int TRANSACTION_isFinishing = 2;
        static final int TRANSACTION_sendMessage = 1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static class Proxy implements IIpcChannel {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f2431a;

            public Proxy(IBinder iBinder) {
                this.f2431a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2431a;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.alibaba.ariver.kernel.api.IIpcChannel
            public boolean isFinishing() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    this.f2431a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alibaba.ariver.kernel.api.IIpcChannel
            public void sendMessage(IpcMessage ipcMessage) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (ipcMessage != null) {
                        obtain.writeInt(1);
                        ipcMessage.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2431a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IIpcChannel asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IIpcChannel)) {
                return new Proxy(iBinder);
            }
            return (IIpcChannel) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            IpcMessage ipcMessage;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    ipcMessage = IpcMessage.CREATOR.createFromParcel(parcel);
                } else {
                    ipcMessage = null;
                }
                sendMessage(ipcMessage);
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean isFinishing = isFinishing();
                parcel2.writeNoException();
                parcel2.writeInt(isFinishing ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
