package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.wukong.plugin.BaseWukongContentRiskPlugin;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, BaseWukongContentRiskPlugin> f2545a = new HashMap();

    public void a(BaseWukongContentRiskPlugin baseWukongContentRiskPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f6fe09e", new Object[]{this, baseWukongContentRiskPlugin});
        } else if (!this.f2545a.containsKey(baseWukongContentRiskPlugin.name())) {
            this.f2545a.put(baseWukongContentRiskPlugin.name(), baseWukongContentRiskPlugin);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (BaseWukongContentRiskPlugin baseWukongContentRiskPlugin : this.f2545a.values()) {
            baseWukongContentRiskPlugin.deactivate();
        }
    }

    public boolean a(String str, CcrcService.Config config, r rVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b380fda9", new Object[]{this, str, config, rVar})).booleanValue();
        }
        for (BaseWukongContentRiskPlugin baseWukongContentRiskPlugin : this.f2545a.values()) {
            if (!baseWukongContentRiskPlugin.activate(str, config, rVar)) {
                z = false;
            }
        }
        return z;
    }

    public void a(List<? extends BaseWukongContentRiskPlugin> list, C1195v vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f825f7d", new Object[]{this, list, vVar});
            return;
        }
        for (BaseWukongContentRiskPlugin baseWukongContentRiskPlugin : list) {
            baseWukongContentRiskPlugin.setAlgoWatcher(vVar);
            a(baseWukongContentRiskPlugin);
        }
    }

    public Collection<BaseWukongContentRiskPlugin> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("66d215f", new Object[]{this}) : this.f2545a.values();
    }
}
