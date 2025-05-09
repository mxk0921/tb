package tb;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.common.CircularList;
import com.taobao.android.diagnose.model.AppInfo;
import com.taobao.android.diagnose.model.NetInfo;
import com.taobao.android.diagnose.model.PageInfo;
import com.taobao.android.diagnose.scene.a;
import com.taobao.tinct.impl.collect.ChangeRecord;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qk7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Boolean f26793a = Boolean.TRUE;
    public PageInfo b = null;
    public final Map<String, PageInfo> c = new ConcurrentHashMap();
    public final CircularList<PageInfo> d = new CircularList<>(10);
    public ChangeRecord f = null;
    public final Map<String, String> g = new ConcurrentHashMap();
    public bjo h = null;
    public NetInfo e = new NetInfo();
    public final AppInfo i = new AppInfo();

    static {
        t2o.a(615514175);
    }

    public static /* synthetic */ int m(PageInfo pageInfo, PageInfo pageInfo2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("951022b2", new Object[]{pageInfo, pageInfo2})).intValue();
        }
        long j = pageInfo.lastAppearTime;
        long j2 = pageInfo2.lastAppearTime;
        if (j > j2) {
            return -1;
        }
        if (j < j2) {
            return 1;
        }
        return 0;
    }

    public PageInfo b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageInfo) ipChange.ipc$dispatch("1888f72d", new Object[]{this, activity});
        }
        PageInfo pageInfo = new PageInfo(activity);
        ((ConcurrentHashMap) this.c).put(pageInfo.getPageID(), pageInfo);
        if (((ConcurrentHashMap) this.c).size() + this.d.size() > 10 && this.d.size() > 0) {
            this.d.removeFirst();
        }
        idh.a("DiagnoseInfo", String.format("Add new page: %s(%s),  page list size: %d, history size: %d", pageInfo.getPageName(), pageInfo.getPageID(), Integer.valueOf(((ConcurrentHashMap) this.c).size()), Integer.valueOf(this.d.size())));
        v(pageInfo);
        return pageInfo;
    }

    public AppInfo c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfo) ipChange.ipc$dispatch("de3f6ae6", new Object[]{this});
        }
        return this.i;
    }

    public ChangeRecord d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChangeRecord) ipChange.ipc$dispatch("e83f8a4d", new Object[]{this});
        }
        return this.f;
    }

    public Map<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("753fee6a", new Object[]{this});
        }
        return this.g;
    }

    public NetInfo f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetInfo) ipChange.ipc$dispatch("59c3b6b7", new Object[]{this});
        }
        return this.e;
    }

    public List<PageInfo> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ce7854b1", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList(((ConcurrentHashMap) this.c).values());
        if (arrayList.size() < 10 && this.d.size() > 0) {
            arrayList.addAll(this.d);
        }
        Collections.sort(arrayList, new Comparator() { // from class: tb.pk7
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m;
                m = qk7.m((PageInfo) obj, (PageInfo) obj2);
                return m;
            }
        });
        if (arrayList.size() <= 10) {
            return arrayList;
        }
        return arrayList.subList(0, 10);
    }

    public PageInfo h(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageInfo) ipChange.ipc$dispatch("e37b5698", new Object[]{this, activity});
        }
        return (PageInfo) ((ConcurrentHashMap) this.c).get(PageInfo.getPageID(activity));
    }

    public bjo i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bjo) ipChange.ipc$dispatch("2438b406", new Object[]{this});
        }
        return this.h;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27bfbbb0", new Object[]{this});
        }
        PageInfo pageInfo = this.b;
        if (pageInfo != null) {
            return pageInfo.getPageID();
        }
        return null;
    }

    public PageInfo k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageInfo) ipChange.ipc$dispatch("c8528cc1", new Object[]{this});
        }
        return this.b;
    }

    public Boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("4dfc2a3c", new Object[]{this});
        }
        return this.f26793a;
    }

    public void n(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("190f31da", new Object[]{this, activity});
            return;
        }
        String pageID = PageInfo.getPageID(activity);
        PageInfo pageInfo = (PageInfo) ((ConcurrentHashMap) this.c).remove(pageID);
        if (pageInfo != null) {
            pageInfo.destroyTime = System.currentTimeMillis();
            if (((ConcurrentHashMap) this.c).size() < 10) {
                this.d.add(pageInfo);
            }
            idh.a("DiagnoseInfo", String.format("Remove page: %s(%s),  page list size: %d，history size: %d", pageInfo.getPageName(), pageID, Integer.valueOf(((ConcurrentHashMap) this.c).size()), Integer.valueOf(this.d.size())));
        }
        if (((ConcurrentHashMap) this.c).size() == 0) {
            this.b = null;
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f118fce7", new Object[]{this});
            return;
        }
        PageInfo pageInfo = this.b;
        if (pageInfo != null) {
            pageInfo.lastDisappearTime = System.currentTimeMillis();
        }
    }

    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a7e1fd", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f26793a = Boolean.valueOf(z);
        a.p("fact_background", Boolean.valueOf(z));
    }

    public void q(ChangeRecord changeRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61a94999", new Object[]{this, changeRecord});
        } else {
            this.f = changeRecord;
        }
    }

    public void r(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321cc93b", new Object[]{this, new Long(j)});
        }
    }

    public void s(NetInfo netInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("370b23d9", new Object[]{this, netInfo});
            return;
        }
        this.e = netInfo;
        a.p("fact_net_type", Integer.valueOf(netInfo.getType()));
        a.p("fact_net_status", Integer.valueOf(netInfo.getStatus()));
    }

    public void t(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fff39f73", new Object[]{this, fragment});
            return;
        }
        PageInfo pageInfo = this.b;
        if (pageInfo != null) {
            pageInfo.setPageFragment(fragment.getClass().getName());
        }
    }

    public void u(bjo bjoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d0cba54", new Object[]{this, bjoVar});
        } else {
            this.h = bjoVar;
        }
    }

    public void v(PageInfo pageInfo) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a54798f7", new Object[]{this, pageInfo});
            return;
        }
        pageInfo.lastAppearTime = System.currentTimeMillis();
        this.b = pageInfo;
        a.p("fact_current_page", pageInfo.getPageName());
        PageInfo pageInfo2 = this.b;
        if (pageInfo2 != null) {
            str = pageInfo2.getPageUrl();
        } else {
            str = "";
        }
        a.p("fact_current_page_url", str);
    }
}
