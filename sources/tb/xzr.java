package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.helper.RequestConfig;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xzr implements xjd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Intent f31745a;
    public final Context b;

    static {
        t2o.a(725614610);
        t2o.a(725614596);
    }

    public xzr(Activity activity) {
        this.b = activity;
        this.f31745a = activity.getIntent();
    }

    public final Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8df17875", new Object[]{this});
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put(Uri.decode("appName"), "tborder");
        hashMap.put(Uri.decode("appVersion"), "1.0");
        return hashMap;
    }

    public final JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3e68ff7a", new Object[]{this});
        }
        String stringExtra = this.f31745a.getStringExtra("openFrom");
        String stringExtra2 = this.f31745a.getStringExtra("pageType");
        Uri data = this.f31745a.getData();
        if (data != null) {
            stringExtra = TextUtils.isEmpty(stringExtra) ? data.getQueryParameter("openFrom") : null;
            stringExtra2 = TextUtils.isEmpty(stringExtra2) ? data.getQueryParameter("pageType") : null;
        }
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(stringExtra)) {
            jSONObject.put("openFrom", (Object) stringExtra);
        }
        if (!TextUtils.isEmpty(stringExtra2)) {
            jSONObject.put("pageType", (Object) stringExtra2);
        }
        return jSONObject;
    }

    public final Map<String, String> c(Uri uri) {
        String str;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6059a90", new Object[]{this, uri});
        }
        if (uri == null || uri.isOpaque()) {
            return new HashMap();
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            String substring = encodedQuery.substring(i, indexOf2);
            if (indexOf2 < indexOf) {
                str = encodedQuery.substring(indexOf2 + 1, indexOf);
            } else {
                str = "";
            }
            hashMap.put(Uri.decode(substring), Uri.decode(str));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return hashMap;
    }

    public final Map<String, String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ce7e99fb", new Object[]{this});
        }
        Map<String, String> c = c(this.f31745a.getData());
        c.putAll(a());
        return c;
    }

    public Map<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ccd865d3", new Object[]{this});
        }
        return d();
    }

    public Map<String, String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7d5852b0", new Object[]{this});
        }
        Map<String, String> d = d();
        d.putAll(RequestConfig.l(this.b));
        d.putAll(RequestConfig.k(this.b, b()));
        return d;
    }

    public Map<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("dd9a9888", new Object[]{this});
        }
        return d();
    }
}
