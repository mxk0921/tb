package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexModule;
import com.taobao.android.weex.module.WeexInnerModule;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class f7x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile ConcurrentMap<String, c7x> f19092a = new ConcurrentHashMap();

    static {
        t2o.a(982515933);
    }

    public static void a(String str, Class<? extends WeexInnerModule> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85763a2d", new Object[]{str, cls});
        } else if (TextUtils.isEmpty(str) || cls == null) {
            dwh.e("register module illegal");
        } else {
            if (f5x.b) {
                if (((ConcurrentHashMap) f19092a).containsKey(str)) {
                    dwh.v("register module twice,Module name is  " + str);
                }
                f9x.b(WeexInnerModule.class.isAssignableFrom(cls), "registerInnerModule only support WeexInnerModule");
            }
            ((ConcurrentHashMap) f19092a).put(str, new q5x(cls));
        }
    }

    public static boolean b(String str, Class<? extends WeexModule> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51e31701", new Object[]{str, cls})).booleanValue();
        }
        f9x.b(true ^ WeexInnerModule.class.isAssignableFrom(cls), "Subclass of WeexInnerModule should use registerInnerModule to register");
        return c(str, new j8x(cls));
    }

    public static c7x<?> d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c7x) ipChange.ipc$dispatch("337b13a6", new Object[]{str});
        }
        return (c7x) ((ConcurrentHashMap) f19092a).get(str);
    }

    public static boolean c(String str, c7x c7xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26ec953e", new Object[]{str, c7xVar})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && c7xVar != null) {
            if (f5x.b && f19092a != null && ((ConcurrentHashMap) f19092a).containsKey(str)) {
                dwh.v("register module twice,Module name is  " + str);
            }
            try {
                ((ConcurrentHashMap) f19092a).put(str, c7xVar);
                return true;
            } catch (Exception e) {
                dwh.h("register module ", e);
            }
        }
        return false;
    }
}
