package com.taobao.mmad.linkage.pop.small;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.nav.Nav;
import com.taobao.bootimage.BootImageDataMgr;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.tbpoplayer.view.PopCustomNativeBaseView;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.ecj;
import tb.hst;
import tb.i2b;
import tb.jgh;
import tb.jj8;
import tb.jwf;
import tb.lyv;
import tb.me0;
import tb.n4q;
import tb.ne0;
import tb.nj8;
import tb.nwi;
import tb.o4q;
import tb.rln;
import tb.rr6;
import tb.s0m;
import tb.s8d;
import tb.t2o;
import tb.usg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SmallPopView extends PopCustomNativeBaseView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BIZ_NAME = "com.taobao.tao.TBMainActivity";
    public static final String BOOTIMAGE_POP_CLOSE_IMAGE = "https://gw.alicdn.com/imgextra/i3/O1CN01bPtybb1lD7fv7y0wG_!!6000000004784-2-tps-108-108.png";
    private static final String TAG = "SmallPopView";
    public static final String VIEW_TYPE = "mamaCommercial";
    public String actionResponse;
    private nwi adContext;
    private String adSwitch;
    private String advClickTracking;
    private String advEventTracking;
    private String advImpTracking;
    private JSONObject clickParam;
    private JSONObject closeParam;
    private JSONObject exposureParam;
    private Float height;
    private String icon;
    private String imageUrl;
    private Handler mHandler;
    private ImageView mImageView;
    private RelativeLayout mRootView;
    private ThreadPoolExecutor mThreadPool;
    private Map<String, String> monitorArgs;
    private Float right;
    private Float tabBarBottom;
    private String targetUrl;
    private Map<String, String> utArgs;
    private Float width;
    private final AtomicBoolean mReadyToDisplayed = new AtomicBoolean(false);
    private boolean canInteract = true;
    private boolean isIconImgChanged = false;
    private final String HIDE_AD_LOGO = "1";
    private jj8 interactCallback = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements jj8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.jj8
        public void onFail(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2f5f2b8", new Object[]{this, str, str2});
            } else {
                ecj.c(SmallPopView.access$1700(SmallPopView.this), 15);
            }
        }

        @Override // tb.jj8
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
            } else {
                ecj.c(SmallPopView.access$1700(SmallPopView.this), 14);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f11058a;

        public b(Context context) {
            this.f11058a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                SmallPopView.access$000(SmallPopView.this, this.f11058a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f11059a;

        public c(Context context) {
            this.f11059a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                SmallPopView.access$100(SmallPopView.this, this.f11059a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f11060a;

        public d(Context context) {
            this.f11060a = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            try {
                if (!TextUtils.isEmpty(SmallPopView.access$200(SmallPopView.this))) {
                    AlimamaAdvertising.instance().buildTanxClickTracking(PopLayer.getReference().getApp(), SmallPopView.access$200(SmallPopView.this)).b("tb_splash").c(SmallPopView.access$400(SmallPopView.this)).d(SmallPopView.access$300(SmallPopView.this)).a();
                }
            } catch (Throwable th) {
                jgh.b(SmallPopView.TAG, "SmallPopView.render.imageOnClickTrack.error", th);
            }
            try {
                SmallPopView.access$500(SmallPopView.this);
                Nav.from(this.f11060a).toUri(SmallPopView.access$600(SmallPopView.this));
            } catch (Throwable th2) {
                jgh.b(SmallPopView.TAG, "SmallPopView.render.imageOnClick.error", th2);
            }
            SmallPopView smallPopView = SmallPopView.this;
            smallPopView.trackUT(SmallPopView.access$700(smallPopView));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            SmallPopView.this.close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, "clickCloseBtn", "", "");
            try {
                if (!TextUtils.isEmpty(SmallPopView.access$800(SmallPopView.this))) {
                    AlimamaAdvertising.instance().buildTanxEventTracking(PopLayer.getReference().getApp(), SmallPopView.access$800(SmallPopView.this)).b("tb_splash").d(SmallPopView.access$400(SmallPopView.this)).e(SmallPopView.access$300(SmallPopView.this)).a();
                }
            } catch (Throwable th) {
                jgh.b(SmallPopView.TAG, "SmallPopView.render.closeBtnOnClickTrack.error", th);
            }
            SmallPopView smallPopView = SmallPopView.this;
            smallPopView.trackUT(SmallPopView.access$900(smallPopView));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!SmallPopView.this.isDisplaying()) {
                if (!SmallPopView.this.isPopReadyToDisplay()) {
                    jgh.a(SmallPopView.TAG, "SmallPopView.ImageLoadOutOfTime.");
                    SmallPopView.this.close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, "ImageLoadOutOfTime", "", "");
                } else if (!n4q.g() || !SmallPopView.access$1000(SmallPopView.this).get()) {
                    jgh.a(SmallPopView.TAG, "SmallPopView.NotifyOutOfTime.");
                    SmallPopView.this.close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, "NotifyOutOfTime", "", "");
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (!SmallPopView.this.isDisplaying()) {
                    SmallPopView.this.displayMe();
                    if (!TextUtils.isEmpty(SmallPopView.access$1100(SmallPopView.this))) {
                        AlimamaAdvertising.instance().buildTanxImpTracking(PopLayer.getReference().getApp(), SmallPopView.access$1100(SmallPopView.this)).b("tb_splash").c(SmallPopView.access$400(SmallPopView.this)).d(SmallPopView.access$300(SmallPopView.this)).a();
                    }
                    SmallPopView smallPopView = SmallPopView.this;
                    smallPopView.trackUT(SmallPopView.access$1200(smallPopView));
                }
            } catch (Throwable th) {
                jgh.b(SmallPopView.TAG, "SmallPopView.expose.error", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class h implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f11064a;
        public final /* synthetic */ String b;

        public h(boolean z, String str) {
            this.f11064a = z;
            this.b = str;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            if (!this.f11064a) {
                SmallPopView smallPopView = SmallPopView.this;
                SmallPopView.access$1300(smallPopView, "IMAGE_LOAD_ERROR.url=" + this.b, this.b);
            }
            jgh.a(SmallPopView.TAG, "SmallPopView.loadBgImageError.url=" + this.b);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class i implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11065a;
        public final /* synthetic */ boolean b;

        public i(String str, boolean z) {
            this.f11065a = str;
            this.b = z;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent != null) {
                try {
                } catch (Throwable th) {
                    jgh.b(SmallPopView.TAG, "SmallPopView.loadImg.error", th);
                }
                if (succPhenixEvent.getDrawable() != null) {
                    SmallPopView.access$1400(SmallPopView.this).setImageDrawable(succPhenixEvent.getDrawable());
                    jgh.a(SmallPopView.TAG, "SmallPopView.onImageLoaded.url=" + this.f11065a);
                    if (this.b) {
                        SmallPopView.access$1502(SmallPopView.this, true);
                    }
                    SmallPopView.access$1600(SmallPopView.this);
                    return false;
                }
            }
            if (!this.b) {
                SmallPopView smallPopView = SmallPopView.this;
                SmallPopView.access$1300(smallPopView, "IMAGE_LOAD_DRAWABLE_ERROR.url=" + this.f11065a, this.f11065a);
            }
            jgh.a(SmallPopView.TAG, "SmallPopView.loadBgImageNoDrawable.url=" + this.f11065a);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11066a;
        public final /* synthetic */ String b;

        public j(String str, String str2) {
            this.f11066a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                jgh.a(SmallPopView.TAG, "closePop reason = " + this.f11066a);
                SmallPopView.this.close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, this.f11066a, this.b, "");
            } catch (Throwable th) {
                jgh.b(SmallPopView.TAG, "SmallPopView. closePop .error", th);
            }
        }
    }

    static {
        t2o.a(573571158);
    }

    public SmallPopView(Context context) {
        super(context);
        try {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new hst.a("PopMamaCommercialViewSingleThreadPool"));
            this.mThreadPool = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            this.mHandler = new Handler(Looper.getMainLooper());
        } catch (Throwable th) {
            jgh.b(TAG, "SmallPopView.init.error", th);
        }
    }

    public static /* synthetic */ void access$000(SmallPopView smallPopView, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf6aa3da", new Object[]{smallPopView, context});
        } else {
            smallPopView.parseDataAndRender(context);
        }
    }

    public static /* synthetic */ void access$100(SmallPopView smallPopView, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5e09b9", new Object[]{smallPopView, context});
        } else {
            smallPopView.render(context);
        }
    }

    public static /* synthetic */ AtomicBoolean access$1000(SmallPopView smallPopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("9aee0bdd", new Object[]{smallPopView});
        }
        return smallPopView.mReadyToDisplayed;
    }

    public static /* synthetic */ String access$1100(SmallPopView smallPopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c285a442", new Object[]{smallPopView});
        }
        return smallPopView.advImpTracking;
    }

    public static /* synthetic */ JSONObject access$1200(SmallPopView smallPopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4314947f", new Object[]{smallPopView});
        }
        return smallPopView.exposureParam;
    }

    public static /* synthetic */ void access$1300(SmallPopView smallPopView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c781dfb4", new Object[]{smallPopView, str, str2});
        } else {
            smallPopView.closePop(str, str2);
        }
    }

    public static /* synthetic */ ImageView access$1400(SmallPopView smallPopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("51ff9ecf", new Object[]{smallPopView});
        }
        return smallPopView.mImageView;
    }

    public static /* synthetic */ boolean access$1502(SmallPopView smallPopView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55a42f34", new Object[]{smallPopView, new Boolean(z)})).booleanValue();
        }
        smallPopView.isIconImgChanged = z;
        return z;
    }

    public static /* synthetic */ void access$1600(SmallPopView smallPopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aec7a63", new Object[]{smallPopView});
        } else {
            smallPopView.onImageLoaded();
        }
    }

    public static /* synthetic */ nwi access$1700(SmallPopView smallPopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nwi) ipChange.ipc$dispatch("7af84722", new Object[]{smallPopView});
        }
        return smallPopView.adContext;
    }

    public static /* synthetic */ String access$200(SmallPopView smallPopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ba5a870", new Object[]{smallPopView});
        }
        return smallPopView.advClickTracking;
    }

    public static /* synthetic */ Map access$300(SmallPopView smallPopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ed48ffe6", new Object[]{smallPopView});
        }
        return smallPopView.utArgs;
    }

    public static /* synthetic */ Map access$400(SmallPopView smallPopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("de9a8f67", new Object[]{smallPopView});
        }
        return smallPopView.monitorArgs;
    }

    public static /* synthetic */ void access$500(SmallPopView smallPopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32adf1f3", new Object[]{smallPopView});
        } else {
            smallPopView.onPopIcon2Click();
        }
    }

    public static /* synthetic */ String access$600(SmallPopView smallPopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94d07bec", new Object[]{smallPopView});
        }
        return smallPopView.targetUrl;
    }

    public static /* synthetic */ JSONObject access$700(SmallPopView smallPopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9fbe3395", new Object[]{smallPopView});
        }
        return smallPopView.clickParam;
    }

    public static /* synthetic */ String access$800(SmallPopView smallPopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9965e5aa", new Object[]{smallPopView});
        }
        return smallPopView.advEventTracking;
    }

    public static /* synthetic */ JSONObject access$900(SmallPopView smallPopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7ccc5617", new Object[]{smallPopView});
        }
        return smallPopView.closeParam;
    }

    private void closePop(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a126ce54", new Object[]{this, str, str2});
        } else {
            runInMainThread(new j(str, str2));
        }
    }

    private void expose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d47164b", new Object[]{this});
        } else {
            runInMainThread(new g());
        }
    }

    public static /* synthetic */ Object ipc$super(SmallPopView smallPopView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/linkage/pop/small/SmallPopView");
    }

    private Map<String, String> jsonToMap(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c993e045", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : jSONObject.keySet()) {
            hashMap.put(str, jSONObject.getString(str));
        }
        return hashMap;
    }

    private void loadImg(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1194c6", new Object[]{this, str, new Boolean(z)});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                jgh.a(TAG, "SmallPopView.loadImg.failed url = null");
            } else {
                s0m.B().T(str).succListener(new i(str, z)).failListener(new h(z, str)).fetch();
            }
        } catch (Throwable th) {
            jgh.b(TAG, "SmallPopView. handleReceiveResult.error", th);
        }
    }

    private void onPopIcon2Click() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4af9fc8", new Object[]{this});
            return;
        }
        try {
            if (o4q.b() != null) {
                this.adContext = o4q.b().a();
            }
            jgh.a(TAG, "onPopIcon2Click isIconImgChanged = " + this.isIconImgChanged + ", canInteract = " + this.canInteract + ", adContext=" + this.adContext);
            if (this.adContext == null || this.isIconImgChanged || !this.canInteract) {
                return;
            }
            if ("1".equals(this.actionResponse)) {
                this.adContext.f().b(me0.EVENT_TYPE, nj8.a(new ne0(this.adContext.d().a()), this.interactCallback));
            } else if ("2".equals(this.actionResponse)) {
                this.adContext.f().b("claimedCoupon", nj8.a(new rln(this.adContext.d().a()), this.interactCallback));
            }
        } catch (Throwable th) {
            jgh.b(TAG, "SmallPopView.onPopIcon2Click.error", th);
        }
    }

    private void runInMainThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce3b02d8", new Object[]{this, runnable});
            return;
        }
        try {
            if (Looper.getMainLooper() != Looper.myLooper()) {
                this.mHandler.post(runnable);
            } else {
                runnable.run();
            }
        } catch (Throwable th) {
            jgh.b(TAG, "SmallPopView.runInMainThread.error", th);
        }
    }

    public boolean changeImg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37d480fe", new Object[]{this})).booleanValue();
        }
        try {
            jgh.a(TAG, "SmallPopView.changeImg. icon2 = " + this.icon);
            if (!this.canInteract) {
                jgh.a(TAG, "SmallPopView.changeImg.failed canInteract = false");
                return false;
            } else if (TextUtils.isEmpty(this.icon)) {
                jgh.a(TAG, "SmallPopView.changeImg.failed icon2 = null");
                return false;
            } else {
                loadImg(this.icon, true);
                return true;
            }
        } catch (Throwable th) {
            jgh.b(TAG, "SmallPopView.changeImg.error", th);
            return false;
        }
    }

    @Override // com.taobao.tbpoplayer.view.PopCustomNativeBaseView
    public View initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fe1492ae", new Object[]{this, context});
        }
        init(context);
        return this.mRootView;
    }

    public boolean isPopReadyToDisplay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b606ef16", new Object[]{this})).booleanValue();
        }
        try {
            return this.mReadyToDisplayed.get();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void trackUT(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d197a05f", new Object[]{this, jSONObject});
            return;
        }
        try {
            if (jSONObject == null) {
                jgh.a(TAG, "SmallPopView.trackUT.JsonIsNull");
                return;
            }
            String string = jSONObject.getString("page");
            int intValue = jSONObject.getIntValue("eventId");
            String string2 = jSONObject.getString("arg1");
            String string3 = jSONObject.getString("arg2");
            String string4 = jSONObject.getString("arg3");
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            HashMap hashMap = new HashMap();
            for (String str : jSONObject2.keySet()) {
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put(str, jSONObject2.getString(str));
                }
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(string, intValue, string2, string3, string4, hashMap).build());
        } catch (Throwable th) {
            jgh.b(TAG, "SmallPopView.trackUT.error", th);
        }
    }

    private void onImageLoaded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5949e8", new Object[]{this});
            return;
        }
        jgh.a(TAG, "onImageLoaded");
        if (!this.mReadyToDisplayed.getAndSet(true) && n4q.g()) {
            jgh.a(TAG, "onImageLoaded expose");
            expose();
        }
    }

    private void parseDataAndRender(Context context) {
        LinkedSplashData f2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b8f4551", new Object[]{this, context});
            return;
        }
        jgh.a(TAG, "parseDataAndRender");
        try {
            f2 = usg.d().b().f();
        } catch (Throwable th) {
            jgh.b(TAG, "SmallPopView.parseData.error", th);
        }
        if (f2 == null) {
            jgh.a(TAG, "currentSplashData == null");
            closePop("WindvaneResultEmpty", "currentSplashData == null");
        } else if (f2.getLinkedData(rr6.TYPE_POPVIEW) == null) {
            jgh.a(TAG, "currentSplashData.getLinkedData(popView) == null");
            closePop("WindvaneResultEmpty", "currentSplashData.getLinkedData(popView) == null");
        } else {
            jgh.a(TAG, "parseDataAndRender jsonObject");
            JSONObject parseObject = JSON.parseObject(f2.getLinkedData(rr6.TYPE_POPVIEW).toString());
            if (parseObject != null && !parseObject.isEmpty()) {
                this.advImpTracking = jwf.d(parseObject, "exposureParam.args.advImpTracking");
                this.advClickTracking = jwf.d(parseObject, "item.click.clickParam.args.advClickTracking");
                this.advEventTracking = jwf.d(parseObject, "item.close.clickParam.args.advEventTracking");
                this.targetUrl = jwf.d(parseObject, "item.click.targetUrl");
                this.imageUrl = jwf.d(parseObject, "item.render.smartContent.icon2");
                this.icon = jwf.d(parseObject, "item.render.smartContent.icon");
                this.width = Float.valueOf(Float.parseFloat(jwf.d(parseObject, "item.render.smartContent.position.width")));
                this.height = Float.valueOf(Float.parseFloat(jwf.d(parseObject, "item.render.smartContent.position.height")));
                this.right = Float.valueOf(Float.parseFloat(jwf.d(parseObject, "item.render.smartContent.position.right")));
                this.tabBarBottom = Float.valueOf(Float.parseFloat(jwf.d(parseObject, "item.render.smartContent.position.tabBarBottom")));
                this.exposureParam = jwf.c(parseObject, i2b.TRACK_EXPOSURE_PARAM);
                this.clickParam = jwf.c(parseObject, "item.click.clickParam");
                this.closeParam = jwf.c(parseObject, "item.close.clickParam");
                JSONObject c2 = jwf.c(parseObject, "ext.advClientParam.monitorArgs");
                JSONObject c3 = jwf.c(parseObject, "ext.advClientParam.utArgs");
                this.monitorArgs = jsonToMap(c2);
                this.utArgs = jsonToMap(c3);
                if (!this.canInteract || !parseInteractParams(parseObject)) {
                    z = false;
                }
                this.canInteract = z;
                if (TextUtils.isEmpty(this.imageUrl) || !this.canInteract) {
                    this.canInteract = false;
                    String d2 = jwf.d(parseObject, "item.render.smartContent.icon");
                    this.imageUrl = d2;
                    if (TextUtils.isEmpty(d2)) {
                        this.imageUrl = jwf.d(parseObject, "item.render.smartContent.imgUrl");
                    }
                }
                this.adSwitch = jwf.d(parseObject, "item.render.smartContent.adSwitch");
                try {
                    jgh.a(TAG, "SmallPopView.parseData.success");
                    if (!(TextUtils.isEmpty(this.imageUrl) || this.width == null || this.height == null || this.right == null || this.tabBarBottom == null)) {
                        Handler handler = this.mHandler;
                        if (handler != null) {
                            handler.post(new c(context));
                            return;
                        }
                        return;
                    }
                    closePop("WindvaneResultRenderInvalid", "");
                    return;
                } catch (Throwable th2) {
                    jgh.b(TAG, "SmallPopView.parseData.error", th2);
                    return;
                }
            }
            jgh.a(TAG, "popViewJsonObj is empty");
            closePop("WindvaneResultEmpty", "popViewJsonObj is empty");
        }
    }

    private boolean parseInteractParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42b92fbe", new Object[]{this, jSONObject})).booleanValue();
        }
        try {
            JSONObject c2 = jwf.c(jSONObject, "item.render.smartContent.content");
            if (c2 != null && !c2.isEmpty()) {
                String d2 = jwf.d(jSONObject, "item.render.smartContent.content.actionResponse");
                this.actionResponse = d2;
                if (!TextUtils.isEmpty(d2) && !this.actionResponse.equals("0")) {
                    return true;
                }
                jgh.a(TAG, "parseInteractParams actionResponse= null");
                return false;
            }
            jgh.a(TAG, "parseInteractParams interactContentObj= null");
            return false;
        } catch (Throwable th) {
            jgh.b(TAG, "SmallPopView.parseInteractParams.error", th);
            return false;
        }
    }

    public void init(Context context) {
        Request request;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        try {
            request = this.mPopRequest;
        } catch (Throwable th) {
            jgh.b(TAG, "SmallPopView.init.error", th);
            OnePopModule.OnePopLoseReasonCode onePopLoseReasonCode = OnePopModule.OnePopLoseReasonCode.OnViewJSClose;
            String message = th.getMessage();
            close(onePopLoseReasonCode, "initCatchError.e=" + message, "", "");
        }
        if (request == 0) {
            jgh.a(TAG, "mPopRequest is NULL!");
            return;
        }
        this.canInteract = true;
        this.isIconImgChanged = false;
        setPenetrateAlpha((int) (((com.alibaba.poplayer.trigger.a) request).K().modalThreshold * 255.0d));
        String P = com.alibaba.poplayer.trigger.a.P(this.mPopRequest);
        jgh.a(TAG, "SmallPopView.startInit, indexId=" + P);
        this.mThreadPool.execute(new b(context));
        if (context != null) {
            this.mRootView = new RelativeLayout(context);
        }
    }

    public boolean notifyDisplay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47524544", new Object[]{this})).booleanValue();
        }
        jgh.a(TAG, "notifyDisplay");
        if (!this.mReadyToDisplayed.get()) {
            return false;
        }
        jgh.a(TAG, "notifyDisplay expose");
        expose();
        return true;
    }

    private void render(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19054b4b", new Object[]{this, context});
            return;
        }
        try {
        } catch (Throwable th) {
            jgh.b(TAG, "SmallPopView.render.error", th);
            OnePopModule.OnePopLoseReasonCode onePopLoseReasonCode = OnePopModule.OnePopLoseReasonCode.OnViewJSClose;
            String message = th.getMessage();
            close(onePopLoseReasonCode, "renderCatchError.e=" + message, "", "");
        }
        if (this.mRootView == null) {
            jgh.a(TAG, "SmallPopView.startRender mRootView == null");
            return;
        }
        jgh.a(TAG, "SmallPopView.startRender");
        int d2 = (int) lyv.d(context, this.width.floatValue());
        int d3 = (int) lyv.d(context, this.right.floatValue());
        int d4 = (int) lyv.d(context, this.tabBarBottom.floatValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(d2, (int) lyv.d(context, this.height.floatValue()));
        layoutParams.addRule(11);
        layoutParams.addRule(12);
        layoutParams.rightMargin = d3;
        layoutParams.bottomMargin = lyv.a(context, 48) + d4;
        ImageView imageView = new ImageView(context);
        this.mImageView = imageView;
        int i2 = R.id.poplayer_mama_state_id;
        imageView.setId(i2);
        ImageView imageView2 = this.mImageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView2.setScaleType(scaleType);
        this.mRootView.addView(this.mImageView, layoutParams);
        ImageView imageView3 = new ImageView(context);
        s0m.B().U(BootImageDataMgr.IMAGE_MODULE_NAME, BOOTIMAGE_POP_CLOSE_IMAGE).into(imageView3);
        imageView3.setScaleType(scaleType);
        int d5 = (int) lyv.d(context, 40.0f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(d5, d5);
        layoutParams2.addRule(7, i2);
        layoutParams2.addRule(6, i2);
        layoutParams2.rightMargin = (int) lyv.d(context, -10.0f);
        layoutParams2.topMargin = (int) lyv.d(context, -30.0f);
        this.mRootView.addView(imageView3, layoutParams2);
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.mama_commercial_tag);
        imageView4.setScaleType(scaleType);
        int d6 = (int) lyv.d(context, 60.0f);
        int d7 = (int) lyv.d(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(d6, d7);
        layoutParams3.rightMargin = d3 + ((d2 - d6) / 2);
        layoutParams3.bottomMargin = ((d4 + lyv.a(context, 48)) - d7) - ((int) lyv.d(context, 6.0f));
        layoutParams3.addRule(11);
        layoutParams3.addRule(12);
        this.mRootView.addView(imageView4, layoutParams3);
        this.mImageView.setContentDescription("广告浮层图片");
        imageView3.setContentDescription("浮层关闭按钮");
        imageView4.setContentDescription("广告浮层标签");
        imageView4.setVisibility(TextUtils.equals("1", this.adSwitch) ? 8 : 0);
        loadImg(this.imageUrl, false);
        this.mImageView.setOnClickListener(new d(context));
        imageView3.setOnClickListener(new e());
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.postDelayed(new f(), 10000L);
        }
    }
}
