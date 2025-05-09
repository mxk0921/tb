package com.taobao.tao.topmultitab.view;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.bqa;
import tb.c4b;
import tb.ddv;
import tb.f4b;
import tb.h2b;
import tb.hrg;
import tb.rrs;
import tb.t2o;
import tb.uqa;
import tb.vxl;
import tb.z6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HomeViewPagerAdapter extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ViewPager e;
    public boolean h;

    /* renamed from: a  reason: collision with root package name */
    public List<JSONObject> f12868a = new ArrayList();
    public String b = "home";
    public Map<String, View> c = new HashMap();
    public final LinkedList<Integer> d = new LinkedList<>();
    public final List<String> f = new LinkedList();
    public final List<String> g = new LinkedList();

    static {
        t2o.a(729810410);
    }

    public HomeViewPagerAdapter(ViewPager viewPager) {
        this.e = viewPager;
    }

    public static /* synthetic */ Object ipc$super(HomeViewPagerAdapter homeViewPagerAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/view/HomeViewPagerAdapter");
    }

    public void B() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5777d26c", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.f12868a.size(); i++) {
            String e = rrs.e(this.f12868a.get(i));
            if (!(e == null || (view = this.c.get(e)) == null)) {
                A(view, e);
            }
        }
    }

    public void C(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fe32d0c", new Object[]{this, list});
        } else {
            this.f12868a = list;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
        } else if (obj instanceof View) {
            v(viewGroup, (View) obj);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<JSONObject> list = this.f12868a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
        }
        if ((obj instanceof View) && !this.c.containsKey((String) ((View) obj).getTag())) {
            return -2;
        }
        return -1;
    }

    public void h(int i) {
        List<JSONObject> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdde1f03", new Object[]{this, new Integer(i)});
        } else if (vxl.g() && (list = this.f12868a) != null) {
            if (i >= list.size() || i < 0) {
                bqa.d("HomeViewPagerAdapter", "tabItems size: " + this.f12868a.size() + "pos: " + i);
                return;
            }
            View view = (View) ((HashMap) this.c).get(rrs.e(this.f12868a.get(i)));
            if (view instanceof WrapFrameLayout) {
                bqa.d("HomeViewPagerAdapter", "创建视图 pos: " + i);
                ((WrapFrameLayout) view).addTabView();
            }
        }
    }

    public final Activity i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        z6d c = h2b.a().c();
        if (c != null) {
            return c.k1();
        }
        bqa.d("HomeViewPagerAdapter", "getActivity pageProvider == null");
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue();
        }
        if (view == obj) {
            return true;
        }
        return false;
    }

    public List<String> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("38c318dc", new Object[]{this});
        }
        List<JSONObject> o = o();
        if (o == null || o.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (JSONObject jSONObject : o) {
            String e = rrs.e(jSONObject);
            if (!TextUtils.isEmpty(e)) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    public final Context k(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("6fc3c04a", new Object[]{this, view});
        }
        Context context = TBMainHost.b().getContext();
        bqa.d("HomeViewPagerAdapter", "getContext: " + context);
        if (context != null) {
            return context;
        }
        Activity i = i();
        bqa.d("HomeViewPagerAdapter", "getActivity: " + i);
        if (i != null) {
            return i;
        }
        Context context2 = view.getContext();
        bqa.d("HomeViewPagerAdapter", "getViewContainer: " + context2);
        return context2;
    }

    public IHomeSubTabController l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("f6ed7b88", new Object[]{this, str});
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService == null) {
            return null;
        }
        bqa.d("HomeViewPagerAdapter", "getHomeSubTabController subTabFlag：" + str);
        return iHomeControllerService.getHomeSubTabController(str);
    }

    public IHomeSubTabController n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("60b82b66", new Object[]{this, new Integer(i)});
        }
        List<JSONObject> list = this.f12868a;
        if (list == null || i >= list.size() || i < 0) {
            bqa.d("HomeViewPagerAdapter", "getSubTabController tabItems == null");
            return null;
        }
        String e = rrs.e(this.f12868a.get(i));
        bqa.d("HomeViewPagerAdapter", "getSubTabController position：" + i + ",subType：" + e);
        if (!TextUtils.isEmpty(e)) {
            return l(e);
        }
        bqa.d("HomeViewPagerAdapter", "getSubTabController subType == null");
        return null;
    }

    public List<JSONObject> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("63ca769f", new Object[]{this});
        }
        return this.f12868a;
    }

    public String p(int i) {
        List<JSONObject> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3971c9b1", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || (list = this.f12868a) == null || i >= list.size()) {
            return null;
        }
        return rrs.e(this.f12868a.get(i));
    }

    public final View q(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d72ddc72", new Object[]{this, context, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (vxl.g()) {
            WrapFrameLayout wrapFrameLayout = new WrapFrameLayout(context);
            wrapFrameLayout.setType(str);
            wrapFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return wrapFrameLayout;
        }
        IHomeSubTabController l = l(str);
        if (l != null) {
            return l.createView(context);
        }
        return null;
    }

    public void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf8c9ed", new Object[]{this, str});
        } else if (this.c.containsKey(str)) {
            this.c.remove(str);
            ((LinkedList) this.f).add(str);
            bqa.d("HomeViewPagerAdapter", "reRenderItem： " + str);
            notifyDataSetChanged();
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.f12868a.clear();
        this.c.clear();
        this.d.clear();
        ((LinkedList) this.f).clear();
        this.b = "home";
        bqa.d("HomeViewPagerAdapter", DMComponent.RESET);
    }

    public void x(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f39abb1f", new Object[]{this, jSONObject});
        } else {
            y(rrs.e(jSONObject));
        }
    }

    public final void A(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a22c795d", new Object[]{this, view, str});
        } else if (r(str)) {
            view.setPadding(0, 0, 0, 0);
        } else {
            bqa.d("HomeViewPagerAdapter", "tabViewPaddingProcess,type: " + str);
            D(view);
        }
    }

    public final void D(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70031c68", new Object[]{this, view});
            return;
        }
        IHomeSearchBarService iHomeSearchBarService = (IHomeSearchBarService) c4b.i().h(IHomeSearchBarService.class);
        if (iHomeSearchBarService != null) {
            int currentSearchContainerHeightPX = iHomeSearchBarService.getCurrentSearchContainerHeightPX();
            bqa.d("HomeViewPagerAdapter", "tabViewPaddingProcess,searchBarHeight: " + currentSearchContainerHeightPX);
            view.setPadding(0, currentSearchContainerHeightPX, 0, 0);
        }
    }

    public final void v(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15235c15", new Object[]{this, viewGroup, view});
            return;
        }
        boolean b = f4b.b("enableRemoveViewPagerViewWhenDestroyItem", true);
        bqa.d("HomeViewPagerAdapter", "enableRemoveView " + b);
        if (b) {
            Object tag = view.getTag();
            if ((tag instanceof String) && ((LinkedList) this.f).contains(tag)) {
                viewGroup.removeView(view);
                ((LinkedList) this.f).remove(tag);
                bqa.d("HomeViewPagerAdapter", "重新render上屏销毁之前的，subTabType： " + tag);
            }
        }
    }

    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ee4317b", new Object[]{this, str});
            return;
        }
        int m = m(str);
        bqa.d("HomeViewPagerAdapter", "setCurrentItem=" + str + ", pos=" + m);
        if (m != -1) {
            u(m);
            this.e.setCurrentItem(m, false);
        }
    }

    public int m(String str) {
        List<JSONObject> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b131bfe3", new Object[]{this, str})).intValue();
        }
        if (!(str == null || (list = this.f12868a) == null || list.isEmpty())) {
            for (int i = 0; i < this.f12868a.size(); i++) {
                JSONObject jSONObject = this.f12868a.get(i).getJSONObject("content");
                if (jSONObject != null) {
                    String d = rrs.d(jSONObject.getString("type"), jSONObject);
                    if (str.equals(jSONObject.getString("type")) || str.equals(d)) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public final boolean r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28058b9", new Object[]{this, str})).booleanValue();
        }
        return TextUtils.equals("subscribe", str) || ((LinkedList) this.g).contains(str);
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        bqa.d("HomeViewPagerAdapter", "onDestroy");
        int count = getCount();
        if (count <= 0) {
            bqa.d("HomeViewPagerAdapter", "onDestroy count <= 0");
            return;
        }
        for (int i = 0; i < count; i++) {
            IHomeSubTabController n = n(i);
            bqa.d("HomeViewPagerAdapter", "onDestroy 当前的controller： " + n);
            if (n != null) {
                n.onDestroy();
            }
        }
    }

    public final void u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3006505b", new Object[]{this, new Integer(i)});
        } else if (!f4b.b("enableRemoveSubscribeTabOnChanged", true)) {
            bqa.d("HomeViewPagerAdapter", "removeSubscribeTabOnDefaultChanged 开关关闭");
        } else if (!this.h) {
            bqa.d("HomeViewPagerAdapter", "removeSubscribeTabOnDefaultChanged 未重置数据");
        } else {
            this.h = false;
            int currentItem = this.e.getCurrentItem();
            bqa.d("HomeViewPagerAdapter", "removeSubscribeTab currentItem:" + currentItem + ",position:" + i);
            if (currentItem != i) {
                this.c.remove("subscribe");
                notifyDataSetChanged();
            }
        }
    }

    public synchronized void z(List<JSONObject> list, boolean z) {
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("79d3b0cf", new Object[]{this, list, new Boolean(z)});
            } else if (list != null) {
                C(list);
                HashMap hashMap = new HashMap();
                for (int i = 0; i < list.size(); i++) {
                    JSONObject jSONObject = list.get(i);
                    JSONObject jSONObject2 = jSONObject.getJSONObject("content");
                    if (jSONObject2 != null) {
                        String e = rrs.e(jSONObject);
                        View view = this.c.get(e);
                        if (view != null) {
                            hashMap.put(e, view);
                        }
                        if (jSONObject2.getBooleanValue("isImmersive")) {
                            ((LinkedList) this.g).add(e);
                        }
                        if (jSONObject2.getBooleanValue("isDefault")) {
                            this.b = e;
                        }
                        if (!f4b.b("fixViewPagerAdapter", true)) {
                            this.c = hashMap;
                        }
                        bqa.a("HomeViewPagerAdapter", "updateTabContainerData defaultPage : " + this.b);
                    }
                }
                if (f4b.b("fixViewPagerAdapter", true)) {
                    this.c = hashMap;
                    if (z) {
                        hashMap.remove("campaign");
                    }
                }
                this.h = true;
                bqa.a("HomeViewPagerAdapter", "defaultPage : " + this.b);
                notifyDataSetChanged();
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        hrg.e("componentRender", "HomeViewPagerAdapter", "instantiateItem postion=" + i);
        String e = rrs.e(this.f12868a.get(i));
        bqa.d("HomeViewPagerAdapter", "instantiateItem : " + i + ", type : " + e);
        View view = (View) ((HashMap) this.c).get(e);
        if (view == null) {
            view = q(k(viewGroup), e);
            if (!(view == null || view.getParent() == null)) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            view.setTag(e);
            ((HashMap) this.c).put(e, view);
        }
        int intValue = this.d.size() > 0 ? this.d.get(0).intValue() : -1;
        int intValue2 = this.d.size() > 1 ? this.d.get(1).intValue() : -1;
        if (i < intValue) {
            this.d.add(0, Integer.valueOf(i));
        } else if (i <= intValue || i >= intValue2) {
            this.d.add(Integer.valueOf(i));
            i2 = -1;
        } else {
            this.d.add(1, Integer.valueOf(i));
            i2 = 1;
        }
        if (view.getParent() != null) {
            try {
                ((ViewGroup) view.getParent()).removeView(view);
            } catch (Exception e2) {
                String message = e2.getMessage();
                ddv.h("HomeViewPagerAdapter", "2.0", "instantiateItem", " remove exception:" + message, "", "");
                uqa.b("topMultiTab", "HomeViewPageAdapter", "HomeViewPagerAdapter.instantiateItem removeView exception: " + message);
            }
        }
        A(view, e);
        if (vxl.g() && (view instanceof WrapFrameLayout) && i == this.e.getCurrentItem()) {
            ((WrapFrameLayout) view).addTabView();
        }
        try {
            viewGroup.addView(view, i2);
        } catch (Exception e3) {
            String message2 = e3.getMessage();
            ddv.h("HomeViewPagerAdapter", "2.0", "instantiateItem", " addView exception:" + message2, "", "");
            uqa.b("topMultiTab", "HomeViewPageAdapter", "HomeViewPagerAdapter.instantiateItem addView exception: " + message2);
        }
        return view;
    }
}
