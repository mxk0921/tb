package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.behavix.adapter.BXBRBridge;
import com.taobao.android.behavix.adapter.BehaviXAppAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.o0r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gg4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TASK_CONFIG = 2;
    public static final int UT_CONFIG = 1;
    public static gg4 f;

    /* renamed from: a  reason: collision with root package name */
    public List<kg4> f19966a = new ArrayList();
    public List<kg4> b = new ArrayList();
    public String c = "";
    public final String d = "";
    public JSONObject e = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                String l = v82.l(o0r.a.K_BEHAVIX_CONFIG, BehaviXAppAdapter.a(o0r.a.K_BEHAVIX_CONFIG));
                if (!TextUtils.equals(l, gg4.b(gg4.this))) {
                    if (TextUtils.isEmpty(l)) {
                        gg4.f(gg4.this, new ArrayList());
                        gg4.h(gg4.this, new ArrayList());
                        return;
                    }
                    try {
                        JSONObject parseObject = JSON.parseObject(l);
                        if (!(parseObject == null || parseObject.size() == 0)) {
                            gg4.c(gg4.this, l);
                            gg4 gg4Var = gg4.this;
                            gg4.f(gg4Var, gg4.e(gg4Var, parseObject, 1));
                            gg4 gg4Var2 = gg4.this;
                            gg4.h(gg4Var2, gg4.e(gg4Var2, parseObject, 2));
                            return;
                        }
                        gg4.c(gg4.this, l);
                        gg4.f(gg4.this, new ArrayList());
                        gg4.h(gg4.this, new ArrayList());
                    } catch (Exception e) {
                        q82.f("BehaviXUTPlugin.getConfigs", "", null, e);
                    }
                }
            } catch (Exception e2) {
                q82.f("ConfigManager.updateConfig", null, null, e2);
            }
        }
    }

    static {
        t2o.a(404750488);
    }

    public static /* synthetic */ String b(gg4 gg4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c7c2ac9", new Object[]{gg4Var});
        }
        return gg4Var.c;
    }

    public static /* synthetic */ String c(gg4 gg4Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1912b5ff", new Object[]{gg4Var, str});
        }
        gg4Var.c = str;
        return str;
    }

    public static /* synthetic */ List e(gg4 gg4Var, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3e9845fd", new Object[]{gg4Var, jSONObject, new Integer(i)});
        }
        return gg4Var.d(jSONObject, i);
    }

    public static /* synthetic */ List f(gg4 gg4Var, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cfcf5f9f", new Object[]{gg4Var, list});
        }
        gg4Var.b = list;
        return list;
    }

    public static /* synthetic */ List h(gg4 gg4Var, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cef5eefe", new Object[]{gg4Var, list});
        }
        gg4Var.f19966a = list;
        return list;
    }

    public static gg4 l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gg4) ipChange.ipc$dispatch("9472dad3", new Object[0]);
        }
        if (f == null) {
            synchronized (gg4.class) {
                try {
                    if (f == null) {
                        f = new gg4();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public final JSONArray a(f6i f6iVar, int i) {
        JSONArray c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("4e532db3", new Object[]{this, f6iVar, new Integer(i)});
        }
        JSONArray jSONArray = new JSONArray();
        for (kg4 kg4Var : k(i)) {
            if (!(!kg4Var.d(f6iVar) || (c = kg4Var.c()) == null || c.size() == 0)) {
                for (int i2 = 0; i2 < c.size(); i2++) {
                    jSONArray.add(c.getJSONObject(i2));
                }
            }
        }
        return jSONArray;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            cet.d().f(new a());
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        String l = v82.l(o0r.a.K_UT_EVENT_FILTERS, "");
        if (!TextUtils.equals(this.d, l)) {
            try {
                JSONObject parseObject = JSON.parseObject(l);
                if (parseObject != null) {
                    this.e = new JSONObject(parseObject);
                } else {
                    this.e = new JSONObject();
                }
            } catch (JSONException e) {
                q82.f("ConfigManager", "updateUTEventFilters", null, e);
            }
        }
    }

    public JSONArray j(f6i f6iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("31ee6f79", new Object[]{this, f6iVar});
        }
        return a(f6iVar, 2);
    }

    public List<kg4> k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("400589a3", new Object[]{this, new Integer(i)});
        }
        if (1 == i && this.b != null) {
            return new ArrayList(this.b);
        }
        if (2 != i || this.f19966a == null) {
            return new ArrayList();
        }
        return new ArrayList(this.f19966a);
    }

    public JSONObject m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e0914824", new Object[]{this});
        }
        return this.e;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fa0472", new Object[]{this});
            return;
        }
        q82.d(null, "task_config_init", null);
        g();
        i();
        BXBRBridge.e();
        b5k.f().h();
        o82.c().g();
    }

    public final List<kg4> d(JSONObject jSONObject, int i) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4935846c", new Object[]{this, jSONObject, new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        if (i == 1) {
            jSONArray = jSONObject.getJSONArray(BHRTaskConfigBase.TYPE_CONFIG_UT);
        } else {
            jSONArray = i == 2 ? jSONObject.getJSONArray("task") : null;
        }
        if (jSONArray == null) {
            return arrayList;
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            arrayList.add(new kg4((JSONObject) it.next()));
        }
        return arrayList;
    }
}
