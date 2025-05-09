package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.CalendarConfig;
import com.taobao.desktop.channel.calendar.CalendarInsertData;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import tb.uu2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class wu2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DAY = 86400000;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements uu2.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f30921a;
        public final /* synthetic */ long b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Context d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ long g;
        public final /* synthetic */ c h;

        public a(long j, long j2, String str, Context context, String str2, String str3, long j3, c cVar) {
            this.f30921a = j;
            this.b = j2;
            this.c = str;
            this.d = context;
            this.e = str2;
            this.f = str3;
            this.g = j3;
            this.h = cVar;
        }

        @Override // tb.uu2.a
        public void onError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
                return;
            }
            c cVar = this.h;
            if (cVar != null) {
                cVar.onError();
            }
        }

        @Override // tb.uu2.a
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            boolean z = false;
            for (int i = 0; i < this.f30921a; i++) {
                try {
                    long j = this.b + (wu2.DAY * i);
                    String a2 = wu2.a(this.c, j);
                    if (!uu2.b(this.d, a2, j, j + 3600000)) {
                        CalendarInsertData calendarInsertData = new CalendarInsertData();
                        calendarInsertData.setTitle(a2);
                        calendarInsertData.setContent(this.e);
                        calendarInsertData.setReminderTime(j);
                        calendarInsertData.setKeepTime(3600000L);
                        calendarInsertData.setTargetUrl(this.f);
                        calendarInsertData.setPreviousMinutes(this.g);
                        if (!TextUtils.isEmpty(lu2.a(this.d, calendarInsertData))) {
                        }
                    }
                    z = true;
                } catch (Throwable unused) {
                }
            }
            c cVar = this.h;
            if (cVar != null) {
                cVar.onSuccess(z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements uu2.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f30922a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ String c;
        public final /* synthetic */ long d;
        public final /* synthetic */ c e;

        public b(long j, Context context, String str, long j2, c cVar) {
            this.f30922a = j;
            this.b = context;
            this.c = str;
            this.d = j2;
            this.e = cVar;
        }

        @Override // tb.uu2.a
        public void onError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
                return;
            }
            c cVar = this.e;
            if (cVar != null) {
                cVar.onError();
            }
        }

        @Override // tb.uu2.a
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            boolean z = false;
            for (int i = 0; i < this.f30922a; i++) {
                Context context = this.b;
                String str = this.c;
                long j = this.d;
                long j2 = wu2.DAY * i;
                String a2 = wu2.a(str, j + j2);
                long j3 = this.d;
                if (uu2.c(context, a2, j3 + j2, j3 + j2 + 3600000) || z) {
                    z = true;
                } else {
                    z = false;
                }
            }
            c cVar = this.e;
            if (cVar != null) {
                cVar.onSuccess(z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
        void onError();

        void onSuccess(boolean z);
    }

    static {
        t2o.a(295699658);
    }

    public static /* synthetic */ String a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1865419d", new Object[]{str, new Long(j)});
        }
        return c(str, j);
    }

    public static void b(Context context, CalendarConfig calendarConfig, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f09d423", new Object[]{context, calendarConfig, cVar});
        } else if (calendarConfig != null) {
            uu2.d(context, new a(calendarConfig.days, e(calendarConfig.time), calendarConfig.title, context, calendarConfig.content, calendarConfig.url, calendarConfig.previousMinutes, cVar));
        }
    }

    public static String c(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4653b35", new Object[]{str, new Long(j)});
        }
        return str + f(j);
    }

    public static boolean d(Context context, CalendarConfig calendarConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5fb61c86", new Object[]{context, calendarConfig})).booleanValue();
        }
        if (calendarConfig == null) {
            return false;
        }
        String str = calendarConfig.title;
        long e = e(calendarConfig.time);
        return uu2.b(context, c(str, e), e, e + 3600000);
    }

    public static long e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("357fcbf6", new Object[]{new Long(j)})).longValue();
        }
        Calendar instance = Calendar.getInstance();
        instance.add(5, 1);
        instance.set(11, (int) j);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis();
    }

    public static String f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b168eb5", new Object[]{new Long(j)});
        }
        return new SimpleDateFormat("-MMdd").format(new Date(j));
    }

    public static void g(Context context, CalendarConfig calendarConfig, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44c92fc6", new Object[]{context, calendarConfig, cVar});
        } else if (calendarConfig != null) {
            uu2.d(context, new b(calendarConfig.days, context, calendarConfig.title, e(calendarConfig.time), cVar));
        }
    }
}
