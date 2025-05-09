package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.module.builtin.WXStorageModule;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.core.r;
import com.taobao.tao.flexbox.layoutmanager.filter.ABUtils;
import com.taobao.tao.flexbox.layoutmanager.filter.ArrayUtils;
import com.taobao.tao.flexbox.layoutmanager.filter.DateFilters;
import com.taobao.tao.flexbox.layoutmanager.filter.FilterHandler;
import com.taobao.tao.flexbox.layoutmanager.filter.MapUtils;
import com.taobao.tao.flexbox.layoutmanager.filter.MathUtils;
import com.taobao.tao.flexbox.layoutmanager.filter.OrangeUtils;
import com.taobao.tao.flexbox.layoutmanager.filter.StorageUtils;
import com.taobao.tao.flexbox.layoutmanager.filter.StringUtils;
import com.taobao.tao.flexbox.layoutmanager.filter.ThemeUtils;
import com.taobao.tao.flexbox.layoutmanager.filter.Utils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zh9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final WeakHashMap<Class, HashMap<String, Method>> f32771a = new WeakHashMap<>();
    public static final HashMap<String, Class> b;

    public static Object a(Class cls, String str, List list) {
        int i;
        Object[] objArr;
        boolean z = false;
        if (list != null) {
            i = list.size();
            if (!list.isEmpty() && (list.get(list.size() - 1) instanceof r)) {
                i--;
            }
        } else {
            i = 0;
        }
        Method d = d(cls, str, i);
        if (d == null) {
            return "";
        }
        if (list != null) {
            z = true;
        }
        try {
            if ((!list.isEmpty()) && z) {
                objArr = list.toArray(new Object[list.size()]);
            } else {
                objArr = null;
            }
            return d.invoke(null, objArr);
        } catch (IllegalAccessException e) {
            tfs.d("handleFilter: " + e.getMessage());
            return "";
        } catch (InvocationTargetException e2) {
            tfs.d("handleFilter: " + e2.getMessage());
            return "";
        }
    }

    public static Object b(iuo iuoVar, String str, o oVar, String str2, Class cls, String str3, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("18a92027", new Object[]{iuoVar, str, oVar, str2, cls, str3, list});
        }
        if (str2.equals("utils")) {
            return Utils.d(iuoVar, str, str3, list);
        }
        if (str2.equals("array")) {
            return ArrayUtils.a(str3, list);
        }
        if (str2.equals("string")) {
            return StringUtils.a(str3, list);
        }
        if (str2.equals("map")) {
            return MapUtils.a(str3, list);
        }
        if (str2.equals("math")) {
            return MathUtils.a(str3, list);
        }
        if (str2.equals("date")) {
            return DateFilters.a(str3, list);
        }
        if (str2.equals("config")) {
            return OrangeUtils.a(str3, list);
        }
        if (str2.equals("ab")) {
            return ABUtils.a(str3, list);
        }
        if (str2.equals("theme")) {
            return ThemeUtils.a(str3, list);
        }
        if (str2.equals(WXStorageModule.NAME)) {
            return StorageUtils.a(str3, list);
        }
        return a(cls, str3, list);
    }

    public static void c(Map<String, Class> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2790d12", new Object[]{map});
        } else if (map != null) {
            map.putAll(b);
        }
    }

    public static Method d(Class cls, String str, int i) {
        Method[] methods;
        Method method;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("905d9dc4", new Object[]{cls, str, new Integer(i)});
        }
        String str2 = str + i;
        HashMap<String, Method> hashMap = f32771a.get(cls);
        if (!(hashMap == null || (method = hashMap.get(str2)) == null)) {
            return method;
        }
        for (Method method2 : cls.getMethods()) {
            FilterHandler filterHandler = (FilterHandler) method2.getAnnotation(FilterHandler.class);
            if (filterHandler != null && filterHandler.name().equals(str) && method2.getParameterTypes().length == i) {
                if (hashMap == null) {
                    hashMap = new HashMap<>();
                    f32771a.put(cls, hashMap);
                }
                hashMap.put(str2, method2);
                return method2;
            }
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
            f32771a.put(cls, hashMap);
        }
        hashMap.put(str2, null);
        return null;
    }

    static {
        t2o.a(503317245);
        HashMap<String, Class> hashMap = new HashMap<>();
        b = hashMap;
        hashMap.put("utils", Utils.class);
        hashMap.put("array", ArrayUtils.class);
        hashMap.put("string", StringUtils.class);
        hashMap.put("map", MapUtils.class);
        hashMap.put("math", MathUtils.class);
        hashMap.put("date", DateFilters.class);
        hashMap.put("config", OrangeUtils.class);
        hashMap.put("ab", ABUtils.class);
        hashMap.put("theme", ThemeUtils.class);
        hashMap.put(WXStorageModule.NAME, StorageUtils.class);
    }
}
