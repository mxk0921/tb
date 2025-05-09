package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tmgcashier.constant.TMGCashierRenderType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class s6s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TMGCashierRenderType f27829a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final s6s f27830a = new s6s();

        static {
            t2o.a(860880904);
        }

        public s6s a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (s6s) ipChange.ipc$dispatch("c4b91069", new Object[]{this});
            }
            return this.f27830a;
        }

        public void b(TMGCashierRenderType tMGCashierRenderType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c1466df", new Object[]{this, tMGCashierRenderType});
            } else {
                s6s.a(this.f27830a, tMGCashierRenderType);
            }
        }
    }

    static {
        t2o.a(860880902);
    }

    public static /* synthetic */ TMGCashierRenderType a(s6s s6sVar, TMGCashierRenderType tMGCashierRenderType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMGCashierRenderType) ipChange.ipc$dispatch("bc114c96", new Object[]{s6sVar, tMGCashierRenderType});
        }
        s6sVar.f27829a = tMGCashierRenderType;
        return tMGCashierRenderType;
    }

    public TMGCashierRenderType b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMGCashierRenderType) ipChange.ipc$dispatch("b12a7155", new Object[]{this});
        }
        return this.f27829a;
    }

    public s6s() {
        this.f27829a = TMGCashierRenderType.RENDER_TYPE_WEEX;
    }
}
