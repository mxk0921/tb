package com.ut.mini;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.exposure.TrackerFrameLayout;
import com.ut.mini.module.util.ReadonlyMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.a1v;
import tb.c2v;
import tb.d2v;
import tb.f3v;
import tb.g2v;
import tb.hsq;
import tb.i2v;
import tb.j1o;
import tb.k1o;
import tb.nhh;
import tb.oeh;
import tb.p3v;
import tb.rbo;
import tb.sp8;
import tb.t2o;
import tb.to1;
import tb.u4v;
import tb.u51;
import tb.wu3;
import tb.x0i;
import tb.z9u;
import tb.zj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UTTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PAGE_STATUS_CODE_302 = 1;
    private static final String TAG = "UTTracker";
    private static List<String> mGlobalPropertyForAllTrackerList;
    private static Map<String, String> mGlobalPropertyForAllTrackerMap;
    private static List<String> mImportantProperties;
    private static List<String> mLogFieldCacheList;
    private String mAppKey = null;
    private String mTrackerId = null;
    private Map<String, String> mGlobalArgsMap = new ConcurrentHashMap();
    private List<String> mGlobalArgsList = Collections.synchronizedList(new ArrayList());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Runnable, rbo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String arg1;
        public String arg2;
        public String arg3;
        public int eventId;
        public List<String> globalArgsList;
        public Map<String, String> logMap;
        public String pageName;
        public Map<String, String> readOnlyPluginLogMap;
        public UTTracker utTracker;

        static {
            t2o.a(962593180);
            t2o.a(962593059);
        }

        @Override // tb.rbo
        public void clean() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3f4ee50", new Object[]{this});
                return;
            }
            this.logMap = null;
            this.readOnlyPluginLogMap = null;
            this.globalArgsList = null;
        }

        @Override // tb.rbo
        public void fill(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7129a67", new Object[]{this, objArr});
                return;
            }
            try {
                Object obj = objArr[0];
                if (obj != null) {
                    Map<String, String> map = (Map) obj;
                    this.logMap = map;
                    this.pageName = map.get("PAGE");
                    this.arg1 = this.logMap.get(oeh.ARG1);
                    this.arg2 = this.logMap.get(oeh.ARG2);
                    this.arg3 = this.logMap.get(oeh.ARG3);
                    this.readOnlyPluginLogMap = new ReadonlyMap(this.logMap);
                }
                this.eventId = ((Integer) objArr[1]).intValue();
                Object obj2 = objArr[2];
                if (obj2 != null) {
                    this.globalArgsList = (List) obj2;
                }
                Object obj3 = objArr[3];
                if (obj3 != null) {
                    this.utTracker = (UTTracker) obj3;
                }
            } catch (Throwable th) {
                if (nhh.n()) {
                    nhh.h(UTTracker.TAG, th, new Object[0]);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Iterator openAsyncUTPluginMapIterator = i2v.getInstance().getUTPluginConfigMgr().getOpenAsyncUTPluginMapIterator();
                while (openAsyncUTPluginMapIterator.hasNext()) {
                    g2v g2vVar = (g2v) ((Map.Entry) openAsyncUTPluginMapIterator.next()).getValue();
                    if (g2vVar != null) {
                        UTTracker.access$000(g2vVar, this.logMap, this.pageName, this.eventId, this.arg1, this.arg2, this.arg3, this.readOnlyPluginLogMap);
                    }
                }
            } catch (Throwable th) {
                if (nhh.n()) {
                    nhh.h(UTTracker.TAG, th, new Object[0]);
                }
            }
            UTTracker uTTracker = this.utTracker;
            if (uTTracker != null) {
                UTTracker.access$100(uTTracker, this.logMap, this.eventId, this.globalArgsList);
            }
            to1.a().c(this);
        }
    }

    static {
        t2o.a(962593179);
        mLogFieldCacheList = null;
        mLogFieldCacheList = new ArrayList(34);
        for (String str : oeh.LogField) {
            mLogFieldCacheList.add(String.valueOf(str).toLowerCase());
        }
        mGlobalPropertyForAllTrackerMap = new ConcurrentHashMap();
        mGlobalPropertyForAllTrackerList = Collections.synchronizedList(new ArrayList());
        mImportantProperties = null;
    }

    public static /* synthetic */ void access$000(g2v g2vVar, Map map, String str, int i, String str2, String str3, String str4, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba1dac6e", new Object[]{g2vVar, map, str, new Integer(i), str2, str3, str4, map2});
        } else {
            processPluginMap(g2vVar, map, str, i, str2, str3, str4, map2);
        }
    }

    public static /* synthetic */ void access$100(UTTracker uTTracker, Map map, int i, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1373db35", new Object[]{uTTracker, map, new Integer(i), list});
        } else {
            uTTracker.sendLog(map, i, list);
        }
    }

    private static void dropAllIllegalKey(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("287c6763", new Object[]{map});
        } else if (map != null) {
            map.remove("IMEI");
            map.remove("IMSI");
            map.remove(oeh.CARRIER);
            map.remove(oeh.ACCESS);
            map.remove(oeh.ACCESS_SUBTYPE);
            map.remove(oeh.CHANNEL);
            map.remove(oeh.LL_USERNICK);
            map.remove(oeh.USERNICK);
            map.remove(oeh.LL_USERID);
            map.remove("USERID");
            map.remove(oeh.SDKVERSION);
            map.remove(oeh.START_SESSION_TIMESTAMP);
            map.remove(oeh.UTDID);
            map.remove(oeh.SDKTYPE);
            map.remove(oeh.RESERVE2);
            map.remove(oeh.RESERVE3);
            map.remove(oeh.RESERVE4);
            map.remove(oeh.RESERVE5);
            map.remove(oeh.RESERVES);
        }
    }

    private void fillReserve1Fields(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d732ae0d", new Object[]{this, map});
            return;
        }
        map.put(oeh.SDKTYPE, zj4.SDK_TYPE);
        if (!TextUtils.isEmpty(this.mAppKey)) {
            map.put("APPKEY", this.mAppKey);
        } else {
            map.put("APPKEY", wu3.c().a());
        }
    }

    private static void fillReservesFields(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("513a1c0b", new Object[]{map});
            return;
        }
        HashMap hashMap = new HashMap();
        if (map.containsKey("_track_id")) {
            String str = map.get("_track_id");
            map.remove("_track_id");
            if (!hsq.f(str)) {
                hashMap.put("_tkid", str);
            }
        }
        if (hashMap.size() > 0) {
            String a2 = hsq.a(hashMap);
            if (hsq.h(a2)) {
                map.put(oeh.RESERVES, a2);
            }
        }
        if (!map.containsKey("PAGE")) {
            map.put("PAGE", "UT");
        }
    }

    public static synchronized List<String> getImportantProperties() {
        synchronized (UTTracker.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("5b55b4c1", new Object[0]);
            }
            return mImportantProperties;
        }
    }

    private boolean isStartLog(Map<String, String> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38125b75", new Object[]{this, map, new Integer(i)})).booleanValue();
        }
        if (wu3.c().h() || !u51.l(wu3.c().b())) {
            return false;
        }
        if (i == 1023 || i == 2003 || i == 1014) {
            return true;
        }
        return false;
    }

    private static Map<String, Object> parseJsonToMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("395e5b6c", new Object[]{str});
        }
        try {
            return (Map) JSON.parseObject(str, Map.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public static synchronized void removeGlobalPropertyForAllTracker(String str) {
        synchronized (UTTracker.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9c4c8b5", new Object[]{str});
                return;
            }
            if (!hsq.f(str)) {
                mGlobalPropertyForAllTrackerMap.remove(str);
                mGlobalPropertyForAllTrackerList.remove(str);
            }
        }
    }

    private void removeIllegalTmpProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6732aca6", new Object[]{this, map});
        } else if (map != null) {
            map.remove("spm");
            map.remove("spm-cnt");
            map.remove("spm-url");
            map.remove("spm-pre");
            map.remove("utparam-cnt");
            map.remove(z9u.KEY_UTPARAM_URL);
            map.remove("utparam-pre");
        }
    }

    private void sendLog(Map<String, String> map, int i, List<String> list) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54f2f232", new Object[]{this, map, new Integer(i), list});
            return;
        }
        if (i == 2201) {
            try {
                str = map.get("PAGE");
            } catch (Exception unused) {
                str = "";
            }
            if (j1o.getInstance().isRepeatExposurePage(str)) {
                updateLogMap(map, list);
                k1o.getInstance().putExposureEvent(map);
                return;
            }
        }
        if (i == 2001) {
            c2v.encodeUtParam(map);
        }
        updateLogMap(map, list);
        if (!isStartLog(map, i) || !x0i.b().c()) {
            UTAnalytics.getInstance().transferLog(map);
        } else {
            UTAnalytics.getInstance().transferSimpleLog(map);
        }
    }

    public static synchronized void setImportantProperties(List<String> list) {
        synchronized (UTTracker.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("42d9772b", new Object[]{list});
            } else if (!UTAnalytics.getInstance().isInit()) {
                if (mImportantProperties == null && list != null && !list.isEmpty()) {
                    mImportantProperties = new ArrayList(list);
                }
            }
        }
    }

    private static void translateFieldsName(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32efc60c", new Object[]{map});
        } else if (map != null) {
            if (map.containsKey("_field_os")) {
                String str = map.get("_field_os");
                map.remove("_field_os");
                if (hsq.h(str)) {
                    map.put(oeh.OS, str);
                }
            }
            if (map.containsKey("_field_os_version")) {
                String str2 = map.get("_field_os_version");
                map.remove("_field_os_version");
                if (hsq.h(str2)) {
                    map.put(oeh.OSVERSION, str2);
                }
            }
        }
    }

    private void updateLogMap(Map<String, String> map, List<String> list) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27307fce", new Object[]{this, map, list});
            return;
        }
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        String str2 = "";
        String str3 = str2;
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            if (key != null && key.startsWith(zj4.UT_TMP_ARGS_KEY)) {
                String substring = key.substring(19);
                String value = next.getValue();
                it.remove();
                if (!map.containsKey(substring)) {
                    if (hsq.f(str3)) {
                        str3 = substring + "=" + value;
                    } else {
                        str3 = str3 + "," + substring + "=" + value;
                    }
                }
            }
        }
        for (String str4 : list) {
            if (map.containsKey(str4)) {
                String remove = map.remove(str4);
                if (hsq.f(str2)) {
                    str = str4 + "=" + remove;
                } else {
                    str = str2 + "," + str4 + "=" + remove;
                }
                str2 = str;
            }
        }
        if (!hsq.f(str2)) {
            map.put(zj4.UT_GLOBAL_ARGS, str2);
        }
        if (!hsq.f(str3)) {
            map.put(zj4.UT_TMP_ARGS, str3);
        }
    }

    public void addTPKCache(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db35592f", new Object[]{this, str, str2});
        } else {
            com.alibaba.analytics.core.config.a.i().g(str, str2);
        }
    }

    public void addTPKItem(f3v f3vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3864901d", new Object[]{this, f3vVar});
        } else {
            com.alibaba.analytics.core.config.a.i().h(f3vVar);
        }
    }

    public void commitExposureData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38c098af", new Object[]{this});
        } else {
            TrackerFrameLayout.commitExposureData();
        }
    }

    public synchronized String getGlobalProperty(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ee50ae1", new Object[]{this, str});
        } else if (hsq.f(str)) {
            return null;
        } else {
            return this.mGlobalArgsMap.get(str);
        }
    }

    public Map<String, String> getPageAllProperties(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ea4a06bd", new Object[]{this, activity});
        }
        return c2v.getInstance().getPageAllProperties(activity);
    }

    public Map<String, String> getPageProperties(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("97847fb0", new Object[]{this, obj});
        }
        return c2v.getInstance().getPageProperties(obj);
    }

    @Deprecated
    public String getPageScmPre(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a24e39c", new Object[]{this, activity});
        }
        return c2v.getInstance().getPageScmPre(activity);
    }

    @Deprecated
    public String getPageSpmPre(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("796f1bef", new Object[]{this, activity});
        }
        return c2v.getInstance().getPageSpmPre(activity);
    }

    @Deprecated
    public String getPageSpmUrl(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d3bc1a3", new Object[]{this, activity});
        }
        return c2v.getInstance().getPageSpmUrl(activity);
    }

    public void pageAppear(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52025aa7", new Object[]{this, obj});
        } else {
            pageAppear(obj, null, false);
        }
    }

    public void pageAppearDonotSkip(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ff07c6", new Object[]{this, obj});
        } else {
            pageAppear(obj, null, true);
        }
    }

    public void pageAppearWithRouter(Activity activity, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8edcc4d", new Object[]{this, activity, str, new Integer(i)});
        } else {
            c2v.getInstance().pageAppear(activity, str, true, i);
        }
    }

    public void pageDisAppear(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f29b97", new Object[]{this, obj});
        } else {
            c2v.getInstance().pageDisAppear(obj, this);
        }
    }

    public void refreshExposureData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd143a53", new Object[]{this});
        } else {
            TrackerFrameLayout.refreshExposureData();
        }
    }

    public void refreshExposureDataByViewId(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f455a0de", new Object[]{this, str, str2});
        } else {
            TrackerFrameLayout.refreshExposureDataByViewId(str, str2);
        }
    }

    public synchronized void removeGlobalProperty(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("286ea5cd", new Object[]{this, str});
            return;
        }
        if (!hsq.f(str)) {
            this.mGlobalArgsMap.remove(str);
            this.mGlobalArgsList.remove(str);
        }
    }

    public void setAppKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77945e11", new Object[]{this, str});
        } else {
            this.mAppKey = str;
        }
    }

    public void setCommitImmediatelyExposureBlock(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c81092", new Object[]{this, str});
        } else {
            TrackerFrameLayout.setCommitImmediatelyExposureBlock(str);
        }
    }

    public void setExposureSpmAB(View view, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("120e43b7", new Object[]{this, view, str, str2});
        } else {
            sp8.setExposureSpmAB(view, str, str2);
        }
    }

    public void setExposureSpmCD(View view, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93011b77", new Object[]{this, view, str, str2});
        } else {
            sp8.setExposureSpmCD(view, str, str2);
        }
    }

    public void setExposureTag(View view, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81bdab37", new Object[]{this, view, str, str2, map});
        } else {
            sp8.setExposure(view, str, str2, map);
        }
    }

    public void setH5Url(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a1b94b1", new Object[]{this, str});
        } else if (str != null) {
            u4v.getInstance().setH5Url(str);
        }
    }

    @Deprecated
    public void setPageSessionPropertiesRule(Activity activity, ArrayList<Integer> arrayList, ArrayList<String> arrayList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11634b0d", new Object[]{this, activity, arrayList, arrayList2});
        } else {
            d2v.setPageSessionPropertiesRule(activity, arrayList, arrayList2);
        }
    }

    public void setPageStatusCode(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83e662d0", new Object[]{this, obj, new Integer(i)});
        } else {
            c2v.getInstance().setPageStatusCode(obj, i);
        }
    }

    public void setTrackId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ad3c95", new Object[]{this, str});
        } else {
            this.mTrackerId = str;
        }
    }

    public void skipNextPageBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c53dbcf", new Object[]{this});
        } else {
            c2v.getInstance().skipNextPageBack();
        }
    }

    public void skipPage(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ec0ed1", new Object[]{this, obj});
            return;
        }
        p3v.getInstance().skipPage(obj);
        c2v.getInstance().skipPage(obj);
    }

    public void skipPageBack(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8447b0e", new Object[]{this, activity});
        } else {
            c2v.getInstance().skipBack(activity);
        }
    }

    @Deprecated
    public void skipPageBackForever(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30710529", new Object[]{this, activity, new Boolean(z)});
        } else {
            c2v.getInstance().skipBackForever(activity, z);
        }
    }

    public void updateNextPageProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6203bbc0", new Object[]{this, map});
            return;
        }
        p3v.getInstance().updateNextPageProperties(this, map);
        c2v.getInstance().updateNextPageProperties(map);
    }

    public void updateNextPageTmpProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a30b265f", new Object[]{this, map});
            return;
        }
        removeIllegalTmpProperties(map);
        c2v.getInstance().updateNextPageTmpProperties(map);
    }

    public void updateNextPageUtparam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30ce5d14", new Object[]{this, str});
            return;
        }
        p3v.getInstance().updateNextPageUtparam(str);
        c2v.getInstance().updateNextPageUtparam(str);
    }

    public void updateNextPageUtparamCnt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e38161b7", new Object[]{this, str});
        } else {
            c2v.getInstance().updateNextPageUtparamCnt(str);
        }
    }

    public void updatePageName(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be12fe50", new Object[]{this, obj, str});
            return;
        }
        p3v.getInstance().updatePageName(this, obj, str);
        c2v.getInstance().updatePageName(obj, str);
    }

    public void updatePageStatus(Object obj, UTPageStatus uTPageStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("954041a6", new Object[]{this, obj, uTPageStatus});
            return;
        }
        p3v.getInstance().updatePageStatus(obj);
        c2v.getInstance().updatePageStatus(obj, uTPageStatus);
    }

    public void updatePageUrl(Object obj, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db943cd", new Object[]{this, obj, uri});
            return;
        }
        p3v.getInstance().updatePageUrl(obj, uri);
        c2v.getInstance().updatePageUrl(obj, uri);
    }

    public void updatePageUtparam(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c541ce3", new Object[]{this, obj, str});
            return;
        }
        p3v.getInstance().updatePageUtparam(obj, str);
        c2v.getInstance().updatePageUtparam(obj, str);
    }

    public void pageAppear(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28cac8b1", new Object[]{this, obj, str});
        } else {
            pageAppear(obj, str, false);
        }
    }

    public void pageAppearDonotSkip(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4780c10", new Object[]{this, obj, str});
        } else {
            pageAppear(obj, str, true);
        }
    }

    public void refreshExposureData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3c955d", new Object[]{this, str});
        } else {
            TrackerFrameLayout.refreshExposureData(str);
        }
    }

    public static synchronized void setGlobalPropertyForAllTracker(String str, String str2) {
        synchronized (UTTracker.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bc8646a1", new Object[]{str, str2});
                return;
            }
            if (hsq.f(str) || str2 == null) {
                nhh.i("setGlobalProperty", "key is null or key is empty or value is null,please check it!");
            } else {
                mGlobalPropertyForAllTrackerMap.put(str, str2);
                if (!mGlobalPropertyForAllTrackerList.contains(str)) {
                    mGlobalPropertyForAllTrackerList.add(str);
                }
            }
        }
    }

    public void pageAppear(Object obj, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f08f0043", new Object[]{this, obj, str, new Boolean(z)});
        } else {
            c2v.getInstance().pageAppear(obj, str, z);
        }
    }

    public synchronized void setGlobalProperty(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d56d47b5", new Object[]{this, str, str2});
            return;
        }
        if (hsq.f(str) || str2 == null) {
            nhh.i("setGlobalProperty", "key is null or key is empty or value is null,please check it!");
        } else {
            this.mGlobalArgsMap.put(str, str2);
            if (!this.mGlobalArgsList.contains(str)) {
                this.mGlobalArgsList.add(str);
            }
        }
    }

    public void updatePageProperties(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24452d17", new Object[]{this, obj, map});
            return;
        }
        nhh.f(TAG, a1v.UPDATE_PAGE_PROPERTIES, map);
        p3v.getInstance().updatePageProperties(this, obj, map);
        c2v.getInstance().updatePageProperties(obj, map);
        p3v.getInstance().updatePagePropertiesEnd(this, obj);
    }

    public void updatePageTmpProperties(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6101da30", new Object[]{this, obj, map});
            return;
        }
        nhh.f(TAG, "updatePageTmpProperties", map);
        removeIllegalTmpProperties(map);
        c2v.getInstance().updatePageTmpProperties(obj, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void send(java.util.Map<java.lang.String, java.lang.String> r24) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ut.mini.UTTracker.send(java.util.Map):void");
    }

    private static void processPluginMap(g2v g2vVar, Map<String, String> map, String str, int i, String str2, String str3, String str4, Map<String, String> map2) {
        Map<String, String> onEventDispatch;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("823c06a4", new Object[]{g2vVar, map, str, new Integer(i), str2, str3, str4, map2});
        } else if (g2v.isEventIDInRange(g2vVar.getAttentionEventIds(), i) && (onEventDispatch = g2vVar.onEventDispatch(str, i, str2, str3, str4, map2)) != null && onEventDispatch.size() > 0) {
            nhh.f(TAG, "UTPlugin", g2vVar.getPluginName(), "PluginArgs", onEventDispatch);
            String str5 = "";
            for (Map.Entry<String, String> entry : onEventDispatch.entrySet()) {
                String key = entry.getKey();
                if (!mLogFieldCacheList.contains(String.valueOf(key).toLowerCase())) {
                    if ("utparam-cnt".equals(key)) {
                        str5 = onEventDispatch.get(key);
                    } else if (i2v.getInstance().getUTPluginConfigMgr().isWritableKey(g2vVar, key)) {
                        map.put(key, entry.getValue());
                    }
                }
            }
            if (!TextUtils.isEmpty(str5)) {
                try {
                    Map<String, Object> parseJsonToMap = parseJsonToMap(str5);
                    if (parseJsonToMap != null && parseJsonToMap.size() >= 1) {
                        Iterator<Map.Entry<String, Object>> it = parseJsonToMap.entrySet().iterator();
                        while (it.hasNext()) {
                            if (!i2v.getInstance().getUTPluginConfigMgr().isWritableUtparamCnt(g2vVar, it.next().getKey())) {
                                it.remove();
                            }
                        }
                        if (parseJsonToMap.size() >= 1) {
                            String str6 = map.get("utparam-cnt");
                            if (TextUtils.isEmpty(str6)) {
                                map.put("utparam-cnt", JSON.toJSONString(parseJsonToMap));
                                return;
                            }
                            Map<String, Object> parseJsonToMap2 = parseJsonToMap(str6);
                            if (parseJsonToMap2 != null && parseJsonToMap2.size() >= 1) {
                                parseJsonToMap2.putAll(parseJsonToMap);
                                map.put("utparam-cnt", JSON.toJSONString(parseJsonToMap2));
                                return;
                            }
                            map.put("utparam-cnt", JSON.toJSONString(parseJsonToMap));
                        }
                    }
                } catch (Exception e) {
                    if (nhh.n()) {
                        nhh.h(TAG, e, new Object[0]);
                    }
                }
            }
        }
    }
}
