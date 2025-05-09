package com.taobao.tao.util;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import anet.channel.util.HttpConstant;
import com.alibaba.security.realidentity.x2;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.android.fluid.framework.adapter.image.ImageAdapter;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyExtra;
import java.util.HashMap;
import tb.itw;
import tb.ohh;
import tb.pg1;
import tb.ra;
import tb.rle;
import tb.vu3;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TaobaoImageUrlStrategy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String AVIF_DOMAIN_DEST = "avif.picasso.taobao.com";
    private static final String[] DEFAULT_CDN_DOMAIN_WHITE_LIST;
    private static final float DEFAULT_LEVEL_RATIO = 0.1f;
    private static final String HEIF_DOMAIN_DEST = "heic.alicdn.com";
    private static final String SHORT_SCALE = "O1CN";
    private static final String SPECIAL_DOMAIN_DEST = "picasso.alicdn.com";
    private int[] mAvifBizWhiteList;
    private int[] mHeifBizWhiteList;
    private boolean mIsNetworkSlow;
    private long mLastUpdateTime;
    private HashMap<String, ServiceImageSwitch> mServiceImageSwitchList;
    private static final int[] CDN = {16, 20, 24, 30, 32, 36, 40, 48, 50, 60, 64, 70, 72, 80, 88, 90, 100, 110, 120, 125, 128, 130, ra.INSTALL_PROVIDER, 160, 170, 180, 190, 200, 210, 220, 230, 234, 240, 250, 270, Result.ALIPAY_GENERATE_UNREG_NODE_FAILED, 300, 310, 315, 320, 336, 350, 360, 400, 430, 460, 468, 480, 490, x2.o, 560, 570, 580, 600, 640, 670, 720, 728, 760, 960, 970};
    private static final int[] CDN10000Width = {110, 150, 170, 220, 240, Result.ALIPAY_GENERATE_UNREG_NODE_FAILED, 450, 570, 580, 620, 790};
    private static final int[] CDN10000Height = {170, 220, 340, 500};
    private static final int[] XZCDN = {72, 88, 90, 100, 110, 120, ra.INSTALL_PROVIDER, 160, 170, 180, 200, 230, 240, 270, Result.ALIPAY_GENERATE_UNREG_NODE_FAILED, 310, 320, 360, 430, 460, 580, 640};
    private static final int[] LEVEL_MODEL_CDN = {90, 110, 200, 320, 460, 600, 760, 960, 1200};
    private static final int[] LEVEL_MODEL_XZCDN = {90, 110, 200, 320, 460, 640};
    private static final String[] FUZZY_EXCLUDE_PATH = {"getAvatar"};
    private static final String[] LOOSE_CDN_DOMAIN_WHITE_LIST = {".alicdn.com", ".tbcdn.cn", ".taobaocdn.com", ".wimg.taobao.com", "img.taobao.com", "i.mmcdn.cn"};
    private static final String[] LOOSE_CDN_DOMAIN_BLACK_LIST = {"a.tbcdn.cn", "b.tbcdn.cn", "gqrcode.alicdn.com", "g.tbcdn.cn", "m.alicdn.com", "assets.alicdn.com", "g.alicdn.com", "ag.alicdn.com", "a.dd.alicdn.com", "uaction.alicdn.com", "wwc.alicdn.com", "osdes.alicdn.com", "download.taobaocdn.com", "gtb-fun.alicdn.com", "qianniu.alicdn.com", "gamc.alicdn.com", "glife-img.alicdn.com", "ossgw.alicdn.com", "gjusp.alicdn.com", "alchemy-img.alicdn.com", "alpha.alicdn.com", "h5.m.taobao.com", "nonpublic.alicdn.com"};
    private static final String[] LOOSE_CONVERGENCE_BLACK_LIST = {"i.mmcdn.cn", "cbu01.alicdn.com", "ilce.alicdn.com"};
    private static final String DOMAIN_DEST = "gw.alicdn.com";
    private static final String[] STRICT_CDN_DOMAIN_WHITE_LIST = {".tbcdn.cn", ".taobaocdn.com", ".wimg.taobao.com", "img.taobao.com", "i.mmcdn.cn", DOMAIN_DEST, "img.alicdn.com", "gtms03.alicdn.com", "ilce.alicdn.com"};
    private static final String[] STRICT_CDN_DOMAIN_BLACK_LIST = {"a.tbcdn.cn", "b.tbcdn.cn", "g.tbcdn.cn", "download.taobaocdn.com"};
    private static final String[] STRICT_CONVERGENCE_BLACK_LIST = {"i.mmcdn.cn", "ilce.alicdn.com"};
    private static final String[] H5_HEIF_WHITE_LIST = {"-yinhe"};
    private static final String[] H5_HEIF_SOURCE_WHITE_LIST = new String[0];
    private static HashMap<String, Boolean> sStringBooleanHashMap = new HashMap<>();
    private int[] mCdn10000Width = CDN10000Width;
    private int[] mCdn10000Height = CDN10000Height;
    private int[] mCdnSizes = CDN;
    private int[] mXzCdnSizes = XZCDN;
    private int[] mLevelModelCdnSizes = LEVEL_MODEL_CDN;
    private int[] mLevelModelXzCdnSizes = LEVEL_MODEL_XZCDN;
    private String[] mLooseCDNDomainWhiteList = LOOSE_CDN_DOMAIN_WHITE_LIST;
    private String[] mLooseCDNDomainBlackList = LOOSE_CDN_DOMAIN_BLACK_LIST;
    private String[] mLooseConvergenceBlackList = LOOSE_CONVERGENCE_BLACK_LIST;
    private String[] mFuzzyExcludePath = FUZZY_EXCLUDE_PATH;
    private String mDoMainDest = DOMAIN_DEST;
    private String mHeifImageDomain = HEIF_DOMAIN_DEST;
    private String mAvifImageDomain = AVIF_DOMAIN_DEST;
    private String mSpecialDomain = SPECIAL_DOMAIN_DEST;
    private String[] mStrictCDNDomainWhiteList = STRICT_CDN_DOMAIN_WHITE_LIST;
    private String[] mStrictCDNDomainBlackList = STRICT_CDN_DOMAIN_BLACK_LIST;
    private String[] mStrictConvergenceBlackList = STRICT_CONVERGENCE_BLACK_LIST;
    private String[] mH5HeifWhiteList = H5_HEIF_WHITE_LIST;
    private String[] mH5HeifSourceWhiteList = H5_HEIF_SOURCE_WHITE_LIST;
    private String[] mDefaultCDNDomainWhiteList = DEFAULT_CDN_DOMAIN_WHITE_LIST;
    private boolean mGlobalSwitch = true;
    private boolean mDomainSwitch = true;
    private float mDip = 1.0f;
    private boolean mWebpOn = true;
    private boolean mIsLowQuality = false;
    private float mLevelRatio = 0.1f;
    private int mDeviceLevel = 0;

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum CutType {
        xz("xz", "1c"),
        non("", "");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String ossCut;
        public String tfsCut;

        CutType(String str, String str2) {
            this.tfsCut = str;
            this.ossCut = str2;
        }

        public static /* synthetic */ Object ipc$super(CutType cutType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/util/TaobaoImageUrlStrategy$CutType");
        }

        public static CutType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CutType) ipChange.ipc$dispatch("be430b52", new Object[]{str});
            }
            return (CutType) Enum.valueOf(CutType.class, str);
        }

        public String getCutType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("318dba53", new Object[]{this});
            }
            return this.tfsCut;
        }

        public String getOssCut() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2003d2f0", new Object[]{this});
            }
            return this.ossCut;
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum ImageBlur {
        b10("b10"),
        b20("b20"),
        b30("b30"),
        b40("b40"),
        b50("b50"),
        b100("b100"),
        b150("b150"),
        b200("b200"),
        b250("b250");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String mImageBlur;

        ImageBlur(String str) {
            this.mImageBlur = str;
        }

        public static /* synthetic */ Object ipc$super(ImageBlur imageBlur, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/util/TaobaoImageUrlStrategy$ImageBlur");
        }

        public static ImageBlur valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ImageBlur) ipChange.ipc$dispatch("63fdaf8c", new Object[]{str});
            }
            return (ImageBlur) Enum.valueOf(ImageBlur.class, str);
        }

        public String getImageBlur() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("94c098cd", new Object[]{this});
            }
            return this.mImageBlur;
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum ImageQuality {
        q99("q99", "99q"),
        q90(ImageAdapter.IMAGE_QUALITY_Q90, "90q"),
        q75("q75", "75q"),
        q60("q60", "60q"),
        q50("q50", "50q"),
        q30("q30", "30q"),
        non("", "");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String ossQ;
        public String tfsQ;

        ImageQuality(String str, String str2) {
            this.tfsQ = str;
            this.ossQ = str2;
        }

        public static /* synthetic */ Object ipc$super(ImageQuality imageQuality, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/util/TaobaoImageUrlStrategy$ImageQuality");
        }

        public static ImageQuality valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ImageQuality) ipChange.ipc$dispatch("de9a7d44", new Object[]{str});
            }
            return (ImageQuality) Enum.valueOf(ImageQuality.class, str);
        }

        public String getImageQuality() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8c207d9f", new Object[]{this});
            }
            return this.tfsQ;
        }

        public String getOssQuality() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6792f7d3", new Object[]{this});
            }
            return this.ossQ;
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum ImageSharpen {
        s100("s100"),
        s110("s110"),
        s120("s120"),
        s130("s130"),
        s140("s140"),
        s150("s150"),
        non("");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String mImageSharpen;

        ImageSharpen(String str) {
            this.mImageSharpen = str;
        }

        public static /* synthetic */ Object ipc$super(ImageSharpen imageSharpen, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/util/TaobaoImageUrlStrategy$ImageSharpen");
        }

        public static ImageSharpen valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ImageSharpen) ipChange.ipc$dispatch("ff0356b0", new Object[]{str});
            }
            return (ImageSharpen) Enum.valueOf(ImageSharpen.class, str);
        }

        public String getImageSharpen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("612a690b", new Object[]{this});
            }
            return this.mImageSharpen;
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class ServiceImageSwitch {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String areaName;
        private String highNetSharpen;
        private String lowNetSharpen;
        private String suffix;
        private boolean useWebp = true;
        private String lowNetQ = ImageQuality.q75.getImageQuality();
        private String highNetQ = ImageQuality.q90.getImageQuality();
        private double lowNetScale = 1.0d;
        private double highNetScale = 1.0d;
        private double lowDeviceScale = 1.0d;
        private double midDeviceScale = 1.0d;
        private double highDeviceScale = 1.0d;
        private boolean useCdnSizes = false;

        public ServiceImageSwitch() {
            ImageSharpen imageSharpen = ImageSharpen.non;
            this.lowNetSharpen = imageSharpen.getImageSharpen();
            this.highNetSharpen = imageSharpen.getImageSharpen();
        }

        public String getAreaName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("88ab898b", new Object[]{this});
            }
            return this.areaName;
        }

        public double getHighDeviceScale() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("acbe19d1", new Object[]{this})).doubleValue();
            }
            return this.highDeviceScale;
        }

        public String getHighNetQ() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2703c5ed", new Object[]{this});
            }
            return this.highNetQ;
        }

        public double getHighNetScale() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("baa305da", new Object[]{this})).doubleValue();
            }
            return this.highNetScale;
        }

        public String getHighNetSharpen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("de4d8dcb", new Object[]{this});
            }
            return this.highNetSharpen;
        }

        public double getLowDeviceScale() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e5437f0b", new Object[]{this})).doubleValue();
            }
            return this.lowDeviceScale;
        }

        public String getLowNetQ() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("339f6aa7", new Object[]{this});
            }
            return this.lowNetQ;
        }

        public double getLowNetScale() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6a183ae0", new Object[]{this})).doubleValue();
            }
            return this.lowNetScale;
        }

        public String getLowNetSharpen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b7e53f05", new Object[]{this});
            }
            return this.lowNetSharpen;
        }

        public double getMidDeviceScale() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("806b597", new Object[]{this})).doubleValue();
            }
            return this.midDeviceScale;
        }

        public String getSuffix() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("66811712", new Object[]{this});
            }
            return this.suffix;
        }

        public boolean isUseCdnSizes() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8aca070d", new Object[]{this})).booleanValue();
            }
            return this.useCdnSizes;
        }

        public boolean isUseWebp() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ce4e4544", new Object[]{this})).booleanValue();
            }
            return this.useWebp;
        }

        public void setAreaName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17a3024b", new Object[]{this, str});
            } else {
                this.areaName = str;
            }
        }

        public void setHighDeviceScale(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6558b1c7", new Object[]{this, new Double(d)});
                return;
            }
            if (d <= vu3.b.GEO_NOT_SUPPORT) {
                d = this.highDeviceScale;
            }
            this.highDeviceScale = d;
        }

        public void setHighNetQ(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44525229", new Object[]{this, str});
                return;
            }
            if (TextUtils.isEmpty(str)) {
                str = ImageQuality.q90.getImageQuality();
            }
            this.highNetQ = str;
        }

        public void setHighNetScale(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75542446", new Object[]{this, new Double(d)});
                return;
            }
            if (d <= vu3.b.GEO_NOT_SUPPORT) {
                d = this.highNetScale;
            }
            this.highNetScale = d;
        }

        public void setHighNetSharpen(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc304d0b", new Object[]{this, str});
                return;
            }
            if (TextUtils.isEmpty(str)) {
                str = this.highNetSharpen;
            }
            this.highNetSharpen = str;
        }

        public void setLowDeviceScale(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11718435", new Object[]{this, new Double(d)});
                return;
            }
            if (d <= vu3.b.GEO_NOT_SUPPORT) {
                d = this.lowDeviceScale;
            }
            this.lowDeviceScale = d;
        }

        public void setLowNetQ(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47517317", new Object[]{this, str});
                return;
            }
            if (TextUtils.isEmpty(str)) {
                str = ImageQuality.q75.getImageQuality();
            }
            this.lowNetQ = str;
        }

        public void setLowNetScale(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7cec1898", new Object[]{this, new Double(d)});
                return;
            }
            if (d <= vu3.b.GEO_NOT_SUPPORT) {
                d = this.lowNetScale;
            }
            this.lowNetScale = d;
        }

        public void setLowNetSharpen(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("79628379", new Object[]{this, str});
                return;
            }
            if (TextUtils.isEmpty(str)) {
                str = this.lowNetSharpen;
            }
            this.lowNetSharpen = str;
        }

        public void setMidDeviceScale(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47151f29", new Object[]{this, new Double(d)});
                return;
            }
            if (d <= vu3.b.GEO_NOT_SUPPORT) {
                d = this.midDeviceScale;
            }
            this.midDeviceScale = d;
        }

        public void setSuffix(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94bb8a4", new Object[]{this, str});
            } else {
                this.suffix = str;
            }
        }

        public void setUseWebp(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c017b0cc", new Object[]{this, new Boolean(z)});
            } else {
                this.useWebp = z;
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "areaName =" + this.areaName + " useWebp =" + this.useWebp + " lowNetQ =" + this.lowNetQ + " highNetQ =" + this.highNetQ + " lowNetSharpen =" + this.lowNetSharpen + " highNetSharpen =" + this.highNetSharpen + " lowNetScale =" + this.lowNetScale + " highNetScale =" + this.highNetScale + " useCdnSizes=" + this.useCdnSizes;
        }

        public void useCdnSizes(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("248ecfa1", new Object[]{this, new Boolean(z)});
            } else {
                this.useCdnSizes = z;
            }
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class TImageUrlStrategyHolder {
        public static final TaobaoImageUrlStrategy instance = new TaobaoImageUrlStrategy();

        private TImageUrlStrategyHolder() {
        }
    }

    private int binarySearch(int[] iArr, int i, boolean z) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c8610cc2", new Object[]{this, iArr, new Integer(i), new Boolean(z)})).intValue();
        }
        int length = iArr.length - 1;
        int i3 = 0;
        while (i3 <= length) {
            int i4 = (i3 + length) / 2;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        if (length < 0) {
            return 0;
        }
        if (!z || (i2 = length + 1) > iArr.length - 1) {
            return length;
        }
        return i2;
    }

    private String changeUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8675edb0", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(124);
        if (indexOf > 0) {
            str = str.substring(0, indexOf);
        }
        return str.replace(" ", "");
    }

    private String[] convergenceUrl(String[] strArr, String[] strArr2, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("9ac300ca", new Object[]{this, strArr, strArr2, str, str2, new Boolean(z)}) : convergenceUrl(strArr, strArr2, str, str2, this.mDoMainDest, z);
    }

    private void decideUrlSuffix(boolean z, StringBuffer stringBuffer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e62f809", new Object[]{this, new Boolean(z), stringBuffer, str});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            stringBuffer.append(str);
            z = true;
        }
        if (z) {
            stringBuffer.append(".jpg");
        }
    }

    private boolean decideUrlWH(boolean z, StringBuffer stringBuffer, ImageStrategyExtra.ImageUrlInfo imageUrlInfo, int i, int i2, double d, double d2, int i3, CutType cutType, boolean z2, double d3, double d4, double d5) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7c84b01b", new Object[]{this, new Boolean(z), stringBuffer, imageUrlInfo, new Integer(i), new Integer(i2), new Double(d), new Double(d2), new Integer(i3), cutType, new Boolean(z2), new Double(d3), new Double(d4), new Double(d5)})).booleanValue() : decideUrlWH(z, stringBuffer, imageUrlInfo, i, i2, d, d2, i3, cutType, z2, d3, d4, d5, false);
    }

    private void decideUrlWebP(StringBuffer stringBuffer, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b7ff74", new Object[]{this, stringBuffer, new Boolean(z), new Boolean(z2)});
        } else if (z || (z2 && this.mWebpOn && isSupportWebP())) {
            stringBuffer.append("_.webp");
        }
    }

    private boolean decideValueByNetwork(boolean z, StringBuffer stringBuffer, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a109a81", new Object[]{this, new Boolean(z), stringBuffer, str, str2})).booleanValue();
        }
        if (!isNetworkSlow()) {
            str = str2;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!z) {
            stringBuffer.append('_');
        }
        stringBuffer.append(str);
        return true;
    }

    private int findBestLevel(int[] iArr, int i, int i2) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a40b442f", new Object[]{this, iArr, new Integer(i), new Integer(i2)})).intValue();
        }
        int length = iArr.length;
        char c = 65535;
        while (i >= 0 && i < length) {
            int i4 = iArr[i];
            if (i2 > i4) {
                if (c >= 0) {
                    if (c == 2) {
                        break;
                    }
                } else {
                    c = 1;
                }
                i++;
            } else if (i2 >= i4) {
                break;
            } else {
                if (c >= 0) {
                    if (c == 1) {
                        break;
                    }
                } else {
                    c = 2;
                }
                i--;
            }
        }
        if (i >= 0) {
            if (i >= length) {
                i3 = length - 1;
            } else if (c == 1 && i2 <= iArr[i - 1] * (this.mLevelRatio + 1.0f)) {
                i3 = i - 1;
            } else if (c != 2 || i2 <= iArr[i] * (this.mLevelRatio + 1.0f)) {
                i3 = i;
            } else {
                i3 = i + 1;
            }
        }
        return iArr[i3];
    }

    private int getDeviceLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[]{this})).intValue();
        }
        if (this.mDeviceLevel == 0) {
            this.mDeviceLevel = SceneIdentifier.getDeviceLevel();
        }
        return this.mDeviceLevel;
    }

    public static TaobaoImageUrlStrategy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("a92d0431", new Object[0]);
        }
        return TImageUrlStrategyHolder.instance;
    }

    private boolean isAvifAllowedWithBiz(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abe2d4df", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int[] iArr = this.mAvifBizWhiteList;
        if (iArr == null || iArr.length <= 0) {
            return true;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private boolean isExcludeUrl(String[] strArr, String str, String str2) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("163154f1", new Object[]{this, strArr, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (strArr != null) {
            if (str2 == null && (parse = Uri.parse(str)) != null) {
                str2 = parse.getHost();
            }
            for (String str3 : strArr) {
                if (str3.equals(str2)) {
                    return true;
                }
            }
        }
        if (this.mFuzzyExcludePath != null) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.mFuzzyExcludePath;
                if (i >= strArr2.length) {
                    break;
                } else if (str.indexOf(strArr2[i]) >= 0) {
                    return true;
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    private boolean isHeifAllowedWithBiz(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c45ca117", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int[] iArr = this.mHeifBizWhiteList;
        if (iArr == null || iArr.length <= 0) {
            return true;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private ImageSize matchWH2CDN10000(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageSize) ipChange.ipc$dispatch("263fc56f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)}) : matchWH2CDN10000(i, i2, i3, true);
    }

    public String decideUrl(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57aca635", new Object[]{this, str, new Integer(i)}) : decideUrl(str, i, "", CutType.non);
    }

    public float getDip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a129074c", new Object[]{this})).floatValue();
        }
        return this.mDip;
    }

    public String[] getH5HeifSourceWhiteList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("d08cabe5", new Object[]{this});
        }
        return this.mH5HeifSourceWhiteList;
    }

    public String[] getH5HeifWhiteList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("483aadc0", new Object[]{this});
        }
        return this.mH5HeifWhiteList;
    }

    public String getHeifImageDomain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73cf5ca", new Object[]{this});
        }
        return this.mHeifImageDomain;
    }

    public synchronized void initImageUrlStrategy(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, HashMap<String, ServiceImageSwitch> hashMap, String str, String str2, String str3, String str4, int[] iArr7, int[] iArr8, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, boolean z, boolean z2, String str5, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cee80c25", new Object[]{this, iArr, iArr2, iArr3, iArr4, iArr5, iArr6, hashMap, str, str2, str3, str4, iArr7, iArr8, strArr, strArr2, strArr3, strArr4, new Boolean(z), new Boolean(z2), str5, new Boolean(z3)});
            return;
        }
        this.mWebpOn = z3;
        this.mGlobalSwitch = z;
        if (z) {
            setAliCdnDomain(strArr2);
            setCdnSize(iArr);
            setCdn10000WidthSize(iArr2);
            setCdn10000HeightSize(iArr3);
            setXzCdnSize(iArr4);
            setLevelModelCdnSize(iArr5);
            setLevelModelXzCdnSize(iArr6);
            setLevelRatio(str5);
            setServiceIamgeSwitch(hashMap);
            setDoMainDest(str);
            this.mDomainSwitch = z2;
            setExactExcludeDomain(strArr3);
            setFuzzyExcludePath(strArr4);
            setExcludeDomainPath(strArr);
            this.mHeifImageDomain = TextUtils.isEmpty(str2) ? HEIF_DOMAIN_DEST : str2;
            this.mHeifBizWhiteList = iArr7;
            this.mAvifImageDomain = TextUtils.isEmpty(str3) ? AVIF_DOMAIN_DEST : str3;
            this.mAvifBizWhiteList = iArr8;
            this.mSpecialDomain = TextUtils.isEmpty(str4) ? SPECIAL_DOMAIN_DEST : str4;
        }
    }

    public boolean isCdnImage(UriCDNInfo uriCDNInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("70ceda55", new Object[]{this, uriCDNInfo})).booleanValue() : isCdnImage(uriCDNInfo.url, uriCDNInfo.host);
    }

    public boolean isDomainSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc48caed", new Object[]{this})).booleanValue();
        }
        return this.mDomainSwitch;
    }

    public boolean isInCDN(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2dbe1062", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.mCdnSizes;
            if (i2 >= iArr.length) {
                return false;
            }
            if (iArr[i2] == i) {
                return true;
            }
            i2++;
        }
    }

    public boolean isNetworkSlow() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a227a7d0", new Object[]{this})).booleanValue();
        }
        long nanoTime = System.nanoTime();
        if (nanoTime - this.mLastUpdateTime > 2000000000) {
            if (rle.d() != null && rle.d().e().b()) {
                z = true;
            }
            this.mIsNetworkSlow = z;
            this.mLastUpdateTime = nanoTime;
        }
        return this.mIsNetworkSlow;
    }

    public boolean isOptCdnImage(UriCDNInfo uriCDNInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0fb49f6", new Object[]{this, uriCDNInfo})).booleanValue();
        }
        String[] strArr = this.mFuzzyExcludePath;
        if (strArr != null) {
            for (String str : strArr) {
                if (uriCDNInfo.url.contains(str)) {
                    return false;
                }
            }
        }
        try {
            Boolean bool = sStringBooleanHashMap.get(uriCDNInfo.host);
            if (bool == null) {
                return false;
            }
            if (bool.booleanValue()) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean isStrictCdnImage(UriCDNInfo uriCDNInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88b63a4c", new Object[]{this, uriCDNInfo})).booleanValue();
        }
        String str = uriCDNInfo.host;
        if (!isExcludeUrl(this.mStrictCDNDomainBlackList, uriCDNInfo.url, str) && str != null) {
            int i = 0;
            while (true) {
                String[] strArr = this.mStrictCDNDomainWhiteList;
                if (i >= strArr.length) {
                    break;
                } else if (str.indexOf(strArr[i]) >= 0) {
                    return true;
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    public int matchSize(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c12eba9", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.mCdnSizes.length <= 0) {
            return i;
        }
        while (true) {
            int[] iArr = this.mCdnSizes;
            if (i2 >= iArr.length - 1) {
                return iArr[iArr.length - 1];
            }
            int i3 = iArr[i2];
            i2++;
            int i4 = iArr[i2];
            int i5 = i - i3;
            int i6 = i4 - i;
            if (i5 >= 0 && i6 >= 0) {
                if (i5 < i6) {
                    return i3;
                }
                return i4;
            }
        }
    }

    public TaobaoImageUrlStrategy setAliCdnDomain(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("1c93fbe0", new Object[]{this, strArr});
        }
        if (strArr != null && strArr.length > 0) {
            this.mLooseCDNDomainWhiteList = strArr;
        }
        return this;
    }

    public TaobaoImageUrlStrategy setCdn10000HeightSize(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("8b319cc0", new Object[]{this, iArr});
        }
        if (iArr == null || iArr.length <= 0) {
            this.mCdn10000Height = CDN10000Height;
        } else {
            this.mCdn10000Height = iArr;
        }
        return this;
    }

    public TaobaoImageUrlStrategy setCdn10000WidthSize(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("da89ca4d", new Object[]{this, iArr});
        }
        if (iArr == null || iArr.length <= 0) {
            this.mCdn10000Width = CDN10000Width;
        } else {
            this.mCdn10000Width = iArr;
        }
        return this;
    }

    public TaobaoImageUrlStrategy setCdnSize(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("c1403e02", new Object[]{this, iArr});
        }
        if (iArr == null || iArr.length <= 0) {
            this.mCdnSizes = CDN;
        } else {
            this.mCdnSizes = iArr;
        }
        return this;
    }

    public TaobaoImageUrlStrategy setDoMainDest(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("b16b4eaa", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.mDoMainDest = str;
        } else {
            this.mDoMainDest = DOMAIN_DEST;
        }
        return this;
    }

    public TaobaoImageUrlStrategy setExactExcludeDomain(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("e2e428c", new Object[]{this, strArr});
        }
        if (strArr == null || strArr.length <= 0) {
            this.mLooseCDNDomainBlackList = LOOSE_CDN_DOMAIN_BLACK_LIST;
        } else {
            this.mLooseCDNDomainBlackList = strArr;
        }
        return this;
    }

    public TaobaoImageUrlStrategy setExcludeDomainPath(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("4bac904c", new Object[]{this, strArr});
        }
        if (strArr != null && strArr.length > 0) {
            this.mLooseConvergenceBlackList = strArr;
        }
        return this;
    }

    public TaobaoImageUrlStrategy setFuzzyExcludePath(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("6a42b7c2", new Object[]{this, strArr});
        }
        if (strArr == null || strArr.length <= 0) {
            this.mFuzzyExcludePath = FUZZY_EXCLUDE_PATH;
        } else {
            this.mFuzzyExcludePath = strArr;
        }
        return this;
    }

    public TaobaoImageUrlStrategy setLevelModelCdnSize(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("130856a7", new Object[]{this, iArr});
        }
        if (isValidSizes(iArr)) {
            this.mLevelModelCdnSizes = iArr;
        }
        return this;
    }

    public TaobaoImageUrlStrategy setLevelModelXzCdnSize(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("addeee09", new Object[]{this, iArr});
        }
        if (isValidSizes(iArr)) {
            this.mLevelModelXzCdnSizes = iArr;
        }
        return this;
    }

    public TaobaoImageUrlStrategy setLevelRatio(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("79b0d189", new Object[]{this, str});
        }
        try {
            this.mLevelRatio = Float.parseFloat(str);
        } catch (Exception unused) {
        }
        float f = this.mLevelRatio;
        if (f < 0.0f || f > 1.0f) {
            this.mLevelRatio = 0.1f;
        }
        return this;
    }

    public TaobaoImageUrlStrategy setServiceIamgeSwitch(HashMap<String, ServiceImageSwitch> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("7fad334b", new Object[]{this, hashMap});
        }
        this.mServiceImageSwitchList = hashMap;
        return this;
    }

    public TaobaoImageUrlStrategy setXzCdnSize(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("adba6aa4", new Object[]{this, iArr});
        }
        if (iArr == null || iArr.length <= 0) {
            this.mXzCdnSizes = XZCDN;
        } else {
            this.mXzCdnSizes = iArr;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x026c, code lost:
        if (getDeviceLevel() == 3) goto L_0x026e;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0256 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:259:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String simpleDecideUrl(java.lang.String r38, int r39, com.taobao.tao.image.ImageStrategyConfig r40) {
        /*
            Method dump skipped, instructions count: 1154
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.util.TaobaoImageUrlStrategy.simpleDecideUrl(java.lang.String, int, com.taobao.tao.image.ImageStrategyConfig):java.lang.String");
    }

    public String strictConvergenceUrl(UriCDNInfo uriCDNInfo, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8eafffce", new Object[]{this, uriCDNInfo, new Boolean(z)}) : convergenceUrl(this.mStrictCDNDomainWhiteList, this.mStrictConvergenceBlackList, uriCDNInfo.url, uriCDNInfo.host, z)[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
        if (r2.contains("*") == false) goto L_0x008b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean supportHeightScale(com.taobao.tao.image.ImageStrategyConfig r9) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.tao.util.TaobaoImageUrlStrategy.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "c2be8fd2"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r8
            r4[r0] = r9
            java.lang.Object r9 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L_0x001c:
            if (r9 == 0) goto L_0x00d8
            boolean r2 = r9.A()
            if (r2 != 0) goto L_0x0026
            goto L_0x00d8
        L_0x0026:
            int r2 = r8.getDeviceLevel()
            r3 = 3
            if (r2 != r3) goto L_0x002e
            return r1
        L_0x002e:
            tb.rle r2 = tb.rle.d()
            if (r2 != 0) goto L_0x0035
            return r1
        L_0x0035:
            java.lang.Boolean r2 = r9.r()
            if (r2 == 0) goto L_0x0046
            java.lang.Boolean r2 = r9.r()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0046
            return r1
        L_0x0046:
            tb.rle r2 = tb.rle.d()
            java.util.ArrayList r2 = r2.j()
            java.lang.String r3 = "*"
            java.lang.String r4 = ""
            if (r2 == 0) goto L_0x008b
            int r5 = r2.size()
            if (r5 <= 0) goto L_0x008b
            java.lang.String r5 = r9.h()
            java.lang.String r6 = r9.b()
            int r7 = r9.a()
            boolean r5 = r2.contains(r5)
            if (r5 != 0) goto L_0x008a
            boolean r5 = r2.contains(r6)
            if (r5 != 0) goto L_0x008a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            boolean r5 = r2.contains(r5)
            if (r5 != 0) goto L_0x008a
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x008b
        L_0x008a:
            return r0
        L_0x008b:
            tb.rle r2 = tb.rle.d()
            boolean r2 = r2.D()
            if (r2 == 0) goto L_0x00d8
            tb.rle r2 = tb.rle.d()
            java.util.ArrayList r2 = r2.v()
            if (r2 == 0) goto L_0x00d8
            int r5 = r2.size()
            if (r5 <= 0) goto L_0x00d8
            java.lang.String r5 = r9.h()
            java.lang.String r6 = r9.b()
            int r9 = r9.a()
            boolean r5 = r2.contains(r5)
            if (r5 != 0) goto L_0x00d7
            boolean r5 = r2.contains(r6)
            if (r5 != 0) goto L_0x00d7
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            boolean r9 = r2.contains(r9)
            if (r9 != 0) goto L_0x00d7
            boolean r9 = r2.contains(r3)
            if (r9 == 0) goto L_0x00d6
            goto L_0x00d7
        L_0x00d6:
            r0 = 0
        L_0x00d7:
            return r0
        L_0x00d8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.util.TaobaoImageUrlStrategy.supportHeightScale(com.taobao.tao.image.ImageStrategyConfig):boolean");
    }

    public int taoXZCDN(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("768e4346", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)})).intValue();
        }
        if (z2) {
            int[] iArr = this.mLevelModelXzCdnSizes;
            return findBestLevel(iArr, iArr.length / 2, i);
        }
        int[] iArr2 = this.mXzCdnSizes;
        return iArr2[binarySearch(iArr2, i, z)];
    }

    public int taobaoCDN10000Height(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1221eae4", new Object[]{this, new Integer(i), new Boolean(z)})).intValue();
        }
        return this.mCdn10000Height[binarySearch(this.mCdn10000Height, i, z)];
    }

    public int taobaoCDN10000Width(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5a1df", new Object[]{this, new Integer(i), new Boolean(z)})).intValue();
        }
        return this.mCdn10000Width[binarySearch(this.mCdn10000Width, i, z)];
    }

    public int taobaoCDNPatten(int i, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2e4755c4", new Object[]{this, new Integer(i), new Boolean(z)})).intValue() : taobaoCDNPatten(i, z, true);
    }

    public void updateDefaultCDNDomainWhiteList(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b59faa0a", new Object[]{this, strArr});
        } else if (strArr != null && strArr.length != 0) {
            synchronized (sStringBooleanHashMap) {
                try {
                    this.mDefaultCDNDomainWhiteList = strArr;
                    for (String str : strArr) {
                        sStringBooleanHashMap.put(str, Boolean.TRUE);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void updateH5HeifSourceWhiteList(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda9f8bc", new Object[]{this, strArr});
        } else if (strArr != null && strArr.length > 0) {
            this.mH5HeifSourceWhiteList = strArr;
        }
    }

    public void updateH5HeifWhiteList(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea46a481", new Object[]{this, strArr});
        } else if (strArr != null && strArr.length > 0) {
            this.mH5HeifWhiteList = strArr;
        }
    }

    public void updateStrictCDNDomainBlackList(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b311fa", new Object[]{this, strArr});
        } else if (strArr != null && strArr.length > 0) {
            this.mStrictCDNDomainBlackList = strArr;
        }
    }

    public void updateStrictCDNDomainWhiteList(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead28b90", new Object[]{this, strArr});
        } else if (strArr != null && strArr.length > 0) {
            this.mStrictCDNDomainWhiteList = strArr;
        }
    }

    public void updateStrictConvergenceBlackList(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b68a449a", new Object[]{this, strArr});
        } else if (strArr != null && strArr.length > 0) {
            this.mStrictConvergenceBlackList = strArr;
        }
    }

    private String[] convergenceUrl(String[] strArr, String[] strArr2, String str, String str2, String str3, boolean z) {
        Uri parse;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ba078300", new Object[]{this, strArr, strArr2, str, str2, str3, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str)) {
            return new String[]{str, str2};
        }
        if (str2 == null && (parse = Uri.parse(str)) != null) {
            str2 = parse.getHost();
        }
        if (str2 == null || str2.equals(str3)) {
            return new String[]{str, str2};
        }
        int length = strArr2 != null ? strArr2.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (str2.indexOf(strArr2[i2]) >= 0) {
                return new String[]{str, str2};
            }
        }
        if (z) {
            int length2 = strArr != null ? strArr.length : 0;
            while (i < length2 && str2.indexOf(strArr[i]) < 0) {
                i++;
            }
            if (i >= length2) {
                return new String[]{str, str2};
            }
        }
        return new String[]{str.replaceFirst(str2, str3), str3};
    }

    private boolean decideUrlWH(boolean z, StringBuffer stringBuffer, ImageStrategyExtra.ImageUrlInfo imageUrlInfo, int i, int i2, double d, double d2, int i3, CutType cutType, boolean z2, double d3, double d4, double d5, boolean z3) {
        ImageSize imageSize;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("141205a1", new Object[]{this, new Boolean(z), stringBuffer, imageUrlInfo, new Integer(i), new Integer(i2), new Double(d), new Double(d2), new Integer(i9), cutType, new Boolean(z2), new Double(d3), new Double(d4), new Double(d5), new Boolean(z3)})).booleanValue();
        }
        double d6 = d;
        if (i9 > 0) {
            if (!isNetworkSlow()) {
                d6 = d2;
            }
            if (rle.d() != null && rle.d().f()) {
                int deviceLevel = getDeviceLevel();
                d6 = Math.min(d6, deviceLevel != 1 ? deviceLevel != 2 ? deviceLevel != 3 ? 1.0d : d5 : d4 : d3);
            }
            if (getDeviceLevel() == 3 && rle.d() != null && rle.d().g()) {
                d6 = Math.min(0.8d, d6);
            }
            i9 = (int) (i9 * d6);
        }
        if (i9 < 0) {
            imageSize = (imageUrlInfo == null || (i7 = imageUrlInfo.width) <= 0 || (i8 = imageUrlInfo.height) <= 0) ? null : new ImageSize(true, false, i7, i8);
        } else if (i >= 0 && i2 >= 0) {
            imageSize = matchWH2CDN10000(i, i2, i9, z2);
            imageSize.keep = false;
        } else if (imageUrlInfo == null || (i5 = imageUrlInfo.width) <= 0 || (i6 = imageUrlInfo.height) <= 0) {
            int taobaoCDNPatten = (cutType == null || cutType == CutType.non) ? taobaoCDNPatten((int) (i9 * this.mDip), true, z2) : taoXZCDN((int) (i9 * this.mDip), true, z2);
            imageSize = new ImageSize(taobaoCDNPatten, taobaoCDNPatten);
        } else {
            imageSize = matchWH2CDN10000(i5, i6, i9, z2);
        }
        if (imageSize == null) {
            return false;
        }
        if (!z) {
            stringBuffer.append('_');
        }
        if (getDeviceLevel() == 3 && imageSize.width == 1200 && imageSize.height == 1200) {
            stringBuffer.append(960);
            stringBuffer.append('x');
            stringBuffer.append(960);
        } else if (!z3 || getDeviceLevel() == 3 || (i4 = imageSize.width) != imageSize.height || !(i4 == 1200 || i4 == 960 || i4 == 760 || i4 == 600 || i4 == 460)) {
            stringBuffer.append(imageSize.width);
            stringBuffer.append('x');
            stringBuffer.append(imageSize.height);
        } else {
            stringBuffer.append(i4);
            stringBuffer.append('x');
            stringBuffer.append(0);
        }
        if (imageSize.keep && imageUrlInfo != null) {
            stringBuffer.append(imageUrlInfo.cj);
            return true;
        } else if (imageSize.limitWH || cutType == null) {
            return true;
        } else {
            stringBuffer.append(cutType.getCutType());
            return true;
        }
    }

    private ImageSize matchWH2CDN10000(int i, int i2, int i3, boolean z) {
        boolean z2 = true;
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageSize) ipChange.ipc$dispatch("93e2b53", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
        }
        if ((i == 10000 && i2 == 10000) || (i == 0 && i2 == 0)) {
            i = taobaoCDNPatten((int) (i3 * this.mDip), true, z);
            i2 = i;
            z2 = false;
        } else {
            if (i2 == 10000) {
                i = taobaoCDN10000Width((int) (i3 * this.mDip), true);
                i2 = 10000;
            } else if (i == 10000) {
                i2 = taobaoCDN10000Height((int) (i3 * this.mDip), true);
                i = 10000;
            }
            z2 = false;
            z3 = true;
        }
        return new ImageSize(z2, z3, i, i2);
    }

    public String decideUrl(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("191bae6b", new Object[]{this, str, new Integer(i), str2}) : decideUrl(str, i, "", CutType.non);
    }

    public boolean isCdnImage(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c394050d", new Object[]{this, str})).booleanValue() : isCdnImage(str, null);
    }

    public boolean isSimpleCdnImage(UriCDNInfo uriCDNInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f34dac3", new Object[]{this, uriCDNInfo})).booleanValue();
        }
        try {
            return uriCDNInfo.host.equals(DOMAIN_DEST);
        } catch (Throwable unused) {
            return false;
        }
    }

    public String strictConvergenceUrl(UriCDNInfo uriCDNInfo, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("701aee98", new Object[]{this, uriCDNInfo, str, new Boolean(z)}) : convergenceUrl(this.mStrictCDNDomainWhiteList, this.mStrictConvergenceBlackList, uriCDNInfo.url, uriCDNInfo.host, str, z)[0];
    }

    public int taobaoCDNPatten(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9aa41716", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)})).intValue();
        }
        if (z2) {
            int[] iArr = this.mLevelModelCdnSizes;
            return findBestLevel(iArr, iArr.length / 2, i);
        }
        int[] iArr2 = this.mCdnSizes;
        return iArr2[binarySearch(iArr2, i, z)];
    }

    private boolean isCdnImage(String str, String str2) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("983f5e97", new Object[]{this, str, str2})).booleanValue();
        }
        if (isExcludeUrl(this.mLooseCDNDomainBlackList, str, str2)) {
            return false;
        }
        if (str2 == null && (parse = Uri.parse(str)) != null) {
            str2 = parse.getHost();
        }
        if (str2 != null) {
            int i = 0;
            while (true) {
                String[] strArr = this.mLooseCDNDomainWhiteList;
                if (i >= strArr.length) {
                    break;
                } else if (str2.indexOf(strArr[i]) >= 0) {
                    return true;
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    private boolean isValidSizes(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fefe3899", new Object[]{this, iArr})).booleanValue();
        }
        if (iArr == null || iArr.length == 0) {
            return false;
        }
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            if (i2 >= i3) {
                return false;
            }
            i++;
            i2 = i3;
        }
        return true;
    }

    @Deprecated
    public String decideUrl(String str, int i, String str2, CutType cutType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6f4d20b6", new Object[]{this, str, new Integer(i), str2, cutType}) : decideUrl(str, i, str2, cutType, -1, -1, true, true, true);
    }

    public void initDip(Context context) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f5fb1a6", new Object[]{this, context});
        } else if (context != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Display defaultDisplay = ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
                float f = displayMetrics.density;
                this.mDip = f;
                if (f <= 2.0f) {
                    z = false;
                }
                this.mIsLowQuality = z;
            }
        }
    }

    public boolean isSupportWebP() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcb21c6c", new Object[]{this})).booleanValue();
        }
        return rle.d() != null && rle.d().e().a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0272, code lost:
        if (getDeviceLevel() == 3) goto L_0x0274;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x025c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:283:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String decideUrl(java.lang.String r41, int r42, com.taobao.tao.image.ImageStrategyConfig r43) {
        /*
            Method dump skipped, instructions count: 1373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.util.TaobaoImageUrlStrategy.decideUrl(java.lang.String, int, com.taobao.tao.image.ImageStrategyConfig):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b6, code lost:
        if (r9.contains("*") == false) goto L_0x00b9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean supportHighQualityAccess(com.taobao.tao.image.ImageStrategyConfig r8, com.taobao.tao.util.ImageStrategyExtra.ImageUrlInfo r9) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            r2 = 3
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.tao.util.TaobaoImageUrlStrategy.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001f
            java.lang.String r4 = "4d75f382"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r7
            r2[r0] = r8
            r8 = 2
            r2[r8] = r9
            java.lang.Object r8 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x001f:
            if (r8 == 0) goto L_0x0106
            if (r9 == 0) goto L_0x0106
            boolean r3 = r8.z()
            if (r3 != 0) goto L_0x002b
            goto L_0x0106
        L_0x002b:
            int r3 = r7.getDeviceLevel()
            if (r3 != r2) goto L_0x0032
            return r1
        L_0x0032:
            java.lang.String r2 = r9.quality
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x003b
            return r1
        L_0x003b:
            int r2 = r9.width
            if (r2 != 0) goto L_0x0106
            int r2 = r9.height
            if (r2 == 0) goto L_0x0045
            goto L_0x0106
        L_0x0045:
            com.taobao.tao.util.TaobaoImageUrlStrategy$CutType r2 = r8.c()
            if (r2 != 0) goto L_0x0106
            java.lang.String r9 = r9.cj
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x0055
            goto L_0x0106
        L_0x0055:
            com.taobao.tao.util.TaobaoImageUrlStrategy$ImageQuality r9 = r8.e()
            if (r9 == 0) goto L_0x006d
            com.taobao.tao.util.TaobaoImageUrlStrategy$ImageQuality r9 = r8.e()
            java.lang.String r9 = r9.getImageQuality()
            java.lang.String r2 = "q99"
            boolean r9 = android.text.TextUtils.equals(r9, r2)
            if (r9 != 0) goto L_0x006d
            return r1
        L_0x006d:
            tb.rle r9 = tb.rle.d()
            if (r9 != 0) goto L_0x0074
            return r1
        L_0x0074:
            tb.rle r9 = tb.rle.d()
            java.util.ArrayList r9 = r9.w()
            java.lang.String r2 = "*"
            java.lang.String r3 = ""
            if (r9 == 0) goto L_0x00b9
            int r4 = r9.size()
            if (r4 <= 0) goto L_0x00b9
            java.lang.String r4 = r8.h()
            java.lang.String r5 = r8.b()
            int r6 = r8.a()
            boolean r4 = r9.contains(r4)
            if (r4 != 0) goto L_0x00b8
            boolean r4 = r9.contains(r5)
            if (r4 != 0) goto L_0x00b8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            boolean r4 = r9.contains(r4)
            if (r4 != 0) goto L_0x00b8
            boolean r9 = r9.contains(r2)
            if (r9 == 0) goto L_0x00b9
        L_0x00b8:
            return r0
        L_0x00b9:
            tb.rle r9 = tb.rle.d()
            boolean r9 = r9.D()
            if (r9 == 0) goto L_0x0106
            tb.rle r9 = tb.rle.d()
            java.util.ArrayList r9 = r9.x()
            if (r9 == 0) goto L_0x0106
            int r4 = r9.size()
            if (r4 <= 0) goto L_0x0106
            java.lang.String r4 = r8.h()
            java.lang.String r5 = r8.b()
            int r8 = r8.a()
            boolean r4 = r9.contains(r4)
            if (r4 != 0) goto L_0x0105
            boolean r4 = r9.contains(r5)
            if (r4 != 0) goto L_0x0105
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r8)
            java.lang.String r8 = r4.toString()
            boolean r8 = r9.contains(r8)
            if (r8 != 0) goto L_0x0105
            boolean r8 = r9.contains(r2)
            if (r8 == 0) goto L_0x0104
            goto L_0x0105
        L_0x0104:
            r0 = 0
        L_0x0105:
            return r0
        L_0x0106:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.util.TaobaoImageUrlStrategy.supportHighQualityAccess(com.taobao.tao.image.ImageStrategyConfig, com.taobao.tao.util.ImageStrategyExtra$ImageUrlInfo):boolean");
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class ImageSize {
        public int height;
        public boolean keep;
        public boolean limitWH;
        public int width;

        public ImageSize(boolean z, boolean z2, int i, int i2) {
            this.keep = z;
            this.limitWH = z2;
            this.width = i;
            this.height = i2;
        }

        public ImageSize(int i, int i2) {
            this(false, false, i, i2);
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class UriCDNInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String host;
        public Uri uri;
        public final String url;

        public UriCDNInfo(String str) {
            this.url = str;
            Uri parse = Uri.parse(str);
            this.uri = parse;
            if (parse == null || parse.getHost() == null) {
                this.host = "";
            } else {
                this.host = this.uri.getHost();
            }
        }

        private static String getHostFromPath(String str) {
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
            return str.substring(i, indexOf2);
        }

        public UriCDNInfo(String str, boolean z) {
            this.url = str;
            this.host = getHostFromPath(str);
        }
    }

    static {
        String[] strArr = {DOMAIN_DEST};
        DEFAULT_CDN_DOMAIN_WHITE_LIST = strArr;
        for (String str : strArr) {
            sStringBooleanHashMap.put(str, Boolean.TRUE);
        }
    }

    public boolean isExcludeUrl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3afe8754", new Object[]{this, str})).booleanValue() : isExcludeUrl(this.mLooseCDNDomainBlackList, str, null);
    }

    public String[] convergenceUrl(UriCDNInfo uriCDNInfo, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("a3d51af8", new Object[]{this, uriCDNInfo, new Boolean(z)}) : convergenceUrl(this.mLooseCDNDomainWhiteList, this.mLooseConvergenceBlackList, uriCDNInfo.url, uriCDNInfo.host, z);
    }

    public String convergenceUrl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7e88631", new Object[]{this, str}) : convergenceUrl(this.mLooseCDNDomainWhiteList, this.mLooseConvergenceBlackList, str, null, true)[0];
    }

    @Deprecated
    public String decideUrl(String str, int i, String str2, CutType cutType, int i2, int i3, boolean z, boolean z2, boolean z3) {
        double d;
        String str3;
        double d2;
        double d3;
        double d4;
        double d5;
        boolean z4;
        StringBuffer stringBuffer;
        boolean z5;
        String str4;
        boolean z6;
        boolean z7;
        ServiceImageSwitch serviceImageSwitch;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e74e0d6", new Object[]{this, str, new Integer(i), str2, cutType, new Integer(i2), new Integer(i3), new Boolean(z), new Boolean(z2), new Boolean(z3)});
        }
        if (str == null) {
            ohh.e(ohh.COMMON_TAG, "origin url is null", new Object[0]);
            return null;
        }
        String changeUrl = changeUrl(str);
        UriCDNInfo uriCDNInfo = new UriCDNInfo(changeUrl);
        if (OssImageUrlStrategy.getInstance().isOssDomain(uriCDNInfo.host)) {
            return OssImageUrlStrategy.getInstance().decideUrl(changeUrl, i, ImageStrategyConfig.u("default").a());
        }
        if (!isCdnImage(uriCDNInfo)) {
            ohh.g(ohh.COMMON_TAG, "origin not cdn url:%s", changeUrl);
            return changeUrl;
        }
        if (this.mDomainSwitch) {
            changeUrl = convergenceUrl(uriCDNInfo, false)[0];
        }
        ImageStrategyExtra.ImageUrlInfo baseUrlInfo = ImageStrategyExtra.getBaseUrlInfo(changeUrl);
        if (baseUrlInfo.base.endsWith("_sum.jpg")) {
            String str5 = baseUrlInfo.base;
            baseUrlInfo.base = str5.substring(0, str5.length() - 8);
        } else if (baseUrlInfo.base.endsWith("_m.jpg") || baseUrlInfo.base.endsWith("_b.jpg")) {
            String str6 = baseUrlInfo.base;
            baseUrlInfo.base = str6.substring(0, str6.length() - 6);
        }
        ImageStrategyExtra.parseImageUrl(baseUrlInfo.base, baseUrlInfo);
        StringBuffer stringBuffer2 = new StringBuffer(baseUrlInfo.base.length() + 27);
        stringBuffer2.append(baseUrlInfo.base);
        String imageQuality = (this.mIsLowQuality ? ImageQuality.q50 : ImageQuality.q75).getImageQuality();
        String imageQuality2 = (this.mIsLowQuality ? ImageQuality.q75 : ImageQuality.q90).getImageQuality();
        ImageSharpen imageSharpen = ImageSharpen.non;
        String imageSharpen2 = imageSharpen.getImageSharpen();
        String imageSharpen3 = imageSharpen.getImageSharpen();
        if (!this.mGlobalSwitch || this.mServiceImageSwitchList == null || TextUtils.isEmpty(str2) || (serviceImageSwitch = this.mServiceImageSwitchList.get(str2)) == null || !z3) {
            d2 = 1.0d;
            d = 0.7d;
            d4 = 0.5d;
            str3 = "";
            d3 = 0.7d;
            d5 = 1.0d;
            z4 = z;
        } else {
            boolean isUseWebp = serviceImageSwitch.isUseWebp();
            String lowNetQ = serviceImageSwitch.getLowNetQ();
            imageQuality2 = serviceImageSwitch.getHighNetQ();
            imageSharpen2 = serviceImageSwitch.getLowNetSharpen();
            imageSharpen3 = serviceImageSwitch.getHighNetSharpen();
            double lowNetScale = serviceImageSwitch.getLowNetScale();
            double highNetScale = serviceImageSwitch.getHighNetScale();
            double lowDeviceScale = serviceImageSwitch.getLowDeviceScale();
            d3 = serviceImageSwitch.getMidDeviceScale();
            d2 = serviceImageSwitch.getHighDeviceScale();
            d4 = lowDeviceScale;
            d5 = highNetScale;
            d = lowNetScale;
            z4 = isUseWebp;
            str3 = serviceImageSwitch.getSuffix();
            imageQuality = lowNetQ;
        }
        boolean decideUrlWH = decideUrlWH(false, stringBuffer2, baseUrlInfo, i2, i3, d, d5, i, cutType, true, d2, d3, d4);
        if (z2) {
            stringBuffer = stringBuffer2;
            decideUrlWH = decideValueByNetwork(decideUrlWH, stringBuffer, imageQuality, imageQuality2) || decideUrlWH;
        } else {
            stringBuffer = stringBuffer2;
        }
        if (decideValueByNetwork(decideUrlWH, stringBuffer, imageSharpen2, imageSharpen3) || decideUrlWH) {
            str4 = str3;
            z5 = true;
        } else {
            str4 = str3;
            z5 = false;
        }
        decideUrlSuffix(z5, stringBuffer, str4);
        if (!z4 || baseUrlInfo.suffix.contains("imgwebptag=0")) {
            z7 = false;
            z6 = false;
        } else {
            z7 = false;
            z6 = true;
        }
        decideUrlWebP(stringBuffer, z7, z6);
        stringBuffer.append(baseUrlInfo.suffix);
        String stringBuffer3 = stringBuffer.toString();
        if (ohh.f(ohh.LEVEL_D)) {
            Float valueOf = Float.valueOf(this.mDip);
            Integer valueOf2 = Integer.valueOf(i);
            Object[] objArr = new Object[5];
            char c = z7 ? 1 : 0;
            char c2 = z7 ? 1 : 0;
            objArr[c] = valueOf;
            objArr[1] = valueOf2;
            objArr[2] = str2;
            objArr[3] = changeUrl;
            objArr[4] = stringBuffer3;
            ohh.a(ohh.COMMON_TAG, "[Non-Config] Dip=%.1f UISize=%d Area=%s\nOriginUrl=%s\nDecideUrl=%s", objArr);
        }
        return stringBuffer3;
    }
}
