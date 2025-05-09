package com.taobao.android.sku.presenter;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.AliXSkuCore;
import com.taobao.android.sku.presenter.b;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.Map;
import tb.b8v;
import tb.cjz;
import tb.hxj;
import tb.mfb;
import tb.nfb;
import tb.p3q;
import tb.q2q;
import tb.t2o;
import tb.wl0;
import tb.yv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AliXSkuPresenterEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public mfb f9449a;
    public final AliXSkuCore b;
    public long c;
    public boolean d;
    public String e;
    public com.taobao.android.sku.presenter.b f;
    public b g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends b.AbstractC0487b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/presenter/AliXSkuPresenterEngine$2");
        }

        @Override // com.taobao.android.sku.presenter.b.AbstractC0487b
        public void a(yv yvVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57202554", new Object[]{this, yvVar});
                return;
            }
            AliXSkuPresenterEngine.d(AliXSkuPresenterEngine.this);
            AliXSkuPresenterEngine.b(AliXSkuPresenterEngine.this, false);
            AliXSkuPresenterEngine.e(AliXSkuPresenterEngine.this);
            AliXSkuPresenterEngine.f(AliXSkuPresenterEngine.this);
            AliXSkuPresenterEngine.c(AliXSkuPresenterEngine.this).a0();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        boolean onBackPressed();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
    }

    static {
        t2o.a(442499241);
    }

    public AliXSkuPresenterEngine(Context context, AliXSkuCore aliXSkuCore) {
        this.b = aliXSkuCore;
        i(context);
    }

    public static /* synthetic */ boolean a(AliXSkuPresenterEngine aliXSkuPresenterEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("980a189b", new Object[]{aliXSkuPresenterEngine})).booleanValue();
        }
        return aliXSkuPresenterEngine.d;
    }

    public static /* synthetic */ boolean b(AliXSkuPresenterEngine aliXSkuPresenterEngine, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5058b5a3", new Object[]{aliXSkuPresenterEngine, new Boolean(z)})).booleanValue();
        }
        aliXSkuPresenterEngine.d = z;
        return z;
    }

    public static /* synthetic */ AliXSkuCore c(AliXSkuPresenterEngine aliXSkuPresenterEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliXSkuCore) ipChange.ipc$dispatch("7d61b2b2", new Object[]{aliXSkuPresenterEngine});
        }
        return aliXSkuPresenterEngine.b;
    }

    public static /* synthetic */ void d(AliXSkuPresenterEngine aliXSkuPresenterEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94cc2055", new Object[]{aliXSkuPresenterEngine});
        } else {
            aliXSkuPresenterEngine.l();
        }
    }

    public static /* synthetic */ void e(AliXSkuPresenterEngine aliXSkuPresenterEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132d2434", new Object[]{aliXSkuPresenterEngine});
        } else {
            aliXSkuPresenterEngine.s();
        }
    }

    public static /* synthetic */ void f(AliXSkuPresenterEngine aliXSkuPresenterEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("918e2813", new Object[]{aliXSkuPresenterEngine});
        } else {
            aliXSkuPresenterEngine.v();
        }
    }

    public static /* synthetic */ String g(AliXSkuPresenterEngine aliXSkuPresenterEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("880deaee", new Object[]{aliXSkuPresenterEngine});
        }
        return aliXSkuPresenterEngine.e;
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34fe2abd", new Object[]{this});
        } else {
            this.f.c(new a());
        }
    }

    public void B(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633d7b7d", new Object[]{this, cVar});
            return;
        }
        mfb mfbVar = this.f9449a;
        if (mfbVar instanceof com.taobao.android.sku.presenter.a) {
            ((com.taobao.android.sku.presenter.a) mfbVar).H(cVar);
        }
    }

    public final void h(yv yvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d60c63d", new Object[]{this, yvVar});
        } else {
            ((com.taobao.android.sku.presenter.a) yvVar).getBodyView().addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.sku.presenter.AliXSkuPresenterEngine.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    if (str.hashCode() == -1177043419) {
                        super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                        return null;
                    }
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/presenter/AliXSkuPresenterEngine$1");
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                        return;
                    }
                    super.onScrolled(recyclerView, i, i2);
                    if (i2 != 0 && !AliXSkuPresenterEngine.a(AliXSkuPresenterEngine.this)) {
                        SkuLogUtils.q(AliXSkuPresenterEngine.c(AliXSkuPresenterEngine.this).z().i(), AliXSkuPresenterEngine.c(AliXSkuPresenterEngine.this).z().o(), AliXSkuPresenterEngine.c(AliXSkuPresenterEngine.this).M(), AliXSkuPresenterEngine.c(AliXSkuPresenterEngine.this).G());
                        AliXSkuPresenterEngine.b(AliXSkuPresenterEngine.this, true);
                    }
                }
            });
        }
    }

    public final void i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef7fd7e", new Object[]{this, context});
            return;
        }
        this.f = new com.taobao.android.sku.presenter.b(context);
        A();
        yv b2 = this.f.b();
        h(b2);
        u(b2);
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        mfb mfbVar = this.f9449a;
        if (mfbVar != null) {
            mfbVar.dismiss();
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c142d9", new Object[]{this});
            return;
        }
        mfb mfbVar = this.f9449a;
        if (mfbVar instanceof yv) {
            ((yv) mfbVar).d();
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6c16a6", new Object[]{this});
            return;
        }
        SkuLogUtils.m(this.b.z().i(), this.b.z().o(), this.c > 0 ? System.currentTimeMillis() - this.c : -1L, this.b.M(), this.b.G());
        try {
            wl0.a().commitLeave(SkuLogUtils.PAGE_NAME, this.b.z().i(), this.b.y(), "itemId=" + this.b.z().i(), "sellerId=" + this.b.z().o());
        } catch (Throwable unused) {
        }
    }

    public b m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("ab026ff3", new Object[]{this});
        }
        return this.g;
    }

    public mfb n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mfb) ipChange.ipc$dispatch("7be409fb", new Object[]{this});
        }
        return this.f9449a;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebb2a389", new Object[]{this})).booleanValue();
        }
        mfb mfbVar = this.f9449a;
        if (mfbVar instanceof yv) {
            return ((yv) mfbVar).i();
        }
        return false;
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6ec27c2", new Object[]{this});
            return;
        }
        this.e = this.b.H();
        mfb mfbVar = this.f9449a;
        if (mfbVar != null) {
            mfbVar.b();
        }
        this.c = System.currentTimeMillis();
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2666408", new Object[]{this});
            return;
        }
        mfb mfbVar = this.f9449a;
        if (mfbVar instanceof yv) {
            ((yv) mfbVar).k();
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90c3e593", new Object[]{this});
            return;
        }
        String str = this.e;
        this.e = this.b.H();
        if (p() && str != null && !str.equals(this.e)) {
            if (cjz.a()) {
                SkuLogUtils.x("AliXSkuPresenterEngine.refreshDetail");
                return;
            }
            b8v e = this.b.K().getEventHandler().e();
            e.t(p3q.EVENT_TYPE);
            e.r(new DMEvent(p3q.EVENT_TYPE, new JSONObject() { // from class: com.taobao.android.sku.presenter.AliXSkuPresenterEngine.3
                {
                    put("originalItemId", (Object) AliXSkuPresenterEngine.c(AliXSkuPresenterEngine.this).B());
                    put("targetItemId", (Object) AliXSkuPresenterEngine.c(AliXSkuPresenterEngine.this).B());
                    put("params", (Object) new JSONObject() { // from class: com.taobao.android.sku.presenter.AliXSkuPresenterEngine.3.1
                        {
                            put(q2q.KEY_SKU_ID, (Object) AliXSkuPresenterEngine.g(AliXSkuPresenterEngine.this));
                        }
                    });
                    put("sku_token", (Object) AliXSkuPresenterEngine.c(AliXSkuPresenterEngine.this).L());
                }
            }, null));
            this.b.K().getEventHandler().k(e);
        }
    }

    public void t(nfb nfbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8024808", new Object[]{this, nfbVar});
            return;
        }
        mfb mfbVar = this.f9449a;
        if (mfbVar instanceof yv) {
            ((yv) mfbVar).l(nfbVar);
        }
    }

    public void u(mfb mfbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eeaf602", new Object[]{this, mfbVar});
            return;
        }
        mfb mfbVar2 = this.f9449a;
        if (mfbVar2 != null && mfbVar2 != mfbVar && (mfbVar2 instanceof com.taobao.android.sku.presenter.a) && (mfbVar instanceof com.taobao.android.sku.presenter.a)) {
            ((com.taobao.android.sku.presenter.a) mfbVar).A((com.taobao.android.sku.presenter.a) mfbVar2);
        }
        this.f9449a = mfbVar;
    }

    public final void v() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8506365", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.taobao.sku.intent.action.syncData");
        JSONObject jSONObject2 = this.b.z().t().getJSONObject("id_biz_head");
        if (!(jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("selectedTextMap")) == null || jSONObject.isEmpty())) {
            intent.putExtra("selectedTextMap", jSONObject.toJSONString());
        }
        intent.putExtra(hxj.UNIQID, this.b.L());
        intent.putExtra("onDismiss", "true");
        intent.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(this.b.y()).sendBroadcast(intent);
    }

    public void w(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b58854", new Object[]{this, new Integer(i)});
            return;
        }
        mfb mfbVar = this.f9449a;
        if (mfbVar instanceof com.taobao.android.sku.presenter.a) {
            ((com.taobao.android.sku.presenter.a) mfbVar).z(i);
        }
    }

    public void x(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d13bbe83", new Object[]{this, map});
            return;
        }
        mfb mfbVar = this.f9449a;
        if (mfbVar instanceof yv) {
            ((yv) mfbVar).j(map);
        }
    }

    public void y(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c3841ad", new Object[]{this, bVar});
            return;
        }
        this.g = bVar;
        mfb mfbVar = this.f9449a;
        if (mfbVar instanceof com.taobao.android.sku.presenter.a) {
            ((com.taobao.android.sku.presenter.a) mfbVar).B(bVar);
        }
    }

    public void z(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dee22c48", new Object[]{this, new Integer(i)});
            return;
        }
        mfb mfbVar = this.f9449a;
        if (mfbVar instanceof com.taobao.android.sku.presenter.a) {
            ((com.taobao.android.sku.presenter.a) mfbVar).F(i);
        }
    }

    public final boolean p() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1468b7e3", new Object[]{this})).booleanValue();
        }
        JSONObject E = this.b.E();
        if (E == null || (jSONObject = E.getJSONObject("feature")) == null) {
            return false;
        }
        return jSONObject.getBooleanValue("updateSkuOnCloseSkuBoard");
    }
}
