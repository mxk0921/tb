package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.tao.Globals;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hav {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadPoolExecutor f20521a = pav.d(1, 1, 5, TimeUnit.SECONDS, new a(), "UltronRVLogger");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                UnifyLog.e("UltronRVLogger", "rejected");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20522a;
        public final /* synthetic */ String b;

        public b(String str, String str2) {
            this.f20522a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Application application = Globals.getApplication();
            TBToast.makeText(application, "奥创报错:" + this.f20522a + "|" + this.b).show();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20523a;
        public final /* synthetic */ long b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Map d;

        public c(String str, long j, String str2, Map map) {
            this.f20523a = str;
            this.b = j;
            this.c = str2;
            this.d = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                RVLLevel rVLLevel = RVLLevel.Error;
                StringBuilder sb = new StringBuilder("Ultron/");
                if (TextUtils.isEmpty(this.f20523a)) {
                    str = "common";
                } else {
                    str = this.f20523a;
                }
                sb.append(str);
                icn l = lcn.a(rVLLevel, sb.toString()).l(rVLLevel);
                l.n(this.b);
                l.a("message", this.c);
                l.a("isMainThread", Boolean.valueOf(pav.b()));
                l.b(this.d);
                l.f();
            } catch (Throwable th) {
                UnifyLog.e("UltronRVLogger", th.getMessage());
            }
        }
    }

    static {
        t2o.a(83886348);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a936c23", new Object[]{str, str2});
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        c("ultron", str, str2, null);
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e20f32d", new Object[]{str, str2, str3});
        } else {
            c(str, str2, str3, null);
        }
    }

    public static void c(String str, String str2, String str3, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27088b8", new Object[]{str, str2, str3, map});
            return;
        }
        if (str == null) {
            str = "ultron";
        }
        e(str2, str + "#" + str3, System.currentTimeMillis(), map);
        if (n7v.a() && l9v.a("showRVErrorToast")) {
            pav.i(new b(str2, str3), 0L);
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1175515f", new Object[]{str, str2});
        } else {
            g(str, str2, "");
        }
    }

    public static void e(String str, String str2, long j, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e0137a0", new Object[]{str, str2, new Long(j), map});
            return;
        }
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        f20521a.execute(new c(str, j, str2, map));
    }

    public static void f(String str, String str2, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a91c046", new Object[]{str, str2, map});
        } else {
            e(str, str2, System.currentTimeMillis(), map);
        }
    }

    public static void g(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fc4102a", new Object[]{str, strArr});
        } else if (str != null && strArr != null) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : strArr) {
                if (str2 != null) {
                    sb.append(str2);
                }
            }
            f(str, sb.toString(), null);
        }
    }

    public static void h(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e874a1bb", new Object[]{str, str2, map});
        } else if (n7v.a()) {
            e(str, str2, System.currentTimeMillis(), map);
        }
    }

    public static void i(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c84d725f", new Object[]{str, strArr});
        } else if (n7v.a()) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : strArr) {
                sb.append(str2);
            }
            e(str, sb.toString(), System.currentTimeMillis(), null);
        }
    }
}
