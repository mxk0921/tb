package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class e6j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a f18321a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f18322a;
        public MethodEnum b;
        public Boolean c;
        public final String d;
        public final String e;

        static {
            t2o.a(804257846);
        }

        public a(String str, String str2) {
            ckf.g(str, "apiName");
            ckf.g(str2, "version");
            this.d = str;
            this.e = str2;
        }

        public final e6j a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e6j) ipChange.ipc$dispatch("eef40155", new Object[]{this});
            }
            return new e6j(this, null);
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("73c24587", new Object[]{this});
            }
            return this.d;
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7a095a10", new Object[]{this});
            }
            return null;
        }

        public final String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("817f720a", new Object[]{this});
            }
            return null;
        }

        public final String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("78f4058", new Object[]{this});
            }
            return this.f18322a;
        }

        public final Map<String, String> f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("bc36b04d", new Object[]{this});
            }
            return null;
        }

        public final Boolean g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("5c5fb263", new Object[]{this});
            }
            return null;
        }

        public final Boolean h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("fe98cbbb", new Object[]{this});
            }
            return null;
        }

        public final MethodEnum i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MethodEnum) ipChange.ipc$dispatch("c0030fe3", new Object[]{this});
            }
            return this.b;
        }

        public final Boolean j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("57c7e573", new Object[]{this});
            }
            return this.c;
        }

        public final String k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("efdaad5a", new Object[]{this});
            }
            return this.e;
        }

        public final a l(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4d626226", new Object[]{this, str});
            }
            ckf.g(str, "data");
            this.f18322a = str;
            return this;
        }

        public final a m(MethodEnum methodEnum) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("df257559", new Object[]{this, methodEnum});
            }
            ckf.g(methodEnum, "method");
            this.b = methodEnum;
            return this;
        }

        public final a n(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1c155498", new Object[]{this, new Boolean(z)});
            }
            this.c = Boolean.valueOf(z);
            return this;
        }
    }

    static {
        t2o.a(804257845);
    }

    public e6j(a aVar) {
        this.f18321a = aVar;
    }

    public final void a(IRemoteListener iRemoteListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ebec431", new Object[]{this, iRemoteListener});
            return;
        }
        ckf.g(iRemoteListener, DataReceiveMonitor.CB_LISTENER);
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(this.f18321a.b());
        mtopRequest.setVersion(this.f18321a.k());
        if (this.f18321a.e() != null) {
            mtopRequest.setData(this.f18321a.e());
        }
        if (this.f18321a.g() != null) {
            Boolean g = this.f18321a.g();
            ckf.d(g);
            mtopRequest.setNeedEcode(g.booleanValue());
        }
        if (this.f18321a.h() != null) {
            Boolean h = this.f18321a.h();
            ckf.d(h);
            mtopRequest.setNeedSession(h.booleanValue());
        }
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        MethodEnum i = this.f18321a.i();
        if (i == null) {
            i = MethodEnum.GET;
        }
        build.reqMethod(i);
        if (ckf.b(this.f18321a.j(), Boolean.TRUE)) {
            build.useWua();
        }
        if (this.f18321a.f() != null) {
            build.headers(this.f18321a.f());
        }
        if (this.f18321a.c() != null) {
            build.setBizId(this.f18321a.c());
        }
        if (this.f18321a.d() != null) {
            build.setBizTopic(this.f18321a.d());
        }
        build.registerListener(iRemoteListener);
        build.startRequest();
    }

    public /* synthetic */ e6j(a aVar, a07 a07Var) {
        this(aVar);
    }
}
