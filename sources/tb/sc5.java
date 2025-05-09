package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.android.dinamicx.widget.j;
import com.taobao.detail.rate.vivid.dinamicX.eve.DXExpandButtonExposedEvent;
import com.taobao.detail.rate.vivid.dinamicX.eve.DXTagExposedEvent;
import com.taobao.detail.rate.vivid.dinamicX.eve.DXTagFlowStateChangedEvent;
import com.taobao.detail.rate.vivid.dinamicX.eve.DXTagSelectedEvent;
import com.taobao.detail.rate.widget.delegate.tag.bean.AssociationTagItem;
import com.taobao.taobao.R;
import tb.xd1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class sc5 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DXASSOCIATIONTAGFLOWVIEW_ANIMATE = 4656115862998430694L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_ASSOCIATIONTAGFLOWVIEW = -1167862008781497118L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_ASSOCIATIONTAGS = -3754319763637144005L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_COLUMNSPACE = 4480603453068309125L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_DEFAULTLINES = 5349478053238594540L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_DEFAULTTAG = 4425075990734024203L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_DEFAULTTAGTITLE = 7701989587219965202L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_HASINIT = 4914428772296613975L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_ISDEFAULTEXPAND = 1631961235977827600L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_ONSELECTEDASSOCIATIONTAG = -4263166344026197065L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_ONSTATECHANGED = -5430795269136673642L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_ONSTATECHANGEDBUTTONEXPOSED = 8289054528279058935L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_ONTAGEXPOSED = -2773278840088588067L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_RADIUS = 10074193828068110L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_ROWSPACE = 6173498097132329804L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_SELECTEDSTYLE = 4438304712657119847L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_UNSELECTEDSTYLE = 66186082378481452L;

    /* renamed from: a  reason: collision with root package name */
    public JSONArray f27939a;
    public JSONObject d;
    public String e;
    public boolean f;
    public boolean i;
    public JSONObject j;
    public JSONObject k;
    public xd1 l;
    public xd1.g m;
    public xd1 n;
    public int b = 8;
    public int c = 2;
    public int g = 12;
    public int h = 12;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements xd1.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.xd1.f
        public void a(boolean z, int i, int i2, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91933eb5", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), str});
                return;
            }
            sc5.t(sc5.this).e = z;
            sc5.u(sc5.this, z);
            sc5.this.postEvent(new DXTagFlowStateChangedEvent(sc5.DXASSOCIATIONTAGFLOWVIEW_ONSTATECHANGED, z, i, i2, str));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c implements ouk<AssociationTagItem> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;

        public c(View view) {
            this.b = view;
        }

        /* renamed from: b */
        public void a(int i, AssociationTagItem associationTagItem) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("907514be", new Object[]{this, new Integer(i), associationTagItem});
                return;
            }
            sc5 sc5Var = sc5.this;
            String str = null;
            if (associationTagItem != null) {
                jSONObject = associationTagItem.associationTag;
            } else {
                jSONObject = null;
            }
            sc5Var.postEvent(new DXTagSelectedEvent(sc5.DXASSOCIATIONTAGFLOWVIEW_ONSELECTEDASSOCIATIONTAG, jSONObject));
            View view = this.b;
            int i2 = R.id.v_arrow;
            if (associationTagItem != null) {
                str = associationTagItem.title;
            }
            view.setTag(i2, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class d implements xd1.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;

        public d(View view) {
            this.b = view;
        }

        @Override // tb.xd1.f
        public void a(boolean z, int i, int i2, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91933eb5", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), str});
                return;
            }
            this.b.setTag(R.id.v_fold_view, Boolean.valueOf(z));
            sc5.t(sc5.this).e = z;
            sc5.u(sc5.this, z);
            sc5.this.postEvent(new DXTagFlowStateChangedEvent(sc5.DXASSOCIATIONTAGFLOWVIEW_ONSTATECHANGED, z, i, i2, str));
            sc5.this.setNeedLayout(new DXWidgetRefreshOption.a().d(true).c(1).g(true).a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class e implements prk<AssociationTagItem> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        /* renamed from: b */
        public void a(int i, AssociationTagItem associationTagItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f6247f7", new Object[]{this, new Integer(i), associationTagItem});
                return;
            }
            ckf.g(associationTagItem, "t");
            sc5.this.postEvent(new DXTagExposedEvent(sc5.DXASSOCIATIONTAGFLOWVIEW_ONTAGEXPOSED, associationTagItem.associationTag));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class f implements xd1.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.xd1.h
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a997198c", new Object[]{this, new Boolean(z)});
            } else {
                sc5.this.postEvent(new DXExpandButtonExposedEvent(sc5.DXASSOCIATIONTAGFLOWVIEW_ONSTATECHANGEDBUTTONEXPOSED, z));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class g implements xd1.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;

        public g(View view) {
            this.b = view;
        }

        @Override // tb.xd1.f
        public void a(boolean z, int i, int i2, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91933eb5", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), str});
                return;
            }
            this.b.setTag(R.id.v_fold_view, Boolean.valueOf(z));
            sc5.t(sc5.this).e = z;
            sc5.u(sc5.this, z);
            sc5.this.postEvent(new DXTagFlowStateChangedEvent(sc5.DXASSOCIATIONTAGFLOWVIEW_ONSTATECHANGED, z, i, i2, str));
            sc5.this.setNeedLayout(new DXWidgetRefreshOption.a().d(true).c(1).g(true).a());
        }
    }

    public static /* synthetic */ Object ipc$super(sc5 sc5Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/dinamicX/view/DXAssociationTagFlowViewWidgetNode");
        }
    }

    public static final /* synthetic */ xd1.g t(sc5 sc5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xd1.g) ipChange.ipc$dispatch("a1c8cc94", new Object[]{sc5Var});
        }
        return sc5Var.w();
    }

    public static final /* synthetic */ void u(sc5 sc5Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bc0d19e", new Object[]{sc5Var, new Boolean(z)});
        } else {
            sc5Var.f = z;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new sc5();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXASSOCIATIONTAGFLOWVIEW_ANIMATE) {
            return 1;
        }
        if (j == DXASSOCIATIONTAGFLOWVIEW_DEFAULTLINES) {
            return 2;
        }
        if (j == DXASSOCIATIONTAGFLOWVIEW_ISDEFAULTEXPAND || j == DXASSOCIATIONTAGFLOWVIEW_HASINIT) {
            return 0;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        xd1 xd1Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
            return;
        }
        ckf.g(context, "context");
        ckf.g(view, "weakView");
        super.onBindEvent(context, view, j);
        if (j == DXASSOCIATIONTAGFLOWVIEW_ONSELECTEDASSOCIATIONTAG) {
            xd1 xd1Var2 = this.l;
            if (xd1Var2 != null) {
                xd1Var2.K(new c(view));
            }
        } else if (j == DXASSOCIATIONTAGFLOWVIEW_ONSTATECHANGED) {
            xd1 xd1Var3 = this.l;
            if (xd1Var3 != null) {
                xd1Var3.H(new d(view));
            }
        } else if (j == DXASSOCIATIONTAGFLOWVIEW_ONTAGEXPOSED) {
            xd1 xd1Var4 = this.l;
            if (xd1Var4 != null) {
                xd1Var4.J(new e());
            }
        } else if (j == DXASSOCIATIONTAGFLOWVIEW_ONSTATECHANGEDBUTTONEXPOSED && (xd1Var = this.l) != null) {
            xd1Var.L(new f());
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        ckf.g(dXWidgetNode, "widgetNode");
        if (dXWidgetNode instanceof sc5) {
            super.onClone(dXWidgetNode, z);
            if (this.m == null) {
                this.m = ((sc5) dXWidgetNode).m;
            }
            sc5 sc5Var = (sc5) dXWidgetNode;
            this.f27939a = sc5Var.f27939a;
            this.b = sc5Var.b;
            this.c = sc5Var.c;
            this.e = sc5Var.e;
            this.d = sc5Var.d;
            this.f = sc5Var.f;
            this.g = sc5Var.g;
            this.h = sc5Var.h;
            this.j = sc5Var.j;
            this.k = sc5Var.k;
            this.i = sc5Var.i;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        ckf.g(context, "context");
        ckf.g(view, "weakView");
        super.onRenderView(context, view);
        if (this.l == null) {
            Object tag = view.getTag(R.id.association_tag_content_view);
            if (tag instanceof xd1) {
                xd1 xd1Var = (xd1) tag;
                this.l = xd1Var;
                if (xd1Var != null) {
                    xd1Var.D(w());
                }
                xd1 xd1Var2 = this.l;
                if (xd1Var2 != null) {
                    xd1Var2.H(new g(view));
                }
            }
        }
        xd1 xd1Var3 = this.l;
        if (xd1Var3 != null) {
            xd1Var3.G();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j != DXASSOCIATIONTAGFLOWVIEW_ANIMATE) {
            if (j == DXASSOCIATIONTAGFLOWVIEW_COLUMNSPACE) {
                this.b = i;
            } else if (j == DXASSOCIATIONTAGFLOWVIEW_DEFAULTLINES) {
                this.c = i;
            } else if (j == DXASSOCIATIONTAGFLOWVIEW_ISDEFAULTEXPAND) {
                if (i == 0) {
                    z = false;
                }
                this.f = z;
            } else if (j == 10074193828068110L) {
                this.g = i;
            } else if (j == DXASSOCIATIONTAGFLOWVIEW_ROWSPACE) {
                this.h = i;
            } else if (j == DXASSOCIATIONTAGFLOWVIEW_HASINIT) {
                if (i == 0) {
                    z = false;
                }
                this.i = z;
            } else {
                super.onSetIntAttribute(j, i);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
            return;
        }
        ckf.g(jSONArray, "attr");
        if (j == DXASSOCIATIONTAGFLOWVIEW_ASSOCIATIONTAGS) {
            this.f27939a = jSONArray;
        } else {
            super.onSetListAttribute(j, jSONArray);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
            return;
        }
        ckf.g(jSONObject, "attr");
        if (j == DXASSOCIATIONTAGFLOWVIEW_DEFAULTTAG) {
            this.d = jSONObject;
        } else if (j == DXASSOCIATIONTAGFLOWVIEW_SELECTEDSTYLE) {
            this.j = jSONObject;
        } else if (j == DXASSOCIATIONTAGFLOWVIEW_UNSELECTEDSTYLE) {
            this.k = jSONObject;
        } else {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
            return;
        }
        ckf.g(str, "attr");
        if (j == DXASSOCIATIONTAGFLOWVIEW_DEFAULTTAGTITLE) {
            this.e = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public final xd1.g w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xd1.g) ipChange.ipc$dispatch("383bc2d0", new Object[]{this});
        }
        if (this.m == null) {
            this.m = y();
        }
        xd1.g gVar = this.m;
        if (gVar != null) {
            gVar.f31315a = this.f27939a;
            gVar.d = this.e;
            gVar.e = this.f;
            gVar.j = this.d;
            return gVar;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.detail.rate.widget.delegate.tag.AssociationTagFlowUIDelegate.InitParams");
    }

    public final void x(xd1 xd1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("822704c2", new Object[]{this, xd1Var});
            return;
        }
        xd1Var.G();
        u38 u38Var = u38.INSTANCE;
        q26 a2 = u38Var.a(getLayoutWidth(), getLayoutHeight(), getWeight(), getLayoutGravity(), getDirection());
        View u = xd1Var.u();
        if (u != null) {
            ViewGroup viewGroup = (ViewGroup) u;
            DXWidgetNode parentWidget = getParentWidget();
            if (parentWidget != null) {
                u38Var.e(viewGroup, (j) parentWidget, a2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.dinamicx.widget.DXLayout");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public final xd1.g y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xd1.g) ipChange.ipc$dispatch("d3b2da26", new Object[]{this});
        }
        xd1.g gVar = new xd1.g();
        gVar.f31315a = this.f27939a;
        i6v i6vVar = i6v.INSTANCE;
        gVar.b = iai.d(i6vVar.a(i6vVar.g(this.b)));
        gVar.c = this.c;
        gVar.d = this.e;
        gVar.j = this.d;
        gVar.f = iai.d(i6vVar.a(i6vVar.g(this.g)));
        gVar.g = iai.d(i6vVar.a(i6vVar.g(this.h)));
        gVar.h = this.j;
        gVar.i = this.k;
        gVar.e = this.f;
        return gVar;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        ckf.g(context, "context");
        this.m = w();
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        DinamicXEngine r = dXRuntimeContext != null ? dXRuntimeContext.r() : null;
        xd1.g gVar = this.m;
        ckf.d(gVar);
        xd1 xd1Var = new xd1(context, r, gVar, false);
        this.l = xd1Var;
        xd1Var.u().setTag(R.id.association_tag_content_view, this.l);
        xd1 xd1Var2 = this.l;
        ckf.d(xd1Var2);
        View u = xd1Var2.u();
        ckf.f(u, "mUIDelegate!!.contentView");
        return u;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        xd1 v = v();
        v.D(w());
        x(v);
        View u = v.u();
        if (u != null) {
            FrameLayout frameLayout = (FrameLayout) u;
            frameLayout.measure(i, ViewGroup.getChildMeasureSpec(i2, 0, frameLayout.getLayoutParams().height));
            setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec(frameLayout.getMeasuredHeight(), 1073741824));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    public final xd1 v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xd1) ipChange.ipc$dispatch("5db6a0ec", new Object[]{this});
        }
        if (this.n == null) {
            DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
            DinamicXEngine dinamicXEngine = null;
            Context h = dXRuntimeContext != null ? dXRuntimeContext.h() : null;
            DXRuntimeContext dXRuntimeContext2 = getDXRuntimeContext();
            if (dXRuntimeContext2 != null) {
                dinamicXEngine = dXRuntimeContext2.r();
            }
            xd1 xd1Var = new xd1(h, dinamicXEngine, w(), true);
            this.n = xd1Var;
            xd1Var.H(new b());
        }
        if (this.i) {
            xd1 xd1Var2 = this.n;
            if (xd1Var2 != null) {
                xd1Var2.I();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.detail.rate.widget.delegate.tag.AssociationTagFlowUIDelegate");
            }
        }
        xd1 xd1Var3 = this.n;
        if (xd1Var3 != null) {
            return xd1Var3;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.detail.rate.widget.delegate.tag.AssociationTagFlowUIDelegate");
    }
}
