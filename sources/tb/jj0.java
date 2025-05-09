package tb;

import com.alibaba.appmonitor.pool.ReuseJSONArray;
import com.alibaba.appmonitor.pool.ReuseJSONObject;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jj0 extends ej8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int g = 0;
    public int h = 0;
    public Map<String, String> i;
    public Map<String, Integer> j;

    static {
        t2o.a(962593029);
    }

    public static /* synthetic */ Object ipc$super(jj0 jj0Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1275793840) {
            super.clean();
            return null;
        } else if (hashCode == 620746685) {
            return super.b();
        } else {
            if (hashCode == 1724855933) {
                jj0Var.a((Long) objArr[0]);
                return null;
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/appmonitor/event/AlarmEvent");
        }
    }

    public synchronized void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32acb502", new Object[]{this, str, str2});
        } else if (!hsq.e(str)) {
            if (this.i == null) {
                this.i = new HashMap();
            }
            if (this.j == null) {
                this.j = new HashMap();
            }
            if (hsq.g(str2)) {
                int i = 100;
                if (str2.length() <= 100) {
                    i = str2.length();
                }
                this.i.put(str, str2.substring(0, i));
            }
            if (!this.j.containsKey(str)) {
                this.j.put(str, 1);
            } else {
                Map<String, Integer> map = this.j;
                map.put(str, Integer.valueOf(map.get(str).intValue() + 1));
            }
        }
    }

    @Override // tb.ej8, tb.rbo
    public synchronized void clean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f4ee50", new Object[]{this});
            return;
        }
        super.clean();
        this.g = 0;
        this.h = 0;
        Map<String, String> map = this.i;
        if (map != null) {
            ((HashMap) map).clear();
        }
        Map<String, Integer> map2 = this.j;
        if (map2 != null) {
            ((HashMap) map2).clear();
        }
    }

    public synchronized void d(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1699b758", new Object[]{this, l});
            return;
        }
        this.h++;
        a(l);
    }

    public synchronized void e(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac65e55", new Object[]{this, l});
            return;
        }
        this.g++;
        a(l);
    }

    @Override // tb.ej8
    public synchronized JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("24ffd7bd", new Object[]{this});
        }
        JSONObject b = super.b();
        b.put("successCount", (Object) Integer.valueOf(this.g));
        b.put("failCount", (Object) Integer.valueOf(this.h));
        if (this.j != null) {
            JSONArray jSONArray = (JSONArray) to1.a().d(ReuseJSONArray.class, new Object[0]);
            for (Map.Entry entry : ((HashMap) this.j).entrySet()) {
                JSONObject jSONObject = (JSONObject) to1.a().d(ReuseJSONObject.class, new Object[0]);
                String str = (String) entry.getKey();
                jSONObject.put("errorCode", (Object) str);
                jSONObject.put("errorCount", entry.getValue());
                if (((HashMap) this.i).containsKey(str)) {
                    jSONObject.put("errorMsg", ((HashMap) this.i).get(str));
                }
                jSONArray.add(jSONObject);
            }
            b.put(pg1.ATOM_errors, (Object) jSONArray);
        }
        return b;
    }
}
