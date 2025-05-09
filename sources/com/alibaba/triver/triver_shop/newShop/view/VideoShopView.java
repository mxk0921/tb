package com.alibaba.triver.triver_shop.newShop.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.EmbedSecondFloorView;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import tb.brf;
import tb.ckf;
import tb.ic1;
import tb.jpu;
import tb.kew;
import tb.npp;
import tb.r54;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class VideoShopView extends ShopView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private EmbedSecondFloorView embedSecondFloorView;
    private boolean mute;
    private String playerViewToken;
    private View secondFloorView;
    private int totalY;
    private FrameLayout videoShopBGLayout;
    private TUrlImageView videoShopBigCardMuteButton;
    private TUrlImageView videoShopBigCardPlayButton;
    private TUrlImageView videoShopBigCardPullDownImage;
    private FrameLayout videoShopCommonBGBlackShadow;
    private FrameLayout videoShopHeaderBGBlackShadow;
    private final String KEY_SWIPE_DOWN_IMAGE_URL = "https://img.alicdn.com/imgextra/i1/O1CN01FgfnlT1jp12NW7WKj_!!6000000004596-1-tps-216-216.gif";
    private final String KEY_PLAY_BUTTON_IMAGE_URL = "https://gw.alicdn.com/imgextra/i1/O1CN01lH9Tut1nGtxfZ004N_!!6000000005063-54-tps-72-72.apng";
    private final String KEY_PAUSE_BUTTON_IMAGE_URL = "https://gw.alicdn.com/imgextra/i1/O1CN01E4EwcN1YAkSpyXsPj_!!6000000003019-2-tps-120-120.png";
    private final String KEY_MUTE_BUTTON_IMAGE_URL = "https://gw.alicdn.com/imgextra/i4/O1CN01brBYlS1lApTgM2Kc0_!!6000000004779-2-tps-120-120.png";
    private final String KEY_NOT_MUTE_BUTTON_IMAGE_URL = "https://gw.alicdn.com/imgextra/i3/O1CN01jGwfUO1Zi0meoCcsg_!!6000000003227-2-tps-120-120.png";
    private boolean videoShopMode = true;
    private boolean play = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (VideoShopView.access$getPlay$p(VideoShopView.this)) {
                EmbedSecondFloorView access$getEmbedSecondFloorView$p = VideoShopView.access$getEmbedSecondFloorView$p(VideoShopView.this);
                if (access$getEmbedSecondFloorView$p != null) {
                    access$getEmbedSecondFloorView$p.onWebViewPause();
                }
                TUrlImageView access$getVideoShopBigCardPlayButton$p = VideoShopView.access$getVideoShopBigCardPlayButton$p(VideoShopView.this);
                if (access$getVideoShopBigCardPlayButton$p != null) {
                    access$getVideoShopBigCardPlayButton$p.setImageUrl(VideoShopView.access$getKEY_PLAY_BUTTON_IMAGE_URL$p(VideoShopView.this));
                } else {
                    ckf.y("videoShopBigCardPlayButton");
                    throw null;
                }
            } else {
                EmbedSecondFloorView access$getEmbedSecondFloorView$p2 = VideoShopView.access$getEmbedSecondFloorView$p(VideoShopView.this);
                if (access$getEmbedSecondFloorView$p2 != null) {
                    access$getEmbedSecondFloorView$p2.onWebViewResume();
                }
                TUrlImageView access$getVideoShopBigCardPlayButton$p2 = VideoShopView.access$getVideoShopBigCardPlayButton$p(VideoShopView.this);
                if (access$getVideoShopBigCardPlayButton$p2 != null) {
                    access$getVideoShopBigCardPlayButton$p2.setImageUrl(VideoShopView.access$getKEY_PAUSE_BUTTON_IMAGE_URL$p(VideoShopView.this));
                } else {
                    ckf.y("videoShopBigCardPlayButton");
                    throw null;
                }
            }
            VideoShopView videoShopView = VideoShopView.this;
            VideoShopView.access$setPlay$p(videoShopView, true ^ VideoShopView.access$getPlay$p(videoShopView));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                Nav.from(VideoShopView.this.getContext()).toUri(VideoShopView.access$getJumpUrl(VideoShopView.this));
            }
        }
    }

    static {
        t2o.a(766509773);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoShopView(Context context) {
        super(context);
        ckf.g(context, "context");
    }

    public static final /* synthetic */ EmbedSecondFloorView access$getEmbedSecondFloorView$p(VideoShopView videoShopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EmbedSecondFloorView) ipChange.ipc$dispatch("622e08c8", new Object[]{videoShopView});
        }
        return videoShopView.embedSecondFloorView;
    }

    public static final /* synthetic */ Uri access$getJumpUrl(VideoShopView videoShopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("454d97b9", new Object[]{videoShopView});
        }
        return videoShopView.getJumpUrl();
    }

    public static final /* synthetic */ String access$getKEY_MUTE_BUTTON_IMAGE_URL$p(VideoShopView videoShopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59d8e3cd", new Object[]{videoShopView});
        }
        return videoShopView.KEY_MUTE_BUTTON_IMAGE_URL;
    }

    public static final /* synthetic */ String access$getKEY_NOT_MUTE_BUTTON_IMAGE_URL$p(VideoShopView videoShopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("592cc141", new Object[]{videoShopView});
        }
        return videoShopView.KEY_NOT_MUTE_BUTTON_IMAGE_URL;
    }

    public static final /* synthetic */ String access$getKEY_PAUSE_BUTTON_IMAGE_URL$p(VideoShopView videoShopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("778a1bdc", new Object[]{videoShopView});
        }
        return videoShopView.KEY_PAUSE_BUTTON_IMAGE_URL;
    }

    public static final /* synthetic */ String access$getKEY_PLAY_BUTTON_IMAGE_URL$p(VideoShopView videoShopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7e554d2", new Object[]{videoShopView});
        }
        return videoShopView.KEY_PLAY_BUTTON_IMAGE_URL;
    }

    public static final /* synthetic */ boolean access$getMute$p(VideoShopView videoShopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f32d196", new Object[]{videoShopView})).booleanValue();
        }
        return videoShopView.mute;
    }

    public static final /* synthetic */ boolean access$getPlay$p(VideoShopView videoShopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfa413db", new Object[]{videoShopView})).booleanValue();
        }
        return videoShopView.play;
    }

    public static final /* synthetic */ View access$getSecondFloorView$p(VideoShopView videoShopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ae3d3ddc", new Object[]{videoShopView});
        }
        return videoShopView.secondFloorView;
    }

    public static final /* synthetic */ TUrlImageView access$getVideoShopBigCardMuteButton$p(VideoShopView videoShopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("b61610fb", new Object[]{videoShopView});
        }
        return videoShopView.videoShopBigCardMuteButton;
    }

    public static final /* synthetic */ TUrlImageView access$getVideoShopBigCardPlayButton$p(VideoShopView videoShopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("b6a24a56", new Object[]{videoShopView});
        }
        return videoShopView.videoShopBigCardPlayButton;
    }

    public static final /* synthetic */ void access$processEvent(VideoShopView videoShopView, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deef7e4", new Object[]{videoShopView, str, jSONObject});
        } else {
            videoShopView.processEvent(str, jSONObject);
        }
    }

    public static final /* synthetic */ void access$setMute$p(VideoShopView videoShopView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbb6e78e", new Object[]{videoShopView, new Boolean(z)});
        } else {
            videoShopView.mute = z;
        }
    }

    public static final /* synthetic */ void access$setPlay$p(VideoShopView videoShopView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("796dede9", new Object[]{videoShopView, new Boolean(z)});
        } else {
            videoShopView.play = z;
        }
    }

    private final Uri getJumpUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("8aa69a69", new Object[]{this});
        }
        return ShopExtKt.w(getShopData(), this.playerViewToken, null, 4, null);
    }

    public static /* synthetic */ Object ipc$super(VideoShopView videoShopView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1795598259:
                super.swipeDownStart();
                return null;
            case -1307154377:
                super.setTabViewInVideoShop((View) objArr[0]);
                return null;
            case -322372968:
                super.notifyAllTemplateReady();
                return null;
            case -37299409:
                super.changeToBigCardMode();
                return null;
            case 32895674:
                super.onContainerSwipeUp();
                return null;
            case 267248023:
                super.init();
                return null;
            case 711459142:
                super.swipeDownEnd();
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 988548963:
                super.onActivityPaused();
                return null;
            case 1889590256:
                super.onActivityResumed();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/VideoShopView");
        }
    }

    private final void processEvent(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("512c8b4", new Object[]{this, str, jSONObject});
        } else if (ckf.b("message", str)) {
            String str2 = null;
            if (!(jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("params")) == null)) {
                str2 = jSONObject2.getString("playerViewToken");
            }
            this.playerViewToken = str2;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void changeToBigCardMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc6db2f", new Object[]{this});
            return;
        }
        super.changeToBigCardMode();
        initBigCardIfNeeded();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public int getContentMaxHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7bec322", new Object[]{this})).intValue();
        }
        if (getFirstHeadContainer().getHeight() == 0 || getSecondHeadContainer().getHeight() == 0 || getVideoShopTabView().getHeight() == 0) {
            return 0;
        }
        setAnimationUpReservedHeight(getVideoShopTabView().getHeight());
        return ((getHeight() - getStatusBarSize()) - getFirstHeadContainer().getHeight()) - getAnimationUpReservedHeight();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public int getSwipeDownDistance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b86f4555", new Object[]{this})).intValue();
        }
        return getSecondHeadContainer().getHeight() - getVideoShopTabView().getHeight();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public boolean getVideoShopMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b7c2d29", new Object[]{this})).booleanValue();
        }
        return this.videoShopMode;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void notifyAllTemplateReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecc8fa98", new Object[]{this});
        } else {
            super.notifyAllTemplateReady();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void onActivityPaused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aec0f63", new Object[]{this});
            return;
        }
        super.onActivityPaused();
        EmbedSecondFloorView embedSecondFloorView = this.embedSecondFloorView;
        if (embedSecondFloorView != null) {
            embedSecondFloorView.onWebViewPause();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void onActivityResumed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a0dbf0", new Object[]{this});
            return;
        }
        super.onActivityResumed();
        EmbedSecondFloorView embedSecondFloorView = this.embedSecondFloorView;
        if (embedSecondFloorView != null) {
            embedSecondFloorView.onWebViewResume();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void onContainerSwipeUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5f2ba", new Object[]{this});
            return;
        }
        setAnimationUpReservedHeight(getVideoShopTabView().getHeight());
        super.onContainerSwipeUp();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        xhv xhvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        try {
            EmbedSecondFloorView embedSecondFloorView = this.embedSecondFloorView;
            if (embedSecondFloorView == null) {
                xhvVar = null;
            } else {
                embedSecondFloorView.onDestroy();
                xhvVar = xhv.INSTANCE;
            }
            Result.m1108constructorimpl(xhvVar);
        } catch (Throwable th) {
            Result.m1108constructorimpl(kotlin.b.a(th));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView, com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeCancel(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5770811", new Object[]{this, motionEvent});
            return;
        }
        ckf.g(motionEvent, "event");
        if (getBigCardMode() && !getHeaderHide()) {
            kew.d0(getVideoShopTabView(), ((kew.P(1000) - getCommonSecondView().getHeight()) - getFirstHeadContainer().getHeight()) - getStatusBarSize());
            updateContentTopMargin(getInHomePage());
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView, com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeDown(View view, MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74251660", new Object[]{this, view, motionEvent, new Integer(i)});
            return;
        }
        ckf.g(view, "fromTargetView");
        ckf.g(motionEvent, "event");
        if (!getBigCardMode() || getHeaderHide()) {
            return;
        }
        if (ckf.b(view, getCenterContainer()) || !kew.H(getCenterContainer(), (int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            int P = ((kew.P(1000) - getCommonSecondView().getHeight()) - getFirstHeadContainer().getHeight()) - getStatusBarSize();
            int z = kew.z(getVideoShopTabView());
            if (z - P < 600) {
                int i2 = z + i;
                if (i2 - P < 600) {
                    kew.d0(getVideoShopTabView(), i2);
                    updateContentTopMargin(getInHomePage());
                }
            }
            kew.d0(getVideoShopTabView(), P);
            Nav.from(getContext()).toUri(getJumpUrl());
            updateContentTopMargin(getInHomePage());
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView, com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeUp(View view, MotionEvent motionEvent, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e512d9", new Object[]{this, view, motionEvent, new Integer(i)});
            return;
        }
        ckf.g(view, "fromTargetView");
        ckf.g(motionEvent, "event");
        if (!getBigCardMode() || getHeaderHide()) {
            return;
        }
        if (ckf.b(view, getCenterContainer()) || !kew.H(getCenterContainer(), (int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            int P = ((kew.P(1000) - getCommonSecondView().getHeight()) - getFirstHeadContainer().getHeight()) - getStatusBarSize();
            int z = kew.z(getVideoShopTabView());
            if (z <= P || (i2 = z - i) <= P) {
                kew.d0(getVideoShopTabView(), P);
            } else {
                kew.d0(getVideoShopTabView(), i2);
            }
            updateContentTopMargin(getInHomePage());
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void setShopLoftEntrance(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("497e740c", new Object[]{this, view});
        } else {
            ckf.g(view, "view");
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void setTabViewInVideoShop(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2166837", new Object[]{this, view});
            return;
        }
        ckf.g(view, "view");
        super.setTabViewInVideoShop(view);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void setVideoShopMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb35ac5b", new Object[]{this, new Boolean(z)});
        } else {
            this.videoShopMode = z;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void swipeDownEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a680146", new Object[]{this});
            return;
        }
        super.swipeDownEnd();
        if (getBigCardMode()) {
            EmbedSecondFloorView embedSecondFloorView = this.embedSecondFloorView;
            if (embedSecondFloorView != null) {
                embedSecondFloorView.onWebViewResume();
            }
            View view = this.secondFloorView;
            if (view != null) {
                kew.g0(view);
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void swipeUpStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686c17f4", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void updateContentTopMargin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6329d3a", new Object[]{this, new Boolean(z)});
        } else {
            kew.o(this, new VideoShopView$updateContentTopMargin$1(this, z));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void updateSubPageChanged(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79f7009", new Object[]{this, new Boolean(z), str});
        } else {
            kew.o(this, new VideoShopView$updateSubPageChanged$1(this, z));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void updateTopViewTransparentStyle(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da56efd", new Object[]{this, new Boolean(z)});
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (VideoShopView.access$getMute$p(VideoShopView.this)) {
                EmbedSecondFloorView access$getEmbedSecondFloorView$p = VideoShopView.access$getEmbedSecondFloorView$p(VideoShopView.this);
                if (access$getEmbedSecondFloorView$p != null) {
                    access$getEmbedSecondFloorView$p.l(false);
                }
                TUrlImageView access$getVideoShopBigCardMuteButton$p = VideoShopView.access$getVideoShopBigCardMuteButton$p(VideoShopView.this);
                if (access$getVideoShopBigCardMuteButton$p != null) {
                    access$getVideoShopBigCardMuteButton$p.setImageUrl(VideoShopView.access$getKEY_NOT_MUTE_BUTTON_IMAGE_URL$p(VideoShopView.this));
                } else {
                    ckf.y("videoShopBigCardMuteButton");
                    throw null;
                }
            } else {
                EmbedSecondFloorView access$getEmbedSecondFloorView$p2 = VideoShopView.access$getEmbedSecondFloorView$p(VideoShopView.this);
                if (access$getEmbedSecondFloorView$p2 != null) {
                    access$getEmbedSecondFloorView$p2.l(true);
                }
                TUrlImageView access$getVideoShopBigCardMuteButton$p2 = VideoShopView.access$getVideoShopBigCardMuteButton$p(VideoShopView.this);
                if (access$getVideoShopBigCardMuteButton$p2 != null) {
                    access$getVideoShopBigCardMuteButton$p2.setImageUrl(VideoShopView.access$getKEY_MUTE_BUTTON_IMAGE_URL$p(VideoShopView.this));
                } else {
                    ckf.y("videoShopBigCardMuteButton");
                    throw null;
                }
            }
            VideoShopView videoShopView = VideoShopView.this;
            VideoShopView.access$setMute$p(videoShopView, true ^ VideoShopView.access$getMute$p(videoShopView));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        super.init();
        setScrollThreshold(5);
        npp.Companion.b("videoShop init");
        View findViewById = findViewById(R.id.shopView_videoShop_bg);
        ckf.f(findViewById, "findViewById(R.id.shopView_videoShop_bg)");
        this.videoShopBGLayout = (FrameLayout) findViewById;
        kew.B(getBottomContainer());
        updateBottomGuidLineEnd(0);
        initVideoShopHeaderBG();
        initVideoShopCommonBG();
    }

    private final void initBigCardIfNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("151b73d9", new Object[]{this});
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.view_video_shop_big_card, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.view_video_shop_big_card_play_button);
        ckf.f(findViewById, "bigCardBg.findViewById(R.id.view_video_shop_big_card_play_button)");
        this.videoShopBigCardPlayButton = (TUrlImageView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.view_video_shop_big_card_mute_button);
        ckf.f(findViewById2, "bigCardBg.findViewById(R.id.view_video_shop_big_card_mute_button)");
        this.videoShopBigCardMuteButton = (TUrlImageView) findViewById2;
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.view_video_shop_big_card_content);
        View findViewById3 = inflate.findViewById(R.id.view_video_shop_big_card_pull_down_img);
        ckf.f(findViewById3, "bigCardBg.findViewById(R.id.view_video_shop_big_card_pull_down_img)");
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById3;
        this.videoShopBigCardPullDownImage = tUrlImageView;
        tUrlImageView.setImageUrl(this.KEY_SWIPE_DOWN_IMAGE_URL);
        this.secondFloorView = inflate;
        JSONObject c1 = getShopData().c1();
        String N0 = getShopData().N0();
        String str = "";
        if (N0 == null) {
            N0 = str;
        }
        Pair a2 = jpu.a("sellerId", N0);
        Pair a3 = jpu.a("contentId", brf.d(c1, "id"));
        Pair a4 = jpu.a("contentType", brf.d(c1, "sceneId"));
        if (c1 != null) {
            str = c1.toJSONString();
        }
        Map<String, String> j = kotlin.collections.a.j(a2, a3, a4, jpu.a("contentData", str));
        EmbedSecondFloorView embedSecondFloorView = new EmbedSecondFloorView();
        this.embedSecondFloorView = embedSecondFloorView;
        embedSecondFloorView.s(new VideoShopView$initBigCardIfNeeded$1(this));
        EmbedSecondFloorView embedSecondFloorView2 = this.embedSecondFloorView;
        ckf.d(embedSecondFloorView2);
        Context context = getContext();
        if (context != null) {
            embedSecondFloorView2.w((Activity) context);
            EmbedSecondFloorView embedSecondFloorView3 = this.embedSecondFloorView;
            ckf.d(embedSecondFloorView3);
            embedSecondFloorView3.onCreate(new HashMap());
            EmbedSecondFloorView embedSecondFloorView4 = this.embedSecondFloorView;
            ckf.d(embedSecondFloorView4);
            View view = embedSecondFloorView4.getView(-1, -1, "", "", j);
            FrameLayout frameLayout = this.videoShopBGLayout;
            if (frameLayout != null) {
                frameLayout.addView(this.secondFloorView);
                EmbedSecondFloorView embedSecondFloorView5 = this.embedSecondFloorView;
                ckf.d(embedSecondFloorView5);
                embedSecondFloorView5.onAttachedToWebView();
                EmbedSecondFloorView embedSecondFloorView6 = this.embedSecondFloorView;
                ckf.d(embedSecondFloorView6);
                embedSecondFloorView6.onWebViewResume();
                if (view != null) {
                    ckf.f(viewGroup, "contentView");
                    kew.a(viewGroup, view);
                }
                kew.o(this, new VideoShopView$initBigCardIfNeeded$3(this));
                Context context2 = getContext();
                ckf.f(context2, "context");
                if (r54.x(context2)) {
                    TUrlImageView tUrlImageView2 = this.videoShopBigCardPlayButton;
                    if (tUrlImageView2 != null) {
                        kew.C(tUrlImageView2);
                    } else {
                        ckf.y("videoShopBigCardPlayButton");
                        throw null;
                    }
                }
                TUrlImageView tUrlImageView3 = this.videoShopBigCardPlayButton;
                if (tUrlImageView3 != null) {
                    tUrlImageView3.setImageUrl(this.KEY_PAUSE_BUTTON_IMAGE_URL);
                    TUrlImageView tUrlImageView4 = this.videoShopBigCardPlayButton;
                    if (tUrlImageView4 != null) {
                        tUrlImageView4.setOnClickListener(new a());
                        TUrlImageView tUrlImageView5 = this.videoShopBigCardMuteButton;
                        if (tUrlImageView5 != null) {
                            tUrlImageView5.setImageUrl(this.KEY_MUTE_BUTTON_IMAGE_URL);
                            TUrlImageView tUrlImageView6 = this.videoShopBigCardMuteButton;
                            if (tUrlImageView6 != null) {
                                tUrlImageView6.setOnClickListener(new b());
                                EmbedSecondFloorView embedSecondFloorView7 = this.embedSecondFloorView;
                                if (embedSecondFloorView7 != null) {
                                    embedSecondFloorView7.l(true);
                                }
                                viewGroup.setOnClickListener(new c());
                                return;
                            }
                            ckf.y("videoShopBigCardMuteButton");
                            throw null;
                        }
                        ckf.y("videoShopBigCardMuteButton");
                        throw null;
                    }
                    ckf.y("videoShopBigCardPlayButton");
                    throw null;
                }
                ckf.y("videoShopBigCardPlayButton");
                throw null;
            }
            ckf.y("videoShopBGLayout");
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
    }

    private final void initVideoShopCommonBG() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db1bd578", new Object[]{this});
            return;
        }
        this.videoShopCommonBGBlackShadow = new FrameLayout(getContext());
        int parseColor = Color.parseColor("#4c000000");
        int parseColor2 = Color.parseColor("#66000000");
        int parseColor3 = Color.parseColor("#7f000000");
        int parseColor4 = Color.parseColor("#99000000");
        int parseColor5 = Color.parseColor("#b2000000");
        int parseColor6 = Color.parseColor("#cc000000");
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, ic1.h0(new Integer[]{0, 0, 0, Integer.valueOf(parseColor), Integer.valueOf(parseColor2), Integer.valueOf(parseColor3), Integer.valueOf(parseColor4), Integer.valueOf(parseColor5), Integer.valueOf(parseColor6), Integer.valueOf(parseColor6)}));
        gradientDrawable.setGradientType(0);
        FrameLayout frameLayout = this.videoShopCommonBGBlackShadow;
        if (frameLayout != null) {
            kew.S(frameLayout, gradientDrawable);
        } else {
            ckf.y("videoShopCommonBGBlackShadow");
            throw null;
        }
    }

    private final void initVideoShopHeaderBG() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b990c9a", new Object[]{this});
            return;
        }
        this.videoShopHeaderBGBlackShadow = new FrameLayout(getContext());
        int parseColor = Color.parseColor("#b2000000");
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, ic1.h0(new Integer[]{Integer.valueOf(parseColor), Integer.valueOf(parseColor)}));
        gradientDrawable.setGradientType(0);
        FrameLayout frameLayout = this.videoShopHeaderBGBlackShadow;
        if (frameLayout != null) {
            kew.S(frameLayout, gradientDrawable);
            FrameLayout frameLayout2 = this.videoShopHeaderBGBlackShadow;
            if (frameLayout2 != null) {
                kew.C(frameLayout2);
            } else {
                ckf.y("videoShopHeaderBGBlackShadow");
                throw null;
            }
        } else {
            ckf.y("videoShopHeaderBGBlackShadow");
            throw null;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void swipeDownStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f9584d", new Object[]{this});
            return;
        }
        super.swipeDownStart();
        kew.g0(getSecondHeadContainer());
        for (int i = 0; i < getSecondHeadContainer().getChildCount(); i++) {
            View childAt = getSecondHeadContainer().getChildAt(i);
            if (!ckf.b(getSecondHeadContainer().getChildAt(i), getVideoShopTabView()) && childAt.getVisibility() == 4) {
                kew.g0(childAt);
            }
        }
        FrameLayout frameLayout = this.videoShopHeaderBGBlackShadow;
        if (frameLayout != null) {
            kew.C(frameLayout);
        } else {
            ckf.y("videoShopHeaderBGBlackShadow");
            throw null;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void swipeUpEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3047ead", new Object[]{this});
            return;
        }
        kew.g0(getSecondHeadContainer());
        for (int i = 0; i < getSecondHeadContainer().getChildCount(); i++) {
            View childAt = getSecondHeadContainer().getChildAt(i);
            if (!ckf.b(getSecondHeadContainer().getChildAt(i), getVideoShopTabView()) && childAt.getVisibility() == 0) {
                kew.C(childAt);
            }
        }
        FrameLayout frameLayout = this.videoShopHeaderBGBlackShadow;
        if (frameLayout != null) {
            kew.g0(frameLayout);
            if (getBigCardMode()) {
                EmbedSecondFloorView embedSecondFloorView = this.embedSecondFloorView;
                if (embedSecondFloorView != null) {
                    embedSecondFloorView.onWebViewPause();
                }
                View view = this.secondFloorView;
                if (view != null) {
                    kew.C(view);
                    return;
                }
                return;
            }
            return;
        }
        ckf.y("videoShopHeaderBGBlackShadow");
        throw null;
    }

    public final void setVideoShopBackgroundPicUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecbb4153", new Object[]{this, str});
            return;
        }
        if (str == null) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, ic1.h0(new Integer[]{Integer.valueOf(Color.parseColor("#CCC8CB")), Integer.valueOf(Color.parseColor("#9BB8CE"))}));
            gradientDrawable.setGradientType(0);
            FrameLayout frameLayout = this.videoShopBGLayout;
            if (frameLayout != null) {
                kew.S(frameLayout, gradientDrawable);
                FrameLayout frameLayout2 = this.videoShopBGLayout;
                if (frameLayout2 != null) {
                    kew.g0(frameLayout2);
                } else {
                    ckf.y("videoShopBGLayout");
                    throw null;
                }
            } else {
                ckf.y("videoShopBGLayout");
                throw null;
            }
        } else {
            TUrlImageView tUrlImageView = new TUrlImageView(getContext());
            tUrlImageView.setImageUrl(str);
            tUrlImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            FrameLayout frameLayout3 = this.videoShopBGLayout;
            if (frameLayout3 != null) {
                kew.a(frameLayout3, tUrlImageView);
                FrameLayout frameLayout4 = this.videoShopBGLayout;
                if (frameLayout4 != null) {
                    kew.g0(frameLayout4);
                    FrameLayout frameLayout5 = this.videoShopBGLayout;
                    if (frameLayout5 != null) {
                        FrameLayout frameLayout6 = this.videoShopCommonBGBlackShadow;
                        if (frameLayout6 != null) {
                            kew.a(frameLayout5, frameLayout6);
                        } else {
                            ckf.y("videoShopCommonBGBlackShadow");
                            throw null;
                        }
                    } else {
                        ckf.y("videoShopBGLayout");
                        throw null;
                    }
                } else {
                    ckf.y("videoShopBGLayout");
                    throw null;
                }
            } else {
                ckf.y("videoShopBGLayout");
                throw null;
            }
        }
        FrameLayout frameLayout7 = this.videoShopBGLayout;
        if (frameLayout7 != null) {
            FrameLayout frameLayout8 = this.videoShopHeaderBGBlackShadow;
            if (frameLayout8 != null) {
                kew.a(frameLayout7, frameLayout8);
            } else {
                ckf.y("videoShopHeaderBGBlackShadow");
                throw null;
            }
        } else {
            ckf.y("videoShopBGLayout");
            throw null;
        }
    }
}
