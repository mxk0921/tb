package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class dpv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final View b;
    public final Context c;

    /* renamed from: a  reason: collision with root package name */
    public TextView f18001a = null;
    public boolean d = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else if (dpv.a(dpv.this) != null) {
                ViewParent parent = dpv.a(dpv.this).getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(dpv.a(dpv.this));
                }
                dpv.b(dpv.this, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else if (dpv.a(dpv.this) != null) {
                ViewParent parent = dpv.a(dpv.this).getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(dpv.a(dpv.this));
                }
                dpv.b(dpv.this, null);
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AnimatorSet f18003a;
        public final /* synthetic */ ObjectAnimator b;

        public b(AnimatorSet animatorSet, ObjectAnimator objectAnimator) {
            this.f18003a = animatorSet;
            this.b = objectAnimator;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (dpv.c(dpv.this)) {
                this.f18003a.cancel();
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(this.b);
                animatorSet.start();
                dpv.d(dpv.this, false);
            }
        }
    }

    static {
        t2o.a(85983276);
    }

    public dpv(Context context, View view) {
        this.c = context;
        this.b = view;
    }

    public static /* synthetic */ TextView a(dpv dpvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("680a6500", new Object[]{dpvVar});
        }
        return dpvVar.f18001a;
    }

    public static /* synthetic */ TextView b(dpv dpvVar, TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("25c12b2e", new Object[]{dpvVar, textView});
        }
        dpvVar.f18001a = textView;
        return textView;
    }

    public static /* synthetic */ boolean c(dpv dpvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17503aef", new Object[]{dpvVar})).booleanValue();
        }
        return dpvVar.d;
    }

    public static /* synthetic */ boolean d(dpv dpvVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59ce10cf", new Object[]{dpvVar, new Boolean(z)})).booleanValue();
        }
        dpvVar.d = z;
        return z;
    }

    public final void e(Drawable drawable, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f87811", new Object[]{this, drawable, str, new Integer(i)});
            return;
        }
        TextView textView = new TextView(this.c);
        this.f18001a = textView;
        textView.setTextColor(Color.parseColor("#666666"));
        this.f18001a.setBackgroundColor(Color.parseColor("#ffe7b3"));
        this.f18001a.setText(str);
        this.f18001a.setGravity(16);
        ViewParent parent = this.f18001a.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(this.f18001a);
        }
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.f18001a.setCompoundDrawables(drawable, null, null, null);
            int i2 = i / 10;
            this.f18001a.setCompoundDrawablePadding(i2);
            this.f18001a.setPadding(i2, 0, 0, 0);
        }
        try {
            this.f18001a.setElevation(2.0f);
        } catch (Throwable unused) {
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, i);
        ViewParent parent2 = this.b.getParent();
        if (parent2 != null) {
            try {
                ((ViewGroup) parent2).addView(this.f18001a, layoutParams);
            } catch (Exception unused2) {
                ViewParent parent3 = parent2.getParent();
                if (parent3 != null) {
                    ((ViewGroup) parent3).addView(this.f18001a, layoutParams);
                }
            }
        }
    }

    public void f(Drawable drawable, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("106f6796", new Object[]{this, drawable, str, new Integer(i)});
            return;
        }
        TextView textView = this.f18001a;
        if (textView == null || (str != null && !str.equals(textView.getText()))) {
            e(drawable, str, i);
        }
        this.f18001a.bringToFront();
        this.f18001a.setTranslationY(0.0f);
        float f = -i;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18001a, "translationY", f, 0.0f);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(1000L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f18001a, "translationY", 0.0f, f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat);
        animatorSet.play(ofFloat2).after(3000L);
        ofFloat2.addListener(new a());
        animatorSet.start();
        this.f18001a.setOnClickListener(new b(animatorSet, ofFloat2));
    }
}
