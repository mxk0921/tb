package com.ut.userbehavior.module;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.security.wukong.pipe.RiskDataPipeManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.bmv;
import tb.j5v;
import tb.l5v;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class Page implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "bc")
    private ArrayList<BehaviorRecord> behaviorChain;
    @JSONField(name = "c")
    private ArrayList<Component> componentList;
    @JSONField(serialize = false)
    private Map<String, Component> componentMap;
    @JSONField(name = RiskDataPipeManager.PIPE_RESULT_ERROR_CODE_KEY)
    private ArrayList<EventChain> eventChain;
    @JSONField(name = bmv.MSGTYPE_INTERVAL)
    private Map<String, String> info;
    @JSONField(name = at.k)
    private String key;
    @JSONField(serialize = false)
    private ArrayList<Component> lastAutoEndComponentsArr = null;
    @JSONField(name = "n")
    private String name;

    static {
        t2o.a(964689931);
    }

    public Page(String str, String str2) {
        this.info = null;
        this.behaviorChain = null;
        this.eventChain = null;
        this.componentList = null;
        this.componentMap = null;
        this.key = str;
        this.name = str2;
        this.info = new HashMap();
        this.behaviorChain = new ArrayList<>();
        this.eventChain = new ArrayList<>();
        this.componentList = new ArrayList<>();
        this.componentMap = new HashMap();
    }

    public void addBehaviorChain(BehaviorRecord behaviorRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b113be56", new Object[]{this, behaviorRecord});
        } else if (behaviorRecord != null) {
            this.behaviorChain.add(behaviorRecord);
        }
    }

    public void addEventChain(EventChain eventChain) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc2475b8", new Object[]{this, eventChain});
        } else if (eventChain != null) {
            this.eventChain.add(eventChain);
        }
    }

    public synchronized void autoBeginComponents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc414b77", new Object[]{this});
            return;
        }
        ArrayList<Component> arrayList = this.lastAutoEndComponentsArr;
        if (arrayList != null) {
            Iterator<Component> it = arrayList.iterator();
            while (it.hasNext()) {
                Component next = it.next();
                if (next != null) {
                    beginComponentInPage(next.getKey(), null);
                }
                it.remove();
            }
        }
    }

    public synchronized void autoEndComponents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea7a5c69", new Object[]{this});
            return;
        }
        Iterator<Component> it = this.componentList.iterator();
        while (it.hasNext()) {
            Component next = it.next();
            if (next != null && !"d".equalsIgnoreCase(next.getLastStatus())) {
                if (this.lastAutoEndComponentsArr == null) {
                    this.lastAutoEndComponentsArr = new ArrayList<>();
                }
                this.lastAutoEndComponentsArr.add(next);
                endComponentInPage(next.getKey());
            }
        }
    }

    public void beginComponentInPage(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe93f2e3", new Object[]{this, str, str2});
            return;
        }
        Component component = this.componentMap.get(str);
        if (component == null) {
            Component component2 = new Component(str, str2);
            component2.addBehaviorChain(new BehaviorRecord(1));
            this.componentList.add(component2);
            this.componentMap.put(component2.getKey(), component2);
        } else if (component.getLastStatus().equalsIgnoreCase("a")) {
            j5v.e("beginComponentInPage", "beginComponent repeat.key", str);
        } else {
            if (l5v.c(str2)) {
                component.setName(str2);
            }
            component.addBehaviorChain(new BehaviorRecord(1));
        }
    }

    public void endComponentInPage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a53b9467", new Object[]{this, str});
        } else if (l5v.b(str) || this.componentMap.isEmpty() || !this.componentMap.containsKey(str)) {
            j5v.e("checkIfValid in endComponent", "beginComponent should be used first,key", str);
        } else {
            Component component = this.componentMap.get(str);
            if (component != null && component.getLastStatus().equalsIgnoreCase("d")) {
                j5v.e("checkIfValid in endComponent", "endComponent repeat.key", str);
            } else if (component != null) {
                component.addBehaviorChain(new BehaviorRecord(2));
            }
        }
    }

    public ArrayList<BehaviorRecord> getBehaviorChain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("e66b7ba", new Object[]{this});
        }
        return this.behaviorChain;
    }

    public ArrayList<Component> getComponentList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("2f751766", new Object[]{this});
        }
        return this.componentList;
    }

    public ArrayList<EventChain> getEventChain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("602af41e", new Object[]{this});
        }
        return this.eventChain;
    }

    public Map<String, String> getInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2a42eaa0", new Object[]{this});
        }
        return this.info;
    }

    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return this.key;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.name;
    }

    public void sendEventInPage(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f531649a", new Object[]{this, str, str2, str3, map});
        } else if (!l5v.b(str)) {
            addEventChain(new EventChain(str, str2, str3, map));
        }
    }

    public void setInfo(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c0bf5ee", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            this.info.putAll(map);
        }
    }

    public void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else if (l5v.c(str)) {
            this.name = str;
        }
    }

    public void updateComponentInPage(String str, Map<String, String> map) {
        Component component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292412c", new Object[]{this, str, map});
        } else if (!l5v.b(str) && map != null && !map.isEmpty() && !this.componentMap.isEmpty() && this.componentMap.containsKey(str) && (component = this.componentMap.get(str)) != null) {
            component.setInfo(map);
        }
    }
}
