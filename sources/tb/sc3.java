package tb;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sc3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Handler l = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ lcu f27937a;

        public a(lcu lcuVar) {
            this.f27937a = lcuVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                sc3.this.t(this.f27937a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ gsb f27938a;

        public b(gsb gsbVar) {
            this.f27938a = gsbVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/event/CartPopupQuerySubscriber$2");
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            sc3.q(sc3.this).Q().c(this.f27938a);
            sc3.r(sc3.this).e().F0(false);
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
            } else {
                sc3.s(sc3.this).e().F0(false);
            }
        }

        @Override // tb.ux
        public boolean e(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c4610746", new Object[]{this, new Integer(i), mtopResponse, obj})).booleanValue();
            }
            return !sc3.p(sc3.this).d().L();
        }
    }

    static {
        t2o.a(478150777);
    }

    public static /* synthetic */ Object ipc$super(sc3 sc3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/event/CartPopupQuerySubscriber");
    }

    public static /* synthetic */ kmb p(sc3 sc3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("44583fe1", new Object[]{sc3Var});
        }
        return sc3Var.j;
    }

    public static /* synthetic */ kmb q(sc3 sc3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("84d35580", new Object[]{sc3Var});
        }
        return sc3Var.j;
    }

    public static /* synthetic */ kmb r(sc3 sc3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("c54e6b1f", new Object[]{sc3Var});
        }
        return sc3Var.j;
    }

    public static /* synthetic */ kmb s(sc3 sc3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("5c980be", new Object[]{sc3Var});
        }
        return sc3Var.j;
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
        } else {
            this.l.post(new a(lcuVar));
        }
    }

    public void t(lcu lcuVar) {
        JSONObject data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adebd168", new Object[]{this, lcuVar});
            return;
        }
        JSONObject c = c();
        String string = c.getString("filterItem");
        JSONObject jSONObject = c.getJSONObject(RequestConfig.CUSTOM_EXPARAMS);
        this.k.V(string);
        HashMap hashMap = new HashMap();
        hashMap.put(RequestConfig.IS_POP_LAYER_FIRST_PAGE, "true");
        hashMap.put(RequestConfig.IS_POP_LAYE_RQUERY, "true");
        if (jSONObject != null) {
            hashMap.put(RequestConfig.CUSTOM_EXPARAMS, jSONObject.toJSONString());
        }
        List<gsb> list = this.e.getEventMap().get(lcuVar.g());
        gsb gsbVar = null;
        if (list != null) {
            for (gsb gsbVar2 : list) {
                if ("openPopupWindow".equals(gsbVar2.getType())) {
                    hashMap.put("_requestContext", gsbVar2.getFields().getString("nextRenderRoot"));
                    gsbVar = gsbVar2;
                }
            }
        }
        if ("cartTimePromotion".equals(this.e.getTag()) && (data = this.e.getData()) != null) {
            data.put("status", (Object) "hidden");
        }
        this.j.e().E(4);
        this.j.e().F0(true);
        this.j.f0(false, hashMap, new b(gsbVar));
    }
}
