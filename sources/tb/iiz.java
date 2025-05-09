package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import tb.iiz;
import tb.ovc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class iiz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PERF_STAG_TOTAL = "total";
    public static boolean b;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f21337a = ciz.Companion.c();
    public static final eji c = new eji("appMonitorScheduler", 1);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737541);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public static final void e(String str, String str2, long j, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae87dd64", new Object[]{str, str2, new Long(j), new Boolean(z)});
                return;
            }
            ckf.g(str, "$bizId");
            ckf.g(str2, "$name");
            String s = iiz.Companion.s(str, str2, String.valueOf(j));
            if (z) {
                ovc h = cjf.INSTANCE.h();
                if (h != null) {
                    h.commitSuccess("NanoCompose", "RenderMonitor", s);
                    return;
                }
                return;
            }
            ovc h2 = cjf.INSTANCE.h();
            if (h2 != null) {
                h2.commitFail("NanoCompose", "RenderMonitor", s, "0", "");
            }
        }

        public static final void g(String str, String str2, long j, int i, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76b37201", new Object[]{str, str2, new Long(j), new Integer(i), str3});
                return;
            }
            ckf.g(str, "$bizId");
            ckf.g(str2, "$name");
            ckf.g(str3, "$msg");
            a aVar = iiz.Companion;
            String s = aVar.s(str, str2, String.valueOf(j));
            String valueOf = String.valueOf(i);
            aVar.l(valueOf, s + f7l.CONDITION_IF_MIDDLE + str3);
            ovc h = cjf.INSTANCE.h();
            if (h != null) {
                h.commitFail("NanoCompose", "RenderError", s, String.valueOf(i), str3);
            }
        }

        public static /* synthetic */ String o(a aVar, String[] strArr, String str, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2b638706", new Object[]{aVar, strArr, str, new Integer(i), obj});
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return aVar.n(strArr, str);
        }

        public final void d(final String str, final String str2, final long j, final boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29a78003", new Object[]{this, str, str2, new Long(j), new Boolean(z)});
                return;
            }
            ckf.g(str, "bizId");
            ckf.g(str2, "name");
            m();
            eji.j(iiz.b(), new Runnable() { // from class: tb.fiz
                @Override // java.lang.Runnable
                public final void run() {
                    iiz.a.e(str, str2, j, z);
                }
            }, 0L, null, 6, null);
        }

        public final void f(final String str, final String str2, final long j, final int i, final String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20a4c1c8", new Object[]{this, str, str2, new Long(j), new Integer(i), str3});
                return;
            }
            ckf.g(str, "bizId");
            ckf.g(str2, "name");
            ckf.g(str3, "msg");
            m();
            eji.j(iiz.b(), new Runnable() { // from class: tb.giz
                @Override // java.lang.Runnable
                public final void run() {
                    iiz.a.g(str, str2, j, i, str3);
                }
            }, 0L, null, 6, null);
        }

        public final void j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            } else {
                ckf.g(str, "msg");
            }
        }

        public final void k(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
                return;
            }
            ckf.g(str, "msg");
            l("", str);
        }

        public final void l(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb83980", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "tag");
            ckf.g(str2, "msg");
            boc f = cjf.INSTANCE.f();
            if (f != null) {
                f.c("NanoCompose", str, str2);
            }
        }

        public final String n(String[] strArr, String str) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("25b949f9", new Object[]{this, strArr, str});
            }
            if (strArr.length == 0) {
                return "";
            }
            if (strArr.length == 1) {
                return strArr[0];
            }
            StringBuilder sb = new StringBuilder();
            int length = strArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i2 = i + 1;
                    if (i == ic1.K(strArr)) {
                        sb.append(strArr[i]);
                    } else {
                        sb.append(strArr[i]);
                        sb.append(str);
                    }
                    if (i2 > length) {
                        break;
                    }
                    i = i2;
                }
            }
            String sb2 = sb.toString();
            ckf.f(sb2, "builder.toString()");
            return sb2;
        }

        public final void p(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("143ca15b", new Object[]{this, str});
            } else {
                ckf.g(str, "msg");
            }
        }

        public final void q(String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c97afbd9", new Object[]{this, strArr});
                return;
            }
            ckf.g(strArr, "content");
            boc f = cjf.INSTANCE.f();
            if (f != null) {
                f.c("NanoCompose", "EventChain", o(this, (String[]) Arrays.copyOf(strArr, strArr.length), null, 2, null));
            }
        }

        public final void r(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("423c9b1e", new Object[]{this, str});
                return;
            }
            ckf.g(str, "msg");
            boc f = cjf.INSTANCE.f();
            if (f != null) {
                f.c("NanoCompose", "Perf", str);
            }
        }

        public final String s(String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1048ad58", new Object[]{this, strArr});
            }
            return n((String[]) Arrays.copyOf(strArr, strArr.length), "|");
        }

        public a() {
        }

        public final void m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56ec5930", new Object[]{this});
            } else if (!iiz.a()) {
                iiz.d(true);
                ovc h = cjf.INSTANCE.h();
                if (h != null) {
                    ovc.a.a(h, "NanoCompose", "RenderPerf", jfp.c("cost"), kfp.h("bizId", "name", "version", v4s.PARAM_UPLOAD_STAGE), false, 16, null);
                }
            }
        }

        public final void h(final String str, final String str2, final long j, final String str3, final long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b429451", new Object[]{this, str, str2, new Long(j), str3, new Long(j2)});
                return;
            }
            ckf.g(str, "bizId");
            ckf.g(str2, "name");
            ckf.g(str3, v4s.PARAM_UPLOAD_STAGE);
            m();
            eji.j(iiz.b(), new Runnable() { // from class: tb.hiz
                @Override // java.lang.Runnable
                public final void run() {
                    iiz.a.i(str3, str, str2, j, j2);
                }
            }, 0L, null, 6, null);
        }

        public static final void i(String str, String str2, String str3, long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1704175", new Object[]{str, str2, str3, new Long(j), new Long(j2)});
                return;
            }
            ckf.g(str, "$stage");
            ckf.g(str2, "$bizId");
            ckf.g(str3, "$name");
            ovc h = cjf.INSTANCE.h();
            if (h != null) {
                h.commitStat("NanoCompose", "RenderPerf", kotlin.collections.a.j(jpu.a(v4s.PARAM_UPLOAD_STAGE, str), jpu.a("bizId", str2), jpu.a("name", str3), jpu.a("version", String.valueOf(j))), v3i.f(jpu.a("cost", Double.valueOf(j2))));
            }
        }
    }

    static {
        t2o.a(598737540);
    }

    public static final /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f934f85d", new Object[0])).booleanValue();
        }
        return b;
    }

    public static final /* synthetic */ eji b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eji) ipChange.ipc$dispatch("7361e827", new Object[0]);
        }
        return c;
    }

    public static final /* synthetic */ boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36a93b78", new Object[0])).booleanValue();
        }
        return f21337a;
    }

    public static final /* synthetic */ void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fae61a7", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }
}
