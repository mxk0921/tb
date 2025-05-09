package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker;
import com.taobao.android.detail.ttdetail.utils.RuntimeUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kqv extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MEGA_NAME = "ttDetail";
    public final Context b;
    public final ze7 c;
    public static final String NAME = "userBehavior";
    public static final long DX_ABILITY_ID = k06.a(NAME);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f22858a;
        public final ze7 b;

        static {
            t2o.a(912261831);
            t2o.a(336592930);
        }

        public a(Context context, ze7 ze7Var) {
            this.f22858a = context;
            this.b = ze7Var;
        }

        @Override // tb.w8
        public m8 build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (m8) ipChange.ipc$dispatch("e57df123", new Object[]{this, obj});
            }
            return new kqv(this.f22858a, this.b);
        }
    }

    public kqv(Context context, ze7 ze7Var) {
        this.b = context;
        this.c = ze7Var;
    }

    public static /* synthetic */ Object ipc$super(kqv kqvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/handler/atomic/UserBehaviorAbility");
    }

    public final String i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f8a6469", new Object[]{this, jSONObject});
        }
        String string = jSONObject.getString("componentName");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String string2 = jSONObject.getString("ttHideComponentId");
        return !TextUtils.isEmpty(string2) ? RuntimeUtils.c(this.c.h().d(string2)) : string;
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        if (n8Var == null || n8Var.h() == null) {
            return new b8(new a8(-10086, "params is null"), true);
        }
        JSONObject h = n8Var.h();
        String string = h.getString("action");
        if (TextUtils.equals(string, "putContent")) {
            String i = i(h);
            if (!TextUtils.isEmpty(i) && (jSONObject = h.getJSONObject("contentInfo")) != null) {
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    UserBehaviorTracker.k(this.b, i, entry.getKey(), entry.getValue());
                }
            }
        } else if (TextUtils.equals(string, "runAbility")) {
            String string2 = h.getString("eventType");
            String string3 = h.getString("behaviorType");
            if (!TextUtils.isEmpty(string2)) {
                UserBehaviorTracker.l(this.b, i(h), string2, k3i.b(h.getJSONObject("eventInfo")));
            } else if (!TextUtils.isEmpty(string3)) {
                String i2 = i(h);
                JSONObject jSONObject2 = h.getJSONObject("contentInfo");
                if ("appear".equalsIgnoreCase(string3)) {
                    UserBehaviorTracker.j(this.b, i2, 1);
                } else if ("disappear".equalsIgnoreCase(string3)) {
                    UserBehaviorTracker.j(this.b, i2, 2);
                }
                if (jSONObject2 != null) {
                    for (Map.Entry<String, Object> entry2 : jSONObject2.entrySet()) {
                        UserBehaviorTracker.k(this.b, i2, entry2.getKey(), entry2.getValue());
                    }
                }
            }
        } else {
            return new b8(new a8(-10086, "action is not defined for: " + string), true);
        }
        return new f8();
    }

    static {
        t2o.a(912261830);
    }
}
