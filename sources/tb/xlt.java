package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xlt implements ky3<vlt> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f31464a;

    static {
        t2o.a(315621421);
        t2o.a(315621420);
    }

    public xlt(boolean z) {
        this.f31464a = z;
    }

    public final String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("452e1068", new Object[]{this, str});
        }
        if (!this.f31464a) {
            return str;
        }
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    public final String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2eab690", new Object[]{this, str});
        }
        if (!this.f31464a) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    /* renamed from: e */
    public dck a(vlt vltVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dck) ipChange.ipc$dispatch("80242120", new Object[]{this, vltVar});
        }
        Iterator it = vltVar.iterator();
        HashMap hashMap = new HashMap();
        String str = null;
        String str2 = null;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String c = c((String) entry.getKey());
            String c2 = c((String) entry.getValue());
            if (c.equals("x-ctx-tid")) {
                str2 = c2;
            } else if (c.equals("x-ctx-sid")) {
                str = c2;
            } else if (c.startsWith("x-ctx-bag_")) {
                hashMap.put(c.substring(10), c2);
            }
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new dck(str2, str, hashMap);
    }

    /* renamed from: f */
    public void b(dck dckVar, vlt vltVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a91a7710", new Object[]{this, dckVar, vltVar});
            return;
        }
        vltVar.put("x-ctx-tid", dckVar.b());
        vltVar.put("x-ctx-sid", dckVar.c());
        for (Map.Entry<String, String> entry : dckVar.a()) {
            vltVar.put(d("x-ctx-bag_" + entry.getKey()), d(entry.getValue()));
        }
    }
}
