package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.zhc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class v2l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static v2l f29746a = null;
    public static boolean b = false;
    public static final String pageName4UT = "lpm_OpenArchLogService";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1004536659);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final v2l a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (v2l) ipChange.ipc$dispatch("17b1d7bd", new Object[]{this});
            }
            v2l a2 = v2l.a();
            if (a2 != null) {
                return a2;
            }
            v2l v2lVar = new v2l();
            v2l.c(v2lVar);
            v2l.b(v2lVar);
            return v2lVar;
        }

        public a() {
        }
    }

    static {
        t2o.a(1004536658);
    }

    public static final /* synthetic */ v2l a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v2l) ipChange.ipc$dispatch("6d275aa4", new Object[0]);
        }
        return f29746a;
    }

    public static final /* synthetic */ void b(v2l v2lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b648219a", new Object[]{v2lVar});
        } else {
            v2lVar.d();
        }
    }

    public static final /* synthetic */ void c(v2l v2lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8208b286", new Object[]{v2lVar});
        } else {
            f29746a = v2lVar;
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de09518d", new Object[]{this});
            return;
        }
        uhc e0 = mhr.e0();
        b = Boolean.parseBoolean(e0.b(vhc.a(e0), "enableLogService", "true"));
    }

    public final void e(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("712ea467", new Object[]{this, str, map});
            return;
        }
        ckf.g(str, "arg1");
        ckf.g(map, "params");
        if (b) {
            zhc.a.b(mhr.h0(), pageName4UT, str, null, null, map, 2101, 12, null);
        }
    }
}
