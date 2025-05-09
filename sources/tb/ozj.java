package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.request.AwesomeGetRequestParams;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.request.RequestTask;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ozj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f25764a;
    public final ConcurrentHashMap<String, LinkedList<RequestTask>> b = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements n3o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n3o f25765a;
        public final /* synthetic */ RequestTask b;
        public final /* synthetic */ String c;

        /* compiled from: Taobao */
        /* renamed from: tb.ozj$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class RunnableC1023a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AwesomeGetData f25766a;

            public RunnableC1023a(AwesomeGetData awesomeGetData) {
                this.f25766a = awesomeGetData;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a aVar = a.this;
                if (ozj.this.b(aVar.b, aVar.c)) {
                    n3o n3oVar = a.this.f25765a;
                    if (n3oVar != null) {
                        n3oVar.a(this.f25766a);
                    }
                    a aVar2 = a.this;
                    ozj.this.d(aVar2.b, aVar2.c);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f25767a;
            public final /* synthetic */ String b;

            public b(String str, String str2) {
                this.f25767a = str;
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
                if (ozj.this.b(aVar.b, aVar.c)) {
                    n3o n3oVar = a.this.f25765a;
                    if (n3oVar != null) {
                        n3oVar.error(this.f25767a, this.b);
                    }
                    a aVar2 = a.this;
                    ozj.this.d(aVar2.b, aVar2.c);
                }
            }
        }

        public a(n3o n3oVar, RequestTask requestTask, String str) {
            this.f25765a = n3oVar;
            this.b = requestTask;
            this.c = str;
        }

        @Override // tb.n3o
        public void a(AwesomeGetData awesomeGetData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95b68d3b", new Object[]{this, awesomeGetData});
            } else {
                nt6.a().c(new RunnableC1023a(awesomeGetData));
            }
        }

        @Override // tb.n3o
        public void error(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a936c23", new Object[]{this, str, str2});
            } else {
                nt6.a().c(new b(str, str2));
            }
        }

        @Override // tb.n3o
        public void start() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("810347e9", new Object[]{this});
                return;
            }
            n3o n3oVar = this.f25765a;
            if (n3oVar != null) {
                n3oVar.start();
            }
        }
    }

    static {
        t2o.a(487587929);
    }

    public ozj() {
        this.f25764a = false;
        this.f25764a = true;
    }

    public final String a(Collection<String> collection, String str) {
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

    public synchronized boolean b(RequestTask requestTask, String str) {
        boolean z = true;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a6f8ae20", new Object[]{this, requestTask, str})).booleanValue();
            }
            LinkedList<RequestTask> linkedList = this.b.get(str);
            if (linkedList == null || !linkedList.contains(requestTask)) {
                z = false;
            }
            return z;
        }
    }

    public synchronized void d(RequestTask requestTask, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd71f130", new Object[]{this, requestTask, str});
            return;
        }
        LinkedList<RequestTask> linkedList = this.b.get(str);
        if (linkedList != null && !linkedList.isEmpty()) {
            linkedList.remove(requestTask);
        }
    }

    public RequestTask e(String str, AwesomeGetRequestParams awesomeGetRequestParams, fs8 fs8Var, n3o n3oVar, xs6 xs6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestTask) ipChange.ipc$dispatch("457bf250", new Object[]{this, str, awesomeGetRequestParams, fs8Var, n3oVar, xs6Var});
        }
        ugh.b("gateway2-GatewayRequestService.request", str + "," + fs8Var.f19496a);
        RequestTask requestTask = new RequestTask(awesomeGetRequestParams, fs8Var);
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
        HashMap hashMap = new HashMap(2);
        hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZTYPE, "dosa");
        hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZINFO, a(requestTask.g(), requestTask.h(str)));
        requestTask.f(new a(n3oVar, requestTask, str), hashMap, xs6Var);
        return requestTask;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011a A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0004, B:6:0x000a, B:10:0x0023, B:12:0x0038, B:15:0x0040, B:17:0x0046, B:18:0x004c, B:20:0x0052, B:22:0x0064, B:25:0x0068, B:26:0x006c, B:28:0x0072, B:32:0x0082, B:35:0x0087, B:38:0x0097, B:40:0x00a0, B:43:0x00ac, B:45:0x00b5, B:48:0x00c1, B:49:0x00c3, B:56:0x00d7, B:59:0x00e1, B:62:0x00eb, B:70:0x00fd, B:71:0x0100, B:72:0x0106, B:74:0x010c, B:75:0x0116, B:76:0x011a, B:79:0x011e, B:82:0x0126), top: B:87:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized tb.ooq c(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ozj.c(java.lang.String, java.lang.String, java.lang.String):tb.ooq");
    }
}
