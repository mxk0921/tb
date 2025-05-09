package com.taobao.monitor.impl.data.savemode;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.e81;
import tb.eti;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SaveModeMonitor implements eti.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public SaveModeMonitor() {
        eti.a(92, this);
        eti.a(93, this);
    }

    @Override // tb.eti.a
    public void onEvent(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f16fb524", new Object[]{this, new Integer(i), map});
        } else if (i == 92) {
            e81.b().c("saveMode", true);
        } else if (i == 93) {
            e81.b().c("saveMode", false);
        }
    }
}
