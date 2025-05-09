package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xfa implements abc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f31347a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public DXRootView c;
    public final View d;
    public JSONObject e;
    public String f;
    public long g;
    public String h;
    public boolean i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f31348a;

        public a(ViewGroup viewGroup) {
            this.f31348a = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                xfa.b(xfa.this, this.f31348a);
            }
        }
    }

    static {
        t2o.a(295698505);
        t2o.a(295698517);
    }

    public xfa(Context context, View view) {
        this.f31347a = context;
        this.d = view;
    }

    public static /* synthetic */ void b(xfa xfaVar, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1de55112", new Object[]{xfaVar, viewGroup});
        } else {
            xfaVar.h(viewGroup);
        }
    }

    public static /* synthetic */ boolean c(xfa xfaVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12928502", new Object[]{xfaVar, new Boolean(z)})).booleanValue();
        }
        xfaVar.i = z;
        return z;
    }

    public static /* synthetic */ void d(xfa xfaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68513f55", new Object[]{xfaVar});
        } else {
            xfaVar.g();
        }
    }

    public static /* synthetic */ Handler e(xfa xfaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("6ddb52f0", new Object[]{xfaVar});
        }
        return xfaVar.b;
    }

    @Override // tb.abc
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        o3s.d("GoodsBtnGuide", "destroy.");
        this.i = false;
        this.b.removeCallbacksAndMessages(null);
        g();
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
        f(this.c);
    }

    public final void f(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("744db777", new Object[]{this, view});
        } else if (view != null) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f31347a, R.anim.taolive_goods_btn_guide_out_flexalocal);
            loadAnimation.setAnimationListener(new bga(this));
            view.clearAnimation();
            view.startAnimation(loadAnimation);
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4b7f5a4", new Object[]{this});
            return;
        }
        DXRootView dXRootView = this.c;
        if (dXRootView != null) {
            dXRootView.setVisibility(8);
            if (this.c.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.c.getParent()).removeView(this.c);
                o3s.b("GoodsBtnGuild", "removeView:" + this.c);
            }
        }
    }

    @Override // tb.abc
    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        return this.i;
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
            this.e = jSONObject2.getJSONObject("goodsBtnPopInfo");
        }
        if (viewGroup == null || (jSONObject = this.e) == null || jSONObject.isEmpty()) {
            hha.b("GoodsBtnGuide", "init | no data.");
            return;
        }
        this.f = this.e.getString("type");
        this.g = this.e.getLongValue(StEvent.SHOW_TIME);
        long longValue = this.e.getLongValue("showDelay");
        this.h = this.e.getString(yh6.CONFIG_KEY_TEMPLATE_NAME);
        hha.b("GoodsBtnGuide", "init | type=" + this.f + "  mShowTime=" + this.g + " mShowDelay=" + longValue + " mTemplateName=" + this.h + " data=" + this.e.getJSONObject("data"));
        if (!TextUtils.isEmpty(this.f) && !TextUtils.isEmpty(this.h) && this.g > 0 && longValue >= 0) {
            this.i = true;
            this.b.postDelayed(new a(viewGroup), longValue);
        }
    }

    public final void h(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13cf19a0", new Object[]{this, viewGroup});
            return;
        }
        if (this.c == null) {
            this.c = d9m.n().createDX(this.f31347a, this.h);
        }
        if (this.c == null || !(viewGroup instanceof RelativeLayout)) {
            o3s.b("GoodsBtnGuide", "showInternal | params empty.");
            return;
        }
        o3s.b("GoodsBtnGuide", "showInternal ｜ type=" + this.f + "  mTemplateName=" + this.h);
        this.d.getLocationOnScreen(new int[2]);
        int b = hw0.b(this.f31347a, 2.0f) + this.d.getWidth();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.addRule(12);
        layoutParams.setMargins(0, 0, b, 0);
        viewGroup.addView(this.c, layoutParams);
        JSONObject jSONObject = this.e.getJSONObject("data");
        JSONObject jSONObject2 = this.e.getJSONObject("utParams");
        if (!(jSONObject == null || jSONObject2 == null)) {
            jSONObject.put("utParams", (Object) jSONObject2);
        }
        d9m.n().renderDX(this.c, jSONObject);
        this.c.startAnimation(AnimationUtils.loadAnimation(this.f31347a, R.anim.taolive_goods_btn_guide_in_flexalocal));
        if (giv.f() != null) {
            giv.f().a("taobaoLive_goods_Show-btnGuide", vtq.q(jSONObject2 == null ? null : jSONObject2.getString("showParams")));
        }
        this.b.postDelayed(new zfa(this), this.g);
    }
}
