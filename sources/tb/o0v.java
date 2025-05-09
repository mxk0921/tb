package tb;

import android.text.TextUtils;
import com.ali.user.mobile.login.LoginFrom;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.TokenType;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o0v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(69206256);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce51a79f", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String str2 = str.toLowerCase() + TokenType.LOGIN;
        if (TextUtils.equals(tn1.KEY_SHARE_CONFIG_WEIXIN, str)) {
            return LoginType.LocalLoginType.LOGIN_TYPE_WEIXIN;
        }
        if (TextUtils.equals("qq", str)) {
            return LoginType.LocalLoginType.LOGIN_TYPE_QQ;
        }
        return TextUtils.equals("alipay3", str) ? LoginType.LocalLoginType.LOGIN_TYPE_ALIPAY : str2;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b92e8926", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String str2 = str.toLowerCase() + TokenType.LOGIN;
        if (TextUtils.equals(tn1.KEY_SHARE_CONFIG_WEIXIN, str)) {
            return LoginType.LocalLoginType.LOGIN_TYPE_WEIXIN;
        }
        if (TextUtils.equals("qq", str)) {
            return LoginType.LocalLoginType.LOGIN_TYPE_QQ;
        }
        return TextUtils.equals("wangyi_mail", str) ? LoginType.LocalLoginType.LOGIN_TYPE_NETEASE : str2;
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6884b042", new Object[]{str});
        } else if (LoginType.ServerLoginType.LoginTypeQQ.getType().equals(str)) {
            LoginFrom.setCurrentLoginFrom("3");
        } else if (LoginType.ServerLoginType.LoginTypeWeibo.getType().equals(str)) {
            LoginFrom.setCurrentLoginFrom("2");
        } else if (LoginType.ServerLoginType.LoginTypeWeixin.getType().equals(str)) {
            LoginFrom.setCurrentLoginFrom("1");
        } else if ("alipay".equals(str)) {
            LoginFrom.setCurrentLoginFrom("7");
        } else if (LoginType.ServerLoginType.TaobaoSSOLogin.getType().equals(str)) {
            LoginFrom.setCurrentLoginFrom("6");
        }
    }
}
