package tb;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b9x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(982515967);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("21ab2158", new Object[]{str});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            Uri parse = Uri.parse(str);
            StringBuilder sb = new StringBuilder();
            if (parse.isHierarchical()) {
                sb.append(parse.getScheme());
                sb.append(HttpConstant.SCHEME_SPLIT);
                sb.append(parse.getHost());
                sb.append(parse.getPath());
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("500f2a51", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        if (!parse.isHierarchical()) {
            return str;
        }
        return parse.getHost() + parse.getPath();
    }

    public static Pair<String, String> c(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("f836f057", new Object[]{str});
        }
        try {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter(uyv.WX_TPL);
            if (queryParameter == null) {
                queryParameter = parse.getQueryParameter("_mus_tpl");
            }
            if (queryParameter == null) {
                str2 = parse.buildUpon().clearQuery().build().toString();
            } else {
                str2 = Uri.parse(queryParameter).buildUpon().clearQuery().build().toString();
            }
            return new Pair<>(str, str2);
        } catch (Exception unused) {
            return new Pair<>(str, str);
        }
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a6c975e", new Object[]{str});
        }
        try {
            return Uri.parse(str).buildUpon().clearQuery().build().toString();
        } catch (Exception unused) {
            return "<invalidUrl>";
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13781df6", new Object[0]);
        }
    }
}
