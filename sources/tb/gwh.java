package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.module.MUSModule;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gwh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile ConcurrentMap<String, jyi> f20269a = new ConcurrentHashMap();
    public static final Map<String, MUSModule> b = new ConcurrentHashMap();

    static {
        t2o.a(982516095);
    }

    public static Object a(tvh tvhVar, String str, String str2, MUSValue[] mUSValueArr, jkj jkjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c56cadcb", new Object[]{tvhVar, str, str2, mUSValueArr, jkjVar});
        }
        if (!d(str)) {
            return null;
        }
        jyi jyiVar = (jyi) ((ConcurrentHashMap) f20269a).get(str);
        MUSModule b2 = b(tvhVar, str, jyiVar);
        if (b2 == null) {
            dwh.v("[MUSModuleManager] callModuleMethod " + str + " is not registered");
            return null;
        } else if (b2.isGenerated()) {
            try {
                return b2.dispatchMethod(str2, mUSValueArr, tvhVar.getExecuteContext());
            } catch (Exception e) {
                dwh.k("[Module]", "callModuleMethod " + str + "#" + str2 + "() error", e, "Module: " + str + "<" + b2.getClass().getSimpleName() + "> 调用报错, 查看adb log修复");
                return null;
            }
        } else if (jyiVar.getMethodInvoker(str2) == null) {
            dwh.v("[MUSModuleManager] callModuleMethod " + str + "#" + str2 + "() is not defined");
            return null;
        } else {
            try {
                return jkjVar.b(b2, jyiVar.getMethodInvoker(str2), mUSValueArr);
            } catch (Exception e2) {
                dwh.k("[Module]", "callModuleMethod " + str + "#" + str2 + "() error", e2, "Module: " + str + "<" + b2.getClass().getSimpleName() + "> 调用报错, 查看adb log修复");
                return null;
            }
        }
    }

    public static MUSModule b(tvh tvhVar, String str, jyi jyiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSModule) ipChange.ipc$dispatch("beb55c5", new Object[]{tvhVar, str, jyiVar});
        }
        MUSModule mUSModule = (MUSModule) ((ConcurrentHashMap) b).get(str);
        if (mUSModule != null) {
            return mUSModule;
        }
        MUSModule module = tvhVar.getModule(str);
        if (module == null) {
            try {
                module = jyiVar.c(str, tvhVar);
                tvhVar.addModule(str, module);
            } catch (Exception e) {
                dwh.k("[Module]", str + " module build instance failed.", e, "Module: " + str + " 构造报错, 查看adb log修复");
                return null;
            }
        }
        return module;
    }

    public static WeexValue c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("c06e050c", new Object[]{str});
        }
        jyi jyiVar = (jyi) ((ConcurrentHashMap) f20269a).get(str);
        if (jyiVar == null) {
            return WeexValueImpl.ofUndefined();
        }
        try {
            return WeexValueImpl.ofJSONArray(JSON.parseArray(jyiVar.getMethods()));
        } catch (Exception e) {
            dwh.i(e);
            return WeexValueImpl.ofUndefined();
        }
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d737188", new Object[]{str})).booleanValue();
        }
        return ((ConcurrentHashMap) f20269a).containsKey(str);
    }

    public static boolean e(String str, Class<? extends MUSModule> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51e31701", new Object[]{str, cls})).booleanValue();
        }
        return f(str, cls, false);
    }

    public static boolean f(String str, Class<? extends MUSModule> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea807b7b", new Object[]{str, cls, new Boolean(z)})).booleanValue();
        }
        return g(str, new dyp(cls), z);
    }

    public static boolean g(String str, jyi jyiVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8bdf980", new Object[]{str, jyiVar, new Boolean(z)})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && jyiVar != null) {
            if (f20269a != null && ((ConcurrentHashMap) f20269a).containsKey(str)) {
                dwh.v("register module twice,Module name is  " + str);
            }
            try {
                ((ConcurrentHashMap) f20269a).put(str, jyiVar);
                if (z) {
                    try {
                        ((ConcurrentHashMap) b).put(str, jyiVar.c(str, null));
                    } catch (Exception e) {
                        dwh.h(str + " class must have a default constructor without any parameters.", e);
                    }
                }
                return true;
            } catch (Exception e2) {
                dwh.h("register module ", e2);
            }
        }
        return false;
    }
}
