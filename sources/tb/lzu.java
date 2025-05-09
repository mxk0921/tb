package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class lzu implements m4e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public m4e f23678a;
    public u4e b;

    static {
        t2o.a(779093412);
        t2o.a(806355948);
    }

    @Override // tb.m4e
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ff07c6", new Object[]{this, obj});
            return;
        }
        m4e m4eVar = this.f23678a;
        if (m4eVar != null) {
            m4eVar.a(obj);
        }
    }

    public void b(m4e m4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("627390c1", new Object[]{this, m4eVar});
        } else {
            this.f23678a = m4eVar;
        }
    }

    @Override // tb.m4e
    public Map<String, String> c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("97847fb0", new Object[]{this, obj});
        }
        m4e m4eVar = this.f23678a;
        if (m4eVar != null) {
            return m4eVar.c(obj);
        }
        return null;
    }

    public void d(u4e u4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a418d54", new Object[]{this, u4eVar});
        } else {
            this.b = u4eVar;
        }
    }

    @Override // tb.m4e
    public Map<String, String> getPageAllProperties(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ea4a06bd", new Object[]{this, activity});
        }
        m4e m4eVar = this.f23678a;
        if (m4eVar != null) {
            return m4eVar.getPageAllProperties(activity);
        }
        return null;
    }

    @Override // tb.m4e
    public void pageAppear(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52025aa7", new Object[]{this, obj});
            return;
        }
        m4e m4eVar = this.f23678a;
        if (m4eVar != null) {
            m4eVar.pageAppear(obj);
        }
    }

    @Override // tb.m4e
    public void pageDisAppear(Object obj) {
        u4e u4eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f29b97", new Object[]{this, obj});
            return;
        }
        if (wd0.a() && (u4eVar = this.b) != null) {
            ((m3h) u4eVar).m(obj);
        }
        m4e m4eVar = this.f23678a;
        if (m4eVar != null) {
            m4eVar.pageDisAppear(obj);
        }
    }

    @Override // tb.m4e
    public void skipPage(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ec0ed1", new Object[]{this, obj});
            return;
        }
        m4e m4eVar = this.f23678a;
        if (m4eVar != null) {
            m4eVar.skipPage(obj);
        }
    }

    @Override // tb.m4e
    public void track4Click(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b70f26b", new Object[]{this, str, str2, map});
            return;
        }
        if (wd0.a()) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            u4e u4eVar = this.b;
            if (u4eVar != null) {
                ((m3h) u4eVar).n(str, str2, hashMap);
            }
        }
        m4e m4eVar = this.f23678a;
        if (m4eVar != null) {
            m4eVar.track4Click(str, str2, map);
        }
    }

    @Override // tb.m4e
    public void track4Show(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc9fba64", new Object[]{this, str, str2, map});
            return;
        }
        if (wd0.a()) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            u4e u4eVar = this.b;
            if (u4eVar != null) {
                ((m3h) u4eVar).p(str, str2, hashMap);
            }
        }
        m4e m4eVar = this.f23678a;
        if (m4eVar != null) {
            m4eVar.track4Show(str, str2, map);
        }
    }

    @Override // tb.m4e
    public void trackCustom(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60e9531", new Object[]{this, str, new Integer(i), str2, str3, str4, map});
            return;
        }
        if (wd0.a()) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            u4e u4eVar = this.b;
            if (u4eVar != null) {
                ((m3h) u4eVar).q(str, i, str2, str3, str4, hashMap);
            }
        }
        m4e m4eVar = this.f23678a;
        if (m4eVar != null) {
            m4eVar.trackCustom(str, i, str2, str3, str4, map);
        }
    }

    @Override // tb.m4e
    public void updateNextPageProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6203bbc0", new Object[]{this, map});
            return;
        }
        m4e m4eVar = this.f23678a;
        if (m4eVar != null) {
            m4eVar.updateNextPageProperties(map);
        }
    }

    @Override // tb.m4e
    public void updateNextPageUtParam(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b002a09b", new Object[]{this, map});
            return;
        }
        m4e m4eVar = this.f23678a;
        if (m4eVar != null) {
            m4eVar.updateNextPageUtParam(map);
        }
    }

    @Override // tb.m4e
    public void updatePageName(Object obj, String str) {
        u4e u4eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be12fe50", new Object[]{this, obj, str});
            return;
        }
        if (wd0.a() && (u4eVar = this.b) != null) {
            ((m3h) u4eVar).s(obj, str);
        }
        m4e m4eVar = this.f23678a;
        if (m4eVar != null) {
            m4eVar.updatePageName(obj, str);
        }
    }

    @Override // tb.m4e
    public void updatePageProperties(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24452d17", new Object[]{this, obj, map});
            return;
        }
        if (wd0.a()) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            u4e u4eVar = this.b;
            if (u4eVar != null) {
                ((m3h) u4eVar).t(obj, hashMap);
            }
        }
        m4e m4eVar = this.f23678a;
        if (m4eVar != null) {
            m4eVar.updatePageProperties(obj, map);
        }
    }

    @Override // tb.m4e
    public void updatePageUtparam(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c541ce3", new Object[]{this, obj, str});
            return;
        }
        m4e m4eVar = this.f23678a;
        if (m4eVar != null) {
            m4eVar.updatePageUtparam(obj, str);
        }
    }

    @Override // tb.m4e
    public void track4Click(String str, String str2, String... strArr) {
        u4e u4eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6bc7905", new Object[]{this, str, str2, strArr});
            return;
        }
        if (wd0.a() && (u4eVar = this.b) != null) {
            ((m3h) u4eVar).o(str, str2, strArr);
        }
        m4e m4eVar = this.f23678a;
        if (m4eVar != null) {
            m4eVar.track4Click(str, str2, strArr);
        }
    }

    @Override // tb.m4e
    public void trackCustom(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d98bbee", new Object[]{this, str, str2, map});
            return;
        }
        if (wd0.a()) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            u4e u4eVar = this.b;
            if (u4eVar != null) {
                ((m3h) u4eVar).r(str, str2, hashMap);
            }
        }
        m4e m4eVar = this.f23678a;
        if (m4eVar != null) {
            m4eVar.trackCustom(str, str2, map);
        }
    }
}
