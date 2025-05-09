package com.alipay.mobile.monitor.track.spm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum TrackerHelper {
    instance;
    

    /* renamed from: a  reason: collision with root package name */
    private final String f4271a = TrackerHelper.class.getSimpleName();
    private final String b = "?";
    private final String c = "=";
    private final String d = "&";
    private Map<String, TrackerParams> e = new ConcurrentHashMap();
    private List<String> f = new ArrayList<String>() { // from class: com.alipay.mobile.monitor.track.spm.TrackerHelper.1
        {
            add("a14.b62");
            add("a13.b42");
            add("a18.b64");
            add("a108.b553");
            add("a315.b3675");
            add("a21.b375");
        }
    };

    /* compiled from: Taobao */
    @MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class TrackerParams {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String chInfo;
        public String lanInfo;
        public String pageBack = "0";
        public String srcSem;

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "chInfo:" + this.chInfo + ";srcSem:" + this.srcSem + ";lanInfo:" + this.lanInfo + ";";
        }
    }

    TrackerHelper(String str) {
    }

    private static String a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2)) {
            return str;
        }
        if (!str.contains("?")) {
            return str + "?" + str2 + "=" + str3;
        }
        if (str.contains("&" + str2 + "=")) {
            return str;
        }
        return str + "&" + str2 + "=" + str3;
    }

    private void b(Object obj) {
        Bundle bundle = null;
        if (obj instanceof Activity) {
            Intent intent = ((Activity) obj).getIntent();
            if (intent != null) {
                bundle = intent.getExtras();
            }
        } else if (obj instanceof Fragment) {
            bundle = ((Fragment) obj).getArguments();
        }
        String str = "";
        if (bundle != null) {
            try {
                bundle.setClassLoader(obj.getClass().getClassLoader());
                str = bundle.getString("srcSpm");
            } catch (Exception e) {
                String str2 = this.f4271a;
                SpmLogCator.warn(str2, "checkSrcSpm exception:" + e.toString());
            }
        }
        if (TextUtils.isEmpty(str)) {
            PageInfo c = c(obj);
            if (c == null) {
                return;
            }
            if (TextUtils.isEmpty(c.lastClickSpm)) {
                str = c.spm;
            } else {
                str = c.lastClickSpm;
            }
        }
        updateSrcSpm(obj, str);
    }

    private static PageInfo c(Object obj) {
        PageInfo g2 = g(obj);
        if (g2 != null) {
            return g2.referPageInfo;
        }
        return null;
    }

    private void d(Object obj) {
        TrackerParams trackerParams = this.e.get(SpmUtils.objectToString(obj));
        if (trackerParams != null) {
            trackerParams.chInfo = null;
        }
    }

    private void e(Object obj) {
        String objectToString = SpmUtils.objectToString(obj);
        if (this.e.containsKey(objectToString)) {
            this.e.remove(objectToString);
        }
    }

    private boolean f(Object obj) {
        if (obj != null) {
            SpmMonitor spmMonitor = SpmMonitor.INTANCE;
            if (spmMonitor.getTopPage() != null) {
                if ("com.alipay.android.launcher.core.IBaseWidgetGroup".equals(obj.getClass().getSuperclass().getName()) && "com.alipay.android.launcher.core.IBaseWidgetGroup".equals(spmMonitor.getTopPage().getClass().getSuperclass().getName())) {
                    return true;
                }
                PageInfo pageInfoByView = SpmTrackIntegrator.getInstance().getPageInfoByView(obj);
                PageInfo pageMonitorCurrentPageInfo = SpmTrackIntegrator.getInstance().getPageMonitorCurrentPageInfo();
                if (pageMonitorCurrentPageInfo != null && pageInfoByView != null && this.f.contains(pageInfoByView.spm) && this.f.contains(pageMonitorCurrentPageInfo.spm)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static PageInfo g(Object obj) {
        return SpmTrackIntegrator.getInstance().getPageInfoByView(h(obj));
    }

    private static Object h(Object obj) {
        if ((obj instanceof Activity) || !(obj instanceof ContextThemeWrapper) || SpmTrackIntegrator.getInstance().getPageInfoByView(obj) != null) {
            return obj;
        }
        return ((ContextThemeWrapper) obj).getBaseContext();
    }

    public final void checkIsPageBack(Object obj) {
        PageInfo pageInfo;
        PageInfo pageInfoByView = SpmTrackIntegrator.getInstance().getPageInfoByView(obj);
        PageInfo pageMonitorCurrentPageInfo = SpmTrackIntegrator.getInstance().getPageMonitorCurrentPageInfo();
        TrackerParams trackerParams = getTrackerParams(obj);
        if (trackerParams == null) {
            trackerParams = new TrackerParams();
            this.e.put(SpmUtils.objectToString(obj), trackerParams);
        }
        if (pageMonitorCurrentPageInfo == null || pageInfoByView == null || (pageInfo = pageMonitorCurrentPageInfo.referPageInfo) == null || !pageInfo.pageId.equals(pageInfoByView.pageId) || f(obj)) {
            trackerParams.pageBack = "0";
        } else {
            trackerParams.pageBack = "1";
        }
    }

    public final String getLastClickSem(Object obj) {
        SpmLogCator.debug(this.f4271a, "getLastClickSemInfo page:".concat(String.valueOf(obj)));
        PageInfo g2 = g(obj);
        if (g2 == null) {
            return "";
        }
        String str = this.f4271a;
        SpmLogCator.debug(str, "getLastClickSemInfo pageInfo.lastClickSem:" + g2.lastClickSem);
        String str2 = g2.lastClickSem;
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final String getLastClickSpmId() {
        String lastClickViewSpm = SpmTrackIntegrator.getInstance().getLastClickViewSpm();
        if (TextUtils.isEmpty(lastClickViewSpm)) {
            return "";
        }
        return lastClickViewSpm;
    }

    public final String getLastClickSpmIdByPage(Object obj) {
        PageInfo g2 = g(obj);
        if (g2 != null) {
            return g2.lastClickSpm;
        }
        return "";
    }

    public final String getLastSpmIdOfTopPage() {
        return getLastClickSpmIdByPage(SpmMonitor.INTANCE.getTopPage());
    }

    @Deprecated
    public final String getMiniPageId(Object obj) {
        String str;
        PageInfo g2 = g(obj);
        if (g2 == null || (str = g2.miniPageId) == null) {
            return "C_NULL";
        }
        return str;
    }

    public final String getPageChInfo(Object obj) {
        TrackerParams trackerParams = this.e.get(SpmUtils.objectToString(obj));
        if (trackerParams == null) {
            return null;
        }
        return trackerParams.chInfo;
    }

    public final String getPageId(Object obj) {
        PageInfo g2 = g(obj);
        if (g2 == null) {
            return "C_NULL";
        }
        String str = this.f4271a;
        SpmLogCator.debug(str, "getPageId pageId:" + g2.pageId);
        String str2 = g2.pageId;
        return str2 == null ? "C_NULL" : str2;
    }

    public final String getPageSpm(Object obj) {
        PageInfo g2 = g(obj);
        if (g2 != null) {
            return g2.spm;
        }
        return "";
    }

    public final String getReferSpm(Object obj) {
        String str;
        PageInfo g2 = g(obj);
        if (g2 == null || (str = g2.referClickSpm) == null) {
            return "";
        }
        return str;
    }

    public final String getSrcSem(Object obj) {
        String str;
        if (obj == null) {
            return "";
        }
        String lastClickSem = getLastClickSem(obj);
        if (!TextUtils.isEmpty(lastClickSem)) {
            return lastClickSem;
        }
        String str2 = this.f4271a;
        SpmLogCator.debug(str2, "getSrcSem page:" + SpmUtils.objectToString(obj));
        TrackerParams trackerParams = this.e.get(SpmUtils.objectToString(obj));
        return (trackerParams == null || (str = trackerParams.srcSem) == null) ? "" : str;
    }

    public final String getSrcSpm(Object obj) {
        String str;
        PageInfo g2 = g(obj);
        if (g2 == null || (str = g2.srcSpm) == null) {
            return "";
        }
        return str;
    }

    public final Map<String, String> getTracerInfo(Object obj) {
        HashMap hashMap = new HashMap();
        PageInfo g2 = g(obj);
        if (g2 != null) {
            hashMap.put(Constant.HEADER_PAGETS, getMiniPageId(obj));
            String str = g2.srcSpm;
            if (str == null) {
                str = "";
            }
            hashMap.put("srcSpm", str);
        }
        hashMap.put("lastClickSpm", getLastClickSpmId());
        return hashMap;
    }

    public final TrackerParams getTrackerParams(Object obj) {
        return this.e.get(SpmUtils.objectToString(obj));
    }

    public final boolean isPageStarted(Object obj) {
        PageInfo g2 = g(obj);
        if (g2 == null || g2.isEnd) {
            return false;
        }
        return true;
    }

    public final String mergeTrackerParamToUrl(String str) {
        String lastSpmIdOfTopPage = getLastSpmIdOfTopPage();
        if (!TextUtils.isEmpty(lastSpmIdOfTopPage)) {
            str = a(str, "srcSpm", lastSpmIdOfTopPage);
        }
        String srcSem = getSrcSem(SpmMonitor.INTANCE.getTopPage());
        return !TextUtils.isEmpty(srcSem) ? a(str, Constant.KEY_SRC_SEM, srcSem) : str;
    }

    public final void onPageCreate(Object obj) {
        a(obj);
        b(obj);
    }

    public final void onPageDestroy(Object obj) {
        e(obj);
    }

    public final void onPagePause(Object obj) {
        d(obj);
    }

    public final void onPageResume(Object obj) {
        PageInfo g2 = g(obj);
        if (g2 != null && TextUtils.isEmpty(g2.srcSpm)) {
            b(obj);
        }
    }

    public final void setHomePageTabSpms(List<String> list) {
        if (list != null) {
            this.f = list;
        }
    }

    @Deprecated
    public final void upateSrcSpm(Object obj, String str) {
        updateSrcSpm(obj, str);
    }

    public final void updateSrcSpm(Object obj, String str) {
        PageInfo g2 = g(obj);
        if (g2 != null) {
            g2.srcSpm = str;
        }
    }

    private void a(Object obj) {
        FragmentActivity activity;
        Intent intent;
        try {
            Bundle bundle = null;
            if (obj instanceof Activity) {
                Intent intent2 = ((Activity) obj).getIntent();
                if (intent2 != null) {
                    bundle = intent2.getExtras();
                }
            } else if ((obj instanceof Fragment) && !(((bundle = ((Fragment) obj).getArguments()) != null && !TextUtils.isEmpty(bundle.getString("chInfo"))) || (activity = ((Fragment) obj).getActivity()) == null || (intent = activity.getIntent()) == null)) {
                bundle = intent.getExtras();
            }
            if (bundle != null) {
                bundle.setClassLoader(obj.getClass().getClassLoader());
                String string = bundle.getString("chInfo");
                String string2 = bundle.getString(Constant.KEY_SRC_SEM);
                String string3 = bundle.getString(Constant.KEY_LANINFO);
                TrackerParams trackerParams = new TrackerParams();
                trackerParams.chInfo = string;
                trackerParams.srcSem = string2;
                trackerParams.lanInfo = string3;
                this.e.put(SpmUtils.objectToString(obj), trackerParams);
            }
        } catch (Exception e) {
            String str = this.f4271a;
            SpmLogCator.warn(str, "parseTrackerParam exception:" + e.toString());
        }
    }
}
