package com.taobao.homepage.view.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.view.HImageView;
import com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import java.util.Timer;
import java.util.TimerTask;
import tb.c4b;
import tb.fve;
import tb.get;
import tb.h2b;
import tb.t2b;
import tb.t2o;
import tb.uuo;
import tb.vgp;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ShakeHomePageTipView extends FrameLayout implements vgp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static t2b homePageManager;
    private int animHeight;
    private ValueAnimator bgAnim;
    private HImageView imageView;
    private TextView textView;
    private Timer timer;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Handler f10616a;
        public final /* synthetic */ vgp.a b;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.homepage.view.widgets.ShakeHomePageTipView$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class RunnableC0564a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0564a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a.this.b.a();
                ShakeHomePageTipView.this.hide();
            }
        }

        public a(Handler handler, vgp.a aVar) {
            this.f10616a = handler;
            this.b = aVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/view/widgets/ShakeHomePageTipView$1");
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f10616a.post(new RunnableC0564a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/view/widgets/ShakeHomePageTipView$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            } else {
                ShakeHomePageTipView.this.setVisibility(0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/view/widgets/ShakeHomePageTipView$3");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                ShakeHomePageTipView.this.setVisibility(8);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ShakeHomePageTipView.this.hide();
            }
        }
    }

    static {
        t2o.a(729809187);
        t2o.a(763363345);
    }

    public ShakeHomePageTipView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(ShakeHomePageTipView shakeHomePageTipView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -436676516) {
            super.onFinishInflate();
            return null;
        } else if (hashCode == 348684699) {
            super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/homepage/view/widgets/ShakeHomePageTipView");
        }
    }

    @Override // tb.vgp
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        get.a().h(new d());
        try {
            Timer timer = this.timer;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        ValueAnimator valueAnimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        if (view == this && i != 0 && (valueAnimator = this.bgAnim) != null && valueAnimator.isRunning()) {
            this.bgAnim.cancel();
        }
    }

    public void setColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("703eebf2", new Object[]{this, str});
        }
    }

    @Override // tb.vgp
    public void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
            return;
        }
        setText(str, vu3.b.GEO_NOT_SUPPORT, null);
        this.imageView.setVisibility(0);
    }

    public ShakeHomePageTipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShakeHomePageTipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if (getVisibility() != 0) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            if (h2b.a().c() != null) {
                IHomeSearchBarService iHomeSearchBarService = (IHomeSearchBarService) c4b.i().h(IHomeSearchBarService.class);
                if (iHomeSearchBarService == null) {
                    fve.e("ShakeHomePageTipView", "show shakeHomepageTipView failed，searchBar Not init.");
                    return;
                }
                layoutParams.topMargin = iHomeSearchBarService.getCurrentSearchContainerHeightPX();
                setLayoutParams(layoutParams);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationY", -this.animHeight, 0.0f);
                ofFloat.addListener(new b());
                ofFloat.setDuration(500L);
                ofFloat.start();
                this.bgAnim.start();
            }
        }
    }

    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else if (getTranslationY() >= 0.0f) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationY", 0.0f, -this.animHeight);
            ofFloat.addListener(new c());
            ofFloat.setDuration(500L);
            ofFloat.start();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f8d85c", new Object[]{this});
            return;
        }
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.homepage_shake_tip_view, (ViewGroup) this, true);
        bringToFront();
        HImageView hImageView = (HImageView) findViewById(R.id.iv_icon_shake);
        this.imageView = hImageView;
        hImageView.setImageUrl(uuo.r(R.drawable.homepage_icon_shake_reg));
        ((HImageView) findViewById(R.id.iv_shakebar_bg)).setImageUrl(uuo.r(R.drawable.homepage_bg_shakebar));
        TextView textView = (TextView) findViewById(R.id.tip_text_view);
        this.textView = textView;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 0.3f);
        this.bgAnim = ofFloat;
        ofFloat.setRepeatMode(2);
        this.bgAnim.setRepeatCount(-1);
        this.bgAnim.setDuration(1000L);
        this.animHeight = DensityUtil.dip2px(getContext(), 40.0f);
    }

    @Override // tb.vgp
    public void setText(String str, double d2, vgp.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11242068", new Object[]{this, str, new Double(d2), aVar});
            return;
        }
        this.imageView.setVisibility(8);
        if (!TextUtils.isEmpty(str)) {
            this.textView.setText(str);
            if (d2 > vu3.b.GEO_NOT_SUPPORT && aVar != null) {
                Handler handler = new Handler();
                Timer timer = new Timer("shakeHomePageTipViewTimer");
                this.timer = timer;
                timer.schedule(new a(handler, aVar), (int) (d2 * 1000.0d));
            }
            show();
            setBackgroundColor(0);
        }
    }
}
