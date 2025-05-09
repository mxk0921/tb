package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class v4v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1032847457);
    }

    public static void a(Activity activity, fs0 fs0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5773880", new Object[]{activity, fs0Var});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(activity, "Page_EDLP");
            HashMap hashMap = new HashMap();
            if (fs0Var == null) {
                hashMap.put("scm", "1007.tabbar.edlp.backup");
            } else {
                JSONObject jSONObject = fs0Var.q;
                if (jSONObject != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!TextUtils.equals(next, "spm")) {
                            hashMap.put(next, fs0Var.q.getString(next));
                        }
                    }
                }
            }
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(activity, hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("spm-url", (String) hashMap.get("spm"));
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(hashMap2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static String[] b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("1efdaaae", new Object[]{jSONObject});
        }
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList.add(next.concat("=").concat(jSONObject.get(next).toString()));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static void c(fs0 fs0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b30e6657", new Object[]{fs0Var});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            if (fs0Var == null) {
                hashMap.put("spm-url", "a2141.1.tabbar.edlp_backup");
            } else {
                JSONObject jSONObject = fs0Var.q;
                if (jSONObject != null) {
                    hashMap.put("spm-url", jSONObject.getString("spm"));
                }
            }
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(hashMap);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
