package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class psj implements adt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RESULT_FAILURE = "0";
    public static final String RESULT_SUCCESS = "1";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26272a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;
        public final /* synthetic */ Map d;
        public final /* synthetic */ int e;

        public a(String str, String str2, int i, Map map, int i2) {
            this.f26272a = str;
            this.b = str2;
            this.c = i;
            this.d = map;
            this.e = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                t7j.b(this.f26272a, this.b, this.c, this.d, this.e);
            }
        }
    }

    static {
        t2o.a(1034944716);
        t2o.a(1034944593);
    }

    @Override // tb.adt
    public Map<String, String> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e53be4f", new Object[]{this, map});
        }
        String str = map.get("syncType");
        String str2 = map.get("url");
        int parseInt = Integer.parseInt(map.get("timeout")) * 1000;
        JSONObject parseObject = JSON.parseObject(map.get(PushConstants.PARAMS));
        String str3 = map.get("apiVersion");
        int parseInt2 = Integer.parseInt(map.get("methodType"));
        HashMap hashMap = new HashMap();
        hashMap.put("success", "1");
        if (!map.get("requestType").equals("1")) {
            lu0.d("DAI", 19999, "Net_Request_Only_Support_Mtop", str2, null, null);
            hashMap.put("success", "0");
            return hashMap;
        } else if (!str.equals("1")) {
            return t7j.b(str2, str3, parseInt, parseObject, parseInt2);
        } else {
            t45.c().e(new a(str2, str3, parseInt, parseObject, parseInt2));
            return hashMap;
        }
    }
}
