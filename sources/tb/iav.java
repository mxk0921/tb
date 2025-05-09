package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.trade.common.kit.utils.UnifyLog;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class iav {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadPoolExecutor f21198a = oav.c(1, 5, 3, TimeUnit.SECONDS, new b(), "UltronRVLogger");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21199a;
        public final /* synthetic */ long b;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ Map e;

        public a(String str, long j, String str2, boolean z, Map map) {
            this.f21199a = str;
            this.b = j;
            this.c = str2;
            this.d = z;
            this.e = map;
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
                if (TextUtils.isEmpty(this.f21199a)) {
                    str = "common";
                } else {
                    str = this.f21199a;
                }
                sb.append(str);
                icn l = lcn.a(rVLLevel, sb.toString()).l(rVLLevel);
                long j = this.b;
                if (j <= 0) {
                    l.n(System.currentTimeMillis());
                } else {
                    l.n(j);
                }
                l.a("message", this.c);
                l.a("isMainThread", Boolean.valueOf(this.d));
                l.b(this.e);
                l.f();
            } catch (Exception e) {
                UnifyLog.d("UltronRVLogger", e.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                UnifyLog.d("UltronRVLogger", "rejected");
            }
        }
    }

    static {
        t2o.a(794820638);
    }

    public static /* synthetic */ void a(String str, String str2, long j, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29dc1b4c", new Object[]{str, str2, new Long(j), map});
        } else {
            f(str, str2, j, map);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a936c23", new Object[]{str, str2});
        } else {
            d("ultron", str, str2, null);
        }
    }

    public static void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e20f32d", new Object[]{str, str2, str3});
        } else {
            d(str, str2, str3, null);
        }
    }

    public static void d(String str, String str2, String str3, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27088b8", new Object[]{str, str2, str3, map});
            return;
        }
        if (str == null) {
            str = "ultron";
        }
        f(str2, str + "#" + str3, System.currentTimeMillis(), map);
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1175515f", new Object[]{str, str2});
        } else {
            h(str, str2, "");
        }
    }

    public static void f(String str, String str2, long j, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e0137a0", new Object[]{str, str2, new Long(j), map});
            return;
        }
        try {
            f21198a.execute(new a(str, j, str2, oav.b(), map));
        } catch (Exception e) {
            UnifyLog.d("UltronRVLogger", e.getMessage());
        }
    }

    public static void g(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a91c046", new Object[]{str, str2, map});
        } else {
            f(str, str2, System.currentTimeMillis(), map);
        }
    }

    public static void h(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fc4102a", new Object[]{str, strArr});
        } else if (str != null && strArr != null) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : strArr) {
                sb.append(str2);
            }
            g(str, sb.toString(), null);
        }
    }

    public static void i(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c84d725f", new Object[]{str, strArr});
        } else if (m7v.a()) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : strArr) {
                sb.append(str2);
            }
            f(str, sb.toString(), System.currentTimeMillis(), null);
        }
    }
}
