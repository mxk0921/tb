package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.rib;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yfw extends du {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements rib.a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44908f9a", new Object[]{this});
                return;
            }
            yfw yfwVar = yfw.this;
            yfwVar.d.c(104, yfwVar.e);
        }
    }

    static {
        t2o.a(736100413);
    }

    public yfw(qh2 qh2Var, lh2 lh2Var, a29 a29Var, xiq xiqVar, rib.a aVar) {
        super(qh2Var, lh2Var, a29Var, xiqVar, aVar);
    }

    public static /* synthetic */ Object ipc$super(yfw yfwVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -130107111) {
            super.a(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 1875251023) {
            super.e(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/bootimage/arch/flow/state/lifestate/ViewShownState");
        }
    }

    @Override // tb.du, tb.lsd
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f83eb919", new Object[]{this, new Integer(i)});
            return;
        }
        super.a(i);
        this.f.r();
        tm1.a("2ARCH_ViewShownState", "notifyViewShown: ");
        ((kh2) this.f18066a).M(new a());
    }

    @Override // tb.du
    public void e(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fc60f4f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.e(i, i2);
        ei2 A = ((kh2) this.f18066a).A();
        if (A == null || A.e()) {
            tm1.a("2ARCH_ViewShownState", "handle baseView null: ");
        } else {
            this.b.h(((kh2) this.f18066a).A(), i2);
        }
    }

    @Override // tb.du
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47459e9", new Object[]{this});
            return;
        }
        tm1.a("2ARCH_ViewShownState", "onTimeOut: ");
        this.d.c(104, this.e);
    }

    @Override // tb.jsd
    public int getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return 102;
    }
}
