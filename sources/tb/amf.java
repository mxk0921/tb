package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class amf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final amf INSTANCE = new amf();
    public static final String KEY_IRP_CODE_HEAD_CLICK = "IrpCodeHeadClick";
    public static final String KEY_IRP_TITLE_BAR_GUIDE = "IrpTitleBarGuide";

    static {
        t2o.a(481297102);
    }

    @JvmStatic
    public static final float a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c19ecb0", new Object[]{new Boolean(z)})).floatValue();
        }
        if (z) {
            return 67.0f;
        }
        return 81.0f;
    }

    @JvmStatic
    public static final float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8d6f14b", new Object[0])).floatValue();
        }
        return 1.0f;
    }

    @JvmStatic
    public static final float c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d5290204", new Object[]{new Boolean(z)})).floatValue();
        }
        if (z) {
            return 36.5f;
        }
        return 50.5f;
    }

    @JvmStatic
    public static final float d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14da8ff7", new Object[]{new Boolean(z)})).floatValue();
        }
        if (z) {
            return 46.0f;
        }
        return 60.0f;
    }

    @JvmStatic
    public static final float e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1cb40a6", new Object[]{new Boolean(z)})).floatValue();
        }
        if (z) {
            return 42.0f;
        }
        return 57.0f;
    }

    @JvmStatic
    public static final float f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a247640b", new Object[]{new Boolean(z)})).floatValue();
        }
        if (z) {
            return 3.0f;
        }
        return 3.5f;
    }
}
