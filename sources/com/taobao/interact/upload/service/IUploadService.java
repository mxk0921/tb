package com.taobao.interact.upload.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taobao.interact.upload.service.FileUploadBaseListener;
import com.taobao.interact.upload.service.UploadCallBack;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IUploadService extends IInterface {
    void cancelAll() throws RemoteException;

    void registerCallback(UploadCallBack uploadCallBack) throws RemoteException;

    void uploadFile(String str, MtopInfo mtopInfo, FileUploadBaseListener fileUploadBaseListener) throws RemoteException;

    void uploadFiles(List<String> list, MtopInfo mtopInfo) throws RemoteException;

    void uploadNewFiles(List<String> list, MtopInfo mtopInfo, UploadCallBack uploadCallBack) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static abstract class Stub extends Binder implements IUploadService {
        private static final String DESCRIPTOR = "com.taobao.interact.upload.service.IUploadService";
        static final int TRANSACTION_cancelAll = 2;
        static final int TRANSACTION_registerCallback = 3;
        static final int TRANSACTION_uploadFile = 5;
        static final int TRANSACTION_uploadFiles = 1;
        static final int TRANSACTION_uploadNewFiles = 4;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static class Proxy implements IUploadService {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f10852a;

            static {
                t2o.a(495976497);
                t2o.a(495976495);
            }

            public Proxy(IBinder iBinder) {
                this.f10852a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10852a;
            }

            @Override // com.taobao.interact.upload.service.IUploadService
            public void cancelAll() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f10852a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.upload.service.IUploadService
            public void registerCallback(UploadCallBack uploadCallBack) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (uploadCallBack != null) {
                        iBinder = uploadCallBack.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f10852a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.taobao.interact.upload.service.IUploadService
            public void uploadFile(String str, MtopInfo mtopInfo, FileUploadBaseListener fileUploadBaseListener) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (mtopInfo != null) {
                        obtain.writeInt(1);
                        mtopInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (fileUploadBaseListener != null) {
                        iBinder = fileUploadBaseListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f10852a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.taobao.interact.upload.service.IUploadService
            public void uploadFiles(List<String> list, MtopInfo mtopInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStringList(list);
                    if (mtopInfo != null) {
                        obtain.writeInt(1);
                        mtopInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f10852a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.taobao.interact.upload.service.IUploadService
            public void uploadNewFiles(List<String> list, MtopInfo mtopInfo, UploadCallBack uploadCallBack) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStringList(list);
                    if (mtopInfo != null) {
                        obtain.writeInt(1);
                        mtopInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (uploadCallBack != null) {
                        iBinder = uploadCallBack.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f10852a.transact(4, obtain, obtain2, 0);
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

        static {
            t2o.a(495976496);
            t2o.a(495976495);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IUploadService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IUploadService)) {
                return new Proxy(iBinder);
            }
            return (IUploadService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            MtopInfo mtopInfo = null;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                if (parcel.readInt() != 0) {
                    mtopInfo = MtopInfo.CREATOR.createFromParcel(parcel);
                }
                uploadFiles(createStringArrayList, mtopInfo);
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                cancelAll();
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                registerCallback(UploadCallBack.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                if (parcel.readInt() != 0) {
                    mtopInfo = MtopInfo.CREATOR.createFromParcel(parcel);
                }
                uploadNewFiles(createStringArrayList2, mtopInfo, UploadCallBack.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i == 5) {
                parcel.enforceInterface(DESCRIPTOR);
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    mtopInfo = MtopInfo.CREATOR.createFromParcel(parcel);
                }
                uploadFile(readString, mtopInfo, FileUploadBaseListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
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
