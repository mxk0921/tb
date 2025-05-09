package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.log.TLog;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import com.taobao.tao.recommend3.gateway.request.RequestTask;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.qjd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wmn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f30779a;
    public qjd.b b;
    public final ConcurrentHashMap<String, LinkedList<RequestTask>> c = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements m3o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m3o f30780a;
        public final /* synthetic */ String b;
        public final /* synthetic */ AwesomeGetRequestParams c;
        public final /* synthetic */ String d;
        public final /* synthetic */ es8 e;
        public final /* synthetic */ RequestTask f;

        /* compiled from: Taobao */
        /* renamed from: tb.wmn$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC1088a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AwesomeGetData f30781a;

            public RunnableC1088a(AwesomeGetData awesomeGetData) {
                this.f30781a = awesomeGetData;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a aVar = a.this;
                if (wmn.this.c(aVar.f, aVar.b)) {
                    m3o m3oVar = a.this.f30780a;
                    if (m3oVar != null) {
                        m3oVar.a(this.f30781a);
                    }
                    a aVar2 = a.this;
                    wmn.this.e(aVar2.f, aVar2.b);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f30782a;
            public final /* synthetic */ String b;

            public b(String str, String str2) {
                this.f30782a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a aVar = a.this;
                if (wmn.this.c(aVar.f, aVar.b)) {
                    m3o m3oVar = a.this.f30780a;
                    if (m3oVar != null) {
                        m3oVar.error(this.f30782a, this.b);
                    }
                    a aVar2 = a.this;
                    wmn.this.e(aVar2.f, aVar2.b);
                }
            }
        }

        public a(m3o m3oVar, String str, AwesomeGetRequestParams awesomeGetRequestParams, String str2, es8 es8Var, RequestTask requestTask) {
            this.f30780a = m3oVar;
            this.b = str;
            this.c = awesomeGetRequestParams;
            this.d = str2;
            this.e = es8Var;
            this.f = requestTask;
        }

        @Override // tb.m3o
        public void a(AwesomeGetData awesomeGetData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f64babd5", new Object[]{this, awesomeGetData});
                return;
            }
            if (wmn.a(wmn.this) != null) {
                wmn.a(wmn.this).b(this.b, this.d, awesomeGetData, this.e.c);
            }
            Coordinator.execute(new RunnableC1088a(awesomeGetData));
        }

        @Override // tb.m3o
        public void error(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a936c23", new Object[]{this, str, str2});
                return;
            }
            Coordinator.execute(new b(str, str2));
            if (wmn.a(wmn.this) != null) {
                wmn.a(wmn.this).a(this.d, str, str2);
            }
        }

        @Override // tb.m3o
        public void start() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("810347e9", new Object[]{this});
                return;
            }
            m3o m3oVar = this.f30780a;
            if (m3oVar != null) {
                m3oVar.start();
            }
            if (wmn.a(wmn.this) != null) {
                wmn.a(wmn.this).d(this.b, this.c, this.d, this.e.c);
            }
        }
    }

    static {
        t2o.a(729809738);
    }

    public wmn() {
        this.f30779a = false;
        this.f30779a = true;
    }

    public static /* synthetic */ qjd.b a(wmn wmnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qjd.b) ipChange.ipc$dispatch("7e81df8c", new Object[]{wmnVar});
        }
        return wmnVar.b;
    }

    public final String b(AwesomeGetRequestParams awesomeGetRequestParams, String str) {
        Map<String, AwesomeGetContainerParams> map;
        AwesomeGetContainerParams awesomeGetContainerParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("907ce248", new Object[]{this, awesomeGetRequestParams, str});
        }
        if (awesomeGetRequestParams == null || (map = awesomeGetRequestParams.containerParams) == null || map.isEmpty() || (awesomeGetContainerParams = map.get(str)) == null) {
            return null;
        }
        return awesomeGetContainerParams.requestType;
    }

    public synchronized boolean c(RequestTask requestTask, String str) {
        boolean z = true;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4762aba", new Object[]{this, requestTask, str})).booleanValue();
            }
            LinkedList<RequestTask> linkedList = this.c.get(str);
            if (linkedList == null || !linkedList.contains(requestTask)) {
                z = false;
            }
            return z;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011c A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0004, B:6:0x000a, B:10:0x0023, B:12:0x0039, B:15:0x0041, B:17:0x0047, B:18:0x004e, B:20:0x0054, B:22:0x0066, B:25:0x006a, B:26:0x006e, B:28:0x0074, B:32:0x0084, B:35:0x0089, B:38:0x009a, B:40:0x00a4, B:43:0x00af, B:45:0x00b7, B:48:0x00c2, B:49:0x00c4, B:56:0x00d8, B:59:0x00e2, B:62:0x00ed, B:70:0x00ff, B:71:0x0102, B:72:0x0108, B:74:0x010e, B:75:0x0118, B:76:0x011c, B:79:0x0120, B:82:0x0129), top: B:87:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized tb.noq d(java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.wmn.d(java.lang.String, java.lang.String, java.lang.String):tb.noq");
    }

    public synchronized void e(RequestTask requestTask, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d20bdca", new Object[]{this, requestTask, str});
            return;
        }
        LinkedList<RequestTask> linkedList = this.c.get(str);
        if (linkedList != null && !linkedList.isEmpty()) {
            linkedList.remove(requestTask);
        }
    }

    public void g(qjd.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3781e81e", new Object[]{this, bVar});
        } else {
            this.b = bVar;
        }
    }

    public RequestTask f(String str, AwesomeGetRequestParams awesomeGetRequestParams, es8 es8Var, m3o m3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestTask) ipChange.ipc$dispatch("7b249928", new Object[]{this, str, awesomeGetRequestParams, es8Var, m3oVar});
        }
        qjd.b bVar = this.b;
        if (bVar instanceof qjd.a) {
            ((qjd.a) bVar).c(str, awesomeGetRequestParams, es8Var);
        }
        TLog.logd("gateway2-GatewayRequestService.request", str + "," + es8Var.f18788a);
        RequestTask requestTask = new RequestTask(awesomeGetRequestParams, es8Var);
        synchronized (this) {
            try {
                LinkedList<RequestTask> linkedList = this.c.get(str);
                if (linkedList == null) {
                    LinkedList<RequestTask> linkedList2 = new LinkedList<>();
                    linkedList2.add(requestTask);
                    this.c.put(str, linkedList2);
                } else {
                    linkedList.add(requestTask);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZTYPE, "dosa");
        hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZINFO, "containerId=" + str + ";requestType=" + requestTask.l(str));
        requestTask.i(new a(m3oVar, str, awesomeGetRequestParams, b(awesomeGetRequestParams, str), es8Var, requestTask), hashMap);
        return requestTask;
    }
}
