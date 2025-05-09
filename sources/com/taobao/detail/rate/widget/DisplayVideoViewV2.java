package com.taobao.detail.rate.widget;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.q;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.weex.common.Constants;
import com.uc.webview.export.media.CommandID;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Metadata;
import tb.a07;
import tb.a7m;
import tb.bew;
import tb.ckf;
import tb.iiz;
import tb.pb6;
import tb.q75;
import tb.qtb;
import tb.sc;
import tb.uhn;
import tb.usj;
import tb.vt5;
import tb.wfp;
import tb.xgn;
import tb.y7t;
import tb.ztb;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b;\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u0094\u00012\u00020\u00012\u00020\u0002:\u0002\u0095\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\rJ\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\rJ\u000f\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\rJ\u000f\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J;\u0010!\u001a&\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u001ej\u0012\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u0001` 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b!\u0010\"J)\u0010'\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010)\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000bH\u0016¢\u0006\u0004\b+\u0010\rJ\u0017\u0010,\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0013H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000bH\u0016¢\u0006\u0004\b.\u0010\rJ)\u0010/\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0016¢\u0006\u0004\b/\u0010(J'\u00103\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0007H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u000bH\u0016¢\u0006\u0004\b5\u0010\rJ\u0017\u00106\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000bH\u0016¢\u0006\u0004\b8\u0010\rJ\u000f\u00109\u001a\u00020\u000bH\u0016¢\u0006\u0004\b9\u0010\rJ\u000f\u0010:\u001a\u00020\u000bH\u0016¢\u0006\u0004\b:\u0010\rJ\r\u0010;\u001a\u00020\u000b¢\u0006\u0004\b;\u0010\rJ\r\u0010<\u001a\u00020\u000b¢\u0006\u0004\b<\u0010\rJ\u000f\u0010=\u001a\u00020\u000bH\u0014¢\u0006\u0004\b=\u0010\rJ\u000f\u0010>\u001a\u00020\u000bH\u0016¢\u0006\u0004\b>\u0010\rJ\u000f\u0010?\u001a\u00020\u000bH\u0014¢\u0006\u0004\b?\u0010\rJ\u001f\u0010B\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u0007H\u0016¢\u0006\u0004\bB\u0010CJ\u0019\u0010E\u001a\u00020\u000b2\b\u0010D\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\bE\u0010FJ\u0019\u0010H\u001a\u00020\u000b2\b\u0010G\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\bH\u0010FJ\u0019\u0010J\u001a\u00020\u000b2\b\u0010I\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\bJ\u0010FJ\u0017\u0010L\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020\u0013H\u0016¢\u0006\u0004\bL\u0010-J\u0017\u0010N\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020\u0013H\u0016¢\u0006\u0004\bN\u0010-J\u0019\u0010P\u001a\u00020\u000b2\b\u0010O\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\bP\u0010FJ\u0019\u0010Q\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\bQ\u0010RJ\u0019\u0010T\u001a\u00020\u000b2\b\u0010S\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\bT\u0010FJ\u0019\u0010V\u001a\u00020\u000b2\b\u0010U\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\bV\u0010FJ\u0017\u0010X\u001a\u00020\u000b2\u0006\u0010W\u001a\u00020\u0007H\u0016¢\u0006\u0004\bX\u00107J\u0017\u0010Z\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020\u0013H\u0016¢\u0006\u0004\bZ\u0010-J\u0017\u0010\\\u001a\u00020\u000b2\u0006\u0010[\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\\\u0010-J\u0019\u0010^\u001a\u00020\u000b2\b\u0010]\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b^\u0010FJ\u0017\u0010a\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020_H\u0016¢\u0006\u0004\ba\u0010bJ\u0011\u0010d\u001a\u0004\u0018\u00010cH\u0016¢\u0006\u0004\bd\u0010eJ\u0011\u0010f\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\bf\u0010gJ\u0011\u0010h\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\bh\u0010iR\u001a\u0010j\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u001a\u0010n\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\bn\u0010k\u001a\u0004\bo\u0010mR\u001a\u0010p\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\bp\u0010k\u001a\u0004\bq\u0010mR\u0016\u0010s\u001a\u00020r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010u\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010tR\u0018\u0010w\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010y\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010|\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0019\u0010\u007f\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001b\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0083\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010kR\u0018\u0010\u0084\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010kR\u001b\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001b\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0086\u0001R\u001b\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0086\u0001R\u0018\u0010\u0089\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010zR\u0016\u0010M\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010zR\u0018\u0010\u008a\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010kR\u0016\u0010[\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010zR\u0019\u0010O\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bO\u0010\u0086\u0001R\u0019\u0010U\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bU\u0010\u0086\u0001R\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0086\u0001R\u0019\u0010S\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bS\u0010\u0086\u0001R\u0016\u0010Y\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010zR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001d\u0010\u008c\u0001R&\u0010\u008d\u0001\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010z\u001a\u0005\b\u008d\u0001\u0010\u0015\"\u0005\b\u008e\u0001\u0010-R\u0018\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0019\u0010\u0092\u0001\u001a\u00020_8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001¨\u0006\u0096\u0001"}, d2 = {"Lcom/taobao/detail/rate/widget/DisplayVideoViewV2;", "Landroid/widget/FrameLayout;", "Ltb/ztb;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ltb/xhv;", "setUpVideo", "()V", "resetVideoBackground", "showCoverImageView", "hideCoverImageView", "showPlayerBtn", "hidePlayerBtn", "", "isWifi", "()Z", sc.initView, "playVideo", "pauseVideo", "destroyVideo", "isPlaying", "isPaused", "Lcom/alibaba/fastjson/JSONObject;", "utParams", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getUTParams", "(Lcom/alibaba/fastjson/JSONObject;)Ljava/util/HashMap;", "", "p0", p1.d, "p2", "onVideoInfo", "(Ljava/lang/Object;II)V", "onVideoPrepared", "(Ljava/lang/Object;)V", "onVideoPlay", "onVideoPause", "(Z)V", "onVideoStart", "onVideoError", "currentPosition", "bufferPercent", iiz.PERF_STAG_TOTAL, "onVideoProgressChanged", "(III)V", "onVideoFullScreen", "onVideoSeekTo", "(I)V", "onVideoComplete", "onVideoClose", "onVideoNormalScreen", "dealPlayVideo", "dealStopVideo", "onAttachedToWindow", "playVideoWhenAttachedToWindow", "onDetachedFromWindow", "videoWidth", "videoHeight", "setLayoutMeasure", "(II)V", "url", "setVideoUrl", "(Ljava/lang/String;)V", "imageUrl", "setCoverImage", "picUrl", "setPlayButtonImage", "loop", "setLooping", "mMuted", CommandID.setMuted, "bizCode", "setBizCode", "setUtParams", "(Lcom/alibaba/fastjson/JSONObject;)V", "videoSource", "setVideoSource", "videoId", "setVideoID", "scaleType", "setScaleType", Constants.Name.AUTO_PLAY, "setAutoPlay", "isShowProgress", "setShowProgress", "playScene", "setPlayScene", "Ltb/qtb;", "clickListener", "hookRootViewClickListener", "(Ltb/qtb;)V", "", "getVideoDuration", "()Ljava/lang/Long;", "getCurrentVideoPosition", "()Ljava/lang/Integer;", "getVideoId", "()Ljava/lang/String;", "DXTSVIDEOVIEW_SCALETYPE_FITCENTER", TLogTracker.LEVEL_INFO, "getDXTSVIDEOVIEW_SCALETYPE_FITCENTER", "()I", "DXTSVIDEOVIEW_SCALETYPE_FITXY", "getDXTSVIDEOVIEW_SCALETYPE_FITXY", "DXTSVIDEOVIEW_SCALETYPE_CENTERCROP", "getDXTSVIDEOVIEW_SCALETYPE_CENTERCROP", "Lcom/taobao/uikit/extend/feature/view/TUrlImageView;", "coverImageView", "Lcom/taobao/uikit/extend/feature/view/TUrlImageView;", "ivPlayButton", "Landroid/widget/RelativeLayout;", "coverRltLayout", "Landroid/widget/RelativeLayout;", "needScreenButton", "Z", "Landroid/view/View;", "videoViewExtend", "Landroid/view/View;", "Lcom/taobao/avplayer/q;", "tbdwInstance", "Lcom/taobao/avplayer/q;", "videoRootView", "Landroid/widget/FrameLayout;", "mWidth", "mHeight", "mVideoUrl", "Ljava/lang/String;", "mCoverUrl", "mIconUrl", vt5.LOOP_PLAY, "mScaleType", a7m.VIDEO_PLAY_SCENES, "Lcom/alibaba/fastjson/JSONObject;", "isContinuePlay", "setContinuePlay", "Landroid/widget/FrameLayout$LayoutParams;", "lp", "Landroid/widget/FrameLayout$LayoutParams;", "hookClickListener", "Ltb/qtb;", "Companion", "a", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DisplayVideoViewV2 extends FrameLayout implements ztb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    private static final String TAG = "DisplayVideoViewV2";
    private static WeakReference<q> currentVideoInstance;
    private final int DXTSVIDEOVIEW_SCALETYPE_CENTERCROP;
    private final int DXTSVIDEOVIEW_SCALETYPE_FITCENTER;
    private final int DXTSVIDEOVIEW_SCALETYPE_FITXY;
    private boolean autoPlay;
    private String bizCode;
    private TUrlImageView coverImageView;
    private RelativeLayout coverRltLayout;
    private qtb hookClickListener;
    private boolean isContinuePlay;
    private boolean isLoop;
    private boolean isShowProgress;
    private TUrlImageView ivPlayButton;
    private final FrameLayout.LayoutParams lp;
    private String mCoverUrl;
    private int mHeight;
    private String mIconUrl;
    private boolean mMuted;
    private int mScaleType;
    private String mVideoUrl;
    private int mWidth;
    private boolean needScreenButton;
    private q tbdwInstance;
    private JSONObject utParams;
    private String videoId;
    private String videoPlayScenes;
    private FrameLayout videoRootView;
    private String videoSource;
    private View videoViewExtend;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public WeakReference<q> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeakReference) ipChange.ipc$dispatch("22737a82", new Object[]{this});
            }
            return DisplayVideoViewV2.access$getCurrentVideoInstance$cp();
        }

        public void b(WeakReference<q> weakReference) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b0a8dde", new Object[]{this, weakReference});
            } else {
                DisplayVideoViewV2.access$setCurrentVideoInstance$cp(weakReference);
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements qtb {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // tb.qtb
        public final boolean hook() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int[] iArr = new int[2];
            DisplayVideoViewV2.this.getLocationInWindow(iArr);
            if (iArr[1] < pb6.r(DisplayVideoViewV2.this.getContext())) {
                DisplayVideoViewV2.this.playVideoWhenAttachedToWindow();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayVideoViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.g(context, "context");
        this.DXTSVIDEOVIEW_SCALETYPE_FITXY = 1;
        this.DXTSVIDEOVIEW_SCALETYPE_CENTERCROP = 2;
        this.coverImageView = new TUrlImageView(getContext());
        this.mMuted = true;
        this.mScaleType = -1;
        this.autoPlay = true;
        this.lp = new FrameLayout.LayoutParams(-1, -1);
        this.hookClickListener = b.INSTANCE;
        initView();
    }

    public static final /* synthetic */ WeakReference access$getCurrentVideoInstance$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("8348e2d9", new Object[0]);
        }
        return currentVideoInstance;
    }

    public static final /* synthetic */ void access$setCurrentVideoInstance$cp(WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bedbe6ff", new Object[]{weakReference});
        } else {
            currentVideoInstance = weakReference;
        }
    }

    private final void hideCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62ad192", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.coverImageView;
        if (tUrlImageView != null) {
            tUrlImageView.setVisibility(8);
        }
    }

    private final void hidePlayerBtn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a0510a0", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.ivPlayButton;
        if (tUrlImageView != null) {
            tUrlImageView.setVisibility(8);
        }
    }

    public static /* synthetic */ Object ipc$super(DisplayVideoViewV2 displayVideoViewV2, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/detail/rate/widget/DisplayVideoViewV2");
        }
    }

    private final void resetVideoBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("216b3241", new Object[]{this});
            return;
        }
        q qVar = this.tbdwInstance;
        if (qVar != null) {
            qVar.setVideoBackgroundColor(-16777216);
        }
    }

    private final void setUpVideo() {
        Activity activity;
        String str;
        HashMap<String, String> hashMap;
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23b5ed65", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = null;
        try {
            activity = bew.a(getContext());
        } catch (Throwable th) {
            y7t.a(TAG, Log.getStackTraceString(th));
            activity = null;
        }
        StringBuilder sb = new StringBuilder("context=");
        Context context = getContext();
        if (context != null) {
            str = context.getClass().getSimpleName();
        } else {
            str = null;
        }
        sb.append(str);
        uhn.c("Page_DetailComments", "SetUpVideo", sb.toString());
        if (activity != null) {
            q.a aVar = new q.a(activity);
            int i = this.mHeight;
            if (i > 0) {
                aVar.x(i);
            }
            int i2 = this.mWidth;
            if (i2 > 0) {
                aVar.q0(i2);
            }
            aVar.p0(this.mVideoUrl);
            aVar.M(false);
            aVar.n(this.bizCode);
            aVar.l0(this.videoId);
            aVar.n0(this.videoSource);
            aVar.g(!this.isShowProgress);
            aVar.W(this.videoPlayScenes);
            JSONObject jSONObject = this.utParams;
            if (jSONObject != null) {
                hashMap = getUTParams(jSONObject);
            } else {
                hashMap = null;
            }
            aVar.f0(hashMap);
            if (this.mMuted) {
                aVar.J(true);
                aVar.d0(false);
            } else {
                aVar.J(false);
                aVar.d0(true);
                aVar.S(true);
            }
            if (this.needScreenButton) {
                aVar.S(true);
            } else {
                aVar.S(false);
            }
            int i3 = this.mScaleType;
            if (i3 == this.DXTSVIDEOVIEW_SCALETYPE_FITCENTER) {
                aVar.k0(DWAspectRatio.DW_FIT_CENTER);
            } else if (i3 == this.DXTSVIDEOVIEW_SCALETYPE_CENTERCROP) {
                aVar.k0(DWAspectRatio.DW_CENTER_CROP);
            } else if (i3 == this.DXTSVIDEOVIEW_SCALETYPE_FITXY) {
                aVar.k0(DWAspectRatio.DW_FIT_X_Y);
            }
            if (this.isContinuePlay) {
                aVar.P(false);
            }
            if (this.mCoverUrl != null) {
                TUrlImageView tUrlImageView = new TUrlImageView(getContext());
                tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                tUrlImageView.setImageUrl(this.mCoverUrl);
                q75 q75Var = new q75();
                q75Var.c(tUrlImageView);
                aVar.Q(true);
                aVar.v(q75Var);
            }
            q r0 = aVar.r0();
            this.tbdwInstance = r0;
            if (r0 != null) {
                r0.setVideoLifecycleListener(this);
            }
            q qVar = this.tbdwInstance;
            if (qVar != null) {
                qVar.hideCloseView();
            }
            q qVar2 = this.tbdwInstance;
            if (qVar2 != null) {
                qVar2.setVideoBackgroundColor(0);
            }
            q qVar3 = this.tbdwInstance;
            if (qVar3 != null) {
                qVar3.setRootViewClickListener(this.hookClickListener);
            }
            FrameLayout frameLayout2 = this.videoRootView;
            if (frameLayout2 != null) {
                removeView(frameLayout2);
            }
            q qVar4 = this.tbdwInstance;
            if (qVar4 != null) {
                viewGroup = qVar4.getView();
            } else {
                viewGroup = null;
            }
            if (viewGroup instanceof FrameLayout) {
                frameLayout = viewGroup;
            }
            FrameLayout frameLayout3 = frameLayout;
            this.videoRootView = frameLayout3;
            addView(frameLayout3, 0, this.lp);
        }
    }

    private final void showCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3ff68d", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.coverImageView;
        if (tUrlImageView != null) {
            tUrlImageView.setVisibility(0);
        }
    }

    private final void showPlayerBtn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adc57ac5", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.ivPlayButton;
        if (tUrlImageView != null) {
            tUrlImageView.setVisibility(0);
        }
    }

    public final void dealPlayVideo() {
        q qVar;
        WeakReference<q> a2;
        q qVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46b095a2", new Object[]{this});
        } else if (!isPlaying()) {
            a aVar = Companion;
            WeakReference<q> a3 = aVar.a();
            if (a3 != null) {
                qVar = a3.get();
            } else {
                qVar = null;
            }
            if (!(qVar == null || !ckf.b(this.tbdwInstance, aVar.a()) || (a2 = aVar.a()) == null || (qVar2 = a2.get()) == null)) {
                qVar2.pauseVideo();
            }
            RelativeLayout relativeLayout = this.coverRltLayout;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
            }
            if (isWifi() && this.autoPlay) {
                playVideo();
            }
        }
    }

    public final void dealStopVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddb3a094", new Object[]{this});
        } else {
            pauseVideo();
        }
    }

    public void destroyVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("545abca8", new Object[]{this});
            return;
        }
        showPlayerBtn();
        showCoverImageView();
        q qVar = this.tbdwInstance;
        if (qVar != null) {
            qVar.setVideoLifecycleListener(null);
            qVar.destroy();
            this.tbdwInstance = null;
        }
    }

    public Integer getCurrentVideoPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("869b1b6f", new Object[]{this});
        }
        q qVar = this.tbdwInstance;
        if (qVar != null) {
            return Integer.valueOf(qVar.getCurrentPosition());
        }
        return null;
    }

    public final int getDXTSVIDEOVIEW_SCALETYPE_CENTERCROP() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a96c2a2", new Object[]{this})).intValue();
        }
        return this.DXTSVIDEOVIEW_SCALETYPE_CENTERCROP;
    }

    public final int getDXTSVIDEOVIEW_SCALETYPE_FITCENTER() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b475c5d", new Object[]{this})).intValue();
        }
        return this.DXTSVIDEOVIEW_SCALETYPE_FITCENTER;
    }

    public final int getDXTSVIDEOVIEW_SCALETYPE_FITXY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e227a809", new Object[]{this})).intValue();
        }
        return this.DXTSVIDEOVIEW_SCALETYPE_FITXY;
    }

    public HashMap<String, String> getUTParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("b87797b1", new Object[]{this, jSONObject});
        }
        ckf.g(jSONObject, "utParams");
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str : jSONObject.keySet()) {
            String valueOf = String.valueOf(str);
            hashMap.put(valueOf, (String) jSONObject.get(valueOf));
        }
        return hashMap;
    }

    public Long getVideoDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("d511195", new Object[]{this});
        }
        q qVar = this.tbdwInstance;
        if (qVar != null) {
            return Long.valueOf(qVar.getDuration());
        }
        return null;
    }

    public String getVideoId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ec0c039", new Object[]{this});
        }
        return this.videoId;
    }

    public void hookRootViewClickListener(qtb qtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd5e8c91", new Object[]{this, qtbVar});
            return;
        }
        ckf.g(qtbVar, "clickListener");
        this.hookClickListener = qtbVar;
        q qVar = this.tbdwInstance;
        if (qVar != null) {
            qVar.setRootViewClickListener(qtbVar);
        }
    }

    public final boolean isContinuePlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6960cd0", new Object[]{this})).booleanValue();
        }
        return this.isContinuePlay;
    }

    public boolean isPaused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ec0d383", new Object[]{this})).booleanValue();
        }
        q qVar = this.tbdwInstance;
        if (qVar == null || qVar.getVideoState() != 2) {
            return false;
        }
        return true;
    }

    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        q qVar = this.tbdwInstance;
        if (qVar == null || qVar.getVideoState() != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        q qVar;
        WeakReference<q> a2;
        q qVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (!xgn.INSTANCE.o() && !isPlaying()) {
            a aVar = Companion;
            WeakReference<q> a3 = aVar.a();
            if (a3 != null) {
                qVar = a3.get();
            } else {
                qVar = null;
            }
            if (!(qVar == null || !ckf.b(this.tbdwInstance, aVar.a()) || (a2 = aVar.a()) == null || (qVar2 = a2.get()) == null)) {
                qVar2.pauseVideo();
            }
            RelativeLayout relativeLayout = this.coverRltLayout;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
            }
            if (isWifi() && this.autoPlay) {
                postDelayed(new c(), 700L);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        pauseVideo();
        destroyVideo();
        Companion.b(null);
    }

    @Override // tb.ztb
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // tb.ztb
    public void onVideoComplete() {
        q qVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        q qVar2 = this.tbdwInstance;
        if (qVar2 != null) {
            if (!isPlaying() && (qVar = this.tbdwInstance) != null && qVar.getCurrentPosition() == 0) {
                showPlayerBtn();
                showCoverImageView();
            }
            if (this.isLoop) {
                hidePlayerBtn();
                hideCoverImageView();
                qVar2.replay();
            }
        }
    }

    @Override // tb.ztb
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        resetVideoBackground();
        hidePlayerBtn();
        hideCoverImageView();
        destroyVideo();
        RelativeLayout relativeLayout = this.coverRltLayout;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
    }

    @Override // tb.ztb
    public void onVideoFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
        }
    }

    @Override // tb.ztb
    public void onVideoInfo(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.ztb
    public void onVideoNormalScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
        }
    }

    @Override // tb.ztb
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            return;
        }
        showPlayerBtn();
        showCoverImageView();
    }

    @Override // tb.ztb
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        hideCoverImageView();
        hidePlayerBtn();
    }

    @Override // tb.ztb
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // tb.ztb
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // tb.ztb
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.ztb
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        Companion.b(new WeakReference<>(this.tbdwInstance));
        hidePlayerBtn();
        hideCoverImageView();
        resetVideoBackground();
    }

    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        q qVar = this.tbdwInstance;
        if (qVar != null && isPlaying()) {
            qVar.pauseVideo();
        }
        showPlayerBtn();
    }

    public void playVideo() {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
            return;
        }
        if (this.tbdwInstance == null) {
            setUpVideo();
        }
        q qVar = this.tbdwInstance;
        if (qVar != null) {
            num = Integer.valueOf(qVar.getVideoState());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 2) {
            q qVar2 = this.tbdwInstance;
            if (qVar2 != null) {
                qVar2.playVideo();
            }
        } else if (num != null && num.intValue() == 4) {
            q qVar3 = this.tbdwInstance;
            if (qVar3 != null) {
                qVar3.replay();
            }
        } else {
            q qVar4 = this.tbdwInstance;
            if (qVar4 != null) {
                qVar4.start();
            }
        }
    }

    public void playVideoWhenAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beda8837", new Object[]{this});
            return;
        }
        if (this.tbdwInstance == null) {
            setUpVideo();
        }
        q qVar = this.tbdwInstance;
        if (qVar != null) {
            qVar.start();
        }
    }

    public void setAutoPlay(boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c396e48", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!z || !wfp.INSTANCE.a(getContext())) {
            z2 = false;
        }
        this.autoPlay = z2;
    }

    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else {
            this.bizCode = str;
        }
    }

    public final void setContinuePlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7c7e750", new Object[]{this, new Boolean(z)});
        } else {
            this.isContinuePlay = z;
        }
    }

    public void setCoverImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e694ff7", new Object[]{this, str});
            return;
        }
        this.mCoverUrl = str;
        this.coverImageView.setImageUrl(str);
    }

    public void setLayoutMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61484b39", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mWidth = i;
        this.mHeight = i2;
    }

    public void setLooping(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c734b1", new Object[]{this, new Boolean(z)});
        } else {
            this.isLoop = z;
        }
    }

    public void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
        } else {
            this.mMuted = z;
        }
    }

    public void setPlayButtonImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285fe304", new Object[]{this, str});
            return;
        }
        this.mIconUrl = str;
        TUrlImageView tUrlImageView = this.ivPlayButton;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(str);
        }
    }

    public void setPlayScene(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5624d87", new Object[]{this, str});
        } else {
            this.videoPlayScenes = str;
        }
    }

    public void setScaleType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1931833a", new Object[]{this, new Integer(i)});
        } else {
            this.mScaleType = i;
        }
    }

    public void setShowProgress(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5df0bce1", new Object[]{this, new Boolean(z)});
        } else {
            this.isShowProgress = z;
        }
    }

    public void setUtParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86fabc22", new Object[]{this, jSONObject});
        } else {
            this.utParams = jSONObject;
        }
    }

    public void setVideoID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a27a7a5", new Object[]{this, str});
        } else {
            this.videoId = str;
        }
    }

    public void setVideoSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e0c1645", new Object[]{this, str});
        } else {
            this.videoSource = str;
        }
    }

    public void setVideoUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4945f87", new Object[]{this, str});
        } else {
            this.mVideoUrl = str;
        }
    }

    private final boolean isWifi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80bd486a", new Object[]{this})).booleanValue();
        }
        String b2 = usj.b(Globals.getApplication());
        return !TextUtils.isEmpty(b2) && ckf.b(b2, "wifi");
    }

    public void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = new TUrlImageView(getContext());
        this.coverImageView = tUrlImageView;
        tUrlImageView.setWhenNullClearImg(true);
        this.coverImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.mega_video_extend_v2, (ViewGroup) this, false);
        this.videoViewExtend = inflate;
        View view = null;
        View findViewById = inflate != null ? inflate.findViewById(R.id.iv_play_btn) : null;
        if (findViewById != null) {
            this.ivPlayButton = (TUrlImageView) findViewById;
            View view2 = this.videoViewExtend;
            if (view2 != null) {
                view = view2.findViewById(R.id.rlt_toast);
            }
            if (view != null) {
                this.coverRltLayout = (RelativeLayout) view;
                addView(this.coverImageView, 0, this.lp);
                addView(this.videoViewExtend, 1, this.lp);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.uikit.extend.feature.view.TUrlImageView");
    }

    public /* synthetic */ DisplayVideoViewV2(Context context, AttributeSet attributeSet, int i, int i2, a07 a07Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
