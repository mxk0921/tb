package com.taobao.tao.util;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyExtra;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import tb.ohh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ImageStrategyDecider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String convergeAndHeif(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("648bc91d", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String[] h5HeifWhiteList = TaobaoImageUrlStrategy.getInstance().getH5HeifWhiteList();
        String[] h5HeifSourceWhiteList = TaobaoImageUrlStrategy.getInstance().getH5HeifSourceWhiteList();
        if (h5HeifWhiteList != null) {
            for (String str2 : h5HeifWhiteList) {
                if (str.contains(str2) && str.contains("O1CN")) {
                    return decideUrl(str, -1, -1, ImageStrategyConfig.u("default").n(true).a(), false);
                }
            }
        }
        if (h5HeifSourceWhiteList != null && h5HeifSourceWhiteList.length > 0) {
            for (String str3 : h5HeifSourceWhiteList) {
                if ((str.contains(str3) || TextUtils.equals("*", str3)) && str.contains("O1CN")) {
                    return doStrictConvergeAndHeif(str);
                }
            }
        }
        return justConvergeAndWebP(str);
    }

    public static String decideUrl(String str, Integer num, Integer num2, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13c8906c", new Object[]{str, num, num2, obj}) : decideUrl(str, num, num2, obj, true);
    }

    private static String doStrictConvergeAndHeif(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5a08971", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        TaobaoImageUrlStrategy.UriCDNInfo uriCDNInfo = new TaobaoImageUrlStrategy.UriCDNInfo(str);
        if (OssImageUrlStrategy.getInstance().isOssDomain(uriCDNInfo.host)) {
            return doStrictConvergeAndWebP(str);
        }
        if (!TaobaoImageUrlStrategy.getInstance().isStrictCdnImage(uriCDNInfo)) {
            return str;
        }
        String heifImageDomain = TaobaoImageUrlStrategy.getInstance().getHeifImageDomain();
        if (TaobaoImageUrlStrategy.getInstance().isDomainSwitch() && !TextUtils.isEmpty(heifImageDomain)) {
            str = TaobaoImageUrlStrategy.getInstance().strictConvergenceUrl(uriCDNInfo, heifImageDomain, false);
        }
        ImageStrategyExtra.ImageUrlInfo baseUrlInfo = ImageStrategyExtra.getBaseUrlInfo(str);
        String str2 = baseUrlInfo.base;
        if (TextUtils.isEmpty(str2) || str2.endsWith("_.heic")) {
            return str;
        }
        if (str2.endsWith("_.webp")) {
            return str2.replace("_.webp", "_.heic");
        }
        return str2 + "_.heic" + baseUrlInfo.suffix;
    }

    private static String doStrictConvergeAndWebP(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df82268f", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        TaobaoImageUrlStrategy.UriCDNInfo uriCDNInfo = new TaobaoImageUrlStrategy.UriCDNInfo(str);
        if (OssImageUrlStrategy.getInstance().isOssDomain(uriCDNInfo.host)) {
            if (OssImageUrlStrategy.getInstance().isFuzzyExclude(str)) {
                return str;
            }
            ImageStrategyExtra.ImageUrlInfo baseUrlInfo = ImageStrategyExtra.getBaseUrlInfo(str);
            String str2 = baseUrlInfo.base;
            if (TextUtils.isEmpty(str2) || str2.indexOf(64) <= 0) {
                return str;
            }
            if (!".jpg".equals(baseUrlInfo.ext) && !".png".equals(baseUrlInfo.ext)) {
                return str;
            }
            return str2.substring(0, str2.length() - 4) + ".webp" + baseUrlInfo.suffix;
        } else if (!TaobaoImageUrlStrategy.getInstance().isStrictCdnImage(uriCDNInfo)) {
            return str;
        } else {
            if (TaobaoImageUrlStrategy.getInstance().isDomainSwitch()) {
                str = TaobaoImageUrlStrategy.getInstance().strictConvergenceUrl(uriCDNInfo, false);
            }
            ImageStrategyExtra.ImageUrlInfo baseUrlInfo2 = ImageStrategyExtra.getBaseUrlInfo(str);
            String str3 = baseUrlInfo2.base;
            if (TextUtils.isEmpty(str3) || str3.endsWith("_.webp")) {
                return str;
            }
            return str3 + "_.webp" + baseUrlInfo2.suffix;
        }
    }

    public static String justConvergeAndWebP(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76f1e47", new Object[]{str});
        }
        String doStrictConvergeAndWebP = doStrictConvergeAndWebP(str);
        ohh.a(ohh.COMMON_TAG, "ImageStrategyDecider justConvergeAndWebP, raw=%s, ret=%s", str, doStrictConvergeAndWebP);
        return doStrictConvergeAndWebP;
    }

    public static String simpleDecideUrl(String str, Integer num, Integer num2, Object obj) {
        ImageStrategyConfig imageStrategyConfig;
        int i;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c393fc3e", new Object[]{str, num, num2, obj});
        }
        if (obj instanceof ImageStrategyConfig) {
            imageStrategyConfig = (ImageStrategyConfig) obj;
            z = false;
        } else {
            imageStrategyConfig = ImageStrategyConfig.u("default").a();
        }
        if (imageStrategyConfig.k() == ImageStrategyConfig.SizeLimitType.WIDTH_LIMIT) {
            i = num.intValue();
        } else if (imageStrategyConfig.k() == ImageStrategyConfig.SizeLimitType.HEIGHT_LIMIT) {
            i = num2.intValue();
        } else if (z || imageStrategyConfig.z() || !imageStrategyConfig.A() || num.intValue() >= num2.intValue() || num.intValue() < 375 || !TaobaoImageUrlStrategy.getInstance().supportHeightScale(imageStrategyConfig)) {
            i = Math.max(num.intValue(), num2.intValue());
        } else {
            i = num.intValue();
        }
        if (i > 0) {
            i = (int) (i / TaobaoImageUrlStrategy.getInstance().getDip());
        }
        return TaobaoImageUrlStrategy.getInstance().simpleDecideUrl(str, i, imageStrategyConfig);
    }

    public static String decideUrl(String str, Integer num, Integer num2, Object obj, boolean z) {
        ImageStrategyConfig imageStrategyConfig;
        int i;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("887a200", new Object[]{str, num, num2, obj, new Boolean(z)});
        }
        if (obj instanceof ImageStrategyConfig) {
            imageStrategyConfig = (ImageStrategyConfig) obj;
            z2 = false;
        } else {
            imageStrategyConfig = ImageStrategyConfig.u("default").a();
        }
        if (imageStrategyConfig.k() == ImageStrategyConfig.SizeLimitType.WIDTH_LIMIT) {
            i = num.intValue();
        } else if (imageStrategyConfig.k() == ImageStrategyConfig.SizeLimitType.HEIGHT_LIMIT) {
            i = num2.intValue();
        } else if (z2 || imageStrategyConfig.z() || !imageStrategyConfig.A() || num.intValue() >= num2.intValue() || num.intValue() < 375 || !TaobaoImageUrlStrategy.getInstance().supportHeightScale(imageStrategyConfig)) {
            i = Math.max(num.intValue(), num2.intValue());
        } else {
            i = num.intValue();
        }
        if (i > 0) {
            i = (int) (i / TaobaoImageUrlStrategy.getInstance().getDip());
        }
        return TaobaoImageUrlStrategy.getInstance().decideUrl(str, i, imageStrategyConfig);
    }
}
