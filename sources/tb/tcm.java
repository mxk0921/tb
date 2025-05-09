package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.homepage.pop.model.section.PopSectionModel;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel;
import com.taobao.homepage.pop.utils.PopConst;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tcm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DEFAULT_EVENT = -1;
    public static final int DEFAULT_STATUS_BAR_HEIGHT = 0;

    public static DXRootView b(View view) {
        ViewGroup viewGroup;
        int childCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("d061cf49", new Object[]{view});
        }
        if (view instanceof DXRootView) {
            return (DXRootView) view;
        }
        if (!(view instanceof ViewGroup) || (childCount = (viewGroup = (ViewGroup) view).getChildCount()) == 0) {
            return null;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof DXRootView) {
                return (DXRootView) childAt;
            }
        }
        return null;
    }

    public static DXWidgetNode c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("f5907cb0", new Object[]{view});
        }
        DXRootView b = b(view);
        if (b != null) {
            return b.getExpandWidgetNode();
        }
        vfm.f("PopDxUtils ", "dxRootView is null");
        return null;
    }

    public static View d(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("440e6c69", new Object[]{view, str});
        }
        if (view == null) {
            vfm.f("PopDxUtils ", "card view is empty");
            return null;
        } else if (TextUtils.isEmpty(str)) {
            vfm.f("PopDxUtils ", "itemBizCode is empty");
            return view;
        } else {
            DXWidgetNode c = c(view);
            if (c == null) {
                vfm.f("PopDxUtils ", "expend widgetNode is null, itemCode=" + str);
                return null;
            }
            DXWidgetNode queryWidgetNodeByUserId = c.queryWidgetNodeByUserId(str);
            if (queryWidgetNodeByUserId != null) {
                return queryWidgetNodeByUserId.getDXRuntimeContext().D();
            }
            vfm.f("PopDxUtils ", "dxWidgetNode by userId is null, itemCode=" + str);
            return null;
        }
    }

    public static scm e(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (scm) ipChange.ipc$dispatch("65769384", new Object[]{dXRuntimeContext});
        }
        DXRootView L = dXRuntimeContext.L();
        if (L == null) {
            vfm.f("PopDxUtils ", "getPopEngine error, rootView is null");
            return null;
        }
        Object tag = L.getTag(PopConst.DX_POP_USER_CONTEXT_TAG);
        if (tag instanceof scm) {
            return (scm) tag;
        }
        vfm.f("PopDxUtils ", "getPopEngine error, PopDxUserContext not found");
        return null;
    }

    public static IPopData f(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPopData) ipChange.ipc$dispatch("c716874d", new Object[]{dXRuntimeContext});
        }
        scm e = e(dXRuntimeContext);
        if (e == null) {
            return null;
        }
        return e.b();
    }

    public static e3b g(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e3b) ipChange.ipc$dispatch("2e9c499e", new Object[]{dXRuntimeContext});
        }
        scm e = e(dXRuntimeContext);
        if (e == null) {
            return null;
        }
        return e.a();
    }

    public static BasePopSectionModel<?> h(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasePopSectionModel) ipChange.ipc$dispatch("65445f0a", new Object[]{dXRuntimeContext});
        }
        JSONObject i = dXRuntimeContext.i();
        if (i == null) {
            return null;
        }
        if (i instanceof BasePopSectionModel) {
            return (BasePopSectionModel) i;
        }
        return new PopSectionModel(i);
    }

    public static String j(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6860296", new Object[]{dXRuntimeContext});
        }
        e3b g = g(dXRuntimeContext);
        if (g == null) {
            return null;
        }
        return g.k().getContainerId();
    }

    public static BasePopSectionModel<?> k(DXRuntimeContext dXRuntimeContext, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasePopSectionModel) ipChange.ipc$dispatch("42b2918c", new Object[]{dXRuntimeContext, jSONObject});
        }
        BasePopSectionModel<?> h = h(dXRuntimeContext);
        if (h != null) {
            return h.createBaseSectionModel(jSONObject);
        }
        vfm.c("PopDxUtils ", "sectionModel == null");
        return null;
    }

    public static int i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        try {
            return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
        } catch (Throwable th) {
            vfm.d("getStatusBarHeight error", th);
            return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r4.equals("endTime") == false) goto L_0x0024;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long a(java.lang.String r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.tcm.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "f256b3b0"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            java.lang.Number r4 = (java.lang.Number) r4
            long r0 = r4.longValue()
            return r0
        L_0x0019:
            r4.hashCode()
            r2 = -1
            int r3 = r4.hashCode()
            switch(r3) {
                case -1607243192: goto L_0x0048;
                case -1367724422: goto L_0x003d;
                case -907680051: goto L_0x0031;
                case 951117504: goto L_0x0026;
                default: goto L_0x0024;
            }
        L_0x0024:
            r0 = -1
            goto L_0x0051
        L_0x0026:
            java.lang.String r0 = "confirm"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x002f
            goto L_0x0024
        L_0x002f:
            r0 = 3
            goto L_0x0051
        L_0x0031:
            java.lang.String r0 = "scroll"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x003b
            goto L_0x0024
        L_0x003b:
            r0 = 2
            goto L_0x0051
        L_0x003d:
            java.lang.String r0 = "cancel"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0046
            goto L_0x0024
        L_0x0046:
            r0 = 1
            goto L_0x0051
        L_0x0048:
            java.lang.String r1 = "endTime"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0051
            goto L_0x0024
        L_0x0051:
            switch(r0) {
                case 0: goto L_0x0069;
                case 1: goto L_0x0063;
                case 2: goto L_0x005d;
                case 3: goto L_0x0057;
                default: goto L_0x0054;
            }
        L_0x0054:
            r0 = -1
            return r0
        L_0x0057:
            r0 = -1129127094585505562(0xf05488e3ccf648e6, double:-1.2752213430457202E233)
            return r0
        L_0x005d:
            r0 = 8783582798676678022(0x79e58e049a5ad586, double:1.5283722501140869E279)
            return r0
        L_0x0063:
            r0 = 8746808838507530845(0x7962e84bc97d0a5d, double:5.236944749999128E276)
            return r0
        L_0x0069:
            r0 = -819022960750368545(0xf4a23ef4e195e8df, double:-6.688553816717326E253)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tcm.a(java.lang.String):long");
    }
}
