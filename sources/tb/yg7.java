package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class yg7 extends v22 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321555);
    }

    public yg7(cxj cxjVar, dh7 dh7Var, String str) {
        super(cxjVar, dh7Var, str);
    }

    public static /* synthetic */ Object ipc$super(yg7 yg7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/biz/detailcard/usertrack/DetailUserTrackHandler");
    }

    public static Map<String, String> p(Map<String, String> map, ue7 ue7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("df570121", new Object[]{map, ue7Var});
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (ue7Var != null) {
            map.put("item_id", ue7Var.B0());
            map.put("seller_id", ue7Var.K0());
            try {
                map.putAll((Map) JSON.toJavaObject(ue7Var.L0(), Map.class));
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                map.putAll((Map) JSON.toJavaObject(ue7Var.M0(), Map.class));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return map;
    }

    @Override // tb.v22
    public Map<String, String> d(Map<String, String> map, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("eef4de0e", new Object[]{this, map, x3wVar});
        }
        if (x3wVar instanceof ue7) {
            return p(map, (ue7) x3wVar);
        }
        if (map == null) {
            return new HashMap();
        }
        return map;
    }
}
