package tb;

import androidx.appcompat.taobao.util.Globals;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.multiapp.ShareBizAdapter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qjp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(665845951);
    }

    public static String a(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1086f4ad", new Object[]{str, str2});
        }
        c4d orangeDefaultValueHelper = ShareBizAdapter.getInstance().getOrangeDefaultValueHelper();
        if (orangeDefaultValueHelper == null) {
            str3 = null;
        } else {
            str3 = orangeDefaultValueHelper.a(str, str2);
        }
        return OrangeConfig.getInstance().getConfig(str, str2, str3);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8cafcf4", new Object[0])).booleanValue();
        }
        try {
            if (!c()) {
                return true;
            }
            return "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "gpFetchClipboardEnable", "false"));
        } catch (Throwable unused) {
            return true;
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9c270a6", new Object[0])).booleanValue();
        }
        String string = Globals.getApplication().getString(Globals.getApplication().getResources().getIdentifier("ttid", "string", "com.taobao.taobao"));
        fwr.d("ttid=" + string);
        return "212200".equals(string) || "36400112278902".equals(string);
    }
}
