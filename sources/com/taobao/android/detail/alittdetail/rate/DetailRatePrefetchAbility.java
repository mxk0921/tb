package com.taobao.android.detail.alittdetail.rate;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.feature.DevFeature;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.a8;
import tb.b8;
import tb.c8;
import tb.dhn;
import tb.e28;
import tb.ein;
import tb.f8;
import tb.k06;
import tb.k8;
import tb.m8;
import tb.n8;
import tb.pos;
import tb.t2o;
import tb.tgh;
import tb.tk6;
import tb.u8;
import tb.vbl;
import tb.vur;
import tb.w8;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DetailRatePrefetchAbility extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public final ze7 b;
    public boolean c;
    public static final String NAME = "detailRatePrefetch";
    public static final long DX_ABILITY_ID = k06.a(NAME);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f6566a;
        public final ze7 b;
        public DetailRatePrefetchAbility c;

        static {
            t2o.a(354418762);
            t2o.a(336592930);
        }

        public a(Context context, ze7 ze7Var) {
            this.f6566a = context;
            this.b = ze7Var;
        }

        /* renamed from: a */
        public DetailRatePrefetchAbility build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DetailRatePrefetchAbility) ipChange.ipc$dispatch("718aec96", new Object[]{this, obj});
            }
            DetailRatePrefetchAbility detailRatePrefetchAbility = this.c;
            if (detailRatePrefetchAbility != null) {
                return detailRatePrefetchAbility;
            }
            DetailRatePrefetchAbility detailRatePrefetchAbility2 = new DetailRatePrefetchAbility(this.f6566a, this.b);
            this.c = detailRatePrefetchAbility2;
            return detailRatePrefetchAbility2;
        }
    }

    static {
        t2o.a(354418759);
    }

    public DetailRatePrefetchAbility(Context context, ze7 ze7Var) {
        this.b = ze7Var;
    }

    public static /* synthetic */ ze7 i(DetailRatePrefetchAbility detailRatePrefetchAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("c32cc652", new Object[]{detailRatePrefetchAbility});
        }
        return detailRatePrefetchAbility.b;
    }

    public static /* synthetic */ Object ipc$super(DetailRatePrefetchAbility detailRatePrefetchAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/alittdetail/rate/DetailRatePrefetchAbility");
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, final k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        if (n8Var == null) {
            return new b8(new a8(-10088, "akBaseAbilityData is null"), true);
        }
        final JSONObject h = n8Var.h();
        if (h == null || h.isEmpty()) {
            tgh.b("DetailRatePrefetchAbility", "params is empty");
            return new b8(new a8(-10088, "params is empty"), true);
        }
        tgh.b("DetailRatePrefetchAbility", "onExecuteWithData");
        if (!vbl.l0() || Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sDisableRatePrefetch))) {
            tgh.b("DetailRatePrefetchAbility", "orange enableRatePrefetch is closed");
            return new b8(new a8(-10088, "orange enableRatePrefetch is closed"), true);
        }
        ze7 ze7Var = this.b;
        if (ze7Var == null) {
            tgh.b("DetailRatePrefetchAbility", "detailContext is null");
            return new b8(new a8(-10088, "detailContext is null"), true);
        } else if (ze7Var.e().o()) {
            tgh.b("DetailRatePrefetchAbility", "current data is preload");
            return new b8(new a8(-10088, "current data is preload"), true);
        } else if (this.c) {
            tgh.b("DetailRatePrefetchAbility", "called repeatedly");
            return new b8(new a8(-10088, "called repeatedly"), true);
        } else {
            this.c = true;
            pos.a(new Runnable() { // from class: com.taobao.android.detail.alittdetail.rate.DetailRatePrefetchAbility.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    DXRuntimeContext p;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        k8 k8Var2 = k8Var;
                        vur.Companion.a("rateList", ein.r(DetailRatePrefetchAbility.i(DetailRatePrefetchAbility.this), new dhn(), null, (!(k8Var2 instanceof tk6) || (p = ((tk6) k8Var2).p()) == null) ? null : e28.b(new Object[]{null, new JSONObject() { // from class: com.taobao.android.detail.alittdetail.rate.DetailRatePrefetchAbility.1.1
                            {
                                putAll(h);
                            }
                        }}, p, DetailRatePrefetchAbility.i(DetailRatePrefetchAbility.this))));
                        tgh.b("DetailRatePrefetchAbility", "调用评价预请求接口");
                    } catch (Throwable th) {
                        tgh.c("DetailRatePrefetchAbility", "调用评价预请求接口异常", th);
                    }
                }
            });
            return new f8();
        }
    }
}
