package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.wukong.bx.CcrcBHService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
@M(name = {"bhDetect"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class T extends K {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(T t, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/T");
    }

    @Override // com.alibaba.security.ccrc.service.build.K
    public boolean a(Context context, String str, String str2, L l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ddda4f0", new Object[]{this, context, str, str2, l})).booleanValue();
        }
        Map<String, Object> map = JsonUtils.toMap(str2);
        String str3 = (String) map.get("ccrcCode");
        if (TextUtils.isEmpty(str3)) {
            K.a(l, "参数异常", null);
            return true;
        }
        CcrcBHService bHService = CcrcBHService.getBHService(str3);
        Map map2 = (Map) map.get("inputDict");
        if (map2 == null || map2.isEmpty() || bHService == null) {
            K.a(l, "参数异常", null);
            return true;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map2.entrySet()) {
            hashMap.put(entry.getKey(), JsonUtils.toJSONString(entry.getValue()));
        }
        bHService.detect(hashMap);
        K.a(l, null);
        return true;
    }
}
