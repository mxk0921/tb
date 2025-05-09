package tb;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ai6 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public JSONObject g;
    public String h;
    public String i;
    public String j;
    public String l;
    public DXRenderOptions m;
    public DXRootView n;

    /* renamed from: a  reason: collision with root package name */
    public final long f15757a = 33556442494L;
    public final long b = 36442092789L;
    public final long c = 528128262;
    public final long d = 5435381891761953165L;
    public final long e = -726802512773548392L;
    public final long f = -1961630536223192376L;
    public int k = 5;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public final long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("add79710", new Object[]{this})).longValue();
            }
            return ai6.a();
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public static final /* synthetic */ long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83b6e197", new Object[0])).longValue();
        }
        return -5448475105793543453L;
    }

    public static /* synthetic */ Object ipc$super(ai6 ai6Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/dinamicX/view/DXTemplateViewWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new ai6();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof ai6)) {
            super.onClone(dXWidgetNode, z);
            ai6 ai6Var = (ai6) dXWidgetNode;
            this.g = ai6Var.g;
            this.h = ai6Var.h;
            this.i = ai6Var.i;
            this.j = ai6Var.j;
            this.l = ai6Var.l;
            this.k = ai6Var.k;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new FrameLayout(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        DXRootView dXRootView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.m = new DXRenderOptions.b().t(i2).G(i).q();
        if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
            setMeasuredDimension(i, i2);
            return;
        }
        DXResult<DXRootView> x = x(w(), (DXRootView) d04.D(v(u())));
        if (x != null && (dXRootView = x.f7291a) != null) {
            this.n = dXRootView;
            DXWidgetNode expandWidgetNode = dXRootView.getExpandWidgetNode();
            if (expandWidgetNode != null) {
                setMeasuredDimension(expandWidgetNode.getMeasuredWidth(), expandWidgetNode.getMeasuredHeight());
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == this.e) {
            this.k = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        } else if (j == this.f15757a) {
            this.g = jSONObject;
        } else {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == this.b) {
            this.h = str;
        } else if (j == this.c) {
            this.i = str;
        } else if (j == this.d) {
            this.j = str;
        } else if (j == this.f) {
            this.l = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public final String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0d367e6", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.h);
        sb.append('|');
        sb.append(this.j);
        sb.append('|');
        String str = this.l;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public final List<DXRootView> v(String str) {
        Object obj;
        DXRootView L;
        DXRootView L2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("90ac3d4c", new Object[]{this, str});
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        Map map = null;
        if (dXRuntimeContext == null || (L2 = dXRuntimeContext.L()) == null) {
            obj = null;
        } else {
            obj = L2.getTag(R.id.dx_template_view_cache_pool_key);
        }
        if (kqu.m(obj)) {
            map = obj;
        }
        Map map2 = map;
        if (map2 == null) {
            map2 = new LinkedHashMap();
            DXRuntimeContext dXRuntimeContext2 = getDXRuntimeContext();
            if (!(dXRuntimeContext2 == null || (L = dXRuntimeContext2.L()) == null)) {
                L.setTag(R.id.dx_template_view_cache_pool_key, map2);
            }
        }
        List<DXRootView> list = (List) map2.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        map2.put(str, arrayList);
        return arrayList;
    }

    public final DXTemplateItem w() {
        long j;
        Long o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("d284e39a", new Object[]{this});
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f7343a = this.h;
        String str = this.j;
        if (str == null || (o = ssq.o(str)) == null) {
            j = 1;
        } else {
            j = o.longValue();
        }
        dXTemplateItem.b = j;
        dXTemplateItem.c = this.i;
        return dXTemplateItem;
    }

    public final DXResult<DXRootView> x(DXTemplateItem dXTemplateItem, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("fafd90e0", new Object[]{this, dXTemplateItem, dXRootView});
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        ckf.f(dXRuntimeContext, sj8.PARSER_KEY_DX_RUNTIMECONTEXT);
        av5 s = dXRuntimeContext.s();
        ckf.f(s, "dxRuntimeContext.engineContext");
        DinamicXEngine f = s.f();
        if (f == null) {
            return null;
        }
        DXTemplateItem u = f.u(dXTemplateItem);
        if (u == null || u.b != dXTemplateItem.b) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(dXTemplateItem);
            f.p(arrayList);
        }
        if (u == null) {
            return null;
        }
        if (dXRootView == null) {
            if (!onm.INSTANCE.b()) {
                DXRuntimeContext dXRuntimeContext2 = getDXRuntimeContext();
                ckf.f(dXRuntimeContext2, sj8.PARSER_KEY_DX_RUNTIMECONTEXT);
                dXRootView = f.z0(dXRuntimeContext2.h(), u).f7291a;
            } else {
                DXRuntimeContext dXRuntimeContext3 = getDXRuntimeContext();
                ckf.f(dXRuntimeContext3, sj8.PARSER_KEY_DX_RUNTIMECONTEXT);
                dXRootView = f.o(dXRuntimeContext3.h(), u).f7291a;
            }
        }
        DXRuntimeContext dXRuntimeContext4 = getDXRuntimeContext();
        ckf.f(dXRuntimeContext4, sj8.PARSER_KEY_DX_RUNTIMECONTEXT);
        return f.i1(dXRuntimeContext4.h(), dXRootView, u, this.g, -1, this.m);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        DXRootView dXRootView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        ckf.g(view, "weakView");
        super.onRenderView(context, view);
        DXTemplateItem w = w();
        String u = u();
        FrameLayout frameLayout = (FrameLayout) view;
        View childAt = frameLayout.getChildAt(0);
        if (!(childAt instanceof DXRootView)) {
            childAt = null;
        }
        DXRootView dXRootView2 = (DXRootView) childAt;
        Object tag = dXRootView2 != null ? dXRootView2.getTag(R.id.dx_template_view_cache_key) : null;
        if (!(tag instanceof String)) {
            tag = null;
        }
        String str = (String) tag;
        if (ckf.b(str, u)) {
            dXRootView = dXRootView2;
        } else {
            dXRootView = this.n;
            if (dXRootView == null) {
                dXRootView = (DXRootView) d04.D(v(u));
            }
        }
        DXRootView dXRootView3 = this.n;
        if (dXRootView3 == null || !ckf.b(dXRootView, dXRootView3)) {
            DXResult<DXRootView> x = x(w, dXRootView);
            dXRootView = x != null ? x.f7291a : null;
        }
        this.n = null;
        if (dXRootView != null && !ckf.b(dXRootView2, dXRootView)) {
            if (dXRootView2 != null) {
                frameLayout.removeAllViews();
                if (str != null) {
                    List<DXRootView> v = v(str);
                    if (v.size() < this.k) {
                        v.add(dXRootView2);
                    }
                }
            }
            dXRootView.setTag(R.id.dx_template_view_cache_key, u);
            frameLayout.addView(dXRootView);
        }
        if (dXRootView != null) {
            dXRootView.setTag(R.id.dx_template_view_parent_widget, this);
        }
    }
}
