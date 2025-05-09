package com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Atmosphere;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.drawable.DrawableCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentBadgeModel;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.TaoLiveKtAtmosphereType;
import com.taobao.taobao.R;
import java.util.List;
import tb.ccc;
import tb.fkx;
import tb.gme;
import tb.hw0;
import tb.ig1;
import tb.jyw;
import tb.nh4;
import tb.o3s;
import tb.og1;
import tb.p44;
import tb.t2o;
import tb.tf8;
import tb.uvd;
import tb.v2s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class AtmosphereView extends LinearLayout implements ccc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MSG_LOWERING_LEVEL = 20000;
    private static final String TAG = "AtmosphereView";
    private ig1 mAtmosphereModel;
    private final Context mContext;
    private ViewGroup mDXContainer;
    private tf8 mDXRender;
    private AliUrlImageView mFansBackgroundView;
    private final jyw mHandler;
    private AlphaAnimation mHideAlphaAnim;
    private LottieAnimationView mLottieView;
    private LinearLayout mMediaContainer;
    private ViewGroup mNativeContainer;
    private TranslateAnimation mShowTransAnim;
    private TextView mTopMessageContent;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements uvd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AliUrlImageView f8416a;
        public final /* synthetic */ String b;

        public a(AliUrlImageView aliUrlImageView, String str) {
            this.f8416a = aliUrlImageView;
            this.b = str;
        }

        @Override // tb.uvd
        public void onError(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5eb5434c", new Object[]{this, obj});
            } else {
                o3s.b(AtmosphereView.TAG, fkx.i(obj));
            }
        }

        @Override // tb.uvd
        public void onSuccess(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                return;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
            int b = hw0.b(AtmosphereView.access$000(AtmosphereView.this), p44.c);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((bitmapDrawable.getIntrinsicWidth() * b) / bitmapDrawable.getIntrinsicHeight(), b);
            layoutParams.rightMargin = hw0.b(AtmosphereView.access$000(AtmosphereView.this), 4.0f);
            this.f8416a.setLayoutParams(layoutParams);
            AtmosphereView.access$100(AtmosphereView.this).addView(this.f8416a);
            this.f8416a.setImageUrl(this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            float measuredWidth = AtmosphereView.access$200(AtmosphereView.this).getMeasuredWidth();
            if (measuredWidth > 0.0f) {
                AtmosphereView.access$300(AtmosphereView.this, measuredWidth);
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
                return;
            }
            float measuredWidth = AtmosphereView.access$400(AtmosphereView.this).getMeasuredWidth();
            if (measuredWidth > 0.0f) {
                AtmosphereView.access$300(AtmosphereView.this, measuredWidth);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$kmp$live$liveBizComponent$model$leftBottom$enter$TaoLiveKtAtmosphereType;

        static {
            int[] iArr = new int[TaoLiveKtAtmosphereType.values().length];
            $SwitchMap$com$taobao$kmp$live$liveBizComponent$model$leftBottom$enter$TaoLiveKtAtmosphereType = iArr;
            try {
                iArr[TaoLiveKtAtmosphereType.Enter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$kmp$live$liveBizComponent$model$leftBottom$enter$TaoLiveKtAtmosphereType[TaoLiveKtAtmosphereType.Trade.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$kmp$live$liveBizComponent$model$leftBottom$enter$TaoLiveKtAtmosphereType[TaoLiveKtAtmosphereType.DXAtmosphere.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        t2o.a(295698633);
        t2o.a(295698639);
        t2o.a(806356161);
    }

    public AtmosphereView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Context access$000(AtmosphereView atmosphereView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("1528f524", new Object[]{atmosphereView});
        }
        return atmosphereView.mContext;
    }

    public static /* synthetic */ LinearLayout access$100(AtmosphereView atmosphereView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("8b1cf084", new Object[]{atmosphereView});
        }
        return atmosphereView.mMediaContainer;
    }

    public static /* synthetic */ ViewGroup access$200(AtmosphereView atmosphereView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("a2ce1727", new Object[]{atmosphereView});
        }
        return atmosphereView.mDXContainer;
    }

    public static /* synthetic */ void access$300(AtmosphereView atmosphereView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("305f93f1", new Object[]{atmosphereView, new Float(f)});
        } else {
            atmosphereView.startShowAnimation(f);
        }
    }

    public static /* synthetic */ ViewGroup access$400(AtmosphereView atmosphereView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("b4051fe5", new Object[]{atmosphereView});
        }
        return atmosphereView.mNativeContainer;
    }

    private Drawable getFansBg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("679d458", new Object[]{this});
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(og1.c(this.mContext));
        gradientDrawable.setColor(og1.a());
        try {
            String bgColor = this.mAtmosphereModel.b().getBgColor();
            if (!TextUtils.isEmpty(bgColor)) {
                int parseColor = Color.parseColor(bgColor);
                if (parseColor != 0) {
                    Drawable wrap = DrawableCompat.wrap(gradientDrawable);
                    DrawableCompat.setTintList(wrap, ColorStateList.valueOf(parseColor));
                    wrap.setAlpha(76);
                    return wrap;
                }
            } else {
                gradientDrawable.setAlpha(og1.b());
            }
            return gradientDrawable;
        } catch (Exception unused) {
            gradientDrawable.setAlpha(og1.b());
            return gradientDrawable;
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.taolive_top_msg_layer_new_2_flexalocal, (ViewGroup) this, false);
        this.mDXContainer = (ViewGroup) inflate.findViewById(R.id.taolive_top_msg_dx);
        this.mNativeContainer = (ViewGroup) inflate.findViewById(R.id.taolive_top_msg_native);
        AliUrlImageView aliUrlImageView = (AliUrlImageView) inflate.findViewById(R.id.taolive_top_msg_item_background);
        this.mFansBackgroundView = aliUrlImageView;
        aliUrlImageView.setSkipAutoSize(true);
        this.mLottieView = (LottieAnimationView) inflate.findViewById(R.id.taolive_atmosphere_lottie_view);
        TextView textView = (TextView) inflate.findViewById(R.id.taolive_chat_item_content);
        this.mTopMessageContent = textView;
        textView.setMaxLines(2);
        this.mMediaContainer = (LinearLayout) inflate.findViewById(R.id.taolive_media_list_container);
        addView(inflate);
        this.mDXRender = new tf8();
    }

    public static /* synthetic */ Object ipc$super(AtmosphereView atmosphereView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/component/Atmosphere/AtmosphereView");
    }

    private void setDXStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75caf1e2", new Object[]{this});
            return;
        }
        this.mDXContainer.removeAllViews();
        this.mDXContainer.setVisibility(0);
        this.mNativeContainer.setVisibility(8);
        this.mDXRender.a(this.mDXContainer, this.mAtmosphereModel);
    }

    private void setMedalList() {
        List<TaoLiveKtCommentBadgeModel> badgeInfos;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("811bc4fa", new Object[]{this});
            return;
        }
        ig1 ig1Var = this.mAtmosphereModel;
        if (!(ig1Var == null || ig1Var.b() == null || (badgeInfos = this.mAtmosphereModel.b().getBadgeInfos()) == null || badgeInfos.isEmpty())) {
            for (TaoLiveKtCommentBadgeModel taoLiveKtCommentBadgeModel : badgeInfos) {
                if (nh4.v()) {
                    str = taoLiveKtCommentBadgeModel.getMedalIcon2();
                } else {
                    str = taoLiveKtCommentBadgeModel.getMedalIcon();
                }
                if (!TextUtils.isEmpty(str)) {
                    gme.a(str).b(new a(new AliUrlImageView(this.mContext), str)).a();
                }
            }
        }
    }

    private void setShowDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85ed803a", new Object[]{this});
            return;
        }
        this.mHandler.removeMessages(20000);
        this.mHandler.sendEmptyMessageDelayed(20000, this.mAtmosphereModel.b().getDisappearTime());
    }

    private void startHideAnimation() {
        LottieAnimationView lottieAnimationView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a31d37a7", new Object[]{this});
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.mHideAlphaAnim = alphaAnimation;
        alphaAnimation.setDuration(200L);
        this.mHideAlphaAnim.setInterpolator(new AccelerateDecelerateInterpolator());
        setVisibility(4);
        startAnimation(this.mHideAlphaAnim);
        if (nh4.v() && (lottieAnimationView = this.mLottieView) != null) {
            lottieAnimationView.clearAnimation();
        }
    }

    private void startShowAnimation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4d6ff74", new Object[]{this, new Float(f)});
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f - f, 0.0f, 0.0f, 0.0f);
        this.mShowTransAnim = translateAnimation;
        translateAnimation.setDuration(400L);
        this.mShowTransAnim.setInterpolator(new AccelerateDecelerateInterpolator());
        setVisibility(0);
        startAnimation(this.mShowTransAnim);
        setShowDuration();
    }

    private void updateSpecialEnter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd20c98f", new Object[]{this});
        } else if (!this.mAtmosphereModel.a()) {
            this.mFansBackgroundView.setVisibility(8);
        } else if (this.mAtmosphereModel.d()) {
            this.mFansBackgroundView.setVisibility(0);
            this.mFansBackgroundView.setImageUrl(nh4.h1());
        } else if (this.mAtmosphereModel.c()) {
            this.mFansBackgroundView.setVisibility(0);
            this.mFansBackgroundView.setImageUrl(nh4.U0());
        } else {
            this.mFansBackgroundView.setVisibility(8);
        }
    }

    private void updateSpecialEnterLottie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109be7ce", new Object[]{this});
        } else if (!this.mAtmosphereModel.a()) {
            this.mLottieView.setVisibility(8);
        } else if (this.mAtmosphereModel.d()) {
            this.mLottieView.setVisibility(0);
            this.mLottieView.setAnimationFromUrl("https://g.alicdn.com/ani-assets/c368dcebe7804e09a8a6a555442d45d5/0.0.1/lottie.json");
            this.mLottieView.setRepeatCount(-1);
            this.mLottieView.playAnimation();
        } else if (this.mAtmosphereModel.c()) {
            this.mLottieView.setVisibility(0);
            this.mLottieView.setAnimationFromUrl("https://g.alicdn.com/ani-assets/1431b6108990687f7cb9ba360fce3f0f/0.0.1/lottie.json");
            this.mLottieView.setRepeatCount(-1);
            this.mLottieView.playAnimation();
        } else {
            this.mLottieView.setVisibility(8);
        }
    }

    @Override // tb.ccc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (message.what == 20000) {
            hideWithAnimation();
        }
    }

    public void hideWithAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1453fdc3", new Object[]{this});
        } else if (getVisibility() != 4) {
            startHideAnimation();
        }
    }

    public void releaseAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5cec944", new Object[]{this});
            return;
        }
        TranslateAnimation translateAnimation = this.mShowTransAnim;
        if (translateAnimation != null) {
            translateAnimation.cancel();
            this.mShowTransAnim = null;
        }
        AlphaAnimation alphaAnimation = this.mHideAlphaAnim;
        if (alphaAnimation != null) {
            alphaAnimation.cancel();
            this.mHideAlphaAnim = null;
        }
    }

    public void setAtmosphereModel(ig1 ig1Var) {
        TaoLiveKtAtmosphereType atmosphereType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3bdad61", new Object[]{this, ig1Var});
            return;
        }
        this.mAtmosphereModel = ig1Var;
        if (ig1Var != null && ig1Var.b() != null && (atmosphereType = this.mAtmosphereModel.b().getAtmosphereType()) != null) {
            int i = d.$SwitchMap$com$taobao$kmp$live$liveBizComponent$model$leftBottom$enter$TaoLiveKtAtmosphereType[atmosphereType.ordinal()];
            if (i == 1 || i == 2) {
                setEnterStyle(atmosphereType);
            } else if (i == 3) {
                setDXStyle();
            }
        }
    }

    public void showWithAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fd8cd68", new Object[]{this});
        } else if (getVisibility() != 0) {
            if (nh4.v()) {
                updateSpecialEnterLottie();
            } else {
                updateSpecialEnter();
            }
            if (this.mDXContainer.getVisibility() == 0) {
                this.mDXContainer.post(new b());
            } else if (this.mNativeContainer.getVisibility() == 0) {
                this.mNativeContainer.post(new c());
            }
        }
    }

    public AtmosphereView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setEnterStyle(TaoLiveKtAtmosphereType taoLiveKtAtmosphereType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c95390", new Object[]{this, taoLiveKtAtmosphereType});
        } else if (TextUtils.isEmpty(this.mAtmosphereModel.b().getName())) {
            this.mNativeContainer.setVisibility(8);
        } else {
            this.mDXContainer.setVisibility(8);
            this.mNativeContainer.setVisibility(0);
            this.mMediaContainer.removeAllViews();
            try {
                this.mNativeContainer.setBackground(getFansBg());
            } catch (Exception e) {
                o3s.b(TAG, "mNativeContainer setBackgroundDrawable exception:" + fkx.i(e));
            }
            setMedalList();
            this.mTopMessageContent.setTextColor(v2s.o().f().getApplication().getResources().getColor(R.color.taolive_commments_chat_follow_text));
            String str = this.mAtmosphereModel.b().getName() + this.mAtmosphereModel.b().getContent();
            if (!TextUtils.isEmpty(str)) {
                this.mTopMessageContent.setText(str);
            }
            if (this.mAtmosphereModel.a()) {
                this.mNativeContainer.setBackgroundColor(Color.parseColor("#00000000"));
            }
        }
    }

    public AtmosphereView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHandler = new jyw(this);
        this.mContext = context;
        init();
    }
}
