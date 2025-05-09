package com.taobao.search.m3.feedback;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.m3.feedback.FeedbackView;
import com.taobao.search.m3.image.M3ImageView;
import tb.a07;
import tb.ckf;
import tb.t2o;
import tb.tqk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class FeedbackView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Animator animation;
    private final FeedbackCoverView cover;
    private float currentRadius = M3ImageView.Companion.c();
    private final FeedbackPanel panel;
    private final boolean waterfall;
    public static final d Companion = new d(null);
    private static final int feedbackMaskColor2024 = Color.parseColor("#cc0E1119");
    private static final int feedbackMaskColor = Color.parseColor("#e6F2F2F2");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/feedback/FeedbackView$1");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            ckf.g(view, "view");
            ckf.g(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), FeedbackView.access$getCurrentRadius$p(FeedbackView.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class d {
        static {
            t2o.a(815792357);
        }

        public /* synthetic */ d(a07 a07Var) {
            this();
        }

        public d() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class e extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/feedback/FeedbackView$hide$1$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            FeedbackView.this.setVisibility(8);
            ViewParent parent = FeedbackView.this.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.removeView(FeedbackView.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class f implements tqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ tqk f11540a;
        public final /* synthetic */ FeedbackView b;

        public f(tqk tqkVar, FeedbackView feedbackView) {
            this.f11540a = tqkVar;
            this.b = feedbackView;
        }

        @Override // tb.tqk
        public void O(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1273b36d", new Object[]{this, str});
                return;
            }
            ckf.g(str, "from");
            this.f11540a.O(str);
            this.b.hide();
        }

        @Override // tb.tqk
        public void X(JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40a2b509", new Object[]{this, jSONObject, jSONObject2, new Boolean(z)});
            } else {
                this.f11540a.X(jSONObject, jSONObject2, z);
            }
        }
    }

    static {
        t2o.a(815792355);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackView(Context context, boolean z) {
        super(context);
        ckf.g(context, "context");
        this.waterfall = z;
        FeedbackCoverView feedbackCoverView = new FeedbackCoverView(context);
        this.cover = feedbackCoverView;
        FeedbackPanel feedbackPanel = new FeedbackPanel(context, z);
        this.panel = feedbackPanel;
        setClipToOutline(true);
        setOutlineProvider(new a());
        setOnClickListener(new View.OnClickListener() { // from class: tb.s6z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedbackView._init_$lambda$0(FeedbackView.this, view);
            }
        });
        feedbackPanel.getCloseButton().setOnClickListener(new View.OnClickListener() { // from class: tb.t6z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedbackView._init_$lambda$1(FeedbackView.this, view);
            }
        });
        feedbackCoverView.setVisibility(8);
        feedbackPanel.setVisibility(8);
        addView(feedbackCoverView, new FrameLayout.LayoutParams(-1, -1));
        addView(feedbackPanel, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(FeedbackView feedbackView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eea25814", new Object[]{feedbackView, view});
            return;
        }
        ckf.g(feedbackView, "this$0");
        feedbackView.hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(FeedbackView feedbackView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b105473", new Object[]{feedbackView, view});
            return;
        }
        ckf.g(feedbackView, "this$0");
        feedbackView.hide();
    }

    public static final /* synthetic */ float access$getCurrentRadius$p(FeedbackView feedbackView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43fba608", new Object[]{feedbackView})).floatValue();
        }
        return feedbackView.currentRadius;
    }

    public static /* synthetic */ Object ipc$super(FeedbackView feedbackView, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/feedback/FeedbackView");
    }

    private final void runAnimation(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4d2a15d", new Object[]{this, animator});
            return;
        }
        Animator animator2 = this.animation;
        if (animator2 != null && animator2.isRunning()) {
            Animator animator3 = this.animation;
            ckf.d(animator3);
            animator3.cancel();
        }
        animator.start();
        this.animation = animator;
    }

    public final void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, View.ALPHA, getAlpha(), 0.0f);
        ofFloat.addListener(new e());
        runAnimation(ofFloat);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        Animator animator = this.animation;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void update(com.taobao.search.m3.M3CellBean r17, java.lang.String r18, tb.tqk r19, com.taobao.search.searchdoor.sf.config.TbSearchStyle r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.m3.feedback.FeedbackView.update(com.taobao.search.m3.M3CellBean, java.lang.String, tb.tqk, com.taobao.search.searchdoor.sf.config.TbSearchStyle, boolean):void");
    }
}
