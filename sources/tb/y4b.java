package tb;

import android.graphics.Rect;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.edlp.windvane.TBEdlpWVPlugin;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class y4b implements hdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809383);
        t2o.a(729809365);
    }

    public final boolean a(View view) {
        int i;
        int i2;
        boolean z;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de4e944f", new Object[]{this, view})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            return false;
        }
        Rect rect = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
        if (globalVisibleRect) {
            i = rect.height();
        } else {
            i = 0;
        }
        if (globalVisibleRect) {
            i2 = rect.width();
        } else {
            i2 = 0;
        }
        if (i2 / view.getWidth() <= 0.5d || i / view.getHeight() <= 0.5d) {
            z = false;
        } else {
            z = true;
        }
        IHomeSearchBarService iHomeSearchBarService = (IHomeSearchBarService) c4b.i().h(IHomeSearchBarService.class);
        if (iHomeSearchBarService != null) {
            i3 = iHomeSearchBarService.getCurrentSearchContainerHeightPX();
        } else {
            i3 = 0;
        }
        if (!z || rect.centerY() <= i3) {
            return false;
        }
        return true;
    }

    public final View d(String str, nsw nswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6b1333f4", new Object[]{this, str, nswVar});
        }
        z6d c = h2b.a().c();
        if (c == null) {
            nswVar.b("errorMessage", "android pageProvider is null");
            return null;
        } else if (c.q1() == null) {
            nswVar.b("errorMessage", "android pageManager is null");
            return null;
        } else {
            IHomeSearchBarService iHomeSearchBarService = (IHomeSearchBarService) c4b.i().h(IHomeSearchBarService.class);
            if (iHomeSearchBarService == null) {
                nswVar.b("errorMessage", "android pageManager is null");
                return null;
            }
            DXRootView dX3SearchView = iHomeSearchBarService.getDX3SearchView();
            if (dX3SearchView == null) {
                nswVar.b("errorMessage", "android DXRootView is null");
                return null;
            }
            DXWidgetNode expandWidgetNode = dX3SearchView.getExpandWidgetNode();
            if (expandWidgetNode == null) {
                nswVar.b("errorMessage", "android DXRootView is null");
                return null;
            }
            DXWidgetNode queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId(str);
            if (queryWidgetNodeByUserId == null) {
                nswVar.b("errorMessage", "android query userId DXWidgetNode  is null");
                return null;
            }
            DXRuntimeContext dXRuntimeContext = queryWidgetNodeByUserId.getDXRuntimeContext();
            if (dXRuntimeContext == null) {
                nswVar.b("errorMessage", "android DXRuntimeContext  is null");
                return null;
            }
            View D = dXRuntimeContext.D();
            if (D != null) {
                return D;
            }
            nswVar.b("errorMessage", "android getNativeView  is null");
            return null;
        }
    }

    @Override // tb.hdc
    public boolean e(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        return c(str2, wVCallBackContext);
    }

    @Override // tb.hdc
    public List<String> getActions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("39cd6eb9", new Object[]{this});
        }
        return Collections.singletonList("getHomePageViewPosition");
    }

    public final boolean b(View view, nsw nswVar, WVCallBackContext wVCallBackContext) {
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cab8c97e", new Object[]{this, view, nswVar, wVCallBackContext})).booleanValue();
        }
        if (view == null) {
            nswVar.b("errorMessage", "view is null");
            wVCallBackContext.error(nswVar);
            return false;
        }
        Rect rect = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
        if (rect.width() == view.getWidth()) {
            z = true;
        }
        if (!globalVisibleRect || !z) {
            str = "false";
        } else {
            str = "true";
        }
        nswVar.b("find", str);
        if (globalVisibleRect && z) {
            nswVar.a(TBEdlpWVPlugin.KEY_CENTER_X_RPX, Float.valueOf(a3b.g((rect.right + rect.left) / 2)));
            nswVar.a(TBEdlpWVPlugin.KEY_CENTER_Y_RPX, Float.valueOf(a3b.g((rect.bottom + rect.top) / 2)));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TBEdlpWVPlugin.KEY_LEFT_TOP_X_RPX, (Object) Float.valueOf(a3b.g(rect.left)));
            jSONObject.put(TBEdlpWVPlugin.KEY_LEFT_TOP_Y_RPX, (Object) Float.valueOf(a3b.g(rect.top)));
            jSONObject.put("rightBottomXRpx", (Object) Float.valueOf(a3b.g(rect.right)));
            jSONObject.put("rightBottomYRpx", (Object) Float.valueOf(a3b.g(rect.bottom)));
            jSONObject.put(TBEdlpWVPlugin.KEY_WIDTH_RPX, (Object) Float.valueOf(a3b.g(rect.right - rect.left)));
            jSONObject.put(TBEdlpWVPlugin.KEY_HEIGHT_RPX, (Object) Float.valueOf(a3b.g(rect.bottom - rect.top)));
            nswVar.a(TBEdlpWVPlugin.KEY_COMPONENT_AREA, jSONObject);
        }
        wVCallBackContext.success(nswVar);
        return true;
    }

    public final boolean c(String str, WVCallBackContext wVCallBackContext) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37027f64", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        String str2 = null;
        try {
            jSONObject = JSON.parseObject(str);
        } catch (Exception e) {
            uqa.b("Bridge", "getHomePageViewPosition", "parse params exception:" + e.getMessage());
            jSONObject = null;
        }
        nsw nswVar = new nsw();
        if (jSONObject == null || jSONObject.size() == 0) {
            nswVar.b("errorMessage", "params is empty");
            wVCallBackContext.error(nswVar);
            return false;
        }
        String string = jSONObject.getString("homePageViewId");
        if (TextUtils.isEmpty(string)) {
            wVCallBackContext.error(nswVar);
            return false;
        }
        if (string.contains("&")) {
            String[] split = string.split("&");
            String str3 = split[0];
            if (split.length >= 2) {
                str2 = split[1];
            }
            string = str3;
        }
        if (TextUtils.equals(string, "DXSearchBar")) {
            return b(d(str2, nswVar), nswVar, wVCallBackContext);
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService == null) {
            nswVar.b("errorMessage", "controllerService is null");
            wVCallBackContext.error(nswVar);
            return false;
        }
        IHomeSubTabController currentSubTabController = iHomeControllerService.getCurrentSubTabController();
        if (currentSubTabController == null) {
            nswVar.b("errorMessage", "homeSubTabController is null");
            wVCallBackContext.error(nswVar);
            return false;
        }
        View viewBySectionBizCodeAndItemBizCode = currentSubTabController.getViewBySectionBizCodeAndItemBizCode(string, str2);
        if (TextUtils.equals(string, "categoryTab")) {
            return b(viewBySectionBizCodeAndItemBizCode, nswVar, wVCallBackContext);
        }
        if (a(viewBySectionBizCodeAndItemBizCode)) {
            return b(viewBySectionBizCodeAndItemBizCode, nswVar, wVCallBackContext);
        }
        nswVar.b("errorMessage", "view is null");
        wVCallBackContext.error(nswVar);
        return false;
    }
}
