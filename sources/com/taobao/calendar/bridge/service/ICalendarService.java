package com.taobao.calendar.bridge.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taobao.calendar.bridge.listener.CalendarListener;
import com.taobao.calendar.bridge.model.ScheduleDTOModule;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface ICalendarService extends IInterface {
    void addCalendar(ScheduleDTOModule scheduleDTOModule) throws RemoteException;

    void cancelCalendar(String str, String str2) throws RemoteException;

    void checkReminderExist(String str) throws RemoteException;

    void registerListener(CalendarListener calendarListener) throws RemoteException;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static abstract class Stub extends Binder implements ICalendarService {
        private static final String DESCRIPTOR = "com.taobao.calendar.bridge.service.ICalendarService";
        static final int TRANSACTION_addCalendar = 2;
        static final int TRANSACTION_cancelCalendar = 3;
        static final int TRANSACTION_checkReminderExist = 4;
        static final int TRANSACTION_registerListener = 1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static class Proxy implements ICalendarService {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f10268a;

            static {
                t2o.a(693108766);
                t2o.a(693108764);
            }

            public Proxy(IBinder iBinder) {
                this.f10268a = iBinder;
            }

            @Override // com.taobao.calendar.bridge.service.ICalendarService
            public void addCalendar(ScheduleDTOModule scheduleDTOModule) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (scheduleDTOModule != null) {
                        obtain.writeInt(1);
                        scheduleDTOModule.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f10268a.transact(2, obtain, obtain2, 0);
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
                return this.f10268a;
            }

            @Override // com.taobao.calendar.bridge.service.ICalendarService
            public void cancelCalendar(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f10268a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.calendar.bridge.service.ICalendarService
            public void checkReminderExist(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.f10268a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.calendar.bridge.service.ICalendarService
            public void registerListener(CalendarListener calendarListener) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (calendarListener != null) {
                        iBinder = calendarListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f10268a.transact(1, obtain, obtain2, 0);
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
            t2o.a(693108765);
            t2o.a(693108764);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ICalendarService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ICalendarService)) {
                return new Proxy(iBinder);
            }
            return (ICalendarService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            ScheduleDTOModule scheduleDTOModule;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                registerListener(CalendarListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    scheduleDTOModule = ScheduleDTOModule.CREATOR.createFromParcel(parcel);
                } else {
                    scheduleDTOModule = null;
                }
                addCalendar(scheduleDTOModule);
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                cancelCalendar(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                checkReminderExist(parcel.readString());
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
