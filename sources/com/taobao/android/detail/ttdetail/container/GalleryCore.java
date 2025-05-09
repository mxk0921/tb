package com.taobao.android.detail.ttdetail.container;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.transition.TransitionManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker;
import com.taobao.android.detail.ttdetail.behavior.UserBehaviorUtils;
import com.taobao.android.detail.ttdetail.bizmessage.ShowLightOffMessage;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.feature.DevFeature;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.lightoff.LightOffDialog;
import com.taobao.android.detail.ttdetail.lightoff.LightOffLayerManger;
import com.taobao.android.detail.ttdetail.minivideo.MiniVideoType;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.detail.ttdetail.utils.PerformanceUtils;
import com.taobao.android.detail.ttdetail.utils.RuntimeUtils;
import com.taobao.android.detail.ttdetail.utils.UtUtils;
import com.taobao.android.detail.ttdetail.widget.ExtraHeightLinearLayout;
import com.taobao.android.detail.ttdetail.widget.PendingPopulateViewPager;
import com.taobao.android.detail.ttdetail.widget.TTObservedImageView;
import com.taobao.android.detail.ttdetail.widget.TTViewPager;
import com.taobao.android.detail.ttdetail.widget.WidthRatioFrameLayout;
import com.taobao.android.detail.ttdetail.widget.video.VideoView;
import com.taobao.ptr.PtrBase;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.a4a;
import tb.b8z;
import tb.cg2;
import tb.cva;
import tb.cy9;
import tb.ie8;
import tb.jov;
import tb.jpt;
import tb.mpe;
import tb.mr7;
import tb.nb4;
import tb.ntc;
import tb.oa4;
import tb.och;
import tb.ohq;
import tb.oqv;
import tb.q84;
import tb.r3q;
import tb.r8c;
import tb.rcw;
import tb.rql;
import tb.rua;
import tb.sx9;
import tb.t2o;
import tb.tgh;
import tb.tx9;
import tb.u3a;
import tb.u5m;
import tb.ux1;
import tb.v3a;
import tb.vbl;
import tb.vua;
import tb.w3a;
import tb.wua;
import tb.x3a;
import tb.xka;
import tb.y3a;
import tb.yc4;
import tb.yqk;
import tb.ze7;
import tb.zui;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class GalleryCore implements ntc<ux1> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long D;
    public int E;
    public boolean F;
    public int G;
    public boolean O;
    public String P;
    public final Context b;
    public final ze7 c;
    public wua d;
    public ConstraintLayout e;
    public l f;
    public LightOffDialog g;
    public zui h;
    public PtrBase i;
    public PendingPopulateViewPager j;
    public View m;
    public TextView n;
    public TextView o;
    public TextView p;
    public r8c q;
    public ValueAnimator r;
    public ValueAnimator s;
    public volatile boolean t;
    public volatile boolean u;
    public volatile boolean v;
    public int z;

    /* renamed from: a  reason: collision with root package name */
    public final float f6714a = cva.c();
    public final MainAdapter k = new MainAdapter();
    public int l = -1;
    public volatile boolean w = true;
    public float x = 0.0f;
    public float y = 0.0f;
    public volatile boolean A = true;
    public volatile boolean B = false;
    public final Boolean C = DevFeature.mFeature.get(DevFeature.sHeaderFlingMode);
    public final TTViewPager.e H = new TTViewPager.e() { // from class: com.taobao.android.detail.ttdetail.container.GalleryCore.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f6715a;
        public int b = -1;

        public static /* synthetic */ int b(AnonymousClass1 r4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d172afef", new Object[]{r4})).intValue();
            }
            return r4.b;
        }

        @Override // com.taobao.android.detail.ttdetail.widget.TTViewPager.e
        public void a(int i2, int i3, float f2, int i4) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a38f8204", new Object[]{this, new Integer(i2), new Integer(i3), new Float(f2), new Integer(i4)});
                return;
            }
            if (!GalleryCore.a(GalleryCore.this) && !GalleryCore.b(GalleryCore.this)) {
                if (Math.abs((i3 * 0.5f) - i4) <= 2.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (GalleryCore.p(GalleryCore.this).getScrollState() != 0 || !z) {
                    GalleryCore.H(GalleryCore.this, c(i2, f2), d(f2));
                } else {
                    float B = GalleryCore.B(GalleryCore.this, i2, 1.0f);
                    GalleryCore galleryCore = GalleryCore.this;
                    GalleryCore.G(galleryCore, B, !GalleryCore.E(galleryCore));
                }
                GalleryCore.F(GalleryCore.this, false);
            }
            if (GalleryCore.E(GalleryCore.this) && !GalleryCore.I(GalleryCore.this).e().o()) {
                GalleryCore.F(GalleryCore.this, false);
            }
        }

        public final int c(int i2, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e5d339b5", new Object[]{this, new Integer(i2), new Float(f2)})).intValue();
            }
            if (Float.compare(f2 - 0.5f, 0.0f) < 0) {
                i2--;
            }
            if (GalleryCore.J(GalleryCore.this) && i2 < 0) {
                i2 += GalleryCore.K(GalleryCore.this).getCount();
            }
            return Math.max(0, Math.min(i2, GalleryCore.K(GalleryCore.this).getCount() - 1));
        }

        public final float d(float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5ab13018", new Object[]{this, new Float(f2)})).floatValue();
            }
            float f3 = f2 - 0.5f;
            if (Float.compare(f3, 0.0f) >= 0) {
                return f3;
            }
            return f3 + 1.0f;
        }

        @Override // com.taobao.android.detail.ttdetail.widget.TTViewPager.e
        public void onPageSelected(int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i2)});
            } else if (GalleryCore.p(GalleryCore.this).getScrollState() == 0) {
                sx9 l2 = GalleryCore.K(GalleryCore.this).l(i2);
                String l3 = yc4.l(l2);
                if (GalleryCore.c(GalleryCore.this) != -1 || !TextUtils.isEmpty(l3)) {
                    GalleryCore.d(GalleryCore.this, l2);
                }
                GalleryCore.e(GalleryCore.this, i2);
            } else {
                if (GalleryCore.p(GalleryCore.this).getModeScroll() != 1) {
                    GalleryCore.d(GalleryCore.this, GalleryCore.K(GalleryCore.this).l(i2));
                }
                GalleryCore.e(GalleryCore.this, i2);
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.TTViewPager.e
        public void onPageScrollStateChanged(int i2) {
            int i3;
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i2)});
                return;
            }
            if (i2 == 0) {
                int currentItem = GalleryCore.p(GalleryCore.this).getCurrentItem();
                GalleryCore.f(GalleryCore.this, currentItem);
                if (!GalleryCore.I(GalleryCore.this).e().o() && this.f6715a && (i3 = this.b) != -1 && currentItem != i3) {
                    oa4 g2 = yc4.g(currentItem, GalleryCore.K(GalleryCore.this).m());
                    if (g2 instanceof sx9) {
                        sx9 sx9Var = (sx9) g2;
                        HashMap<String, String> hashMap = new HashMap<String, String>(currentItem, sx9Var, RuntimeUtils.c(sx9Var.v(1))) { // from class: com.taobao.android.detail.ttdetail.container.GalleryCore.1.1
                            public final /* synthetic */ int val$currentPosition;
                            public final /* synthetic */ String val$floatComponentName;
                            public final /* synthetic */ sx9 val$frameComponent;

                            {
                                String str3;
                                this.val$currentPosition = currentItem;
                                this.val$frameComponent = sx9Var;
                                this.val$floatComponentName = r6;
                                put("source_index", AnonymousClass1.b(AnonymousClass1.this) + "");
                                put("target_index", currentItem + "");
                                if (sx9Var.M()) {
                                    str3 = "video";
                                } else {
                                    str3 = "image";
                                }
                                put("target_frame_type", str3);
                                if (!TextUtils.isEmpty(r6)) {
                                    put("target_frame_float_id", r6);
                                }
                            }
                        };
                        Context g3 = GalleryCore.g(GalleryCore.this);
                        if (GalleryCore.h(GalleryCore.this) < 0) {
                            str = "rightSlide";
                        } else {
                            str = "leftSlide";
                        }
                        UserBehaviorTracker.l(g3, UserBehaviorUtils.COMPONENT_NAME_GALLERY_CONTAINER, str, hashMap);
                        JSONObject c2 = UtUtils.c(GalleryCore.I(GalleryCore.this).e());
                        if (GalleryCore.h(GalleryCore.this) < 0) {
                            str2 = "right";
                        } else {
                            str2 = "left";
                        }
                        c2.put("direction", (Object) str2);
                        c2.put("isSwipe", (Object) "1");
                        c2.putAll(hashMap);
                        oa4 v = sx9Var.v(0);
                        if (v instanceof u3a) {
                            c2.putAll(((u3a) v).x());
                        }
                        UtUtils.f(2101, "Page_Detail_Button_DetailPic_Swipe", c2);
                    }
                }
                this.f6715a = false;
            }
            if (i2 == 1) {
                this.f6715a = true;
                this.b = GalleryCore.p(GalleryCore.this).getCurrentItem();
            }
        }
    };
    public final yqk I = new h();
    public final VideoView.d J = new b();
    public final LightOffDialog.i K = new d();
    public final LightOffDialog.h L = new e();
    public final LightOffDialog.g M = new f();
    public final Runnable N = new g();
    public final JSONObject Q = new JSONObject();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f6716a;

        public a(boolean z) {
            this.f6716a = z;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/container/GalleryCore$10");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            GalleryCore.x(GalleryCore.this, this.f6716a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends VideoView.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -742210244) {
                super.onVideoComplete();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/container/GalleryCore$11");
        }

        @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.d, tb.ztb
        public void onVideoComplete() {
            int currentItem;
            sx9 l;
            int i;
            sx9 l2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                return;
            }
            super.onVideoComplete();
            if (GalleryCore.q(GalleryCore.this) && (l = GalleryCore.K(GalleryCore.this).l((currentItem = GalleryCore.p(GalleryCore.this).getCurrentItem()))) != null && l.M() && (l2 = GalleryCore.K(GalleryCore.this).l((i = currentItem + 1))) != null && l2.M()) {
                GalleryCore.p(GalleryCore.this).setCurrentItem(i, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6718a;

        public c(String str) {
            this.f6718a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                GalleryCore.y(GalleryCore.this).setText(this.f6718a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements LightOffDialog.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.android.detail.ttdetail.lightoff.LightOffDialog.i
        public void a(LightOffDialog lightOffDialog, sx9 sx9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e86cbd6c", new Object[]{this, lightOffDialog, sx9Var});
            } else if (sx9Var != null) {
                String g = ((tx9) sx9Var.getComponentData()).g();
                if (GalleryCore.z(GalleryCore.this).t()) {
                    GalleryCore.z(GalleryCore.this).k(sx9Var.F());
                }
                GalleryCore galleryCore = GalleryCore.this;
                if (!sx9Var.N()) {
                    g = null;
                }
                GalleryCore.A(galleryCore, g);
            }
        }

        @Override // com.taobao.android.detail.ttdetail.lightoff.LightOffDialog.i
        public void b(LightOffDialog lightOffDialog, sx9 sx9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63ce951e", new Object[]{this, lightOffDialog, sx9Var});
                return;
            }
            UserBehaviorTracker.j(GalleryCore.g(GalleryCore.this), UserBehaviorUtils.COMPONENT_NAME_GALLERY_LIGHTOFF_CONTAINER, 2);
            if (sx9Var != null) {
                if (GalleryCore.z(GalleryCore.this).t()) {
                    GalleryCore.z(GalleryCore.this).x(sx9Var.F());
                }
                GalleryCore.C(GalleryCore.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements LightOffDialog.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        public void a(sx9 sx9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5be11d1", new Object[]{this, sx9Var});
            } else if (sx9Var != null) {
                String g = ((tx9) sx9Var.getComponentData()).g();
                int count = GalleryCore.K(GalleryCore.this).getCount();
                for (int i = 0; i < count; i++) {
                    sx9 l = GalleryCore.K(GalleryCore.this).l(i);
                    if (l != null && TextUtils.equals(g, ((tx9) l.getComponentData()).g()) && i != GalleryCore.p(GalleryCore.this).getCurrentItem()) {
                        GalleryCore.p(GalleryCore.this).setCurrentItem(i, false);
                        GalleryCore.d(GalleryCore.this, l);
                        return;
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements LightOffDialog.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.taobao.android.detail.ttdetail.lightoff.LightOffDialog.g
        public Rect a(sx9 sx9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Rect) ipChange.ipc$dispatch("4336ea7a", new Object[]{this, sx9Var});
            }
            Rect D = GalleryCore.D(GalleryCore.this, sx9Var);
            if (D != null && !D.isEmpty()) {
                return D;
            }
            int f = (int) (mr7.f(GalleryCore.g(GalleryCore.this)) / 2.0f);
            return new Rect(f - 1, -1, f + 1, 0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View findViewById;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if ((GalleryCore.g(GalleryCore.this) instanceof Activity) && (findViewById = ((Activity) GalleryCore.g(GalleryCore.this)).findViewById(R.id.cl_image_holder_container)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class h implements yqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        public void a(String str, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b6909a56", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            sx9 l = GalleryCore.K(GalleryCore.this).l(GalleryCore.p(GalleryCore.this).getCurrentItem());
            if (l != null && TextUtils.equals(str, ((tx9) l.getComponentData()).g())) {
                GalleryCore.G(GalleryCore.this, (i3 * 1.0f) / i4, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f6724a;

        public i(ViewGroup viewGroup) {
            this.f6724a = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f6724a.requestLayout();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class j implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            String t = GalleryCore.t(GalleryCore.this, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            ((ConstraintLayout.LayoutParams) GalleryCore.s(GalleryCore.this).getLayoutParams()).dimensionRatio = t;
            GalleryCore.s(GalleryCore.this).requestLayout();
            GalleryCore.u(GalleryCore.this, t);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class k implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ValueAnimator f6726a;
        public final /* synthetic */ boolean b;

        public k(ValueAnimator valueAnimator, boolean z) {
            this.f6726a = valueAnimator;
            this.b = z;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            GalleryCore galleryCore = GalleryCore.this;
            float floatValue = ((Float) this.f6726a.getAnimatedValue()).floatValue();
            if (this.b) {
                f = GalleryCore.v(GalleryCore.this);
            } else {
                f = 0.0f;
            }
            GalleryCore.w(galleryCore, floatValue, f);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface l {
        void a(sx9 sx9Var);
    }

    static {
        t2o.a(912261487);
        t2o.a(912261362);
    }

    public GalleryCore(Context context, ze7 ze7Var) {
        this.b = context;
        if (!jpt.a(context)) {
            context.setTheme(R.style.Theme_AppCompat_Wrapper);
        }
        this.c = ze7Var;
        com.taobao.android.detail.ttdetail.widget.video.a.d().a(context);
        q84.i(context, ShowLightOffMessage.class, this);
        q84.i(context, oqv.class, this);
        k0();
    }

    public static /* synthetic */ void A(GalleryCore galleryCore, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d4e097", new Object[]{galleryCore, str});
        } else {
            galleryCore.B0(str);
        }
    }

    public static /* synthetic */ float B(GalleryCore galleryCore, int i2, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42bc7e46", new Object[]{galleryCore, new Integer(i2), new Float(f2)})).floatValue();
        }
        return galleryCore.U(i2, f2);
    }

    public static /* synthetic */ void C(GalleryCore galleryCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b8d1023", new Object[]{galleryCore});
        } else {
            galleryCore.S0();
        }
    }

    public static /* synthetic */ Rect D(GalleryCore galleryCore, sx9 sx9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("288117ee", new Object[]{galleryCore, sx9Var});
        }
        return galleryCore.u0(sx9Var);
    }

    public static /* synthetic */ boolean E(GalleryCore galleryCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6289b7e", new Object[]{galleryCore})).booleanValue();
        }
        return galleryCore.w;
    }

    public static /* synthetic */ boolean F(GalleryCore galleryCore, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbad8e5c", new Object[]{galleryCore, new Boolean(z)})).booleanValue();
        }
        galleryCore.w = z;
        return z;
    }

    public static /* synthetic */ void G(GalleryCore galleryCore, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3e63cf", new Object[]{galleryCore, new Float(f2), new Boolean(z)});
        } else {
            galleryCore.E0(f2, z);
        }
    }

    public static /* synthetic */ void H(GalleryCore galleryCore, int i2, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d600f199", new Object[]{galleryCore, new Integer(i2), new Float(f2)});
        } else {
            galleryCore.D0(i2, f2);
        }
    }

    public static /* synthetic */ ze7 I(GalleryCore galleryCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("6602e01d", new Object[]{galleryCore});
        }
        return galleryCore.c;
    }

    public static /* synthetic */ boolean J(GalleryCore galleryCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d267b82", new Object[]{galleryCore})).booleanValue();
        }
        return galleryCore.F;
    }

    public static /* synthetic */ MainAdapter K(GalleryCore galleryCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainAdapter) ipChange.ipc$dispatch("e1159891", new Object[]{galleryCore});
        }
        return galleryCore.k;
    }

    public static /* synthetic */ boolean a(GalleryCore galleryCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf2abb7a", new Object[]{galleryCore})).booleanValue();
        }
        return galleryCore.o0();
    }

    public static /* synthetic */ boolean b(GalleryCore galleryCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1cea337b", new Object[]{galleryCore})).booleanValue();
        }
        return galleryCore.p0();
    }

    public static /* synthetic */ int c(GalleryCore galleryCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("772dffd8", new Object[]{galleryCore})).intValue();
        }
        return galleryCore.l;
    }

    public static /* synthetic */ void d(GalleryCore galleryCore, sx9 sx9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dd4ff27", new Object[]{galleryCore, sx9Var});
        } else {
            galleryCore.s0(sx9Var);
        }
    }

    public static /* synthetic */ void e(GalleryCore galleryCore, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f17ffc", new Object[]{galleryCore, new Integer(i2)});
        } else {
            galleryCore.l0(i2);
        }
    }

    public static /* synthetic */ void f(GalleryCore galleryCore, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad21081b", new Object[]{galleryCore, new Integer(i2)});
        } else {
            galleryCore.m0(i2);
        }
    }

    public static /* synthetic */ Context g(GalleryCore galleryCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c94918e2", new Object[]{galleryCore});
        }
        return galleryCore.b;
    }

    public static /* synthetic */ int h(GalleryCore galleryCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49aacfde", new Object[]{galleryCore})).intValue();
        }
        return galleryCore.G;
    }

    public static /* synthetic */ int i(GalleryCore galleryCore, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e871a829", new Object[]{galleryCore, new Integer(i2)})).intValue();
        }
        galleryCore.G = i2;
        return i2;
    }

    public static /* synthetic */ void j(GalleryCore galleryCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("976a47ec", new Object[]{galleryCore});
        } else {
            galleryCore.w0();
        }
    }

    public static void j0(nb4 nb4Var, ShowLightOffMessage.Source source) {
        JSONObject f2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3475cb31", new Object[]{nb4Var, source});
        } else if (nb4Var != null && (f2 = nb4Var.f()) != null) {
            if (source != ShowLightOffMessage.Source.MINI_VIDEO) {
                z = false;
            }
            f2.put("hideSkuBar", (Object) Boolean.toString(z));
        }
    }

    public static /* synthetic */ int k(GalleryCore galleryCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e529bfe0", new Object[]{galleryCore})).intValue();
        }
        return galleryCore.E;
    }

    public static /* synthetic */ int l(GalleryCore galleryCore, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcd0b867", new Object[]{galleryCore, new Integer(i2)})).intValue();
        }
        galleryCore.E = i2;
        return i2;
    }

    public static /* synthetic */ int m(GalleryCore galleryCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b367d0e4", new Object[]{galleryCore})).intValue();
        }
        int i2 = galleryCore.E + 1;
        galleryCore.E = i2;
        return i2;
    }

    public static /* synthetic */ long n(GalleryCore galleryCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32e937e2", new Object[]{galleryCore})).longValue();
        }
        return galleryCore.D;
    }

    public static /* synthetic */ long o(GalleryCore galleryCore, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("27004448", new Object[]{galleryCore, new Long(j2)})).longValue();
        }
        galleryCore.D = j2;
        return j2;
    }

    public static /* synthetic */ PendingPopulateViewPager p(GalleryCore galleryCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PendingPopulateViewPager) ipChange.ipc$dispatch("a3be8018", new Object[]{galleryCore});
        }
        return galleryCore.j;
    }

    public static /* synthetic */ boolean q(GalleryCore galleryCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e15d8808", new Object[]{galleryCore})).booleanValue();
        }
        return galleryCore.v;
    }

    public static /* synthetic */ boolean r(GalleryCore galleryCore, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47163312", new Object[]{galleryCore, new Boolean(z)})).booleanValue();
        }
        galleryCore.v = z;
        return z;
    }

    public static /* synthetic */ PtrBase s(GalleryCore galleryCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PtrBase) ipChange.ipc$dispatch("ee38a6b5", new Object[]{galleryCore});
        }
        return galleryCore.i;
    }

    public static /* synthetic */ String t(GalleryCore galleryCore, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("964ac766", new Object[]{galleryCore, new Float(f2)});
        }
        return galleryCore.T(f2);
    }

    public static /* synthetic */ void u(GalleryCore galleryCore, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57edc611", new Object[]{galleryCore, str});
        } else {
            galleryCore.U0(str);
        }
    }

    public static /* synthetic */ float v(GalleryCore galleryCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("185b67f8", new Object[]{galleryCore})).floatValue();
        }
        return galleryCore.f6714a;
    }

    public static /* synthetic */ void w(GalleryCore galleryCore, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aeff9c9", new Object[]{galleryCore, new Float(f2), new Float(f3)});
        } else {
            galleryCore.H0(f2, f3);
        }
    }

    public static /* synthetic */ void x(GalleryCore galleryCore, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7715c0a", new Object[]{galleryCore, new Boolean(z)});
        } else {
            galleryCore.I0(z);
        }
    }

    public static /* synthetic */ TextView y(GalleryCore galleryCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("2c45c77f", new Object[]{galleryCore});
        }
        return galleryCore.p;
    }

    public static /* synthetic */ zui z(GalleryCore galleryCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zui) ipChange.ipc$dispatch("6ccce02", new Object[]{galleryCore});
        }
        return galleryCore.h;
    }

    public final void A0(String str) {
        nb4 A;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4afc6d", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && (A = this.d.A()) != null) {
            try {
                A.f().getJSONObject("bottomBar").put(LightOffLayerManger.KEY_PRICE_SECTION, (Object) JSON.parseObject(str).getJSONObject(LightOffLayerManger.KEY_PRICE_SECTION));
            } catch (Exception e2) {
                tgh.c("GalleryCore", "lightofflayer price parse error", e2);
            }
            LightOffDialog lightOffDialog = this.g;
            if (lightOffDialog != null && lightOffDialog.isShowing()) {
                this.g.S(A);
            }
        }
    }

    public final void B0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("107c2630", new Object[]{this, str});
            return;
        }
        int count = this.k.getCount();
        for (int i2 = 0; i2 < count; i2++) {
            sx9 l2 = this.k.l(i2);
            if (l2 != null && (l2.M() || l2.L())) {
                l2.d(TextUtils.equals(str, ((tx9) l2.getComponentData()).g()));
            }
        }
    }

    public void C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ee8ac25", new Object[]{this});
            return;
        }
        LightOffDialog lightOffDialog = this.g;
        if (lightOffDialog == null || !lightOffDialog.isShowing()) {
            for (sx9 sx9Var : this.k.m()) {
                sx9Var.T();
            }
        }
    }

    public final void D0(int i2, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de2f17aa", new Object[]{this, new Integer(i2), new Float(f2)});
        } else if (!o0() && !p0()) {
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.r.cancel();
                this.r = null;
            }
            float U = U(i2, 1.0f);
            int i3 = i2 + 1;
            if (this.F && i3 >= this.k.getCount()) {
                i3 %= this.k.getCount();
            }
            String T = T(U + ((U(i3, U) - U) * f2));
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.i.getLayoutParams();
            if (!TextUtils.equals(T, layoutParams.dimensionRatio)) {
                layoutParams.dimensionRatio = T;
                this.i.requestLayout();
            }
            U0(T);
        }
    }

    public final void E0(float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1f42293", new Object[]{this, new Float(f2), new Boolean(z)});
        } else if (!o0() && !p0()) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.i.getLayoutParams();
            float h2 = mr7.h(layoutParams.dimensionRatio);
            String T = T(f2);
            if (!TextUtils.equals(T, T(h2))) {
                ValueAnimator valueAnimator = this.r;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.r.cancel();
                    this.r = null;
                }
                if (!z) {
                    layoutParams.dimensionRatio = T;
                    this.i.requestLayout();
                    U0(T);
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(h2, f2);
                this.r = ofFloat;
                ofFloat.addUpdateListener(new j());
                ofFloat.start();
            }
        }
    }

    public void F0(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("572812fc", new Object[]{this, new Float(f2)});
        } else if (Float.compare(this.x, f2) != 0) {
            if (!r0(f2) || f2 == Float.NEGATIVE_INFINITY || f2 == Float.POSITIVE_INFINITY) {
                this.x = 0.0f;
                this.y = 0.0f;
                this.k.n(0.0f);
                this.k.o(this.y);
                this.j.setPageMargin((int) (this.z * this.y));
                this.j.updateItemsWidth();
                b1();
                String T = T(U(this.j.getCurrentItem(), 1.0f));
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.i.getLayoutParams();
                if (!TextUtils.equals(T, layoutParams.dimensionRatio)) {
                    layoutParams.dimensionRatio = T;
                    this.i.requestLayout();
                }
                U0(T);
                return;
            }
            this.x = f2;
            G0(this.y);
        }
    }

    public void G0(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("908bb2d1", new Object[]{this, new Float(f2)});
        } else {
            H0(f2, 0.0f);
        }
    }

    public final void H0(float f2, float f3) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80eb0f0f", new Object[]{this, new Float(f2), new Float(f3)});
            return;
        }
        float max = Math.max(0.0f, Math.min(f2, 1.0f));
        float f4 = this.y;
        this.y = max;
        if (o0() || r0(f3)) {
            float U = U(this.j.getCurrentItem(), 1.0f);
            if (o0()) {
                f3 = this.x;
            }
            int pageMargin = this.j.getPageMargin();
            int i2 = (int) (this.z * max);
            if (Float.compare(f4, this.y) != 0 || Float.compare(U, f3) != 0 || pageMargin != i2) {
                this.k.n(f3);
                this.k.o(max);
                this.j.setPageMargin(i2);
                this.j.updateItemsWidth();
                b1();
                int width = this.j.getWidth();
                if (width <= 0) {
                    str = T(U + ((f3 - U) * max));
                } else {
                    float f5 = width;
                    float f6 = f5 / U;
                    str = T(f5 / (f6 + (((f5 / f3) - f6) * max)));
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.i.getLayoutParams();
                if (!TextUtils.equals(str, layoutParams.dimensionRatio)) {
                    layoutParams.dimensionRatio = str;
                    this.i.requestLayout();
                    Y0(max);
                    U0(str);
                }
            }
        }
    }

    public final void I0(boolean z) {
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23da55a3", new Object[]{this, new Boolean(z)});
            return;
        }
        this.A = false;
        L(z);
        float f3 = 0.0f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        this.y = f2;
        if (z) {
            f3 = this.f6714a;
        }
        F0(f3);
    }

    public void J0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98742a58", new Object[]{this, str});
        } else if (!TextUtils.equals(str, yc4.l(this.k.l(this.j.getCurrentItem())))) {
            int count = this.k.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                if (TextUtils.equals(yc4.l(this.k.l(i2)), str) && i2 != this.j.getCurrentItem()) {
                    this.j.setCurrentItem(i2, q0());
                    LightOffDialog lightOffDialog = this.g;
                    if (lightOffDialog != null && lightOffDialog.isShowing()) {
                        this.g.M(str);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public void K0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce566fc", new Object[]{this, str});
        } else if (!TextUtils.equals(yc4.m(this.k.l(this.j.getCurrentItem())), str)) {
            int count = this.k.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                if (TextUtils.equals(yc4.m(this.k.l(i2)), str)) {
                    this.j.setCurrentItem(i2, q0());
                    return;
                }
            }
        }
    }

    public final void L(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2071472", new Object[]{this, new Boolean(z)});
            return;
        }
        this.j.setModeScroll(z ? 1 : 0);
        int count = this.k.getCount();
        for (int i2 = 0; i2 < count; i2++) {
            sx9 l2 = this.k.l(i2);
            if (l2 != null) {
                l2.setData("isGalleryScrollMode", Boolean.valueOf(z));
            }
        }
    }

    public void L0(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4d5aa7", new Object[]{this, lVar});
        } else {
            this.f = lVar;
        }
    }

    public final void M(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e30addc1", new Object[]{this, str});
            return;
        }
        for (int i2 = 0; i2 < this.k.getCount(); i2++) {
            sx9 l2 = this.k.l(i2);
            if (TextUtils.equals(((tx9) l2.getComponentData()).g(), str) && (l2.M() || l2.L())) {
                l2.y();
                return;
            }
        }
    }

    public void M0(r8c r8cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e870a42", new Object[]{this, r8cVar});
        } else {
            this.q = r8cVar;
        }
    }

    public void N(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd03736f", new Object[]{this, viewGroup});
        } else {
            this.h.j(viewGroup);
        }
    }

    public void N0(int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c04418", new Object[]{this, new Integer(i2)});
            return;
        }
        this.B = true;
        this.j.setMode(i2);
        if (i2 != 1) {
            z = false;
        }
        L(z);
    }

    public final void O0(ShowLightOffMessage.Source source, String str, Rect rect) {
        List<cy9> c0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc18cd51", new Object[]{this, source, str, rect});
            return;
        }
        LightOffDialog lightOffDialog = this.g;
        if ((lightOffDialog == null || !lightOffDialog.isShowing()) && (c0 = c0(source)) != null && !c0.isEmpty()) {
            if (source == ShowLightOffMessage.Source.VIDEO_COMPONENT) {
                M(str);
            }
            nb4 A = this.d.A();
            boolean Q = Q();
            this.v = false;
            this.g = new LightOffDialog(this.b, this.c, c0, source, Q, str, rect);
            if (Q) {
                j0(A, source);
                this.g.O(A);
                this.g.Q();
            }
            this.g.P(this.K);
            this.g.N(this.L);
            this.g.K(this.M);
            this.g.show();
            UserBehaviorTracker.j(this.b, UserBehaviorUtils.COMPONENT_NAME_GALLERY_LIGHTOFF_CONTAINER, 1);
            UtUtils.h(2201, "DarkPage_industry", UtUtils.c(this.c.e()));
        }
    }

    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        LightOffDialog lightOffDialog = this.g;
        if (lightOffDialog != null && lightOffDialog.isShowing()) {
            this.g.A(false);
        }
        com.taobao.android.detail.ttdetail.widget.video.a.d().b(this.b);
        q84.m(this.b, this);
        this.h.m();
        this.j.destroy();
        yc4.b(null, this.k.m());
    }

    public final void P0(boolean z, boolean z2) {
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdbf86ab", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (!z || !q0()) {
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.s.cancel();
                this.s = null;
            }
            float f3 = 0.0f;
            if (!z2) {
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                this.y = f2;
            }
            float f4 = this.y;
            if (z) {
                f3 = 1.0f;
            }
            if (Float.compare(f4, f3) == 0) {
                I0(z);
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f4, f3);
            this.s = ofFloat;
            ofFloat.addUpdateListener(new k(ofFloat, z));
            ofFloat.addListener(new a(z));
            ofFloat.start();
        }
    }

    public final boolean Q() {
        Feature feature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4300d1ec", new Object[]{this})).booleanValue();
        }
        if (vbl.A() && (feature = (Feature) this.c.e().f(Feature.class)) != null) {
            return feature.isDetailNewLightOff();
        }
        return false;
    }

    public void Q0(String str) {
        xka xkaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b810b2e", new Object[]{this, str});
        } else if (!TextUtils.equals(str, V())) {
            JSONObject c2 = UtUtils.c(this.c.e());
            c2.put(xka.KEY_LOCATOR_ID, (Object) str);
            UtUtils.h(2101, "DetailLocator_industry", c2);
            List<sx9> m = this.k.m();
            int size = m.size();
            for (int i2 = 0; i2 < size; i2++) {
                tx9 tx9Var = (tx9) m.get(i2).getComponentData();
                if (tx9Var != null && (xkaVar = (xka) tx9Var.i()) != null && TextUtils.equals(str, xkaVar.u())) {
                    this.j.setCurrentItem(i2, q0());
                    return;
                }
            }
        }
    }

    public <C extends oa4> C R(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("78948b87", new Object[]{this, str}));
        }
        return (C) this.k.i(str);
    }

    public final void R0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7be7d418", new Object[]{this, str});
            return;
        }
        r8c r8cVar = this.q;
        if (r8cVar != null) {
            r8cVar.c(str);
        }
    }

    public <C extends oa4> C S(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("97436efd", new Object[]{this, str}));
        }
        return (C) this.k.j(str);
    }

    public final void S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a07ba8b3", new Object[]{this});
            return;
        }
        int count = this.k.getCount();
        for (int i2 = 0; i2 < count; i2++) {
            sx9 l2 = this.k.l(i2);
            if (l2 != null && (l2.M() || l2.L())) {
                l2.n();
            }
        }
    }

    public final String T(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa0dee02", new Object[]{this, new Float(f2)});
        }
        return f2 + ":1";
    }

    public final void T0() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b87f967", new Object[]{this});
            return;
        }
        wua wuaVar = this.d;
        if (wuaVar != null && n0(wuaVar.y()) && !this.u) {
            z = true;
        }
        this.i.freezeEnd(!z, "");
    }

    public final float U(int i2, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33d7813f", new Object[]{this, new Integer(i2), new Float(f2)})).floatValue();
        }
        sx9 l2 = this.k.l(i2);
        if (l2 != null) {
            return l2.A();
        }
        return f2;
    }

    public final void U0(String str) {
        Activity activity;
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("649b831e", new Object[]{this, str});
            return;
        }
        Context context = this.b;
        if ((context instanceof Activity) && (findViewById = (activity = (Activity) context).findViewById(R.id.cl_image_holder_container)) != null && findViewById.getVisibility() == 0) {
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.ll_header_image_container);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewGroup.getLayoutParams();
            if (!TextUtils.equals(str, layoutParams.dimensionRatio)) {
                layoutParams.dimensionRatio = str;
                if (viewGroup.isInLayout()) {
                    viewGroup.post(new i(viewGroup));
                } else {
                    viewGroup.requestLayout();
                }
            }
        }
    }

    public String V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a300bd2", new Object[]{this});
        }
        return Y(this.j.getCurrentItem());
    }

    public final void V0(sx9 sx9Var, int i2) {
        int i3;
        int i4;
        rql i5;
        int i6 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96b36d52", new Object[]{this, sx9Var, new Integer(i2)});
            return;
        }
        if (sx9Var == null || (i5 = ((tx9) sx9Var.getComponentData()).i()) == null) {
            i3 = 0;
            i4 = 0;
        } else {
            List r = i5.r();
            i4 = r.size();
            i3 = r.indexOf(sx9Var.getComponentData());
        }
        View view = this.m;
        if (i4 < 1) {
            i6 = 8;
        }
        view.setVisibility(i6);
        if (this.t) {
            this.n.setText(String.valueOf(i2 + 1));
            this.o.setText(String.valueOf(g0()));
            return;
        }
        this.n.setText(String.valueOf(i3 + 1));
        this.o.setText(String.valueOf(i4));
    }

    public int W() {
        tx9 tx9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68bf442a", new Object[]{this})).intValue();
        }
        sx9 l2 = this.k.l(this.j.getCurrentItem());
        if (l2 == null || (tx9Var = (tx9) l2.getComponentData()) == null || TextUtils.isEmpty(tx9Var.v())) {
            return 0;
        }
        rql i2 = tx9Var.i();
        if (i2 == null) {
            return 1;
        }
        return i2.r().size();
    }

    public final void W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da0bc97f", new Object[]{this});
            return;
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.e);
        if (this.t) {
            int i2 = R.id.ll_index_container;
            constraintSet.clear(i2, 3);
            constraintSet.connect(i2, 4, 0, 4, mr7.b(this.b, 10.0f));
        } else {
            int i3 = ((ViewGroup.MarginLayoutParams) this.m.getLayoutParams()).topMargin;
            if (i3 <= 0) {
                i3 = mr7.b(this.b, 86.0f);
            }
            int i4 = R.id.ll_index_container;
            constraintSet.clear(i4, 4);
            constraintSet.connect(i4, 3, 0, 3, i3);
        }
        TransitionManager.beginDelayedTransition(this.e);
        constraintSet.applyTo(this.e);
    }

    @Override // tb.ntc
    public ThreadMode W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this});
        }
        return ThreadMode.MainThread;
    }

    public String X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("930b4dde", new Object[]{this});
        }
        return Z(this.j.getCurrentItem());
    }

    public final void X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e946e8cd", new Object[]{this});
            return;
        }
        r8c r8cVar = this.q;
        if (r8cVar != null) {
            r8cVar.a(d0());
        }
    }

    public final String Y(int i2) {
        tx9 tx9Var;
        xka xkaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3ba9f9e", new Object[]{this, new Integer(i2)});
        }
        sx9 l2 = this.k.l(Math.min(Math.max(i2, 0), this.k.getCount()));
        if (l2 == null || (tx9Var = (tx9) l2.getComponentData()) == null || (xkaVar = (xka) tx9Var.i()) == null) {
            return null;
        }
        return xkaVar.u();
    }

    public final void Y0(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d66b7ca", new Object[]{this, new Float(f2)});
        } else if (this.j.getMode() == 1) {
            float f3 = 1.0f - f2;
            r8c r8cVar = this.q;
            if (r8cVar != null) {
                r8cVar.b().setAlpha(f3);
            }
            this.p.setAlpha(f3);
            if (!this.t) {
                float b2 = mr7.b(this.b, 50.0f);
                ((ViewGroup.MarginLayoutParams) this.m.getLayoutParams()).topMargin = (int) (b2 + (f3 * b2));
                this.m.requestLayout();
            }
        }
    }

    public final String Z(int i2) {
        tx9 tx9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f56a7d2", new Object[]{this, new Integer(i2)});
        }
        sx9 l2 = this.k.l(Math.min(Math.max(i2, 0), this.k.getCount()));
        if (l2 == null || (tx9Var = (tx9) l2.getComponentData()) == null) {
            return null;
        }
        return tx9Var.v();
    }

    public void Z0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b4e426", new Object[]{this, str});
        } else {
            A0(str);
        }
    }

    public final ViewGroup a0() {
        View findViewById;
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("40ec01de", new Object[]{this});
        }
        Context context = this.b;
        if (!(context instanceof Activity) || (findViewById = ((Activity) context).findViewById(R.id.cl_image_holder_container)) == null || findViewById.getVisibility() != 0 || (viewGroup = (ViewGroup) ((Activity) this.b).findViewById(R.id.ll_header_image_container)) == null) {
            return null;
        }
        return viewGroup;
    }

    public final void a1(List<sx9> list) {
        boolean z;
        boolean z2;
        int i2 = 0;
        int i3 = 2;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d76194", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            int currentItem = this.j.getCurrentItem();
            this.l = -1;
            this.k.p(list);
            O();
            if (!this.u || this.k.getCount() <= 1) {
                z = false;
            } else {
                z = true;
            }
            this.j.setScrollCycle(z);
            if (z != this.F) {
                this.j.setAdapter(this.k);
            } else if (this.j.getAdapter() == null) {
                this.j.setAdapter(this.k);
            }
            this.F = z;
            int max = Math.max(0, Math.min(currentItem, this.k.getCount() - 1));
            this.k.notifyDataSetChanged();
            this.j.setCurrentItem(max, false);
            Boolean bool = this.C;
            if (bool != null) {
                z2 = bool.booleanValue();
            } else {
                z2 = DataUtils.R((Feature) this.c.e().f(Feature.class));
            }
            sx9 l2 = this.k.l(max);
            V0(l2, max);
            if (!this.B) {
                P0(z2, !this.A);
                this.A = false;
            }
            D0(max, 0.0f);
            ViewGroup a0 = a0();
            if (!(a0 == null || l2 == null || !this.c.e().o())) {
                if (Float.compare(1.0f, this.k.getPageWidth(max)) == 0) {
                    i3 = 1;
                }
                if (y0(i3, a0, max)) {
                    this.c.h().h(this.N, 1375L);
                }
            }
            if (rua.h(this.b, this.d) && !this.c.e().o()) {
                int count = this.k.getCount();
                for (int i4 = 0; i4 < count; i4++) {
                    sx9 l3 = this.k.l(i4);
                    if (l3 != null) {
                        cg2.r(this.c.i().b(), l3.C(), rua.e(this.b, this.k.getPageWidth(i4)), rua.c(this.b, this.c.g().o(), this.d));
                    }
                }
            }
            if (1 != this.j.getModeScroll()) {
                z3 = false;
            }
            L(z3);
            String d2 = r3q.d(this.k.m(), max);
            TextView textView = this.p;
            if (TextUtils.isEmpty(d2)) {
                i2 = 8;
            }
            textView.setVisibility(i2);
            this.p.setText(d2);
        }
    }

    public String b0(int i2) {
        sx9 l2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("856294ce", new Object[]{this, new Integer(i2)});
        }
        MainAdapter mainAdapter = this.k;
        if (mainAdapter == null || (l2 = mainAdapter.l(i2)) == null) {
            return null;
        }
        return l2.C();
    }

    public final void b1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5057d295", new Object[]{this});
            return;
        }
        ViewGroup a0 = a0();
        if (a0 != null) {
            int childCount = a0.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                WidthRatioFrameLayout widthRatioFrameLayout = (WidthRatioFrameLayout) a0.getChildAt(i2);
                Object tag = widthRatioFrameLayout.getTag(R.id.tt_detail_preload_adapter_position);
                if (tag instanceof Integer) {
                    ((ViewGroup.MarginLayoutParams) widthRatioFrameLayout.getLayoutParams()).rightMargin = (int) (this.z * this.y);
                    widthRatioFrameLayout.setWidthRatio(this.k.getPageWidth(((Integer) tag).intValue()));
                }
            }
        }
    }

    public b8z c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8z) ipChange.ipc$dispatch("68edaed4", new Object[]{this});
        }
        wua wuaVar = this.d;
        if (wuaVar == null) {
            return null;
        }
        return wuaVar.F();
    }

    public final List<och> d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("57b043ed", new Object[]{this});
        }
        wua wuaVar = this.d;
        if (wuaVar == null) {
            return null;
        }
        return wuaVar.B();
    }

    public zui e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zui) ipChange.ipc$dispatch("47f6c970", new Object[]{this});
        }
        return this.h;
    }

    public List<sx9> f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("82431471", new Object[]{this});
        }
        return this.k.m();
    }

    public final int g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f15cf3a9", new Object[]{this})).intValue();
        }
        return this.k.getCount();
    }

    public View h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.e;
    }

    public final void i0() {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcad3043", new Object[]{this});
            return;
        }
        Context context = this.b;
        if ((context instanceof Activity) && (findViewById = ((Activity) context).findViewById(R.id.cl_image_holder_container)) != null) {
            findViewById.setVisibility(8);
        }
    }

    public final void k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.z = (int) TypedValue.applyDimension(1, 2.0f, this.b.getResources().getDisplayMetrics());
        this.h = new zui(this.b, this.c);
        PreRenderManager g2 = PreRenderManager.g(this.b);
        if (g2 != null) {
            this.e = (ConstraintLayout) g2.j(this.b, R.layout.tt_detail_gallery_container, null, true);
        } else {
            this.e = (ConstraintLayout) LayoutInflater.from(this.b).inflate(R.layout.tt_detail_gallery_container, (ViewGroup) null);
        }
        this.i = (PtrBase) this.e.findViewById(R.id.ptr_base);
        this.j = (PendingPopulateViewPager) this.e.findViewById(R.id.ptr_main_container);
        this.m = this.e.findViewById(R.id.ll_index_container);
        Drawable b2 = u5m.b();
        if (b2 != null) {
            this.m.setBackground(b2);
        }
        ((ViewGroup.MarginLayoutParams) this.m.getLayoutParams()).rightMargin = u5m.c();
        this.m.requestLayout();
        this.n = (TextView) this.e.findViewById(R.id.tv_current_index);
        this.o = (TextView) this.e.findViewById(R.id.tv_total_size);
        this.p = (TextView) this.e.findViewById(R.id.tv_sku_desc);
        Drawable f2 = u5m.f();
        if (f2 != null) {
            this.p.setBackground(f2);
        }
        this.i.setEndLoadingDelegate(new ie8(this.b));
        this.i.setStartLoadingDelegate(new ohq(this.b));
        this.i.freezeStart(true, "");
        this.i.setOnRefreshListener(new v3a(this));
        ViewProxy.setOnClickListener(this.m, new w3a(this));
        this.j.addOnItemVisibleChangeListener(new x3a(this));
        this.j.addOnPageChangeListener(this.H);
        this.j.setOnTouchListener(new y3a(this));
    }

    public final void l0(int i2) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a536ce15", new Object[]{this, new Integer(i2)});
            return;
        }
        sx9 l2 = this.k.l(i2);
        if (l2 != null) {
            l2.V(this.I);
            l2.X(this.J);
            int i4 = this.l;
            if (i4 != i2) {
                sx9 l3 = this.k.l(i4);
                if (l3 != null) {
                    l3.V(null);
                    l3.X(null);
                    l3.P();
                }
                l2.O();
                this.l = i2;
                String d2 = r3q.d(this.k.m(), this.l);
                TextView textView = this.p;
                if (TextUtils.isEmpty(d2)) {
                    i3 = 8;
                }
                textView.setVisibility(i3);
                this.j.post(new c(d2));
                V0(l2, this.l);
                R0(V());
                t0(this.l, l2);
            }
        }
    }

    public final void m0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("405244e5", new Object[]{this, new Integer(i2)});
            return;
        }
        s0(this.k.l(i2));
        l0(i2);
    }

    public final boolean o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1dcfb292", new Object[]{this})).booleanValue();
        }
        if (this.x > 0.0f) {
            return true;
        }
        return false;
    }

    public final boolean p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be987635", new Object[]{this})).booleanValue();
        }
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return false;
        }
        return true;
    }

    public final boolean q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5821e120", new Object[]{this})).booleanValue();
        }
        if (this.j.getModeScroll() == 1) {
            return true;
        }
        return false;
    }

    public final boolean r0(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c299911", new Object[]{this, new Float(f2)})).booleanValue();
        }
        if (f2 > 0.0f) {
            return true;
        }
        return false;
    }

    public final void s0(sx9 sx9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4adc5ddc", new Object[]{this, sx9Var});
            return;
        }
        l lVar = this.f;
        if (lVar != null) {
            lVar.a(sx9Var);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [tb.nb4] */
    public final void t0(int i2, sx9 sx9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca377160", new Object[]{this, new Integer(i2), sx9Var});
        } else {
            q84.f(this.b, new vua(i2, sx9Var.getComponentData()));
        }
    }

    public final Rect u0(sx9 sx9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("4336ea7a", new Object[]{this, sx9Var});
        }
        if (sx9Var == null) {
            return null;
        }
        String g2 = ((tx9) sx9Var.getComponentData()).g();
        if ((sx9Var.M() || sx9Var.L()) && this.h.t() && this.h.p(g2)) {
            return this.h.n();
        }
        sx9 l2 = this.k.l(this.j.getCurrentItem());
        if (l2 == null || !TextUtils.equals(g2, ((tx9) l2.getComponentData()).g())) {
            return null;
        }
        return l2.z();
    }

    public final void w0() {
        nb4 y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7998af", new Object[]{this});
            return;
        }
        wua wuaVar = this.d;
        if (wuaVar != null && (y = wuaVar.y()) != null) {
            this.c.b().g(y.b("dragEvent"), new RuntimeAbilityParam[0]);
        }
    }

    public void x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ebc89ae", new Object[]{this});
            return;
        }
        LightOffDialog lightOffDialog = this.g;
        if (lightOffDialog == null || !lightOffDialog.isShowing()) {
            for (sx9 sx9Var : this.k.m()) {
                sx9Var.Q();
            }
        }
    }

    public final boolean y0(int i2, ViewGroup viewGroup, int i3) {
        int i4;
        int i5;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd2e40ed", new Object[]{this, new Integer(i2), viewGroup, new Integer(i3)})).booleanValue();
        }
        int i6 = i3;
        boolean h2 = rua.h(this.b, this.d);
        if (i2 > 1) {
            i4 = (int) (this.z * this.y);
        } else {
            i4 = 0;
        }
        int i7 = 0;
        boolean z2 = false;
        while (i7 < i2) {
            sx9 l2 = this.k.l(i6);
            if (l2 != null) {
                String C = l2.C();
                WidthRatioFrameLayout widthRatioFrameLayout = (WidthRatioFrameLayout) LayoutInflater.from(this.b).inflate(R.layout.tt_detail_header_place_holder, viewGroup, z);
                widthRatioFrameLayout.setTag(R.id.tt_detail_preload_adapter_position, Integer.valueOf(i6));
                TTObservedImageView tTObservedImageView = (TTObservedImageView) widthRatioFrameLayout.findViewById(R.id.ttiv_holder_view);
                ExtraHeightLinearLayout extraHeightLinearLayout = (ExtraHeightLinearLayout) widthRatioFrameLayout.findViewById(R.id.ehv_holder_blur_view);
                ImageView imageView = (ImageView) widthRatioFrameLayout.findViewById(R.id.ehiv_holder_blur_view);
                float pageWidth = this.k.getPageWidth(i6);
                widthRatioFrameLayout.setWidthRatio(pageWidth);
                if (h2) {
                    i5 = 0;
                } else {
                    i5 = 8;
                }
                extraHeightLinearLayout.setVisibility(i5);
                if (h2) {
                    int c2 = rua.c(this.b, this.c.g().o(), this.d);
                    extraHeightLinearLayout.setExtraHeight(c2);
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    layoutParams.height = c2;
                    imageView.setLayoutParams(layoutParams);
                }
                if (h2) {
                    cg2.p(this.c.i().b(), imageView, C, rua.e(this.b, pageWidth), rua.c(this.b, this.c.g().o(), this.d), false);
                }
                if (!TextUtils.isEmpty(C)) {
                    mpe.l(tTObservedImageView, 480, 480, jov.d(C), -1, true, mpe.h(TaobaoImageUrlStrategy.ImageQuality.q30), false);
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
                    marginLayoutParams.rightMargin = i4;
                    viewGroup.addView(widthRatioFrameLayout, marginLayoutParams);
                }
                z2 = true;
            }
            i7++;
            i6++;
            z = false;
        }
        return z2;
    }

    /* renamed from: z0 */
    public boolean y1(ux1 ux1Var) {
        LightOffDialog lightOffDialog;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b5282b4", new Object[]{this, ux1Var})).booleanValue();
        }
        if (ux1Var instanceof ShowLightOffMessage) {
            ShowLightOffMessage showLightOffMessage = (ShowLightOffMessage) ux1Var;
            O0(showLightOffMessage.c(), showLightOffMessage.a(), showLightOffMessage.b());
        } else if (ux1Var instanceof oqv) {
            oqv oqvVar = (oqv) ux1Var;
            if (q0() && ((lightOffDialog = this.g) == null || !lightOffDialog.isShowing())) {
                int currentItem = this.j.getCurrentItem();
                int count = this.k.getCount();
                for (int i2 = 0; i2 < count; i2++) {
                    sx9 l2 = this.k.l(i2);
                    if (l2 != null) {
                        if (TextUtils.equals(l2.F(), oqvVar.a())) {
                            currentItem = i2;
                        } else {
                            l2.Q();
                        }
                    }
                }
                this.j.setCurrentItem(currentItem, true);
            }
        }
        return true;
    }

    public final boolean n0(nb4 nb4Var) {
        JSONObject f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96c5116f", new Object[]{this, nb4Var})).booleanValue();
        }
        if (nb4Var == null || (f2 = nb4Var.f()) == null) {
            return false;
        }
        return TextUtils.equals("right", f2.getString("position"));
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60e2613d", new Object[]{this});
            return;
        }
        oa4 oa4Var = null;
        if (this.c.e().o()) {
            sx9 l2 = this.k.l(0);
            if (l2 != null) {
                oa4Var = l2.v(0);
            }
            if (oa4Var instanceof u3a) {
                String y = ((u3a) oa4Var).y();
                this.P = y;
                this.Q.put("preloadFrameUrl", (Object) y);
                this.Q.put("preloadTraceId", this.c.i().c("traceId"));
                this.Q.put("preloadItemId", this.c.i().c("requestItemId"));
            }
        } else if (!this.O && !TextUtils.isEmpty(this.P)) {
            sx9 l3 = this.k.l(0);
            if (l3 != null) {
                oa4Var = l3.v(0);
            }
            if (oa4Var instanceof u3a) {
                String y2 = ((u3a) oa4Var).y();
                if (!TextUtils.equals(this.P, y2)) {
                    this.Q.put("realFrameUrl", (Object) y2);
                    this.Q.put("realTraceId", this.c.i().c("traceId"));
                    this.Q.put("realItemId", this.c.i().c("requestItemId"));
                    UtUtils.f(19999, "Page_Detail_First_Frame_Different", this.Q);
                }
                this.O = true;
            }
        }
    }

    public final List<cy9> c0(ShowLightOffMessage.Source source) {
        cy9 cy9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3494d302", new Object[]{this, source});
        }
        List<tx9> h2 = DataUtils.h(this.d);
        if (source == ShowLightOffMessage.Source.MINI_VIDEO && this.h.u(MiniVideoType.INDEPENDENT)) {
            h2 = DataUtils.j(this.d);
        }
        if (h2 == null) {
            tgh.b("GalleryCore", "getLightOffComponents return null");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (tx9 tx9Var : h2) {
            if (tx9Var.x() && (cy9Var = (cy9) this.c.d().b(tx9Var, new DataEntry("isLightOff", "true"))) != null) {
                arrayList.add(cy9Var);
            }
        }
        return arrayList;
    }

    public void v0() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155897d9", new Object[]{this});
            return;
        }
        if (this.c.e().o()) {
            str = "preRenderHeader";
        } else {
            str = "renderHeader";
        }
        PerformanceUtils.q(this.c, str, System.currentTimeMillis());
        wua wuaVar = (wua) this.c.e().e(a4a.PARSER_ID);
        if (this.d != wuaVar) {
            this.d = wuaVar;
            List<tx9> h2 = DataUtils.h(wuaVar);
            if (h2 == null) {
                tgh.b("GalleryCore", "onDataUpdate DataUtils.extractFramesData() return null");
                return;
            }
            LightOffDialog lightOffDialog = this.g;
            if (lightOffDialog != null && lightOffDialog.isShowing()) {
                this.g.A(false);
            }
            Feature feature = (Feature) this.c.e().f(Feature.class);
            this.t = DataUtils.W(feature);
            this.u = DataUtils.V(feature);
            this.v = rcw.b(this.b, feature) && !rcw.m(feature);
            this.h.A(this.d);
            ArrayList arrayList = new ArrayList();
            for (tx9 tx9Var : h2) {
                sx9 sx9Var = (sx9) this.c.d().b(tx9Var, new DataEntry[0]);
                if (sx9Var != null) {
                    arrayList.add(sx9Var);
                }
            }
            if (feature != null && feature.isEnableMainPicMask()) {
                i0();
            }
            W0();
            T0();
            int currentItem = this.j.getCurrentItem();
            a1(arrayList);
            int max = Math.max(0, Math.min(currentItem, this.k.getCount() - 1));
            X0();
            this.j.setCurrentItem(max, false);
        }
    }
}
