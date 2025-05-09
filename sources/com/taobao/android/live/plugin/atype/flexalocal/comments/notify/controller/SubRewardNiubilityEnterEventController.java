package com.taobao.android.live.plugin.atype.flexalocal.comments.notify.controller;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.alibaba.fastjson.JSON;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.notify.controller.SubRewardNiubilityEnterEventController;
import com.taobao.android.live.plugin.proxy.gift.IGiftProxy;
import com.taobao.android.tblive.gift.model.TBLiveGiftEntity;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import com.taobao.taolive.room.adapter.alphavideo.VideoGiftView;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.bl9;
import tb.ckd;
import tb.cpr;
import tb.d9e;
import tb.d9m;
import tb.fkx;
import tb.j7o;
import tb.l0r;
import tb.luq;
import tb.o3s;
import tb.owo;
import tb.r3c;
import tb.t2o;
import tb.t54;
import tb.ux9;
import tb.v7t;
import tb.w3c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SubRewardNiubilityEnterEventController implements w3c, cpr.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final r3c f8441a;
    public CopyOnWriteArrayList<NiubilityEnterEntity> b;
    public final ux9 c;
    public final ConstraintLayout d;
    public final FrameLayout e;
    public VideoGiftView f;
    public final AliUrlImageView g;
    public final TextView h;
    public String i = null;
    public final Handler j = new Handler(Looper.getMainLooper());
    public final e k = new e();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class NiubilityEnterEntity implements INetDataObject {
        public String animationMp4;
        public int moveToY;
        public String userHeadImage;
        public String userName;

        static {
            t2o.a(295698749);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends MessageTypeFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(SubRewardNiubilityEnterEventController subRewardNiubilityEnterEventController) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/notify/controller/SubRewardNiubilityEnterEventController$1");
        }

        @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
        public boolean filter(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i == 6002) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements j7o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f8442a;
        public final /* synthetic */ NiubilityEnterEntity b;

        public b(NiubilityEnterEntity niubilityEnterEntity) {
            this.b = niubilityEnterEntity;
            this.f8442a = niubilityEnterEntity.animationMp4;
        }

        @Override // tb.j7o
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e8ed036", new Object[]{this, str, str2});
            }
        }

        @Override // tb.j7o
        public void b(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f332aa6", new Object[]{this, str, str2, str3});
            } else {
                SubRewardNiubilityEnterEventController.h(SubRewardNiubilityEnterEventController.this);
            }
        }

        @Override // tb.j7o
        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1265c60b", new Object[]{this, str});
                return;
            }
            if (TextUtils.equals(SubRewardNiubilityEnterEventController.d(SubRewardNiubilityEnterEventController.this), this.f8442a)) {
                SubRewardNiubilityEnterEventController.e(SubRewardNiubilityEnterEventController.this, this.b);
            }
            SubRewardNiubilityEnterEventController.h(SubRewardNiubilityEnterEventController.this);
        }

        @Override // tb.j7o
        public void d(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5afe64a1", new Object[]{this, str, str2});
                return;
            }
            if (TextUtils.equals(SubRewardNiubilityEnterEventController.d(SubRewardNiubilityEnterEventController.this), this.f8442a)) {
                SubRewardNiubilityEnterEventController.e(SubRewardNiubilityEnterEventController.this, this.b);
            }
            SubRewardNiubilityEnterEventController.h(SubRewardNiubilityEnterEventController.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements d9e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NiubilityEnterEntity f8443a;

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
                SubRewardNiubilityEnterEventController.j(SubRewardNiubilityEnterEventController.this).setAlpha(valueAnimator.getAnimatedFraction());
                SubRewardNiubilityEnterEventController.j(SubRewardNiubilityEnterEventController.this).setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }

        public c(NiubilityEnterEntity niubilityEnterEntity) {
            this.f8443a = niubilityEnterEntity;
        }

        @Override // tb.d9e
        public void a(String str, TBLiveGiftEntity tBLiveGiftEntity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e175c4b", new Object[]{this, str, tBLiveGiftEntity});
            } else {
                SubRewardNiubilityEnterEventController.n(SubRewardNiubilityEnterEventController.this);
            }
        }

        @Override // tb.d9e
        public void b(TBLiveGiftEntity tBLiveGiftEntity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c0c87e7", new Object[]{this, tBLiveGiftEntity});
                return;
            }
            SubRewardNiubilityEnterEventController.i(SubRewardNiubilityEnterEventController.this).setImageUrl(this.f8443a.userHeadImage);
            SubRewardNiubilityEnterEventController.j(SubRewardNiubilityEnterEventController.this).setText(this.f8443a.userName);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(SubRewardNiubilityEnterEventController.k(SubRewardNiubilityEnterEventController.this, ((float) (this.f8443a.moveToY - 31)) * 1.0f), SubRewardNiubilityEnterEventController.k(SubRewardNiubilityEnterEventController.this, this.f8443a.moveToY * 1.0f));
            ofFloat.addUpdateListener(new a());
            ofFloat.setDuration(SubRewardNiubilityEnterEventController.l(SubRewardNiubilityEnterEventController.this).c);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setStartDelay(SubRewardNiubilityEnterEventController.l(SubRewardNiubilityEnterEventController.this).b);
            ofFloat.start();
            SubRewardNiubilityEnterEventController.m(SubRewardNiubilityEnterEventController.this).postDelayed(new Runnable() { // from class: tb.kuq
                @Override // java.lang.Runnable
                public final void run() {
                    SubRewardNiubilityEnterEventController.c.this.e();
                }
            }, SubRewardNiubilityEnterEventController.l(SubRewardNiubilityEnterEventController.this).f8446a);
        }

        @Override // tb.d9e
        public void c(TBLiveGiftEntity tBLiveGiftEntity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("900bb8f8", new Object[]{this, tBLiveGiftEntity});
            }
        }

        public final /* synthetic */ void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57fcc3e4", new Object[]{this});
            } else {
                SubRewardNiubilityEnterEventController.n(SubRewardNiubilityEnterEventController.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                SubRewardNiubilityEnterEventController.f(SubRewardNiubilityEnterEventController.this).startAnimation(AnimationUtils.loadAnimation(SubRewardNiubilityEnterEventController.o(SubRewardNiubilityEnterEventController.this).f().getContext(), R.anim.taolive_certification_in2_flexalocal));
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final long f8446a = l0r.DEFAULT_TCP_CONNECT_TIMEOUT_MS;
        public final long b = 2000;
        public final long c = 800;

        static {
            t2o.a(295698748);
        }
    }

    static {
        t2o.a(295698741);
        t2o.a(295698713);
        t2o.a(806356196);
    }

    public SubRewardNiubilityEnterEventController(r3c r3cVar, t54 t54Var) {
        this.f8441a = r3cVar;
        this.c = t54Var;
        ConstraintLayout constraintLayout = (ConstraintLayout) r3cVar.getRootView().findViewById(R.id.fl_important_reward_enter);
        this.d = constraintLayout;
        this.e = (FrameLayout) r3cVar.getRootView().findViewById(R.id.fl_important_reward_enter_player);
        AliUrlImageView aliUrlImageView = (AliUrlImageView) r3cVar.getRootView().findViewById(R.id.fl_important_reward_enter_avatar);
        this.g = aliUrlImageView;
        TextView textView = (TextView) r3cVar.getRootView().findViewById(R.id.fl_important_reward_enter_name);
        this.h = textView;
        constraintLayout.getLayoutParams().width = u(750.0f);
        constraintLayout.getLayoutParams().height = u(88.0f);
        constraintLayout.setVisibility(8);
        int u = u(52.0f);
        aliUrlImageView.getLayoutParams().width = u;
        aliUrlImageView.getLayoutParams().height = u;
        aliUrlImageView.setRoundeCornerView(u, u, u / 2, 0, 0);
        ((ViewGroup.MarginLayoutParams) aliUrlImageView.getLayoutParams()).leftMargin = u(24.0f);
        ((ViewGroup.MarginLayoutParams) aliUrlImageView.getLayoutParams()).topMargin = u(18.0f);
        textView.getLayoutParams().width = u(184.0f);
        ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = u(4.0f);
        textView.setTextSize(0, u(26.0f));
        textView.setPadding(u(12.0f), 0, u(12.0f), 0);
    }

    public static /* synthetic */ String d(SubRewardNiubilityEnterEventController subRewardNiubilityEnterEventController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f5106c4", new Object[]{subRewardNiubilityEnterEventController});
        }
        return subRewardNiubilityEnterEventController.i;
    }

    public static /* synthetic */ void e(SubRewardNiubilityEnterEventController subRewardNiubilityEnterEventController, NiubilityEnterEntity niubilityEnterEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b5e93c", new Object[]{subRewardNiubilityEnterEventController, niubilityEnterEntity});
        } else {
            subRewardNiubilityEnterEventController.v(niubilityEnterEntity);
        }
    }

    public static /* synthetic */ ConstraintLayout f(SubRewardNiubilityEnterEventController subRewardNiubilityEnterEventController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintLayout) ipChange.ipc$dispatch("b8561aae", new Object[]{subRewardNiubilityEnterEventController});
        }
        return subRewardNiubilityEnterEventController.d;
    }

    public static /* synthetic */ void g(SubRewardNiubilityEnterEventController subRewardNiubilityEnterEventController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a45532ec", new Object[]{subRewardNiubilityEnterEventController});
        } else {
            subRewardNiubilityEnterEventController.s();
        }
    }

    public static /* synthetic */ void h(SubRewardNiubilityEnterEventController subRewardNiubilityEnterEventController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34eb8f9a", new Object[]{subRewardNiubilityEnterEventController});
        } else {
            subRewardNiubilityEnterEventController.t();
        }
    }

    public static /* synthetic */ AliUrlImageView i(SubRewardNiubilityEnterEventController subRewardNiubilityEnterEventController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliUrlImageView) ipChange.ipc$dispatch("84f35c5b", new Object[]{subRewardNiubilityEnterEventController});
        }
        return subRewardNiubilityEnterEventController.g;
    }

    public static /* synthetic */ TextView j(SubRewardNiubilityEnterEventController subRewardNiubilityEnterEventController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("4e276e4c", new Object[]{subRewardNiubilityEnterEventController});
        }
        return subRewardNiubilityEnterEventController.h;
    }

    public static /* synthetic */ int k(SubRewardNiubilityEnterEventController subRewardNiubilityEnterEventController, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b594999c", new Object[]{subRewardNiubilityEnterEventController, new Float(f)})).intValue();
        }
        return subRewardNiubilityEnterEventController.u(f);
    }

    public static /* synthetic */ e l(SubRewardNiubilityEnterEventController subRewardNiubilityEnterEventController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("4e6728ac", new Object[]{subRewardNiubilityEnterEventController});
        }
        return subRewardNiubilityEnterEventController.k;
    }

    public static /* synthetic */ Handler m(SubRewardNiubilityEnterEventController subRewardNiubilityEnterEventController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("c0e48571", new Object[]{subRewardNiubilityEnterEventController});
        }
        return subRewardNiubilityEnterEventController.j;
    }

    public static /* synthetic */ void n(SubRewardNiubilityEnterEventController subRewardNiubilityEnterEventController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6474a54", new Object[]{subRewardNiubilityEnterEventController});
        } else {
            subRewardNiubilityEnterEventController.q();
        }
    }

    public static /* synthetic */ r3c o(SubRewardNiubilityEnterEventController subRewardNiubilityEnterEventController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r3c) ipChange.ipc$dispatch("3a4e0a01", new Object[]{subRewardNiubilityEnterEventController});
        }
        return subRewardNiubilityEnterEventController.f8441a;
    }

    @Override // tb.w3c
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a5d7491", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.w3c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("484c1aa1", new Object[]{this});
            return;
        }
        CopyOnWriteArrayList<NiubilityEnterEntity> copyOnWriteArrayList = this.b;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            this.f8441a.c();
            return;
        }
        this.b.size();
        this.b.remove(0);
        p(this.b.get(0));
    }

    @Override // tb.w3c
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("998f87af", new Object[]{this})).booleanValue();
        }
        CopyOnWriteArrayList<NiubilityEnterEntity> copyOnWriteArrayList = this.b;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // tb.w3c
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        CopyOnWriteArrayList<NiubilityEnterEntity> copyOnWriteArrayList = this.b;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
        this.f8441a.getFrameContext().t().a(this);
        this.j.removeCallbacksAndMessages(null);
        s();
        ConstraintLayout constraintLayout = this.d;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
    }

    @Override // tb.w3c
    public int getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
        }
        return 11;
    }

    @Override // tb.w3c
    public void init() {
        r3c r3cVar;
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.b = new CopyOnWriteArrayList<>();
        if (r() && (r3cVar = this.f8441a) != null) {
            if (r3cVar.getFrameContext() != null) {
                z = true;
            } else {
                z = false;
            }
            if (this.f8441a.getFrameContext().t() != null) {
                z2 = true;
            }
            if (z2 && z) {
                this.f8441a.getFrameContext().t().l(this, new a(this));
            }
        }
    }

    @Override // tb.gtc
    public void onMessageReceived(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
        } else if (i == 6002 && !this.c.c) {
            this.b.add((NiubilityEnterEntity) JSON.parseObject((String) obj).getObject("msgData", NiubilityEnterEntity.class));
            this.f8441a.b();
        }
    }

    public final void p(NiubilityEnterEntity niubilityEnterEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e168916b", new Object[]{this, niubilityEnterEntity});
        } else if (bl9.g().e() == null || bl9.g().e().get(IGiftProxy.KEY) == null) {
            this.f8441a.c();
            v7t.d("SubReward", "downloadVideoGift getIGiftProxy is null.");
        } else {
            ckd createResourceDownloaderManager = d9m.m().createResourceDownloaderManager();
            if (createResourceDownloaderManager == null) {
                v7t.d("SubReward", "downloadVideoGift giftDownloader is null.");
                return;
            }
            this.i = niubilityEnterEntity.animationMp4;
            createResourceDownloaderManager.a(this.d.getContext(), 20000000L, new b(niubilityEnterEntity));
            createResourceDownloaderManager.b(niubilityEnterEntity.animationMp4, null);
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fda3cd9", new Object[]{this});
        } else if (this.f != null) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f8441a.f().getContext(), R.anim.taolive_certification_out_flexalocal);
            this.d.startAnimation(loadAnimation);
            loadAnimation.setAnimationListener(new luq(this));
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d302c1f", new Object[]{this});
            return;
        }
        VideoGiftView videoGiftView = this.f;
        if (videoGiftView != null) {
            videoGiftView.releasePlayerController();
            this.f.detachView();
            this.e.removeAllViews();
            this.f = null;
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9469361", new Object[]{this});
        } else {
            this.i = null;
        }
    }

    public final int u(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c541bcc", new Object[]{this, new Float(f)})).intValue();
        }
        return Math.round((f / 750.0f) * owo.g(this.e.getContext()));
    }

    public final void v(NiubilityEnterEntity niubilityEnterEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eff1ef9", new Object[]{this, niubilityEnterEntity});
            return;
        }
        this.d.setVisibility(0);
        this.f = new VideoGiftView(this.d.getContext());
        this.g.setImageUrl(null);
        this.h.setText((CharSequence) null);
        this.h.setAlpha(1.0f);
        this.h.setTranslationX(0.0f);
        this.e.addView(this.f, new FrameLayout.LayoutParams(-1, -1));
        this.f.initPlayerController(this.d.getContext(), (LifecycleOwner) this.d.getContext());
        this.f.addObserver(new c(niubilityEnterEntity));
        this.f.attachView();
        TBLiveGiftEntity tBLiveGiftEntity = new TBLiveGiftEntity();
        tBLiveGiftEntity.mAnimationMp4 = niubilityEnterEntity.animationMp4;
        this.f.startVideoGift(tBLiveGiftEntity);
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f8441a.f().getContext(), R.anim.taolive_certification_in_flexalocal);
        this.d.startAnimation(loadAnimation);
        loadAnimation.setAnimationListener(new d());
    }

    public final boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b732dd2", new Object[]{this})).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("tblive-reward", "isCanShowRewardNiubilityEnterView", "true"));
        } catch (Exception e2) {
            o3s.b("SubRewardNiubilityEnterEventController", fkx.i(e2));
            return false;
        }
    }
}
