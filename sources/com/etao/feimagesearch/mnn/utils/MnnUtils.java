package com.etao.feimagesearch.mnn.utils;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MnnUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum MnnImageFormat {
        RGBA(0),
        RGB(1),
        BGR(2),
        GRAY(3),
        BGRA(4),
        YUV_NV21(11),
        YUVNV12(12);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final int mnnFormatValue;

        MnnImageFormat(int i) {
            this.mnnFormatValue = i;
        }

        public static /* synthetic */ Object ipc$super(MnnImageFormat mnnImageFormat, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/mnn/utils/MnnUtils$MnnImageFormat");
        }

        public static MnnImageFormat valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MnnImageFormat) ipChange.ipc$dispatch("d21c8216", new Object[]{str});
            }
            return (MnnImageFormat) Enum.valueOf(MnnImageFormat.class, str);
        }

        public int getMnnFormatValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bef53e7d", new Object[]{this})).intValue();
            }
            return this.mnnFormatValue;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$Config;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            $SwitchMap$android$graphics$Bitmap$Config = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static {
        t2o.a(481297088);
    }

    public static MnnImageFormat a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MnnImageFormat) ipChange.ipc$dispatch("cfb3e12", new Object[]{bitmap});
        }
        Bitmap.Config config = bitmap.getConfig();
        if (config != null && a.$SwitchMap$android$graphics$Bitmap$Config[config.ordinal()] == 1) {
            return MnnImageFormat.RGBA;
        }
        return null;
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dbb2047", new Object[]{str, str2});
        }
        return str + "_" + str2;
    }
}
