package tb;

import android.text.TextUtils;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.android.alibaba.ip.runtime.IpChange;
import tb.eyl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fyl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final uw4 f19631a = new uw4();

    public final eyl a(it6 it6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eyl) ipChange.ipc$dispatch("8a894b3", new Object[]{this, it6Var});
        }
        return b(it6Var, false);
    }

    public final eyl b(it6 it6Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eyl) ipChange.ipc$dispatch("7462c233", new Object[]{this, it6Var, new Boolean(z)});
        }
        String str = it6Var.c.get("battery_level");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (Integer.parseInt(str) <= i(401, "critical", 20L)) {
                return new eyl.b().i(4).l(401).m(str).j("critical").h();
            }
            if (z) {
                return new eyl.b().i(4).l(401).m(str).j("normal").h();
            }
            return null;
        } catch (NumberFormatException e) {
            s9n.a("PerformanceWarningController", e.toString());
            return null;
        }
    }

    public final eyl c(it6 it6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eyl) ipChange.ipc$dispatch("5873abe3", new Object[]{this, it6Var});
        }
        return d(it6Var, false);
    }

    public final eyl d(it6 it6Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eyl) ipChange.ipc$dispatch("1dfa9103", new Object[]{this, it6Var, new Boolean(z)});
        }
        String str = it6Var.c.get("battery_temperature");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (Integer.parseInt(str) >= i(402, "critical", 42L)) {
                return new eyl.b().i(4).l(402).m(str).j("critical").h();
            }
            if (z) {
                return new eyl.b().i(4).l(402).m(str).j("normal").h();
            }
            return null;
        } catch (NumberFormatException e) {
            s9n.a("PerformanceWarningController", e.toString());
            return null;
        }
    }

    public final eyl e(it6 it6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eyl) ipChange.ipc$dispatch("94062f85", new Object[]{this, it6Var});
        }
        return f(it6Var, false);
    }

    public final eyl g(it6 it6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eyl) ipChange.ipc$dispatch("5c5fb9fc", new Object[]{this, it6Var});
        }
        return h(it6Var, false);
    }

    public final long i(int i, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ccee7807", new Object[]{this, new Integer(i), str, new Long(j)})).longValue();
        }
        return j;
    }

    public eyl k(it6 it6Var) {
        eyl eylVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eyl) ipChange.ipc$dispatch("ac0248b3", new Object[]{this, it6Var});
        }
        int i = it6Var.b;
        if (i == 2) {
            eylVar = a(it6Var);
        } else if (i == 3) {
            eylVar = e(it6Var);
        } else if (i == 5) {
            eylVar = c(it6Var);
        } else if (i == 6) {
            eylVar = this.f19631a.d(it6Var);
        } else if (i != 9) {
            eylVar = null;
        } else {
            eylVar = g(it6Var);
        }
        if (a2n.a(eylVar)) {
            return null;
        }
        return eylVar;
    }

    public eyl l(it6 it6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eyl) ipChange.ipc$dispatch("429d223d", new Object[]{this, it6Var});
        }
        int i = it6Var.b;
        if (i == 2) {
            return b(it6Var, true);
        }
        if (i == 3) {
            return f(it6Var, true);
        }
        if (i == 5) {
            return d(it6Var, true);
        }
        if (i == 6) {
            return this.f19631a.e(it6Var, true);
        }
        if (i == 8) {
            return j(it6Var);
        }
        if (i != 9) {
            return null;
        }
        return h(it6Var, true);
    }

    public final eyl f(it6 it6Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eyl) ipChange.ipc$dispatch("54b881a1", new Object[]{this, it6Var, new Boolean(z)});
        }
        String str = it6Var.c.get("javaUsedRate");
        if (!TextUtils.isEmpty(str)) {
            try {
                long parseInt = Integer.parseInt(str);
                String str2 = "critical";
                if (parseInt <= i(201, str2, 95L)) {
                    str2 = BaseFBPlugin.PWD_TIPS_TYPE.typeWarning;
                    if (parseInt <= i(201, str2, 90L)) {
                        str2 = z ? "normal" : null;
                    }
                }
                if (str2 == null) {
                    return null;
                }
                return new eyl.b().i(2).l(201).m(str).j(str2).h();
            } catch (NumberFormatException e) {
                s9n.a("PerformanceWarningController", e.toString());
            }
        }
        return null;
    }

    public final eyl h(it6 it6Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eyl) ipChange.ipc$dispatch("9790460a", new Object[]{this, it6Var, new Boolean(z)});
        }
        String str = it6Var.c.get("nativeHeapAllocatedSize");
        if (!TextUtils.isEmpty(str)) {
            try {
                long parseInt = Integer.parseInt(str);
                String str2 = "critical";
                if (parseInt < i(202, str2, 1073741824L)) {
                    str2 = BaseFBPlugin.PWD_TIPS_TYPE.typeWarning;
                    if (parseInt < i(202, str2, 1073741824L)) {
                        str2 = z ? "normal" : null;
                    }
                }
                if (str2 == null) {
                    return null;
                }
                return new eyl.b().i(2).l(202).m(str).j(str2).h();
            } catch (NumberFormatException e) {
                s9n.a("PerformanceWarningController", e.toString());
            }
        }
        return null;
    }

    public final eyl j(it6 it6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eyl) ipChange.ipc$dispatch("d6791128", new Object[]{this, it6Var});
        }
        String str = it6Var.c.get("pss");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new eyl.b().i(2).l(8).m(str).h();
    }
}
