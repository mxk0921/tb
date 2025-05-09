package tb;

import android.content.Context;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamOtherResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import com.alibaba.android.nextrpc.stream.request.StreamNextRpcRequest;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.domain.MtopRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class lav {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "UltronRequestPrefetch";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f23216a = new ConcurrentHashMap();
    public static final Map<String, String> b = new ConcurrentHashMap();
    public static final Map<String, wz<Boolean, StreamNextRpcRequest>> c = new ConcurrentHashMap();
    public static final Map<String, nav> d = new ConcurrentHashMap();
    public static final Map<String, ppq> e = new ConcurrentHashMap();
    public static final Map<String, Runnable> f = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements ppq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23217a;
        public final /* synthetic */ ppq b;

        /* compiled from: Taobao */
        /* renamed from: tb.lav$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class RunnableC0978a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ppq f23218a;
            public final /* synthetic */ StreamRemoteMainResponse b;
            public final /* synthetic */ List c;

            public RunnableC0978a(ppq ppqVar, StreamRemoteMainResponse streamRemoteMainResponse, List list) {
                this.f23218a = ppqVar;
                this.b = streamRemoteMainResponse;
                this.c = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f23218a.d(this.b, this.c);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class b extends ly<nav> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ StreamRemoteMainResponse f23219a;
            public final /* synthetic */ List b;

            public b(a aVar, StreamRemoteMainResponse streamRemoteMainResponse, List list) {
                this.f23219a = streamRemoteMainResponse;
                this.b = list;
            }

            public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/prefetch/mtop/UltronRequestPrefetch$1$2");
            }

            /* renamed from: b */
            public void a(nav navVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("22fec879", new Object[]{this, navVar});
                    return;
                }
                navVar.f24610a = this.f23219a;
                navVar.b = this.b;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ppq f23220a;
            public final /* synthetic */ List b;

            public c(ppq ppqVar, List list) {
                this.f23220a = ppqVar;
                this.b = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f23220a.a(this.b);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class d extends ly<nav> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ List f23221a;

            public d(a aVar, List list) {
                this.f23221a = list;
            }

            public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/prefetch/mtop/UltronRequestPrefetch$1$4");
            }

            /* renamed from: b */
            public void a(nav navVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("22fec879", new Object[]{this, navVar});
                    return;
                }
                List<AttachedResponse> list = navVar.c;
                if (list == null) {
                    navVar.c = new ArrayList(this.f23221a);
                } else {
                    list.addAll(this.f23221a);
                }
            }
        }

        public a(String str, ppq ppqVar) {
            this.f23217a = str;
            this.b = ppqVar;
        }

        @Override // tb.ppq
        public void a(List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac0fbf7c", new Object[]{this, list});
            } else if (list != null) {
                this.b.a(list);
                ppq ppqVar = (ppq) lav.b().get(this.f23217a);
                if (ppqVar != null) {
                    hav.d(lav.TAG, "预请求副数据返回成功#回调真实请求的回调");
                    pav.i(new c(ppqVar, list), 0L);
                    return;
                }
                hav.d(lav.TAG, "预请求副数据返回成功#先暂存数据，等待真实请求调用时使用");
                lav.c(this.f23217a, new d(this, list));
            }
        }

        @Override // tb.ppq
        public void b(StreamOtherResponse streamOtherResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2839d44", new Object[]{this, streamOtherResponse});
                return;
            }
            hav.d(lav.TAG, "预请求结束");
            String str = (String) lav.a().get(this.f23217a);
            if ("success".equals(str)) {
                lav.a().put(this.f23217a, "successFinish");
            } else if ("error".equals(str)) {
                lav.a().put(this.f23217a, "errorFinish");
            }
            this.b.b(streamOtherResponse);
            if (((ppq) lav.b().get(this.f23217a)) != null) {
                lav.e(this.f23217a);
            }
        }

        @Override // tb.ppq
        public void c(StreamOtherResponse streamOtherResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39875222", new Object[]{this, streamOtherResponse});
                return;
            }
            hav.a(lav.TAG, "预请求返回失败");
            lav.a().put(this.f23217a, "error");
            this.b.c(streamOtherResponse);
            Runnable runnable = (Runnable) lav.d().remove(this.f23217a);
            if (runnable != null) {
                hav.d(lav.TAG, "预请求副数据返回失败#回调真实请求的回调");
                runnable.run();
                lav.e(this.f23217a);
            }
        }

        @Override // tb.ppq
        public void d(StreamRemoteMainResponse streamRemoteMainResponse, List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34f4ab25", new Object[]{this, streamRemoteMainResponse, list});
                return;
            }
            lav.a().put(this.f23217a, "success");
            this.b.d(streamRemoteMainResponse, list);
            ppq ppqVar = (ppq) lav.b().get(this.f23217a);
            if (ppqVar != null) {
                hav.d(lav.TAG, "预请求返回成功#回调真实请求的回调");
                pav.i(new RunnableC0978a(ppqVar, streamRemoteMainResponse, list), 0L);
                return;
            }
            hav.d(lav.TAG, "预请求返回成功#先暂存数据，等待真实请求调用时使用");
            lav.c(this.f23217a, new b(this, streamRemoteMainResponse, list));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ppq f23222a;
        public final /* synthetic */ StreamRemoteMainResponse b;
        public final /* synthetic */ nav c;

        public b(ppq ppqVar, StreamRemoteMainResponse streamRemoteMainResponse, nav navVar) {
            this.f23222a = ppqVar;
            this.b = streamRemoteMainResponse;
            this.c = navVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f23222a.d(this.b, this.c.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ppq f23223a;
        public final /* synthetic */ List b;

        public c(ppq ppqVar, List list) {
            this.f23223a = ppqVar;
            this.b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f23223a.a(this.b);
            }
        }
    }

    static {
        t2o.a(83886282);
    }

    public static /* synthetic */ Map a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c8ee3d6c", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ Map b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d58732ed", new Object[0]);
        }
        return e;
    }

    public static /* synthetic */ void c(String str, ly lyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427eb842", new Object[]{str, lyVar});
        } else {
            m(str, lyVar);
        }
    }

    public static /* synthetic */ Map d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("eeb91def", new Object[0]);
        }
        return f;
    }

    public static /* synthetic */ void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49bc1585", new Object[]{str});
        } else {
            f(str);
        }
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("769f891e", new Object[]{str});
            return;
        }
        ((ConcurrentHashMap) f23216a).remove(str);
        ((ConcurrentHashMap) c).remove(str);
        ((ConcurrentHashMap) b).remove(str);
        ((ConcurrentHashMap) e).remove(str);
        ((ConcurrentHashMap) d).remove(str);
        ((ConcurrentHashMap) f).remove(str);
        hav.g(TAG, "clear#", str);
    }

    public static String g(MtopBusiness mtopBusiness) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db0cfae2", new Object[]{mtopBusiness});
        }
        MtopNetworkProp mtopNetworkProp = mtopBusiness.mtopProp;
        if (mtopNetworkProp == null || (str = mtopNetworkProp.bizIdStr) == null) {
            return null;
        }
        MtopRequest mtopRequest = mtopBusiness.request;
        if (mtopRequest == null) {
            hav.a(TAG, "request of request is null");
            return null;
        }
        String apiName = mtopRequest.getApiName();
        if (apiName != null) {
            return h(str, apiName);
        }
        hav.a(TAG, "api name of request is null");
        return null;
    }

    public static String h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d65256c", new Object[]{str, str2});
        }
        return Login.getUserId() + str + str2;
    }

    public static mav i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mav) ipChange.ipc$dispatch("91261b7d", new Object[0]);
        }
        hav.d(TAG, "interceptRealRequest#不拦截");
        return new mav(false, "");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
        if (r8.equals("error") == false) goto L_0x0081;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.mav j(com.alibaba.android.nextrpc.stream.request.StreamNextRpcRequest r11, tb.ppq r12, java.lang.Runnable r13) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lav.j(com.alibaba.android.nextrpc.stream.request.StreamNextRpcRequest, tb.ppq, java.lang.Runnable):tb.mav");
    }

    public static void k(Context context, MtopBusiness mtopBusiness, String str, ppq ppqVar, wz<Boolean, StreamNextRpcRequest> wzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d176b12a", new Object[]{context, mtopBusiness, str, ppqVar, wzVar});
            return;
        }
        String g = g(mtopBusiness);
        if (g == null) {
            hav.a(TAG, "发起预请求失败#cacheKey为空");
            return;
        }
        f(g);
        StreamNextRpcRequest streamNextRpcRequest = new StreamNextRpcRequest(mtopBusiness, mtopBusiness.mtopProp.connTimeout);
        npq npqVar = new npq(context, str);
        ((ConcurrentHashMap) c).put(g, wzVar);
        ((ConcurrentHashMap) b).put(g, "start");
        hav.g(TAG, "发起预请求#", mtopBusiness.request.getApiName());
        String a2 = npqVar.a(streamNextRpcRequest, new a(g, ppqVar));
        vxu.c(mtopBusiness.request);
        ((ConcurrentHashMap) f23216a).put(g, a2);
    }

    public static void l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3978579", new Object[]{str, str2});
        } else {
            f(h(str, str2));
        }
    }

    public static void m(String str, ly<nav> lyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd02dd91", new Object[]{str, lyVar});
            return;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) d;
        nav navVar = (nav) concurrentHashMap.get(str);
        if (navVar == null) {
            navVar = new nav();
            concurrentHashMap.put(str, navVar);
        }
        lyVar.a(navVar);
    }
}
