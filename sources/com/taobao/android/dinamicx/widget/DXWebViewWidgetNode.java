package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.component.DXWebView;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.d1a;
import tb.hwb;
import tb.la6;
import tb.mn6;
import tb.qub;
import tb.tsq;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXWebViewWidgetNode extends DXWidgetNode implements hwb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion = new b(null);
    public static final long DXWEBVIEW = 4283113730865682368L;
    public static final long DXWEBVIEW_ENABLEAUTOLOAD = 2009636492692303246L;
    public static final long DXWEBVIEW_ENABLEINTERCEPTTOPSCROLL_ANDROID = -3398419110731210258L;
    public static final long DXWEBVIEW_ONSCROLL = 5288751146867425108L;
    public static final long DXWEBVIEW_ONWEBEVENT = 8869008963330847239L;
    public static final long DXWEBVIEW_URL = 528128262;

    /* renamed from: a  reason: collision with root package name */
    public String f7408a;
    public JSONObject b;
    public boolean c = true;
    public boolean d;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/taobao/android/dinamicx/widget/DXWebViewWidgetNode$WebViewViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "TBDinamicX_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class WebViewViewHolder extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewViewHolder(DXWebView dXWebView) {
            super(dXWebView);
            ckf.g(dXWebView, "view");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new DXWebViewWidgetNode();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ d1a b;

        public c(d1a d1aVar) {
            this.b = d1aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [tb.mn6] */
        @Override // java.lang.Runnable
        public final void run() {
            View view;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            DXRuntimeContext dXRuntimeContext = DXWebViewWidgetNode.this.getDXRuntimeContext();
            if (dXRuntimeContext == null || dXRuntimeContext.D() == null) {
                DXRuntimeContext dXRuntimeContext2 = DXWebViewWidgetNode.this.getDXRuntimeContext();
                RecyclerView recyclerView = null;
                if (dXRuntimeContext2 != null) {
                    view = dXRuntimeContext2.D();
                } else {
                    view = null;
                }
                if (view instanceof RecyclerView) {
                    recyclerView = view;
                }
                RecyclerView recyclerView2 = recyclerView;
                if (recyclerView2 != null) {
                    d1a d1aVar = this.b;
                    if (d1aVar != null) {
                        d1aVar = new mn6(d1aVar);
                    }
                    recyclerView2.post((Runnable) d1aVar);
                    return;
                }
                return;
            }
            this.b.invoke();
        }
    }

    public static /* synthetic */ void D(DXWebViewWidgetNode dXWebViewWidgetNode, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f538300c", new Object[]{dXWebViewWidgetNode, str, new Integer(i), obj});
        } else if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            dXWebViewWidgetNode.C(str);
        } else {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadUrl");
        }
    }

    public static /* synthetic */ Object ipc$super(DXWebViewWidgetNode dXWebViewWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 757047317:
                super.setMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXWebViewWidgetNode");
        }
    }

    public static final /* synthetic */ boolean t(DXWebViewWidgetNode dXWebViewWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb681741", new Object[]{dXWebViewWidgetNode})).booleanValue();
        }
        return dXWebViewWidgetNode.c;
    }

    public static final /* synthetic */ boolean u(DXWebViewWidgetNode dXWebViewWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3aee857c", new Object[]{dXWebViewWidgetNode})).booleanValue();
        }
        return dXWebViewWidgetNode.d;
    }

    public static final /* synthetic */ String v(DXWebViewWidgetNode dXWebViewWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85321a3e", new Object[]{dXWebViewWidgetNode});
        }
        return dXWebViewWidgetNode.f7408a;
    }

    public static final /* synthetic */ JSONObject w(DXWebViewWidgetNode dXWebViewWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("18f23b8b", new Object[]{dXWebViewWidgetNode});
        }
        return dXWebViewWidgetNode.b;
    }

    public static final /* synthetic */ DXWebView x(DXWebViewWidgetNode dXWebViewWidgetNode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWebView) ipChange.ipc$dispatch("188996e1", new Object[]{dXWebViewWidgetNode, str});
        }
        return dXWebViewWidgetNode.B(str);
    }

    public static final /* synthetic */ void y(DXWebViewWidgetNode dXWebViewWidgetNode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("651bfd60", new Object[]{dXWebViewWidgetNode, str});
        } else {
            dXWebViewWidgetNode.f7408a = str;
        }
    }

    public final void A(d1a<xhv> d1aVar) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("807d028a", new Object[]{this, d1aVar});
            return;
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        RecyclerView recyclerView = null;
        if (dXRuntimeContext != null) {
            view = dXRuntimeContext.D();
        } else {
            view = null;
        }
        if (view instanceof RecyclerView) {
            recyclerView = view;
        }
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.postDelayed(new c(d1aVar), 50L);
        } else {
            la6.b("delayRunUI dxRuntimeContext?.nativeView = null");
        }
    }

    public final DXWebView B(String str) {
        View view;
        View view2;
        RecyclerView.LayoutManager layoutManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWebView) ipChange.ipc$dispatch("426d7ac5", new Object[]{this, str});
        }
        try {
            DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
            if (dXRuntimeContext != null) {
                view = dXRuntimeContext.D();
            } else {
                view = null;
            }
            if (!(view instanceof RecyclerView)) {
                view = null;
            }
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
                view2 = null;
            } else {
                view2 = layoutManager.findViewByPosition(0);
            }
            if (!(view2 instanceof DXWebView)) {
                view2 = null;
            }
            DXWebView dXWebView = (DXWebView) view2;
            if (dXWebView == null) {
                la6.b("getWebView == null from " + str);
            }
            return dXWebView;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("getWebView == null error:");
            e.printStackTrace();
            sb.append(xhv.INSTANCE);
            sb.append(" from ");
            sb.append(str);
            la6.b(sb.toString());
            return null;
        }
    }

    public final void C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
        } else {
            A(new DXWebViewWidgetNode$loadUrl$1(this, str));
        }
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
        } else {
            A(new DXWebViewWidgetNode$reload$1(this));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXWebViewWidgetNode();
    }

    public final void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            A(new DXWebViewWidgetNode$destroy$1(this));
        }
    }

    @Override // tb.hwb
    public Object getNodePropByKey(String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5ad97ad4", new Object[]{this, str});
        }
        DXWebView.STATUS status = null;
        if (!tsq.y(str, "isLoadSucceed", false, 2, null)) {
            return null;
        }
        DXWebView B = B("getNodePropByKey");
        if (B != null) {
            status = B.getRequestStatus();
        }
        if (status != DXWebView.STATUS.SUCCEED) {
            z = false;
        }
        return String.valueOf(z);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
            return;
        }
        ckf.g(context, "context");
        ckf.g(view, "weakView");
        super.onBindEvent(context, view, j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        ckf.g(dXWidgetNode, "widgetNode");
        if (dXWidgetNode instanceof DXWebViewWidgetNode) {
            super.onClone(dXWidgetNode, z);
            DXWebViewWidgetNode dXWebViewWidgetNode = (DXWebViewWidgetNode) dXWidgetNode;
            this.f7408a = dXWebViewWidgetNode.f7408a;
            this.b = dXWebViewWidgetNode.b;
            this.d = dXWebViewWidgetNode.d;
            DXWebView B = B("onClone");
            if (B != null) {
                B.updateWidget(dXWebViewWidgetNode);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(final Context context) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        ckf.g(context, "context");
        System.currentTimeMillis();
        RecyclerView dXWebViewWidgetNode$onCreateView$rv$1 = new RecyclerView(context) { // from class: com.taobao.android.dinamicx.widget.DXWebViewWidgetNode$onCreateView$rv$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(DXWebViewWidgetNode$onCreateView$rv$1 dXWebViewWidgetNode$onCreateView$rv$12, String str, Object... objArr) {
                if (str.hashCode() == -244855388) {
                    super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXWebViewWidgetNode$onCreateView$rv$1");
            }

            @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
            public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                    return;
                }
                try {
                    super.onLayout(z, i, i2, i3, i4);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("dxWebRv onCreateView onLayout error : ");
                    e.printStackTrace();
                    sb.append(xhv.INSTANCE);
                    la6.d("dinamicx", "dinamicx", sb.toString());
                }
            }
        };
        dXWebViewWidgetNode$onCreateView$rv$1.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        dXWebViewWidgetNode$onCreateView$rv$1.setLayoutManager(new LinearLayoutManager(context));
        Integer num2 = null;
        dXWebViewWidgetNode$onCreateView$rv$1.setItemAnimator(null);
        dXWebViewWidgetNode$onCreateView$rv$1.setDescendantFocusability(393216);
        ViewGroup.LayoutParams layoutParams = dXWebViewWidgetNode$onCreateView$rv$1.getLayoutParams();
        if (layoutParams != null) {
            num = Integer.valueOf(layoutParams.width);
        } else {
            num = null;
        }
        ViewGroup.LayoutParams layoutParams2 = dXWebViewWidgetNode$onCreateView$rv$1.getLayoutParams();
        if (layoutParams2 != null) {
            num2 = Integer.valueOf(layoutParams2.height);
        }
        dXWebViewWidgetNode$onCreateView$rv$1.setAdapter(new WebViewAdapter(num, num2));
        return dXWebViewWidgetNode$onCreateView$rv$1;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
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
        A(new DXWebViewWidgetNode$onRenderView$1(this));
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXWEBVIEW_ENABLEAUTOLOAD) {
            if (i != 1) {
                z = false;
            }
            this.c = z;
        } else if (DXWEBVIEW_ENABLEINTERCEPTTOPSCROLL_ANDROID == j) {
            if (i != 1) {
                z = false;
            }
            this.d = z;
        } else {
            super.onSetIntAttribute(j, i);
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
        if (j == 528128262) {
            this.f7408a = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void setMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1fa015", new Object[]{this, new Long(j), jSONObject});
        } else if (j == DXRecyclerLayout.DXRECYCLERLAYOUT_SCROLLCONTROLCONFIG) {
            this.b = jSONObject;
        } else {
            super.setMapAttribute(j, jSONObject);
        }
    }

    public final void z(String str, ValueCallback<String> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c507d3e", new Object[]{this, str, valueCallback});
            return;
        }
        ckf.g(str, "funcString");
        A(new DXWebViewWidgetNode$callJS$1(this, str, valueCallback));
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/taobao/android/dinamicx/widget/DXWebViewWidgetNode$WebViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/taobao/android/dinamicx/widget/DXWebViewWidgetNode$WebViewViewHolder;", "TBDinamicX_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class WebViewAdapter extends RecyclerView.Adapter<WebViewViewHolder> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Integer f7409a;
        public final Integer b;

        public WebViewAdapter(Integer num, Integer num2) {
            this.f7409a = num;
            this.b = num2;
        }

        public static /* synthetic */ Object ipc$super(WebViewAdapter webViewAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXWebViewWidgetNode$WebViewAdapter");
        }

        /* renamed from: M */
        public void onBindViewHolder(WebViewViewHolder webViewViewHolder, int i) {
            KeyEvent.Callback callback;
            int i2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fbb8979", new Object[]{this, webViewViewHolder, new Integer(i)});
                return;
            }
            KeyEvent.Callback callback2 = null;
            if (webViewViewHolder != null) {
                callback = webViewViewHolder.itemView;
            } else {
                callback = null;
            }
            if (callback instanceof DXWebView) {
                callback2 = callback;
            }
            DXWebView dXWebView = (DXWebView) callback2;
            if (dXWebView != null) {
                Integer num = this.f7409a;
                int i3 = -1;
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = -1;
                }
                Integer num2 = this.b;
                if (num2 != null) {
                    i3 = num2.intValue();
                }
                dXWebView.setLayoutParams(new ViewGroup.LayoutParams(i2, i3));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            return 1;
        }

        /* renamed from: N */
        public WebViewViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WebViewViewHolder) ipChange.ipc$dispatch("5e24487b", new Object[]{this, viewGroup, new Integer(i)});
            }
            ckf.g(viewGroup, "viewGroup");
            Context context = viewGroup.getContext();
            ckf.f(context, "viewGroup.context");
            WebViewViewHolder webViewViewHolder = new WebViewViewHolder(new DXWebView(context, null, 2, null));
            webViewViewHolder.setIsRecyclable(false);
            return webViewViewHolder;
        }
    }
}
