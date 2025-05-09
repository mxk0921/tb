package com.taobao.tao.flexbox.layoutmanager.ac;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.module.AnimationModule;
import com.taobao.tao.flexbox.layoutmanager.module.AnyThread;
import com.taobao.tao.flexbox.layoutmanager.module.AppModule;
import com.taobao.tao.flexbox.layoutmanager.module.CleanAnnotation;
import com.taobao.tao.flexbox.layoutmanager.module.ElementModule;
import com.taobao.tao.flexbox.layoutmanager.module.MonitorModule;
import com.taobao.tao.flexbox.layoutmanager.module.NavModule;
import com.taobao.tao.flexbox.layoutmanager.module.NavigationBarModule;
import com.taobao.tao.flexbox.layoutmanager.module.NetModule;
import com.taobao.tao.flexbox.layoutmanager.module.NotifyModule;
import com.taobao.tao.flexbox.layoutmanager.module.ScreenModule;
import com.taobao.tao.flexbox.layoutmanager.module.StorageModule;
import com.taobao.tao.flexbox.layoutmanager.module.TintModule;
import com.taobao.tao.flexbox.layoutmanager.module.TrackerModule;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, a> f11967a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Cloneable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f11968a;
        public Class b;
        public boolean c;
        public boolean d = false;
        public String e = null;

        static {
            t2o.a(503316547);
        }

        /* renamed from: a */
        public a clone() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a0146c8a", new Object[]{this});
            }
            try {
                return (a) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    static {
        t2o.a(503316546);
        c("$app", AppModule.class);
        c("$naviBar", NavigationBarModule.class);
        c("$navigator", NavModule.class);
        c("$", TNodeActionServiceMgrModule.class);
        c("$tracker", TrackerModule.class);
        c("$notify", NotifyModule.class);
        c("$storage", StorageModule.class);
        c("$animation", AnimationModule.class);
        c("$screen", ScreenModule.class);
        c("$element", ElementModule.class);
        c("$monitor", MonitorModule.class);
        c("$net", NetModule.class);
        c("$tint", TintModule.class);
    }

    public static void a(o oVar) {
        Map<String, a> map = f11967a;
        synchronized (map) {
            for (a aVar : ((HashMap) map).values()) {
                String str = aVar.e;
                if (str != null) {
                    Class cls = aVar.b;
                    if (cls == null) {
                        cls = null;
                    }
                    if (cls != null) {
                        try {
                            Method method = cls.getMethod(str, o.class);
                            if (method != null) {
                                method.invoke(null, oVar);
                            }
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (NoSuchMethodException e2) {
                            e2.printStackTrace();
                        } catch (InvocationTargetException e3) {
                            e3.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    public static a b(String str) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("8d74da7", new Object[]{str});
        }
        Map<String, a> map = f11967a;
        synchronized (map) {
            aVar = (a) ((HashMap) map).get(str);
        }
        return aVar;
    }

    public static void c(String str, Class cls) {
        String str2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fadfdf1a", new Object[]{str, cls});
            return;
        }
        a aVar = new a();
        aVar.b = cls;
        if (cls.getAnnotation(AnyThread.class) == null) {
            z = false;
        }
        aVar.d = z;
        CleanAnnotation cleanAnnotation = (CleanAnnotation) cls.getAnnotation(CleanAnnotation.class);
        if (cleanAnnotation != null) {
            str2 = cleanAnnotation.name();
        } else {
            str2 = null;
        }
        aVar.e = str2;
        Map<String, a> map = f11967a;
        synchronized (map) {
            map.put(str, aVar);
        }
    }
}
