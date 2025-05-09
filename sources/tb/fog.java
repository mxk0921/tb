package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lightbuy.performance.LightBuyStage;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fog implements ekc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_GO_BACK = "goBack";

    /* renamed from: a  reason: collision with root package name */
    public final s6x f19439a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements dkc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ gog f19440a;
        public final /* synthetic */ gog b;

        public a(fog fogVar, gog gogVar, gog gogVar2) {
            this.f19440a = gogVar;
            this.b = gogVar2;
        }

        @Override // tb.dkc
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f54d05de", new Object[]{this, jSONObject});
                return;
            }
            if (jSONObject.get("mainResponse") != null) {
                hog.c().f(LightBuyStage.WEEX_REQ_INVOKED);
            }
            this.f19440a.invokeAndKeepAlive(jSONObject);
        }

        @Override // tb.dkc
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bfa9898a", new Object[]{this, str, str2});
            } else if (this.b != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", (Object) str);
                jSONObject.put("message", (Object) str2);
                this.b.invoke(jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f19441a;

        public b(JSONObject jSONObject) {
            this.f19441a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                fog.a(fog.this, this.f19441a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f19442a;

        public c(JSONObject jSONObject) {
            this.f19442a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                fog.a(fog.this, this.f19442a);
            }
        }
    }

    static {
        t2o.a(708837400);
        t2o.a(708837398);
        t2o.a(708837399);
    }

    public fog(s6x s6xVar) {
        this.f19439a = s6xVar;
        qap.a().c(this);
    }

    public static /* synthetic */ void a(fog fogVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25dc586a", new Object[]{fogVar, jSONObject});
        } else {
            fogVar.e(jSONObject);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public final Context c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        s6x s6xVar = this.f19439a;
        if (s6xVar != null) {
            return s6xVar.b();
        }
        return null;
    }

    public void d(JSONObject jSONObject, gog gogVar, gog gogVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cd9b959", new Object[]{this, jSONObject, gogVar, gogVar2});
            return;
        }
        Log.e("MessageChannel", "onReceiveMessage event = getInitData");
        ck.g().f("onReceiveMessage event = getInitData", ck.b.b().l("MessageChannel").i("LightBuy/event").g("receive", "getInitData").a());
        if (!(jSONObject == null || TextUtils.isEmpty(jSONObject.getString("failTest")) || gogVar2 == null)) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", (Object) "code");
            jSONObject2.put("message", (Object) "message");
            gogVar2.invoke(jSONObject2);
        }
        hog.c().f(LightBuyStage.WEEX_REQ_INVOKED);
        if (c() != null) {
            cog.f().b(c(), new a(this, gogVar, gogVar2));
        }
    }

    public final void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc20f54a", new Object[]{this, jSONObject});
        } else if (!"auraEvent".equalsIgnoreCase(jSONObject.getString("event"))) {
            ck.g().d("invokeAuraEvent event is not auraEventNotification");
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("param");
            if (jSONObject2 == null) {
                ck.g().d("invokeAuraEvent param is null");
                return;
            }
            String string = jSONObject2.getString("type");
            if (TextUtils.isEmpty(string)) {
                ck.g().d("invokeAuraEvent eventType is null");
                return;
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject("fields");
            if (c() instanceof lud) {
                ((lud) c()).q2(string, jSONObject3);
            }
        }
    }

    public boolean f(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48824de9", new Object[]{this, str, jSONObject})).booleanValue();
        }
        if (this.f19439a == null) {
            return true;
        }
        str.hashCode();
        if (str.equals("goBack")) {
            return this.f19439a.c();
        }
        this.f19439a.a(str, jSONObject);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
        if (r11.equals("closePage") == false) goto L_0x0072;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(java.lang.String r11, com.alibaba.fastjson.JSONObject r12, tb.gog r13) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fog.g(java.lang.String, com.alibaba.fastjson.JSONObject, tb.gog):void");
    }
}
