package tb;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseTemplateModel;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.utils.Global;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class d38 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public o6h f17539a;
    public final cfc b;
    public int c = 0;
    public ViewTreeObserver.OnGlobalLayoutListener d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(d38 d38Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                d38.a(d38.this).dismiss();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f17541a;

        public c(View view) {
            this.f17541a = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int i;
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
            } else if (d38.a(d38.this) != null && d38.a(d38.this).isShowing()) {
                Rect rect = new Rect();
                this.f17541a.getWindowVisibleDisplayFrame(rect);
                int i3 = rect.bottom - rect.top;
                int a2 = b65.a(10.0f);
                if (this.f17541a.getMeasuredHeight() - i3 >= a2) {
                    i2 = bxo.a() - i3;
                    i = (bxo.a() - i2) + a2;
                } else {
                    i = bxo.a();
                }
                if (d38.b(d38.this) != i2) {
                    d38.c(d38.this, i2);
                    d38.a(d38.this).getWindow().setLayout(bxo.b(), i);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements DialogInterface.OnDismissListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DialogInterface.OnDismissListener f17542a;
        public final /* synthetic */ View b;

        public d(DialogInterface.OnDismissListener onDismissListener, View view) {
            this.f17542a = onDismissListener;
            this.b = view;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                return;
            }
            d38.c(d38.this, 0);
            this.f17542a.onDismiss(dialogInterface);
            this.b.getViewTreeObserver().removeOnGlobalLayoutListener(d38.d(d38.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f17543a;

        public e(View view) {
            this.f17543a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            DXWidgetNode widgetNode;
            DXWidgetNode queryWidgetNodeByUserId;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            View view = this.f17543a;
            if ((view instanceof DXRootView) && (widgetNode = ((DXRootView) view).getWidgetNode()) != null && (queryWidgetNodeByUserId = widgetNode.queryWidgetNodeByUserId("textInputView")) != null) {
                View nativeView = queryWidgetNodeByUserId.getNativeView();
                if (nativeView instanceof EditText) {
                    nativeView.setFocusable(true);
                    nativeView.setFocusableInTouchMode(true);
                    nativeView.requestFocus();
                    ((EditText) nativeView).setCursorVisible(true);
                    d38.e(d38.this, Global.getApplication(), nativeView);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FrameLayout f17544a;
        public final /* synthetic */ DialogInterface.OnDismissListener b;

        public f(FrameLayout frameLayout, DialogInterface.OnDismissListener onDismissListener) {
            this.f17544a = frameLayout;
            this.b = onDismissListener;
        }

        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d72e7747", new Object[]{this, view});
            } else if (view != null) {
                d38.this.h(this.f17544a, view, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class g implements IDxItemRenderService.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IDxItemRenderService f17545a;
        public final /* synthetic */ BaseSectionModel b;
        public final /* synthetic */ ViewGroup c;
        public final /* synthetic */ h d;

        public g(IDxItemRenderService iDxItemRenderService, BaseSectionModel baseSectionModel, ViewGroup viewGroup, h hVar) {
            this.f17545a = iDxItemRenderService;
            this.b = baseSectionModel;
            this.c = viewGroup;
            this.d = hVar;
        }

        @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService.b
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            View f = d38.f(this.f17545a, this.c, this.f17545a.getViewType(this.b), this.b);
            if (f != null) {
                ((f) this.d).a(f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface h {
    }

    static {
        t2o.a(729809412);
    }

    public d38(cfc cfcVar) {
        this.b = cfcVar;
    }

    public static /* synthetic */ o6h a(d38 d38Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o6h) ipChange.ipc$dispatch("fc67703a", new Object[]{d38Var});
        }
        return d38Var.f17539a;
    }

    public static /* synthetic */ int b(d38 d38Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("acf27d5", new Object[]{d38Var})).intValue();
        }
        return d38Var.c;
    }

    public static /* synthetic */ int c(d38 d38Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5d680bd6", new Object[]{d38Var, new Integer(i)})).intValue();
        }
        d38Var.c = i;
        return i;
    }

    public static /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener d(d38 d38Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewTreeObserver.OnGlobalLayoutListener) ipChange.ipc$dispatch("6a982a3", new Object[]{d38Var});
        }
        return d38Var.d;
    }

    public static /* synthetic */ void e(d38 d38Var, Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a74cbaa", new Object[]{d38Var, context, view});
        } else {
            d38Var.l(context, view);
        }
    }

    public static /* synthetic */ View f(IDxItemRenderService iDxItemRenderService, ViewGroup viewGroup, int i, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b017f2", new Object[]{iDxItemRenderService, viewGroup, new Integer(i), baseSectionModel});
        }
        return g(iDxItemRenderService, viewGroup, i, baseSectionModel);
    }

    public static View g(IDxItemRenderService iDxItemRenderService, ViewGroup viewGroup, int i, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("61a32d4a", new Object[]{iDxItemRenderService, viewGroup, new Integer(i), baseSectionModel});
        }
        BaseSectionModel createBaseSectionModel = baseSectionModel.createBaseSectionModel(baseSectionModel);
        View createView = iDxItemRenderService.createView(viewGroup, i);
        if (createView == null) {
            fve.e("Home.DXFloatingLayerView", "addDxView view == null");
            return null;
        }
        iDxItemRenderService.bindData(createView, createBaseSectionModel);
        return createView;
    }

    public static void i(IDxItemRenderService iDxItemRenderService, ViewGroup viewGroup, BaseSectionModel<?> baseSectionModel, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5295f9a", new Object[]{iDxItemRenderService, viewGroup, baseSectionModel, hVar});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseSectionModel);
        iDxItemRenderService.downloadTemplate(arrayList, new g(iDxItemRenderService, baseSectionModel, viewGroup, hVar));
    }

    public static void j(IDxItemRenderService iDxItemRenderService, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79001716", new Object[]{iDxItemRenderService, baseSectionModel});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseSectionModel);
        iDxItemRenderService.downloadTemplate(arrayList, null);
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5360aae5", new Object[]{this});
            return;
        }
        o6h o6hVar = this.f17539a;
        if (o6hVar != null) {
            o6hVar.dismiss();
        }
    }

    public final void l(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("464512de", new Object[]{this, context, view});
        } else {
            ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(view, 0);
        }
    }

    public void m(Context context, BaseSectionModel<?> baseSectionModel, DialogInterface.OnDismissListener onDismissListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45a66d9b", new Object[]{this, context, baseSectionModel, onDismissListener});
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        if (baseSectionModel.containsKey("template")) {
            BaseTemplateModel template = baseSectionModel.getTemplate();
            if (template != null) {
                template.put("isEnableButter", (Object) Boolean.TRUE);
            }
            n(frameLayout, baseSectionModel, new f(frameLayout, onDismissListener));
        }
    }

    public final void n(ViewGroup viewGroup, BaseSectionModel<?> baseSectionModel, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9059429c", new Object[]{this, viewGroup, baseSectionModel, hVar});
            return;
        }
        IDxItemRenderService iDxItemRenderService = (IDxItemRenderService) this.b.a(IDxItemRenderService.class);
        if (iDxItemRenderService != null) {
            View g2 = g(iDxItemRenderService, viewGroup, iDxItemRenderService.getViewType(baseSectionModel), baseSectionModel);
            if (g2 != null) {
                ((f) hVar).a(g2);
                j(iDxItemRenderService, baseSectionModel);
                return;
            }
            i(iDxItemRenderService, viewGroup, baseSectionModel, hVar);
        }
    }

    public void h(FrameLayout frameLayout, View view, DialogInterface.OnDismissListener onDismissListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20931f7e", new Object[]{this, frameLayout, view, onDismissListener});
            return;
        }
        o6h o6hVar = this.f17539a;
        if (o6hVar != null && o6hVar.isShowing()) {
            this.f17539a.hide();
        }
        z6d c2 = h2b.a().c();
        if (c2 == null) {
            bqa.d("Home.DxRecbotViewWidget", "IPageProvider is null");
            return;
        }
        Activity k1 = c2.k1();
        if (k1 == null) {
            bqa.d("Home.DxRecbotViewWidget", "Activity is null ");
        } else if (frameLayout == null) {
            bqa.d("Home.DxRecbotViewWidget", "recbotView is null ");
        } else {
            o6h o6hVar2 = new o6h(k1, R.style.Dialog_Status_Container);
            this.f17539a = o6hVar2;
            o6hVar2.getWindow().setSoftInputMode(20);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(view.getLayoutParams().width, view.getLayoutParams().height);
            layoutParams.gravity = 80;
            ViewProxy.setOnClickListener(view, new a(this));
            frameLayout.setOnClickListener(new b());
            frameLayout.addView(view, layoutParams);
            frameLayout.setBackgroundColor(Color.argb(153, 0, 0, 0));
            View rootView = this.f17539a.findViewById(16908290).getRootView();
            ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
            c cVar = new c(rootView);
            this.d = cVar;
            viewTreeObserver.addOnGlobalLayoutListener(cVar);
            this.f17539a.setContentView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
            this.f17539a.setOnDismissListener(new d(onDismissListener, rootView));
            this.f17539a.e(bxo.b(), bxo.a(), 48, false);
            this.f17539a.show();
            get.a().f(new e(view), 300L);
        }
    }
}
