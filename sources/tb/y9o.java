package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.taopassword.busniess.model.TemplateId;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class y9o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(664797205);
    }

    public static void a(tgs tgsVar, Map<String, String> map, y9 y9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4264089f", new Object[]{tgsVar, map, y9Var});
            return;
        }
        d(tgsVar, map, y9Var);
        tgsVar.v = tgsVar.j.remove("content");
        tgsVar.j.remove("title");
        tgsVar.w = tgsVar.j.remove("picUrl");
        tgsVar.j.remove("leftButtonText");
        tgsVar.j.remove("rightButtonText");
        tgsVar.x = tgsVar.j.remove("ownerName");
        tgsVar.y = tgsVar.j.remove("taopwdOwnerId");
        tgsVar.q = y9Var;
    }

    public static <T> T b(Class<T> cls, Map<String, String> map, y9 y9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("b97acbd8", new Object[]{cls, map, y9Var});
        }
        try {
            return (T) JSON.parseObject(JSON.parseObject(map.toString()).toJSONString(), cls);
        } catch (Exception e) {
            Log.e("ResponseProcessor", Localization.q(R.string.taobao_app_1010_1_18272) + e.toString());
            d(new bis(), map, y9Var);
            return null;
        }
    }

    public static bis c(Map<String, String> map, y9 y9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bis) ipChange.ipc$dispatch("700499c7", new Object[]{map, y9Var});
        }
        if (map == null || map.isEmpty()) {
            return new bis();
        }
        String str = map.get("templateId");
        if (TextUtils.isEmpty(str) || TemplateId.COMMON.equals(str)) {
            String str2 = map.get("sourceType");
            if ("shop".equals(str2)) {
                str = TemplateId.SHOP.toString();
            } else if ("item".equals(str2)) {
                str = TemplateId.ITEM.toString();
            }
            map.put("templateId", str);
        }
        String str3 = map.get("popType");
        if (!TextUtils.isEmpty(str3)) {
            TemplateId templateId = TemplateId.WEEX;
            if (str3.equalsIgnoreCase(templateId.name()) && !TextUtils.isEmpty(map.get("popUrl"))) {
                pis pisVar = new pis();
                a(pisVar, map, y9Var);
                pisVar.b = templateId.toString();
                pisVar.z = pisVar.j.remove("popUrl");
                return pisVar;
            }
        }
        if (TemplateId.ITEM.equals(str)) {
            ihs ihsVar = new ihs();
            a(ihsVar, map, y9Var);
            String remove = ihsVar.j.remove("price");
            try {
                if (TextUtils.isEmpty(remove)) {
                    remove = (String) ((Map) JSON.parse(ihsVar.j.get(MspGlobalDefine.EXTENDINFO))).remove("price");
                }
            } catch (Exception unused) {
            }
            ihsVar.z = remove;
            return ihsVar;
        } else if (TemplateId.SHOP.equals(str)) {
            iis iisVar = new iis();
            a(iisVar, map, y9Var);
            iisVar.z = iisVar.j.remove("rankPic");
            iisVar.j.remove("rankNum");
            return iisVar;
        } else if (TemplateId.COUPON.equals(str)) {
            ygs ygsVar = new ygs();
            d(ygsVar, map, y9Var);
            ygsVar.j.remove("content");
            ygsVar.j.remove("title");
            ygsVar.j.remove(MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE);
            ygsVar.j.remove("prefixPrice");
            ygsVar.j.remove("price");
            ygsVar.j.remove("suffixPrice");
            ygsVar.j.remove("description");
            ygsVar.j.remove("leftButtonText");
            ygsVar.j.remove("rightButtonText");
            ygsVar.j.remove("picUrl");
            return ygsVar;
        } else if (TemplateId.COMMON.equals(str)) {
            tgs tgsVar = new tgs();
            a(tgsVar, map, y9Var);
            return tgsVar;
        } else {
            if (!TextUtils.isEmpty(str) && j8t.b() != null && j8t.b().containsKey(str)) {
                try {
                    Class<?> cls = j8t.b().get(str);
                    if (cls.isAssignableFrom(bis.class)) {
                        return (bis) b(cls, map, y9Var);
                    }
                } catch (Exception e) {
                    Log.e("ResponseProcessor", Localization.q(R.string.taobao_app_1010_1_18272) + e.toString());
                }
            }
            bis bisVar = new bis();
            d(bisVar, map, y9Var);
            return bisVar;
        }
    }

    public static void d(bis bisVar, Map<String, String> map, y9 y9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4d1db72", new Object[]{bisVar, map, y9Var});
            return;
        }
        bisVar.d = y9Var.f31916a;
        bisVar.h = y9Var.b;
        HashMap hashMap = new HashMap();
        bisVar.j = hashMap;
        hashMap.putAll(map);
        bisVar.f16414a = bisVar.j.remove("bizId");
        bisVar.b = bisVar.j.remove("templateId");
        bisVar.c = bisVar.j.remove("url");
        bisVar.f = bisVar.j.remove("isTaoFriend");
        bisVar.g = bisVar.j.remove("taoFriendIcon");
        try {
            String remove = bisVar.j.remove("bizData");
            if (!TextUtils.isEmpty(remove)) {
                bisVar.k = (Map) JSON.parseObject(remove, Map.class);
            }
        } catch (Exception unused) {
        }
    }
}
