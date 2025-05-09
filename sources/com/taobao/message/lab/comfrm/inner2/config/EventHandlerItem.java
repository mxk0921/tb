package com.taobao.message.lab.comfrm.inner2.config;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class EventHandlerItem {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, String> data;
    public boolean enable;
    public int immediate;
    public Map<String, List<EventHandlerItem>> next;
    public String runtimeType;
    public String type;

    static {
        t2o.a(537919678);
    }

    public EventHandlerItem() {
        this.enable = true;
    }

    public EventHandlerItem copy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventHandlerItem) ipChange.ipc$dispatch("6f61497a", new Object[]{this});
        }
        return new EventHandlerItem(this);
    }

    public EventHandlerItem(EventHandlerItem eventHandlerItem) {
        this.enable = true;
        this.type = eventHandlerItem.type;
        this.runtimeType = eventHandlerItem.runtimeType;
        this.enable = eventHandlerItem.enable;
        this.immediate = eventHandlerItem.immediate;
        HashMap hashMap = new HashMap();
        this.data = hashMap;
        Map<String, String> map = eventHandlerItem.data;
        if (map != null) {
            hashMap.putAll(map);
        }
        this.next = new HashMap();
        Map<String, List<EventHandlerItem>> map2 = eventHandlerItem.next;
        if (map2 != null) {
            for (Map.Entry<String, List<EventHandlerItem>> entry : map2.entrySet()) {
                ArrayList arrayList = new ArrayList();
                for (EventHandlerItem eventHandlerItem2 : entry.getValue()) {
                    arrayList.add(new EventHandlerItem(eventHandlerItem2));
                }
                this.next.put(entry.getKey(), arrayList);
            }
        }
    }
}
