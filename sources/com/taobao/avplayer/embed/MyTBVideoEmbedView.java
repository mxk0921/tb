package com.taobao.avplayer.embed;

import android.app.Activity;
import android.content.Context;
import android.taobao.windvane.embed.BaseEmbedView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.s;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.uc.webview.export.extension.EmbedViewConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.ac8;
import tb.asc;
import tb.aub;
import tb.ew0;
import tb.feh;
import tb.fub;
import tb.htb;
import tb.ja1;
import tb.lya;
import tb.mya;
import tb.nsw;
import tb.qtb;
import tb.rpl;
import tb.spl;
import tb.t2o;
import tb.tpl;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MyTBVideoEmbedView extends BaseEmbedView implements asc, qtb, htb, aub, fub, spl, rpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String COMPONENT_NAME = "H5";
    private static final String FULL_SCREEN_MODE = "fullScreen";
    public static final String NAME = "wvvideo";
    private static final String NORMAL_SCREEN_MODE = "inlineScreen";
    public static final int PAUSE_BUTTON_CLICK = 1;
    public static final int PLAY_BUTTON_CLICK = 0;
    private static final String SMALL_SCREEN_MODE = "smallScreen";
    private static final String VALUE_FALSE = "false";
    private static final String VALUE_TRUE = "true";
    private DWAspectRatio mAspectRatio;
    private Context mContext;
    private boolean mInit;
    private boolean mIsPanoVideo;
    private boolean mIsVideoLoop;
    private feh mLogContext;
    private boolean mMiniProgressViewHidden;
    private tpl mPanoVideoUtils;
    private boolean mPlayingIconHidden;
    private String mScreenMode;
    private s mTBPlayerInstance;
    private HashMap<String, String> utParams;
    private static String METADATA = "meta";
    private static String PREPARED = "prepared";
    private static String PLAYING = "playing";
    private static String PAUSED = "paused";
    private static String FINISH = "finish";
    private static String LANDSCAPE = "landscape";
    private static String ERROR = "error";
    private static String SCREENMODECHANGE = "screenModeChange";
    private static String MUTEDCHANGE = "mutedChange";
    private static String VIDEOEND = "end";
    private static String FOVCHANGED = "fovChanged";
    private static String ANCHORLISTUPDATED = "anchorListUpdated";
    private static String FIRST_FRAME = "firstvideoframe";
    private static String SEEK_COMPLETED = "seekCompleted";
    private static String PLAY_BTN_CLICK = "playBtnClick";
    private static String PAUSE_BTN_CLICK = "pauseBtnClick";
    private int mWidth = 0;
    private int mHeight = 0;
    private String mSrc = null;
    private String mPlayerScene = null;
    private String mVideoPlayScene = "";
    private boolean mAutoPlay = true;
    private String mThumbnailSrc = null;
    private boolean mMuted = true;
    private String mVideoSource = null;
    private String mVideoId = null;
    private JSONObject mMediaInfoParams = null;
    private String mFrom = null;
    private String mPreload = null;
    private int mStartPos = 0;
    private int mCurrentTime = 0;
    private boolean mHasPlay = false;
    private boolean mResume = false;
    private boolean mStarted = false;
    private long mVideoDuration = 0;
    private FrameLayout mComponentHostView = null;
    private boolean mNeedAD = true;
    private boolean isCompleted = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum JSMethod {
        getCurrentTime { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$JSMethod$1");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("ee2a4317", new Object[]{this, myTBVideoEmbedView, str, wVCallBackContext})).booleanValue();
                }
                if (wVCallBackContext == null) {
                    return false;
                }
                int access$900 = MyTBVideoEmbedView.access$900(myTBVideoEmbedView);
                wVCallBackContext.success("" + (access$900 / 1000.0f));
                return true;
            }
        },
        setCurrentTime { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$JSMethod$2");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                com.alibaba.fastjson.JSONObject parseObject;
                boolean z = false;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("ee2a4317", new Object[]{this, myTBVideoEmbedView, str, wVCallBackContext})).booleanValue();
                }
                if (!TextUtils.isEmpty(str) && (parseObject = JSON.parseObject(str)) != null) {
                    String string = parseObject.getString("time");
                    try {
                        int parseInt = Integer.parseInt(string) * 1000;
                        if (MyTBVideoEmbedView.access$200(myTBVideoEmbedView) != null) {
                            MyTBVideoEmbedView.access$200(myTBVideoEmbedView).y(parseInt, false);
                        }
                    } catch (Throwable unused) {
                        if (MyTBVideoEmbedView.enableSeekMs()) {
                            try {
                                int parseDouble = (int) (Double.parseDouble(string) * 1000.0d);
                                if (MyTBVideoEmbedView.access$200(myTBVideoEmbedView) != null) {
                                    MyTBVideoEmbedView.access$200(myTBVideoEmbedView).y(parseDouble, false);
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                    z = true;
                }
                if (wVCallBackContext != null) {
                    if (z) {
                        wVCallBackContext.success();
                    } else {
                        wVCallBackContext.error();
                    }
                }
                return true;
            }
        },
        getDuration { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$JSMethod$3");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("ee2a4317", new Object[]{this, myTBVideoEmbedView, str, wVCallBackContext})).booleanValue();
                }
                if (wVCallBackContext != null) {
                    wVCallBackContext.success(String.valueOf(((float) MyTBVideoEmbedView.access$1000(myTBVideoEmbedView)) / 1000.0f));
                }
                return true;
            }
        },
        getMuted { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$JSMethod$4");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("ee2a4317", new Object[]{this, myTBVideoEmbedView, str, wVCallBackContext})).booleanValue();
                }
                if (wVCallBackContext != null) {
                    wVCallBackContext.success(String.valueOf(MyTBVideoEmbedView.access$1100(myTBVideoEmbedView)));
                }
                return true;
            }
        },
        setMuted { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$JSMethod$5");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                com.alibaba.fastjson.JSONObject parseObject;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("ee2a4317", new Object[]{this, myTBVideoEmbedView, str, wVCallBackContext})).booleanValue();
                }
                if (!TextUtils.isEmpty(str) && (parseObject = JSON.parseObject(str)) != null) {
                    MyTBVideoEmbedView.access$1200(myTBVideoEmbedView, Boolean.TRUE.equals(parseObject.getBoolean("muted")));
                    if (wVCallBackContext != null) {
                        wVCallBackContext.success();
                    }
                }
                return true;
            }
        },
        setScreenMode { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass6 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$JSMethod$6");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                com.alibaba.fastjson.JSONObject parseObject;
                Object obj;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("ee2a4317", new Object[]{this, myTBVideoEmbedView, str, wVCallBackContext})).booleanValue();
                }
                if (TextUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null || (obj = parseObject.get("screenMode")) == null) {
                    return false;
                }
                myTBVideoEmbedView.setScreenMode(String.valueOf(obj), true);
                if (wVCallBackContext != null) {
                    wVCallBackContext.success();
                }
                return true;
            }
        },
        getScreenMode { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass7 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$JSMethod$7");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("ee2a4317", new Object[]{this, myTBVideoEmbedView, str, wVCallBackContext})).booleanValue();
                }
                if (wVCallBackContext != null) {
                    wVCallBackContext.success(MyTBVideoEmbedView.access$1300(myTBVideoEmbedView));
                }
                return true;
            }
        },
        play { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass8 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$JSMethod$8");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("ee2a4317", new Object[]{this, myTBVideoEmbedView, str, wVCallBackContext})).booleanValue();
                }
                MyTBVideoEmbedView.access$1400(myTBVideoEmbedView);
                if (wVCallBackContext != null) {
                    wVCallBackContext.success();
                }
                return true;
            }
        },
        pause { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass9 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$JSMethod$9");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("ee2a4317", new Object[]{this, myTBVideoEmbedView, str, wVCallBackContext})).booleanValue();
                }
                if (MyTBVideoEmbedView.access$200(myTBVideoEmbedView) != null) {
                    MyTBVideoEmbedView.access$200(myTBVideoEmbedView).u();
                }
                if (wVCallBackContext != null) {
                    wVCallBackContext.success();
                }
                return true;
            }
        },
        setInstanceMode { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass10 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$JSMethod$10");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                com.alibaba.fastjson.JSONObject parseObject;
                Object obj;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("ee2a4317", new Object[]{this, myTBVideoEmbedView, str, wVCallBackContext})).booleanValue();
                }
                if (TextUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null || (obj = parseObject.get("instanceMode")) == null) {
                    return false;
                }
                myTBVideoEmbedView.setDWInstanceType(String.valueOf(obj), true);
                if (wVCallBackContext != null) {
                    wVCallBackContext.success();
                }
                return true;
            }
        },
        setAnchorErpList { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass11 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$JSMethod$11");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("ee2a4317", new Object[]{this, myTBVideoEmbedView, str, wVCallBackContext})).booleanValue();
                }
                if (myTBVideoEmbedView == null || TextUtils.isEmpty(str)) {
                    return false;
                }
                feh access$700 = MyTBVideoEmbedView.access$700(myTBVideoEmbedView);
                AVSDKLog.e(access$700, "setAnchorErpList " + str);
                com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(str);
                if (MyTBVideoEmbedView.access$300(myTBVideoEmbedView)) {
                    MyTBVideoEmbedView.access$400(myTBVideoEmbedView).o(parseObject);
                }
                if (wVCallBackContext != null) {
                    wVCallBackContext.success();
                }
                return true;
            }
        },
        getErpList { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass12 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$JSMethod$12");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("ee2a4317", new Object[]{this, myTBVideoEmbedView, str, wVCallBackContext})).booleanValue();
                }
                if (myTBVideoEmbedView == null || TextUtils.isEmpty(str)) {
                    return false;
                }
                return true;
            }
        },
        setFov { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass13 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$JSMethod$13");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("ee2a4317", new Object[]{this, myTBVideoEmbedView, str, wVCallBackContext})).booleanValue();
                }
                if (myTBVideoEmbedView == null || TextUtils.isEmpty(str)) {
                    return false;
                }
                com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(str);
                if (MyTBVideoEmbedView.access$300(myTBVideoEmbedView)) {
                    MyTBVideoEmbedView.access$400(myTBVideoEmbedView).r(parseObject);
                }
                if (wVCallBackContext != null) {
                    wVCallBackContext.success();
                }
                return true;
            }
        },
        getFov { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass14 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$JSMethod$14");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("ee2a4317", new Object[]{this, myTBVideoEmbedView, str, wVCallBackContext})).booleanValue();
                }
                if (myTBVideoEmbedView == null || TextUtils.isEmpty(str)) {
                    return false;
                }
                if (wVCallBackContext != null) {
                    nsw nswVar = new nsw();
                    HashMap<String, String> h = MyTBVideoEmbedView.access$400(myTBVideoEmbedView).h();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("FOV", ew0.t(h.get("FOV")));
                        jSONObject.put("latitude", ew0.t(h.get("latitude")));
                        jSONObject.put("longitude", ew0.t(h.get("longitude")));
                        nswVar.d("data", jSONObject);
                        wVCallBackContext.success(nswVar);
                    } catch (JSONException e) {
                        e.printStackTrace();
                        return false;
                    }
                }
                return true;
            }
        },
        getViewPortPlaneCoordinateFromERP { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass15 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$JSMethod$15");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("ee2a4317", new Object[]{this, myTBVideoEmbedView, str, wVCallBackContext})).booleanValue();
                }
                if (myTBVideoEmbedView == null || TextUtils.isEmpty(str)) {
                    return false;
                }
                return true;
            }
        },
        updateEmbedProperty { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass16 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$JSMethod$16");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.JSMethod
            public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
                com.alibaba.fastjson.JSONObject parseObject;
                EmbedProperties embedProperties;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("ee2a4317", new Object[]{this, myTBVideoEmbedView, str, wVCallBackContext})).booleanValue();
                }
                if (myTBVideoEmbedView == null || TextUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null) {
                    return false;
                }
                Object obj = parseObject.get("key");
                Object obj2 = parseObject.get("value");
                if (!(obj == null || obj2 == null)) {
                    try {
                        embedProperties = EmbedProperties.valueOf(String.valueOf(obj));
                    } catch (Throwable unused) {
                        embedProperties = null;
                    }
                    if (embedProperties == null) {
                        return false;
                    }
                    embedProperties.setValue(myTBVideoEmbedView, obj2, true);
                    return true;
                }
                return false;
            }
        };
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(JSMethod jSMethod, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$JSMethod");
        }

        public static JSMethod valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSMethod) ipChange.ipc$dispatch("a232bff5", new Object[]{str});
            }
            return (JSMethod) Enum.valueOf(JSMethod.class, str);
        }

        public boolean doSomething(MyTBVideoEmbedView myTBVideoEmbedView, String str, WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ee2a4317", new Object[]{this, myTBVideoEmbedView, str, wVCallBackContext})).booleanValue();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            MyTBVideoEmbedView.access$500(MyTBVideoEmbedView.this, "click", "");
            return false;
        }
    }

    public static /* synthetic */ int access$000(MyTBVideoEmbedView myTBVideoEmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87ec9c80", new Object[]{myTBVideoEmbedView})).intValue();
        }
        return myTBVideoEmbedView.mHeight;
    }

    public static /* synthetic */ int access$002(MyTBVideoEmbedView myTBVideoEmbedView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1589cc7", new Object[]{myTBVideoEmbedView, new Integer(i)})).intValue();
        }
        myTBVideoEmbedView.mHeight = i;
        return i;
    }

    public static /* synthetic */ int access$100(MyTBVideoEmbedView myTBVideoEmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15274e01", new Object[]{myTBVideoEmbedView})).intValue();
        }
        return myTBVideoEmbedView.mWidth;
    }

    public static /* synthetic */ long access$1000(MyTBVideoEmbedView myTBVideoEmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f4d7cf70", new Object[]{myTBVideoEmbedView})).longValue();
        }
        return myTBVideoEmbedView.getVideoDurtion();
    }

    public static /* synthetic */ int access$102(MyTBVideoEmbedView myTBVideoEmbedView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb741b66", new Object[]{myTBVideoEmbedView, new Integer(i)})).intValue();
        }
        myTBVideoEmbedView.mWidth = i;
        return i;
    }

    public static /* synthetic */ boolean access$1100(MyTBVideoEmbedView myTBVideoEmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82128101", new Object[]{myTBVideoEmbedView})).booleanValue();
        }
        return myTBVideoEmbedView.isMute();
    }

    public static /* synthetic */ void access$1200(MyTBVideoEmbedView myTBVideoEmbedView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da59d016", new Object[]{myTBVideoEmbedView, new Boolean(z)});
        } else {
            myTBVideoEmbedView.mute(z);
        }
    }

    public static /* synthetic */ String access$1300(MyTBVideoEmbedView myTBVideoEmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9464ae81", new Object[]{myTBVideoEmbedView});
        }
        return myTBVideoEmbedView.mScreenMode;
    }

    public static /* synthetic */ void access$1400(MyTBVideoEmbedView myTBVideoEmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29c29580", new Object[]{myTBVideoEmbedView});
        } else {
            myTBVideoEmbedView.play();
        }
    }

    public static /* synthetic */ s access$200(MyTBVideoEmbedView myTBVideoEmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("8b5be1ac", new Object[]{myTBVideoEmbedView});
        }
        return myTBVideoEmbedView.mTBPlayerInstance;
    }

    public static /* synthetic */ boolean access$300(MyTBVideoEmbedView myTBVideoEmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f9cb114", new Object[]{myTBVideoEmbedView})).booleanValue();
        }
        return myTBVideoEmbedView.mIsPanoVideo;
    }

    public static /* synthetic */ tpl access$400(MyTBVideoEmbedView myTBVideoEmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tpl) ipChange.ipc$dispatch("c631a1c3", new Object[]{myTBVideoEmbedView});
        }
        return myTBVideoEmbedView.mPanoVideoUtils;
    }

    public static /* synthetic */ void access$500(MyTBVideoEmbedView myTBVideoEmbedView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7c82826", new Object[]{myTBVideoEmbedView, str, str2});
        } else {
            myTBVideoEmbedView.fireEvent(str, str2);
        }
    }

    public static /* synthetic */ feh access$700(MyTBVideoEmbedView myTBVideoEmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (feh) ipChange.ipc$dispatch("b0f6fa0f", new Object[]{myTBVideoEmbedView});
        }
        return myTBVideoEmbedView.mLogContext;
    }

    public static /* synthetic */ int access$900(MyTBVideoEmbedView myTBVideoEmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7efcda09", new Object[]{myTBVideoEmbedView})).intValue();
        }
        return myTBVideoEmbedView.getCurrentPosition();
    }

    private void destroyInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e56f9103", new Object[]{this});
            return;
        }
        s sVar = this.mTBPlayerInstance;
        if (sVar != null) {
            FrameLayout frameLayout = this.mComponentHostView;
            if (frameLayout != null) {
                frameLayout.removeView(sVar.o());
            }
            this.mTBPlayerInstance.c("unRegisterSeekCompleteListener", null);
            this.mTBPlayerInstance.c("unRegisterIMediaPlayLifecycleListener", null);
            this.mTBPlayerInstance.h();
            this.mTBPlayerInstance = null;
        }
    }

    public static boolean enableSeekMs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfe289ac", new Object[0])).booleanValue();
        }
        return true;
    }

    private void fireEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7134ec1f", new Object[]{this, str, str2});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "MyTBVideoEmbedView fireEvent=" + str + ", params=" + str2);
        ac8.a(this.webView, this.id, str, str2);
    }

    private View genVideoView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("cc8b6559", new Object[]{this});
        }
        View initTBPlayerInstance = initTBPlayerInstance();
        this.mInit = true;
        if (this.mComponentHostView == null) {
            this.mComponentHostView = new FrameLayout(this.mContext) { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r3, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == 1389530587) {
                        super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                        return null;
                    } else if (hashCode == 2075560917) {
                        return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
                    } else {
                        int hashCode2 = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$1");
                    }
                }

                @Override // android.view.ViewGroup, android.view.View
                public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
                    }
                    if (MyTBVideoEmbedView.access$300(MyTBVideoEmbedView.this)) {
                        MyTBVideoEmbedView.access$400(MyTBVideoEmbedView.this).f(motionEvent);
                    }
                    boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 2) {
                        return false;
                    }
                    return dispatchTouchEvent;
                }

                @Override // android.view.View
                public void onSizeChanged(int i, int i2, int i3, int i4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                        return;
                    }
                    super.onSizeChanged(i, i2, i3, i4);
                    if (i4 != i3 || i4 != 0) {
                        if (MyTBVideoEmbedView.access$000(MyTBVideoEmbedView.this) != i2 || MyTBVideoEmbedView.access$100(MyTBVideoEmbedView.this) != i) {
                            MyTBVideoEmbedView.access$002(MyTBVideoEmbedView.this, i2);
                            MyTBVideoEmbedView.access$102(MyTBVideoEmbedView.this, i);
                            if (MyTBVideoEmbedView.access$200(MyTBVideoEmbedView.this) != null) {
                                HashMap<String, Object> hashMap = new HashMap<>();
                                hashMap.put("width", Integer.valueOf(i));
                                hashMap.put("height", Integer.valueOf(i2));
                                MyTBVideoEmbedView.access$200(MyTBVideoEmbedView.this).c("setFrame", hashMap);
                            }
                        }
                    }
                }
            };
        }
        ViewParent parent = initTBPlayerInstance.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(initTBPlayerInstance);
        }
        this.mComponentHostView.addView(initTBPlayerInstance);
        if (this.mAutoPlay) {
            s sVar = this.mTBPlayerInstance;
            if (sVar != null) {
                sVar.F();
            }
            fireEvent(PLAYING, "");
        }
        ViewProxy.setOnTouchListener(initTBPlayerInstance, new a());
        return this.mComponentHostView;
    }

    private int getCurrentPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue();
        }
        s sVar = this.mTBPlayerInstance;
        if (sVar != null) {
            return (int) sVar.m(1502);
        }
        return 0;
    }

    private int getPanoType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4605aebc", new Object[]{this})).intValue();
        }
        if (this.mIsPanoVideo) {
            return this.mPanoVideoUtils.l();
        }
        return 0;
    }

    private long getVideoDurtion() {
        s sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e73c128b", new Object[]{this})).longValue();
        }
        if (this.mVideoDuration == 0 && (sVar = this.mTBPlayerInstance) != null) {
            this.mVideoDuration = sVar.m(1501);
        }
        return this.mVideoDuration;
    }

    public static /* synthetic */ Object ipc$super(MyTBVideoEmbedView myTBVideoEmbedView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1126948911:
                return new Boolean(super.execute((String) objArr[0], (String) objArr[1], (WVCallBackContext) objArr[2]));
            case -239223102:
                super.onAttachedToWebView();
                return null;
            case 259963749:
                super.onDetachedFromWebView();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1980158489:
                super.onVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case 2111529549:
                super.onParamChanged((String[]) objArr[0], (String[]) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView");
        }
    }

    private boolean isMute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("467c96e", new Object[]{this})).booleanValue();
        }
        s sVar = this.mTBPlayerInstance;
        if (sVar == null || sVar.m(1007) != 1) {
            return false;
        }
        return true;
    }

    private void mute(boolean z) {
        s sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mMuted = z;
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "MyTBVideoEmbedView Builder, sbt=" + this.mFrom + ", setMute=" + this.mMuted);
        if (this.mInit && (sVar = this.mTBPlayerInstance) != null) {
            sVar.t(this.mMuted);
        }
    }

    private void parseParam() {
        EmbedProperties[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd55ed21", new Object[]{this});
            return;
        }
        setWidth(this.params.mWidth, false);
        setHeight(this.params.mHeight, false);
        for (EmbedProperties embedProperties : EmbedProperties.values()) {
            embedProperties.setValue(this, this.params.mObjectParam.get(embedProperties.name()), false);
        }
    }

    private void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        s sVar = this.mTBPlayerInstance;
        if (sVar != null) {
            sVar.F();
            this.mStarted = true;
        }
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        JSMethod jSMethod;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            jSMethod = JSMethod.valueOf(str);
        } catch (Throwable unused) {
            jSMethod = null;
        }
        if (jSMethod != null) {
            return jSMethod.doSomething(this, str2, wVCallBackContext);
        }
        return super.execute(str, str2, wVCallBackContext);
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public View generateView(Context context) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7334ca29", new Object[]{this, context});
        }
        EmbedViewConfig embedViewConfig = this.params;
        if (embedViewConfig == null || (map = embedViewConfig.mObjectParam) == null || map.isEmpty()) {
            return null;
        }
        this.mContext = context;
        parseParam();
        return genVideoView();
    }

    @Override // tb.spl
    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.mHeight;
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public String getViewType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35692924", new Object[]{this});
        }
        return NAME;
    }

    @Override // tb.spl
    public int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return this.mWidth;
    }

    @Override // tb.spl
    public List<mya> hitTest(List<lya> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ae7e26ea", new Object[]{this, list});
        }
        return null;
    }

    @Override // tb.qtb
    public boolean hook() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.rpl
    public void onAnchorListUpdate(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("731725fe", new Object[]{this, obj});
        } else if (this.mIsPanoVideo && (obj instanceof JSONArray)) {
            fireEvent(ANCHORLISTUPDATED, ((JSONArray) obj).toString());
        }
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onAttachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bdbec2", new Object[]{this});
        } else {
            super.onAttachedToWebView();
        }
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        tpl tplVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        destroyInner();
        if (this.mIsPanoVideo && (tplVar = this.mPanoVideoUtils) != null) {
            this.mIsPanoVideo = false;
            tplVar.e();
            this.mPanoVideoUtils = null;
        }
        this.mInit = false;
        this.mContext = null;
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDetachedFromWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7ebb65", new Object[]{this});
        } else {
            super.onDetachedFromWebView();
        }
    }

    @Override // tb.rpl
    public void onFovChange(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e7b9e1", new Object[]{this, obj});
        } else if (this.mIsPanoVideo) {
            fireEvent(FOVCHANGED, JSON.toJSONString(this.mPanoVideoUtils.h()));
        }
    }

    @Override // tb.aub
    public void onLoopCompletion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a22ee66", new Object[]{this});
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
        this.mNeedAD = true;
        this.isCompleted = true;
        this.mHasPlay = false;
        this.mCurrentTime = 0;
        fireEvent(FINISH, "");
        fireEvent(VIDEOEND, "");
    }

    @Override // tb.asc
    public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
        } else {
            fireEvent(ERROR, "");
        }
    }

    @Override // tb.asc
    public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "MyTBVideoEmbedView onMediaInfo what:" + j + ", extra: " + j2 + ", ext: " + j3);
        if ((j == 11000 || j == 3) && this.mIsPanoVideo) {
            this.mPanoVideoUtils.s();
        }
        if (j == 3) {
            fireEvent(FIRST_FRAME, "");
        }
        if (j != 18) {
            return;
        }
        if (j2 == 1) {
            fireEvent(PAUSE_BTN_CLICK, "");
        } else if (j2 == 0) {
            fireEvent(PLAY_BTN_CLICK, "");
        }
    }

    @Override // tb.asc
    public void onMediaPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
        } else {
            fireEvent(PAUSED, "");
        }
    }

    @Override // tb.asc
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
            return;
        }
        this.isCompleted = false;
        fireEvent(PLAYING, "");
    }

    @Override // tb.asc
    public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
            return;
        }
        this.isCompleted = false;
        fireEvent(PREPARED, "");
    }

    @Override // tb.asc
    public void onMediaProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        this.mCurrentTime = i;
        if (this.mVideoDuration == 0) {
            this.mVideoDuration = i3;
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
            fireEvent(SEEK_COMPLETED, "");
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
        this.mNeedAD = false;
        this.mStarted = true;
        this.isCompleted = false;
        if (!this.mResume || this.mHasPlay || (sVar2 = this.mTBPlayerInstance) == null) {
            this.mHasPlay = true;
            int i = this.mCurrentTime;
            if (i > 0 && (sVar = this.mTBPlayerInstance) != null) {
                sVar.y(i, false);
            }
            fireEvent(PLAYING, "");
            return;
        }
        sVar2.u();
    }

    @Override // tb.htb
    public void onMutedChange(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff26311", new Object[]{this, new Boolean(z)});
            return;
        }
        String str2 = MUTEDCHANGE;
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        fireEvent(str2, str);
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnParamChangedListener
    public void onParamChanged(String[] strArr, String[] strArr2) {
        EmbedProperties embedProperties;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddb624d", new Object[]{this, strArr, strArr2});
            return;
        }
        super.onParamChanged(strArr, strArr2);
        if (strArr != null && strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            String str = strArr[0];
            String str2 = strArr2[0];
            try {
                embedProperties = EmbedProperties.valueOf(str);
            } catch (Throwable unused) {
                embedProperties = null;
            }
            if (embedProperties != null) {
                embedProperties.setValue(this, str2, true);
            }
        }
    }

    @Override // tb.kpw
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            super.onPause();
        }
    }

    @Override // tb.kpw
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            super.onResume();
        }
    }

    @Override // tb.fub
    public void onSeekCompletion(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5db52709", new Object[]{this, new Integer(i)});
        } else {
            fireEvent(SEEK_COMPLETED, "");
        }
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnVisibilityChangedListener
    public void onVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7606d219", new Object[]{this, new Integer(i)});
        } else {
            super.onVisibilityChanged(i);
        }
    }

    @Override // tb.spl
    public void refreshScreen() {
        s sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a8082e", new Object[]{this});
        } else if (this.mIsPanoVideo && (sVar = this.mTBPlayerInstance) != null) {
            sVar.c("refreshScreen", null);
        }
    }

    public void setAutoPlay(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf50d8c", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            this.mAutoPlay = z;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r6.equals("aspectFill") == false) goto L_0x002e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setContentMode(java.lang.String r6, boolean r7) {
        /*
            r5 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.avplayer.embed.MyTBVideoEmbedView.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001d
            java.lang.Boolean r4 = new java.lang.Boolean
            r4.<init>(r7)
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r2] = r5
            r7[r1] = r6
            r7[r0] = r4
            java.lang.String r6 = "1b6db929"
            r3.ipc$dispatch(r6, r7)
            return
        L_0x001d:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x0060
            r6.hashCode()
            r7 = -1
            int r3 = r6.hashCode()
            switch(r3) {
                case -1362001767: goto L_0x0044;
                case 3143043: goto L_0x0039;
                case 727618043: goto L_0x0030;
                default: goto L_0x002e;
            }
        L_0x002e:
            r0 = -1
            goto L_0x004e
        L_0x0030:
            java.lang.String r1 = "aspectFill"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x004e
            goto L_0x002e
        L_0x0039:
            java.lang.String r0 = "fill"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0042
            goto L_0x002e
        L_0x0042:
            r0 = 1
            goto L_0x004e
        L_0x0044:
            java.lang.String r0 = "aspectFit"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x004d
            goto L_0x002e
        L_0x004d:
            r0 = 0
        L_0x004e:
            switch(r0) {
                case 0: goto L_0x005c;
                case 1: goto L_0x0057;
                case 2: goto L_0x0052;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x0060
        L_0x0052:
            com.taobao.avplayer.DWAspectRatio r6 = com.taobao.avplayer.DWAspectRatio.DW_CENTER_CROP
            r5.mAspectRatio = r6
            goto L_0x0060
        L_0x0057:
            com.taobao.avplayer.DWAspectRatio r6 = com.taobao.avplayer.DWAspectRatio.DW_FIT_X_Y
            r5.mAspectRatio = r6
            goto L_0x0060
        L_0x005c:
            com.taobao.avplayer.DWAspectRatio r6 = com.taobao.avplayer.DWAspectRatio.DW_FIT_CENTER
            r5.mAspectRatio = r6
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.avplayer.embed.MyTBVideoEmbedView.setContentMode(java.lang.String, boolean):void");
    }

    public void setDWInstanceType(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fefef5f", new Object[]{this, str, new Boolean(z)});
        }
    }

    @Override // tb.spl
    public void setFov(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66bab26e", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        } else if (this.mTBPlayerInstance != null) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("fov", Float.valueOf(f));
            hashMap.put("latitude", Float.valueOf(f2));
            hashMap.put("longitude", Float.valueOf(f3));
            this.mTBPlayerInstance.c("setFov", hashMap);
        }
    }

    public void setFrom(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9e731b7", new Object[]{this, str, new Boolean(z)});
        } else {
            this.mFrom = str;
        }
    }

    public void setHeight(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbeb8461", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.mHeight = i;
        if (z && this.mTBPlayerInstance != null) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("width", Integer.valueOf(this.mWidth));
            hashMap.put("height", Integer.valueOf(this.mHeight));
            this.mTBPlayerInstance.c("setFrame", hashMap);
        }
    }

    public void setIsVideoLoop(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcbecfa", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            this.mIsVideoLoop = z;
        }
    }

    public void setMediaInfoParams(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a75b8b3", new Object[]{this, jSONObject, new Boolean(z)});
        } else {
            this.mMediaInfoParams = jSONObject;
        }
    }

    public void setMiniProgressViewHidden(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a897fc", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            this.mMiniProgressViewHidden = z;
        }
    }

    public void setMuted(boolean z, boolean z2) {
        s sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d188b0", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.mMuted = z;
        if (z2 && (sVar = this.mTBPlayerInstance) != null) {
            sVar.t(z);
        }
    }

    public void setPanoType(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bafed655", new Object[]{this, str, new Boolean(z)});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if ("ERP".equals(str) || "EAC".equals(str)) {
                this.mIsPanoVideo = true;
                this.mPanoVideoUtils = new tpl(this.mContext, str, this, this);
                this.mAspectRatio = DWAspectRatio.DW_CENTER_CROP;
            }
        }
    }

    public void setPlayerScene(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d946f7da", new Object[]{this, str, new Boolean(z)});
        } else {
            this.mPlayerScene = str;
        }
    }

    public void setPlayingIconHidden(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc64f816", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            this.mPlayingIconHidden = z;
        }
    }

    public void setPreLoad(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7307b1c", new Object[]{this, str, new Boolean(z)});
        } else {
            this.mPreload = str;
        }
    }

    public void setRequestHeader(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af6e6bd2", new Object[]{this, hashMap});
        }
    }

    public void setScreenMode(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eae0512", new Object[]{this, str, new Boolean(z)});
            return;
        }
        this.mScreenMode = str;
        if (z && !TextUtils.isEmpty(str) && this.mTBPlayerInstance != null) {
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

    public void setSrc(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a366e01", new Object[]{this, str, new Boolean(z)});
        } else {
            this.mSrc = str;
        }
    }

    public void setStartPos(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e44210c", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            this.mStartPos = i;
        }
    }

    public void setThumbnailSrc(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10c56a49", new Object[]{this, str, new Boolean(z)});
        } else {
            this.mThumbnailSrc = str;
        }
    }

    public void setUtParams(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f43562fc", new Object[]{this, str, new Boolean(z)});
        } else {
            this.utParams = ew0.z(str, ",", "=");
        }
    }

    public void setVideoId(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8affdbaf", new Object[]{this, str, new Boolean(z)});
        } else {
            this.mVideoId = str;
        }
    }

    public void setVideoPlayScene(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ccad9d0", new Object[]{this, str});
        } else {
            this.mVideoPlayScene = str;
        }
    }

    public void setVideoSource(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9377652f", new Object[]{this, str, new Boolean(z)});
        } else {
            this.mVideoSource = str;
        }
    }

    public void setWidth(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3cb1a7c", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.mWidth = i;
        if (z && this.mTBPlayerInstance != null) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("width", Integer.valueOf(this.mWidth));
            hashMap.put("height", Integer.valueOf(this.mHeight));
            this.mTBPlayerInstance.c("setFrame", hashMap);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum EmbedProperties {
        playerScene { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                if (str.hashCode() == 921765104) {
                    return new Boolean(super.setValue((MyTBVideoEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$1");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setPlayerScene(String.valueOf(obj), z);
                }
                return true;
            }
        },
        videoPlayScenes { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                if (str.hashCode() == 921765104) {
                    return new Boolean(super.setValue((MyTBVideoEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$2");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setVideoPlayScene(String.valueOf(obj));
                }
                return true;
            }
        },
        instanceType { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                if (str.hashCode() == 921765104) {
                    return new Boolean(super.setValue((MyTBVideoEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$3");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setDWInstanceType(String.valueOf(obj), z);
                }
                return true;
            }
        },
        src { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                if (str.hashCode() == 921765104) {
                    return new Boolean(super.setValue((MyTBVideoEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$4");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setSrc(String.valueOf(obj), z);
                }
                return true;
            }
        },
        uiConfig { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$5");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                return true;
            }
        },
        loop { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass6 r2, String str, Object... objArr) {
                if (str.hashCode() == 921765104) {
                    return new Boolean(super.setValue((MyTBVideoEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$6");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setIsVideoLoop(toBoolean(obj), z);
                }
                return true;
            }
        },
        autoplay { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass7 r2, String str, Object... objArr) {
                if (str.hashCode() == 921765104) {
                    return new Boolean(super.setValue((MyTBVideoEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$7");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setAutoPlay(toBoolean(obj), z);
                }
                return true;
            }
        },
        autoPlay { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass8 r2, String str, Object... objArr) {
                if (str.hashCode() == 921765104) {
                    return new Boolean(super.setValue((MyTBVideoEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$8");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setAutoPlay(toBoolean(obj), z);
                }
                return true;
            }
        },
        thumbnailSrc { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass9 r2, String str, Object... objArr) {
                if (str.hashCode() == 921765104) {
                    return new Boolean(super.setValue((MyTBVideoEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$9");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setThumbnailSrc(String.valueOf(obj), z);
                }
                return true;
            }
        },
        poster { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass10 r2, String str, Object... objArr) {
                if (str.hashCode() == 921765104) {
                    return new Boolean(super.setValue((MyTBVideoEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$10");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setThumbnailSrc(String.valueOf(obj), z);
                }
                return true;
            }
        },
        interactiveHidden { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass11 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$11");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                return true;
            }
        },
        contentId { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass12 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$12");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                return true;
            }
        },
        backCoverDisplay { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass13 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$13");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                return true;
            }
        },
        muted { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass14 r2, String str, Object... objArr) {
                if (str.hashCode() == 921765104) {
                    return new Boolean(super.setValue((MyTBVideoEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$14");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setMuted(toBoolean(obj), z);
                }
                return true;
            }
        },
        preload { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass15 r2, String str, Object... objArr) {
                if (str.hashCode() == 921765104) {
                    return new Boolean(super.setValue((MyTBVideoEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$15");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setPreLoad(String.valueOf(obj), z);
                }
                return true;
            }
        },
        videoSource { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass16 r2, String str, Object... objArr) {
                if (str.hashCode() == 921765104) {
                    return new Boolean(super.setValue((MyTBVideoEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$16");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setVideoSource(String.valueOf(obj), z);
                }
                return true;
            }
        },
        videoId { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.17
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass17 r2, String str, Object... objArr) {
                if (str.hashCode() == 921765104) {
                    return new Boolean(super.setValue((MyTBVideoEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$17");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setVideoId(String.valueOf(obj), z);
                }
                return true;
            }
        },
        videoUrlResources { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.18
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass18 r2, String str, Object... objArr) {
                if (str.hashCode() == 921765104) {
                    return new Boolean(super.setValue((MyTBVideoEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$18");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    String valueOf = String.valueOf(obj);
                    if (TextUtils.isEmpty(valueOf)) {
                        return true;
                    }
                    try {
                        myTBVideoEmbedView.setMediaInfoParams(new JSONObject(valueOf), z);
                    } catch (JSONException unused) {
                        AVSDKLog.e(MyTBVideoEmbedView.access$700(myTBVideoEmbedView), "parse mediaInfoParams error ".concat(valueOf));
                    }
                }
                return true;
            }
        },
        from { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.19
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass19 r2, String str, Object... objArr) {
                if (str.hashCode() == 921765104) {
                    return new Boolean(super.setValue((MyTBVideoEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$19");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setFrom(String.valueOf(obj), z);
                }
                return true;
            }
        },
        utParams { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.20
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass20 r2, String str, Object... objArr) {
                if (str.hashCode() == 921765104) {
                    return new Boolean(super.setValue((MyTBVideoEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$20");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setUtParams(String.valueOf(obj), z);
                }
                return true;
            }
        },
        playControl { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.21
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass21 r2, String str, Object... objArr) {
                if (str.hashCode() == 921765104) {
                    return new Boolean(super.setValue((MyTBVideoEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$21");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setPlayControl(String.valueOf(obj), z);
                }
                return true;
            }
        },
        contentMode { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.22
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass22 r2, String str, Object... objArr) {
                if (str.hashCode() == 921765104) {
                    return new Boolean(super.setValue((MyTBVideoEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$22");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setContentMode(String.valueOf(obj), z);
                }
                return true;
            }
        },
        interactiveId { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.23
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass23 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$23");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                return true;
            }
        },
        userId { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.24
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass24 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$24");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                return true;
            }
        },
        miniProgressViewHidden { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.25
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass25 r2, String str, Object... objArr) {
                if (str.hashCode() == 921765104) {
                    return new Boolean(super.setValue((MyTBVideoEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$25");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setMiniProgressViewHidden(toBoolean(obj), z);
                }
                return true;
            }
        },
        networkErrorViewHidden { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.26
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass26 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$26");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                return true;
            }
        },
        toastViewHidden { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.27
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass27 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$27");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                return true;
            }
        },
        playingIconHidden { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.28
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass28 r2, String str, Object... objArr) {
                if (str.hashCode() == 921765104) {
                    return new Boolean(super.setValue((MyTBVideoEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$28");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setPlayingIconHidden(toBoolean(obj), z);
                }
                return true;
            }
        },
        gestureViewHidden { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.29
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass29 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$29");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                return true;
            }
        },
        controlsViewHidden { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.30
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass30 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$30");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                return true;
            }
        },
        loadingHidden { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.31
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass31 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$31");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                return true;
            }
        },
        playErrorViewHidden { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.32
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass32 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$32");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                return true;
            }
        },
        setWidth { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.33
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass33 r2, String str, Object... objArr) {
                if (str.hashCode() == 921765104) {
                    return new Boolean(super.setValue((MyTBVideoEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$33");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setWidth((int) toLong(obj), true);
                }
                return true;
            }
        },
        setHeight { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.34
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass34 r2, String str, Object... objArr) {
                if (str.hashCode() == 921765104) {
                    return new Boolean(super.setValue((MyTBVideoEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$34");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setHeight((int) toLong(obj), true);
                }
                return true;
            }
        },
        PanoType { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.35
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass35 r2, String str, Object... objArr) {
                if (str.hashCode() == 921765104) {
                    return new Boolean(super.setValue((MyTBVideoEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$35");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setPanoType(String.valueOf(obj), true);
                }
                return true;
            }
        },
        shownMuteBtn { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.36
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass36 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$36");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                return true;
            }
        },
        hideControl { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.37
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass37 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$37");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                return true;
            }
        },
        startPos { // from class: com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties.38
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass38 r2, String str, Object... objArr) {
                if (str.hashCode() == 921765104) {
                    return new Boolean(super.setValue((MyTBVideoEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties$38");
            }

            @Override // com.taobao.avplayer.embed.MyTBVideoEmbedView.EmbedProperties
            public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (super.setValue(myTBVideoEmbedView, obj, z)) {
                    myTBVideoEmbedView.setStartPos((int) toLong(obj), z);
                }
                return true;
            }
        };
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(EmbedProperties embedProperties, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBVideoEmbedView$EmbedProperties");
        }

        public static EmbedProperties valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EmbedProperties) ipChange.ipc$dispatch("80fb5e6b", new Object[]{str});
            }
            return (EmbedProperties) Enum.valueOf(EmbedProperties.class, str);
        }

        public boolean setValue(MyTBVideoEmbedView myTBVideoEmbedView, Object obj, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("36f104f0", new Object[]{this, myTBVideoEmbedView, obj, new Boolean(z)})).booleanValue();
            }
            if (obj == null || myTBVideoEmbedView == null) {
                return false;
            }
            return true;
        }

        public long toLong(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("824db8ee", new Object[]{this, obj})).longValue();
            }
            if (obj instanceof Long) {
                return ((Long) obj).longValue();
            }
            try {
                return Long.parseLong(String.valueOf(obj));
            } catch (Throwable unused) {
                return -1L;
            }
        }

        public boolean toBoolean(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("85b8f614", new Object[]{this, obj})).booleanValue();
            }
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            String valueOf = String.valueOf(obj);
            return "true".equals(valueOf) || "1".equals(valueOf);
        }
    }

    private View initTBPlayerInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fa600fbd", new Object[]{this});
        }
        feh fehVar = new feh(toString(), "");
        this.mLogContext = fehVar;
        AVSDKLog.e(fehVar, "myTBVideoEmbedView initTBPlayerInstance begin.");
        s.d dVar = new s.d();
        dVar.g = (Activity) this.mContext;
        dVar.o = this.mFrom;
        dVar.l = this.mSrc;
        dVar.i = this.mMuted;
        dVar.c0 = this.utParams;
        dVar.x = this.mWidth;
        dVar.m = this.mVideoId;
        dVar.V = this.mMediaInfoParams;
        dVar.j = this.mVideoSource;
        dVar.y = this.mHeight;
        dVar.A = this.mIsVideoLoop;
        dVar.d0 = getPanoType();
        int i = this.mStartPos;
        if (i > 0) {
            dVar.B = i;
        }
        DWAspectRatio dWAspectRatio = this.mAspectRatio;
        if (dWAspectRatio != null) {
            dVar.q = dWAspectRatio;
        }
        dVar.r = 2;
        dVar.Q = "H5";
        dVar.n = NAME;
        dVar.t = this;
        dVar.G = this;
        if (this.mIsVideoLoop) {
            dVar.I = this;
        }
        dVar.J = this;
        if (ew0.s(ja1.K(this.mContext, "DWInteractive", "setPlayScene", "true"))) {
            dVar.W = this.mVideoPlayScene;
        }
        if (!"highPerformance".equals(this.mPlayerScene) && !this.mMiniProgressViewHidden && !this.mPlayingIconHidden) {
            dVar.S = true;
        }
        if (!TextUtils.isEmpty(this.mThumbnailSrc)) {
            dVar.R = this.mThumbnailSrc;
        }
        s c = s.c.c("", dVar);
        this.mTBPlayerInstance = c;
        feh fehVar2 = this.mLogContext;
        if (fehVar2 == null) {
            this.mLogContext = new feh(toString(), this.mTBPlayerInstance.e.e());
        } else {
            fehVar2.c(c.e.e());
        }
        feh fehVar3 = this.mLogContext;
        AVSDKLog.e(fehVar3, "myTBVideoEmbedView create mTBPlayerInstance finished = " + this.mTBPlayerInstance);
        if (this.mAutoPlay || (this.mResume && this.mStarted)) {
            this.mStarted = true;
            this.mTBPlayerInstance.F();
        } else if (METADATA.equals(this.mPreload)) {
            this.mTBPlayerInstance.c("asyncPrepareVideo", null);
        }
        return this.mTBPlayerInstance.o();
    }

    public void setPlayControl(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb1ad0bc", new Object[]{this, str, new Boolean(z)});
        } else if (!z || this.mTBPlayerInstance == null) {
            this.mTBPlayerInstance.u();
        } else {
            this.mHasPlay = true;
            if ("play".equals(str)) {
                this.mTBPlayerInstance.F();
            }
        }
    }

    static {
        t2o.a(451936343);
        t2o.a(774897787);
        t2o.a(452985045);
        t2o.a(452985040);
        t2o.a(452985012);
        t2o.a(452985017);
        t2o.a(452985121);
        t2o.a(452985120);
    }
}
