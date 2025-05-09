package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.multiapp.ShareBizAdapter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class lwr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(664797285);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45630b72", new Object[0]);
        }
        return String.format("%s_%d", ShareBizAdapter.getInstance().getLogin().getUserId(), Long.valueOf(System.currentTimeMillis()));
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa6b36fb", new Object[]{str, str2});
        }
        try {
            int indexOf = str.indexOf("_", str.indexOf("_", str.indexOf("_") + 1) + 1);
            if (indexOf > 0) {
                StringBuilder sb = new StringBuilder(str);
                StringBuilder insert = sb.insert(indexOf, "#" + str2);
                insert.append("_0");
                return insert.toString();
            }
            fwr.b("AmpUtil", "index invalid");
            return null;
        } catch (Exception e) {
            fwr.b("AmpUtil", e.toString());
            return null;
        }
    }

    public static String c(bis bisVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c3e069f", new Object[]{bisVar});
        }
        String queryParameter = Uri.parse(bisVar.c).getQueryParameter("ut_sk");
        if (TextUtils.isEmpty(queryParameter)) {
            return "";
        }
        String[] split = queryParameter.split("\\.");
        if (split.length < 3) {
            return "";
        }
        String str = split[2];
        return split[2];
    }
}
