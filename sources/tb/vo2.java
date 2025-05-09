package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.UtUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class vo2 extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MEGA_NAME = "abilityHub";
    public static final String NAME = "bxSubscribe";
    public static final long DX_ABILITY_ID = k06.a(NAME);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(354418783);
            t2o.a(336592930);
        }

        @Override // tb.w8
        public m8 build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (m8) ipChange.ipc$dispatch("e57df123", new Object[]{this, obj});
            }
            return new vo2();
        }
    }

    static {
        t2o.a(354418782);
    }

    public static /* synthetic */ Object ipc$super(vo2 vo2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/alittdetail/subscribe/BxSubscribeAbility");
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
        try {
            JSONObject h = n8Var.h();
            String string = h.getString("bxAction");
            String string2 = h.getString("pageName");
            String string3 = h.getString("arg1");
            JSONObject jSONObject = h.getJSONObject("args");
            if (TextUtils.isEmpty(string3)) {
                JSONObject jSONObject2 = h.getJSONObject("data");
                string3 = jSONObject2.getString("arg1");
                jSONObject = jSONObject2.getJSONObject("args");
            }
            if (TextUtils.equals("click", string)) {
                b5m.A().b(string2, string3, null, UtUtils.i(jSONObject));
            } else if (TextUtils.equals("appear", string)) {
                b5m.A().c(string2, string3, null, null, UtUtils.i(jSONObject));
            }
            return new f8();
        } catch (Exception unused) {
            return new b8(new a8(90030, "execute exception"));
        }
    }
}
