package com.taobao.android.dressup.common.component.mediabrowser;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.transition.ChangeBounds;
import android.transition.ChangeClipBounds;
import android.transition.ChangeTransform;
import android.transition.TransitionSet;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.common.model.MediaBrowserModel;
import com.taobao.android.dressup.common.view.indicator.IndicatorView;
import com.taobao.android.dressup.common.view.photo.PhotoView;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.uc.webview.export.media.MessageID;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import tb.a07;
import tb.afi;
import tb.at4;
import tb.ckf;
import tb.pol;
import tb.qpu;
import tb.r6o;
import tb.sol;
import tb.t2o;
import tb.tpu;
import tb.uzq;
import tb.vjc;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\nJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/taobao/android/dressup/common/component/mediabrowser/ZoomMediaBrowserComponent;", "Lcom/taobao/android/dressup/common/component/mediabrowser/MediaBrowserComponent;", "Landroid/view/View$OnClickListener;", "Ltb/uzq$a;", "Landroid/view/View;", "v", "Ltb/xhv;", "onClick", "(Landroid/view/View;)V", "Companion", "a", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ZoomMediaBrowserComponent extends MediaBrowserComponent implements View.OnClickListener, uzq.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String ID = "ZoomMediaBrowser";
    public View o;
    public final MediaBrowserComponent p;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552645);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements pol.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.pol.a
        public void a() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8df164ae", new Object[]{this});
                return;
            }
            tpu.a.b(tpu.Companion, ZoomMediaBrowserComponent.ID, "onTransitionEnd", null, 4, null);
            ((vjc) ZoomMediaBrowserComponent.this.o().getService(vjc.class)).I().p(ZoomMediaBrowserComponent.this);
            MediaBrowserAdapter z = ZoomMediaBrowserComponent.this.U().z();
            ViewPager E = ZoomMediaBrowserComponent.this.U().E();
            if (E != null) {
                i = E.getCurrentItem();
            }
            z.w(i);
        }
    }

    static {
        t2o.a(918552644);
        t2o.a(918552808);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomMediaBrowserComponent(qpu qpuVar, MediaBrowserComponent mediaBrowserComponent) {
        super(qpuVar);
        ckf.g(qpuVar, "turboEngineContext");
        ckf.g(mediaBrowserComponent, "from");
        this.p = mediaBrowserComponent;
    }

    public static /* synthetic */ Object ipc$super(ZoomMediaBrowserComponent zoomMediaBrowserComponent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1238648751) {
            return super.createViewImpl();
        }
        if (hashCode == 15457543) {
            super.onCreate((MediaBrowserModel) objArr[0], (IComponentLifecycle$TriggerType) objArr[1]);
            return null;
        } else if (hashCode == 1703005214) {
            super.onPageScrollStateChanged(((Number) objArr[0]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dressup/common/component/mediabrowser/ZoomMediaBrowserComponent");
        }
    }

    @Override // com.taobao.android.dressup.common.component.mediabrowser.MediaBrowserComponent
    /* renamed from: H */
    public void onCreate(MediaBrowserModel mediaBrowserModel, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebdd07", new Object[]{this, mediaBrowserModel, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, ID, "onCreate data:" + mediaBrowserModel + " triggerType:" + iComponentLifecycle$TriggerType, null, 4, null);
        super.onCreate(mediaBrowserModel, iComponentLifecycle$TriggerType);
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeTransform());
        transitionSet.addTransition(new ChangeClipBounds());
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.setDuration(250L);
        transitionSet.setInterpolator((TimeInterpolator) new FastOutSlowInInterpolator());
        D().q(transitionSet);
        TransitionSet transitionSet2 = new TransitionSet();
        transitionSet2.addTransition(new ChangeTransform());
        transitionSet2.addTransition(new ChangeClipBounds());
        transitionSet2.addTransition(new ChangeBounds());
        transitionSet2.setDuration(250L);
        transitionSet2.setInterpolator((TimeInterpolator) new FastOutSlowInInterpolator());
        D().r(transitionSet2);
    }

    public final View Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("19e8003e", new Object[]{this});
        }
        TUrlImageView tUrlImageView = new TUrlImageView(getContext());
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01DF7FY127tdktvtbyJ_!!6000000007855-2-tps-96-96.png");
        at4.a aVar = at4.Companion;
        Context context = tUrlImageView.getContext();
        ckf.f(context, "context");
        int c = at4.a.c(aVar, context, 120, false, 4, null);
        Context context2 = tUrlImageView.getContext();
        ckf.f(context2, "context");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c, at4.a.c(aVar, context2, 120, false, 4, null));
        layoutParams.gravity = 51;
        r6o.a aVar2 = r6o.Companion;
        Context context3 = tUrlImageView.getContext();
        ckf.f(context3, "context");
        layoutParams.topMargin = aVar2.g(context3);
        xhv xhvVar = xhv.INSTANCE;
        tUrlImageView.setLayoutParams(layoutParams);
        Context context4 = tUrlImageView.getContext();
        ckf.f(context4, "context");
        int c2 = at4.a.c(aVar, context4, 42, false, 4, null);
        tUrlImageView.setPadding(c2, c2, c2, c2);
        tUrlImageView.setOnClickListener(this);
        return tUrlImageView;
    }

    public final void R() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, ID, "dismiss", null, 4, null);
        d();
        MediaBrowserAdapter z = z();
        ViewPager E = E();
        if (E != null) {
            i = E.getCurrentItem();
        }
        View m = z.m(i);
        if (m == null) {
            return;
        }
        if (m instanceof PhotoView) {
            ((PhotoView) m).closePage();
        } else {
            onDismiss();
        }
    }

    public final void S(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a216b4bd", new Object[]{this, view});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(100L);
        ofFloat.start();
    }

    public final void T(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f81bd32", new Object[]{this, view});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(100L);
        ofFloat.start();
    }

    public final MediaBrowserComponent U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaBrowserComponent) ipChange.ipc$dispatch("bcd7bc2a", new Object[]{this});
        }
        return this.p;
    }

    public final Drawable V(int i) {
        View m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("c2981bbc", new Object[]{this, new Integer(i)});
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, ID, "getFromDrawable position:" + i, null, 4, null);
        ViewPager E = this.p.E();
        if (E == null || i != E.getCurrentItem() || (m = this.p.z().m(i)) == null || !(m instanceof ImageView)) {
            return null;
        }
        return ((ImageView) m).getDrawable();
    }

    public final Rect W(int i) {
        View m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("4de187ec", new Object[]{this, new Integer(i)});
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, ID, "getFromPageSrcRect position:" + i, null, 4, null);
        ViewPager E = this.p.E();
        if (E == null || i != E.getCurrentItem() || (m = this.p.z().m(i)) == null) {
            return null;
        }
        return X(m);
    }

    public final Rect X(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("da588a04", new Object[]{this, view});
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Rect(iArr[0], iArr[1], view.getWidth(), view.getHeight());
    }

    @Override // tb.uzq.a
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b042fc9", new Object[]{this, new Float(f)});
        }
    }

    @Override // com.taobao.android.dressup.common.component.mediabrowser.MediaBrowserComponent, tb.fwa
    public String getComponentId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5df1a77", new Object[]{this});
        }
        return ID;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        tpu.a.b(tpu.Companion, ID, "onClick", null, 4, null);
        R();
    }

    @Override // com.taobao.android.dressup.common.component.mediabrowser.MediaBrowserComponent, androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            return;
        }
        super.onPageScrollStateChanged(i);
        if (i == 0) {
            MediaBrowserComponent mediaBrowserComponent = this.p;
            ViewPager E = E();
            if (E != null) {
                i2 = E.getCurrentItem();
            } else {
                i2 = 0;
            }
            mediaBrowserComponent.L(i2, false);
        }
    }

    @Override // com.taobao.android.dressup.common.component.mediabrowser.MediaBrowserComponent
    public int v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("751beb99", new Object[]{this})).intValue();
        }
        return -1;
    }

    @Override // com.taobao.android.dressup.common.component.mediabrowser.MediaBrowserComponent
    public IndicatorView w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IndicatorView) ipChange.ipc$dispatch("b209d4bb", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.dressup.common.component.mediabrowser.MediaBrowserComponent
    public TextView x() {
        List<afi> data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("ce217be3", new Object[]{this});
        }
        if (C() == null && (data = z().getData()) != null && (!data.isEmpty())) {
            TextView textView = new TextView(getContext());
            textView.setTextColor(-1);
            at4.a aVar = at4.Companion;
            textView.setTextSize(0, at4.a.c(aVar, getContext(), 24, false, 4, null));
            textView.setGravity(17);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, at4.a.c(aVar, getContext(), 120, false, 4, null));
            layoutParams.topMargin = r6o.Companion.g(getContext());
            layoutParams.gravity = 49;
            xhv xhvVar = xhv.INSTANCE;
            textView.setLayoutParams(layoutParams);
            M(textView);
            P(0);
        }
        return C();
    }

    @Override // tb.uzq.a
    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddf5571a", new Object[]{this, new Float(f)});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, ID, "onSwapProgress progress:" + f, null, 4, null);
        int argb = Color.argb((int) (((float) 255) * f), 0, 0, 0);
        FrameLayout frameLayout = (FrameLayout) getView();
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(argb);
        }
    }

    @Override // tb.uzq.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebd4ff7", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, ID, "onSwapStart", null, 4, null);
        View view = this.o;
        if (view != null) {
            S(view);
            TextView C = C();
            if (C != null) {
                S(C);
            }
            MediaBrowserAdapter z = this.p.z();
            ViewPager E = this.p.E();
            z.d(E != null ? E.getCurrentItem() : 0, 0L);
            MediaBrowserAdapter z2 = z();
            ViewPager E2 = E();
            MediaBrowserAdapter.e(z2, E2 != null ? E2.getCurrentItem() : 0, 0L, 2, null);
            return;
        }
        ckf.y("closeIcon");
        throw null;
    }

    @Override // com.taobao.android.dressup.common.component.mediabrowser.MediaBrowserComponent, com.taobao.android.turbo.core.component.BaseComponent
    public FrameLayout createViewImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b62bb851", new Object[]{this});
        }
        FrameLayout createViewImpl = super.createViewImpl();
        createViewImpl.setBackgroundColor(-16777216);
        View Q = Q();
        this.o = Q;
        if (Q != null) {
            createViewImpl.addView(Q);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(createViewImpl, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(100L);
            ofFloat.start();
            return createViewImpl;
        }
        ckf.y("closeIcon");
        throw null;
    }

    @Override // tb.uzq.a
    public void d() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1769484e", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, ID, "onStartDismiss", null, 4, null);
        MediaBrowserAdapter z = z();
        ViewPager E = this.p.E();
        z.d(E != null ? E.getCurrentItem() : 0, 0L);
        MediaBrowserAdapter z2 = this.p.z();
        ViewPager E2 = this.p.E();
        z2.d(E2 != null ? E2.getCurrentItem() : 0, 0L);
        MediaBrowserAdapter z3 = z();
        ViewPager E3 = E();
        View m = z3.m(E3 != null ? E3.getCurrentItem() : 0);
        if (m != null && (m instanceof PhotoView)) {
            PhotoView photoView = (PhotoView) m;
            ViewPager E4 = E();
            if (E4 != null) {
                i = E4.getCurrentItem();
            }
            photoView.setSrcRect(W(i));
        }
    }

    @Override // tb.uzq.a
    public void onDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, ID, "onDismiss", null, 4, null);
        List<Pair<View, String>> c = D().c();
        if (c == null) {
            c = new ArrayList<>();
            D().m(c);
        }
        c.clear();
        MediaBrowserAdapter z = z();
        ViewPager E = E();
        View m = z.m(E != null ? E.getCurrentItem() : 0);
        if (m != null && (m instanceof PhotoView)) {
            PhotoView photoView = (PhotoView) m;
            c.add(new Pair<>(photoView.getImageView(), photoView.getImageView().getTransitionName()));
        }
        MediaBrowserAdapter z2 = this.p.z();
        ViewPager E2 = this.p.E();
        z2.d(E2 != null ? E2.getCurrentItem() : 0, 0L);
        sol.Companion.x(this.p.D(), D(), false, new b());
    }

    @Override // tb.uzq.a
    public void onReset() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b89f37", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, ID, MessageID.onReset, null, 4, null);
        View view = this.o;
        if (view != null) {
            T(view);
            TextView C = C();
            if (C != null) {
                T(C);
            }
            MediaBrowserAdapter z = z();
            ViewPager E = E();
            z.w(E != null ? E.getCurrentItem() : 0);
            MediaBrowserAdapter z2 = this.p.z();
            ViewPager E2 = this.p.E();
            if (E2 != null) {
                i = E2.getCurrentItem();
            }
            z2.w(i);
            return;
        }
        ckf.y("closeIcon");
        throw null;
    }
}
