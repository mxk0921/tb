package com.taobao.android.live.plugin.atype.flexalocal.fullscreen;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.banner.TaoLiveBannerFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.guide.BottomSlideNewGuideFrame;
import com.taobao.android.live.plugin.atype.flexalocal.clean.BlankFrame2;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.view.ClickableView;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.view.PassEventViewPager;
import com.taobao.android.live.plugin.atype.flexalocal.interactcenter.InteractBizCenterFrame;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.TopFakeBarFrame;
import com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.morelive.TaoMoreLiveRoomFrame;
import com.taobao.taolive.sdk.morelive.TaoliveRoomRightGuideFrame;
import com.taobao.taolive.sdk.morelive.TaoliveRoomTab2RightGuideFrame;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import tb.chd;
import tb.czd;
import tb.d9m;
import tb.giv;
import tb.gu3;
import tb.h17;
import tb.ibt;
import tb.jby;
import tb.kyd;
import tb.liv;
import tb.lzq;
import tb.nh4;
import tb.o3s;
import tb.or;
import tb.ot3;
import tb.qoc;
import tb.qvs;
import tb.rbt;
import tb.rgd;
import tb.s6t;
import tb.sjr;
import tb.t2o;
import tb.t6t;
import tb.tbt;
import tb.ty;
import tb.u6t;
import tb.up6;
import tb.ux9;
import tb.uyg;
import tb.v2s;
import tb.v7t;
import tb.vwl;
import tb.yqq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class AbsFullScreenFrame extends FullScreenFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLEAR_SCREEN_GUIDE_HAS_SHOW = "clearScreenGuideHasShow";
    public static final String PLAY_SPEED_GUIDE_HAS_SHOW = "playSpeedGuideHasShow";
    public static final String TAG = "AbsFullScreenFrame";
    private String immersiveScene;
    public BaseFrame mBlankFrame;
    public View mBottomBarView;
    public ViewStub mBottomNewGuide;
    private jby mInitListener;
    private boolean mIsSeekBarTouching;
    public TaoliveRoomRightGuideFrame mMoreLiveRightGuideFrame;
    public TaoliveRoomTab2RightGuideFrame mTab2MoreLiveRightGuideFrame;
    public TaoMoreLiveRoomFrame mTaoMoreLiveFrame;
    private boolean replayNeedClearScreen;
    public int mLastPagePos = 0;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    public View.OnLongClickListener mNegativeFeedbackListener = new e();
    public qoc mOnCustomerLongClickListener = new f();
    private final Handler mHandler = new Handler();

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface SpeedValue {
        public static final String PLAY_SPEED_2X = "2";
        public static final String PLAY_SPEED_NORMAL = "1";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends h17 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -573470168) {
                super.a((BaseFrame) objArr[0]);
                return null;
            } else if (hashCode == 1153865274) {
                super.b((BaseFrame) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/fullscreen/AbsFullScreenFrame$10");
            }
        }

        @Override // tb.h17, tb.dy9
        public void a(BaseFrame baseFrame) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd18a28", new Object[]{this, baseFrame});
                return;
            }
            super.a(baseFrame);
            if (AbsFullScreenFrame.this.isClearScreen) {
                d9m.y().blankFrame2Show(AbsFullScreenFrame.this.mBlankFrame, false);
            } else {
                d9m.y().blankFrame2Hide(AbsFullScreenFrame.this.mBlankFrame);
            }
        }

        @Override // tb.h17, tb.dy9
        public void b(BaseFrame baseFrame) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44c6963a", new Object[]{this, baseFrame});
                return;
            }
            super.b(baseFrame);
            AbsFullScreenFrame.this.mBlankFrame = baseFrame;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements s6t {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.s6t
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("35ce4e05", new Object[]{this});
            } else {
                AbsFullScreenFrame.access$600(AbsFullScreenFrame.this);
            }
        }

        @Override // tb.s6t
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f259de4", new Object[]{this});
            } else {
                AbsFullScreenFrame.access$700(AbsFullScreenFrame.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c extends l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AbsFullScreenFrame f8451a;

        public c(AbsFullScreenFrame absFullScreenFrame) {
            super(null);
            this.f8451a = absFullScreenFrame;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            } else if (hashCode == -1868320925) {
                super.onAnimationCancel((Animator) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/fullscreen/AbsFullScreenFrame$12");
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame.l, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                return;
            }
            super.onAnimationCancel(animator);
            this.f8451a.mViewPager.setVisibility(8);
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame.l, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            this.f8451a.mViewPager.setVisibility(8);
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
            boolean removeLinkView = AbsFullScreenFrame.this.removeLinkView();
            if (AbsFullScreenFrame.this.mViewPager.getVisibility() != 0) {
                AbsFullScreenFrame.this.mViewPager.setVisibility(0);
            }
            if (removeLinkView && AbsFullScreenFrame.this.mBlankFrame != null) {
                d9m.y().blankFrame2Hide(AbsFullScreenFrame.this.mBlankFrame);
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            sjr.g().c(FullScreenFrame.EVENT_SHOW_SCREEN_RECORD_BTN_FRAME, null, AbsFullScreenFrame.this.mFrameContext.C());
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (AbsFullScreenFrame.this.mLastPagePos == 0 && !t6t.b(AbsFullScreenFrame.CLEAR_SCREEN_GUIDE_HAS_SHOW)) {
                AbsFullScreenFrame.access$200(AbsFullScreenFrame.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h extends h17 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            if (str.hashCode() == -573470168) {
                super.a((BaseFrame) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/fullscreen/AbsFullScreenFrame$4");
        }

        @Override // tb.h17, tb.dy9
        public void a(BaseFrame baseFrame) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd18a28", new Object[]{this, baseFrame});
                return;
            }
            super.a(baseFrame);
            View view = AbsFullScreenFrame.this.mContainer;
            if (view instanceof kyd) {
                ((kyd) view).setAbsInputFrame2(baseFrame);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class i implements gu3.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f8457a;

        public i(boolean z) {
            this.f8457a = z;
        }

        @Override // tb.gu3.d
        public void b(int i, PointF pointF) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52566bcd", new Object[]{this, new Integer(i), pointF});
                return;
            }
            o3s.b("TBLVOpenShopCardComponent", "double click");
            if (!AbsFullScreenFrame.access$300(AbsFullScreenFrame.this)) {
                sjr.g().c("com.taolive.taolive.room.mediaplatform_addfavor", null, AbsFullScreenFrame.this.mFrameContext.C());
                sjr.g().c("com.taolive.taolive.room.double_click_favor_show", pointF, AbsFullScreenFrame.this.mFrameContext.C());
                if (giv.f() != null) {
                    giv.f().n(AbsFullScreenFrame.this.mFrameContext, "doublelike_CLK", new String[0]);
                }
            }
        }

        @Override // tb.gu3.d
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c5b509c", new Object[]{this});
                return;
            }
            o3s.b(AbsFullScreenFrame.TAG, "mViewPager, onSingleClickListener: mLastPagePos: " + AbsFullScreenFrame.this.mLastPagePos + " ,isNeedSingleClick: " + this.f8457a);
            if (!AbsFullScreenFrame.access$300(AbsFullScreenFrame.this) && AbsFullScreenFrame.this.mLastPagePos == 0 && this.f8457a) {
                sjr.g().c(uyg.EVENT_CLEAR_SCREEN_NEW, Boolean.valueOf(true ^ AbsFullScreenFrame.this.isClearScreen), AbsFullScreenFrame.this.observeUniqueIdentification());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class j implements gu3.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f8458a;

        public j(boolean z) {
            this.f8458a = z;
        }

        @Override // tb.gu3.d
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c5b509c", new Object[]{this});
                return;
            }
            o3s.b(AbsFullScreenFrame.TAG, "mViewPagerBackground, onSingleClickListener: isNeedSingleClick:" + this.f8458a);
            if (!AbsFullScreenFrame.access$300(AbsFullScreenFrame.this) && this.f8458a) {
                sjr.g().c(uyg.EVENT_CLEAR_SCREEN_NEW, Boolean.FALSE, AbsFullScreenFrame.this.observeUniqueIdentification());
            }
        }

        @Override // tb.gu3.d
        public void b(int i, PointF pointF) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52566bcd", new Object[]{this, new Integer(i), pointF});
            } else if (!AbsFullScreenFrame.access$300(AbsFullScreenFrame.this)) {
                String C = AbsFullScreenFrame.this.mFrameContext.C();
                sjr.g().c("com.taolive.taolive.room.mediaplatform_addfavor", null, C);
                sjr.g().c("com.taolive.taolive.room.double_click_favor_show", pointF, C);
                if (giv.f() != null) {
                    giv.f().d("doublelike_CLK", new String[0]);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class k extends jby {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ chd f8460a;

            public a(chd chdVar) {
                this.f8460a = chdVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    AbsFullScreenFrame.access$500(AbsFullScreenFrame.this, this.f8460a);
                }
            }
        }

        public k() {
        }

        public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/fullscreen/AbsFullScreenFrame$9");
        }

        @Override // tb.jby
        public void a(chd chdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e56c030", new Object[]{this, chdVar});
            } else {
                new Handler(Looper.getMainLooper()).post(new a(chdVar));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class l implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(295698765);
        }

        public l() {
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

        public /* synthetic */ l(e eVar) {
            this();
        }
    }

    static {
        t2o.a(295698750);
    }

    public AbsFullScreenFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        super(context, z, tBLiveDataModel, ux9Var);
    }

    public static /* synthetic */ boolean access$000(AbsFullScreenFrame absFullScreenFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25f6966", new Object[]{absFullScreenFrame})).booleanValue();
        }
        return absFullScreenFrame.mIsSeekBarTouching;
    }

    public static /* synthetic */ void access$100(AbsFullScreenFrame absFullScreenFrame, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("121d378b", new Object[]{absFullScreenFrame, str});
        } else {
            absFullScreenFrame.sendChangePlayRateMsg(str);
        }
    }

    public static /* synthetic */ void access$200(AbsFullScreenFrame absFullScreenFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da1eea0", new Object[]{absFullScreenFrame});
        } else {
            absFullScreenFrame.showClearScreenGuide();
        }
    }

    public static /* synthetic */ boolean access$300(AbsFullScreenFrame absFullScreenFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3433143", new Object[]{absFullScreenFrame})).booleanValue();
        }
        return absFullScreenFrame.isClickInSimpleLive();
    }

    public static /* synthetic */ void access$400(AbsFullScreenFrame absFullScreenFrame, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aabab6", new Object[]{absFullScreenFrame, new Boolean(z)});
        } else {
            absFullScreenFrame.setPlayControllerVisible(z);
        }
    }

    public static /* synthetic */ void access$500(AbsFullScreenFrame absFullScreenFrame, chd chdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5f9a2c5", new Object[]{absFullScreenFrame, chdVar});
        } else {
            absFullScreenFrame.initTab2MoreLiveRightComponentInternal(chdVar);
        }
    }

    public static /* synthetic */ void access$600(AbsFullScreenFrame absFullScreenFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a426f91c", new Object[]{absFullScreenFrame});
        } else {
            absFullScreenFrame.slideIntInternal();
        }
    }

    public static /* synthetic */ void access$700(AbsFullScreenFrame absFullScreenFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c83bbb", new Object[]{absFullScreenFrame});
        } else {
            absFullScreenFrame.slideOutInternal();
        }
    }

    private void adjustLayoutParams() {
        ATaoLiveOpenEntity A;
        czd czdVar;
        ty tyVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65833386", new Object[]{this});
        } else if (this.mFrameContext != null && !giv.c().b() && (A = this.mFrameContext.A()) != null && (czdVar = A.uiCompontent) != null && (((rbt) czdVar).b() instanceof ty) && (tyVar = (ty) ((rbt) A.uiCompontent).b()) != null) {
            JSONObject c2 = tyVar.c();
            o3s.b(TAG, "沉浸式直播间主动获取业务offset，adjustLayoutParams, bOffset = " + c2);
            handleContainerOffset(c2);
        }
    }

    private void handleCleanScreen(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80776454", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (this.isClearScreen != z) {
            this.isClearScreen = z;
            o3s.b(TAG, "handleCleanScreen: isClearScreen:" + z);
            if (z) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mViewPager, "alpha", 1.0f, 0.0f);
                ofFloat.setDuration(250L);
                ofFloat.start();
                ofFloat.addListener(new c(this));
                this.mEnterClearScreenTime = SystemClock.elapsedRealtime();
                trackEnterClearScreen();
                addLinkView();
                if (this.mBlankFrame != null) {
                    d9m.y().blankFrame2Show(this.mBlankFrame, z2);
                    return;
                }
                return;
            }
            if (nh4.w0(this.mLiveDataModel) && (this.mBlankFrame instanceof BlankFrame2)) {
                d9m.y().blankFrame2HidePlayIcon(this.mBlankFrame);
            }
            this.mViewPager.setVisibility(0);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.mViewPager, "alpha", 0.0f, 1.0f);
            ofFloat2.setDuration(250L);
            ofFloat2.start();
            ofFloat2.addListener(new d());
            trackLeaveClearScreen();
        }
    }

    private void handleTab2MoreLiveShow(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63152f06", new Object[]{this, obj});
        } else if (this.mTab2MoreLiveRightGuideFrame != null && (obj instanceof Map)) {
            Object obj2 = ((Map) obj).get("isShow");
            if (obj2 instanceof Boolean) {
                this.mTab2MoreLiveRightGuideFrame.showMoreLiveFrame(((Boolean) obj2).booleanValue());
            }
        }
    }

    private void initClearScreenOld() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12226905", new Object[]{this});
        } else if (up6.B0(this.mFrameContext)) {
            boolean n0 = up6.n0(this.mFrameContext);
            this.mViewPager.setOnClearClickListener(new i(n0), this.mLandscape);
            View view = this.mViewPagerBackground;
            if (view instanceof ClickableView) {
                ((ClickableView) view).setOnMultiClickListener(new j(n0));
            }
        }
    }

    private void initGLErrorTrack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7325bc89", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("track_type", "initError");
        hashMap.put("schedule", "0");
        hashMap.put("glCode", str);
        if (giv.f() != null) {
            giv.f().m(this.mFrameContext, "GLBindDataTime", hashMap);
        }
    }

    private void initRealMoreInitListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e09f91ce", new Object[]{this});
            return;
        }
        if (this.mInitListener == null) {
            this.mInitListener = new k();
        }
        tbt.c().k(this.mInitListener);
    }

    private void initTab2MoreLiveRightComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59976c56", new Object[]{this});
        } else if (qvs.I() && !this.mFrameContext.c()) {
            chd f2 = tbt.c().f();
            if (f2 != null) {
                initTab2MoreLiveRightComponentInternal(f2);
            } else {
                initRealMoreInitListener();
            }
        }
    }

    private void initViewPagerOld() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18b90660", new Object[]{this});
        } else if (this.mLandscape || up6.l0(this.mFrameContext) || this.mAdView == null) {
            super.initViewPager();
        } else {
            initAdapters();
            PassEventViewPager passEventViewPager = (PassEventViewPager) this.mContainer.findViewById(R.id.taolive_viewpager);
            this.mViewPager = passEventViewPager;
            if (passEventViewPager != null) {
                passEventViewPager.setFrameContext(this.mFrameContext);
            }
            this.mViewPagerBackground = this.mContainer.findViewById(R.id.taolive_viewpager_background);
            this.mViewPager.setAdapter(this.simpleAdapter);
            this.mViewPager.setCurrentItem(0);
            this.simpleAdapter.notifyDataSetChanged();
            initClearScreen();
            this.mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i2)});
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrolled(int i2, float f2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i2), new Float(f2), new Integer(i3)});
                        return;
                    }
                    o3s.b(AbsFullScreenFrame.TAG, "setCanShowPopFlag,onPageScrolled,position: " + i2 + " ,positionOffset: " + f2 + " ,positionOffsetPixels: " + i3);
                    AbsFullScreenFrame.this.dismissNegativeFeedback();
                    int i4 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                    if (i4 > 0) {
                        AbsFullScreenFrame.this.hideLiveLinkView();
                    } else if (i2 == 0 && i4 == 0) {
                        AbsFullScreenFrame.this.showLiveLinkView();
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageSelected(int i2) {
                    boolean z = true;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i2)});
                        return;
                    }
                    if (i2 == 0) {
                        TaoMoreLiveRoomFrame taoMoreLiveRoomFrame = AbsFullScreenFrame.this.mTaoMoreLiveFrame;
                        if (taoMoreLiveRoomFrame != null) {
                            taoMoreLiveRoomFrame.pageShow(false);
                            Context context = AbsFullScreenFrame.this.mContext;
                            if (context instanceof lzq) {
                                ((lzq) context).f2(true);
                            }
                        }
                    } else if (i2 == 1) {
                        TaoMoreLiveRoomFrame taoMoreLiveRoomFrame2 = AbsFullScreenFrame.this.mTaoMoreLiveFrame;
                        if (taoMoreLiveRoomFrame2 != null) {
                            taoMoreLiveRoomFrame2.pageShow(true);
                            TaoliveRoomRightGuideFrame taoliveRoomRightGuideFrame = AbsFullScreenFrame.this.mMoreLiveRightGuideFrame;
                            if (taoliveRoomRightGuideFrame != null) {
                                taoliveRoomRightGuideFrame.showMoreLiveFrame();
                            }
                            Context context2 = AbsFullScreenFrame.this.mContext;
                            if (context2 instanceof lzq) {
                                ((lzq) context2).f2(false);
                            }
                        }
                        AbsFullScreenFrame.this.showLiveLinkView();
                    }
                    AbsFullScreenFrame.this.mLastPagePos = i2;
                    if (i2 == 0) {
                        sjr.g().c(FullScreenFrame.EVENT_MEDIAPLATFORM_SCREEN_FLIPPED, Boolean.FALSE, AbsFullScreenFrame.this.observeUniqueIdentification());
                    }
                    AbsFullScreenFrame absFullScreenFrame = AbsFullScreenFrame.this;
                    if (i2 != 0) {
                        z = false;
                    }
                    AbsFullScreenFrame.access$400(absFullScreenFrame, z);
                }
            });
            this.mViewPager.setPageTransformer(true, new ViewPager.PageTransformer() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // androidx.viewpager.widget.ViewPager.PageTransformer
                public void transformPage(View view, float f2) {
                    View view2;
                    View view3;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7b6a8f50", new Object[]{this, view, new Float(f2)});
                        return;
                    }
                    AbsFullScreenFrame absFullScreenFrame = AbsFullScreenFrame.this;
                    int i2 = absFullScreenFrame.mLastPagePos;
                    if (i2 == 1) {
                        if (f2 > 0.0f && (view3 = absFullScreenFrame.mViewPagerBackground) != null) {
                            view3.setAlpha(1.0f - f2);
                        }
                    } else if (i2 == 0 && f2 > 0.0f && (view2 = absFullScreenFrame.mViewPagerBackground) != null) {
                        view2.setAlpha(1.0f - f2);
                    }
                }
            });
        }
    }

    public static /* synthetic */ Object ipc$super(AbsFullScreenFrame absFullScreenFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1857981988:
                super.onDidAppear();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -1014400728:
                super.onEvent((String) objArr[0], objArr[1]);
                return null;
            case -597982134:
                super.clearComponents();
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 1998745205:
                super.initViewPager();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/fullscreen/AbsFullScreenFrame");
        }
    }

    private boolean isClickInSimpleLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4581126c", new Object[]{this})).booleanValue();
        }
        if (!or.a(this.mFrameContext, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive)) {
            return false;
        }
        this.mFrameContext.A().accessListener(AccessListenerEnum.onClickCleanScreen, Boolean.FALSE);
        return true;
    }

    private boolean isLiveMoreEntranceHidden() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b15b196", new Object[]{this})).booleanValue();
        }
        return ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_RIGHT_SIDE, ComponentGroupConfig.RIGHT_SIDE_LIVE_MORE_ENTRANCE, this.mFrameContext);
    }

    private void setCanShowPopFlag(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fe7d5d5", new Object[]{this, obj});
        } else if ((obj instanceof Boolean) && this.mFrameContext != null) {
            Boolean bool = (Boolean) obj;
            boolean booleanValue = bool.booleanValue();
            o3s.b(TAG, "setCanShowPopFlag，mFrameContext设置canShow标记 canShow= " + booleanValue);
            this.mFrameContext.R(bool.booleanValue());
        }
    }

    private void setPlayControllerVisible(boolean z) {
        View view;
        FrameLayout frameLayout;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4e04e0d", new Object[]{this, new Boolean(z)});
        } else if (nh4.w0(this.mLiveDataModel) && (view = this.mContainer) != null && (frameLayout = (FrameLayout) view.findViewById(R.id.taolive_replay_back_playcontroller_layer)) != null) {
            if (!z) {
                i2 = 8;
            }
            frameLayout.setVisibility(i2);
        }
    }

    private void slideIntInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7836462", new Object[]{this});
            return;
        }
        PassEventViewPager passEventViewPager = this.mViewPager;
        if (passEventViewPager != null && passEventViewPager.getChildCount() > 0 && this.mViewPager.getCurrentItem() == 0) {
            this.mViewPager.setCurrentItem(1);
        }
    }

    private void slideOutInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffb86541", new Object[]{this});
            return;
        }
        PassEventViewPager passEventViewPager = this.mViewPager;
        if (passEventViewPager != null && passEventViewPager.getAdapter() != null && this.mViewPager.getAdapter().getCount() == 2 && 1 == this.mViewPager.getCurrentItem()) {
            this.mViewPager.setCurrentItem(0, true);
        }
    }

    private void updatePageProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14a94ff3", new Object[]{this, map});
        } else if (giv.f() != null) {
            giv.f().q(this.mFrameContext, this.mContext, map);
        }
    }

    public void addLinkView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b74207", new Object[]{this});
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, tb.s3c
    public abstract /* synthetic */ String bizCode();

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void clearComponents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc5b844a", new Object[]{this});
            return;
        }
        super.clearComponents();
        this.mMoreLiveRightGuideFrame = null;
        this.mTaoMoreLiveFrame = null;
    }

    public boolean configCleanScreenEntranceShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db401f71", new Object[]{this})).booleanValue();
        }
        return true ^ ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_NON_FIRST_SCREEN, ComponentGroupConfig.NON_FIRST_SCREEN_CLEAN_SCREEN, this.mFrameContext);
    }

    public void dismissNegativeFeedback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c11c0b", new Object[]{this});
        }
    }

    public ViewStub getH5RootView() {
        ATaoLiveOpenEntity A;
        czd czdVar;
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewStub) ipChange.ipc$dispatch("89d93105", new Object[]{this});
        }
        ux9 ux9Var = this.mFrameContext;
        if (!(ux9Var == null || ux9Var.A() == null || (A = this.mFrameContext.A()) == null || (czdVar = A.uiCompontent) == null || ((rbt) czdVar).b() == null)) {
            ViewStub viewStub = new ViewStub(this.mContext);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            View m = ((rbt) A.uiCompontent).b().m();
            if (!(m == null || (frameLayout = (FrameLayout) m.findViewById(rgd.b().c(IRRoomProxy.R_ID_TAOLIVE_OPEN_H_5_ROOT_VIEW_FRAME))) == null)) {
                frameLayout.removeAllViews();
                frameLayout.addView(viewStub, layoutParams);
                return viewStub;
            }
        }
        return (ViewStub) this.mFrontView.findViewById(R.id.taolive_h5_container_fullscreen_stub);
    }

    public void handleContainerOffset(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("101a44cf", new Object[]{this, obj});
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getComponentView().getLayoutParams();
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            int intValue = jSONObject.getIntValue("leftOffset");
            int intValue2 = jSONObject.getIntValue("topOffset");
            int intValue3 = jSONObject.getIntValue("rightOffset");
            int intValue4 = jSONObject.getIntValue("bottomOffset");
            o3s.b(TAG, "沉浸式handleContainerOffset, leftOffset = " + intValue + ", topOffset = " + intValue2 + ", rightOffset = " + intValue3 + ", bottomOffset = " + intValue4);
            marginLayoutParams.bottomMargin = intValue4;
            marginLayoutParams.topMargin = intValue2;
            marginLayoutParams.leftMargin = intValue;
            marginLayoutParams.rightMargin = intValue3;
        }
        getComponentView().setLayoutParams(marginLayoutParams);
    }

    public void hideLiveLinkView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae9dbf34", new Object[]{this});
        }
    }

    public void initAdapters() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d77cabb", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.mFrontView);
        arrayList.add(this.mAdView);
        this.simpleAdapter = new FullScreenFrame.SimpleAdapter(arrayList);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initBottomBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6578b3f", new Object[]{this});
            return;
        }
        this.mBottomBarView = this.mFrontView.findViewById(R.id.taolive_bottom_bar);
        this.mFrameContext.i().g(this, "tl-bottom-bar", (ViewStub) this.mFrontView.findViewById(R.id.taolive_bottombar_stub2));
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initChat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb8650f", new Object[]{this});
        } else if (!ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_LEFT_BOTTOM, ComponentGroupConfig.LEFT_BOTTOM_COMMENTS, this.mFrameContext)) {
            this.mFrameContext.i().g(this, "tl-chat", (ViewStub) this.mFrontView.findViewById(R.id.taolive_msg_stub));
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initCleanView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f992ae5", new Object[]{this});
        } else if (configCleanScreenEntranceShow()) {
            this.mFrameContext.i().e(this, "tl-clear-screen", (ViewStub) this.mContainer.findViewById(R.id.taolive_blank_frame_stub), new a());
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initClearScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b0b95f0", new Object[]{this});
            return;
        }
        if (configCleanScreenEntranceShow()) {
            o3s.b(TAG, "initClearScreen");
            initClearScreenOld();
        }
        if (nh4.u()) {
            this.mainHandler.postDelayed(new g(), nh4.e() * 1000);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initDoubleClickFavView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7320960", new Object[]{this});
        } else if (!ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_NON_FIRST_SCREEN, ComponentGroupConfig.NON_FIRST_SCREEN_DOUBLE_LIKE, this.mFrameContext)) {
            this.mFrameContext.i().g(this, "tl-double-click", (ViewStub) this.mContainer.findViewById(R.id.taolive_room_double_click_fav));
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initFavor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f214e095", new Object[]{this});
        } else {
            this.mFrameContext.i().g(this, "tl-favor-anim", (ViewStub) this.mFrontView.findViewById(R.id.taolive_favor_stub3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void initGoodListFrame() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame.initGoodListFrame():void");
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initH5Container() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac0518b", new Object[]{this});
        } else if (rgd.b().a() != null && rgd.b().a().liveInteractiveManagerNotNull(this.mLiveDataModel)) {
            this.mFrameContext.i().c(this, "dynamic_h5_sdk", getH5RootView());
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initInput() {
        ATaoLiveOpenEntity A;
        czd czdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2455421", new Object[]{this});
        } else if (!vwl.e().c()) {
            View view = this.mFrontView;
            int i2 = R.id.taolive_input_stub;
            ViewStub viewStub = (ViewStub) view.findViewById(i2);
            ux9 ux9Var = this.mFrameContext;
            if (!(ux9Var == null || (A = ux9Var.A()) == null || (czdVar = A.uiCompontent) == null || ((rbt) czdVar).b() == null)) {
                View m = ((rbt) A.uiCompontent).b().m();
                if (m instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.mContext).inflate(R.layout.taolive_open_liveroom_container_flexalocal, (ViewGroup) null);
                    if (viewGroup != null) {
                        viewStub = (ViewStub) viewGroup.findViewById(i2);
                    }
                    ((ViewGroup) m).addView(viewGroup);
                }
            }
            initInputFrame(viewStub);
        }
    }

    public void initInputFrame(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ab4430a", new Object[]{this, viewStub});
            return;
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var != null) {
            ux9Var.i().e(this, "tl-input", viewStub, new h());
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initInteractBizCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("943d1209", new Object[]{this});
        } else {
            addComponent(new InteractBizCenterFrame(this.mContext, this.mFrameContext));
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initInteractiveRightComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("496cd19a", new Object[]{this});
        } else if (!ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_RIGHT_SIDE, ComponentGroupConfig.RIGHT_SIDE_INTERACTION_ENTRANCE, this.mFrameContext) && rgd.b().a() != null && rgd.b().a().liveInteractiveManagerNotNull(this.mLiveDataModel)) {
            this.mFrameContext.i().c(this, "tl-interactive-entrance", this.mFrontView.findViewById(R.id.taolive_interactive_right_frame));
        }
    }

    public void initLiveAvatarNewCardFrame() {
        BaseFrame liveAvatarNewFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("203e9539", new Object[]{this});
        } else if (!vwl.e().c() && !ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_NON_FIRST_SCREEN, ComponentGroupConfig.NON_FIRST_SCREEN_LIVE_ANCHOR_PAGE, this.mFrameContext) && (liveAvatarNewFrame = d9m.y().getLiveAvatarNewFrame(this.mContext, this.mFrameContext)) != null) {
            liveAvatarNewFrame.createView((ViewStub) this.mFrontView.findViewById(R.id.taolive_live_avatar_card_container));
            addComponent(liveAvatarNewFrame);
        }
    }

    public void initMoreLive(chd chdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31ff564a", new Object[]{this, chdVar});
            return;
        }
        TaoMoreLiveRoomFrame c2 = chdVar.c(this.mContext, this.mLandscape, this.mLiveDataModel, this.mFrameContext);
        this.mTaoMoreLiveFrame = c2;
        this.mAdView = c2.getContainerView();
        addComponent(this.mTaoMoreLiveFrame);
    }

    public void initMoreLiveRightComponent() {
        chd f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("636e7739", new Object[]{this});
        } else if (qvs.I() && !this.mLandscape && !this.mFrameContext.c() && (f2 = tbt.c().f()) != null && !isLiveMoreEntranceHidden()) {
            TaoliveRoomRightGuideFrame b2 = f2.b(this.mContext, false, this.mLiveDataModel, this.mFrameContext);
            this.mMoreLiveRightGuideFrame = b2;
            b2.onCreateView((ViewStub) this.mFrontView.findViewById(R.id.taolive_more_live_guide_stub));
            addComponent(this.mMoreLiveRightGuideFrame);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initNewBottomGuide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93123f08", new Object[]{this});
        } else if (!vwl.e().c()) {
            View view = this.mFrontView;
            int i2 = R.id.taolive_bottom_guide_stub2;
            this.mBottomNewGuide = (ViewStub) view.findViewById(i2);
            if (!liv.j(this.mLiveDetailData) && !this.mLandscape) {
                BottomSlideNewGuideFrame bottomSlideNewGuideFrame = new BottomSlideNewGuideFrame(this.mContext, false, this.mLiveDataModel, this.mFrameContext);
                bottomSlideNewGuideFrame.createView((ViewStub) this.mFrontView.findViewById(i2));
                addComponent(bottomSlideNewGuideFrame);
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initRoomWatermark(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff02c2d", new Object[]{this, videoInfo});
        } else if (!vwl.e().c()) {
            try {
                if (!ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_RIGHT_SIDE, ComponentGroupConfig.RIGHT_SIDE_LIVE_WATER_MARK, this.mFrameContext)) {
                    this.mFrameContext.i().g(this, "tl-watermark", (ViewStub) this.mFrontView.findViewById(R.id.taolive_room_watermark));
                }
            } catch (Exception e2) {
                o3s.b(TAG, "initRoomWatermark exp :" + e2.getMessage());
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initTopBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3488935", new Object[]{this});
            return;
        }
        if (liv.j(this.mLiveDetailData) && !this.mLandscape) {
            TaoLiveBannerFrame taoLiveBannerFrame = new TaoLiveBannerFrame(this.mContext, this.mFrameContext);
            taoLiveBannerFrame.createView((ViewStub) this.mFrontView.findViewById(R.id.taolive_taolive_banner_stub));
            addComponent(taoLiveBannerFrame);
        }
        if (!ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_TOP, ComponentGroupConfig.TOP_ACCOUNT_INFO, this.mFrameContext)) {
            this.mFrameContext.i().g(this, "tl-top-bar", (ViewStub) this.mFrontView.findViewById(R.id.taolive_topbar_stub2));
        } else if (TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.name().equals(this.mFrameContext.P.bizCode) || TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.name().equals(this.mFrameContext.P.bizCode)) {
            TopFakeBarFrame topFakeBarFrame = new TopFakeBarFrame(this.mContext, this.mFrameContext);
            View view = this.mFrontView;
            int i2 = R.id.taolive_topbar_stub2;
            topFakeBarFrame.createView((ViewStub) view.findViewById(i2));
            addComponent(topFakeBarFrame);
            this.mFrameContext.i().g(this, "tl-top-bar", (ViewStub) this.mFrontView.findViewById(i2));
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initViewPager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77226e75", new Object[]{this});
            return;
        }
        initViewPagerOld();
        if (!nh4.k0(this.mLiveDataModel)) {
            this.mViewPager.setOnLongClickListener(this.mNegativeFeedbackListener);
            ViewProxy.setOnLongClickListener(this.mViewPagerBackground, this.mNegativeFeedbackListener);
            return;
        }
        this.mViewPager.setOnViewPagerLongClickListener(this.mOnCustomerLongClickListener);
        View view = this.mViewPagerBackground;
        if (view instanceof ClickableView) {
            ((ClickableView) view).setOnLongClickListener(this.mOnCustomerLongClickListener);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, tb.s3c
    public abstract /* synthetic */ String observeUniqueIdentification();

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        dismissNegativeFeedback();
        this.mHandler.removeCallbacksAndMessages(null);
        this.mainHandler.removeCallbacksAndMessages(null);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        adjustLayoutParams();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        super.onDidDisappear();
        this.mFrameContext.h().c(uyg.EVENT_CLEAR_SCREEN_NEW, Boolean.FALSE, observeUniqueIdentification());
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        this.mainHandler.removeCallbacksAndMessages(null);
    }

    public boolean removeLinkView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28e9056e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void showLiveLinkView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f31de6ef", new Object[]{this});
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements qoc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.qoc
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70b73f2e", new Object[]{this});
                return;
            }
            float t = AbsFullScreenFrame.this.mFrameContext.x().t();
            o3s.b(AbsFullScreenFrame.TAG, "长按事件取消，恢复正常速度 或者 之前记录的速度播放，playRate = " + t);
            AbsFullScreenFrame.access$100(AbsFullScreenFrame.this, String.valueOf(t));
        }

        @Override // tb.qoc
        public boolean a(View view, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5c99319a", new Object[]{this, view, new Boolean(z)})).booleanValue();
            }
            if (AbsFullScreenFrame.access$000(AbsFullScreenFrame.this)) {
                o3s.b(AbsFullScreenFrame.TAG, "长按事件阻断，进度条正在拖动中");
                return false;
            }
            boolean isPlaying = AbsFullScreenFrame.this.mFrameContext.x().isPlaying();
            if (!z || !isPlaying) {
                o3s.b(AbsFullScreenFrame.TAG, "长按事件触发负反馈");
                sjr.g().c(FullScreenFrame.EVENT_SHOW_SCREEN_RECORD_BTN_FRAME, null, AbsFullScreenFrame.this.mFrameContext.C());
            } else {
                o3s.b(AbsFullScreenFrame.TAG, "长按事件触发倍速播放中");
                if (giv.f() != null) {
                    giv.f().m(AbsFullScreenFrame.this.mFrameContext, "fastforward", new HashMap());
                }
                AbsFullScreenFrame.access$100(AbsFullScreenFrame.this, "2");
            }
            return true;
        }
    }

    private boolean blackListIntercept() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74813210", new Object[]{this})).booleanValue();
        }
        String b2 = v2s.o().p().b("tblive", "liveMoreBlackList", "TaoLiveOpenBizCode_Shop2F");
        if (yqq.e(b2)) {
            return false;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(b2.split(",")));
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var == null || ux9Var.A() == null || this.mFrameContext.A().bizCode == null) {
            return false;
        }
        return arrayList.contains(this.mFrameContext.A().bizCode);
    }

    private void initTab2MoreLiveRightComponentInternal(chd chdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("549067cf", new Object[]{this, chdVar});
        } else if (chdVar != null) {
            TaoliveRoomTab2RightGuideFrame a2 = chdVar.a(this.mContext, false, this.mLiveDataModel, this.mFrameContext);
            this.mTab2MoreLiveRightGuideFrame = a2;
            a2.onCreateView((ViewStub) this.mFrontView.findViewById(R.id.taolive_more_live_guide_stub));
            v7t.d(TAG, "更多直播，增加tab2更多直播入口组件");
            addComponent(this.mTab2MoreLiveRightGuideFrame);
        }
    }

    private void sendChangePlayRateMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410bcd06", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", str);
        hashMap.put("needRecord", String.valueOf(false));
        sjr.g().c(uyg.EVENT_PLAY_RATE_CHANGED, hashMap, this.mFrameContext.C());
    }

    private void showClearScreenGuide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7c8a707", new Object[]{this});
            return;
        }
        Context context = this.mContext;
        if ((context instanceof Activity) && !((Activity) context).isFinishing() && !((Activity) this.mContext).isDestroyed() && ((Activity) this.mContext).getWindow().isActive()) {
            try {
                new ot3(this.mContext).show();
                u6t.e(CLEAR_SCREEN_GUIDE_HAS_SHOW, true);
            } catch (Exception e2) {
                o3s.b(TAG, "showClearScreenGuide e:" + e2.getMessage());
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        super.onDidAppear();
        this.isClearScreen = false;
        sjr.g().d(uyg.EVENT_FULL_SCREEN_APPEAR);
        this.mViewPager.setVisibility(0);
        if (this.mTaoMoreLiveFrame != null) {
            tbt.c().j(new b());
        }
    }

    private boolean isTab2LiveMoreEntranceShow() {
        ATaoLiveOpenEntity A;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48faad06", new Object[]{this})).booleanValue();
        }
        if (this.mFrameContext == null || giv.c().b() || (A = this.mFrameContext.A()) == null || A.eventCompontent == null) {
            return false;
        }
        boolean d2 = ((ibt) A.abilityCompontent).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedMoreLive);
        boolean a2 = (A.eventCompontent.a() == null || A.eventCompontent.a().a() == null) ? false : A.eventCompontent.a().a().a();
        boolean componentEntranceHidden = ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_RIGHT_SIDE, ComponentGroupConfig.RIGHT_SIDE_TAB2_LIVE_MORE_ENTRANCE, this.mFrameContext);
        StringBuilder sb = new StringBuilder("更多直播间业务开关 = ");
        sb.append(a2);
        sb.append(" show = ");
        sb.append(!componentEntranceHidden);
        sb.append(" abilitySwitch = ");
        sb.append(d2);
        o3s.b(TAG, sb.toString());
        return (a2 || d2) && !componentEntranceHidden;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initAdView() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc32af1f", new Object[]{this});
        } else if (qvs.J() && !this.mFrameContext.c() && !vwl.e().c()) {
            boolean z2 = (this.mContext.getResources().getConfiguration().screenLayout & 15) >= 3;
            boolean l0 = up6.l0(this.mFrameContext);
            if (!z2 && !l0 && !isLiveMoreEntranceHidden() && !blackListIntercept()) {
                z = true;
            }
            boolean isTab2LiveMoreEntranceShow = isTab2LiveMoreEntranceShow();
            if (z) {
                HashMap hashMap = new HashMap();
                try {
                    chd f2 = tbt.c().f();
                    if (f2 != null) {
                        initMoreLive(f2);
                        initMoreLiveRightComponent();
                        hashMap.put("taoliveHomeBundleState", "installed");
                    } else {
                        hashMap.put("taoliveHomeBundleState", "installing");
                    }
                    updatePageProperties(hashMap);
                } catch (Exception unused) {
                    updatePageProperties(hashMap);
                }
            } else if (isTab2LiveMoreEntranceShow) {
                initTab2MoreLiveRightComponent();
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, tb.s3c
    public void onEvent(String str, Object obj) {
        String str2;
        ux9 ux9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        super.onEvent(str, obj);
        if ("com.taobao.taolive.room.ubee_for_morelive".equals(str)) {
            TaoliveRoomRightGuideFrame taoliveRoomRightGuideFrame = this.mMoreLiveRightGuideFrame;
            if (taoliveRoomRightGuideFrame != null) {
                taoliveRoomRightGuideFrame.updateEntryData();
                return;
            }
            return;
        }
        String str3 = "com.taobao.taolive.room.recommend.good.card.did.disappear";
        if (uyg.EVENT_CLEAR_SCREEN_NEW.equals(str)) {
            if (obj instanceof Boolean) {
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() && (ux9Var = this.mFrameContext) != null && ux9Var.j() != null && this.mFrameContext.j().d()) {
                    sjr.g().c(uyg.d, "assembly", observeUniqueIdentification());
                }
                if (nh4.w0(this.mLiveDataModel)) {
                    sjr g2 = sjr.g();
                    if (bool.booleanValue()) {
                        str3 = "com.taobao.taolive.room.recommend.good.card.did.appear";
                    }
                    g2.c(str3, null, null);
                }
                handleCleanScreen(bool.booleanValue(), false);
                ux9 ux9Var2 = this.mFrameContext;
                if (ux9Var2 != null && ux9Var2.A() != null) {
                    this.mFrameContext.A().accessListener(AccessListenerEnum.onClickCleanScreen, bool);
                }
            }
        } else if (TextUtils.equals(str, FullScreenFrame.EVENT_TAOLIVE_ROOM_CLEAR_SCREEN)) {
            TaoliveRoomRightGuideFrame taoliveRoomRightGuideFrame2 = this.mMoreLiveRightGuideFrame;
            if (taoliveRoomRightGuideFrame2 != null) {
                taoliveRoomRightGuideFrame2.updateClearScreenStatus(((Boolean) obj).booleanValue());
            }
            ux9 ux9Var3 = this.mFrameContext;
            if (ux9Var3 != null && ux9Var3.A() != null) {
                this.mFrameContext.A().accessListener(AccessListenerEnum.onClickCleanScreen, Boolean.FALSE);
            }
        } else if (TextUtils.equals(str, uyg.EVENT_TAB2_MORE_LIVE_RIGHT_GUIDE_FRAME_IS_SHOW)) {
            handleTab2MoreLiveShow(obj);
        } else if (TextUtils.equals(str, uyg.EVENT_CAN_SHOW_POP_LAYER)) {
            o3s.b(TAG, "setCanShowPopFlag，收到onEvent处理canShowPopFlag的消息");
            setCanShowPopFlag(obj);
        } else if (uyg.EVENT_CLEAR_SCREEN_IMMERSIVE.equals(str)) {
            if (!giv.c().b() && nh4.Y() && this.immersiveScene == null && (obj instanceof String)) {
                this.immersiveScene = (String) obj;
                handleCleanScreen(true, false);
                o3s.b(TAG, "Clear Screen ImmersiveScene, immersiveScene = " + obj);
            }
        } else if (uyg.EVENT_CLEAR_SCREEN_IMMERSIVE_RECOVER.equals(str)) {
            if (!giv.c().b() && (str2 = this.immersiveScene) != null && (obj instanceof String) && str2.equals(obj)) {
                this.immersiveScene = null;
                handleCleanScreen(false, false);
                o3s.b(TAG, "Clear Screen Recover ImmersiveScene, immersiveScene = " + obj);
            }
        } else if (uyg.EVENT_CLEAR_SCREEN_AND_HIDE_GOODS_ICON.equals(str)) {
            if (obj instanceof Boolean) {
                if (!this.isClearScreen && ((Boolean) obj).booleanValue()) {
                    this.replayNeedClearScreen = true;
                }
                if ((this.replayNeedClearScreen && this.isClearScreen && !((Boolean) obj).booleanValue()) || (!this.isClearScreen && ((Boolean) obj).booleanValue())) {
                    Boolean bool2 = (Boolean) obj;
                    if (bool2.booleanValue()) {
                        ux9 ux9Var4 = this.mFrameContext;
                        if (!(ux9Var4 == null || ux9Var4.j() == null || !this.mFrameContext.j().d())) {
                            sjr.g().c(uyg.d, "assembly", observeUniqueIdentification());
                        }
                    } else {
                        this.replayNeedClearScreen = false;
                    }
                    o3s.b(TAG, "Clear Screen and hide goods icon, need clear: " + obj);
                    handleCleanScreen(bool2.booleanValue(), true);
                    sjr g3 = sjr.g();
                    if (bool2.booleanValue()) {
                        str3 = "com.taobao.taolive.room.recommend.good.card.did.appear";
                    }
                    g3.c(str3, null, null);
                }
            }
        } else if (TextUtils.equals(str, uyg.EVENT_SEEK_BAR_TOUCH) && (obj instanceof Boolean)) {
            this.mIsSeekBarTouching = ((Boolean) obj).booleanValue();
        }
    }
}
