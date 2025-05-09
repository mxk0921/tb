package tb;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.PhenixInitializer;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.OssImageUrlStrategy;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rle {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALI_CDN_DOMAIN = "aliCdnDomain";
    public static final String AVIF_BUSINESS_WHITE_LIST = "avifBizWhiteList";
    public static final String AVIF_IMAGE_DOMAIN = "avifImageDomain";
    public static final String CDN_10000_HEIGHT = "cdn10000Height";
    public static final String CDN_10000_WIDTH = "cdn10000Width";
    public static final String CDN_IMAGE_SIZE = "cdnImageSizes";
    public static final String CONVERT_EXCLUDE_PATH = "domainConvertExcludePath";
    public static final String DEFAULT_CDN_DOMAIN_WHITE_LIST = "defaultCDNDomainWhiteList";
    public static final String DOMAIN_DEST = "domainDest";
    public static final String DOMAIN_SWITCH = "domainSwitch";
    public static final String EXACT_EXCLUDE_DOMAIN = "exactExcludeDomain";
    public static final String FUZZY_EXCLUDE_PATH = "fuzzyExcludePath";
    public static final String GLOBAL_SWITCH = "globalSwitch";
    public static final String H5_HEIF_BUSINESS_WHITE_LIST = "h5HeifBizWhiteList";
    public static final String H5_HEIF_SOURCE_WHITE_LIST = "h5HeifSourceWhiteList";
    public static final String HEIF_BUSINESS_WHITE_LIST = "heifBizWhiteList";
    public static final String HEIF_IMAGE_DOMAIN = "heifImageDomain";
    public static final String IMAGE_CONFIG = "android_image_strategy_config";
    public static final String IMAGE_STRATEGY = "image_strategy";
    public static final String LEVEL_MODEL_SIZES = "levelModelImageSizes";
    public static final String LEVEL_MODEL_XZSIZES = "levelModelXZImageSizes";
    public static final String LEVEL_RATIO = "levelRatio";
    public static final String MODULES = "modules";
    public static final String OSS_CDN_DOMAIN = "ossCdnDomain";
    public static final String OSS_FUZZY_EXCLUDE = "ossFuzzyExclude";
    public static final String SPECIAL_IMAGE_DOMAIN = "specialImageDomain";
    public static final String STRICT_ALI_CDN_DOMAIN = "strictCDNDomainWL";
    public static final String STRICT_CONVERT_EXCLUDE_PATH = "strictDomainConvertBL";
    public static final String STRICT_EXACT_EXCLUDE_DOMAIN = "strictExactDomainBL";
    public static final String TTL_MAX_TIME = "maxTTLTime";
    public static final String XZ_CDN_IMAGE_SIZE = "xzcdnImageSizes";
    public static final HashMap<String, String> g;
    public static ios h;
    public static rle i = null;

    /* renamed from: a  reason: collision with root package name */
    public final hec f27457a;
    public zdc b;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public ArrayList<String> j;
    public ArrayList<String> k;
    public ArrayList<String> l;
    public ArrayList<String> m;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        g = hashMap;
        hashMap.put(GLOBAL_SWITCH, "1");
        hashMap.put(DOMAIN_SWITCH, "1");
        hashMap.put(MODULES, "default,search,detail,shop,weitao,weapp,weappsharpen,bala,home,tbchannel");
        hashMap.put("default", "{ \"highNetQ\": \"q90\", \"lowNetQ\": \"q75\", \"highNetSharpen\": \"\", \"lowNetSharpen\": \"\", \"highNetScale\": \"1\", \"lowNetScale\": \"1\", \"useWebP\": 1 }");
        hashMap.put("search", "{ \"highNetQ\": \"q90\", \"lowNetQ\": \"q50\", \"highNetSharpen\": \"\", \"lowNetSharpen\": \"s150\", \"highNetScale\": \"1\", \"lowNetScale\": \"1\", \"useWebP\": 1 }");
        hashMap.put("detail", "{ \"highNetQ\": \"q90\", \"lowNetQ\": \"q50\", \"highNetSharpen\": \"\", \"lowNetSharpen\": \"s150\", \"highNetScale\": \"1\", \"lowNetScale\": \"1\", \"useWebP\": 1 }");
        hashMap.put("shop", "{ \"highNetQ\": \"q75\", \"lowNetQ\": \"q50\", \"highNetSharpen\": \"s150\", \"lowNetSharpen\": \"s150\", \"highNetScale\": \"1\", \"lowNetScale\": \"1\", \"useWebP\": 1 }");
        hashMap.put(ImageStrategyConfig.WEITAO, "{ \"highNetQ\": \"q90\", \"lowNetQ\": \"q75\", \"highNetSharpen\": \"s110\", \"lowNetSharpen\": \"s110\", \"highNetScale\": \"1\", \"lowNetScale\": \"1\", \"useWebP\": 1 }");
        hashMap.put(ImageStrategyConfig.WEAPP, "{ \"highNetQ\": \"q90\", \"lowNetQ\": \"q50\", \"highNetSharpen\": \"\", \"lowNetSharpen\": \"\", \"highNetScale\": \"1\", \"lowNetScale\": \"1\", \"useWebP\": 1 }");
        hashMap.put(ImageStrategyConfig.WEAPPSHARPEN, "{ \"highNetQ\": \"q75\", \"lowNetQ\": \"q50\", \"highNetSharpen\": \"s150\", \"lowNetSharpen\": \"s150\", \"highNetScale\": \"1\", \"lowNetScale\": \"1\", \"useWebP\": 1 }");
        hashMap.put(ImageStrategyConfig.BALA, "{ \"highNetQ\": \"q90\", \"lowNetQ\": \"q50\", \"highNetSharpen\": \"\", \"lowNetSharpen\": \"s150\", \"highNetScale\": \"1\", \"lowNetScale\": \"1\", \"useWebP\": 1 }");
        hashMap.put("home", "{ \"highNetQ\": \"q90\", \"lowNetQ\": \"q50\", \"highNetSharpen\": \"\", \"lowNetSharpen\": \"\", \"highNetScale\": \"1\", \"lowNetScale\": \"1\", \"useWebP\": 1 }");
        hashMap.put(ImageStrategyConfig.TBCHANNEL, "{ \"highNetQ\": \"q50\", \"lowNetQ\": \"q30\", \"highNetSharpen\": \"s150\", \"lowNetSharpen\": \"s150\", \"highNetScale\": \"1\", \"lowNetScale\": \"1\", \"useWebP\": 1 }");
    }

    public rle(Application application, hec hecVar) {
        this.f27457a = hecVar;
        TaobaoImageUrlStrategy.getInstance().initDip(application);
        ohh.e(ohh.COMMON_TAG, "construct ImageInitBusinss with IImageStrategySupport(webp support:%b)", Boolean.valueOf(hecVar.a()));
    }

    public static rle d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rle) ipChange.ipc$dispatch("c6c4d3f5", new Object[0]);
        }
        return i;
    }

    public static rle h(Application application, hec hecVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rle) ipChange.ipc$dispatch("1d1dd89f", new Object[]{application, hecVar});
        }
        if (i == null) {
            i = new rle(application, hecVar);
        }
        return i;
    }

    public static void p(ios iosVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9f039dc", new Object[]{iosVar});
        } else {
            h = iosVar;
        }
    }

    public void A(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b1ce75b", new Object[]{this, arrayList});
        } else if (arrayList != null && arrayList.size() > 0) {
            this.m = arrayList;
        }
    }

    public void B(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33092597", new Object[]{this, arrayList});
        } else if (arrayList != null && arrayList.size() > 0) {
            this.k = arrayList;
        }
    }

    public void C(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8815c79", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44dcc43d", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d4fca32", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public zdc c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zdc) ipChange.ipc$dispatch("f7ce1b5d", new Object[]{this});
        }
        return this.b;
    }

    public hec e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hec) ipChange.ipc$dispatch("3b6fee42", new Object[]{this});
        }
        return this.f27457a;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3d3e538", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30999de0", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public ArrayList<String> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("6c0dc057", new Object[]{this});
        }
        return this.l;
    }

    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42876958", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3386368", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void m(zdc zdcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c954b703", new Object[]{this, zdcVar});
        } else {
            this.b = zdcVar;
        }
    }

    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf0dca40", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66abd7f7", new Object[]{this, new Boolean(z)});
        }
    }

    public final double r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7382451", new Object[]{this, str})).doubleValue();
        }
        try {
            return Double.parseDouble(str);
        } catch (Exception unused) {
            return 1.0d;
        }
    }

    public final int s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48f819ce", new Object[]{this, str})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    public final int[] t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("c064df08", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(",");
        int length = split.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = s(split[i2]);
        }
        return iArr;
    }

    public final String[] u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("a11e9f29", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split(",");
    }

    public ArrayList<String> v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("265af89b", new Object[]{this});
        }
        return this.j;
    }

    public ArrayList<String> w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("443d9cfd", new Object[]{this});
        }
        return this.m;
    }

    public ArrayList<String> x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("d12cdb41", new Object[]{this});
        }
        return this.k;
    }

    public void y(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d512f41", new Object[]{this, arrayList});
        } else if (arrayList != null && arrayList.size() > 0) {
            this.l = arrayList;
        }
    }

    public void z(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("839eb37d", new Object[]{this, arrayList});
        } else if (arrayList != null && arrayList.size() > 0) {
            this.j = arrayList;
        }
    }

    public final HashMap<String, TaobaoImageUrlStrategy.ServiceImageSwitch> a(String[] strArr) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9b16745e", new Object[]{this, strArr});
        }
        HashMap<String, TaobaoImageUrlStrategy.ServiceImageSwitch> hashMap = new HashMap<>();
        for (String str : strArr) {
            String c = this.f27457a.c(IMAGE_CONFIG, str, g.get(str));
            if (!TextUtils.isEmpty(c)) {
                try {
                    jSONObject = JSON.parseObject(c);
                } catch (Exception e) {
                    e.printStackTrace();
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    TaobaoImageUrlStrategy.ServiceImageSwitch serviceImageSwitch = new TaobaoImageUrlStrategy.ServiceImageSwitch();
                    serviceImageSwitch.setAreaName(str);
                    serviceImageSwitch.setUseWebp(q(jSONObject.getString("useWebP")));
                    serviceImageSwitch.setHighNetQ(jSONObject.getString("highNetQ"));
                    serviceImageSwitch.setLowNetQ(jSONObject.getString("lowNetQ"));
                    serviceImageSwitch.setHighNetSharpen(jSONObject.getString("highNetSharpen"));
                    serviceImageSwitch.setLowNetSharpen(jSONObject.getString("lowNetSharpen"));
                    serviceImageSwitch.setHighNetScale(r(jSONObject.getString("highNetScale")));
                    serviceImageSwitch.setLowNetScale(r(jSONObject.getString("lowNetScale")));
                    serviceImageSwitch.setHighDeviceScale(r(jSONObject.getString("highDeviceScale")));
                    serviceImageSwitch.setMidDeviceScale(r(jSONObject.getString("midDeviceScale")));
                    serviceImageSwitch.setLowDeviceScale(r(jSONObject.getString("lowDeviceScale")));
                    serviceImageSwitch.useCdnSizes(q(jSONObject.getString("useCdnSizes")));
                    hashMap.put(str, serviceImageSwitch);
                }
            }
        }
        return hashMap;
    }

    public final boolean q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be0a201c", new Object[]{this, str})).booleanValue();
        }
        return "true".equals(str) || "1".equals(str);
    }

    public synchronized void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12cdac3f", new Object[]{this});
            return;
        }
        String c = this.f27457a.c(IMAGE_CONFIG, CDN_IMAGE_SIZE, "");
        String c2 = this.f27457a.c(IMAGE_CONFIG, CDN_10000_WIDTH, "");
        String c3 = this.f27457a.c(IMAGE_CONFIG, CDN_10000_HEIGHT, "");
        String c4 = this.f27457a.c(IMAGE_CONFIG, XZ_CDN_IMAGE_SIZE, "");
        String c5 = this.f27457a.c(IMAGE_CONFIG, LEVEL_MODEL_SIZES, "");
        String c6 = this.f27457a.c(IMAGE_CONFIG, LEVEL_MODEL_XZSIZES, "");
        String c7 = this.f27457a.c(IMAGE_CONFIG, DOMAIN_DEST, "");
        String c8 = this.f27457a.c(IMAGE_CONFIG, ALI_CDN_DOMAIN, "");
        String c9 = this.f27457a.c(IMAGE_CONFIG, OSS_CDN_DOMAIN, "");
        String c10 = this.f27457a.c(IMAGE_CONFIG, EXACT_EXCLUDE_DOMAIN, "");
        String c11 = this.f27457a.c(IMAGE_CONFIG, FUZZY_EXCLUDE_PATH, "");
        String c12 = this.f27457a.c(IMAGE_CONFIG, OSS_FUZZY_EXCLUDE, "");
        String c13 = this.f27457a.c(IMAGE_CONFIG, CONVERT_EXCLUDE_PATH, "");
        String c14 = this.f27457a.c(IMAGE_CONFIG, LEVEL_RATIO, "");
        hec hecVar = this.f27457a;
        HashMap<String, String> hashMap = g;
        String c15 = hecVar.c(IMAGE_CONFIG, DOMAIN_SWITCH, hashMap.get(DOMAIN_SWITCH));
        String c16 = this.f27457a.c(IMAGE_CONFIG, GLOBAL_SWITCH, hashMap.get(GLOBAL_SWITCH));
        String c17 = this.f27457a.c(IMAGE_CONFIG, HEIF_IMAGE_DOMAIN, "");
        String c18 = this.f27457a.c(IMAGE_CONFIG, HEIF_BUSINESS_WHITE_LIST, "");
        String c19 = this.f27457a.c(IMAGE_CONFIG, AVIF_IMAGE_DOMAIN, "");
        String c20 = this.f27457a.c(IMAGE_CONFIG, AVIF_BUSINESS_WHITE_LIST, "");
        String c21 = this.f27457a.c(IMAGE_CONFIG, MODULES, hashMap.get(MODULES));
        String c22 = this.f27457a.c(IMAGE_CONFIG, SPECIAL_IMAGE_DOMAIN, "");
        String c23 = this.f27457a.c(IMAGE_CONFIG, TTL_MAX_TIME, "");
        String c24 = this.f27457a.c(IMAGE_CONFIG, STRICT_ALI_CDN_DOMAIN, "");
        String c25 = this.f27457a.c(IMAGE_CONFIG, STRICT_EXACT_EXCLUDE_DOMAIN, "");
        String c26 = this.f27457a.c(IMAGE_CONFIG, STRICT_CONVERT_EXCLUDE_PATH, "");
        String[] u = u(c21);
        String c27 = this.f27457a.c(IMAGE_CONFIG, H5_HEIF_BUSINESS_WHITE_LIST, "");
        String c28 = this.f27457a.c(IMAGE_CONFIG, H5_HEIF_SOURCE_WHITE_LIST, "");
        String c29 = this.f27457a.c(IMAGE_CONFIG, DEFAULT_CDN_DOMAIN_WHITE_LIST, "");
        ios iosVar = h;
        if (iosVar != null) {
            ((PhenixInitializer.g) iosVar).a(c22, c23);
        }
        TaobaoImageUrlStrategy.getInstance().initImageUrlStrategy(t(c), t(c2), t(c3), t(c4), t(c5), t(c6), a(u), c7, c17, c19, c22, t(c18), t(c20), u(c13), u(c8), u(c10), u(c11), q(c16), q(c15), c14, true);
        OssImageUrlStrategy.getInstance().setupConfigs(u(c9), u(c12));
        TaobaoImageUrlStrategy.getInstance().updateStrictCDNDomainWhiteList(u(c24));
        TaobaoImageUrlStrategy.getInstance().updateStrictCDNDomainBlackList(u(c25));
        TaobaoImageUrlStrategy.getInstance().updateStrictConvergenceBlackList(u(c26));
        TaobaoImageUrlStrategy.getInstance().updateH5HeifWhiteList(u(c27));
        TaobaoImageUrlStrategy.getInstance().updateH5HeifSourceWhiteList(u(c28));
        TaobaoImageUrlStrategy.getInstance().updateDefaultCDNDomainWhiteList(u(c29));
        ohh.e(ohh.COMMON_TAG, "orange notify(%s) update\ncdnImageSize:%s\ncdn10000Width:%s\ncdn10000Height:%s\nxzCdnSize:%s\nlevelModelSizes:%s\nlevelModelXzSizes:%s\ndomainDest:%s\nheifDomain:%s\nheifBizWL:%s\navifDomain:%s\navifBizWL:%s\ndomainSwitch:%s\nglobalSwitch:%s\naliCdnDomain:%s\nexactExcludePath:%s\nfuzzyExcludePath:%s\nconvertExcludePath:%s\nmodules:%s\nlevelRatio:%s\nossCdnDomains:%s\nossFuzzyExcludes:%s\nstrictCDNDomainWL:%s\nstrictExactDomainBL:%s\nstrictDomainConvertBL:%s", IMAGE_CONFIG, c, c2, c3, c4, c5, c6, c7, c17, c18, c19, c20, c15, c16, c8, c10, c11, c13, c21, c14, c9, c12, c24, c25, c26);
    }
}
