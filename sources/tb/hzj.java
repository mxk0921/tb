package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hzj implements s4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject d;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f20984a = new Handler(Looper.getMainLooper());
    public final Queue<JSONObject> b = new ConcurrentLinkedQueue();
    public final Map<Integer, JSONObject> c = new HashMap();
    public boolean e = false;

    static {
        t2o.a(729809781);
        t2o.a(475004944);
    }

    public static /* synthetic */ Queue b(hzj hzjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Queue) ipChange.ipc$dispatch("6f2dc85d", new Object[]{hzjVar});
        }
        return hzjVar.b;
    }

    public static /* synthetic */ JSONObject c(hzj hzjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("907f0ffc", new Object[]{hzjVar});
        }
        return hzjVar.d;
    }

    public static /* synthetic */ JSONObject d(hzj hzjVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("da7f68b6", new Object[]{hzjVar, jSONObject});
        }
        hzjVar.d = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ Map e(hzj hzjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("646afdf0", new Object[]{hzjVar});
        }
        return hzjVar.c;
    }

    public final void f(d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60fd723b", new Object[]{this, d90Var});
        } else if (!this.e) {
            this.e = true;
            this.f20984a.post(new fzj(this, d90Var));
        }
    }

    @Override // tb.s4a
    public void a(JSONObject jSONObject, d90 d90Var) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b68a946", new Object[]{this, jSONObject, d90Var});
        } else if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("dataModel")) != null) {
            String string = jSONObject2.getString("sectionBizCode");
            if (!TextUtils.isEmpty(string)) {
                String string2 = jSONObject.getString("_operation");
                if (TextUtils.equals(string2, "enqueue")) {
                    if (jSONObject.get("widgetNode") != null) {
                        ((ConcurrentLinkedQueue) this.b).add(jSONObject2);
                        int identityHashCode = System.identityHashCode(jSONObject2);
                        ((HashMap) this.c).put(Integer.valueOf(identityHashCode), jSONObject);
                        bqa.e("gw2.playerQueue", "enqueue, sectionBizCode=" + string + ", dataHash=" + identityHashCode + ", queueSize=" + ((ConcurrentLinkedQueue) this.b).size() + ", queueDataSize=" + ((HashMap) this.c).size());
                        f(d90Var);
                    }
                } else if (TextUtils.equals(string2, "dequeue")) {
                    ((ConcurrentLinkedQueue) this.b).remove(jSONObject2);
                    int identityHashCode2 = System.identityHashCode(jSONObject2);
                    ((HashMap) this.c).remove(Integer.valueOf(identityHashCode2));
                    bqa.e("gw2.playerQueue", "dequeue, sectionBizCode=" + string + ", dataHash=" + identityHashCode2 + ", queueSize=" + ((ConcurrentLinkedQueue) this.b).size() + ", queueDataSize=" + ((HashMap) this.c).size());
                    if (jSONObject2 == this.d) {
                        this.d = null;
                        this.e = false;
                    }
                    f(d90Var);
                }
            }
        }
    }
}
