package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import tb.ag0;
import tb.b5m;
import tb.ir;
import tb.t2o;
import tb.tgh;
import tb.ze7;
import tb.zre;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SetRemindImplementor implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "setRemind";

    /* renamed from: a  reason: collision with root package name */
    public final Context f6822a;
    public final ze7 b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements b5m.k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(SetRemindImplementor setRemindImplementor) {
        }

        @Override // tb.b5m.k
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            tgh.b("SetRemindImplementor", "PlatformEvn.getReminderEvn().setRemind() onError with errCode: " + str + " errMsg: " + str2);
        }

        @Override // tb.b5m.k
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else {
                tgh.b("SetRemindImplementor", "PlatformEvn.getReminderEvn().setRemind() success");
            }
        }
    }

    static {
        t2o.a(912261939);
        t2o.a(912261826);
    }

    public SetRemindImplementor(Context context, ze7 ze7Var) {
        this.f6822a = context;
        this.b = ze7Var;
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null || (a2 = irVar.a()) == null) {
            return false;
        }
        b5m.L().b(this.f6822a, this.b, a2, new a(this));
        b(a2, runtimeAbilityParamArr);
        return true;
    }

    public final void b(JSONObject jSONObject, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7e61644", new Object[]{this, jSONObject, runtimeAbilityParamArr});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("next");
        if (!(jSONObject2 == null || (jSONArray = jSONObject2.getJSONArray("success")) == null)) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                if (jSONObject3 != null) {
                    String string = jSONObject3.getString("type");
                    if (!TextUtils.isEmpty(string)) {
                        JSONObject jSONObject4 = jSONObject3.getJSONObject("fields");
                        if (string.equals(ag0.EVENT_TYPE) && jSONObject4 != null) {
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put(ag0.KEY_BE_REPLACED, (Object) "bottomBarVO");
                            jSONObject5.put(ag0.KEY_TO_REPLACE, (Object) "fields");
                            jSONObject4.put(ag0.KEY_TARGET_REPLACEMENT, (Object) jSONObject5);
                        }
                        this.b.b().h(new ir(new JSONObject(string, jSONObject4) { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.SetRemindImplementor.2
                            public final /* synthetic */ JSONObject val$nextEventFields;
                            public final /* synthetic */ String val$nextEventType;

                            {
                                this.val$nextEventType = string;
                                this.val$nextEventFields = jSONObject4;
                                put("type", (Object) string);
                                put("fields", (Object) jSONObject4);
                            }
                        }), runtimeAbilityParamArr);
                    }
                }
            }
        }
    }
}
