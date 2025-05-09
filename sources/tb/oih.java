package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class oih implements ioc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(487588005);
        t2o.a(487587959);
    }

    @Override // tb.ioc
    public String getNick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d48c0c0", new Object[]{this});
        }
        return Login.getOldNick();
    }

    @Override // tb.ioc
    public String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return Login.getOldUserId();
    }
}
