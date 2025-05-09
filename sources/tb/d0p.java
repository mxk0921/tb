package tb;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.topmultitab.service.searchbar.HomeSearchBarServiceImpl;
import com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class d0p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729810099);
    }

    public float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5411de93", new Object[]{this})).floatValue();
        }
        IHomeSearchBarService iHomeSearchBarService = (IHomeSearchBarService) c4b.i().h(IHomeSearchBarService.class);
        if (iHomeSearchBarService != null) {
            return iHomeSearchBarService.getCurrentSearchContainerHeightPX();
        }
        uqa.b("topMultiTab", "SearchBarCallback", "getSearchBarHeight, searchBarManager is null");
        return -1.0f;
    }

    public Map<String, Integer> c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5b799bd5", new Object[]{this, str, str2});
        }
        IHomeSearchBarService iHomeSearchBarService = (IHomeSearchBarService) c4b.i().h(IHomeSearchBarService.class);
        if (iHomeSearchBarService != null) {
            return b(iHomeSearchBarService, str2);
        }
        uqa.b("topMultiTab", "SearchBarCallback", "getSearchBarLocation, searchBarManager is null");
        return null;
    }

    public JSONObject d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c6c82363", new Object[]{this, new Integer(i)});
        }
        fve.e("SearchBarCallback", "getSelfTabInformation,position:" + i);
        JSONObject jSONObject = new JSONObject();
        if (i < 0) {
            fve.e("SearchBarCallback", "position<0,position:" + i);
            return jSONObject;
        }
        JSONObject m = e0p.m();
        if (m == null) {
            return jSONObject;
        }
        try {
            return m.getJSONObject(String.valueOf(i));
        } catch (Exception e) {
            fve.e("SearchBarCallback", "getCurrentTabInformation exception: " + e);
            return jSONObject;
        }
    }

    public JSONObject e(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cf42b524", new Object[]{this, iHomeSubTabController});
        }
        String g = g(iHomeSubTabController);
        if (!TextUtils.isEmpty(g)) {
            return ge2.b(g);
        }
        return null;
    }

    public JSONObject f(IHomeSubTabController iHomeSubTabController) {
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9450efb0", new Object[]{this, iHomeSubTabController});
        }
        String g = g(iHomeSubTabController);
        if (TextUtils.isEmpty(g) || (d = e0p.d()) == null) {
            return null;
        }
        if (f0p.a()) {
            return d;
        }
        JSONObject jSONObject = d.getJSONObject("subSection");
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject(g);
    }

    public final String g(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3a94e4a", new Object[]{this, iHomeSubTabController});
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService != null) {
            return iHomeControllerService.getSubControllerType(iHomeSubTabController);
        }
        return null;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e67f5875", new Object[]{this})).intValue();
        }
        IHomeSearchBarService iHomeSearchBarService = (IHomeSearchBarService) c4b.i().h(IHomeSearchBarService.class);
        if (iHomeSearchBarService != null) {
            return iHomeSearchBarService.getCurrentSearchContainerHeightPX() - HomeSearchBarServiceImpl.STATUS_HEIGHT_PX;
        }
        uqa.b("topMultiTab", "SearchBarCallback", "getTabBarHeight, searchBarManager is null");
        return -1;
    }

    public void i(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a79ae84a", new Object[]{this, iHomeSubTabController});
            return;
        }
        String g = g(iHomeSubTabController);
        uqa.b("topMultiTab", "SearchBarCallback", "setSubTabSearchBarData, subType : " + g);
        IHomeSearchBarService iHomeSearchBarService = (IHomeSearchBarService) c4b.i().h(IHomeSearchBarService.class);
        if (iHomeSearchBarService == null) {
            uqa.b("topMultiTab", "SearchBarCallback", "getTabBarHeight, searchBarManager is null");
        } else if (f(iHomeSubTabController) == null) {
            uqa.b("topMultiTab", "SearchBarCallback", "oldSubTab is null，不允许设置");
        } else {
            iHomeSearchBarService.forceRefreshSearchBar();
        }
    }

    public final Map<String, Integer> b(IHomeSearchBarService iHomeSearchBarService, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("910c6d24", new Object[]{this, iHomeSearchBarService, str});
        }
        DXRootView dX3SearchView = iHomeSearchBarService.getDX3SearchView();
        if (dX3SearchView == null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "getSearchBarSubViewLocation-> dxRootView为空，没有找到" + str);
            return null;
        }
        DXWidgetNode flattenWidgetNode = dX3SearchView.getFlattenWidgetNode();
        if (flattenWidgetNode == null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "getSearchBarSubViewLocation-> flattenWidgetNode为空，没有找到" + str);
            return null;
        }
        DXWidgetNode queryWidgetNodeByUserId = flattenWidgetNode.queryWidgetNodeByUserId(str);
        if (queryWidgetNodeByUserId == null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "getSearchBarSubViewLocation-> widgetNode为空，没有找到" + str);
            return null;
        }
        WeakReference<View> wRView = queryWidgetNodeByUserId.getWRView();
        if (wRView == null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "getSearchBarSubViewLocation-> weakReference为空，没有找到" + str);
            return null;
        }
        View view = wRView.get();
        if (view == null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "getSearchBarSubViewLocation-> 没有找到" + str + "对应的nativeView");
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        HashMap hashMap = new HashMap();
        hashMap.put("width", Integer.valueOf(view.getWidth()));
        hashMap.put("height", Integer.valueOf(view.getHeight()));
        hashMap.put("positionX", Integer.valueOf(iArr[0]));
        hashMap.put("positionY", Integer.valueOf(iArr[1]));
        fve.e(obq.SPLASH_BUSINESS_TAG, "getSearchBarSubViewLocation-> 找到了" + str + " 的坐标信息：" + hashMap);
        return hashMap;
    }
}
