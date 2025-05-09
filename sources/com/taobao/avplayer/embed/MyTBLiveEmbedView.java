package com.taobao.avplayer.embed;

import android.content.Context;
import android.taobao.windvane.embed.BaseEmbedView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.MediaPlayCenter;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.mediaplay.MediaType;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.mediaplay.player.MediaAspectRatio;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.ArrayList;
import java.util.HashMap;
import tb.ac8;
import tb.asc;
import tb.feh;
import tb.iv8;
import tb.m7r;
import tb.pg1;
import tb.t2o;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MyTBLiveEmbedView extends BaseEmbedView implements asc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String COMPONENT_NAME = "H5live";
    private static final String Event_State = "changeState";
    private static final String Event_error = "error";
    public static final String NAME = "wvlivevideo";
    private Context mContext;
    private feh mLogContext;
    private MediaPlayCenter mMediaPlayCenter;
    private String mPlayScenes;
    private static String PLAYING = "2004";
    private static String PAUSED = "2005";
    private static String FIRST_FRAME = "2006";
    private static String LOADING = iv8.FCANVAS_ERROR_OPEN_GL;
    private static String END = "2008";
    private FrameLayout mComponentHostView = null;
    private String mSrc = null;
    private int mScenarioType = 0;
    private MediaType mMediaType = MediaType.LIVE;
    private boolean mAutoPlay = false;
    private boolean mMuted = true;
    private MediaAspectRatio mObjectFit = MediaAspectRatio.DW_CENTER_CROP;
    private String mBizCode = null;
    private String mSubBizCode = null;
    private String mFeedId = null;
    public boolean mUsePlayerManager = false;
    private String mLiveUrlResources = null;
    private int mWidth = 0;
    private int mHeight = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum EmbedProperties {
        src { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                if (str.hashCode() == 1956596749) {
                    return new Boolean(super.setValue((MyTBLiveEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBLiveEmbedView$EmbedProperties$1");
            }

            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties
            public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("749f4c0d", new Object[]{this, myTBLiveEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (!super.setValue(myTBLiveEmbedView, obj, z)) {
                    return false;
                }
                MyTBLiveEmbedView.access$100(myTBLiveEmbedView, String.valueOf(obj));
                return true;
            }
        },
        muted { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                if (str.hashCode() == 1956596749) {
                    return new Boolean(super.setValue((MyTBLiveEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBLiveEmbedView$EmbedProperties$2");
            }

            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties
            public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("749f4c0d", new Object[]{this, myTBLiveEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (!super.setValue(myTBLiveEmbedView, obj, z)) {
                    return false;
                }
                MyTBLiveEmbedView.access$200(myTBLiveEmbedView, Boolean.parseBoolean(String.valueOf(obj)), z);
                return true;
            }
        },
        autoplay { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                if (str.hashCode() == 1956596749) {
                    return new Boolean(super.setValue((MyTBLiveEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBLiveEmbedView$EmbedProperties$3");
            }

            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties
            public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("749f4c0d", new Object[]{this, myTBLiveEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (!super.setValue(myTBLiveEmbedView, obj, z)) {
                    return false;
                }
                MyTBLiveEmbedView.access$300(myTBLiveEmbedView, Boolean.parseBoolean(String.valueOf(obj)));
                return true;
            }
        },
        autoPlay { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                if (str.hashCode() == 1956596749) {
                    return new Boolean(super.setValue((MyTBLiveEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBLiveEmbedView$EmbedProperties$4");
            }

            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties
            public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("749f4c0d", new Object[]{this, myTBLiveEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (!super.setValue(myTBLiveEmbedView, obj, z)) {
                    return false;
                }
                MyTBLiveEmbedView.access$300(myTBLiveEmbedView, Boolean.parseBoolean(String.valueOf(obj)));
                return true;
            }
        },
        scenarioType { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
                if (str.hashCode() == 1956596749) {
                    return new Boolean(super.setValue((MyTBLiveEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBLiveEmbedView$EmbedProperties$5");
            }

            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties
            public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
                int i = 0;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("749f4c0d", new Object[]{this, myTBLiveEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (!super.setValue(myTBLiveEmbedView, obj, z)) {
                    return false;
                }
                try {
                    i = Integer.valueOf(String.valueOf(obj)).intValue();
                } catch (Throwable unused) {
                }
                myTBLiveEmbedView.setScenarioType(i);
                return true;
            }
        },
        objectFit { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass6 r2, String str, Object... objArr) {
                if (str.hashCode() == 1956596749) {
                    return new Boolean(super.setValue((MyTBLiveEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBLiveEmbedView$EmbedProperties$6");
            }

            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties
            public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("749f4c0d", new Object[]{this, myTBLiveEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (!super.setValue(myTBLiveEmbedView, obj, z)) {
                    return false;
                }
                myTBLiveEmbedView.setObjectFit(String.valueOf(obj));
                return true;
            }
        },
        bizCode { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass7 r2, String str, Object... objArr) {
                if (str.hashCode() == 1956596749) {
                    return new Boolean(super.setValue((MyTBLiveEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBLiveEmbedView$EmbedProperties$7");
            }

            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties
            public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("749f4c0d", new Object[]{this, myTBLiveEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (!super.setValue(myTBLiveEmbedView, obj, z)) {
                    return false;
                }
                myTBLiveEmbedView.setBizCode(String.valueOf(obj));
                return true;
            }
        },
        subBizCode { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass8 r2, String str, Object... objArr) {
                if (str.hashCode() == 1956596749) {
                    return new Boolean(super.setValue((MyTBLiveEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBLiveEmbedView$EmbedProperties$8");
            }

            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties
            public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("749f4c0d", new Object[]{this, myTBLiveEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (!super.setValue(myTBLiveEmbedView, obj, z)) {
                    return false;
                }
                myTBLiveEmbedView.setSubBizCode(String.valueOf(obj));
                return true;
            }
        },
        from { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass9 r2, String str, Object... objArr) {
                if (str.hashCode() == 1956596749) {
                    return new Boolean(super.setValue((MyTBLiveEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBLiveEmbedView$EmbedProperties$9");
            }

            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties
            public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("749f4c0d", new Object[]{this, myTBLiveEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (!super.setValue(myTBLiveEmbedView, obj, z)) {
                    return false;
                }
                myTBLiveEmbedView.setSubBizCode(String.valueOf(obj));
                return true;
            }
        },
        videoPlayScenes { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass10 r2, String str, Object... objArr) {
                if (str.hashCode() == 1956596749) {
                    return new Boolean(super.setValue((MyTBLiveEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBLiveEmbedView$EmbedProperties$10");
            }

            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties
            public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("749f4c0d", new Object[]{this, myTBLiveEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (!super.setValue(myTBLiveEmbedView, obj, z)) {
                    return false;
                }
                myTBLiveEmbedView.setPlayScenes(String.valueOf(obj));
                return true;
            }
        },
        feedId { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass11 r2, String str, Object... objArr) {
                if (str.hashCode() == 1956596749) {
                    return new Boolean(super.setValue((MyTBLiveEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBLiveEmbedView$EmbedProperties$11");
            }

            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties
            public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("749f4c0d", new Object[]{this, myTBLiveEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (!super.setValue(myTBLiveEmbedView, obj, z)) {
                    return false;
                }
                myTBLiveEmbedView.setFeedId(String.valueOf(obj));
                return true;
            }
        },
        usePlayerManager { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass12 r2, String str, Object... objArr) {
                if (str.hashCode() == 1956596749) {
                    return new Boolean(super.setValue((MyTBLiveEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBLiveEmbedView$EmbedProperties$12");
            }

            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties
            public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("749f4c0d", new Object[]{this, myTBLiveEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (!super.setValue(myTBLiveEmbedView, obj, z)) {
                    return false;
                }
                myTBLiveEmbedView.setUsePlayerManager(Boolean.parseBoolean(obj.toString()));
                return true;
            }
        },
        liveUrlResources { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass13 r2, String str, Object... objArr) {
                if (str.hashCode() == 1956596749) {
                    return new Boolean(super.setValue((MyTBLiveEmbedView) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue()));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBLiveEmbedView$EmbedProperties$13");
            }

            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.EmbedProperties
            public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("749f4c0d", new Object[]{this, myTBLiveEmbedView, obj, new Boolean(z)})).booleanValue();
                }
                if (!super.setValue(myTBLiveEmbedView, obj, z)) {
                    return false;
                }
                String valueOf = String.valueOf(obj);
                if (TextUtils.isEmpty(valueOf)) {
                    return true;
                }
                myTBLiveEmbedView.setLiveUrlResources(valueOf, z);
                return true;
            }
        };
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(EmbedProperties embedProperties, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBLiveEmbedView$EmbedProperties");
        }

        public static EmbedProperties valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EmbedProperties) ipChange.ipc$dispatch("b3c79c86", new Object[]{str});
            }
            return (EmbedProperties) Enum.valueOf(EmbedProperties.class, str);
        }

        public boolean setValue(MyTBLiveEmbedView myTBLiveEmbedView, Object obj, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("749f4c0d", new Object[]{this, myTBLiveEmbedView, obj, new Boolean(z)})).booleanValue();
            }
            if (obj == null || myTBLiveEmbedView == null) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum JSMethod {
        setMuted { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.JSMethod.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBLiveEmbedView$JSMethod$1");
            }

            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.JSMethod
            public boolean doSomething(MyTBLiveEmbedView myTBLiveEmbedView, String str, WVCallBackContext wVCallBackContext) {
                JSONObject parseObject;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("b352ecda", new Object[]{this, myTBLiveEmbedView, str, wVCallBackContext})).booleanValue();
                }
                if (!TextUtils.isEmpty(str) && (parseObject = JSON.parseObject(str)) != null) {
                    MyTBLiveEmbedView.access$500(myTBLiveEmbedView, Boolean.TRUE.equals(parseObject.getBoolean("muted")));
                    if (wVCallBackContext != null) {
                        wVCallBackContext.success();
                    }
                }
                return true;
            }
        },
        play { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.JSMethod.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                if (str.hashCode() == -1286411046) {
                    return new Boolean(super.doSomething((MyTBLiveEmbedView) objArr[0], (String) objArr[1], (WVCallBackContext) objArr[2]));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBLiveEmbedView$JSMethod$2");
            }

            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.JSMethod
            public boolean doSomething(MyTBLiveEmbedView myTBLiveEmbedView, String str, WVCallBackContext wVCallBackContext) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("b352ecda", new Object[]{this, myTBLiveEmbedView, str, wVCallBackContext})).booleanValue();
                }
                if (!super.doSomething(myTBLiveEmbedView, str, wVCallBackContext) && wVCallBackContext != null) {
                    wVCallBackContext.error();
                }
                MyTBLiveEmbedView.access$600(myTBLiveEmbedView);
                if (wVCallBackContext != null) {
                    wVCallBackContext.success();
                }
                return true;
            }
        },
        pause { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.JSMethod.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                if (str.hashCode() == -1286411046) {
                    return new Boolean(super.doSomething((MyTBLiveEmbedView) objArr[0], (String) objArr[1], (WVCallBackContext) objArr[2]));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBLiveEmbedView$JSMethod$3");
            }

            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.JSMethod
            public boolean doSomething(MyTBLiveEmbedView myTBLiveEmbedView, String str, WVCallBackContext wVCallBackContext) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("b352ecda", new Object[]{this, myTBLiveEmbedView, str, wVCallBackContext})).booleanValue();
                }
                if (!super.doSomething(myTBLiveEmbedView, str, wVCallBackContext) && wVCallBackContext != null) {
                    wVCallBackContext.error();
                }
                MyTBLiveEmbedView.access$700(myTBLiveEmbedView);
                if (wVCallBackContext != null) {
                    wVCallBackContext.success();
                }
                return true;
            }
        },
        seekTo { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.JSMethod.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                if (str.hashCode() == -1286411046) {
                    return new Boolean(super.doSomething((MyTBLiveEmbedView) objArr[0], (String) objArr[1], (WVCallBackContext) objArr[2]));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBLiveEmbedView$JSMethod$4");
            }

            @Override // com.taobao.avplayer.embed.MyTBLiveEmbedView.JSMethod
            public boolean doSomething(MyTBLiveEmbedView myTBLiveEmbedView, String str, WVCallBackContext wVCallBackContext) {
                JSONObject parseObject;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("b352ecda", new Object[]{this, myTBLiveEmbedView, str, wVCallBackContext})).booleanValue();
                }
                if (!super.doSomething(myTBLiveEmbedView, str, wVCallBackContext) && wVCallBackContext != null) {
                    wVCallBackContext.error();
                }
                if (!TextUtils.isEmpty(str) && (parseObject = JSON.parseObject(str)) != null) {
                    try {
                        MyTBLiveEmbedView.access$800(myTBLiveEmbedView, Integer.parseInt(parseObject.getString("time")) * 1000);
                        if (wVCallBackContext != null) {
                            wVCallBackContext.success();
                        }
                    } catch (Throwable unused) {
                    }
                }
                return true;
            }
        };
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(JSMethod jSMethod, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBLiveEmbedView$JSMethod");
        }

        public static JSMethod valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSMethod) ipChange.ipc$dispatch("dab65a3a", new Object[]{str});
            }
            return (JSMethod) Enum.valueOf(JSMethod.class, str);
        }

        public boolean doSomething(MyTBLiveEmbedView myTBLiveEmbedView, String str, WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b352ecda", new Object[]{this, myTBLiveEmbedView, str, wVCallBackContext})).booleanValue();
            }
            if (TextUtils.isEmpty(str) || wVCallBackContext == null) {
                return false;
            }
            return true;
        }
    }

    static {
        t2o.a(451936322);
        t2o.a(774897787);
    }

    public static /* synthetic */ void access$100(MyTBLiveEmbedView myTBLiveEmbedView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("339ba257", new Object[]{myTBLiveEmbedView, str});
        } else {
            myTBLiveEmbedView.setSrc(str);
        }
    }

    public static /* synthetic */ void access$200(MyTBLiveEmbedView myTBLiveEmbedView, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("661d0bac", new Object[]{myTBLiveEmbedView, new Boolean(z), new Boolean(z2)});
        } else {
            myTBLiveEmbedView.setMuted(z, z2);
        }
    }

    public static /* synthetic */ void access$300(MyTBLiveEmbedView myTBLiveEmbedView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8843dda9", new Object[]{myTBLiveEmbedView, new Boolean(z)});
        } else {
            myTBLiveEmbedView.setAutoPlay(z);
        }
    }

    public static /* synthetic */ void access$500(MyTBLiveEmbedView myTBLiveEmbedView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2b940ab", new Object[]{myTBLiveEmbedView, new Boolean(z)});
        } else {
            myTBLiveEmbedView.mute(z);
        }
    }

    public static /* synthetic */ void access$600(MyTBLiveEmbedView myTBLiveEmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf7b75a8", new Object[]{myTBLiveEmbedView});
        } else {
            myTBLiveEmbedView.play();
        }
    }

    public static /* synthetic */ void access$700(MyTBLiveEmbedView myTBLiveEmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed541007", new Object[]{myTBLiveEmbedView});
        } else {
            myTBLiveEmbedView.pause();
        }
    }

    public static /* synthetic */ void access$800(MyTBLiveEmbedView myTBLiveEmbedView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a69155d", new Object[]{myTBLiveEmbedView, new Integer(i)});
        } else {
            myTBLiveEmbedView.seekTo(i);
        }
    }

    private synchronized void destroyInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e56f9103", new Object[]{this});
        } else if (this.mMediaPlayCenter != null) {
            try {
                AVSDKLog.e(this.mLogContext, "Embed Video destroy");
                this.mMediaPlayCenter.release();
                this.mMediaPlayCenter.destroy();
                this.mMediaPlayCenter = null;
            } catch (Throwable unused) {
            }
        }
    }

    private void fireEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23b3b231", new Object[]{this, str, obj});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "firent " + str + ":" + String.valueOf(obj));
        HashMap hashMap = new HashMap(1);
        hashMap.put("code", obj);
        ac8.a(this.webView, this.id, str, JSON.toJSONString(hashMap));
    }

    public static /* synthetic */ Object ipc$super(MyTBLiveEmbedView myTBLiveEmbedView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1126948911:
                return new Boolean(super.execute((String) objArr[0], (String) objArr[1], (WVCallBackContext) objArr[2]));
            case 797441118:
                super.onPause();
                return null;
            case 2111529549:
                super.onParamChanged((String[]) objArr[0], (String[]) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBLiveEmbedView");
        }
    }

    private void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.mMediaPlayCenter;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.mute(z);
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
            Object obj = this.params.mObjectParam.get(embedProperties.name());
            if (obj != null) {
                embedProperties.setValue(this, obj, false);
            }
        }
    }

    private void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.mMediaPlayCenter;
        if (mediaPlayCenter != null) {
            if (this.mScenarioType < 2) {
                mediaPlayCenter.release();
                fireEvent(Event_State, PAUSED);
                return;
            }
            mediaPlayCenter.pause();
        }
    }

    private void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.mMediaPlayCenter;
        if (mediaPlayCenter != null) {
            if (this.mScenarioType < 2) {
                mediaPlayCenter.setup();
                fireEvent(Event_State, 2007);
            }
            this.mMediaPlayCenter.start();
        }
    }

    private void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.mMediaPlayCenter;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.seekTo(i);
        }
    }

    private void setAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c396e48", new Object[]{this, new Boolean(z)});
        } else {
            this.mAutoPlay = z;
        }
    }

    private void setHeight(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbeb8461", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            this.mHeight = i;
        }
    }

    private void setMuted(boolean z, boolean z2) {
        MediaPlayCenter mediaPlayCenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d188b0", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.mMuted = z;
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "MyTBLiveEmbedView Builder, sbt=" + this.mSubBizCode + ", setMute=" + this.mMuted);
        if (z2 && (mediaPlayCenter = this.mMediaPlayCenter) != null) {
            mediaPlayCenter.setMute(z);
            this.mMediaPlayCenter.mute(z);
        }
    }

    private void setSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
        } else {
            this.mSrc = str;
        }
    }

    private void setWidth(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3cb1a7c", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            this.mWidth = i;
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7334ca29", new Object[]{this, context});
        }
        this.mContext = context;
        parseParam();
        this.mLogContext = new feh(toString(), "");
        return genVideoView();
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public String getViewType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35692924", new Object[]{this});
        }
        return NAME;
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        destroyInner();
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
        } else {
            fireEvent(Event_State, END);
        }
    }

    @Override // tb.asc
    public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
            return;
        }
        if (-400 > i && i > -500) {
            i3 = m7r.ACTIONBAR_MENU_RIGHT;
        } else if (-500 >= i && i > -600) {
            i3 = m7r.ACTIONBAR_MENU_LIST;
        } else if (i == -5) {
            i3 = 1008;
        } else if (i == -10006 || i == -10000) {
            i3 = 3002;
        } else if (i == -10205) {
            i3 = 1024;
        } else {
            i3 = 1023;
        }
        fireEvent("error", Integer.valueOf(i3));
    }

    @Override // tb.asc
    public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
        } else if (j == 3) {
            fireEvent(Event_State, FIRST_FRAME);
        }
    }

    @Override // tb.asc
    public void onMediaPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
        } else {
            fireEvent(Event_State, PAUSED);
        }
    }

    @Override // tb.asc
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
        } else {
            fireEvent(Event_State, PLAYING);
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
            fireEvent(Event_State, PLAYING);
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

    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else {
            this.mBizCode = str;
        }
    }

    public void setFeedId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3518aac", new Object[]{this, str});
        } else {
            this.mFeedId = str;
        }
    }

    public void setLiveUrlResources(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34da0df", new Object[]{this, str, new Boolean(z)});
        } else {
            this.mLiveUrlResources = str;
        }
    }

    public void setObjectFit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cbbb4a1", new Object[]{this, str});
        } else if (TextUtils.equals(str, pg1.ATOM_EXT_fill)) {
            this.mObjectFit = MediaAspectRatio.DW_CENTER_CROP;
        } else {
            this.mObjectFit = MediaAspectRatio.DW_FIT_CENTER;
        }
    }

    public void setPlayScenes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd7e5e8e", new Object[]{this, str});
        } else {
            this.mPlayScenes = str;
        }
    }

    public void setScenarioType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8557a670", new Object[]{this, new Integer(i)});
        } else {
            this.mScenarioType = i;
        }
    }

    public void setSubBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("659b3253", new Object[]{this, str});
        } else {
            this.mSubBizCode = str;
        }
    }

    public void setUsePlayerManager(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8cc6bc6", new Object[]{this, new Boolean(z)});
        } else {
            this.mUsePlayerManager = z;
        }
    }

    private View genVideoView() {
        MediaLiveInfo mediaLiveInfo;
        ArrayList<QualityLiveItem> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("cc8b6559", new Object[]{this});
        }
        if (this.mComponentHostView == null) {
            this.mComponentHostView = new FrameLayout(this.mContext) { // from class: com.taobao.avplayer.embed.MyTBLiveEmbedView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r3, String str, Object... objArr) {
                    if (str.hashCode() == 1389530587) {
                        super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                        return null;
                    }
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/embed/MyTBLiveEmbedView$1");
                }

                @Override // android.view.View
                public void onSizeChanged(int i, int i2, int i3, int i4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                    } else {
                        super.onSizeChanged(i, i2, i3, i4);
                    }
                }
            };
        }
        MediaPlayCenter mediaPlayCenter = new MediaPlayCenter(this.mContext);
        this.mMediaPlayCenter = mediaPlayCenter;
        mediaPlayCenter.setUsingInterface(COMPONENT_NAME);
        if (!TextUtils.isEmpty(this.mLiveUrlResources)) {
            try {
                mediaLiveInfo = (MediaLiveInfo) JSON.parseObject(this.mLiveUrlResources, MediaLiveInfo.class);
            } catch (Exception e) {
                feh fehVar = this.mLogContext;
                AVSDKLog.e(fehVar, "parseObject MediaLiveInfo error " + e.toString());
                mediaLiveInfo = null;
            }
            if (!(mediaLiveInfo == null || (arrayList = mediaLiveInfo.liveUrlList) == null || arrayList.size() <= 0)) {
                this.mMediaPlayCenter.updateLiveMediaInfoData(mediaLiveInfo);
            }
        }
        this.mMediaPlayCenter.setUseBfrtc(true);
        this.mMediaPlayCenter.setUseRtcLive(true);
        this.mMediaPlayCenter.setAutoDegradedWhenError(true);
        this.mMediaPlayCenter.setMediaUrl(this.mSrc);
        this.mMediaPlayCenter.setScenarioType(this.mScenarioType);
        this.mMediaPlayCenter.setMediaType(this.mMediaType);
        this.mMediaPlayCenter.setMute(this.mMuted);
        MediaAspectRatio mediaAspectRatio = this.mObjectFit;
        if (mediaAspectRatio != null) {
            this.mMediaPlayCenter.setMediaAspectRatio(mediaAspectRatio);
        }
        this.mMediaPlayCenter.setBusinessId(NAME);
        if (!TextUtils.isEmpty(this.mSubBizCode)) {
            this.mMediaPlayCenter.setBizCode(this.mSubBizCode);
        }
        if (!TextUtils.isEmpty(this.mPlayScenes)) {
            this.mMediaPlayCenter.setPlayScenes(this.mPlayScenes);
        }
        if (!TextUtils.isEmpty(this.mFeedId)) {
            this.mMediaPlayCenter.setMediaId(this.mFeedId);
        }
        this.mMediaPlayCenter.hideController();
        this.mMediaPlayCenter.setNeedPlayControlView(false);
        this.mMediaPlayCenter.setMediaLifecycleListener(this);
        this.mMediaPlayCenter.setPlayerType(3);
        this.mMediaPlayCenter.setup();
        this.mLogContext.c(this.mMediaPlayCenter.getPlayToken());
        this.mComponentHostView.addView(this.mMediaPlayCenter.getView(), new FrameLayout.LayoutParams(-1, -1, 17));
        if (this.mAutoPlay) {
            fireEvent(Event_State, LOADING);
            this.mMediaPlayCenter.start();
        }
        AVSDKLog.e(this.mLogContext, "init EmbedLive View");
        return this.mComponentHostView;
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
                feh fehVar = this.mLogContext;
                AVSDKLog.e(fehVar, "onParamChanged key:" + str + " Value : " + String.valueOf(str2));
                embedProperties.setValue(this, str2, true);
            }
        }
    }
}
