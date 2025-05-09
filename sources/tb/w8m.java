package tb;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.api.AbsServiceImpl;
import com.taobao.alimama.api.plugin.IPlugin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class w8m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<IPlugin> f30517a = new ArrayList(5);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final w8m f30518a = new w8m();

        static {
            t2o.a(1018167312);
        }

        public static /* synthetic */ w8m a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (w8m) ipChange.ipc$dispatch("f822107d", new Object[0]);
            }
            return f30518a;
        }
    }

    static {
        t2o.a(1018167311);
    }

    public static w8m b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w8m) ipChange.ipc$dispatch("d26c2c38", new Object[0]);
        }
        return a.a();
    }

    public static List<String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7cb3f246", new Object[0]);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("com.taobao.alimama.common.plugin.Plugin");
        return arrayList;
    }

    public void a(Context context) {
        SystemClock.elapsedRealtime();
        List<String> c = c();
        if (c != null && c.size() != 0) {
            ArrayList arrayList = new ArrayList(5);
            for (String str : c) {
                try {
                    Class<?> loadClass = context.getClassLoader().loadClass(str);
                    if (IPlugin.class.isAssignableFrom(loadClass)) {
                        arrayList.add(loadClass);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                List<IPlugin> list = this.f30517a;
                if (hasNext) {
                    Class cls = (Class) it.next();
                    try {
                        ((ArrayList) list).add((IPlugin) cls.newInstance());
                    } catch (Throwable th2) {
                        Log.e(ec.LOG_TAG, "unable to load plugin ".concat(cls.getName()), th2);
                    }
                } else {
                    ((ArrayList) list).size();
                    SystemClock.elapsedRealtime();
                    return;
                }
            }
        }
    }

    public Map<Class<?>, Class<? extends AbsServiceImpl>> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ec26935a", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        Iterator it = ((ArrayList) this.f30517a).iterator();
        while (it.hasNext()) {
            Map<Class<?>, Class<? extends AbsServiceImpl>> services = ((IPlugin) it.next()).services();
            if (services != null) {
                hashMap.putAll(services);
            }
        }
        return hashMap;
    }
}
