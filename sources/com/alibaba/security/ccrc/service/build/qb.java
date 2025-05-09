package com.alibaba.security.ccrc.service.build;

import android.text.TextUtils;
import com.alibaba.security.ccrc.common.http.model.VersionInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import tb.obk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qb implements obk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ rb f2617a;

    public qb(rb rbVar) {
        this.f2617a = rbVar;
    }

    @Override // tb.obk
    public void onConfigUpdate(String str, Map<String, String> map) {
        Map<String, String> configs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            return;
        }
        rb rbVar = this.f2617a;
        if (!TextUtils.isEmpty(rb.$ipChange)) {
            rb rbVar2 = this.f2617a;
            if (!(!rb.$ipChange.equals(str) || rb.b(this.f2617a) == null || (configs = OrangeConfig.getInstance().getConfigs(str)) == null || configs.isEmpty())) {
                for (Map.Entry<String, String> entry : configs.entrySet()) {
                    wb c = rb.c(this.f2617a);
                    rb rbVar3 = this.f2617a;
                    String str2 = rb.$ipChange;
                    c.b(rb.$ipChange, entry.getKey(), entry.getValue());
                }
                VersionInfo versionInfo = new VersionInfo();
                versionInfo.configMd5 = configs.get(VersionInfo.ORANGE_SP_KEY_CONFIG_MD5);
                rb.b(this.f2617a).a(versionInfo);
            }
        }
    }
}
