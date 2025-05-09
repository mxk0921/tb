package tb;

import android.app.Application;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dhg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Set<Class<?>> f17823a = new HashSet();
    public static final Set<Class<?>> b = new HashSet();
    public static final Set<Class<?>> c = new HashSet();
    public static dhg d;

    public static dhg b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dhg) ipChange.ipc$dispatch("549e6993", new Object[0]);
        }
        synchronized (dhg.class) {
            try {
                if (d == null) {
                    d = new dhg();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d;
    }

    public final List<vyt> a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c36ce2d2", new Object[]{this, application});
        }
        try {
            List<vyt> parseArray = JSON.parseArray(sxv.a(application, "tmg/launcher.json"), vyt.class);
            return parseArray != null ? parseArray : Collections.emptyList();
        } catch (Exception e) {
            TLog.logd(dhg.class.getSimpleName(), "getDefaultTasks", e.toString());
            return Collections.emptyList();
        }
    }

    public void c(Application application) {
        Set<Class<?>> set;
        Set<Class<?>> set2;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a(application));
        arrayList.addAll(bzt.a());
        List<vyt> c2 = bzt.c();
        boolean isEmpty = arrayList.isEmpty();
        Set<Class<?>> set3 = f17823a;
        if (!isEmpty) {
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                set = b;
                set2 = c;
                if (!hasNext) {
                    break;
                }
                try {
                    ((vyt) it.next()).getClass();
                    Class<?> cls = Class.forName(null);
                    Object newInstance = cls.newInstance();
                    if (newInstance instanceof d1e) {
                        if (vyt.TYPE_NOW.equals(null)) {
                            ((HashSet) set3).add(cls);
                        } else if (vyt.TYPE_EDITION_CHANGE.equals(null)) {
                            ((HashSet) set2).add(cls);
                        } else {
                            ((HashSet) set).add(cls);
                        }
                        ((d1e) newInstance).a(application);
                    } else {
                        String simpleName = dhg.class.getSimpleName();
                        TLog.logd(simpleName, "runBeforeRender", cls.getSimpleName() + " not implementation interface ITmgTask!");
                    }
                } catch (Exception e) {
                    TLog.logd(dhg.class.getSimpleName(), "runBeforeRender", e.toString());
                }
            }
            for (vyt vytVar : c2) {
                try {
                    vytVar.getClass();
                    Class<?> cls2 = Class.forName(null);
                    if (vyt.TYPE_NOW.equals(null)) {
                        ((HashSet) set3).remove(cls2);
                    } else if (vyt.TYPE_EDITION_CHANGE.equals(null)) {
                        ((HashSet) set2).remove(cls2);
                    } else {
                        ((HashSet) set).remove(cls2);
                    }
                } catch (Exception e2) {
                    TLog.logd(dhg.class.getSimpleName(), "runBeforeRender", e2.toString());
                }
            }
        }
        e(application, set3, true);
    }

    public void d(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("695db4d5", new Object[]{this, application});
        } else {
            e(application, c, false);
        }
    }

    public final void e(Application application, Set<Class<?>> set, boolean z) {
        if (set != null) {
            for (Class<?> cls : set) {
                try {
                    Object newInstance = cls.newInstance();
                    if (newInstance instanceof d1e) {
                        ((d1e) newInstance).b(application);
                    } else {
                        String simpleName = dhg.class.getSimpleName();
                        TLog.logd(simpleName, "runTasks", "task name : " + cls.getSimpleName() + " not implementation interface ITmgTask!");
                    }
                } catch (Exception e) {
                    TLog.logd(dhg.class.getSimpleName(), "runBeforeRender", e.toString());
                }
            }
            if (z) {
                set.clear();
            }
        }
    }
}
