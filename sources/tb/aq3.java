package tb;

import android.content.Context;
import android.os.Looper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import tb.b5m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class aq3 implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "checkCollect";

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f15927a;
    public volatile boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements b5m.p {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RuntimeAbilityParam[] f15928a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ String c;

        /* compiled from: Taobao */
        /* renamed from: tb.aq3$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class RunnableC0876a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ oa4 f15929a;
            public final /* synthetic */ boolean b;

            /* compiled from: Taobao */
            /* renamed from: tb.aq3$a$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
            public class RunnableC0877a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public RunnableC0877a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        RunnableC0876a.this.f15929a.updateComponent();
                    }
                }
            }

            public RunnableC0876a(oa4 oa4Var, boolean z) {
                this.f15929a = oa4Var;
                this.b = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                boolean d = oz3.d(this.f15929a, this.b);
                if (!d) {
                    d = oz3.c(this.f15929a, a.this.b, this.b);
                }
                if (d) {
                    RunnableC0877a aVar = new RunnableC0877a();
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        aVar.run();
                    } else {
                        aq3.b(aq3.this).h().g(aVar);
                    }
                }
            }
        }

        public a(RuntimeAbilityParam[] runtimeAbilityParamArr, JSONObject jSONObject, String str) {
            this.f15928a = runtimeAbilityParamArr;
            this.b = jSONObject;
            this.c = str;
        }

        @Override // tb.b5m.p
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            tgh.b("CheckCollectImplementor", "queryCollect failed with errCode: " + str + " errMsg: " + str2 + ", for item: " + this.c);
        }

        @Override // tb.b5m.p
        public void onSuccess(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b8f9489", new Object[]{this, new Boolean(z)});
                return;
            }
            oa4 i = yc4.i(this.f15928a);
            if (i == null) {
                tgh.b("CheckCollectImplementor", "queryCollect success with value: " + z + ", but not found triggerComponent for write back");
                return;
            }
            RunnableC0876a aVar = new RunnableC0876a(i, z);
            if (!aq3.c(aq3.this)) {
                aVar.run();
            } else {
                pos.a(aVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements b5m.p {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f15931a;

        public b(String str) {
            this.f15931a = str;
        }

        @Override // tb.b5m.p
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            tgh.b("CheckCollectImplementor", "queryCollect failed with errCode: " + str + " errMsg: " + str2 + ", for item: " + this.f15931a);
        }

        @Override // tb.b5m.p
        public void onSuccess(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b8f9489", new Object[]{this, new Boolean(z)});
            } else {
                oz3.b(aq3.b(aq3.this), z);
            }
        }
    }

    static {
        t2o.a(912261852);
        t2o.a(912261826);
    }

    public aq3(Context context, ze7 ze7Var) {
        this.f15927a = ze7Var;
    }

    public static /* synthetic */ ze7 b(aq3 aq3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("ae6ea90d", new Object[]{aq3Var});
        }
        return aq3Var.f15927a;
    }

    public static /* synthetic */ boolean c(aq3 aq3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc1bddd2", new Object[]{aq3Var})).booleanValue();
        }
        return aq3Var.b;
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject a2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null || (a2 = irVar.a()) == null) {
            return false;
        }
        if (DataUtils.b0(this.f15927a.e())) {
            return true;
        }
        jns jnsVar = (jns) this.f15927a.e().e(kns.PARSER_ID);
        if (ywk.g(jnsVar)) {
            str = ywk.d(jnsVar);
        } else {
            str = a2.getString("itemId");
        }
        this.b = false;
        if (oz3.a(yc4.i(runtimeAbilityParamArr))) {
            d(str);
            return true;
        }
        b5m.D().e(str, new a(runtimeAbilityParamArr, a2, str));
        this.b = true;
        return true;
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93fbe78f", new Object[]{this, str});
        } else {
            b5m.D().e(str, new b(str));
        }
    }
}
