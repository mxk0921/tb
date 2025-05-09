package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vo0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199551);
    }

    public static Map<String, String> a(IDMComponent iDMComponent, kmb kmbVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("550a3350", new Object[]{iDMComponent, kmbVar, map});
        }
        HashMap hashMap = new HashMap();
        if (iDMComponent == null) {
            return hashMap;
        }
        JSONObject fields = iDMComponent.getFields();
        hashMap.put("wakeupType", fields.getString("wakeupType"));
        hashMap.put("shopId", fields.getString("shopId"));
        IDMComponent m = cb4.m(iDMComponent, "shop");
        if (m != null) {
            hashMap.put("shopIndex", e(m, kmbVar) + "");
        }
        hashMap.put("itemId", fields.getString("itemId"));
        if ("item".equals(iDMComponent.getTag())) {
            hashMap.put("itemIndex", String.valueOf(e(iDMComponent, kmbVar)));
        }
        hashMap.put("bizCodes", fields.getString("bizCodes"));
        if (fields.getJSONObject("sku") != null) {
            hashMap.put("isSKUInvalid", fields.getJSONObject("sku").getString("skuInvalid"));
        }
        hashMap.put("isInvalid", fields.getString("titleInCheckBox"));
        hashMap.put("invalidMessage", fields.getString("codeMsg"));
        hashMap.put("isManaging", kmbVar.d().K() + "");
        hashMap.put("currentFilterItem", kmbVar.d().y());
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public static Map<String, String> b(IDMComponent iDMComponent, kmb kmbVar, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("69bcac6a", new Object[]{iDMComponent, kmbVar, strArr});
        }
        return a(iDMComponent, kmbVar, juv.c(strArr));
    }

    public static Map<String, String> c(IDMComponent iDMComponent, kmb kmbVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3feb32cd", new Object[]{iDMComponent, kmbVar, map});
        }
        HashMap hashMap = new HashMap();
        if (iDMComponent == null) {
            return hashMap;
        }
        IDMComponent m = cb4.m(iDMComponent, "shop");
        JSONObject fields = m != null ? m.getFields() : null;
        if (fields == null) {
            return hashMap;
        }
        hashMap.put("wakeupType", fields.getString("wakeupType"));
        hashMap.put("shopId", fields.getString("shopId"));
        hashMap.put("shopIndex", String.valueOf(e(m, kmbVar)));
        hashMap.put("showSubTitle", fields.getString(MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE));
        hashMap.put("currentFilterItem", kmbVar.d().y());
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public static Map<String, String> d(IDMComponent iDMComponent, kmb kmbVar, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f4e7a567", new Object[]{iDMComponent, kmbVar, strArr});
        }
        return c(iDMComponent, kmbVar, juv.c(strArr));
    }

    public static int e(IDMComponent iDMComponent, kmb kmbVar) {
        fsb b;
        List<IDMComponent> list;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a19fcde", new Object[]{iDMComponent, kmbVar})).intValue();
        }
        if (iDMComponent == null || (b = kmbVar.b()) == null) {
            return -1;
        }
        if (kmbVar.d().L()) {
            list = kmbVar.d().D();
        } else {
            list = b.getComponents();
        }
        if (list == null) {
            return -1;
        }
        String tag = iDMComponent.getTag();
        if (TextUtils.isEmpty(tag)) {
            return -1;
        }
        for (IDMComponent iDMComponent2 : list) {
            if (iDMComponent2 != null && tag.equals(iDMComponent2.getTag())) {
                if (iDMComponent2.equals(iDMComponent)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }
}
