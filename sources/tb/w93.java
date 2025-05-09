package tb;

import android.text.TextUtils;
import com.alibaba.android.icart.core.data.DataBizContext;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class w93 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f30525a;

        public a(String str) {
            this.f30525a = str;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/event/CartAddOnTabClickSubscriber$1");
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            w93.p(w93.this).V(this.f30525a);
            w93.q(w93.this).e().B0();
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
            }
        }
    }

    static {
        t2o.a(478150772);
    }

    public static /* synthetic */ Object ipc$super(w93 w93Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/event/CartAddOnTabClickSubscriber");
    }

    public static /* synthetic */ zxb p(w93 w93Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxb) ipChange.ipc$dispatch("15826047", new Object[]{w93Var});
        }
        return w93Var.k;
    }

    public static /* synthetic */ kmb q(w93 w93Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("5160ac63", new Object[]{w93Var});
        }
        return w93Var.j;
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        DataBizContext.CartGroupContext h;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        Object[] objArr = (Object[]) lcuVar.e("extraParams");
        if (objArr != null && objArr.length >= 2) {
            String str = (String) f(1);
            if (!TextUtils.isEmpty(str) && (f(2) instanceof Integer)) {
                String y = this.k.y();
                if (!str.equals(y) || (h = this.k.B().h()) == null) {
                    z = true;
                } else {
                    str = h.getDefaultFilterItem();
                }
                this.k.B().o(this.e.getKey()).b(lcuVar, ((Integer) f(2)).intValue());
                this.k.V(str);
                this.j.e().h0().c(1);
                HashMap hashMap = new HashMap();
                hashMap.put(RequestConfig.IS_POP_LAYER_FIRST_PAGE, "true");
                hashMap.put(RequestConfig.IS_POP_LAYE_RQUERY, "true");
                if (this.e.getFields().containsKey("tabRequestConfig")) {
                    hashMap.put(RequestConfig.CUSTOM_EXPARAMS, String.valueOf(this.e.getFields().get("tabRequestConfig")));
                }
                this.j.f0(true, hashMap, new a(y));
                kmb kmbVar = this.j;
                juv.b(kmbVar, "Page_ShoppingCart_AddOn_TabClick", "isOpen=" + z);
            }
        }
    }
}
