package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ryu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f27684a = new HashMap();
    public String b = "";

    static {
        t2o.a(760217692);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3009a38f", new Object[]{this});
        }
        return this.b;
    }

    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("44c520f9", new Object[]{this});
        }
        return this.f27684a;
    }

    public final Map<String, String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("128742f1", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        if (str == null) {
            return hashMap;
        }
        for (String str2 : str.split("&")) {
            String[] split = str2.split("=", 2);
            if (split.length >= 2) {
                hashMap.put(split[0], split[1]);
            }
        }
        return hashMap;
    }

    public void d(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4abe8aa", new Object[]{this, uri});
        } else if (uri != null) {
            String query = uri.getQuery();
            if (!TextUtils.isEmpty(query)) {
                this.b = query;
                this.f27684a = c(query);
            }
        }
    }
}
