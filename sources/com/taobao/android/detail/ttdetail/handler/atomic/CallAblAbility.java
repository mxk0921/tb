package com.taobao.android.detail.ttdetail.handler.atomic;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a8;
import tb.b8;
import tb.c8;
import tb.e28;
import tb.f8;
import tb.ir;
import tb.k06;
import tb.k8;
import tb.m8;
import tb.n8;
import tb.t2o;
import tb.tgh;
import tb.tk6;
import tb.u8;
import tb.w8;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CallAblAbility extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DX_CALLBACK = "dxCallback";
    public static final String MEGA_NAME = "ttDetail";
    public final ze7 b;
    public static final String NAME = "callAbl";
    public static final long DX_ABILITY_ID = k06.a(NAME);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f6794a;
        public final ze7 b;

        static {
            t2o.a(912261829);
            t2o.a(336592930);
        }

        public a(Context context, ze7 ze7Var) {
            this.f6794a = context;
            this.b = ze7Var;
        }

        @Override // tb.w8
        public m8 build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (m8) ipChange.ipc$dispatch("e57df123", new Object[]{this, obj});
            }
            return new CallAblAbility(this.f6794a, this.b);
        }
    }

    static {
        t2o.a(912261827);
    }

    public CallAblAbility(Context context, ze7 ze7Var) {
        this.b = ze7Var;
    }

    public static /* synthetic */ Object ipc$super(CallAblAbility callAblAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/handler/atomic/CallAblAbility");
    }

    public final Object[] i(JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("ac07b62d", new Object[]{this, jSONArray, str});
        }
        if (jSONArray == null) {
            return null;
        }
        jSONArray.add(0, str);
        return jSONArray.toArray();
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        if (n8Var == null || n8Var.h() == null) {
            return new b8(new a8(90030, "params is null"), true);
        }
        JSONObject h = n8Var.h();
        String string = h.getString("eventName");
        String string2 = h.getString("eventParams");
        JSONArray jSONArray = h.getJSONArray("eventArgs");
        tgh.b("CallAblAbility", "eventName : " + string + " eventParams : " + string2 + " eventArgs : " + jSONArray);
        ir irVar = new ir(new JSONObject(string, string2) { // from class: com.taobao.android.detail.ttdetail.handler.atomic.CallAblAbility.1
            public final /* synthetic */ String val$eventName;
            public final /* synthetic */ String val$eventParams;

            {
                this.val$eventName = string;
                this.val$eventParams = string2;
                put("type", (Object) string);
                put("fields", (Object) string2);
            }
        });
        tk6 tk6Var = (tk6) k8Var;
        if (tk6Var.o().getData() != null) {
            this.b.b().h(irVar, e28.c(i(jSONArray, string), tk6Var.p(), this.b, u8Var));
        }
        return new f8();
    }
}
