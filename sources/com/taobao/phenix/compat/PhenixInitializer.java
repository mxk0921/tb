package com.taobao.phenix.compat;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import anetwork.channel.monitor.Monitor;
import anetwork.channel.monitor.speed.NetworkSpeed;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.android.SystemUtils;
import com.taobao.analysis.abtest.ABTestCenter;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.task.Coordinator;
import com.taobao.orange.OrangeConfigLocal;
import com.taobao.pexode.decoder.AvifDecoder;
import com.taobao.pexode.decoder.HeifDecoder;
import com.taobao.pexode.decoder.WebPConvert;
import com.taobao.pexode.decoder.WebPDecoder;
import com.taobao.phenix.compat.a;
import com.taobao.phenix.manager.HomeUrlCacheManager;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import mtopsdk.mtop.global.SDKUtils;
import tb.bu2;
import tb.c21;
import tb.cki;
import tb.czn;
import tb.drt;
import tb.eko;
import tb.f2b;
import tb.fiv;
import tb.g8a;
import tb.gq7;
import tb.hec;
import tb.ht0;
import tb.i2s;
import tb.ios;
import tb.iva;
import tb.jcu;
import tb.kt0;
import tb.lt0;
import tb.p0m;
import tb.qpj;
import tb.rle;
import tb.s0m;
import tb.siq;
import tb.sl1;
import tb.uqr;
import tb.us2;
import tb.uvr;
import tb.v11;
import tb.vmh;
import tb.vqr;
import tb.wc;
import tb.xv8;
import tb.z37;
import tb.z8l;
import tb.zdc;
import tb.zpr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PhenixInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FEATURE_ADD_DECODED_CACHE = "image_add_decoded_cache";
    private static final String FEATURE_ADD_DECODED_CACHE_TRADE_CARDS = "image_add_decoded_cache_cards";
    private static final String FEATURE_AVIF_SUPPORT = "image_avif_support";
    private static final String FEATURE_CLOSE_HEIC = "image_force_close_heic";
    private static final String FEATURE_CLOSE_WEBP = "image_force_close_webp";
    private static final String FEATURE_DEVICE_SCALE = "image_device_scale";
    private static final String FEATURE_FORCE_WEBP = "image_force_webp";
    private static final String FEATURE_FUZZY_MATCH = "image_cache_fuzzy_match";
    private static final String FEATURE_LOW_QUALITY = "image_low_quality";
    private static final String FEATURE_NEW_CALLBACK_MODE = "image_new_callback_mode";
    private static final String FEATURE_NEW_MEM_CACHE_SIZE = "image_new_mem_cache_size";
    private static final String FEATURE_NOTIFY_LAUNCH_FINISH = "image_notify_launch_finish";
    private static final String FEATURE_OPT_ANIM_CACHE_NUM = "image_opt_anim_play";
    private static final String FEATURE_OPT_DECIDE_URL = "image_opt_decide_url_v2";
    private static final String FEATURE_OPT_DECODED_CACHE = "image_opt_decoded_cache1";
    private static final String FEATURE_OPT_HEIF_MULTI_THREAD_B = "image_heif_multi_thread_B";
    private static final String FEATURE_OPT_HEIF_MULTI_THREAD__A = "image_heif_multi_thread_A";
    private static final String FEATURE_OPT_HOME_CDN_CACHE = "image_opt_home_cdn_cache";
    private static final String FEATURE_OPT_IMAGE_SCROLL = "dx_scroll_hitchrate_image_key";
    private static final String FEATURE_OPT_LAUNCH_INIT = "image_opt_init";
    private static final String FEATURE_OPT_MEM_CACHE_STRATEGY = "image_opt_cache_strategy";
    private static final String FEATURE_OPT_THREAD_DISPATCH = "image_opt_thread_dispatch";
    private static final String FEATURE_OPT_THREAD_LOCK = "image_opt_thread_lock";
    private static final String FEATURE_POST_FRONT_UI_CLOSE = "image_post_front_ui_close";
    private static final String FEATURE_REPORTER_ASYNC = "image_reporter_async";
    private static final String FEATURE_SUPPORT_HIGH_QUALITY = "image_support_high_quality1";
    private static final String FEATURE_SWITCH_TO_SIMPLE_PATH = "image_switch_to_simple_path";
    private static final String FEATURE_TRADE_INDEPENDENT_CACHE = "image_trade_independent_storage";
    private static final String FEATURE_TURN_OFF_CHECK_AlIVFS = "image_turn_off_check_alivfs";
    private static final String FEATURE_TURN_OFF_FORMAT_CONVERT = "image_turn_off_format_convert";
    private static final String FEATURE_TURN_OFF_SERVER_FORMAT_CONVERT = "image_turn_off_server_adaptive_format";
    private static final String FEATURE_UA_ADD_LEVEL = "image_ua_add_level";
    private static boolean mABValid = false;
    private static boolean mEnableTTL = false;
    private static AvifDecoder sAvifDecoder = null;
    private static boolean sAvifSoPrepared = false;
    private static boolean sAvifSupported = false;
    private static g8a sGifDecoder = null;
    private static HeifDecoder sHeifDecoder = null;
    private static boolean sHeifPngSupported = false;
    private static boolean sHeifSupported = false;
    private static boolean sInited = false;
    private static int sJoinKeepAliveExperiment = -2;
    private static boolean sNewLaunchValid = true;
    private static boolean sUseDecouple;
    private static boolean sUserNewLaunch;
    private static WebPDecoder sWebPDecoder;
    private static boolean sWebPSupported;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(String str) {
            super(str);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/compat/PhenixInitializer$10");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                OrangeConfigLocal.getInstance().getConfigs(rle.IMAGE_CONFIG);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f11460a;

        public b(Context context) {
            this.f11460a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (PhenixInitializer.access$000(this.f11460a, PhenixInitializer.FEATURE_OPT_DECODED_CACHE)) {
                f2b.h().j(this.f11460a);
            } else {
                us2.e().g(this.f11460a);
            }
            if (PhenixInitializer.access$000(this.f11460a, PhenixInitializer.FEATURE_ADD_DECODED_CACHE_TRADE_CARDS)) {
                jcu.f().g(this.f11460a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f11461a;

        public c(Context context) {
            this.f11461a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (PhenixInitializer.access$000(this.f11461a, PhenixInitializer.FEATURE_OPT_HOME_CDN_CACHE)) {
                HomeUrlCacheManager.getInstance().init(this.f11461a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d implements v11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f11462a;

        public d(Context context) {
            this.f11462a = context;
        }

        @Override // com.taobao.application.common.IAppLaunchListener
        public void d(int i, int i2) {
            boolean z;
            int i3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60cba989", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (i2 == 4) {
                s0m B = s0m.B();
                if (SceneIdentifier.getDeviceLevel() == 3) {
                    z = true;
                } else {
                    z = false;
                }
                B.p0(z);
                if (!PhenixInitializer.access$000(this.f11462a, PhenixInitializer.FEATURE_NOTIFY_LAUNCH_FINISH)) {
                    eko.j(false);
                }
                fiv.c("TBCompat4Phenix", "apm launch completed", new Object[0]);
                if (SceneIdentifier.getDeviceLevel() == 3) {
                    eko.i(true);
                }
                try {
                    vmh<String, bu2> b = s0m.B().Z().b();
                    if (b != null) {
                        if (SceneIdentifier.getDeviceLevel() == 3) {
                            i3 = cki.LOW_MAX_CACHE_SIZE;
                        } else {
                            i3 = 104857600;
                        }
                        b.b(cki.b(this.f11462a, i3, 4), 0.2f);
                    }
                } catch (Throwable th) {
                    fiv.c("TBCompat4Phenix", "apm launch completed", th);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class e implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f11463a;

        public e(Context context) {
            this.f11463a = context;
        }

        @Override // com.taobao.phenix.compat.a.b
        public void a(com.taobao.phenix.compat.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("599df453", new Object[]{this, aVar});
            } else if (PhenixInitializer.access$000(this.f11463a, PhenixInitializer.FEATURE_OPT_LAUNCH_INIT)) {
                PhenixInitializer.access$100(this.f11463a, aVar, false);
            } else {
                PhenixInitializer.access$200(this.f11463a, aVar, false);
                PhenixInitializer.initWebp(this.f11463a);
                PhenixInitializer.initGif(this.f11463a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class f implements lt0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("eecf132b", new Object[]{this})).longValue();
            }
            return SDKUtils.getCorrectionTime();
        }

        public boolean b(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e9f3bc92", new Object[]{this, new Long(j)})).booleanValue();
            }
            if (!PhenixInitializer.access$300() || j >= com.taobao.phenix.compat.a.d) {
                return false;
            }
            return true;
        }

        public boolean c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ea3b21db", new Object[]{this, str})).booleanValue();
            }
            if (!PhenixInitializer.access$300() || TextUtils.isEmpty(str) || !str.contains(com.taobao.phenix.compat.a.c)) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class g implements ios {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f52c049", new Object[]{this, str, str2});
                return;
            }
            if (!TextUtils.isEmpty(str) && !str.equals(com.taobao.phenix.compat.a.c)) {
                com.taobao.phenix.compat.a.c = str;
            }
            if (!TextUtils.isEmpty(str2)) {
                com.taobao.phenix.compat.a.d = Long.valueOf(str2).longValue();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class h implements hec {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h(PhenixInitializer phenixInitializer) {
        }

        @Override // tb.hec
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dcb21c6c", new Object[]{this})).booleanValue();
            }
            return PhenixInitializer.access$400();
        }

        @Override // tb.hec
        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a227a7d0", new Object[]{this})).booleanValue();
            }
            if (Monitor.getNetworkSpeed() == NetworkSpeed.Slow) {
                return true;
            }
            return false;
        }

        @Override // tb.hec
        public String c(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4a2bfc12", new Object[]{this, str, str2, str3});
            }
            return OrangeConfigLocal.getInstance().getConfig(str, str2, str3);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class i implements zdc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i(PhenixInitializer phenixInitializer) {
        }

        @Override // tb.zdc
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("933645b4", new Object[]{this})).booleanValue();
            }
            return PhenixInitializer.access$600();
        }

        @Override // tb.zdc
        public boolean b() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fd3835d", new Object[]{this})).booleanValue();
            }
            if (!PhenixInitializer.access$700()) {
                return false;
            }
            if (!PhenixInitializer.access$800()) {
                if (czn.a().b() && p0m.a(sl1.AVIF)) {
                    z = true;
                }
                PhenixInitializer.access$802(z);
            }
            return PhenixInitializer.access$800();
        }

        @Override // tb.zdc
        public boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("99c8d995", new Object[]{this})).booleanValue();
            }
            return PhenixInitializer.access$500();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class j implements z8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j(PhenixInitializer phenixInitializer) {
        }

        @Override // tb.z8l
        public void onConfigUpdate(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
            } else if (rle.IMAGE_CONFIG.equals(str)) {
                rle.d().i();
            }
        }
    }

    public static /* synthetic */ boolean access$000(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1253e7bf", new Object[]{context, str})).booleanValue();
        }
        return isABFeatureOpen(context, str);
    }

    public static /* synthetic */ void access$100(Context context, com.taobao.phenix.compat.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2581ff2", new Object[]{context, aVar, new Boolean(z)});
        } else {
            setupOptPexodeAbility(context, aVar, z);
        }
    }

    public static /* synthetic */ void access$200(Context context, com.taobao.phenix.compat.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9810233", new Object[]{context, aVar, new Boolean(z)});
        } else {
            setupPexodeAbility(context, aVar, z);
        }
    }

    public static /* synthetic */ boolean access$300() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b88b93e", new Object[0])).booleanValue();
        }
        return mEnableTTL;
    }

    public static /* synthetic */ boolean access$400() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("906ef47f", new Object[0])).booleanValue();
        }
        return sWebPSupported;
    }

    public static /* synthetic */ boolean access$500() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5552fc0", new Object[0])).booleanValue();
        }
        return sHeifSupported;
    }

    public static /* synthetic */ boolean access$600() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa3b6b01", new Object[0])).booleanValue();
        }
        return sHeifPngSupported;
    }

    public static /* synthetic */ boolean access$700() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f21a642", new Object[0])).booleanValue();
        }
        return sAvifSupported;
    }

    public static /* synthetic */ boolean access$800() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6407e183", new Object[0])).booleanValue();
        }
        return sAvifSoPrepared;
    }

    public static /* synthetic */ boolean access$802(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("205eb277", new Object[]{new Boolean(z)})).booleanValue();
        }
        sAvifSoPrepared = z;
        return z;
    }

    public static void initApng(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5da0c9", new Object[]{context});
        } else {
            initApng(context, false);
        }
    }

    public static void initCache(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d3cd20f", new Object[]{context});
        } else if (!sInited) {
            drt.a(new b(context));
            drt.a(new c(context));
        }
    }

    public static void initGif(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f131bd0d", new Object[]{context});
        } else {
            initGif(context, false);
        }
    }

    public static void initHeif(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38f87157", new Object[]{context});
        } else {
            initHeif(context, false);
        }
    }

    private static void initTTL(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13031fe5", new Object[]{context});
            return;
        }
        mEnableTTL = true;
        kt0 kt0Var = new kt0("");
        kt0Var.e(new f());
        rle.p(new g());
        s0m.B().i().b(kt0Var);
    }

    public static void initWebp(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdafd5", new Object[]{context});
        } else {
            initWebp(context, false);
        }
    }

    private static boolean isABFeatureOpen(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fea157a", new Object[]{context, str})).booleanValue();
        }
        return ABGlobal.b(context, "taobao", "tbspeed", str);
    }

    public static void registerApmForRx(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42d8d86d", new Object[]{context});
        } else {
            c21.d(new d(context));
        }
    }

    public static void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[0]);
            return;
        }
        if (!(s0m.B() == null || s0m.B().b() == null)) {
            ((Application) s0m.B().b()).unregisterActivityLifecycleCallbacks(qpj.c());
        }
        sInited = false;
    }

    private static boolean shouldOptThreadCount() {
        boolean is64Bit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3d24b10", new Object[0])).booleanValue();
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            is64Bit = Process.is64Bit();
            if (!is64Bit) {
                return true;
            }
        }
        String str = Build.BRAND;
        if ((TextUtils.equals(str, SystemUtils.PRODUCT_HUAWEI) || TextUtils.equals(str, SystemUtils.PRODUCT_HONOR)) && i2 >= 23 && i2 <= 28) {
            return true;
        }
        return false;
    }

    private static void checkHeifAlpha(com.taobao.phenix.compat.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e8cf2d5", new Object[]{aVar});
            return;
        }
        boolean o = aVar.o(51);
        boolean o2 = aVar.o(53);
        boolean o3 = aVar.o(54);
        fiv.c("TBCompat4Phenix", "checkHeifAlpha supportHeifAlpha = " + o + ", fixHeifAlphaCrash = " + o2, new Object[0]);
        HeifDecoder.b(o2);
        HeifDecoder.c(o3);
        s0m.B().A0(o);
        if (aVar.o(52) && !aVar.g(com.taobao.phenix.compat.a.CLEAR_CACHE_HISTORY).booleanValue()) {
            aVar.r(com.taobao.phenix.compat.a.CLEAR_CACHE_HISTORY, Boolean.TRUE);
            fiv.c("TBCompat4Phenix", "clear all local diskcache because clear history switch opened", new Object[0]);
            s0m.B().g();
        }
    }

    private static void checkHighQuality(com.taobao.phenix.compat.a aVar) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4edcaee", new Object[]{aVar});
            return;
        }
        try {
            String l = aVar.l(57, com.taobao.phenix.compat.a.CLOUD_KEY_HEIGHT_SCALE_WHITELIST);
            fiv.c("TBCompat4Phenix", "heightScaleList " + l, new Object[0]);
            if (!TextUtils.isEmpty(l)) {
                if (l.contains(",")) {
                    strArr4 = l.split(",");
                } else {
                    strArr4 = new String[]{l};
                }
                s0m.B().T0(new ArrayList<>(Arrays.asList(strArr4)));
            }
        } catch (Throwable th) {
            fiv.c("TBCompat4Phenix", "get heightScaleList error" + th.getMessage(), new Object[0]);
        }
        try {
            String l2 = aVar.l(58, com.taobao.phenix.compat.a.CLOUD_KEY_HIGH_QUALITY_WHITELIST);
            fiv.c("TBCompat4Phenix", "highQualityList " + l2, new Object[0]);
            if (!TextUtils.isEmpty(l2)) {
                if (l2.contains(",")) {
                    strArr3 = l2.split(",");
                } else {
                    strArr3 = new String[]{l2};
                }
                s0m.B().V0(new ArrayList<>(Arrays.asList(strArr3)));
            }
        } catch (Throwable th2) {
            fiv.c("TBCompat4Phenix", "get highQualityList error" + th2.getMessage(), new Object[0]);
        }
        try {
            String l3 = aVar.l(59, com.taobao.phenix.compat.a.CLOUD_KEY_HEIGHT_SCALE_PRIORITY_WHITELIST);
            fiv.c("TBCompat4Phenix", "heightScalePriorityList " + l3, new Object[0]);
            if (!TextUtils.isEmpty(l3)) {
                if (l3.contains(",")) {
                    strArr2 = l3.split(",");
                } else {
                    strArr2 = new String[]{l3};
                }
                s0m.B().S0(new ArrayList<>(Arrays.asList(strArr2)));
            }
        } catch (Throwable th3) {
            fiv.c("TBCompat4Phenix", "get heightScalePriorityList error" + th3.getMessage(), new Object[0]);
        }
        try {
            String l4 = aVar.l(60, com.taobao.phenix.compat.a.CLOUD_KEY_HIGH_QUALITY_PRIORITY_WHITELIST);
            fiv.c("TBCompat4Phenix", "highQualityPriorityList " + l4, new Object[0]);
            if (!TextUtils.isEmpty(l4)) {
                if (l4.contains(",")) {
                    strArr = l4.split(",");
                } else {
                    strArr = new String[]{l4};
                }
                s0m.B().U0(new ArrayList<>(Arrays.asList(strArr)));
            }
        } catch (Throwable th4) {
            fiv.c("TBCompat4Phenix", "get highQualityPriorityList error" + th4.getMessage(), new Object[0]);
        }
    }

    public static void initApng(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60572b2b", new Object[]{context, new Boolean(z)});
        } else if (sNewLaunchValid) {
            if (!z && isABFeatureOpen(context, FEATURE_OPT_LAUNCH_INIT)) {
                return;
            }
            if (!z || isABFeatureOpen(context, FEATURE_OPT_LAUNCH_INIT)) {
                p0m.l(new wc());
            }
        }
    }

    public static void initBuild(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("390fb2a3", new Object[]{context});
            return;
        }
        s0m.B().d();
        siq.e(context, new vqr(), com.taobao.phenix.compat.a.n(context).m(13), com.taobao.phenix.compat.a.n(context).m(21), 524288, null);
        uqr.f();
        if (isABFeatureOpen(context, FEATURE_REPORTER_ASYNC)) {
            siq.d(true);
        }
    }

    public static void initGif(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35069767", new Object[]{context, new Boolean(z)});
        } else if (!sNewLaunchValid || sGifDecoder != null) {
        } else {
            if (!z && isABFeatureOpen(context, FEATURE_OPT_LAUNCH_INIT)) {
                return;
            }
            if (!z || isABFeatureOpen(context, FEATURE_OPT_LAUNCH_INIT)) {
                g8a g8aVar = new g8a();
                sGifDecoder = g8aVar;
                p0m.l(g8aVar);
            }
        }
    }

    public static void initHeif(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6166c5d", new Object[]{context, new Boolean(z)});
        } else if (sNewLaunchValid && sHeifDecoder == null && !z) {
            HeifDecoder heifDecoder = new HeifDecoder();
            sHeifDecoder = heifDecoder;
            p0m.l(heifDecoder);
            if (sHeifDecoder != null) {
                HeifDecoder.h(true);
                HeifDecoder.g(false);
                HeifDecoder.f(true);
                fiv.c("TBCompat4Phenix", "useHeifBugFix=%d, heicIccSupportEnable=%d, localHeifBySystemEnable=%d", 1, 0, 1);
            }
            sHeifSupported = p0m.a(iva.HEIF);
            s0m.B().z0(sHeifSupported);
            if (shouldOptThreadCount()) {
                HeifDecoder.e(false, 1);
                return;
            }
            if (isABFeatureOpen(context, FEATURE_OPT_HEIF_MULTI_THREAD__A)) {
                HeifDecoder.e(false, 1);
            }
            if (isABFeatureOpen(context, FEATURE_OPT_HEIF_MULTI_THREAD_B)) {
                HeifDecoder.e(true, 2);
            }
        }
    }

    public static void initWebp(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92b8fd9f", new Object[]{context, new Boolean(z)});
        } else if (!sNewLaunchValid || sWebPDecoder != null) {
        } else {
            if (!z && isABFeatureOpen(context, FEATURE_OPT_LAUNCH_INIT)) {
                return;
            }
            if (!z || isABFeatureOpen(context, FEATURE_OPT_LAUNCH_INIT)) {
                WebPDecoder webPDecoder = new WebPDecoder();
                sWebPDecoder = webPDecoder;
                p0m.l(webPDecoder);
            }
        }
    }

    public static void notifyLaunchFinish(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ba65b72", new Object[]{context});
        } else if (isABFeatureOpen(context, FEATURE_NOTIFY_LAUNCH_FINISH)) {
            eko.j(false);
        }
    }

    public static void initAvif(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3468b1f", new Object[]{context});
        } else if (isABFeatureOpen(context, FEATURE_AVIF_SUPPORT) && sNewLaunchValid) {
            com.taobao.phenix.compat.a n = com.taobao.phenix.compat.a.n(context);
            if (n.o(45)) {
                AvifDecoder avifDecoder = new AvifDecoder();
                sAvifDecoder = avifDecoder;
                p0m.l(avifDecoder);
                sAvifSupported = true;
                boolean o = n.o(48);
                AvifDecoder.f(o);
                fiv.c("TBCompat4Phenix", "sSupportAvif=%d, localAvifEnable=%s", Integer.valueOf(sAvifSupported ? 1 : 0), String.valueOf(o));
            }
        }
    }

    private void initImageStrategy(Application application) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d225e3a", new Object[]{this, application});
            return;
        }
        rle.h(application, new h(this));
        rle.d().m(new i(this));
        OrangeConfigLocal.getInstance().registerListener(new String[]{rle.IMAGE_CONFIG}, new j(this));
        Coordinator.postTask(new a("initImageConfig"));
        if (isABFeatureOpen(application, FEATURE_DEVICE_SCALE)) {
            rle.d().k(true);
        }
        if (isABFeatureOpen(application, FEATURE_LOW_QUALITY)) {
            rle.d().n(true);
        }
        if (isABFeatureOpen(application, FEATURE_FORCE_WEBP)) {
            rle.d().l(true);
        }
        if (isABFeatureOpen(application, FEATURE_OPT_DECIDE_URL)) {
            rle.d().o(true);
        }
        if (isABFeatureOpen(application, FEATURE_SUPPORT_HIGH_QUALITY)) {
            rle.d().C(true);
        }
        try {
            String l = com.taobao.phenix.compat.a.n(application).l(57, com.taobao.phenix.compat.a.CLOUD_KEY_HEIGHT_SCALE_WHITELIST);
            fiv.c("TBCompat4Phenix", "heightScaleList " + l, new Object[0]);
            if (!TextUtils.isEmpty(l)) {
                if (l.contains(",")) {
                    strArr4 = l.split(",");
                } else {
                    strArr4 = new String[]{l};
                }
                rle.d().z(new ArrayList<>(Arrays.asList(strArr4)));
            }
        } catch (Throwable th) {
            fiv.c("TBCompat4Phenix", "get heightScaleList error" + th.getMessage(), new Object[0]);
        }
        try {
            String l2 = com.taobao.phenix.compat.a.n(application).l(58, com.taobao.phenix.compat.a.CLOUD_KEY_HIGH_QUALITY_WHITELIST);
            fiv.c("TBCompat4Phenix", "highQualityList " + l2, new Object[0]);
            if (!TextUtils.isEmpty(l2)) {
                if (l2.contains(",")) {
                    strArr3 = l2.split(",");
                } else {
                    strArr3 = new String[]{l2};
                }
                rle.d().B(new ArrayList<>(Arrays.asList(strArr3)));
            }
        } catch (Throwable th2) {
            fiv.c("TBCompat4Phenix", "get highQualityList error" + th2.getMessage(), new Object[0]);
        }
        try {
            String l3 = com.taobao.phenix.compat.a.n(application).l(59, com.taobao.phenix.compat.a.CLOUD_KEY_HEIGHT_SCALE_PRIORITY_WHITELIST);
            fiv.c("TBCompat4Phenix", "heightScalePriorityList " + l3, new Object[0]);
            if (!TextUtils.isEmpty(l3)) {
                if (l3.contains(",")) {
                    strArr2 = l3.split(",");
                } else {
                    strArr2 = new String[]{l3};
                }
                rle.d().y(new ArrayList<>(Arrays.asList(strArr2)));
            }
        } catch (Throwable th3) {
            fiv.c("TBCompat4Phenix", "get heightScalePriorityList error" + th3.getMessage(), new Object[0]);
        }
        try {
            String l4 = com.taobao.phenix.compat.a.n(application).l(60, com.taobao.phenix.compat.a.CLOUD_KEY_HIGH_QUALITY_PRIORITY_WHITELIST);
            fiv.c("TBCompat4Phenix", "highQualityPriorityList " + l4, new Object[0]);
            if (!TextUtils.isEmpty(l4)) {
                if (l4.contains(",")) {
                    strArr = l4.split(",");
                } else {
                    strArr = new String[]{l4};
                }
                rle.d().A(new ArrayList<>(Arrays.asList(strArr)));
            }
        } catch (Throwable th4) {
            fiv.c("TBCompat4Phenix", "get highQualityPriorityList error" + th4.getMessage(), new Object[0]);
        }
        fiv.f("TBCompat4Phenix", "image_strategy init complete", new Object[0]);
    }

    public static void initTBScheduler(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54e84364", new Object[]{context});
            return;
        }
        uvr.b(true);
        if (isABFeatureOpen(context, FEATURE_POST_FRONT_UI_CLOSE)) {
            eko.j(false);
        }
        registerApmForRx(context);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        if (hashMap != null && hashMap.containsKey("isNextLaunch")) {
            sUserNewLaunch = true;
        }
        if (hashMap != null && hashMap.containsKey("ngLaunch")) {
            sUseDecouple = true;
        }
        try {
            mABValid = true;
        } catch (Exception unused) {
            mABValid = false;
        }
        initCache(application);
        initPhenix(application);
        initImageStrategy(application);
        TUrlImageView.registerActivityCallback(application);
        fiv.f("TBCompat4Phenix", "all init complete", new Object[0]);
    }

    public static synchronized boolean initPhenix(Context context) {
        boolean is64Bit;
        synchronized (PhenixInitializer.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("63f72a65", new Object[]{context})).booleanValue();
            } else if (sInited) {
                return true;
            } else {
                xv8.h(new i2s());
                s0m.B().N0(context);
                s0m.B().r0(new zpr());
                initTTL(context);
                uqr.e(context);
                uqr.d(false);
                ht0.a();
                if (!sUseDecouple) {
                    uvr.b(true);
                }
                if (mABValid) {
                    String uTABTestValue = ABTestCenter.getUTABTestValue("PHENIX", "DISK");
                    String uTABTestValue2 = ABTestCenter.getUTABTestValue("PHENIX", "OSVER");
                    if (Build.VERSION.SDK_INT >= (!TextUtils.isEmpty(uTABTestValue2) ? Integer.valueOf(uTABTestValue2).intValue() : 23) && !TextUtils.isEmpty(uTABTestValue)) {
                        s0m.B().h().b(17, Integer.valueOf(uTABTestValue).intValue() * 1048576);
                    }
                    fiv.c("TBCompat4Phenix", "DiskCache=%s", uTABTestValue);
                }
                eko.k(false);
                sNewLaunchValid = true;
                fiv.c("TBCompat4Phenix", "use-new-launch=%d", 1);
                com.taobao.phenix.compat.a n = com.taobao.phenix.compat.a.n(context);
                if (isABFeatureOpen(context, FEATURE_FUZZY_MATCH)) {
                    s0m.B().l0(true);
                }
                gq7.a().b(false);
                sHeifPngSupported = true;
                siq.b = true;
                eko.h(true);
                uqr.c(true);
                s0m.B().S(false);
                if (Build.VERSION.SDK_INT >= 23) {
                    is64Bit = Process.is64Bit();
                    if (is64Bit) {
                        s0m.B().a(true);
                    }
                }
                if (isABFeatureOpen(context, FEATURE_OPT_THREAD_LOCK)) {
                    fiv.c("TBCompat4Phenix", "image_opt_thread_lock=%d", 1);
                    s0m.B().M0(true);
                }
                if (isABFeatureOpen(context, FEATURE_TURN_OFF_FORMAT_CONVERT)) {
                    s0m.B().I0(true);
                    fiv.c("TBCompat4Phenix", "image_turn_off_format_convert=%d", 1);
                }
                if (isABFeatureOpen(context, FEATURE_TURN_OFF_SERVER_FORMAT_CONVERT)) {
                    s0m.B().J0(true);
                    fiv.c("TBCompat4Phenix", "image_turn_off_server_adaptive_format=%d", 1);
                }
                if (isABFeatureOpen(context, FEATURE_OPT_ANIM_CACHE_NUM)) {
                    s0m.B().a0(true);
                    fiv.c("TBCompat4Phenix", "image_opt_anim_num=%d", 1);
                }
                if (isABFeatureOpen(context, FEATURE_OPT_IMAGE_SCROLL)) {
                    s0m.B().v0(true);
                }
                if (isABFeatureOpen(context, FEATURE_LOW_QUALITY)) {
                    s0m.B().q0(true);
                }
                if (isABFeatureOpen(context, FEATURE_CLOSE_HEIC)) {
                    s0m.B().m(true);
                }
                if (isABFeatureOpen(context, FEATURE_CLOSE_WEBP)) {
                    s0m.B().n(true);
                }
                if (isABFeatureOpen(context, FEATURE_UA_ADD_LEVEL)) {
                    s0m.B().K0(true);
                }
                if (isABFeatureOpen(context, FEATURE_NOTIFY_LAUNCH_FINISH)) {
                    eko.a(true);
                }
                s0m.B().x0(true);
                if (isABFeatureOpen(context, FEATURE_NEW_CALLBACK_MODE)) {
                    fiv.c("TBCompat4Phenix", "[ABFeatureOpenStatus]key=%s, open=%d", FEATURE_NEW_CALLBACK_MODE, 1);
                    s0m.B().s0(true);
                }
                if (isABFeatureOpen(context, FEATURE_OPT_DECODED_CACHE)) {
                    fiv.c("TBCompat4Phenix", "[ABFeatureOpenStatus]key=%s, open=%d", FEATURE_OPT_DECODED_CACHE, 1);
                    s0m.B().u0(true);
                }
                if (isABFeatureOpen(context, FEATURE_ADD_DECODED_CACHE_TRADE_CARDS)) {
                    fiv.c("TBCompat4Phenix", "[ABFeatureOpenStatus]key=%s, open=%d", FEATURE_ADD_DECODED_CACHE_TRADE_CARDS, 1);
                    s0m.B().y0(true);
                }
                if (isABFeatureOpen(context, FEATURE_TRADE_INDEPENDENT_CACHE)) {
                    fiv.c("TBCompat4Phenix", "[ABFeatureOpenStatus]key=%s, open=%d", FEATURE_TRADE_INDEPENDENT_CACHE, 1);
                    s0m.B().B0(true);
                }
                s0m.B().d0(true);
                if (isABFeatureOpen(context, FEATURE_OPT_HOME_CDN_CACHE)) {
                    fiv.c("TBCompat4Phenix", "[ABFeatureOpenStatus]key=%s, open=%d", FEATURE_OPT_HOME_CDN_CACHE, 1);
                    s0m.B().t0(true);
                }
                if (isABFeatureOpen(context, FEATURE_SWITCH_TO_SIMPLE_PATH)) {
                    fiv.c("TBCompat4Phenix", "[ABFeatureOpenStatus]key=%s, open=%d", FEATURE_SWITCH_TO_SIMPLE_PATH, 1);
                    s0m.B().C0(true);
                }
                if (isABFeatureOpen(context, FEATURE_OPT_THREAD_DISPATCH)) {
                    fiv.c("TBCompat4Phenix", "[ABFeatureOpenStatus]key=%s, open=%d", FEATURE_OPT_THREAD_DISPATCH, 1);
                    s0m.B().w0(true);
                }
                if (isABFeatureOpen(context, FEATURE_SUPPORT_HIGH_QUALITY)) {
                    fiv.c("TBCompat4Phenix", "[ABFeatureOpenStatus]key=%s, open=%d", FEATURE_SUPPORT_HIGH_QUALITY, 1);
                    s0m.B().W0(true);
                }
                if (!sUseDecouple) {
                    s0m.B().d();
                }
                if (isABFeatureOpen(context, FEATURE_OPT_LAUNCH_INIT)) {
                    setupOptPexodeAbility(context, n, true);
                } else {
                    setupPexodeAbility(context, n, true);
                    initWebp(context);
                    initGif(context);
                }
                p0m.t(s0m.B().e().a());
                p0m.q(context);
                n.d(new e(context));
                if (!sUseDecouple) {
                    siq.e(context, new vqr(), com.taobao.phenix.compat.a.n(context).m(13), com.taobao.phenix.compat.a.n(context).m(21), 524288, null);
                    uqr.f();
                    if (isABFeatureOpen(context, FEATURE_REPORTER_ASYNC)) {
                        siq.d(true);
                    }
                }
                fiv.f("TBCompat4Phenix", "phenix init complete", new Object[0]);
                sInited = true;
                return false;
            }
        }
    }

    private static synchronized void setupOptPexodeAbility(Context context, com.taobao.phenix.compat.a aVar, boolean z) {
        synchronized (PhenixInitializer.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("123f3c28", new Object[]{context, aVar, new Boolean(z)});
                return;
            }
            p0m.h = true;
            s0m.S = true;
            ImageStrategyConfig.r = true;
            if (Build.VERSION.SDK_INT == 28 && WebPConvert.sIsSoInstalled) {
                WebPConvert.nativeUseBugFix(true);
            }
            if (z && (!sNewLaunchValid || !sUserNewLaunch)) {
                p0m.l(new wc());
                HeifDecoder heifDecoder = new HeifDecoder();
                sHeifDecoder = heifDecoder;
                p0m.l(heifDecoder);
                if (isABFeatureOpen(context, FEATURE_AVIF_SUPPORT)) {
                    p0m.l(new AvifDecoder());
                    sAvifSupported = true;
                    fiv.c("TBCompat4Phenix", "sSupportAvif=%d", 1);
                }
            }
            if (sHeifDecoder != null) {
                HeifDecoder.h(true);
                HeifDecoder.g(false);
                HeifDecoder.f(true);
            }
            p0m.h(true);
            p0m.g(false);
            sWebPSupported = p0m.a(z37.WEBP) && p0m.a(z37.WEBP_A);
            if (!sNewLaunchValid || !sUserNewLaunch) {
                sHeifSupported = p0m.a(iva.HEIF);
                s0m.B().z0(sHeifSupported);
            }
            mEnableTTL = true;
            fiv.f("TBCompat4Phenix", "setup pexode ability with heif=%b, webp=%b, initializing=%b", Boolean.valueOf(sHeifSupported), Boolean.valueOf(sWebPSupported), Boolean.valueOf(z));
            if (aVar.o(55)) {
                s0m.B().o0(true);
            }
            checkHighQuality(aVar);
            checkHeifAlpha(aVar);
        }
    }

    private static synchronized void setupPexodeAbility(Context context, com.taobao.phenix.compat.a aVar, boolean z) {
        String[] strArr;
        synchronized (PhenixInitializer.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("31b07e81", new Object[]{context, aVar, new Boolean(z)});
                return;
            }
            boolean o = aVar.o(15);
            boolean o2 = aVar.o(16);
            boolean o3 = aVar.o(19);
            boolean o4 = aVar.o(46);
            p0m.g = o4;
            fiv.c("TBCompat4Phenix", "use-AndroidS=%d", Integer.valueOf(o4 ? 1 : 0));
            boolean o5 = aVar.o(29);
            p0m.f = o5;
            fiv.c("TBCompat4Phenix", "use-AndroidP=%d", Integer.valueOf(o5 ? 1 : 0));
            boolean z2 = !aVar.o(31);
            ImageStrategyConfig.q = z2;
            fiv.c("TBCompat4Phenix", "use-Degrade-webp=%d", Integer.valueOf(z2 ? 1 : 0));
            boolean o6 = aVar.o(33);
            p0m.h = o6;
            fiv.c("TBCompat4Phenix", "use-webp-convert=%d", Integer.valueOf(o6 ? 1 : 0));
            boolean o7 = aVar.o(32);
            s0m.S = o7;
            fiv.c("TBCompat4Phenix", "use-no-reuse-webp=%d", Integer.valueOf(o7 ? 1 : 0));
            boolean o8 = aVar.o(37);
            ImageStrategyConfig.r = o8;
            fiv.c("TBCompat4Phenix", "use-special-domain=%d", Integer.valueOf(o8 ? 1 : 0));
            boolean o9 = aVar.o(35);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 == 28 && WebPConvert.sIsSoInstalled) {
                WebPConvert.nativeUseBugFix(o9);
            }
            fiv.c("TBCompat4Phenix", "use-webp-bugfix=%d", Integer.valueOf(o9 ? 1 : 0));
            int i3 = (i2 < 29 || !aVar.o(36)) ? 0 : 1;
            if (i3 != 0) {
                s0m.B().L0(true);
            }
            fiv.c("TBCompat4Phenix", "use-new-thumb=%d", Integer.valueOf(i3));
            if (z && (!sNewLaunchValid || !sUserNewLaunch)) {
                if (aVar.o(20)) {
                    p0m.l(new wc());
                }
                if (aVar.o(22)) {
                    HeifDecoder heifDecoder = new HeifDecoder();
                    sHeifDecoder = heifDecoder;
                    p0m.l(heifDecoder);
                }
                if (isABFeatureOpen(context, FEATURE_AVIF_SUPPORT) && aVar.o(45)) {
                    p0m.l(new AvifDecoder());
                    sAvifSupported = true;
                    fiv.c("TBCompat4Phenix", "sSupportAvif=%d", 1);
                }
            }
            boolean o10 = aVar.o(30);
            if (sHeifDecoder != null) {
                HeifDecoder.h(o10);
                HeifDecoder.g(false);
                HeifDecoder.f(true);
            }
            fiv.c("TBCompat4Phenix", "use-HeifBugFix=%d", Integer.valueOf(o10 ? 1 : 0));
            p0m.h(!o);
            p0m.f(o2);
            p0m.g(!o3);
            sWebPSupported = p0m.a(z37.WEBP) && p0m.a(z37.WEBP_A);
            if (!sNewLaunchValid || !sUserNewLaunch) {
                sHeifSupported = p0m.a(iva.HEIF);
                s0m.B().z0(sHeifSupported);
            }
            boolean o11 = aVar.o(38);
            mEnableTTL = o11;
            fiv.c("TBCompat4Phenix", "mEnableTTL=%d", Integer.valueOf(o11 ? 1 : 0));
            fiv.c("TBCompat4Phenix", "sHeifSupported=%b", Boolean.valueOf(sHeifSupported));
            fiv.f("TBCompat4Phenix", "setup pexode ability with heif=%b, webp=%b, external_prior=%b, cancellable=%b, ashmem=%b, initializing=%b", Boolean.valueOf(sHeifSupported), Boolean.valueOf(sWebPSupported), Boolean.valueOf(o), Boolean.valueOf(o2), Boolean.valueOf(o3), Boolean.valueOf(z));
            int k = aVar.k(42);
            int k2 = aVar.k(43);
            int k3 = aVar.k(44);
            if (k > 0) {
                gq7.a().e(k);
            }
            if (k2 > 0) {
                gq7.a().c(k2);
            }
            if (k3 > 0) {
                gq7.a().d(k3);
            }
            if (aVar.o(55)) {
                s0m.B().o0(true);
            }
            String l = aVar.l(50, com.taobao.phenix.compat.a.CLOUD_KEY_LIMIT_RECURSIVE_DEPTH_WHITELIST);
            fiv.c("TBCompat4Phenix", "bizCodeList " + l, new Object[0]);
            if (!TextUtils.isEmpty(l)) {
                if (l.contains(",")) {
                    strArr = l.split(",");
                } else {
                    strArr = new String[]{l};
                }
                eko.g(new ArrayList(Arrays.asList(strArr)));
            }
            checkHighQuality(aVar);
            checkHeifAlpha(aVar);
        }
    }
}
