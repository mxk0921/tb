package tb;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamOtherResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import com.alibaba.android.nextrpc.stream.request.StreamNextRpcRequest;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.ParseResponseHelper;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.eq6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class opq implements etd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String STREAM_RESPONSE_NUM = "mainNum";
    public static final String STREAM_RESPONSE_ULTRON_PROTOCOL = "streamNextRPCResponseUltronProtocol";
    public static String v;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f25556a;
    public final boolean b;
    public final MtopRequest c;
    public final fsb d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final int j;
    public final boolean k;
    public final Map<String, String> l;
    public final IDMComponent m;
    public Map<String, String> n;
    public final String o;
    public final String p;
    public final Context q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final StreamNextRpcRequest u;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/datamodel/imp/StreamNextRpcRequester$1");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            try {
                xav.d(opq.c(opq.this), opq.g(opq.this));
                return null;
            } catch (Throwable th) {
                UnifyLog.m(opq.e(opq.this).getBizName(), "StreamNextRpcRequester", "getInstance", th.getMessage());
                return null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ lpq f25558a;
        public final /* synthetic */ c b;

        public b(lpq lpqVar, c cVar) {
            this.f25558a = lpqVar;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            hav.d("StreamNextRpcRequester", "预请求失败，恢复正常请求");
            opq.n(this.f25558a.a(opq.f(opq.this), this.b));
            vxu.d(opq.e(opq.this), opq.j(opq.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements ppq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final u55 f25559a;
        public final ux b;
        public final MtopBusiness c;
        public final long d = System.currentTimeMillis();
        public long e;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ StreamRemoteMainResponse f25560a;
            public final /* synthetic */ MtopResponse b;
            public final /* synthetic */ ParseResponseHelper c;

            public a(StreamRemoteMainResponse streamRemoteMainResponse, MtopResponse mtopResponse, ParseResponseHelper parseResponseHelper) {
                this.f25560a = streamRemoteMainResponse;
                this.b = mtopResponse;
                this.c = parseResponseHelper;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    c.this.b.a(this.f25560a.getMtopRequestType(), this.b, this.f25560a.getMtopRequestContext(), true, this.c.f());
                } catch (Exception e) {
                    UnifyLog.e("StreamNextRpcRequester", e.getMessage());
                }
            }
        }

        static {
            t2o.a(83886209);
        }

        public c(MtopBusiness mtopBusiness, ux uxVar, u55 u55Var) {
            this.c = mtopBusiness;
            this.f25559a = u55Var;
            this.b = uxVar;
        }

        @Override // tb.ppq
        public void a(List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac0fbf7c", new Object[]{this, list});
                return;
            }
            hav.d("StreamNextRpcRequester", "remoteMainResponseReqId = " + opq.m() + " identityHashCode=" + System.identityHashCode(this));
            if (list != null && !list.isEmpty()) {
                HashMap hashMap = new HashMap();
                if (this.b.n(opq.m(), list)) {
                    hashMap.put("isValid", "1");
                    this.b.c(opq.i(opq.this, list));
                } else {
                    hashMap.put("isValid", "0");
                }
                opq.o(opq.this, this.c, hashMap);
            }
        }

        @Override // tb.ppq
        public void b(StreamOtherResponse streamOtherResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2839d44", new Object[]{this, streamOtherResponse});
                return;
            }
            ux uxVar = this.b;
            if (uxVar != null) {
                uxVar.g(streamOtherResponse);
            }
        }

        public final void g(StreamRemoteMainResponse streamRemoteMainResponse, MtopResponse mtopResponse, ParseResponseHelper parseResponseHelper, byte[] bArr, Exception exc) {
            String message;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a8cf1fc", new Object[]{this, streamRemoteMainResponse, mtopResponse, parseResponseHelper, bArr, exc});
            } else if (this.b == null) {
                UnifyLog.e("StreamNextRpcRequester", "mOuterCallback is null");
            } else {
                new Handler(Looper.getMainLooper()).post(new a(streamRemoteMainResponse, mtopResponse, parseResponseHelper));
                String g = opq.g(opq.this);
                if (exc == null) {
                    message = "";
                } else {
                    message = exc.getMessage();
                }
                vxu.f("Ultron", "AURAMonitor", "AURAMonitor", g, null, "parseResponseException", message);
                StringBuilder sb = new StringBuilder("parseResponseException#bizName=");
                sb.append(opq.g(opq.this));
                sb.append("#responseByteData=");
                if (bArr == null) {
                    str = "none";
                } else {
                    str = new String(bArr);
                }
                sb.append(str);
                hav.b("AURAMonitor", "parseResponseException", sb.toString());
            }
        }

        public final void h(StreamRemoteMainResponse streamRemoteMainResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78953521", new Object[]{this, streamRemoteMainResponse});
                return;
            }
            y55 L = this.f25559a.L();
            L.c(this.e);
            L.a(this.d);
            L.b(streamRemoteMainResponse.getStatistics());
        }

        @Override // tb.ppq
        public void c(StreamOtherResponse streamOtherResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39875222", new Object[]{this, streamOtherResponse});
                return;
            }
            MtopResponse mtopResponse = streamOtherResponse.getMtopResponse();
            int mtopRequestType = streamOtherResponse.getMtopRequestType();
            Object mtopRequestContext = streamOtherResponse.getMtopRequestContext();
            x55.g(opq.c(opq.this), mtopResponse);
            opq.l(opq.this, this.c);
            this.f25559a.n0(false);
            HashMap hashMap = new HashMap();
            hashMap.put(opq.STREAM_RESPONSE_NUM, Integer.valueOf(streamOtherResponse.getMainNum()));
            try {
                ux uxVar = this.b;
                if (uxVar != null && !uxVar.e(mtopRequestType, mtopResponse, mtopRequestContext)) {
                    this.b.a(mtopRequestType, mtopResponse, mtopRequestContext, false, hashMap);
                }
            } catch (Exception e) {
                hav.b("StreamNextRpcRequester", "onErrorException 节点onError回调处理错误出错", e.getMessage());
            }
            vxu.e(this.f25559a, mtopResponse, opq.j(opq.this), false, opq.k(opq.this));
            try {
                String bizName = this.f25559a.getBizName();
                hav.g(bizName, "StreamNextRpcRequester", "#response error,traceId=" + r9v.a(mtopResponse) + ",errorCode:" + mtopResponse.getRetCode() + ",errorMsg:" + mtopResponse.getRetMsg() + ",request: " + opq.j(opq.this).toString());
            } catch (Throwable unused) {
            }
        }

        @Override // tb.ppq
        public void d(StreamRemoteMainResponse streamRemoteMainResponse, List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34f4ab25", new Object[]{this, streamRemoteMainResponse, list});
                return;
            }
            MtopResponse mtopResponse = streamRemoteMainResponse.getMtopResponse();
            int mtopRequestType = streamRemoteMainResponse.getMtopRequestType();
            Object mtopRequestContext = streamRemoteMainResponse.getMtopRequestContext();
            this.b.m(mtopRequestType, mtopResponse, mtopRequestContext, this.f25559a, null);
            String bizName = this.f25559a.getBizName();
            hav.g(bizName, "#流式返回:", String.valueOf(streamRemoteMainResponse.getMainNum()));
            this.e = System.currentTimeMillis();
            h(streamRemoteMainResponse);
            x55.h(opq.c(opq.this), streamRemoteMainResponse.getMtopResponse());
            if (this.f25559a.d()) {
                if (opq.d(opq.this)) {
                    this.f25559a.m0();
                }
                this.f25559a.n0(false);
            }
            try {
                if (this.b.e(mtopRequestType, mtopResponse, mtopRequestContext)) {
                    this.b.h(mtopRequestType, mtopResponse, mtopRequestContext);
                    HashMap hashMap = new HashMap();
                    hashMap.put(opq.STREAM_RESPONSE_NUM, Integer.valueOf(streamRemoteMainResponse.getMainNum()));
                    this.b.i(mtopRequestType, mtopResponse, mtopRequestContext, hashMap);
                    x55.d(opq.c(opq.this), true, mtopResponse);
                    q9v.a(opq.c(opq.this), opq.g(opq.this), streamRemoteMainResponse);
                    return;
                }
            } catch (Throwable unused) {
            }
            this.b.l(this.f25559a, streamRemoteMainResponse, list);
            if (opq.h(opq.this)) {
                try {
                    this.b.b(mtopRequestType, mtopResponse, mtopRequestContext, this.f25559a, null);
                    x55.d(opq.c(opq.this), true, mtopResponse);
                } catch (Throwable th) {
                    UnifyLog.m(opq.g(opq.this), "StreamNextRpcRequester", "submit onSuccess callback error", th.getMessage());
                }
                q9v.a(opq.c(opq.this), opq.g(opq.this), streamRemoteMainResponse);
                return;
            }
            ParseResponseHelper parseResponseHelper = new ParseResponseHelper(this.f25559a);
            if (f(streamRemoteMainResponse, list, mtopResponse, parseResponseHelper)) {
                e(streamRemoteMainResponse, mtopRequestType, mtopRequestContext, parseResponseHelper);
                x55.d(opq.c(opq.this), false, mtopResponse);
                q9v.a(opq.c(opq.this), opq.g(opq.this), streamRemoteMainResponse);
                hav.g(bizName, "traceId=", r9v.a(mtopResponse));
            }
        }

        public final void e(StreamRemoteMainResponse streamRemoteMainResponse, int i, Object obj, ParseResponseHelper parseResponseHelper) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("101a4041", new Object[]{this, streamRemoteMainResponse, new Integer(i), obj, parseResponseHelper});
                return;
            }
            MtopResponse mtopResponse = streamRemoteMainResponse.getMtopResponse();
            Map<String, ? extends Object> f = parseResponseHelper.f();
            if (f == null) {
                f = new HashMap<>();
            }
            f.put(opq.STREAM_RESPONSE_NUM, Integer.valueOf(streamRemoteMainResponse.getMainNum()));
            try {
                if (parseResponseHelper.i()) {
                    this.b.b(i, mtopResponse, obj, this.f25559a, f);
                    vxu.e(this.f25559a, mtopResponse, opq.j(opq.this), true, opq.k(opq.this));
                } else {
                    this.b.a(i, mtopResponse, obj, true, f);
                    Object obj2 = f.get("protocolVersion");
                    if (obj2 instanceof String) {
                        try {
                            if (Float.parseFloat((String) obj2) > 2.1d) {
                                vxu.e(this.f25559a, mtopResponse, opq.j(opq.this), false, opq.k(opq.this));
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (Throwable th) {
                String g = opq.g(opq.this);
                hav.b(g, "StreamNextRpcRequester", "submit onSuccess callback error#" + th.getMessage());
            }
        }

        public final boolean f(StreamRemoteMainResponse streamRemoteMainResponse, List<AttachedResponse> list, MtopResponse mtopResponse, ParseResponseHelper parseResponseHelper) {
            Exception e;
            byte[] bytedata;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4aef100f", new Object[]{this, streamRemoteMainResponse, list, mtopResponse, parseResponseHelper})).booleanValue();
            }
            x55.i(opq.c(opq.this), mtopResponse);
            JSONObject data = streamRemoteMainResponse.getData();
            byte[] bArr = null;
            if (data == null) {
                try {
                    bytedata = mtopResponse.getBytedata();
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    bArr = bytedata;
                    data = (JSONObject) JSON.parseObject(bytedata, JSONObject.class, new Feature[0]);
                } catch (Exception e3) {
                    e = e3;
                    bArr = bytedata;
                    g(streamRemoteMainResponse, mtopResponse, parseResponseHelper, bArr, e);
                    return false;
                }
            }
            JSONObject jSONObject = data.getJSONObject("data");
            if (jSONObject == null) {
                g(streamRemoteMainResponse, mtopResponse, parseResponseHelper, bArr, null);
                return false;
            }
            parseResponseHelper.d(opq.STREAM_RESPONSE_ULTRON_PROTOCOL, jSONObject);
            if (parseResponseHelper.k(jSONObject)) {
                return true;
            }
            ux uxVar = this.b;
            if (uxVar != null) {
                uxVar.j(data);
            }
            parseResponseHelper.p(jSONObject);
            if (parseResponseHelper.h(o1n.FEATURE_CONTAINER_CACHE)) {
                parseResponseHelper.v(opq.c(opq.this), opq.g(opq.this), jSONObject, true, true);
            }
            parseResponseHelper.q(data);
            if (list != null) {
                parseResponseHelper.o(opq.i(opq.this, list));
            }
            x55.f(opq.c(opq.this), mtopResponse, jSONObject, this.d, this.e, streamRemoteMainResponse.getStatistics());
            return true;
        }
    }

    static {
        t2o.a(83886204);
        t2o.a(83886129);
    }

    public opq(w55 w55Var) {
        this.b = true;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = true;
        this.j = -1;
        this.k = false;
        this.o = "default";
        this.p = "";
        if (w55Var != null) {
            boolean R = w55Var.R();
            this.h = R;
            if (w55Var.A() != null) {
                this.d = w55Var.A();
            } else {
                this.d = new u55(R);
            }
            this.l = w55Var.D();
            this.i = w55Var.J();
            this.f = w55Var.M();
            this.g = w55Var.g0();
            this.k = w55Var.h0();
            this.e = w55Var.b0();
            this.j = w55Var.v();
            this.m = w55Var.I();
            this.n = w55Var.F();
            this.o = w55Var.w();
            this.p = w55Var.x();
            this.s = w55Var.L();
            this.t = w55Var.V();
            String y = w55Var.y();
            double s = w55Var.s();
            this.r = w55Var.d0();
            MtopRequest mtopRequest = new MtopRequest();
            this.c = mtopRequest;
            mtopRequest.setApiName(w55Var.t());
            mtopRequest.setVersion(w55Var.K());
            mtopRequest.setNeedSession(w55Var.Y());
            mtopRequest.setNeedEcode(w55Var.W());
            fsb fsbVar = this.d;
            if (fsbVar instanceof u55) {
                ((u55) fsbVar).x0(R);
                v55 v2 = ((u55) this.d).v();
                if (v2 != null) {
                    v2.p(w55Var.a0());
                    v2.q(w55Var.f0());
                    v2.n(w55Var.T());
                }
                if (!(v2 == null || w55Var.C() == null)) {
                    for (eq6.a aVar : w55Var.C()) {
                        v2.f().c(aVar);
                    }
                }
            }
            this.q = w55Var.z();
            this.b = w55Var.O();
            this.d.a(this.o);
            this.d.f(y);
            ((u55) this.d).q0(w55Var.z());
            MtopBusiness build = MtopBusiness.build(this.c);
            build.allowParseJson(this.t);
            if (w55Var.m() != null) {
                build.handler(w55Var.m());
            }
            boolean w0 = w55Var.w0();
            this.f25556a = w0;
            build.upstreamCompress(w0);
            u(build, w55Var);
            this.u = new StreamNextRpcRequest(build, s);
        }
    }

    public static /* synthetic */ Context c(opq opqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("24bd4619", new Object[]{opqVar});
        }
        return opqVar.q;
    }

    public static /* synthetic */ boolean d(opq opqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e70ad66", new Object[]{opqVar})).booleanValue();
        }
        return opqVar.r;
    }

    public static /* synthetic */ fsb e(opq opqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fsb) ipChange.ipc$dispatch("fead0d40", new Object[]{opqVar});
        }
        return opqVar.d;
    }

    public static /* synthetic */ StreamNextRpcRequest f(opq opqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StreamNextRpcRequest) ipChange.ipc$dispatch("6778fcb4", new Object[]{opqVar});
        }
        return opqVar.u;
    }

    public static /* synthetic */ String g(opq opqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0cc8e5d", new Object[]{opqVar});
        }
        return opqVar.o;
    }

    public static /* synthetic */ boolean h(opq opqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44c813e8", new Object[]{opqVar})).booleanValue();
        }
        return opqVar.g;
    }

    public static /* synthetic */ List i(opq opqVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("85cc3971", new Object[]{opqVar, list});
        }
        return opqVar.t(list);
    }

    public static /* synthetic */ MtopRequest j(opq opqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("24206691", new Object[]{opqVar});
        }
        return opqVar.c;
    }

    public static /* synthetic */ Map k(opq opqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("348ccf9c", new Object[]{opqVar});
        }
        return opqVar.r();
    }

    public static /* synthetic */ void l(opq opqVar, MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35e71c6", new Object[]{opqVar, mtopBusiness});
        } else {
            opqVar.w(mtopBusiness);
        }
    }

    public static /* synthetic */ String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("502f6101", new Object[0]);
        }
        return v;
    }

    public static /* synthetic */ String n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1225aff5", new Object[]{str});
        }
        v = str;
        return str;
    }

    public static /* synthetic */ void o(opq opqVar, MtopBusiness mtopBusiness, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f33053d", new Object[]{opqVar, mtopBusiness, map});
        } else {
            opqVar.x(mtopBusiness, map);
        }
    }

    @Override // tb.etd
    public String a(lpq lpqVar, Object obj, ux uxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72ea9e3", new Object[]{this, lpqVar, obj, uxVar});
        }
        return q(lpqVar, obj, uxVar);
    }

    @Override // tb.etd
    public String b(lpq lpqVar, ux uxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ae6cf3f", new Object[]{this, lpqVar, uxVar});
        }
        return q(lpqVar, null, uxVar);
    }

    @Override // tb.etd
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        }
    }

    public final void p(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c65073f0", new Object[]{this, map});
        } else if (this.b) {
            try {
                if (kjf.a()) {
                    JSONObject parseObject = JSON.parseObject(map.get("exParams"));
                    if (parseObject == null) {
                        parseObject = new JSONObject();
                    }
                    parseObject.put("inner", (Object) "1");
                    map.put("exParams", parseObject.toJSONString());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac9b3d56", new Object[]{this});
        }
        return v;
    }

    public final List<JSONObject> t(List<AttachedResponse> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b66cc66e", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() >= 1) {
            try {
                for (AttachedResponse attachedResponse : list) {
                    if (attachedResponse != null) {
                        arrayList.add(JSON.parseObject(attachedResponse.getBody()));
                    }
                }
            } catch (Throwable th) {
                UnifyLog.d("StreamNextRpcRequester", th.getMessage());
            }
        }
        return arrayList;
    }

    public final void u(MtopBusiness mtopBusiness, w55 w55Var) {
        MethodEnum methodEnum;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f588fef7", new Object[]{this, mtopBusiness, w55Var});
            return;
        }
        mtopBusiness.prefetchMode(w55Var.E());
        mtopBusiness.supportStreamJson(w55Var.P());
        if (this.e) {
            methodEnum = MethodEnum.POST;
        } else {
            methodEnum = MethodEnum.GET;
        }
        mtopBusiness.reqMethod(methodEnum);
        if (!this.e && this.s) {
            mtopBusiness.allowSwitchToPOST(true);
        }
        if (this.k) {
            mtopBusiness.useWua();
        }
        int i = this.j;
        if (i != -1) {
            try {
                mtopBusiness.setBizId(i);
            } catch (Exception unused) {
            }
        }
        String str = this.o;
        if (str != null) {
            mtopBusiness.setBizId(str);
        }
        if (!TextUtils.isEmpty(this.p)) {
            mtopBusiness.setBizTopic(this.p);
        }
        if (!TextUtils.isEmpty(this.i)) {
            mtopBusiness.setUnitStrategy(this.i);
        }
        Map<String, String> map = this.l;
        if (map != null) {
            mtopBusiness.headers(map);
        }
    }

    public final void v(MtopRequest mtopRequest, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccb0706e", new Object[]{this, mtopRequest, map});
        } else if (mtopRequest != null) {
            mtopRequest.dataParams = map;
        }
    }

    public final void w(MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5db91015", new Object[]{this, mtopBusiness});
        }
    }

    public final void x(MtopBusiness mtopBusiness, Map<String, String> map) {
        String str;
        MtopRequest mtopRequest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac668f73", new Object[]{this, mtopBusiness, map});
            return;
        }
        if (mtopBusiness == null || (mtopRequest = mtopBusiness.request) == null) {
            str = "";
        } else {
            str = mtopRequest.getApiName();
        }
        vuv.b("ultron-nextrpc-attached-response", str, "", map);
    }

    public final String q(lpq lpqVar, Object obj, ux uxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e9b6318", new Object[]{this, lpqVar, obj, uxVar});
        }
        String str = this.o;
        if (str != null && xav.e(str) == null) {
            new a().execute(new Void[0]);
        }
        fsb fsbVar = this.d;
        if (!(fsbVar instanceof u55)) {
            return "";
        }
        u55 u55Var = (u55) fsbVar;
        u55Var.x0(this.h);
        if (this.n == null) {
            this.n = new HashMap();
        }
        p(this.n);
        if (this.f) {
            if (this.h) {
                this.n.put("feature", "{\"gzip\":\"true\"}");
            }
            z9v u = z9v.u(this.q);
            u.e("gzip", String.valueOf(this.h));
            u.e("upstreamCompress", String.valueOf(this.f25556a));
            u.D("processData", "apmClientBeforeNetworkLogicProcess");
            long currentTimeMillis = System.currentTimeMillis();
            this.n.put("params", u55Var.v().a(u55Var, this.m));
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(this.n);
            this.c.setData(jSONObject.toJSONString());
            v(this.c, this.n);
            if (this.o != null) {
                pwl pwlVar = new pwl(this.o);
                pwlVar.e("上行数据处理");
                pwlVar.sampling(scv.b() ? 1.0f : 0.001f);
                pwlVar.a(this.o + "#asyncProcessData", System.currentTimeMillis() - currentTimeMillis);
                StringBuilder sb = new StringBuilder("upstreamCompress:");
                sb.append(this.f25556a);
                pwlVar.b("d1", sb.toString());
                pwlVar.b("d2", "gzip:" + this.h);
                f9v.t(pwlVar);
            }
            u.B("processData", false, null);
        } else if (this.g) {
            if (this.h) {
                this.n.put("feature", "{\"gzip\":\"true\"}");
            }
            this.n.put("params", u55Var.v().t(u55Var));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putAll(this.n);
            this.c.setData(jSONObject2.toJSONString());
            v(this.c, this.n);
        } else {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.putAll(this.n);
            this.c.setData(jSONObject3.toJSONString());
            v(this.c, this.n);
        }
        x55.j(this.q);
        c cVar = new c(this.u.getMtopBusiness(), uxVar, u55Var);
        mav j = lav.j(this.u, cVar, new b(lpqVar, cVar));
        if (j.b()) {
            v = j.a();
            hav.d("StreamNextRpcRequester", "命中预请求");
            z9v.u(this.q).e("hitPreRequest", "true");
            return v;
        }
        uxVar.k(this.d);
        v = lpqVar.a(this.u, cVar);
        vxu.d(this.d, this.c);
        return v;
    }

    public final Map<String, String> r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("79854d7f", new Object[]{this});
        }
        if (!(this.q instanceof Activity)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            String[] strArr = {"preBizName"};
            for (int i = 0; i < 1; i++) {
                String str = strArr[i];
                String queryParameter = ((Activity) this.q).getIntent().getData().getQueryParameter(str);
                if (queryParameter != null) {
                    hashMap.put(str, queryParameter);
                }
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }
}
