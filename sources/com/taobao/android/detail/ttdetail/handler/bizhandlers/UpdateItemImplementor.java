package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.TTDetailPageManager;
import com.taobao.android.detail.ttdetail.container.MainScreenCore;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.detail.ttdetail.utils.IpvUtils;
import com.taobao.android.detail.ttdetail.utils.RuntimeUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ir;
import tb.t2o;
import tb.tgh;
import tb.uug;
import tb.vbl;
import tb.xpc;
import tb.ywk;
import tb.yzc;
import tb.ze7;
import tb.zre;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class UpdateItemImplementor implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "update_item";

    /* renamed from: a  reason: collision with root package name */
    public final Context f6826a;
    public final ze7 b;
    public final b c;
    public final a d;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.detail.ttdetail.handler.bizhandlers.UpdateItemImplementor$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class AnonymousClass1 implements yzc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6827a;

        public AnonymousClass1(String str) {
            this.f6827a = str;
        }

        @Override // tb.yzc
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97f869b2", new Object[]{this});
            }
        }

        @Override // tb.yzc
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else {
                UpdateItemImplementor.this.b.h().g(new Runnable() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.UpdateItemImplementor.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        String str;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        IpvUtils.g(UpdateItemImplementor.this.f6826a);
                        UpdateItemImplementor updateItemImplementor = UpdateItemImplementor.this;
                        IpvUtils.f(updateItemImplementor.f6826a, UpdateItemImplementor.b(updateItemImplementor));
                        IpvUtils.e(new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.UpdateItemImplementor.1.1.1
                            {
                                put("pre_tt_detail_na_unique_id", UpdateItemImplementor.this.b.e().k("new_arch_unique_id"));
                            }
                        });
                        HashMap hashMap = new HashMap();
                        if (!TextUtils.isEmpty(AnonymousClass1.this.f6827a)) {
                            str = AnonymousClass1.this.f6827a;
                        } else {
                            str = "";
                        }
                        hashMap.put("item_id", str);
                        hashMap.put("seller_id", DataUtils.E((Seller) UpdateItemImplementor.this.b.e().f(Seller.class), ""));
                        hashMap.put("spm", "a2141.7631564");
                        IpvUtils.i(UpdateItemImplementor.this.f6826a, hashMap);
                        UpdateItemImplementor updateItemImplementor2 = UpdateItemImplementor.this;
                        IpvUtils.i(updateItemImplementor2.f6826a, UpdateItemImplementor.c(updateItemImplementor2));
                    }
                });
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
    }

    static {
        t2o.a(912261960);
        t2o.a(912261826);
    }

    public UpdateItemImplementor(Context context, ze7 ze7Var, b bVar, a aVar) {
        this.f6826a = context;
        this.b = ze7Var;
        this.c = bVar;
        this.d = aVar;
    }

    public static /* synthetic */ String b(UpdateItemImplementor updateItemImplementor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ce1b5b9", new Object[]{updateItemImplementor});
        }
        return updateItemImplementor.g();
    }

    public static /* synthetic */ Map c(UpdateItemImplementor updateItemImplementor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("60d4c77d", new Object[]{updateItemImplementor});
        }
        return updateItemImplementor.f();
    }

    public boolean d(String str, Map<String, String> map, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f015ecce", new Object[]{this, str, map, runtimeAbilityParamArr})).booleanValue();
        }
        ((TTDetailPageManager.h) this.c).a(map, new AnonymousClass1(str), RuntimeUtils.a(runtimeAbilityParamArr));
        return true;
    }

    public final Map<String, String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3762207d", new Object[]{this});
        }
        a aVar = this.d;
        if (aVar != null) {
            return ((TTDetailPageManager.AnonymousClass17) aVar).a();
        }
        return null;
    }

    public final String g() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c3ab06a", new Object[]{this});
        }
        a aVar = this.d;
        if (aVar != null) {
            str = ((TTDetailPageManager.AnonymousClass17) aVar).b();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return "Page_Detail";
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject a2;
        List list;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        tgh.b("UpdateItemImplementor", xpc.RECORD_EXECUTE);
        if (irVar == null || (a2 = irVar.a()) == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String string = a2.getString("itemId");
        String string2 = a2.getString("pageKey");
        boolean parseBoolean = Boolean.parseBoolean(a2.getString("willSelectedBundleTab"));
        if (vbl.b()) {
            string = ywk.c(this.b, string);
            if (TextUtils.isEmpty(string)) {
                string = DataUtils.v((Item) this.b.e().f(Item.class));
            }
        }
        String string3 = a2.getString("transitionType");
        if (TextUtils.equals("right_enter", string3)) {
            this.b.e().u(MainScreenCore.ANIMATOR_CHANGE_TAB, 1);
        } else if (TextUtils.equals("left_enter", string3)) {
            this.b.e().u(MainScreenCore.ANIMATOR_CHANGE_TAB, 2);
        } else {
            this.b.e().u(MainScreenCore.ANIMATOR_CHANGE_TAB, 0);
        }
        hashMap.put("detail_item_id", string);
        hashMap.put("clearSkuStorage", "true");
        hashMap.put("params", a2.getString("params"));
        tgh.b("UpdateItemImplementor", "onUpdateItem itemId=" + string);
        if (runtimeAbilityParamArr != null) {
            list = uug.a(runtimeAbilityParamArr);
        } else {
            list = new ArrayList();
        }
        if (!TextUtils.isEmpty(string2)) {
            list.add(new RuntimeAbilityParam("pageKey", string2));
            z = true;
        } else {
            z = false;
        }
        if (parseBoolean) {
            list.add(new RuntimeAbilityParam("useBundleAdjust", Boolean.TRUE));
        }
        if (z) {
            runtimeAbilityParamArr = (RuntimeAbilityParam[]) list.toArray(new RuntimeAbilityParam[0]);
        }
        return d(string, hashMap, runtimeAbilityParamArr);
    }
}
