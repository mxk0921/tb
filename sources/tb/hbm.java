package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.BlockModel;
import com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import tb.oe8;
import tb.yam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class hbm extends ubm<BlockModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<ubm> e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements yam.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f20532a;
        public final /* synthetic */ int b;
        public final /* synthetic */ oe8.b c;

        public a(AtomicInteger atomicInteger, int i, oe8.b bVar) {
            this.f20532a = atomicInteger;
            this.b = i;
            this.c = bVar;
        }

        @Override // tb.yam.f
        public void onAnimationEnd() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c281bbd", new Object[]{this});
                return;
            }
            wdm.d("Block.onPreClose.onAnimationEnd.id=" + ((BlockModel) hbm.this.b).id, new Object[0]);
            this.f20532a.getAndIncrement();
            if (this.f20532a.get() == this.b + 1) {
                wdm.d("Block.onPreClose.onAnimationEnd.全部执行结束.id=" + ((BlockModel) hbm.this.b).id, new Object[0]);
                oe8.b bVar = this.c;
                if (bVar != null) {
                    bVar.a(false);
                }
            }
        }
    }

    static {
        t2o.a(790626470);
        t2o.a(790626432);
    }

    public hbm(oe8 oe8Var, BlockModel blockModel, boolean z) {
        super(oe8Var, blockModel, z);
    }

    public static /* synthetic */ Object ipc$super(hbm hbmVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -454357687:
                super.o();
                return null;
            case -47387106:
                super.p();
                return null;
            case 606088165:
                super.t();
                return null;
            case 1137978274:
                return new Boolean(super.n((String) objArr[0], (String) objArr[1]));
            case 1559873744:
                super.r();
                return null;
            case 1777273033:
                super.s((String) objArr[0], (JSONObject) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/nativerender/render/component/PopBlockComponent");
        }
    }

    public final /* synthetic */ void D(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ea7f664", new Object[]{this, view});
            return;
        }
        yam f = this.f29277a.f();
        oe8 oe8Var = this.f29277a;
        ComponentBaseModel componentBaseModel = this.b;
        f.e(oe8Var, "click", ((BlockModel) componentBaseModel).animation, this.c, componentBaseModel, new yam.f() { // from class: tb.fbm
            @Override // tb.yam.f
            public final void onAnimationEnd() {
                hbm.this.F();
            }
        });
    }

    public final /* synthetic */ void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7113c7e7", new Object[]{this});
            return;
        }
        oe8 oe8Var = this.f29277a;
        ComponentBaseModel componentBaseModel = this.b;
        oe8Var.l(componentBaseModel, "click", ((BlockModel) componentBaseModel).action, ((BlockModel) componentBaseModel).actions);
    }

    public final /* synthetic */ void G(ubm ubmVar, AtomicInteger atomicInteger, int i, oe8.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("646bdf5d", new Object[]{this, ubmVar, atomicInteger, new Integer(i), bVar, new Boolean(z)});
            return;
        }
        wdm.d("Block.onPreClose.onAnimationEnd.子元素执行结束.id=" + ((BlockModel) this.b).id + ".childComponent=" + ubmVar.d().id, new Object[0]);
        atomicInteger.getAndIncrement();
        if (atomicInteger.get() == i + 1) {
            wdm.d("Block.onPreClose.onAnimationEnd.全部执行结束.id=" + ((BlockModel) this.b).id + ".childComponent=" + ubmVar.d().id, new Object[0]);
            if (bVar != null) {
                bVar.a(false);
            }
        }
    }

    @Override // tb.ubm
    public StyleModel f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StyleModel) ipChange.ipc$dispatch("14e3d48a", new Object[]{this});
        }
        T t = this.b;
        if (t != 0) {
            return ((BlockModel) t).style;
        }
        return null;
    }

    @Override // tb.ubm
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aec0f63", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.e).iterator();
        while (it.hasNext()) {
            ubm ubmVar = (ubm) it.next();
            if (ubmVar != null) {
                ubmVar.l();
            }
        }
    }

    @Override // tb.ubm
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a0dbf0", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.e).iterator();
        while (it.hasNext()) {
            ubm ubmVar = (ubm) it.next();
            if (ubmVar != null) {
                ubmVar.m();
            }
        }
    }

    @Override // tb.ubm
    public boolean n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43d42ba2", new Object[]{this, str, str2})).booleanValue();
        }
        boolean n = super.n(str, str2);
        if (!n) {
            Iterator it = ((ArrayList) this.e).iterator();
            while (it.hasNext()) {
                ubm ubmVar = (ubm) it.next();
                if (ubmVar != null && ubmVar.n(str, str2)) {
                    return true;
                }
            }
        }
        return n;
    }

    @Override // tb.ubm
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4eb0d49", new Object[]{this});
            return;
        }
        super.o();
        Iterator it = ((ArrayList) this.e).iterator();
        while (it.hasNext()) {
            ubm ubmVar = (ubm) it.next();
            if (ubmVar != null) {
                ubmVar.o();
            }
        }
    }

    @Override // tb.ubm
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd2cee1e", new Object[]{this});
            return;
        }
        super.p();
        Iterator it = ((ArrayList) this.e).iterator();
        while (it.hasNext()) {
            ubm ubmVar = (ubm) it.next();
            if (ubmVar != null) {
                ubmVar.p();
            }
        }
    }

    @Override // tb.ubm
    public void q(final oe8.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d9ccc3", new Object[]{this, bVar});
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger();
        final int size = ((ArrayList) this.e).size();
        yam f = this.f29277a.f();
        oe8 oe8Var = this.f29277a;
        ComponentBaseModel componentBaseModel = this.b;
        f.e(oe8Var, "close", ((BlockModel) componentBaseModel).animation, this.c, componentBaseModel, new a(atomicInteger, size, bVar));
        Iterator it = ((ArrayList) this.e).iterator();
        while (it.hasNext()) {
            final ubm ubmVar = (ubm) it.next();
            if (ubmVar != null) {
                ubmVar.q(new oe8.b() { // from class: tb.gbm
                    @Override // tb.oe8.b
                    public final void a(boolean z) {
                        hbm.this.G(ubmVar, atomicInteger, size, bVar, z);
                    }
                });
            }
        }
    }

    @Override // tb.ubm
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf9c8d0", new Object[]{this});
            return;
        }
        super.r();
        Iterator it = ((ArrayList) this.e).iterator();
        while (it.hasNext()) {
            ubm ubmVar = (ubm) it.next();
            if (ubmVar != null) {
                ubmVar.r();
            }
        }
    }

    @Override // tb.ubm
    public void s(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ef08c9", new Object[]{this, str, jSONObject});
            return;
        }
        super.s(str, jSONObject);
        Iterator it = ((ArrayList) this.e).iterator();
        while (it.hasNext()) {
            ubm ubmVar = (ubm) it.next();
            if (ubmVar != null) {
                ubmVar.s(str, jSONObject);
            }
        }
    }

    @Override // tb.ubm
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24202be5", new Object[]{this});
            return;
        }
        super.t();
        Iterator it = ((ArrayList) this.e).iterator();
        while (it.hasNext()) {
            ubm ubmVar = (ubm) it.next();
            if (ubmVar != null) {
                ubmVar.t();
            }
        }
    }

    public static /* synthetic */ int C(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25b92b9f", new Object[]{jSONObject, jSONObject2})).intValue();
        }
        try {
            return jSONObject.getJSONObject("style").getIntValue(pg1.ATOM_EXT_zIndex) - jSONObject2.getJSONObject("style").getIntValue(pg1.ATOM_EXT_zIndex);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public final /* synthetic */ boolean E(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46ca3d92", new Object[]{this, view})).booleanValue();
        }
        oe8 oe8Var = this.f29277a;
        ComponentBaseModel componentBaseModel = this.b;
        oe8Var.l(componentBaseModel, "longClick", ((BlockModel) componentBaseModel).action, ((BlockModel) componentBaseModel).actions);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x016a, code lost:
        if ("end".equals(r14) != false) goto L_0x016c;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0176  */
    @Override // tb.ubm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View c(android.content.Context r18) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hbm.c(android.content.Context):android.view.View");
    }
}
