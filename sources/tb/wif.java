package tb;

import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface wif {
    public static final int RESULT_CANCEL = 1;
    public static final int RESULT_EXP_NOT_FOUND = 4;
    public static final int RESULT_EXP_SWITCH_OFF = 2;
    public static final int RESULT_EXP_SWITCH_OTHER = 3;
    public static final int RESULT_OK = 0;

    int b(String str, Map<String, String> map, Object obj);

    int c(String str, Map<String, String> map);
}
