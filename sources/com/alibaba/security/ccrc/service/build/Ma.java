package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Ma {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Na a(C1199x xVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Na) ipChange.ipc$dispatch("7a3491ae", new Object[]{xVar, map});
        }
        if (!a(map)) {
            return new Oa();
        }
        if ("V1".equalsIgnoreCase((String) map.get("protocolVersion"))) {
            return new Pa(xVar);
        }
        return null;
    }

    public static boolean b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41e3e880", new Object[]{map})).booleanValue();
        }
        return "V1".equalsIgnoreCase((String) map.get("protocolVersion"));
    }

    public static boolean a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{map})).booleanValue() : map != null && map.containsKey("protocolVersion");
    }
}
