package com.taobao.search.musie.livevideo.video;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import java.util.ArrayList;
import java.util.List;
import tb.dwh;
import tb.ipc;
import tb.t2o;
import tb.tmu;
import tb.vvh;
import tb.yio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MusLiveVideo extends UINode implements ipc, a.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATTR_AUTO_PLAY = "autoplay";
    public static final String ATTR_BIZ_FROM = "bizFrom";
    public static final String ATTR_CONTENT_ID = "contentId";
    public static final String ATTR_CONTROLS = "controls";
    public static final String ATTR_CONTROL_BY_LIST = "controlByList";
    public static final String ATTR_LOOP = "loop";
    public static final String ATTR_MUTE = "muted";
    public static final String ATTR_OBJECT_FIT = "objectFit";
    public static final String ATTR_PLAY_SCENES = "playScenes";
    public static final String ATTR_POSTER = "poster";
    public static final String ATTR_SHOW_CENTER_PLAY_BTN = "showCenterPlayBtn";
    public static final String ATTR_SHOW_FULLSCREEN_BTN = "showFullscreenBtn";
    public static final String ATTR_SHOW_MUTE_BTN = "showMuteBtn";
    public static final String ATTR_SHOW_PLAY_BTN = "showPlayBtn";
    public static final String ATTR_SRC = "src";
    public static final String ATTR_UT_PARAMS = "utParams";
    public static final String ATTR_VIDEO_ID = "videoId";
    private static final String EVENT_ENDED = "ended";
    private static final String EVENT_ERROR = "error";
    private static final String EVENT_PAUSE = "pause";
    private static final String EVENT_PLAY = "play";
    private static final String EVENT_TIME_UPDATE = "timeupdate";
    public static final String STATUS_FINISH = "finish";
    public static final String STATUS_PLAY = "play";
    public static final String STATUS_START = "start";
    public static final String STATUS_STOP = "stop";
    public static final String VIDEO_CALLBACK = "videocallback";
    public static final String VIDEO_STATUS = "videostatus";
    public static final String VISIBILITY_STATUS = "visibility";
    public boolean controlByList;
    private String currState;
    private boolean needRemount;
    private static String KEY_DETAIL = "detail";
    private static String KEY_VIDEO_DURATION = "videoDuration";
    private static String KEY_CURRENT_TIME = tmu.CURRENT_TIME;
    private boolean paused = true;
    private boolean autoplayed = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/livevideo/video/MusLiveVideo$1");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            if (MusLiveVideo.access$000(MusLiveVideo.this) && MusLiveVideo.access$100(MusLiveVideo.this)) {
                MusLiveVideo musLiveVideo = MusLiveVideo.this;
                musLiveVideo.onMount(musLiveVideo.getInstance(), MusLiveVideo.this.getMountContent());
            }
            MusLiveVideo.access$102(MusLiveVideo.this, false);
        }
    }

    public MusLiveVideo(int i) {
        super(i);
    }

    public static /* synthetic */ boolean access$000(MusLiveVideo musLiveVideo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9edf2bb6", new Object[]{musLiveVideo})).booleanValue();
        }
        return musLiveVideo.mounted;
    }

    public static /* synthetic */ boolean access$100(MusLiveVideo musLiveVideo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5954cc37", new Object[]{musLiveVideo})).booleanValue();
        }
        return musLiveVideo.needRemount;
    }

    public static /* synthetic */ boolean access$102(MusLiveVideo musLiveVideo, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd4d03c3", new Object[]{musLiveVideo, new Boolean(z)})).booleanValue();
        }
        musLiveVideo.needRemount = z;
        return z;
    }

    private JSONObject assembleEvent(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2a09182f", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(KEY_CURRENT_TIME, (Object) Float.valueOf(i2 / 1000.0f));
        jSONObject2.put(KEY_VIDEO_DURATION, (Object) Float.valueOf(i / 1000.0f));
        jSONObject.put(KEY_DETAIL, (Object) jSONObject2);
        return jSONObject;
    }

    public static /* synthetic */ Object ipc$super(MusLiveVideo musLiveVideo, String str, Object... objArr) {
        if (str.hashCode() == -370110026) {
            super.collectBatchTasks((List) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/livevideo/video/MusLiveVideo");
    }

    private boolean isNativeStateDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("761df15e", new Object[]{this})).booleanValue();
        }
        return "disappear".equals(getInstance().getNativeState("visibility"));
    }

    private void tryControlByListByState(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a4b174", new Object[]{this, str});
        } else if (!isControlByList()) {
        } else {
            if (TextUtils.equals(str, "play")) {
                play();
            } else if (TextUtils.equals(str, "stop")) {
                stop();
                onVideoStop();
            }
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void collectBatchTasks(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f091b6", new Object[]{this, list});
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        super.collectBatchTasks(arrayList);
        if (!arrayList.isEmpty()) {
            list.addAll(arrayList);
            list.add(new a());
        }
    }

    @Override // tb.hvu
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this});
        }
        return UINodeType.VIEW;
    }

    public boolean isAutoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("382b6ad8", new Object[]{this})).booleanValue();
        }
        Boolean bool = (Boolean) getAttribute("autoplay");
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public boolean isControlByList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4805bcd3", new Object[]{this})).booleanValue();
        }
        Boolean bool = (Boolean) getAttribute("controlByList");
        if (bool == null || bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public boolean isLoop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57340079", new Object[]{this})).booleanValue();
        }
        Boolean bool = (Boolean) getAttribute("loop");
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public boolean isMuted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b8d0a6c", new Object[]{this})).booleanValue();
        }
        Boolean bool = (Boolean) getAttribute("muted");
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // tb.hvu
    public Object onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context});
        }
        return new MUSLiveVideoView(context);
    }

    @Override // tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        registerNativeStateListener("videostatus", this);
        registerNativeStateListener("visibility", this);
        MUSLiveVideoView mUSLiveVideoView = (MUSLiveVideoView) obj;
        mUSLiveVideoView.mount(this, mUSDKInstance, this, getContentWidth(), getContentHeight(), getPadding());
        autoPlayVideo(mUSLiveVideoView);
    }

    @Override // com.taobao.android.weex_framework.a.b
    public void onNativeStateChange(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d63f0e06", new Object[]{this, str, str2});
        } else if (TextUtils.equals(str, "visibility")) {
            if ("disappear".equals(str2)) {
                stop();
                onVideoStop();
                return;
            }
            tryControlByListByState(getInstance().getNativeState("videostatus"));
        } else if (!isNativeStateDisappear()) {
            this.currState = str2;
            tryControlByListByState(str2);
        }
    }

    @Override // tb.ipc
    public void onVideoFail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b4f4ea1", new Object[]{this});
            return;
        }
        dwh.f("Video", "Video Play Error");
        if (vvh.m()) {
            dwh.s("Video Play Error");
        }
        if (hasEvent("error")) {
            fireEvent("error", null);
        }
    }

    @Override // tb.ipc
    public void onVideoFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d2b296", new Object[]{this});
        } else if (!isLoop()) {
            stop();
            fireVideoFinish();
        }
    }

    @Override // tb.ipc
    public void onVideoProgressChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9115f132", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (hasEvent(EVENT_TIME_UPDATE)) {
            fireEvent(EVENT_TIME_UPDATE, assembleEvent(i2, i));
        }
        if (getInstance() != null && !getInstance().isDestroyed() && getMountContent() != null) {
            ((MUSLiveVideoView) getMountContent()).hidePoster();
        }
    }

    @MUSMethod(uiThread = true)
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        MUSLiveVideoView mUSLiveVideoView = (MUSLiveVideoView) getMountContent();
        if (mUSLiveVideoView != null) {
            mUSLiveVideoView.pause();
        }
    }

    @MUSMethod(uiThread = true)
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        MUSLiveVideoView mUSLiveVideoView = (MUSLiveVideoView) getMountContent();
        if (mUSLiveVideoView != null) {
            mUSLiveVideoView.play();
        }
    }

    @MUSMethod(uiThread = true)
    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        MUSLiveVideoView mUSLiveVideoView = (MUSLiveVideoView) getMountContent();
        if (mUSLiveVideoView != null) {
            mUSLiveVideoView.seekTo(i);
        }
    }

    @MUSNodeProp(name = "autoplay")
    public void setAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c396e48", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute("autoplay", Boolean.valueOf(z));
        }
    }

    @MUSNodeProp(name = "bizFrom")
    public void setBizFrom(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a4dd4ec", new Object[]{this, str});
        } else {
            setAttribute("bizFrom", str);
        }
    }

    @MUSNodeProp(name = "contentId")
    public void setContentId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71029e43", new Object[]{this, str});
        } else {
            setAttribute("contentId", str);
        }
    }

    @MUSNodeProp(defaultBoolean = true, name = "controlByList")
    public void setControlByList(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("908be11d", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute("controlByList", Boolean.valueOf(z));
        }
    }

    @MUSNodeProp(name = "controls")
    public void setControls(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b78a5cf5", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute("controls", Boolean.valueOf(z));
        }
    }

    @MUSNodeProp(name = "loop")
    public void setLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d0b0c7", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute("loop", Boolean.valueOf(z));
        }
    }

    @MUSNodeProp(name = "muted")
    public void setMute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e160672", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute("muted", Boolean.valueOf(z));
        }
    }

    @MUSNodeProp(name = "muted", refresh = true)
    public void setMuteRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9e026d", new Object[]{this, new Boolean(z)});
        } else if (this.mounted) {
            ((MUSLiveVideoView) getMountContent()).mute(z);
        }
    }

    @MUSNodeProp(name = "objectFit")
    public void setObjectFit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cbbb4a1", new Object[]{this, str});
        } else {
            setAttribute("objectFit", str);
        }
    }

    @MUSNodeProp(name = "playScenes")
    public void setPlayScenes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd7e5e8e", new Object[]{this, str});
        } else {
            setAttribute("playScenes", str);
        }
    }

    @MUSNodeProp(name = "poster")
    public void setPoster(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("846fd9a0", new Object[]{this, str});
        } else {
            setAttribute("poster", str);
        }
    }

    @MUSNodeProp(name = "showCenterPlayBtn")
    public void setShowCenterPlayBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8aa6379", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute("showCenterPlayBtn", Boolean.valueOf(z));
        }
    }

    @MUSNodeProp(name = "showFullscreenBtn")
    public void setShowFullscreenBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54fe940b", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute("showFullscreenBtn", Boolean.valueOf(z));
        }
    }

    @MUSNodeProp(name = "showMuteBtn")
    public void setShowMuteBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb7dffa9", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute("showMuteBtn", Boolean.valueOf(z));
        }
    }

    @MUSNodeProp(name = "showPlayBtn")
    public void setShowPlayBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a6dedc4", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute("showPlayBtn", Boolean.valueOf(z));
        }
    }

    @MUSNodeProp(name = "src")
    public void setSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
        } else {
            setAttribute("src", str);
        }
    }

    @MUSNodeProp(name = "src", refresh = true)
    public void setSrcRefresh(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea1cc2a", new Object[]{this, str});
            return;
        }
        if (this.mounted) {
            this.needRemount = true;
        }
        this.autoplayed = false;
    }

    @MUSNodeProp(name = "utParams")
    public void setUtParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86fabc22", new Object[]{this, jSONObject});
        } else {
            setAttribute("utParams", jSONObject);
        }
    }

    @MUSNodeProp(name = "videoId")
    public void setVideoId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805acfc5", new Object[]{this, str});
        } else {
            setAttribute("videoId", str);
        }
    }

    @MUSMethod(uiThread = true)
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        MUSLiveVideoView mUSLiveVideoView = (MUSLiveVideoView) getMountContent();
        if (mUSLiveVideoView != null) {
            mUSLiveVideoView.stop();
        }
    }

    public void autoPlayVideo(MUSLiveVideoView mUSLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e6c8995", new Object[]{this, mUSLiveVideoView});
            return;
        }
        this.controlByList = isControlByList();
        this.currState = getInstance().getNativeState("videostatus");
        if (!isNativeStateDisappear()) {
            if (this.controlByList) {
                if (TextUtils.equals(this.currState, "play")) {
                    mUSLiveVideoView.play();
                } else {
                    stop();
                }
            } else if (isAutoPlay() && !this.autoplayed) {
                this.autoplayed = true;
                mUSLiveVideoView.play();
            }
        }
    }

    public void fireVideoFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce68315f", new Object[]{this});
            return;
        }
        if (!this.paused) {
            this.paused = true;
            if (hasEvent(EVENT_ENDED)) {
                fireEvent(EVENT_ENDED, null);
            }
        }
        getInstance().fireNativeEvent("videocallback", "finish");
    }

    @Override // tb.hvu
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        unregisterNativeStateListener("videostatus", this);
        unregisterNativeStateListener("visibility", this);
        ((MUSLiveVideoView) obj).unmount(mUSDKInstance);
        if (!this.paused) {
            this.paused = true;
            if (hasEvent("pause")) {
                fireEvent("pause", null);
            }
        }
    }

    @Override // tb.ipc
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        MUSLiveVideoView mUSLiveVideoView = (MUSLiveVideoView) getMountContent();
        if (mUSLiveVideoView != null) {
            mUSLiveVideoView.onPlayed();
        }
        if (this.paused) {
            this.paused = false;
            if (hasEvent("play")) {
                fireEvent("play", null);
            }
        }
        getInstance().fireNativeEvent("videocallback", "start");
    }

    @Override // tb.ipc
    public void onVideoStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894a6d85", new Object[]{this});
        } else if (!this.paused) {
            this.paused = true;
            if (hasEvent("pause")) {
                fireEvent("pause", null);
            }
        }
    }

    static {
        t2o.a(815792744);
        t2o.a(815792742);
        t2o.a(982516018);
    }
}
