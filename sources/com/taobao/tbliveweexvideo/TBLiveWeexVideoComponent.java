package com.taobao.tbliveweexvideo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaAdapteManager;
import com.taobao.tbliveweexvideo.a;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.Constants;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXComponentProp;
import com.taobao.weex.ui.component.WXVContainer;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import tb.ew0;
import tb.gf4;
import tb.r7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBLiveWeexVideoComponent extends WXComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long MEDIA_ERR_ABORTED = 1;
    private static final long MEDIA_ERR_DECODE = 3;
    private static final long MEDIA_ERR_NETWORK = 2;
    private static final long MEDIA_ERR_SRC_NOT_SUPPORTED = 4;
    private static final String ON_LIVE_START_ACTION = "com.taobao.taolive.start";
    private static final String ON_VIDEO_START_ACTION = "com.taobao.avplayer.start";
    private static final String TAG = "TBLiveWeexVideoComponent";
    private static final String WEEX_NATIVE_SHOP_NAME = "com.alibaba.triver.triver_shop.newShop.NativeShop";
    private static final String WEEX_SHOP_ACTIVITY_NAME = "com.alibaba.triver.triver_shop.newShop.ShopActivity";
    private static final String WEEX_VIDEO_EVENT_CANPLAYTHROUGH = "canplaythrough";
    private static final String WEEX_VIDEO_EVENT_COMPLETED = "ended";
    private static final String WEEX_VIDEO_EVENT_ERROR = "error";
    private static final String WEEX_VIDEO_EVENT_FAIL = "fail";
    private static final String WEEX_VIDEO_EVENT_FINISHED = "finish";
    private static final String WEEX_VIDEO_EVENT_FIRST_FRAME_RENDERED = "firstvideoframerendered";
    private static final String WEEX_VIDEO_EVENT_PAUSED = "pause";
    private static final String WEEX_VIDEO_EVENT_PLAYING = "playing";
    private static final String WEEX_VIDEO_EVENT_STALLED = "stalled";
    private static final String WEEX_VIDEO_EVENT_STARTED = "start";
    private static final String WEEX_VIDEO_EVENT_TIMEUPDATE = "timeupdate";
    private boolean mIsPlayingBeforeActivityPause;
    private com.taobao.tbliveweexvideo.a mVideoView;
    private boolean mSendBroadcast = false;
    private boolean mReceiveBroadcast = false;
    private boolean hasRegistered = false;
    private BroadcastReceiver mExternReceiver = new BroadcastReceiver() { // from class: com.taobao.tbliveweexvideo.TBLiveWeexVideoComponent.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbliveweexvideo/TBLiveWeexVideoComponent$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action) && action.equals("com.taobao.avplayer.start") && TBLiveWeexVideoComponent.access$000(TBLiveWeexVideoComponent.this) != null) {
                TBLiveWeexVideoComponent.access$000(TBLiveWeexVideoComponent.this).a();
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements a.AbstractC0765a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.tbliveweexvideo.a.AbstractC0765a
        public void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25ce1554", new Object[]{this, new Long(j)});
                return;
            }
            TBLiveWeexVideoComponent.access$100();
            HashMap hashMap = new HashMap();
            hashMap.put("code", Long.valueOf(TBLiveWeexVideoComponent.access$200(TBLiveWeexVideoComponent.this, j)));
            if (TBLiveWeexVideoComponent.this.getEvents().contains("error")) {
                WXSDKManager.getInstance().fireEvent(TBLiveWeexVideoComponent.this.getInstanceId(), TBLiveWeexVideoComponent.this.getRef(), "error", hashMap);
            }
            if (TBLiveWeexVideoComponent.this.getEvents().contains("fail")) {
                WXSDKManager.getInstance().fireEvent(TBLiveWeexVideoComponent.this.getInstanceId(), TBLiveWeexVideoComponent.this.getRef(), "fail", hashMap);
            }
        }

        @Override // com.taobao.tbliveweexvideo.a.AbstractC0765a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4903de7", new Object[]{this});
                return;
            }
            TBLiveWeexVideoComponent.access$100();
            if (TBLiveWeexVideoComponent.this.getEvents().contains("stalled")) {
                WXSDKManager.getInstance().fireEvent(TBLiveWeexVideoComponent.this.getInstanceId(), TBLiveWeexVideoComponent.this.getRef(), "stalled");
            }
        }

        @Override // com.taobao.tbliveweexvideo.a.AbstractC0765a
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7269c7e3", new Object[]{this});
                return;
            }
            TBLiveWeexVideoComponent.access$100();
            if (TBLiveWeexVideoComponent.this.getEvents().contains(TBLiveWeexVideoComponent.WEEX_VIDEO_EVENT_CANPLAYTHROUGH)) {
                WXSDKManager.getInstance().fireEvent(TBLiveWeexVideoComponent.this.getInstanceId(), TBLiveWeexVideoComponent.this.getRef(), TBLiveWeexVideoComponent.WEEX_VIDEO_EVENT_CANPLAYTHROUGH);
            }
            if (TBLiveWeexVideoComponent.this.getEvents().contains("start")) {
                WXSDKManager.getInstance().fireEvent(TBLiveWeexVideoComponent.this.getInstanceId(), TBLiveWeexVideoComponent.this.getRef(), "start");
            }
        }

        @Override // com.taobao.tbliveweexvideo.a.AbstractC0765a
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
                return;
            }
            TBLiveWeexVideoComponent.access$100();
            if (TBLiveWeexVideoComponent.this.getEvents().contains(TBLiveWeexVideoComponent.WEEX_VIDEO_EVENT_COMPLETED)) {
                WXSDKManager.getInstance().fireEvent(TBLiveWeexVideoComponent.this.getInstanceId(), TBLiveWeexVideoComponent.this.getRef(), TBLiveWeexVideoComponent.WEEX_VIDEO_EVENT_COMPLETED);
            }
            if (TBLiveWeexVideoComponent.this.getEvents().contains("finish")) {
                WXSDKManager.getInstance().fireEvent(TBLiveWeexVideoComponent.this.getInstanceId(), TBLiveWeexVideoComponent.this.getRef(), "finish");
            }
        }

        @Override // com.taobao.tbliveweexvideo.a.AbstractC0765a
        public void onFirstFrameRendered() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db6440b8", new Object[]{this});
                return;
            }
            TBLiveWeexVideoComponent.access$100();
            if (TBLiveWeexVideoComponent.this.getEvents().contains(TBLiveWeexVideoComponent.WEEX_VIDEO_EVENT_FIRST_FRAME_RENDERED)) {
                WXSDKManager.getInstance().fireEvent(TBLiveWeexVideoComponent.this.getInstanceId(), TBLiveWeexVideoComponent.this.getRef(), TBLiveWeexVideoComponent.WEEX_VIDEO_EVENT_FIRST_FRAME_RENDERED);
            }
        }

        @Override // com.taobao.tbliveweexvideo.a.AbstractC0765a
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
                return;
            }
            TBLiveWeexVideoComponent.access$100();
            if (TBLiveWeexVideoComponent.this.getEvents().contains("pause")) {
                WXSDKManager.getInstance().fireEvent(TBLiveWeexVideoComponent.this.getInstanceId(), TBLiveWeexVideoComponent.this.getRef(), "pause");
            }
        }

        @Override // com.taobao.tbliveweexvideo.a.AbstractC0765a
        public void onPrepared() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc853dc3", new Object[]{this});
                return;
            }
            TBLiveWeexVideoComponent.access$100();
            if (TBLiveWeexVideoComponent.this.getEvents().contains(TBLiveWeexVideoComponent.WEEX_VIDEO_EVENT_CANPLAYTHROUGH)) {
                WXSDKManager.getInstance().fireEvent(TBLiveWeexVideoComponent.this.getInstanceId(), TBLiveWeexVideoComponent.this.getRef(), TBLiveWeexVideoComponent.WEEX_VIDEO_EVENT_CANPLAYTHROUGH);
            }
            if (TBLiveWeexVideoComponent.this.getEvents().contains("start")) {
                WXSDKManager.getInstance().fireEvent(TBLiveWeexVideoComponent.this.getInstanceId(), TBLiveWeexVideoComponent.this.getRef(), "start");
            }
        }

        @Override // com.taobao.tbliveweexvideo.a.AbstractC0765a
        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
                return;
            }
            TBLiveWeexVideoComponent.access$100();
            if (TBLiveWeexVideoComponent.access$300(TBLiveWeexVideoComponent.this)) {
                TBLiveWeexVideoComponent.access$400(TBLiveWeexVideoComponent.this);
            }
            if (TBLiveWeexVideoComponent.this.getEvents().contains(TBLiveWeexVideoComponent.WEEX_VIDEO_EVENT_PLAYING)) {
                WXSDKManager.getInstance().fireEvent(TBLiveWeexVideoComponent.this.getInstanceId(), TBLiveWeexVideoComponent.this.getRef(), TBLiveWeexVideoComponent.WEEX_VIDEO_EVENT_PLAYING);
            }
        }
    }

    public TBLiveWeexVideoComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
    }

    public static /* synthetic */ com.taobao.tbliveweexvideo.a access$000(TBLiveWeexVideoComponent tBLiveWeexVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tbliveweexvideo.a) ipChange.ipc$dispatch("b117ce6c", new Object[]{tBLiveWeexVideoComponent});
        }
        return tBLiveWeexVideoComponent.mVideoView;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return TAG;
    }

    public static /* synthetic */ long access$200(TBLiveWeexVideoComponent tBLiveWeexVideoComponent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8e85eef", new Object[]{tBLiveWeexVideoComponent, new Long(j)})).longValue();
        }
        return tBLiveWeexVideoComponent.covertErrCode(j);
    }

    public static /* synthetic */ boolean access$300(TBLiveWeexVideoComponent tBLiveWeexVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eaf2804c", new Object[]{tBLiveWeexVideoComponent})).booleanValue();
        }
        return tBLiveWeexVideoComponent.mSendBroadcast;
    }

    public static /* synthetic */ void access$400(TBLiveWeexVideoComponent tBLiveWeexVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f64ba7", new Object[]{tBLiveWeexVideoComponent});
        } else {
            tBLiveWeexVideoComponent.onLiveStartBroadcast();
        }
    }

    private long covertErrCode(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ddecd9c", new Object[]{this, new Long(j)})).longValue();
        }
        if (j == -5 || j == -60) {
            return 2L;
        }
        if (j == -10000) {
            return 3L;
        }
        if (j == -1128613112 || j == -1296385272 || j == -1330794744) {
            return 4L;
        }
        return j;
    }

    public static /* synthetic */ Object ipc$super(TBLiveWeexVideoComponent tBLiveWeexVideoComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case 196973982:
                super.notifyAppearStateChange((String) objArr[0], (String) objArr[1]);
                return null;
            case 474982114:
                super.onActivityResume();
                return null;
            case 1692842255:
                super.onActivityPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbliveweexvideo/TBLiveWeexVideoComponent");
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        try {
            if (!(this.mExternReceiver == null || getContext() == null || !this.hasRegistered)) {
                getContext().unregisterReceiver(this.mExternReceiver);
                this.hasRegistered = false;
                this.mExternReceiver = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            com.taobao.tbliveweexvideo.a aVar = this.mVideoView;
            if (aVar != null) {
                aVar.a();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @JSMethod
    public void getCurrentTime(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e755d9f1", new Object[]{this, jSCallback});
        } else if (this.mVideoView != null && jSCallback != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("result", Long.valueOf(this.mVideoView.b()));
            jSCallback.invoke(hashMap);
        }
    }

    @JSMethod
    public void getMuted(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1de3d4c", new Object[]{this, jSCallback});
        } else if (this.mVideoView != null && jSCallback != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("result", Boolean.valueOf(this.mVideoView.c()));
            jSCallback.invoke(hashMap);
        }
    }

    public void getVideoHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("867fced3", new Object[]{this});
            return;
        }
        com.taobao.tbliveweexvideo.a aVar = this.mVideoView;
        if (aVar != null) {
            aVar.d();
        }
    }

    public void getVideoWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe551208", new Object[]{this});
            return;
        }
        com.taobao.tbliveweexvideo.a aVar = this.mVideoView;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void notifyAppearStateChange(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbd959e", new Object[]{this, str, str2});
            return;
        }
        super.notifyAppearStateChange(str, str2);
        StringBuilder sb = new StringBuilder("notifyAppearStateChange --- wxEventType = ");
        sb.append(str);
        sb.append(" direction = ");
        sb.append(str2);
    }

    @Override // com.taobao.weex.ui.component.WXComponent, tb.yae
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        super.onActivityPause();
        com.taobao.tbliveweexvideo.a aVar = this.mVideoView;
        if (aVar != null) {
            this.mIsPlayingBeforeActivityPause = aVar.g();
            this.mVideoView.h();
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent, tb.yae
    public void onActivityResume() {
        com.taobao.tbliveweexvideo.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        super.onActivityResume();
        if (this.mIsPlayingBeforeActivityPause && (aVar = this.mVideoView) != null) {
            aVar.i();
        }
    }

    @JSMethod
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        com.taobao.tbliveweexvideo.a aVar = this.mVideoView;
        if (aVar != null) {
            aVar.h();
        }
    }

    @JSMethod
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        com.taobao.tbliveweexvideo.a aVar = this.mVideoView;
        if (aVar != null) {
            aVar.i();
        }
    }

    @WXComponentProp(name = "autoplay")
    public void setAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c396e48", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.tbliveweexvideo.a aVar = this.mVideoView;
        if (aVar != null) {
            aVar.j(z);
        }
    }

    @WXComponentProp(name = "controls")
    public void setControls(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b78a5cf5", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.tbliveweexvideo.a aVar = this.mVideoView;
        if (aVar != null) {
            aVar.k(z);
        }
    }

    @JSMethod
    public void setCurrentTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f105f79", new Object[]{this, new Long(j)});
            return;
        }
        long j2 = j * 1000;
        com.taobao.tbliveweexvideo.a aVar = this.mVideoView;
        if (aVar != null) {
            aVar.l(j2);
        }
    }

    @WXComponentProp(name = "landscape")
    public void setLandscape(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ae57e54", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.tbliveweexvideo.a aVar = this.mVideoView;
        if (aVar != null) {
            aVar.m(z);
        }
    }

    @WXComponentProp(name = "loop")
    public void setLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d0b0c7", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.tbliveweexvideo.a aVar = this.mVideoView;
        if (aVar != null) {
            aVar.n(z);
        }
    }

    @JSMethod
    public void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.tbliveweexvideo.a aVar = this.mVideoView;
        if (aVar != null) {
            aVar.o(z);
        }
    }

    @WXComponentProp(name = Constants.Name.PLAY_STATUS)
    public void setPlayStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db5ead9", new Object[]{this, str});
            return;
        }
        new StringBuilder("setPlayStatus-------playStatus = ").append(str);
        if (this.mVideoView == null) {
            return;
        }
        if ("pause".equals(str)) {
            this.mVideoView.h();
        } else if ("play".equals(str)) {
            this.mVideoView.i();
        }
    }

    @WXComponentProp(name = "poster")
    public void setPoster(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("846fd9a0", new Object[]{this, str});
        }
    }

    @WXComponentProp(name = "size")
    public void setSize(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("908775d4", new Object[]{this, str});
            return;
        }
        com.taobao.tbliveweexvideo.a aVar = this.mVideoView;
        if (aVar != null) {
            aVar.q(str);
        }
    }

    @WXComponentProp(name = "src")
    public void setSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
            return;
        }
        com.taobao.tbliveweexvideo.a aVar = this.mVideoView;
        if (aVar != null) {
            aVar.r(str);
        }
    }

    @JSMethod
    public void setVolume(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942b681", new Object[]{this, new Long(j)});
            return;
        }
        com.taobao.tbliveweexvideo.a aVar = this.mVideoView;
        if (aVar != null) {
            aVar.s((float) j);
        }
    }

    private void onLiveStartBroadcast() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9f4251", new Object[]{this});
            return;
        }
        Intent intent = new Intent("com.taobao.taolive.start");
        gf4 gf4Var = MediaAdapteManager.mConfigAdapter;
        if (gf4Var != null && ew0.s(gf4Var.getConfig("MediaLive", "EnableVideoStartBroadcastMuteState", "true"))) {
            com.taobao.tbliveweexvideo.a aVar = this.mVideoView;
            if (aVar != null) {
                z = aVar.c();
            }
            intent.putExtra("isMute", z);
        }
        if (getContext() != null) {
            getContext().sendBroadcast(intent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0120 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.taobao.weex.ui.component.WXComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View initComponentHostView(android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbliveweexvideo.TBLiveWeexVideoComponent.initComponentHostView(android.content.Context):android.view.View");
    }

    private void initVideoView(String str, String str2, String str3, String str4, String str5) {
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88ba049", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        if (getInstance() != null) {
            str6 = getInstance().getBundleUrl();
        } else {
            str6 = "unknown";
        }
        String str7 = "live";
        r7t r7tVar = null;
        if (str7.equals(str)) {
            if (!TextUtils.isEmpty(str2)) {
                r7tVar = new r7t(str2);
                r7tVar.y = str3;
                r7tVar.B = str4;
                r7tVar.q = "MediaLive";
                r7tVar.C = str5;
            }
            this.mVideoView = new c(getContext(), true, str6, r7tVar);
        } else {
            str7 = "video";
            if (str7.equals(str)) {
                this.mVideoView = new c(getContext(), false, str6, null);
            } else if ("interact".equals(str)) {
                this.mVideoView = new b(getContext());
                str7 = "interact";
            } else {
                this.mVideoView = new c(getContext(), false, str6, null);
            }
        }
        this.mVideoView.p(new a());
        HashMap hashMap = new HashMap();
        hashMap.put("url", str6);
        hashMap.put("type", str7);
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_WeexVideo", 2201, "Page_WeexVideo_Initialization", "", "0", hashMap).build());
    }
}
