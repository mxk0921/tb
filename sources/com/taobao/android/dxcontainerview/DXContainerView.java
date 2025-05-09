package com.taobao.android.dxcontainerview;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.update.dynamicfeature.utils.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.ic5;
import tb.iwb;
import tb.jh5;
import tb.k66;
import tb.rh5;
import tb.t2o;
import tb.x96;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXContainerView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, String> extraParams;
    private jh5 mDXContainerViewRenderListener;
    private iwb mDXNotificationListener;
    private DXRenderOptions mDXRenderOptions;
    private DXRootView mDXRootView;
    private DinamicXEngine mDinamicXEngine;
    public boolean mNeedAutoSize;
    public JSONObject templateData;
    public int oldWidth = 0;
    public int oldHeight = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements iwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXTemplateItem f7590a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ DXRenderOptions c;

        public a(DXTemplateItem dXTemplateItem, JSONObject jSONObject, DXRenderOptions dXRenderOptions) {
            this.f7590a = dXTemplateItem;
            this.b = jSONObject;
            this.c = dXRenderOptions;
        }

        @Override // tb.iwb
        public void onNotificationListener(k66 k66Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
                return;
            }
            List<DXTemplateItem> list = k66Var.f22428a;
            if (list != null) {
                Iterator<DXTemplateItem> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    DXTemplateItem next = it.next();
                    if (next.f7343a.equals(this.f7590a.f7343a) && next.b == this.f7590a.b) {
                        DXContainerView.access$000(DXContainerView.this, this.b, next, this.c);
                        if (DXContainerView.access$100(DXContainerView.this) != null) {
                            DXContainerView.access$100(DXContainerView.this).c(DXContainerView.access$200(DXContainerView.this));
                        }
                    }
                }
            }
            List<DXTemplateItem> list2 = k66Var.b;
            if (list2 != null) {
                for (DXTemplateItem dXTemplateItem : list2) {
                    if (dXTemplateItem.f7343a.equals(this.f7590a.f7343a) && dXTemplateItem.b == this.f7590a.b) {
                        if (DXContainerView.access$100(DXContainerView.this) != null) {
                            DXContainerView.access$100(DXContainerView.this).b(Constants.ErrorDesc.downloadError, null);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    static {
        t2o.a(444597924);
    }

    @Deprecated
    public DXContainerView(Context context, DinamicXEngine dinamicXEngine, String str, String str2, JSONObject jSONObject, boolean z) {
        super(context);
        this.mNeedAutoSize = z;
        init(dinamicXEngine, str, parseUrl(str2), jSONObject);
    }

    public static /* synthetic */ DXRootView access$000(DXContainerView dXContainerView, JSONObject jSONObject, DXTemplateItem dXTemplateItem, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("bcff3c8c", new Object[]{dXContainerView, jSONObject, dXTemplateItem, dXRenderOptions});
        }
        return dXContainerView.render(jSONObject, dXTemplateItem, dXRenderOptions);
    }

    public static /* synthetic */ jh5 access$100(DXContainerView dXContainerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jh5) ipChange.ipc$dispatch("49d47b74", new Object[]{dXContainerView});
        }
        return dXContainerView.mDXContainerViewRenderListener;
    }

    public static /* synthetic */ DXRootView access$200(DXContainerView dXContainerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("50f36d91", new Object[]{dXContainerView});
        }
        return dXContainerView.mDXRootView;
    }

    private DXRootView createDXRootView(DXTemplateItem dXTemplateItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("90ebbb6e", new Object[]{this, dXTemplateItem, jSONObject});
        }
        this.templateData = jSONObject;
        setupRootView(this.mDinamicXEngine.o(getContext(), dXTemplateItem).f7291a);
        return this.mDXRootView;
    }

    private void downloadTemplate(DXTemplateItem dXTemplateItem, JSONObject jSONObject, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5abe102", new Object[]{this, dXTemplateItem, jSONObject, dXRenderOptions});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(dXTemplateItem);
        if (this.mDXNotificationListener == null) {
            this.mDXNotificationListener = new a(dXTemplateItem, jSONObject, dXRenderOptions);
        }
        this.mDinamicXEngine.j(this.mDXNotificationListener);
        this.mDinamicXEngine.p(arrayList);
    }

    private DXRootView getDXRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("39124f9f", new Object[]{this});
        }
        return this.mDXRootView;
    }

    private void init(DinamicXEngine dinamicXEngine, String str, DXTemplateItem dXTemplateItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d554b215", new Object[]{this, dinamicXEngine, str, dXTemplateItem, jSONObject});
            return;
        }
        if (dinamicXEngine == null) {
            if (str == null) {
                str = "DefaultDX";
            }
            this.mDinamicXEngine = new DinamicXEngine(new DXEngineConfig.b(str).V(true).U(false).g0(false).F());
        } else {
            this.mDinamicXEngine = dinamicXEngine;
        }
        createDXRootView(dXTemplateItem, jSONObject);
    }

    public static /* synthetic */ Object ipc$super(DXContainerView dXContainerView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dxcontainerview/DXContainerView");
        }
    }

    public static boolean isDXUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c6b2126", new Object[]{str})).booleanValue();
        }
        try {
            String host = Uri.parse(str).getHost();
            if (host == null) {
                return false;
            }
            return host.equals("dinamicx.taobao.com");
        } catch (Exception unused) {
            return false;
        }
    }

    private DXTemplateItem parseUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("f2c1c992", new Object[]{this, str});
        }
        try {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("name");
            String queryParameter2 = parse.getQueryParameter("version");
            String queryParameter3 = parse.getQueryParameter("url");
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.f7343a = queryParameter;
            dXTemplateItem.b = Long.parseLong(queryParameter2);
            dXTemplateItem.c = queryParameter3;
            return dXTemplateItem;
        } catch (Exception e) {
            reportError("DXContainerView parse url error", f.DX_ERROR_CODE_CONTAINER_VIEW_PARSE_URL_200011, e);
            return null;
        }
    }

    private DXRootView render(JSONObject jSONObject, DXTemplateItem dXTemplateItem, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("e15248d3", new Object[]{this, jSONObject, dXTemplateItem, dXRenderOptions});
        }
        DXRootView dXRootView = this.mDinamicXEngine.i1(getContext(), this.mDXRootView, dXTemplateItem, jSONObject, -1, dXRenderOptions).f7291a;
        this.mDXRootView = dXRootView;
        this.mDinamicXEngine.t0(dXRootView);
        updateRootViewInViewHierarchyIfNeeded();
        return this.mDXRootView;
    }

    private void reportError(String str, int i, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7737c268", new Object[]{this, str, new Integer(i), exc});
            return;
        }
        f fVar = new f(this.mDinamicXEngine.c());
        f.a aVar = new f.a("DXContainerView_Render", "DXContainerView_Render_crash", i);
        aVar.e = str + rh5.a() + "_trace: " + xv5.a(exc);
        fVar.c.add(aVar);
        ic5.p(fVar);
    }

    private void setupRootView(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15edd14c", new Object[]{this, dXRootView});
            return;
        }
        removeAllViews();
        this.mDXRootView = dXRootView;
        ViewGroup.LayoutParams layoutParams = dXRootView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        this.mDXRootView.setLayoutParams(layoutParams);
        addView(this.mDXRootView);
    }

    private void updateRootViewInViewHierarchyIfNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca074194", new Object[]{this});
        } else if (this.mDXRootView.getParent() != this) {
            removeAllViews();
            addView(this.mDXRootView);
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        DXRootView dXRootView = this.mDXRootView;
        if (dXRootView != null) {
            this.mDinamicXEngine.u0(dXRootView);
            this.mDXRootView = null;
        }
        iwb iwbVar = this.mDXNotificationListener;
        if (iwbVar != null) {
            this.mDinamicXEngine.f1(iwbVar);
            this.mDXNotificationListener = null;
        }
        this.mDXContainerViewRenderListener = null;
        this.mDXRenderOptions = null;
    }

    public DinamicXEngine getDinamicXEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("350fca7f", new Object[]{this});
        }
        return this.mDinamicXEngine;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.mNeedAutoSize) {
            int measuredHeight = getMeasuredHeight();
            int measuredWidth = getMeasuredWidth();
            if (measuredHeight != this.oldHeight || measuredWidth != this.oldWidth) {
                this.oldHeight = measuredHeight;
                this.oldWidth = measuredWidth;
                DXRenderOptions q = new DXRenderOptions.b().G(DXWidgetNode.DXMeasureSpec.c(measuredWidth, 1073741824)).t(DXWidgetNode.DXMeasureSpec.c(measuredHeight, 1073741824)).q();
                this.mDXRenderOptions = q;
                renderDXRootView(this.templateData, q, true);
            }
        }
    }

    public void renderDXRootView(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce7a078", new Object[]{this, jSONObject});
        } else {
            renderDXRootView(jSONObject, null);
        }
    }

    public void setDXContainerViewRenderListener(jh5 jh5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe99b644", new Object[]{this, jh5Var});
        } else {
            this.mDXContainerViewRenderListener = jh5Var;
        }
    }

    public void setExtraParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fc8e3aa", new Object[]{this, map});
        } else {
            this.extraParams = map;
        }
    }

    public void renderDXRootView(JSONObject jSONObject, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c9eed68", new Object[]{this, jSONObject, dXRenderOptions});
        } else {
            renderDXRootView(jSONObject, dXRenderOptions, false);
        }
    }

    private void renderDXRootView(JSONObject jSONObject, DXRenderOptions dXRenderOptions, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("273f726c", new Object[]{this, jSONObject, dXRenderOptions, new Boolean(z)});
            return;
        }
        try {
            DXRootView dXRootView = this.mDXRootView;
            if (dXRootView != null) {
                if (z || !this.mNeedAutoSize) {
                    DXTemplateItem dxTemplateItem = dXRootView.getDxTemplateItem();
                    DXTemplateItem u = this.mDinamicXEngine.u(dxTemplateItem);
                    if (u == null || u.b != dxTemplateItem.b) {
                        Map<String, String> map = this.extraParams;
                        if (!(map == null || (str = map.get(x96.REFRESH_TYPE)) == null || !str.equals("renderFirst") || u == null)) {
                            DXRootView dXRootView2 = this.mDinamicXEngine.i1(getContext(), this.mDXRootView, u, jSONObject, -1, dXRenderOptions).f7291a;
                            this.mDXRootView = dXRootView2;
                            jh5 jh5Var = this.mDXContainerViewRenderListener;
                            if (jh5Var != null) {
                                jh5Var.c(dXRootView2);
                            }
                        }
                        downloadTemplate(dxTemplateItem, jSONObject, dXRenderOptions);
                        return;
                    }
                    render(jSONObject, u, dXRenderOptions);
                    jh5 jh5Var2 = this.mDXContainerViewRenderListener;
                    if (jh5Var2 != null) {
                        jh5Var2.c(this.mDXRootView);
                    }
                }
            }
        } catch (Exception e) {
            reportError("DXContainerView render error", f.DX_ERROR_CODE_CONTAINER_VIEW_200010, e);
        }
    }

    @Deprecated
    public DXContainerView(Context context, DinamicXEngine dinamicXEngine, String str, DXTemplateItem dXTemplateItem, JSONObject jSONObject, boolean z) {
        super(context);
        this.mNeedAutoSize = z;
        init(dinamicXEngine, str, dXTemplateItem, jSONObject);
    }
}
