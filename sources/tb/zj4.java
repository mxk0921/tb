package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zj4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SDK_TYPE = "mini";
    public static final String UT_FILE_DIR = ".fa4fe598cb947ffc";
    public static final String UT_GLOBAL_ARGS = "__UT_GLOBAL_ARGS__";
    public static final String UT_TMP_ARGS = "__UT_TMP_ARGS__";
    public static final String UT_TMP_ARGS_KEY = "__UT_TMP_ARGS_KEY__";
    public static final String UT_TMP_ARGS_SPLIT = "_ut_tmp=1";

    static {
        t2o.a(962592804);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f98275b", new Object[0]);
        }
        return SDK_TYPE;
    }
}
