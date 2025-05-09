package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.topmultitab.service.controller.a;
import com.taobao.tao.topmultitab.service.pulldown.IPullDownService;
import com.taobao.tao.topmultitab.service.view.IHomeViewService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class eqs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final wcc f18766a;
    public final IHomeViewService b;
    public final IHomeControllerService c;
    public boolean d;
    public IHomeSubTabController e;
    public String f;
    public final List<String> g;

    static {
        t2o.a(729810367);
    }

    public eqs(wcc wccVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.g = copyOnWriteArrayList;
        copyOnWriteArrayList.add("campaign");
        copyOnWriteArrayList.add(IHomeControllerService.HOME_TAB_ID_HOUR_DELIVERY);
        this.f18766a = wccVar;
        this.b = (IHomeViewService) wccVar.a(IHomeViewService.class);
        this.c = (IHomeControllerService) wccVar.a(IHomeControllerService.class);
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a99d79ee", new Object[]{this, str});
        } else if (!((CopyOnWriteArrayList) this.g).contains(str) || TextUtils.isEmpty(str)) {
            bqa.d("TabChangeObserver", "不是动态创建的容器，不重建");
        } else {
            this.c.registerHomeSubTabController(str);
        }
    }

    public final void c() {
        IHomeSubTabController realSubTabController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46fc2ec6", new Object[]{this});
            return;
        }
        IHomeControllerService iHomeControllerService = this.c;
        if (iHomeControllerService != null && (realSubTabController = iHomeControllerService.getRealSubTabController(this.b.getTypeByPos(0))) != null) {
            this.e = realSubTabController;
            realSubTabController.onPageSelected();
            s(realSubTabController);
        }
    }

    public final void d(List<JSONObject> list, List<JSONObject> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3394a3f", new Object[]{this, list, list2});
            return;
        }
        HashSet hashSet = new HashSet();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String e = rrs.e(list.get(i));
            if (!TextUtils.isEmpty(e)) {
                hashSet.add(e);
            }
        }
        HashSet hashSet2 = new HashSet();
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String e2 = rrs.e(list2.get(i2));
            if (!TextUtils.isEmpty(e2)) {
                hashSet2.add(e2);
            }
        }
        HashSet hashSet3 = new HashSet(hashSet2);
        hashSet3.removeAll(hashSet);
        Iterator it = hashSet3.iterator();
        while (it.hasNext()) {
            a((String) it.next());
        }
        HashSet hashSet4 = new HashSet(hashSet);
        hashSet4.removeAll(hashSet2);
        Iterator it2 = hashSet4.iterator();
        while (it2.hasNext()) {
            q((String) it2.next());
        }
    }

    public final List<JSONObject> e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3283d266", new Object[]{this, jSONObject});
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : new TreeMap(jSONObject).entrySet()) {
            JSONObject jSONObject2 = (JSONObject) entry.getValue();
            if (i(jSONObject2)) {
                arrayList.add(jSONObject2);
            }
        }
        return arrayList;
    }

    public final List<JSONObject> f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("48a2d21a", new Object[]{this, jSONObject});
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : new TreeMap(jSONObject).entrySet()) {
            arrayList.add((JSONObject) entry.getValue());
        }
        return arrayList;
    }

    public final boolean h(List<JSONObject> list, List<JSONObject> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b24a271c", new Object[]{this, list, list2})).booleanValue();
        }
        if (list.size() != list2.size()) {
            return true;
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            if (!TextUtils.equals(rrs.e(list2.get(i)), rrs.e(list.get(i)))) {
                return true;
            }
        }
        boolean e = kbq.e(Globals.getApplication());
        if (list.size() != list2.size() || e == this.d) {
            return false;
        }
        return true;
    }

    public final boolean i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b66af3d", new Object[]{this, jSONObject})).booleanValue();
        }
        if (this.c == null || this.c.getHomeSubTabController(rrs.e(jSONObject)) == null) {
            return false;
        }
        return true;
    }

    public final JSONObject j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("77f9e1e4", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("exContent");
        if (jSONObject2 != null) {
            return jSONObject2.getJSONObject("subContainerParam");
        }
        return null;
    }

    public final String k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("440ade6e", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            bqa.d("TabChangeObserver", "item == null");
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("content");
        if (jSONObject2 == null) {
            bqa.d("TabChangeObserver", "content == null");
            return null;
        }
        String string = jSONObject2.getString("dynamicTabVersionMd5");
        bqa.d("TabChangeObserver", "tabBar3VersionMd5: " + string);
        return string;
    }

    public final void l(List<JSONObject> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed514530", new Object[]{this, list, new Boolean(z)});
            return;
        }
        IHomeViewService iHomeViewService = this.b;
        if (iHomeViewService != null) {
            iHomeViewService.reSetTabItems(list, z);
            bqa.d("TabChangeObserver", "重新设置viewPagerAdapter");
        }
    }

    public final void o(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a7de2b", new Object[]{this, list});
            return;
        }
        for (JSONObject jSONObject : list) {
            String e = rrs.e(jSONObject);
            JSONObject j = j(jSONObject);
            if (!TextUtils.isEmpty(e)) {
                ge2.c(e, j);
            }
        }
    }

    public final void p(String str, List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2061418f", new Object[]{this, str, list});
            return;
        }
        IHomeControllerService iHomeControllerService = this.c;
        if (iHomeControllerService == null) {
            bqa.d("TabChangeObserver", "mControllerService == null");
            return;
        }
        IHomeSubTabController realSubTabController = iHomeControllerService.getRealSubTabController(str);
        if (realSubTabController == null) {
            bqa.d("TabChangeObserver", "通知页面刷新失败，homeSubTabController == null");
            return;
        }
        IHomeViewService iHomeViewService = this.b;
        if (iHomeViewService != null) {
            iHomeViewService.updateTabListData(list);
        }
        realSubTabController.notifyRefreshPage();
        bqa.d("TabChangeObserver", "通知页面刷新");
    }

    public final void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa76add1", new Object[]{this, str});
        } else if (!((CopyOnWriteArrayList) this.g).contains(str) || TextUtils.isEmpty(str)) {
            bqa.d("TabChangeObserver", "不是动态创建的容器，不销毁");
        } else {
            this.c.unRegisterHomeSubTabController(str);
        }
    }

    public final void s(IHomeSubTabController iHomeSubTabController) {
        IPullDownService iPullDownService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb107602", new Object[]{this, iHomeSubTabController});
            return;
        }
        wcc wccVar = this.f18766a;
        if (wccVar != null && (iPullDownService = (IPullDownService) wccVar.a(IPullDownService.class)) != null) {
            iPullDownService.setEnableToSecondFloor(iHomeSubTabController.isEnableToSecondFloor());
        }
    }

    public void t(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34d68223", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
            bqa.d("TabChangeObserver", "tabItems == null");
        } else {
            IHomeViewService iHomeViewService = this.b;
            if (iHomeViewService == null) {
                bqa.d("TabChangeObserver", "mHomeViewService == null");
                return;
            }
            List<JSONObject> tabItems = iHomeViewService.getTabItems();
            List<JSONObject> f = f(jSONObject);
            if (tabItems == null) {
                bqa.d("TabChangeObserver", "oldList == null");
                return;
            }
            if (h(tabItems, f)) {
                d(tabItems, f);
                List<JSONObject> e = e(jSONObject);
                o(e);
                b(tabItems, e);
            } else {
                bqa.d("TabChangeObserver", "tab类型没有变化");
                Map<Integer, String> g = g(tabItems, f);
                if (!g.isEmpty()) {
                    m(g, f);
                }
            }
            this.d = kbq.e(Globals.getApplication());
        }
    }

    public final void b(List<JSONObject> list, List<JSONObject> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c57c547", new Object[]{this, list, list2});
        } else if (!h(list, list2)) {
            bqa.d("TabChangeObserver", "tab没有变化，不需要重新设置adapter");
        } else {
            l(list2, false);
            r(list2);
            mdy.d(list2);
        }
    }

    public final void m(Map<Integer, String> map, List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5a1bb14", new Object[]{this, map, list});
            return;
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            String value = entry.getValue();
            int intValue = entry.getKey().intValue();
            IHomeViewService iHomeViewService = this.b;
            int currentTabIndex = iHomeViewService != null ? iHomeViewService.getCurrentTabIndex() : 0;
            bqa.a("TabChangeObserver", "重建tab, 类型是: " + value + " 当前的index: " + currentTabIndex + " 重建的index是：" + intValue);
            if (currentTabIndex == intValue) {
                p(value, list);
            } else {
                n(value, list, currentTabIndex);
            }
        }
    }

    public final void n(String str, List<JSONObject> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("785547ca", new Object[]{this, str, list, new Integer(i)});
        } else if (list.size() < i) {
            bqa.d("TabChangeObserver", "当前的index大于新的list的大小");
        } else {
            q(str);
            a(str);
            JSONObject jSONObject = list.get(i);
            l(list, true);
            String e = rrs.e(jSONObject);
            IHomeViewService iHomeViewService = this.b;
            if (iHomeViewService != null) {
                iHomeViewService.selectTab(e);
            }
            mdy.e(jSONObject);
            bqa.d("TabChangeObserver", "重建controller,通知viewPagerAdapter更新数据,当前选中的type是：" + e);
        }
    }

    public final void r(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ecaf28", new Object[]{this, list});
            return;
        }
        IHomeViewService iHomeViewService = this.b;
        if (iHomeViewService != null) {
            String defaultPageType = iHomeViewService.getDefaultPageType();
            this.b.selectTab(defaultPageType);
            bqa.d("TabChangeObserver", "tab变化了，选中默认type：" + defaultPageType);
            if (list.size() == 1) {
                bqa.d("TabChangeObserver", "补偿一次onPageSelected");
                this.b.compensateOnPageSelected(this.f);
            }
            if (a.e() && this.b.getPosByType(defaultPageType) == 0) {
                IHomeSubTabController iHomeSubTabController = this.e;
                if (iHomeSubTabController != null) {
                    iHomeSubTabController.onPageUnSelected();
                }
                this.f = defaultPageType;
                c();
            }
        }
    }

    public final Map<Integer, String> g(List<JSONObject> list, List<JSONObject> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7df64062", new Object[]{this, list, list2});
        }
        HashMap hashMap = new HashMap();
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            if (!TextUtils.equals(k(list2.get(i)), k(list.get(i)))) {
                hashMap.put(Integer.valueOf(i), rrs.e(list2.get(i)));
            }
        }
        bqa.d("TabChangeObserver", "md5改变的容器type有: " + hashMap.size() + "个");
        return hashMap;
    }
}
