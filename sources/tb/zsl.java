package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zsl implements hdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f32992a = Pattern.compile("&");

    static {
        t2o.a(729809385);
        t2o.a(729809365);
    }

    public final boolean a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4171a100", new Object[]{this, str, jSONObject})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || jSONObject == null) {
            return false;
        }
        return true;
    }

    public final long c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c030debc", new Object[]{this, jSONObject})).longValue();
        }
        String string = jSONObject.getString("effectiveTime");
        if (TextUtils.isEmpty(string)) {
            fve.e("PassThroughDataHandler", "effectiveTime == null");
            return -1L;
        }
        try {
            return Long.parseLong(string);
        } catch (Exception e) {
            fve.e("PassThroughDataHandler", "出现异常: " + e);
            return -1L;
        }
    }

    public final boolean g(String str, String str2, v7d v7dVar) {
        IHomeSubTabController currentSubTabController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4b1ac4c", new Object[]{this, str, str2, v7dVar})).booleanValue();
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService == null || (currentSubTabController = iHomeControllerService.getCurrentSubTabController()) == null) {
            return false;
        }
        currentSubTabController.passThroughData(v7dVar, str, str2);
        return true;
    }

    @Override // tb.hdc
    public List<String> getActions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("39cd6eb9", new Object[]{this});
        }
        return Collections.singletonList("passThroughData");
    }

    public final boolean h(v7d v7dVar, String str) {
        IHomeControllerService iHomeControllerService;
        IHomeSubTabController realSubTabController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5887a15", new Object[]{this, v7dVar, str})).booleanValue();
        }
        String b = b(str);
        if (TextUtils.isEmpty(b) || (iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class)) == null || (realSubTabController = iHomeControllerService.getRealSubTabController(b)) == null) {
            return false;
        }
        realSubTabController.passThroughData(v7dVar, null, null);
        return true;
    }

    public final boolean i(String str, String str2, v7d v7dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4aa6e568", new Object[]{this, str, str2, v7dVar})).booleanValue();
        }
        if (TextUtils.equals(str, "DXSearchBar")) {
            return h(v7dVar, str2);
        }
        return g(str, str2, v7dVar);
    }

    @Override // tb.hdc
    public boolean e(String str, String str2, WVCallBackContext wVCallBackContext) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = JSON.parseObject(str2);
        } catch (Exception e) {
            fve.e("PassThroughDataHandler", "parse string exception: " + e);
        }
        if (jSONObject == null) {
            str3 = "";
        } else {
            str3 = jSONObject.getString("homePageViewId");
        }
        JSONObject jSONObject2 = jSONObject == null ? null : jSONObject.getJSONObject("data");
        atl atlVar = new atl(jSONObject2, jSONObject == null ? 0L : c(jSONObject));
        String f = f(str3);
        String d = d(str3);
        nsw nswVar = new nsw();
        if (!a(f, jSONObject2)) {
            fve.e("PassThroughDataHandler", "参数不合法，sectionBizCode或者passData为空，sectionBizCode： " + f);
            nswVar.b("errorMessage", "参数不合法，sectionBizCode或者passData为空");
            wVCallBackContext.error(nswVar);
            return false;
        }
        wVCallBackContext.success();
        return i(f, d, atlVar);
    }

    public final String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1191de1", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            fve.e("PassThroughDataHandler", "parseSectionBizCode homePageViewId == null");
            return null;
        } else if (!str.contains("&")) {
            fve.e("PassThroughDataHandler", "parseSectionBizCode homePageViewId 里没有&");
            return str;
        } else {
            String str2 = f32992a.split(str)[0];
            fve.e("PassThroughDataHandler", "parseSectionBizCode sectionBizCode: " + str2);
            return str2;
        }
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8bbc3d68", new Object[]{this, str});
        }
        List<JSONObject> f = e0p.f();
        String str2 = null;
        for (int i = 0; i < f.size(); i++) {
            JSONObject jSONObject = f.get(i).getJSONObject("content");
            if (jSONObject != null && TextUtils.equals(jSONObject.getString("tabContentID"), str)) {
                str2 = jSONObject.getString("type");
            }
        }
        return str2;
    }

    public final String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4cbc1e95", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            fve.e("PassThroughDataHandler", "parseItemBizCode homePageViewId == null");
            return null;
        } else if (!str.contains("&")) {
            fve.e("PassThroughDataHandler", "parseItemBizCode homePageViewId 里没有&");
            return null;
        } else {
            String[] split = f32992a.split(str);
            if (split.length < 2) {
                return null;
            }
            String str2 = split[1];
            fve.e("PassThroughDataHandler", "parseItemBizCode itemBizCode: " + str2);
            return str2;
        }
    }
}
