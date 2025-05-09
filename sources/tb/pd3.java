package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pd3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26025a;

        /* compiled from: Taobao */
        /* renamed from: tb.pd3$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class RunnableC1027a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ RecyclerView f26026a;

            public RunnableC1027a(RecyclerView recyclerView) {
                this.f26026a = recyclerView;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f26026a.scrollToPosition(0);
                }
            }
        }

        public a(String str) {
            this.f26025a = str;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartShowAllSubscriber$1");
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            pd3.p(pd3.this).W(this.f26025a);
            pd3.q(pd3.this).e().D();
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                return;
            }
            RecyclerView recyclerView = (RecyclerView) pd3.r(pd3.this).e().o();
            recyclerView.post(new RunnableC1027a(recyclerView));
        }
    }

    static {
        t2o.a(479199421);
    }

    public static /* synthetic */ Object ipc$super(pd3 pd3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartShowAllSubscriber");
    }

    public static /* synthetic */ zxb p(pd3 pd3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxb) ipChange.ipc$dispatch("4374f8a6", new Object[]{pd3Var});
        }
        return pd3Var.k;
    }

    public static /* synthetic */ kmb q(pd3 pd3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("cd0ea902", new Object[]{pd3Var});
        }
        return pd3Var.j;
    }

    public static /* synthetic */ kmb r(pd3 pd3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("8087bb03", new Object[]{pd3Var});
        }
        return pd3Var.j;
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        String A = this.k.A();
        this.k.W("");
        this.j.e().z0(this.e);
        this.j.i0(true, null, new a(A));
    }
}
