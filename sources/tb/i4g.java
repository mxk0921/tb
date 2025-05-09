package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.login.LoginManager;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.utils.ILoginInfoGetter;
import com.taobao.utils.LoginInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class i4g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1017118838);
    }

    public static void a(String str, String... strArr) {
        String str2;
        String str3;
        LoginInfo lastLoginUserInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3677ac1", new Object[]{str, strArr});
            return;
        }
        ILoginInfoGetter a2 = LoginManager.a();
        if (a2 == null || (lastLoginUserInfo = a2.getLastLoginUserInfo()) == null || !lastLoginUserInfo.isValid()) {
            str2 = "";
            str3 = str2;
        } else {
            str2 = lastLoginUserInfo.nickname;
            str3 = lastLoginUserInfo.userId;
        }
        String name = Thread.currentThread().getName();
        String join = TextUtils.join(";", vm2.i());
        String join2 = TextUtils.join(",", strArr);
        TaoLog.Logi("AlimamaSdk", "[step=" + str + ",th=" + name + ",ver=5.15.27,user=" + str2 + ",uid=" + str3 + ",bkt=" + join + "] args: " + join2);
        d4g.e().a(str, strArr);
        UserTrackLogs.trackDebugLog(str, strArr);
    }
}
