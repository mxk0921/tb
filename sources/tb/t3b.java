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
import com.taobao.tao.Globals;
import com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class t3b implements hdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809377);
        t2o.a(729809365);
    }

    public final float c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da4d1036", new Object[]{this, new Float(f)})).floatValue();
        }
        if (Float.isNaN(f)) {
            return f;
        }
        float g = (f * 750.0f) / owo.g(Globals.getApplication());
        if (g <= 0.005d || g >= 1.0f) {
            return d(g);
        }
        return 1.0f;
    }

    public final float d(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54050d11", new Object[]{this, new Float(f)})).floatValue();
        }
        try {
            return new BigDecimal(Float.toString(f)).setScale(4, RoundingMode.HALF_UP).floatValue();
        } catch (Throwable th) {
            fve.c("HomeSearchBarJsFeature", "getRpxFloat error", th);
            return 0.0f;
        }
    }

    @Override // tb.hdc
    public boolean e(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.equals(str, "getNaviBarHeight")) {
            return b(wVCallBackContext);
        }
        if (TextUtils.equals(str, "findDxViewInSearchBarPositionById")) {
            return a(str2, wVCallBackContext);
        }
        return false;
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5411de96", new Object[]{this})).intValue();
        }
        try {
            IHomeSearchBarService iHomeSearchBarService = (IHomeSearchBarService) c4b.i().h(IHomeSearchBarService.class);
            if (iHomeSearchBarService == null) {
                return 0;
            }
            return iHomeSearchBarService.getCurrentSearchContainerHeightPX();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // tb.hdc
    public List<String> getActions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("39cd6eb9", new Object[]{this});
        }
        return Arrays.asList("findDxViewInSearchBarPositionById", "getNaviBarHeight");
    }

    public final boolean a(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f676121", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        JSONObject parseObject = JSON.parseObject(str);
        nsw nswVar = new nsw();
        if (parseObject == null || parseObject.size() == 0) {
            nswVar.b("errorMessage", "params is empty");
            wVCallBackContext.error(nswVar);
            return false;
        }
        String string = parseObject.getString("userId");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        z6d c = h2b.a().c();
        if (c == null) {
            nswVar.b("errorMessage", "android pageProvider is null");
            wVCallBackContext.error(nswVar);
            return false;
        } else if (c.q1() == null) {
            nswVar.b("errorMessage", "android pageManager is null");
            wVCallBackContext.error(nswVar);
            return false;
        } else {
            IHomeSearchBarService iHomeSearchBarService = (IHomeSearchBarService) c4b.i().h(IHomeSearchBarService.class);
            if (iHomeSearchBarService == null) {
                nswVar.b("errorMessage", "android pageManager is null");
                wVCallBackContext.error(nswVar);
                return false;
            }
            DXRootView dX3SearchView = iHomeSearchBarService.getDX3SearchView();
            if (dX3SearchView == null) {
                nswVar.b("errorMessage", "android DXRootView is null");
                wVCallBackContext.error(nswVar);
                return false;
            }
            DXWidgetNode expandWidgetNode = dX3SearchView.getExpandWidgetNode();
            if (expandWidgetNode == null) {
                nswVar.b("errorMessage", "android DXRootView is null");
                wVCallBackContext.error(nswVar);
                return false;
            }
            DXWidgetNode queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId(string);
            if (queryWidgetNodeByUserId == null) {
                nswVar.b("errorMessage", "android query userId DXWidgetNode  is null");
                wVCallBackContext.error(nswVar);
                return false;
            }
            DXRuntimeContext dXRuntimeContext = queryWidgetNodeByUserId.getDXRuntimeContext();
            if (dXRuntimeContext == null) {
                nswVar.b("errorMessage", "android DXRuntimeContext  is null");
                wVCallBackContext.error(nswVar);
                return false;
            }
            View D = dXRuntimeContext.D();
            if (D == null) {
                nswVar.b("errorMessage", "android getNativeView  is null");
                wVCallBackContext.error(nswVar);
                return false;
            }
            Rect rect = new Rect();
            D.getGlobalVisibleRect(rect);
            nswVar.a("rpxLeft", Float.valueOf(a3b.g(rect.left)));
            nswVar.a("rpxRight", Float.valueOf(a3b.g(rect.right)));
            nswVar.a("rpxBottom", Float.valueOf(a3b.g(rect.bottom)));
            nswVar.a("rpxTop", Float.valueOf(a3b.g(rect.top)));
            wVCallBackContext.success(nswVar);
            return true;
        }
    }

    public final boolean b(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f446fb1", new Object[]{this, wVCallBackContext})).booleanValue();
        }
        nsw nswVar = new nsw();
        int f = f();
        if (f <= 0) {
            wVCallBackContext.error();
            uqa.b("Bridge", "getHomePageNaviBar", "error: height小于0");
            return false;
        }
        nswVar.a("height", Integer.valueOf(f));
        nswVar.a("rpxHeight", Float.valueOf(c(f)));
        wVCallBackContext.success(nswVar);
        uqa.b("Bridge", "getHomePageNaviBar", "success. height:" + f);
        return true;
    }
}
