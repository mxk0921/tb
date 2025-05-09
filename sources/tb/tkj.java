package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HImageView;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel;
import com.taobao.infoflow.taobao.subservice.biz.overlayservice.impl.common.view.RadiusFrameLayout;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tkj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f28767a;
    public ProgressBar b;
    public boolean c;
    public LinearLayout d;
    public LinearLayout e;
    public final FrameLayout[] f = new FrameLayout[3];
    public final rgl g = new rgl();
    public final cfc h;
    public DinamicXEngine i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f28768a;

        public a(View view) {
            this.f28768a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                tkj.a(tkj.this, this.f28768a);
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
    public class b implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
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
                return;
            }
            view.setVisibility(4);
            if (view.getParent() != null && !tkj.b(tkj.this)) {
                tkj.c(tkj.this, true);
                ((ViewGroup) view.getParent()).removeView(view);
            }
        }
    }

    static {
        t2o.a(491782506);
    }

    public tkj(cfc cfcVar) {
        this.h = cfcVar;
    }

    public static /* synthetic */ void a(tkj tkjVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe23c47", new Object[]{tkjVar, view});
        } else {
            tkjVar.q(view);
        }
    }

    public static /* synthetic */ boolean b(tkj tkjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d2dbbf0", new Object[]{tkjVar})).booleanValue();
        }
        return tkjVar.c;
    }

    public static /* synthetic */ boolean c(tkj tkjVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ab881aa", new Object[]{tkjVar, new Boolean(z)})).booleanValue();
        }
        tkjVar.c = z;
        return z;
    }

    public final Animation.AnimationListener d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation.AnimationListener) ipChange.ipc$dispatch("89a7f6", new Object[]{this, view});
        }
        return new a(view);
    }

    public final FrameLayout e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("ff19c4ae", new Object[]{this, context});
        }
        FrameLayout l = l(context);
        LinearLayout i = i(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, pb6.d(this.i, context, 35.0f));
        layoutParams.gravity = 1;
        l.addView(i, layoutParams);
        return l;
    }

    public final TextView f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("2bd1dbb1", new Object[]{this, context});
        }
        TIconFontTextView tIconFontTextView = new TIconFontTextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        tIconFontTextView.setGravity(17);
        layoutParams.leftMargin = pb6.d(this.i, context, 6.0f);
        layoutParams.gravity = 16;
        tIconFontTextView.setLayoutParams(layoutParams);
        tIconFontTextView.setTextColor(Color.parseColor(why.DEFAULT_MASK_BACKGROUND_COLOR));
        tIconFontTextView.setText("큚");
        return tIconFontTextView;
    }

    public final TextView g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("368dd0e8", new Object[]{this, context});
        }
        TextView textView = new TextView(context);
        textView.setGravity(19);
        textView.setMaxWidth(pb6.d(this.i, context, 118.0f));
        textView.setMaxLines(1);
        textView.setSingleLine();
        textView.setTextSize(0, pb6.d(this.i, context, 13.0f));
        textView.setTextColor(Color.parseColor("#333333"));
        return textView;
    }

    public final TextView h(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("ef59add1", new Object[]{this, context, str});
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setTextSize(0, pb6.d(this.i, context, 15.0f));
        textView.setTextColor(Color.parseColor(why.DEFAULT_MASK_BACKGROUND_COLOR));
        textView.setText(str);
        textView.setLayoutParams(layoutParams);
        textView.setTypeface(null, 1);
        return textView;
    }

    public final LinearLayout i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("b388d209", new Object[]{this, context});
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        HImageView hImageView = new HImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(pb6.d(this.i, context, 15.0f), pb6.d(this.i, context, 15.0f));
        layoutParams.gravity = 16;
        linearLayout.addView(hImageView, layoutParams);
        TextView g = g(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams2.leftMargin = pb6.d(this.i, context, 6.0f);
        layoutParams2.gravity = 16;
        linearLayout.addView(g, layoutParams2);
        return linearLayout;
    }

    public final LinearLayout j(Context context, BaseSectionModel<?> baseSectionModel) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("e6ce6485", new Object[]{this, context, baseSectionModel});
        }
        this.e = (LinearLayout) this.f28767a.findViewById(R.id.ll_feedback);
        if (!p(baseSectionModel)) {
            this.e.addView(h(context, Localization.q(R.string.taobao_app_1000_1_16146)));
            this.d.setVisibility(8);
            return this.e;
        }
        while (true) {
            FrameLayout[] frameLayoutArr = this.f;
            if (i >= frameLayoutArr.length) {
                return this.e;
            }
            frameLayoutArr[i] = e(context);
            this.e.addView(this.f[i]);
            i++;
        }
    }

    public final LinearLayout k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("e9adaddc", new Object[]{this, context});
        }
        LinearLayout linearLayout = (LinearLayout) this.f28767a.findViewById(R.id.ll_find_similar);
        this.d = linearLayout;
        linearLayout.addView(h(context, Localization.q(R.string.app_find_similar)));
        this.d.addView(f(context));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams.height = pb6.d(this.i, context, 63.0f);
        this.d.setLayoutParams(layoutParams);
        return this.d;
    }

    public final FrameLayout l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("7e02700a", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(pb6.d(this.i, context, 152.0f), pb6.d(this.i, context, 35.0f));
        layoutParams.bottomMargin = pb6.d(this.i, context, 7.5f);
        layoutParams.topMargin = pb6.d(this.i, context, 7.5f);
        layoutParams.gravity = 17;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setVisibility(8);
        s(context, frameLayout);
        return frameLayout;
    }

    public final ViewGroup m(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("649d682f", new Object[]{this, context, new Integer(i), new Integer(i2)});
        }
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.info_flow_delete_feedback, (ViewGroup) null);
        this.f28767a = viewGroup;
        ((RadiusFrameLayout) viewGroup.findViewById(R.id.radiusLayout)).setRadius(pb6.d(this.i, context, 6.0f));
        this.f28767a.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
        return this.f28767a;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4176c8c2", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.f28767a;
        if (viewGroup != null && viewGroup.getParent() != null && !this.c) {
            this.c = true;
            v(viewGroup, d(viewGroup));
        }
    }

    public final View o(Context context, int i, int i2, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("27766f46", new Object[]{this, context, new Integer(i), new Integer(i2), baseSectionModel});
        }
        this.f28767a = m(context, i, i2);
        this.d = k(context);
        this.e = j(context, baseSectionModel);
        this.b = (ProgressBar) this.f28767a.findViewById(R.id.pb_server_progress);
        r();
        return this.f28767a;
    }

    public final boolean p(BaseSectionModel<?> baseSectionModel) {
        BaseSubSectionModel subSection;
        BaseSectionModel overlay;
        BaseItemModel item;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb0e28bd", new Object[]{this, baseSectionModel})).booleanValue();
        }
        if (baseSectionModel == null || (subSection = baseSectionModel.getSubSection()) == null || (overlay = subSection.getOverlay()) == null || (item = overlay.getItem()) == null || item.getJSONObject("0") == null) {
            return false;
        }
        return true;
    }

    public final void q(View view) {
        ViewParent parent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("488520af", new Object[]{this, view});
        } else if (view != null && (parent = view.getParent()) != null) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36c9f00a", new Object[]{this});
            return;
        }
        this.f28767a.addOnAttachStateChangeListener(new b());
        this.f28767a.setOnTouchListener(new c());
    }

    public final void s(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b615334f", new Object[]{this, context, view});
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(pb6.d(this.i, context, 63.0f));
        view.setBackground(gradientDrawable);
    }

    public void t(Context context, DinamicXEngine dinamicXEngine, ViewGroup viewGroup, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, BaseSectionModel<?> baseSectionModel) {
        BaseSectionModel<?> overlay;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10dfba19", new Object[]{this, context, dinamicXEngine, viewGroup, onClickListener, onClickListener2, baseSectionModel});
            return;
        }
        BaseSubSectionModel subSection = baseSectionModel.getSubSection();
        if (subSection != null && (overlay = subSection.getOverlay()) != null) {
            this.i = dinamicXEngine;
            viewGroup.addView(o(context, this.g.b(viewGroup), this.g.a(viewGroup), baseSectionModel));
            new rkj(this.d, this.f, this.b).c(overlay, onClickListener, onClickListener2, baseSectionModel);
            u();
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1763215", new Object[]{this});
            return;
        }
        try {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(150L);
            this.f28767a.startAnimation(alphaAnimation);
            AnimationSet animationSet = new AnimationSet(true);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 20.0f, 0.0f);
            translateAnimation.setDuration(150L);
            animationSet.addAnimation(translateAnimation);
            animationSet.addAnimation(alphaAnimation);
            this.e.startAnimation(animationSet);
        } catch (Exception e) {
            fve.c("Home.RNItemOverlayView", "enter animation overlay met exception.", e);
        }
    }

    public final void v(ViewGroup viewGroup, Animation.AnimationListener animationListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96a6f36", new Object[]{this, viewGroup, animationListener});
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(150L);
        alphaAnimation.setAnimationListener(animationListener);
        viewGroup.startAnimation(alphaAnimation);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            if (motionEvent.getAction() != 0) {
                return false;
            }
            fve.e("Home.RNItemOverlayView", "popupView.setOnTouchListener.onTouch");
            tkj.this.n();
            return true;
        }
    }
}
