package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class le3 implements mmb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String actionType = "requestSubProtocol#queryNextPage";

    /* renamed from: a  reason: collision with root package name */
    public final String f23287a = "CartWVRequestNextPageProcessor";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(478150686);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WVCallBackContext b;
        public final /* synthetic */ String c;

        public b(WVCallBackContext wVCallBackContext, String str) {
            this.b = wVCallBackContext;
            this.c = str;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/broadcast/wvprocessor/impl/CartWVRequestNextPageProcessor$process$1");
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            ckf.g(mtopResponse, "response");
            WVCallBackContext wVCallBackContext = this.b;
            nsw nswVar = nsw.RET_FAIL;
            nswVar.b(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
            xhv xhvVar = xhv.INSTANCE;
            wVCallBackContext.error(nswVar);
            hav.b(le3.b(le3.this), "error,", mtopResponse.getRetMsg());
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                return;
            }
            ckf.g(mtopResponse, "response");
            WVCallBackContext wVCallBackContext = this.b;
            nsw nswVar = nsw.RET_SUCCESS;
            if (fsbVar instanceof u55) {
                u55 u55Var = (u55) fsbVar;
                hav.h(le3.b(le3.this), "onSuccess#fullProtocolData", u55Var.z());
                JSONObject a2 = wc3.INSTANCE.a(u55Var.z(), this.c);
                if (a2 != null) {
                    hav.h(le3.b(le3.this), "onSuccess#subProtocol", a2);
                    nswVar.b("protocol", a2.toJSONString());
                } else {
                    return;
                }
            }
            xhv xhvVar = xhv.INSTANCE;
            wVCallBackContext.success(nswVar);
            hav.d(le3.b(le3.this), "success");
        }
    }

    static {
        t2o.a(478150685);
        t2o.a(478150684);
    }

    public static final /* synthetic */ String b(le3 le3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("156b906", new Object[]{le3Var});
        }
        return le3Var.f23287a;
    }

    @Override // tb.mmb
    public boolean a(kmb kmbVar, JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1efbaae", new Object[]{this, kmbVar, jSONObject, wVCallBackContext})).booleanValue();
        }
        ckf.g(kmbVar, "presenter");
        ckf.g(jSONObject, "params");
        ckf.g(wVCallBackContext, "callback");
        JSONObject jSONObject2 = jSONObject.getJSONObject("exParams");
        if (jSONObject2 == null || (string = jSONObject.getString("renderRoot")) == null) {
            return false;
        }
        hav.h(this.f23287a, "process#params", jSONObject);
        new id3(kmbVar).e(false, jSONObject2, new b(wVCallBackContext, string));
        return true;
    }
}
