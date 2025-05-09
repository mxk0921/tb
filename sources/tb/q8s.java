package tb;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.TMSBackPressedType;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.adapter.ICrashCatchAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import java.util.HashMap;
import java.util.Map;
import tb.bbs;
import tb.swd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class q8s extends t9s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile boolean h;
    public final String i;
    public final String j;
    public final JSONObject k;
    public final a l;
    public final t91 m;
    public final swd.b n;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public final class a implements ICrashCatchAdapter.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q8s f26583a;

        static {
            t2o.a(835715080);
            t2o.a(839909464);
        }

        public a(q8s q8sVar) {
            ckf.g(q8sVar, "this$0");
            this.f26583a = q8sVar;
        }

        @Override // com.taobao.themis.kernel.adapter.ICrashCatchAdapter.a
        public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
            }
            return q8s.p(this.f26583a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements swd.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.swd.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0e0a5a", new Object[]{this});
            } else if (!q8s.s(q8s.this) && !q8s.q(q8s.this)) {
                q8s.r(q8s.this).finish();
            }
        }
    }

    static {
        t2o.a(835715079);
    }

    public /* synthetic */ q8s(FragmentActivity fragmentActivity, ViewGroup viewGroup, int i, a07 a07Var) {
        this(fragmentActivity, (i & 2) != 0 ? null : viewGroup);
    }

    public static /* synthetic */ Object ipc$super(q8s q8sVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.k();
            return null;
        } else if (hashCode == 845371363) {
            return super.b((String) objArr[0], (JSONObject) objArr[1]);
        } else {
            if (hashCode == 1678850145) {
                super.a((TMSSolutionType) objArr[0], (bbs.d) objArr[1]);
                return null;
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/themis/container/app/TMSAppContainerHelper");
        }
    }

    public static final /* synthetic */ Map p(q8s q8sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("71a2c774", new Object[]{q8sVar});
        }
        return q8sVar.u();
    }

    public static final /* synthetic */ boolean q(q8s q8sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dbe91d4", new Object[]{q8sVar})).booleanValue();
        }
        return q8sVar.d();
    }

    public static final /* synthetic */ Activity r(q8s q8sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("fe7252ea", new Object[]{q8sVar});
        }
        return q8sVar.e();
    }

    public static final /* synthetic */ boolean s(q8s q8sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6b26183", new Object[]{q8sVar})).booleanValue();
        }
        return q8sVar.h;
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        bbs f = f();
        if (f != null) {
            f.q0();
        }
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        bbs f = f();
        if (f != null) {
            f.y0();
        }
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        bbs f = f();
        if (f != null) {
            f.B0();
        }
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb73d840", new Object[]{this});
            return;
        }
        ICrashCatchAdapter iCrashCatchAdapter = (ICrashCatchAdapter) p8s.b(ICrashCatchAdapter.class);
        if (iCrashCatchAdapter != null) {
            t();
            try {
                String str = this.j;
                String jSONString = new JSONObject(this.k).toJSONString();
                ckf.f(jSONString, "JSONObject(mCrashInfoData).toJSONString()");
                iCrashCatchAdapter.addHeaderInfo(str, jSONString);
                iCrashCatchAdapter.addJavaCrashListener(this.l);
            } catch (Throwable th) {
                TMSLogger.d(this.i, th);
            }
        }
    }

    @Override // tb.t9s, tb.mqb
    public void a(TMSSolutionType tMSSolutionType, bbs.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64113861", new Object[]{this, tMSSolutionType, dVar});
            return;
        }
        super.a(tMSSolutionType, dVar);
        D();
        if (o9s.h(e())) {
            Toast.makeText(e(), "Themis 容器", 1).show();
        }
        e().overridePendingTransition(R.anim.tms_fragment_translate_in_left, R.anim.tms_fragment_translate_out_left);
    }

    @Override // tb.t9s, tb.mqb
    public bbs b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("326357e3", new Object[]{this, str, jSONObject});
        }
        ckf.g(str, "url");
        bbs b2 = super.b(str, jSONObject);
        b2.k0(new vds());
        b2.k0(new x4b(b2));
        b2.k0(this.m);
        return b2;
    }

    @Override // tb.mqb
    public TMSContainerType getContainerType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSContainerType) ipChange.ipc$dispatch("71d656c0", new Object[]{this});
        }
        return TMSContainerType.GENERIC;
    }

    @Override // tb.t9s
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.h = true;
        super.k();
        bbs f = f();
        if (f != null) {
            f.destroy();
        }
        v();
        ICrashCatchAdapter iCrashCatchAdapter = (ICrashCatchAdapter) p8s.b(ICrashCatchAdapter.class);
        if (iCrashCatchAdapter != null) {
            iCrashCatchAdapter.removeJavaCrashListener(this.l);
        }
    }

    public final void t() {
        TMSSolutionType a0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10bedf2e", new Object[]{this});
            return;
        }
        bbs f = f();
        String str = null;
        String L = f == null ? null : f.L();
        bbs f2 = f();
        String e0 = f2 == null ? null : f2.e0();
        bbs f3 = f();
        if (!(f3 == null || (a0 = f3.a0()) == null)) {
            str = a0.name();
        }
        if (!(L == null || L.length() == 0)) {
            this.k.put((JSONObject) "appId", L);
        }
        if (!(e0 == null || e0.length() == 0)) {
            this.k.put((JSONObject) "url", e0);
        }
        if (str != null && str.length() != 0) {
            this.k.put((JSONObject) "solutionType", str);
        }
    }

    public final Map<String, Object> u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("287d8d41", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(this.j, this.k);
        return hashMap;
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("604e8c79", new Object[]{this});
        } else {
            this.k.clear();
        }
    }

    public swd.b w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (swd.b) ipChange.ipc$dispatch("4542dcdc", new Object[]{this});
        }
        return this.n;
    }

    public void x(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        ckf.g(configuration, "newConfig");
        this.m.b(configuration.screenWidthDp, configuration.screenHeightDp);
    }

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

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        bbs f = f();
        if (f != null) {
            f.j0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8s(FragmentActivity fragmentActivity, ViewGroup viewGroup) {
        super(fragmentActivity, viewGroup);
        ckf.g(fragmentActivity, "activity");
        this.i = "TMSAppContainerHelper";
        this.j = "commonDatas";
        this.k = new JSONObject();
        this.l = new a(this);
        this.m = new t91();
        this.n = new b();
    }
}
