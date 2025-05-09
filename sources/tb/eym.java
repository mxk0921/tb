package tb;

import android.text.TextUtils;
import com.alibaba.android.umbrella.performance.PerformanceEngine;
import com.alibaba.android.umbrella.performance.ProcessEntity;
import com.alibaba.android.umbrella.performance.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class eym {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(a aVar) {
        ProcessEntity c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a09673d6", new Object[]{aVar});
        } else if (!d(aVar) && (c = fym.b().c(aVar.b)) != null) {
            c.addAbTest(aVar.d, aVar.e);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9e7274d", new Object[0]);
            return;
        }
        Map<String, ProcessEntity> d = fym.b().d();
        if (d != null || d.size() <= 0) {
            for (String str : d.keySet()) {
                ProcessEntity processEntity = d.get(str);
                if (processEntity == null) {
                    d.remove(str);
                } else {
                    d.remove(str);
                    f(processEntity);
                }
            }
        }
    }

    public static boolean c(a aVar) {
        gdv gdvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9fd51f0", new Object[]{aVar})).booleanValue();
        }
        if (aVar == null || TextUtils.isEmpty(aVar.b) || (gdvVar = aVar.g) == null || TextUtils.isEmpty(gdvVar.a()) || !fym.b().e(aVar.b)) {
            return true;
        }
        return false;
    }

    public static boolean d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0130dab", new Object[]{aVar})).booleanValue();
        }
        if (aVar == null || TextUtils.isEmpty(aVar.b) || !fym.b().e(aVar.b)) {
            return true;
        }
        return false;
    }

    public static void e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a94782d", new Object[]{aVar});
            return;
        }
        ProcessEntity c = fym.b().c(aVar.b);
        if (c != null) {
            fym.b().f(c);
            if (c.pageLoad > 0) {
                f(c);
            }
        }
    }

    public static void f(ProcessEntity processEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53bdc6db", new Object[]{processEntity});
        } else {
            PerformanceEngine.commitPerformancePage(processEntity);
        }
    }

    public static void g(a aVar) {
        ProcessEntity c;
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a25414b8", new Object[]{aVar});
        } else if (!d(aVar) && (c = fym.b().c(aVar.b)) != null && (map = aVar.j) != null && map.size() > 0) {
            c.addArgs(aVar.j);
        }
    }

    public static void h(a aVar) {
        ProcessEntity c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("825f3c16", new Object[]{aVar});
        } else if (!d(aVar) && !TextUtils.isEmpty(aVar.f) && (c = fym.b().c(aVar.b)) != null) {
            c.addOtherProcess(aVar.f, aVar.i);
        }
    }

    public static void i(a aVar) {
        ProcessEntity c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61cf6ea8", new Object[]{aVar});
        } else if (!c(aVar) && (c = fym.b().c(aVar.b)) != null) {
            Map<String, String> map = aVar.j;
            if (map != null && map.size() > 0) {
                c.addArgs(aVar.j);
            }
            if (gdv.PAGELOAD.equals(aVar.g)) {
                c.addPageLoad(aVar.i);
            } else {
                c.addProcess(aVar.g.a(), aVar.i);
            }
        }
    }

    public static void j(a aVar) {
        ProcessEntity c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c19ebf06", new Object[]{aVar});
        } else if (!c(aVar) && !TextUtils.isEmpty(aVar.f) && (c = fym.b().c(aVar.b)) != null) {
            Map<String, String> map = aVar.j;
            if (map != null && map.size() > 0) {
                c.addArgs(aVar.j);
            }
            gdv gdvVar = aVar.g;
            if (gdvVar == gdv.INIT) {
                c.addInit(aVar.f, aVar.i);
            } else if (gdvVar == gdv.LIFECYCLE) {
                c.addLifeCycle(aVar.f, aVar.i);
            } else if (gdvVar == gdv.NETWORK) {
                c.addNetwork(aVar.f, aVar.i);
            } else if (gdvVar == gdv.DATAPARSE) {
                c.addDataParse(aVar.f, aVar.i);
            } else if (gdvVar == gdv.SUB_CREATE_VIEW) {
                c.addCreateView(aVar.f, aVar.i);
            } else if (gdvVar == gdv.SUB_BIND_VIEW) {
                c.addBindView(aVar.f, aVar.i);
            }
        }
    }

    public static void k(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f591dc3", new Object[]{aVar});
            return;
        }
        b();
        fym.b().a(new ProcessEntity(aVar.b, aVar.h));
    }

    public static void l(a aVar) {
        ProcessEntity c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("520db8c2", new Object[]{aVar});
        } else if (!d(aVar) && (c = fym.b().c(aVar.b)) != null) {
            c.setChildBizName(aVar.c);
        }
    }
}
