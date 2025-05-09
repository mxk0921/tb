package com.taobao.android.diagnose.func;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.cio;
import tb.cl7;
import tb.idh;
import tb.t2o;
import tb.uk7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ToolConfigManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, ToolConfigInfo> f7245a = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class ToolConfigData {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String className;
        @JSONField(serialize = false)
        public String config;
        public String name;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a extends TypeReference<Map<String, String>> {
            public a(ToolConfigData toolConfigData) {
            }
        }

        static {
            t2o.a(615514165);
        }

        @JSONField(serialize = false)
        public Map<String, String> getConfigMap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("7d126180", new Object[]{this});
            }
            try {
                return (Map) JSON.parseObject(this.config, new a(this), new Feature[0]);
            } catch (Exception e) {
                idh.c("ToolConfigManager", "getConfigMap error", e);
                return null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class ToolConfigInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public List<ToolConfigData> configData;
        public String id;
        public long ver;

        static {
            t2o.a(615514167);
        }

        @JSONField(serialize = false)
        public String getVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
            }
            String str = this.id;
            long j = this.ver;
            return str + "_" + j;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends TypeReference<List<ToolConfigData>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b extends TypeReference<ConcurrentHashMap<String, ToolConfigInfo>> {
    }

    static {
        t2o.a(615514162);
    }

    public static void a(ToolConfigInfo toolConfigInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0d7d9c3", new Object[]{toolConfigInfo});
            return;
        }
        ToolConfigInfo toolConfigInfo2 = f7245a.get(toolConfigInfo.id);
        if (toolConfigInfo2 == null || toolConfigInfo2.ver != toolConfigInfo.ver) {
            f7245a.put(toolConfigInfo.id, toolConfigInfo);
            i();
        }
    }

    public static void b(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bba2942", new Object[]{str, new Long(j), str2});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                idh.a("ToolConfigManager", String.format("addToolConfig: %s_%d", str, Long.valueOf(j)));
                List<ToolConfigData> list = (List) JSON.parseObject(str2, new a(), new Feature[0]);
                if (list == null) {
                    idh.e("ToolConfigManager", "Failed to parse configData");
                    return;
                }
                ToolConfigInfo toolConfigInfo = new ToolConfigInfo();
                toolConfigInfo.id = str;
                toolConfigInfo.ver = j;
                toolConfigInfo.configData = list;
                c(true, toolConfigInfo);
                a(toolConfigInfo);
            }
        } catch (Exception e) {
            idh.c("ToolConfigManager", "Failed to add tool config.", e);
        }
    }

    public static void c(boolean z, ToolConfigInfo toolConfigInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff450a50", new Object[]{new Boolean(z), toolConfigInfo});
            return;
        }
        try {
            for (ToolConfigData toolConfigData : toolConfigInfo.configData) {
                f(z, toolConfigData, toolConfigInfo.getVersion());
            }
        } catch (Exception e) {
            idh.c("ToolConfigManager", "Failed to handleToolConfig.", e);
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else {
            e();
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a886e1d", new Object[0]);
            return;
        }
        try {
            String h = cl7.h(new File(uk7.i().k(), "tool.config"));
            if (!TextUtils.isEmpty(h)) {
                f7245a = (Map) JSON.parseObject(h, new b(), new Feature[0]);
            }
        } catch (Exception e) {
            idh.c("ToolConfigManager", "Failed to save config info", e);
        }
    }

    public static ToolConfigInfo g(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ToolConfigInfo) ipChange.ipc$dispatch("c8a6f46a", new Object[]{str, new Long(j)});
        }
        ToolConfigInfo toolConfigInfo = f7245a.get(str);
        if (toolConfigInfo == null || toolConfigInfo.ver != j) {
            return null;
        }
        f7245a.remove(str);
        i();
        return toolConfigInfo;
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0e1674", new Object[0]);
            return;
        }
        try {
            cl7.i(new File(uk7.i().k(), "tool.config"), JSON.toJSONString(f7245a));
            idh.a("ToolConfigManager", "Save to tool config!");
        } catch (Exception e) {
            idh.c("ToolConfigManager", "Failed to save config info", e);
        }
    }

    public static void j(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c4cddb0", new Object[]{str, str2, new Long(j)});
        } else if ("scene_change_config".equals(str) && com.taobao.android.diagnose.scene.a.i("scene_change_config")) {
            h(str2, j);
        }
    }

    public static void k(cio cioVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97e1d244", new Object[]{cioVar});
        } else if (cioVar != null) {
            j(cioVar.g(), cioVar.e(), cioVar.h());
        }
    }

    public static void h(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc5b5f5", new Object[]{str, new Long(j)});
            return;
        }
        ToolConfigInfo g = g(str, j);
        if (g == null) {
            idh.e("ToolConfigManager", String.format("Can't find the config info of %s_%d", str, Long.valueOf(j)));
            return;
        }
        idh.a("ToolConfigManager", "removeToolConfig: " + g.getVersion());
        c(false, g);
    }

    public static void f(boolean z, ToolConfigData toolConfigData, String str) {
        try {
            if (TextUtils.isEmpty(toolConfigData.className)) {
                idh.a("ToolConfigManager", "The class name is null");
                return;
            }
            Method declaredMethod = Class.forName(toolConfigData.className).getDeclaredMethod("onDiagnoseConfigUpdate", String.class, String.class, Map.class);
            if (declaredMethod != null) {
                if (z) {
                    declaredMethod.invoke(null, toolConfigData.name, str, toolConfigData.getConfigMap());
                } else {
                    declaredMethod.invoke(null, toolConfigData.name, str, null);
                }
                idh.a("ToolConfigManager", "Notify the class: " + toolConfigData.className);
            }
        } catch (Exception e) {
            idh.c("ToolConfigManager", "Failed to notify tool config.", e);
        }
    }
}
