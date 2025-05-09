package com.taobao.tao.alipay.cashdesk.scope;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import com.taobao.tao.alipay.cashdesk.scope.PayAsyncQueryScope;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a07;
import tb.bf3;
import tb.ckf;
import tb.f7l;
import tb.g1a;
import tb.g1p;
import tb.pav;
import tb.uj3;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class PayAsyncQueryScope {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a f11898a;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/taobao/tao/alipay/cashdesk/scope/PayAsyncQueryScope$ActionType;", "", "", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", NetworkAbility.API_GET_TYPE, "()Ljava/lang/String;", "Companion", "a", "CONTINUE_QUERY", "GO_CASHIER", "MARKETING_POP", "SUCCESS", "FAIL", "cashdesk_aar_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum ActionType {
        CONTINUE_QUERY("continueQuery"),
        GO_CASHIER("goCashier"),
        MARKETING_POP("marketingPop"),
        SUCCESS("success"),
        FAIL("fail");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a Companion = new a(null);
        private final String type;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static final class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public final ActionType a(String str) {
                ActionType actionType;
                int i = 0;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (ActionType) ipChange.ipc$dispatch("e6966155", new Object[]{this, str});
                }
                ActionType[] values = ActionType.values();
                int length = values.length;
                while (true) {
                    if (i >= length) {
                        actionType = null;
                        break;
                    }
                    actionType = values[i];
                    if (ckf.b(actionType.getType(), str)) {
                        break;
                    }
                    i++;
                }
                if (actionType != null) {
                    return actionType;
                }
                return ActionType.FAIL;
            }

            public /* synthetic */ a(a07 a07Var) {
                this();
            }
        }

        ActionType(String str) {
            this.type = str;
        }

        public static /* synthetic */ Object ipc$super(ActionType actionType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/alipay/cashdesk/scope/PayAsyncQueryScope$ActionType");
        }

        public static ActionType valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("ba9004b1", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(ActionType.class, str);
            }
            return (ActionType) valueOf;
        }

        public final String getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
            }
            return this.type;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void a(JSONObject jSONObject, String str, String str2);

        void b(JSONObject jSONObject);

        void c(JSONObject jSONObject);

        void onSuccess();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ActionType f11899a;
        public final JSONObject b;
        public final String c;
        public final String d;

        public b(ActionType actionType, JSONObject jSONObject, String str, String str2) {
            ckf.g(actionType, "result");
            this.f11899a = actionType;
            this.b = jSONObject;
            this.c = str;
            this.d = str2;
        }

        public final JSONObject a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("d7fd55de", new Object[]{this});
            }
            return this.b;
        }

        public final ActionType b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ActionType) ipChange.ipc$dispatch("714826b0", new Object[]{this});
            }
            return this.f11899a;
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9f243c01", new Object[]{this});
            }
            return this.c;
        }

        public final String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("56cc85d", new Object[]{this});
            }
            return this.d;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (!ckf.b(this.f11899a, bVar.f11899a) || !ckf.b(this.b, bVar.b) || !ckf.b(this.c, bVar.c) || !ckf.b(this.d, bVar.d)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            ActionType actionType = this.f11899a;
            if (actionType != null) {
                i = actionType.hashCode();
            } else {
                i = 0;
            }
            int i5 = i * 31;
            JSONObject jSONObject = this.b;
            if (jSONObject != null) {
                i2 = jSONObject.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 31;
            String str = this.c;
            if (str != null) {
                i3 = str.hashCode();
            } else {
                i3 = 0;
            }
            int i7 = (i6 + i3) * 31;
            String str2 = this.d;
            if (str2 != null) {
                i4 = str2.hashCode();
            }
            return i7 + i4;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "QueryResponse(result=" + this.f11899a + ", response=" + this.b + ", retCode=" + this.c + ", retMessage=" + this.d + f7l.BRACKET_END_STR;
        }

        public /* synthetic */ b(ActionType actionType, JSONObject jSONObject, String str, String str2, int i, a07 a07Var) {
            this(actionType, jSONObject, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2);
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ltb/xhv;", "run", "()V", "com/taobao/tao/alipay/cashdesk/scope/PayAsyncQueryScope$startPollingTask$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ g1p b;

        public c(g1p g1pVar) {
            this.b = g1pVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                PayAsyncQueryScope.c(PayAsyncQueryScope.this, this.b, 0);
            }
        }
    }

    public PayAsyncQueryScope(a aVar) {
        ckf.g(aVar, "callback");
        this.f11898a = aVar;
    }

    public static final /* synthetic */ a a(PayAsyncQueryScope payAsyncQueryScope) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e0eefb3d", new Object[]{payAsyncQueryScope});
        }
        return payAsyncQueryScope.f11898a;
    }

    public static final /* synthetic */ JSONObject b(PayAsyncQueryScope payAsyncQueryScope, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a86c3372", new Object[]{payAsyncQueryScope, mtopResponse});
        }
        return payAsyncQueryScope.e(mtopResponse);
    }

    public static final /* synthetic */ void c(PayAsyncQueryScope payAsyncQueryScope, g1p g1pVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7747a327", new Object[]{payAsyncQueryScope, g1pVar, new Integer(i)});
        } else {
            payAsyncQueryScope.g(g1pVar, i);
        }
    }

    public final JSONObject e(MtopResponse mtopResponse) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d76ecac0", new Object[]{this, mtopResponse});
        }
        JSONObject originFastJsonObject = mtopResponse.getOriginFastJsonObject();
        if (originFastJsonObject == null) {
            byte[] bytedata = mtopResponse.getBytedata();
            if (bytedata != null) {
                str = new String(bytedata, uj3.UTF_8);
            } else {
                str = "";
            }
            originFastJsonObject = JSON.parseObject(str);
        }
        if (originFastJsonObject != null) {
            return originFastJsonObject.getJSONObject("data");
        }
        return null;
    }

    public final void f(g1p g1pVar, int i, final g1a<? super b, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d6d397d", new Object[]{this, g1pVar, new Integer(i), g1aVar});
        } else {
            d(g1pVar, i).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.tao.alipay.cashdesk.scope.PayAsyncQueryScope$performTask$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                private final PayAsyncQueryScope.b onFailure(MtopResponse mtopResponse) {
                    String str;
                    String api;
                    String retMsg;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (PayAsyncQueryScope.b) ipChange2.ipc$dispatch("fbfb002a", new Object[]{this, mtopResponse});
                    }
                    String str2 = "";
                    if (mtopResponse == null || (str = mtopResponse.getRetCode()) == null) {
                        str = str2;
                    }
                    if (!(mtopResponse == null || (retMsg = mtopResponse.getRetMsg()) == null)) {
                        str2 = retMsg;
                    }
                    if (!(mtopResponse == null || (api = mtopResponse.getApi()) == null)) {
                        bf3.h(bf3.b.o(api, false).sampling(1.0f).message(str2));
                    }
                    return new PayAsyncQueryScope.b(PayAsyncQueryScope.ActionType.FAIL, null, str, str2);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                    } else {
                        g1aVar.invoke(onFailure(mtopResponse));
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    PayAsyncQueryScope.b bVar;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    String str = null;
                    if (mtopResponse != null) {
                        JSONObject b2 = PayAsyncQueryScope.b(PayAsyncQueryScope.this, mtopResponse);
                        if (b2 != null) {
                            str = b2.getString("actionType");
                        }
                        bVar = new PayAsyncQueryScope.b(PayAsyncQueryScope.ActionType.Companion.a(str), b2, null, null, 12, null);
                    } else {
                        bVar = onFailure(null);
                    }
                    g1aVar.invoke(bVar);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                    } else {
                        g1aVar.invoke(onFailure(mtopResponse));
                    }
                }
            }).startRequest();
        }
    }

    public final void h(g1p g1pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d73b2c", new Object[]{this, g1pVar});
            return;
        }
        ckf.g(g1pVar, "searchConfig");
        Long f = g1pVar.f();
        if (f != null) {
            pav.l(new c(g1pVar), f.longValue());
        }
    }

    public final MtopBusiness d(g1p g1pVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("81b94c67", new Object[]{this, g1pVar, new Integer(i)});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(g1pVar.a());
        mtopRequest.setVersion(g1pVar.e());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> b2 = g1pVar.b();
        if (b2 == null) {
            b2 = new LinkedHashMap<>();
        }
        linkedHashMap.putAll(b2);
        linkedHashMap.put("totalQueryTimes", String.valueOf(g1pVar.d()));
        linkedHashMap.put("curQueryTimes", String.valueOf(i));
        xhv xhvVar = xhv.INSTANCE;
        mtopRequest.dataParams = linkedHashMap;
        mtopRequest.setData(JSON.toJSONString(linkedHashMap));
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.supportStreamJson(true);
        return build;
    }

    public final void g(g1p g1pVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("364a0595", new Object[]{this, g1pVar, new Integer(i)});
            return;
        }
        Integer d = g1pVar.d();
        ckf.d(d);
        if (i >= d.intValue()) {
            this.f11898a.a(null, "", "");
            bf3.a a2 = bf3.a.a("payQueryTimes");
            bf3.f(a2.tag("轮询:" + i).sampling(0.1f));
            return;
        }
        f(g1pVar, 1 + i, new PayAsyncQueryScope$pollTask$1(this, i, g1pVar));
    }
}
