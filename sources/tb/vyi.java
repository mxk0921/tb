package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.behavior.module.Module;
import com.ut.mini.behavior.module.ModulesConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vyi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UT_TAG = "ut_tag";

    /* renamed from: a  reason: collision with root package name */
    public final Object f30342a;
    public ModulesConfig b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final vyi f30343a = new vyi();

        static {
            t2o.a(962593259);
        }

        public static /* synthetic */ vyi access$100() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vyi) ipChange.ipc$dispatch("946500a0", new Object[0]);
            }
            return f30343a;
        }
    }

    static {
        t2o.a(962593257);
    }

    public static vyi getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vyi) ipChange.ipc$dispatch("8af2d906", new Object[0]);
        }
        return b.access$100();
    }

    public void init(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dc73a1", new Object[]{this, str});
        } else if (hsq.f(str)) {
            this.b = null;
        } else {
            try {
                this.b = (ModulesConfig) JSON.parseObject(str, ModulesConfig.class);
            } catch (Exception e) {
                nhh.h("ModulesMgr", e, new Object[0]);
            }
        }
    }

    public Map<String, String> makeTag(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8b409487", new Object[]{this, map});
        }
        synchronized (this.f30342a) {
            try {
                ModulesConfig modulesConfig = this.b;
                if (modulesConfig == null) {
                    return null;
                }
                List<Module> list = modulesConfig.moduleList;
                if (list != null) {
                    ArrayList arrayList = null;
                    for (Module module : list) {
                        if (lq8.getInstance().evaluateData(module.data, map)) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(module.name);
                        }
                    }
                    if (arrayList != null) {
                        String str = "";
                        try {
                            str = JSON.toJSONString(arrayList);
                        } catch (Exception unused) {
                        }
                        if (!str.isEmpty()) {
                            HashMap hashMap = new HashMap();
                            hashMap.put(UT_TAG, str);
                            return hashMap;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public vyi() {
        this.f30342a = new Object();
    }

    public void init(ModulesConfig modulesConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1949a4fd", new Object[]{this, modulesConfig});
            return;
        }
        synchronized (this.f30342a) {
            this.b = modulesConfig;
        }
    }
}
