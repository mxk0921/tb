package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dojo.ability.log.ModuleName;
import tb.qy8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class t4b extends oz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final wcc b;

    static {
        t2o.a(729810245);
    }

    public t4b(wcc wccVar) {
        this.b = wccVar;
    }

    public static /* synthetic */ Object ipc$super(t4b t4bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/performance/HomeUserActionScorer");
    }

    @Override // tb.oz
    public int b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6e91b60d", new Object[]{this, str, jSONObject})).intValue();
        }
        return 0;
    }

    @Override // tb.oz
    public int c(String str, String str2, d7e d7eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3512d18b", new Object[]{this, str, str2, d7eVar})).intValue();
        }
        return ((rpv) d7eVar).d() * 3;
    }

    @Override // tb.oz
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    @Override // tb.oz
    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ee1b448", new Object[]{this});
        }
        return qy8.b.e(ModuleName.PRELOAD_ABILITY, "userActionBXFeature", "");
    }
}
