package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.homepage.utils.UiDisplayDetector;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class u3b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "Page_Home";
    public static final String MONITOR_POINT = "searchbar_ui_monitor";
    public static final String UI_MODULE_SEARCH_BAR = "searchBar";

    /* renamed from: a  reason: collision with root package name */
    public final UiDisplayDetector f29109a = new UiDisplayDetector();

    static {
        t2o.a(729809112);
    }

    public void a(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c777840a", new Object[]{this, dXRootView});
        } else if (b() && TextUtils.equals(yyj.e().f(), z4a.NEW_FACE_PARENT.f32522a)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bqa.d("HomeSearchUiMonitor", "start ui detect");
            DXTemplateItem dxTemplateItem = dXRootView.getDxTemplateItem();
            int a2 = this.f29109a.a(dXRootView);
            if (a2 != 0) {
                String c = c(a2);
                g(UI_MODULE_SEARCH_BAR, "uiError", dxTemplateItem, c, c);
                bqa.d("HomeSearchUiMonitor", "doUiDetectInternal DxRootView errorType = " + a2);
            }
            DXWidgetNode expandWidgetNode = dXRootView.getExpandWidgetNode();
            if (expandWidgetNode != null) {
                if (e()) {
                    View d = d(expandWidgetNode.queryWidgetNodeByUserId("searchContainer"));
                    if (d != null) {
                        int a3 = this.f29109a.a(d);
                        if (a3 != 0) {
                            String c2 = c(a3);
                            g(cpj.SEARCH_BOX, "uiError", dxTemplateItem, c2, c2);
                            bqa.d("HomeSearchUiMonitor", "doUiDetectInternal searchBarContainer errorType = " + a3);
                        }
                    } else {
                        bqa.d("HomeSearchUiMonitor", "doUiDetectInternal not found searchBarContainer");
                    }
                }
                View d2 = d(expandWidgetNode.queryWidgetNodeByUserId("home_scroll"));
                if (d2 != null) {
                    int a4 = this.f29109a.a(d2);
                    if (a4 != 0) {
                        String c3 = c(a4);
                        g("tab", "uiError", dxTemplateItem, c3, c3);
                        bqa.d("HomeSearchUiMonitor", "doUiDetectInternal tab errorType = " + a4);
                    }
                } else {
                    bqa.d("HomeSearchUiMonitor", "doUiDetectInternal not found tabs");
                }
                View d3 = d(expandWidgetNode.queryWidgetNodeByUserId("tab1TextSelected"));
                if (d3 == null || !e()) {
                    bqa.d("HomeSearchUiMonitor", "doUiDetectInternal not found recommend selected tab");
                } else {
                    int a5 = this.f29109a.a(d3);
                    if (a5 != 0) {
                        g("tab", "selectedStateError", dxTemplateItem, "tabSelectedError", "tabSelectedError");
                        bqa.d("HomeSearchUiMonitor", "doUiDetectInternal selectedTab errorType = " + a5);
                    }
                }
                bqa.d("HomeSearchUiMonitor", "end ui detect cost = " + (SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfbb563c", new Object[]{this})).booleanValue();
        }
        return f4b.b("enableSearchBarUiMonitor", true);
    }

    public final View d(DXWidgetNode dXWidgetNode) {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("582653f2", new Object[]{this, dXWidgetNode});
        }
        if (dXWidgetNode == null || (dXRuntimeContext = dXWidgetNode.getDXRuntimeContext()) == null) {
            return null;
        }
        return dXRuntimeContext.D();
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afb30a61", new Object[]{this})).booleanValue();
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService != null) {
            return iHomeControllerService.isAtRecommendTab();
        }
        return false;
    }

    public void f(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5fd9425", new Object[]{this, dXTemplateItem});
        } else {
            g(UI_MODULE_SEARCH_BAR, "uiError", dXTemplateItem, "viewCreateError", "viewCreateError");
        }
    }

    public void g(String str, String str2, DXTemplateItem dXTemplateItem, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf9b386", new Object[]{this, str, str2, dXTemplateItem, str3, str4});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("module", (Object) str);
        jSONObject.put("errorType", (Object) str2);
        Object obj = "";
        jSONObject.put(yh6.CONFIG_KEY_TEMPLATE_NAME, dXTemplateItem == null ? obj : dXTemplateItem.f7343a);
        if (dXTemplateItem != null) {
            obj = Long.valueOf(dXTemplateItem.b);
        }
        jSONObject.put("templateVersion", obj);
        AppMonitor.Alarm.commitFail("Page_Home", MONITOR_POINT, jSONObject.toJSONString(), str3, str4);
    }

    public final String c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("837bea21", new Object[]{this, new Integer(i)});
        }
        if (i == 1) {
            return "viewInvisible";
        }
        if (i == 2) {
            return "viewSizeError";
        }
        if (i == 3) {
            return "viewFrameError";
        }
        if (i == 4) {
            return "viewAlphaError";
        }
        if (i != 5) {
            return "unknownError";
        }
        return "viewChildrenError";
    }
}
