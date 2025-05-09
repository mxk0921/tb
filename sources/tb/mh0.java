package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.utils.lang3.ObjectUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mh0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f24035a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24036a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f24036a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                kh0.b(this.f24036a, this.b);
            }
        }
    }

    static {
        t2o.a(729809725);
    }

    public static JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3a613b55", new Object[]{str});
        }
        Map<String, String> map = f24035a;
        String str2 = (String) ((HashMap) map).get(str);
        if (str2 == null) {
            str2 = kh0.a(str, "");
            ((HashMap) map).put(str, str2);
        }
        return JSON.parseObject(str2);
    }

    public static void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7467808", new Object[]{map});
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            HashMap hashMap = (HashMap) f24035a;
            if (!ObjectUtils.b((String) hashMap.get(key), value)) {
                c(key, value);
                hashMap.putAll(map);
            }
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b6c0efa", new Object[]{str, str2});
        } else {
            m5a.a().e(new a(str, str2));
        }
    }
}
