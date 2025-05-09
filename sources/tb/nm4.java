package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.hhc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nm4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MAIN_BIZ_NAME = "Page_Home_Container";
    public static final String TAG_ID = "container";
    public static final String TAG_VERSION = "1.0";
    public static final String UMBRELLA_CURRENT_CONTAINER_TYPE = "containerType";
    public static final String UMBRELLA_CURRENT_URL = "pageUrl";

    /* renamed from: a  reason: collision with root package name */
    public final hhc f24821a;
    public final hhc.a b;
    public final String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements hhc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.hhc.a
        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("70020a6e", new Object[]{this});
            }
            return "commitFailureMonitorPoint";
        }

        @Override // tb.hhc.a
        public void b(String str, JSONObject jSONObject, hhc.a.AbstractC0939a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2afe60b", new Object[]{this, str, jSONObject, aVar});
            } else if (jSONObject == null) {
                ((mvf) aVar).c("jsParams == null");
            } else {
                mdv.INSTANCE.b("webShow", jSONObject.getString("errorCode"), jSONObject.getString("errorMsg"), nm4.a(nm4.this), jSONObject.getString("pageType"), jSONObject.getString("pageUrl"));
                ((mvf) aVar).d("当前稳定性埋点上报成功");
            }
        }
    }

    static {
        t2o.a(490733592);
    }

    public nm4(hhc hhcVar, String str) {
        this.f24821a = hhcVar;
        this.c = str;
        hhc.a b = b();
        this.b = b;
        hhcVar.a(b);
    }

    public static /* synthetic */ String a(nm4 nm4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7cc7273d", new Object[]{nm4Var});
        }
        return nm4Var.c;
    }

    public final hhc.a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhc.a) ipChange.ipc$dispatch("2f7b016c", new Object[]{this});
        }
        return new a();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            this.f24821a.b(this.b);
        }
    }
}
