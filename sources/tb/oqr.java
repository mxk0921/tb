package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.ultron.MTBPresenter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class oqr implements w8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long AKMTBEventChainForUltonEventAbilityAbilityHashType = -5402166632315831338L;

    /* renamed from: a  reason: collision with root package name */
    public final MTBPresenter f25580a;

    static {
        t2o.a(745538133);
        t2o.a(336592930);
    }

    public oqr(MTBPresenter mTBPresenter) {
        this.f25580a = mTBPresenter;
    }

    @Override // tb.w8
    public m8 build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m8) ipChange.ipc$dispatch("e57df123", new Object[]{this, obj});
        }
        return new a(this.f25580a);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a extends m8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final MTBPresenter b;

        static {
            t2o.a(745538134);
        }

        public a(MTBPresenter mTBPresenter) {
            this.b = mTBPresenter;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/event/TBMyTaobaoEventChainForUltonEventAbility$InnerTBMyTaobaoEventChainForUltonEventAbility");
        }

        @Override // tb.m8
        public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
            }
            JSONObject h = n8Var.h();
            if (h == null) {
                return null;
            }
            String string = h.getString("componentKey");
            JSONArray jSONArray = h.getJSONArray("events");
            if (jSONArray == null || TextUtils.isEmpty(string)) {
                return null;
            }
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null && jSONObject.containsKey("type")) {
                    this.b.Y(string, jSONObject.getString("type"), jSONObject);
                }
            }
            return null;
        }
    }
}
