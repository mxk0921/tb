package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.data.baseinfo.PageBaseInfo;
import com.taobao.tab2interact.core.data.baseinfo.TabBaseInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class vv1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public PageBaseInfo f30274a;
    public final Map<String, TabBaseInfo> b = new LinkedHashMap();

    static {
        t2o.a(689963109);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd7b171", new Object[]{this});
        } else {
            this.f30274a = new PageBaseInfo();
        }
    }

    public final void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37454953", new Object[]{this, str, str2});
        } else {
            this.b.put(str, new TabBaseInfo(str2));
        }
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a5d090c", new Object[]{this});
        }
        for (Map.Entry entry : ((LinkedHashMap) this.b).entrySet()) {
            String str = (String) entry.getKey();
            if (((TabBaseInfo) entry.getValue()).a() == TabBaseInfo.State.START) {
                return str;
            }
        }
        return null;
    }

    public final PageBaseInfo.State d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageBaseInfo.State) ipChange.ipc$dispatch("fc37b877", new Object[]{this});
        }
        PageBaseInfo pageBaseInfo = this.f30274a;
        if (pageBaseInfo != null) {
            return pageBaseInfo.a();
        }
        return null;
    }

    public final Map<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f500f9ba", new Object[]{this});
        }
        PageBaseInfo pageBaseInfo = this.f30274a;
        if (pageBaseInfo != null) {
            return pageBaseInfo.b();
        }
        return null;
    }

    public final Set<String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("25a5e1cf", new Object[]{this});
        }
        return ((LinkedHashMap) this.b).keySet();
    }

    public final TabBaseInfo.State g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBaseInfo.State) ipChange.ipc$dispatch("f82f4473", new Object[]{this, str});
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        TabBaseInfo tabBaseInfo = (TabBaseInfo) ((LinkedHashMap) this.b).get(str);
        if (tabBaseInfo != null) {
            return tabBaseInfo.a();
        }
        return null;
    }

    public final String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e1903d6", new Object[]{this, str});
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        TabBaseInfo tabBaseInfo = (TabBaseInfo) ((LinkedHashMap) this.b).get(str);
        if (tabBaseInfo != null) {
            return tabBaseInfo.b();
        }
        return null;
    }

    public final Map<String, String> i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("244ac91e", new Object[]{this, str});
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        TabBaseInfo tabBaseInfo = (TabBaseInfo) ((LinkedHashMap) this.b).get(str);
        if (tabBaseInfo != null) {
            return tabBaseInfo.c();
        }
        return null;
    }

    public final void k(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805d1614", new Object[]{this, map});
            return;
        }
        ckf.g(map, "pageURLQuery");
        PageBaseInfo pageBaseInfo = this.f30274a;
        if (pageBaseInfo != null) {
            pageBaseInfo.d(map);
        }
    }

    public final boolean j(PageBaseInfo.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7840ddd1", new Object[]{this, state})).booleanValue();
        }
        ckf.g(state, "pageState");
        PageBaseInfo pageBaseInfo = this.f30274a;
        PageBaseInfo.State state2 = PageBaseInfo.State.CREATE;
        if (state == state2) {
            if ((pageBaseInfo != null ? pageBaseInfo.a() : null) != null) {
                return false;
            }
            a();
        } else {
            PageBaseInfo.State state3 = PageBaseInfo.State.START;
            if (state != state3) {
                PageBaseInfo.State state4 = PageBaseInfo.State.STOP;
                if (state != state4) {
                    PageBaseInfo.State state5 = PageBaseInfo.State.DESTROY;
                    if (state == state5 && (pageBaseInfo == null || pageBaseInfo.a() == state5)) {
                        return false;
                    }
                } else if (pageBaseInfo == null || pageBaseInfo.a() == state2 || pageBaseInfo.a() == state4 || pageBaseInfo.a() == PageBaseInfo.State.DESTROY) {
                    return false;
                }
            } else if (pageBaseInfo == null || pageBaseInfo.a() == state3 || pageBaseInfo.a() == PageBaseInfo.State.DESTROY) {
                return false;
            }
        }
        PageBaseInfo pageBaseInfo2 = this.f30274a;
        if (pageBaseInfo2 != null) {
            pageBaseInfo2.c(state);
        }
        return true;
    }

    public final boolean l(String str, String str2, TabBaseInfo.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df3fdd1d", new Object[]{this, str, str2, state})).booleanValue();
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(state, "tabState");
        TabBaseInfo tabBaseInfo = (TabBaseInfo) ((LinkedHashMap) this.b).get(str);
        TabBaseInfo.State state2 = TabBaseInfo.State.CREATE;
        if (state != state2) {
            TabBaseInfo.State state3 = TabBaseInfo.State.START;
            if (state != state3) {
                TabBaseInfo.State state4 = TabBaseInfo.State.STOP;
                if (state != state4) {
                    TabBaseInfo.State state5 = TabBaseInfo.State.DESTROY;
                    if (state == state5 && (tabBaseInfo == null || tabBaseInfo.a() == state5)) {
                        return false;
                    }
                } else if (tabBaseInfo == null || tabBaseInfo.a() == state2 || tabBaseInfo.a() == state4 || tabBaseInfo.a() == TabBaseInfo.State.DESTROY) {
                    return false;
                }
            } else if (tabBaseInfo == null || tabBaseInfo.a() == state3 || tabBaseInfo.a() == TabBaseInfo.State.DESTROY) {
                return false;
            }
        } else if (str2 == null) {
            return false;
        } else {
            b(str, str2);
        }
        TabBaseInfo tabBaseInfo2 = (TabBaseInfo) ((LinkedHashMap) this.b).get(str);
        if (tabBaseInfo2 != null) {
            tabBaseInfo2.d(state);
        }
        return true;
    }
}
