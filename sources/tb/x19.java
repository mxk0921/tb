package tb;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.taolive.sdk.model.common.ImportantEventItem;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class x19 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Set<String> b = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, ImportantEventItem.FatigueInfo> f31071a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
            String a2 = t6t.a("important_fatigue_key");
            try {
                if (!TextUtils.isEmpty(a2)) {
                    JSONArray jSONArray = (JSONArray) JSON.parse(a2);
                    for (int i = 0; i < jSONArray.size(); i++) {
                        Object obj = jSONArray.get(i);
                        if (obj instanceof String) {
                            String str = (String) obj;
                            if (!TextUtils.isEmpty(str)) {
                                ImportantEventItem.FatigueInfo fatigueInfo = (ImportantEventItem.FatigueInfo) JSON.parseObject(t6t.a(str), ImportantEventItem.FatigueInfo.class);
                                if (SystemClock.elapsedRealtime() - fatigueInfo.startTime > fatigueInfo.timeoutTime) {
                                    x19.a(x19.this, fatigueInfo);
                                    q0h.b("FatigueController", "delete key:" + fatigueInfo.fatigueKey);
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
                q0h.a("FatigueController", "clearRunnable value:" + a2);
            }
        }
    }

    static {
        t2o.a(295698710);
    }

    public x19() {
        Coordinator.execute(new a());
    }

    public static /* synthetic */ void a(x19 x19Var, ImportantEventItem.FatigueInfo fatigueInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd37d3c", new Object[]{x19Var, fatigueInfo});
        } else {
            x19Var.b(fatigueInfo);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Set<String> set = this.b;
        if (set != null && !((HashSet) set).isEmpty()) {
            String a2 = t6t.a("important_fatigue_key");
            if (!TextUtils.isEmpty(a2)) {
                Iterator<Object> it = ((JSONArray) JSON.parse(a2)).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof String) {
                        ((HashSet) this.b).add((String) next);
                    }
                }
            }
            t6t.e("important_fatigue_key", JSON.toJSONString(this.b));
        }
    }

    public ImportantEventItem.FatigueInfo d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImportantEventItem.FatigueInfo) ipChange.ipc$dispatch("71bc7bd1", new Object[]{this, str});
        }
        Map<String, ImportantEventItem.FatigueInfo> map = this.f31071a;
        if (map != null && ((HashMap) map).containsKey(str)) {
            return (ImportantEventItem.FatigueInfo) ((HashMap) this.f31071a).get(str);
        }
        try {
            String a2 = t6t.a(str);
            if (TextUtils.isEmpty(a2)) {
                return null;
            }
            return (ImportantEventItem.FatigueInfo) JSON.parseObject(a2, ImportantEventItem.FatigueInfo.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public void e(ImportantEventItem.FatigueInfo fatigueInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc307bbb", new Object[]{this, fatigueInfo});
            return;
        }
        if (fatigueInfo.startTime == 0) {
            fatigueInfo.startTime = SystemClock.elapsedRealtime();
        }
        ((HashMap) this.f31071a).put(fatigueInfo.fatigueKey, fatigueInfo);
        t6t.e(fatigueInfo.fatigueKey, JSON.toJSONString(fatigueInfo));
        ((HashSet) this.b).add(fatigueInfo.fatigueKey);
    }

    public final void b(ImportantEventItem.FatigueInfo fatigueInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16c32bb9", new Object[]{this, fatigueInfo});
            return;
        }
        SharedPreferences.Editor edit = v2s.o().f().getApplication().getSharedPreferences("taolive", 0).edit();
        edit.remove(fatigueInfo.fatigueKey);
        edit.commit();
    }
}
