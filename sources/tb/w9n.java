package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class w9n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f30533a;
    public ViewGroup b;
    public ViewGroup c;
    public View d;
    public ProgressBar e;
    public boolean f;
    public final boolean g;
    public TextView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public TextView l;
    public TextView m;
    public TextView n;
    public final dan o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f30534a;
        public final /* synthetic */ View.OnClickListener b;

        public a(JSONObject jSONObject, View.OnClickListener onClickListener) {
            this.f30534a = jSONObject;
            this.b = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            w9n.this.o.e(this.f30534a);
            w9n w9nVar = w9n.this;
            if (w9nVar.c != null) {
                w9n.a(w9nVar, this.f30534a);
                return;
            }
            w9n.d(w9nVar, w9n.b(w9nVar), new View[]{w9n.c(w9n.this)});
            this.b.onClick(view);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
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
            if (view.getParent() != null && !w9n.e(w9n.this)) {
                w9n.f(w9n.this, true);
                ((ViewGroup) view.getParent()).removeView(view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TextView f30537a;

        public d(TextView textView) {
            this.f30537a = textView;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            this.f30537a.setVisibility(8);
            w9n.g(w9n.this).setVisibility(0);
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
    public class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f30538a;
        public final /* synthetic */ View.OnClickListener b;
        public final /* synthetic */ JSONObject c;

        public e(int i, View.OnClickListener onClickListener, JSONObject jSONObject) {
            this.f30538a = i;
            this.b = onClickListener;
            this.c = jSONObject;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                w9n.h(w9n.this, view, this.f30538a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

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
                    return;
                }
                w9n.this.c.setVisibility(8);
                w9n.g(w9n.this).setVisibility(0);
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

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new a());
            w9n.this.c.startAnimation(alphaAnimation);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                w9n.i(w9n.this).setVisibility(8);
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
    public class h implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
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
            } else {
                w9n.this.c.setVisibility(0);
            }
        }
    }

    static {
        t2o.a(729809917);
    }

    public w9n(dan danVar, boolean z) {
        this.o = danVar;
        this.g = z;
    }

    public static /* synthetic */ void a(w9n w9nVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6d3d1e8", new Object[]{w9nVar, jSONObject});
        } else {
            w9nVar.q(jSONObject);
        }
    }

    public static /* synthetic */ TextView b(w9n w9nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("c6fa405b", new Object[]{w9nVar});
        }
        return w9nVar.i;
    }

    public static /* synthetic */ TextView c(w9n w9nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("a4eda63a", new Object[]{w9nVar});
        }
        return w9nVar.h;
    }

    public static /* synthetic */ void d(w9n w9nVar, TextView textView, View[] viewArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f0d69dc", new Object[]{w9nVar, textView, viewArr});
        } else {
            w9nVar.m(textView, viewArr);
        }
    }

    public static /* synthetic */ boolean e(w9n w9nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1931588", new Object[]{w9nVar})).booleanValue();
        }
        return w9nVar.f;
    }

    public static /* synthetic */ boolean f(w9n w9nVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b378f856", new Object[]{w9nVar, new Boolean(z)})).booleanValue();
        }
        w9nVar.f = z;
        return z;
    }

    public static /* synthetic */ ProgressBar g(w9n w9nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProgressBar) ipChange.ipc$dispatch("cd7684c7", new Object[]{w9nVar});
        }
        return w9nVar.e;
    }

    public static /* synthetic */ void h(w9n w9nVar, View view, int i, View.OnClickListener onClickListener, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbc8d70a", new Object[]{w9nVar, view, new Integer(i), onClickListener, jSONObject});
        } else {
            w9nVar.n(view, i, onClickListener, jSONObject);
        }
    }

    public static /* synthetic */ ViewGroup i(w9n w9nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("2282b6d4", new Object[]{w9nVar});
        }
        return w9nVar.b;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else if (this.f30533a.getParent() != null && !this.f) {
            this.f = true;
            ((ViewGroup) this.f30533a.getParent()).removeView(this.f30533a);
        }
    }

    public final void k(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bd8f8bc", new Object[]{this, context, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.g) {
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.recommend2_component_delete_overlay, (ViewGroup) null);
            this.f30533a = viewGroup;
            this.i = (TextView) viewGroup.findViewById(R.id.btn_guess_delete);
        } else {
            this.f30533a = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.recommend2_component_without_delete_overlay, (ViewGroup) null);
        }
        this.b = (ViewGroup) this.f30533a.findViewById(R.id.guess_delete_layout);
        this.d = this.f30533a.findViewById(R.id.circle_guess_longclick);
        this.h = (TextView) this.f30533a.findViewById(R.id.btn_guess_similar);
        this.e = (ProgressBar) this.f30533a.findViewById(R.id.pb_server_progress);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(i, i2);
        this.f30533a.setTag("guess_delete_popup");
        this.f30533a.setLayoutParams(layoutParams);
        this.f30533a.addOnAttachStateChangeListener(new b());
        this.f30533a.setOnTouchListener(new c());
    }

    public final void m(TextView textView, View[] viewArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("758cd195", new Object[]{this, textView, viewArr});
            return;
        }
        if (viewArr != null) {
            for (View view : viewArr) {
                if (view != null) {
                    view.setVisibility(4);
                }
            }
        }
        if (textView != null) {
            Animation loadAnimation = AnimationUtils.loadAnimation(textView.getContext(), R.anim.recommend2_dislike_scale_circle);
            textView.setText("");
            textView.startAnimation(loadAnimation);
            loadAnimation.setAnimationListener(new d(textView));
        }
    }

    public final void n(View view, int i, View.OnClickListener onClickListener, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9264c31b", new Object[]{this, view, new Integer(i), onClickListener, jSONObject});
            return;
        }
        if (view.getTag() == null) {
            str = null;
        } else {
            str = view.getTag().toString();
        }
        this.o.g(str, jSONObject);
        TextView[] textViewArr = {this.j, this.k, this.l, this.m, this.n};
        TextView textView = textViewArr[i];
        for (int i2 = 0; i2 < 5; i2++) {
            textViewArr[i2].setClickable(false);
        }
        onClickListener.onClick(textView);
        int parseColor = Color.parseColor("#33000000");
        int parseColor2 = Color.parseColor("#ccffffff");
        Drawable mutate = textView.getBackground().mutate();
        if (mutate == null || !(mutate instanceof GradientDrawable)) {
            textView.setBackgroundColor(parseColor);
        } else {
            ((GradientDrawable) mutate).setColor(parseColor);
            textView.setTextColor(parseColor2);
        }
        textView.postDelayed(new f(), 100L);
    }

    public void p(Context context, View view, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("900a226c", new Object[]{this, context, view, onClickListener, onClickListener2, jSONObject});
            return;
        }
        try {
            int paddingLeft = view.getPaddingLeft();
            k(context, (view.getWidth() - paddingLeft) - view.getPaddingRight(), (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom());
            this.o.f(jSONObject);
            ((ViewGroup) view).addView(this.f30533a);
            Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.guess_longclick_scale_circle);
            loadAnimation.setFillAfter(true);
            this.d.startAnimation(loadAnimation);
            this.h.startAnimation(AnimationUtils.loadAnimation(context, R.anim.guess_similar_slide_in));
            TextView textView = this.i;
            if (textView != null) {
                textView.startAnimation(AnimationUtils.loadAnimation(context, R.anim.guess_delete_bottom_slide_in));
            }
            TextView textView2 = this.i;
            if (textView2 != null) {
                if (onClickListener != null) {
                    textView2.setOnClickListener(new a(jSONObject, onClickListener));
                } else {
                    textView2.setBackgroundResource(R.drawable.recommend2_none_similar_background);
                }
            }
            if (onClickListener2 != null) {
                this.h.setOnClickListener(onClickListener2);
                return;
            }
            this.h.setBackgroundResource(R.drawable.recommend2_none_similar_background);
            this.h.setText(Localization.q(R.string.taobao_app_1000_1_16171));
        } catch (Exception e2) {
            y9n.d("Delete overlay met exception.", e2);
        }
    }

    public final void q(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6151c48", new Object[]{this, jSONObject});
            return;
        }
        try {
            this.o.h(jSONObject);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new g());
            this.b.startAnimation(alphaAnimation);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation2.setDuration(300L);
            alphaAnimation2.setStartOffset(100L);
            alphaAnimation2.setAnimationListener(new h());
            this.c.setAnimation(alphaAnimation2);
        } catch (Exception e2) {
            y9n.d("Delete overlay met exception.", e2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
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
            sfh.f("Home.RItemOverlayView", "popupView.setOnTouchListener.onTouch");
            w9n.this.j();
            return true;
        }
    }

    public void o(w9n w9nVar, JSONObject jSONObject, View.OnClickListener onClickListener) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0827287", new Object[]{this, w9nVar, jSONObject, onClickListener});
        } else if (jSONObject != null && jSONObject.getJSONObject("ext") != null && (jSONArray = jSONObject.getJSONObject("ext").getJSONArray("deleteReasons")) != null && !jSONArray.isEmpty()) {
            JSONArray jSONArray2 = new JSONArray(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null && !TextUtils.isEmpty(jSONObject2.getString("reasonId")) && !TextUtils.isEmpty(jSONObject2.getString("reason"))) {
                    jSONArray2.add(jSONObject2);
                }
            }
            if (!jSONArray2.isEmpty()) {
                l(jSONObject, jSONArray2, onClickListener);
                w9nVar.c.setTag(jSONObject);
            }
        }
    }

    public final void l(JSONObject jSONObject, JSONArray jSONArray, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a68161", new Object[]{this, jSONObject, jSONArray, onClickListener});
            return;
        }
        this.c = (ViewGroup) this.f30533a.findViewById(R.id.guess_reason_layout);
        this.j = (TextView) this.f30533a.findViewById(R.id.btn_guess_reason_title);
        this.k = (TextView) this.f30533a.findViewById(R.id.btn_guess_reason1);
        this.l = (TextView) this.f30533a.findViewById(R.id.btn_guess_reason2);
        this.m = (TextView) this.f30533a.findViewById(R.id.btn_guess_reason3);
        TextView textView = (TextView) this.f30533a.findViewById(R.id.btn_guess_reason4);
        this.n = textView;
        TextView[] textViewArr = {this.k, this.l, this.m, textView};
        int size = jSONArray.size();
        int i = 0;
        while (i < 4) {
            JSONObject jSONObject2 = i < size ? jSONArray.getJSONObject(i) : null;
            TextView textView2 = textViewArr[i];
            if (jSONObject2 != null) {
                textView2.setVisibility(0);
                textView2.setText(jSONObject2.getString("reason"));
                textView2.setTag(jSONObject2.getString("reasonId"));
                textView2.setOnClickListener(new e(i + 1, onClickListener, jSONObject));
            }
            i++;
        }
    }
}
