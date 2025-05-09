package tb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class mu implements la4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final tv0 f24304a;
    public vob b;

    static {
        t2o.a(758120493);
        t2o.a(758120495);
    }

    public mu(tv0 tv0Var) {
        this.f24304a = tv0Var;
    }

    public JSONObject A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2f99eb11", new Object[]{this});
        }
        vob vobVar = this.b;
        JSONObject jSONObject = null;
        if (vobVar == null) {
            return null;
        }
        JSONObject fields = vobVar.getFields();
        try {
            jSONObject = fields.getJSONObject("trackInfo");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            JSONObject jSONObject2 = fields.getJSONObject("style");
            return jSONObject2 != null ? jSONObject2.getJSONObject("trackInfo") : jSONObject;
        } catch (Exception e2) {
            e2.printStackTrace();
            return jSONObject;
        }
    }

    @Override // tb.la4
    public void e(vob vobVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6113b8b", new Object[]{this, vobVar});
            return;
        }
        this.b = vobVar;
        s();
    }

    @Override // tb.la4
    public void h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bef8126", new Object[]{this, jSONObject});
        }
    }

    @Override // tb.la4
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.la4
    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b65e44c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.la4
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b000b21", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.la4
    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59e1a492", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.la4
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        }
    }

    @Override // tb.la4
    public void onDestory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbef83c", new Object[]{this});
        }
    }

    @Override // tb.la4
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    @Override // tb.la4
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    public final List<String> r(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ef07ce11", new Object[]{this, jSONObject});
        }
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null && !jSONObject.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (String str : jSONObject.keySet()) {
                sb.delete(0, sb.length());
                sb.append(str);
                sb.append(" = ");
                Object obj = jSONObject.get(str);
                if (obj instanceof String) {
                    sb.append(obj);
                } else {
                    sb.append(JSON.toJSONString(obj));
                }
                arrayList.add(sb.toString());
            }
        }
        return arrayList;
    }

    public void s() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9faa74da", new Object[]{this});
            return;
        }
        JSONObject A = A();
        if (A != null && (jSONObject = A.getJSONObject("exposure")) != null) {
            String string = jSONObject.getString("name");
            if (!TextUtils.isEmpty(string)) {
                String string2 = jSONObject.getString("page");
                if (TextUtils.isEmpty(string2)) {
                    string2 = pd0.e().b();
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("args");
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                String C0 = this.f24304a.C0();
                if (!TextUtils.isEmpty(C0)) {
                    jSONObject2.put("trackId", (Object) C0);
                }
                List<String> r = r(jSONObject2);
                psd e = pd0.e();
                int z = z();
                e.a(string2, z, string2 + "_" + string, null, null, (String[]) r.toArray(new String[r.size()]));
            }
        }
    }

    public void t(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e7f734c", new Object[]{this, str, jSONObject});
            return;
        }
        JSONObject A = A();
        if (A != null && (jSONObject2 = A.getJSONObject("exposure")) != null) {
            if (TextUtils.isEmpty(str)) {
                str = jSONObject2.getString("name");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
            }
            String string = jSONObject2.getString("page");
            if (TextUtils.isEmpty(string)) {
                string = pd0.e().b();
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject("args");
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            jSONObject3.putAll(jSONObject);
            String C0 = this.f24304a.C0();
            if (!TextUtils.isEmpty(C0)) {
                jSONObject3.put("trackId", (Object) C0);
            }
            List<String> r = r(jSONObject3);
            psd e = pd0.e();
            int z = z();
            e.a(string, z, string + "_" + str, null, null, (String[]) r.toArray(new String[r.size()]));
        }
    }

    public la4 u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (la4) ipChange.ipc$dispatch("e8e6dbc7", new Object[]{this, str});
        }
        vob vobVar = this.b;
        if (vobVar == null || str == null || !str.equals(vobVar.getId())) {
            return null;
        }
        return this;
    }

    public tv0 v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tv0) ipChange.ipc$dispatch("dae6c50b", new Object[]{this});
        }
        return this.f24304a;
    }

    public vob w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vob) ipChange.ipc$dispatch("2800279e", new Object[]{this});
        }
        return this.b;
    }

    public Context x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f24304a.getContext();
    }

    public JSONObject y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
        }
        return null;
    }

    public int z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8727c92", new Object[]{this})).intValue();
        }
        return 19999;
    }
}
