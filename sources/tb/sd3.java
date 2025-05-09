package tb;

import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class sd3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(sd3 sd3Var) {
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
            } else if (executeResult instanceof ErrorResult) {
                ErrorResult errorResult = (ErrorResult) executeResult;
                String code = errorResult.getCode();
                String str = "StdPop出错#" + code;
                ub3.g(str, "message=" + errorResult.getMsg() + ",type=" + executeResult.getType());
            }
        }
    }

    static {
        t2o.a(479199424);
    }

    public static /* synthetic */ Object ipc$super(sd3 sd3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartShowStdPopSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        JSONObject c = c();
        JSONObject jSONObject = c.getJSONObject("popParams");
        if (jSONObject != null) {
            String string = c.getString("popType");
            AbilityHubAdapter abilityHubAdapter = new AbilityHubAdapter(new zq(c9x.CART_BIZ_NAME, "nativeFragment").a(this.b));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("popId", (Object) ("CartStdPop" + System.identityHashCode(this.b)));
            jSONObject2.put("bizId", (Object) c9x.CART_BIZ_NAME);
            jSONObject2.put("backgroundMode", (Object) "color");
            jSONObject2.put("backgroundStyle", (Object) "7F000000");
            jSONObject2.put("contentBackColor", (Object) "#FF5000");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("animation", (Object) nbf.STDPOP_ANIMATION_BOTTOM);
            jSONObject3.put("panEnable", (Object) "true");
            jSONObject2.put(h9.KEY_POP_CONFIG, (Object) jSONObject3);
            jSONObject2.putAll(jSONObject);
            abilityHubAdapter.j("stdPop", string, new xq().p(null), jSONObject2, new a(this));
        }
    }
}
