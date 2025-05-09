package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class od3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25308a;

        /* compiled from: Taobao */
        /* renamed from: tb.od3$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class RunnableC1015a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ RecyclerView f25309a;

            public RunnableC1015a(RecyclerView recyclerView) {
                this.f25309a = recyclerView;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f25309a.scrollToPosition(0);
                }
            }
        }

        public a(String str) {
            this.f25308a = str;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartShowAllGroupSubscriber$1");
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            od3.p(od3.this).W(this.f25308a);
            od3.r(od3.this).e().z0(od3.q(od3.this));
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                return;
            }
            RecyclerView recyclerView = (RecyclerView) od3.s(od3.this).e().o();
            recyclerView.post(new RunnableC1015a(recyclerView));
        }
    }

    static {
        t2o.a(479199418);
    }

    public static /* synthetic */ Object ipc$super(od3 od3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartShowAllGroupSubscriber");
    }

    public static /* synthetic */ zxb p(od3 od3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxb) ipChange.ipc$dispatch("7d81a537", new Object[]{od3Var});
        }
        return od3Var.k;
    }

    public static /* synthetic */ IDMComponent q(od3 od3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("62e3a6ac", new Object[]{od3Var});
        }
        return od3Var.e;
    }

    public static /* synthetic */ kmb r(od3 od3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("95577090", new Object[]{od3Var});
        }
        return od3Var.j;
    }

    public static /* synthetic */ kmb s(od3 od3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("de6e772f", new Object[]{od3Var});
        }
        return od3Var.j;
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        String string = c().getString("filterItem");
        String A = this.k.A();
        if (string.equals(A)) {
            string = "";
        } else {
            z = true;
        }
        kmb kmbVar = this.j;
        juv.b(kmbVar, "Page_ShoppingCart_TabCard_ShowAllGroup", "isOpen=" + z);
        this.k.W(string);
        this.j.e().z0(this.e);
        if (zvj.a(Globals.getApplication()) && z) {
            be3.c(this.b, Localization.q(R.string.taobao_app_1028_1_21650));
        }
        this.j.i0(true, null, new a(A));
    }
}
