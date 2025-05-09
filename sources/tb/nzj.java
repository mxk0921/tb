package tb;

import android.text.TextUtils;
import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import com.taobao.tao.recommend3.gateway.request.RequestTask;
import com.taobao.tao.recommend3.gateway.request.StreamRequestTask;
import com.taobao.tao.recommend3.tracelog.HomeApmTraceUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nzj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String c;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f25047a;
    public final ConcurrentHashMap<String, LinkedList<RequestTask>> b = new ConcurrentHashMap<>();
    public boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements m3o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f25048a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ m3o d;
        public final /* synthetic */ RequestTask e;
        public final /* synthetic */ String f;
        public final /* synthetic */ AwesomeGetRequestParams g;

        /* compiled from: Taobao */
        /* renamed from: tb.nzj$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC1013a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AwesomeGetData f25049a;

            public RunnableC1013a(AwesomeGetData awesomeGetData) {
                this.f25049a = awesomeGetData;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a aVar = a.this;
                if (nzj.this.d(aVar.e, aVar.f)) {
                    a aVar2 = a.this;
                    g7j.a(aVar2.b, aVar2.g, this.f25049a);
                    if (a.this.d != null) {
                        a aVar3 = a.this;
                        HomeApmTraceUtils.b(a.this.b + "DataProcess", aVar3.b, aVar3.c);
                        a.this.d.a(this.f25049a);
                        a aVar4 = a.this;
                        HomeApmTraceUtils.a(a.this.b + "DataProcess", true, aVar4.b, aVar4.c);
                    }
                    if (this.f25049a.isFirstReturn) {
                        vqa.k().i("MTopRequest").j("handleRequest").e("DataProcess isFirstReturn " + a.this.b).a();
                        return;
                    }
                    vqa.k().i("MTopRequest").j("handleRequest").e("DataProcess removeTask " + a.this.b).a();
                    a aVar5 = a.this;
                    nzj.this.f(aVar5.e, aVar5.f);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f25050a;
            public final /* synthetic */ String b;

            public b(String str, String str2) {
                this.f25050a = str;
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
                if (nzj.this.d(aVar.e, aVar.f)) {
                    if (a.this.d != null) {
                        a aVar2 = a.this;
                        HomeApmTraceUtils.b(a.this.b + "DataProcess", aVar2.b, aVar2.c);
                        a.this.d.error(this.f25050a, this.b);
                        a aVar3 = a.this;
                        HomeApmTraceUtils.a(a.this.b + "DataProcess", false, aVar3.b, aVar3.c);
                    }
                    a aVar4 = a.this;
                    nzj.this.f(aVar4.e, aVar4.f);
                    if (TextUtils.equals(nzj.h(), "coldStart")) {
                        nzj.j(nzj.this, true);
                    }
                }
            }
        }

        public a(boolean z, String str, String str2, m3o m3oVar, RequestTask requestTask, String str3, AwesomeGetRequestParams awesomeGetRequestParams) {
            this.f25048a = z;
            this.b = str;
            this.c = str2;
            this.d = m3oVar;
            this.e = requestTask;
            this.f = str3;
            this.g = awesomeGetRequestParams;
        }

        @Override // tb.m3o
        public void error(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a936c23", new Object[]{this, str, str2});
                return;
            }
            HomeApmTraceUtils.a(this.b + "MtopRequest", false, this.b, this.c);
            nzj.a(this.b, new b(str, str2));
        }

        @Override // tb.m3o
        public void start() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("810347e9", new Object[]{this});
                return;
            }
            if (this.f25048a) {
                phg.n("hNet", "request");
            }
            HomeApmTraceUtils.b(this.b + "MtopRequest", this.b, this.c);
            m3o m3oVar = this.d;
            if (m3oVar != null) {
                m3oVar.start();
            }
        }

        @Override // tb.m3o
        public void a(AwesomeGetData awesomeGetData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f64babd5", new Object[]{this, awesomeGetData});
                return;
            }
            if (this.f25048a) {
                phg.c("hNet", "request");
            }
            HomeApmTraceUtils.a(this.b + "MtopRequest", true, this.b, this.c);
            nzj.a(this.b, new RunnableC1013a(awesomeGetData));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements NetworkStatusHelper.INetworkStatusChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(729809820);
            t2o.a(607125819);
        }

        public b() {
        }

        @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
        public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
            } else if (nzj.i(nzj.this) && networkStatus != NetworkStatusHelper.NetworkStatus.NONE && networkStatus != NetworkStatusHelper.NetworkStatus.NO) {
                fve.e("NewFaceRequestService", "retry network request");
                yyj.e().x();
            }
        }

        public /* synthetic */ b(nzj nzjVar, a aVar) {
            this();
        }
    }

    static {
        t2o.a(729809816);
    }

    public nzj() {
        this.f25047a = false;
        this.f25047a = true;
        if (f4b.b("coldStartNetworkRetry", true)) {
            NetworkStatusHelper.addStatusChangeListener(new b(this, null));
        }
    }

    public static /* synthetic */ void a(String str, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1e3c400", new Object[]{str, runnable});
        } else {
            b(str, runnable);
        }
    }

    public static void b(String str, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63d130a9", new Object[]{str, runnable});
        } else if (vxl.m(str)) {
            runnable.run();
        } else {
            Coordinator.execute(runnable);
        }
    }

    public static /* synthetic */ String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("682607c7", new Object[0]);
        }
        return c;
    }

    public static /* synthetic */ boolean i(nzj nzjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("516ed7bd", new Object[]{nzjVar})).booleanValue();
        }
        return nzjVar.d;
    }

    public static /* synthetic */ boolean j(nzj nzjVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eabe96c1", new Object[]{nzjVar, new Boolean(z)})).booleanValue();
        }
        nzjVar.d = z;
        return z;
    }

    public final String c(Collection<String> collection, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e3ef55b", new Object[]{this, collection, str});
        }
        StringBuilder sb = new StringBuilder();
        if (collection != null && collection.size() > 0) {
            for (String str2 : collection) {
                sb.append(str2);
                sb.append("=true;");
            }
        }
        sb.append("containerId=newface_home_sub;requestType=");
        sb.append(str);
        return sb.toString();
    }

    public synchronized boolean d(RequestTask requestTask, String str) {
        boolean z = true;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4762aba", new Object[]{this, requestTask, str})).booleanValue();
            }
            LinkedList<RequestTask> linkedList = this.b.get(str);
            if (linkedList == null || !linkedList.contains(requestTask)) {
                z = false;
            }
            return z;
        }
    }

    public synchronized void f(RequestTask requestTask, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d20bdca", new Object[]{this, requestTask, str});
            return;
        }
        LinkedList<RequestTask> linkedList = this.b.get(str);
        if (linkedList != null && !linkedList.isEmpty()) {
            linkedList.remove(requestTask);
        }
    }

    public RequestTask g(String str, AwesomeGetRequestParams awesomeGetRequestParams, es8 es8Var, m3o m3oVar) {
        RequestTask requestTask;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestTask) ipChange.ipc$dispatch("7b249928", new Object[]{this, str, awesomeGetRequestParams, es8Var, m3oVar});
        }
        AwesomeGetContainerParams awesomeGetContainerParams = awesomeGetRequestParams.containerParams.get(str);
        String str2 = awesomeGetContainerParams != null ? awesomeGetContainerParams.requestType : null;
        if (TextUtils.isEmpty(c)) {
            c = str2;
            if (LauncherRuntime.k == 0) {
                ddv.c(str2, "firstRequestType");
            }
        }
        if (p7p.q(str2)) {
            requestTask = new StreamRequestTask(awesomeGetRequestParams, es8Var);
        } else {
            requestTask = new RequestTask(awesomeGetRequestParams, es8Var);
        }
        synchronized (this) {
            try {
                LinkedList<RequestTask> linkedList = this.b.get(str);
                if (linkedList == null) {
                    LinkedList<RequestTask> linkedList2 = new LinkedList<>();
                    linkedList2.add(requestTask);
                    this.b.put(str, linkedList2);
                } else {
                    linkedList.add(requestTask);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean equals = "coldStart".equals(str2);
        String h = a3b.h(requestTask.k());
        HashMap hashMap = new HashMap(2);
        hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZTYPE, "dosa");
        hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZINFO, c(requestTask.k(), str2));
        requestTask.i(new a(equals, str2, h, m3oVar, requestTask, str, awesomeGetRequestParams), hashMap);
        return requestTask;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014d A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0004, B:6:0x000a, B:10:0x0023, B:12:0x0039, B:15:0x0041, B:17:0x0047, B:18:0x004e, B:20:0x0054, B:22:0x0066, B:25:0x009b, B:26:0x009f, B:28:0x00a5, B:32:0x00b5, B:35:0x00ba, B:38:0x00cb, B:40:0x00d5, B:43:0x00e0, B:45:0x00e8, B:48:0x00f3, B:49:0x00f5, B:56:0x0109, B:59:0x0113, B:62:0x011e, B:70:0x0130, B:71:0x0133, B:72:0x0139, B:74:0x013f, B:75:0x0149, B:76:0x014d, B:79:0x0151, B:82:0x015a), top: B:87:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized tb.noq e(java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.nzj.e(java.lang.String, java.lang.String, java.lang.String):tb.noq");
    }
}
