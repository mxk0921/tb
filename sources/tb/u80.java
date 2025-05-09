package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class u80 implements gdd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final u80 INSTANCE = new u80();

    /* renamed from: a  reason: collision with root package name */
    public static final String f29215a = "{\n  \"appInfo\": {\n    \"name\": \"会场框架预设\",\n    \"appId\": \"1011398\",\n    \"version\": \"1.0.2\"\n  },\n  \"container\": {\n    \"pages\": [\n      {\n        \"renderer\": \"web\",\n        \"external\": true,\n        \"id\": \"entry\",\n        \"url\": \"https://pages-fast.m.taobao.com\"\n      },\n      {\n        \"renderer\": \"web\",\n        \"external\": true,\n        \"pageType\": \"swiper\",\n        \"children\": [\n          \"entry\"\n        ],\n        \"id\": \"main\",\n        \"groupConfig\": {\n          \"swiperEnable\": false\n        }\n      }\n    ],\n    \"solution\": {\n      \"type\": \"tabs\"\n    },\n    \"tabBar\": {\n      \"mode\": \"act\",\n      \"invisible\": true,\n      \"items\": [\n        {\n          \"iconNormal\": \"https://img.alicdn.com/imgextra/i3/O1CN01M61D7f1rnf2UNw06a_!!6000000005676-2-tps-100-124.png\",\n          \"iconSelected\": \"https://img.alicdn.com/imgextra/i2/O1CN01EpZJhF1Ejkdv1bgrY_!!6000000000388-2-tps-100-124.png\",\n          \"pageId\": \"main\"\n        }\n      ]\n    },\n    \"window\": {\n      \"navBarHide\": true\n    }\n  },\n  \"variables\": [\n    {\n      \"path\": \"$.container.pages[0].url\",\n      \"value\": \"${navigationUrl}\"\n    },\n    {\n      \"path\": \"$.appInfo.appId\",\n      \"value\": \"${appId}\"\n    }\n  ]\n}";

    @Override // tb.gdd
    public AppManifest a(cvm cvmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppManifest) ipChange.ipc$dispatch("af33e449", new Object[]{this, cvmVar});
        }
        ckf.g(cvmVar, "baseInfo");
        if (ckf.b(cvmVar.a(), "act")) {
            return (AppManifest) JSON.parseObject(f29215a, AppManifest.class);
        }
        return null;
    }

    static {
        t2o.a(839909828);
        t2o.a(839909829);
    }
}
