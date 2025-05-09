package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xha {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699391);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d95235b", new Object[]{str, str2});
        } else if (kkr.i().o() != null) {
            kkr.i().o().c("search_back", b(str, str2));
        }
    }

    public static HashMap<String, String> b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("f3528c2c", new Object[]{str, str2});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("feed_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put(z9u.KEY_ACCOUNT_ID, str2);
        }
        return hashMap;
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4bcfd9", new Object[]{str, str2});
        } else if (kkr.i().o() != null) {
            kkr.i().o().c("search_delete", b(str, str2));
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6709217", new Object[]{str, str2});
        } else if (kkr.i().o() != null) {
            kkr.i().o().c("search_cancel", b(str, str2));
        }
    }

    public static void e(String str, String str2, boolean z) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca8cfeec", new Object[]{str, str2, new Boolean(z)});
        } else if (kkr.i().o() != null) {
            HashMap<String, String> b = b(str, str2);
            if (z) {
                str3 = "searchpage";
            } else {
                str3 = "searchkeyboard";
            }
            b.put("from", str3);
            kkr.i().o().c("search_confirm", b);
        }
    }

    public static void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6578019", new Object[]{str, str2});
        } else if (kkr.i().o() != null) {
            kkr.i().o().c("search_entry", b(str, str2));
        }
    }

    public static void g(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("695f70a9", new Object[]{str, str2, jSONObject});
        } else if (kkr.i().o() != null) {
            HashMap<String, String> b = b(str, str2);
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                b.put(entry.getKey(), entry.getValue() + "");
            }
            kkr.i().o().b("Show-GoodListOpenUrl", b);
        }
    }

    public static void h(String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578ccfdd", new Object[]{str, str2, new Boolean(z), new Boolean(z2)});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("gl_search_id", str);
        hashMap.put("searchKeyWord", str2);
        String str3 = "1";
        hashMap.put("searchType", z ? "2" : str3);
        if (!z2) {
            str3 = "0";
        }
        hashMap.put("searchResult", str3);
        if (kkr.i().o() != null) {
            kkr.i().o().b("Show-search_result", hashMap);
        }
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49334125", new Object[]{str, str2});
        } else if (kkr.i().o() != null) {
            kkr.i().o().b("Show-search_view", b(str, str2));
        }
    }
}
