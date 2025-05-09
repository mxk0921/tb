package tb;

import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.utils.tools.TimeCalculator;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class kjn implements adt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final int f22707a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 6;
    public static final int g = 7;

    static {
        t2o.a(1034944718);
        t2o.a(1034944593);
    }

    @Override // tb.adt
    public Map<String, String> a(Map<String, String> map) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e53be4f", new Object[]{this, map});
        }
        kgh.a("ReadInfoTask", "params:" + map);
        String str = map.get(r4p.KEY_MODEL_NAME);
        int parseInt = Integer.parseInt(map.get("infoType"));
        HashMap hashMap = new HashMap();
        if (parseInt == 0) {
            c(hashMap, kzo.c().j());
        } else if (parseInt == f22707a) {
            c(hashMap, b());
        } else {
            String str2 = "";
            if (parseInt == b) {
                if (TextUtils.isEmpty(str)) {
                    hashMap.put("success", "0");
                } else {
                    h45 registeredModel = DAI.getRegisteredModel(str);
                    if (!(registeredModel == null || (jSONObject = registeredModel.e) == null)) {
                        str2 = jSONObject.toString();
                    }
                    c(hashMap, str2);
                }
            } else if (parseInt == c) {
                c(hashMap, "2");
            } else if (parseInt == d) {
                c(hashMap, Build.VERSION.SDK_INT + str2);
            } else if (parseInt == e) {
                UserTrackDO d2 = kzo.c().d();
                if (d2 != null) {
                    str2 = d2.getSesionId();
                }
                c(hashMap, str2);
            } else if (parseInt == f) {
                c(hashMap, TimeCalculator.PLATFORM_ANDROID);
            } else if (parseInt == g) {
                c(hashMap, um2.c());
            }
        }
        return hashMap;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        if (ld0.c() != null) {
            return ld0.c().getUserId();
        }
        return null;
    }

    public final void c(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b8dd23", new Object[]{this, map, str});
        } else if (TextUtils.isEmpty(str)) {
            map.put("success", "0");
        } else {
            map.put("success", "1");
            map.put("result", str);
        }
    }
}
