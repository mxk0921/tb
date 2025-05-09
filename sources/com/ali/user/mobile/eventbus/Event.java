package com.ali.user.mobile.eventbus;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Event {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String name;
    public Map<String, Object> params;

    static {
        t2o.a(68157478);
    }

    public static Event newEvent(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Event) ipChange.ipc$dispatch("50c81932", new Object[]{str, map});
        }
        Event event = new Event();
        event.name = str;
        event.params = map;
        return event;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Event event = (Event) obj;
        String str = this.name;
        if (str != null) {
            return str.equals(event.name);
        }
        if (event.name == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.name;
        if (str != null) {
            i = str.hashCode();
        }
        return 31 + i;
    }
}
