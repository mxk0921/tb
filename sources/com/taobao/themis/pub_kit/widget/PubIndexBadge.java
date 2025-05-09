package com.taobao.themis.pub_kit.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.RoundFeature;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PubIndexBadge extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int bgWidth;
    private TUrlImageView imgHomeIcon;
    public boolean isShort;
    private String title;
    private TextView tvHomeTitle;
    private View vBg;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ViewGroup.LayoutParams layoutParams = PubIndexBadge.access$000(PubIndexBadge.this).getLayoutParams();
            layoutParams.width = intValue;
            PubIndexBadge.access$000(PubIndexBadge.this).setLayoutParams(layoutParams);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ViewGroup.LayoutParams layoutParams = PubIndexBadge.access$000(PubIndexBadge.this).getLayoutParams();
            layoutParams.width = intValue;
            PubIndexBadge.access$000(PubIndexBadge.this).setLayoutParams(layoutParams);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                PubIndexBadge.access$000(PubIndexBadge.this).setText(PubIndexBadge.access$100(PubIndexBadge.this));
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

    static {
        t2o.a(845152408);
    }

    public PubIndexBadge(Context context) {
        super(context);
        init(context);
    }

    public static /* synthetic */ TextView access$000(PubIndexBadge pubIndexBadge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("1feff546", new Object[]{pubIndexBadge});
        }
        return pubIndexBadge.tvHomeTitle;
    }

    public static /* synthetic */ String access$100(PubIndexBadge pubIndexBadge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1ea44ed", new Object[]{pubIndexBadge});
        }
        return pubIndexBadge.title;
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        View.inflate(context, R.layout.tms_pub_view_pub_index_badge, this);
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById(R.id.imgHomeIcon);
        this.imgHomeIcon = tUrlImageView;
        tUrlImageView.addFeature(new RoundFeature());
        this.tvHomeTitle = (TextView) findViewById(R.id.tvHome);
        this.vBg = findViewById(R.id.btnHomeBg);
    }

    public static /* synthetic */ Object ipc$super(PubIndexBadge pubIndexBadge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub_kit/widget/PubIndexBadge");
    }

    public void scaleRevert() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b4e2d55", new Object[]{this});
        } else if (this.isShort) {
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator ofInt = ValueAnimator.ofInt(0, this.bgWidth);
            ofInt.addUpdateListener(new b());
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.vBg, "alpha", 0.0f, 1.0f);
            animatorSet.setDuration(300L);
            animatorSet.play(ofInt);
            animatorSet.play(ofFloat);
            animatorSet.addListener(new c());
            animatorSet.start();
            this.isShort = false;
        }
    }

    public void scaleShort() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9054d9", new Object[]{this});
        } else if (!this.isShort) {
            this.tvHomeTitle.setText("");
            this.bgWidth = this.tvHomeTitle.getWidth();
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator ofInt = ValueAnimator.ofInt(this.tvHomeTitle.getWidth(), 0);
            ofInt.setDuration(300L);
            ofInt.addUpdateListener(new a());
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.vBg, "alpha", 1.0f, 0.0f);
            animatorSet.setDuration(300L);
            animatorSet.play(ofInt);
            animatorSet.play(ofFloat);
            animatorSet.start();
            this.isShort = true;
        }
    }

    public void setData(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da8cc547", new Object[]{this, str, str2});
            return;
        }
        this.title = str2;
        this.imgHomeIcon.setImageUrl(str);
        this.tvHomeTitle.setText(str2);
    }

    public PubIndexBadge(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }
}
