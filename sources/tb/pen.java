package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class pen implements a5m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792217);
    }

    @Override // tb.a5m
    public String getNick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d48c0c0", new Object[]{this});
        }
        return Login.getNick();
    }
}
