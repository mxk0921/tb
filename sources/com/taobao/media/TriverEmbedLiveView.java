package com.taobao.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.engine.api.embedview.IEmbedCallback;
import com.alibaba.ariver.integration.embedview.BaseEmbedView;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.MediaPlayCenter;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.mediaplay.player.MediaAspectRatio;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Map;
import tb.a7m;
import tb.asc;
import tb.m7r;
import tb.pg1;
import tb.t2o;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TriverEmbedLiveView extends BaseEmbedView implements asc, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String COMPONENT_NAME = "avtriverlive";
    public static final String TYPE = "live-player";
    private WeakReference<Context> mContextRef;
    public String mFrom;
    public MediaPlayCenter mMediaPlayCenter;
    public String mPlayScenes;
    public FrameLayout mRootView;
    public String mSrc;
    public String mMode = "live";
    public boolean mAutoplay = false;
    public boolean mMuted = false;
    public String mOrientation = "vertical";
    public String mObjectFit = "contain";
    public float mMinCache = 1.0f;
    public float mMaxCache = 3.0f;

    static {
        t2o.a(774897686);
        t2o.a(774897787);
    }

    private void initPlayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b36df418", new Object[]{this});
        } else if (this.mMediaPlayCenter == null) {
            MediaPlayCenter mediaPlayCenter = new MediaPlayCenter(this.mContextRef.get());
            this.mMediaPlayCenter = mediaPlayCenter;
            mediaPlayCenter.setUsingInterface(COMPONENT_NAME);
            if (!TextUtils.isEmpty(this.mFrom)) {
                this.mMediaPlayCenter.setBizCode(this.mFrom);
            }
            if (!TextUtils.isEmpty(this.mPlayScenes)) {
                this.mMediaPlayCenter.setPlayScenes(this.mPlayScenes);
            }
            this.mMediaPlayCenter.setMediaUrl(this.mSrc);
            if (pg1.ATOM_EXT_fill.equals(this.mObjectFit)) {
                this.mMediaPlayCenter.setMediaAspectRatio(MediaAspectRatio.DW_CENTER_CROP);
            } else {
                this.mMediaPlayCenter.setMediaAspectRatio(MediaAspectRatio.DW_FIT_CENTER);
            }
            this.mMediaPlayCenter.setPlayerType(3);
            this.mMediaPlayCenter.setScenarioType(0);
            this.mMediaPlayCenter.setEmbedLivePlay(true);
            this.mMediaPlayCenter.setNeedPlayControlView(false);
            this.mMediaPlayCenter.setBusinessId("TBEmbedLive");
            this.mMediaPlayCenter.hideController();
            this.mMediaPlayCenter.setup();
            if ("horizontal".equals(this.mOrientation)) {
                this.mMediaPlayCenter.toggleScreen();
            }
            if (this.mAutoplay) {
                this.mMediaPlayCenter.start();
                sendState(2007);
            }
            this.mMediaPlayCenter.setMediaLifecycleListener(this);
        }
    }

    public static /* synthetic */ Object ipc$super(TriverEmbedLiveView triverEmbedLiveView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 1664325763) {
            super.onCreate((Map) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/media/TriverEmbedLiveView");
        }
    }

    private void parseParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79431965", new Object[]{this, map});
        } else if (map != null && map.size() > 0) {
            if (!TextUtils.isEmpty(map.get("src"))) {
                this.mSrc = map.get("src");
            }
            if (!TextUtils.isEmpty(map.get("mode"))) {
                this.mMode = map.get("mode");
            }
            if (!TextUtils.isEmpty(map.get("orientation"))) {
                this.mOrientation = map.get("orientation");
            }
            if (!TextUtils.isEmpty(map.get(pg1.ATOM_EXT_UDL_object_fit))) {
                this.mObjectFit = map.get(pg1.ATOM_EXT_UDL_object_fit);
            }
            if (!TextUtils.isEmpty(map.get("from"))) {
                this.mFrom = map.get("from");
            }
            if (!TextUtils.isEmpty(map.get(a7m.VIDEO_PLAY_SCENES))) {
                this.mPlayScenes = map.get(a7m.VIDEO_PLAY_SCENES);
            }
            try {
                if (!TextUtils.isEmpty(map.get("muted"))) {
                    this.mMuted = Boolean.parseBoolean(map.get("muted"));
                }
                if (!TextUtils.isEmpty(map.get("autoplay"))) {
                    this.mAutoplay = Boolean.parseBoolean(map.get("autoplay"));
                }
            } catch (Exception unused) {
            }
            try {
                if (!TextUtils.isEmpty(map.get("min-cache"))) {
                    this.mMinCache = Float.parseFloat(map.get("min-cache"));
                }
                if (!TextUtils.isEmpty(map.get("max-cache"))) {
                    this.mMaxCache = Float.parseFloat(map.get("max-cache"));
                }
            } catch (Exception unused2) {
            }
        }
    }

    private void parseVideoParams(JSONObject jSONObject) {
        String string;
        String string2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b21706db", new Object[]{this, jSONObject});
            return;
        }
        try {
            if (!TextUtils.isEmpty(jSONObject.getString("src"))) {
                this.mSrc = jSONObject.getString("src");
            }
            if (!TextUtils.isEmpty(jSONObject.getString("mode"))) {
                this.mMode = jSONObject.getString("mode");
            }
            if (!TextUtils.isEmpty(jSONObject.getString("orientation"))) {
                this.mOrientation = jSONObject.getString("orientation");
            }
            if (!TextUtils.isEmpty(jSONObject.getString(pg1.ATOM_EXT_UDL_object_fit)) || !TextUtils.isEmpty(jSONObject.getString("objectFit"))) {
                if (TextUtils.isEmpty(jSONObject.getString(pg1.ATOM_EXT_UDL_object_fit))) {
                    str = jSONObject.getString("objectFit");
                } else {
                    str = jSONObject.getString(pg1.ATOM_EXT_UDL_object_fit);
                }
                this.mObjectFit = str;
            }
            if (!TextUtils.isEmpty(jSONObject.getString("muted"))) {
                this.mMuted = Boolean.parseBoolean(jSONObject.getString("muted"));
            }
            if (!TextUtils.isEmpty(jSONObject.getString("autoplay"))) {
                this.mAutoplay = Boolean.parseBoolean(jSONObject.getString("autoplay"));
            }
            if (!TextUtils.isEmpty(jSONObject.getString("min-cache")) || !TextUtils.isEmpty(jSONObject.getString("minCache"))) {
                if (TextUtils.isEmpty(jSONObject.getString("min-cache"))) {
                    string2 = jSONObject.getString("minCache");
                } else {
                    string2 = jSONObject.getString("min-cache");
                }
                this.mMinCache = Float.parseFloat(string2);
            }
            if (!TextUtils.isEmpty(jSONObject.getString("max-cache")) || !TextUtils.isEmpty(jSONObject.getString("maxCache"))) {
                if (TextUtils.isEmpty(jSONObject.getString("max-cache"))) {
                    string = jSONObject.getString("maxCache");
                } else {
                    string = jSONObject.getString("max-cache");
                }
                this.mMaxCache = Float.parseFloat(string);
            }
        } catch (Exception unused) {
        }
    }

    private void sendError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd8093fc", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", (Object) Integer.valueOf(i));
        sendEvent("onChangeState", jSONObject, new IEmbedCallback() { // from class: com.taobao.media.TriverEmbedLiveView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.ariver.engine.api.embedview.IEmbedCallback
            public void onResponse(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8435f409", new Object[]{this, jSONObject2});
                } else {
                    AVSDKLog.d("EmbedLiveView", "sendError");
                }
            }
        });
    }

    private void sendFullScreenChange(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7398da1a", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (z2) {
            if (z) {
                jSONObject.put("direction", "horizontal");
            } else {
                jSONObject.put("direction", "vertical");
            }
            jSONObject.put("fullScreen", (Object) Boolean.TRUE);
        } else {
            jSONObject.put("direction", "vertical");
            jSONObject.put("fullScreen", (Object) Boolean.FALSE);
        }
        sendEvent("onFullScreenChange", jSONObject, new IEmbedCallback() { // from class: com.taobao.media.TriverEmbedLiveView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.ariver.engine.api.embedview.IEmbedCallback
            public void onResponse(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8435f409", new Object[]{this, jSONObject2});
                }
            }
        });
    }

    private void sendState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e69cf13", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", (Object) String.valueOf(i));
        sendEvent("onChangeState", jSONObject, new IEmbedCallback() { // from class: com.taobao.media.TriverEmbedLiveView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.ariver.engine.api.embedview.IEmbedCallback
            public void onResponse(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8435f409", new Object[]{this, jSONObject2});
                }
            }
        });
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public Bitmap getSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a92c69f", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return TYPE;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public View getView(int i, int i2, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcdbb931", new Object[]{this, new Integer(i), new Integer(i2), str, str2, map});
        }
        if (this.mRootView == null) {
            this.mRootView = new FrameLayout(this.mContextRef.get());
        }
        parseParams(map);
        return this.mRootView;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onAttachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bdbec2", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onCreate(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63339883", new Object[]{this, map});
            return;
        }
        super.onCreate(map);
        PageContext pageContext = this.mOuterPage.getPageContext();
        if (pageContext != null) {
            this.mContextRef = new WeakReference<>(pageContext.getActivity());
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        MediaPlayCenter mediaPlayCenter = this.mMediaPlayCenter;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.release();
            this.mMediaPlayCenter.destroy();
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDetachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850d0fb4", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onEmbedViewVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c81239", new Object[]{this, new Integer(i)});
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
        }
    }

    @Override // tb.asc
    public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
        } else if (-400 > i && i > -500) {
            sendError(m7r.ACTIONBAR_MENU_RIGHT);
        } else if (-500 >= i && i > -600) {
            sendError(m7r.ACTIONBAR_MENU_LIST);
        } else if (i == -5) {
            sendError(1008);
        } else {
            sendError(1023);
        }
    }

    @Override // tb.asc
    public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
        }
    }

    @Override // tb.asc
    public void onMediaPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.asc
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
        } else {
            sendState(2004);
        }
    }

    @Override // tb.asc
    public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
        }
    }

    @Override // tb.asc
    public void onMediaProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // tb.asc
    public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
        } else if (mediaPlayScreenType == MediaPlayScreenType.LANDSCAPE_FULL_SCREEN) {
            sendFullScreenChange(true, true);
        } else if (mediaPlayScreenType == MediaPlayScreenType.PORTRAIT_FULL_SCREEN) {
            sendFullScreenChange(false, true);
        } else if (mediaPlayScreenType == MediaPlayScreenType.NORMAL) {
            sendFullScreenChange(false, false);
        }
    }

    @Override // tb.asc
    public void onMediaSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.asc
    public void onMediaStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f694024", new Object[]{this});
        } else {
            sendState(2004);
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedRender(JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb20669", new Object[]{this, jSONObject, bridgeCallback});
        } else if (jSONObject != null && jSONObject.size() != 0) {
            parseVideoParams(jSONObject);
            if (!TextUtils.isEmpty(this.mSrc) && this.mMediaPlayCenter == null) {
                initPlayer();
            }
            MediaPlayCenter mediaPlayCenter = this.mMediaPlayCenter;
            if (mediaPlayCenter != null && mediaPlayCenter.getView().getParent() == null) {
                this.mRootView.addView(this.mMediaPlayCenter.getView(), new FrameLayout.LayoutParams(-1, -1, 17));
            }
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43aa2a2d", new Object[]{this, new Integer(i), strArr, iArr});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b457ef63", new Object[]{this});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.mMediaPlayCenter;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.release();
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb053b0e", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void sendEvent(String str, JSONObject jSONObject, final IEmbedCallback iEmbedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2b74017", new Object[]{this, str, jSONObject, iEmbedCallback});
        } else if (this.mOuterPage != null) {
            JSONObject jSONObject2 = new JSONObject();
            if (!str.equals(RVEvents.ON_TO_WEBVIEW_MESSAGE)) {
                str = "nbcomponent." + getType() + "." + str;
            }
            if (jSONObject != null) {
                jSONObject.put("element", (Object) this.mViewId);
                jSONObject2.put("data", (Object) jSONObject);
            }
            Render render = this.mOuterPage.getRender();
            EngineUtils.sendToRender(render, render.getEngine().getEngineRouter().getWorkerById(EngineUtils.getWorkerId(render)), str, jSONObject2, new SendToRenderCallback() { // from class: com.taobao.media.TriverEmbedLiveView.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback
                public void onCallBack(JSONObject jSONObject3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("99ed7a65", new Object[]{this, jSONObject3});
                        return;
                    }
                    IEmbedCallback iEmbedCallback2 = iEmbedCallback;
                    if (iEmbedCallback2 != null) {
                        iEmbedCallback2.onResponse(jSONObject3);
                    }
                }
            });
        } else {
            throw new IllegalStateException("You should call super.onCreate first!!!");
        }
    }

    public void setRequestHeader(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f39f9d24", new Object[]{this, map});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.mMediaPlayCenter;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.setRequestHeader(map);
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedMessage(String str, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("231420a4", new Object[]{this, str, jSONObject, bridgeCallback});
            return;
        }
        try {
            if (this.mMediaPlayCenter != null) {
                if ("play".equals(str)) {
                    this.mMediaPlayCenter.setup();
                    sendState(2007);
                    this.mMediaPlayCenter.start();
                } else if ("pause".equals(str)) {
                    this.mMediaPlayCenter.release();
                    sendState(2005);
                } else if ("resume".equals(str)) {
                    this.mMediaPlayCenter.setup();
                    this.mMediaPlayCenter.start();
                } else if ("stop".equals(str)) {
                    this.mMediaPlayCenter.release();
                    sendState(2006);
                } else if ("mute".equals(str) && jSONObject != null && jSONObject.size() > 0) {
                    this.mMediaPlayCenter.mute(jSONObject.getBooleanValue("ison"));
                } else if ("requestFullScreen".equals(str) && jSONObject != null && jSONObject.size() > 0) {
                    if (jSONObject.containsKey("direction") && "-90".equals(jSONObject.getString("direction"))) {
                        this.mMediaPlayCenter.setRequestFullScreen(true);
                        this.mMediaPlayCenter.toggleScreen();
                    } else if (jSONObject.containsKey("direction") && "0".equals(jSONObject.getString("direction"))) {
                        this.mMediaPlayCenter.setRequestFullScreen(false);
                        this.mMediaPlayCenter.toggleScreen();
                    }
                }
            }
        } catch (Throwable th) {
            AVSDKLog.e("AriverLiveComp", "onReceivedMessage Error = " + th.getMessage());
            th.printStackTrace();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("fail", "true");
            bridgeCallback.sendJSONResponse(jSONObject2);
        }
    }
}
