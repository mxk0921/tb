package tb;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.TMSBackPressedType;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.entity.InstanceStartParams;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.taobao.container.fragment.TMSTBHomeFragment;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bbs;
import tb.swd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class jas extends q8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final TMSTBHomeFragment o;
    public Integer p;
    public Integer q;
    public boolean r;
    public boolean s;
    public final AtomicBoolean t = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements swd.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.swd.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0e0a5a", new Object[]{this});
            } else if (!jas.H(jas.this) && !jas.E(jas.this) && jas.G(jas.this).compareAndSet(false, true)) {
                jas.F(jas.this).finish();
            }
        }
    }

    static {
        t2o.a(847249427);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jas(FragmentActivity fragmentActivity, TMSTBHomeFragment tMSTBHomeFragment, ViewGroup viewGroup) {
        super(fragmentActivity, viewGroup);
        ckf.g(fragmentActivity, "activity");
        ckf.g(tMSTBHomeFragment, "mFragment");
        ckf.g(viewGroup, "splashViewContainer");
        this.o = tMSTBHomeFragment;
    }

    public static final /* synthetic */ boolean E(jas jasVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1d9c2b0", new Object[]{jasVar})).booleanValue();
        }
        return jasVar.s;
    }

    public static final /* synthetic */ TMSTBHomeFragment F(jas jasVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSTBHomeFragment) ipChange.ipc$dispatch("16730a3e", new Object[]{jasVar});
        }
        return jasVar.o;
    }

    public static final /* synthetic */ AtomicBoolean G(jas jasVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("3c7b82ed", new Object[]{jasVar});
        }
        return jasVar.t;
    }

    public static final /* synthetic */ boolean H(jas jasVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("daced25b", new Object[]{jasVar})).booleanValue();
        }
        return jasVar.r;
    }

    public static /* synthetic */ Object ipc$super(jas jasVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.A();
                return null;
            case -1504501726:
                super.k();
                return null;
            case 845371363:
                return super.b((String) objArr[0], (JSONObject) objArr[1]);
            case 1678850145:
                super.a((TMSSolutionType) objArr[0], (bbs.d) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/taobao/container/fragment/TMSFragmentContainerHelper");
        }
    }

    @Override // tb.q8s
    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.A();
        this.r = false;
    }

    public final void I(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
        } else {
            this.r = true;
        }
    }

    @Override // tb.q8s, tb.t9s, tb.mqb
    public void a(TMSSolutionType tMSSolutionType, bbs.d dVar) {
        mgg S;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64113861", new Object[]{this, tMSSolutionType, dVar});
            return;
        }
        IpChange ipChange2 = rds.$ipChange;
        this.p = Integer.valueOf(e().getWindow().getDecorView().getSystemUiVisibility());
        this.q = Integer.valueOf(e().getRequestedOrientation());
        super.a(tMSSolutionType, dVar);
        bbs f = f();
        if (f != null && (S = f.S()) != null) {
            S.b("isTMSTBFragmentContainer");
        }
    }

    @Override // tb.q8s, tb.t9s, tb.mqb
    public bbs b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("326357e3", new Object[]{this, str, jSONObject});
        }
        ckf.g(str, "url");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put((JSONObject) InstanceStartParams.KEY_IS_FRAGMENT_CONTAINER, (String) Boolean.TRUE);
        return super.b(str, jSONObject);
    }

    @Override // tb.t9s
    public swd c(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (swd) ipChange.ipc$dispatch("c3bfb8ed", new Object[]{this, bbsVar});
        }
        ckf.g(bbsVar, "instance");
        return new las(bbsVar, this.o, w());
    }

    @Override // tb.q8s, tb.mqb
    public TMSContainerType getContainerType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSContainerType) ipChange.ipc$dispatch("71d656c0", new Object[]{this});
        }
        return TMSContainerType.GENERIC;
    }

    @Override // tb.q8s, tb.t9s
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        Integer num = this.p;
        if (num != null) {
            e().getWindow().getDecorView().setSystemUiVisibility(num.intValue());
        }
        Integer num2 = this.q;
        if (num2 != null) {
            e().setRequestedOrientation(num2.intValue());
        }
        super.k();
    }

    @Override // tb.q8s
    public swd.b w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (swd.b) ipChange.ipc$dispatch("4542dcdc", new Object[]{this});
        }
        return new a();
    }

    @Override // tb.q8s
    public boolean y(int i, KeyEvent keyEvent) {
        bbs f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 4 || (f = f()) == null) {
            return false;
        }
        return f.G(TMSBackPressedType.ON_KEY_DOWN);
    }

    @Override // tb.t9s
    public void l(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36503cc6", new Object[]{this, str, jSONObject});
            return;
        }
        ckf.g(str, "url");
        this.s = true;
        bbs f = f();
        if (f != null) {
            f.destroy();
        }
        this.s = false;
        b(str, jSONObject);
        a(h(), g());
    }
}
