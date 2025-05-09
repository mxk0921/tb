package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import com.taobao.android.service.Services;
import com.taobao.calendar.bridge.jsbridge.CalendarJsBridge;
import com.taobao.calendar.bridge.listener.CalendarListener;
import com.taobao.calendar.bridge.model.ScheduleDTOModule;
import com.taobao.calendar.bridge.service.ICalendarService;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hu2 {

    /* renamed from: a  reason: collision with root package name */
    public static hu2 f20900a = new hu2();
    public static final String b = "TBCalendar";
    public static ICalendarService c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends AsyncTask<Object, Object, Boolean> {
        public a(hu2 hu2Var) {
        }

        public Boolean a(Object... objArr) {
            try {
                if (hu2.c == null) {
                    ICalendarService unused = hu2.c = (ICalendarService) Services.get(Globals.getApplication(), ICalendarService.class);
                }
            } catch (Exception e) {
                TLog.loge("calendar init error", e.getMessage());
            }
            return Boolean.TRUE;
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Boolean doInBackground(Object[] objArr) {
            a(objArr);
            return Boolean.TRUE;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends AsyncTask<Object, Object, Boolean> {
        public b(hu2 hu2Var) {
        }

        public Boolean a(Object... objArr) {
            try {
                if (hu2.c == null) {
                    ICalendarService unused = hu2.c = (ICalendarService) Services.get(Globals.getApplication(), ICalendarService.class);
                }
            } catch (Exception e) {
                TLog.loge("calendar init error", e.getMessage());
            }
            return Boolean.TRUE;
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Boolean doInBackground(Object[] objArr) {
            a(objArr);
            return Boolean.TRUE;
        }
    }

    static {
        t2o.a(693108738);
    }

    public static synchronized hu2 f() {
        hu2 hu2Var;
        synchronized (hu2.class) {
            try {
                if (f20900a == null) {
                    f20900a = new hu2();
                }
                hu2Var = f20900a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hu2Var;
    }

    public static void i() {
        try {
            fsw.i("TBCalendarAlias", CalendarJsBridge.class, true);
            fsw.f("TBCalendar", "addCalendarPlan", "TBCalendarAlias", "addCalendarPlan");
            fsw.f("TBCalendar", "cancelCalendarPlan", "TBCalendarAlias", "cancelCalendarPlan");
            fsw.f("TBCalendar", "checkCalendarPlanIsExist", "TBCalendarAlias", "checkCalendarPlanIsExist");
            fsw.f("TBCalendar", "checkCalendarPermission", "TBCalendarAlias", "checkCalendarPermission");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void c(ScheduleDTOModule scheduleDTOModule) {
        try {
            ICalendarService iCalendarService = c;
            if (iCalendarService == null) {
                g();
            } else {
                iCalendarService.addCalendar(scheduleDTOModule);
            }
        } catch (Exception e) {
            Log.e(b, "calendarService addCalendar exception");
            e.printStackTrace();
        }
    }

    public void d(String str, String str2) {
        try {
            ICalendarService iCalendarService = c;
            if (iCalendarService == null) {
                g();
            } else {
                iCalendarService.cancelCalendar(str, str2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void e(String str) {
        try {
            ICalendarService iCalendarService = c;
            if (iCalendarService == null) {
                g();
            } else {
                iCalendarService.checkReminderExist(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void g() {
        if (c == null) {
            new b(this).execute(new Object());
        }
    }

    public void h(Context context) {
        if (context != null && c == null) {
            new a(this).execute(new Object());
        }
    }

    public void j(CalendarListener calendarListener) {
        try {
            ICalendarService iCalendarService = c;
            if (iCalendarService == null) {
                g();
            } else {
                iCalendarService.registerListener(calendarListener);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
