package tb;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vor extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Handler l = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f30145a;

        public a(List list) {
            this.f30145a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                vor.p(vor.this, false, this.f30145a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f30146a;

        public b(String str) {
            this.f30146a = str;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/event/TBManagerClickedSubscriber$2");
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            vor.q(vor.this).W(this.f30146a);
            vor.r(vor.this).e().D();
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
        t2o.a(478150786);
    }

    public static /* synthetic */ Object ipc$super(vor vorVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/event/TBManagerClickedSubscriber");
    }

    public static /* synthetic */ void p(vor vorVar, boolean z, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83fe3519", new Object[]{vorVar, new Boolean(z), list});
        } else {
            vorVar.s(z, list);
        }
    }

    public static /* synthetic */ zxb q(vor vorVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxb) ipChange.ipc$dispatch("1f1698b9", new Object[]{vorVar});
        }
        return vorVar.k;
    }

    public static /* synthetic */ kmb r(vor vorVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("a15ba833", new Object[]{vorVar});
        }
        return vorVar.j;
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        fdv.d(lcuVar);
        if (lcuVar != null) {
            List<IDMComponent> components = this.k.c().getComponents();
            s(true, components);
            cb4.a0(this.k, "elevator", false);
            this.k.r();
            ac4.a(this.j);
            y0n V = this.j.V();
            if (V != null) {
                V.e();
            }
            ir6.g((u55) this.d);
            ir6.h(this.d, this.b);
            this.j.e().D();
            this.l.post(new a(components));
            boolean K = this.k.K();
            if (!this.k.J() && K) {
                String A = this.k.A();
                this.k.W("");
                this.j.i0(true, null, new b(A));
            }
            kmb kmbVar = this.j;
            juv.b(kmbVar, "Page_ShoppingCart_Header_ManageClick", "isManaging=" + K);
        }
    }

    public final void s(boolean z, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f52ac0a1", new Object[]{this, new Boolean(z), list});
        } else if (list != null) {
            for (IDMComponent iDMComponent : list) {
                JSONObject fields = iDMComponent.getFields();
                if (fields != null) {
                    fields.put("_needTransition", (Object) Boolean.valueOf(z));
                }
            }
        }
    }
}
