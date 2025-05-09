package tb;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taobao.R;
import com.taobao.taolive.room.ui.newstyle.utils.NewStyleUtils;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dga implements abc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f17785a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public DXRootView c;
    public JSONObject d;
    public String e;
    public long f;
    public String g;
    public boolean h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f17786a;

        public a(ViewGroup viewGroup) {
            this.f17786a = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                dga.b(dga.this, this.f17786a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f17787a = 0;
        public int b = 0;
        public final /* synthetic */ ViewGroup c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
                ViewGroup.LayoutParams layoutParams = b.this.c.getLayoutParams();
                b bVar = b.this;
                layoutParams.width = (int) (bVar.f17787a * (intValue / 400.0f));
                bVar.c.requestLayout();
            }
        }

        public b(ViewGroup viewGroup) {
            this.c = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            } else if (this.f17787a == 0 && dga.c(dga.this).getMeasuredWidth() > 0) {
                this.f17787a = dga.c(dga.this).getMeasuredWidth();
                this.b = dga.c(dga.this).getMeasuredHeight();
                hha.c("GoodsBtnGuide", "showInternal | measuredGuideWidth=" + this.f17787a + " measuredGuideHeight=" + this.b);
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 400);
                ofInt.setDuration(400L);
                ofInt.addUpdateListener(new a());
                ofInt.start();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                dga.this.dismiss();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
                    dga.e(dga.this);
                }
            }
        }

        public d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            dga.d(dga.this, false);
            dga.f(dga.this).post(new a());
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
        t2o.a(295698510);
        t2o.a(295698517);
    }

    public dga(Context context) {
        this.f17785a = context;
    }

    public static /* synthetic */ void b(dga dgaVar, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb30ceea", new Object[]{dgaVar, viewGroup});
        } else {
            dgaVar.i(viewGroup);
        }
    }

    public static /* synthetic */ DXRootView c(dga dgaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("d3342b8d", new Object[]{dgaVar});
        }
        return dgaVar.c;
    }

    public static /* synthetic */ boolean d(dga dgaVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24dd3f11", new Object[]{dgaVar, new Boolean(z)})).booleanValue();
        }
        dgaVar.h = z;
        return z;
    }

    public static /* synthetic */ void e(dga dgaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0f961c8", new Object[]{dgaVar});
        } else {
            dgaVar.h();
        }
    }

    public static /* synthetic */ Handler f(dga dgaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("fecbc63f", new Object[]{dgaVar});
        }
        return dgaVar.b;
    }

    @Override // tb.abc
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        o3s.d("GoodsBtnGuide", "destroy.");
        this.h = false;
        this.b.removeCallbacksAndMessages(null);
        h();
    }

    @Override // tb.abc
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        o3s.d("GoodsBtnGuide", "dismiss | dismiss pop.");
        this.b.removeCallbacksAndMessages(null);
        g(this.c);
    }

    public final void g(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("744db777", new Object[]{this, view});
        } else if (view != null) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f17785a, R.anim.taolive_goods_btn_guide_out_flexalocal);
            loadAnimation.setAnimationListener(new d());
            view.clearAnimation();
            view.startAnimation(loadAnimation);
        }
    }

    public final void i(ViewGroup viewGroup) {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13cf19a0", new Object[]{this, viewGroup});
            return;
        }
        if (this.c == null) {
            this.c = d9m.n().createDX(this.f17785a, this.g);
        }
        if (this.c == null || !(viewGroup instanceof FrameLayout)) {
            o3s.b("GoodsBtnGuide", "showInternal | params empty.");
            return;
        }
        Context context = this.f17785a;
        if (!(context instanceof Activity) || (findViewById = ((Activity) context).findViewById(R.id.taolive_bottombar_mute)) == null || findViewById.getVisibility() != 0) {
            o3s.b("GoodsBtnGuide", "showInternal ｜ type=" + this.e + "  mTemplateName=" + this.g);
            viewGroup.addView(this.c, new FrameLayout.LayoutParams(-2, -2));
            JSONObject jSONObject = this.d.getJSONObject("data");
            if (jSONObject != null) {
                jSONObject.put("isV2", (Object) "1");
                jSONObject.put("nativeParams", NewStyleUtils.a(this.f17785a, NewStyleUtils.NewStyleType.LARGE));
            }
            JSONObject jSONObject2 = this.d.getJSONObject("utParams");
            if (!(jSONObject == null || jSONObject2 == null)) {
                jSONObject.put("utParams", (Object) jSONObject2);
            }
            d9m.n().renderDX(this.c, jSONObject);
            this.c.addOnLayoutChangeListener(new b(viewGroup));
            if (giv.f() != null) {
                giv.f().a("taobaoLive_goods_Show-btnGuide", vtq.q(jSONObject2 == null ? null : jSONObject2.getString("showParams")));
            }
            this.b.postDelayed(new c(), this.f);
            return;
        }
        o3s.b("GoodsBtnGuide", "showInternal | muteView show not show guide.");
    }

    @Override // tb.abc
    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    @Override // tb.abc
    public void a(ViewGroup viewGroup, TBLiveDataModel tBLiveDataModel) {
        JSONObject jSONObject;
        VideoInfo videoInfo;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03b78cf", new Object[]{this, viewGroup, tBLiveDataModel});
            return;
        }
        if (!(tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null || (jSONObject2 = videoInfo.originalData) == null)) {
            this.d = jSONObject2.getJSONObject("goodsBtnPopInfo");
        }
        if (viewGroup == null || (jSONObject = this.d) == null || jSONObject.isEmpty()) {
            hha.b("GoodsBtnGuide", "init | no data.");
            return;
        }
        this.e = this.d.getString("type");
        this.f = this.d.getLongValue(StEvent.SHOW_TIME);
        long longValue = this.d.getLongValue("showDelay");
        this.g = this.d.getString(yh6.CONFIG_KEY_TEMPLATE_NAME);
        hha.b("GoodsBtnGuide", "init | type=" + this.e + "  mShowTime=" + this.f + " mShowDelay=" + longValue + " mTemplateName=" + this.g + " data=" + this.d.getJSONObject("data"));
        if (!TextUtils.isEmpty(this.e) && !TextUtils.isEmpty(this.g) && this.f > 0 && longValue >= 0) {
            this.h = true;
            this.b.postDelayed(new a(viewGroup), longValue);
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4b7f5a4", new Object[]{this});
            return;
        }
        DXRootView dXRootView = this.c;
        if (dXRootView != null) {
            View view = (View) dXRootView.getParent();
            if (view != null) {
                view.getLayoutParams().width = 0;
            }
            this.c.setVisibility(8);
            if (this.c.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.c.getParent()).removeView(this.c);
                o3s.b("GoodsBtnGuild", "removeView:" + this.c);
            }
        }
    }
}
