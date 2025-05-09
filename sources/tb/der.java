package tb;

import android.taobao.windvane.export.cache.memory.MemoryResWarmupManager;
import android.taobao.windvane.export.cache.memory.model.ResourceItemModel;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class der {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final der INSTANCE = new der();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements MemoryResWarmupManager.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.taobao.windvane.export.cache.memory.MemoryResWarmupManager.d
        public void a(boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c845825", new Object[]{this, new Boolean(z), str});
            } else if (z) {
                AppMonitor.Alarm.commitSuccess("TBHDIdleApplication", "ResWarmup", "success");
            } else {
                AppMonitor.Alarm.commitFail("TBHDIdleApplication", "ResWarmup", "", String.valueOf(str));
            }
        }
    }

    static {
        t2o.a(1031798813);
    }

    public final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89de0e00", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                ResourceItemModel resourceItemModel = new ResourceItemModel();
                resourceItemModel.src = entry.getKey();
                resourceItemModel.mode = "only_if_cached";
                Object value = entry.getValue();
                String str = null;
                JSONObject jSONObject2 = value instanceof JSONObject ? (JSONObject) value : null;
                if (jSONObject2 != null) {
                    str = jSONObject2.getString("type");
                }
                if (str != null) {
                    resourceItemModel.type = str;
                    MemoryResWarmupManager.j(resourceItemModel, new a());
                }
            }
        }
    }

    public final void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13dab2aa", new Object[]{this, jSONObject});
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                Object value = entry.getValue();
                Boolean bool = null;
                JSONObject jSONObject2 = value instanceof JSONObject ? (JSONObject) value : null;
                if (jSONObject2 != null) {
                    Object obj = jSONObject2.get("force");
                    if (obj instanceof Boolean) {
                        bool = (Boolean) obj;
                    }
                    if (ckf.b(bool, Boolean.TRUE)) {
                        fer ferVar = fer.INSTANCE;
                        String key = entry.getKey();
                        ckf.f(key, "it.key");
                        Integer integer = jSONObject2.getInteger("type");
                        ckf.f(integer, "config.getInteger(\"type\")");
                        ferVar.b(key, integer.intValue(), jSONObject2.getString("referer"));
                    } else {
                        String string = jSONObject2.getString("package");
                        ckf.f(string, "config.getString(\"package\")");
                        arrayList.add(string);
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            yox.n(arrayList);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6edd00c", new Object[]{this});
            return;
        }
        jbl jblVar = jbl.INSTANCE;
        if (!jblVar.a()) {
            for (JSONObject jSONObject : jblVar.c()) {
                String string = jSONObject.getString("component");
                String string2 = jSONObject.getString("module");
                o0 o0Var = o0.INSTANCE;
                ckf.f(string, "component");
                ckf.f(string2, "module");
                for (Map.Entry<String, Object> entry : o0Var.a(string, string2).entrySet()) {
                    String key = entry.getKey();
                    JSONObject jSONObject2 = null;
                    if (ckf.b(key, "z_prefetch_list")) {
                        der derVar = INSTANCE;
                        Object value = entry.getValue();
                        if (value instanceof JSONObject) {
                            jSONObject2 = (JSONObject) value;
                        }
                        derVar.b(jSONObject2);
                    } else if (ckf.b(key, "preWarm")) {
                        der derVar2 = INSTANCE;
                        Object value2 = entry.getValue();
                        if (value2 instanceof JSONObject) {
                            jSONObject2 = (JSONObject) value2;
                        }
                        derVar2.a(jSONObject2);
                    }
                }
            }
        }
    }
}
