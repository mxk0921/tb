package com.taobao.taolive.dinamicext.view;

import android.content.Context;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.dinamicext.view.a;
import com.taobao.taolive.room.player.preload.instance.PreloadParams;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import tb.arq;
import tb.dcc;
import tb.dhb;
import tb.fnr;
import tb.fz0;
import tb.j9t;
import tb.jw0;
import tb.kyw;
import tb.o3s;
import tb.r4d;
import tb.sc;
import tb.t2o;
import tb.uew;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBLiveView extends TUrlImageView implements dcc, a.AbstractC0742a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBLiveView";
    private Context mContext;
    private boolean mHasStop;
    private JSONObject mPlayerDataJSON;
    private PreloadParams.a mPreloadParams;
    private com.taobao.taolive.dinamicext.view.a mRTCHandler;
    private r4d mVideoView;
    private boolean mIsPlaying = false;
    private boolean mHasStarted = false;
    private boolean mIsAttachedToWindow = false;
    private int mTopLeftRadius = 0;
    private int mTopRightRadius = 0;
    private int mBottomLeftRadius = 0;
    private int mBottomRightRadius = 0;
    private boolean mMute = true;
    private kyw mHandler = new kyw(this);
    private int mRetryNum = 0;
    public dhb provider = j9t.e(Globals.getApplication(), "tbLiveCard").b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements IMediaPlayer.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.taolive.dinamicext.view.TBLiveView$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0741a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0741a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TBLiveView.access$102(TBLiveView.this, false);
                TBLiveView.access$200(TBLiveView.this);
            }
        }

        public a() {
        }

        @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.e
        public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5622e1ba", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
            }
            if (j == 3 && TBLiveView.access$000(TBLiveView.this) != null) {
                TBLiveView.access$000(TBLiveView.this).post(new RunnableC0741a());
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements IMediaPlayer.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.c
        public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1e2c1ca", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
            }
            TBLiveView.access$102(TBLiveView.this, false);
            if (TBLiveView.access$300(TBLiveView.this) != null && TBLiveView.access$300(TBLiveView.this).h(null, i, i2)) {
                return true;
            }
            TLog.loge("TBLiveView", "onError " + i);
            return false;
        }
    }

    static {
        t2o.a(779092464);
        t2o.a(806356530);
        t2o.a(779092458);
    }

    public TBLiveView(Context context) {
        super(context);
        this.mContext = context;
        init(context);
    }

    public static /* synthetic */ kyw access$000(TBLiveView tBLiveView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kyw) ipChange.ipc$dispatch("75eab86c", new Object[]{tBLiveView});
        }
        return tBLiveView.mHandler;
    }

    public static /* synthetic */ boolean access$102(TBLiveView tBLiveView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7c89691", new Object[]{tBLiveView, new Boolean(z)})).booleanValue();
        }
        tBLiveView.mHasStarted = z;
        return z;
    }

    public static /* synthetic */ void access$200(TBLiveView tBLiveView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deaa8b08", new Object[]{tBLiveView});
        } else {
            tBLiveView.onVideoStart();
        }
    }

    public static /* synthetic */ com.taobao.taolive.dinamicext.view.a access$300(TBLiveView tBLiveView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.dinamicext.view.a) ipChange.ipc$dispatch("a998b2ee", new Object[]{tBLiveView});
        }
        return tBLiveView.mRTCHandler;
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        TLog.loge("TBLiveView", "init ");
        this.mPreloadParams = new PreloadParams.a(context).N(this.mMute);
        o3s.b("TBLiveView", "TBLiveView init标准化流程");
        uew uewVar = new uew(this.mPreloadParams.G());
        this.mVideoView = uewVar;
        uewVar.A();
        a aVar = new a();
        this.mVideoView.d(new b());
        this.mVideoView.f(aVar);
    }

    public static /* synthetic */ Object ipc$super(TBLiveView tBLiveView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/dinamicext/view/TBLiveView");
        }
    }

    public static boolean isWiFiType(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2704346c", new Object[]{context})).booleanValue();
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || activeNetworkInfo.getType() != 1) {
            return false;
        }
        return true;
    }

    private void restart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd48316", new Object[]{this});
            return;
        }
        destroy();
        init(this.mContext);
        initView();
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        TLog.loge("TBLiveView", "destroy ====");
        com.taobao.taolive.dinamicext.view.a aVar = this.mRTCHandler;
        if (aVar != null) {
            aVar.a();
            this.mRTCHandler = null;
        }
        kyw kywVar = this.mHandler;
        if (kywVar != null) {
            kywVar.removeCallbacksAndMessages(null);
        }
        stopVideo();
        r4d r4dVar = this.mVideoView;
        if (r4dVar != null) {
            r4dVar.destroy();
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            try {
                viewGroup.removeView(this.mVideoView.getView());
            } catch (Exception unused) {
                return;
            }
        }
        this.mPreloadParams = null;
    }

    @Override // tb.dcc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        }
    }

    public void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        TLog.loge("TBLiveView", sc.initView);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            try {
                viewGroup.addView(this.mVideoView.getView(), Math.max(0, ((ViewGroup) getParent()).indexOfChild(this) - 1), layoutParams);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.mIsAttachedToWindow = true;
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.mIsAttachedToWindow = false;
        destroy();
    }

    public void setCornerRadius(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9823bd90", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.mTopLeftRadius = i;
        this.mTopRightRadius = i2;
        this.mBottomLeftRadius = i3;
        this.mBottomRightRadius = i4;
    }

    public void setPlayerData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f30ff3c", new Object[]{this, jSONObject});
            return;
        }
        this.mPlayerDataJSON = jSONObject;
        this.mRTCHandler = null;
    }

    public void stopVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d778dda0", new Object[]{this});
            return;
        }
        this.mHasStop = true;
        this.mHasStarted = false;
        com.taobao.taolive.dinamicext.view.a aVar = this.mRTCHandler;
        if (aVar != null) {
            aVar.a();
            this.mRTCHandler = null;
        }
        r4d r4dVar = this.mVideoView;
        if (r4dVar != null) {
            r4dVar.release();
        }
        onVideoStop();
    }

    private void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        TLog.loge("TBLiveView", "onVideoStart ====");
        this.mIsPlaying = true;
        fz0.a(this, 300L);
    }

    private void onVideoStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894a6d85", new Object[]{this});
            return;
        }
        TLog.loge("TBLiveView", "onVideoStop ====");
        if (this.mIsPlaying) {
            fz0.b(this, 300L);
        }
        this.mIsPlaying = false;
    }

    private boolean retryVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6555dbe", new Object[]{this})).booleanValue();
        }
        TLog.loge("TBLiveView", "retryVideo");
        if (!jw0.e() || !this.mIsAttachedToWindow || jw0.g(getContext()) || this.mPlayerDataJSON == null) {
            return false;
        }
        TLog.loge("TBLiveView", "retryVideo 1");
        MediaLiveInfo convert = convert(this.mPlayerDataJSON);
        if (convert == null) {
            TLog.loge("TBLiveView", "retryVideo mediaInfo == null");
            return false;
        }
        fnr fnrVar = new fnr(null, "", convert);
        fnrVar.m = this.mPlayerDataJSON.getString("liveConfigForStream");
        fnrVar.g = new Rect(this.mTopLeftRadius, this.mTopRightRadius, this.mBottomRightRadius, this.mBottomLeftRadius);
        fnrVar.h = this.mPlayerDataJSON.getString("feedId");
        return startVideo(fnrVar);
    }

    public boolean playVideoIfNecessary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71d85196", new Object[]{this})).booleanValue();
        }
        this.mRetryNum = 0;
        TLog.loge("TBLiveView", "playVideoIfNecessary");
        if (!jw0.e() || !this.mIsAttachedToWindow || jw0.g(getContext()) || this.mPlayerDataJSON == null) {
            return false;
        }
        TLog.loge("TBLiveView", "playVideoIfNecessary 1");
        MediaLiveInfo convert = convert(this.mPlayerDataJSON);
        if (convert == null) {
            TLog.loge("TBLiveView", "playVideoIfNecessary mediaInfo == null");
            return false;
        }
        if (this.mHasStop) {
            restart();
        }
        if (this.mRTCHandler == null) {
            com.taobao.taolive.dinamicext.view.a aVar = new com.taobao.taolive.dinamicext.view.a(convert);
            this.mRTCHandler = aVar;
            aVar.i(this);
        }
        fnr fnrVar = new fnr(null, "", convert);
        fnrVar.m = this.mPlayerDataJSON.getString("liveConfigForStream");
        fnrVar.g = new Rect(this.mTopLeftRadius, this.mTopRightRadius, this.mBottomRightRadius, this.mBottomLeftRadius);
        fnrVar.h = this.mPlayerDataJSON.getString("feedId");
        return startVideo(fnrVar);
    }

    private MediaLiveInfo convert(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaLiveInfo) ipChange.ipc$dispatch("a04b6fa1", new Object[]{this, jSONObject});
        }
        MediaLiveInfo mediaLiveInfo = null;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.getIntValue("roomStatus") == 1) {
            mediaLiveInfo = new MediaLiveInfo();
            JSONArray jSONArray = jSONObject.getJSONArray("liveUrlList");
            int size = jSONArray.size();
            mediaLiveInfo.h265 = arq.c(jSONObject.getString("h265"));
            mediaLiveInfo.mediaConfig = jSONObject.getString("mediaConfig");
            mediaLiveInfo.rateAdapte = arq.c(jSONObject.getString(yj4.PARAM_MEDIA_INFO_RATEADAPTE));
            mediaLiveInfo.liveUrlList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                QualityLiveItem qualityLiveItem = new QualityLiveItem();
                qualityLiveItem.artpUrl = jSONObject2.getString(yj4.PARAM_MEDIA_INFO_ARTPURL);
                qualityLiveItem.definition = jSONObject2.getString("definition");
                qualityLiveItem.flvUrl = jSONObject2.getString(yj4.PARAM_MEDIA_INFO_FLVURL);
                qualityLiveItem.h265Url = jSONObject2.getString(yj4.PARAM_MEDIA_INFO_H265URL);
                qualityLiveItem.hlsUrl = jSONObject2.getString(yj4.PARAM_MEDIA_INFO_HLSURL);
                qualityLiveItem.name = jSONObject2.getString("name");
                qualityLiveItem.wholeH265FlvUrl = jSONObject2.getString(yj4.PARAM_MEDIA_INFO_wholeH265FlvUrl);
                qualityLiveItem.bfrtcUrl = jSONObject2.getString(MediaConstant.BFRTC_URL_NAME);
                qualityLiveItem.rtcLiveUrl = jSONObject2.getString(MediaConstant.RTCLIVE_URL_NAME);
                mediaLiveInfo.liveUrlList.add(qualityLiveItem);
            }
        }
        return mediaLiveInfo;
    }

    @Override // com.taobao.taolive.dinamicext.view.a.AbstractC0742a
    public void retry(boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c74412c5", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        r4d r4dVar = this.mVideoView;
        if (r4dVar != null && this.mRetryNum < 2) {
            r4dVar.release();
            retryVideo();
            this.mRetryNum++;
            TLog.loge("TBLiveView", "retry");
        }
    }

    private boolean startVideo(fnr fnrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74909e2", new Object[]{this, fnrVar})).booleanValue();
        }
        TLog.loge("TBLiveView", "startVideo");
        if (fnrVar == null) {
            return false;
        }
        dhb dhbVar = this.provider;
        if (dhbVar != null) {
            int intValue = ((Integer) dhbVar.d("tbLiveCard", "video", 1, null)).intValue();
            if (intValue == 2) {
                TLog.loge("TBLiveView", "startVideo iAppSetting == 2");
                return false;
            } else if (intValue == 0 && !isWiFiType(getContext().getApplicationContext())) {
                TLog.loge("TBLiveView", "startVideo iAppSetting == 0");
                return false;
            }
        }
        if (this.mVideoView == null || this.mHasStarted) {
            return false;
        }
        TLog.loge("TBLiveView", "startVideo start");
        if (this.mPreloadParams == null) {
            this.mPreloadParams = new PreloadParams.a(this.mContext);
        }
        this.mPreloadParams.e0(fnrVar).F(fnrVar.d).Z(0).N(this.mMute).U("TBLiveView");
        this.mVideoView.p(this.mPreloadParams.G());
        this.mHasStarted = true;
        return true;
    }

    public TBLiveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context;
        init(context);
    }

    public TBLiveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContext = context;
        init(context);
    }
}
