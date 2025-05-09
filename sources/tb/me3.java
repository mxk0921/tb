package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class me3 implements mmb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String actionType = "requestSubProtocol#triggerEvent";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(478150689);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ltb/xhv;", "run", "()V", "com/taobao/android/icart/broadcast/wvprocessor/impl/CartWVTriggerEventProcessor$process$tradeEvent$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23985a;
        public final /* synthetic */ IDMComponent b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Ref$ObjectRef d;
        public final /* synthetic */ kmb e;
        public final /* synthetic */ WVCallBackContext f;
        public final /* synthetic */ String g;

        public b(String str, IDMComponent iDMComponent, String str2, Ref$ObjectRef ref$ObjectRef, kmb kmbVar, WVCallBackContext wVCallBackContext, String str3) {
            this.f23985a = str;
            this.b = iDMComponent;
            this.c = str2;
            this.d = ref$ObjectRef;
            this.e = kmbVar;
            this.f = wVCallBackContext;
            this.g = str3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            fsb j = this.e.j();
            if (j instanceof u55) {
                WVCallBackContext wVCallBackContext = this.f;
                nsw nswVar = nsw.RET_SUCCESS;
                nswVar.a("protocol", wc3.INSTANCE.a(((u55) j).z(), this.g));
                xhv xhvVar = xhv.INSTANCE;
                wVCallBackContext.success(nswVar);
                return;
            }
            this.f.error("状态错误");
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ltb/xhv;", "run", "()V", "com/taobao/android/icart/broadcast/wvprocessor/impl/CartWVTriggerEventProcessor$process$tradeEvent$1$2", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23986a;
        public final /* synthetic */ IDMComponent b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Ref$ObjectRef d;
        public final /* synthetic */ kmb e;
        public final /* synthetic */ WVCallBackContext f;
        public final /* synthetic */ String g;

        public c(String str, IDMComponent iDMComponent, String str2, Ref$ObjectRef ref$ObjectRef, kmb kmbVar, WVCallBackContext wVCallBackContext, String str3) {
            this.f23986a = str;
            this.b = iDMComponent;
            this.c = str2;
            this.d = ref$ObjectRef;
            this.e = kmbVar;
            this.f = wVCallBackContext;
            this.g = str3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f.error();
            }
        }
    }

    static {
        t2o.a(478150688);
        t2o.a(478150684);
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [T, java.lang.Object, tb.gsb] */
    @Override // tb.mmb
    public boolean a(kmb kmbVar, JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        String string;
        String string2;
        String string3;
        String string4;
        IDMComponent componentByName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1efbaae", new Object[]{this, kmbVar, jSONObject, wVCallBackContext})).booleanValue();
        }
        ckf.g(kmbVar, "presenter");
        ckf.g(jSONObject, "params");
        ckf.g(wVCallBackContext, "callback");
        JSONObject jSONObject2 = jSONObject.getJSONObject("exParams");
        if (!(jSONObject2 == null || (string = jSONObject2.getString("componentKey")) == null || (string2 = jSONObject2.getString("eventArea")) == null || (string3 = jSONObject2.getString("eventType")) == null || (string4 = jSONObject.getString("renderRoot")) == null || (componentByName = kmbVar.j().getComponentByName(string)) == null)) {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = null;
            List<gsb> list = componentByName.getEventMap().get(string2);
            if (list != null) {
                Iterator<gsb> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    gsb next = it.next();
                    ckf.f(next, "event");
                    if (ckf.b(string3, next.getType())) {
                        ref$ObjectRef.element = next;
                        break;
                    }
                }
                if (((gsb) ref$ObjectRef.element) == null) {
                    return false;
                }
                lcu h = kmbVar.h();
                ckf.f(h, "this");
                h.l(string3);
                h.i(componentByName);
                h.q(string2);
                h.k((gsb) ref$ObjectRef.element);
                h.m("requestSuccessCallback", new b(string3, componentByName, string2, ref$ObjectRef, kmbVar, wVCallBackContext, string4));
                h.m("requestFailCallback", new c(string3, componentByName, string2, ref$ObjectRef, kmbVar, wVCallBackContext, string4));
                kmbVar.g().h(h);
                return true;
            }
        }
        return false;
    }
}
