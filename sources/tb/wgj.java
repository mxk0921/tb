package tb;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wgj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Set<String> f30681a;
    public static Set<String> b;
    public static Application c;

    public static synchronized Application a() {
        synchronized (wgj.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
            }
            if (c == null) {
                c = d();
            }
            return c;
        }
    }

    public static Set<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("80b01076", new Object[0]);
        }
        if (f30681a == null) {
            f30681a = c(a());
        }
        return f30681a;
    }

    public static Set<String> c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("f981b8e9", new Object[]{context});
        }
        if (context == null) {
            return new HashSet();
        }
        if (!(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        return context.getSharedPreferences("NDEntryParamWhiteList", 0).getStringSet("NDEntryParamWhiteList", new HashSet());
    }

    public static Application d() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Set<String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("7fa23087", new Object[0]);
        }
        if (b == null) {
            b = f(a());
        }
        return b;
    }

    public static Set<String> f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("af7fd6b8", new Object[]{context});
        }
        if (context == null) {
            return new HashSet();
        }
        if (!(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        return context.getSharedPreferences("NDEntryParamWhiteList", 0).getStringSet("UGCEntryParamWhiteList", new HashSet());
    }

    public static void g(Context context, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b95d0070", new Object[]{context, jSONArray});
            return;
        }
        HashSet hashSet = new HashSet();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                try {
                    hashSet.add(jSONArray.getString(i));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        h(context, hashSet);
        f30681a = hashSet;
    }

    public static void h(Context context, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ae9f04f", new Object[]{context, set});
        } else if (context != null) {
            if (!(context instanceof Application)) {
                context = context.getApplicationContext();
            }
            SharedPreferences.Editor edit = context.getSharedPreferences("NDEntryParamWhiteList", 0).edit();
            edit.putStringSet("NDEntryParamWhiteList", set);
            edit.apply();
        }
    }

    public static void i(Context context, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a11efd1", new Object[]{context, jSONArray});
            return;
        }
        HashSet hashSet = new HashSet();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                try {
                    hashSet.add(jSONArray.getString(i));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        j(context, hashSet);
        b = hashSet;
    }

    public static void j(Context context, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("535e974e", new Object[]{context, set});
        } else if (context != null) {
            if (!(context instanceof Application)) {
                context = context.getApplicationContext();
            }
            SharedPreferences.Editor edit = context.getSharedPreferences("NDEntryParamWhiteList", 0).edit();
            edit.putStringSet("UGCEntryParamWhiteList", set);
            edit.apply();
        }
    }
}
