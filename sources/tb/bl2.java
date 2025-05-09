package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class bl2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final bl2 INSTANCE = new bl2();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements wio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16459a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Map<String, Object> c;

        public a(String str, String str2, Map<String, ? extends Object> map) {
            this.f16459a = str;
            this.b = str2;
            this.c = map;
        }

        @Override // tb.wio
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                bl2.INSTANCE.b(this.f16459a, this.b, this.c);
            }
        }
    }

    static {
        t2o.a(1007681592);
    }

    public static final xhv c(String str, Map map, kl2 kl2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("906d1250", new Object[]{str, map, kl2Var});
        }
        ckf.g(kl2Var, "$this$dispatchEvent");
        kl2Var.d(str);
        kl2Var.e(map);
        return xhv.INSTANCE;
    }

    public final void b(String str, final String str2, final Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5403dca", new Object[]{this, str, str2, map});
            return;
        }
        ckf.g(str, "eventName");
        ckf.g(str2, "bizId");
        cl2.Companion.a().k(str, new g1a() { // from class: tb.wk2
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv c;
                c = bl2.c(str2, map, (kl2) obj);
                return c;
            }
        });
    }

    public final void d(String str, String str2, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b506f08", new Object[]{this, str, str2, map});
            return;
        }
        ckf.g(str, "eventName");
        ckf.g(str2, "bizId");
        zqt.INSTANCE.h(new a(str, str2, map));
    }
}
