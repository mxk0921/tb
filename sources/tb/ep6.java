package tb;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ep6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CLOSE = "mega_dark_page_close";
    public static final String ACTION_CLOSE_INDEX_PARAM = "closeIndex";
    public static final String ACTION_CLOSE_TYPE_PARAM = "closeType";
    public static volatile ep6 g;

    /* renamed from: a  reason: collision with root package name */
    public dae f18736a;
    public eae b;
    public final Map<String, View> c = new HashMap();
    public final Map<String, View> d = new HashMap();
    public final Map<String, View> e = new HashMap();
    public wqc f;

    public static ep6 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ep6) ipChange.ipc$dispatch("b3b5c11a", new Object[0]);
        }
        if (g == null) {
            synchronized (ep6.class) {
                try {
                    if (g == null) {
                        g = new ep6();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.f = null;
        this.f18736a = null;
        this.b = null;
    }

    public View b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("57eb17e3", new Object[]{this, str});
        }
        return (View) ((HashMap) this.e).get(str);
    }

    public dae c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dae) ipChange.ipc$dispatch("327120b", new Object[]{this});
        }
        return this.f18736a;
    }

    public View e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8f503b61", new Object[]{this, str});
        }
        return (View) ((HashMap) this.d).get(str);
    }

    public wqc f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wqc) ipChange.ipc$dispatch("a4a671f9", new Object[]{this});
        }
        return this.f;
    }

    public eae g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eae) ipChange.ipc$dispatch("80de5c03", new Object[]{this});
        }
        return this.b;
    }

    public View h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d3d53ba0", new Object[]{this, str});
        }
        return (View) ((HashMap) this.c).get(str);
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16c8c00f", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            ((HashMap) this.e).remove(str);
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ef1a8d", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            ((HashMap) this.d).remove(str);
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d392fc8c", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            ((HashMap) this.c).remove(str);
        }
    }

    public void l(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2ff42c5", new Object[]{this, str, view});
        } else if (!TextUtils.isEmpty(str) && view != null) {
            ((HashMap) this.e).put(str, view);
        }
    }

    public void m(dae daeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("491173cb", new Object[]{this, daeVar});
        } else {
            this.f18736a = daeVar;
        }
    }

    public void n(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebad5c07", new Object[]{this, str, view});
        } else if (!TextUtils.isEmpty(str) && view != null) {
            ((HashMap) this.d).put(str, view);
        }
    }

    public void o(wqc wqcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98b0f721", new Object[]{this, wqcVar});
        } else if (wqcVar != null) {
            this.f = wqcVar;
        }
    }

    public void p(eae eaeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6700caef", new Object[]{this, eaeVar});
        } else {
            this.b = eaeVar;
        }
    }

    public void q(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c863a8", new Object[]{this, str, view});
        } else if (!TextUtils.isEmpty(str) && view != null) {
            ((HashMap) this.c).put(str, view);
        }
    }
}
