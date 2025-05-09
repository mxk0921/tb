package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.data.meta.Resource;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;
import tb.b5m;
import tb.bw7;
import tb.ir;
import tb.jns;
import tb.jov;
import tb.kns;
import tb.oa4;
import tb.oz3;
import tb.pos;
import tb.q84;
import tb.rc7;
import tb.t2o;
import tb.tgh;
import tb.yc4;
import tb.yj4;
import tb.ywk;
import tb.ze7;
import tb.zre;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CollectorImplementor implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "collectClick";

    /* renamed from: a  reason: collision with root package name */
    public final String f6801a = b5m.H().localizedString(R.string.tt_detail_not_login);
    public final String b = b5m.H().localizedString(R.string.tt_detail_app_congratulations_collection_success);
    public final String c = b5m.H().localizedString(R.string.tt_detail_app_cancel_collection_success);
    public final Context d;
    public final ze7 e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements b5m.y {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f6806a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String e;
        public final /* synthetic */ RuntimeAbilityParam[] f;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.detail.ttdetail.handler.bizhandlers.CollectorImplementor$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class RunnableC0366a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0366a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    Toast.makeText(CollectorImplementor.b(CollectorImplementor.this), CollectorImplementor.i(CollectorImplementor.this), 0).show();
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    Toast.makeText(CollectorImplementor.b(CollectorImplementor.this), CollectorImplementor.i(CollectorImplementor.this), 0).show();
                }
            }
        }

        public a(JSONObject jSONObject, boolean z, String str, String str2, RuntimeAbilityParam[] runtimeAbilityParamArr) {
            this.f6806a = jSONObject;
            this.b = z;
            this.c = str;
            this.e = str2;
            this.f = runtimeAbilityParamArr;
        }

        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            CollectorImplementor.h(CollectorImplementor.this).h().g(new b());
            if (!CollectorImplementor.l(CollectorImplementor.this, this.f6806a)) {
                if (this.b) {
                    oz3.b(CollectorImplementor.h(CollectorImplementor.this), true);
                }
                CollectorImplementor.m(CollectorImplementor.this, this.c, this.e, this.f);
            }
        }

        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b8f9489", new Object[]{this, new Boolean(z)});
            } else if (z) {
                jov.k(CollectorImplementor.b(CollectorImplementor.this), "poplayer://favoriteGuidePop");
                oz3.b(CollectorImplementor.h(CollectorImplementor.this), true);
            } else {
                CollectorImplementor.h(CollectorImplementor.this).h().g(new RunnableC0366a());
                if (!CollectorImplementor.l(CollectorImplementor.this, this.f6806a)) {
                    if (this.b) {
                        oz3.b(CollectorImplementor.h(CollectorImplementor.this), true);
                    }
                    CollectorImplementor.m(CollectorImplementor.this, this.c, this.e, this.f);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ oa4 f6809a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ JSONObject d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.this.f6809a.updateComponent();
                }
            }
        }

        public b(oa4 oa4Var, boolean z, JSONObject jSONObject) {
            this.f6809a = oa4Var;
            this.b = z;
            this.d = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            boolean d = oz3.d(this.f6809a, this.b);
            if (!d) {
                d = oz3.c(this.f6809a, this.d, this.b);
            }
            if (d) {
                CollectorImplementor.h(CollectorImplementor.this).h().g(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements b5m.s {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6811a;
        public final /* synthetic */ String b;

        public c(String str, String str2) {
            this.f6811a = str;
            this.b = str2;
        }

        public void a(Map<String, Object> map) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
                return;
            }
            if (map == null || !(map.get(yj4.PARAM_ACTIVITY_URL) instanceof String)) {
                str = "";
            } else {
                str = (String) map.get(yj4.PARAM_ACTIVITY_URL);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (!(CollectorImplementor.b(CollectorImplementor.this) instanceof Activity) || ((Activity) CollectorImplementor.b(CollectorImplementor.this)).hasWindowFocus()) {
                jov.k(CollectorImplementor.b(CollectorImplementor.this), str);
            }
        }

        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            tgh.b("CollectorImplementor", "showCollectCategory failed with errCode: " + str + " errMsg: " + str2 + ", for item: " + this.f6811a + ", subItemId=" + this.b);
            HashMap hashMap = new HashMap();
            hashMap.put("errorCode", str);
            hashMap.put("errorMsg", str2);
            hashMap.put("itemId", this.f6811a);
            hashMap.put("subItemId", this.b);
            bw7.b(hashMap, -100014, "收藏列表显示异常");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements b5m.p {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f6812a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ RuntimeAbilityParam[] d;

        public d(String str, String str2, JSONObject jSONObject, RuntimeAbilityParam[] runtimeAbilityParamArr) {
            this.b = str;
            this.c = str2;
            this.f6812a = jSONObject;
            this.d = runtimeAbilityParamArr;
        }

        @Override // tb.b5m.p
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            Toast.makeText(CollectorImplementor.b(CollectorImplementor.this), str2, 0).show();
            CollectorImplementor.j(CollectorImplementor.this, str, str2, this.b, this.c);
        }

        @Override // tb.b5m.p
        public void onSuccess(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b8f9489", new Object[]{this, new Boolean(z)});
                return;
            }
            if (z) {
                CollectorImplementor.v(CollectorImplementor.this, this.b, this.c);
            } else {
                CollectorImplementor.d(CollectorImplementor.this, this.b, this.c, DataUtils.D((Resource) CollectorImplementor.h(CollectorImplementor.this).e().f(Resource.class)), this.f6812a, this.d);
            }
            CollectorImplementor.e(CollectorImplementor.this, z);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements b5m.k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6813a;
        public final /* synthetic */ String b;
        public final /* synthetic */ JSONObject d;
        public final /* synthetic */ RuntimeAbilityParam[] e;

        public e(JSONObject jSONObject, String str, String str2, RuntimeAbilityParam[] runtimeAbilityParamArr) {
            this.d = jSONObject;
            this.f6813a = str;
            this.b = str2;
            this.e = runtimeAbilityParamArr;
        }

        @Override // tb.b5m.k
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            if (ErrorConstant.isSessionInvalid(str) || TextUtils.equals(str, "ANDROID_SYS_LOGIN_CANCEL")) {
                Toast.makeText(CollectorImplementor.b(CollectorImplementor.this), CollectorImplementor.g(CollectorImplementor.this), 0).show();
            } else if (b5m.H().isI18nEdition()) {
                Toast.makeText(CollectorImplementor.b(CollectorImplementor.this), b5m.H().localizedString(R.string.tt_detail_collet_failed), 0).show();
            } else {
                Toast.makeText(CollectorImplementor.b(CollectorImplementor.this), str2, 0).show();
            }
            CollectorImplementor.j(CollectorImplementor.this, str, str2, this.f6813a, this.b);
        }

        @Override // tb.b5m.k
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else {
                CollectorImplementor.k(CollectorImplementor.this, this.d, this.f6813a, this.b, true, this.e);
            }
        }
    }

    static {
        t2o.a(912261863);
        t2o.a(912261826);
    }

    public CollectorImplementor(Context context, ze7 ze7Var) {
        this.d = context;
        this.e = ze7Var;
    }

    public static /* synthetic */ Context b(CollectorImplementor collectorImplementor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("d091601e", new Object[]{collectorImplementor});
        }
        return collectorImplementor.d;
    }

    public static /* synthetic */ String c(CollectorImplementor collectorImplementor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1e29dbb", new Object[]{collectorImplementor});
        }
        return collectorImplementor.c;
    }

    public static /* synthetic */ void d(CollectorImplementor collectorImplementor, String str, String str2, Map map, JSONObject jSONObject, RuntimeAbilityParam[] runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("204a2ca0", new Object[]{collectorImplementor, str, str2, map, jSONObject, runtimeAbilityParamArr});
        } else {
            collectorImplementor.n(str, str2, map, jSONObject, runtimeAbilityParamArr);
        }
    }

    public static /* synthetic */ void e(CollectorImplementor collectorImplementor, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6128a8de", new Object[]{collectorImplementor, new Boolean(z)});
        } else {
            collectorImplementor.u(z);
        }
    }

    public static /* synthetic */ void f(CollectorImplementor collectorImplementor, oa4 oa4Var, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf73982", new Object[]{collectorImplementor, oa4Var, jSONObject, new Boolean(z)});
        } else {
            collectorImplementor.t(oa4Var, jSONObject, z);
        }
    }

    public static /* synthetic */ String g(CollectorImplementor collectorImplementor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53f934bd", new Object[]{collectorImplementor});
        }
        return collectorImplementor.f6801a;
    }

    public static /* synthetic */ ze7 h(CollectorImplementor collectorImplementor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("a47e4e98", new Object[]{collectorImplementor});
        }
        return collectorImplementor.e;
    }

    public static /* synthetic */ String i(CollectorImplementor collectorImplementor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60fcbbf", new Object[]{collectorImplementor});
        }
        return collectorImplementor.b;
    }

    public static /* synthetic */ void j(CollectorImplementor collectorImplementor, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1ae23d", new Object[]{collectorImplementor, str, str2, str3, str4});
        } else {
            collectorImplementor.p(str, str2, str3, str4);
        }
    }

    public static /* synthetic */ void k(CollectorImplementor collectorImplementor, JSONObject jSONObject, String str, String str2, boolean z, RuntimeAbilityParam[] runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a165f4a6", new Object[]{collectorImplementor, jSONObject, str, str2, new Boolean(z), runtimeAbilityParamArr});
        } else {
            collectorImplementor.w(jSONObject, str, str2, z, runtimeAbilityParamArr);
        }
    }

    public static /* synthetic */ boolean l(CollectorImplementor collectorImplementor, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8e44715", new Object[]{collectorImplementor, jSONObject})).booleanValue();
        }
        return collectorImplementor.q(jSONObject);
    }

    public static /* synthetic */ void m(CollectorImplementor collectorImplementor, String str, String str2, RuntimeAbilityParam[] runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9863a6e4", new Object[]{collectorImplementor, str, str2, runtimeAbilityParamArr});
        } else {
            collectorImplementor.s(str, str2, runtimeAbilityParamArr);
        }
    }

    public static /* synthetic */ void v(CollectorImplementor collectorImplementor, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6d05f11", new Object[]{collectorImplementor, str, str2});
        } else {
            collectorImplementor.o(str, str2);
        }
    }

    @Override // tb.zre
    public boolean a(ir irVar, final RuntimeAbilityParam... runtimeAbilityParamArr) {
        final JSONObject a2;
        final String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null || (a2 = irVar.a()) == null) {
            return false;
        }
        if (DataUtils.b0(this.e.e())) {
            return true;
        }
        jns jnsVar = (jns) this.e.e().e(kns.PARSER_ID);
        if (ywk.g(jnsVar)) {
            string = ywk.d(jnsVar);
        } else {
            string = a2.getString("itemId");
        }
        final String e2 = ywk.e(jnsVar);
        if (oz3.a(yc4.i(runtimeAbilityParamArr))) {
            r(string, e2, a2, runtimeAbilityParamArr);
            return true;
        }
        b5m.D().e(string, new b5m.p() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.CollectorImplementor.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.android.detail.ttdetail.handler.bizhandlers.CollectorImplementor$1$b */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
            public class b implements b5m.k {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ oa4 f6804a;

                public b(oa4 oa4Var) {
                    this.f6804a = oa4Var;
                }

                @Override // tb.b5m.k
                public void onSuccess() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                        return;
                    }
                    Toast.makeText(CollectorImplementor.b(CollectorImplementor.this), CollectorImplementor.i(CollectorImplementor.this), 0).show();
                    AnonymousClass1 r0 = AnonymousClass1.this;
                    CollectorImplementor.f(CollectorImplementor.this, this.f6804a, a2, true);
                    AnonymousClass1 r02 = AnonymousClass1.this;
                    CollectorImplementor.k(CollectorImplementor.this, a2, string, e2, false, runtimeAbilityParamArr);
                }

                @Override // tb.b5m.k
                public void onFailure(String str, String str2) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                        return;
                    }
                    if (ErrorConstant.isSessionInvalid(str) || TextUtils.equals(str, "ANDROID_SYS_LOGIN_CANCEL")) {
                        Toast.makeText(CollectorImplementor.b(CollectorImplementor.this), CollectorImplementor.g(CollectorImplementor.this), 0).show();
                    } else if (b5m.H().isI18nEdition()) {
                        Toast.makeText(CollectorImplementor.b(CollectorImplementor.this), b5m.H().localizedString(R.string.tt_detail_collet_failed), 0).show();
                    } else {
                        Toast.makeText(CollectorImplementor.b(CollectorImplementor.this), str2, 0).show();
                    }
                    AnonymousClass1 r1 = AnonymousClass1.this;
                    CollectorImplementor.f(CollectorImplementor.this, this.f6804a, a2, false);
                    HashMap hashMap = new HashMap();
                    hashMap.put("errorCode", str);
                    hashMap.put("errorMsg", str2);
                    hashMap.put("itemId", string);
                    hashMap.put("subItemId", e2);
                    bw7.b(hashMap, -100012, "添加收藏失败");
                }
            }

            /* compiled from: Taobao */
            /* renamed from: com.taobao.android.detail.ttdetail.handler.bizhandlers.CollectorImplementor$1$a */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
            public class a implements b5m.k {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ oa4 f6803a;

                public a(oa4 oa4Var) {
                    this.f6803a = oa4Var;
                }

                @Override // tb.b5m.k
                public void onSuccess() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                        return;
                    }
                    Toast.makeText(CollectorImplementor.b(CollectorImplementor.this), CollectorImplementor.c(CollectorImplementor.this), 0).show();
                    AnonymousClass1 r1 = AnonymousClass1.this;
                    CollectorImplementor.f(CollectorImplementor.this, this.f6803a, a2, false);
                }

                @Override // tb.b5m.k
                public void onFailure(String str, String str2) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                        return;
                    }
                    if (ErrorConstant.isSessionInvalid(str) || TextUtils.equals(str, "ANDROID_SYS_LOGIN_CANCEL")) {
                        Toast.makeText(CollectorImplementor.b(CollectorImplementor.this), CollectorImplementor.g(CollectorImplementor.this), 0).show();
                    } else if (b5m.H().isI18nEdition()) {
                        Toast.makeText(CollectorImplementor.b(CollectorImplementor.this), b5m.H().localizedString(R.string.tt_detail_cancel_collet_failed), 0).show();
                    } else {
                        Toast.makeText(CollectorImplementor.b(CollectorImplementor.this), str2, 0).show();
                    }
                    AnonymousClass1 r1 = AnonymousClass1.this;
                    CollectorImplementor.f(CollectorImplementor.this, this.f6803a, a2, true);
                    HashMap hashMap = new HashMap();
                    hashMap.put("errorCode", str);
                    hashMap.put("errorMsg", str2);
                    hashMap.put("itemId", string);
                    hashMap.put("subItemId", e2);
                    bw7.b(hashMap, -100013, "取消收藏失败");
                }
            }

            @Override // tb.b5m.p
            public void onFailure(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                    return;
                }
                Toast.makeText(CollectorImplementor.b(CollectorImplementor.this), str2, 0).show();
                tgh.b("CollectorImplementor", "queryCollect failed with errCode: " + str + " errMsg: " + str2 + ", for item: " + string + ", subItemId=" + e2);
                HashMap hashMap = new HashMap();
                hashMap.put("errorCode", str);
                hashMap.put("errorMsg", str2);
                hashMap.put("itemId", string);
                hashMap.put("subItemId", e2);
                bw7.b(hashMap, -100019, "查询收藏失败");
            }

            @Override // tb.b5m.p
            public void onSuccess(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4b8f9489", new Object[]{this, new Boolean(z)});
                    return;
                }
                oa4 i = yc4.i(runtimeAbilityParamArr);
                if (i == null) {
                    tgh.b("CollectorImplementor", "queryCollect success with value: " + z + ", but not found triggerComponent for write back");
                    return;
                }
                if (z) {
                    b5m.D().c(string, new a(i));
                } else {
                    b5m.D().d(string, DataUtils.D((Resource) CollectorImplementor.h(CollectorImplementor.this).e().f(Resource.class)), new b(i));
                }
                q84.f(CollectorImplementor.b(CollectorImplementor.this), new rc7("userTrack", new JSONObject(z, (Item) CollectorImplementor.h(CollectorImplementor.this).e().f(Item.class)) { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.CollectorImplementor.1.3
                    public final /* synthetic */ boolean val$isCollect;
                    public final /* synthetic */ Item val$item;

                    {
                        String str;
                        this.val$isCollect = z;
                        this.val$item = r3;
                        put("eventId", "2101");
                        if (z) {
                            str = "Page_Detail_Button-CancelFavorite";
                        } else {
                            str = "Page_Detail_Button-AddToFavorite";
                        }
                        put("arg1", (Object) str);
                        put("args", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.CollectorImplementor.1.3.1
                            {
                                String str2;
                                if (AnonymousClass3.this.val$isCollect) {
                                    str2 = "a2141.7631564.cancelfavorite";
                                } else {
                                    str2 = "a2141.7631564.addtofavorite";
                                }
                                put("spm", (Object) str2);
                                put("categoryId", (Object) DataUtils.n(AnonymousClass3.this.val$item, ""));
                                put("rootCategoryId", (Object) DataUtils.C(AnonymousClass3.this.val$item, ""));
                            }
                        });
                    }
                }, new RuntimeAbilityParam[0]));
            }
        });
        return true;
    }

    public final void n(String str, String str2, Map<String, String> map, JSONObject jSONObject, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86727a07", new Object[]{this, str, str2, map, jSONObject, runtimeAbilityParamArr});
        } else {
            b5m.D().d(str, map, new e(jSONObject, str, str2, runtimeAbilityParamArr));
        }
    }

    public final void o(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3591f6b", new Object[]{this, str, str2});
        } else {
            b5m.D().c(str, new b5m.k() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.CollectorImplementor.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.b5m.k
                public void onFailure(String str3, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cccc2dc6", new Object[]{this, str3, str4});
                        return;
                    }
                    if (ErrorConstant.isSessionInvalid(str3) || TextUtils.equals(str3, "ANDROID_SYS_LOGIN_CANCEL")) {
                        Toast.makeText(CollectorImplementor.b(CollectorImplementor.this), CollectorImplementor.g(CollectorImplementor.this), 0).show();
                    } else if (b5m.H().isI18nEdition()) {
                        Toast.makeText(CollectorImplementor.b(CollectorImplementor.this), b5m.H().localizedString(R.string.tt_detail_cancel_collet_failed), 0).show();
                    } else {
                        Toast.makeText(CollectorImplementor.b(CollectorImplementor.this), str4, 0).show();
                    }
                    CollectorImplementor.j(CollectorImplementor.this, str3, str4, str, str2);
                }

                @Override // tb.b5m.k
                public void onSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                        return;
                    }
                    Toast.makeText(CollectorImplementor.b(CollectorImplementor.this), CollectorImplementor.c(CollectorImplementor.this), 0).show();
                    oz3.b(CollectorImplementor.h(CollectorImplementor.this), false);
                }
            });
        }
    }

    public final void p(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79a829e0", new Object[]{this, str, str2, str3, str4});
            return;
        }
        tgh.b("CollectorImplementor", "showCollectCategory failed with errCode: " + str + " errMsg: " + str2 + ", for item: " + str3 + ", subItemId=" + str4);
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", str);
        hashMap.put("errorMsg", str2);
        hashMap.put("itemId", str3);
        hashMap.put("subItemId", str4);
        bw7.b(hashMap, -100014, "收藏列表显示异常");
    }

    public final void r(String str, String str2, JSONObject jSONObject, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fccbf1bf", new Object[]{this, str, str2, jSONObject, runtimeAbilityParamArr});
        } else {
            b5m.D().e(str, new d(str, str2, jSONObject, runtimeAbilityParamArr));
        }
    }

    public final void s(String str, String str2, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e06a9f0", new Object[]{this, str, str2, runtimeAbilityParamArr});
            return;
        }
        View k = yc4.k(runtimeAbilityParamArr);
        if (k != null) {
            int[] iArr = new int[2];
            k.getLocationOnScreen(iArr);
            b5m.D().b(str, iArr[0] + (k.getWidth() / 2), iArr[1], new c(str, str2));
        }
    }

    public final void t(oa4 oa4Var, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23effa6d", new Object[]{this, oa4Var, jSONObject, new Boolean(z)});
        } else {
            pos.a(new b(oa4Var, z, jSONObject));
        }
    }

    public final void w(JSONObject jSONObject, String str, String str2, boolean z, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8829aee2", new Object[]{this, jSONObject, str, str2, new Boolean(z), runtimeAbilityParamArr});
        } else {
            b5m.D().a(((Feature) this.e.e().f(Feature.class)).isNewCollectSummary(), new a(jSONObject, z, str, str2, runtimeAbilityParamArr));
        }
    }

    public final void u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4710b0f", new Object[]{this, new Boolean(z)});
        } else {
            q84.f(this.d, new rc7("userTrack", new JSONObject(z, (Item) this.e.e().f(Item.class)) { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.CollectorImplementor.8
                public final /* synthetic */ boolean val$isCollect;
                public final /* synthetic */ Item val$item;

                {
                    String str;
                    this.val$isCollect = z;
                    this.val$item = r3;
                    put("eventId", "2101");
                    if (z) {
                        str = "Page_Detail_Button-CancelFavorite";
                    } else {
                        str = "Page_Detail_Button-AddToFavorite";
                    }
                    put("arg1", (Object) str);
                    put("args", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.CollectorImplementor.8.1
                        {
                            String str2;
                            if (AnonymousClass8.this.val$isCollect) {
                                str2 = "a2141.7631564.cancelfavorite";
                            } else {
                                str2 = "a2141.7631564.addtofavorite";
                            }
                            put("spm", (Object) str2);
                            put("categoryId", (Object) DataUtils.n(AnonymousClass8.this.val$item, ""));
                            put("rootCategoryId", (Object) DataUtils.C(AnonymousClass8.this.val$item, ""));
                        }
                    });
                }
            }, new RuntimeAbilityParam[0]));
        }
    }

    public final boolean q(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2454c4f7", new Object[]{this, jSONObject})).booleanValue();
        }
        Object obj = jSONObject.get("ignoreCollectCategory");
        return ((obj instanceof String) && "true".equals(obj)) || b5m.H().isI18nEdition();
    }
}
