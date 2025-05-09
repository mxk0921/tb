package com.taobao.detail.rate.widget;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.weex.common.Constants;
import kotlin.Metadata;
import tb.a07;
import tb.a7m;
import tb.ckf;
import tb.cxb;
import tb.exb;
import tb.psn;
import tb.qtb;
import tb.sf5;
import tb.sj8;
import tb.tep;
import tb.vt5;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b<\b\u0007\u0018\u0000 h2\u00020\u00012\u00020\u0002:\u0001iB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0019\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020 H\u0014¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020#H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b&\u0010'J)\u0010+\u001a\u00020\f2\u0010\u0010)\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00020(2\u0006\u0010*\u001a\u00020 H\u0016¢\u0006\u0004\b+\u0010,J)\u0010-\u001a\u00020\f2\u0010\u0010)\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00020(2\u0006\u0010*\u001a\u00020 H\u0016¢\u0006\u0004\b-\u0010,J\u000f\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b/\u00100R\u001a\u00101\u001a\u00020\u00178\u0006X\u0086D¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00105\u001a\u00020\u00178\u0006X\u0086D¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104R\u001a\u00107\u001a\u00020\u00178\u0006X\u0086D¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00104R\u001a\u00109\u001a\u00020\u00178\u0006X\u0086D¢\u0006\f\n\u0004\b9\u00102\u001a\u0004\b:\u00104R\u001a\u0010;\u001a\u00020\u00178\u0006X\u0086D¢\u0006\f\n\u0004\b;\u00102\u001a\u0004\b<\u00104R\u001a\u0010=\u001a\u00020\u00178\u0006X\u0086D¢\u0006\f\n\u0004\b=\u00102\u001a\u0004\b>\u00104R\u001a\u0010?\u001a\u00020\u00178\u0006X\u0086D¢\u0006\f\n\u0004\b?\u00102\u001a\u0004\b@\u00104R\u001a\u0010A\u001a\u00020\u00178\u0006X\u0086D¢\u0006\f\n\u0004\bA\u00102\u001a\u0004\bB\u00104R\u001a\u0010C\u001a\u00020\u00178\u0006X\u0086D¢\u0006\f\n\u0004\bC\u00102\u001a\u0004\bD\u00104R\u001a\u0010E\u001a\u00020\u00178\u0006X\u0086D¢\u0006\f\n\u0004\bE\u00102\u001a\u0004\bF\u00104R\u001a\u0010G\u001a\u00020\u00178\u0006X\u0086D¢\u0006\f\n\u0004\bG\u00102\u001a\u0004\bH\u00104R\u001a\u0010I\u001a\u00020\u00178\u0006X\u0086D¢\u0006\f\n\u0004\bI\u00102\u001a\u0004\bJ\u00104R\u001a\u0010K\u001a\u00020\u00178\u0006X\u0086D¢\u0006\f\n\u0004\bK\u00102\u001a\u0004\bL\u00104R\u001a\u0010M\u001a\u00020\u00178\u0006X\u0086D¢\u0006\f\n\u0004\bM\u00102\u001a\u0004\bN\u00104R\u001a\u0010O\u001a\u00020#8\u0006X\u0086D¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010S\u001a\u00020#8\u0006X\u0086D¢\u0006\f\n\u0004\bS\u0010P\u001a\u0004\bT\u0010RR\u001a\u0010U\u001a\u00020#8\u0006X\u0086D¢\u0006\f\n\u0004\bU\u0010P\u001a\u0004\bV\u0010RR\u0016\u0010W\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Y\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010[\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010ZR\u0018\u0010\\\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010ZR\u0016\u0010]\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010XR\u0016\u0010^\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010XR\u0016\u0010_\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010XR\u0016\u0010`\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010PR\u0016\u0010a\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010XR\u0018\u0010b\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010d\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010ZR\u0018\u0010e\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010ZR\u0018\u0010f\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010ZR\u0018\u0010g\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010Z¨\u0006j"}, d2 = {"Lcom/taobao/detail/rate/widget/DXMegaVideoWidgetNodeV2;", "Lcom/taobao/android/dinamicx/widget/DXWidgetNode;", "Ltb/exb;", "<init>", "()V", "", "object", CartRecommendRefreshScene.build, "(Ljava/lang/Object;)Lcom/taobao/android/dinamicx/widget/DXWidgetNode;", "widgetNode", "", "deepClone", "Ltb/xhv;", "onClone", "(Lcom/taobao/android/dinamicx/widget/DXWidgetNode;Z)V", "Landroid/content/Context;", "context", "Landroid/view/View;", "onCreateView", "(Landroid/content/Context;)Landroid/view/View;", "weakView", "onRenderView", "(Landroid/content/Context;Landroid/view/View;)V", "", "eventId", "onBindEvent", "(Landroid/content/Context;Landroid/view/View;J)V", "key", "Lcom/alibaba/fastjson/JSONObject;", "attr", "onSetMapAttribute", "(JLcom/alibaba/fastjson/JSONObject;)V", "", "onSetStringAttribute", "(JLjava/lang/String;)V", "", "onSetIntAttribute", "(JI)V", "getDefaultValueForIntAttr", "(J)I", "Ltb/cxb;", "p0", p1.d, "onCanPlay", "(Ltb/cxb;Ljava/lang/String;)V", "onShouldStop", "Lcom/taobao/detail/rate/widget/DisplayVideoViewV2;", "findVideoView", "()Lcom/taobao/detail/rate/widget/DisplayVideoViewV2;", "DXTBVIDEOVIEW_AUTOPLAY", "J", "getDXTBVIDEOVIEW_AUTOPLAY", "()J", "DXTBVIDEOVIEW_BIZCODE", "getDXTBVIDEOVIEW_BIZCODE", "DXTBVIDEOVIEW_COVERURL", "getDXTBVIDEOVIEW_COVERURL", "DXTBVIDEOVIEW_ICONURL", "getDXTBVIDEOVIEW_ICONURL", "DXTBVIDEOVIEW_ISLOOP", "getDXTBVIDEOVIEW_ISLOOP", "DXTBVIDEOVIEW_ISMUTE", "getDXTBVIDEOVIEW_ISMUTE", "DXTBVIDEOVIEW_ISWIFIONLY", "getDXTBVIDEOVIEW_ISWIFIONLY", "DXTBVIDEOVIEW_SCALETYPE", "getDXTBVIDEOVIEW_SCALETYPE", "DXTBVIDEOVIEW_SHOWPROGRESS", "getDXTBVIDEOVIEW_SHOWPROGRESS", "DXTBVIDEOVIEW_UTPARAMS", "getDXTBVIDEOVIEW_UTPARAMS", "DXTBVIDEOVIEW_VIDEOID", "getDXTBVIDEOVIEW_VIDEOID", "DXMEGAVIDEO_VIDEOPLAYSCENES", "getDXMEGAVIDEO_VIDEOPLAYSCENES", "DXTBVIDEOVIEW_VIDEOSOURCE", "getDXTBVIDEOVIEW_VIDEOSOURCE", "DXTBVIDEOVIEW_VIDEOURL", "getDXTBVIDEOVIEW_VIDEOURL", "DXTBVIDEOVIEW_SCALETYPE_FITCENTER", TLogTracker.LEVEL_INFO, "getDXTBVIDEOVIEW_SCALETYPE_FITCENTER", "()I", "DXTBVIDEOVIEW_SCALETYPE_FITXY", "getDXTBVIDEOVIEW_SCALETYPE_FITXY", "DXTBVIDEOVIEW_SCALETYPE_CENTERCROP", "getDXTBVIDEOVIEW_SCALETYPE_CENTERCROP", Constants.Name.AUTO_PLAY, "Z", "bizCode", "Ljava/lang/String;", tep.KEY_TP_RETURN_VIDEO_COVER_CDN_URL, "iconUrl", vt5.LOOP_PLAY, "isMute", "isWifiOnly", "scaleType", "showProgress", "utParams", "Lcom/alibaba/fastjson/JSONObject;", "videoId", a7m.VIDEO_PLAY_SCENES, "videoSource", "videoUrl", "Companion", "a", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class DXMegaVideoWidgetNodeV2 extends DXWidgetNode implements exb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    private static final long DXMEGAVIDEOVIEW_MEGAVIDEOVIEW = -1457195038351457670L;
    private final int DXTBVIDEOVIEW_SCALETYPE_FITCENTER;
    private boolean autoPlay;
    private String bizCode;
    private String coverUrl;
    private String iconUrl;
    private boolean isLoop;
    private boolean showProgress;
    private JSONObject utParams;
    private String videoId;
    private String videoPlayScenes;
    private String videoSource;
    private String videoUrl;
    private final long DXTBVIDEOVIEW_AUTOPLAY = 1174195036188518487L;
    private final long DXTBVIDEOVIEW_BIZCODE = 4692571841309926215L;
    private final long DXTBVIDEOVIEW_COVERURL = 1756289496339923034L;
    private final long DXTBVIDEOVIEW_ICONURL = 4951885508200836195L;
    private final long DXTBVIDEOVIEW_ISLOOP = sf5.DXCARTLOTTIEVIEW_ISLOOP;
    private final long DXTBVIDEOVIEW_ISMUTE = 9423396980483005L;
    private final long DXTBVIDEOVIEW_ISWIFIONLY = -5563993334780806377L;
    private final long DXTBVIDEOVIEW_SCALETYPE = 1015096712691932083L;
    private final long DXTBVIDEOVIEW_SHOWPROGRESS = -7928569865764566238L;
    private final long DXTBVIDEOVIEW_UTPARAMS = 7062494548025744469L;
    private final long DXTBVIDEOVIEW_VIDEOID = 5435952498458972235L;
    private final long DXMEGAVIDEO_VIDEOPLAYSCENES = -1723821953575824099L;
    private final long DXTBVIDEOVIEW_VIDEOSOURCE = -2940280366635818861L;
    private final long DXTBVIDEOVIEW_VIDEOURL = 7344459856848172626L;
    private final int DXTBVIDEOVIEW_SCALETYPE_FITXY = 1;
    private final int DXTBVIDEOVIEW_SCALETYPE_CENTERCROP = 2;
    private boolean isMute = true;
    private boolean isWifiOnly = true;
    private int scaleType = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements qtb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.qtb
        public final boolean hook() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
            }
            DXMegaVideoWidgetNodeV2.this.postEvent(new DXEvent(18903999933159L));
            return true;
        }
    }

    public static final /* synthetic */ long access$getDXMEGAVIDEOVIEW_MEGAVIDEOVIEW$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("506f7179", new Object[0])).longValue();
        }
        return DXMEGAVIDEOVIEW_MEGAVIDEOVIEW;
    }

    public static /* synthetic */ Object ipc$super(DXMegaVideoWidgetNodeV2 dXMegaVideoWidgetNodeV2, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/widget/DXMegaVideoWidgetNodeV2");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXMegaVideoWidgetNodeV2();
    }

    public final DisplayVideoViewV2 findVideoView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayVideoViewV2) ipChange.ipc$dispatch("48c90516", new Object[]{this});
        }
        if (getDXRuntimeContext() == null) {
            return null;
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        ckf.f(dXRuntimeContext, sj8.PARSER_KEY_DX_RUNTIMECONTEXT);
        View D = dXRuntimeContext.D();
        ckf.f(D, "dxRuntimeContext.nativeView");
        if (D instanceof DisplayVideoViewV2) {
            return (DisplayVideoViewV2) D;
        }
        return null;
    }

    public final long getDXMEGAVIDEO_VIDEOPLAYSCENES() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52e3f571", new Object[]{this})).longValue();
        }
        return this.DXMEGAVIDEO_VIDEOPLAYSCENES;
    }

    public final long getDXTBVIDEOVIEW_AUTOPLAY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("961d9515", new Object[]{this})).longValue();
        }
        return this.DXTBVIDEOVIEW_AUTOPLAY;
    }

    public final long getDXTBVIDEOVIEW_BIZCODE() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cdec644", new Object[]{this})).longValue();
        }
        return this.DXTBVIDEOVIEW_BIZCODE;
    }

    public final long getDXTBVIDEOVIEW_COVERURL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e30db8a", new Object[]{this})).longValue();
        }
        return this.DXTBVIDEOVIEW_COVERURL;
    }

    public final long getDXTBVIDEOVIEW_ICONURL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2cf0c1a", new Object[]{this})).longValue();
        }
        return this.DXTBVIDEOVIEW_ICONURL;
    }

    public final long getDXTBVIDEOVIEW_ISLOOP() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb5ae2c0", new Object[]{this})).longValue();
        }
        return this.DXTBVIDEOVIEW_ISLOOP;
    }

    public final long getDXTBVIDEOVIEW_ISMUTE() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("688eabb5", new Object[]{this})).longValue();
        }
        return this.DXTBVIDEOVIEW_ISMUTE;
    }

    public final long getDXTBVIDEOVIEW_ISWIFIONLY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a753815d", new Object[]{this})).longValue();
        }
        return this.DXTBVIDEOVIEW_ISWIFIONLY;
    }

    public final long getDXTBVIDEOVIEW_SCALETYPE() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4611ac08", new Object[]{this})).longValue();
        }
        return this.DXTBVIDEOVIEW_SCALETYPE;
    }

    public final int getDXTBVIDEOVIEW_SCALETYPE_CENTERCROP() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a63206d1", new Object[]{this})).intValue();
        }
        return this.DXTBVIDEOVIEW_SCALETYPE_CENTERCROP;
    }

    public final int getDXTBVIDEOVIEW_SCALETYPE_FITCENTER() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c2b564e", new Object[]{this})).intValue();
        }
        return this.DXTBVIDEOVIEW_SCALETYPE_FITCENTER;
    }

    public final int getDXTBVIDEOVIEW_SCALETYPE_FITXY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6b0427a", new Object[]{this})).intValue();
        }
        return this.DXTBVIDEOVIEW_SCALETYPE_FITXY;
    }

    public final long getDXTBVIDEOVIEW_SHOWPROGRESS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19e2f4dc", new Object[]{this})).longValue();
        }
        return this.DXTBVIDEOVIEW_SHOWPROGRESS;
    }

    public final long getDXTBVIDEOVIEW_UTPARAMS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c395f97", new Object[]{this})).longValue();
        }
        return this.DXTBVIDEOVIEW_UTPARAMS;
    }

    public final long getDXTBVIDEOVIEW_VIDEOID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f917b09a", new Object[]{this})).longValue();
        }
        return this.DXTBVIDEOVIEW_VIDEOID;
    }

    public final long getDXTBVIDEOVIEW_VIDEOSOURCE() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e549a19a", new Object[]{this})).longValue();
        }
        return this.DXTBVIDEOVIEW_VIDEOSOURCE;
    }

    public final long getDXTBVIDEOVIEW_VIDEOURL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be367646", new Object[]{this})).longValue();
        }
        return this.DXTBVIDEOVIEW_VIDEOURL;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == this.DXTBVIDEOVIEW_AUTOPLAY || j == this.DXTBVIDEOVIEW_ISLOOP) {
            return 0;
        }
        if (j == this.DXTBVIDEOVIEW_ISMUTE || j == this.DXTBVIDEOVIEW_ISWIFIONLY) {
            return 1;
        }
        if (j == this.DXTBVIDEOVIEW_SCALETYPE) {
            return this.DXTBVIDEOVIEW_SCALETYPE_FITCENTER;
        }
        if (j == this.DXTBVIDEOVIEW_SHOWPROGRESS) {
            return 0;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else if (j == 18903999933159L && (view instanceof DisplayVideoViewV2)) {
            ((DisplayVideoViewV2) view).hookRootViewClickListener(new b());
        }
    }

    @Override // tb.exb
    public void onCanPlay(cxb<?, exb> cxbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c767ef", new Object[]{this, cxbVar, str});
            return;
        }
        ckf.g(cxbVar, "p0");
        ckf.g(str, p1.d);
        DisplayVideoViewV2 findVideoView = findVideoView();
        if (findVideoView instanceof DisplayVideoViewV2) {
            psn psnVar = psn.INSTANCE;
            if (psnVar.f()) {
                psnVar.a(findVideoView);
            } else {
                findVideoView.dealPlayVideo();
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        ckf.g(dXWidgetNode, "widgetNode");
        if (dXWidgetNode instanceof DXMegaVideoWidgetNodeV2) {
            super.onClone(dXWidgetNode, z);
            DXMegaVideoWidgetNodeV2 dXMegaVideoWidgetNodeV2 = (DXMegaVideoWidgetNodeV2) dXWidgetNode;
            this.autoPlay = dXMegaVideoWidgetNodeV2.autoPlay;
            this.bizCode = dXMegaVideoWidgetNodeV2.bizCode;
            this.coverUrl = dXMegaVideoWidgetNodeV2.coverUrl;
            this.iconUrl = dXMegaVideoWidgetNodeV2.iconUrl;
            this.isLoop = dXMegaVideoWidgetNodeV2.isLoop;
            this.isMute = dXMegaVideoWidgetNodeV2.isMute;
            this.isWifiOnly = dXMegaVideoWidgetNodeV2.isWifiOnly;
            this.scaleType = dXMegaVideoWidgetNodeV2.scaleType;
            this.showProgress = dXMegaVideoWidgetNodeV2.showProgress;
            this.utParams = dXMegaVideoWidgetNodeV2.utParams;
            this.videoId = dXMegaVideoWidgetNodeV2.videoId;
            this.videoPlayScenes = dXMegaVideoWidgetNodeV2.videoPlayScenes;
            this.videoSource = dXMegaVideoWidgetNodeV2.videoSource;
            this.videoUrl = dXMegaVideoWidgetNodeV2.videoUrl;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        ckf.g(context, "context");
        return new DisplayVideoViewV2(context, null, 0, 6, null);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        ckf.g(context, "context");
        ckf.g(view, "weakView");
        if (view instanceof DisplayVideoViewV2) {
            DisplayVideoViewV2 displayVideoViewV2 = (DisplayVideoViewV2) view;
            displayVideoViewV2.setLayoutMeasure(getMeasuredWidth(), getMeasuredHeight());
            displayVideoViewV2.setVideoUrl(this.videoUrl);
            displayVideoViewV2.setVideoID(this.videoId);
            displayVideoViewV2.setPlayScene(this.videoPlayScenes);
            displayVideoViewV2.setVideoSource(this.videoSource);
            displayVideoViewV2.setCoverImage(this.coverUrl);
            displayVideoViewV2.setPlayButtonImage(this.iconUrl);
            displayVideoViewV2.setLooping(this.isLoop);
            displayVideoViewV2.setMuted(this.isMute);
            displayVideoViewV2.setScaleType(this.scaleType);
            displayVideoViewV2.setUtParams(this.utParams);
            displayVideoViewV2.setBizCode(this.bizCode);
            displayVideoViewV2.setShowProgress(this.showProgress);
            displayVideoViewV2.setAutoPlay(this.autoPlay);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == this.DXTBVIDEOVIEW_AUTOPLAY) {
            if (i == 0) {
                z = false;
            }
            this.autoPlay = z;
        } else if (j == this.DXTBVIDEOVIEW_ISLOOP) {
            if (i == 0) {
                z = false;
            }
            this.isLoop = z;
        } else if (j == this.DXTBVIDEOVIEW_ISMUTE) {
            if (i == 0) {
                z = false;
            }
            this.isMute = z;
        } else if (j == this.DXTBVIDEOVIEW_ISWIFIONLY) {
            if (i == 0) {
                z = false;
            }
            this.isWifiOnly = z;
        } else if (j == this.DXTBVIDEOVIEW_SCALETYPE) {
            this.scaleType = i;
        } else if (j == this.DXTBVIDEOVIEW_SHOWPROGRESS) {
            if (i == 0) {
                z = false;
            }
            this.showProgress = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
            return;
        }
        ckf.g(jSONObject, "attr");
        if (j == this.DXTBVIDEOVIEW_UTPARAMS) {
            this.utParams = jSONObject;
        } else {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
            return;
        }
        ckf.g(str, "attr");
        if (j == this.DXTBVIDEOVIEW_BIZCODE) {
            this.bizCode = str;
        } else if (j == this.DXTBVIDEOVIEW_COVERURL) {
            this.coverUrl = str;
        } else if (j == this.DXTBVIDEOVIEW_ICONURL) {
            this.iconUrl = str;
        } else if (j == this.DXTBVIDEOVIEW_VIDEOID) {
            this.videoId = str;
        } else if (j == this.DXMEGAVIDEO_VIDEOPLAYSCENES) {
            this.videoPlayScenes = str;
        } else if (j == this.DXTBVIDEOVIEW_VIDEOSOURCE) {
            this.videoSource = str;
        } else if (j == this.DXTBVIDEOVIEW_VIDEOURL) {
            this.videoUrl = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // tb.exb
    public void onShouldStop(cxb<?, exb> cxbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c812a17e", new Object[]{this, cxbVar, str});
            return;
        }
        ckf.g(cxbVar, "p0");
        ckf.g(str, p1.d);
        DisplayVideoViewV2 findVideoView = findVideoView();
        if (findVideoView instanceof DisplayVideoViewV2) {
            psn psnVar = psn.INSTANCE;
            if (psnVar.f()) {
                psnVar.h(findVideoView);
                findVideoView.dealStopVideo();
                return;
            }
            findVideoView.dealStopVideo();
        }
    }
}
