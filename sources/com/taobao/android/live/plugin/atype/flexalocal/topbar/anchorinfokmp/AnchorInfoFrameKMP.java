package com.taobao.android.live.plugin.atype.flexalocal.topbar.anchorinfokmp;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.live.plugin.atype.flexalocal.utils.AccessibilityUtils;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.android.task.Coordinator;
import com.taobao.kmp.live.liveBizComponent.model.topAccount.TaoLiveKtFansClubModel;
import com.taobao.kmp.live.liveBizComponent.model.topAccount.TaoLiveKtIntimacyModel;
import com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountManager;
import com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel;
import com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.TaoLiveKtAccountActionType;
import com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.TaoLiveKtAccountFollowType;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.TaoLiveActionType;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.a1u;
import tb.a39;
import tb.a4s;
import tb.b0d;
import tb.c4o;
import tb.d4s;
import tb.d9m;
import tb.dg6;
import tb.dt9;
import tb.e9m;
import tb.et9;
import tb.f3c;
import tb.fkx;
import tb.g1a;
import tb.g44;
import tb.giv;
import tb.gnk;
import tb.gwg;
import tb.h2t;
import tb.hjr;
import tb.hnf;
import tb.hpz;
import tb.hw0;
import tb.iqw;
import tb.jkd;
import tb.jqw;
import tb.k09;
import tb.k0r;
import tb.kiv;
import tb.kjy;
import tb.kkr;
import tb.klc;
import tb.kqw;
import tb.liv;
import tb.lqw;
import tb.m09;
import tb.nh4;
import tb.o3s;
import tb.op3;
import tb.p3u;
import tb.pfa;
import tb.qjy;
import tb.qt9;
import tb.qvs;
import tb.s3c;
import tb.s8d;
import tb.smr;
import tb.stk;
import tb.t29;
import tb.t2o;
import tb.t54;
import tb.u29;
import tb.uo8;
import tb.ux9;
import tb.uyg;
import tb.v2s;
import tb.v7t;
import tb.voj;
import tb.xhv;
import tb.yax;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class AnchorInfoFrameKMP extends BaseFrame implements et9, u29, View.OnClickListener, s3c, jqw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ANCHOR_START_NOTIFY_EVENT = "taoLiveAnchorStartNotify";
    private static final String BACK_TO_LIVE_PARAMS = "&livesource=PlayBackToLive&forceRefresh=true&backwardSwitch=true";
    private static final String SUBSCRIBE_SUCCESS_EVENT = "TaoliveRoomSubscribeStateNotify";
    private static final String TAG = "AnchorInfoFrameKMP";
    private ITaoLiveKtAccountManager accountManager;
    private ITaoLiveKtAccountViewModel accountModel;
    private AnimatorSet animatorSet;
    private View avatarAnimView;
    private View avatarBackgroundView;
    public TUrlImageView avatarView;
    private int clickAvatarNum;
    private long enterTime;
    private TUrlImageView favoriteTagView;
    private View followViewContainer;
    private String hasLiveId;
    private TUrlImageView mFFCLeftView;
    private TUrlImageView mFFCRightView;
    private TUrlImageView mFansClubView;
    private a39 mFavoriteGuideDialog;
    private TUrlImageView mUnFavoriteView;
    private View mUnFollowView;
    private TextView mUnsubscribeTextView;
    private View mUnsubscribeView;
    private TUrlImageView mWidgetIcon;
    private LinearLayout mWidgetLl;
    private TextView mWidgetTextView;
    private View nickNameLayout;
    public TextView nickNameView;
    private TUrlImageView vLabelImage;
    private AliUrlImageView watchLabelImage;
    private LinearLayout watchLayout;
    private TextView watchNum;
    private Runnable widgetTextToIconRunnable;
    private boolean mShowAnim = false;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private boolean hasShowFansClub = false;
    private TaoLiveKtAccountFollowType preFollowType = TaoLiveKtAccountFollowType.None;
    private boolean isManualFollow = false;
    private final Runnable mStartMarqueeRunnable = new i();
    private final AtomicBoolean mIsDispatchOnDraw = new AtomicBoolean(false);
    private final ViewTreeObserver.OnDrawListener mOnDrawListener = new j();
    private final TextWatcher watcher = new k();

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
                return;
            }
            AnchorInfoFrameKMP.access$1200(AnchorInfoFrameKMP.this);
            AnchorInfoFrameKMP.access$1300(AnchorInfoFrameKMP.this);
            AnchorInfoFrameKMP.this.hideUnsubscribeView();
            AnchorInfoFrameKMP.access$1400(AnchorInfoFrameKMP.this);
            if (!AnchorInfoFrameKMP.access$1500(AnchorInfoFrameKMP.this)) {
                AnchorInfoFrameKMP.access$1600(AnchorInfoFrameKMP.this);
                AnchorInfoFrameKMP.access$1700(AnchorInfoFrameKMP.this);
                return;
            }
            AnchorInfoFrameKMP.access$1800(AnchorInfoFrameKMP.this).setVisibility(8);
            AnchorInfoFrameKMP.access$1900(AnchorInfoFrameKMP.this).setVisibility(0);
            AnchorInfoFrameKMP.access$2000(AnchorInfoFrameKMP.this).setVisibility(0);
            AnchorInfoFrameKMP.access$2000(AnchorInfoFrameKMP.this).setImageUrl(nh4.l1());
            AnchorInfoFrameKMP.access$2100(AnchorInfoFrameKMP.this);
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Animator.AnimatorListener {
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
                    AnchorInfoFrameKMP.access$2300(AnchorInfoFrameKMP.this);
                }
            }
        }

        public b() {
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
            AnchorInfoFrameKMP.access$2202(AnchorInfoFrameKMP.this, new a());
            AnchorInfoFrameKMP.access$2400(AnchorInfoFrameKMP.this).postDelayed(AnchorInfoFrameKMP.access$2200(AnchorInfoFrameKMP.this), Constants.STARTUP_TIME_LEVEL_1);
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
                return;
            }
            AnchorInfoFrameKMP.access$1800(AnchorInfoFrameKMP.this).setVisibility(8);
            AnchorInfoFrameKMP.access$1900(AnchorInfoFrameKMP.this).setVisibility(0);
            AnchorInfoFrameKMP.access$2000(AnchorInfoFrameKMP.this).setVisibility(0);
            AnchorInfoFrameKMP.access$2000(AnchorInfoFrameKMP.this).setImageUrl(nh4.l1());
            AnchorInfoFrameKMP.access$2100(AnchorInfoFrameKMP.this);
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements stk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8704a;

        public d(String str) {
            this.f8704a = str;
        }

        @Override // tb.stk
        public void a(jkd jkdVar) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fee1131", new Object[]{this, jkdVar});
                return;
            }
            AnchorInfoFrameKMP anchorInfoFrameKMP = AnchorInfoFrameKMP.this;
            anchorInfoFrameKMP.showToast(liv.c(anchorInfoFrameKMP.mContext, jkdVar));
            AnchorInfoFrameKMP.access$2502(AnchorInfoFrameKMP.this, true);
            AnchorInfoFrameKMP.access$2600(AnchorInfoFrameKMP.this, true);
            AnchorInfoFrameKMP.access$2700(AnchorInfoFrameKMP.this);
            f3c h = AnchorInfoFrameKMP.this.mFrameContext.h();
            String str2 = this.f8704a;
            ux9 ux9Var = AnchorInfoFrameKMP.this.mFrameContext;
            if (ux9Var == null) {
                str = null;
            } else {
                str = ux9Var.C();
            }
            h.c(uyg.EVENT_FOLLOW_FROM_FOLLOWFRAME, str2, str);
            giv.h().c(3);
            AnchorInfoFrameKMP.access$2800(AnchorInfoFrameKMP.this);
        }

        @Override // tb.stk
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            String string = AnchorInfoFrameKMP.this.mContext.getString(R.string.taolive_topbar_user_follow_fail_flexalocal);
            if (TextUtils.isEmpty(str2)) {
                str2 = string;
            }
            AnchorInfoFrameKMP.this.showToast(str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements stk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(AnchorInfoFrameKMP anchorInfoFrameKMP) {
        }

        @Override // tb.stk
        public void a(jkd jkdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fee1131", new Object[]{this, jkdVar});
            }
        }

        @Override // tb.stk
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            if (netResponse != null) {
                o3s.b(AnchorInfoFrameKMP.TAG, "requestLiveSubscribeBusiness onError:" + netResponse.getRetMsg());
            }
            Context context = AnchorInfoFrameKMP.this.mContext;
            a1u.a(context, context.getString(R.string.taolive_live_subscribe_fail_msg));
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            String string = AnchorInfoFrameKMP.this.mContext.getString(R.string.taolive_live_subscribe_fail_msg);
            if (netResponse != null) {
                try {
                    if (netResponse.getDataJsonObject() != null && netResponse.getDataJsonObject().getBoolean("result")) {
                        string = AnchorInfoFrameKMP.this.mContext.getString(R.string.taolive_live_subscribe_success_msg);
                        AnchorInfoFrameKMP.access$2900(AnchorInfoFrameKMP.this);
                    }
                } catch (Throwable th) {
                    o3s.b(AnchorInfoFrameKMP.TAG, "requestLiveSubscribeBusiness onError:" + th.getMessage());
                }
            }
            a1u.a(AnchorInfoFrameKMP.this.mContext, string);
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            if (netResponse != null) {
                o3s.b(AnchorInfoFrameKMP.TAG, "requestLiveSubscribeBusiness onError:" + netResponse.getRetMsg());
            }
            Context context = AnchorInfoFrameKMP.this.mContext;
            a1u.a(context, context.getString(R.string.taolive_live_subscribe_fail_msg));
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            String string = AnchorInfoFrameKMP.this.mContext.getString(R.string.taolive_live_subscribe_fail_msg);
            if (netResponse != null) {
                try {
                    if (netResponse.getDataJsonObject() != null && netResponse.getDataJsonObject().getJSONArray("model").length() > 0) {
                        string = AnchorInfoFrameKMP.this.mContext.getString(R.string.taolive_live_subscribe_success_msg);
                        AnchorInfoFrameKMP.access$2900(AnchorInfoFrameKMP.this);
                    }
                } catch (Throwable th) {
                    o3s.b(AnchorInfoFrameKMP.TAG, "requestLiveSubscribeBusiness onError:" + th.getMessage());
                }
            }
            a1u.a(AnchorInfoFrameKMP.this.mContext, string);
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h implements stk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8706a;

        public h(String str) {
            this.f8706a = str;
        }

        @Override // tb.stk
        public void a(jkd jkdVar) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fee1131", new Object[]{this, jkdVar});
            } else if (jkdVar instanceof hnf) {
                boolean z = ((hnf) jkdVar).f20761a;
                dt9 dt9Var = new dt9();
                dt9Var.f18052a = this.f8706a;
                dt9Var.b = z;
                AnchorInfoFrameKMP.this.onFollowChange(dt9Var);
                f3c h = AnchorInfoFrameKMP.this.mFrameContext.h();
                Boolean valueOf = Boolean.valueOf(z);
                ux9 ux9Var = AnchorInfoFrameKMP.this.mFrameContext;
                if (ux9Var == null) {
                    str = null;
                } else {
                    str = ux9Var.C();
                }
                h.c(uyg.EVENT_GET_FOLLOW_STATUS, valueOf, str);
            }
        }

        @Override // tb.stk
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TextView textView = AnchorInfoFrameKMP.this.nickNameView;
            if (textView != null) {
                textView.setSelected(false);
                AnchorInfoFrameKMP.this.nickNameView.setSelected(true);
                AnchorInfoFrameKMP anchorInfoFrameKMP = AnchorInfoFrameKMP.this;
                anchorInfoFrameKMP.nickNameView.postDelayed(AnchorInfoFrameKMP.access$000(anchorInfoFrameKMP), 15000L);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class j implements ViewTreeObserver.OnDrawListener {
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
                    AnchorInfoFrameKMP.access$200(AnchorInfoFrameKMP.this);
                }
            }
        }

        public j() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73be92ca", new Object[]{this});
            } else if (AnchorInfoFrameKMP.access$100(AnchorInfoFrameKMP.this).compareAndSet(false, true)) {
                f3c h = AnchorInfoFrameKMP.this.mFrameContext.h();
                String componentName = AnchorInfoFrameKMP.this.getComponentName();
                ux9 ux9Var = AnchorInfoFrameKMP.this.mFrameContext;
                if (ux9Var == null) {
                    str = null;
                } else {
                    str = ux9Var.C();
                }
                h.c(uyg.EVENT_LIVE_UI_RENDER_FINISH, componentName, str);
                AnchorInfoFrameKMP.this.mContainer.post(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class k implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
            } else {
                AnchorInfoFrameKMP.access$300(AnchorInfoFrameKMP.this);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class l implements g1a<ITaoLiveKtAccountViewModel, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
        }

        /* renamed from: a */
        public xhv invoke(ITaoLiveKtAccountViewModel iTaoLiveKtAccountViewModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xhv) ipChange.ipc$dispatch("51ba7843", new Object[]{this, iTaoLiveKtAccountViewModel});
            }
            AnchorInfoFrameKMP.access$400(AnchorInfoFrameKMP.this, iTaoLiveKtAccountViewModel);
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class m implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m() {
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            AnchorInfoFrameKMP.access$502(AnchorInfoFrameKMP.this, null);
            AnchorInfoFrameKMP.access$600(AnchorInfoFrameKMP.this, false);
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (netBaseOutDo.getData() instanceof klc) {
                klc klcVar = (klc) netBaseOutDo.getData();
                String str = null;
                if (klcVar != null) {
                    AnchorInfoFrameKMP.access$502(AnchorInfoFrameKMP.this, klcVar.hasLiveId());
                    f3c h = AnchorInfoFrameKMP.this.mFrameContext.h();
                    String access$500 = AnchorInfoFrameKMP.access$500(AnchorInfoFrameKMP.this);
                    ux9 ux9Var = AnchorInfoFrameKMP.this.mFrameContext;
                    if (ux9Var != null) {
                        str = ux9Var.C();
                    }
                    h.c(uyg.EVENT_TIMESHIFT_LIVING_ID_CHANGE, access$500, str);
                    if (!TextUtils.isEmpty(AnchorInfoFrameKMP.access$500(AnchorInfoFrameKMP.this))) {
                        AnchorInfoFrameKMP.access$600(AnchorInfoFrameKMP.this, true);
                        return;
                    }
                    return;
                }
                AnchorInfoFrameKMP.access$502(AnchorInfoFrameKMP.this, null);
                AnchorInfoFrameKMP.access$600(AnchorInfoFrameKMP.this, false);
            }
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class n implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public n() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            int b = hw0.b(AnchorInfoFrameKMP.this.mContext, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            AnchorInfoFrameKMP.access$700(AnchorInfoFrameKMP.this).getLayoutParams().height = b;
            AnchorInfoFrameKMP.access$700(AnchorInfoFrameKMP.this).getLayoutParams().width = b;
            AnchorInfoFrameKMP.access$700(AnchorInfoFrameKMP.this).requestLayout();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class o implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.android.live.plugin.atype.flexalocal.topbar.anchorinfokmp.AnchorInfoFrameKMP$o$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
            public class RunnableC0454a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public RunnableC0454a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        AnchorInfoFrameKMP.this.mFrameContext.h().d(uyg.EVENT_REFRESH_OFFICIAL_ENTRY_VIEW);
                    }
                }
            }

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (AnchorInfoFrameKMP.access$900(AnchorInfoFrameKMP.this) != null) {
                    AnchorInfoFrameKMP anchorInfoFrameKMP = AnchorInfoFrameKMP.this;
                    AnchorInfoFrameKMP.access$400(anchorInfoFrameKMP, AnchorInfoFrameKMP.access$900(anchorInfoFrameKMP).getAccountViewModel());
                    AnchorInfoFrameKMP.access$1000(AnchorInfoFrameKMP.this).post(new RunnableC0454a());
                }
            }
        }

        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (AnchorInfoFrameKMP.access$800(AnchorInfoFrameKMP.this) != null) {
                AnchorInfoFrameKMP.access$800(AnchorInfoFrameKMP.this).setWidgetInstalled(v2s.o().H().a("88"));
                op3.r(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class p implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AnchorInfoFrameKMP.this.mFrameContext.h().d(uyg.EVENT_REFRESH_OFFICIAL_ENTRY_VIEW);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class q implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public q() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            AnchorInfoFrameKMP.access$1100(AnchorInfoFrameKMP.this).setVisibility(0);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static /* synthetic */ class r {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$kmp$live$liveBizComponent$service$biz$topGroup$TaoLiveKtAccountFollowType;

        static {
            int[] iArr = new int[TaoLiveKtAccountFollowType.values().length];
            $SwitchMap$com$taobao$kmp$live$liveBizComponent$service$biz$topGroup$TaoLiveKtAccountFollowType = iArr;
            try {
                iArr[TaoLiveKtAccountFollowType.UnFollow.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$kmp$live$liveBizComponent$service$biz$topGroup$TaoLiveKtAccountFollowType[TaoLiveKtAccountFollowType.Unsubscribed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$kmp$live$liveBizComponent$service$biz$topGroup$TaoLiveKtAccountFollowType[TaoLiveKtAccountFollowType.UnFavor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$kmp$live$liveBizComponent$service$biz$topGroup$TaoLiveKtAccountFollowType[TaoLiveKtAccountFollowType.WidgetSubscribed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$kmp$live$liveBizComponent$service$biz$topGroup$TaoLiveKtAccountFollowType[TaoLiveKtAccountFollowType.JoinedFansClub.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$kmp$live$liveBizComponent$service$biz$topGroup$TaoLiveKtAccountFollowType[TaoLiveKtAccountFollowType.JoinedFansClubWithUnFavor.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$taobao$kmp$live$liveBizComponent$service$biz$topGroup$TaoLiveKtAccountFollowType[TaoLiveKtAccountFollowType.Intimacy.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$taobao$kmp$live$liveBizComponent$service$biz$topGroup$TaoLiveKtAccountFollowType[TaoLiveKtAccountFollowType.IntimacyWithUnFavor.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        t2o.a(295700017);
        t2o.a(806355898);
        t2o.a(806355889);
        t2o.a(806355016);
        t2o.a(989856388);
    }

    public AnchorInfoFrameKMP(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public static /* synthetic */ Runnable access$000(AnchorInfoFrameKMP anchorInfoFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("ec05b577", new Object[]{anchorInfoFrameKMP});
        }
        return anchorInfoFrameKMP.mStartMarqueeRunnable;
    }

    public static /* synthetic */ AtomicBoolean access$100(AnchorInfoFrameKMP anchorInfoFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("b24db71c", new Object[]{anchorInfoFrameKMP});
        }
        return anchorInfoFrameKMP.mIsDispatchOnDraw;
    }

    public static /* synthetic */ View access$1000(AnchorInfoFrameKMP anchorInfoFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fd24c370", new Object[]{anchorInfoFrameKMP});
        }
        return anchorInfoFrameKMP.followViewContainer;
    }

    public static /* synthetic */ View access$1100(AnchorInfoFrameKMP anchorInfoFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b8cdf18f", new Object[]{anchorInfoFrameKMP});
        }
        return anchorInfoFrameKMP.avatarBackgroundView;
    }

    public static /* synthetic */ void access$1200(AnchorInfoFrameKMP anchorInfoFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da35ca6c", new Object[]{anchorInfoFrameKMP});
        } else {
            anchorInfoFrameKMP.hideUnFollow();
        }
    }

    public static /* synthetic */ void access$1300(AnchorInfoFrameKMP anchorInfoFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab7924b", new Object[]{anchorInfoFrameKMP});
        } else {
            anchorInfoFrameKMP.hideFansClub();
        }
    }

    public static /* synthetic */ void access$1400(AnchorInfoFrameKMP anchorInfoFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b395a2a", new Object[]{anchorInfoFrameKMP});
        } else {
            anchorInfoFrameKMP.hideUnFavorite();
        }
    }

    public static /* synthetic */ boolean access$1500(AnchorInfoFrameKMP anchorInfoFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bbb220d", new Object[]{anchorInfoFrameKMP})).booleanValue();
        }
        return anchorInfoFrameKMP.enableAccountIntimacy();
    }

    public static /* synthetic */ void access$1600(AnchorInfoFrameKMP anchorInfoFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c3ce9e8", new Object[]{anchorInfoFrameKMP});
        } else {
            anchorInfoFrameKMP.showWidgetText();
        }
    }

    public static /* synthetic */ void access$1700(AnchorInfoFrameKMP anchorInfoFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cbeb1c7", new Object[]{anchorInfoFrameKMP});
        } else {
            anchorInfoFrameKMP.widgetTextViewInAnim();
        }
    }

    public static /* synthetic */ TextView access$1800(AnchorInfoFrameKMP anchorInfoFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("2200101a", new Object[]{anchorInfoFrameKMP});
        }
        return anchorInfoFrameKMP.mWidgetTextView;
    }

    public static /* synthetic */ LinearLayout access$1900(AnchorInfoFrameKMP anchorInfoFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("6404695c", new Object[]{anchorInfoFrameKMP});
        }
        return anchorInfoFrameKMP.mWidgetLl;
    }

    public static /* synthetic */ void access$200(AnchorInfoFrameKMP anchorInfoFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4b5dcbb", new Object[]{anchorInfoFrameKMP});
        } else {
            anchorInfoFrameKMP.removeOnDrawListener();
        }
    }

    public static /* synthetic */ TUrlImageView access$2000(AnchorInfoFrameKMP anchorInfoFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("e77e1ced", new Object[]{anchorInfoFrameKMP});
        }
        return anchorInfoFrameKMP.mWidgetIcon;
    }

    public static /* synthetic */ void access$2100(AnchorInfoFrameKMP anchorInfoFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296b368e", new Object[]{anchorInfoFrameKMP});
        } else {
            anchorInfoFrameKMP.widgetIconViewInAnim();
        }
    }

    public static /* synthetic */ Runnable access$2200(AnchorInfoFrameKMP anchorInfoFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("13912e07", new Object[]{anchorInfoFrameKMP});
        }
        return anchorInfoFrameKMP.widgetTextToIconRunnable;
    }

    public static /* synthetic */ Runnable access$2202(AnchorInfoFrameKMP anchorInfoFrameKMP, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("b7c9de4b", new Object[]{anchorInfoFrameKMP, runnable});
        }
        anchorInfoFrameKMP.widgetTextToIconRunnable = runnable;
        return runnable;
    }

    public static /* synthetic */ void access$2300(AnchorInfoFrameKMP anchorInfoFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6ec64c", new Object[]{anchorInfoFrameKMP});
        } else {
            anchorInfoFrameKMP.widgetTextToIconAnim();
        }
    }

    public static /* synthetic */ Handler access$2400(AnchorInfoFrameKMP anchorInfoFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("a0fb62bb", new Object[]{anchorInfoFrameKMP});
        }
        return anchorInfoFrameKMP.handler;
    }

    public static /* synthetic */ boolean access$2502(AnchorInfoFrameKMP anchorInfoFrameKMP, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13659e90", new Object[]{anchorInfoFrameKMP, new Boolean(z)})).booleanValue();
        }
        anchorInfoFrameKMP.isManualFollow = z;
        return z;
    }

    public static /* synthetic */ void access$2600(AnchorInfoFrameKMP anchorInfoFrameKMP, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f290520b", new Object[]{anchorInfoFrameKMP, new Boolean(z)});
        } else {
            anchorInfoFrameKMP.updateVideoInfo(z);
        }
    }

    public static /* synthetic */ void access$2700(AnchorInfoFrameKMP anchorInfoFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c75e5c8", new Object[]{anchorInfoFrameKMP});
        } else {
            anchorInfoFrameKMP.sendComment();
        }
    }

    public static /* synthetic */ void access$2800(AnchorInfoFrameKMP anchorInfoFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cf7ada7", new Object[]{anchorInfoFrameKMP});
        } else {
            anchorInfoFrameKMP.followGuideLiveHome();
        }
    }

    public static /* synthetic */ void access$2900(AnchorInfoFrameKMP anchorInfoFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d797586", new Object[]{anchorInfoFrameKMP});
        } else {
            anchorInfoFrameKMP.hideUnsubscribe();
        }
    }

    public static /* synthetic */ void access$300(AnchorInfoFrameKMP anchorInfoFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c537a49a", new Object[]{anchorInfoFrameKMP});
        } else {
            anchorInfoFrameKMP.notifyAccessibilityChange();
        }
    }

    public static /* synthetic */ void access$400(AnchorInfoFrameKMP anchorInfoFrameKMP, ITaoLiveKtAccountViewModel iTaoLiveKtAccountViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9496be", new Object[]{anchorInfoFrameKMP, iTaoLiveKtAccountViewModel});
        } else {
            anchorInfoFrameKMP.updateView(iTaoLiveKtAccountViewModel);
        }
    }

    public static /* synthetic */ String access$500(AnchorInfoFrameKMP anchorInfoFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d472fb48", new Object[]{anchorInfoFrameKMP});
        }
        return anchorInfoFrameKMP.hasLiveId;
    }

    public static /* synthetic */ String access$502(AnchorInfoFrameKMP anchorInfoFrameKMP, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cdf9e4c0", new Object[]{anchorInfoFrameKMP, str});
        }
        anchorInfoFrameKMP.hasLiveId = str;
        return str;
    }

    public static /* synthetic */ void access$600(AnchorInfoFrameKMP anchorInfoFrameKMP, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70e33d7d", new Object[]{anchorInfoFrameKMP, new Boolean(z)});
        } else {
            anchorInfoFrameKMP.avatarAnim(z);
        }
    }

    public static /* synthetic */ View access$700(AnchorInfoFrameKMP anchorInfoFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fbb8c2d8", new Object[]{anchorInfoFrameKMP});
        }
        return anchorInfoFrameKMP.avatarAnimView;
    }

    public static /* synthetic */ ITaoLiveKtAccountViewModel access$800(AnchorInfoFrameKMP anchorInfoFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveKtAccountViewModel) ipChange.ipc$dispatch("86663646", new Object[]{anchorInfoFrameKMP});
        }
        return anchorInfoFrameKMP.accountModel;
    }

    public static /* synthetic */ ITaoLiveKtAccountManager access$900(AnchorInfoFrameKMP anchorInfoFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveKtAccountManager) ipChange.ipc$dispatch("84bce0be", new Object[]{anchorInfoFrameKMP});
        }
        return anchorInfoFrameKMP.accountManager;
    }

    private void addOnDrawListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc26ed1f", new Object[]{this});
        } else if (getComponentView() != null) {
            this.mIsDispatchOnDraw.set(false);
            getComponentView().getViewTreeObserver().addOnDrawListener(this.mOnDrawListener);
        }
    }

    private void avatarAnim(boolean z) {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef0a7263", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel == null || !z || (videoInfo = tBLiveDataModel.mVideoInfo) == null || !"2".equals(videoInfo.roomStatus)) {
            this.mShowAnim = false;
            this.avatarAnimView.setVisibility(8);
            return;
        }
        this.mShowAnim = true;
        this.avatarAnimView.setVisibility(0);
        this.animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.avatarAnimView, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(400L);
        ofFloat.setStartDelay(400L);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ValueAnimator ofInt = ValueAnimator.ofInt(32, 38);
        ofInt.setDuration(800L);
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        ofInt.addUpdateListener(new n());
        this.animatorSet.setDuration(1200L);
        this.animatorSet.playTogether(ofInt, ofFloat);
        this.animatorSet.start();
    }

    private void checkFollowFormMtop(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b753ef76", new Object[]{this, str});
            return;
        }
        qt9 qt9Var = new qt9();
        qt9Var.f26917a = str;
        if (v2s.o().k() != null) {
            v2s.o().k().c(qt9Var, new h(str));
        }
    }

    private void checkHideWatchNum() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a80410c8", new Object[]{this});
            return;
        }
        this.watchLabelImage.setVisibility(8);
        if (this.accountModel != null && !gnk.a().f(this.mLiveDataModel)) {
            boolean enableHideWatchNums = this.accountModel.getEnableHideWatchNums();
            o3s.b(TAG, "[updateView] enableHideWatchNums: " + enableHideWatchNums);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.nickNameLayout.getLayoutParams();
            if (enableHideWatchNums) {
                layoutParams.addRule(15, -1);
                layoutParams.topMargin = 0;
                this.nickNameLayout.setLayoutParams(layoutParams);
                this.watchLayout.setVisibility(8);
            } else {
                layoutParams.removeRule(15);
                layoutParams.topMargin = dp2px(this.mContext, 2);
                this.nickNameLayout.setLayoutParams(layoutParams);
                this.watchLayout.setVisibility(0);
            }
            this.nickNameLayout.postDelayed(this.mStartMarqueeRunnable, 1000L);
        }
    }

    public static int dp2px(Context context, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a48f723", new Object[]{context, new Integer(i2)})).intValue();
        }
        return Math.round(context.getResources().getDisplayMetrics().density * i2);
    }

    private void follow() {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("871b7fb8", new Object[]{this});
            return;
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null && videoInfo.broadCaster != null) {
            String liveId = getLiveId(videoInfo);
            String accountId = getAccountId(videoInfo);
            String str = videoInfo.broadCaster.type;
            String str2 = videoInfo.relatedAccountId;
            if (!TextUtils.isEmpty(accountId) && !TextUtils.isEmpty(str)) {
                if (!gnk.a().g(videoInfo)) {
                    followRelatedAccountId(str2, accountId, videoInfo.liveId);
                }
                qt9 qt9Var = new qt9();
                qt9Var.c = liveId;
                qt9Var.b = str;
                qt9Var.f26917a = accountId;
                qt9Var.o = qt9.FOLLOW_ANCHOR_AVATAR;
                v2s.o().k().f(giv.f().b(this.mFrameContext, qt9Var), new d(accountId));
                HashMap hashMap = new HashMap();
                hashMap.put("follow_location", SubstituteConstants.KEY_SUBSTITUTE_PAY_AVATAR);
                if (!(this.mContext == null || giv.f() == null)) {
                    giv.f().l(this.mFrameContext, this.mContext, accountId, hashMap);
                }
                uo8.f(this.mFrameContext, "follow", 0L);
            }
        }
    }

    private void followGuideLiveHome() {
        IInteractiveProxy.h z0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79890c5d", new Object[]{this});
            return;
        }
        ux9 ux9Var = this.mFrameContext;
        if ((ux9Var instanceof t54) && (z0 = ((t54) ux9Var).z0()) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("name", "@ali/alivemodx-follow-guidepopup");
            z0.v("invoke-message-component", hashMap);
        }
    }

    private void followOutAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf59f15", new Object[]{this});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mUnFollowView, "alpha", 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.isManualFollow = false;
        animatorSet.addListener(new a());
        animatorSet.play(ofFloat);
        animatorSet.setDuration(200L);
        animatorSet.start();
    }

    private void followRelatedAccountId(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f24fabb3", new Object[]{this, str, str2, str3});
        } else if (!TextUtils.isEmpty(str) && !"0".equals(str) && !str.equals(str2)) {
            qt9 qt9Var = new qt9();
            qt9Var.c = str3;
            qt9Var.b = "shop";
            qt9Var.f26917a = str;
            v2s.o().k().f(qt9Var, new e(this));
        }
    }

    private String getAccountId(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59aa866c", new Object[]{this, videoInfo});
        }
        if (videoInfo == null) {
            return "";
        }
        if (gnk.a().g(videoInfo)) {
            return videoInfo.officialLiveInfo.accountId;
        }
        return videoInfo.broadCaster.accountId;
    }

    private String getLiveId(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c72d8597", new Object[]{this, videoInfo});
        }
        if (videoInfo == null) {
            return "";
        }
        if (gnk.a().g(videoInfo)) {
            return videoInfo.officialLiveInfo.officialLiveId;
        }
        return videoInfo.liveId;
    }

    private HashMap<String, String> getUnsubscribeParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("dd97166b", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        ITaoLiveKtAccountViewModel iTaoLiveKtAccountViewModel = this.accountModel;
        if (!(iTaoLiveKtAccountViewModel == null || iTaoLiveKtAccountViewModel.getSubscribeModel() == null || this.accountModel.getSubscribeModel().getDataTrack() == null)) {
            hashMap.put("type", this.accountModel.getSubscribeModel().getDataTrack().getType());
            hashMap.put("redpacket", this.accountModel.getSubscribeModel().getDataTrack().getRedPacket());
        }
        return hashMap;
    }

    private void handlePopSubscribe() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcf29848", new Object[]{this});
            return;
        }
        ITaoLiveKtAccountViewModel iTaoLiveKtAccountViewModel = this.accountModel;
        if (iTaoLiveKtAccountViewModel != null && iTaoLiveKtAccountViewModel.getSubscribeModel() != null && (jSONObject = new JSONObject(this.accountModel.getSubscribeModel().getOriginData()).getJSONObject(c4o.KEY_DATA_SOURCE)) != null) {
            if (jSONObject.containsKey("jumpParam") && (jSONObject.get("jumpParam") instanceof JSONObject)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("jumpParam");
                String string = jSONObject2.getString("componentName");
                if ("preLive".equals(jSONObject.getString("type"))) {
                    if (giv.c().b()) {
                        requestDTLiveSubscribeBusiness(jSONObject2);
                    } else {
                        requestLiveSubscribeBusiness(jSONObject2);
                    }
                } else if (!TextUtils.isEmpty(string)) {
                    popSubscribePlus(string, jSONObject2);
                }
            }
            trackUnsubscribeClick();
        }
    }

    private void hideFansClub() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384db87f", new Object[]{this});
            return;
        }
        setUnFavoriteWithFansClubViewVisibility(8);
        this.mFansClubView.setVisibility(8);
    }

    private void hideFollowViewContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1efbe90", new Object[]{this});
            return;
        }
        View view = this.followViewContainer;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void hideUnFavorite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2578b33e", new Object[]{this});
        } else if (this.mUnFavoriteView.getVisibility() != 8) {
            this.mUnFavoriteView.setVisibility(8);
        }
    }

    private void hideUnFollow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58c31d93", new Object[]{this});
        } else {
            this.mUnFollowView.setVisibility(8);
        }
    }

    private void hideUnsubscribe() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eebd4d36", new Object[]{this});
        } else if (this.accountManager.getAccountViewModel() != null) {
            this.accountManager.getAccountViewModel().setSubscribeModel(null);
            updateView(this.accountManager.getAccountViewModel());
        }
    }

    private void hideWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e6abad", new Object[]{this});
        } else {
            this.mWidgetLl.setVisibility(8);
        }
    }

    private void initAccountViewModelUpdateCallBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7afc1f3c", new Object[]{this});
            return;
        }
        o3s.b(TAG, "TaoLiveKtAccountManager initWatchNumCallBack");
        this.accountManager.setAccountViewModelUpdated(new l());
    }

    private AnimatorSet initAnimatorSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatorSet) ipChange.ipc$dispatch("29a9b1d3", new Object[]{this});
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new b());
        return animatorSet;
    }

    private void initComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb1a5fd4", new Object[]{this});
        } else if (d9m.f() != null) {
            ITaoLiveKtAccountManager accountManager = d9m.f().getAccountManager();
            this.accountManager = accountManager;
            if (accountManager != null) {
                this.accountModel = accountManager.getAccountViewModel();
                initAccountViewModelUpdateCallBack();
            }
        } else if (giv.f() != null) {
            o3s.b(TAG, "TaoLiveKtAccountManager kmp init fail");
            giv.f().m(this.mFrameContext, "anchorKmpError", new HashMap());
        }
    }

    private void initFollowService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ce1691b", new Object[]{this});
        } else if (nh4.I()) {
            Context context = this.mContext;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    v2s.o().k().b(this);
                    v2s.o().j().a(this);
                }
            }
        } else {
            v2s.o().k().b(this);
            v2s.o().j().a(this);
        }
    }

    public static /* synthetic */ Object ipc$super(AnchorInfoFrameKMP anchorInfoFrameKMP, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case -236809011:
                super.onWillAppear();
                return null;
            case 91531079:
                super.onViewCreated((View) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/topbar/anchorinfokmp/AnchorInfoFrameKMP");
        }
    }

    private void officialLiveHideFavoriteView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("438db8e1", new Object[]{this});
        } else if (gnk.a().f(this.mLiveDataModel)) {
            this.mUnFavoriteView.setVisibility(8);
        }
    }

    private void onFollowShow() {
        VideoInfo videoInfo;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ea69f94", new Object[]{this});
            return;
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null && videoInfo.broadCaster != null && giv.f() != null) {
            if (gnk.a().f(this.mLiveDataModel)) {
                z = TextUtils.equals(this.mLiveDataModel.mVideoInfo.officialLiveInfo.follow, "true");
            } else {
                z = this.mLiveDataModel.mVideoInfo.broadCaster.follow;
            }
            if (!z) {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("follow_location", SubstituteConstants.KEY_SUBSTITUTE_PAY_AVATAR);
                giv.f().p(this.mFrameContext, "Show-AccountFollow", hashMap);
            }
        }
    }

    private void openIntimacyPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52cd855d", new Object[]{this});
            return;
        }
        ITaoLiveKtAccountViewModel iTaoLiveKtAccountViewModel = this.accountModel;
        if (iTaoLiveKtAccountViewModel != null && iTaoLiveKtAccountViewModel.getIntimacyModel() != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("shopWindowUrl", (Object) this.accountModel.getIntimacyModel().getShopWindowUrl());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", (Object) TaoLiveActionType.ACTION_SHOP_WINDOW);
            jSONObject2.put("data", (Object) jSONObject);
            f3c z = this.mFrameContext.z();
            ux9 ux9Var = this.mFrameContext;
            z.c(uyg.INTERACTIVE_EVENT_BIZ_CENTER, jSONObject2, ux9Var == null ? null : ux9Var.C());
        }
    }

    private void openJoinFansClub() {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("508cb2d1", new Object[]{this});
            return;
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null && videoInfo.broadCaster != null && this.mContext != null) {
            if (!(this.accountManager == null || this.accountModel.getFansClubModel() == null)) {
                k09.a(true, this.mLiveDataModel, String.valueOf(this.accountModel.getFansClubModel().getStatus()));
            }
            p3u.d(this.mContext, this.mFrameContext, videoInfo.liveId, videoInfo.broadCaster.encodeAccountId);
        }
    }

    private void popSubscribePlus(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9377c5ec", new Object[]{this, str, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("componentName", (Object) str);
        jSONObject2.put("data", (Object) jSONObject);
        ux9 ux9Var = this.mFrameContext;
        if ((ux9Var instanceof t54) && ((t54) ux9Var).z0() != null) {
            ((t54) this.mFrameContext).z0().v("TBLiveWVPlugin.Event.openComponent", jSONObject2);
        }
    }

    private void queryHasLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fba75e45", new Object[]{this});
            return;
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var != null && ux9Var.q() != null) {
            this.mFrameContext.q().d(new m());
        }
    }

    private void refreshWidgetInstalledState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c656d9d", new Object[]{this});
        } else if (giv.c().c()) {
            Coordinator.execute(new o());
        } else {
            ITaoLiveKtAccountManager iTaoLiveKtAccountManager = this.accountManager;
            if (iTaoLiveKtAccountManager != null) {
                updateView(iTaoLiveKtAccountManager.getAccountViewModel());
                this.followViewContainer.post(new p());
            }
        }
    }

    private void removeOnDrawListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c35a42", new Object[]{this});
        } else if (getComponentView() != null) {
            getComponentView().getViewTreeObserver().removeOnDrawListener(this.mOnDrawListener);
        }
    }

    private void removeTextWatcher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe69bb2", new Object[]{this});
            return;
        }
        TextView textView = this.nickNameView;
        if (textView != null) {
            textView.removeTextChangedListener(this.watcher);
        }
        TextView textView2 = this.watchNum;
        if (textView2 != null) {
            textView2.removeTextChangedListener(this.watcher);
        }
    }

    private void requestDTLiveSubscribeBusiness(JSONObject jSONObject) {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d8ffd2a", new Object[]{this, jSONObject});
            return;
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null && !TextUtils.isEmpty(videoInfo.liveId)) {
            new hpz(new f()).b(jSONObject.getLong("targetId").longValue());
        }
    }

    private void requestLiveSubscribeBusiness(JSONObject jSONObject) {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c14005a", new Object[]{this, jSONObject});
            return;
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null && !TextUtils.isEmpty(videoInfo.liveId)) {
            new smr(new g()).K(p3u.a(jSONObject));
        }
    }

    private void sendComment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d87b7ebe", new Object[]{this});
            return;
        }
        o3s.b(hjr.KMPTag, "followed state kmp send");
        new g44(this.mContext, this.mFrameContext).g("follow");
    }

    private void setUnFavoriteWithFansClubViewVisibility(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb79a8b2", new Object[]{this, new Integer(i2)});
            return;
        }
        this.mFFCLeftView.setVisibility(i2);
        this.mFFCRightView.setVisibility(i2);
    }

    private void showFansClub(TaoLiveKtFansClubModel taoLiveKtFansClubModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96b81866", new Object[]{this, taoLiveKtFansClubModel});
            return;
        }
        showFollowViewContainer();
        if (taoLiveKtFansClubModel != null) {
            this.mFansClubView.setVisibility(0);
            this.mFansClubView.setImageUrl(taoLiveKtFansClubModel.getClubLevelSquareIcon());
            hideUnsubscribeView();
            hideUnFollow();
            hideUnFavorite();
            hideWidget();
            setUnFavoriteWithFansClubViewVisibility(8);
        }
    }

    private void showFansClubWithUnFavor(TaoLiveKtFansClubModel taoLiveKtFansClubModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c693743f", new Object[]{this, taoLiveKtFansClubModel});
            return;
        }
        showFollowViewContainer();
        if (taoLiveKtFansClubModel != null) {
            setUnFavoriteWithFansClubViewVisibility(0);
            this.mFFCLeftView.setImageUrl(taoLiveKtFansClubModel.getFavorWithClubIcon());
            this.mFFCRightView.setImageUrl(taoLiveKtFansClubModel.getClubLevelWithFavorSquareIcon());
            hideUnsubscribeView();
            hideUnFollow();
            hideUnFavorite();
            hideWidget();
            this.mFansClubView.setVisibility(8);
        }
    }

    private void showFollowViewContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcc17e75", new Object[]{this});
            return;
        }
        View view = this.followViewContainer;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private void showIntimacy(TaoLiveKtIntimacyModel taoLiveKtIntimacyModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c37f9e82", new Object[]{this, taoLiveKtIntimacyModel});
            return;
        }
        showFollowViewContainer();
        if (this.accountModel != null && !gnk.a().f(this.mLiveDataModel)) {
            if (taoLiveKtIntimacyModel != null) {
                this.mFansClubView.setVisibility(0);
                this.mFansClubView.setImageUrl(taoLiveKtIntimacyModel.getIntimacyIconNormal());
                hideUnsubscribeView();
                hideUnFollow();
                hideUnFavorite();
                hideWidget();
                setUnFavoriteWithFansClubViewVisibility(8);
            }
            trackIntimacyShow(false);
        }
    }

    private void showIntimacyWithUnFavor(TaoLiveKtIntimacyModel taoLiveKtIntimacyModel, TaoLiveKtFansClubModel taoLiveKtFansClubModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda74eeb", new Object[]{this, taoLiveKtIntimacyModel, taoLiveKtFansClubModel});
            return;
        }
        showFollowViewContainer();
        if (taoLiveKtIntimacyModel != null) {
            setUnFavoriteWithFansClubViewVisibility(0);
            this.mFFCLeftView.setImageUrl(taoLiveKtFansClubModel.getFavorWithClubIcon());
            this.mFFCRightView.setImageUrl(taoLiveKtIntimacyModel.getIntimacyIconFavor());
            hideUnsubscribeView();
            hideUnFollow();
            hideUnFavorite();
            hideWidget();
            this.mFansClubView.setVisibility(8);
        }
        trackIntimacyShow(true);
    }

    private void showWidgetText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d3fcdf5", new Object[]{this});
            return;
        }
        this.mWidgetLl.setVisibility(0);
        this.mWidgetTextView.setVisibility(0);
        this.mWidgetIcon.setVisibility(8);
        this.mWidgetTextView.setAlpha(1.0f);
    }

    private void trackIntimacyClick(boolean z) {
        ITaoLiveKtAccountViewModel iTaoLiveKtAccountViewModel;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8041cd4", new Object[]{this, new Boolean(z)});
        } else if (giv.f() != null && (iTaoLiveKtAccountViewModel = this.accountModel) != null && iTaoLiveKtAccountViewModel.getIntimacyModel() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(m09.TASK_TYPE_LEVEL, this.accountModel.getIntimacyModel().getLevelDesc());
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("type", str);
            giv.f().f("Intimacy", hashMap);
        }
    }

    private void trackIntimacyShow(boolean z) {
        ITaoLiveKtAccountViewModel iTaoLiveKtAccountViewModel;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5d24a41", new Object[]{this, new Boolean(z)});
        } else if (giv.f() != null && (iTaoLiveKtAccountViewModel = this.accountModel) != null && iTaoLiveKtAccountViewModel.getIntimacyModel() != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(m09.TASK_TYPE_LEVEL, this.accountModel.getIntimacyModel().getLevelDesc());
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("type", str);
            giv.f().a("Show-Intimacy", hashMap);
        }
    }

    private void trackOfficialClick() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d3e9159", new Object[]{this});
        } else if (this.accountModel != null && gnk.a().d(this.mLiveDataModel)) {
            if (gnk.a().f(this.mLiveDataModel)) {
                str = "official_icon";
            } else {
                str = "former_icon";
            }
            if (giv.f() != null) {
                giv.f().m(this.mFrameContext, str, this.accountModel.fetchOfficialTrackParams());
            }
        }
    }

    private void trackUnsubscribeClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c94a6829", new Object[]{this});
        } else if (giv.f() != null) {
            giv.f().f("Subscription", getUnsubscribeParams());
        }
    }

    private void trackUnsubscribeShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8264cbaa", new Object[]{this});
        } else if (giv.f() != null) {
            giv.f().a("Show-subscription", getUnsubscribeParams());
        }
    }

    private void trackWidgetClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6315ff60", new Object[]{this});
        } else if (kkr.i().o() != null) {
            kkr.i().o().c("avatar_anchorDesktop", null);
        }
    }

    private void trackWidgetShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13bdf193", new Object[]{this});
        } else if (kkr.i().o() != null) {
            kkr.i().o().b("Show-avatar_anchorDesktop", null);
        }
    }

    private void updateFansClubData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e245d8d0", new Object[]{this});
        } else {
            this.accountManager.buttonClicked(TaoLiveKtAccountActionType.AddFansClub.getValue(), null);
        }
    }

    private void updateFavorite(Boolean bool) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34ece441", new Object[]{this, bool});
        } else if (gnk.a().f(this.mLiveDataModel)) {
            this.favoriteTagView.setVisibility(8);
        } else if (k0r.e()) {
            TUrlImageView tUrlImageView = this.favoriteTagView;
            if (!bool.booleanValue()) {
                i2 = 8;
            }
            tUrlImageView.setVisibility(i2);
        }
    }

    private void updateFollowStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaaac4f3", new Object[]{this});
            return;
        }
        ITaoLiveKtAccountViewModel iTaoLiveKtAccountViewModel = this.accountModel;
        if (iTaoLiveKtAccountViewModel != null) {
            TaoLiveKtAccountFollowType fetchAccountFollowType = iTaoLiveKtAccountViewModel.fetchAccountFollowType();
            o3s.b(TAG, "[updateFollowStatus] followType: " + fetchAccountFollowType);
            switch (r.$SwitchMap$com$taobao$kmp$live$liveBizComponent$service$biz$topGroup$TaoLiveKtAccountFollowType[fetchAccountFollowType.ordinal()]) {
                case 1:
                    if (this.preFollowType != TaoLiveKtAccountFollowType.UnFollow) {
                        onFollowShow();
                    }
                    showUnFollow();
                    break;
                case 2:
                    if (this.preFollowType != TaoLiveKtAccountFollowType.Unsubscribed) {
                        trackUnsubscribeShow();
                    }
                    showUnsubscribe();
                    break;
                case 3:
                    showUnFavorite();
                    break;
                case 4:
                    if (this.preFollowType != TaoLiveKtAccountFollowType.WidgetSubscribed) {
                        trackWidgetShow();
                        showFollowViewContainer();
                        if (this.preFollowType == TaoLiveKtAccountFollowType.UnFollow && this.isManualFollow) {
                            followOutAnim();
                            break;
                        } else {
                            showWidgetIcon();
                            break;
                        }
                    } else {
                        return;
                    }
                    break;
                case 5:
                    if (!this.hasShowFansClub && this.accountModel.getFansClubModel() != null) {
                        k09.a(false, this.mLiveDataModel, String.valueOf(this.accountModel.getFansClubModel().getStatus()));
                        this.hasShowFansClub = true;
                    }
                    showFansClub(this.accountModel.getFansClubModel());
                    break;
                case 6:
                    showFansClubWithUnFavor(this.accountModel.getFansClubModel());
                    break;
                case 7:
                    showIntimacy(this.accountModel.getIntimacyModel());
                    break;
                case 8:
                    showIntimacyWithUnFavor(this.accountModel.getIntimacyModel(), this.accountModel.getFansClubModel());
                    break;
                default:
                    hideFollowViewContainer();
                    break;
            }
            this.preFollowType = fetchAccountFollowType;
        }
    }

    private void updateHeadView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a1bde15", new Object[]{this});
            return;
        }
        ITaoLiveKtAccountViewModel iTaoLiveKtAccountViewModel = this.accountModel;
        if (iTaoLiveKtAccountViewModel != null) {
            String avatarUrl = iTaoLiveKtAccountViewModel.getAvatarUrl();
            String accountName = this.accountModel.getAccountName();
            if (d4s.e("enableWhiteUserDataShow", true) && !qvs.c0()) {
                accountName = yax.a(this.mFrameContext) + accountName;
            }
            this.avatarView.setImageUrl(avatarUrl);
            this.avatarView.succListener(new q());
            if (!TextUtils.isEmpty(accountName) && !accountName.contentEquals(this.nickNameView.getText())) {
                o3s.b(TAG, "[updateView] accountName: ".concat(accountName));
                this.nickNameView.setText(accountName);
            }
        }
    }

    private void updateVideoInfo4Favorite(boolean z) {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1deec3d", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null) {
            AccountInfo accountInfo = videoInfo.broadCaster;
            if (accountInfo != null) {
                accountInfo.topFollow = z;
            }
            ITaoLiveKtAccountManager iTaoLiveKtAccountManager = this.accountManager;
            if (iTaoLiveKtAccountManager != null && iTaoLiveKtAccountManager.getAccountViewModel() != null) {
                this.accountManager.getAccountViewModel().setTopFavored(z);
                updateView(this.accountManager.getAccountViewModel());
            }
        }
    }

    private void updateView(ITaoLiveKtAccountViewModel iTaoLiveKtAccountViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60feb5da", new Object[]{this, iTaoLiveKtAccountViewModel});
            return;
        }
        this.accountModel = iTaoLiveKtAccountViewModel;
        if (iTaoLiveKtAccountViewModel == null) {
            o3s.b(TAG, "[updateView] accountModel is null");
            return;
        }
        updateHeadView();
        updateVIcon();
        updateWatchNumText();
        updateFollowStatus();
    }

    private void updateWatchNumText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2537b74", new Object[]{this});
            return;
        }
        ITaoLiveKtAccountViewModel iTaoLiveKtAccountViewModel = this.accountModel;
        if (iTaoLiveKtAccountViewModel != null) {
            this.watchNum.setText(iTaoLiveKtAccountViewModel.fetchInfoText());
            if (TextUtils.isEmpty(this.accountModel.fetchInfoIconUrl())) {
                this.watchLabelImage.setVisibility(8);
                this.watchNum.setMaxWidth(dp2px(this.mContext, 96));
                return;
            }
            this.watchNum.setMaxWidth(dp2px(this.mContext, 65));
            this.watchLabelImage.setImageUrl(this.accountModel.fetchInfoIconUrl());
            this.watchLabelImage.setVisibility(0);
            pfa.a(this.mContext, this.watchLabelImage, 12.0f);
        }
    }

    private void widgetClicked() {
        VideoInfo videoInfo;
        AccountInfo accountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6513a44a", new Object[]{this});
            return;
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null && (accountInfo = videoInfo.broadCaster) != null && accountInfo.widgetTip != null) {
            trackWidgetClick();
            AccountInfo.WidgetTip widgetTip = this.mLiveDataModel.mVideoInfo.broadCaster.widgetTip;
            p3u.h(widgetTip.widgetJumpUrl, this.mFrameContext, widgetTip.jumpType, widgetTip.componentData, this.mContext);
        }
    }

    private void widgetIconViewInAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9511ed1f", new Object[]{this});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mWidgetIcon, "alpha", 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat);
        animatorSet.setDuration(400L);
        animatorSet.start();
    }

    private void widgetTextToIconAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ee0fbbd", new Object[]{this});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mWidgetTextView, "alpha", 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new c());
        animatorSet.play(ofFloat);
        animatorSet.setDuration(200L);
        animatorSet.start();
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return TAG;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return TAG;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_topbar_frame_anchor_info_kmp_flexalocal;
    }

    public void hideUnsubscribeView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a3521fb", new Object[]{this});
        } else {
            this.mUnsubscribeView.setVisibility(8);
        }
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{uyg.EVENT_CLOSE_FAVORITE_GUIDE_DIALOG, uyg.EVENT_JOIN_FANS_CLUB_NOTIFY_EVENT, "com.taobao.taolive.room.install_widget_success", uyg.EVENT_H5_CONTAINER_DESTROY, uyg.EVENT_ACTION_FOLLOW};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var == null) {
            return null;
        }
        return ux9Var.C();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        v2s.o().k().g(this);
        v2s.o().j().c(this);
        TextView textView = this.nickNameView;
        if (textView != null) {
            textView.removeCallbacks(this.mStartMarqueeRunnable);
        }
        if (nh4.m()) {
            TUrlImageView tUrlImageView = this.avatarView;
            if (tUrlImageView != null) {
                tUrlImageView.setImageUrl(null);
            }
            TextView textView2 = this.nickNameView;
            if (textView2 != null) {
                textView2.setText((CharSequence) null);
            }
            TUrlImageView tUrlImageView2 = this.vLabelImage;
            if (tUrlImageView2 != null) {
                tUrlImageView2.setImageUrl(null);
            }
            View view = this.avatarBackgroundView;
            if (view != null) {
                view.setVisibility(8);
            }
        }
        lqw.d().h(this);
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.clickAvatarNum = 0;
        this.enterTime = 0L;
        removeOnDrawListener();
        removeTextWatcher();
        this.mFrameContext.h().b(this);
        this.hasShowFansClub = false;
        a39 a39Var = this.mFavoriteGuideDialog;
        if (a39Var != null) {
            a39Var.dismiss();
        }
        this.handler.removeCallbacksAndMessages(null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == R.id.taolive_favorite_with_fansclub_left_icon || id == R.id.taolive_unfavorite) {
            showFavoriteLayer();
        } else if (view.getId() == R.id.taolive_favorite_with_fansclub_right_icon || id == R.id.taolive_fans_club_icon) {
            TaoLiveKtAccountFollowType fetchAccountFollowType = this.accountModel.fetchAccountFollowType();
            if (TaoLiveKtAccountFollowType.IntimacyWithUnFavor.equals(fetchAccountFollowType)) {
                openIntimacyPanel();
                trackIntimacyClick(true);
            } else if (TaoLiveKtAccountFollowType.Intimacy.equals(fetchAccountFollowType)) {
                openIntimacyPanel();
                trackIntimacyClick(false);
            } else {
                openJoinFansClub();
            }
        } else if (view.getId() == R.id.taolive_follow_favor_unfollow) {
            if (gnk.a().d(this.mLiveDataModel)) {
                trackClick();
            }
            follow();
        } else if (view.getId() == R.id.taolive_widget_ll) {
            widgetClicked();
        } else if (view.getId() == R.id.taolive_unsubscribe) {
            handlePopSubscribe();
        } else {
            processAvatarClick();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        o3s.b(TAG, "TaoLiveKtAccountManager onDataReceived");
        initComponent();
        a4s.b(this.mContext, this.mFrameContext.h(), this);
        lqw.d().b(this);
        this.enterTime = System.currentTimeMillis();
        addOnDrawListener();
        initFollowService();
        checkHideWatchNum();
        queryHasLive();
        refreshWidgetInstalledState();
        officialLiveHideFavoriteView();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        v2s.o().k().g(this);
        v2s.o().j().c(this);
    }

    @Override // tb.jqw
    public kqw onEvent(int i2, iqw iqwVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqw) ipChange.ipc$dispatch("75ee5a2a", new Object[]{this, new Integer(i2), iqwVar, objArr});
        }
        if (3005 != i2) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            JSONObject d2 = fkx.d((String) obj);
            String str = (String) (d2 != null ? d2.get("event") : "");
            if ((!SUBSCRIBE_SUCCESS_EVENT.equals(str) && !ANCHOR_START_NOTIFY_EVENT.equals(str)) || !Boolean.parseBoolean(d2.getJSONObject("param").getString("subscribeState"))) {
                return null;
            }
            hideUnsubscribe();
            return null;
        } catch (Throwable th) {
            v7t.d(TAG, th.toString());
            return null;
        }
    }

    @Override // tb.u29
    public void onFavoriteChange(t29 t29Var) {
        TBLiveDataModel tBLiveDataModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e3775d", new Object[]{this, t29Var});
        } else if (t29Var != null && (tBLiveDataModel = this.mLiveDataModel) != null && tBLiveDataModel.mVideoInfo != null) {
            updateFavorite(Boolean.valueOf(t29Var.b));
            if (getAccountId(this.mLiveDataModel.mVideoInfo).equals(t29Var.f28423a)) {
                updateVideoInfo4Favorite(t29Var.b);
            }
        }
    }

    @Override // tb.et9
    public void onFollowChange(dt9 dt9Var) {
        TBLiveDataModel tBLiveDataModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb93c2e5", new Object[]{this, dt9Var});
        } else if (dt9Var != null && (tBLiveDataModel = this.mLiveDataModel) != null && tBLiveDataModel.mVideoInfo != null) {
            if (!dt9Var.b) {
                updateFavorite(Boolean.FALSE);
            }
            if (getAccountId(this.mLiveDataModel.mVideoInfo).equals(dt9Var.f18052a)) {
                updateVideoInfo(dt9Var.b);
                if (dt9Var.b) {
                    giv.h().b(3, this.mLiveDataModel);
                }
            }
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null) {
            checkFollowFormMtop(getAccountId(videoInfo));
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        ViewProxy.setOnClickListener(this.mContainer, this);
        this.avatarView = (TUrlImageView) this.mContainer.findViewById(R.id.taolive_avatar_view);
        this.avatarBackgroundView = this.mContainer.findViewById(R.id.taolive_avatar_background_view);
        this.avatarAnimView = this.mContainer.findViewById(R.id.taolive_avatar_view_anim);
        this.nickNameLayout = this.mContainer.findViewById(R.id.taolive_nickname_layout);
        this.nickNameView = (TextView) this.mContainer.findViewById(R.id.taolive_nickname_view);
        this.vLabelImage = (TUrlImageView) this.mContainer.findViewById(R.id.taolive_anchor_info_v_label_image);
        this.watchLabelImage = (AliUrlImageView) this.mContainer.findViewById(R.id.taolive_topbar_watch_label_image_v2);
        this.avatarAnimView.setVisibility(8);
        this.watchNum = (TextView) this.mContainer.findViewById(R.id.taolive_topbar_watch_num_v2);
        this.watchLayout = (LinearLayout) this.mContainer.findViewById(R.id.taolive_topbar_watch_layout_v2);
        this.favoriteTagView = (TUrlImageView) this.mContainer.findViewById(R.id.taolive_favorite_tag);
        TextView textView = this.nickNameView;
        if (textView != null) {
            textView.addTextChangedListener(this.watcher);
        }
        TextView textView2 = this.watchNum;
        if (textView2 != null) {
            textView2.addTextChangedListener(this.watcher);
        }
        this.favoriteTagView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01gNgoSg1ph899iqMKc_!!6000000005391-2-tps-69-30.png");
        this.followViewContainer = view.findViewById(R.id.taolive_follow_favor_status);
        View findViewById = view.findViewById(R.id.taolive_follow_favor_unfollow);
        this.mUnFollowView = findViewById;
        ViewProxy.setOnClickListener(findViewById, this);
        this.mUnFollowView.setImportantForAccessibility(1);
        TextView textView3 = (TextView) view.findViewById(R.id.taolive_unfollow_text);
        if (!TextUtils.isEmpty(textView3.getText())) {
            this.mUnFollowView.setContentDescription(textView3.getText());
        }
        AccessibilityUtils.a(this.mUnFollowView);
        View findViewById2 = view.findViewById(R.id.taolive_unsubscribe);
        this.mUnsubscribeView = findViewById2;
        ViewProxy.setOnClickListener(findViewById2, this);
        this.mUnsubscribeTextView = (TextView) view.findViewById(R.id.taolive_unsubscribe_text);
        TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.taolive_unfavorite);
        this.mUnFavoriteView = tUrlImageView;
        tUrlImageView.setOnClickListener(this);
        TUrlImageView tUrlImageView2 = (TUrlImageView) view.findViewById(R.id.taolive_fans_club_icon);
        this.mFansClubView = tUrlImageView2;
        tUrlImageView2.setOnClickListener(this);
        TUrlImageView tUrlImageView3 = (TUrlImageView) view.findViewById(R.id.taolive_favorite_with_fansclub_left_icon);
        this.mFFCLeftView = tUrlImageView3;
        tUrlImageView3.setOnClickListener(this);
        TUrlImageView tUrlImageView4 = (TUrlImageView) view.findViewById(R.id.taolive_favorite_with_fansclub_right_icon);
        this.mFFCRightView = tUrlImageView4;
        tUrlImageView4.setOnClickListener(this);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.taolive_widget_ll);
        this.mWidgetLl = linearLayout;
        linearLayout.setOnClickListener(this);
        this.mWidgetTextView = (TextView) view.findViewById(R.id.taolive_widget_text_view);
        TUrlImageView tUrlImageView5 = (TUrlImageView) view.findViewById(R.id.taolive_widget_icon);
        this.mWidgetIcon = tUrlImageView5;
        tUrlImageView5.setSkipAutoSize(true);
        FlexaLiveX.w("AnchorInfoFrameKMP: class: " + getClass().getName() + ", pluginEnv: " + e9m.b());
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
            return;
        }
        super.onWillAppear();
        o3s.b(TAG, "onWillAppear");
    }

    public void showFavoriteLayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b25cd9f", new Object[]{this});
            return;
        }
        a39 a39Var = this.mFavoriteGuideDialog;
        if (a39Var != null) {
            a39Var.dismiss();
        }
        if (this.mLiveDataModel != null) {
            a39 a39Var2 = new a39(this.mContext, this.mLiveDataModel, this.mFrameContext.c);
            this.mFavoriteGuideDialog = a39Var2;
            a39Var2.show();
            if (giv.f() != null) {
                giv.f().n(this.mFrameContext, "Favor", new String[0]);
            }
        }
    }

    public void showToast(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1afc03b", new Object[]{this, str});
        } else if (nh4.A(this.mFrameContext)) {
            kiv.a(this.mContext, str, true);
        } else {
            kiv.c(this.mContext, str);
        }
    }

    public void showUnFavorite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49c58db9", new Object[]{this});
            return;
        }
        showFollowViewContainer();
        if (this.accountModel != null && !gnk.a().f(this.mLiveDataModel)) {
            this.mUnFavoriteView.setVisibility(0);
            this.mUnFavoriteView.setImageUrl(this.accountModel.getTopFavoredUrl());
            hideUnsubscribeView();
            hideUnFollow();
            hideFansClub();
            hideWidget();
            if (giv.f() != null) {
                giv.f().p(this.mFrameContext, "Show-Favor", new HashMap<>());
            }
        }
    }

    public void showUnFollow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29ea5ace", new Object[]{this});
            return;
        }
        showFollowViewContainer();
        this.mUnFollowView.setVisibility(0);
        this.mUnFollowView.setAlpha(1.0f);
        hideUnFavorite();
        hideFansClub();
        hideWidget();
        hideUnsubscribeView();
    }

    public void showUnsubscribe() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("540bc21b", new Object[]{this});
        } else if (this.accountModel != null) {
            showFollowViewContainer();
            this.mUnsubscribeView.setVisibility(0);
            this.mUnsubscribeTextView.setText(this.accountModel.fetchFollowButtonText());
            hideUnFollow();
            hideUnFavorite();
            hideFansClub();
            hideWidget();
        }
    }

    public void showWidgetIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d163f41", new Object[]{this});
            return;
        }
        hideUnFollow();
        this.mWidgetLl.setVisibility(0);
        this.mWidgetIcon.setImageUrl(nh4.l1());
        this.mWidgetTextView.setVisibility(8);
        this.mWidgetIcon.setVisibility(0);
        this.mWidgetIcon.setAlpha(1.0f);
        hideUnsubscribeView();
        hideFansClub();
        hideUnFavorite();
    }

    private void notifyAccessibilityChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b947329c", new Object[]{this});
            return;
        }
        TextView textView = this.nickNameView;
        String str = "";
        if (textView != null && !TextUtils.isEmpty(textView.getText()) && this.nickNameView.getVisibility() == 0) {
            str = str + ((Object) this.nickNameView.getText());
        }
        if (!TextUtils.isEmpty(str)) {
            str = str + "，";
        }
        TextView textView2 = this.watchNum;
        if (textView2 != null && !TextUtils.isEmpty(textView2.getText()) && this.watchNum.getVisibility() == 0) {
            str = str + ((Object) this.watchNum.getText());
        }
        this.mContainer.setImportantForAccessibility(1);
        this.mContainer.setContentDescription(str);
        AccessibilityUtils.a(this.mContainer);
    }

    private void processAvatarClick() {
        VideoInfo videoInfo;
        VideoInfo.AdmireInfo admireInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bc32647", new Object[]{this});
            return;
        }
        int i2 = this.clickAvatarNum + 1;
        this.clickAvatarNum = i2;
        gwg.l(this.enterTime, i2, this.mFrameContext, this.mLiveDataModel, this.mContext);
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null || (admireInfo = videoInfo.admireInfo) == null || TextUtils.isEmpty(admireInfo.accountJumpUrl)) {
            if (gnk.a().d(this.mLiveDataModel)) {
                trackOfficialClick();
            }
            if (this.mShowAnim) {
                voj.a(this.mContext, liv.d(this.hasLiveId) + BACK_TO_LIVE_PARAMS);
                return;
            }
            String str = null;
            if (gnk.a().f(this.mLiveDataModel)) {
                VideoInfo.OfficialLiveInfo officialLiveInfo = this.mLiveDataModel.mVideoInfo.officialLiveInfo;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("accountId", (Object) officialLiveInfo.accountId);
                jSONObject.put(LiveAvatarNewFrame.LIVE_AVATAR_ENCODE_ACCOUNT_ID, (Object) officialLiveInfo.encryptAnchorId);
                jSONObject.put("liveId", (Object) officialLiveInfo.officialLiveId);
                jSONObject.put("sourceType", (Object) "official-live");
                f3c h2 = this.mFrameContext.h();
                ux9 ux9Var = this.mFrameContext;
                if (ux9Var != null) {
                    str = ux9Var.C();
                }
                h2.c("com.taobao.taolive.room.avatar_card_show", jSONObject, str);
                return;
            }
            f3c h3 = this.mFrameContext.h();
            ux9 ux9Var2 = this.mFrameContext;
            h3.c("com.taobao.taolive.room.avatar_card_show", null, ux9Var2 == null ? null : ux9Var2.C());
            return;
        }
        voj.a(this.mContext, this.mLiveDataModel.mVideoInfo.admireInfo.accountJumpUrl);
        if (giv.f() != null) {
            giv.f().m(this.mFrameContext, "HeadPortrait", new HashMap());
        }
    }

    private void trackClick() {
        TBLiveDataModel tBLiveDataModel;
        VideoInfo videoInfo;
        String str;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a8ab904", new Object[]{this});
        } else if (this.accountModel != null && (tBLiveDataModel = this.mLiveDataModel) != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null && videoInfo.broadCaster != null && gnk.a().d(this.mLiveDataModel)) {
            if (gnk.a().f(this.mLiveDataModel)) {
                z = "false".equals(this.mLiveDataModel.mVideoInfo.officialLiveInfo.follow);
                str = dg6.EVENT_OFFICIAL_FOLLOW;
            } else {
                z = true ^ this.mLiveDataModel.mVideoInfo.broadCaster.follow;
                str = "former_follow";
            }
            if (z && giv.f() != null) {
                giv.f().m(this.mFrameContext, str, this.accountModel.fetchOfficialTrackParams());
            }
        }
    }

    private void updateVIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7732244d", new Object[]{this});
            return;
        }
        ITaoLiveKtAccountViewModel iTaoLiveKtAccountViewModel = this.accountModel;
        if (iTaoLiveKtAccountViewModel != null) {
            if (!TextUtils.isEmpty(iTaoLiveKtAccountViewModel.getVIconUrl())) {
                this.nickNameView.setMaxWidth(dp2px(this.mContext, 83));
                this.vLabelImage.setImageUrl(this.accountModel.getVIconUrl());
                this.vLabelImage.setVisibility(0);
                o3s.b(TAG, "set v icon, url: " + this.accountModel.getVIconUrl());
                return;
            }
            this.vLabelImage.setVisibility(8);
            this.nickNameView.setMaxWidth(dp2px(this.mContext, 96));
            o3s.b(TAG, "set v icon is undefined");
        }
    }

    private void updateVideoInfo(boolean z) {
        VideoInfo videoInfo;
        VideoInfo videoInfo2;
        AccountInfo accountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8416e2d", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null && videoInfo.originalData != null) {
            if (!gnk.a().f(this.mLiveDataModel) && (accountInfo = (videoInfo2 = this.mLiveDataModel.mVideoInfo).broadCaster) != null) {
                accountInfo.follow = z;
                videoInfo2.originalData.getJSONObject("broadCaster").put("follow", (Object) Boolean.valueOf(z));
                if (!z) {
                    accountInfo.topFollow = false;
                    this.mLiveDataModel.mVideoInfo.originalData.getJSONObject("broadCaster").put("topFollow", (Object) "false");
                }
            }
            ITaoLiveKtAccountManager iTaoLiveKtAccountManager = this.accountManager;
            if (iTaoLiveKtAccountManager != null && iTaoLiveKtAccountManager.getAccountViewModel() != null) {
                this.accountManager.getAccountViewModel().setFollowed(z);
                if (!z) {
                    this.accountManager.getAccountViewModel().setTopFavored(false);
                }
                updateView(this.accountManager.getAccountViewModel());
                refreshWidgetInstalledState();
            }
        }
    }

    private boolean enableAccountIntimacy() {
        String str;
        VideoInfo videoInfo;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0b89939", new Object[]{this})).booleanValue();
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null || (jSONObject = videoInfo.originalData) == null || (jSONObject2 = jSONObject.getJSONObject("intimacyData")) == null) {
            str = "true";
        } else {
            str = jSONObject2.getString("enableNewStyle");
        }
        return h2t.INSTANCE.k() && "true".equals(str);
    }

    private void widgetTextViewInAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1efaad3", new Object[]{this});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mWidgetTextView, "scaleX", 0.0f, 1.1f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.mWidgetTextView, "scaleY", 0.0f, 1.1f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.mWidgetTextView, "alpha", 0.0f, 1.0f);
        AnimatorSet initAnimatorSet = initAnimatorSet();
        initAnimatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        initAnimatorSet.setDuration(400L);
        initAnimatorSet.setInterpolator(new AccelerateInterpolator());
        initAnimatorSet.start();
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (uyg.EVENT_CLOSE_FAVORITE_GUIDE_DIALOG.equals(str)) {
            a39 a39Var = this.mFavoriteGuideDialog;
            if (a39Var != null) {
                a39Var.dismiss();
            }
            if (qjy.a()) {
                kjy.e().c();
            }
        } else if (uyg.EVENT_JOIN_FANS_CLUB_NOTIFY_EVENT.equals(str)) {
            updateFansClubData();
        } else if (TextUtils.equals("com.taobao.taolive.room.install_widget_success", str)) {
            if (p3u.f(this.mFrameContext, this.mLiveDataModel) && (obj instanceof String)) {
                boolean booleanValue = JSON.parseObject((String) obj).getBoolean("installWidgetSuccess").booleanValue();
                o3s.b(TAG, "installWidgetSuccess: " + booleanValue);
                this.mLiveDataModel.mVideoInfo.broadCaster.widgetTip.widgetAddition = booleanValue;
                ITaoLiveKtAccountManager iTaoLiveKtAccountManager = this.accountManager;
                if (iTaoLiveKtAccountManager != null && iTaoLiveKtAccountManager.getAccountViewModel() != null) {
                    this.accountManager.getAccountViewModel().setWidgetInstalled(booleanValue);
                    this.accountManager.getAccountViewModel().setWidgetAddition(booleanValue);
                    updateView(this.accountManager.getAccountViewModel());
                }
            }
        } else if (uyg.EVENT_H5_CONTAINER_DESTROY.equals(str)) {
            onResume();
        } else if (uyg.EVENT_ACTION_FOLLOW.equals(str)) {
            sendComment();
        }
    }
}
