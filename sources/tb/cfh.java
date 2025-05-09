package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import tb.x2r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class cfh implements x2r.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static cfh b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f17027a = Collections.synchronizedMap(new HashMap());

    static {
        t2o.a(962592894);
        t2o.a(962592825);
    }

    public cfh() {
        x2r.f().i("loglevel", this);
        a("loglevel", x2r.f().e("loglevel"));
    }

    public static synchronized cfh c() {
        synchronized (cfh.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cfh) ipChange.ipc$dispatch("6f4c25d1", new Object[0]);
            }
            if (b == null) {
                b = new cfh();
            }
            return b;
        }
    }

    @Override // tb.x2r.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4813d18a", new Object[]{this, str, str2});
            return;
        }
        this.f17027a.clear();
        if (!TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString)) {
                        this.f17027a.put(next, optString);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55102237", new Object[]{this, str});
        }
        return this.f17027a.get(str);
    }

    public String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb391159", new Object[]{this, str});
        }
        String b2 = b(str);
        if (!TextUtils.isEmpty(b2)) {
            return b2;
        }
        return "3";
    }
}
