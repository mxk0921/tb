package anetwork.channel.unified;

import com.alibaba.security.ccrc.service.build.W;
import com.alipay.mobile.verifyidentity.utils.DynamicBundleHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.map.IAddressMap;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.appbundle.a;
import tb.t2o;
import tb.u58;
import tb.yq0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DownloadResourcePriorityConf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BANDWIDTH_PRIORITY_COPPER = 2;
    public static final int BANDWIDTH_PRIORITY_GOLD = 0;
    public static final int BANDWIDTH_PRIORITY_NONE = -1;
    public static final int BANDWIDTH_PRIORITY_SLIVER = 1;
    private static DynamicResource[] GOLD_RESOURCE;
    private static DynamicResource[] GOLD_RESOURCE_PLAN_B;
    private static DynamicResource[] SLIVER_RESOURCES;
    private static DynamicResource[] SLIVER_RESOURCES_PLAN_B;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class DynamicResource {
        public int bandWidthPriority;
        public String featureName;
        public String fileName;
        public boolean isDownloadRequired = true;
        public boolean isDownloadCompleted = false;

        static {
            t2o.a(607126119);
        }

        public DynamicResource(String str, String str2, int i) {
            this.fileName = str;
            this.featureName = str2;
            this.bandWidthPriority = i;
        }
    }

    public static DynamicResource getVIPDynamicResourceInfo(String str, boolean z) {
        DynamicResource[] dynamicResourceArr;
        DynamicResource[] dynamicResourceArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynamicResource) ipChange.ipc$dispatch("1cce08ae", new Object[]{str, new Boolean(z)});
        }
        if (str == null) {
            return null;
        }
        if (z) {
            dynamicResourceArr = GOLD_RESOURCE_PLAN_B;
        } else {
            dynamicResourceArr = GOLD_RESOURCE;
        }
        for (DynamicResource dynamicResource : dynamicResourceArr) {
            if (str.contains(dynamicResource.fileName)) {
                return dynamicResource;
            }
        }
        if (z) {
            dynamicResourceArr2 = SLIVER_RESOURCES_PLAN_B;
        } else {
            dynamicResourceArr2 = SLIVER_RESOURCES;
        }
        for (DynamicResource dynamicResource2 : dynamicResourceArr2) {
            if (str.contains(dynamicResource2.fileName)) {
                return dynamicResource2;
            }
        }
        return null;
    }

    public static boolean isDownloadCompleted(int i, boolean z) {
        DynamicResource[] dynamicResourceArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3af55ad5", new Object[]{new Integer(i), new Boolean(z)})).booleanValue();
        }
        if (i == 0) {
            if (z) {
                dynamicResourceArr = GOLD_RESOURCE_PLAN_B;
            } else {
                dynamicResourceArr = GOLD_RESOURCE;
            }
        } else if (i != 1) {
            dynamicResourceArr = null;
        } else if (z) {
            dynamicResourceArr = SLIVER_RESOURCES_PLAN_B;
        } else {
            dynamicResourceArr = SLIVER_RESOURCES;
        }
        if (dynamicResourceArr != null) {
            for (DynamicResource dynamicResource : dynamicResourceArr) {
                if (!dynamicResource.isDownloadCompleted) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int getResourceScene(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea0335ec", new Object[]{str})).intValue();
        }
        if (str.contains("taobao_wangxin.so") || str.contains("messagesdkwrapper.so")) {
            return 1;
        }
        if (str.contains("triver_taobao.so") || str.contains("libkernelu4_7z_uc.so")) {
            return 2;
        }
        return (str.contains("taopai_business.so") || str.contains("libpixelai.so") || str.contains("libtaopai-jni.so")) ? 3 : 0;
    }

    static {
        t2o.a(607126118);
        SLIVER_RESOURCES = null;
        GOLD_RESOURCE_PLAN_B = null;
        SLIVER_RESOURCES_PLAN_B = null;
        DynamicResource[] dynamicResourceArr = new DynamicResource[21];
        GOLD_RESOURCE = dynamicResourceArr;
        dynamicResourceArr[0] = new DynamicResource(a.TAOPAI_FEATURE, a.TAOPAI_FEATURE, 0);
        GOLD_RESOURCE[1] = new DynamicResource("zstd", "zstd", 0);
        GOLD_RESOURCE[2] = new DynamicResource("themis_gfx", "themis_gfx", 0);
        GOLD_RESOURCE[3] = new DynamicResource("ratefeature", "rate", 0);
        GOLD_RESOURCE[4] = new DynamicResource(yq0.PRELOAD_LITE_DETAIL_FEATURE_NAME, "imagecontent", 0);
        GOLD_RESOURCE[5] = new DynamicResource(u58.DYNAMIC_NAME_TAOBAO_ANDROID_AMAP_DYNAMIC, IAddressMap.MAP_TYPE_AMAP, 0);
        GOLD_RESOURCE[6] = new DynamicResource("artc_engine", "artc_engine", 0);
        GOLD_RESOURCE[7] = new DynamicResource("ALBiometricsJni", "ALBiometricsJni", 0);
        GOLD_RESOURCE[8] = new DynamicResource(a.TAOPAI_SDK_FEATURE, a.TAOPAI_SDK_FEATURE, 0);
        GOLD_RESOURCE[9] = new DynamicResource("PailitaoCUtil", "PailitaoCUtil", 0);
        GOLD_RESOURCE[10] = new DynamicResource("taobao_favorite_aar", "taobao_favorite_aar", 0);
        GOLD_RESOURCE[11] = new DynamicResource(W.b, W.b, 0);
        GOLD_RESOURCE[12] = new DynamicResource("ipatch", "ipatch", 0);
        GOLD_RESOURCE[13] = new DynamicResource("taobao_weex_adapter", "taobao_weex_adapter", 0);
        GOLD_RESOURCE[14] = new DynamicResource("rxandroid", "rxandroid", 0);
        GOLD_RESOURCE[15] = new DynamicResource("litecreator", "litecreator", 0);
        GOLD_RESOURCE[16] = new DynamicResource("ugc_core", "ugc_core", 0);
        GOLD_RESOURCE[17] = new DynamicResource("ugc_component_rate", "ugc_component_rate", 0);
        GOLD_RESOURCE[18] = new DynamicResource("order_remote", "order_remote", 0);
        GOLD_RESOURCE[19] = new DynamicResource("ratefeaure", "ratefeaure", 0);
        GOLD_RESOURCE[20] = new DynamicResource(DynamicBundleHelper.BUNDLE_KEY_ZFACE, DynamicBundleHelper.BUNDLE_KEY_ZFACE, 0);
        DynamicResource[] dynamicResourceArr2 = new DynamicResource[12];
        SLIVER_RESOURCES = dynamicResourceArr2;
        dynamicResourceArr2[0] = new DynamicResource("compressed_libwalle_base", "walle_base", 1);
        SLIVER_RESOURCES[1] = new DynamicResource("triver_taobao", "triver_taobao", 1);
        SLIVER_RESOURCES[2] = new DynamicResource("TBSubscribe", "TBSubscribe", 1);
        SLIVER_RESOURCES[3] = new DynamicResource(FlexaLiveX.BTYPE, FlexaLiveX.BTYPE, 1);
        SLIVER_RESOURCES[4] = new DynamicResource("taobao_wangxin", "taobao_wangxin", 1);
        SLIVER_RESOURCES[5] = new DynamicResource("messagesdkwrapper", "messagesdkwrapper", 1);
        SLIVER_RESOURCES[6] = new DynamicResource("bhx_cxx", "bhx_cxx", 1);
        SLIVER_RESOURCES[7] = new DynamicResource("MNN", "MNN", 1);
        SLIVER_RESOURCES[8] = new DynamicResource("AliNNPython", "AliNNPython", 1);
        SLIVER_RESOURCES[9] = new DynamicResource("fcanvas_v8_jsi", "fcanvas_v8_jsi", 1);
        SLIVER_RESOURCES[10] = new DynamicResource("dwebp", "dwebp", 1);
        SLIVER_RESOURCES[11] = new DynamicResource("pexwebp", "pexwebp", 1);
        DynamicResource[] dynamicResourceArr3 = new DynamicResource[4];
        GOLD_RESOURCE_PLAN_B = dynamicResourceArr3;
        dynamicResourceArr3[0] = new DynamicResource("ratefeature", "rate", 0);
        GOLD_RESOURCE_PLAN_B[1] = new DynamicResource(yq0.PRELOAD_LITE_DETAIL_FEATURE_NAME, "imagecontent", 0);
        GOLD_RESOURCE_PLAN_B[2] = new DynamicResource("ipatch", "ipatch", 0);
        GOLD_RESOURCE_PLAN_B[3] = new DynamicResource(u58.DYNAMIC_NAME_TAOBAO_ANDROID_AMAP_DYNAMIC, IAddressMap.MAP_TYPE_AMAP, 0);
        DynamicResource[] dynamicResourceArr4 = new DynamicResource[3];
        SLIVER_RESOURCES_PLAN_B = dynamicResourceArr4;
        dynamicResourceArr4[0] = new DynamicResource("TBSubscribe", "TBSubscribe", 1);
        SLIVER_RESOURCES_PLAN_B[1] = new DynamicResource(FlexaLiveX.BTYPE, FlexaLiveX.BTYPE, 1);
        SLIVER_RESOURCES_PLAN_B[2] = new DynamicResource("litecreator", "litecreator", 1);
    }
}
