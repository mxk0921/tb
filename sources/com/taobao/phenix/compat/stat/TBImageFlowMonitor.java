package com.taobao.phenix.compat.stat;

import android.os.Build;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.fulltrace.FullTraceAnalysis;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.pexode.decoder.AvifDecoder;
import com.taobao.phenix.cache.disk.OnlyCacheFailedException;
import com.taobao.phenix.decode.DecodeException;
import com.taobao.phenix.loader.network.HttpCodeResponseException;
import com.taobao.phenix.loader.network.IncompleteResponseException;
import com.taobao.phenix.loader.network.NetworkResponseException;
import com.taobao.phenix.request.ImageStatistics;
import java.util.HashMap;
import java.util.Map;
import tb.brr;
import tb.bui;
import tb.cgr;
import tb.dpl;
import tb.ert;
import tb.etj;
import tb.fgr;
import tb.fiv;
import tb.gz8;
import tb.itw;
import tb.jjo;
import tb.k4o;
import tb.mle;
import tb.n5k;
import tb.nd2;
import tb.npj;
import tb.oz8;
import tb.p0m;
import tb.qpj;
import tb.raq;
import tb.s0m;
import tb.siq;
import tb.sz8;
import tb.tz8;
import tb.v0a;
import tb.vqr;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBImageFlowMonitor extends cgr implements mle, p0m.b, dpl.a, AvifDecoder.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALIVFS_TIMEOUT = "alivfsTimeout";
    public static final String BITMAP_BYTE_COUNT = "bitmap_byte_count";
    public static final String BITMAP_POOL_ALARM_POINT = "BitmapPoolHit";
    public static final String BUCKET_INFO = "bucketInfo";
    public static final String BUSINESS_DIMEN = "bizName";
    public static final String CACHE_CONTROL = "cache_control";
    public static final String CDN_ADAPTER_TIME = "decideUrlTime";
    public static final String CDN_IP_PORT_DIMEN = "cdnIpPort";
    public static final String CONNECT_TYPE_DIMEN = "connectType";
    public static final String CONVERT_FORMAT = "convert_format";
    public static final String DATA_FROM_DIMEN = "dataFrom";
    public static final String DECODER_TYPE = "decoder";
    public static final String DETECT_ALIVFS = "detectAlivfs";
    public static final String DEVICE_LEVEL_DIMEN = "deviceLevel";
    public static final String DISK_CACHE_ALARM_POINT = "DiskCacheHit";
    public static final String DOMAIN_DIMEN = "domain";
    public static final String EAGLEID = "eagleid";
    public static final String ERROR_ANALYSIS_CODE = "analysisErrorCode";
    public static final String ERROR_DESC = "desc";
    public static final String ERROR_DESC_PREFIX = "analysisReason::";
    public static final String ERROR_DIMEN = "error";
    public static final String ERROR_ORIGIN_CODE = "originErrorCode";
    public static final String ERROR_ORIGIN_URL = "originUrl";
    public static final String ERROR_POINT = "ImageError";
    public static final String ERROR_URL = "url";
    public static final String FIRST_DATA_MEASURE = "firstData";
    public static final String FORCED_NO_ASHMEM_COUNTER_POINT = "Forced2NoAshmem";
    public static final String FORCED_NO_IN_BITMAP_COUNTER_POINT = "Forced2NoInBitmap";
    public static final String FORCED_SYSTEM_COUNTER_POINT = "Forced2System";
    public static final String FORCED_UNLIMITED_NETWORK_COUNTER_POINT = "Forced2UnlimitedNetwork";
    public static final String FORMAT_DIMEN = "format";
    public static final String HAS_ICC = "hasIcc";
    public static final String HEIC_CODEC_READY = "heicCodecReady";
    public static final String HEIGHT_SCALE = "height_scale";
    public static final String HIGH_QUALITY = "high_quality";
    public static final String HIT_CDN_CACHE_DIMEN = "hitCdnCache";
    public static final String HIT_FUZZY_MEMORY_CACHE_DIMEN = "hitFuzzyMemoryCache";
    public static final String IMAGE_GRAY_TRAFFIC = "imageGrayTraffic";
    public static final String INVALID_PARAM_BIZ = "bizName";
    public static final String INVALID_PARAM_ERROR_CODE = "errorCode";
    public static final String INVALID_PARAM_ORIGINAL_URL = "originalURL";
    public static final String INVALID_PARAM_PAGE_NAME = "pageName";
    public static final String INVALID_PARAM_PAGE_URL = "pageURL";
    public static final String INVALID_PARAM_POINT = "InvalidParam";
    public static final String LAUNCH_EXTERNAL_DIMEN = "appLaunchExternal";
    public static final String LAUNCH_TYPE_DIMEN = "launchType";
    public static final String MEM_CACHE_ALARM_POINT = "MemCacheHit";
    public static final String MODULE_NAME = "ImageLib_Rx";
    public static final String MONITOR_POINT = "ImageFlow";
    public static final String MONITOR_POINT_LOW_DEVICE = "ImageFlowForLowDevice";
    public static final String MONITOR_POINT_RNF = "ImageFlowForRNF";
    public static final String MONITOR_POINT_WEBP_FORMAT = "WebpImage";
    public static final String NAVI_URL_DIMEN = "naviUrl";
    public static final String NETWORK_SERVER_RT = "serverRT";
    public static final String NEW_THREAD_MODEL = "newThreadModel";
    public static final String ORIGINAL_URL = "originalUrl";
    public static final String PAGE_URL_DIMEN = "pageURL";
    public static final String PRE_REQUEST = "pre_request";
    public static final String RECOVERR_ALIVFS = "recoverAlivfs";
    public static final String REC_DATA_END = "recDataEnd";
    public static final String REC_DATA_START = "recDataStart";
    public static final String REMOTE_SO_LOAD_SUCCESS = "remoteSoLoadSuccess";
    public static final String REMOTE_SO_POINT = "RemoteSo";
    public static final String REMOTE_SO_RETRY_INDEX = "remoteSoRetryIndex";
    public static final String REQUEST_START_TIME = "requestStartTime";
    public static final String REQUEST_URL = "RequestUrl";
    public static final String RESPONSE_CODE_MEASURE = "responseCode";
    public static final String RETRYING_REQUEST = "isRetrying";
    public static final String SCHEDULE_FACTOR_DIMEN = "scheduleFactor";
    public static final String SDK_INIT_TIME = "sdkInitTime";
    public static final String SEND_BEFORE_MEASURE = "sendBefore";
    public static final String SINCE_LAST_LAUNCH_DIMEN = "sinceLastLaunchInternal";
    public static final String SINCE_LAUNCH_DIMEN = "sinceAppLaunchInterval";
    public static final String SIZE_MEASURE = "size";
    public static final String SIZ_RANGE_DIMEN = "sizeRange";
    public static final String SKIP_ALIVFS = "skipAlivfs";
    public static final String SKIP_AUTO_SIZE = "skipAutoSize";
    public static final String SKIP_STRATEGY_CONFIG = "skipStrageConfig";
    public static final String SPEED_MEASURE = "speed";
    public static final String TTL_ERROR_EAGLE_ID = "eagleId";
    public static final String TTL_ERROR_MAX_AGE = "maxAge";
    public static final String TTL_ERROR_POINT = "ImageTTLException";
    public static final String TTL_ERROR_URL = "url";
    public static final String TTL_EXPERIMENT_ID = "ttlExperimentId";
    public static final String TTL_GET_TIME = "ttlGetTime";
    public static final String TTL_PUT_TIME = "ttlPutTime";
    public static final String VIA = "via";
    public static final String WINDOW_NAME_DIMEN = "windowName";
    public static final String YIXIU_BUCKET = "yixiuBucket";
    public static final String[] m = {"heic.alicdn.com", "img.alicdn.com", "gw.alicdn.com", "picasso.alicdn.com", "avif.picasso.taobao.com"};
    public boolean c;
    public boolean d;
    public boolean e;
    public final etj f;
    public boolean g;
    public npj h;
    public n5k i;
    public int j;
    public final int k;
    public final int l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ImageSizeWarningException extends NetworkResponseException {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static int sImageWarningSize;
        private final int exceededTimes;

        public ImageSizeWarningException(int i) {
            super(200, "image size[" + i + "] exceeded " + (i / sImageWarningSize) + " times");
            this.exceededTimes = i / sImageWarningSize;
        }

        public static /* synthetic */ int access$002(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e1550b9d", new Object[]{new Integer(i)})).intValue();
            }
            sImageWarningSize = i;
            return i;
        }

        public static /* synthetic */ ImageSizeWarningException access$200(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ImageSizeWarningException) ipChange.ipc$dispatch("49f3b0d7", new Object[]{new Integer(i)});
            }
            return newWarningExceptionIfExceeded(i);
        }

        public static /* synthetic */ int access$400(ImageSizeWarningException imageSizeWarningException) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("37d141d9", new Object[]{imageSizeWarningException})).intValue();
            }
            return imageSizeWarningException.exceededTimes;
        }

        public static /* synthetic */ Object ipc$super(ImageSizeWarningException imageSizeWarningException, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/compat/stat/TBImageFlowMonitor$ImageSizeWarningException");
        }

        private static ImageSizeWarningException newWarningExceptionIfExceeded(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ImageSizeWarningException) ipChange.ipc$dispatch("a92b0a28", new Object[]{new Integer(i)});
            }
            int i2 = sImageWarningSize;
            if (i2 <= 0 || i < i2) {
                return null;
            }
            return new ImageSizeWarningException(i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageStatistics f11469a;

        public a(ImageStatistics imageStatistics) {
            this.f11469a = imageStatistics;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TBImageFlowMonitor.n(TBImageFlowMonitor.this, this.f11469a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageStatistics f11470a;
        public final /* synthetic */ Throwable b;

        public b(ImageStatistics imageStatistics, Throwable th) {
            this.f11470a = imageStatistics;
            this.b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TBImageFlowMonitor.o(TBImageFlowMonitor.this, this.f11470a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageStatistics f11471a;

        public c(ImageStatistics imageStatistics) {
            this.f11471a = imageStatistics;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TBImageFlowMonitor.p(TBImageFlowMonitor.this, this.f11471a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$phenix$request$ImageStatistics$FromType;

        static {
            int[] iArr = new int[ImageStatistics.FromType.values().length];
            $SwitchMap$com$taobao$phenix$request$ImageStatistics$FromType = iArr;
            try {
                iArr[ImageStatistics.FromType.FROM_LOCAL_FILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$phenix$request$ImageStatistics$FromType[ImageStatistics.FromType.FROM_DISK_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$phenix$request$ImageStatistics$FromType[ImageStatistics.FromType.FROM_LARGE_SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$phenix$request$ImageStatistics$FromType[ImageStatistics.FromType.FROM_NETWORK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public TBImageFlowMonitor(int i, int i2, etj etjVar, fgr fgrVar) {
        this.f = etjVar;
        this.k = i;
        this.l = i2;
    }

    public static /* synthetic */ Object ipc$super(TBImageFlowMonitor tBImageFlowMonitor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/compat/stat/TBImageFlowMonitor");
    }

    public static /* synthetic */ void n(TBImageFlowMonitor tBImageFlowMonitor, ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c822fd61", new Object[]{tBImageFlowMonitor, imageStatistics});
        } else {
            tBImageFlowMonitor.w(imageStatistics);
        }
    }

    public static /* synthetic */ void o(TBImageFlowMonitor tBImageFlowMonitor, ImageStatistics imageStatistics, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54c7cf36", new Object[]{tBImageFlowMonitor, imageStatistics, th});
        } else {
            tBImageFlowMonitor.v(imageStatistics, th);
        }
    }

    public static /* synthetic */ void p(TBImageFlowMonitor tBImageFlowMonitor, ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa55fedd", new Object[]{tBImageFlowMonitor, imageStatistics});
        } else {
            tBImageFlowMonitor.u(imageStatistics);
        }
    }

    public final String B(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45f2f1ee", new Object[]{this, map});
        }
        return (map == null || (str = map.get("origin_url")) == null) ? "" : str;
    }

    public final String C(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("565cc235", new Object[]{this, map});
        }
        return (map == null || (str = map.get("p_trace_id")) == null) ? "" : str;
    }

    public final long E(ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea2f5801", new Object[]{this, imageStatistics})).longValue();
        }
        if (imageStatistics == null || imageStatistics.j() == null || this.f == null) {
            return 0L;
        }
        String str = imageStatistics.j().get(((vqr) this.f).r());
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public final String F(Map<String, String> map, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38a8a600", new Object[]{this, map, str});
        }
        if (map == null || (str2 = map.get(str)) == null) {
            return "";
        }
        return str2;
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24633ead", new Object[]{this});
            return;
        }
        this.j = (this.j & (-9)) + 8;
        AppMonitor.Counter.commit(MODULE_NAME, FORCED_UNLIMITED_NETWORK_COUNTER_POINT, 1.0d);
    }

    public final synchronized void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc38c30c", new Object[]{this});
            return;
        }
        DimensionSet create = DimensionSet.create();
        create.addDimension(REMOTE_SO_LOAD_SUCCESS);
        create.addDimension(REMOTE_SO_RETRY_INDEX);
        AppMonitor.register(MODULE_NAME, "RemoteSo", (MeasureSet) null, create);
    }

    public final void O(boolean z, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a71f8c", new Object[]{this, new Boolean(z), new Integer(i)});
            return;
        }
        K();
        DimensionValueSet create = DimensionValueSet.create();
        MeasureValueSet create2 = MeasureValueSet.create();
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        create.setValue(REMOTE_SO_LOAD_SUCCESS, str);
        create.setValue(REMOTE_SO_RETRY_INDEX, String.valueOf(i));
        AppMonitor.Stat.commit(MODULE_NAME, "RemoteSo", create, create2);
    }

    public final void P(ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec950fb1", new Object[]{this, imageStatistics});
        } else if (imageStatistics.G) {
            if (!this.c) {
                L();
            }
            if (imageStatistics.j() != null && !TextUtils.isEmpty(imageStatistics.j().get("max-age"))) {
                String r = r(imageStatistics.r().l());
                DimensionValueSet create = DimensionValueSet.create();
                MeasureValueSet create2 = MeasureValueSet.create();
                create.setValue(TTL_ERROR_MAX_AGE, imageStatistics.j().get("max-age"));
                create.setValue(TTL_ERROR_EAGLE_ID, imageStatistics.j().get("eagleid"));
                create.setValue("url", r);
                AppMonitor.Stat.commit(MODULE_NAME, TTL_ERROR_POINT, create, create2);
            }
        }
    }

    public void T(n5k n5kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ba751e", new Object[]{this, n5kVar});
        } else {
            this.i = n5kVar;
        }
    }

    public final int V(MeasureValueSet measureValueSet, String str, Map<String, Integer> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1645a0da", new Object[]{this, measureValueSet, str, map})).intValue();
        }
        Integer num = map.get(str);
        if (num == null) {
            return 0;
        }
        measureValueSet.setValue(str, num.intValue());
        return num.intValue();
    }

    @Override // com.taobao.pexode.decoder.AvifDecoder.b
    public void a(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f1fc2ee", new Object[]{this, new Boolean(z), new Integer(i)});
        } else {
            O(z, i);
        }
    }

    @Override // tb.p0m.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93fd2770", new Object[]{this});
            return;
        }
        this.j = (this.j & (-5)) + 4;
        AppMonitor.Counter.commit(MODULE_NAME, FORCED_NO_IN_BITMAP_COUNTER_POINT, 1.0d);
    }

    @Override // tb.mle
    public void c(ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f94614f", new Object[]{this, imageStatistics});
        } else {
            ert.a(new c(imageStatistics));
        }
    }

    @Override // tb.mle
    public void d(ImageStatistics imageStatistics) {
        tz8 tz8Var;
        raq k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f638f85", new Object[]{this, imageStatistics});
        } else if (siq.f28077a) {
            if (TextUtils.isEmpty(imageStatistics.s)) {
                imageStatistics.s = FullTraceAnalysis.getInstance().createRequest("picture");
            }
            if (!imageStatistics.K && (tz8Var = FalcoGlobalTracer.get()) != null) {
                tz8.a d2 = tz8Var.d("picture", "Picture_UnknownScene");
                Map<String, String> map = imageStatistics.M;
                if (!(map == null || map.isEmpty() || (k = tz8Var.k(imageStatistics.M)) == null)) {
                    d2.b(k);
                }
                gz8 h = d2.h();
                imageStatistics.N = h;
                imageStatistics.M = tz8Var.c(h.a());
            }
        }
    }

    @Override // tb.p0m.b
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("783aeb0a", new Object[]{this});
            return;
        }
        this.j = (this.j & (-2)) + 1;
        AppMonitor.Counter.commit(MODULE_NAME, FORCED_SYSTEM_COUNTER_POINT, 1.0d);
    }

    @Override // tb.p0m.b
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac74981b", new Object[]{this});
            return;
        }
        this.j = (this.j & (-3)) + 2;
        AppMonitor.Counter.commit(MODULE_NAME, FORCED_NO_ASHMEM_COUNTER_POINT, 1.0d);
    }

    @Override // tb.mle
    public void g(ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47795e04", new Object[]{this, imageStatistics});
        } else {
            ert.a(new a(imageStatistics));
        }
    }

    @Override // tb.mle
    public void h(ImageStatistics imageStatistics, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ff246a", new Object[]{this, imageStatistics, th});
        } else {
            ert.a(new b(imageStatistics, th));
        }
    }

    @Override // tb.mle
    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e699aeda", new Object[]{this})).intValue();
        }
        return 150;
    }

    public final String q(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87fb157b", new Object[]{this, th});
        }
        if (th instanceof IncompleteResponseException) {
            return "101010";
        }
        if (th instanceof HttpCodeResponseException) {
            int httpCode = ((HttpCodeResponseException) th).getHttpCode();
            if (httpCode == 404) {
                return "102010";
            }
            if (httpCode == 503) {
                return "103010";
            }
            return "104000";
        }
        if (th instanceof ImageSizeWarningException) {
            int access$400 = ImageSizeWarningException.access$400((ImageSizeWarningException) th);
            if (access$400 >= 1 && access$400 < 2) {
                return "801010";
            }
            if (access$400 >= 2 && access$400 < 4) {
                return "801020";
            }
            if (access$400 >= 4) {
                return "801090";
            }
        }
        etj etjVar = this.f;
        if (etjVar == null) {
            return null;
        }
        if (((vqr) etjVar).j(th)) {
            return "101011";
        }
        if (((vqr) this.f).b(th)) {
            return "103011";
        }
        if (((vqr) this.f).g(th)) {
            return "201010";
        }
        if (((vqr) this.f).d(th)) {
            return "201011";
        }
        if (((vqr) this.f).h(th)) {
            return "201012";
        }
        if (((vqr) this.f).a(th)) {
            return "202000";
        }
        if (((vqr) this.f).k(th)) {
            return "202001";
        }
        if (((vqr) this.f).c(th)) {
            return "202002";
        }
        if (((vqr) this.f).e(th)) {
            return "202003";
        }
        if (((vqr) this.f).f(th)) {
            return "901000";
        }
        if (!(th instanceof DecodeException)) {
            return null;
        }
        DecodeException decodeException = (DecodeException) th;
        return decodeException.getDecodedError() + "[Local?" + decodeException.isLocalUri() + ", Disk?" + decodeException.isDataFromDisk() + "]";
    }

    public final String r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54fce882", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.length() > 256) {
            return str.substring(0, 256);
        }
        return str;
    }

    public final void s(String str, int i, int i2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be543515", new Object[]{this, str, new Integer(i), new Integer(i2), str2});
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (str2 == null) {
                AppMonitor.Alarm.commitSuccess(MODULE_NAME, str);
            } else {
                AppMonitor.Alarm.commitSuccess(MODULE_NAME, str, str2);
            }
        }
        for (int i4 = 0; i4 < i2; i4++) {
            if (str2 == null) {
                AppMonitor.Alarm.commitFail(MODULE_NAME, str, null, null);
            } else {
                AppMonitor.Alarm.commitFail(MODULE_NAME, str, str2, null, null);
            }
        }
    }

    public final void u(ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83103623", new Object[]{this, imageStatistics});
        } else if (siq.f28077a) {
            t(imageStatistics, 2, "");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(com.taobao.phenix.request.ImageStatistics r27) {
        /*
            Method dump skipped, instructions count: 1386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.phenix.compat.stat.TBImageFlowMonitor.w(com.taobao.phenix.request.ImageStatistics):void");
    }

    public final String x(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1af29e6c", new Object[]{this, map});
        }
        if (map != null) {
            try {
                String str = map.get(((vqr) this.f).o());
                if (str != null) {
                    return str;
                }
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    public final int y(Map<String, Integer> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("822c5027", new Object[]{this, map, str})).intValue();
        }
        if (map == null || !map.containsKey(str)) {
            return 0;
        }
        return map.get(str).intValue();
    }

    public String z(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("512e2507", new Object[]{this, th});
        }
        boolean z = th instanceof NetworkResponseException;
        if ((th instanceof DecodeException) || z) {
            return q(th);
        }
        return "";
    }

    public static String A(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18d3b662", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith(itw.URL_SEPARATOR)) {
            i = 2;
        } else {
            int indexOf = str.indexOf(HttpConstant.SCHEME_SPLIT);
            if (indexOf >= 0) {
                i = indexOf + 3;
            }
        }
        if (i >= str.length()) {
            return "";
        }
        int indexOf2 = str.indexOf(47, i);
        if (indexOf2 < 0) {
            indexOf2 = str.length();
        }
        String substring = str.substring(i, indexOf2);
        return (substring.contains("{") || substring.contains(",") || !substring.contains(".")) ? "" : substring;
    }

    public final String D(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a71b0f39", new Object[]{this, map});
        }
        if (map == null || (str = map.get("pageURL")) == null || TextUtils.isEmpty(str)) {
            return "";
        }
        int indexOf = str.indexOf(63, 0);
        if (indexOf < 0) {
            indexOf = str.length();
        }
        return str.substring(0, indexOf);
    }

    public final synchronized void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94eecf20", new Object[]{this});
        } else if (!this.d) {
            DimensionSet create = DimensionSet.create();
            create.addDimension("bizName");
            create.addDimension("pageName");
            create.addDimension("pageURL");
            create.addDimension(INVALID_PARAM_ORIGINAL_URL);
            create.addDimension("errorCode");
            AppMonitor.register(MODULE_NAME, INVALID_PARAM_POINT, (MeasureSet) null, create);
            this.d = true;
        }
    }

    public final void U(ImageStatistics imageStatistics) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6362063", new Object[]{this, imageStatistics});
        } else if (imageStatistics != null && imageStatistics.j() != null) {
            try {
                Map<String, Integer> f = imageStatistics.f();
                String str = imageStatistics.j().get("DXImageViewOnCreateTimestampKey");
                String str2 = imageStatistics.j().get("DXImageViewOnRenderTimestampKey");
                String str3 = imageStatistics.j().get("DXImageViewIsReuseKey");
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    boolean booleanValue = Boolean.valueOf(str3).booleanValue();
                    long longValue = Long.valueOf(str).longValue();
                    long longValue2 = Long.valueOf(str2).longValue();
                    long p = imageStatistics.p();
                    if (booleanValue) {
                        longValue = longValue2;
                    }
                    if (longValue > 0) {
                        i = (int) (p - longValue);
                    }
                    int y = y(f, "totalTime") + i;
                    f.put("processTimeOfContainer", Integer.valueOf(i));
                    f.put("totalTimeOfContainer", Integer.valueOf(y));
                    f.put("isReuseOfContainer", Integer.valueOf(booleanValue ? 1 : 0));
                }
            } catch (Exception unused) {
            }
        }
    }

    public synchronized void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f1b927c", new Object[]{this});
        } else if (!this.g) {
            fiv.a("FlowMonitor", "image error register start", new Object[0]);
            DimensionSet create = DimensionSet.create();
            create.addDimension("url");
            create.addDimension(WINDOW_NAME_DIMEN);
            create.addDimension(NAVI_URL_DIMEN);
            create.addDimension("bizName");
            create.addDimension(ERROR_ANALYSIS_CODE);
            create.addDimension(ERROR_ORIGIN_CODE);
            create.addDimension("desc");
            create.addDimension("format");
            create.addDimension(DATA_FROM_DIMEN);
            create.addDimension(ERROR_ORIGIN_URL);
            create.addDimension("pageURL");
            create.addDimension(HIGH_QUALITY);
            create.addDimension(HEIGHT_SCALE);
            AppMonitor.register(MODULE_NAME, ERROR_POINT, (MeasureSet) null, create);
            this.g = true;
            fiv.a("FlowMonitor", "image error register end", new Object[0]);
        }
    }

    public final synchronized void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e91d38d", new Object[]{this});
        } else if (!this.c) {
            fiv.a("FlowMonitor", "TTL exception register start", new Object[0]);
            DimensionSet create = DimensionSet.create();
            create.addDimension("url");
            create.addDimension(TTL_ERROR_EAGLE_ID);
            create.addDimension(TTL_ERROR_MAX_AGE);
            AppMonitor.register(MODULE_NAME, TTL_ERROR_POINT, (MeasureSet) null, create);
            this.c = true;
            fiv.a("FlowMonitor", "TTL exception register end", new Object[0]);
        }
    }

    public final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8abe54b", new Object[]{this});
        } else if (!this.e) {
            fiv.c("FlowMonitor", "registerWebpFormatMonitor register start", new Object[0]);
            DimensionSet create = DimensionSet.create();
            create.addDimension("domain");
            create.addDimension("error");
            create.addDimension("bizName");
            create.addDimension("format");
            create.addDimension(DATA_FROM_DIMEN);
            create.addDimension(REQUEST_URL);
            create.addDimension("originalUrl");
            AppMonitor.register(MODULE_NAME, MONITOR_POINT_WEBP_FORMAT, MeasureSet.create(), create);
            this.e = true;
            fiv.a("FlowMonitor", "registerWebpFormatMonitor register end", new Object[0]);
        }
    }

    public final void N(ImageStatistics imageStatistics) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dc9b63e", new Object[]{this, imageStatistics});
            return;
        }
        if (!this.d) {
            J();
        }
        if (imageStatistics != null) {
            String r = r(B(imageStatistics.j()));
            String r2 = r(imageStatistics.r().l());
            if (TextUtils.isEmpty(r) && TextUtils.isEmpty(r2)) {
                i = 0;
            } else if (TextUtils.isEmpty(r) || !r.equals(r2)) {
                i = -1;
            }
            if (i != -1) {
                DimensionValueSet create = DimensionValueSet.create();
                MeasureValueSet create2 = MeasureValueSet.create();
                create.setValue("bizName", imageStatistics.t);
                npj npjVar = this.h;
                if (npjVar != null) {
                    create.setValue("pageName", ((qpj) npjVar).b());
                    create.setValue("pageURL", ((qpj) this.h).a());
                }
                create.setValue(INVALID_PARAM_ORIGINAL_URL, r);
                create.setValue("errorCode", String.valueOf(i));
                AppMonitor.Stat.commit(MODULE_NAME, INVALID_PARAM_POINT, create, create2);
            }
        }
    }

    public final void Q(ImageStatistics imageStatistics, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5302a7f", new Object[]{this, imageStatistics, new Boolean(z)});
            return;
        }
        try {
            bui k = imageStatistics.k();
            if (k != null && k.a().equals("WEBP")) {
                String l = imageStatistics.r().l();
                String A = A(l);
                String[] strArr = m;
                for (int i = 0; i < 5; i++) {
                    if (TextUtils.equals(strArr[i], A)) {
                        return;
                    }
                }
                M();
                DimensionValueSet create = DimensionValueSet.create();
                MeasureValueSet create2 = MeasureValueSet.create();
                String r = r(l);
                String r2 = r(B(imageStatistics.j()));
                ImageStatistics.FromType l2 = imageStatistics.l();
                create.setValue("domain", A);
                if (z) {
                    str = "0";
                } else {
                    str = "1";
                }
                create.setValue("error", str);
                create.setValue("bizName", F(imageStatistics.j(), nd2.BUNDLE_BIZ_CODE));
                create.setValue("format", k.b());
                create.setValue(DATA_FROM_DIMEN, String.valueOf(l2.value));
                create.setValue(REQUEST_URL, r);
                create.setValue("originalUrl", r2);
                AppMonitor.Stat.commit(MODULE_NAME, MONITOR_POINT_WEBP_FORMAT, create, create2);
            }
        } catch (Throwable unused) {
        }
    }

    public void R(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("415613f8", new Object[]{this, new Integer(i)});
            return;
        }
        ImageSizeWarningException.access$002(i);
        fiv.f("FlowMonitor", "set image warning size=%d", Integer.valueOf(i));
    }

    public void S(npj npjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c080443e", new Object[]{this, npjVar});
            return;
        }
        this.h = npjVar;
        fiv.f("FlowMonitor", "set navigation info obtainer=%s", npjVar);
    }

    @Override // tb.mle
    public void j(ImageStatistics imageStatistics, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3700132c", new Object[]{this, imageStatistics, str, str2});
        } else if (siq.f28077a) {
            try {
                if (TextUtils.equals(str, v0a.f29712a)) {
                    sz8.a("picture", imageStatistics.r().l(), 0);
                } else if (TextUtils.equals(str, v0a.g)) {
                    sz8.d("picture", imageStatistics.r().l(), 0);
                }
                Object obj = imageStatistics.N;
                if (obj instanceof gz8) {
                    StringBuilder sb = new StringBuilder("module=picture,stage=");
                    sb.append(str);
                    if (!TextUtils.isEmpty(str2)) {
                        sb.append(",content=");
                        sb.append(str2);
                    }
                    ((gz8) obj).A(sb.toString());
                }
            } catch (Throwable th) {
                fiv.c(FullTraceAnalysis.TAG, "log " + imageStatistics.s + ", picture, " + str + ", " + str2 + ", ", th);
            }
        }
    }

    public final boolean t(ImageStatistics imageStatistics, int i, String str) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f409be28", new Object[]{this, imageStatistics, new Integer(i), str})).booleanValue();
        }
        if (!siq.f28077a || imageStatistics == null || TextUtils.isEmpty(imageStatistics.s)) {
            return false;
        }
        boolean z = imageStatistics.C;
        k4o k4oVar = new k4o();
        k4oVar.g = i;
        k4oVar.d = imageStatistics.t;
        String str4 = "";
        if (str == null) {
            str = str4;
        }
        k4oVar.M = str;
        if (imageStatistics.j() != null) {
            String str5 = imageStatistics.j().get("eagleid");
            if (str5 != null) {
                str4 = str5;
            }
            k4oVar.H = str4;
        }
        StringBuilder sb = new StringBuilder("[falcoId:");
        Map<String, Integer> f = imageStatistics.f();
        if (!(imageStatistics.l() == ImageStatistics.FromType.FROM_NETWORK || imageStatistics.l() == ImageStatistics.FromType.FROM_UNKNOWN)) {
            k4oVar.f = "cache";
            if (imageStatistics.l() == ImageStatistics.FromType.FROM_DISK_CACHE || imageStatistics.l() == ImageStatistics.FromType.FROM_LOCAL_FILE) {
                k4oVar.x = imageStatistics.B;
            }
        }
        sb.append(imageStatistics.s);
        sb.append("]|end,ret=");
        sb.append(i);
        sb.append(",fromType=");
        sb.append(imageStatistics.l().value);
        if (f != null) {
            sb.append(",totalTime=");
            sb.append(y(f, "totalTime"));
            sb.append(",wait2Main=");
            sb.append(y(f, ImageStatistics.KEY_WAIT_FOR_MAIN));
            int y = y(f, ImageStatistics.KEY_SCHEDULE_TIME);
            sb.append(",scheduleTime=");
            sb.append(y);
            sb.append(",decodeTime=");
            sb.append(y(f, "decode"));
            sb.append(",networkConnect=");
            sb.append(y(f, "connect"));
            sb.append(",networkDownload=");
            sb.append(y(f, "download"));
            sb.append(",cacheLookup=");
            sb.append(y(f, ImageStatistics.KEY_READ_DISK_CACHE));
            sb.append(",memoryLookup=");
            sb.append(y(f, ImageStatistics.KEY_READ_MEMORY_CACHE));
            int y2 = y(f, "totalTimeOfContainer");
            if (y2 > 0) {
                sb.append(",processTimeOfContainer=");
                sb.append(y(f, "processTimeOfContainer"));
                sb.append(",totalTimeOfContainer=");
                sb.append(y2);
                sb.append(",dxIsReuse=");
                sb.append(y(f, "isReuseOfContainer"));
            }
            if (y > 5000 && s0m.B().j0().b()) {
                sb.append("|");
                sb.append(s0m.B().j0().a().e().getStatus());
            }
        }
        String sb2 = sb.toString();
        fiv.c("Phenix", sb2, new Object[0]);
        v0a.d(imageStatistics, sb2);
        if (f != null && f.containsKey("decode")) {
            k4oVar.F = f.get("decode").intValue();
        }
        k4oVar.f22397a = imageStatistics.r().l();
        k4oVar.h = imageStatistics.p();
        k4oVar.i = imageStatistics.u;
        k4oVar.r = imageStatistics.v;
        k4oVar.s = imageStatistics.w;
        k4oVar.t = imageStatistics.x;
        k4oVar.u = imageStatistics.y;
        k4oVar.N = C(imageStatistics.j());
        k4oVar.Y = x(imageStatistics.j());
        bui k = imageStatistics.k();
        if (k != null) {
            str2 = k.b();
        } else {
            str2 = "unknown";
        }
        k4oVar.V = str2;
        FullTraceAnalysis.getInstance().commitRequest(imageStatistics.s, "picture", k4oVar);
        Object obj = imageStatistics.N;
        if (obj != null) {
            gz8 gz8Var = (gz8) obj;
            gz8Var.l(Long.valueOf(imageStatistics.p()));
            gz8Var.o0(Long.valueOf(imageStatistics.u));
            gz8Var.k0(Long.valueOf(imageStatistics.v));
            gz8Var.s(E(imageStatistics));
            gz8Var.Y(Long.valueOf(imageStatistics.w));
            gz8Var.i0(Long.valueOf(imageStatistics.x));
            gz8Var.m0(Long.valueOf(imageStatistics.y));
            gz8Var.X("falcoId", imageStatistics.s);
            gz8.URL.a(gz8Var, k4oVar.f22397a);
            gz8.RET.a(gz8Var, Integer.valueOf(k4oVar.g));
            gz8.BIZ_ID.a(gz8Var, k4oVar.d);
            gz8.SERVER_TRACE_ID.a(gz8Var, k4oVar.H);
            gz8.PROTOCOL_TYPE.a(gz8Var, k4oVar.f);
            gz8.RSP_DEFLATE_SIZE.a(gz8Var, Long.valueOf(k4oVar.x));
            gz8.DESERIALIZE_TIME.a(gz8Var, Long.valueOf(k4oVar.F));
            gz8.PIC_DATA_FROM.a(gz8Var, Integer.valueOf(imageStatistics.l().value));
            oz8.ERROR_CODE.a(gz8Var, k4oVar.M);
            gz8.IMAGE_FORMAT.a(gz8Var, k4oVar.V);
            Map<String, Integer> f2 = imageStatistics.f();
            if (f2 != null) {
                gz8.DISK_CACHE_LOOKUP_TIME.a(gz8Var, Long.valueOf(y(f2, ImageStatistics.KEY_READ_DISK_CACHE)));
            }
            if (i == 2) {
                str3 = "cancel";
            } else if (i == 1) {
                str3 = "succeed";
            } else {
                str3 = "failed";
            }
            gz8Var.t(str3);
        }
        return z;
    }

    public synchronized void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b816583", new Object[]{this});
        } else if (!this.f17052a) {
            fiv.a("FlowMonitor", "image flow register start", new Object[0]);
            DimensionSet create = DimensionSet.create();
            create.addDimension("domain");
            create.addDimension("error");
            create.addDimension("bizName");
            create.addDimension("format");
            create.addDimension(DATA_FROM_DIMEN);
            create.addDimension(SCHEDULE_FACTOR_DIMEN);
            create.addDimension(HIT_CDN_CACHE_DIMEN);
            create.addDimension(HIT_FUZZY_MEMORY_CACHE_DIMEN);
            create.addDimension(CONNECT_TYPE_DIMEN);
            create.addDimension(CDN_IP_PORT_DIMEN);
            create.addDimension(WINDOW_NAME_DIMEN);
            create.addDimension(NAVI_URL_DIMEN);
            create.addDimension("pageURL");
            create.addDimension("launchType");
            create.addDimension(LAUNCH_EXTERNAL_DIMEN);
            create.addDimension(SINCE_LAST_LAUNCH_DIMEN);
            create.addDimension(SINCE_LAUNCH_DIMEN);
            create.addDimension("deviceLevel");
            create.addDimension(BUCKET_INFO);
            create.addDimension(YIXIU_BUCKET);
            create.addDimension(NEW_THREAD_MODEL);
            create.addDimension(SDK_INIT_TIME);
            create.addDimension(REQUEST_START_TIME);
            create.addDimension(REQUEST_URL);
            create.addDimension("originalUrl");
            create.addDimension(TTL_EXPERIMENT_ID);
            create.addDimension(TTL_GET_TIME);
            create.addDimension(TTL_PUT_TIME);
            create.addDimension(HAS_ICC);
            create.addDimension(SKIP_ALIVFS);
            create.addDimension(ALIVFS_TIMEOUT);
            create.addDimension(DETECT_ALIVFS);
            create.addDimension(RECOVERR_ALIVFS);
            create.addDimension(REC_DATA_START);
            create.addDimension(REC_DATA_END);
            create.addDimension(ERROR_ANALYSIS_CODE);
            create.addDimension(SKIP_AUTO_SIZE);
            create.addDimension(SKIP_STRATEGY_CONFIG);
            create.addDimension(VIA);
            create.addDimension(CONVERT_FORMAT);
            create.addDimension(HEIC_CODEC_READY);
            create.addDimension(RETRYING_REQUEST);
            create.addDimension(DECODER_TYPE);
            create.addDimension(IMAGE_GRAY_TRAFFIC);
            create.addDimension(CACHE_CONTROL);
            create.addDimension(CDN_ADAPTER_TIME);
            create.addDimension(BITMAP_BYTE_COUNT);
            create.addDimension(PRE_REQUEST);
            create.addDimension(HIGH_QUALITY);
            create.addDimension(HEIGHT_SCALE);
            MeasureSet create2 = MeasureSet.create();
            l(create2, ImageStatistics.KEY_READ_MEMORY_CACHE, Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            l(create2, ImageStatistics.KEY_READ_DISK_CACHE, Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            l(create2, ImageStatistics.KEY_READ_LOCAL_FILE, Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            l(create2, "connect", Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            l(create2, "download", Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            l(create2, "decode", Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            l(create2, ImageStatistics.KEY_BITMAP_SCALE, Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            l(create2, ImageStatistics.KEY_SCHEDULE_TIME, Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            l(create2, ImageStatistics.KEY_WAIT_FOR_MAIN, Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            l(create2, "totalTime", Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(60000.0d));
            l(create2, "size", Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), null, null);
            l(create2, SPEED_MEASURE, Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), null, null);
            l(create2, ImageStatistics.KEY_MASTER_WAIT_SIZE, Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), null, null);
            l(create2, ImageStatistics.KEY_NETWORK_WAIT_SIZE, Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), null, null);
            l(create2, ImageStatistics.KEY_DECODE_WAIT_SIZE, Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), null, null);
            l(create2, FIRST_DATA_MEASURE, Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            l(create2, SEND_BEFORE_MEASURE, Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            l(create2, RESPONSE_CODE_MEASURE, Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            l(create2, "serverRT", Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            l(create2, "processTimeOfContainer", Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(30000.0d));
            l(create2, "totalTimeOfContainer", Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(60000.0d));
            AppMonitor.register(MODULE_NAME, MONITOR_POINT, create2, create);
            AppMonitor.register(MODULE_NAME, MONITOR_POINT_LOW_DEVICE, create2, create);
            AppMonitor.register(MODULE_NAME, MONITOR_POINT_RNF, create2, create);
            this.f17052a = true;
            fiv.a("FlowMonitor", "image flow register end", new Object[0]);
        }
    }

    public final void v(ImageStatistics imageStatistics, Throwable th) {
        etj etjVar;
        Object obj;
        String str;
        String str2;
        String str3;
        String str4;
        TBImageFlowMonitor tBImageFlowMonitor;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Object obj2;
        Object obj3;
        String str10;
        String str11;
        String str12;
        char c2;
        char c3;
        Throwable th2;
        String str13;
        String str14;
        String str15;
        DecodeException decodeException;
        etj etjVar2;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88305716", new Object[]{this, imageStatistics, th});
            return;
        }
        Q(imageStatistics, false);
        if (!t(imageStatistics, 0, z(th))) {
            String str24 = "unknown";
            if (imageStatistics == null || imageStatistics.s() || (th instanceof OnlyCacheFailedException) || ((etjVar = this.f) != null && ((vqr) etjVar).i(th))) {
                if (imageStatistics != null) {
                    str24 = imageStatistics.r().l();
                }
                fiv.a("FlowMonitor", "skipped commit onFail, statistics=%s, path=%s", imageStatistics, str24);
                return;
            }
            N(imageStatistics);
            String l = imageStatistics.r().l();
            String q = q(th);
            boolean z = th instanceof NetworkResponseException;
            boolean z2 = th instanceof DecodeException;
            String A = A(l);
            String F = F(imageStatistics.j(), nd2.BUNDLE_BIZ_CODE);
            bui k = imageStatistics.k();
            if (k != null) {
                str24 = k.b();
            }
            String D = D(imageStatistics.j());
            String B = B(imageStatistics.j());
            boolean z3 = th instanceof ImageSizeWarningException;
            String str25 = HEIGHT_SCALE;
            String str26 = HIGH_QUALITY;
            if (z3 || k(this.k)) {
                str = "pageURL";
                obj = "domain";
                str2 = A;
                str6 = ERROR_ANALYSIS_CODE;
                tBImageFlowMonitor = this;
                str4 = "1";
                str7 = q;
                str3 = "0";
                str5 = MODULE_NAME;
            } else {
                DimensionValueSet create = DimensionValueSet.create();
                MeasureValueSet create2 = MeasureValueSet.create();
                create.setValue("domain", A);
                create.setValue("error", "1");
                create.setValue("bizName", F);
                create.setValue("format", str24);
                create.setValue(DATA_FROM_DIMEN, "0");
                create.setValue("pageURL", D);
                str = "pageURL";
                if (imageStatistics.H) {
                    str19 = "1";
                } else {
                    str19 = "0";
                }
                create.setValue(HAS_ICC, str19);
                create.setValue(SKIP_ALIVFS, "0");
                create.setValue(REQUEST_URL, l);
                create.setValue("originalUrl", B);
                str6 = ERROR_ANALYSIS_CODE;
                str7 = q;
                if (q != null) {
                    create.setValue(str6, str7);
                }
                str4 = "1";
                str3 = "0";
                create.setValue(DECODER_TYPE, imageStatistics.L);
                obj = "domain";
                tBImageFlowMonitor = this;
                str2 = A;
                create.setValue(IMAGE_GRAY_TRAFFIC, tBImageFlowMonitor.F(imageStatistics.j(), "Image-Gray-Traffic"));
                create.setValue(CACHE_CONTROL, tBImageFlowMonitor.F(imageStatistics.j(), HttpConstant.CACHE_CONTROL));
                if (imageStatistics.P) {
                    str21 = str26;
                    str20 = str4;
                } else {
                    str21 = str26;
                    str20 = str3;
                }
                create.setValue(str21, str20);
                str26 = str21;
                if (imageStatistics.Q) {
                    str22 = str25;
                    str23 = str4;
                } else {
                    str22 = str25;
                    str23 = str3;
                }
                create.setValue(str22, str23);
                str25 = str22;
                str5 = MODULE_NAME;
                AppMonitor.Stat.commit(str5, MONITOR_POINT, create, create2);
                if (siq.f28077a && SceneIdentifier.getDeviceLevel() == 3) {
                    AppMonitor.Stat.commit(str5, MONITOR_POINT_LOW_DEVICE, create, create2);
                }
                if (TextUtils.equals(str7, "102010")) {
                    AppMonitor.Stat.commit(str5, MONITOR_POINT_RNF, create, create2);
                }
            }
            npj npjVar = tBImageFlowMonitor.h;
            if (npjVar != null) {
                str9 = ((qpj) npjVar).b();
                str8 = ((qpj) tBImageFlowMonitor.h).a();
            } else {
                str9 = null;
                str8 = null;
            }
            if ((z || z2) && str7 != null) {
                I();
                DimensionValueSet create3 = DimensionValueSet.create();
                MeasureValueSet create4 = MeasureValueSet.create();
                create3.setValue("url", l);
                create3.setValue("bizName", F);
                create3.setValue(str6, str7);
                str12 = str7;
                obj3 = "url";
                if (z) {
                    obj2 = "bizName";
                    str10 = F;
                    str16 = str;
                    create3.setValue(ERROR_ORIGIN_CODE, String.valueOf(((NetworkResponseException) th).getHttpCode()));
                    create3.setValue("desc", ERROR_DESC_PREFIX + th.getMessage());
                } else {
                    obj2 = "bizName";
                    str10 = F;
                    str16 = str;
                    create3.setValue(ERROR_ORIGIN_CODE, "200");
                    create3.setValue("desc", ERROR_DESC_PREFIX + th.toString());
                }
                create3.setValue("format", str24);
                create3.setValue(DATA_FROM_DIMEN, String.valueOf(imageStatistics.l().value));
                create3.setValue(ERROR_ORIGIN_URL, B);
                if (!(str9 == null && str8 == null)) {
                    create3.setValue(WINDOW_NAME_DIMEN, str9);
                    create3.setValue(NAVI_URL_DIMEN, str8);
                }
                create3.setValue(str16, D);
                if (imageStatistics.P) {
                    str18 = str26;
                    str17 = str4;
                } else {
                    str18 = str26;
                    str17 = str3;
                }
                create3.setValue(str18, str17);
                create3.setValue(str25, imageStatistics.Q ? str4 : str3);
                AppMonitor.Stat.commit(str5, ERROR_POINT, create3, create4);
            } else {
                str12 = str7;
                obj2 = "bizName";
                obj3 = "url";
                str10 = F;
            }
            if (z || k(this.l) || this.i == null) {
                th2 = th;
                str11 = "FlowMonitor";
                c3 = 0;
                c2 = 1;
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put(obj3, l);
                hashMap.put(obj, str2);
                hashMap.put("format", str24);
                hashMap.put(obj2, str10);
                hashMap.put("size", Integer.valueOf(imageStatistics.q()));
                hashMap.put(WINDOW_NAME_DIMEN, str9);
                hashMap.put(NAVI_URL_DIMEN, str8);
                hashMap.put(RETRYING_REQUEST, Boolean.valueOf(imageStatistics.u()));
                hashMap.put("supportAshmem", Boolean.valueOf(p0m.m()));
                hashMap.put("supportInBitmap", Boolean.valueOf(p0m.o()));
                hashMap.put("degradationBits", Integer.valueOf(this.j));
                hashMap.put("statusOfTBReal", s0m.B().j0().a().f().getStatus());
                hashMap.put("sdkInt", Integer.valueOf(Build.VERSION.SDK_INT));
                Map<String, String> j = imageStatistics.j();
                if (j == null || (etjVar2 = this.f) == null) {
                    str15 = null;
                    str14 = null;
                    str13 = null;
                } else {
                    str13 = j.get(((vqr) etjVar2).l());
                    str14 = j.get(((vqr) this.f).m());
                    str15 = j.get(((vqr) this.f).o());
                }
                if (str13 == null) {
                    str13 = "";
                }
                hashMap.put(CDN_IP_PORT_DIMEN, str13);
                if (str14 == null) {
                    str14 = "";
                }
                hashMap.put(CONNECT_TYPE_DIMEN, str14);
                if (str15 == null) {
                    str15 = "";
                }
                hashMap.put(HIT_CDN_CACHE_DIMEN, str15);
                str12 = jjo.a(th.getClass());
                th2 = th;
                if (th2 instanceof DecodeException) {
                    str12 = str12 + ":" + decodeException.getDecodedError() + "[Local?" + decodeException.isLocalUri() + ", Disk?" + decodeException.isDataFromDisk() + "]";
                    Throwable cause = ((DecodeException) th2).getCause();
                    if (cause != null) {
                        str12 = str12;
                        th2 = cause;
                        ((brr) this.i).a(str12, th2, hashMap);
                        c3 = 0;
                        c2 = 1;
                        str11 = "FlowMonitor";
                        fiv.k(str11, "report non-critical error, details=%s, path=%s", hashMap, l);
                    }
                }
                ((brr) this.i).a(str12, th2, hashMap);
                c3 = 0;
                c2 = 1;
                str11 = "FlowMonitor";
                fiv.k(str11, "report non-critical error, details=%s, path=%s", hashMap, l);
            }
            Object[] objArr = new Object[5];
            objArr[c3] = str12;
            objArr[c2] = th2;
            objArr[2] = str9;
            objArr[3] = str8;
            objArr[4] = l;
            fiv.k(str11, "commit complete onFail, analysisCode=%s, throwable=%s, window=%s, navi=%s, path=%s", objArr);
        }
    }
}
