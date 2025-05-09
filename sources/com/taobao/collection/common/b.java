package com.taobao.collection.common;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(789577784);
    }

    public static String a(Code code, SwitchOption switchOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ab174b4", new Object[]{code, switchOption});
        }
        StringBuffer stringBuffer = new StringBuffer(50);
        if (code == null) {
            stringBuffer.append("c=[null]");
        } else {
            stringBuffer.append("c=[");
            stringBuffer.append(code.getModuleToken() + ":" + code.getExt());
            stringBuffer.append("]");
        }
        stringBuffer.append(";");
        if (switchOption == null) {
            stringBuffer.append("so=[null]");
        } else {
            stringBuffer.append("so=[");
            stringBuffer.append(switchOption.getType() + ":" + switchOption.getInterval() + ":" + switchOption.getIsOpen());
            stringBuffer.append("]");
        }
        return stringBuffer.toString();
    }
}
