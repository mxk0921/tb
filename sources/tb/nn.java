package tb;

import android.content.Context;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.stream.internal.response.AbsStreamResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamOtherResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import com.alibaba.android.nextrpc.stream.request.StreamNextRpcRequest;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.List;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ck;
import tb.pk;
import tb.ubb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nn extends dt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final lpq f24837a;
    public final xbb b = new pk();
    public final boolean c;
    public final boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements b.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24838a;

        public a(nn nnVar, String str) {
            this.f24838a = str;
        }

        @Override // tb.nn.b.e
        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7f1edbcf", new Object[]{this});
            }
            return this.f24838a;
        }
    }

    static {
        t2o.a(80740460);
    }

    public nn(Context context, String str, boolean z, boolean z2) {
        this.c = z;
        this.d = z2;
        this.f24837a = new mpq().c(context).d(pn.a(str)).a();
    }

    public static /* synthetic */ Object ipc$super(nn nnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/nextrpc/AURAStreamNextRPCClient");
    }

    @Override // tb.ubb
    public void a(AURANextRPCEndpoint aURANextRPCEndpoint, ubb.a aVar) {
        pk.a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("764a70b6", new Object[]{this, aURANextRPCEndpoint, aVar});
        } else if (aURANextRPCEndpoint.getNextRPCPrefetch() != null) {
            ubb.a f = ((pk) this.b).f(aURANextRPCEndpoint);
            if (aVar == null) {
                aVar2 = new pk.a(f);
            } else {
                aVar2 = new pk.a(f, aVar);
            }
            b(aURANextRPCEndpoint, aVar2, null);
        }
    }

    @Override // tb.ubb
    public void b(AURANextRPCEndpoint aURANextRPCEndpoint, ubb.a aVar, ubb.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4d92405", new Object[]{this, aURANextRPCEndpoint, aVar, bVar});
        } else if (bVar == null || aURANextRPCEndpoint.getNextRPCPrefetch() == null || !((pk) this.b).i(aURANextRPCEndpoint, aVar, bVar)) {
            AURATraceUtil.g(2, "aura-stream-request-start[" + System.currentTimeMillis() + "]");
            MtopBusiness a2 = x5o.a(x5o.b(aURANextRPCEndpoint), aURANextRPCEndpoint);
            if (this.c) {
                a2.supportStreamJson(true);
            }
            if (fj.d("allowParseJson", true)) {
                a2.allowParseJson(false);
            }
            StreamNextRpcRequest streamNextRpcRequest = new StreamNextRpcRequest(a2, aURANextRPCEndpoint.getAllTimeOutSeconds());
            b bVar2 = new b(aVar, this.d);
            bVar2.h(new a(this, this.f24837a.a(streamNextRpcRequest, bVar2)));
        }
    }

    @Override // tb.ubb
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            this.f24837a.destroy();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b implements ppq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ubb.a f24839a;
        public e b;
        public final long c = System.currentTimeMillis();
        public final boolean d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ StreamRemoteMainResponse f24840a;
            public final /* synthetic */ mn b;
            public final /* synthetic */ long c;
            public final /* synthetic */ long d;
            public final /* synthetic */ List e;

            public a(StreamRemoteMainResponse streamRemoteMainResponse, mn mnVar, long j, long j2, List list) {
                this.f24840a = streamRemoteMainResponse;
                this.b = mnVar;
                this.c = j;
                this.d = j2;
                this.e = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (this.f24840a.getMainNum() == 1) {
                    long currentTimeMillis = System.currentTimeMillis();
                    uk.b(this.b, this.f24840a.getStatistics());
                    uk.a(this.b.g(), 0, b.e(b.this), currentTimeMillis);
                    uk.a(this.b.g(), 1, this.c, this.d);
                    uk.a(this.b.g(), 2, this.d, currentTimeMillis);
                    AURATraceUtil.g(2, "aura-stream-request-thread-switch-end[" + System.currentTimeMillis() + "]");
                }
                b.g(b.this).c(this.b, dt.e(this.e, b.f(b.this).a()));
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.nn$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class RunnableC1010b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ mn f24841a;

            public RunnableC1010b(mn mnVar) {
                this.f24841a = mnVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.g(b.this).b(this.f24841a);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ mn f24842a;

            public c(mn mnVar) {
                this.f24842a = mnVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.g(b.this).b(this.f24842a);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class d implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ List f24843a;

            public d(List list) {
                this.f24843a = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.g(b.this).a(dt.e(this.f24843a, b.f(b.this).a()));
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public interface e {
            String a();
        }

        static {
            t2o.a(80740462);
        }

        public b(ubb.a aVar, boolean z) {
            this.f24839a = aVar;
            this.d = z;
        }

        public static /* synthetic */ long e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fd432c6e", new Object[]{bVar})).longValue();
            }
            return bVar.c;
        }

        public static /* synthetic */ e f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("bd65caaf", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ ubb.a g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ubb.a) ipChange.ipc$dispatch("623c032f", new Object[]{bVar});
            }
            return bVar.f24839a;
        }

        @Override // tb.ppq
        public void a(List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac0fbf7c", new Object[]{this, list});
            } else if (this.f24839a != null) {
                rbb g = ck.g();
                g.e("收到 流式 副响应 " + System.currentTimeMillis(), ck.b.b().i("AURA/performance").a());
                dn.f(new d(list), 0L);
            }
        }

        @Override // tb.ppq
        public void b(StreamOtherResponse streamOtherResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2839d44", new Object[]{this, streamOtherResponse});
            }
        }

        @Override // tb.ppq
        public void c(StreamOtherResponse streamOtherResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39875222", new Object[]{this, streamOtherResponse});
            } else if (this.f24839a != null && streamOtherResponse != null) {
                dn.f(new c(i(streamOtherResponse)), 0L);
            }
        }

        public void h(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("23b66136", new Object[]{this, eVar});
            } else {
                this.b = eVar;
            }
        }

        public final mn i(AbsStreamResponse absStreamResponse) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mn) ipChange.ipc$dispatch("a7233fb", new Object[]{this, absStreamResponse});
            }
            mn mnVar = new mn();
            if (ao.a()) {
                str = "UI";
            } else {
                str = "非UI线程接收到主数据";
            }
            hl.a(str);
            mnVar.A(absStreamResponse.getMainNum());
            mnVar.n(absStreamResponse.getData());
            mnVar.k(absStreamResponse.getApi());
            mnVar.x(absStreamResponse.getVersion());
            mnVar.o(absStreamResponse.getHeaders());
            MtopResponse mtopResponse = absStreamResponse.getMtopResponse();
            if (mtopResponse == null) {
                return mnVar;
            }
            mnVar.q(mtopResponse);
            mnVar.v(mtopResponse.getRetMsg());
            mnVar.u(mtopResponse.getRetCode());
            mnVar.w(mtopResponse.isApiSuccess());
            mnVar.r(mtopResponse.getMappingCode());
            mnVar.t(mtopResponse.getResponseCode());
            hl.a("解析主数据结束");
            return mnVar;
        }

        @Override // tb.ppq
        public void d(StreamRemoteMainResponse streamRemoteMainResponse, List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34f4ab25", new Object[]{this, streamRemoteMainResponse, list});
            } else if (this.f24839a != null) {
                long currentTimeMillis = System.currentTimeMillis();
                rbb g = ck.g();
                g.e("收到nextRPC流式数据 第" + streamRemoteMainResponse.getMainNum() + "段" + currentTimeMillis, ck.b.b().h("uiThread", ao.a()).h("forceMainThread", this.d).i("AURA/performance").a());
                mn i = i(streamRemoteMainResponse);
                long currentTimeMillis2 = System.currentTimeMillis();
                if (streamRemoteMainResponse.getMainNum() == 1) {
                    AURATraceUtil.g(2, "aura-stream-request-end[" + currentTimeMillis2 + "]");
                    AURATraceUtil.g(2, "aura-stream-request-thread-switch-start[" + currentTimeMillis2 + "]");
                }
                dt.c(this.d, new a(streamRemoteMainResponse, i, currentTimeMillis, currentTimeMillis2, list), new RunnableC1010b(i));
            }
        }
    }
}
