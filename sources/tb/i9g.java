package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.badge.BadgeDrawable;
import com.taobao.android.litecreator.widgets.SqTUrlImageView;
import com.taobao.android.mediapick.media.VideoMedia;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i9g extends com.taobao.android.mediapick.a<VideoMedia> implements kec {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float SCALE_WHEN_PICKED = 1.1f;
    public static final AccelerateDecelerateInterpolator t = new AccelerateDecelerateInterpolator();
    public TUrlImageView i;
    public TextView j;
    public AppCompatCheckedTextView k;
    public ViewGroup l;
    public View m;
    public boolean p;
    public VideoMedia r;
    public boolean s;
    public final g8h<VideoMedia, kec> n = new g8h<>();
    public final s6w o = new s6w();
    public final Animator.AnimatorListener q = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
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
                i9g.this.p = false;
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
        t2o.a(511705574);
        t2o.a(511705589);
    }

    public static /* synthetic */ Object ipc$super(i9g i9gVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/uikit/album/cellview/LCMixVideoCellView");
    }

    @Override // com.taobao.android.mediapick.a
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60755c2b", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.mediapick.a
    public View e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d0d48fe5", new Object[]{this});
        }
        return this.l;
    }

    @Override // tb.kec
    public ImageView getImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("5c716d3f", new Object[]{this});
        }
        return this.i;
    }

    @Override // com.taobao.android.mediapick.a
    public View k(Activity activity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e28ede9b", new Object[]{this, activity, view});
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        SqTUrlImageView sqTUrlImageView = new SqTUrlImageView(activity);
        this.i = sqTUrlImageView;
        sqTUrlImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.i.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.i.setFadeIn(true);
        TextView textView = new TextView(activity);
        this.j = textView;
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, a65.a(23.0f), 80));
        this.j.setBackgroundResource(R.drawable.dw_lc_mediapick_video_duration_bg);
        this.j.setGravity(8388629);
        this.j.setPadding(0, 0, a65.a(6.0f), 0);
        this.j.setMaxLines(1);
        this.j.setTextColor(-1);
        this.j.setTextSize(1, 12.0f);
        View view2 = new View(activity);
        this.m = view2;
        view2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.m.setBackgroundColor(Color.argb(128, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.l = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(a65.a(60.0f), a65.a(60.0f), BadgeDrawable.TOP_END));
        int a2 = a65.a(6.0f);
        int a3 = a65.a(6.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a65.a(23.0f), a65.a(23.0f), BadgeDrawable.TOP_END);
        layoutParams.setMargins(a2, a2, a2, a2);
        AppCompatCheckedTextView appCompatCheckedTextView = new AppCompatCheckedTextView(activity);
        this.k = appCompatCheckedTextView;
        appCompatCheckedTextView.setLayoutParams(layoutParams);
        this.k.setBackgroundResource(R.drawable.dw_lc_mediapick_select_cb);
        this.k.setGravity(17);
        this.k.setMaxLines(1);
        this.k.setPadding(a3, 0, a3, 0);
        this.k.setTextColor(-1);
        this.k.setTextSize(1, 13.0f);
        this.k.setVisibility(0);
        this.k.setTextAlignment(4);
        this.l.addView(this.k);
        frameLayout.addView(this.i);
        frameLayout.addView(this.j);
        frameLayout.addView(this.m);
        frameLayout.addView(this.l);
        return frameLayout;
    }

    public void o(VideoMedia videoMedia, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3918b8f3", new Object[]{this, videoMedia, new Boolean(z)});
            return;
        }
        if (videoMedia == this.r && z != this.s) {
            q(z);
        }
        this.r = videoMedia;
        this.s = z;
    }

    /* renamed from: p */
    public void i(VideoMedia videoMedia, boolean z) {
        String str;
        float f;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcfde92c", new Object[]{this, videoMedia, new Boolean(z)});
            return;
        }
        this.n.e(videoMedia, this);
        this.o.a(videoMedia, this.j);
        this.k.setChecked(z);
        View view = this.m;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
        int indexOf = this.d.b().indexOf(videoMedia);
        AppCompatCheckedTextView appCompatCheckedTextView = this.k;
        if (indexOf != -1) {
            str = String.valueOf(indexOf + 1);
        } else {
            str = "";
        }
        appCompatCheckedTextView.setText(str);
        if (!this.p) {
            if (!z) {
                f = 1.0f;
            } else {
                f = 1.1f;
            }
            this.i.setScaleX(f);
            this.i.setScaleY(f);
        }
        o(videoMedia, z);
    }

    public void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d38d6a", new Object[]{this, new Boolean(z)});
        } else if (z) {
            r();
        } else {
            s();
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8f9135e", new Object[]{this});
            return;
        }
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("scaleY", 1.1f, 1.0f);
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("scaleX", 1.1f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.k, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.i, ofFloat2, ofFloat);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.m, "alpha", 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat3, ofPropertyValuesHolder, ofFloat4);
        animatorSet.setInterpolator(t);
        animatorSet.setDuration(300L);
        animatorSet.addListener(this.q);
        animatorSet.start();
        this.p = true;
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d201d97", new Object[]{this});
            return;
        }
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("scaleX", 1.0f, 1.3f, 1.0f);
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("scaleY", 1.0f, 1.3f, 1.0f);
        PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat("scaleX", 1.0f, 1.1f);
        PropertyValuesHolder ofFloat4 = PropertyValuesHolder.ofFloat("scaleY", 1.0f, 1.1f);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.k, ofFloat, ofFloat2);
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this.i, ofFloat3, ofFloat4);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.m, "alpha", 0.0f, 1.0f);
        ofPropertyValuesHolder.setDuration(500L);
        ofFloat5.setDuration(300L);
        ofPropertyValuesHolder2.setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofPropertyValuesHolder, ofPropertyValuesHolder2, ofFloat5);
        animatorSet.setInterpolator(t);
        animatorSet.addListener(this.q);
        animatorSet.start();
        this.p = true;
    }
}
