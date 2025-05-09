package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class u3t {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final u3t INSTANCE = new u3t();

    static {
        t2o.a(1003487280);
    }

    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8b51b87", new Object[]{this, str});
        }
        if (tvr.c(str)) {
            return "";
        }
        return "ID:" + str;
    }
}
