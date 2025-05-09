package tb;

import android.net.Uri;
import androidx.collection.ArrayMap;
import com.alibaba.android.icart.core.ability.event.CartOpenPopEventAbility;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class oe3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final oe3 INSTANCE = new oe3();
    public static final String keyNeedPVUUID = "needPvuuid";
    public static final String keyPVUUID = "pvuuid";
    public static final String keyUrlExParam = "urlExParam";

    static {
        t2o.a(479199513);
    }

    public final String a(String str, nc3 nc3Var) {
        IDMComponent a2;
        ArrayMap<String, Object> extMap;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc43dcd", new Object[]{this, str, nc3Var});
        }
        ckf.g(str, "url");
        ckf.g(nc3Var, "config");
        try {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter("jt_pt_navStartTime", String.valueOf(System.currentTimeMillis()));
            lcu lcuVar = (lcu) nc3Var.h(CartOpenPopEventAbility.sParamKeyTradeEvent);
            if (!(lcuVar == null || (a2 = lcuVar.a()) == null || (extMap = a2.getExtMap()) == null || (obj = extMap.get(keyUrlExParam)) == null || !(obj instanceof Map))) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if ((key instanceof String) && (value instanceof String)) {
                        buildUpon.appendQueryParameter((String) key, (String) value);
                    }
                }
            }
            String builder = buildUpon.toString();
            ckf.f(builder, "builder.toString()");
            hav.d("CartWeexPopOptimizer", "reassembleUrl,finalUrl=" + builder);
            return builder;
        } catch (Throwable th) {
            hav.a("UltronCatchException", th.getMessage());
            return str;
        }
    }
}
