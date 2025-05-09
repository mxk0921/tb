package tb;

import android.app.Activity;
import android.os.Bundle;
import com.ali.adapt.api.AliAdaptServiceManager;
import com.alibaba.android.icart.core.promotionsubmit.event.BaseEvent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import tb.ub3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class z0n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final fdd f32449a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements BaseEvent.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ct8 f32450a;
        public final /* synthetic */ Bundle b;
        public final /* synthetic */ Activity c;
        public final /* synthetic */ int d;
        public final /* synthetic */ String e;
        public final /* synthetic */ boolean f;

        public a(ct8 ct8Var, Bundle bundle, Activity activity, int i, String str, boolean z) {
            this.f32450a = ct8Var;
            this.b = bundle;
            this.c = activity;
            this.d = i;
            this.e = str;
            this.f = z;
        }

        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6abfc278", new Object[]{this, jSONObject});
                return;
            }
            ct8 ct8Var = this.f32450a;
            if (ct8Var != null) {
                ct8Var.dismiss();
            }
            this.b.putLong("COUPON_FINISH", System.currentTimeMillis());
            z0n.a(z0n.this, this.c, this.b, this.d, this.e, this.f);
        }
    }

    static {
        t2o.a(479199538);
    }

    public z0n(fdd fddVar) {
        this.f32449a = fddVar;
    }

    public static /* synthetic */ void a(z0n z0nVar, Activity activity, Bundle bundle, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4540a781", new Object[]{z0nVar, activity, bundle, new Integer(i), str, new Boolean(z)});
        } else {
            z0nVar.e(activity, bundle, i, str, z);
        }
    }

    public static boolean d() {
        n2e n2eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa40a19d", new Object[0])).booleanValue();
        }
        if (h0r.e() && (n2eVar = (n2e) AliAdaptServiceManager.getInstance().findAliAdaptService(n2e.class)) != null) {
            return Boolean.parseBoolean(n2eVar.getParams().get("enablePrefetch"));
        }
        return false;
    }

    public String c(IDMComponent iDMComponent, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2c0cadd", new Object[]{this, iDMComponent, bundle});
        }
        fdd fddVar = this.f32449a;
        if (fddVar == null) {
            return "presenter_is_null";
        }
        Activity context = fddVar.getContext();
        try {
            if (JSON.parseObject(iDMComponent.getFields().getString("couponApply")) != null) {
                return "need_coupon";
            }
            if (f(context, bundle)) {
                return "true";
            }
            return "touch_down_perf_disable";
        } catch (Throwable th) {
            th.printStackTrace();
            return "coupon_exception";
        }
    }

    public final void e(Activity activity, Bundle bundle, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d83e8843", new Object[]{this, activity, bundle, new Integer(i), str, new Boolean(z)});
            return;
        }
        ub3.e(ub3.a.a("SettlementSuccess").message("成功下单").sampling(0.001f));
        n2e n2eVar = (n2e) AliAdaptServiceManager.getInstance().findAliAdaptService(n2e.class);
        if (z || n2eVar == null || !n2eVar.process(activity, bundle, i)) {
            xq0.c().a(activity).b(i).d(bundle).c(str);
        }
    }

    public final boolean f(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc8c7483", new Object[]{this, activity, bundle})).booleanValue();
        }
        ub3.e(ub3.a.a("SettlementSuccess").message("成功下单").sampling(0.001f));
        n2e n2eVar = (n2e) AliAdaptServiceManager.getInstance().findAliAdaptService(n2e.class);
        if (n2eVar != null) {
            return n2eVar.prefetch(activity, bundle);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0064 A[Catch: all -> 0x009c, TryCatch #0 {all -> 0x009c, blocks: (B:11:0x0042, B:15:0x0054, B:17:0x0064, B:21:0x006d, B:22:0x0075, B:24:0x0095), top: B:29:0x0042 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(com.taobao.android.ultron.common.model.IDMComponent r17, java.lang.String r18, int r19, android.os.Bundle r20, boolean r21) {
        /*
            r16 = this;
            r8 = r16
            r9 = r20
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.z0n.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0033
            java.lang.Integer r3 = new java.lang.Integer
            r10 = r19
            r3.<init>(r10)
            java.lang.Boolean r4 = new java.lang.Boolean
            r11 = r21
            r4.<init>(r11)
            r5 = 6
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r8
            r5[r0] = r17
            r0 = 2
            r5[r0] = r18
            r0 = 3
            r5[r0] = r3
            r0 = 4
            r5[r0] = r9
            r0 = 5
            r5[r0] = r4
            java.lang.String r0 = "f67d73cb"
            r2.ipc$dispatch(r0, r5)
            return
        L_0x0033:
            r10 = r19
            r11 = r21
            tb.fdd r2 = r8.f32449a
            if (r2 != 0) goto L_0x003c
            return
        L_0x003c:
            android.app.Activity r12 = r2.getContext()
            if (r9 == 0) goto L_0x0053
            java.lang.String r2 = "float"
            java.lang.String r3 = "pageType"
            java.lang.String r3 = r9.getString(r3)     // Catch: all -> 0x009c
            boolean r2 = r2.equals(r3)     // Catch: all -> 0x009c
            if (r2 == 0) goto L_0x0053
            r13 = 1
            goto L_0x0054
        L_0x0053:
            r13 = 0
        L_0x0054:
            com.alibaba.fastjson.JSONObject r0 = r17.getFields()     // Catch: all -> 0x009c
            java.lang.String r1 = "couponApply"
            java.lang.String r0 = r0.getString(r1)     // Catch: all -> 0x009c
            com.alibaba.fastjson.JSONObject r14 = com.alibaba.fastjson.JSON.parseObject(r0)     // Catch: all -> 0x009c
            if (r14 == 0) goto L_0x009c
            boolean r0 = d()     // Catch: all -> 0x009c
            if (r0 == 0) goto L_0x006d
            r0 = 0
        L_0x006b:
            r15 = r0
            goto L_0x0075
        L_0x006d:
            tb.ct8 r0 = new tb.ct8     // Catch: all -> 0x009c
            int r1 = com.taobao.taobao.R.style.Ultron_Dialog_Cart_PromotionDialog     // Catch: all -> 0x009c
            r0.<init>(r12, r1)     // Catch: all -> 0x009c
            goto L_0x006b
        L_0x0075:
            tb.z0n$a r7 = new tb.z0n$a     // Catch: all -> 0x009c
            r0 = r7
            r1 = r16
            r2 = r15
            r3 = r20
            r4 = r12
            r5 = r19
            r6 = r18
            r8 = r7
            r7 = r21
            r0.<init>(r2, r3, r4, r5, r6, r7)     // Catch: all -> 0x009c
            com.alibaba.android.icart.core.promotionsubmit.event.BaseEvent r0 = tb.cl8.a(r14, r8)     // Catch: all -> 0x009c
            com.alibaba.android.icart.core.promotionsubmit.event.BaseEvent r0 = r0.setModalBuy(r13)     // Catch: all -> 0x009c
            r0.runEvent(r12, r14)     // Catch: all -> 0x009c
            if (r15 == 0) goto L_0x009b
            int r0 = com.taobao.taobao.R.layout.icart_loading_promotion_submit     // Catch: all -> 0x009c
            r1 = -2
            r15.b(r0, r1, r1)     // Catch: all -> 0x009c
        L_0x009b:
            return
        L_0x009c:
            r0 = r16
            r1 = r12
            r2 = r20
            r3 = r19
            r4 = r18
            r5 = r21
            r0.e(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.z0n.b(com.taobao.android.ultron.common.model.IDMComponent, java.lang.String, int, android.os.Bundle, boolean):void");
    }
}
