package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.rp0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class qp0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_IMMUTABLE = "immutable";
    public static final String CONFIG_PEROID = "peroid";
    public static final String CONFIG_REPORT_PEROID = "reportPeroid";
    public static final String CONFIG_REPORT_RULES = "reportRules";
    public static final String CONFIG_SWITCH = "switch";
    public static final int DEVICE_LEVEL_0 = 0;
    public static final int DEVICE_LEVEL_1 = 1;
    public static final int DEVICE_LEVEL_2 = 2;
    public static final int DEVICE_LEVEL_CLOSE = -3;
    public static final int DEVICE_LEVEL_INNER_ERROR = -1;
    public static final int DEVICE_LEVEL_NOT_READY = -2;

    /* renamed from: a  reason: collision with root package name */
    public static volatile rl0 f26867a;
    public static volatile Boolean b;
    public static int c;

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[0])).intValue();
        }
        float c2 = c();
        int g = rl0.g(c2);
        StringBuilder sb = new StringBuilder("get device level using ai, score = ");
        sb.append(c2);
        sb.append(" level = ");
        sb.append(g);
        return g;
    }

    public static float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e89be1d", new Object[0])).floatValue();
        }
        c++;
        if (b == null) {
            e();
        }
        if (f26867a == null) {
            return -2.0f;
        }
        if (b.booleanValue()) {
            return f26867a.i();
        }
        return f26867a.h();
    }

    public static synchronized void d(rp0.a aVar) {
        synchronized (qp0.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be6b21d0", new Object[]{aVar});
                return;
            }
            if (b == null) {
                if (m1g.b() == null) {
                    b = Boolean.FALSE;
                } else {
                    b = Boolean.valueOf(m1g.b().getBoolean("immutable", false));
                }
            }
            rl0 rl0Var = f26867a;
            if (rl0Var == null) {
                rl0Var = new rl0();
            }
            if (aVar != null) {
                rl0Var.q(aVar);
            }
            dq0.a(z9a.f32627a, rl0Var);
            rl0Var.r();
            f26867a = rl0Var;
            mi7.f(c);
        }
    }

    public static synchronized void e() {
        synchronized (qp0.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9abbaa01", new Object[0]);
                return;
            }
            if (b == null) {
                if (m1g.b() == null) {
                    b = Boolean.FALSE;
                } else {
                    b = Boolean.valueOf(m1g.b().getBoolean("immutable", false));
                }
            }
            if (b.booleanValue()) {
                if (f26867a == null) {
                    rl0 rl0Var = new rl0();
                    rl0Var.k();
                    f26867a = rl0Var;
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:6|(15:59|8|9|13|(4:63|15|(1:17)(1:20)|21)|23|(3:61|25|26)|29|64|30|(3:32|(4:35|(5:66|38|(1:73)|45|46)(3:68|37|72)|71|33)|67)(0)|48|(3:57|50|(2:55|56)(1:74))|53|(0)(0))|12|13|(0)|23|(0)|29|64|30|(0)(0)|48|(0)|53|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00eb, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fd, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf A[Catch: all -> 0x00eb, TryCatch #4 {all -> 0x00eb, blocks: (B:30:0x00af, B:32:0x00bf, B:33:0x00c3, B:35:0x00c9, B:38:0x00d4, B:40:0x00e0, B:45:0x00ed), top: B:64:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.util.HashMap<java.lang.String, java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.qp0.a(java.util.HashMap):void");
    }
}
