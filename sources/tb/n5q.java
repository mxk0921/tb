package tb;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.constant.SmartLayerConstant$SmartErrorCode;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.constant.SmartLayerConstant$SmartLayerStage;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.templateprocess.SmartLayerDXTemplateProcessor;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.viewmodel.SmartLayerViewModel;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class n5q extends n6q {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public DXRootView n;
    public final ub5 o;
    public SmartLayerDXTemplateProcessor p;
    public final HashMap<String, Object> q = new HashMap<>();
    public final q5q m = new q5q();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements bvb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.bvb
        public void a(DXRootView dXRootView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c512be4", new Object[]{this, dXRootView});
            } else if (dXRootView == null) {
                p6q.e(SmartLayerConstant$SmartLayerStage.SMART_LOAD_CONTENT, n5q.this.f24542a, n6q.TAG, "onLayerCreated", "DXRootView创建失败", false);
                n5q n5qVar = n5q.this;
                SmartLayerConstant$SmartErrorCode smartLayerConstant$SmartErrorCode = SmartLayerConstant$SmartErrorCode.ERROR_CONTROLLER_RENDER_DX_ERROR;
                n5qVar.d(smartLayerConstant$SmartErrorCode.errorCode, smartLayerConstant$SmartErrorCode.errorMessage);
            } else {
                p6q.d(SmartLayerConstant$SmartLayerStage.SMART_LOAD_CONTENT, n5q.this.f24542a, n6q.TAG, "onLayerCreated-DXRootView创建成功");
                n5q n5qVar2 = n5q.this;
                n5qVar2.n = dXRootView;
                n5qVar2.n();
            }
        }
    }

    static {
        t2o.a(295699757);
    }

    public n5q(g6q g6qVar, l6q l6qVar, SmartLayerViewModel smartLayerViewModel, brd brdVar) {
        super(g6qVar, l6qVar, smartLayerViewModel, brdVar);
        u6q u6qVar;
        if (l6qVar != null && (u6qVar = l6qVar.y) != null) {
            this.o = u6qVar.u();
        }
    }

    public static /* synthetic */ Object ipc$super(n5q n5qVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1863795066:
                super.w();
                return null;
            case -1430643477:
                super.v();
                return null;
            case -914273135:
                super.u();
                return null;
            case -791824069:
                super.x();
                return null;
            case 954953613:
                super.t();
                return null;
            case 1971471181:
                super.q();
                return null;
            case 1987381597:
                super.r();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/smartlayer/controller/SmartDXLayerController");
        }
    }

    public final void A(DXWidgetNode dXWidgetNode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce3169", new Object[]{this, dXWidgetNode, str});
        } else if (dXWidgetNode != null) {
            if (dXWidgetNode instanceof ird) {
                if (!(dXWidgetNode.getWRView() == null || dXWidgetNode.getWRView().get() == null || dXWidgetNode.getVisibility() != 0)) {
                    if (TextUtils.equals(str, "show")) {
                        ((ird) dXWidgetNode).d();
                    } else if (TextUtils.equals(str, "resume")) {
                        ((ird) dXWidgetNode).e();
                    } else if (TextUtils.equals(str, "pause")) {
                        ((ird) dXWidgetNode).b();
                    }
                }
                if (TextUtils.equals(str, "close")) {
                    ((ird) dXWidgetNode).f();
                }
            }
            if (!(dXWidgetNode.getChildren() == null || dXWidgetNode.getChildren().isEmpty())) {
                for (DXWidgetNode dXWidgetNode2 : dXWidgetNode.getChildren()) {
                    A(dXWidgetNode2, str);
                }
            }
        }
    }

    public final DXWidgetNode B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("42940c98", new Object[]{this});
        }
        DXRootView dXRootView = this.n;
        if (dXRootView == null) {
            return null;
        }
        return dXRootView.getExpandWidgetNode();
    }

    public void C(d5q d5qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("462546cd", new Object[]{this, d5qVar});
        } else if (d5qVar != null && !TextUtils.isEmpty(d5qVar.b())) {
            this.m.b(d5qVar.b(), d5qVar);
        }
    }

    public void D(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f601cd", new Object[]{this, obj});
            return;
        }
        if (obj instanceof JSONObject) {
            ll6.d(this.o, this.n, (JSONObject) obj, null);
        }
        DXRootView dXRootView = this.n;
        if (dXRootView != null && dXRootView.getExpandWidgetNode() != null && this.n.getExpandWidgetNode().getEngine() != null) {
            this.n.getExpandWidgetNode().getEngine().t0(this.n);
        }
    }

    public void E(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb61c50", new Object[]{this, str, str2, obj});
            return;
        }
        this.q.put(str + "_" + str2, obj);
    }

    public Object F(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("cd62261c", new Object[]{this, str, str2});
        }
        return this.q.get(str + "_" + str2);
    }

    @Override // tb.n6q
    public View i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.n;
    }

    @Override // tb.n6q
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7582434d", new Object[]{this});
            return;
        }
        super.q();
        SmartLayerDXTemplateProcessor smartLayerDXTemplateProcessor = this.p;
        if (smartLayerDXTemplateProcessor != null) {
            smartLayerDXTemplateProcessor.onUpdate();
        }
    }

    @Override // tb.n6q
    public void r() {
        g6q g6qVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7675095d", new Object[]{this});
            return;
        }
        super.r();
        if (this.o != null && this.b != null && (g6qVar = this.f24542a) != null && !TextUtils.isEmpty(g6qVar.g)) {
            ll6.c(this.o, this.b.a(), this.f24542a.g, new a());
        }
    }

    @Override // tb.n6q
    public void t() {
        ub5 ub5Var;
        super.t();
        DXRootView dXRootView = this.n;
        if (dXRootView != null && (ub5Var = this.o) != null) {
            dXRootView.setClickable(true);
            ub5Var.c(uc6.DX_EVENT_SMARTHANDLER, new uc6(this.m));
            ub5Var.d(wc6.DXSMARTLAYERCOUNTDOWNTEXTVIEW_SMARTLAYERCOUNTDOWNTEXTVIEW, new wc6());
            g6q g6qVar = this.f24542a;
            try {
                this.p = (SmartLayerDXTemplateProcessor) g6qVar.j.getConstructor(n5q.class).newInstance(this);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (this.p == null) {
                p6q.e(SmartLayerConstant$SmartLayerStage.SMART_LOAD_CONTENT, this.f24542a, n6q.TAG, "loadContent", "Plugin创建失败", false);
                SmartLayerConstant$SmartErrorCode smartLayerConstant$SmartErrorCode = SmartLayerConstant$SmartErrorCode.ERROR_CONTROLLER_RENDER_TEMPLATE_EMPTY;
                d(smartLayerConstant$SmartErrorCode.errorCode, smartLayerConstant$SmartErrorCode.errorMessage);
                return;
            }
            p6q.d(SmartLayerConstant$SmartLayerStage.SMART_LOAD_CONTENT, g6qVar, n6q.TAG, "loadContent-Plugin创建成功");
            this.p.onLoad();
        }
    }

    @Override // tb.n6q
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9814c91", new Object[]{this});
            return;
        }
        super.u();
        SmartLayerDXTemplateProcessor smartLayerDXTemplateProcessor = this.p;
        if (smartLayerDXTemplateProcessor != null) {
            smartLayerDXTemplateProcessor.onLayerDidShow();
        }
        A(B(), "show");
    }

    @Override // tb.n6q
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaba1ceb", new Object[]{this});
            return;
        }
        super.v();
        A(B(), "pause");
    }

    @Override // tb.n6q
    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90e8be86", new Object[]{this});
            return;
        }
        super.w();
        A(B(), "resume");
    }

    @Override // tb.n6q
    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0cdb93b", new Object[]{this});
            return;
        }
        super.x();
        A(B(), "close");
    }
}
