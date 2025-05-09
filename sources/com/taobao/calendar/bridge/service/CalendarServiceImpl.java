package com.taobao.calendar.bridge.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.taobao.calendar.bridge.listener.CalendarListener;
import com.taobao.calendar.bridge.model.ScheduleDTOModule;
import com.taobao.calendar.bridge.service.ICalendarService;
import com.taobao.calendar.exception.CalendarResult;
import tb.ju2;
import tb.ned;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CalendarServiceImpl extends Service {

    /* renamed from: a  reason: collision with root package name */
    public Context f10264a;
    public ju2 b;
    public final IBinder c = new ICalendarService.Stub() { // from class: com.taobao.calendar.bridge.service.CalendarServiceImpl.1
        private CalendarListener listener = null;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.calendar.bridge.service.CalendarServiceImpl$1$a */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a extends ned {
            public a() {
            }

            @Override // tb.ned
            public void a(CalendarResult calendarResult, String str) {
                try {
                    CalendarResult calendarResult2 = CalendarResult.KTCALENDAR_SUCCESS;
                    AnonymousClass1 r1 = AnonymousClass1.this;
                    if (calendarResult == calendarResult2) {
                        r1.listener.onSuccess(true, str);
                    } else {
                        r1.listener.onError(calendarResult.getCode(), calendarResult.getMessage());
                    }
                } catch (RemoteException unused) {
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.calendar.bridge.service.CalendarServiceImpl$1$b */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class b extends ned {
            public b() {
            }

            @Override // tb.ned
            public void a(CalendarResult calendarResult, String str) {
                try {
                    CalendarResult calendarResult2 = CalendarResult.KTCALENDAR_SUCCESS;
                    AnonymousClass1 r1 = AnonymousClass1.this;
                    if (calendarResult == calendarResult2) {
                        r1.listener.onSuccess(true, str);
                    } else {
                        r1.listener.onError(calendarResult.getCode(), calendarResult.getMessage());
                    }
                } catch (RemoteException unused) {
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.calendar.bridge.service.CalendarServiceImpl$1$c */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class c extends ned {
            public c() {
            }

            @Override // tb.ned
            public void a(CalendarResult calendarResult, String str) {
                try {
                    CalendarResult calendarResult2 = CalendarResult.KTCALENDAR_SUCCESS;
                    AnonymousClass1 r1 = AnonymousClass1.this;
                    if (calendarResult == calendarResult2) {
                        r1.listener.onSuccess(true, str);
                    } else {
                        r1.listener.onError(calendarResult.getCode(), calendarResult.getMessage());
                    }
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // com.taobao.calendar.bridge.service.ICalendarService
        public void addCalendar(ScheduleDTOModule scheduleDTOModule) throws RemoteException {
            if (this.listener != null) {
                CalendarServiceImpl.this.b.b(scheduleDTOModule, new a());
            }
        }

        @Override // com.taobao.calendar.bridge.service.ICalendarService
        public void cancelCalendar(String str, String str2) throws RemoteException {
            if (this.listener != null) {
                CalendarServiceImpl.this.b.c(str, str2, new b());
            }
        }

        @Override // com.taobao.calendar.bridge.service.ICalendarService
        public void checkReminderExist(String str) throws RemoteException {
            CalendarServiceImpl.this.b.e(str, new c());
        }

        @Override // com.taobao.calendar.bridge.service.ICalendarService
        public void registerListener(CalendarListener calendarListener) throws RemoteException {
            this.listener = calendarListener;
        }
    };

    static {
        t2o.a(693108759);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.c;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f10264a = getApplication();
        this.b = new ju2(this.f10264a);
    }
}
