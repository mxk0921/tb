package com.taobao.mmad.biz.interact.controller.interact.view;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.cy0;
import tb.rf9;
import tb.s8d;
import tb.t2o;
import tb.tm1;
import tb.uuo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class BootImageInteractNaitveSlideView extends BootImageInteractSlideView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT_SLIDE_URL = "https://gw.alicdn.com/imgextra/i4/O1CN01BG1sT622N3lszrSMs_!!6000000007107-54-tps-270-150.apng";
    private static final String TAG = "BootImageInteractNaitveSlideView";
    private TUrlImageView mCardImageView;
    private TUrlImageView mGuideImageView;
    public FrameLayout mInteractCardContainer;
    public RelativeLayout mInteractCardDefaultContainer;
    private TextView mSlideActionView;
    private View mSlideAnimContainer;
    private TUrlImageView mSlideAnimView;
    private View mSlideDefaultContainer;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            tm1.a(BootImageInteractNaitveSlideView.TAG, "initGuideLayout loadApngImage succPhenixEvent");
            if (BootImageInteractNaitveSlideView.access$000(BootImageInteractNaitveSlideView.this) != null) {
                BootImageInteractNaitveSlideView.access$000(BootImageInteractNaitveSlideView.this).setVisibility(0);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            tm1.a(BootImageInteractNaitveSlideView.TAG, "initGuideLayout loadApngImage failPhenixEvent");
            if (BootImageInteractNaitveSlideView.access$000(BootImageInteractNaitveSlideView.this) != null) {
                BootImageInteractNaitveSlideView.access$000(BootImageInteractNaitveSlideView.this).setVisibility(8);
            }
            BootImageInteractNaitveSlideView.access$100(BootImageInteractNaitveSlideView.this);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            tm1.a(BootImageInteractNaitveSlideView.TAG, "initCardLayout succPhenixEvent");
            if (BootImageInteractNaitveSlideView.access$200(BootImageInteractNaitveSlideView.this) != null) {
                BootImageInteractNaitveSlideView.access$200(BootImageInteractNaitveSlideView.this).setVisibility(0);
            }
            if (succPhenixEvent != null) {
                try {
                    BitmapDrawable drawable = succPhenixEvent.getDrawable();
                    if (drawable != null && (drawable instanceof cy0)) {
                        ((cy0) drawable).B(1);
                    }
                } catch (Throwable th) {
                    tm1.b(BootImageInteractNaitveSlideView.TAG, "initCardLayout succPhenixEvent error ", th);
                }
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f11052a;

        public d(Context context) {
            this.f11052a = context;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            tm1.a(BootImageInteractNaitveSlideView.TAG, "initCardLayout failPhenixEvent");
            if (BootImageInteractNaitveSlideView.access$200(BootImageInteractNaitveSlideView.this) != null) {
                BootImageInteractNaitveSlideView.access$200(BootImageInteractNaitveSlideView.this).setVisibility(8);
            }
            BootImageInteractNaitveSlideView.access$300(BootImageInteractNaitveSlideView.this, this.f11052a);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            LinearLayout linearLayout = BootImageInteractNaitveSlideView.this.mInteractClickContainer;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            return false;
        }
    }

    static {
        t2o.a(573571113);
    }

    public BootImageInteractNaitveSlideView(Context context, BootImageInfo bootImageInfo) {
        super(context, bootImageInfo);
        try {
            LayoutInflater.from(context).inflate(R.layout.bootimage_interact, this);
            this.mInteractClickContainer = (LinearLayout) findViewById(R.id.bootimage_interact_click_container);
            initGuideLayout(bootImageInfo);
            initCardLayout(context, bootImageInfo);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ TUrlImageView access$000(BootImageInteractNaitveSlideView bootImageInteractNaitveSlideView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("c0e7480", new Object[]{bootImageInteractNaitveSlideView});
        }
        return bootImageInteractNaitveSlideView.mGuideImageView;
    }

    public static /* synthetic */ boolean access$100(BootImageInteractNaitveSlideView bootImageInteractNaitveSlideView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87206641", new Object[]{bootImageInteractNaitveSlideView})).booleanValue();
        }
        return bootImageInteractNaitveSlideView.loadAndShowDefaultSlideView();
    }

    public static /* synthetic */ TUrlImageView access$200(BootImageInteractNaitveSlideView bootImageInteractNaitveSlideView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("bd3058be", new Object[]{bootImageInteractNaitveSlideView});
        }
        return bootImageInteractNaitveSlideView.mCardImageView;
    }

    public static /* synthetic */ void access$300(BootImageInteractNaitveSlideView bootImageInteractNaitveSlideView, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65569e9", new Object[]{bootImageInteractNaitveSlideView, context});
        } else {
            bootImageInteractNaitveSlideView.loadAndShowDefaultCardView(context);
        }
    }

    private void initCardLayout(Context context, BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a1444ff", new Object[]{this, context, bootImageInfo});
        } else if (bootImageInfo != null) {
            try {
                tm1.a(TAG, "initCardLayout");
                FrameLayout frameLayout = (FrameLayout) findViewById(R.id.bootimage_interact_card_container);
                this.mInteractCardContainer = frameLayout;
                frameLayout.setVisibility(0);
                if (!TextUtils.isEmpty(bootImageInfo.interactImage)) {
                    this.mCardImageView = (TUrlImageView) findViewById(R.id.bootimage_interact_card_img);
                    String d2 = rf9.d(bootImageInfo.interactImage);
                    tm1.a(TAG, "initCardLayout cardPath = " + d2);
                    if (!TextUtils.isEmpty(d2)) {
                        setShowInteractCardImage("1");
                        loadApngImage(d2, this.mCardImageView, new c(), new d(context));
                        return;
                    }
                    TUrlImageView tUrlImageView = this.mCardImageView;
                    if (tUrlImageView != null) {
                        tUrlImageView.setVisibility(8);
                    }
                    loadAndShowDefaultCardView(context);
                    return;
                }
                loadAndShowDefaultCardView(context);
            } catch (Throwable th) {
                tm1.b(TAG, "initGuideLayout", th);
            }
        }
    }

    private void initGuideLayout(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f241f9", new Object[]{this, bootImageInfo});
            return;
        }
        if (bootImageInfo != null) {
            try {
                if (!bootImageInfo.isGestureViewHide()) {
                    tm1.a(TAG, "initGuideLayout");
                    this.mSlideAnimContainer = findViewById(R.id.bootimage_interact_slide_container);
                    this.mSlideDefaultContainer = findViewById(R.id.bootimage_interact_default_slide_container);
                    this.mSlideAnimView = (TUrlImageView) findViewById(R.id.bootimage_slide_anim_view);
                    TextView textView = (TextView) findViewById(R.id.bootimage_slide_tips);
                    this.mSlideActionView = textView;
                    textView.setText(getSlideActionText());
                    if (!TextUtils.isEmpty(bootImageInfo.gestureImage)) {
                        this.mGuideImageView = (TUrlImageView) findViewById(R.id.bootimage_interact_guide_img);
                        String d2 = rf9.d(bootImageInfo.gestureImage);
                        if (!TextUtils.isEmpty(d2)) {
                            tm1.a(TAG, "initGuideLayout guidePath = " + d2);
                            setShowInteractGuideImage("1");
                            loadApngImage(d2, this.mGuideImageView, new a(), new b());
                            return;
                        }
                        tm1.a(TAG, "initGuideLayout guidePath == null");
                        TUrlImageView tUrlImageView = this.mGuideImageView;
                        if (tUrlImageView != null) {
                            tUrlImageView.setVisibility(8);
                        }
                        loadAndShowDefaultSlideView();
                        return;
                    }
                    tm1.a(TAG, "initGuideLayout bootImageInfo.gestureImage == null");
                    loadAndShowDefaultSlideView();
                    return;
                }
            } catch (Throwable th) {
                tm1.b(TAG, "initGuideLayout", th);
                return;
            }
        }
        tm1.a(TAG, "initGuideLayout 无数据或者不展示引导层");
        setShowInteractGuideImage("");
    }

    public static /* synthetic */ Object ipc$super(BootImageInteractNaitveSlideView bootImageInteractNaitveSlideView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2023236405:
                return new Boolean(super.showWithAnim((Animation.AnimationListener) objArr[0]));
            case -1383171873:
                super.stopInteract();
                return null;
            case -483678593:
                super.close();
                return null;
            case -340027128:
                return new Boolean(super.show());
            case 2144052543:
                super.startInteract();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/biz/interact/controller/interact/view/BootImageInteractNaitveSlideView");
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractBaseView
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        super.close();
        stopInteract();
    }

    public abstract int getInteractCartLayoutId();

    public String getSlideActionText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b4056db", new Object[]{this});
        }
        BootImageInfo bootImageInfo = this.mBootImageInfo;
        if (bootImageInfo == null || TextUtils.isEmpty(bootImageInfo.actionText)) {
            return "";
        }
        return this.mBootImageInfo.actionText;
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView
    public void onAdClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f625d9cd", new Object[]{this});
            return;
        }
        tm1.a(TAG, "onAdClick");
        try {
            processClick(this.mContext);
        } catch (Throwable th) {
            tm1.b(TAG, "onAdClick", th);
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView
    public void onSlide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9ebe99", new Object[]{this});
            return;
        }
        tm1.a(TAG, "onSlide");
        processClick(this.mContext);
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView
    public abstract void renderDefaultCard();

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractBaseView
    public boolean showWithAnim(Animation.AnimationListener animationListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8767dccb", new Object[]{this, animationListener})).booleanValue();
        }
        boolean showWithAnim = super.showWithAnim(animationListener);
        if (showWithAnim) {
            setVisibility(0);
            if (this.mInteractCardContainer != null) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(600L);
                alphaAnimation.setFillAfter(true);
                alphaAnimation.setInterpolator(new LinearInterpolator());
                alphaAnimation.setRepeatCount(0);
                alphaAnimation.setAnimationListener(animationListener);
                this.mInteractCardContainer.clearAnimation();
                this.mInteractCardContainer.startAnimation(alphaAnimation);
            }
        }
        return showWithAnim;
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView, com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractBaseView
    public void startInteract() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcba53f", new Object[]{this});
            return;
        }
        super.startInteract();
        try {
            this.mDisableInteract = false;
            this.mSlideAnimContainer.setVisibility(0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView, com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractBaseView
    public void stopInteract() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8e78df", new Object[]{this});
            return;
        }
        super.stopInteract();
        try {
            this.mDisableInteract = true;
            this.mSlideAnimContainer.setVisibility(4);
            this.mSlideDefaultContainer.setVisibility(8);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void loadAndShowDefaultCardView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6381679", new Object[]{this, context});
        } else if (context != null) {
            try {
                this.mInteractCardDefaultContainer = (RelativeLayout) findViewById(R.id.interact_card_default_container);
                LayoutInflater.from(context).inflate(getInteractCartLayoutId(), this.mInteractCardDefaultContainer);
                renderDefaultCard();
                this.mInteractCardDefaultContainer.setVisibility(0);
                setShowInteractCardImage("0");
            } catch (Throwable th) {
                tm1.b(TAG, "loadAndShowDefaultCardView", th);
            }
        }
    }

    private void loadApngImage(String str, TUrlImageView tUrlImageView, s8d<SuccPhenixEvent> s8dVar, s8d<FailPhenixEvent> s8dVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e5a234a", new Object[]{this, str, tUrlImageView, s8dVar, s8dVar2});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && tUrlImageView != null) {
                tUrlImageView.setSkipAutoSize(true);
                tUrlImageView.setImageUrl(uuo.q(str));
                if (s8dVar != null) {
                    tUrlImageView.succListener(s8dVar);
                }
                if (s8dVar2 != null) {
                    tUrlImageView.failListener(s8dVar2);
                }
            }
        } catch (Throwable th) {
            tm1.b(TAG, "loadApngImage Error", th);
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractBaseView
    public boolean show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebbb9908", new Object[]{this})).booleanValue();
        }
        boolean show = super.show();
        if (!show) {
            return false;
        }
        if (this.mSlideAnimContainer != null) {
            tm1.a(TAG, "show mSlideAnimContainer");
            this.mSlideAnimContainer.setVisibility(0);
        }
        return show;
    }

    private boolean loadAndShowDefaultSlideView() {
        String d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9bf8cb8e", new Object[]{this})).booleanValue();
        }
        try {
            d2 = rf9.d(DEFAULT_SLIDE_URL);
        } catch (Throwable th) {
            tm1.b(TAG, "loadAndShowDefaultSlideView", th);
            LinearLayout linearLayout = this.mInteractClickContainer;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        }
        if (TextUtils.isEmpty(d2)) {
            tm1.a(TAG, "loadAndShowDefaultSlideView path is null");
            setShowInteractGuideImage("");
            LinearLayout linearLayout2 = this.mInteractClickContainer;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            return false;
        }
        setShowInteractGuideImage("0");
        tm1.a(TAG, "loadAndShowDefaultSlideView show");
        this.mSlideDefaultContainer.setVisibility(0);
        this.mSlideAnimView.setSkipAutoSize(true);
        this.mSlideAnimView.setImageUrl(uuo.q(d2));
        this.mSlideAnimView.failListener(new e());
        return true;
    }
}
