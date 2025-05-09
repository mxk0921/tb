package com.taobao.tao.util;

import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyExtra;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.ohh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class OssImageUrlStrategy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final char FIRST_LEVEL_CONCAT = '@';
    private static final String GIF_EXTEND = ".gif";
    private static final String JPEG_EXTEND = ".jpg";
    private static final String SECOND_LEVEL_CONCAT = "_";
    private static final String SHARPEN_IMAGE = "1sh";
    private static final String SMALL_THAN_ORIGIN = "1l";
    private static final String WEBP_EXTEND = ".webp";
    private static final String WHITE_FILL = "1wh";
    private static OssImageUrlStrategy sInstance;
    private Pattern mCdnRuleRegex;
    private static final String[] DEFAULT_OSS_DOMAINS = {"ossgw.alicdn.com"};
    private static final String[] DEFAULT_FUZZY_EXCLUDES = {"getAvatar", "@watermark"};
    private String[] mOssDomains = DEFAULT_OSS_DOMAINS;
    private String[] mFuzzyExcludePath = DEFAULT_FUZZY_EXCLUDES;
    private final ReentrantReadWriteLock mRWLock = new ReentrantReadWriteLock();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.util.OssImageUrlStrategy$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$tao$image$ImageStrategyConfig$SizeLimitType;

        static {
            int[] iArr = new int[ImageStrategyConfig.SizeLimitType.values().length];
            $SwitchMap$com$taobao$tao$image$ImageStrategyConfig$SizeLimitType = iArr;
            try {
                iArr[ImageStrategyConfig.SizeLimitType.WIDTH_LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$tao$image$ImageStrategyConfig$SizeLimitType[ImageStrategyConfig.SizeLimitType.HEIGHT_LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$tao$image$ImageStrategyConfig$SizeLimitType[ImageStrategyConfig.SizeLimitType.ALL_LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static boolean decideCut(ImageStrategyExtra.ImageUrlInfo imageUrlInfo, ImageStrategyConfig imageStrategyConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c66eaf00", new Object[]{imageUrlInfo, imageStrategyConfig})).booleanValue();
        }
        if (imageStrategyConfig.c() == null || imageStrategyConfig.c() == TaobaoImageUrlStrategy.CutType.non) {
            return false;
        }
        imageUrlInfo.cj = imageStrategyConfig.c().getOssCut();
        return true;
    }

    private void decideExtend(ImageStrategyExtra.ImageUrlInfo imageUrlInfo, ImageStrategyConfig imageStrategyConfig) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da43c314", new Object[]{this, imageUrlInfo, imageStrategyConfig});
        } else if (!GIF_EXTEND.equals(imageUrlInfo.ext)) {
            if (!ImageStrategyConfig.q || Build.VERSION.SDK_INT != 28) {
                z = false;
            }
            if (imageStrategyConfig.q() || (!isConfigDisabled(imageStrategyConfig.p()) && TaobaoImageUrlStrategy.getInstance().isSupportWebP() && !imageUrlInfo.suffix.contains("imgwebptag=0"))) {
                if (!z) {
                    imageUrlInfo.ext = WEBP_EXTEND;
                }
            } else if (WEBP_EXTEND.equals(imageUrlInfo.ext)) {
                imageUrlInfo.ext = null;
            }
        }
    }

    private boolean decideQuality(ImageStrategyExtra.ImageUrlInfo imageUrlInfo, ImageStrategyConfig imageStrategyConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f628b323", new Object[]{this, imageUrlInfo, imageStrategyConfig})).booleanValue();
        }
        if (isConfigDisabled(imageStrategyConfig.n()) || imageStrategyConfig.e() == TaobaoImageUrlStrategy.ImageQuality.non) {
            return false;
        }
        if (imageStrategyConfig.e() != null) {
            imageUrlInfo.quality = imageStrategyConfig.e().getOssQuality();
        } else if (TaobaoImageUrlStrategy.getInstance().isNetworkSlow()) {
            imageUrlInfo.quality = TaobaoImageUrlStrategy.ImageQuality.q75.getOssQuality();
        } else {
            imageUrlInfo.quality = TaobaoImageUrlStrategy.ImageQuality.q90.getOssQuality();
        }
        return true;
    }

    private boolean decideSharpen(ImageStrategyExtra.ImageUrlInfo imageUrlInfo, ImageStrategyConfig imageStrategyConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c62d18f", new Object[]{this, imageUrlInfo, imageStrategyConfig})).booleanValue();
        }
        if (isConfigDisabled(imageStrategyConfig.o()) || !TaobaoImageUrlStrategy.getInstance().isNetworkSlow()) {
            return false;
        }
        imageUrlInfo.sharpen = SHARPEN_IMAGE;
        return true;
    }

    private void decideWH(ImageStrategyExtra.ImageUrlInfo imageUrlInfo, ImageStrategyConfig imageStrategyConfig, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c186e86", new Object[]{this, imageUrlInfo, imageStrategyConfig, new Integer(i)});
            return;
        }
        TaobaoImageUrlStrategy instance = TaobaoImageUrlStrategy.getInstance();
        if (instance.isNetworkSlow()) {
            i2 = (int) (i * instance.getDip() * 0.7d);
        } else {
            i2 = (int) (i * instance.getDip());
        }
        if (imageStrategyConfig.f() > 0 && imageStrategyConfig.d() > 0) {
            imageUrlInfo.width = imageStrategyConfig.f();
            imageUrlInfo.height = imageStrategyConfig.d();
        } else if ((imageStrategyConfig.k() != ImageStrategyConfig.SizeLimitType.ALL_LIMIT || imageUrlInfo.width <= 0 || imageUrlInfo.height <= 0) && i2 >= 0) {
            int taobaoCDNPatten = instance.taobaoCDNPatten(i2, true, !isConfigDisabled(imageStrategyConfig.l()));
            int i3 = AnonymousClass1.$SwitchMap$com$taobao$tao$image$ImageStrategyConfig$SizeLimitType[imageStrategyConfig.k().ordinal()];
            if (i3 == 1) {
                imageUrlInfo.width = taobaoCDNPatten;
                imageUrlInfo.height = 0;
            } else if (i3 == 2) {
                imageUrlInfo.width = 0;
                imageUrlInfo.height = taobaoCDNPatten;
            } else if (i3 == 3) {
                imageUrlInfo.height = taobaoCDNPatten;
                imageUrlInfo.width = taobaoCDNPatten;
            }
        }
    }

    public static synchronized OssImageUrlStrategy getInstance() {
        synchronized (OssImageUrlStrategy.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OssImageUrlStrategy) ipChange.ipc$dispatch("b3f47ba", new Object[0]);
            }
            if (sInstance == null) {
                sInstance = new OssImageUrlStrategy();
            }
            return sInstance;
        }
    }

    private boolean isConfigDisabled(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db7472c2", new Object[]{this, bool})).booleanValue();
        }
        if (bool == null || bool.booleanValue()) {
            return false;
        }
        return true;
    }

    private ImageStrategyExtra.ImageUrlInfo parseOssRule(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyExtra.ImageUrlInfo) ipChange.ipc$dispatch("b6688fa3", new Object[]{this, str});
        }
        ImageStrategyExtra.ImageUrlInfo baseUrlInfo = ImageStrategyExtra.getBaseUrlInfo(str);
        String str2 = baseUrlInfo.base;
        int lastIndexOf = str2.lastIndexOf(64);
        if (lastIndexOf < 0) {
            return baseUrlInfo;
        }
        if (this.mCdnRuleRegex == null) {
            this.mCdnRuleRegex = Pattern.compile("@(?:(?:_?(\\d+)w[_\\.])|(?:_?(\\d+)w$)|(?:_?(\\d+)h)|(?:_?(\\d+[Qq]))|(?:_?[^_.]+))+");
        }
        Matcher matcher = this.mCdnRuleRegex.matcher(str2);
        baseUrlInfo.base = str2.substring(0, lastIndexOf);
        if (!matcher.find(lastIndexOf)) {
            return baseUrlInfo;
        }
        if (matcher.groupCount() < 4) {
            return baseUrlInfo;
        }
        try {
            String group = matcher.group(1);
            if (group == null) {
                group = matcher.group(2);
            }
            String group2 = matcher.group(3);
            String group3 = matcher.group(4);
            if (!TextUtils.isEmpty(group)) {
                baseUrlInfo.width = Integer.parseInt(group);
            }
            if (!TextUtils.isEmpty(group2)) {
                baseUrlInfo.height = Integer.parseInt(group2);
            }
            if (!TextUtils.isEmpty(group3)) {
                baseUrlInfo.quality = group3;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            ohh.b(ohh.COMMON_TAG, "ImageStrategyExtra parseImageUrl convert number error:%s", e.getMessage());
        }
        return baseUrlInfo;
    }

    public boolean isFuzzyExclude(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38c815cf", new Object[]{this, str})).booleanValue();
        }
        this.mRWLock.readLock().lock();
        try {
            String[] strArr = this.mFuzzyExcludePath;
            if (strArr != null) {
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    if (str.indexOf(this.mFuzzyExcludePath[i]) >= 0) {
                        return true;
                    }
                }
            }
            return false;
        } finally {
            this.mRWLock.readLock().unlock();
        }
    }

    public boolean isOptOssDomain(String str) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98f3fc9f", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (strArr = this.mOssDomains) != null) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setupConfigs(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d3c281b", new Object[]{this, strArr, strArr2});
            return;
        }
        this.mRWLock.writeLock().lock();
        if (strArr != null) {
            try {
                if (strArr.length > 0) {
                    this.mOssDomains = strArr;
                }
            } catch (Throwable th) {
                this.mRWLock.writeLock().unlock();
                throw th;
            }
        }
        if (strArr2 != null && strArr2.length > 0) {
            this.mFuzzyExcludePath = strArr2;
        }
        this.mRWLock.writeLock().unlock();
    }

    public boolean isOssDomain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1c3d07e", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.equals(str, "ossgw.alicdn.com")) {
            return true;
        }
        this.mRWLock.readLock().lock();
        try {
            String[] strArr = this.mOssDomains;
            if (strArr != null) {
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    if (str.indexOf(this.mOssDomains[i]) >= 0) {
                        return true;
                    }
                }
            }
            return false;
        } finally {
            this.mRWLock.readLock().unlock();
        }
    }

    public String decideUrl(String str, int i, ImageStrategyConfig imageStrategyConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a8c6262", new Object[]{this, str, new Integer(i), imageStrategyConfig});
        }
        if (isFuzzyExclude(str)) {
            ohh.a(ohh.COMMON_TAG, "[OSS] fuzzy exclude, url=%s", str);
            return str;
        }
        ImageStrategyExtra.ImageUrlInfo parseOssRule = parseOssRule(str);
        StringBuilder sb = new StringBuilder(parseOssRule.base.length() + 26);
        sb.append(parseOssRule.base);
        sb.append('@');
        decideWH(parseOssRule, imageStrategyConfig, i);
        String str2 = "_";
        String str3 = "";
        if (parseOssRule.width > 0) {
            sb.append(str3);
            sb.append(parseOssRule.width);
            sb.append("w");
            str3 = str2;
        }
        if (parseOssRule.height > 0) {
            sb.append(str3);
            sb.append(parseOssRule.height);
            sb.append("h");
            str3 = str2;
        }
        decideQuality(parseOssRule, imageStrategyConfig);
        if (!TextUtils.isEmpty(parseOssRule.quality)) {
            sb.append(str3);
            sb.append(parseOssRule.quality);
            str3 = str2;
        }
        if (decideSharpen(parseOssRule, imageStrategyConfig)) {
            sb.append(str3);
            sb.append(parseOssRule.sharpen);
            str3 = str2;
        }
        if (decideCut(parseOssRule, imageStrategyConfig)) {
            sb.append(str3);
            sb.append(parseOssRule.cj);
        } else {
            str2 = str3;
        }
        sb.append(str2);
        sb.append(SMALL_THAN_ORIGIN);
        decideExtend(parseOssRule, imageStrategyConfig);
        if (TextUtils.isEmpty(parseOssRule.ext)) {
            sb.append("_1wh.jpg");
        } else {
            sb.append(parseOssRule.ext);
        }
        sb.append(parseOssRule.suffix);
        String substring = sb.substring(0);
        ohh.a(ohh.COMMON_TAG, "[OSS] origin url=%s\ndecide url=%s", str, substring);
        return substring;
    }
}
