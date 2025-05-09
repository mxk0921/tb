package com.taobao.message.lab.comfrm.core;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class Event implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, Object> context;
    public Object data;
    public String name;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class Build {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Event event;

        static {
            t2o.a(537919549);
        }

        public Build(String str) {
            this.event = new Event(str);
        }

        public Event build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Event) ipChange.ipc$dispatch("c9183014", new Object[]{this});
            }
            return this.event;
        }

        public Build context(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Build) ipChange.ipc$dispatch("7086f890", new Object[]{this, map});
            }
            this.event.context = map;
            return this;
        }

        public Build data(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Build) ipChange.ipc$dispatch("785af612", new Object[]{this, obj});
            }
            this.event.data = obj;
            return this;
        }
    }

    static {
        t2o.a(537919548);
    }

    public Event() {
    }

    public Map<String, Object> getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7ab803b5", new Object[]{this});
        }
        if (this.context == null) {
            this.context = new HashMap();
        }
        return this.context;
    }

    public Object getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4ca84d6b", new Object[]{this});
        }
        return this.data;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.name;
    }

    public JSONObject toJSON() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b0ef9c0a", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) this.name);
        jSONObject.put("data", this.data);
        jSONObject.put("context", (Object) this.context);
        return jSONObject;
    }

    public Event(String str) {
        this.name = str;
    }
}
