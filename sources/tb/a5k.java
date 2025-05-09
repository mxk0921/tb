package tb;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.b;
import com.taobao.tao.flexbox.layoutmanager.core.e;
import com.taobao.tao.flexbox.layoutmanager.core.j;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.view.tabbar.PreloadDelegate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a5k extends Component<TNodeView, c> implements j, TNodeView.l, TNodeView.o {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public PreloadDelegate b;
    public TNodeView c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f15551a = false;
    public Map d = new HashMap();
    public final com.taobao.tao.flexbox.layoutmanager.core.b e = new a(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends b.b0<TNodeView, c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(a5k a5kVar) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/NodeComponent$1");
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("805570d3", new Object[]{this})).booleanValue();
            }
            return true;
        }

        /* renamed from: m */
        public void c(e eVar, TNodeView tNodeView, c cVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e8bbf67", new Object[]{this, eVar, tNodeView, cVar, fVar});
            } else if (tNodeView != null && cVar != null) {
                tNodeView.setErrorPage(cVar.y0);
            }
        }

        /* renamed from: n */
        public void j(n nVar, c cVar, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4ff9599", new Object[]{this, nVar, cVar, str, obj});
            } else if (TextUtils.equals(str, "error-page")) {
                cVar.y0 = nwv.I(obj, "");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements n.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n.h
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ec6a7c6a", new Object[]{this})).booleanValue();
            }
            if (!nwv.a0(a5k.h(a5k.this)) || !nwv.Z(a5k.i(a5k.this))) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c extends jfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean A0;
        public String w0;
        public HashMap x0;
        public String y0;
        public Map z0;

        static {
            t2o.a(503316773);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -998046064) {
                super.B((Context) objArr[0], (HashMap) objArr[1]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/NodeComponent$NodeParams");
        }

        @Override // tb.jfw
        public void B(Context context, HashMap hashMap) {
            HashMap q0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4830690", new Object[]{this, context, hashMap});
                return;
            }
            super.B(context, hashMap);
            this.w0 = nwv.B(hashMap.get("src"));
            this.x0 = new HashMap();
            String str = this.w0;
            if (!(str == null || (q0 = nwv.q0(Uri.parse(str))) == null)) {
                this.x0.putAll(q0);
            }
            Map z = nwv.z(hashMap.get("query"), null);
            if (z == null || z.isEmpty()) {
                z = nwv.z(hashMap.get("data"), null);
            }
            if (z != null) {
                this.x0.putAll(z);
            }
            this.z0 = nwv.z(hashMap.get("options"), null);
            this.A0 = nwv.o(hashMap.get("disabled-page-tracker"), false);
            nwv.B(hashMap.get("type"));
            nwv.B(hashMap.get("local-src"));
            nwv.B(hashMap.get("init-data-key"));
            this.y0 = nwv.I(hashMap.get("error-page"), "");
        }
    }

    static {
        t2o.a(503316770);
        t2o.a(503317092);
        t2o.a(503317196);
        t2o.a(503317200);
    }

    public static /* synthetic */ View h(a5k a5kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ed6d2c68", new Object[]{a5kVar});
        }
        return a5kVar.view;
    }

    public static /* synthetic */ View i(a5k a5kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5bf43da9", new Object[]{a5kVar});
        }
        return a5kVar.view;
    }

    public static /* synthetic */ Object ipc$super(a5k a5kVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1926757943:
                super.onLayoutComplete();
                return null;
            case -767938565:
                return super.getAttributeHandler((String) objArr[0]);
            case 1015965122:
                super.onLayoutChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Boolean) objArr[4]).booleanValue());
                return null;
            case 1052797818:
                super.detach(((Boolean) objArr[0]).booleanValue());
                return null;
            case 2043760425:
                super.onInitAttrs((e) objArr[0], (View) objArr[1], (jfw) objArr[2], (n.f) objArr[3]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/NodeComponent");
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        TNodeView tNodeView = this.c;
        if (tNodeView != null) {
            tNodeView.setViewLayoutCallback(null);
        }
        if (n() != null) {
            if (((c) this.viewParams).A0) {
                sendMessage(Component.MSG_FLAG_DISAPPEAR, n(), "onwilldisappear", null, null, null);
            } else {
                sendMessage(130, n(), "onpagedisappear", null, null, null);
            }
        }
        super.detach(z);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public com.taobao.tao.flexbox.layoutmanager.core.b getAttributeHandler(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.b) ipChange.ipc$dispatch("d23a2ffb", new Object[]{this, str});
        }
        if (TextUtils.equals(str, "error-page")) {
            return this.e;
        }
        return super.getAttributeHandler(str);
    }

    public n j(Class cls, n.e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("c4304561", new Object[]{this, cls, eVar, new Boolean(z)});
        }
        n n = n();
        if (n != null) {
            return n.z(cls, eVar, z);
        }
        return null;
    }

    public void k(Object obj, int i, List<n> list, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9874890a", new Object[]{this, obj, new Integer(i), list, new Boolean(z), new Boolean(z2)});
            return;
        }
        n n = n();
        if (n != null) {
            n.B(obj, i, list, z, z2);
        }
    }

    public void l(n.e eVar, List<n> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ff9bf77", new Object[]{this, eVar, list, new Integer(i)});
            return;
        }
        n n = n();
        if (n != null) {
            n.C(eVar, list, i);
        }
    }

    /* renamed from: m */
    public c generateViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("82eaa3ac", new Object[]{this});
        }
        return new c();
    }

    public n n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("59438703", new Object[]{this});
        }
        TNodeView tNodeView = this.c;
        if (tNodeView != null) {
            return tNodeView.getRootNode();
        }
        PreloadDelegate preloadDelegate = this.b;
        if (preloadDelegate != null) {
            return preloadDelegate.h();
        }
        return null;
    }

    /* renamed from: o */
    public TNodeView onCreateView(Context context) {
        Map map;
        rbi rbiVar;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeView) ipChange.ipc$dispatch("8fce11fe", new Object[]{this, context});
        }
        o P = this.node.P();
        c cVar = (c) this.viewParams;
        this.c = TNodeView.create(context, P, cVar.w0, cVar.x0, this);
        if (akt.v1() && (i = (rbiVar = this.measureResult).f27261a) > 0 && (i2 = rbiVar.b) > 0) {
            this.c.prelayout(i, i2);
        }
        Map a0 = this.node.a0();
        if (!(a0 == null || (map = this.d) == null)) {
            map.putAll(a0);
        }
        this.c.setPendingArgs(this.d);
        this.c.setViewLayoutCallback(this);
        return this.c;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleTNodeMessage(n nVar, n nVar2, String str, String str2, Map map, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abab8f80", new Object[]{this, nVar, nVar2, str, str2, map, hk8Var})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayoutChanged(int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8e65c2", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
            return;
        }
        super.onLayoutChanged(i, i2, i3, i4, z);
        tfs.f("Node onLayoutChanged, node:" + this.node + " oldW: " + i + " oldH:" + i2 + " newW:" + i3 + " newH:" + i4);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayoutComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2801c9", new Object[]{this});
            return;
        }
        super.onLayoutComplete();
        r();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.l
    public void onLayoutCompleted(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e800489", new Object[]{this, nVar});
            return;
        }
        nVar.v1(this);
        nVar.w1(7, new b());
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.l
    public void onLayoutError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("834776a6", new Object[]{this});
        }
    }

    /* renamed from: p */
    public void onInitAttrs(e eVar, TNodeView tNodeView, c cVar, n.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9933078c", new Object[]{this, eVar, tNodeView, cVar, fVar});
            return;
        }
        super.onInitAttrs(eVar, tNodeView, cVar, fVar);
        this.e.c(eVar, tNodeView, cVar, fVar);
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebc09c56", new Object[]{this});
        } else if ((this.node.N() instanceof Application) && akt.G1() && this.b == null) {
            Context N = this.node.N();
            o P = this.node.P();
            c cVar = (c) this.viewParams;
            PreloadDelegate preloadDelegate = new PreloadDelegate(N, P, cVar.w0, null, cVar.x0, false, 1, null);
            this.b = preloadDelegate;
            rbi rbiVar = this.measureResult;
            preloadDelegate.m(rbiVar.f27261a, rbiVar.b);
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9484ef5", new Object[]{this});
        } else if (n() != null && !this.f15551a) {
            this.f15551a = true;
            if (((c) this.viewParams).A0) {
                sendMessage(130, n(), "onwillappear", null, this.d, null);
            } else {
                sendMessage(130, n(), "onpageappear", null, this.d, null);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
        if (r3.equals("onpagemsg") == false) goto L_0x0029;
     */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onHandleMessage(com.taobao.tao.flexbox.layoutmanager.core.n.g r9) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.a5k.onHandleMessage(com.taobao.tao.flexbox.layoutmanager.core.n$g):boolean");
    }
}
