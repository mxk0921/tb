package tb;

import com.alibaba.android.nextrpc.internal.accs.AccsServiceManager;
import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.alibaba.android.nextrpc.streamv2.request.RequestTask;
import com.alibaba.android.nextrpc.streamv2.trace.TraceName;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.z2k;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class q3o implements wdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, RequestTask> f26492a;
    public final String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public final q3o a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (q3o) ipChange.ipc$dispatch("c7eadd32", new Object[]{this, str});
            }
            ckf.g(str, "accsServiceName");
            q3o q3oVar = new q3o(str, null);
            q70.a(Globals.getApplication());
            AccsServiceManager.b().a(Globals.getApplication(), str, q3oVar);
            return q3oVar;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b extends q5o {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ a3o g;

        public b(a3o a3oVar) {
            this.g = a3oVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 1982904709) {
                super.a((fj9) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/nextrpc/streamv2/request/RequestClient$execute$task$1");
        }

        @Override // tb.q5o, tb.mjd
        public void a(fj9 fj9Var, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7630b985", new Object[]{this, fj9Var, new Boolean(z)});
                return;
            }
            ckf.g(fj9Var, "finishResult");
            super.a(fj9Var, z);
            if (z) {
                q3o.this.g(this.g);
            }
        }
    }

    public q3o(String str) {
        this.b = str;
        this.f26492a = new ConcurrentHashMap();
    }

    public final synchronized void b(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b8c50f2", new Object[]{this, list});
            return;
        }
        ckf.g(list, "requestIDs");
        Map<String, RequestTask> map = this.f26492a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((ConcurrentHashMap) map).entrySet()) {
            if (list.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (RequestTask requestTask : linkedHashMap.values()) {
            requestTask.cancel();
        }
        for (String str : list) {
            ((ConcurrentHashMap) this.f26492a).remove(str);
        }
    }

    public final synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186d51ce", new Object[]{this});
            return;
        }
        for (RequestTask requestTask : ((ConcurrentHashMap) this.f26492a).values()) {
            requestTask.cancel();
        }
        ((ConcurrentHashMap) this.f26492a).clear();
    }

    public final synchronized void d(a3o a3oVar, r5o r5oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("457bc0c4", new Object[]{this, a3oVar, r5oVar});
            return;
        }
        ckf.g(a3oVar, "request");
        ckf.g(r5oVar, "resultCallback");
        String b2 = z5o.b();
        ckf.f(b2, "RequestUtil.generateRequestId()");
        a3oVar.j(b2);
        RequestTask requestTask = new RequestTask(a3oVar, this, r5oVar, new b(a3oVar));
        ((ConcurrentHashMap) this.f26492a).put(a3oVar.f(), requestTask);
        requestTask.execute();
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("309a4cc1", new Object[]{this});
        }
        return this.b;
    }

    public final synchronized boolean f(a3o a3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf3f3ac2", new Object[]{this, a3oVar})).booleanValue();
        }
        ckf.g(a3oVar, "request");
        return ((ConcurrentHashMap) this.f26492a).containsKey(a3oVar.f());
    }

    public final synchronized void g(a3o a3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e8bb65", new Object[]{this, a3oVar});
            return;
        }
        ckf.g(a3oVar, "request");
        if (a3oVar.f().length() > 0) {
            ((ConcurrentHashMap) this.f26492a).remove(a3oVar.f());
        }
    }

    public final synchronized void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92e5a7dd", new Object[]{this});
            return;
        }
        c();
        AccsServiceManager.b().d(Globals.getApplication(), this.b, this);
    }

    @Override // tb.wdb
    public synchronized void a(String str, String str2, String str3, JSONObject jSONObject) {
        TraceName traceName;
        n9u n9uVar;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41b304a2", new Object[]{this, str, str2, str3, jSONObject});
            return;
        }
        try {
            n9uVar = n9u.INSTANCE;
            traceName = TraceName.NEXTRPC_RECEIVE_ACCS;
            n9uVar.a(traceName);
            if (jSONObject == null || (i = jSONObject.getString(z2k.d.ATTACHED_RESPONSE_HEADER_REQ_ID)) == null) {
                i = -1;
            }
            RequestTask requestTask = (RequestTask) ((ConcurrentHashMap) this.f26492a).get(i);
            if (requestTask != null) {
                TraceName traceName2 = TraceName.NEXTRPC_CREATE_ATTACHED_RESPONSE;
                n9uVar.a(traceName2);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                if (str3 == null) {
                    str3 = "";
                }
                dh1 dh1Var = new dh1(jSONObject, str3, requestTask.getRequest());
                n9uVar.b(traceName2);
                requestTask.receiveAttachedResponse(dh1Var);
            }
        } catch (Exception e) {
            UnifyLog.d("NextRPC", "receiveAccs error msg: " + e.getMessage(), new Object[0]);
            n9uVar = n9u.INSTANCE;
            traceName = TraceName.NEXTRPC_RECEIVE_ACCS;
        }
        n9uVar.b(traceName);
    }

    public /* synthetic */ q3o(String str, a07 a07Var) {
        this(str);
    }
}
