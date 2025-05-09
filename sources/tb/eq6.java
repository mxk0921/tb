package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class eq6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FEATURES = "features";

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, a> f18757a = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        String a();

        void process(JSONObject jSONObject);
    }

    static {
        t2o.a(83886120);
    }

    public final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86bbab6c", new Object[]{this, jSONObject});
        } else if (jSONObject != null && jSONObject.containsKey("features")) {
            try {
                Set<String> keySet = jSONObject.getJSONObject("features").keySet();
                if (keySet != null && !keySet.isEmpty()) {
                    for (String str : keySet) {
                        a aVar = this.f18757a.get(str);
                        if (aVar != null) {
                            aVar.process(jSONObject);
                        }
                    }
                }
            } catch (Exception e) {
                UnifyLog.e("DataFeatureParser", e.toString());
            }
        }
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b94e3b0", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            try {
                for (Object obj : jSONObject.values()) {
                    if (obj instanceof JSONObject) {
                        a((JSONObject) obj);
                    }
                }
            } catch (Exception e) {
                UnifyLog.e("DataFeatureParser", e.toString());
            }
        }
    }

    public void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51b82bcd", new Object[]{this, aVar});
        } else if (aVar != null && !TextUtils.isEmpty(aVar.a())) {
            this.f18757a.put(aVar.a(), aVar);
        }
    }
}
