package com.alipay.android.msp.framework.minizxing;

import com.alibaba.ariver.remoterpc.EncodingUtils;
import com.alipay.ma.util.StringEncodeUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.Constants;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum CharacterSetECI {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, "UTF-8"),
    ASCII(new int[]{27, 170}, EncodingUtils.US_ASCII),
    Big5(28),
    GB18030(29, StringEncodeUtils.GB2312, "EUC_CN", Constants.DEFAULT_CHARSET),
    EUC_KR(30, "EUC-KR");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String[] otherEncodingNames;
    private final int[] values;
    private static final Map<Integer, CharacterSetECI> VALUE_TO_ECI = new HashMap();
    private static final Map<String, CharacterSetECI> NAME_TO_ECI = new HashMap();

    static {
        CharacterSetECI[] values;
        for (CharacterSetECI characterSetECI : values()) {
            for (int i : characterSetECI.values) {
                VALUE_TO_ECI.put(Integer.valueOf(i), characterSetECI);
            }
            NAME_TO_ECI.put(characterSetECI.name(), characterSetECI);
            for (String str : characterSetECI.otherEncodingNames) {
                NAME_TO_ECI.put(str, characterSetECI);
            }
        }
    }

    CharacterSetECI(int i) {
        this(new int[]{i}, new String[0]);
    }

    public static CharacterSetECI getCharacterSetECIByName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharacterSetECI) ipChange.ipc$dispatch("7f023693", new Object[]{str});
        }
        return NAME_TO_ECI.get(str);
    }

    public static /* synthetic */ Object ipc$super(CharacterSetECI characterSetECI, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/minizxing/CharacterSetECI");
    }

    public static CharacterSetECI valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharacterSetECI) ipChange.ipc$dispatch("c4335569", new Object[]{str});
        }
        return (CharacterSetECI) Enum.valueOf(CharacterSetECI.class, str);
    }

    public final int getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue();
        }
        return this.values[0];
    }

    CharacterSetECI(int i, String... strArr) {
        this.values = new int[]{i};
        this.otherEncodingNames = strArr;
    }

    CharacterSetECI(int[] iArr, String... strArr) {
        this.values = iArr;
        this.otherEncodingNames = strArr;
    }
}
