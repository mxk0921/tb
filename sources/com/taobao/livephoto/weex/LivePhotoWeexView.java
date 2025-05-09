package com.taobao.livephoto.weex;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.platform.JSGetter;
import com.taobao.android.weex_framework.platform.JSMethod;
import com.taobao.android.weex_framework.platform.JSSetter;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.livephoto.LivePhotoView;
import com.taobao.tlog.adapter.AdapterForTLog;
import io.unicorn.plugin.platform.WeexPlatformView;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.f27;
import tb.pvh;
import tb.t2o;
import tb.ulc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LivePhotoWeexView extends WeexPlatformView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PROP_BIZ_CODE = "bizCode";
    private static final String PROP_CONTENT_MODE = "contentMode";
    private static final String PROP_CURRENT_IMAGE = "currentImage";
    private static final String PROP_HIDE_ICON = "hideIcon";
    private static final String PROP_ICON_FRAME = "iconFrame";
    private static final String PROP_IMAGE_URL = "imageUrl";
    private static final String PROP_IS_PLAYING = "isPlaying";
    private static final String PROP_LIVE_PHOTO_INFO = "livePhotoInfo";
    private static final String PROP_MUTED = "muted";
    private static final String PROP_VIDEO_URL = "videoUrl";
    private static final String TAG = "WeexLivePhotoView";
    private LivePhotoView mLivePhotoView;
    private int contentMode = 2;
    private boolean isMuted = true;
    private pvh gmGetVideoPathCallback = null;
    private pvh mGetImagePathCallback = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f11008a;
        public final /* synthetic */ String b;

        public b(int i, String str) {
            this.f11008a = i;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event", this.f11008a);
                jSONObject.put("info", this.b);
                LivePhotoWeexView.access$300(LivePhotoWeexView.this, "eventCallback", jSONObject);
                AdapterForTLog.logd(LivePhotoWeexView.TAG, "fireEvent: " + this.f11008a + ", " + this.b);
            } catch (JSONException e) {
                AdapterForTLog.loge(LivePhotoWeexView.TAG, "onCoverImgSavedCompleted error: ", e);
            }
        }
    }

    static {
        t2o.a(732954649);
    }

    public LivePhotoWeexView(Context context, int i) {
        super(context, i);
        LivePhotoView livePhotoView = new LivePhotoView(context);
        this.mLivePhotoView = livePhotoView;
        livePhotoView.addListener(createLivePhotoListener());
    }

    public static /* synthetic */ void access$000(LivePhotoWeexView livePhotoWeexView, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b2621d", new Object[]{livePhotoWeexView, new Integer(i), str});
        } else {
            livePhotoWeexView.sendEvent(i, str);
        }
    }

    public static /* synthetic */ pvh access$100(LivePhotoWeexView livePhotoWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pvh) ipChange.ipc$dispatch("597dbb90", new Object[]{livePhotoWeexView});
        }
        return livePhotoWeexView.mGetImagePathCallback;
    }

    public static /* synthetic */ pvh access$102(LivePhotoWeexView livePhotoWeexView, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pvh) ipChange.ipc$dispatch("3d1f1209", new Object[]{livePhotoWeexView, pvhVar});
        }
        livePhotoWeexView.mGetImagePathCallback = pvhVar;
        return pvhVar;
    }

    public static /* synthetic */ pvh access$200(LivePhotoWeexView livePhotoWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pvh) ipChange.ipc$dispatch("5d055e91", new Object[]{livePhotoWeexView});
        }
        return livePhotoWeexView.gmGetVideoPathCallback;
    }

    public static /* synthetic */ pvh access$202(LivePhotoWeexView livePhotoWeexView, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pvh) ipChange.ipc$dispatch("d102ca4a", new Object[]{livePhotoWeexView, pvhVar});
        }
        livePhotoWeexView.gmGetVideoPathCallback = pvhVar;
        return pvhVar;
    }

    public static /* synthetic */ void access$300(LivePhotoWeexView livePhotoWeexView, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345901b3", new Object[]{livePhotoWeexView, str, obj});
        } else {
            livePhotoWeexView.fireEvent(str, obj);
        }
    }

    private ulc createLivePhotoListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ulc) ipChange.ipc$dispatch("5ad60c69", new Object[]{this});
        }
        return new a();
    }

    public static /* synthetic */ Object ipc$super(LivePhotoWeexView livePhotoWeexView, String str, Object... objArr) {
        if (str.hashCode() == -346507292) {
            super.onUpdateAttrs((Map) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/livephoto/weex/LivePhotoWeexView");
    }

    private void sendEvent(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b2d11f4", new Object[]{this, new Integer(i), str});
        } else {
            new Handler(Looper.getMainLooper()).post(new b(i, str));
        }
    }

    @JSMethod
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView != null) {
            livePhotoView.destroy();
            this.contentMode = 2;
            this.isMuted = true;
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, tb.l5m
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        AdapterForTLog.loge(TAG, ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX);
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView != null) {
            livePhotoView.destroy();
            this.mLivePhotoView = null;
        }
    }

    @JSGetter(name = PROP_CONTENT_MODE)
    public int getContentMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fd51600", new Object[]{this})).intValue();
        }
        return this.contentMode;
    }

    @JSGetter(name = PROP_CURRENT_IMAGE)
    public String getCurrentImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("849e3421", new Object[]{this});
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView != null) {
            return livePhotoView.getCoverPath();
        }
        return "";
    }

    @JSGetter(name = "imageUrl")
    public String getImageUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75cd89af", new Object[]{this});
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView != null) {
            return livePhotoView.getCoverPath();
        }
        return "";
    }

    @JSGetter(name = "muted")
    public boolean getMuted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44bd39c0", new Object[]{this})).booleanValue();
        }
        return this.isMuted;
    }

    @JSGetter(name = "videoUrl")
    public String getVideoUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9dbb94cf", new Object[]{this});
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView != null) {
            return livePhotoView.getVideoPath();
        }
        return "";
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, tb.l5m
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        AdapterForTLog.loge(TAG, "getView");
        return this.mLivePhotoView;
    }

    @JSGetter(name = PROP_IS_PLAYING)
    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView != null) {
            return livePhotoView.isPlaying();
        }
        return false;
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, tb.l5m
    public void onUpdateAttrs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb58b7e4", new Object[]{this, map});
            return;
        }
        super.onUpdateAttrs(map);
        AdapterForTLog.loge(TAG, "onUpdateAttrs ： " + map);
        setLivePhotoInfo(map.get(PROP_LIVE_PHOTO_INFO));
        if (map.get("bizCode") != null) {
            setBizCode(map.get("bizCode"));
        }
        if (map.get("imageUrl") != null) {
            setImageUrl(map.get("imageUrl"));
        }
        if (map.get("videoUrl") != null) {
            setVideoUrl(map.get("videoUrl"));
        }
        if (map.get(PROP_ICON_FRAME) != null) {
            setIconFrame(map.get(PROP_ICON_FRAME));
        }
        if (map.get("muted") != null) {
            setIsMuted(Boolean.parseBoolean(map.get("muted")));
        }
        if (map.get(PROP_HIDE_ICON) != null) {
            setHideIcon(Boolean.parseBoolean(map.get(PROP_HIDE_ICON)));
        }
        if (map.get(PROP_CONTENT_MODE) != null) {
            try {
                setContentMode(Integer.parseInt(map.get(PROP_CONTENT_MODE)));
            } catch (Exception e) {
                AdapterForTLog.loge(TAG, "onUpdateAttrs setContentMode error: ", e);
            }
        }
    }

    @JSMethod
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView != null) {
            livePhotoView.stop();
        }
    }

    @JSMethod
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        AdapterForTLog.logd(TAG, "play()");
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView != null) {
            try {
                livePhotoView.start();
            } catch (Throwable th) {
                AdapterForTLog.loge(TAG, "mLivePhotoView start error: ", th);
            }
        }
    }

    @JSMethod
    public void prepare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1afb60e", new Object[]{this});
            return;
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView != null) {
            livePhotoView.prepare();
        }
    }

    @JSSetter(name = "bizCode")
    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
            return;
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView != null) {
            livePhotoView.setBizCode(str);
        }
    }

    @JSSetter(name = PROP_CONTENT_MODE)
    public void setContentMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ecab3a2", new Object[]{this, new Integer(i)});
            return;
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView == null) {
            return;
        }
        if (i == 1) {
            livePhotoView.setVideoAspectRatio(DWAspectRatio.DW_FIT_CENTER);
            this.contentMode = 1;
        } else if (i == 2) {
            livePhotoView.setVideoAspectRatio(DWAspectRatio.DW_CENTER_CROP);
            this.contentMode = 2;
        } else if (i == 3) {
            livePhotoView.setVideoAspectRatio(DWAspectRatio.DW_FIT_X_Y);
            this.contentMode = 3;
        }
    }

    @JSSetter(name = PROP_HIDE_ICON)
    public void setHideIcon(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95995f0", new Object[]{this, new Boolean(z)});
            return;
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView != null) {
            livePhotoView.setLiveIconVisible(!z);
        }
    }

    @JSSetter(name = PROP_ICON_FRAME)
    public void setIconFrame(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c313b43", new Object[]{this, str});
        } else if (this.mLivePhotoView != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("x");
                int optInt2 = jSONObject.optInt("y");
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(jSONObject.optInt("width"), jSONObject.optInt("height"));
                layoutParams.leftMargin = optInt;
                layoutParams.topMargin = optInt2;
                this.mLivePhotoView.setLiveIconLayoutParams(layoutParams);
            } catch (Exception e) {
                AdapterForTLog.loge(TAG, "setIconFrame error: ", e);
            }
        }
    }

    @JSSetter(name = "imageUrl")
    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
            return;
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView != null) {
            livePhotoView.setImageUrl(str);
        }
    }

    @JSSetter(name = "muted")
    public void setIsMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d5082ee", new Object[]{this, new Boolean(z)});
            return;
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView != null) {
            livePhotoView.setIsMute(z);
            this.isMuted = z;
        }
    }

    @JSSetter(name = PROP_LIVE_PHOTO_INFO)
    public void setLivePhotoInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecedf243", new Object[]{this, str});
        } else if (this.mLivePhotoView != null && !TextUtils.isEmpty(str)) {
            try {
                this.mLivePhotoView.setLivePhotoInfo(new JSONObject(str));
            } catch (Exception e) {
                AdapterForTLog.loge(TAG, "setLivePhotoInfo error: ", e);
            }
        }
    }

    @JSSetter(name = "videoUrl")
    public void setVideoUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4945f87", new Object[]{this, str});
            return;
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView != null) {
            livePhotoView.setVideoUrl(str);
        }
    }

    @JSMethod
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView != null) {
            livePhotoView.stop();
        }
    }

    @JSMethod
    public void updateLivePhotoInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52eda47c", new Object[]{this, str});
            return;
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView != null) {
            try {
                livePhotoView.setLivePhotoInfo(new JSONObject(str));
            } catch (Exception e) {
                AdapterForTLog.loge(TAG, "setLivePhotoInfo error: ", e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends f27 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/livephoto/weex/LivePhotoWeexView$1");
        }

        @Override // tb.f27, tb.ytb
        public void onVideoComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            } else {
                LivePhotoWeexView.access$000(LivePhotoWeexView.this, 4, "");
            }
        }

        @Override // tb.f27, tb.ytb
        public void onVideoError(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                return;
            }
            LivePhotoWeexView livePhotoWeexView = LivePhotoWeexView.this;
            LivePhotoWeexView.access$000(livePhotoWeexView, 5, "what: " + i + ", extra: " + i2);
        }

        @Override // tb.f27, tb.ytb
        public void onVideoPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
            } else {
                LivePhotoWeexView.access$000(LivePhotoWeexView.this, 1, "");
            }
        }

        @Override // tb.f27, tb.ftb
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12779940", new Object[]{this, str});
                return;
            }
            LivePhotoWeexView.access$000(LivePhotoWeexView.this, 0, str);
            if (LivePhotoWeexView.access$100(LivePhotoWeexView.this) != null && !TextUtils.isEmpty(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put("path", str);
                LivePhotoWeexView.access$100(LivePhotoWeexView.this).b(MUSValue.ofJSON(hashMap));
                LivePhotoWeexView.access$102(LivePhotoWeexView.this, null);
            }
        }

        @Override // tb.f27, tb.ftb
        public void g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fd82f11", new Object[]{this, str});
            } else if (LivePhotoWeexView.access$200(LivePhotoWeexView.this) != null && !TextUtils.isEmpty(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put("path", str);
                LivePhotoWeexView.access$200(LivePhotoWeexView.this).b(MUSValue.ofJSON(hashMap));
                LivePhotoWeexView.access$202(LivePhotoWeexView.this, null);
            }
        }
    }

    @JSMethod
    public void getLocalImagePath(pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17f4adb", new Object[]{this, pvhVar});
            return;
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView != null) {
            String coverPath = livePhotoView.getCoverPath();
            if (!TextUtils.isEmpty(coverPath)) {
                HashMap hashMap = new HashMap();
                hashMap.put("path", coverPath);
                pvhVar.b(MUSValue.ofJSON(hashMap));
                return;
            }
            this.mGetImagePathCallback = pvhVar;
            this.mLivePhotoView.loadVideoAndImagePath();
        }
    }

    @JSMethod
    public void getLocalVideoPath(pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91abfdfb", new Object[]{this, pvhVar});
            return;
        }
        LivePhotoView livePhotoView = this.mLivePhotoView;
        if (livePhotoView != null) {
            String videoPath = livePhotoView.getVideoPath();
            if (!TextUtils.isEmpty(videoPath)) {
                HashMap hashMap = new HashMap();
                hashMap.put("path", videoPath);
                pvhVar.b(MUSValue.ofJSON(hashMap));
                return;
            }
            this.gmGetVideoPathCallback = pvhVar;
            this.mLivePhotoView.loadVideoAndImagePath();
        }
    }
}
