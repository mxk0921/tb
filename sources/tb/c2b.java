package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class c2b extends nv1 implements czc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782818);
        t2o.a(488636428);
    }

    public c2b(lza lzaVar) {
        super(lzaVar);
    }

    public static /* synthetic */ Object ipc$super(c2b c2bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/framework/hostservice/callbcak/impl/HomeNaviBarCallback");
    }

    @Override // tb.czc
    public float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5411de93", new Object[]{this})).floatValue();
        }
        return w().n();
    }

    @Override // tb.czc
    public JSONObject getSubTabSearchBarData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bab9b3d1", new Object[]{this});
        }
        return w().q();
    }

    @Override // tb.czc
    public Map<String, Integer> k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5b799bd5", new Object[]{this, str, str2});
        }
        return w().o(str, str2);
    }

    @Override // tb.czc
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10621d37", new Object[]{this});
        } else {
            w().x();
        }
    }

    @Override // tb.czc
    public JSONObject s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3aab96dd", new Object[]{this});
        }
        return w().p();
    }
}
