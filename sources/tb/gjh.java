package tb;

import android.text.TextUtils;
import com.ali.user.mobile.model.TokenType;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.Login;
import com.taobao.tao.Globals;
import com.ut.device.UTDevice;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gjh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705628);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[0]);
        }
        String userId = Login.getUserId();
        String utdid = UTDevice.getUtdid(Globals.getApplication());
        if (TextUtils.isEmpty(userId)) {
            odg.c(TokenType.LOGIN, "Login.getUserId() is empty");
            f4v.b("Page_UmiPublish", "Login_UserId_Empty", null);
        } else {
            f4v.b("Page_UmiPublish", "Login_UserId_Not_Empty", null);
        }
        if (!TextUtils.isEmpty(userId)) {
            return userId;
        }
        if (!TextUtils.isEmpty(utdid)) {
            return utdid;
        }
        return "default";
    }
}
