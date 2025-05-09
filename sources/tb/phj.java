package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.home.component.view.ClipLayout;
import com.taobao.android.home.component.view.HImageView;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class phj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f26094a;
    public ProgressBar b;
    public boolean c;
    public LinearLayout d;
    public LinearLayout e;
    public FrameLayout f;
    public FrameLayout g;
    public FrameLayout h;
    public final qhj i;
    public JSONObject j;
    public final DinamicXEngine k;
    public final boolean l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                ((ViewGroup) phj.a(phj.this).getParent()).removeView(phj.a(phj.this));
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View.OnClickListener f26097a;

        public c(View.OnClickListener onClickListener) {
            this.f26097a = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            View.OnClickListener onClickListener = this.f26097a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
                phj.b(phj.this).setVisibility(8);
                phj.c(phj.this).setVisibility(8);
                phj.d(phj.this).setVisibility(8);
                phj.e(phj.this).setVisibility(8);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f26098a;
        public final /* synthetic */ int b;
        public final /* synthetic */ View.OnClickListener c;
        public final /* synthetic */ JSONObject d;

        public d(JSONObject jSONObject, int i, View.OnClickListener onClickListener, JSONObject jSONObject2) {
            this.f26098a = jSONObject;
            this.b = i;
            this.c = onClickListener;
            this.d = jSONObject2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                phj.f(phj.this, this.f26098a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
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
            if (view.getParent() != null && !phj.g(phj.this)) {
                phj.h(phj.this, true);
                ((ViewGroup) view.getParent()).removeView(view);
            }
        }
    }

    static {
        t2o.a(729809905);
    }

    public phj(qhj qhjVar, DinamicXEngine dinamicXEngine, String str) {
        this.i = qhjVar;
        this.k = dinamicXEngine;
        this.l = b9b.c(str);
    }

    public static /* synthetic */ ViewGroup a(phj phjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("f07a58fb", new Object[]{phjVar});
        }
        return phjVar.f26094a;
    }

    public static /* synthetic */ FrameLayout b(phj phjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("8d56c31e", new Object[]{phjVar});
        }
        return phjVar.f;
    }

    public static /* synthetic */ FrameLayout c(phj phjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("d556217d", new Object[]{phjVar});
        }
        return phjVar.g;
    }

    public static /* synthetic */ FrameLayout d(phj phjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("1d557fdc", new Object[]{phjVar});
        }
        return phjVar.h;
    }

    public static /* synthetic */ LinearLayout e(phj phjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("1f79c835", new Object[]{phjVar});
        }
        return phjVar.d;
    }

    public static /* synthetic */ void f(phj phjVar, JSONObject jSONObject, int i, View.OnClickListener onClickListener, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d58409", new Object[]{phjVar, jSONObject, new Integer(i), onClickListener, jSONObject2});
        } else {
            phjVar.p(jSONObject, i, onClickListener, jSONObject2);
        }
    }

    public static /* synthetic */ boolean g(phj phjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5aa41e4", new Object[]{phjVar})).booleanValue();
        }
        return phjVar.c;
    }

    public static /* synthetic */ boolean h(phj phjVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d20b52b6", new Object[]{phjVar, new Boolean(z)})).booleanValue();
        }
        phjVar.c = z;
        return z;
    }

    public FrameLayout j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("ff19c4ae", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a3b.a(this.k, context, 152.0f), a3b.a(this.k, context, 35.0f));
        layoutParams.bottomMargin = a3b.a(this.k, context, 7.5f);
        layoutParams.topMargin = a3b.a(this.k, context, 7.5f);
        layoutParams.gravity = 17;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(layoutParams);
        q(context, frameLayout);
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, a3b.a(this.k, context, 35.0f));
        layoutParams2.gravity = 1;
        linearLayout.setOrientation(0);
        frameLayout.addView(linearLayout, layoutParams2);
        HImageView hImageView = new HImageView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(a3b.a(this.k, context, 15.0f), a3b.a(this.k, context, 15.0f));
        layoutParams3.gravity = 16;
        linearLayout.addView(hImageView, layoutParams3);
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
        textView.setGravity(19);
        textView.setMaxWidth(a3b.a(this.k, context, 118.0f));
        layoutParams4.leftMargin = a3b.a(this.k, context, 6.0f);
        layoutParams4.gravity = 16;
        textView.setMaxLines(1);
        textView.setSingleLine();
        textView.setTextSize(0, a3b.a(this.k, context, 13.0f));
        textView.setTextColor(Color.parseColor("#333333"));
        linearLayout.addView(textView, layoutParams4);
        return frameLayout;
    }

    public TextView k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("2bd1dbb1", new Object[]{this, context});
        }
        TIconFontTextView tIconFontTextView = new TIconFontTextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        tIconFontTextView.setGravity(17);
        layoutParams.leftMargin = a3b.a(this.k, context, 6.0f);
        layoutParams.gravity = 16;
        tIconFontTextView.setLayoutParams(layoutParams);
        tIconFontTextView.setTextColor(Color.parseColor(why.DEFAULT_MASK_BACKGROUND_COLOR));
        tIconFontTextView.setText(R.string.uik_icon_right);
        return tIconFontTextView;
    }

    public TextView l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("6f591140", new Object[]{this, context});
        }
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        textView.setGravity(17);
        textView.setTextSize(0, a3b.a(this.k, context, 15.0f));
        textView.setTextColor(Color.parseColor(why.DEFAULT_MASK_BACKGROUND_COLOR));
        textView.setText(Localization.q(R.string.taobao_app_1000_1_16146));
        textView.setLayoutParams(layoutParams);
        textView.setTypeface(null, 1);
        return textView;
    }

    public TextView m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("98af10c7", new Object[]{this, context});
        }
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        textView.setGravity(17);
        textView.setTextSize(0, a3b.a(this.k, context, 15.0f));
        textView.setTextColor(Color.parseColor(why.DEFAULT_MASK_BACKGROUND_COLOR));
        textView.setText(Localization.q(R.string.taobao_app_1000_1_16162));
        textView.setLayoutParams(layoutParams);
        textView.setTypeface(null, 1);
        return textView;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else if (this.f26094a.getParent() != null && !this.c) {
            this.c = true;
            try {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(150L);
                alphaAnimation.setAnimationListener(new a());
                this.f26094a.startAnimation(alphaAnimation);
            } catch (Exception e2) {
                y9n.d("enter animation overlay met exception.", e2);
            }
        }
    }

    public final void o(Context context, int i, int i2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a72849b4", new Object[]{this, context, new Integer(i), new Integer(i2), jSONObject});
            return;
        }
        this.j = jSONObject;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.recommend_delete_feedback, (ViewGroup) null);
        this.f26094a = viewGroup;
        ((ClipLayout) viewGroup.findViewById(R.id.clipLayout)).setOnlyRadius(a3b.a(this.k, context, (!this.l || !b9b.h()) ? 6 : 18));
        LinearLayout linearLayout = (LinearLayout) this.f26094a.findViewById(R.id.ll_find_similar);
        this.d = linearLayout;
        linearLayout.addView(m(context));
        this.d.addView(k(context));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams.height = a3b.a(this.k, context, 63.0f);
        this.d.setLayoutParams(layoutParams);
        this.b = (ProgressBar) this.f26094a.findViewById(R.id.pb_server_progress);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(i, i2);
        this.f26094a.setTag("guess_delete_popup");
        this.f26094a.setLayoutParams(layoutParams2);
        this.f26094a.addOnAttachStateChangeListener(new e());
        this.f26094a.setOnTouchListener(new f());
        this.e = (LinearLayout) this.f26094a.findViewById(R.id.ll_feedback);
        if (jSONObject.getJSONObject("subSection") == null || jSONObject.getJSONObject("subSection").getJSONObject("overlay") == null || jSONObject.getJSONObject("subSection").getJSONObject("overlay").getJSONObject("item") == null || jSONObject.getJSONObject("subSection").getJSONObject("overlay").getJSONObject("item").getJSONObject("0") == null) {
            this.e.addView(l(context));
            this.d.setVisibility(8);
            return;
        }
        FrameLayout j = j(context);
        this.f = j;
        this.e.addView(j);
        FrameLayout j2 = j(context);
        this.g = j2;
        this.e.addView(j2);
        FrameLayout j3 = j(context);
        this.h = j3;
        this.e.addView(j3);
    }

    public final void p(JSONObject jSONObject, int i, View.OnClickListener onClickListener, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38fb867d", new Object[]{this, jSONObject, new Integer(i), onClickListener, jSONObject2});
            return;
        }
        this.i.e(jSONObject, jSONObject2);
        View[] viewArr = {this.d, this.f, this.g, this.h};
        View view = viewArr[i];
        for (int i2 = 0; i2 < 4; i2++) {
            View view2 = viewArr[i2];
            view2.setClickable(false);
            view2.setVisibility(8);
        }
        onClickListener.onClick(view);
        gqv.c(this.j, jSONObject2);
        this.b.setVisibility(0);
    }

    public void q(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b615334f", new Object[]{this, context, view});
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(a3b.a(this.k, context, 63.0f));
        view.setBackgroundDrawable(gradientDrawable);
    }

    public void r(Context context, View view, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("900a226c", new Object[]{this, context, view, onClickListener, onClickListener2, jSONObject});
            return;
        }
        try {
            int paddingLeft = view.getPaddingLeft();
            o(context, (view.getWidth() - paddingLeft) - view.getPaddingRight(), (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom(), jSONObject);
            ((ViewGroup) view).addView(this.f26094a);
            if (jSONObject.getJSONObject("subSection") != null && jSONObject.getJSONObject("subSection").getJSONObject("overlay") != null) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("subSection").getJSONObject("overlay");
                i(jSONObject2, onClickListener, onClickListener2);
                this.i.f(jSONObject2);
                s();
            }
        } catch (Exception e2) {
            y9n.d("Delete overlay met exception.", e2);
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1763215", new Object[]{this});
            return;
        }
        try {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(150L);
            alphaAnimation.setAnimationListener(new b());
            this.f26094a.startAnimation(alphaAnimation);
            AnimationSet animationSet = new AnimationSet(true);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 20.0f, 0.0f);
            translateAnimation.setDuration(150L);
            animationSet.addAnimation(translateAnimation);
            animationSet.addAnimation(alphaAnimation);
            this.e.startAnimation(animationSet);
        } catch (Exception e2) {
            y9n.d("enter animation overlay met exception.", e2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
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
            sfh.f("Home.RNItemOverlayView", "popupView.setOnTouchListener.onTouch");
            phj.this.n();
            return true;
        }
    }

    public void i(JSONObject jSONObject, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43089602", new Object[]{this, jSONObject, onClickListener, onClickListener2});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("item");
        if (jSONObject2 != null) {
            if (jSONObject2.getJSONObject(r4p.VALUE_SHOWTYPE_SIMILAR) == null) {
                this.d.setVisibility(8);
            } else {
                this.d.setVisibility(0);
                this.d.setOnClickListener(new c(onClickListener2));
            }
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                if (jSONObject2.getJSONObject("" + i) == null) {
                    break;
                }
                arrayList.add(jSONObject2.getJSONObject("" + i));
                i++;
            }
            if (arrayList.isEmpty()) {
                this.d.setVisibility(8);
                return;
            }
            FrameLayout[] frameLayoutArr = {this.f, this.g, this.h};
            int size = arrayList.size();
            int i2 = 0;
            for (int i3 = 3; i2 < i3; i3 = 3) {
                JSONObject jSONObject3 = i2 < size ? (JSONObject) arrayList.get(i2) : null;
                FrameLayout frameLayout = frameLayoutArr[i2];
                if (!(jSONObject3 == null || jSONObject3.getJSONObject("content") == null)) {
                    frameLayout.setVisibility(0);
                    LinearLayout linearLayout = (LinearLayout) frameLayout.getChildAt(0);
                    ((TextView) linearLayout.getChildAt(1)).setText(jSONObject3.getJSONObject("content").getString("title"));
                    ((HImageView) linearLayout.getChildAt(0)).setImageUrl(jSONObject3.getJSONObject("content").getString("pic"));
                    frameLayout.setTag(jSONObject3.getJSONObject("content").getString("reasonArgs"));
                    frameLayout.setOnClickListener(new d(jSONObject, i2 + 1, onClickListener, jSONObject3));
                }
                i2++;
            }
        }
    }
}
