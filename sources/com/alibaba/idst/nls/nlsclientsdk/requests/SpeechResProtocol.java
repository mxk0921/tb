package com.alibaba.idst.nls.nlsclientsdk.requests;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SpeechResProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, Object> header = new HashMap();
    public Map<String, Object> payload = new HashMap();

    static {
        t2o.a(199229447);
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return (String) this.header.get("name");
    }

    public String getNameSpace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e990d94", new Object[]{this});
        }
        return (String) this.header.get("namespace");
    }

    public int getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue();
        }
        return ((Integer) this.header.get("status")).intValue();
    }

    public String getStatusText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15bcd9e4", new Object[]{this});
        }
        return (String) this.header.get(Constant.PROP_STATUS_TEXT);
    }
}
