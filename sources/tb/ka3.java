package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ka3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f22508a;

        public a(boolean z) {
            this.f22508a = z;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartCheckPromotionSubscriber$1");
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
            } else {
                ka3.p(ka3.this, !this.f22508a);
            }
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
        t2o.a(479199374);
    }

    public static /* synthetic */ Object ipc$super(ka3 ka3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartCheckPromotionSubscriber");
    }

    public static /* synthetic */ void p(ka3 ka3Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b31702b", new Object[]{ka3Var, new Boolean(z)});
        } else {
            ka3Var.r(z);
        }
    }

    public final void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8891661", new Object[]{this, new Boolean(z)});
            return;
        }
        JSONObject fields = this.e.getFields();
        fields.put("isChecked", (Object) (z + ""));
        this.k.B().Q(z);
        this.j.e().E(4);
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        if (!"true".equals((String) lcuVar.e("isChecked")) && q(this.e)) {
            z = false;
        }
        r(z);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.e.getKey());
        this.f23048a.m("operateItems", arrayList);
        this.j.k0(this.e, this.f23048a, true, new a(z), null);
    }

    public final boolean q(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0cf0cb4", new Object[]{this, iDMComponent})).booleanValue();
        }
        if (iDMComponent == null || iDMComponent.getFields() == null) {
            return false;
        }
        JSONObject fields = iDMComponent.getFields();
        return fields.containsKey("isChecked") && "true".equals(fields.getString("isChecked"));
    }
}
