package tb;

import com.alibaba.ability.impl.mtop.MtopAbility;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.basement.weex.BasementFeedDataProvider;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class m59 extends frm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile JSONObject f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"tb/m59$a", "Ljava/lang/Runnable;", "Ltb/xhv;", "run", "()V", "taobao_mytaobao_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ o32 b;

        public a(o32 o32Var) {
            this.b = o32Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                m59.d(m59.this).await(10L, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
            this.b.a(true, null, m59.c(m59.this));
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"tb/m59$b", "Ljava/lang/Runnable;", "Ltb/xhv;", "run", "()V", "taobao_mytaobao_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ o32 b;

        public b(o32 o32Var) {
            this.b = o32Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            m59.this.i(false);
            m59.b(m59.this, false, this.b);
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                m59.a(m59.this);
            }
        }
    }

    static {
        t2o.a(745537919);
    }

    public m59(String str, String str2, String str3, String str4) {
        ckf.h(str, "apiMethod");
        ckf.h(str2, "apiVersion");
        ckf.h(str4, MtopAbility.API_REQUEST_DATA);
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = str4;
    }

    public static final /* synthetic */ void a(m59 m59Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14afb685", new Object[]{m59Var});
        } else {
            m59Var.e();
        }
    }

    public static final /* synthetic */ JSONObject b(m59 m59Var, boolean z, o32 o32Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("62f50526", new Object[]{m59Var, new Boolean(z), o32Var});
        }
        return m59Var.g(z, o32Var);
    }

    public static final /* synthetic */ JSONObject c(m59 m59Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6efb39a", new Object[]{m59Var});
        }
        return m59Var.f;
    }

    public static final /* synthetic */ CountDownLatch d(m59 m59Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CountDownLatch) ipChange.ipc$dispatch("5a4ba65e", new Object[]{m59Var});
        }
        return m59Var.b;
    }

    public static /* synthetic */ Object ipc$super(m59 m59Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/basement/dataservice/FeedMtopFetcher");
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac82c03d", new Object[]{this});
            return;
        }
        MtopResponse j = j();
        if ((j != null ? j.getBytedata() : null) != null) {
            byte[] bytedata = j.getBytedata();
            ckf.c(bytedata, "mtopResponse.bytedata");
            this.f = BasementFeedDataProvider.INSTANCE.H(new String(bytedata, uj3.UTF_8));
        } else {
            this.f = null;
        }
        this.f19486a = frm.d;
        this.b.countDown();
    }

    public JSONObject f(o32<JSONObject> o32Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b7056374", new Object[]{this, o32Var});
        }
        ckf.h(o32Var, "callback");
        return g(true, o32Var);
    }

    public final JSONObject g(boolean z, o32<JSONObject> o32Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("11d8be66", new Object[]{this, new Boolean(z), o32Var});
        }
        int i = this.f19486a;
        if (i == frm.d) {
            if (!z) {
                o32Var.a(true, null, this.f);
            }
            return this.f;
        }
        if (i == frm.c) {
            if (z) {
                p3j.g(new a(o32Var));
            } else {
                try {
                    this.b.await(10L, TimeUnit.SECONDS);
                } catch (Throwable unused) {
                }
                o32Var.a(true, null, this.f);
            }
        } else if (i == 0) {
            p3j.g(new b(o32Var));
        } else if (i == frm.e) {
            o32Var.a(false, "forbid request", null);
        }
        return null;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b632fe", new Object[]{this});
        } else {
            i(true);
        }
    }

    public final void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9410df96", new Object[]{this, new Boolean(z)});
        } else if (this.f19486a == 0) {
            this.f19486a = frm.c;
            if (z) {
                p3j.g(new c());
            } else {
                e();
            }
        }
    }

    public final MtopResponse j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("d64bdac3", new Object[]{this});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(this.g);
        mtopRequest.setVersion(this.h);
        mtopRequest.setData(this.j);
        MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, Globals.getApplication()), mtopRequest, TaoHelper.getTTID());
        String str = this.i;
        if (str != null) {
            build.setUnitStrategy(str);
        }
        build.reqMethod(MethodEnum.POST);
        try {
            return build.syncRequest();
        } catch (Throwable unused) {
            return null;
        }
    }
}
