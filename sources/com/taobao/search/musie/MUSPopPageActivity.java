package com.taobao.search.musie;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.result.IrpOverlaySlice;
import com.taobao.android.weex_uikit.ui.MUSView;
import com.taobao.android.weex_uikit.widget.overlay.MUSOverlay;
import com.taobao.android.weex_uikit.widget.overlay.MUSOverlaySlice;
import com.taobao.android.weex_uikit.widget.overlay.MUSOverlayView;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.acq;
import tb.lpc;
import tb.qrl;
import tb.r4p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MUSPopPageActivity extends MUSPageActivity implements lpc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int s = Color.argb(127, 0, 0, 0);
    public float m = 0.9f;
    public int n = s;
    public float o = 0.5f;
    public boolean p = false;
    public Animator q = null;
    public final List<MUSOverlay> r = new ArrayList(5);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                MUSPopPageActivity.this.finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/MUSPopPageActivity$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            MUSPopPageActivity.o3(MUSPopPageActivity.this);
            MUSPopPageActivity.this.overridePendingTransition(0, 0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(MUSPopPageActivity mUSPopPageActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f11562a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a extends AnimatorListenerAdapter {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/MUSPopPageActivity$4$1");
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                } else {
                    d.this.f11562a.setVisibility(0);
                }
            }
        }

        public d(View view) {
            this.f11562a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ((ViewGroup.MarginLayoutParams) this.f11562a.getLayoutParams()).topMargin = (int) ((1.0f - MUSPopPageActivity.p3(MUSPopPageActivity.this)) * this.f11562a.getMeasuredHeight());
            this.f11562a.requestLayout();
            MUSPopPageActivity.q3(MUSPopPageActivity.this, true, new a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f11564a;

        public e(View view) {
            this.f11564a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else {
                this.f11564a.setBackgroundColor(Color.argb((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f), Color.red(MUSPopPageActivity.r3(MUSPopPageActivity.this)), Color.green(MUSPopPageActivity.r3(MUSPopPageActivity.this)), Color.blue(MUSPopPageActivity.r3(MUSPopPageActivity.this))));
            }
        }
    }

    static {
        t2o.a(815792627);
        t2o.a(986710021);
    }

    public static /* synthetic */ Object ipc$super(MUSPopPageActivity mUSPopPageActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1246973220:
                return new Boolean(super.dispatchKeyEvent((KeyEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/MUSPopPageActivity");
        }
    }

    public static /* synthetic */ void o3(MUSPopPageActivity mUSPopPageActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b70e07c7", new Object[]{mUSPopPageActivity});
        } else {
            super.finish();
        }
    }

    public static /* synthetic */ float p3(MUSPopPageActivity mUSPopPageActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb0f8b77", new Object[]{mUSPopPageActivity})).floatValue();
        }
        return mUSPopPageActivity.m;
    }

    public static /* synthetic */ void q3(MUSPopPageActivity mUSPopPageActivity, boolean z, AnimatorListenerAdapter animatorListenerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c93f5d0c", new Object[]{mUSPopPageActivity, new Boolean(z), animatorListenerAdapter});
        } else {
            mUSPopPageActivity.t3(z, animatorListenerAdapter);
        }
    }

    public static /* synthetic */ int r3(MUSPopPageActivity mUSPopPageActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8225c6fc", new Object[]{mUSPopPageActivity})).intValue();
        }
        return mUSPopPageActivity.n;
    }

    @Override // tb.lpc
    public void C1(MUSOverlay mUSOverlay) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be0a6d10", new Object[]{this, mUSOverlay});
        } else {
            ((ArrayList) this.r).add(mUSOverlay);
        }
    }

    @Override // tb.lpc
    public MUSOverlaySlice C2(Context context, MUSView mUSView, MUSOverlay mUSOverlay, MUSOverlayView mUSOverlayView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSOverlaySlice) ipChange.ipc$dispatch("e7ed98aa", new Object[]{this, context, mUSView, mUSOverlay, mUSOverlayView});
        }
        return new IrpOverlaySlice(context, mUSView, mUSOverlay, mUSOverlayView);
    }

    @Override // com.taobao.search.musie.MUSPageActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a534d24", new Object[]{this, keyEvent})).booleanValue();
        }
        if (keyEvent.getKeyCode() != 4) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0) {
            if (((ArrayList) this.r).isEmpty()) {
                finish();
            } else {
                List<MUSOverlay> list = this.r;
                ((MUSOverlay) ((ArrayList) list).get(((ArrayList) list).size() - 1)).fireEvent("close", null);
            }
        }
        return true;
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        } else if (!this.p) {
            this.p = true;
            Animator animator = this.q;
            if (animator != null && animator.isRunning()) {
                this.q.end();
            }
            t3(false, new b());
        }
    }

    @Override // tb.lpc
    public void s2(MUSOverlay mUSOverlay) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2468ce1d", new Object[]{this, mUSOverlay});
        } else {
            ((ArrayList) this.r).remove(mUSOverlay);
        }
    }

    public final void s3() {
        View decorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1b0efb8", new Object[]{this});
        } else if (getWindow() != null && (decorView = getWindow().getDecorView()) != null) {
            View findViewById = findViewById(16908290);
            ViewProxy.setOnClickListener(findViewById, new c(this));
            findViewById.setVisibility(4);
            decorView.post(new d(findViewById));
        }
    }

    public final void t3(boolean z, AnimatorListenerAdapter animatorListenerAdapter) {
        float f;
        float f2;
        float f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("120b807b", new Object[]{this, new Boolean(z), animatorListenerAdapter});
            return;
        }
        View findViewById = findViewById(16908290);
        AnimatorSet animatorSet = new AnimatorSet();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
        Property property = View.TRANSLATION_Y;
        float f4 = 0.0f;
        if (z) {
            f = findViewById.getMeasuredHeight() - marginLayoutParams.topMargin;
        } else {
            f = 0.0f;
        }
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = findViewById.getMeasuredHeight();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, property, f, f2);
        View decorView = getWindow().getDecorView();
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = this.o;
        }
        if (z) {
            f4 = this.o;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f3, f4);
        ofFloat2.addUpdateListener(new e(decorView));
        animatorSet.playTogether(ofFloat, ofFloat2);
        if (animatorListenerAdapter != null) {
            animatorSet.addListener(animatorListenerAdapter);
        }
        animatorSet.start();
        this.q = animatorSet;
    }

    @Override // com.taobao.search.musie.MUSPageActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        Intent intent = getIntent();
        if (!(intent == null || (data = intent.getData()) == null)) {
            this.m = qrl.d(data.getQueryParameter(r4p.KEY_POP_UP_HEIGHT), 0.9f);
            int b2 = qrl.b("#" + data.getQueryParameter("tbsearch_popup_background"), s);
            this.o = ((float) Color.alpha(b2)) / 255.0f;
            this.n = b2;
        }
        super.onCreate(bundle);
        s3();
        View findViewById = findViewById(R.id.fl_root);
        if (findViewById != null) {
            findViewById.setBackgroundColor(0);
        }
        if (getWindow().getDecorView() != null) {
            View view = new View(this);
            ((ViewGroup) getWindow().getDecorView()).addView(view, 0, new ViewGroup.LayoutParams(-1, -1));
            ViewProxy.setOnClickListener(view, new a());
        }
    }
}
