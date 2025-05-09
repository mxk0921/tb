package tb;

import androidx.core.app.NotificationCompat;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.uem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ndm implements hdb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_SHOW = "show";
    public static final a Companion = new a(null);
    public static final String SHOWPOPLAYER = "-7983307011926955783";

    /* renamed from: a  reason: collision with root package name */
    public final String f24661a = "onClose";
    public final String b = "onDisPlayed";
    public final String c = "onDisPlayFailed";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(786432047);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements uem.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ vq b;
        public final /* synthetic */ String c;

        public b(JSONObject jSONObject, String str, vq vqVar, String str2) {
            this.b = vqVar;
            this.c = str2;
        }

        @Override // tb.uem.b
        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30005e67", new Object[]{this, str, str2, str3});
                return;
            }
            vq vqVar = this.b;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, this.c);
            jSONObject.put((JSONObject) str, str);
            xhv xhvVar = xhv.INSTANCE;
            vqVar.c(new FinishResult(jSONObject, ndm.c(ndm.this)));
        }

        @Override // tb.uem.b
        public void b(String str, boolean z, boolean z2, String str2, String str3) {
            String str4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e12c310", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2, str3});
                return;
            }
            JSONObject a2 = ndm.a(ndm.this, str, this.c, str2, str3);
            ndm ndmVar = ndm.this;
            if (z2) {
                str4 = ndm.b(ndmVar);
            } else {
                str4 = ndm.d(ndmVar);
            }
            this.b.c(new FinishResult(a2, str4));
        }

        @Override // tb.uem.b
        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("42b06e87", new Object[]{this, str});
            } else {
                this.b.c(new FinishResult(ndm.a(ndm.this, "onTriggerFailed", this.c, str, null), ndm.d(ndm.this)));
            }
        }
    }

    static {
        t2o.a(786432046);
        t2o.a(144703491);
    }

    public static final /* synthetic */ JSONObject a(ndm ndmVar, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cf688cbb", new Object[]{ndmVar, str, str2, str3, str4});
        }
        return ndmVar.e(str, str2, str3, str4);
    }

    public static final /* synthetic */ String b(ndm ndmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4bb5731c", new Object[]{ndmVar});
        }
        return ndmVar.f24661a;
    }

    public static final /* synthetic */ String c(ndm ndmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65a4f405", new Object[]{ndmVar});
        }
        return ndmVar.b;
    }

    public static final /* synthetic */ String d(ndm ndmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff0199aa", new Object[]{ndmVar});
        }
        return ndmVar.c;
    }

    public final JSONObject e(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8226510e", new Object[]{this, str, str2, str3, str4});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "popIndexId", str);
        jSONObject.put((JSONObject) NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, str2);
        jSONObject.put((JSONObject) "reason", str3);
        jSONObject.put((JSONObject) "subReason", str4);
        return jSONObject;
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        if (str.hashCode() != 3529469 || !str.equals("show")) {
            return ErrorResult.a.Companion.a("Api Not Found");
        }
        Object obj = map.get("param");
        if (!(obj instanceof JSONObject)) {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        String w = MegaUtils.w(map, "traceInfo", null);
        String w2 = MegaUtils.w(map, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, null);
        if (w2 == null || w2.length() == 0) {
            vqVar.b(ErrorResult.a.Companion.g("Uri Is Empty"));
            return null;
        }
        uem.m(w2, jSONObject != null ? jSONObject.toString() : null).k(w).j(new b(jSONObject, w, vqVar, w2)).l();
        return null;
    }
}
