package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.kmp.kernel.common.LogUtilsLevel;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class pus {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final pus INSTANCE = new pus();

    /* renamed from: a  reason: collision with root package name */
    public static final njg f26332a;
    public static final njg b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(1002438746);
            int[] iArr = new int[LogUtilsLevel.values().length];
            try {
                iArr[LogUtilsLevel.LOG_DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogUtilsLevel.LOG_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogUtilsLevel.LOG_WARN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LogUtilsLevel.LOG_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(1002438745);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f26332a = kotlin.a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.nus
            @Override // tb.d1a
            public final Object invoke() {
                int l;
                l = pus.l();
                return Integer.valueOf(l);
            }
        });
        b = kotlin.a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.ous
            @Override // tb.d1a
            public final Object invoke() {
                boolean e;
                e = pus.e();
                return Boolean.valueOf(e);
            }
        });
    }

    public static final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da338168", new Object[0])).booleanValue();
        }
        return com.taobao.uniinfra_kmp.common_utils.app.a.g();
    }

    public static final int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a23e6ded", new Object[0])).intValue();
        }
        return mhr.e0().getInt("KMPLogLevel", 2);
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d423990", new Object[]{this})).intValue();
        }
        return ((Number) f26332a.getValue()).intValue();
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[]{this})).booleanValue();
        }
        return ((Boolean) b.getValue()).booleanValue();
    }

    public final void f(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17d2fd4", new Object[]{this, str, str2, str3});
            return;
        }
        ckf.g(str, AliFestivalWVPlugin.PARAMS_MODULE_NAME);
        h(str, str2, str3, true, LogUtilsLevel.LOG_DEBUG);
    }

    public final void g(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574b6f49", new Object[]{this, str, str2, str3});
            return;
        }
        ckf.g(str, AliFestivalWVPlugin.PARAMS_MODULE_NAME);
        h(str, str2, str3, true, LogUtilsLevel.LOG_ERROR);
    }

    public final void i(String str, String str2, d1a<String> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e8dd50", new Object[]{this, str, str2, d1aVar});
            return;
        }
        ckf.g(str, AliFestivalWVPlugin.PARAMS_MODULE_NAME);
        j(str, str2, d1aVar, true, LogUtilsLevel.LOG_DEBUG);
    }

    public final void j(String str, String str2, d1a<String> d1aVar, boolean z, LogUtilsLevel logUtilsLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce424bc", new Object[]{this, str, str2, d1aVar, new Boolean(z), logUtilsLevel});
            return;
        }
        String str3 = null;
        if (d1aVar != null) {
            if (!INSTANCE.n(logUtilsLevel)) {
                d1aVar = null;
            }
            if (d1aVar != null) {
                str3 = d1aVar.invoke();
            }
        }
        h(str, str2, str3, z, logUtilsLevel);
    }

    public final void k(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddfd5ab7", new Object[]{this, str, str2, str3});
            return;
        }
        ckf.g(str, AliFestivalWVPlugin.PARAMS_MODULE_NAME);
        h(str, str2, str3, true, LogUtilsLevel.LOG_INFO);
    }

    public final void m(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8e60a8f", new Object[]{this, str, str2, str3});
            return;
        }
        ckf.g(str, AliFestivalWVPlugin.PARAMS_MODULE_NAME);
        h(str, str2, str3, true, LogUtilsLevel.LOG_WARN);
    }

    public final boolean n(LogUtilsLevel logUtilsLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4718f1fa", new Object[]{this, logUtilsLevel})).booleanValue();
        }
        if (d() || logUtilsLevel.getValue() >= c()) {
            return true;
        }
        return false;
    }

    public final void h(String str, String str2, String str3, boolean z, LogUtilsLevel logUtilsLevel) {
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65913da", new Object[]{this, str, str2, str3, new Boolean(z), logUtilsLevel});
        } else if (n(logUtilsLevel)) {
            if (z) {
                str4 = "KMP";
            } else {
                str4 = "NATIVE";
            }
            String str6 = str == null ? "default" : str;
            StringBuilder sb = new StringBuilder("[");
            sb.append(str4);
            sb.append("][");
            String str7 = "null";
            sb.append(str2 == null ? str7 : str2);
            sb.append("]|");
            sb.append(str3);
            String sb2 = sb.toString();
            int i = a.$EnumSwitchMapping$0[logUtilsLevel.ordinal()];
            if (i == 1) {
                mhr.Z(str6, sb2);
                str5 = "[D]";
            } else if (i == 2) {
                mhr.b0(str6, sb2);
                str5 = "[I]";
            } else if (i == 3) {
                mhr.c0(str6, sb2);
                str5 = "[W]";
            } else if (i == 4) {
                mhr.a0(str6, sb2);
                str5 = "[E]";
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (d()) {
                StringBuilder sb3 = new StringBuilder("[");
                sb3.append(bvt.a(ftt.Companion));
                sb3.append(']');
                sb3.append(str5);
                sb3.append("[TBLVKMP][");
                sb3.append(str4);
                sb3.append("][");
                sb3.append(str);
                sb3.append("][");
                if (str2 != null) {
                    str7 = str2;
                }
                sb3.append(str7);
                sb3.append("]|");
                sb3.append(str3);
                System.out.println((Object) sb3.toString());
            }
        }
    }
}
