package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.BehaviR;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.behavir.solution.BHRSolution;
import com.taobao.android.behavir.util.Utils;
import com.taobao.tao.log.TLog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dm1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final dm1 c = new dm1();

    /* renamed from: a  reason: collision with root package name */
    public final mm1 f17908a = mm1.b();
    public final Map<String, Map<String, BHRSolution>> b = new ConcurrentHashMap();

    static {
        t2o.a(404750359);
    }

    public static BHRSolution a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BHRSolution) ipChange.ipc$dispatch("6d4ab09a", new Object[]{jSONObject});
        }
        return b(jSONObject.getString("solutionName"));
    }

    public static BHRSolution b(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BHRSolution) ipChange.ipc$dispatch("33a627c6", new Object[]{str});
        }
        dm1 configCenter = BehaviR.getInstance().getConfigCenter();
        BHRSolution d = configCenter.d(str);
        if (d != null) {
            return d;
        }
        BHREvent e = fm1.f().e();
        if (e == null) {
            return null;
        }
        String str3 = e.sessionId;
        String str4 = e.scene;
        if (!TextUtils.isEmpty(str3)) {
            str2 = str3.substring(0, str3.indexOf(str4));
        } else {
            str2 = "";
        }
        return configCenter.e(str, str2);
    }

    public static dm1 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dm1) ipChange.ipc$dispatch("954a848e", new Object[0]);
        }
        return c;
    }

    public BHRSolution d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BHRSolution) ipChange.ipc$dispatch("7d02c2a3", new Object[]{this, str});
        }
        return e(str, "undefined");
    }

    public BHRSolution e(String str, String str2) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BHRSolution) ipChange.ipc$dispatch("1857e06d", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (map = (Map) ((ConcurrentHashMap) this.b).get(str)) == null) {
            return null;
        }
        return (BHRSolution) map.get(str2);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            this.f17908a.f();
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f43c4b81", new Object[]{this})).booleanValue();
        }
        return v82.o();
    }

    public void h(String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2a330e0", new Object[]{this, str, str2});
        } else {
            this.f17908a.d(str, str2);
        }
    }

    public void i(String str, BHRSolution bHRSolution) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60fca446", new Object[]{this, str, bHRSolution});
        } else if (!TextUtils.isEmpty(str) && bHRSolution != null) {
            if (!bHRSolution.d() || Utils.c()) {
                if (!bHRSolution.d() || bHRSolution.b() == null) {
                    str2 = "undefined";
                } else {
                    str2 = Utils.g(bHRSolution.b());
                }
                Map map = (Map) ((ConcurrentHashMap) this.b).get(str);
                if (map == null) {
                    map = new ConcurrentHashMap(5);
                }
                map.put(str2, bHRSolution);
                ((ConcurrentHashMap) this.b).put(str, map);
            }
        }
    }

    public void j(String str, BHRSolution bHRSolution) {
        Map map;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53cb596d", new Object[]{this, str, bHRSolution});
        } else if (Utils.c() && !TextUtils.isEmpty(str) && bHRSolution != null && (map = (Map) ((ConcurrentHashMap) this.b).get(str)) != null) {
            if (!bHRSolution.d() || bHRSolution.b() == null) {
                str2 = "undefined";
            } else {
                str2 = Utils.g(bHRSolution.b());
            }
            map.remove(str2);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("960a3b95", new Object[]{this});
            return;
        }
        try {
            this.f17908a.h();
        } catch (Throwable th) {
            TLog.loge("BHRConfigCenter", "updateUPPConfig", th);
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e083d9e", new Object[]{this});
            return;
        }
        try {
            this.f17908a.i();
        } catch (Throwable th) {
            TLog.loge("BHRConfigCenter", "updateUPPPlanConfig", th);
        }
    }
}
