package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.taobao.windvane.view.AbstractNaviBar;
import android.taobao.windvane.view.WebErrorView;
import android.taobao.windvane.view.WebWaitingView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class atw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = atw.class.getSimpleName();
    private LinearLayout errorLayout;
    private Context mContext;
    private View mView;
    private View loadingView = null;
    private View errorView = null;
    private AbstractNaviBar naviBar = null;
    private TextView mWarningView = null;
    private boolean showLoading = false;
    private boolean cancelNoti = true;
    private AtomicBoolean isError = new AtomicBoolean(false);
    private boolean errorShow = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else if (atw.access$000(atw.this) != null) {
                ViewParent parent = atw.access$000(atw.this).getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(atw.access$000(atw.this));
                }
                atw.access$002(atw.this, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else if (atw.access$000(atw.this) != null) {
                ViewParent parent = atw.access$000(atw.this).getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(atw.access$000(atw.this));
                }
                atw.access$002(atw.this, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AnimatorSet f16001a;
        public final /* synthetic */ ObjectAnimator b;

        public b(AnimatorSet animatorSet, ObjectAnimator objectAnimator) {
            this.f16001a = animatorSet;
            this.b = objectAnimator;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (atw.access$100(atw.this)) {
                this.f16001a.cancel();
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(this.b);
                animatorSet.start();
                atw.access$102(atw.this, false);
            }
        }
    }

    static {
        t2o.a(989856469);
    }

    public atw(Context context, View view) {
        this.mContext = context;
        this.mView = view;
        this.errorLayout = new LinearLayout(context);
    }

    public static /* synthetic */ TextView access$000(atw atwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("ffe1fa42", new Object[]{atwVar});
        }
        return atwVar.mWarningView;
    }

    public static /* synthetic */ TextView access$002(atw atwVar, TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("572c9cac", new Object[]{atwVar, textView});
        }
        atwVar.mWarningView = textView;
        return textView;
    }

    public static /* synthetic */ boolean access$100(atw atwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("424601f1", new Object[]{atwVar})).booleanValue();
        }
        return atwVar.cancelNoti;
    }

    public static /* synthetic */ boolean access$102(atw atwVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58e228d", new Object[]{atwVar, new Boolean(z)})).booleanValue();
        }
        atwVar.cancelNoti = z;
        return z;
    }

    public void disableShowLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3070cc7e", new Object[]{this});
        } else {
            this.showLoading = false;
        }
    }

    public View getErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f6c59be0", new Object[]{this});
        }
        if (xpw.a(this.mContext) instanceof Activity) {
            if (this.errorView == null) {
                setErrorView(new WebErrorView(this.mContext));
            }
            return this.errorView;
        }
        throw new RuntimeException("context can not be application");
    }

    public void hideErrorPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ada4239c", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.errorLayout;
        if (linearLayout != null && linearLayout.getVisibility() != 8) {
            this.errorLayout.setVisibility(8);
            this.errorShow = false;
        }
    }

    public void hideLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7409c66", new Object[]{this});
            return;
        }
        View view = this.loadingView;
        if (view != null && view.getVisibility() != 8) {
            this.loadingView.setVisibility(8);
        }
    }

    public void hideNaviBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8905e1f2", new Object[]{this});
            return;
        }
        AbstractNaviBar abstractNaviBar = this.naviBar;
        if (abstractNaviBar != null && abstractNaviBar.getVisibility() != 8) {
            this.naviBar.setVisibility(8);
        }
    }

    public boolean isErrorShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37cb9e26", new Object[]{this})).booleanValue();
        }
        return this.errorShow;
    }

    public boolean isShowLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a258d600", new Object[]{this})).booleanValue();
        }
        return this.showLoading;
    }

    public void resetNaviBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22fe07c5", new Object[]{this});
            return;
        }
        AbstractNaviBar abstractNaviBar = this.naviBar;
        if (abstractNaviBar != null) {
            abstractNaviBar.resetState();
        }
    }

    public void setErrorView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36812600", new Object[]{this, view});
        } else if (view != null && this.isError.compareAndSet(false, true)) {
            this.errorView = view;
            this.errorLayout.setVisibility(8);
            ViewParent parent = this.errorView.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.errorView);
            }
            ViewGroup.LayoutParams layoutParams = this.mView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            }
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams).addRule(14, 1);
            }
            this.errorLayout.addView(this.errorView, layoutParams);
            this.errorLayout.setBackgroundColor(-1);
            this.errorLayout.setAlpha(1.0f);
            ViewParent parent2 = this.mView.getParent();
            if (parent2 != null) {
                try {
                    if (this.errorLayout.getParent() == null) {
                        ((ViewGroup) parent2).addView(this.errorLayout, layoutParams);
                    }
                    this.isError.set(false);
                } catch (Exception unused) {
                    ViewParent parent3 = parent2.getParent();
                    if (parent3 != null && this.errorLayout.getParent() == null) {
                        ((ViewGroup) parent3).addView(this.errorLayout, layoutParams);
                    }
                    this.isError.set(false);
                }
            }
        }
    }

    public void setLoadingView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("198d1dcc", new Object[]{this, view});
        } else if (view != null) {
            this.loadingView = view;
            view.setVisibility(8);
            ViewParent parent = this.loadingView.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.loadingView);
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(14, 1);
            ViewParent parent2 = this.mView.getParent();
            if (parent2 != null) {
                try {
                    ((ViewGroup) parent2).addView(this.loadingView, layoutParams);
                } catch (Exception unused) {
                    ViewParent parent3 = parent2.getParent();
                    if (parent3 != null) {
                        ((ViewGroup) parent3).addView(this.loadingView, layoutParams);
                    }
                }
            }
        }
    }

    public void setNaviBar(AbstractNaviBar abstractNaviBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b01595c", new Object[]{this, abstractNaviBar});
            return;
        }
        AbstractNaviBar abstractNaviBar2 = this.naviBar;
        if (abstractNaviBar2 != null) {
            abstractNaviBar2.setVisibility(8);
            this.naviBar = null;
        }
        if (abstractNaviBar != null) {
            this.naviBar = abstractNaviBar;
        }
    }

    public void switchNaviBar(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be04e43", new Object[]{this, new Integer(i)});
            return;
        }
        AbstractNaviBar abstractNaviBar = this.naviBar;
        if (abstractNaviBar != null && i == 1) {
            abstractNaviBar.startLoading();
        }
    }

    public void enableShowLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eba6e083", new Object[]{this});
        } else {
            this.showLoading = true;
        }
    }

    public void showLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f114b", new Object[]{this});
        } else if (!(this.mContext instanceof Activity)) {
            v7t.d(TAG, "context can not be application");
        } else {
            if (this.loadingView == null) {
                WebWaitingView webWaitingView = new WebWaitingView(this.mContext);
                this.loadingView = webWaitingView;
                setLoadingView(webWaitingView);
            }
            this.loadingView.bringToFront();
            if (this.loadingView.getVisibility() != 0) {
                this.loadingView.setVisibility(0);
            }
        }
    }

    private void setNotiView(Drawable drawable, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f87811", new Object[]{this, drawable, str, new Integer(i)});
        } else if (xpw.a(this.mContext) instanceof Activity) {
            TextView textView = new TextView(this.mContext);
            this.mWarningView = textView;
            textView.setTextColor(Color.parseColor("#666666"));
            this.mWarningView.setBackgroundColor(Color.parseColor("#ffe7b3"));
            this.mWarningView.setText(str);
            this.mWarningView.setTextAlignment(4);
            this.mWarningView.setGravity(16);
            ViewParent parent = this.mWarningView.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.mWarningView);
            }
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                this.mWarningView.setCompoundDrawables(drawable, null, null, null);
                int i2 = i / 10;
                this.mWarningView.setCompoundDrawablePadding(i2);
                this.mWarningView.setPadding(i2, 0, 0, 0);
            }
            try {
                this.mWarningView.setElevation(2.0f);
            } catch (Throwable unused) {
            }
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, i);
            ViewParent parent2 = this.mView.getParent();
            if (parent2 != null) {
                try {
                    ((ViewGroup) parent2).addView(this.mWarningView, layoutParams);
                } catch (Exception unused2) {
                    ViewParent parent3 = parent2.getParent();
                    if (parent3 != null) {
                        ((ViewGroup) parent3).addView(this.mWarningView, layoutParams);
                    }
                }
            }
        } else {
            throw new RuntimeException("context can not be application");
        }
    }

    public void loadErrorPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a46c678", new Object[]{this});
        } else if (!(this.mContext instanceof Activity)) {
            v7t.d(TAG, "context can not be application");
        } else {
            if (this.errorView == null) {
                WebErrorView webErrorView = new WebErrorView(this.mContext);
                this.errorView = webErrorView;
                setErrorView(webErrorView);
            }
            this.errorLayout.bringToFront();
            if (this.errorLayout.getVisibility() != 0) {
                this.errorLayout.setVisibility(0);
                this.errorShow = true;
            }
        }
    }

    public void showNotiView(Drawable drawable, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("106f6796", new Object[]{this, drawable, str, new Integer(i)});
            return;
        }
        TextView textView = this.mWarningView;
        if (textView == null || (str != null && !str.equals(textView.getText()))) {
            setNotiView(drawable, str, i);
        }
        this.mWarningView.bringToFront();
        this.mWarningView.setTranslationY(0.0f);
        float f = -i;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mWarningView, "translationY", f, 0.0f);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(1000L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.mWarningView, "translationY", 0.0f, f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat);
        animatorSet.play(ofFloat2).after(l0r.DEFAULT_TCP_CONNECT_TIMEOUT_MS);
        ofFloat2.addListener(new a());
        animatorSet.start();
        this.mWarningView.setOnClickListener(new b(animatorSet, ofFloat2));
    }
}
