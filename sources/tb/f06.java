package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.android.external.UCPManager;
import com.taobao.infoflow.protocol.engine.invoke.biz.ITopViewService;
import com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.HVideoAnimationView;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class f06 extends com.taobao.android.dinamicx.widget.h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXHVIDEOANIMATIONLAYOUT_HVIDEOANIMATIONLAYOUT = -4838666398042957198L;

    /* renamed from: a  reason: collision with root package name */
    public int f18911a;
    public AnimatorSet b;
    public AnimatorSet c;
    public ValueAnimator.AnimatorUpdateListener d;
    public ValueAnimator e;
    public AnimatorListenerAdapter f;
    public HVideoAnimationView h;
    public View i;
    public ImageView j;
    public Bitmap k;
    public boolean l;
    public IMainLifecycleService m;
    public h6d n;
    public int o;
    public boolean p;
    public final ITopViewService.a r;
    public int g = 0;
    public final Handler q = new e(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f18913a;

        public b(f06 f06Var, View view) {
            this.f18913a = view;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            } else if (hashCode == -1868320925) {
                super.onAnimationCancel((Animator) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/infoflow/taobao/subservice/biz/videocardanimationservice/impl/DXHVideoAnimationLayoutWidgetNode$2");
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                return;
            }
            super.onAnimationCancel(animator);
            View view = this.f18913a;
            if (view != null) {
                view.setScaleX(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            View view = this.f18913a;
            if (view != null) {
                view.setScaleX(1.0f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f18914a;

        public c(View view) {
            this.f18914a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            int parseInt = Integer.parseInt(valueAnimator.getAnimatedValue().toString());
            if (parseInt == f06.L(f06.this)) {
                this.f18914a.setVisibility(8);
                f06.u(f06.this, true);
                f06.A(f06.this, -2);
                f06.R(f06.this);
                return;
            }
            f06.A(f06.this, parseInt);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements o8e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.o8e
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
                return;
            }
            fve.e("VideoAnimationLayoutWidgetNode", "onStatusChanged onComplete:");
            f06.C(f06.this).removeCallbacksAndMessages(null);
            f06.D(f06.this);
        }

        @Override // tb.o8e
        public void onError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
            } else {
                fve.e("VideoAnimationLayoutWidgetNode", "onStatusChanged onPlayError:");
            }
        }

        @Override // tb.o8e
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
                return;
            }
            fve.e("VideoAnimationLayoutWidgetNode", "onStatusChanged onPause:");
            f06.C(f06.this).removeCallbacksAndMessages(null);
            f06.E(f06.this);
            f06.H(f06.this);
        }

        @Override // tb.o8e
        public void onRelease() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2933d9af", new Object[]{this});
            } else {
                fve.e("VideoAnimationLayoutWidgetNode", "onStatusChanged onStop:");
            }
        }

        @Override // tb.o8e
        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
                return;
            }
            f06.B(f06.this);
            fve.e("VideoAnimationLayoutWidgetNode", "onStatusChanged onStart:");
            f06.C(f06.this).removeCallbacksAndMessages(null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/videocardanimationservice/impl/DXHVideoAnimationLayoutWidgetNode$5");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            if (message.what == 1) {
                fve.e("VideoAnimationLayoutWidgetNode", "视频播放超时:");
                tve.c(a5w.VIDEO_ANIMATION, "videoPlayFail", "", a5w.VIDEO_ANIMATION_BIZ_NAME, "playTimeOut", null);
                f06.D(f06.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f extends m47 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/videocardanimationservice/impl/DXHVideoAnimationLayoutWidgetNode$6");
        }

        @Override // tb.m47, tb.h6d
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
                return;
            }
            fve.e("VideoAnimationLayoutWidgetNode", "PageLifeCycle onPause");
            f06.C(f06.this).removeCallbacksAndMessages(null);
            f06.E(f06.this);
            f06.H(f06.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class g implements ITopViewService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // com.taobao.infoflow.protocol.engine.invoke.biz.ITopViewService.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e236a04", new Object[]{this});
                return;
            }
            fve.e("VideoAnimationLayoutWidgetNode", "onTopViewShow:onTopViewClose ");
            if (f06.v(f06.this) == 1 && f06.N(f06.this) != null) {
                fve.e("VideoAnimationLayoutWidgetNode", "onTopViewShow:闪屏结束开始播放 ");
                f06 f06Var = f06.this;
                f06.F(f06Var, f06.N(f06Var));
            }
        }

        @Override // com.taobao.infoflow.protocol.engine.invoke.biz.ITopViewService.a
        public void b(String str) {
            int i = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11c720e9", new Object[]{this, str});
                return;
            }
            f06 f06Var = f06.this;
            if (TextUtils.equals(nwi.BIZ_CODE, str)) {
                i = 2;
            }
            f06.x(f06Var, i);
            fve.e("VideoAnimationLayoutWidgetNode", "onTopViewShow:onTopViewShow " + f06.v(f06.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class h implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(491782741);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new f06();
        }
    }

    static {
        t2o.a(491782733);
    }

    public f06() {
        g gVar = new g();
        this.r = gVar;
        cfc c2 = j18.c(getDXRuntimeContext());
        if (c2 == null) {
            fve.e("VideoAnimationLayoutWidgetNode", "VideoAnimationLayout:构造函数 infoFlowContext null");
            return;
        }
        ITopViewService iTopViewService = (ITopViewService) c2.a(ITopViewService.class);
        if (iTopViewService != null) {
            iTopViewService.addTopViewShowListener(gVar);
        }
        fve.e("VideoAnimationLayoutWidgetNode", "VideoAnimationLayout:构造函数 注册 BootImageShowListener");
    }

    public static /* synthetic */ void A(f06 f06Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e431051", new Object[]{f06Var, new Integer(i)});
        } else {
            f06Var.c0(i);
        }
    }

    public static /* synthetic */ void B(f06 f06Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ea16b3", new Object[]{f06Var});
        } else {
            f06Var.g0();
        }
    }

    public static /* synthetic */ Handler C(f06 f06Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("be0aa5d2", new Object[]{f06Var});
        }
        return f06Var.q;
    }

    public static /* synthetic */ void D(f06 f06Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe34235", new Object[]{f06Var});
        } else {
            f06Var.i0();
        }
    }

    public static /* synthetic */ void E(f06 f06Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("955fd7f6", new Object[]{f06Var});
        } else {
            f06Var.j0();
        }
    }

    public static /* synthetic */ void F(f06 f06Var, HVideoAnimationView hVideoAnimationView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b72d57", new Object[]{f06Var, hVideoAnimationView});
        } else {
            f06Var.b0(hVideoAnimationView);
        }
    }

    public static /* synthetic */ int G(f06 f06Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b774c075", new Object[]{f06Var})).intValue();
        }
        return f06Var.Z();
    }

    public static /* synthetic */ void H(f06 f06Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f15643", new Object[]{f06Var});
        } else {
            f06Var.h0();
        }
    }

    public static /* synthetic */ View I(f06 f06Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3a730b46", new Object[]{f06Var});
        }
        return f06Var.i;
    }

    public static /* synthetic */ View J(f06 f06Var, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("471d1c4e", new Object[]{f06Var, view});
        }
        f06Var.i = view;
        return view;
    }

    public static /* synthetic */ View K(f06 f06Var, List list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ef39e542", new Object[]{f06Var, list, str});
        }
        return f06Var.Y(list, str);
    }

    public static /* synthetic */ int L(f06 f06Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d671779", new Object[]{f06Var})).intValue();
        }
        return f06Var.f18911a;
    }

    public static /* synthetic */ int M(f06 f06Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86cea86e", new Object[]{f06Var, new Integer(i)})).intValue();
        }
        f06Var.f18911a = i;
        return i;
    }

    public static /* synthetic */ HVideoAnimationView N(f06 f06Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HVideoAnimationView) ipChange.ipc$dispatch("34cd59cf", new Object[]{f06Var});
        }
        return f06Var.h;
    }

    public static /* synthetic */ HVideoAnimationView O(f06 f06Var, HVideoAnimationView hVideoAnimationView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HVideoAnimationView) ipChange.ipc$dispatch("5aa2eced", new Object[]{f06Var, hVideoAnimationView});
        }
        f06Var.h = hVideoAnimationView;
        return hVideoAnimationView;
    }

    public static /* synthetic */ boolean P(f06 f06Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1060430c", new Object[]{f06Var})).booleanValue();
        }
        return f06Var.l;
    }

    public static /* synthetic */ boolean Q(f06 f06Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72fb2d0e", new Object[]{f06Var, new Boolean(z)})).booleanValue();
        }
        f06Var.l = z;
        return z;
    }

    public static /* synthetic */ void R(f06 f06Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9dcd8c9", new Object[]{f06Var});
        } else {
            f06Var.d0();
        }
    }

    public static /* synthetic */ Object ipc$super(f06 f06Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -303753557) {
            super.onRenderView((Context) objArr[0], (View) objArr[1]);
            return null;
        } else if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 1327675976) {
            return new Boolean(super.onEvent((DXEvent) objArr[0]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/infoflow/taobao/subservice/biz/videocardanimationservice/impl/DXHVideoAnimationLayoutWidgetNode");
        }
    }

    public static /* synthetic */ boolean t(f06 f06Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("447b9504", new Object[]{f06Var})).booleanValue();
        }
        return f06Var.p;
    }

    public static /* synthetic */ boolean u(f06 f06Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c24a1a16", new Object[]{f06Var, new Boolean(z)})).booleanValue();
        }
        f06Var.p = z;
        return z;
    }

    public static /* synthetic */ int v(f06 f06Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fdf82ab4", new Object[]{f06Var})).intValue();
        }
        return f06Var.g;
    }

    public static /* synthetic */ void w(f06 f06Var, View view, String str, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("501bbfe5", new Object[]{f06Var, view, str, view2});
        } else {
            f06Var.S(view, str, view2);
        }
    }

    public static /* synthetic */ int x(f06 f06Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("385ffc93", new Object[]{f06Var, new Integer(i)})).intValue();
        }
        f06Var.g = i;
        return i;
    }

    public static /* synthetic */ o8e y(f06 f06Var, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o8e) ipChange.ipc$dispatch("e32efd59", new Object[]{f06Var, view});
        }
        return f06Var.T(view);
    }

    public static /* synthetic */ void z(f06 f06Var, View view, View view2, o8e o8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42d5d2f6", new Object[]{f06Var, view, view2, o8eVar});
        } else {
            f06Var.X(view, view2, o8eVar);
        }
    }

    public final void S(View view, String str, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2808567", new Object[]{this, view, str, view2});
            return;
        }
        try {
            DXRootView L = getDXRuntimeContext().L();
            if (L == null) {
                fve.e("VideoAnimationLayoutWidgetNode", "addCoverImageView rootView null:");
                return;
            }
            ViewParent parent = L.getParent();
            if (!(parent instanceof ViewGroup)) {
                fve.e("VideoAnimationLayoutWidgetNode", "addCoverImageView rootView parent null:");
                return;
            }
            g0();
            ImageView imageView = new ImageView(view.getContext());
            this.j = imageView;
            imageView.setBackgroundColor(-1);
            this.j.setVisibility(0);
            this.j.setScaleType(ImageView.ScaleType.CENTER_CROP);
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            this.k = decodeFile;
            this.j.setImageBitmap(decodeFile);
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.addView(this.j, viewGroup.getChildCount() + 1, new FrameLayout.LayoutParams(view2.getWidth(), view2.getHeight()));
        } catch (Exception e2) {
            fve.c("VideoAnimationLayoutWidgetNode", "createCoverImageView error :", e2);
        }
    }

    public final AnimatorListenerAdapter U(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatorListenerAdapter) ipChange.ipc$dispatch("521266de", new Object[]{this, view});
        }
        return new b(this, view);
    }

    public final ValueAnimator.AnimatorUpdateListener V(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator.AnimatorUpdateListener) ipChange.ipc$dispatch("39e31aaa", new Object[]{this, view});
        }
        return new c(view);
    }

    public final o8e W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o8e) ipChange.ipc$dispatch("1b2162b7", new Object[]{this});
        }
        return new d();
    }

    public final void X(View view, View view2, o8e o8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9883424b", new Object[]{this, view, view2, o8eVar});
            return;
        }
        this.c = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(300L);
        ValueAnimator ofInt = ValueAnimator.ofInt(view2.getHeight(), this.f18911a);
        this.e = ofInt;
        ofInt.setDuration(300L);
        this.c.playTogether(ofFloat, this.e);
        HVideoAnimationView hVideoAnimationView = (HVideoAnimationView) view;
        hVideoAnimationView.clearVideoStateListener();
        hVideoAnimationView.addVideoStateListener(W());
        hVideoAnimationView.addVideoStateListener(o8eVar);
        ValueAnimator.AnimatorUpdateListener V = V(view);
        this.d = V;
        this.e.addUpdateListener(V);
        if (this.g == 0) {
            fve.e("VideoAnimationLayoutWidgetNode", "createInsertCardAnimation:无闪屏直接播放:");
            b0(this.h);
        }
    }

    public final View Y(List<DXWidgetNode> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("88ab0073", new Object[]{this, list, str});
        }
        View view = null;
        for (DXWidgetNode dXWidgetNode : list) {
            if (dXWidgetNode == null) {
                fve.e("VideoAnimationLayoutWidgetNode", "onRenderView:node null:");
            } else if (TextUtils.equals(dXWidgetNode.getUserId(), str)) {
                DXRuntimeContext dXRuntimeContext = dXWidgetNode.getDXRuntimeContext();
                if (dXRuntimeContext == null) {
                    fve.e("VideoAnimationLayoutWidgetNode", "createVideoCardAnimation:dxRuntimeContext null:");
                    return null;
                }
                view = dXRuntimeContext.D();
            } else {
                continue;
            }
        }
        return view;
    }

    public final int Z() {
        String str;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f6e8bef8", new Object[]{this})).intValue();
        }
        try {
            str = nh2.i();
        } catch (Exception e2) {
            fve.c("VideoAnimationLayoutWidgetNode", "getBootImageState bootImageSceneType error:", e2);
            str = null;
        }
        fve.e("VideoAnimationLayoutWidgetNode", "getBootImageState bootImageSceneType:" + str);
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.equals(str, nwi.BIZ_CODE)) {
                i = 2;
            } else {
                i = 1;
            }
        }
        fve.e("VideoAnimationLayoutWidgetNode", "getBootImageState bootImageState:" + i);
        return i;
    }

    public final IVideoCardAnimationService a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IVideoCardAnimationService) ipChange.ipc$dispatch("7acc7c46", new Object[]{this});
        }
        return (IVideoCardAnimationService) j18.c(getDXRuntimeContext()).a(IVideoCardAnimationService.class);
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new f06();
    }

    public final void c0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1919be1c", new Object[]{this, new Integer(i)});
            return;
        }
        DXRootView L = getDXRuntimeContext().L();
        if (L == null) {
            fve.e("VideoAnimationLayoutWidgetNode", "reSetParentHeight rootView null:");
            return;
        }
        ViewParent parent = L.getParent();
        if (!(parent instanceof ViewGroup)) {
            fve.e("VideoAnimationLayoutWidgetNode", "reSetParentHeight parent view error:" + parent);
            return;
        }
        fve.e("VideoAnimationLayoutWidgetNode", "reSetParentHeight rootView height:" + i);
        ViewGroup viewGroup = (ViewGroup) parent;
        viewGroup.getLayoutParams().height = i;
        viewGroup.requestLayout();
    }

    public final h6d createPageLifeCycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6d) ipChange.ipc$dispatch("8602dec9", new Object[]{this});
        }
        return new f();
    }

    public final void e0(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62fa162", new Object[]{this, cfcVar});
            return;
        }
        ITopViewService iTopViewService = (ITopViewService) cfcVar.a(ITopViewService.class);
        if (iTopViewService != null) {
            iTopViewService.addTopViewShowListener(this.r);
        }
        fve.e("VideoAnimationLayoutWidgetNode", "VideoAnimationLayout:构造函数 注册 BootImageShowListener");
    }

    public final void f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cfc90e", new Object[]{this});
        } else if (this.m != null) {
            fve.e("VideoAnimationLayoutWidgetNode", "registerLifecycle mLifecycleService 已存在:");
        } else {
            IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) j18.c(getDXRuntimeContext()).a(IMainLifecycleService.class);
            this.m = iMainLifecycleService;
            if (iMainLifecycleService != null) {
                this.n = createPageLifeCycle();
                fve.e("VideoAnimationLayoutWidgetNode", "registerLifecycle mLifecycleService 注册");
                this.m.getPageLifeCycleRegister().a(this.n);
            }
        }
    }

    public final void g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a016054", new Object[]{this});
            return;
        }
        ImageView imageView = this.j;
        if (imageView != null) {
            imageView.setVisibility(8);
            this.j = null;
        }
        Bitmap bitmap = this.k;
        if (bitmap != null) {
            bitmap.recycle();
            this.k = null;
        }
    }

    public final void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
            return;
        }
        AnimatorSet animatorSet = this.b;
        if (animatorSet != null && !animatorSet.isRunning()) {
            this.b.start();
        }
        AnimatorSet animatorSet2 = this.c;
        if (animatorSet2 != null && !animatorSet2.isRunning()) {
            this.c.start();
        }
    }

    public final void j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e230f929", new Object[]{this});
            return;
        }
        AnimatorSet animatorSet = this.b;
        if (animatorSet != null && animatorSet.isRunning()) {
            fve.e("VideoAnimationLayoutWidgetNode", "stopAnimation zoomOutAnimatorSet cancel:");
            this.b.cancel();
            if (this.f != null) {
                fve.e("VideoAnimationLayoutWidgetNode", "stopAnimation zoomOutAnimatorSet removeListener:");
                this.b.removeListener(this.f);
            }
        }
        AnimatorSet animatorSet2 = this.c;
        if (animatorSet2 != null && animatorSet2.isRunning()) {
            fve.e("VideoAnimationLayoutWidgetNode", "stopAnimation scaleAnimatorSet cancel:");
            this.c.cancel();
        }
        if (this.e != null && this.d != null) {
            fve.e("VideoAnimationLayoutWidgetNode", "stopAnimation mScaleAnimator removeUpdateListener:");
            this.e.removeUpdateListener(this.d);
        }
    }

    public final void k0(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("716815fb", new Object[]{this, cfcVar});
            return;
        }
        ITopViewService iTopViewService = (ITopViewService) cfcVar.a(ITopViewService.class);
        if (iTopViewService != null) {
            iTopViewService.addTopViewShowListener(this.r);
        }
        fve.e("VideoAnimationLayoutWidgetNode", "VideoAnimationLayout:构造函数 注册 BootImageShowListener");
    }

    public final void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcf10415", new Object[]{this});
        } else if (this.m == null || this.n == null) {
            fve.e("VideoAnimationLayoutWidgetNode", "unregisterLifecycle mLifecycleService 不存在");
        } else {
            fve.e("VideoAnimationLayoutWidgetNode", "unregisterLifecycle mLifecycleService 注销");
            this.m.getPageLifeCycleRegister().b(this.n);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IVideoCardAnimationService f18912a;
        public final /* synthetic */ View b;

        public a(IVideoCardAnimationService iVideoCardAnimationService, View view) {
            this.f18912a = iVideoCardAnimationService;
            this.b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            fve.e("VideoAnimationLayoutWidgetNode", "onRenderView:START:");
            if (f06.t(f06.this)) {
                fve.e("VideoAnimationLayoutWidgetNode", "onRenderView:isRevertHeight");
                return;
            }
            f06 f06Var = f06.this;
            f06.x(f06Var, f06.G(f06Var));
            if (f06.v(f06.this) == 2) {
                fve.e("VideoAnimationLayoutWidgetNode", "onRenderView:联动闪屏不展示:");
                f06.H(f06.this);
                return;
            }
            List<DXWidgetNode> children = f06.this.getChildren();
            f06 f06Var2 = f06.this;
            f06.J(f06Var2, f06.K(f06Var2, children, "card"));
            if (f06.I(f06.this) == null) {
                fve.e("VideoAnimationLayoutWidgetNode", "onRenderView:insertCardView null:");
                return;
            }
            f06 f06Var3 = f06.this;
            f06.M(f06Var3, f06.I(f06Var3).getHeight());
            View K = f06.K(f06.this, children, "videoCard");
            if (!(K instanceof HVideoAnimationView)) {
                fve.e("VideoAnimationLayoutWidgetNode", "createInsertCardAnimation:not HVideoAnimationView:");
                f06.H(f06.this);
                return;
            }
            f06.O(f06.this, (HVideoAnimationView) K);
            if (!this.f18912a.enableShow()) {
                fve.e("VideoAnimationLayoutWidgetNode", "onRenderView:不满足展示条件:");
                if (this.f18912a.isMeasureSuccess()) {
                    fve.e("VideoAnimationLayoutWidgetNode", "onRenderView: 重置高度:");
                    f06.H(f06.this);
                }
            } else if (!f06.P(f06.this)) {
                f06.Q(f06.this, true);
                f06.R(f06.this);
            } else {
                f06.w(f06.this, this.b, this.f18912a.getFirstFrameImagePath(), f06.N(f06.this));
                f06 f06Var4 = f06.this;
                f06.M(f06Var4, f06.L(f06Var4) + 12);
                if (!this.f18912a.pageBackRefreshChildView()) {
                    fve.e("VideoAnimationLayoutWidgetNode", "非pageBack或已经重新测量，触发启播");
                    f06 f06Var5 = f06.this;
                    o8e y = f06.y(f06Var5, f06.I(f06Var5));
                    f06 f06Var6 = f06.this;
                    f06.z(f06Var6, f06.N(f06Var6), this.b, y);
                }
                if (this.f18912a.pageBackRefreshChildView()) {
                    fve.e("VideoAnimationLayoutWidgetNode", "pageBack 触发内部Video视图测量 ");
                    f06.u(f06.this, false);
                    this.f18912a.updatePageBackChildViewRefreshState(false);
                    f06.R(f06.this);
                    fve.e("VideoAnimationLayoutWidgetNode", "pageBack 触发内部Video视图测量结束，重置状态 ");
                }
            }
        }
    }

    public final void b0(HVideoAnimationView hVideoAnimationView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70999bd", new Object[]{this, hVideoAnimationView});
            return;
        }
        IVideoCardAnimationService iVideoCardAnimationService = (IVideoCardAnimationService) j18.c(getDXRuntimeContext()).a(IVideoCardAnimationService.class);
        if (iVideoCardAnimationService == null) {
            h0();
            return;
        }
        long timeOut = (iVideoCardAnimationService.getTimeOut() * 1000) + 1000;
        fve.e("VideoAnimationLayoutWidgetNode", "playVideoAndPostTimeOutMessage time:" + timeOut);
        this.q.removeCallbacksAndMessages(null);
        this.q.sendEmptyMessageDelayed(1, timeOut);
        if (!hVideoAnimationView.playVideo()) {
            h0();
            fve.e("VideoAnimationLayoutWidgetNode", "播放失败");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("schemeId", (Object) "Page_Home@kaimu_banner");
        jSONObject.put("bizId", (Object) "20509");
        jSONObject.put("schemeNumId", (Object) "500000683");
        jSONObject.put("bizNumId", (Object) "20509");
        jSONObject.put(arp.MATERIAL_ID_KEY, (Object) "41069");
        UCPManager.n(jSONObject);
        JSONObject exposureParam = iVideoCardAnimationService.getExposureParam();
        if (exposureParam != null) {
            JSONObject jSONObject2 = exposureParam.getJSONObject("args");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.put("expandHeight", (Object) String.valueOf(hVideoAnimationView.getHeight()));
            jSONObject2.put("originalHeight", (Object) Integer.valueOf(this.f18911a));
        }
        iVideoCardAnimationService.recordFatigue(iVideoCardAnimationService.getLocalVideoPath());
        vve.m(exposureParam, null);
    }

    public final void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0c3e332", new Object[]{this});
            return;
        }
        fve.e("VideoAnimationLayoutWidgetNode", "revertHeight");
        HVideoAnimationView hVideoAnimationView = this.h;
        if (hVideoAnimationView != null) {
            hVideoAnimationView.setVisibility(8);
        }
        this.p = true;
        c0(-2);
        d0();
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        fve.e("VideoAnimationLayoutWidgetNode", "onMeasure:START:");
        int size = View.MeasureSpec.getSize(i);
        IVideoCardAnimationService a0 = a0();
        if (a0 == null) {
            super.onMeasure(i, i2);
            return;
        }
        if (!this.p && !a0.isMeasureSuccess()) {
            fve.e("VideoAnimationLayoutWidgetNode", "onMeasure:record originalHeightMeasureSpec");
            this.o = i2;
        }
        if (this.p) {
            fve.e("VideoAnimationLayoutWidgetNode", "onMeasure: 触发结束，恢复:");
            super.onMeasure(i, this.o);
        } else if (!a0.enableShow()) {
            super.onMeasure(i, i2);
            fve.e("VideoAnimationLayoutWidgetNode", "onMeasure:不满足展示条件");
        } else {
            float aspectRatio = a0.getAspectRatio();
            int i3 = (int) (size / aspectRatio);
            fve.e("VideoAnimationLayoutWidgetNode", "onMeasure，重置高度aspectRatio：" + aspectRatio + ",measureWidth:" + size + ",height:" + i3);
            if (i3 >= size) {
                super.onMeasure(i, i2);
                fve.e("VideoAnimationLayoutWidgetNode", "onMeasure:高度异常");
                return;
            }
            this.l = true;
            a0.setMeasureState(true);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            fve.e("VideoAnimationLayoutWidgetNode", "onMeasure:高度设置成功:" + makeMeasureSpec);
            super.onMeasure(i, makeMeasureSpec);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        IVideoCardAnimationService a0 = a0();
        if (a0 == null) {
            fve.e("VideoAnimationLayoutWidgetNode", "onRenderView:videoCardAnimationService null");
            return;
        }
        boolean pageBackRefreshRootView = a0.pageBackRefreshRootView();
        fve.e("VideoAnimationLayoutWidgetNode", "onRenderView:needRefreshRootView:" + pageBackRefreshRootView);
        if (pageBackRefreshRootView) {
            fve.e("VideoAnimationLayoutWidgetNode", "onRenderView pageBackRefreshRootView:强刷:");
            this.p = false;
            a0.updatePageBackRootViewRefreshState(false);
            d0();
            return;
        }
        view.post(new a(a0, view));
    }

    public final void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9760b9ce", new Object[]{this});
            return;
        }
        fve.e("VideoAnimationLayoutWidgetNode", "onRenderView:满足展示条件,但高度未设置成功,重刷");
        getDXRuntimeContext().r().I0(getDXRuntimeContext().L().getExpandWidgetNode(), 0, new DXWidgetRefreshOption.a().d(true).g(true).c(2).a());
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent != null) {
            long eventId = dXEvent.getEventId();
            cfc c2 = j18.c(getDXRuntimeContext());
            StringBuilder sb = new StringBuilder("onEvent infoFlowContext is null:");
            if (c2 != null) {
                z = false;
            }
            sb.append(z);
            fve.e("VideoAnimationLayoutWidgetNode", sb.toString());
            if (eventId == 5288671110273408574L) {
                fve.e("VideoAnimationLayoutWidgetNode", "DX_VIEW_EVENT_ON_APPEAR");
                if (c2 != null) {
                    e0(c2);
                }
                f0();
            }
            if (eventId == 5388973340095122049L) {
                fve.e("VideoAnimationLayoutWidgetNode", "DX_VIEW_EVENT_ON_DISAPPEAR");
                if (c2 != null) {
                    k0(c2);
                }
                l0();
            }
        }
        return super.onEvent(dXEvent);
    }

    public final o8e T(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o8e) ipChange.ipc$dispatch("4a2eb103", new Object[]{this, view});
        }
        this.b = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.5f, 1.0f);
        ofFloat.setDuration(300L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat2.setDuration(300L);
        this.b.playTogether(ofFloat, ofFloat2);
        AnimatorListenerAdapter U = U(view);
        this.f = U;
        this.b.addListener(U);
        return W();
    }
}
