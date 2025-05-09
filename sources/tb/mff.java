package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.favorite.FavoriteConstants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mff {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262803);
    }

    public static void a(Intent intent, String str) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f83ecfa", new Object[]{intent, str});
        } else if (intent != null && !TextUtils.isEmpty(str) && (data = intent.getData()) != null && TextUtils.isEmpty(data.getQueryParameter("id"))) {
            intent.setData(data.buildUpon().appendQueryParameter("id", str).build());
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae5b790d", new Object[]{str});
        }
        String[] strArr = {"[?|&]item_id=(\\d+)", "[?|&]itemId=(\\d+)", "[?|&]item_num_id=(\\d+)", "[?|&]itemNumId=(\\d+)", "[?|&]id=(\\d+)"};
        for (int i = 0; i < 5; i++) {
            Matcher matcher = Pattern.compile(strArr[i]).matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("762cbdb1", new Object[]{str});
        }
        Matcher matcher = Pattern.compile("//a\\.(?:m|wapa|waptest)\\.(?:taobao|tmall)\\.com/i(\\d+)\\.htm").matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        Matcher matcher2 = Pattern.compile("//a\\.(?:m|wapa|waptest)\\.(?:taobao|tmall)\\.com.*[?|&](?:id|item_id)=(\\d+)").matcher(str);
        if (matcher2.find()) {
            return matcher2.group(1);
        }
        return null;
    }

    public static String d(Intent intent) {
        String str;
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16056cd", new Object[]{intent});
        }
        String stringExtra = intent.getStringExtra(FavoriteConstants.DetailConstants_DETAIL_URL);
        if (stringExtra != null) {
            str = e(stringExtra);
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            String dataString = intent.getDataString();
            if (!TextUtils.isEmpty(dataString)) {
                str = e(dataString);
            }
        }
        if (TextUtils.isEmpty(str) && (data = intent.getData()) != null && !TextUtils.isEmpty(data.getPath())) {
            Matcher matcher = Pattern.compile("/i(\\d+)\\.htm").matcher(data.getPath());
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return str;
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9f1aa79", new Object[]{str});
        }
        String c = c(str);
        if (c != null) {
            return c;
        }
        return b(str);
    }

    public static String f(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b2f8d92", new Object[]{intent});
        }
        String stringExtra = intent.getStringExtra("id");
        if (!TextUtils.isEmpty(stringExtra)) {
            return stringExtra;
        }
        String stringExtra2 = intent.getStringExtra("item_id");
        if (!TextUtils.isEmpty(stringExtra2)) {
            return stringExtra2;
        }
        String d = d(intent);
        if (d == null) {
            return "";
        }
        return d;
    }

    public static String g(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66107ee3", new Object[]{intent});
        }
        String stringExtra = intent.getStringExtra("singleUseCache");
        return (!TextUtils.isEmpty(stringExtra) || (data = intent.getData()) == null) ? stringExtra : data.getQueryParameter("singleUseCache");
    }
}
