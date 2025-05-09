package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zrk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355742);
    }

    public Map<String, String> a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ea4a06bd", new Object[]{this, activity});
        }
        m4e c = c();
        if (c != null) {
            return c.getPageAllProperties(activity);
        }
        return null;
    }

    public Map<String, String> b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("97847fb0", new Object[]{this, obj});
        }
        m4e c = c();
        if (c != null) {
            return c.c(obj);
        }
        return null;
    }

    public final m4e c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m4e) ipChange.ipc$dispatch("e2cc51b6", new Object[]{this});
        }
        return v2s.o().E();
    }

    public void d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52025aa7", new Object[]{this, obj});
            return;
        }
        m4e c = c();
        if (c != null) {
            c.pageAppear(obj);
        }
    }

    public void e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ff07c6", new Object[]{this, obj});
            return;
        }
        m4e c = c();
        if (c != null) {
            c.a(obj);
        }
    }

    public void f(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f29b97", new Object[]{this, obj});
            return;
        }
        m4e c = c();
        if (c != null) {
            c.pageDisAppear(obj);
        }
    }

    public void g(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be12fe50", new Object[]{this, obj, str});
            return;
        }
        m4e c = c();
        if (c != null) {
            c.updatePageName(obj, str);
        }
    }

    public void h(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24452d17", new Object[]{this, obj, map});
            return;
        }
        m4e c = c();
        if (obj != null && c != null) {
            c.updatePageProperties(obj, map);
        }
    }

    public void i(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c541ce3", new Object[]{this, obj, str});
            return;
        }
        m4e c = c();
        if (c != null) {
            c.updatePageUtparam(obj, str);
        }
    }
}
