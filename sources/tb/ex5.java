package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.j;
import com.taobao.android.dinamicx.widget.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ex5 implements svb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DX_FLATTEN_PROPERTY_MASK_NODE_ANIMATION = 2;
    public static final int DX_FLATTEN_PROPERTY_MASK_NODE_ANIMATION_SYNC = 4;

    /* renamed from: a  reason: collision with root package name */
    public final DXWidgetNode f18863a;
    public List<ex5> b = new ArrayList();
    public ex5 c;
    public float d;
    public int e;
    public int f;
    public WeakReference<View> g;
    public int h;
    public int i;
    public v56 j;
    public a k;
    public int l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f18864a = -1;
        public int b = -1;

        static {
            t2o.a(444597298);
        }

        public a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("bb70d743", new Object[]{this});
            }
            a aVar = new a();
            aVar.f18864a = this.f18864a;
            aVar.b = this.b;
            return aVar;
        }
    }

    static {
        t2o.a(444597297);
        t2o.a(444597452);
    }

    public ex5(DXWidgetNode dXWidgetNode) {
        this.d = 1.0f;
        this.e = 1;
        this.f = -1;
        this.f18863a = dXWidgetNode;
        if (dXWidgetNode != null) {
            this.f = dXWidgetNode.getAccessibility();
            this.d = dXWidgetNode.getAlpha();
            this.e = dXWidgetNode.getEnabled();
        }
    }

    public WeakReference<View> A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("295b23cb", new Object[]{this});
        }
        return this.g;
    }

    public DXWidgetNode B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("ffcfabe0", new Object[]{this});
        }
        return this.f18863a;
    }

    public void C(ex5 ex5Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78faa884", new Object[]{this, ex5Var, new Integer(i)});
        } else if (ex5Var != null && ex5Var != this && i <= j()) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            this.b.add(i, ex5Var);
            ex5Var.c = this;
            DXWidgetNode B = ex5Var.B();
            if (B().getDXRuntimeContext() != null) {
                B.setDXRuntimeContext(B().getDXRuntimeContext().b(B));
            }
        }
    }

    public final boolean D(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60477718", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        if ((dXWidgetNode instanceof DXAbsContainerBaseLayout) || (dXWidgetNode instanceof o)) {
            return true;
        }
        return false;
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fe472f5", new Object[]{this})).booleanValue();
        }
        return this.f18863a.isV4Node();
    }

    public DXWidgetNode F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("ea34f2f7", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equals(y())) {
            return B();
        }
        if (B() != null && D(B())) {
            return B().queryWTByUserId(str);
        }
        List<ex5> list = this.b;
        if (list != null) {
            for (ex5 ex5Var : list) {
                DXWidgetNode F = ex5Var.F(str);
                if (F != null) {
                    return F;
                }
            }
        }
        return null;
    }

    public DXWidgetNode G(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("45e63272", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equals(y())) {
            return B();
        }
        if (B() != null && D(B())) {
            return B().queryWTByUserId(str);
        }
        List<ex5> list = this.b;
        if (list != null) {
            for (ex5 ex5Var : list) {
                DXWidgetNode F = ex5Var.F(str);
                if (F != null) {
                    return F;
                }
            }
        }
        return null;
    }

    public void H(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e4b3bb4", new Object[]{this, new Integer(i)});
            return;
        }
        int j = j();
        if (!(this.b == null || j == 0)) {
            for (int i2 = 0; i2 < j; i2++) {
                if (this.b.get(i2).g() == i) {
                    this.b.remove(i2);
                    return;
                }
            }
        }
    }

    public void I(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab6ae708", new Object[]{this, view});
        } else if (!E()) {
            if (view.getAlpha() != f()) {
                view.setAlpha(f());
            }
            if (w() != view.getTranslationX()) {
                view.setTranslationX(w());
            }
            if (x() != view.getTranslationY()) {
                view.setTranslationY(x());
            }
            if (o() != view.getRotationX()) {
                view.setRotationX(o());
            }
            if (p() != view.getRotationY()) {
                view.setRotationY(p());
            }
            if (q() != view.getRotation()) {
                view.setRotation(q());
            }
            if (r() != view.getScaleX()) {
                view.setScaleX(r());
            }
            if (s() != view.getScaleY()) {
                view.setScaleY(s());
            }
        }
    }

    public final void J(Context context) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d8c49a6", new Object[]{this, context});
            return;
        }
        try {
            View z2 = z();
            if (z2 != null) {
                boolean statInPrivateFlags = B().getStatInPrivateFlags(256);
                DXWidgetNode B = B();
                if (statInPrivateFlags) {
                    DXTraceUtil.b(" onRenderView Before ");
                    B.setRealViewVisibility(z2, B.getVisibility());
                    if (k() != 1) {
                        z = false;
                    }
                    if (z2.isEnabled() != z) {
                        z2.setEnabled(z);
                    }
                    if (!E()) {
                        I(z2);
                    } else {
                        B.renderAnimationSupportProperty(z2);
                    }
                    B.bindAccessibilityToView(z2, e());
                    B.setBackground(z2);
                    DXTraceUtil.c();
                    B.onRenderView(context, z2);
                    DXTraceUtil.b(" onRenderView End ");
                    if ((z2 instanceof ViewGroup) && z2.getLayoutDirection() != B.getDirection()) {
                        z2.setLayoutDirection(B.getDirection());
                    }
                    B.setForceDark(z2);
                    DXTraceUtil.c();
                }
                B.unsetStatFlag(256);
                B.setStatFlag(512);
            }
        } catch (Exception e) {
            xv5.b(e);
            DXRuntimeContext dXRuntimeContext = B().getDXRuntimeContext();
            if (dXRuntimeContext != null && dXRuntimeContext.m() != null) {
                f.a aVar = new f.a("Render", "Pipeline_Detail_Render_Detail", 90002);
                aVar.e = xv5.a(e);
                ((ArrayList) dXRuntimeContext.m().c).add(aVar);
            }
        }
    }

    public int K(ex5 ex5Var, ex5 ex5Var2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cc3406c", new Object[]{this, ex5Var, ex5Var2})).intValue();
        }
        if (!(B() instanceof j) || ex5Var2 == null) {
            return -1;
        }
        while (true) {
            if (i >= j()) {
                i = -1;
                break;
            } else if (h(i).g() == ex5Var2.g()) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            H(ex5Var2.g());
            C(ex5Var, i);
        }
        return i;
    }

    public void L(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed2242d0", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("912ba7e", new Object[]{this});
        } else if (this.k == null) {
            this.k = new a();
            P(4);
        } else if (!l(4)) {
            this.k = this.k.a();
            P(4);
        }
    }

    public void N(v56 v56Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4b16dec", new Object[]{this, v56Var});
        } else {
            this.j = v56Var;
        }
    }

    public void O(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb1623d", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public void P(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d34745f9", new Object[]{this, new Integer(i)});
        } else {
            this.l = i | this.l;
        }
    }

    public void Q(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e0685cd", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.h = i;
        this.i = i2;
    }

    public final void R(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f1e413", new Object[]{this, context});
            return;
        }
        this.f18863a.setStatFlag(256);
        J(context);
    }

    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("414ede50", new Object[]{this});
        } else if (this.j == null) {
            this.j = new v56();
            P(2);
        } else if (!l(2)) {
            this.j = this.j.a();
            P(2);
        }
    }

    public void T(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70250cd", new Object[]{this, view});
        } else {
            B().setRealViewLayoutParam(view);
        }
    }

    public void U(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205edae4", new Object[]{this, view});
        } else {
            this.g = new WeakReference<>(view);
        }
    }

    public void V(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a87a1ad3", new Object[]{this, new Integer(i)});
        } else {
            this.f18863a.unsetStatFlag(i);
        }
    }

    public void a(ex5 ex5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bc30f77", new Object[]{this, ex5Var});
        } else if (ex5Var != null) {
            this.b.add(ex5Var);
            ex5Var.c = this;
        }
    }

    public final void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e48b9e4", new Object[]{this, context});
        } else {
            this.f18863a.bindEvent(context);
        }
    }

    public void c(DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db0ea431", new Object[]{this, dXRenderOptions});
        } else if (dXRenderOptions != null && B() != null) {
            B().bindRenderOptions(dXRenderOptions);
        }
    }

    public View d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        if (z() == null) {
            U(this.f18863a.createView(context));
        }
        return z();
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d187612", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public float f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbf8c81f", new Object[]{this})).floatValue();
        }
        return this.d;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c55fce9a", new Object[]{this})).intValue();
        }
        return this.f18863a.getAutoId();
    }

    @Override // tb.svb
    public int getLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2350677", new Object[]{this})).intValue();
        }
        return this.h;
    }

    @Override // tb.svb
    public int getMeasuredHeight() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e10b2f7d", new Object[]{this})).intValue();
        }
        a aVar = this.k;
        if (aVar == null || (i = aVar.f18864a) == -1) {
            return this.f18863a.getMeasuredHeight();
        }
        return i;
    }

    @Override // tb.svb
    public int getMeasuredWidth() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b0f3e64", new Object[]{this})).intValue();
        }
        a aVar = this.k;
        if (aVar == null || (i = aVar.b) == -1) {
            return this.f18863a.getMeasuredWidth();
        }
        return i;
    }

    @Override // tb.svb
    public int getTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9c9cf19", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public ex5 h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ex5) ipChange.ipc$dispatch("5a67b28", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= this.b.size()) {
            return null;
        }
        return this.b.get(i);
    }

    public List<ex5> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("faa24d4b", new Object[]{this});
        }
        return this.b;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62bc4e14", new Object[]{this})).intValue();
        }
        return this.b.size();
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84d1ce05", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public boolean l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1d9835c", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if ((this.l & i) == i) {
            return true;
        }
        return false;
    }

    public Class m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("2d506514", new Object[]{this});
        }
        return this.f18863a.getClass();
    }

    public ex5 n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ex5) ipChange.ipc$dispatch("b569f844", new Object[]{this});
        }
        return this.c;
    }

    public float o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc08445b", new Object[]{this})).floatValue();
        }
        v56 v56Var = this.j;
        if (v56Var == null) {
            return 0.0f;
        }
        return v56Var.e;
    }

    public float p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc165bdc", new Object[]{this})).floatValue();
        }
        v56 v56Var = this.j;
        if (v56Var == null) {
            return 0.0f;
        }
        return v56Var.f;
    }

    public float q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc24735d", new Object[]{this})).floatValue();
        }
        v56 v56Var = this.j;
        if (v56Var == null) {
            return 0.0f;
        }
        return v56Var.g;
    }

    public float r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("606f85bb", new Object[]{this})).floatValue();
        }
        v56 v56Var = this.j;
        if (v56Var == null) {
            return 1.0f;
        }
        return v56Var.c;
    }

    public float s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("607d9d3c", new Object[]{this})).floatValue();
        }
        v56 v56Var = this.j;
        if (v56Var == null) {
            return 1.0f;
        }
        return v56Var.d;
    }

    @Override // tb.svb
    public void setAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144f37d", new Object[]{this, new Float(f)});
        } else {
            this.d = f;
        }
    }

    @Override // tb.svb
    public void setBackGroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39c8b549", new Object[]{this, new Integer(i)});
            return;
        }
        M();
        this.k.getClass();
    }

    @Override // tb.svb
    public void setMeasuredDimension(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926701a5", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        M();
        a aVar = this.k;
        aVar.f18864a = i2;
        aVar.b = i;
    }

    @Override // tb.svb
    public void setRotationX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cf718c1", new Object[]{this, new Float(f)});
            return;
        }
        S();
        this.j.e = f;
    }

    @Override // tb.svb
    public void setRotationY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eabf160", new Object[]{this, new Float(f)});
            return;
        }
        S();
        this.j.f = f;
    }

    @Override // tb.svb
    public void setRotationZ(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8060c9ff", new Object[]{this, new Float(f)});
            return;
        }
        S();
        this.j.g = f;
    }

    @Override // tb.svb
    public void setScaleX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e70ec9", new Object[]{this, new Float(f)});
            return;
        }
        S();
        this.j.c = f;
    }

    @Override // tb.svb
    public void setScaleY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("459be768", new Object[]{this, new Float(f)});
            return;
        }
        S();
        this.j.d = f;
    }

    @Override // tb.svb
    public void setTranslateX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beac94cd", new Object[]{this, new Float(f)});
            return;
        }
        S();
        this.j.f29789a = f;
    }

    @Override // tb.svb
    public void setTranslateY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0616d6c", new Object[]{this, new Float(f)});
            return;
        }
        S();
        this.j.b = f;
    }

    public int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69169c95", new Object[]{this})).intValue();
        }
        return this.f18863a.getSourceAutoId();
    }

    public DXWidgetNode u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("dbc277db", new Object[]{this});
        }
        return this.f18863a.getSourceWidget();
    }

    public boolean v(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eed3094d", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return this.f18863a.getStatInPrivateFlags(i);
    }

    public float w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1cd1537", new Object[]{this})).floatValue();
        }
        v56 v56Var = this.j;
        if (v56Var == null) {
            return 0.0f;
        }
        return v56Var.f29789a;
    }

    public float x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1db2cb8", new Object[]{this})).floatValue();
        }
        v56 v56Var = this.j;
        if (v56Var == null) {
            return 0.0f;
        }
        return v56Var.b;
    }

    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        if (B() == null) {
            return null;
        }
        return B().getUserId();
    }

    public View z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        WeakReference<View> weakReference = this.g;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
