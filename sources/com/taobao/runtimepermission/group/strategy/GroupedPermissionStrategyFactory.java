package com.taobao.runtimepermission.group.strategy;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import tb.n47;
import tb.p10;
import tb.p78;
import tb.t4p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class GroupedPermissionStrategyFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static p10 a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p10) ipChange.ipc$dispatch("ef9e1285", new Object[]{str});
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1611296843:
                if (str.equals("LOCATION")) {
                    c = 0;
                    break;
                }
                break;
            case 73234372:
                if (str.equals("MEDIA")) {
                    c = 1;
                    break;
                }
                break;
            case 215175251:
                if (str.equals("CONTACTS")) {
                    c = 2;
                    break;
                }
                break;
            case 604302142:
                if (str.equals("CALENDAR")) {
                    c = 3;
                    break;
                }
                break;
            case 1856013610:
                if (str.equals("MICROPHONE")) {
                    c = 4;
                    break;
                }
                break;
            case 1980544805:
                if (str.equals("CAMERA")) {
                    c = 5;
                    break;
                }
                break;
            case 2137382963:
                if (str.equals("PASTEBOARD")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new n47(Collections.unmodifiableMap(new HashMap<String, String>(2) { // from class: com.taobao.runtimepermission.group.strategy.GroupedPermissionStrategyFactory.5
                    {
                        put("COARSE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
                        put("FINE_LOCATION", p78.ACCESS_FINE_LOCATION);
                    }
                }), false);
            case 1:
                return new MediaPermissionStrategy();
            case 2:
                return new n47(Collections.unmodifiableMap(new HashMap<String, String>(2) { // from class: com.taobao.runtimepermission.group.strategy.GroupedPermissionStrategyFactory.2
                    {
                        put("READ_CONTACTS", "android.permission.READ_CONTACTS");
                        put("WRITE_CONTACTS", "android.permission.WRITE_CONTACTS");
                    }
                }), false);
            case 3:
                return new n47(Collections.unmodifiableMap(new HashMap<String, String>(2) { // from class: com.taobao.runtimepermission.group.strategy.GroupedPermissionStrategyFactory.1
                    {
                        put("READ_CALENDAR", "android.permission.READ_CALENDAR");
                        put("WRITE_CALENDAR", "android.permission.WRITE_CALENDAR");
                    }
                }), false);
            case 4:
                return new n47(Collections.unmodifiableMap(new HashMap<String, String>(1) { // from class: com.taobao.runtimepermission.group.strategy.GroupedPermissionStrategyFactory.3
                    {
                        put("RECORD_AUDIO", "android.permission.RECORD_AUDIO");
                    }
                }), false);
            case 5:
                return new n47(Collections.unmodifiableMap(new HashMap<String, String>(1) { // from class: com.taobao.runtimepermission.group.strategy.GroupedPermissionStrategyFactory.4
                    {
                        put("TAKE_CAMERA", t4p.CAMERA);
                    }
                }), false);
            case 6:
                return new n47(null, true);
            default:
                return new n47(null, false);
        }
    }
}
