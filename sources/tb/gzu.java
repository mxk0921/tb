package tb;

import android.text.TextUtils;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gzu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, String> f20331a;
    public long b;

    public gzu(String str, String str2) {
        this.f20331a = new HashMap<>();
        a(str2);
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f16f68c", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.b = jSONObject.getLong("bucketId");
                JSONObject jSONObject2 = jSONObject.getJSONObject("config");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    this.f20331a.put(next, jSONObject2.getString(next));
                }
            } catch (JSONException e) {
                ALog.e("falco.UTABTestInfo", "parseJson error.", null, e, new Object[0]);
            }
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bucketId", this.b);
            JSONObject jSONObject2 = new JSONObject();
            for (String str : this.f20331a.keySet()) {
                jSONObject2.put(str, this.f20331a.get(str));
            }
            jSONObject.put("config", jSONObject2);
        } catch (JSONException e) {
            ALog.e("falco.UTABTestInfo", "toJson error.", null, e, new Object[0]);
        }
        return jSONObject.toString();
    }

    public gzu(String str) {
        this(str, null);
    }
}
