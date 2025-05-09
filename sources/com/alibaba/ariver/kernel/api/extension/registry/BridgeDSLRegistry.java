package com.alibaba.ariver.kernel.api.extension.registry;

import com.alibaba.ariver.kernel.api.extension.bridge.BridgeDSL;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class BridgeDSLRegistry {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<BridgeDSL> f2433a;

    public List<BridgeDSL> getBridgeDSLs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d0258f4b", new Object[]{this});
        }
        List<BridgeDSL> list = this.f2433a;
        if (list != null) {
            return list;
        }
        return new ArrayList();
    }

    public void register(List<BridgeDSL> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("536da29b", new Object[]{this, list});
            return;
        }
        if (this.f2433a == null) {
            this.f2433a = new ArrayList();
        }
        this.f2433a.addAll(list);
    }

    public void unRegister(BridgeDSL bridgeDSL) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("758f07b0", new Object[]{this, bridgeDSL});
            return;
        }
        List<BridgeDSL> list = this.f2433a;
        if (list != null) {
            ((ArrayList) list).remove(bridgeDSL);
        }
    }
}
