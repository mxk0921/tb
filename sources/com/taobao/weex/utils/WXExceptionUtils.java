package com.taobao.weex.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.adapter.IWXConfigAdapter;
import com.taobao.weex.adapter.IWXJSExceptionAdapter;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.common.WXJSExceptionInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.f7l;
import tb.qtw;
import tb.quw;
import tb.t2o;
import tb.yg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WXExceptionUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f14148a = new CopyOnWriteArraySet();
    public static String degradeUrl = "BundleUrlDefaultDegradeUrl";

    static {
        t2o.a(985661816);
    }

    public static boolean a(String str, WXErrorCode wXErrorCode, String str2) {
        Set<String> set;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2eeff15", new Object[]{str, wXErrorCode, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        if (wXErrorCode != null && wXErrorCode.getErrorGroup() != WXErrorCode.ErrorGroup.JS) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            str = "instanceIdNull";
        }
        if (str2.length() > 200) {
            str2 = str2.substring(0, 200);
        }
        WXSDKInstance wXSDKInstance = WXSDKManager.getInstance().getAllInstanceMap().get(str);
        if (wXSDKInstance == null) {
            set = f14148a;
        } else {
            set = wXSDKInstance.E().q;
        }
        if (set == null) {
            return true;
        }
        if (set.contains(str2)) {
            return false;
        }
        set.add(str2);
        return true;
    }

    public static String b(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8897c2e4", new Object[]{wXSDKInstance});
        }
        if (wXSDKInstance == null || wXSDKInstance.E() == null || ((ConcurrentHashMap) wXSDKInstance.E().d).isEmpty()) {
            return "noStageRecord";
        }
        ArrayList arrayList = new ArrayList(((ConcurrentHashMap) wXSDKInstance.E().d).entrySet());
        Collections.sort(arrayList, new Comparator<Map.Entry<String, Long>>() { // from class: com.taobao.weex.utils.WXExceptionUtils.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("51cd4c3f", new Object[]{this, entry, entry2})).intValue() : (int) (entry.getValue().longValue() - entry2.getValue().longValue());
            }
        });
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append((String) entry.getKey());
            sb.append(f7l.CONDITION_IF_MIDDLE);
            sb.append(entry.getValue());
            sb.append("->");
        }
        return sb.toString();
    }

    public static void commitCriticalExceptionRT(String str, WXErrorCode wXErrorCode, String str2, String str3, Map<String, String> map) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("824422a1", new Object[]{str, wXErrorCode, str2, str3, map});
            return;
        }
        try {
            WXLogUtils.e("weex", "commitCriticalExceptionRT :" + wXErrorCode + "exception" + str3);
            IWXConfigAdapter wxConfigAdapter = WXSDKManager.getInstance().getWxConfigAdapter();
            if (wxConfigAdapter != null ? "true".equalsIgnoreCase(wxConfigAdapter.getConfig("wxapm", "check_repeat_report", "true")) : true) {
                z = a(str, wXErrorCode, str3);
            }
            if (!z) {
                return;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        commitCriticalExceptionWithDefaultUrl("BundleUrlDefault", str, wXErrorCode, str2, str3, map);
    }

    public static void commitCriticalExceptionWithDefaultUrl(String str, String str2, WXErrorCode wXErrorCode, String str3, String str4, Map<String, String> map) {
        String str5;
        String str6;
        String str7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c02d25", new Object[]{str, str2, wXErrorCode, str3, str4, map});
            return;
        }
        IWXJSExceptionAdapter iWXJSExceptionAdapter = WXSDKManager.getInstance().getIWXJSExceptionAdapter();
        if (TextUtils.isEmpty(str)) {
            str = "BundleUrlDefault";
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("wxSdkInitStartTime", String.valueOf(WXEnvironment.sSDKInitStart));
        map.put("wxSDKInitCostTime", String.valueOf(WXEnvironment.sSDKInitTime));
        map.put("wxSDKCurExceptionTime", String.valueOf(System.currentTimeMillis()));
        map.put("wxUseRuntimeApi", String.valueOf(WXEnvironment.sUseRunTimeApi));
        if (!TextUtils.isEmpty(str2)) {
            WXSDKInstance wXSDKInstance = WXSDKManager.getInstance().getAllInstanceMap().get(str2);
            if (wXSDKInstance != null) {
                str = wXSDKInstance.E().m;
                Object obj = ((ConcurrentHashMap) wXSDKInstance.E().j).get(quw.VALUE_BUNDLE_LOAD_LENGTH);
                if (obj instanceof Integer) {
                    str6 = String.valueOf(obj);
                } else {
                    str6 = "unknownLength";
                }
                map.put(quw.VALUE_BUNDLE_LOAD_LENGTH, str6);
                map.put(yg.CACHE_KEY_TEMPLATE_INFO, wXSDKInstance.Z());
                if (TextUtils.isEmpty(str) || str.equals("default")) {
                    if (!TextUtils.equals(degradeUrl, "BundleUrlDefaultDegradeUrl")) {
                        str = degradeUrl;
                    } else {
                        str = wXSDKInstance.getBundleUrl();
                    }
                }
                for (Map.Entry<String, String> entry : wXSDKInstance.G().entrySet()) {
                    map.put(entry.getKey(), entry.getValue());
                }
                map.put("wxStageList", b(wXSDKInstance));
                String Y = wXSDKInstance.Y();
                if (Y == null) {
                    str7 = "has recycle by gc";
                } else {
                    str7 = Y.substring(0, Math.min(Y.length(), 300));
                }
                map.put("wxTemplateOfBundle", str7);
                Long l = (Long) ((ConcurrentHashMap) wXSDKInstance.E().d).get("wxStartDownLoadBundle");
                if (l == null) {
                    l = (Long) ((ConcurrentHashMap) wXSDKInstance.E().d).get("wxRenderTimeOrigin");
                }
                if (l != null) {
                    map.put("wxUseTime", String.valueOf(WXUtils.getFixUnixTime() - l.longValue()));
                }
            }
            str5 = str2;
        } else {
            if (map.size() > 0) {
                if (TextUtils.isEmpty(map.get("weexUrl"))) {
                    str = map.get("weexUrl");
                } else {
                    str = map.get("bundleUrl");
                }
            }
            str5 = "InstanceIdDefalut";
        }
        String str8 = map.get("errorCode");
        if (str8 != null && str8.length() > 200) {
            map.remove("errorCode");
        }
        WXJSExceptionInfo wXJSExceptionInfo = new WXJSExceptionInfo(str5, str, wXErrorCode, str3, str4, map);
        if (iWXJSExceptionAdapter != null) {
            iWXJSExceptionAdapter.onJSException(wXJSExceptionInfo);
        }
        qtw.b(wXJSExceptionInfo, str2);
    }
}
