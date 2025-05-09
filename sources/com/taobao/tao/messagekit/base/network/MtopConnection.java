package com.taobao.tao.messagekit.base.network;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.MsgRouter;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.messagekit.core.utils.MsgMonitor;
import com.taobao.taolive.sdk.model.message.PowerMsgType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;
import tb.gay;
import tb.h6y;
import tb.ikl;
import tb.l5y;
import tb.lkd;
import tb.t2o;
import tb.t7y;
import tb.ts1;
import tb.vxx;
import tb.x9o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class MtopConnection extends ts1<Map<String, Object>, byte[]> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_API = "api";
    public static final String KEY_DATA = "data";
    public static final String KEY_DID = "did";
    public static final String KEY_ID = "id";
    public static final String KEY_REQ_MODE = "req";
    public static final String KEY_RESULT = "result";
    public static final String KEY_TIMEOUT = "timeout";
    public static final String KEY_VERSION = "version";
    public static final String REQ_MODE_GET = "get";
    public static final String REQ_MODE_POST = "post";
    public static final String TAG = "MtopConnection";
    public final vxx<Map<String, Object>> e = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements vxx<x9o.a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12538a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ String c;

        public a(int i, Map map, String str) {
            this.f12538a = i;
            this.b = map;
            this.c = str;
        }

        /* renamed from: a */
        public void accept(x9o.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1800d4a5", new Object[]{this, aVar});
            } else if (aVar != null) {
                MtopConnection mtopConnection = MtopConnection.this;
                int i = this.f12538a;
                Map map = this.b;
                int k = mtopConnection.k(i, (String) (map != null ? map.get("re_msg") : null));
                Ack a2 = MtopConnection.this.c() != null ? MtopConnection.this.c().a(k, this.b) : null;
                if (a2 == null) {
                    a2 = Ack.create();
                }
                a2.setStatus(k);
                a2.setID(this.c);
                ikl iklVar = new ikl(a2);
                iklVar.c = this.c;
                Map map2 = this.b;
                iklVar.n = map2 != null ? map2.get("context") : null;
                l5y.m(iklVar).a(aVar);
                if (-30000 == k || 1000 == k) {
                    MtopConnection.m(MtopConnection.this, 0);
                    MsgMonitor.f("MKT", "MKT_ACCS_RATE");
                    return;
                }
                if (MtopConnection.n(MtopConnection.this) < 3) {
                    MtopConnection.o(MtopConnection.this);
                }
                MsgMonitor.c("MKT", "MKT_ACCS_RATE", "" + this.f12538a, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements t7y<x9o.a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12539a;

        public b(MtopConnection mtopConnection, String str) {
            this.f12539a = str;
        }

        public void a(h6y<x9o.a> h6yVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b883867", new Object[]{this, h6yVar});
                return;
            }
            x9o h = MsgRouter.e().h();
            String str = this.f12539a;
            x9o.a b = h.b(str, str);
            if (b != null) {
                h6yVar.a(b);
            }
            h6yVar.a_();
        }
    }

    static {
        t2o.a(628097128);
    }

    public MtopConnection() {
        this.f28920a = 1;
    }

    public static /* synthetic */ Object ipc$super(MtopConnection mtopConnection, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/messagekit/base/network/MtopConnection");
    }

    public static /* synthetic */ int m(MtopConnection mtopConnection, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f6b8bd3", new Object[]{mtopConnection, new Integer(i)})).intValue();
        }
        mtopConnection.b = i;
        return i;
    }

    public static /* synthetic */ int n(MtopConnection mtopConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ac6b057", new Object[]{mtopConnection})).intValue();
        }
        return mtopConnection.b;
    }

    public static /* synthetic */ int o(MtopConnection mtopConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37144d72", new Object[]{mtopConnection})).intValue();
        }
        int i = mtopConnection.b + 1;
        mtopConnection.b = i;
        return i;
    }

    @Override // tb.ts1
    public void h(ikl iklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7150024e", new Object[]{this, iklVar});
            return;
        }
        MsgRouter.e().h().c(iklVar.f21366a.getID(), iklVar);
        if (b() != null) {
            l5y.m(new ArrayList<ikl>(iklVar) { // from class: com.taobao.tao.messagekit.base.network.MtopConnection.1
                public final /* synthetic */ ikl val$p;

                {
                    this.val$p = iklVar;
                    add(iklVar);
                }
            }).I(gay.b()).z(b()).K(this.e);
        } else {
            MsgLog.g(TAG, "getConverter2Data is null !!!!!!");
        }
    }

    public abstract void p(Map<String, Object> map, lkd lkdVar);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements vxx<Map<String, Object>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements lkd {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Map f12541a;

            public a(Map map) {
                this.f12541a = map;
            }

            @Override // tb.lkd
            public void onResult(int i, Map<String, Object> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("170ed185", new Object[]{this, new Integer(i), map});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("mqtt_type", this.f12541a.get("mqtt_type"));
                hashMap.put("msg_type", this.f12541a.get("msg_type"));
                hashMap.put("sub_type", this.f12541a.get("sub_type"));
                if (map != null) {
                    hashMap.put("data", map.get("result"));
                    hashMap.put("context", map.get("context"));
                    hashMap.put("re_msg", map.get("re_msg"));
                    if (MsgLog.k(MsgLog.Level.D)) {
                        MsgLog.e(MtopConnection.TAG, "mtop onResult", map);
                    }
                }
                MtopConnection.this.g((String) this.f12541a.get("id"), i, hashMap);
            }
        }

        /* renamed from: a */
        public void accept(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d08b616", new Object[]{this, map});
                return;
            }
            MsgLog.i(MtopConnection.TAG, "send data map:", Integer.valueOf(map.size()));
            MtopConnection.this.p(map, new a(map));
        }
    }

    @Override // tb.ts1
    public int k(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b6758dc4", new Object[]{this, new Integer(i), str})).intValue();
        }
        if ("SUCCESS".equalsIgnoreCase(str)) {
            return 1000;
        }
        if (ErrorConstant.ERRCODE_MTOP_APICALL_ASYNC_TIMEOUT.equalsIgnoreCase(str) || -202 == i) {
            return PowerMsgType.TIMEOUT;
        }
        if ("ANDROID_SYS_API_FLOW_LIMIT_LOCKED".equalsIgnoreCase(str) || String.valueOf(4001).equals(str)) {
            return 4001;
        }
        if ("ANDROID_SYS_NETWORK_ERROR".equalsIgnoreCase(str)) {
            return -3004;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            MsgLog.g(TAG, "transCode", Integer.valueOf(i), str);
            return 2000;
        }
    }

    @Override // tb.ts1
    public void g(String str, int i, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("327e61f3", new Object[]{this, str, new Integer(i), map});
            return;
        }
        MsgLog.i(TAG, "type:", Integer.valueOf(this.f28920a), str, "response:", Integer.valueOf(i), "service:", map != null ? map.get("service_id") : null);
        l5y.x(new b(this, str)).K(new a(i, map, str));
    }
}
