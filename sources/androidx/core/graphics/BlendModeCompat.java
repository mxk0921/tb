package androidx.core.graphics;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class BlendModeCompat extends Enum<BlendModeCompat> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final BlendModeCompat CLEAR = new BlendModeCompat("CLEAR", 0);
    public static final BlendModeCompat SRC = new BlendModeCompat("SRC", 1);
    public static final BlendModeCompat DST = new BlendModeCompat("DST", 2);
    public static final BlendModeCompat SRC_OVER = new BlendModeCompat("SRC_OVER", 3);
    public static final BlendModeCompat DST_OVER = new BlendModeCompat("DST_OVER", 4);
    public static final BlendModeCompat SRC_IN = new BlendModeCompat("SRC_IN", 5);
    public static final BlendModeCompat DST_IN = new BlendModeCompat("DST_IN", 6);
    public static final BlendModeCompat SRC_OUT = new BlendModeCompat("SRC_OUT", 7);
    public static final BlendModeCompat DST_OUT = new BlendModeCompat("DST_OUT", 8);
    public static final BlendModeCompat SRC_ATOP = new BlendModeCompat("SRC_ATOP", 9);
    public static final BlendModeCompat DST_ATOP = new BlendModeCompat("DST_ATOP", 10);
    public static final BlendModeCompat XOR = new BlendModeCompat("XOR", 11);
    public static final BlendModeCompat PLUS = new BlendModeCompat("PLUS", 12);
    public static final BlendModeCompat MODULATE = new BlendModeCompat("MODULATE", 13);
    public static final BlendModeCompat SCREEN = new BlendModeCompat("SCREEN", 14);
    public static final BlendModeCompat OVERLAY = new BlendModeCompat("OVERLAY", 15);
    public static final BlendModeCompat DARKEN = new BlendModeCompat("DARKEN", 16);
    public static final BlendModeCompat LIGHTEN = new BlendModeCompat("LIGHTEN", 17);
    public static final BlendModeCompat COLOR_DODGE = new BlendModeCompat("COLOR_DODGE", 18);
    public static final BlendModeCompat COLOR_BURN = new BlendModeCompat("COLOR_BURN", 19);
    public static final BlendModeCompat HARD_LIGHT = new BlendModeCompat("HARD_LIGHT", 20);
    public static final BlendModeCompat SOFT_LIGHT = new BlendModeCompat("SOFT_LIGHT", 21);
    public static final BlendModeCompat DIFFERENCE = new BlendModeCompat("DIFFERENCE", 22);
    public static final BlendModeCompat EXCLUSION = new BlendModeCompat("EXCLUSION", 23);
    public static final BlendModeCompat MULTIPLY = new BlendModeCompat("MULTIPLY", 24);
    public static final BlendModeCompat HUE = new BlendModeCompat("HUE", 25);
    public static final BlendModeCompat SATURATION = new BlendModeCompat("SATURATION", 26);
    public static final BlendModeCompat COLOR = new BlendModeCompat("COLOR", 27);
    public static final BlendModeCompat LUMINOSITY = new BlendModeCompat("LUMINOSITY", 28);
    private static final /* synthetic */ BlendModeCompat[] $VALUES = $values();

    private static /* synthetic */ BlendModeCompat[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BlendModeCompat[]) ipChange.ipc$dispatch("9ceb8065", new Object[0]) : new BlendModeCompat[]{CLEAR, SRC, DST, SRC_OVER, DST_OVER, SRC_IN, DST_IN, SRC_OUT, DST_OUT, SRC_ATOP, DST_ATOP, XOR, PLUS, MODULATE, SCREEN, OVERLAY, DARKEN, LIGHTEN, COLOR_DODGE, COLOR_BURN, HARD_LIGHT, SOFT_LIGHT, DIFFERENCE, EXCLUSION, MULTIPLY, HUE, SATURATION, COLOR, LUMINOSITY};
    }

    private BlendModeCompat(String str, int i) {
    }

    public static /* synthetic */ Object ipc$super(BlendModeCompat blendModeCompat, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/graphics/BlendModeCompat");
    }

    public static BlendModeCompat valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BlendModeCompat) ipChange.ipc$dispatch("4bbaadd0", new Object[]{str});
        }
        return (BlendModeCompat) Enum.valueOf(BlendModeCompat.class, str);
    }

    public static BlendModeCompat[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BlendModeCompat[]) ipChange.ipc$dispatch("1d5b5141", new Object[0]);
        }
        return (BlendModeCompat[]) $VALUES.clone();
    }
}
