package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder;
import com.alibaba.android.ultron.vfw.viewholder.UltronDXViewTypeManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.exception.DinamicException;
import com.taobao.android.dinamic.tempate.DTemplateManager;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xo7 extends mx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_FESTRUE_COMPONT = "componentRender";
    public static final String KEY_FESTRUE_VERSION = "1.0";
    public static final int TAG_COMPONENT = R.id.TAG_COMPONENT;
    public static final String TAG_DINAMICX_VIEW_COMPONENT = "DinamicXComponent";
    public static final String TAG_IS_ADJUST = "isAdjust";
    public static final String TAG_IS_PRERENDER = "isPreRender";

    /* renamed from: a  reason: collision with root package name */
    public final UltronDXViewTypeManager f31494a;
    public final ViewEngine b;
    public ViewGroup c;
    public Handler d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends DXRootView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DinamicXEngine f31495a;
        public final /* synthetic */ DXRootView b;

        public a(DinamicXEngine dinamicXEngine, DXRootView dXRootView) {
            this.f31495a = dinamicXEngine;
            this.b = dXRootView;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/viewholder/DinamicXViewHolderProvider$1");
        }

        @Override // com.taobao.android.dinamicx.DXRootView.a
        public void b(DXRootView dXRootView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c9730a3", new Object[]{this, dXRootView, new Integer(i)});
            } else if (i == 0) {
                xo7.f(xo7.this, this.f31495a, this.b);
            } else {
                xo7.e(xo7.this, this.f31495a, this.b);
            }
        }

        @Override // com.taobao.android.dinamicx.DXRootView.a
        public void d(DXRootView dXRootView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0378a16", new Object[]{this, dXRootView});
            } else {
                xo7.f(xo7.this, this.f31495a, this.b);
            }
        }

        @Override // com.taobao.android.dinamicx.DXRootView.a
        public void f(DXRootView dXRootView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ba36c13", new Object[]{this, dXRootView});
            } else {
                xo7.e(xo7.this, this.f31495a, this.b);
            }
        }

        @Override // com.taobao.android.dinamicx.DXRootView.a
        public void k(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            } else if (i == 0) {
                xo7.f(xo7.this, this.f31495a, this.b);
            } else {
                xo7.e(xo7.this, this.f31495a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                xo7.g(xo7.this).z0(127);
            }
        }
    }

    static {
        t2o.a(157286750);
    }

    public xo7(ViewEngine viewEngine) {
        this(viewEngine, false);
    }

    public static /* synthetic */ void e(xo7 xo7Var, DinamicXEngine dinamicXEngine, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19242b71", new Object[]{xo7Var, dinamicXEngine, dXRootView});
        } else {
            xo7Var.q(dinamicXEngine, dXRootView);
        }
    }

    public static /* synthetic */ void f(xo7 xo7Var, DinamicXEngine dinamicXEngine, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42fad772", new Object[]{xo7Var, dinamicXEngine, dXRootView});
        } else {
            xo7Var.p(dinamicXEngine, dXRootView);
        }
    }

    public static /* synthetic */ ViewEngine g(xo7 xo7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewEngine) ipChange.ipc$dispatch("8193344f", new Object[]{xo7Var});
        }
        return xo7Var.b;
    }

    public static /* synthetic */ Object ipc$super(xo7 xo7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/viewholder/DinamicXViewHolderProvider");
    }

    @Override // tb.aae
    public RecyclerViewHolder a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewHolder) ipChange.ipc$dispatch("af72af69", new Object[]{this, viewGroup, new Integer(i)});
        }
        this.c = viewGroup;
        RecyclerViewHolder h = h(viewGroup, this.f31494a.e(i), this.f31494a.d(i));
        h.j0(viewGroup);
        return h;
    }

    @Override // tb.aae
    public int b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d26c6ff8", new Object[]{this, iDMComponent})).intValue();
        }
        return this.f31494a.f(iDMComponent);
    }

    @Override // tb.mx
    public void d(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c79316", new Object[]{this, iDMComponent});
        } else if (iDMComponent != null && iDMComponent.getContainerInfo() != null && iDMComponent.getData() != null) {
            JSONObject data = iDMComponent.getData();
            if (!data.getBooleanValue("isPreRender")) {
                data.put("isPreRender", (Object) Boolean.TRUE);
                DXTemplateItem i = ((wo7) ((ujt) this.b.a0(ujt.class)).b(iDMComponent.getContainerType())).i(iDMComponent.getContainerInfo().getString("name"));
                s b2 = this.b.Q().b();
                b2.q(this.b.K(), data, i);
                b2.p(this.b.K(), i, data, -1, null);
            }
        }
    }

    @Override // tb.aae
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.f31494a.c();
        obv.l();
    }

    public DXTemplateItem j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("d69104ac", new Object[]{this, new Integer(i)});
        }
        return this.f31494a.e(i);
    }

    public final void k(String str, String str2, String str3, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5b7dcdc", new Object[]{this, str, str2, str3, fVar});
            return;
        }
        svk X = this.b.X();
        if (X != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("componentName", str);
            if (fVar != null) {
                hashMap.put("dxError", fVar);
            }
            X.a(new UltronError(this.b.I(), str2, str3, "render", hashMap));
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b02649a", new Object[]{this});
            return;
        }
        try {
            this.b.Q().f(k06.a("handleDinamicXEvent"), new lo7());
            this.b.Q().f(k06.a(yo7.DISPATCHER_TAG), new yo7());
            this.b.Q().f(mo7.HANDLE_DINAMICX_EVENT_ONCE, new mo7());
            this.b.Q().g("handleDinamicXEvent", new ko7());
        } catch (DinamicException unused) {
        }
    }

    public final void m(DinamicXEngine dinamicXEngine, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94b653a0", new Object[]{this, dinamicXEngine, dXRootView});
        } else if (dXRootView != null && dinamicXEngine != null) {
            dinamicXEngine.U0(dXRootView, new a(dinamicXEngine, dXRootView));
        }
    }

    public final void n(IDMComponent iDMComponent, DXRootView dXRootView) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d342cf8", new Object[]{this, iDMComponent, dXRootView});
        } else if (n7v.b(this.b.K()) && w60.f30480a) {
            dXRootView.setImportantForAccessibility(1);
            if (TextUtils.isEmpty(iDMComponent.getTag())) {
                str = iDMComponent.getId();
            } else {
                str = iDMComponent.getKey();
            }
            dXRootView.setContentDescription(str);
        }
    }

    public final void o(List<IDMComponent> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("813c16bf", new Object[]{this, list, new Boolean(z)});
        } else if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).getExtMap().put(i0c.KEY_DOWNGRADE_STATE, Boolean.valueOf(z));
            }
        }
    }

    public final void p(DinamicXEngine dinamicXEngine, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79960753", new Object[]{this, dinamicXEngine, dXRootView});
        } else if (dinamicXEngine != null) {
            dinamicXEngine.t0(dXRootView);
        }
    }

    public final void q(DinamicXEngine dinamicXEngine, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10a71537", new Object[]{this, dinamicXEngine, dXRootView});
        } else if (dinamicXEngine != null) {
            dinamicXEngine.u0(dXRootView);
        }
    }

    public xo7(ViewEngine viewEngine, boolean z) {
        this.d = null;
        this.b = viewEngine;
        this.f31494a = new UltronDXViewTypeManager(viewEngine, z);
        DTemplateManager.t(viewEngine.W()).r(DTemplateManager.CacheStrategy.STRATEGY_DEFAULT);
        l();
    }

    public final RecyclerViewHolder h(ViewGroup viewGroup, DXTemplateItem dXTemplateItem, List<IDMComponent> list) {
        DXResult<DXRootView> dXResult;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewHolder) ipChange.ipc$dispatch("80addef", new Object[]{this, viewGroup, dXTemplateItem, list});
        }
        s b2 = this.b.Q().b();
        String I = this.b.I();
        DXRootView dXRootView = null;
        if (dXTemplateItem != null) {
            try {
                boolean a2 = vav.a(I, "enableDXPreCreateView", false);
                boolean m = b2.m(dXTemplateItem);
                if (this.b.Y() != null) {
                    dXResult = this.b.Y().k(dXTemplateItem);
                    if (dXResult == null) {
                        if (!a2) {
                            if (this.b.o0()) {
                            }
                            dXResult = b2.g(viewGroup.getContext(), viewGroup, dXTemplateItem);
                        }
                        if (m) {
                            dXResult = b2.o(viewGroup.getContext(), dXTemplateItem);
                        }
                        dXResult = b2.g(viewGroup.getContext(), viewGroup, dXTemplateItem);
                    }
                } else if ((a2 || this.b.o0()) && m) {
                    dXResult = b2.o(viewGroup.getContext(), dXTemplateItem);
                } else {
                    dXResult = b2.g(viewGroup.getContext(), viewGroup, dXTemplateItem);
                }
                if (!dXResult.d()) {
                    dXRootView = dXResult.f7291a;
                    if (yv6.b(this.b.K()) && dXRootView != null && this.b.U() == 1001) {
                        dXRootView = bn6.a(dXRootView, dXTemplateItem);
                    }
                    if (vav.a(I, sh4.KEY_COMPONENT_LIFECYCLE, true)) {
                        m(b2.k(), dXResult.f7291a);
                    }
                } else {
                    if (!i(dXTemplateItem)) {
                        o(list, true);
                    }
                    hav.g("DinamicXViewHolderProvider", "模板create错误,模板： ", dXTemplateItem.f7343a + "\n", nn7.a(dXResult.a()));
                }
            } catch (Exception e) {
                o(list, true);
                hav.g(I, "createViewHolderInternal exception:", e.getMessage());
            }
        }
        if (dXRootView != null) {
            return new RecyclerViewHolder(dXRootView);
        }
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(mgw.a(viewGroup.getContext()));
        recyclerViewHolder.h0(true);
        StringBuilder sb = new StringBuilder("降级显示高度为0的占位View|");
        if (dXTemplateItem == null) {
            str = "";
        } else {
            str = dXTemplateItem.f7343a;
        }
        sb.append(str);
        hav.g(I, "DinamicXViewHolderProvider", sb.toString());
        return recyclerViewHolder;
    }

    public final boolean i(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c08e9e90", new Object[]{this, dXTemplateItem})).booleanValue();
        }
        if (!sh4.c(this.b.K()) || bn6.c(dXTemplateItem) || dXTemplateItem.b == -1 || dXTemplateItem.f) {
            return false;
        }
        String I = this.b.I();
        hav.b(I, "DinamicXViewHolderProvider", "模板渲染异常，降级到内置：" + dXTemplateItem.f7343a + "_" + dXTemplateItem.b);
        DTemplateManager t = DTemplateManager.t(this.b.W());
        if (t == null) {
            return false;
        }
        s b2 = this.b.Q().b();
        DXTemplateItem z = b2.z(t.j(b2.y(dXTemplateItem)));
        ((wo7) ((ujt) this.b.a0(ujt.class)).b("dinamicx")).j().put(z.f7343a, z);
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        } else {
            this.d = new Handler(Looper.getMainLooper());
        }
        this.d.post(new b());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x014a A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:11:0x003a, B:13:0x004a, B:18:0x005e, B:20:0x0085, B:22:0x00ca, B:24:0x00d0, B:26:0x00d8, B:28:0x00e0, B:30:0x00ec, B:31:0x00f2, B:33:0x00fa, B:35:0x0103, B:37:0x010b, B:38:0x0111, B:40:0x0119, B:42:0x0127, B:44:0x012f, B:48:0x013e, B:50:0x014a, B:52:0x017c, B:53:0x0191, B:55:0x0199, B:57:0x019f, B:59:0x01ba, B:61:0x01c1, B:62:0x01e1), top: B:65:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017c A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:11:0x003a, B:13:0x004a, B:18:0x005e, B:20:0x0085, B:22:0x00ca, B:24:0x00d0, B:26:0x00d8, B:28:0x00e0, B:30:0x00ec, B:31:0x00f2, B:33:0x00fa, B:35:0x0103, B:37:0x010b, B:38:0x0111, B:40:0x0119, B:42:0x0127, B:44:0x012f, B:48:0x013e, B:50:0x014a, B:52:0x017c, B:53:0x0191, B:55:0x0199, B:57:0x019f, B:59:0x01ba, B:61:0x01c1, B:62:0x01e1), top: B:65:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ba A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:11:0x003a, B:13:0x004a, B:18:0x005e, B:20:0x0085, B:22:0x00ca, B:24:0x00d0, B:26:0x00d8, B:28:0x00e0, B:30:0x00ec, B:31:0x00f2, B:33:0x00fa, B:35:0x0103, B:37:0x010b, B:38:0x0111, B:40:0x0119, B:42:0x0127, B:44:0x012f, B:48:0x013e, B:50:0x014a, B:52:0x017c, B:53:0x0191, B:55:0x0199, B:57:0x019f, B:59:0x01ba, B:61:0x01c1, B:62:0x01e1), top: B:65:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bf  */
    @Override // tb.aae
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder r20, com.taobao.android.ultron.common.model.IDMComponent r21) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xo7.c(com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder, com.taobao.android.ultron.common.model.IDMComponent):void");
    }
}
