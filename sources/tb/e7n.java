package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.qos.QoSHandler;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class e7n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG_COLD_START_REFRESH_END = "cold_start_refresh_end";
    public static final String TAG_COLD_START_REFRESH_START = "cold_start_refresh_start";
    public static final String TAG_FIRST_CLICK = "first_click";
    public static final String TAG_FIRST_SCROLL = "first_scroll";
    public static final String TAG_LAUNCH_INTERACTIVE = "launch_interactive";
    public static final String TAG_LAUNCH_VISIBLE = "launch_visible";

    /* renamed from: a  reason: collision with root package name */
    public static volatile QoSHandler f18341a;
    public static j7n b;
    public static final Map<String, String> c = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends g7n {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Runnable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, Runnable runnable) {
            super(i);
            this.b = runnable;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend3/newface/gateway/action/QoSQueue$1");
        }

        @Override // tb.g7n, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.b.run();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements y80<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18342a;

        public b(String str) {
            this.f18342a = str;
        }

        /* renamed from: b */
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c263aadc", new Object[]{this, str});
                return;
            }
            bqa.d("QoSQueue", "dump...tag:" + this.f18342a + " , message:" + str);
            e7n.a().put(this.f18342a, str);
        }
    }

    static {
        t2o.a(729809797);
    }

    public static /* synthetic */ Map a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c8ee3d6c", new Object[0]);
        }
        return c;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("556e21e8", new Object[0]);
            return;
        }
        ((HashMap) c).clear();
        b = null;
    }

    public static void c(String str) {
        j7n d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc2fc585", new Object[]{str});
        } else if (!vxl.b().q() || (d = d()) == null) {
        } else {
            if (TextUtils.equals(str, TAG_LAUNCH_VISIBLE) && !d.f21821a) {
                return;
            }
            if (TextUtils.equals(str, TAG_LAUNCH_INTERACTIVE) && !d.b) {
                return;
            }
            if (TextUtils.equals(str, TAG_COLD_START_REFRESH_START) && !d.c) {
                return;
            }
            if (TextUtils.equals(str, TAG_COLD_START_REFRESH_END) && !d.c) {
                return;
            }
            if (TextUtils.equals(str, TAG_FIRST_CLICK) && !d.d) {
                return;
            }
            if (!TextUtils.equals(str, TAG_FIRST_SCROLL) || d.e) {
                b7n.a(new b(str));
            }
        }
    }

    public static j7n d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j7n) ipChange.ipc$dispatch("6e6f1ecb", new Object[0]);
        }
        if (b == null) {
            b = j7n.a(f4b.h("homepageQosDumpConfig", j7n.DEFAULT_CONFIG));
        }
        return b;
    }

    public static Map<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4e1e588e", new Object[0]);
        }
        return c;
    }

    public static QoSHandler f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (QoSHandler) ipChange.ipc$dispatch("e1cd4095", new Object[0]);
        }
        if (f18341a == null) {
            synchronized (d7n.class) {
                try {
                    if (f18341a == null) {
                        f18341a = d7n.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f18341a;
    }

    public static void g(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7b0b5d5", new Object[]{str, new Long(j)});
        } else if (vxl.b().q()) {
            ((HashMap) c).put(str, String.valueOf(j));
        }
    }

    public static void h(Runnable runnable, boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b192524", new Object[]{runnable, new Boolean(z), new Integer(i), new Integer(i2)});
        } else if (!vxl.b().s() || !z) {
            runnable.run();
        } else {
            i(runnable, i, i2);
        }
    }

    public static void i(Runnable runnable, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e14eea2e", new Object[]{runnable, new Integer(i), new Integer(i2)});
        } else {
            f().a(i, new a(i2, runnable));
        }
    }
}
