package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import tb.obk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ub implements obk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ vb f2627a;

    public ub(vb vbVar) {
        this.f2627a = vbVar;
    }

    @Override // tb.obk
    public void onConfigUpdate(String str, Map<String, String> map) {
        Map<String, String> configs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
        } else if (vb.C.contains(str) && (configs = OrangeConfig.getInstance().getConfigs(str)) != null && !configs.isEmpty()) {
            for (Map.Entry<String, String> entry : configs.entrySet()) {
                vb vbVar = this.f2627a;
                wb wbVar = vb.$ipChange;
                wbVar.b(rb.b + str, entry.getKey(), entry.getValue());
            }
        }
    }
}
