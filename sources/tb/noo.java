package tb;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemActionQueryData;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemActionQueryResponse;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class noo implements View.OnClickListener, s9z {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = noo.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final Context f24864a;
    public final ux9 b;
    public final ViewGroup c;
    public final View d;
    public LiveItem e;
    public final LottieAnimationView f;
    public final LottieAnimationView g;
    public final TUrlImageView h;
    public final TextView i;
    public final TextView j;
    public ObjectAnimator k;
    public ObjectAnimator l;
    public boolean m;
    public boolean n;
    public int p;
    public int o = 2;
    public final Runnable q = new a();

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
            } else if (noo.c(noo.this)) {
                noo.this.dismiss();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements plh<Throwable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public void onResult(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f750ea72", new Object[]{this, th});
                return;
            }
            noo.f(noo.this, 2);
            cwd A = v2s.o().A();
            String str = noo.TAG;
            A.c(str, "loadLottieAnimation#onResult fail, msg=" + th.getMessage());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements plh<kkh> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LottieAnimationView f24867a;
        public final /* synthetic */ boolean b;

        public c(LottieAnimationView lottieAnimationView, boolean z) {
            this.f24867a = lottieAnimationView;
            this.b = z;
        }

        /* renamed from: a */
        public void onResult(kkh kkhVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1419bbae", new Object[]{this, kkhVar});
            } else if (kkhVar == null) {
                v2s.o().A().c(noo.TAG, "loadLottieAnimation#onResult success, lottieComposition is null");
            } else {
                this.f24867a.setComposition(kkhVar);
                if (this.b) {
                    noo.h(noo.this);
                } else {
                    noo.i(noo.this, this.f24867a);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
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
                return;
            }
            noo nooVar = noo.this;
            noo.i(nooVar, noo.l(nooVar));
            noo nooVar2 = noo.this;
            noo.i(nooVar2, noo.m(nooVar2));
            if (noo.j(noo.this) != null) {
                noo.j(noo.this).postDelayed(noo.n(noo.this), 10000L);
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
                return;
            }
            noo.j(noo.this).setVisibility(0);
            noo.d(noo.this, true);
            sjr.g().e("com.taobao.taolive.room.sab_atmosphere_show", Integer.valueOf(noo.k(noo.this)));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
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
                noo.o(noo.this);
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
            } else {
                sjr.g().d("com.taobao.taolive.room.sab_atmosphere_dismiss");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LiveItem f24870a;

        public f(LiveItem liveItem) {
            this.f24870a = liveItem;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                a1u.a(noo.g(noo.this), g7p.MSG_TOAST_DEFAULT);
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            ItemActionQueryData data = ((ItemActionQueryResponse) netBaseOutDo).getData();
            LiveItem liveItem = this.f24870a;
            LiveItem.Ext ext = liveItem.extendVal;
            ext.business = data.business;
            ext.secKillInfo = data.secKillInfo;
            noo.e(noo.this, liveItem, true);
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                onError(i, netResponse, obj);
            }
        }
    }

    static {
        t2o.a(295699092);
        t2o.a(806355159);
    }

    public noo(Context context, ux9 ux9Var, ViewGroup viewGroup) {
        this.f24864a = context;
        this.b = ux9Var;
        this.c = viewGroup;
        View inflate = LayoutInflater.from(context).inflate(R.layout.taolive_sab_atmosphere_layout_flexalocal, viewGroup, false);
        this.d = inflate;
        this.g = (LottieAnimationView) inflate.findViewById(R.id.bg);
        this.f = (LottieAnimationView) inflate.findViewById(R.id.postmark);
        this.h = (TUrlImageView) inflate.findViewById(R.id.main_title_img);
        this.i = (TextView) inflate.findViewById(R.id.main_title_txt);
        this.j = (TextView) inflate.findViewById(R.id.sub_title);
        View findViewById = viewGroup.findViewById(R.id.taolive_bottom_bar);
        if (findViewById != null) {
            viewGroup.addView(inflate, viewGroup.indexOfChild(findViewById) - 1);
        } else {
            viewGroup.addView(inflate, 0);
        }
        s();
    }

    public static void F(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb9138", new Object[]{new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bizTopItemId", String.valueOf(j));
        hashMap.put(yj4.PARAM_CATEGORY_ID, "9999");
        sjr.g().c(uyg.EVENT_SHOW_GOODSPACKAGE, hashMap, null);
    }

    public static /* synthetic */ boolean c(noo nooVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae3da438", new Object[]{nooVar})).booleanValue();
        }
        return nooVar.m;
    }

    public static /* synthetic */ boolean d(noo nooVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4ce4e26", new Object[]{nooVar, new Boolean(z)})).booleanValue();
        }
        nooVar.m = z;
        return z;
    }

    public static /* synthetic */ void e(noo nooVar, LiveItem liveItem, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f379f54", new Object[]{nooVar, liveItem, new Boolean(z)});
        } else {
            nooVar.q(liveItem, z);
        }
    }

    public static /* synthetic */ int f(noo nooVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d144e85", new Object[]{nooVar, new Integer(i)})).intValue();
        }
        nooVar.o = i;
        return i;
    }

    public static /* synthetic */ Context g(noo nooVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("6eefd0bc", new Object[]{nooVar});
        }
        return nooVar.f24864a;
    }

    public static /* synthetic */ void h(noo nooVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbe0b72", new Object[]{nooVar});
        } else {
            nooVar.r();
        }
    }

    public static /* synthetic */ void i(noo nooVar, LottieAnimationView lottieAnimationView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14531f41", new Object[]{nooVar, lottieAnimationView});
        } else {
            nooVar.z(lottieAnimationView);
        }
    }

    public static /* synthetic */ View j(noo nooVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("46e7bef2", new Object[]{nooVar});
        }
        return nooVar.d;
    }

    public static /* synthetic */ int k(noo nooVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcfea642", new Object[]{nooVar})).intValue();
        }
        return nooVar.p;
    }

    public static /* synthetic */ LottieAnimationView l(noo nooVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LottieAnimationView) ipChange.ipc$dispatch("57e9dd0", new Object[]{nooVar});
        }
        return nooVar.f;
    }

    public static /* synthetic */ LottieAnimationView m(noo nooVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LottieAnimationView) ipChange.ipc$dispatch("e1a222f", new Object[]{nooVar});
        }
        return nooVar.g;
    }

    public static /* synthetic */ Runnable n(noo nooVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("e7029ce8", new Object[]{nooVar});
        }
        return nooVar.q;
    }

    public static /* synthetic */ void o(noo nooVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbff74cb", new Object[]{nooVar});
        } else {
            nooVar.B();
        }
    }

    public static boolean t(LiveItem liveItem) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d77241b4", new Object[]{liveItem})).booleanValue();
        }
        if (liveItem == null || (jSONObject = liveItem.liveItemStatusData) == null || !jSONObject.getBooleanValue("isHotItemPreheat")) {
            return false;
        }
        return true;
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a1da73b", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup != null && this.i != null && this.j != null) {
            float width = viewGroup.getWidth() / 750.0f;
            this.p = (int) (450.0f * width);
            bhw.a(this.d, this.c.getWidth(), this.p);
            bhw.a(this.g, this.c.getWidth(), this.p);
            bhw.c(this.f, (int) (210.0f * width), (int) (260.0f * width), 0, 0, 0, (int) (58.0f * width));
            this.i.setTextSize(0, 46.0f * width);
            this.j.setTextSize(0, 26.0f * width);
            if (t(this.e)) {
                bhw.a(this.h, -2, (int) (64.0f * width));
            } else {
                bhw.a(this.h, -2, (int) (44.0f * width));
            }
            bhw.b(this.j, 0, (int) (width * 16.0f), 0, nw0.d(this.f24864a, 66.0f));
        }
    }

    public final void D(LiveItem liveItem) {
        JSONObject jSONObject;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3590cfc", new Object[]{this, liveItem});
            return;
        }
        if (!t(liveItem) || (jSONObject = liveItem.personalityData) == null || jSONObject.getIntValue("hotItemPreheatSubscribeStatus") != 1) {
            z = false;
        }
        this.n = z;
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        o3s.b(TAG, "show");
        ObjectAnimator objectAnimator = this.l;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.l.cancel();
        }
        ObjectAnimator objectAnimator2 = this.k;
        if (objectAnimator2 != null) {
            objectAnimator2.start();
        }
    }

    @Override // tb.s9z
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        o3s.b(TAG, pg1.ATOM_EXT_clear);
        B();
        this.b.Q = false;
    }

    @Override // tb.s9z
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        o3s.b(TAG, "dismiss");
        View view = this.d;
        if (view != null) {
            view.removeCallbacks(this.q);
        }
        ObjectAnimator objectAnimator = this.k;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.k.cancel();
        }
        ObjectAnimator objectAnimator2 = this.l;
        if (objectAnimator2 != null) {
            objectAnimator2.start();
        }
    }

    @Override // tb.s9z
    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (yga.G()) {
            q(this.e, false);
        } else {
            y(this.e);
        }
    }

    public final void q(LiveItem liveItem, boolean z) {
        LiveItem.SabItemAtmosphere sabItemAtmosphere;
        LiveItem.Ext ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("149e3b8f", new Object[]{this, liveItem, new Boolean(z)});
        } else if (liveItem != null) {
            if (t(liveItem)) {
                sabItemAtmosphere = liveItem.sabItemAtmospherePreHeat;
            } else {
                sabItemAtmosphere = liveItem.sabItemAtmosphere;
            }
            if (sabItemAtmosphere == null || (ext = liveItem.extendVal) == null) {
                o3s.b(TAG, "checkThreshold | atmosphere or extendVal is null");
                return;
            }
            String str = sabItemAtmosphere.clickAction;
            try {
                JSONObject d2 = fkx.d(ext.secKillInfo);
                JSONObject jSONObject = d2 != null ? d2.getJSONObject("threshold") : null;
                if (nh4.o() && (jSONObject == null || jSONObject.getBoolean(yj4.PARAM_VRPASS) == null)) {
                    o3s.b(TAG, "checkThreshold | threshold or threshold.pass is null");
                    x(liveItem, str);
                } else if (jSONObject != null && jSONObject.getBooleanValue(yj4.PARAM_VRPASS)) {
                    x(liveItem, str);
                } else if (jSONObject == null || !z) {
                    ux9 ux9Var = this.b;
                    if (ux9Var != null && (ux9Var.k() instanceof xea) && !z) {
                        new qnf(new f(liveItem)).K((xea) this.b.k(), liveItem);
                    }
                } else {
                    a1u.a(this.f24864a, jSONObject.getString("denyMsg"));
                }
            } catch (JSONException e2) {
                o3s.b(TAG, e2.getMessage());
            }
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ea0be58", new Object[]{this});
            return;
        }
        int i = this.o - 1;
        this.o = i;
        if (i == 0) {
            E();
            this.o = 2;
        }
    }

    public final boolean v(LiveItem liveItem, boolean z) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d6b4e84", new Object[]{this, liveItem, new Boolean(z)})).booleanValue();
        }
        if (!t(liveItem)) {
            ux9 ux9Var = this.b;
            if (ux9Var == null || !(ux9Var.k() instanceof xea) || (!TextUtils.equals(((xea) this.b.k()).O, bia.UNDER_TAKE_GOODS_LIST) && !TextUtils.equals(((xea) this.b.k()).O, bia.UNDER_TAKE_INSIDE_DETAIL))) {
                return p();
            }
            return false;
        } else if (!nh4.q0() || (jSONObject = liveItem.personalityData) == null || (jSONObject.getIntValue("hotItemPreheatSubscribeStatus") != 0 && !z)) {
            return false;
        } else {
            return true;
        }
    }

    public final void w(LottieAnimationView lottieAnimationView, String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bd7575c", new Object[]{this, lottieAnimationView, str, new Integer(i), new Boolean(z)});
            return;
        }
        lottieAnimationView.setRepeatCount(i);
        try {
            dmh<kkh> x = ukh.x(this.f24864a, str);
            x.d(new c(lottieAnimationView, z));
            x.c(new b());
        } catch (Throwable unused) {
            v2s.o().A().c(TAG, "loadLottieAnimation error");
        }
    }

    public final void y(LiveItem liveItem) {
        ux9 ux9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92e94d60", new Object[]{this, liveItem});
        } else if (liveItem != null && (ux9Var = this.b) != null && (ux9Var.k() instanceof xea)) {
            if (nh4.W() && t(liveItem)) {
                o6b.c((xea) this.b.k(), liveItem, "sabAtmosphere");
            } else if (nh4.r0() && u(liveItem)) {
                F(liveItem.itemId);
            } else if (kkr.i().d() != null) {
                kkr.i().d().q(this.b, this.f24864a, 10000, liveItem, new HashMap());
            }
            if (kkr.i().o() != null) {
                kkr.i().o().c("dynamicEffect", zha.e((xea) this.b.k(), liveItem));
            }
        }
    }

    public final void z(LottieAnimationView lottieAnimationView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e1e9b9a", new Object[]{this, lottieAnimationView});
        } else if (lottieAnimationView != null) {
            lottieAnimationView.cancelAnimation();
            lottieAnimationView.playAnimation();
        }
    }

    public void A(LiveItem liveItem) {
        LiveItem.SabItemAtmosphere sabItemAtmosphere;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6899687d", new Object[]{this, liveItem});
        } else if (liveItem != null) {
            if (t(liveItem)) {
                sabItemAtmosphere = liveItem.sabItemAtmospherePreHeat;
            } else {
                sabItemAtmosphere = liveItem.sabItemAtmosphere;
            }
            if (sabItemAtmosphere != null) {
                o3s.b(TAG, "refresh");
                this.e = liveItem;
                D(liveItem);
                C();
                w(this.f, sabItemAtmosphere.posterMark, 0, false);
                this.h.setImageUrl(sabItemAtmosphere.benefitTitleImg);
                this.j.setText(sabItemAtmosphere.subBenefitTitle);
                View view = this.d;
                if (view != null) {
                    view.removeCallbacks(this.q);
                    this.d.postDelayed(this.q, 5000L);
                }
            }
        }
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        o3s.b(TAG, DMComponent.RESET);
        LottieAnimationView lottieAnimationView = this.g;
        if (lottieAnimationView != null) {
            lottieAnimationView.cancelAnimation();
        }
        LottieAnimationView lottieAnimationView2 = this.f;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.cancelAnimation();
        }
        ObjectAnimator objectAnimator = this.k;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.l;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        View view = this.d;
        if (view != null) {
            view.removeCallbacks(this.q);
            this.d.setVisibility(8);
        }
        this.e = null;
        this.n = false;
        this.m = false;
        this.o = 2;
    }

    public static boolean u(LiveItem liveItem) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("700defcd", new Object[]{liveItem})).booleanValue();
        }
        return (liveItem == null || (jSONObject = liveItem.itemExtData) == null || !TextUtils.equals(jSONObject.getString("smallCardItemType"), "itemZone")) ? false : true;
    }

    @Override // tb.s9z
    public void b(LiveItem liveItem, boolean z) {
        LiveItem.SabItemAtmosphere sabItemAtmosphere;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bdd925a", new Object[]{this, liveItem, new Boolean(z)});
        } else if (liveItem != null && this.b != null) {
            if (t(liveItem)) {
                sabItemAtmosphere = liveItem.sabItemAtmospherePreHeat;
            } else {
                sabItemAtmosphere = liveItem.sabItemAtmosphere;
            }
            if (sabItemAtmosphere != null) {
                this.e = liveItem;
                if (this.b.w() != null) {
                    this.b.w().a("hasShowBigHotAtmosphere", "true");
                }
                if (!v(liveItem, z)) {
                    o3s.b(TAG, "tryShow | liveItem is invalid");
                    this.b.Q = true;
                    return;
                }
                this.e = liveItem;
                D(liveItem);
                C();
                w(this.g, sabItemAtmosphere.atmosphereBgImg, -1, true);
                w(this.f, sabItemAtmosphere.posterMark, 0, true);
                if (!TextUtils.isEmpty(sabItemAtmosphere.benefitTitleImg)) {
                    this.h.setImageUrl(sabItemAtmosphere.benefitTitleImg);
                    this.h.setVisibility(0);
                    this.i.setVisibility(8);
                } else if (!TextUtils.isEmpty(sabItemAtmosphere.benefitTitle)) {
                    this.i.setText(sabItemAtmosphere.benefitTitle);
                    this.i.setVisibility(0);
                    this.h.setVisibility(8);
                }
                this.i.setText(sabItemAtmosphere.benefitTitle);
                this.j.setText(sabItemAtmosphere.subBenefitTitle);
                ViewProxy.setOnClickListener(this.d, this);
            }
        }
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba7acbf2", new Object[]{this})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - t6t.d("sab_atmosphere_limit_start_time") > nh4.e1() * 60 * 1000) {
            t6t.h("sab_atmosphere_limit_start_time", currentTimeMillis);
            t6t.g("sab_atmosphere_show_frequency", 1);
            return true;
        }
        int c2 = t6t.c("sab_atmosphere_show_frequency", 0);
        if (c2 >= nh4.f1()) {
            return false;
        }
        t6t.g("sab_atmosphere_show_frequency", c2 + 1);
        return true;
    }

    @Override // tb.s9z
    public void a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc62f2ef", new Object[]{this, strArr});
        } else if (strArr.length == 3) {
            LiveItem liveItem = (LiveItem) fkx.f(strArr[0], LiveItem.class);
            String str = strArr[1];
            String str2 = strArr[2];
            if (liveItem != null) {
                if (isShowing() && !this.n) {
                    A(liveItem);
                } else if (TextUtils.equals(str, "SUCCESS") && TextUtils.equals(str2, "showcase")) {
                    b(liveItem, true);
                }
            }
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("327f851e", new Object[]{this});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.d, "translationY", this.c.getMeasuredWidth(), 0.0f);
        this.k = ofFloat;
        ofFloat.setDuration(250L);
        this.k.addListener(new d());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.d, "translationY", 0.0f, this.c.getMeasuredWidth());
        this.l = ofFloat2;
        ofFloat2.setDuration(250L);
        this.l.addListener(new e());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
        if (r9.equals("subscribe") == false) goto L_0x0054;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(com.taobao.taolive.sdk.model.common.LiveItem r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.noo.x(com.taobao.taolive.sdk.model.common.LiveItem, java.lang.String):void");
    }
}
