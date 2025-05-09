package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class twr implements jrd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989855759);
        t2o.a(989855841);
    }

    @Override // tb.jrd
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be105e32", new Object[]{this});
        }
        String userId = Login.getUserId();
        if (userId == null) {
            return "";
        }
        return userId;
    }
}
