package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.Utils;
import com.taobao.android.behavix.service.BUFS;
import com.taobao.android.ucp.bridge.NativeBroadcast;
import com.tmall.android.dai.DAI;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class me4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXCEPTION = "exception";
    public static final String WALLE_WRONG = "walle_wrong";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements f45 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ke4 f23987a;
        public final /* synthetic */ String b;

        public a(ke4 ke4Var, String str) {
            this.f23987a = ke4Var;
            this.b = str;
        }

        @Override // tb.f45
        public void a(boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24bed594", new Object[]{this, new Boolean(z), map});
                return;
            }
            JSONObject jSONObject = new JSONObject(map);
            if (z) {
                this.f23987a.b(this.b, jSONObject);
            } else {
                this.f23987a.a(this.b, me4.WALLE_WRONG, JSON.toJSONString(map.get("error")), jSONObject);
            }
        }
    }

    static {
        t2o.a(404750640);
    }

    public static void a(boolean z, String str, String str2, Map<String, Object> map, ke4 ke4Var) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64d59483", new Object[]{new Boolean(z), str, str2, map, ke4Var});
            return;
        }
        try {
            if (!Utils.c()) {
                NativeBroadcast.sendMessageFromJava(NativeBroadcast.FORCE_SAVE_DATA_TO_DB, null, null);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("_walle_bizname", str);
            a aVar = new a(ke4Var, str2);
            map.put("bxFeature", BUFS.getFeature(new BUFS.QueryArgs(), str2, "UCP", "UCP"));
            if (z) {
                DAI.runComputeByAlias(str2, map, aVar, hashMap);
            } else {
                DAI.runCompute(str2, map, aVar, hashMap);
            }
        } catch (Exception e) {
            ke4Var.a(str2, "exception", e.getMessage(), new JSONObject());
            if (z) {
                str3 = "ByAlias";
            } else {
                str3 = "";
            }
            q82.f("runCompute".concat(str3), str2, null, e);
        }
    }

    public static void b(String str, String str2, Map<String, Object> map, ke4 ke4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("925dbe9c", new Object[]{str, str2, map, ke4Var});
        } else {
            a(false, str, str2, map, ke4Var);
        }
    }

    public static void c(String str, String str2, Map<String, Object> map, ke4 ke4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e40237b", new Object[]{str, str2, map, ke4Var});
        } else {
            a(true, str, str2, map, ke4Var);
        }
    }
}
