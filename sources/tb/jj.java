package tb;

import com.alibaba.android.aura.AURACoreUMFFrameworkPluginCenter;
import com.alibaba.android.aura.IAURAInputField;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLUGIN_CENTER_CLASS_FULL_NAME_PREFIX = "com.alibaba.android.aura.AURA";
    public static final String PLUGIN_CENTER_CLASS_FULL_NAME_SUFFIX = "PluginCenter";
    public final Map<String, List<String>> g = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Class<? extends gn>> f22022a = new HashMap();
    public final Map<String, AbstractMap.SimpleEntry<String, Class<? extends lbb>>> b = new HashMap();
    public final Map<String, Class<? extends lbb>> c = new HashMap();
    public final Map<Class, List<Class<? extends IAURAInputField>>> d = new HashMap();
    public final Map<String, Class<? extends zab>> e = new HashMap();
    public final List<IAURAPluginCenter> f = new ArrayList();

    static {
        t2o.a(79691799);
    }

    public jj() {
        g();
    }

    public static IAURAPluginCenter b(String str) {
        try {
            return (IAURAPluginCenter) Class.forName(PLUGIN_CENTER_CLASS_FULL_NAME_PREFIX + str + PLUGIN_CENTER_CLASS_FULL_NAME_SUFFIX).newInstance();
        } catch (Exception e) {
            rbb g = ck.g();
            g.f("createPluginCenter#" + e.getMessage(), ck.b.b().l("AURAGlobalPluginCenter").g("auraModuleName", str).a());
            return null;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        ((ArrayList) this.f).clear();
        ((HashMap) this.f22022a).clear();
        ((HashMap) this.b).clear();
        ((HashMap) this.c).clear();
        ((HashMap) this.d).clear();
        ((ArrayList) this.f).clear();
    }

    public Class<? extends zab> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("7d2c7153", new Object[]{this, str});
        }
        return (Class) ((HashMap) this.e).get(str);
    }

    public Class<? extends lbb> d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("c26cb5ad", new Object[]{this, str});
        }
        return (Class) ((HashMap) this.c).get(str);
    }

    public List<String> e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("efd804f4", new Object[]{this, str});
        }
        return (List) ((HashMap) this.g).get(str);
    }

    public Class<? extends gn> f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("5b9a84b7", new Object[]{this, str});
        }
        return (Class) ((HashMap) this.f22022a).get(str);
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e4bd68f", new Object[]{this});
            return;
        }
        i("com.alibaba.android.aura.AURACoreUMFServicePluginCenter");
        i("com.alibaba.android.aura.AURATaobaoAdapterPluginCenter");
        h(new AURACoreUMFFrameworkPluginCenter());
    }

    public void h(IAURAPluginCenter... iAURAPluginCenterArr) {
        Map<String, Class<? extends zab>> branchConditionMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a4b131", new Object[]{this, iAURAPluginCenterArr});
        } else if (this.f != null) {
            for (IAURAPluginCenter iAURAPluginCenter : iAURAPluginCenterArr) {
                if (iAURAPluginCenter != null) {
                    if (!this.f.contains(iAURAPluginCenter)) {
                        this.f.add(iAURAPluginCenter);
                    }
                    Map<String, Class<? extends gn>> serviceMap = iAURAPluginCenter.serviceMap();
                    if (serviceMap != null) {
                        this.f22022a.putAll(serviceMap);
                    }
                    Map<String, AbstractMap.SimpleEntry<String, Class<? extends lbb>>> extensionMap = iAURAPluginCenter.extensionMap();
                    if (extensionMap != null) {
                        this.b.putAll(extensionMap);
                    }
                    Map<String, Class<? extends lbb>> extensionImplMap = iAURAPluginCenter.extensionImplMap();
                    if (extensionImplMap != null) {
                        this.c.putAll(extensionImplMap);
                    }
                    Map<Class, List<Class<? extends IAURAInputField>>> inputFieldsTargetClass = iAURAPluginCenter.inputFieldsTargetClass();
                    if (inputFieldsTargetClass != null) {
                        this.d.putAll(inputFieldsTargetClass);
                    }
                    if ((iAURAPluginCenter instanceof AbsAURAPluginCenter) && (branchConditionMap = ((AbsAURAPluginCenter) iAURAPluginCenter).branchConditionMap()) != null) {
                        this.e.putAll(branchConditionMap);
                    }
                }
            }
        }
    }

    public final void i(String str) {
        try {
            h((IAURAPluginCenter) Class.forName(str).newInstance());
        } catch (ClassCastException e) {
            rbb g = ck.g();
            g.b("AURAGlobalPluginCenter", "internalRegisterPluginCenter", "internalRegisterPluginCenter#internalRegisterPluginCenter exception,msg=" + e.getMessage());
        } catch (ClassNotFoundException e2) {
            rbb g2 = ck.g();
            g2.b("AURAGlobalPluginCenter", "internalRegisterPluginCenter", "internalRegisterPluginCenter#internalRegisterPluginCenter exception,msg=" + e2.getMessage());
        } catch (IllegalAccessException e3) {
            rbb g3 = ck.g();
            g3.b("AURAGlobalPluginCenter", "internalRegisterPluginCenter", "internalRegisterPluginCenter#internalRegisterPluginCenter exception,msg=" + e3.getMessage());
        } catch (InstantiationException e4) {
            rbb g4 = ck.g();
            g4.b("AURAGlobalPluginCenter", "internalRegisterPluginCenter", "internalRegisterPluginCenter#internalRegisterPluginCenter exception,msg=" + e4.getMessage());
        }
    }
}
