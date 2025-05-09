package com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.utils.AccessibilityUtils;
import com.taobao.android.live.plugin.proxy.bottom.IBottomProxy;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.ShareGoodsListMessage;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.abc;
import tb.cpr;
import tb.cwp;
import tb.cy0;
import tb.cz0;
import tb.dga;
import tb.fkx;
import tb.fy0;
import tb.giv;
import tb.nh4;
import tb.o3s;
import tb.qvs;
import tb.s3c;
import tb.s8d;
import tb.sjr;
import tb.t2o;
import tb.t6t;
import tb.to8;
import tb.uo8;
import tb.uwn;
import tb.ux9;
import tb.uyg;
import tb.vvs;
import tb.xfa;
import tb.yga;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GoodsIconFrame extends BaseFrame implements s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EVENT_MEDIAPLATFORM_SHOW_GOODSPACKAGE = "com.taolive.taolive.room.mediaplatform_show_goodspackage";
    private static String ICON_ANIMATION_URLS;
    private static String STATIC_IMAGE_URL;
    public static final String TAG = GoodsIconFrame.class.getSimpleName();
    private TUrlImageView fakeGoodImage;
    private TimerTask imageAnimTask;
    private Timer imageAnimTimer;
    private boolean isAnimating;
    private cy0 lastAnimDrawable;
    private String lastAnimType;
    private TUrlImageView mAuctionImg;
    private FrameLayout mAuctionLayout;
    private TextView mAuctionNum;
    private abc mGoodsBtnGuide;
    private FrameLayout mGuideRoot;
    private boolean isFirstShowcaseShow = true;
    private final cpr.b mMessageListener = new b();
    private final AtomicBoolean mIsDispatchOnDraw = new AtomicBoolean(false);
    private final ViewTreeObserver.OnDrawListener mOnDrawListener = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f8365a;
        public final /* synthetic */ int b;

        public a(View view, int i) {
            this.f8365a = view;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f8365a.setVisibility(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements cpr.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.gtc
        public void onMessageReceived(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
            } else if (i == 1009) {
                ShareGoodsListMessage shareGoodsListMessage = (ShareGoodsListMessage) obj;
                if (shareGoodsListMessage != null) {
                    GoodsIconFrame.access$000(GoodsIconFrame.this, shareGoodsListMessage.totalCount);
                }
            } else if (i == 1039) {
                GoodsIconFrame goodsIconFrame = GoodsIconFrame.this;
                VideoInfo videoInfo = goodsIconFrame.mLiveDataModel.mVideoInfo;
                if (videoInfo != null && videoInfo.roomType == 13) {
                    GoodsIconFrame.access$000(goodsIconFrame, 0);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements ViewTreeObserver.OnDrawListener {
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
                    GoodsIconFrame.access$200(GoodsIconFrame.this);
                }
            }
        }

        public c() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73be92ca", new Object[]{this});
            } else if (GoodsIconFrame.access$100(GoodsIconFrame.this).compareAndSet(false, true)) {
                sjr.g().c(uyg.EVENT_LIVE_UI_RENDER_FINISH, GoodsIconFrame.this.getComponentName(), GoodsIconFrame.this.observeUniqueIdentification());
                GoodsIconFrame.this.mContainer.post(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ux9 ux9Var = GoodsIconFrame.this.mFrameContext;
            if (!(ux9Var == null || ux9Var.j() == null || !GoodsIconFrame.this.mFrameContext.j().d())) {
                GoodsIconFrame.this.mFrameContext.h().c(uyg.e, "assembly", GoodsIconFrame.this.observeUniqueIdentification());
            }
            if (giv.f() != null) {
                giv.f().n(GoodsIconFrame.this.mFrameContext, "Click_Goodslist", new String[0]);
            }
            if (GoodsIconFrame.access$300(GoodsIconFrame.this)) {
                t6t.h("last_click_goods_icon_time", System.currentTimeMillis());
                GoodsIconFrame.access$400(GoodsIconFrame.this);
            }
            uo8.f(GoodsIconFrame.this.mFrameContext, to8.GOODS_IN, 0L);
            GoodsIconFrame.access$500(GoodsIconFrame.this);
            GoodsIconFrame.access$600(GoodsIconFrame.this).dismiss();
            GoodsIconFrame.this.mFrameContext.h().c("com.taobao.taolive.bootom.goods.icon.click", null, GoodsIconFrame.this.observeUniqueIdentification());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e extends MessageTypeFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(GoodsIconFrame goodsIconFrame) {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/bottombar/GoodsIconFrame$4");
        }

        @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
        public boolean filter(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i == 1009 || i == 1039) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/bottombar/GoodsIconFrame$5");
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                GoodsIconFrame.access$700(GoodsIconFrame.this, "normal");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8371a;

        public g(String str) {
            this.f8371a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (GoodsIconFrame.access$800(GoodsIconFrame.this) != null) {
                String str = GoodsIconFrame.TAG;
                o3s.b(str, "startImageAnim | same drawable, type=" + this.f8371a + "lastAnimDrawable=" + GoodsIconFrame.access$800(GoodsIconFrame.this));
                GoodsIconFrame.access$800(GoodsIconFrame.this).C();
                GoodsIconFrame.access$900(GoodsIconFrame.this, "normal");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8372a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements fy0 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(h hVar) {
            }

            @Override // tb.fy0
            public boolean onLoopCompleted(int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("a7565d93", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
                }
                String str = GoodsIconFrame.TAG;
                o3s.b(str, "loop | completedLoop=" + i + ", totalLoop=" + i2);
                return true;
            }
        }

        public h(String str) {
            this.f8372a = str;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            String str = GoodsIconFrame.TAG;
            o3s.b(str, "startImageAnim | different drawable, type=" + this.f8372a + "lastAnimDrawable=" + GoodsIconFrame.access$800(GoodsIconFrame.this));
            GoodsIconFrame goodsIconFrame = GoodsIconFrame.this;
            GoodsIconFrame.access$1100(goodsIconFrame, GoodsIconFrame.access$1000(goodsIconFrame), 8);
            if (succPhenixEvent.getDrawable() instanceof uwn) {
                ((uwn) succPhenixEvent.getDrawable()).l();
            }
            if (succPhenixEvent.getDrawable() instanceof cy0) {
                GoodsIconFrame.access$802(GoodsIconFrame.this, (cy0) succPhenixEvent.getDrawable());
                GoodsIconFrame.access$800(GoodsIconFrame.this).A(new a(this));
            }
            GoodsIconFrame.access$900(GoodsIconFrame.this, this.f8372a);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class i extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/bottombar/GoodsIconFrame$8");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            } else {
                GoodsIconFrame.access$1202(GoodsIconFrame.this, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f8374a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.GoodsIconFrame$j$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
            public class C0446a extends AnimatorListenerAdapter {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public C0446a() {
                }

                public static /* synthetic */ Object ipc$super(C0446a aVar, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/bottombar/GoodsIconFrame$9$1$1");
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else {
                        GoodsIconFrame.access$1202(GoodsIconFrame.this, false);
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
                    return;
                }
                GoodsIconFrame.access$1300(GoodsIconFrame.this).setVisibility(0);
                GoodsIconFrame.access$1300(GoodsIconFrame.this).animate().alpha(1.0f).setDuration(200L).setListener(new C0446a()).start();
            }
        }

        public j(long j) {
            this.f8374a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            GoodsIconFrame.access$1300(GoodsIconFrame.this).setVisibility(4);
            GoodsIconFrame.access$1300(GoodsIconFrame.this).postDelayed(new a(), this.f8374a);
        }
    }

    static {
        t2o.a(295698457);
        t2o.a(806355016);
    }

    public GoodsIconFrame(Context context, ux9 ux9Var) {
        super(context, ux9Var);
        STATIC_IMAGE_URL = "https://gw.alicdn.com/imgextra/i4/O1CN01jWg6dq1QVLYwECvsP_!!6000000001981-49-tps-159-150.webp";
        ICON_ANIMATION_URLS = yga.b0();
        JSONObject d2 = fkx.d(yga.l0());
        if (d2 != null) {
            STATIC_IMAGE_URL = d2.getString("static");
            ICON_ANIMATION_URLS = d2.getString("animations");
        }
    }

    public static /* synthetic */ void access$000(GoodsIconFrame goodsIconFrame, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("549cec96", new Object[]{goodsIconFrame, new Integer(i2)});
        } else {
            goodsIconFrame.onUpdateProductNum(i2);
        }
    }

    public static /* synthetic */ AtomicBoolean access$100(GoodsIconFrame goodsIconFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("4273ad2c", new Object[]{goodsIconFrame});
        }
        return goodsIconFrame.mIsDispatchOnDraw;
    }

    public static /* synthetic */ TUrlImageView access$1000(GoodsIconFrame goodsIconFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("1951e07e", new Object[]{goodsIconFrame});
        }
        return goodsIconFrame.fakeGoodImage;
    }

    public static /* synthetic */ void access$1100(GoodsIconFrame goodsIconFrame, View view, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460bb18e", new Object[]{goodsIconFrame, view, new Integer(i2)});
        } else {
            goodsIconFrame.setVisibilityOnUiThread(view, i2);
        }
    }

    public static /* synthetic */ boolean access$1202(GoodsIconFrame goodsIconFrame, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b823805e", new Object[]{goodsIconFrame, new Boolean(z)})).booleanValue();
        }
        goodsIconFrame.isAnimating = z;
        return z;
    }

    public static /* synthetic */ TextView access$1300(GoodsIconFrame goodsIconFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("2ff602cf", new Object[]{goodsIconFrame});
        }
        return goodsIconFrame.mAuctionNum;
    }

    public static /* synthetic */ void access$200(GoodsIconFrame goodsIconFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeaab5cb", new Object[]{goodsIconFrame});
        } else {
            goodsIconFrame.removeOnDrawListener();
        }
    }

    public static /* synthetic */ boolean access$300(GoodsIconFrame goodsIconFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1105ccae", new Object[]{goodsIconFrame})).booleanValue();
        }
        return goodsIconFrame.isImageAnimABEnabled();
    }

    public static /* synthetic */ void access$400(GoodsIconFrame goodsIconFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7360e389", new Object[]{goodsIconFrame});
        } else {
            goodsIconFrame.cancelImageAnimTask();
        }
    }

    public static /* synthetic */ void access$500(GoodsIconFrame goodsIconFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5bbfa68", new Object[]{goodsIconFrame});
        } else {
            goodsIconFrame.showProductList();
        }
    }

    public static /* synthetic */ abc access$600(GoodsIconFrame goodsIconFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (abc) ipChange.ipc$dispatch("11b212c8", new Object[]{goodsIconFrame});
        }
        return goodsIconFrame.mGoodsBtnGuide;
    }

    public static /* synthetic */ void access$700(GoodsIconFrame goodsIconFrame, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b47d470", new Object[]{goodsIconFrame, str});
        } else {
            goodsIconFrame.startImageAnim(str);
        }
    }

    public static /* synthetic */ cy0 access$800(GoodsIconFrame goodsIconFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cy0) ipChange.ipc$dispatch("cd9536da", new Object[]{goodsIconFrame});
        }
        return goodsIconFrame.lastAnimDrawable;
    }

    public static /* synthetic */ cy0 access$802(GoodsIconFrame goodsIconFrame, cy0 cy0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cy0) ipChange.ipc$dispatch("9f13a657", new Object[]{goodsIconFrame, cy0Var});
        }
        goodsIconFrame.lastAnimDrawable = cy0Var;
        return cy0Var;
    }

    public static /* synthetic */ void access$900(GoodsIconFrame goodsIconFrame, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26214eae", new Object[]{goodsIconFrame, str});
        } else {
            goodsIconFrame.startNumAnim(str);
        }
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

    private void cancelImageAnimTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f782565e", new Object[]{this});
            return;
        }
        TimerTask timerTask = this.imageAnimTask;
        if (timerTask != null) {
            timerTask.cancel();
            this.imageAnimTask = null;
        }
        Timer timer = this.imageAnimTimer;
        if (timer != null) {
            timer.cancel();
            this.imageAnimTimer = null;
        }
    }

    private String getImageAnimUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("888d15d6", new Object[]{this, str});
        }
        try {
            JSONObject d2 = fkx.d(ICON_ANIMATION_URLS);
            if (d2 != null && !TextUtils.isEmpty(d2.getString(str))) {
                return d2.getString(str);
            }
        } catch (JSONException e2) {
            o3s.b(TAG, e2.getMessage());
        }
        return STATIC_IMAGE_URL;
    }

    private boolean hasClickGoodsIconIn7Days() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0576ef3", new Object[]{this})).booleanValue();
        }
        if (System.currentTimeMillis() - t6t.d("last_click_goods_icon_time") < yga.Z() * RemoteMessageConst.DEFAULT_TTL * 1000) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(GoodsIconFrame goodsIconFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == -309961236) {
            super.onCleanUp();
            return null;
        } else if (hashCode == 91531079) {
            super.onViewCreated((View) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/bottombar/GoodsIconFrame");
        }
    }

    public static boolean isBlackListRoomType(int i2) {
        JSONArray b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("356da558", new Object[]{new Integer(i2)})).booleanValue();
        }
        String p0 = qvs.p0();
        if (!TextUtils.isEmpty(p0) && (b2 = fkx.b(p0)) != null && b2.contains(Integer.valueOf(i2))) {
            return true;
        }
        return false;
    }

    private boolean isImageAnimABEnabled() {
        VideoInfo videoInfo;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("834e8fa9", new Object[]{this})).booleanValue();
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null || (jSONObject = videoInfo.itemConfigInfo) == null || jSONObject.getIntValue("itemDynamic") != 1) {
            return false;
        }
        return true;
    }

    private void onHideCaseAnim(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ccb1269", new Object[]{this, view});
        } else {
            cz0.a(view, this.mAuctionLayout);
        }
    }

    private void onShowCaseAnim(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6a51d4e", new Object[]{this, view});
        } else {
            cz0.b(this.mAuctionLayout, view);
        }
    }

    private void onUpdateProductNum(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d190fd", new Object[]{this, new Integer(i2)});
        } else if (i2 == 0) {
            this.mAuctionNum.setText("宝贝");
            this.mAuctionNum.setTextSize(10.0f);
        } else {
            this.mAuctionNum.setText(String.valueOf(i2));
            this.mAuctionNum.setTextSize(12.0f);
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

    private void scheduleImageAnimTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65f10fe1", new Object[]{this});
            return;
        }
        this.imageAnimTimer = new Timer();
        f fVar = new f();
        this.imageAnimTask = fVar;
        this.imageAnimTimer.schedule(fVar, 12000L, 1000 * yga.a0());
    }

    private void setVisibilityOnUiThread(View view, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a423569", new Object[]{this, view, new Integer(i2)});
        } else if (view != null && view.getVisibility() != i2) {
            if (Looper.getMainLooper().equals(Looper.myLooper())) {
                view.setVisibility(i2);
            } else {
                view.post(new a(view, i2));
            }
        }
    }

    private void showProductList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b86b77", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("glopenfrom", "goodslisticon");
        this.mFrameContext.h().c(uyg.EVENT_SHOW_GOODSPACKAGE, hashMap, observeUniqueIdentification());
    }

    private void startImageAnim(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3362cadb", new Object[]{this, str});
        } else if (!this.isAnimating) {
            abc abcVar = this.mGoodsBtnGuide;
            if (abcVar != null && abcVar.isShowing()) {
                return;
            }
            if (TextUtils.equals(this.lastAnimType, str)) {
                this.mAuctionImg.post(new g(str));
                return;
            }
            setVisibilityOnUiThread(this.fakeGoodImage, 0);
            this.lastAnimType = str;
            String imageAnimUrl = getImageAnimUrl(str);
            this.mAuctionImg.setSkipAutoSize(true);
            this.mAuctionImg.succListener(new h(str));
            this.mAuctionImg.setImageUrl(imageAnimUrl, STATIC_IMAGE_URL);
        }
    }

    private void startNumAnim(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d025d4c6", new Object[]{this, str});
        } else {
            this.mAuctionNum.animate().alpha(0.0f).setDuration(200L).withEndAction(new j(TextUtils.equals(str, "normal") ? 2200L : 1200L)).setListener(new i()).start();
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return IBottomProxy.KEY_FRAME_CLASS_GOODS_ICON_FRAME;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return "goods";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_bottombar_goods_icon_layout_flexalocal;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.room.showcase_show", "com.taobao.taolive.room.showcase_close", cwp.EVENT_APPEAR, cwp.EVENT_DISAPPEAR, EVENT_MEDIAPLATFORM_SHOW_GOODSPACKAGE, "com.taobao.taolive.room.goods_list_showing"};
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
        removeOnDrawListener();
        this.mFrameContext.h().b(this);
        this.mFrameContext.t().a(this.mMessageListener);
        this.mGoodsBtnGuide.destroy();
        if (isImageAnimABEnabled()) {
            this.isAnimating = false;
            this.isFirstShowcaseShow = true;
            this.lastAnimType = null;
            cy0 cy0Var = this.lastAnimDrawable;
            if (cy0Var != null) {
                cy0Var.A(null);
            }
            this.lastAnimDrawable = null;
            this.mAuctionImg.succListener(null);
            this.fakeGoodImage.setVisibility(8);
            cancelImageAnimTask();
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
        addOnDrawListener();
        this.mFrameContext.h().a(this);
        this.mFrameContext.t().l(this.mMessageListener, new e(this));
        VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
        if (videoInfo != null) {
            onUpdateProductNum(videoInfo.curItemNum);
            if (isBlackListRoomType((int) videoInfo.newRoomType)) {
                this.mAuctionLayout.setVisibility(4);
            }
        }
        if (isImageAnimABEnabled()) {
            if (!hasClickGoodsIconIn7Days()) {
                scheduleImageAnimTask();
            }
            this.fakeGoodImage.setImageUrl(STATIC_IMAGE_URL);
            this.mAuctionImg.setSkipAutoSize(false);
        }
        this.mAuctionImg.setImageUrl(STATIC_IMAGE_URL);
        if (nh4.P()) {
            abc abcVar = this.mGoodsBtnGuide;
            if (abcVar instanceof xfa) {
                ((xfa) abcVar).a((ViewGroup) ((Activity) this.mContext).findViewById(R.id.taolive_goods_guide_container), this.mLiveDataModel);
            } else {
                abcVar.a(this.mGuideRoot, this.mLiveDataModel);
            }
        }
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        if ("com.taobao.taolive.room.showcase_show".equals(str)) {
            if (obj instanceof HashMap) {
                HashMap hashMap = (HashMap) obj;
                if (hashMap.get("View") instanceof View) {
                    onShowCaseAnim((View) hashMap.get("View"));
                }
            }
        } else if ("com.taobao.taolive.room.showcase_close".equals(str) && (obj instanceof View)) {
            onHideCaseAnim((View) obj);
        }
        if (!isImageAnimABEnabled() || !cwp.EVENT_APPEAR.equals(str)) {
            if (isImageAnimABEnabled() && cwp.EVENT_DISAPPEAR.equals(str)) {
                startImageAnim("hide");
            } else if (EVENT_MEDIAPLATFORM_SHOW_GOODSPACKAGE.equals(str)) {
                showProductList();
            } else if ("com.taobao.taolive.room.goods_list_showing".equals(str) && (obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                this.mGoodsBtnGuide.dismiss();
            }
        } else if (this.isFirstShowcaseShow) {
            startImageAnim("show");
            this.isFirstShowcaseShow = false;
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
        this.mAuctionLayout = (FrameLayout) view;
        this.mAuctionNum = (TextView) view.findViewById(R.id.taolive_product_switch_btn_text);
        this.fakeGoodImage = (TUrlImageView) view.findViewById(R.id.taolive_fake_good_img);
        if (isImageAnimABEnabled()) {
            this.fakeGoodImage.setVisibility(0);
        }
        this.mAuctionImg = (TUrlImageView) view.findViewById(R.id.taolive_product_switch_btn_img);
        this.mGuideRoot = (FrameLayout) view.findViewById(R.id.taolive_goods_icon_guide);
        if (vvs.b("goodlist", "hongbaoUrgeV2", true)) {
            this.mGoodsBtnGuide = new dga(this.mContext);
        } else {
            this.mGoodsBtnGuide = new xfa(this.mContext, this.mAuctionLayout);
        }
        view.setContentDescription("宝贝口袋");
        AccessibilityUtils.a(view);
        this.mAuctionLayout.setOnClickListener(new d());
    }
}
