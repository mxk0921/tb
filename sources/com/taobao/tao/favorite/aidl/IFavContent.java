package com.taobao.tao.favorite.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taobao.tao.favorite.aidl.IFavContentCallBack;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface IFavContent extends IInterface {
    void addFavContent(Bundle bundle, IFavContentCallBack iFavContentCallBack) throws RemoteException;

    void deleteFavContent(Bundle bundle, IFavContentCallBack iFavContentCallBack) throws RemoteException;

    void isFavContent(Bundle bundle, IFavContentCallBack iFavContentCallBack) throws RemoteException;

    void newAddFavoriteContent(int i, long j, String str, String str2, String str3, String str4, boolean z, IFavContentCallBack iFavContentCallBack) throws RemoteException;

    void newDeleteFavoriteContent(int i, long j, String str, boolean z, IFavContentCallBack iFavContentCallBack) throws RemoteException;

    void newIsFavoriteContent(int i, long j, String str, boolean z, IFavContentCallBack iFavContentCallBack) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static abstract class Stub extends Binder implements IFavContent {
        private static final String DESCRIPTOR = "com.taobao.tao.fav.aidl.IFavContent";
        static final int TRANSACTION_addFavContent = 1;
        static final int TRANSACTION_deleteFavContent = 3;
        static final int TRANSACTION_isFavContent = 2;
        static final int TRANSACTION_newAddFavoriteContent = 4;
        static final int TRANSACTION_newDeleteFavoriteContent = 5;
        static final int TRANSACTION_newIsFavoriteContent = 6;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class Proxy implements IFavContent {
            private IBinder mRemote;

            static {
                t2o.a(462422027);
                t2o.a(462422025);
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.taobao.tao.favorite.aidl.IFavContent
            public void addFavContent(Bundle bundle, IFavContentCallBack iFavContentCallBack) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (iFavContentCallBack != null) {
                        iBinder = iFavContentCallBack.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.taobao.tao.favorite.aidl.IFavContent
            public void deleteFavContent(Bundle bundle, IFavContentCallBack iFavContentCallBack) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (iFavContentCallBack != null) {
                        iBinder = iFavContentCallBack.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.taobao.tao.favorite.aidl.IFavContent
            public void isFavContent(Bundle bundle, IFavContentCallBack iFavContentCallBack) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (iFavContentCallBack != null) {
                        iBinder = iFavContentCallBack.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.taobao.tao.favorite.aidl.IFavContent
            public void newAddFavoriteContent(int i, long j, String str, String str2, String str3, String str4, boolean z, IFavContentCallBack iFavContentCallBack) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    obtain.writeInt(z ? 1 : 0);
                    if (iFavContentCallBack != null) {
                        iBinder = iFavContentCallBack.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.taobao.tao.favorite.aidl.IFavContent
            public void newDeleteFavoriteContent(int i, long j, String str, boolean z, IFavContentCallBack iFavContentCallBack) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    if (iFavContentCallBack != null) {
                        iBinder = iFavContentCallBack.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.taobao.tao.favorite.aidl.IFavContent
            public void newIsFavoriteContent(int i, long j, String str, boolean z, IFavContentCallBack iFavContentCallBack) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    if (iFavContentCallBack != null) {
                        iBinder = iFavContentCallBack.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(6, obtain, obtain2, 0);
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
            t2o.a(462422026);
            t2o.a(462422025);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IFavContent asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IFavContent)) {
                return new Proxy(iBinder);
            }
            return (IFavContent) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            boolean z2;
            boolean z3;
            if (i != 1598968902) {
                Bundle bundle = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        addFavContent(bundle, IFavContentCallBack.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        isFavContent(bundle, IFavContentCallBack.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        deleteFavContent(bundle, IFavContentCallBack.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        int readInt = parcel.readInt();
                        long readLong = parcel.readLong();
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        String readString3 = parcel.readString();
                        String readString4 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        newAddFavoriteContent(readInt, readLong, readString, readString2, readString3, readString4, z, IFavContentCallBack.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        int readInt2 = parcel.readInt();
                        long readLong2 = parcel.readLong();
                        String readString5 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        newDeleteFavoriteContent(readInt2, readLong2, readString5, z2, IFavContentCallBack.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        int readInt3 = parcel.readInt();
                        long readLong3 = parcel.readLong();
                        String readString6 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        newIsFavoriteContent(readInt3, readLong3, readString6, z3, IFavContentCallBack.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
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
