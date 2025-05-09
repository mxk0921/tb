package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class srv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1029701676);
    }

    public static final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50459f95", new Object[0]);
        }
        return Login.getNick();
    }

    public static final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea2ce1f", new Object[0]);
        }
        return Login.getUserId();
    }
}
