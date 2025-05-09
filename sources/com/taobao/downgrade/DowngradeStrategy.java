package com.taobao.downgrade;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DowngradeStrategy implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject param;
    private String tacticsFunction;
    private String tacticsPerformance;
    private Map<String, String> traceMap;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f10389a;
        public String b;
        public JSONObject c;
        public Map<String, String> d;

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f4f8b3cc", new Object[]{bVar});
            }
            return bVar.f10389a;
        }

        public static /* synthetic */ String b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("774368ab", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ JSONObject c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("f6a50f6", new Object[]{bVar});
            }
            return bVar.c;
        }

        public static /* synthetic */ Map d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("2758310c", new Object[]{bVar});
            }
            return bVar.d;
        }

        public DowngradeStrategy e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DowngradeStrategy) ipChange.ipc$dispatch("67ccf047", new Object[]{this});
            }
            return new DowngradeStrategy(this);
        }

        public b f(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f6ef07d7", new Object[]{this, jSONObject});
            }
            this.c = jSONObject;
            return this;
        }

        public b g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c3230c2f", new Object[]{this, str});
            }
            this.f10389a = str;
            return this;
        }

        public b h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("82db29ad", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public b i(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d812426c", new Object[]{this, map});
            }
            this.d = map;
            return this;
        }
    }

    public JSONObject getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ed69b2fe", new Object[]{this});
        }
        return this.param;
    }

    public String getTacticsFunction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d85b8a1c", new Object[]{this});
        }
        return this.tacticsFunction;
    }

    public String getTacticsPerformance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89db5eee", new Object[]{this});
        }
        return this.tacticsPerformance;
    }

    public Map<String, String> getTraceMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8f167c89", new Object[]{this});
        }
        return this.traceMap;
    }

    public void setParam(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e6d4cde", new Object[]{this, jSONObject});
        } else {
            this.param = jSONObject;
        }
    }

    public void setTacticsFunction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed3d8e42", new Object[]{this, str});
        } else {
            this.tacticsFunction = str;
        }
    }

    public void setTacticsPerformance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15623a48", new Object[]{this, str});
        } else {
            this.tacticsPerformance = str;
        }
    }

    public void setTraceMap(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5392c725", new Object[]{this, map});
        } else {
            this.traceMap = map;
        }
    }

    private DowngradeStrategy() {
    }

    private DowngradeStrategy(b bVar) {
        this.tacticsFunction = b.a(bVar);
        this.tacticsPerformance = b.b(bVar);
        this.param = b.c(bVar);
        this.traceMap = b.d(bVar);
    }
}
