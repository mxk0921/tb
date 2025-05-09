package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.s6o;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class FeedToastView extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Runnable mHideAction;
    private Animation mHideAnimation;
    private Animation mShowAnimation;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FeedToastView.this.hide();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                FeedToastView.access$000(FeedToastView.this);
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

    static {
        t2o.a(503317451);
    }

    public FeedToastView(Context context) {
        this(context, null, 0);
    }

    public static /* synthetic */ void access$000(FeedToastView feedToastView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d59dd9d", new Object[]{feedToastView});
        } else {
            feedToastView.destroy();
        }
    }

    private void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        removeCallbacks(this.mHideAction);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setBackgroundResource(R.drawable.layout_gradient_msg_bg);
        setTextColor(-1);
        setTextSize(s6o.c(getContext(), 14));
        setHeight(s6o.c(getContext(), 30));
        setGravity(17);
        setVisibility(0);
        setPadding(s6o.c(getContext(), 15), 0, s6o.c(getContext(), 15), 0);
    }

    public static /* synthetic */ Object ipc$super(FeedToastView feedToastView, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/FeedToastView");
    }

    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else if (getVisibility() != 8) {
            if (this.mHideAnimation == null) {
                this.mHideAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.tf_down_to_up);
            }
            this.mHideAnimation.setAnimationListener(new b());
            startAnimation(this.mHideAnimation);
            setVisibility(8);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        removeCallbacks(this.mHideAction);
        setVisibility(8);
    }

    public void show(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20d609ce", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            setText(str);
            if (this.mShowAnimation == null) {
                this.mShowAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.tf_up_to_down);
            }
            setLines(1);
            setVisibility(0);
            startAnimation(this.mShowAnimation);
            removeCallbacks(this.mHideAction);
            postDelayed(this.mHideAction, 2500L);
        }
    }

    public FeedToastView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.mHideAction = new a();
    }

    public FeedToastView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHideAction = new a();
    }

    public void show(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9eba6b6", new Object[]{this, str, new Long(j)});
        } else if (!TextUtils.isEmpty(str)) {
            setText(str);
            if (this.mShowAnimation == null) {
                this.mShowAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.tf_up_to_down);
            }
            setLines(1);
            startAnimation(this.mShowAnimation);
            removeCallbacks(this.mHideAction);
            Runnable runnable = this.mHideAction;
            if (j <= 0) {
                j = 2500;
            }
            postDelayed(runnable, j);
        }
    }
}
