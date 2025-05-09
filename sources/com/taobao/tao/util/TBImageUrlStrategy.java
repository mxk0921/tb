package com.taobao.tao.util;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.adapter.image.ImageAdapter;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import tb.ohh;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBImageUrlStrategy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String END_IMAGE_URL = "END_IMAGE_URL";

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.util.TBImageUrlStrategy$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$tao$util$TBImageUrlStrategy$CutType;

        static {
            int[] iArr = new int[CutType.values().length];
            $SwitchMap$com$taobao$tao$util$TBImageUrlStrategy$CutType = iArr;
            try {
                iArr[CutType.xz.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class Area {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String mArea;
        public static final Area search = new Area("search");
        public static final Area detail = new Area("detail");
        public static final Area shop = new Area("shop");
        public static final Area weitao = new Area(ImageStrategyConfig.WEITAO);
        public static final Area weapp = new Area(ImageStrategyConfig.WEAPP);
        public static final Area weappsharpen = new Area(ImageStrategyConfig.WEAPPSHARPEN);
        public static final Area bala = new Area(ImageStrategyConfig.BALA);
        public static final Area home = new Area("home");
        public static final Area tbchannel = new Area(ImageStrategyConfig.TBCHANNEL);
        public static final Area guangguang = new Area("guangguang");
        public static final Area non = new Area("default");

        private Area(String str) {
            this.mArea = str;
        }

        public String getArea() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("160cc5d6", new Object[]{this});
            }
            return this.mArea;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum CutType {
        xz("xz"),
        non("");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String mCutType;

        CutType(String str) {
            this.mCutType = str;
        }

        public static /* synthetic */ Object ipc$super(CutType cutType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/util/TBImageUrlStrategy$CutType");
        }

        public static CutType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CutType) ipChange.ipc$dispatch("4db14432", new Object[]{str});
            }
            return (CutType) Enum.valueOf(CutType.class, str);
        }

        public String getCutType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("318dba53", new Object[]{this});
            }
            return this.mCutType;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum ImageQuality {
        q90(ImageAdapter.IMAGE_QUALITY_Q90),
        q75("q75"),
        q60("q60"),
        q50("q50"),
        q30("q30"),
        non("");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String mImageQuality;

        ImageQuality(String str) {
            this.mImageQuality = str;
        }

        public static /* synthetic */ Object ipc$super(ImageQuality imageQuality, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/util/TBImageUrlStrategy$ImageQuality");
        }

        public static ImageQuality valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ImageQuality) ipChange.ipc$dispatch("d18cd064", new Object[]{str});
            }
            return (ImageQuality) Enum.valueOf(ImageQuality.class, str);
        }

        public String getImageQuality() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8c207d9f", new Object[]{this});
            }
            return this.mImageQuality;
        }
    }

    /* compiled from: Taobao */
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/util/TBImageUrlStrategy$ImageSharpen");
        }

        public static ImageSharpen valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ImageSharpen) ipChange.ipc$dispatch("f1f5a9d0", new Object[]{str});
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class TBImageUrlStrategyHolder {
        public static final TBImageUrlStrategy instance = new TBImageUrlStrategy(null);

        private TBImageUrlStrategyHolder() {
        }
    }

    public /* synthetic */ TBImageUrlStrategy(AnonymousClass1 r1) {
        this();
    }

    public static TBImageUrlStrategy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBImageUrlStrategy) ipChange.ipc$dispatch("db9db891", new Object[0]);
        }
        return TBImageUrlStrategyHolder.instance;
    }

    public String convergenceUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e88631", new Object[]{this, str});
        }
        return TaobaoImageUrlStrategy.getInstance().convergenceUrl(str);
    }

    @Deprecated
    public String decideLowNetUrl(String str, int i, Area area, CutType cutType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e9a5c06d", new Object[]{this, str, new Integer(i), area, cutType}) : decideUrl(str, i, area, 0L, -1, -1, cutType, true, true, true);
    }

    public String decideUrl(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57aca635", new Object[]{this, str, new Integer(i)}) : decideUrl(str, i, Area.non, 0L, -1, -1, CutType.non);
    }

    public String decideUrl10000Height(String str, int i, Area area, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("96c548ed", new Object[]{this, str, new Integer(i), area, new Long(j)});
        }
        return decideUrl(str, i, area, j, 0, 10000, CutType.non);
    }

    public String decideUrl10000Width(String str, int i, Area area, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad69d278", new Object[]{this, str, new Integer(i), area, new Long(j)});
        }
        return decideUrl(str, i, area, j, 10000, 0, CutType.non);
    }

    public void setQuality(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aa2133f", new Object[]{this, new Integer(i)});
        }
    }

    private TBImageUrlStrategy() {
    }

    @Deprecated
    public String decideLowNetUrl(String str, int i, Area area, CutType cutType, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d373b359", new Object[]{this, str, new Integer(i), area, cutType, str2, str3}) : decideUrl(str, i, area, 0L, -1, -1, cutType, true, true, true);
    }

    public String decideUrl(String str, int i, CutType cutType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("26c06a20", new Object[]{this, str, new Integer(i), cutType}) : decideUrl(str, i, Area.non, 0L, -1, -1, cutType);
    }

    @Deprecated
    public String decideLowNetUrl(String str, int i, Area area, CutType cutType, long j, int i2, int i3, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f8dd4a51", new Object[]{this, str, new Integer(i), area, cutType, new Long(j), new Integer(i2), new Integer(i3), str2, str3, new Boolean(z)}) : decideUrl(str, i, area, j, i2, i3, cutType, z, true, true);
    }

    public String decideUrl(String str, int i, Area area) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a6e261b9", new Object[]{this, str, new Integer(i), area}) : decideUrl(str, i, area, 0L, -1, -1, CutType.non);
    }

    public String decideUrl(String str, int i, Area area, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5e8a9463", new Object[]{this, str, new Integer(i), area, new Long(j)}) : decideUrl(str, i, area, j, -1, -1, CutType.non);
    }

    public String decideUrl(String str, int i, Area area, long j, int i2, int i3, CutType cutType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b8104b2e", new Object[]{this, str, new Integer(i), area, new Long(j), new Integer(i2), new Integer(i3), cutType}) : decideUrl(str, i, area, j, i2, i3, cutType, true, true, true);
    }

    public String decideUrl(String str, int i, Area area, long j, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("14b72429", new Object[]{this, str, new Integer(i), area, new Long(j), new Boolean(z), new Boolean(z2), new Boolean(z3)}) : decideUrl(str, i, area, j, -1, -1, CutType.non, z, z2, z3);
    }

    private String decideUrl(String str, int i, Area area, long j, int i2, int i3, CutType cutType, boolean z, boolean z2, boolean z3) {
        TaobaoImageUrlStrategy.CutType cutType2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e429f57e", new Object[]{this, str, new Integer(i), area, new Long(j), new Integer(i2), new Integer(i3), cutType, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        }
        if (!TaobaoImageUrlStrategy.getInstance().isCdnImage(str)) {
            ohh.g(ohh.COMMON_TAG, "origin not cdn url:%s", str);
            return str;
        }
        if (AnonymousClass1.$SwitchMap$com$taobao$tao$util$TBImageUrlStrategy$CutType[cutType.ordinal()] != 1) {
            cutType2 = TaobaoImageUrlStrategy.CutType.non;
        } else {
            cutType2 = TaobaoImageUrlStrategy.CutType.xz;
        }
        return TaobaoImageUrlStrategy.getInstance().decideUrl(str, i, area.getArea(), cutType2, i2, i3, z, z2, z3) + "END_IMAGE_URL";
    }
}
