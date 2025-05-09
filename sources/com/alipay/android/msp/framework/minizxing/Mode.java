package com.alipay.android.msp.framework.minizxing;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum Mode {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int bits;
    private final int[] characterCountBitsForVersions;

    Mode(int[] iArr, int i) {
        this.characterCountBitsForVersions = iArr;
        this.bits = i;
    }

    public static /* synthetic */ Object ipc$super(Mode mode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/minizxing/Mode");
    }

    public static Mode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mode) ipChange.ipc$dispatch("3ec4f7b8", new Object[]{str});
        }
        return (Mode) Enum.valueOf(Mode.class, str);
    }

    public final int getBits() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bed7f3f6", new Object[]{this})).intValue();
        }
        return this.bits;
    }

    public final int getCharacterCountBits(Version version) {
        char c = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b338e162", new Object[]{this, version})).intValue();
        }
        int versionNumber = version.getVersionNumber();
        if (versionNumber <= 9) {
            c = 0;
        } else if (versionNumber > 26) {
            c = 2;
        }
        return this.characterCountBitsForVersions[c];
    }
}
