package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.push.model.ClientCtlInfo;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.VideoStatus;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lu3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699642);
    }

    public static boolean a(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ebc69fb", new Object[]{ux9Var})).booleanValue();
        }
        if (ux9Var == null || ux9Var.g() == null || ux9Var.g().a() == null || up6.d0(ux9Var) == null) {
            return true;
        }
        VideoInfo a2 = ux9Var.g().a();
        boolean equals = TextUtils.equals(a2.roomStatus, "2");
        boolean equals2 = up6.d0(ux9Var).equals(VideoStatus.VIDEO_TIMESHIFT_STATUS);
        boolean isOfficialLive = a2.isOfficialLive();
        o3s.b("ClientControlUtils", "isReplay: " + equals + ", isKandian: " + equals2 + ", isOfficialLive: " + isOfficialLive);
        if (equals || equals2 || isOfficialLive) {
            return true;
        }
        return false;
    }

    public static boolean b(Context context, ux9 ux9Var, ClientCtlInfo clientCtlInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("435609d0", new Object[]{context, ux9Var, clientCtlInfo})).booleanValue();
        }
        if (context == null || ux9Var == null || ux9Var.g() == null || a(ux9Var)) {
            return false;
        }
        VideoInfo a2 = ux9Var.g().a();
        if (!e(context, clientCtlInfo) || !c(a2, clientCtlInfo) || !h("liveRoom", clientCtlInfo)) {
            return false;
        }
        return true;
    }

    public static boolean c(VideoInfo videoInfo, ClientCtlInfo clientCtlInfo) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90542684", new Object[]{videoInfo, clientCtlInfo})).booleanValue();
        }
        if (clientCtlInfo == null) {
            return true;
        }
        if (videoInfo == null) {
            return false;
        }
        AccountInfo accountInfo = videoInfo.broadCaster;
        if (accountInfo == null) {
            str = null;
        } else {
            str = accountInfo.accountId;
        }
        String str2 = clientCtlInfo.anchorId;
        o3s.b("ClientControlUtils", "curAnchorId: " + str);
        return d(str, str2);
    }

    public static boolean d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1dc4ffe0", new Object[]{str, str2})).booleanValue();
        }
        Boolean g = g(str, str2);
        if (g == null) {
            return TextUtils.equals(str, str2);
        }
        return g.booleanValue();
    }

    public static boolean e(Context context, ClientCtlInfo clientCtlInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8918acd8", new Object[]{context, clientCtlInfo})).booleanValue();
        }
        if (clientCtlInfo == null) {
            return true;
        }
        String d = w2s.d(context);
        String str = clientCtlInfo.taobaoAndroidVersion;
        o3s.b("ClientControlUtils", "curAppVer: " + d);
        return f(d, str);
    }

    public static boolean f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84e2a64c", new Object[]{str, str2})).booleanValue();
        }
        Boolean g = g(str, str2);
        if (g != null) {
            return g.booleanValue();
        }
        if (w2s.b(str, str2) >= 0) {
            return true;
        }
        return false;
    }

    public static Boolean g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("52c2782b", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return Boolean.FALSE;
        }
        if (TextUtils.isEmpty(str2)) {
            return Boolean.TRUE;
        }
        return null;
    }

    public static boolean h(String str, ClientCtlInfo clientCtlInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b33f92b", new Object[]{str, clientCtlInfo})).booleanValue();
        }
        if (clientCtlInfo == null) {
            return true;
        }
        return d(str, clientCtlInfo.pushScene);
    }
}
