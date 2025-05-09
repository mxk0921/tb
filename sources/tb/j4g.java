package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.services.IBaseService;
import com.taobao.alimama.services.LoginInfo;
import com.taobao.alimama.services.a;
import com.taobao.muniontaobaosdk.util.TaoLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class j4g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1019215908);
    }

    public static void a(String str, String... strArr) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3677ac1", new Object[]{str, strArr});
            return;
        }
        LoginInfo lastLoginUserInfo = ((loc) a.e().a(IBaseService.Names.SERVICE_LOGIN.name())).getLastLoginUserInfo();
        if (lastLoginUserInfo == null || !lastLoginUserInfo.isValid()) {
            str2 = "";
            str3 = str2;
        } else {
            str2 = lastLoginUserInfo.nickname;
            str3 = lastLoginUserInfo.userId;
        }
        String name = Thread.currentThread().getName();
        String join = TextUtils.join(",", strArr);
        TaoLog.Logi("O2OAdSdk", "[step=" + str + ",th=" + name + ",ver=5.15.27,user=" + str2 + ",uid=" + str3 + "] args: " + join);
    }
}
