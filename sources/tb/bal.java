package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class bal {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f16279a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1022361793);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final bal a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bal) ipChange.ipc$dispatch("a4113136", new Object[]{this});
            }
            bal balVar = new bal(null);
            dr.d(dr.INSTANCE, MUSMonitor.MODULE_DIM_ABILITY, "create", kotlin.collections.a.k(jpu.a(MUSMonitor.MODULE_DIM_ABILITY, "OrangeListener"), jpu.a("__mega_context__", v3i.f(jpu.a("instanceID", bal.a(balVar))))), null, null, 24, null);
            return balVar;
        }

        public a() {
        }
    }

    static {
        t2o.a(1022361792);
    }

    public /* synthetic */ bal(a07 a07Var) {
        this();
    }

    public static final /* synthetic */ String a(bal balVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f096f", new Object[]{balVar});
        }
        return balVar.f16279a;
    }

    public bal() {
        this.f16279a = fzv.a();
    }
}
