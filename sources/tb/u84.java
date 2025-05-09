package tb;

import com.alipay.android.msp.framework.dynfun.TplMsg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class u84 extends t84 {
    public static <T extends Comparable<? super T>> T b(T t, T t2) {
        ckf.g(t, "a");
        ckf.g(t2, TplMsg.VALUE_T_NATIVE_RETURN);
        if (t.compareTo(t2) >= 0) {
            return t;
        }
        return t2;
    }
}
