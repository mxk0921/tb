package tb;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class eql {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f18761a;
    public String b;
    public String c;
    public String d;
    public String e;
    public HashMap<String, String> f;
    public final Map<String, String> g = new HashMap();

    static {
        t2o.a(694157316);
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae010cce", new Object[]{str});
        }
        Matcher matcher = Pattern.compile("//a\\.(?:m|wapa|waptest)\\.(?:taobao|tmall)\\.com/sku(\\d+)\\.htm").matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        return this.f18761a;
    }

    public Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("426496e4", new Object[]{this});
        }
        return this.g;
    }

    public HashMap<String, String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("ad429794", new Object[]{this});
        }
        return this.f;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c61a6d7", new Object[]{this});
        }
        return this.b;
    }

    public static eql f(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eql) ipChange.ipc$dispatch("be2d204c", new Object[]{intent});
        }
        eql eqlVar = new eql();
        if (intent == null) {
            return eqlVar;
        }
        Uri data = intent.getData();
        HashMap<String, String> hashMap = new HashMap<>();
        if (data != null) {
            String b = b(data.toString());
            if (!TextUtils.isEmpty(b)) {
                eqlVar.f18761a = b;
            }
            String str = "";
            for (String str2 : data.getQueryParameterNames()) {
                String queryParameter = data.getQueryParameter(str2);
                if ("id".equals(str2) || "item_id".equals(str2)) {
                    eqlVar.f18761a = queryParameter;
                } else if (q2q.KEY_SKU_ID.equals(str2)) {
                    eqlVar.b = queryParameter;
                    str = str + "&skuId=" + queryParameter;
                } else if ("bizName".equals(str2)) {
                    eqlVar.c = queryParameter;
                    str = str + "&bizName=" + queryParameter;
                } else if ("exParams".equals(str2)) {
                    eqlVar.d = queryParameter;
                    str = str + "&exParams=" + queryParameter;
                } else {
                    hashMap.put(str2, queryParameter);
                }
            }
            if (!TextUtils.isEmpty(str)) {
                eqlVar.e = str.substring(1);
            }
        }
        if (TextUtils.isEmpty(eqlVar.f18761a)) {
            eqlVar.f18761a = intent.getStringExtra("id");
            if (TextUtils.isEmpty(eqlVar.a())) {
                eqlVar.f18761a = intent.getStringExtra("item_id");
            }
        }
        if (TextUtils.isEmpty(eqlVar.c)) {
            eqlVar.c = intent.getStringExtra("bizName");
        }
        if (TextUtils.isEmpty(eqlVar.d)) {
            eqlVar.d = intent.getStringExtra("exParams");
        }
        if (TextUtils.isEmpty(eqlVar.b)) {
            eqlVar.b = intent.getStringExtra(q2q.KEY_SKU_ID);
        }
        Bundle extras = intent.getExtras();
        if (extras != null && !extras.isEmpty()) {
            for (String str3 : extras.keySet()) {
                ((HashMap) eqlVar.g).put(str3, String.valueOf(extras.get(str3)));
            }
        }
        hashMap.put("itemNumId", eqlVar.a());
        eqlVar.f = hashMap;
        return eqlVar;
    }
}
