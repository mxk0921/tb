package com.alibaba.security.ccrc.service.build;

import android.text.TextUtils;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.wukong.bx.algo.BxData;
import com.alibaba.security.wukong.bx.workconf.BaseWorkConfHandler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Wa extends BaseWorkConfHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2574a = "add";
    public static final String b = "splice";

    private void a(Map<String, Object> map, BxData.OpConfItemValue opConfItemValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de3b232e", new Object[]{this, map, opConfItemValue});
            return;
        }
        Object obj = map.get(opConfItemValue.name);
        if (obj != null) {
            String str = opConfItemValue.op;
            str.hashCode();
            if (str.equals("add")) {
                String b2 = b(obj);
                if (!TextUtils.isEmpty(b2)) {
                    map.put(opConfItemValue.name, b2);
                }
            } else if (str.equals("splice")) {
                String a2 = a(obj, opConfItemValue.input);
                if (!TextUtils.isEmpty(a2)) {
                    map.put(opConfItemValue.name, a2);
                }
            }
        }
    }

    public static /* synthetic */ Object ipc$super(Wa wa, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/Wa");
    }

    @Override // com.alibaba.security.wukong.bx.workconf.BaseWorkConfHandler
    public Map<String, Object> b(Map<String, Object> map, Map<String, Object> map2, List<BxData.OpConfItemValue> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b3d8fb2f", new Object[]{this, map, map2, list});
        }
        for (BxData.OpConfItemValue opConfItemValue : list) {
            a(map2, opConfItemValue);
        }
        return map2;
    }

    private String b(Object obj) {
        int parseInt;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e17923bb", new Object[]{this, obj});
        }
        try {
            for (Object obj2 : BaseWorkConfHandler.a(obj)) {
                if (obj2 instanceof String) {
                    if (!TextUtils.isEmpty((String) obj2)) {
                        parseInt = Integer.parseInt((String) obj2);
                        i += parseInt;
                    }
                } else if (obj2 instanceof Integer) {
                    parseInt = ((Integer) obj2).intValue();
                    i += parseInt;
                }
            }
            return Integer.toString(i);
        } catch (Throwable unused) {
            return null;
        }
    }

    private String a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93e4ff52", new Object[]{this, obj, str});
        }
        try {
            StringBuilder sb = new StringBuilder();
            List<String> a2 = a(BaseWorkConfHandler.a(obj));
            Map map = (Map) JsonUtils.parseObject(str, (Class<Object>) Map.class);
            String str2 = map == null ? "" : (String) map.get("sep");
            if (!TextUtils.isEmpty(str2) && !a2.isEmpty()) {
                String str3 = null;
                for (String str4 : a2) {
                    if (!TextUtils.isEmpty(str4)) {
                        if (str3 != null) {
                            sb.append(str2);
                        }
                        sb.append(str4);
                        if (str3 == null) {
                            str3 = str4;
                        }
                    }
                }
                return sb.toString();
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private List<String> a(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            arrayList.add(obj.toString());
        }
        return arrayList;
    }
}
