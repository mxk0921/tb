package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class f3l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698999);
    }

    public static void a(xea xeaVar, DXRuntimeContext dXRuntimeContext, Object[] objArr) {
        ux9 q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cba93003", new Object[]{xeaVar, dXRuntimeContext, objArr});
        } else if (objArr != null && objArr.length >= 4 && (objArr[1] instanceof String) && (objArr[2] instanceof JSONObject) && (objArr[3] instanceof String)) {
            beb d = kkr.i().d();
            if (xeaVar == null) {
                q = null;
            } else {
                q = xeaVar.q();
            }
            d.n(q, dXRuntimeContext.h(), (String) objArr[0], (String) objArr[1], (JSONObject) objArr[2]);
            if (kkr.i().o() != null) {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("bizCode", (String) objArr[3]);
                hashMap.put("componentName", (String) objArr[1]);
                if (objArr.length > 5) {
                    Object obj = objArr[5];
                    if (obj instanceof JSONObject) {
                        hashMap.putAll(m3s.b((JSONObject) obj));
                    }
                }
                if (((JSONObject) objArr[2]).getString("itemId") != null) {
                    hashMap.putAll(zha.e(xeaVar, (LiveItem) fkx.f(((JSONObject) objArr[2]).toJSONString(), LiveItem.class)));
                }
                kkr.i().o().c("gl-openComponent", hashMap);
            }
        }
    }

    public static int b(DXRuntimeContext dXRuntimeContext) {
        JSONArray jSONArray;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dffd678", new Object[]{dXRuntimeContext})).intValue();
        }
        try {
            JSONObject i2 = dXRuntimeContext.i();
            if (i2.containsKey("rights") && (jSONArray = i2.getJSONArray("rights")) != null && !jSONArray.isEmpty()) {
                i = 1;
            }
            if (i2.containsKey("rightCdp")) {
                i++;
            }
            return i2.containsKey("intimacyCoin") ? i + 1 : i;
        } catch (Exception unused) {
            return i;
        }
    }

    public static void c(xea xeaVar, DXRuntimeContext dXRuntimeContext, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fd9e2a", new Object[]{xeaVar, dXRuntimeContext, objArr});
            return;
        }
        int b = b(dXRuntimeContext);
        if (objArr.length <= 4) {
            return;
        }
        if (!nh4.h() || !(objArr[2] instanceof JSONObject) || !pfa.v(dXRuntimeContext.h(), (LiveItem) fkx.f(((JSONObject) objArr[2]).toJSONString(), LiveItem.class))) {
            String str = (String) objArr[3];
            str.hashCode();
            if ((str.equals("rightCdp") || str.equals("intimacyNav")) && (objArr[0] instanceof String) && (objArr[1] instanceof String) && (objArr[2] instanceof JSONObject) && (objArr[4] instanceof String)) {
                kkr.i().d().n(xeaVar == null ? null : xeaVar.q(), dXRuntimeContext.h(), (String) objArr[0], (String) objArr[1], (JSONObject) objArr[2]);
                if (kkr.i().o() != null) {
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("bannerCount", String.valueOf(b));
                    if (objArr.length > 5) {
                        Object obj = objArr[5];
                        if (obj instanceof String) {
                            hashMap.put("bizType", (String) obj);
                        }
                    }
                    if (TextUtils.equals("intimacyNav", str)) {
                        kkr.i().o().c("pocket-bean-click", hashMap);
                    } else if (TextUtils.equals("rightCdp", str)) {
                        kkr.i().o().c("rightCdp-click", hashMap);
                    }
                }
            } else {
                a(xeaVar, dXRuntimeContext, objArr);
                iha.h(str);
            }
        }
    }
}
