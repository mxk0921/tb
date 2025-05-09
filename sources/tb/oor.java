package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.Login;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class oor implements koc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final oor INSTANCE = new oor();

    @Override // tb.koc
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87f5e75d", new Object[]{this});
        }
        String userId = Login.getUserId();
        ckf.f(userId, "Login.getUserId()");
        return userId;
    }

    @Override // tb.koc
    public boolean isLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfb0d96a", new Object[]{this})).booleanValue();
        }
        return Login.checkSessionValid();
    }
}
