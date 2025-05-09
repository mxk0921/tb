package com.ut.mini.core;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import tb.a1v;
import tb.g3v;
import tb.hsq;
import tb.j1v;
import tb.kpw;
import tb.nhh;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVUserTrack extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962593267);
    }

    private Context getContextWrapper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c241d459", new Object[]{this});
        }
        Context context = this.mContext;
        try {
            if (context instanceof Activity) {
                return context;
            }
            if (context instanceof MutableContextWrapper) {
                context = ((MutableContextWrapper) context).getBaseContext();
            }
            if (!(context instanceof Activity)) {
                return this.mContext;
            }
            return context;
        } catch (Throwable unused) {
            return this.mContext;
        }
    }

    public static /* synthetic */ Object ipc$super(WVUserTrack wVUserTrack, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/mini/core/WVUserTrack");
    }

    private boolean isEmpty(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a300898", new Object[]{this, str})).booleanValue();
        }
        if (str == null || "".equals(str)) {
            return true;
        }
        return false;
    }

    private Map<String, String> transStringToMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bfe72e8e", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!hsq.f(next)) {
                    String string = jSONObject.getString(next);
                    if (!hsq.f(string)) {
                        hashMap.put(next, string);
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return hashMap;
    }

    public final void selfCheck(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87036d6a", new Object[]{this, str, wVCallBackContext});
        } else if (!isEmpty(str)) {
            try {
                String obj = JSON.parseObject(str).get("utap_sample").toString();
                new StringBuilder("utap_sample:").append(obj);
                String selfCheck = UTAnalytics.getInstance().selfCheck(obj);
                new StringBuilder("result:").append(selfCheck);
                nsw nswVar = new nsw();
                nswVar.b("result", selfCheck);
                wVCallBackContext.success(nswVar);
            } catch (com.alibaba.fastjson.JSONException unused) {
                wVCallBackContext.error();
            }
        }
    }

    public final void toUT(String str, WVCallBackContext wVCallBackContext) {
        Map<String, String> transStringToMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceba1928", new Object[]{this, str, wVCallBackContext});
            return;
        }
        Context contextWrapper = getContextWrapper();
        if (!(contextWrapper == null || (transStringToMap = transStringToMap(str)) == null)) {
            j1v.getInstance().h5UT(transStringToMap, contextWrapper);
        }
        wVCallBackContext.success();
    }

    public void toUT2(String str, WVCallBackContext wVCallBackContext) {
        Map<String, String> transStringToMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c085266", new Object[]{this, str, wVCallBackContext});
            return;
        }
        Context contextWrapper = getContextWrapper();
        if (!(contextWrapper == null || (transStringToMap = transStringToMap(str)) == null)) {
            j1v.getInstance().h5UT2(transStringToMap, contextWrapper);
        }
        wVCallBackContext.success();
    }

    public final void turnOffAppMonitorRealtimeDebug(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29cf372b", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            AppMonitor.turnOffRealTimeDebug();
        } catch (com.alibaba.fastjson.JSONException unused) {
            wVCallBackContext.error();
        }
        wVCallBackContext.success();
    }

    public final void turnOffUTRealtimeDebug(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("640b93e5", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            g3v.getInstance().turnOffRealTimeDebug();
        } catch (com.alibaba.fastjson.JSONException unused) {
            wVCallBackContext.error();
        }
        wVCallBackContext.success();
    }

    public final void turnOnAppMonitorRealtimeDebug(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b09848e1", new Object[]{this, str, wVCallBackContext});
            return;
        }
        if (!isEmpty(str)) {
            try {
                com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(str);
                Set<String> keySet = parseObject.keySet();
                HashMap hashMap = new HashMap();
                if (keySet != null && keySet.size() > 0) {
                    for (String str2 : keySet) {
                        hashMap.put(str2, parseObject.get(str2).toString());
                    }
                    AppMonitor.turnOnRealTimeDebug(hashMap);
                }
            } catch (com.alibaba.fastjson.JSONException unused) {
                wVCallBackContext.error();
            }
        }
        wVCallBackContext.success();
    }

    public final void turnOnUTRealtimeDebug(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e44bb9b", new Object[]{this, str, wVCallBackContext});
            return;
        }
        if (!isEmpty(str)) {
            try {
                com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(str);
                Set<String> keySet = parseObject.keySet();
                HashMap hashMap = new HashMap();
                if (keySet != null && keySet.size() > 0) {
                    for (String str2 : keySet) {
                        hashMap.put(str2, parseObject.get(str2).toString());
                    }
                    g3v.getInstance().turnOnRealTimeDebug(hashMap);
                }
            } catch (com.alibaba.fastjson.JSONException unused) {
                wVCallBackContext.error();
            }
        }
        wVCallBackContext.success();
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("toUT".equals(str)) {
            toUT(str2, wVCallBackContext);
            return true;
        } else if ("toUT2".equalsIgnoreCase(str)) {
            toUT2(str2, wVCallBackContext);
            return true;
        } else if ("turnOnUTRealtimeDebug".equals(str)) {
            turnOnUTRealtimeDebug(str2, wVCallBackContext);
            return true;
        } else if ("turnOffUTRealtimeDebug".equals(str)) {
            turnOffUTRealtimeDebug(str2, wVCallBackContext);
            return true;
        } else if ("turnOnRealtimeDebug".equals(str)) {
            turnOnAppMonitorRealtimeDebug(str2, wVCallBackContext);
            return true;
        } else if ("turnOffRealtimeDebug".equals(str)) {
            turnOffAppMonitorRealtimeDebug(str2, wVCallBackContext);
            return true;
        } else if ("selfCheck".equals(str)) {
            selfCheck(str2, wVCallBackContext);
            return true;
        } else if (a1v.SKIP_PAGE.equals(str)) {
            nhh.f("WVUserTrack", a1v.SKIP_PAGE);
            try {
                UTAnalytics.getInstance().getDefaultTracker().skipPage(getContextWrapper());
                wVCallBackContext.success();
            } catch (Throwable unused) {
                wVCallBackContext.error();
            }
            return true;
        } else if ("updateNextPageUtparam".equals(str)) {
            nhh.f("WVUserTrack", "updateNextPageUtparam params", str2);
            try {
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(str2);
                wVCallBackContext.success();
            } catch (Throwable unused2) {
                wVCallBackContext.error();
            }
            return true;
        } else if (a1v.UPDATE_SESSION_PROPERTY.equals(str)) {
            nhh.f("WVUserTrack", "updateSessionProperties params", str2);
            try {
                UTAnalytics.getInstance().updateSessionProperties(transStringToMap(str2));
                wVCallBackContext.success();
            } catch (Throwable unused3) {
                wVCallBackContext.error();
            }
            return true;
        } else if (a1v.UPDATE_PAGE_PROPERTIES.equals(str)) {
            nhh.f("WVUserTrack", a1v.UPDATE_PAGE_PROPERTIES);
            try {
                UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getContextWrapper(), transStringToMap(str2));
                wVCallBackContext.success();
            } catch (Throwable unused4) {
                wVCallBackContext.error();
            }
            return true;
        } else if (!"getContainerProperties".equals(str)) {
            return false;
        } else {
            nhh.f("WVUserTrack", "getContainerProperties");
            try {
                Context contextWrapper = getContextWrapper();
                if (contextWrapper instanceof Activity) {
                    Map<String, String> pageAllProperties = UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties((Activity) contextWrapper);
                    if (pageAllProperties != null) {
                        JSONObject jSONObject = new JSONObject(pageAllProperties);
                        nsw nswVar = new nsw();
                        nswVar.h(jSONObject);
                        wVCallBackContext.success(nswVar);
                    } else {
                        nhh.f("WVUserTrack", "containerPropertiesMap is null");
                        wVCallBackContext.success();
                    }
                } else {
                    nhh.f("WVUserTrack", "context", contextWrapper);
                    wVCallBackContext.success();
                }
            } catch (Throwable unused5) {
                wVCallBackContext.error();
            }
            return true;
        }
    }
}
