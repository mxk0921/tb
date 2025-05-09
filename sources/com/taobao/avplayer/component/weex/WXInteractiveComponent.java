package com.taobao.avplayer.component.weex;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.s;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.Constants;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXComponentProp;
import com.taobao.weex.ui.component.WXVContainer;
import com.uc.webview.export.extension.UCClient;
import java.util.HashMap;
import java.util.Map;
import tb.a7m;
import tb.asc;
import tb.aub;
import tb.feh;
import tb.htb;
import tb.qtb;
import tb.t2o;
import tb.wua;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WXInteractiveComponent extends WXComponent<FrameLayout> implements asc, aub, htb, qtb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BusinessType = "weex1";
    private static final String COMPONENT_NAME = "wxInter";
    private static final String FULL_SCREEN_MODE = "fullScreen";
    private static final String NORMAL_SCREEN_MODE = "inlineScreen";
    private static final String SMALL_SCREEN_MODE = "smallScreen";
    private static final String WEEX_NATIVE_SHOP_NAME = "com.alibaba.triver.triver_shop.newShop.NativeShop";
    private static final String WEEX_SHOP_ACTIVITY_NAME = "com.alibaba.triver.triver_shop.newShop.ShopActivity";
    private DWAspectRatio mAspectRatio;
    private boolean mAutoPlay;
    private String mCId;
    private FrameLayout mComponentHostView;
    private String mFrom;
    private boolean mHasClickEvent;
    private boolean mHasEnd;
    private boolean mHasErrorEvent;
    private boolean mHasFinishEvent;
    private boolean mHasMutedChangeEvent;
    private boolean mHasPausedEvent;
    private boolean mHasPlayingEvent;
    private boolean mHasPreparedEvent;
    private boolean mHasScreenModeChangeEvent;
    private boolean mInit;
    private boolean mInitScene;
    private boolean mLoop;
    private String mPlayerScene;
    private String mPreload;
    private String mSrc;
    private s mTBPlayerInstance;
    private String mThumbnailSource;
    private boolean mUnresetForList;
    private HashMap<String, String> mUtParams;
    private String mVideoID;
    private String mVideoPlayScenes;
    private String mVideoSource;
    private long mVideodDuration;
    public static String TAG = "WXInteractiveComponent";
    private static String PREPARED = "prepared";
    private static String PLAYING = "playing";
    private static String PAUSED = "paused";
    private static String FINISH = "finish";
    private static String LANDSCAPE = "landscape";
    private static String ERROR = "error";
    private static String SCREENMODECHANGE = "screenModeChange";
    private static String MUTEDCHANGE = "mutedChange";
    private static String VIDEOEND = "end";
    private static String CLICK = "click";
    private static String START_LOADING = "loadstart";
    private static String END_LOADING = "loadend";
    private static String FIRST_FRAME = "firstvideoframe";
    private static String METADATA = "meta";
    public String mSplayerGroup = null;
    public int mPriority = 0;
    private boolean mLandscape = false;
    private boolean mHidePlayingIcon = false;
    private boolean mControlsViewHidden = false;
    private int mWidth = 0;
    private int mHeight = 0;
    private int mCurrentTime = 0;
    private boolean mHasPlay = false;
    private boolean mResume = false;
    private boolean mStarted = false;
    private String mLayerMode = "normal";
    private boolean mMute = false;
    private feh mLogContext = new feh(toString(), "");

    public WXInteractiveComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_adapter_WXInteractiveComponent);
    }

    private boolean checkData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa7d505d", new Object[]{this})).booleanValue();
        }
        if ((!TextUtils.isEmpty(this.mSrc) || !TextUtils.isEmpty(this.mVideoID)) && (getContext() instanceof Activity)) {
            return true;
        }
        AVSDKLog.e(this.mLogContext, " WXInteractiveComponent checkData error ");
        return false;
    }

    private void destroyInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e56f9103", new Object[]{this});
            return;
        }
        s sVar = this.mTBPlayerInstance;
        if (sVar != null && sVar.o() != null && getHostView() != null) {
            getHostView().removeView(this.mTBPlayerInstance.o());
            this.mTBPlayerInstance.h();
            this.mTBPlayerInstance = null;
        }
    }

    private boolean enableDelayDestroyInFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68506da5", new Object[]{this})).booleanValue();
        }
        return true;
    }

    private void init(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc123257", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (!this.mInit && checkData()) {
            initTBPlayerInstance();
        }
    }

    public static /* synthetic */ Object ipc$super(WXInteractiveComponent wXInteractiveComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -1470271414:
                super.addEvent((String) objArr[0]);
                return null;
            case -713828414:
                super.updateProperties((Map) objArr[0]);
                return null;
            case -415570888:
                super.recycled();
                return null;
            case 253619399:
                super.applyLayoutAndEvent((WXComponent) objArr[0]);
                return null;
            case 978838742:
                super.removeEventFromView((String) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/component/weex/WXInteractiveComponent");
        }
    }

    private boolean isFixed(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a90b1b9a", new Object[]{this, wXComponent})).booleanValue();
        }
        if (getStyles().isFixed()) {
            return true;
        }
        if (wXComponent.getParent() == null || !isFixed(wXComponent.getParent())) {
            return false;
        }
        return true;
    }

    private boolean isHiv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14ba8d16", new Object[]{this})).booleanValue();
        }
        if (!TextUtils.isEmpty(this.mCId)) {
            return true;
        }
        return false;
    }

    private boolean isSticky(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52045323", new Object[]{this, wXComponent})).booleanValue();
        }
        if (wXComponent.isSticky()) {
            return true;
        }
        if (wXComponent.getParent() == null || !isSticky(wXComponent.getParent())) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void addEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a85d704a", new Object[]{this, str});
            return;
        }
        super.addEvent(str);
        if (PREPARED.equals(str)) {
            this.mHasPreparedEvent = true;
        } else if (PLAYING.equals(str)) {
            this.mHasPlayingEvent = true;
        } else if (PAUSED.equals(str)) {
            this.mHasPausedEvent = true;
        } else if (FINISH.equals(str)) {
            this.mHasFinishEvent = true;
        } else if (ERROR.equals(str)) {
            this.mHasErrorEvent = true;
        } else if (MUTEDCHANGE.equalsIgnoreCase(str)) {
            this.mHasMutedChangeEvent = true;
        } else if (SCREENMODECHANGE.equalsIgnoreCase(str)) {
            this.mHasScreenModeChangeEvent = true;
        } else if (VIDEOEND.equals(str)) {
            this.mHasEnd = true;
        } else if (CLICK.equals(str)) {
            this.mHasClickEvent = true;
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void applyLayoutAndEvent(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1decc7", new Object[]{this, wXComponent});
            return;
        }
        appendEventToDOM("appear");
        appendEventToDOM("disappear");
        super.applyLayoutAndEvent(wXComponent);
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        destroyInner();
        this.mInit = false;
    }

    @Override // tb.qtb
    public boolean hook() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
        }
        if (this.mHasClickEvent) {
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), CLICK);
        }
        return false;
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void notifyAppearStateChange(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbd959e", new Object[]{this, str, str2});
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void onFinishLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cafc9ba3", new Object[]{this});
            return;
        }
        int layoutWidth = (int) getLayoutWidth();
        int layoutHeight = (int) getLayoutHeight();
        if (layoutWidth != this.mWidth || layoutHeight != this.mHeight) {
            this.mWidth = layoutWidth;
            this.mHeight = layoutHeight;
            if (this.mTBPlayerInstance != null) {
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("width", Integer.valueOf(this.mWidth));
                hashMap.put("height", Integer.valueOf(this.mHeight));
                this.mTBPlayerInstance.c("setFrame", hashMap);
            }
        }
    }

    @Override // tb.aub
    public void onLoopCompletion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a22ee66", new Object[]{this});
            return;
        }
        if (this.mHasFinishEvent) {
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), FINISH);
        }
        if (this.mHasEnd) {
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), VIDEOEND);
        }
    }

    @Override // tb.asc
    public void onMediaClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71919eba", new Object[]{this});
        }
    }

    @Override // tb.asc
    public void onMediaComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
            return;
        }
        this.mHasPlay = false;
        this.mCurrentTime = 0;
    }

    @Override // tb.asc
    public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
        } else if (this.mHasErrorEvent) {
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), ERROR);
        }
    }

    @Override // tb.asc
    public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
            return;
        }
        int i = (int) j;
        if (i == 3) {
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), FIRST_FRAME);
        } else if (i == 701) {
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), START_LOADING);
        } else if (i == 702) {
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), END_LOADING);
        }
    }

    @Override // tb.asc
    public void onMediaPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!z) {
            this.mHasPlay = false;
        }
        if (this.mHasPausedEvent) {
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), PAUSED);
        }
    }

    @Override // tb.asc
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
            return;
        }
        this.mHasPlay = true;
        if (this.mHasPlayingEvent) {
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), PLAYING);
        }
    }

    @Override // tb.asc
    public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
        } else if (this.mHasPreparedEvent) {
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), PREPARED);
        }
    }

    @Override // tb.asc
    public void onMediaProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        this.mCurrentTime = i;
        if (this.mVideodDuration == 0) {
            this.mVideodDuration = i3;
        }
    }

    @Override // tb.asc
    public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
        }
    }

    @Override // tb.asc
    public void onMediaSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
        } else {
            this.mCurrentTime = i;
        }
    }

    @Override // tb.asc
    public void onMediaStart() {
        s sVar;
        s sVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f694024", new Object[]{this});
            return;
        }
        this.mStarted = true;
        if (!this.mResume || this.mHasPlay || (sVar2 = this.mTBPlayerInstance) == null) {
            this.mHasPlay = true;
            int i = this.mCurrentTime;
            if (i > 0 && (sVar = this.mTBPlayerInstance) != null) {
                sVar.y(i, false);
            }
            if (this.mHasPlayingEvent) {
                WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), PLAYING);
                return;
            }
            return;
        }
        sVar2.u();
    }

    public void onSmallWindowClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dffa2877", new Object[]{this});
        } else if (this.mHasClickEvent) {
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), CLICK);
        }
    }

    @JSMethod
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        s sVar = this.mTBPlayerInstance;
        if (sVar != null) {
            sVar.u();
        }
    }

    @JSMethod
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        s sVar = this.mTBPlayerInstance;
        if (sVar != null) {
            sVar.F();
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void recycled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73ae438", new Object[]{this});
            return;
        }
        super.recycled();
        s sVar = this.mTBPlayerInstance;
        if (sVar != null && !this.mUnresetForList) {
            sVar.h();
        }
        this.mInit = false;
        this.mStarted = false;
        this.mPreload = null;
        this.mAutoPlay = false;
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void removeEventFromView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a57e4d6", new Object[]{this, str});
            return;
        }
        super.removeEventFromView(str);
        if (PREPARED.equals(str)) {
            this.mHasPreparedEvent = false;
        } else if (PLAYING.equals(str)) {
            this.mHasPlayingEvent = false;
        } else if (PAUSED.equals(str)) {
            this.mHasPausedEvent = false;
        } else if (FINISH.equals(str)) {
            this.mHasFinishEvent = false;
        } else if (ERROR.equals(str)) {
            this.mHasErrorEvent = false;
        } else if (MUTEDCHANGE.equalsIgnoreCase(str)) {
            this.mHasMutedChangeEvent = false;
        } else if (SCREENMODECHANGE.equalsIgnoreCase(str)) {
            this.mHasScreenModeChangeEvent = false;
        } else if (VIDEOEND.equals(str)) {
            this.mHasEnd = false;
        } else if (CLICK.equals(str)) {
            this.mHasClickEvent = false;
        }
    }

    @WXComponentProp(name = Constants.Name.AUTO_PLAY)
    public void setAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c396e48", new Object[]{this, new Boolean(z)});
        } else {
            this.mAutoPlay = z;
        }
    }

    @WXComponentProp(name = "autoplay")
    public void setAutoplay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c74e68", new Object[]{this, new Boolean(z)});
        } else {
            this.mAutoPlay = z;
        }
    }

    @WXComponentProp(name = "backCoverDisplay")
    public void setBackCoverDisplay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3469e799", new Object[]{this, new Boolean(z)});
        }
    }

    @WXComponentProp(name = "from")
    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else {
            this.mFrom = str;
        }
    }

    @WXComponentProp(name = "cid")
    public void setCId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ac92ad", new Object[]{this, str});
        } else {
            this.mCId = str;
        }
    }

    @WXComponentProp(name = "contentId")
    public void setContentId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71029e43", new Object[]{this, str});
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r6.equals(tb.pg1.ATOM_EXT_fill) == false) goto L_0x0026;
     */
    @com.taobao.weex.ui.component.WXComponentProp(name = "contentMode")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setContentMode(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.avplayer.component.weex.WXInteractiveComponent.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "f05e5b0b"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            r3.ipc$dispatch(r4, r2)
            return
        L_0x0015:
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 != 0) goto L_0x0058
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case -1362001767: goto L_0x003c;
                case 3143043: goto L_0x0033;
                case 727618043: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            r0 = -1
            goto L_0x0046
        L_0x0028:
            java.lang.String r0 = "aspectFill"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0031
            goto L_0x0026
        L_0x0031:
            r0 = 2
            goto L_0x0046
        L_0x0033:
            java.lang.String r1 = "fill"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0046
            goto L_0x0026
        L_0x003c:
            java.lang.String r0 = "aspectFit"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0045
            goto L_0x0026
        L_0x0045:
            r0 = 0
        L_0x0046:
            switch(r0) {
                case 0: goto L_0x0054;
                case 1: goto L_0x004f;
                case 2: goto L_0x004a;
                default: goto L_0x0049;
            }
        L_0x0049:
            goto L_0x0058
        L_0x004a:
            com.taobao.avplayer.DWAspectRatio r6 = com.taobao.avplayer.DWAspectRatio.DW_CENTER_CROP
            r5.mAspectRatio = r6
            goto L_0x0058
        L_0x004f:
            com.taobao.avplayer.DWAspectRatio r6 = com.taobao.avplayer.DWAspectRatio.DW_FIT_X_Y
            r5.mAspectRatio = r6
            goto L_0x0058
        L_0x0054:
            com.taobao.avplayer.DWAspectRatio r6 = com.taobao.avplayer.DWAspectRatio.DW_FIT_CENTER
            r5.mAspectRatio = r6
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.avplayer.component.weex.WXInteractiveComponent.setContentMode(java.lang.String):void");
    }

    @WXComponentProp(name = "controlsViewHidden")
    public void setControlsViewHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f59b86", new Object[]{this, new Boolean(z)});
        } else {
            this.mControlsViewHidden = z;
        }
    }

    @JSMethod
    public void setCurrentTime(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f1048f3", new Object[]{this, new Double(d)});
            return;
        }
        int i = (int) (d * 1000.0d);
        s sVar = this.mTBPlayerInstance;
        if (sVar != null) {
            sVar.y(i, false);
        }
    }

    @WXComponentProp(name = "fullscreenBtnHidden")
    public void setFullscreenBtnHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aa6f2e4", new Object[]{this, new Boolean(z)});
        }
    }

    @WXComponentProp(name = UCClient.UI_PARAMS_KEY_GESTURE)
    public void setGesture(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1154d506", new Object[]{this, new Boolean(z)});
        }
    }

    @WXComponentProp(name = "gestureViewHidden")
    public void setGestureViewHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6339f257", new Object[]{this, new Boolean(z)});
        }
    }

    @JSMethod
    public void setInstanceMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f5fd86b", new Object[]{this, str});
        }
    }

    @WXComponentProp(name = "instanceType")
    public void setInstanceType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a646d2c2", new Object[]{this, str});
        }
    }

    @WXComponentProp(name = "interactiveHidden")
    public void setInteractiveHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24174683", new Object[]{this, new Boolean(z)});
        }
    }

    @WXComponentProp(name = "interactiveId")
    public void setInteractiveId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b29f9a2", new Object[]{this, new Long(j)});
        }
    }

    @WXComponentProp(name = "loadingHidden")
    public void setLoadingHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8abbe8e9", new Object[]{this, new Boolean(z)});
        }
    }

    @WXComponentProp(name = "loop")
    public void setLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d0b0c7", new Object[]{this, new Boolean(z)});
        } else {
            this.mLoop = z;
        }
    }

    @WXComponentProp(name = "miniProgressViewHidden")
    public void setMiniProgressViewHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b2d5d8", new Object[]{this, new Boolean(z)});
        }
    }

    @WXComponentProp(name = "muteDisplay")
    public void setMuteDisplay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a614e6", new Object[]{this, new Boolean(z)});
        }
    }

    @WXComponentProp(name = "muted")
    public void setMuted(boolean z) {
        s sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mMute = z;
        if (this.mInit && (sVar = this.mTBPlayerInstance) != null) {
            sVar.t(z);
        }
    }

    @WXComponentProp(name = "networkErrorViewHidden")
    public void setNetworkErrorViewHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5249e42", new Object[]{this, new Boolean(z)});
        }
    }

    @WXComponentProp(name = "playErrorViewHidden")
    public void setPlayErrorViewHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b8ec8c", new Object[]{this, new Boolean(z)});
        }
    }

    @WXComponentProp(name = "playerScene")
    public void setPlayerScene(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5fa023a", new Object[]{this, str});
        } else if (!this.mInitScene) {
            this.mPlayerScene = str;
            this.mInitScene = true;
        }
    }

    @WXComponentProp(name = "playingIconHidden")
    public void setPlayingIconHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3d0a7e", new Object[]{this, new Boolean(z)});
        } else {
            this.mHidePlayingIcon = z;
        }
    }

    @WXComponentProp(name = "poster")
    public void setPoster(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("846fd9a0", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.mThumbnailSource = str;
        }
    }

    @WXComponentProp(name = "preload")
    public void setPreload(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e63c7298", new Object[]{this, str});
        } else {
            this.mPreload = str;
        }
    }

    @WXComponentProp(name = "priority")
    public void setPriority(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f878ef6", new Object[]{this, new Integer(i)});
        } else {
            this.mPriority = i;
        }
    }

    @WXComponentProp(name = "onlyShowFullscreen")
    public void setRecommendVideoOnlyShowFullscreen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("463ab8e8", new Object[]{this, new Boolean(z)});
        }
    }

    @WXComponentProp(name = "httpHeader")
    public void setRequestHeader(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af6e6bd2", new Object[]{this, hashMap});
        }
    }

    @WXComponentProp(name = "screenMode")
    public void setScreenMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d606e02", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && this.mTBPlayerInstance != null && this.mInit) {
            str.hashCode();
            if (!str.equals(FULL_SCREEN_MODE)) {
                if (str.equals(NORMAL_SCREEN_MODE) && this.mTBPlayerInstance.m(1503) == 1) {
                    this.mTBPlayerInstance.c("toggleScreen", null);
                }
            } else if (this.mTBPlayerInstance.m(1503) != 1) {
                this.mTBPlayerInstance.c("toggleScreen", null);
            }
        }
    }

    @WXComponentProp(name = "showDanmakuBtn")
    public void setShowDanmakuBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b9801", new Object[]{this, new Boolean(z)});
        }
    }

    @WXComponentProp(name = "showGoodsListBtn")
    public void setShowGoodsListBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("731daec6", new Object[]{this, new Boolean(z)});
        }
    }

    @WXComponentProp(name = "showLikeBtn")
    public void setShowLikeBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("627eff27", new Object[]{this, new Boolean(z)});
        }
    }

    @WXComponentProp(name = "showReportBtn")
    public void setShowReportBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26562c04", new Object[]{this, new Boolean(z)});
        }
    }

    @WXComponentProp(name = "shownMuteBtn")
    public void setShownMuteBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad0c2f9", new Object[]{this, new Boolean(z)});
        }
    }

    @WXComponentProp(name = wua.KEY_SMALL_WINDOW)
    public void setSmallWindow(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28bf4e38", new Object[]{this, new Boolean(z)});
        }
    }

    @WXComponentProp(name = "splayer")
    public void setSplayer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("260a9363", new Object[]{this, str});
        } else {
            this.mSplayerGroup = str;
        }
    }

    @WXComponentProp(name = "src")
    public void setSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
        } else {
            this.mSrc = str;
        }
    }

    @WXComponentProp(name = "thumbnailPlayBtnHidden")
    public void setThumbnailPlayBtnHiddenHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f67c82db", new Object[]{this, new Boolean(z)});
        }
    }

    @WXComponentProp(name = "thumbnailSrc")
    public void setThumbnailSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6bc05eb", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.mThumbnailSource = str;
        }
    }

    @WXComponentProp(name = "toastViewHidden")
    public void setToastViewHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73dfa39", new Object[]{this, new Boolean(z)});
        }
    }

    @WXComponentProp(name = "uiConfig")
    public void setUiConfig(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26981554", new Object[]{this, hashMap});
        }
    }

    @WXComponentProp(name = "unresetForList")
    public void setUnresetForList(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31bc0c3a", new Object[]{this, new Boolean(z)});
        } else {
            this.mUnresetForList = z;
        }
    }

    @WXComponentProp(name = "userId")
    public void setUserId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdec0ad5", new Object[]{this, new Long(j)});
        }
    }

    @WXComponentProp(name = "utParams")
    public void setUtParams(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d87d3265", new Object[]{this, hashMap});
        } else {
            this.mUtParams = hashMap;
        }
    }

    @WXComponentProp(name = "videoId")
    public void setVideoID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a27a7a5", new Object[]{this, str});
        } else {
            this.mVideoID = str;
        }
    }

    @WXComponentProp(name = a7m.VIDEO_PLAY_SCENES)
    public void setVideoPlayScenes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33275b65", new Object[]{this, str});
        } else {
            this.mVideoPlayScenes = str;
        }
    }

    @WXComponentProp(name = "videoRatioType")
    public void setVideoRatioType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50439a30", new Object[]{this, new Integer(i)});
        }
    }

    @WXComponentProp(name = "videoSource")
    public void setVideoSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e0c1645", new Object[]{this, str});
        } else {
            this.mVideoSource = str;
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void updateProperties(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d573d7c2", new Object[]{this, map});
            return;
        }
        super.updateProperties(map);
        init(true, true);
    }

    private void initTBPlayerInstance() {
        s sVar;
        String componentName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf8f03b", new Object[]{this});
            return;
        }
        AVSDKLog.e(this.mLogContext, "myTBVideoEmbedView initTBPlayerInstance begin.");
        s.d dVar = new s.d();
        dVar.g = (Activity) getContext();
        dVar.o = this.mFrom;
        dVar.l = this.mSrc;
        dVar.i = this.mMute;
        Activity activity = (Activity) getContext();
        if (!(activity == null || activity.getComponentName() == null || (componentName = activity.getComponentName().toString()) == null || (!componentName.contains(WEEX_NATIVE_SHOP_NAME) && !componentName.contains(WEEX_SHOP_ACTIVITY_NAME)))) {
            this.mMute = true;
            dVar.i = true;
            this.mHidePlayingIcon = true;
        }
        dVar.c0 = this.mUtParams;
        dVar.x = this.mWidth;
        dVar.m = this.mVideoID;
        dVar.j = this.mVideoSource;
        dVar.y = this.mHeight;
        dVar.A = this.mLoop;
        dVar.q = this.mAspectRatio;
        if (!TextUtils.isEmpty(this.mVideoPlayScenes)) {
            dVar.W = this.mVideoPlayScenes;
        }
        dVar.r = 2;
        dVar.Q = COMPONENT_NAME;
        dVar.n = "weex1";
        dVar.t = this;
        if (this.mLoop) {
            dVar.I = this;
        }
        dVar.G = this;
        dVar.H = this;
        if (!"highPerformance".equals(this.mPlayerScene) && !this.mControlsViewHidden && !this.mHidePlayingIcon) {
            dVar.S = true;
        }
        if (!TextUtils.isEmpty(this.mThumbnailSource)) {
            dVar.R = this.mThumbnailSource;
        }
        s c = s.c.c("", dVar);
        this.mTBPlayerInstance = c;
        feh fehVar = this.mLogContext;
        if (fehVar == null) {
            this.mLogContext = new feh(toString(), this.mTBPlayerInstance.e.e());
        } else {
            fehVar.c(c.e.e());
        }
        feh fehVar2 = this.mLogContext;
        AVSDKLog.e(fehVar2, "WXInteractiveComponent create mTBPlayerInstance finished = " + this.mTBPlayerInstance);
        if (!(getHostView() == null || (sVar = this.mTBPlayerInstance) == null || sVar.o() == null)) {
            getHostView().addView(this.mTBPlayerInstance.o());
        }
        if (this.mAutoPlay || (this.mResume && this.mStarted)) {
            this.mStarted = true;
            this.mTBPlayerInstance.F();
        } else if (METADATA.equals(this.mPreload)) {
            this.mTBPlayerInstance.c("asyncPrepareVideo", null);
        }
        this.mInit = true;
    }

    @JSMethod
    public void getCurrentTime(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e755d9f1", new Object[]{this, jSCallback});
        } else if (this.mTBPlayerInstance != null) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("result", Long.valueOf(this.mTBPlayerInstance.m(1502)));
            jSCallback.invoke(hashMap);
        }
    }

    @JSMethod
    public void getDuration(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a09e457", new Object[]{this, jSCallback});
        } else if (this.mTBPlayerInstance != null) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("result", Long.valueOf(this.mTBPlayerInstance.m(1501)));
            jSCallback.invoke(hashMap);
        }
    }

    @JSMethod
    public void getScreenMode(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e5826dc", new Object[]{this, jSCallback});
        } else if (this.mTBPlayerInstance != null && jSCallback != null) {
            HashMap hashMap = new HashMap(1);
            if (this.mTBPlayerInstance.m(1503) == 1) {
                hashMap.put("result", FULL_SCREEN_MODE);
            } else {
                hashMap.put("result", NORMAL_SCREEN_MODE);
            }
            jSCallback.invoke(hashMap);
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public FrameLayout initComponentHostView(Context context) {
        s sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("2b290a72", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.mComponentHostView = frameLayout;
        if (!this.mInit || (sVar = this.mTBPlayerInstance) == null) {
            return frameLayout;
        }
        ViewParent parent = sVar.o().getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(this.mTBPlayerInstance.o());
        }
        this.mComponentHostView.addView(this.mTBPlayerInstance.o());
        return this.mComponentHostView;
    }

    @Override // tb.htb
    public void onMutedChange(boolean z) {
        s sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff26311", new Object[]{this, new Boolean(z)});
        } else if (this.mHasMutedChangeEvent && (sVar = this.mTBPlayerInstance) != null && sVar.m(1503) != 1) {
            this.mMute = z;
            HashMap hashMap = new HashMap(1);
            hashMap.put("muted", Boolean.valueOf(z));
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), MUTEDCHANGE, hashMap);
        }
    }

    public void onNormal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c32d52d", new Object[]{this});
        } else if (this.mHasScreenModeChangeEvent) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("screenMode", NORMAL_SCREEN_MODE);
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), SCREENMODECHANGE, hashMap);
        }
    }

    public void onSmall() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d577aef", new Object[]{this});
        } else if (this.mHasScreenModeChangeEvent) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("screenMode", SMALL_SCREEN_MODE);
            WXSDKManager.getInstance().fireEvent(getInstanceId(), getRef(), SCREENMODECHANGE, hashMap);
        }
    }

    @JSMethod
    public void getMuted(JSCallback jSCallback) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1de3d4c", new Object[]{this, jSCallback});
        } else if (this.mTBPlayerInstance != null) {
            HashMap hashMap = new HashMap(1);
            if (this.mTBPlayerInstance.m(1007) != 1) {
                z = false;
            }
            hashMap.put("result", Boolean.valueOf(z));
            jSCallback.invoke(hashMap);
        }
    }

    @WXComponentProp(name = "landscape")
    public void setLandscape(boolean z) {
        s sVar;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ae57e54", new Object[]{this, new Boolean(z)});
        } else if (this.mLandscape != z) {
            this.mLandscape = z;
            if (this.mInit && (sVar = this.mTBPlayerInstance) != null) {
                if (sVar.m(1503) != 1) {
                    z2 = false;
                }
                if (z2 != this.mLandscape) {
                    this.mTBPlayerInstance.c("toggleScreen", null);
                }
            }
        }
    }

    @WXComponentProp(name = "layerMode")
    public void setLayerMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c373f563", new Object[]{this, str});
            return;
        }
        this.mLayerMode = str;
        if ("mute".equals(str)) {
            this.mMute = true;
        } else {
            this.mMute = false;
        }
    }

    @WXComponentProp(name = "playControl")
    public void setPlayControl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bb68518", new Object[]{this, str});
        } else if (!this.mInit) {
        } else {
            if ("play".equals(str)) {
                this.mHasPlay = true;
                play();
            } else if ("pause".equals(str)) {
                this.mHasPlay = false;
                pause();
            }
        }
    }

    static {
        t2o.a(451936317);
        t2o.a(774897787);
        t2o.a(452985012);
        t2o.a(452985033);
        t2o.a(452985040);
        t2o.a(452985047);
        t2o.a(452985045);
    }
}
