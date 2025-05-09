package com.alibaba.security.ccrc.service.build;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import tb.obk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class tb implements obk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ vb f2623a;

    public tb(vb vbVar) {
        this.f2623a = vbVar;
    }

    @Override // tb.obk
    public void onConfigUpdate(String str, Map<String, String> map) {
        Map<String, String> configs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
        } else if (vb.c.equals(str)) {
            vb.a(this.f2623a);
        } else {
            String str2 = map.get("configVersion");
            if (vb.b.equals(str)) {
                vb vbVar = this.f2623a;
                if (!TextUtils.equals(str2, (String) vb.$ipChange.a(wb.f2633a, "configVersion", "")) && (configs = OrangeConfig.getInstance().getConfigs(vb.b)) != null && !configs.isEmpty()) {
                    for (Map.Entry<String, String> entry : configs.entrySet()) {
                        vb vbVar2 = this.f2623a;
                        vb.$ipChange.b(wb.f2633a, entry.getKey(), entry.getValue());
                    }
                    vb vbVar3 = this.f2623a;
                    vb.$ipChange.b(wb.f2633a, "configVersion", str2);
                }
            }
        }
    }
}
