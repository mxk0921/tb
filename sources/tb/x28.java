package tb;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.w4d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class x28 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f31090a;
    public boolean b;
    public final rgl c = new rgl();
    public final cfc d;
    public w4d.a e;
    public final f f;
    public int g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements w4d.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f31091a;
        public final /* synthetic */ f b;
        public final /* synthetic */ RelativeLayout c;

        public a(ViewGroup viewGroup, f fVar, RelativeLayout relativeLayout) {
            this.f31091a = viewGroup;
            this.b = fVar;
            this.c = relativeLayout;
        }

        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d72e7747", new Object[]{this, view});
            } else if (this.f31091a.getLocalVisibleRect(new Rect())) {
                x28.c(x28.this, this.f31091a, this.c, view, this.b);
                x28.d(x28.this, this.c);
            } else if (!this.b.b) {
            } else {
                if (x28.a(x28.this, this.c)) {
                    fve.e("Home.DXFloatingLayerView", "dx downloadListener回调重复调用，已经添加过视图了 这里不重复add");
                    return;
                }
                this.c.addView(view);
                this.f31091a.addView(this.c);
                this.c.setTag(R.id.overlay_overlay_view_tag, this.b.d);
                x28.b(x28.this, this.c, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements IDxItemRenderService.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IDxItemRenderService f31092a;
        public final /* synthetic */ BaseSectionModel b;
        public final /* synthetic */ ViewGroup c;
        public final /* synthetic */ BaseSectionModel d;
        public final /* synthetic */ w4d.b e;

        public b(IDxItemRenderService iDxItemRenderService, BaseSectionModel baseSectionModel, ViewGroup viewGroup, BaseSectionModel baseSectionModel2, w4d.b bVar) {
            this.f31092a = iDxItemRenderService;
            this.b = baseSectionModel;
            this.c = viewGroup;
            this.d = baseSectionModel2;
            this.e = bVar;
        }

        @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService.b
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            View e = x28.e(x28.this, this.f31092a, this.c, this.f31092a.getViewType(this.b), this.b, this.d);
            if (e != null) {
                ((a) this.e).a(e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f31093a;

        public c(f fVar) {
            this.f31093a = fVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            } else if (!this.f31093a.b) {
                view.setVisibility(4);
                if (view.getParent() != null && !x28.f(x28.this)) {
                    x28.g(x28.this, true);
                    ((ViewGroup) view.getParent()).removeView(view);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f31095a;

        public e(View view) {
            this.f31095a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                x28.h(x28.this, this.f31095a);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public boolean f31096a;
        public boolean b = false;
        public int c = 150;
        public String d = "";

        static {
            t2o.a(491782485);
        }
    }

    static {
        t2o.a(491782479);
    }

    public x28(cfc cfcVar) {
        f fVar = new f();
        this.f = fVar;
        this.g = fVar.c;
        this.d = cfcVar;
    }

    public static /* synthetic */ boolean a(x28 x28Var, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70bed011", new Object[]{x28Var, view})).booleanValue();
        }
        return x28Var.o(view);
    }

    public static /* synthetic */ void b(x28 x28Var, View view, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ef4542c", new Object[]{x28Var, view, fVar});
        } else {
            x28Var.r(view, fVar);
        }
    }

    public static /* synthetic */ void c(x28 x28Var, ViewGroup viewGroup, ViewGroup viewGroup2, View view, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("618f2b4d", new Object[]{x28Var, viewGroup, viewGroup2, view, fVar});
        } else {
            x28Var.s(viewGroup, viewGroup2, view, fVar);
        }
    }

    public static /* synthetic */ ViewGroup d(x28 x28Var, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("7c69b94c", new Object[]{x28Var, viewGroup});
        }
        x28Var.f31090a = viewGroup;
        return viewGroup;
    }

    public static /* synthetic */ View e(x28 x28Var, IDxItemRenderService iDxItemRenderService, ViewGroup viewGroup, int i, BaseSectionModel baseSectionModel, BaseSectionModel baseSectionModel2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("14ecde8", new Object[]{x28Var, iDxItemRenderService, viewGroup, new Integer(i), baseSectionModel, baseSectionModel2});
        }
        return x28Var.i(iDxItemRenderService, viewGroup, i, baseSectionModel, baseSectionModel2);
    }

    public static /* synthetic */ boolean f(x28 x28Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8204abee", new Object[]{x28Var})).booleanValue();
        }
        return x28Var.b;
    }

    public static /* synthetic */ boolean g(x28 x28Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f87af6c", new Object[]{x28Var, new Boolean(z)})).booleanValue();
        }
        x28Var.b = z;
        return z;
    }

    public static /* synthetic */ void h(x28 x28Var, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e97930c7", new Object[]{x28Var, view});
        } else {
            x28Var.p(view);
        }
    }

    public final View i(IDxItemRenderService iDxItemRenderService, ViewGroup viewGroup, int i, BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b596a44b", new Object[]{this, iDxItemRenderService, viewGroup, new Integer(i), baseSectionModel, baseSectionModel2});
        }
        BaseSectionModel<?> createBaseSectionModel = baseSectionModel.createBaseSectionModel(baseSectionModel);
        View createView = iDxItemRenderService.createView(viewGroup, i);
        if (createView == null) {
            fve.e("Home.DXFloatingLayerView", "addDxView view == null");
            return null;
        }
        iDxItemRenderService.bindData(createView, createBaseSectionModel);
        this.e.a(createBaseSectionModel, baseSectionModel2);
        return createView;
    }

    public final Animation.AnimationListener j(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation.AnimationListener) ipChange.ipc$dispatch("89a7f6", new Object[]{this, view});
        }
        return new e(view);
    }

    public final void k(IDxItemRenderService iDxItemRenderService, ViewGroup viewGroup, BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2, w4d.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1420a3cc", new Object[]{this, iDxItemRenderService, viewGroup, baseSectionModel, baseSectionModel2, bVar});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseSectionModel);
        iDxItemRenderService.downloadTemplate(arrayList, new b(iDxItemRenderService, baseSectionModel, viewGroup, baseSectionModel2, bVar));
    }

    public final void l(IDxItemRenderService iDxItemRenderService, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79001716", new Object[]{this, iDxItemRenderService, baseSectionModel});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseSectionModel);
        iDxItemRenderService.downloadTemplate(arrayList, null);
    }

    public final BaseSectionModel<?> m(Context context, ViewGroup viewGroup, BaseSectionModel<?> baseSectionModel, View view, f fVar) {
        View view2;
        View view3;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("b713dbd2", new Object[]{this, context, viewGroup, baseSectionModel, view, fVar});
        }
        rgl rglVar = this.c;
        if (view == null) {
            view2 = viewGroup;
        } else {
            view2 = view;
        }
        int a2 = rglVar.a(view2);
        rgl rglVar2 = this.c;
        if (view == null) {
            view3 = viewGroup;
        } else {
            view3 = view;
        }
        int b2 = rglVar2.b(view3);
        if (view != null) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr);
            viewGroup.getLocationOnScreen(iArr2);
            int i3 = iArr[0] - iArr2[0];
            i = iArr[1] - iArr2[1];
            i2 = i3;
        } else {
            i2 = 0;
            i = 0;
        }
        return this.c.c(baseSectionModel, context, b2, a2, i2, i, fVar.b);
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4176c8c2", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.f31090a;
        if (viewGroup != null && viewGroup.getParent() != null && !this.b) {
            viewGroup.setTag(R.id.overlay_overlay_view_tag, null);
            this.b = true;
            v(viewGroup, j(viewGroup));
        }
    }

    public final boolean o(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80305965", new Object[]{this, view})).booleanValue();
        }
        return view.getParent() instanceof ViewGroup;
    }

    public final void p(View view) {
        ViewParent parent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("488520af", new Object[]{this, view});
        } else if (view != null && (parent = view.getParent()) != null) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public void q(w4d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8f5f933", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }

    public final void r(View view, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b75f88", new Object[]{this, view, fVar});
            return;
        }
        view.addOnAttachStateChangeListener(new c(fVar));
        if (fVar == null || !fVar.f31096a) {
            ViewProxy.setOnTouchListener(view, new d(fVar));
        }
    }

    public final void s(ViewGroup viewGroup, ViewGroup viewGroup2, View view, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57232a95", new Object[]{this, viewGroup, viewGroup2, view, fVar});
        } else if (o(viewGroup2)) {
            fve.e("Home.DXFloatingLayerView", "dx downloadListener回调重复调用，已经添加过视图了 这里不重复add");
        } else {
            viewGroup2.addView(view);
            viewGroup.addView(viewGroup2);
            viewGroup2.setTag(R.id.overlay_overlay_view_tag, fVar.d);
            r(viewGroup2, fVar);
            u(viewGroup2);
        }
    }

    public void t(Context context, ViewGroup viewGroup, BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2, View view, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e04a9db5", new Object[]{this, context, viewGroup, baseSectionModel, baseSectionModel2, view, fVar});
        } else if (baseSectionModel2.containsKey("template")) {
            if (fVar == null) {
                fVar = this.f;
            }
            this.g = fVar.c;
            RelativeLayout relativeLayout = new RelativeLayout(context);
            w(relativeLayout, m(context, viewGroup, baseSectionModel2, view, fVar), baseSectionModel, new a(viewGroup, fVar, relativeLayout));
        }
    }

    public final void u(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4addc9d", new Object[]{this, view});
            return;
        }
        try {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(this.g);
            view.startAnimation(alphaAnimation);
        } catch (Exception e2) {
            fve.d("enter animation overlay met exception.", e2, new String[0]);
        }
    }

    public final void v(View view, Animation.AnimationListener animationListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64a1b3d3", new Object[]{this, view, animationListener});
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(this.g);
        alphaAnimation.setAnimationListener(animationListener);
        view.startAnimation(alphaAnimation);
    }

    public final void w(ViewGroup viewGroup, BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2, w4d.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b33f8907", new Object[]{this, viewGroup, baseSectionModel, baseSectionModel2, bVar});
            return;
        }
        IDxItemRenderService iDxItemRenderService = (IDxItemRenderService) this.d.a(IDxItemRenderService.class);
        if (iDxItemRenderService != null) {
            View i = i(iDxItemRenderService, viewGroup, iDxItemRenderService.getViewType(baseSectionModel), baseSectionModel, baseSectionModel2);
            if (i != null) {
                ((a) bVar).a(i);
                l(iDxItemRenderService, baseSectionModel);
                return;
            }
            k(iDxItemRenderService, viewGroup, baseSectionModel, baseSectionModel2, bVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f31094a;

        public d(f fVar) {
            this.f31094a = fVar;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            this.f31094a.getClass();
            if (motionEvent.getAction() != 0) {
                return false;
            }
            fve.e("Home.DXFloatingLayerView", "popupView.setOnTouchListener.onTouch");
            if (!this.f31094a.b) {
                x28.this.n();
            }
            return true;
        }
    }
}
