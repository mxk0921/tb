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
import tb.v4a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gzj implements s4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject d;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f20325a = new Handler(Looper.getMainLooper());
    public final Queue<JSONObject> b = new ConcurrentLinkedQueue();
    public final Map<Integer, JSONObject> c = new HashMap();
    public boolean e = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d90 f20326a;

        public a(d90 d90Var) {
            this.f20326a = d90Var;
        }

        private void a() {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b50ccd8", new Object[]{this});
            } else if (gzj.b(gzj.this).isEmpty()) {
                gzj.d(gzj.this, null);
            } else {
                JSONObject jSONObject2 = (JSONObject) gzj.b(gzj.this).peek();
                String str = "null";
                i65.d("gw2.playerQueue", "try to peek ", jSONObject2 == null ? str : jSONObject2.getString("sectionBizCode"), ", currentHead =", gzj.c(gzj.this) == null ? str : gzj.c(gzj.this).getString("sectionBizCode"));
                if (jSONObject2 != null && jSONObject2 != gzj.c(gzj.this) && (jSONObject = (JSONObject) gzj.e(gzj.this).get(Integer.valueOf(System.identityHashCode(jSONObject2)))) != null && gzj.c(gzj.this) != jSONObject2) {
                    gzj.d(gzj.this, jSONObject2);
                    JSONObject jSONObject3 = jSONObject.getJSONObject("dataModel");
                    if (jSONObject3 != null) {
                        str = jSONObject3.getString("sectionBizCode");
                    }
                    i65.d("gw2.playerQueue", "play next=", str);
                    ((v4a.a) this.f20326a).a("headerChanged", jSONObject, null);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            a();
            gzj.this.e = false;
        }
    }

    static {
        t2o.a(487587912);
        t2o.a(475004944);
    }

    public gzj(xs6 xs6Var) {
    }

    public static /* synthetic */ Queue b(gzj gzjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Queue) ipChange.ipc$dispatch("41366c30", new Object[]{gzjVar});
        }
        return gzjVar.b;
    }

    public static /* synthetic */ JSONObject c(gzj gzjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e4ebaaf1", new Object[]{gzjVar});
        }
        return gzjVar.d;
    }

    public static /* synthetic */ JSONObject d(gzj gzjVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c367d9d", new Object[]{gzjVar, jSONObject});
        }
        gzjVar.d = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ Map e(gzj gzjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("96393dc7", new Object[]{gzjVar});
        }
        return gzjVar.c;
    }

    public final void f(d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60fd723b", new Object[]{this, d90Var});
        } else if (!this.e) {
            this.e = true;
            this.f20325a.post(new a(d90Var));
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
                        i65.d("gw2.playerQueue", "enqueue, sectionBizCode=" + string + ", dataHash=" + identityHashCode + ", queueSize=" + ((ConcurrentLinkedQueue) this.b).size() + ", queueDataSize=" + ((HashMap) this.c).size());
                        f(d90Var);
                    }
                } else if (TextUtils.equals(string2, "dequeue")) {
                    ((ConcurrentLinkedQueue) this.b).remove(jSONObject2);
                    int identityHashCode2 = System.identityHashCode(jSONObject2);
                    ((HashMap) this.c).remove(Integer.valueOf(identityHashCode2));
                    i65.d("gw2.playerQueue", "dequeue, sectionBizCode=" + string + ", dataHash=" + identityHashCode2 + ", queueSize=" + ((ConcurrentLinkedQueue) this.b).size() + ", queueDataSize=" + ((HashMap) this.c).size());
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
