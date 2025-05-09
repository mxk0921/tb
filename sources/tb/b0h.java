package tb;

import android.content.Context;
import android.net.Uri;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.LiveHomeController2;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.TabManager;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.a;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.feedback.FeedbackCtrl;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b0h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String O = b0h.class.getSimpleName();
    public lqc A;
    public fp8 B;
    public FeedbackCtrl C;
    public qfi D;
    public String E;
    public String F;
    public boolean G;
    public Context H;
    public String I;
    public ArrayList<DXTemplateItem> J;
    public JSONArray K;
    public String L;
    public Map<String, String> M;
    public ISmartLandingProxy.b N;
    public Object b;
    public boolean c;
    public Uri d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public int j;
    public int k;
    public int l;
    public int m;
    public float n;
    public String o;
    public boolean p;
    public boolean q;
    public yjb r;
    public u6d s;
    public JSONObject t;
    public cdc u;
    public LiveHomeController2 v;
    public volatile boolean w;
    public TabManager.TabBottom x;
    public TabManager.TabUp y;

    /* renamed from: a  reason: collision with root package name */
    public final String f16112a = UUID.randomUUID().toString() + System.currentTimeMillis();
    public JSONArray z = new JSONArray();

    static {
        t2o.a(310378628);
    }

    public void A(ArrayList<DXTemplateItem> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58143180", new Object[]{this, arrayList});
        } else {
            this.J = arrayList;
        }
    }

    public void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a67b9a6f", new Object[]{this, str});
        }
    }

    public void C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d3343f5", new Object[]{this, str});
        } else {
            this.I = str;
        }
    }

    public void D(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda27a85", new Object[]{this, new Boolean(z)});
        }
    }

    public void E(fp8 fp8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1960cddc", new Object[]{this, fp8Var});
        } else {
            this.B = fp8Var;
        }
    }

    public void F(FeedbackCtrl feedbackCtrl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("395c7abd", new Object[]{this, feedbackCtrl});
        } else {
            this.C = feedbackCtrl;
        }
    }

    public void G(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4490b56d", new Object[]{this, map});
        } else {
            this.M = map;
        }
    }

    public void H(yjb yjbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ac0581b", new Object[]{this, yjbVar});
        } else {
            this.r = yjbVar;
        }
    }

    public void I(cdc cdcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f343f33b", new Object[]{this, cdcVar});
        } else {
            this.u = cdcVar;
        }
    }

    public void J(lqc lqcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24bd5d8f", new Object[]{this, lqcVar});
        } else {
            this.A = lqcVar;
        }
    }

    public void K(u6d u6dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc0155db", new Object[]{this, u6dVar});
        } else {
            this.s = u6dVar;
        }
    }

    public void L(m1e m1eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b6557b", new Object[]{this, m1eVar});
        }
    }

    public void M(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("178cfb37", new Object[]{this, new Boolean(z)});
        } else {
            this.G = z;
        }
    }

    public void N(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("181d1fc6", new Object[]{this, new Boolean(z)});
        } else {
            this.p = z;
        }
    }

    public void O(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ae57e54", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }

    public void P(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60d7460d", new Object[]{this, str});
        } else {
            this.F = str;
        }
    }

    public void Q(LiveHomeController2 liveHomeController2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("915c7400", new Object[]{this, liveHomeController2});
        } else {
            this.v = liveHomeController2;
        }
    }

    public void R(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e84c1c05", new Object[]{this, new Boolean(z)});
        }
    }

    public void S(qfi qfiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709acd43", new Object[]{this, qfiVar});
        } else {
            this.D = qfiVar;
        }
    }

    public void T(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2124893c", new Object[]{this, str});
        } else {
            this.E = str;
        }
    }

    public void U(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24229991", new Object[]{this, aVar});
        }
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdcf6bd8", new Object[]{this, jSONObject});
            return;
        }
        if (this.z == null) {
            this.z = new JSONArray();
        }
        this.z.add(jSONObject);
    }

    public Context c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.H;
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("df9b08dd", new Object[]{this});
        }
        return this.t;
    }

    public ArrayList<DXTemplateItem> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("79e6a1d0", new Object[]{this});
        }
        return this.J;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("78673109", new Object[]{this});
        }
        return this.I;
    }

    public fp8 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fp8) ipChange.ipc$dispatch("d83232b2", new Object[]{this});
        }
        return this.B;
    }

    public FeedbackCtrl h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FeedbackCtrl) ipChange.ipc$dispatch("2d57d8b3", new Object[]{this});
        }
        return this.C;
    }

    public Map<String, String> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f55510d9", new Object[]{this});
        }
        return this.M;
    }

    public yjb j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yjb) ipChange.ipc$dispatch("6749de2f", new Object[]{this});
        }
        return this.r;
    }

    public cdc k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cdc) ipChange.ipc$dispatch("d63dd7d", new Object[]{this});
        }
        return this.u;
    }

    public lqc l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lqc) ipChange.ipc$dispatch("ec596939", new Object[]{this});
        }
        return this.A;
    }

    public u6d m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u6d) ipChange.ipc$dispatch("d5086b23", new Object[]{this});
        }
        return this.s;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d52b1f89", new Object[]{this});
        }
        return this.F;
    }

    public JSONArray o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("74cff8dd", new Object[]{this});
        }
        JSONArray jSONArray = this.K;
        this.K = new JSONArray();
        return jSONArray;
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("647e29a2", new Object[]{this});
        }
        return this.L;
    }

    public LiveHomeController2 q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveHomeController2) ipChange.ipc$dispatch("d9644a6a", new Object[]{this});
        }
        return this.v;
    }

    public qfi r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qfi) ipChange.ipc$dispatch("fe951951", new Object[]{this});
        }
        return this.D;
    }

    public JSONArray s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("3b7b4c80", new Object[]{this});
        }
        JSONArray jSONArray = this.z;
        this.z = new JSONArray();
        return jSONArray;
    }

    public String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf15dae2", new Object[]{this});
        }
        return this.E;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("252be503", new Object[]{this})).booleanValue();
        }
        return this.G;
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89cf8bc", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad47fb14", new Object[]{this})).booleanValue();
        }
        return this.p;
    }

    public void x(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c61799", new Object[]{this, jSONArray});
        }
    }

    public void y(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.H = context;
        }
    }

    public void z(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6d15e47", new Object[]{this, jSONObject});
        } else {
            this.t = jSONObject;
        }
    }

    public synchronized void a(JSONObject jSONObject) {
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba4e10da", new Object[]{this, jSONObject});
                return;
            }
            try {
                if (this.K == null) {
                    this.L = UUID.randomUUID() + "_" + System.currentTimeMillis();
                    this.K = new JSONArray();
                }
                jSONObject.put("mLiveChannelEventsSessionId", (Object) this.L);
                if (this.K.size() > 0) {
                    for (int i = 0; i < this.K.size(); i++) {
                        JSONObject jSONObject2 = this.K.getJSONObject(i);
                        if (jSONObject2 != null && (jSONObject2.get("action") instanceof String) && (jSONObject.get("action") instanceof String) && jSONObject2.getString("action").equals(jSONObject.getString("action"))) {
                            return;
                        }
                    }
                }
                this.K.add(jSONObject);
            } catch (Exception e) {
                String str = O;
                q0h.a(str, "addLiveChannelEvents:" + e.getMessage());
            }
        }
    }
}
