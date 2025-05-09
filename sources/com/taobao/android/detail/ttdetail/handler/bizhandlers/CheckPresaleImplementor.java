package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import java.lang.ref.WeakReference;
import mtopsdk.mtop.global.SDKUtils;
import tb.ag0;
import tb.b5m;
import tb.ir;
import tb.t2o;
import tb.tgh;
import tb.yc4;
import tb.ze7;
import tb.zre;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CheckPresaleImplementor implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "checkPresale";

    /* renamed from: a  reason: collision with root package name */
    public final Handler f6798a = new Handler(Looper.getMainLooper());
    public b b;
    public final Context c;
    public final ze7 d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements b5m.k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f6799a;
        public final /* synthetic */ RuntimeAbilityParam[] b;

        public a(JSONObject jSONObject, RuntimeAbilityParam[] runtimeAbilityParamArr) {
            this.f6799a = jSONObject;
            this.b = runtimeAbilityParamArr;
        }

        @Override // tb.b5m.k
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            tgh.b("CheckPresaleImplementor", "PlatformEvn.getReminderEvn().checkRemind() onError with errCode: " + str + " errMsg: " + str2);
        }

        @Override // tb.b5m.k
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else {
                CheckPresaleImplementor.b(CheckPresaleImplementor.this, this.f6799a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<ze7> f6800a;

        static {
            t2o.a(912261860);
        }

        public b(ze7 ze7Var) {
            this.f6800a = new WeakReference<>(ze7Var);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ze7 ze7Var = this.f6800a.get();
            if (ze7Var != null) {
                new JSONObject().put("itemId", (Object) DataUtils.w((Item) ze7Var.e().f(Item.class), ""));
            }
        }
    }

    static {
        t2o.a(912261857);
        t2o.a(912261826);
    }

    public CheckPresaleImplementor(Context context, ze7 ze7Var) {
        this.c = context;
        this.d = ze7Var;
    }

    public static /* synthetic */ void b(CheckPresaleImplementor checkPresaleImplementor, JSONObject jSONObject, RuntimeAbilityParam[] runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fafa5a33", new Object[]{checkPresaleImplementor, jSONObject, runtimeAbilityParamArr});
        } else {
            checkPresaleImplementor.c(jSONObject, runtimeAbilityParamArr);
        }
    }

    public final void c(JSONObject jSONObject, RuntimeAbilityParam[] runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265c9e24", new Object[]{this, jSONObject, runtimeAbilityParamArr});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putAll(jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(ag0.KEY_BE_REPLACED, (Object) "bottomBarVO");
        jSONObject3.put(ag0.KEY_TO_REPLACE, (Object) "fields");
        jSONObject2.put(ag0.KEY_TARGET_REPLACEMENT, (Object) jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("btnTitle", (Object) "已设置提醒");
        Boolean bool = Boolean.TRUE;
        jSONObject4.put("rightFirstStatus", (Object) bool);
        jSONObject4.put("rightSecondStatus", (Object) bool);
        jSONObject2.put("payload", (Object) jSONObject4);
        this.d.b().h(new ir(new JSONObject(jSONObject2) { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.CheckPresaleImplementor.2
            public final /* synthetic */ JSONObject val$adjustStateEventFields;

            {
                this.val$adjustStateEventFields = jSONObject2;
                put("type", ag0.EVENT_TYPE);
                put("fields", (Object) jSONObject2);
            }
        }), runtimeAbilityParamArr);
    }

    public final void d(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f1d890b", new Object[]{this, jSONObject, str});
            return;
        }
        Boolean bool = jSONObject.getBoolean("disableRefresh");
        if (bool != null && !bool.booleanValue()) {
            long longValue = jSONObject.getLong(str).longValue() - ((SDKUtils.getTimeOffset() * 1000) + System.currentTimeMillis());
            if (longValue > 0) {
                b bVar = this.b;
                if (bVar != null) {
                    this.f6798a.removeCallbacks(bVar);
                }
                b bVar2 = new b(this.d);
                this.b = bVar2;
                this.f6798a.postDelayed(bVar2, longValue);
            }
        }
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null || (a2 = irVar.a()) == null || yc4.i(runtimeAbilityParamArr) == null) {
            return false;
        }
        String string = a2.getString("status");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        string.hashCode();
        if (!string.equals("1")) {
            if (!string.equals("2")) {
                tgh.b("CheckPresaleImplementor", "preSaleStatus is invalid: ".concat(string));
            } else {
                d(a2, "endTime");
            }
        } else if (b5m.L().a(this.c, this.d, a2, new a(a2, runtimeAbilityParamArr))) {
            d(a2, "startTime");
        }
        return true;
    }
}
