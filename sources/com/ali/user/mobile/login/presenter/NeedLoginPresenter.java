package com.ali.user.mobile.login.presenter;

import android.content.SharedPreferences;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.model.NeedLoginCheckData;
import com.ali.user.mobile.login.model.NeedLoginInfo;
import com.ali.user.mobile.login.model.NeedLoginLimitStrategies;
import com.ali.user.mobile.login.model.NeedLoginStrategy;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.session.SessionManager;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.message.message_open_api.ICallService;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import tb.hsq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NeedLoginPresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_POINTS_RECORD_KEY = "actionPoints";
    private static final String GLOBAL_KEY = "global";
    private static final String NEED_LOGIN_DATA_SP_NAME = "needLoginData";
    private static final String NEED_LOGIN_INFO_DATA_KEY = "needLoginInfoData";
    private static final String NEED_LOGIN_RECORD_NAME = "needLoginRecord";
    private static final String RESULT_FALSE = "false";
    private static final String RESULT_LIMIT = "limit";
    private static final String RESULT_TRUE = "true";
    private static final String SHOW_UI_RECORD_KEY = "loginShowUI";
    private static final String TAG = "NeedLoginCheck";
    private static ConcurrentHashMap<String, Object> needLoginRecordCache = new ConcurrentHashMap<>();

    static {
        t2o.a(69206136);
    }

    public static void clearAllCacheAndSP() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("954ffccd", new Object[0]);
            return;
        }
        AliUserLogin.clearCacheData(NEED_LOGIN_DATA_SP_NAME);
        AliUserLogin.clearCacheData(NEED_LOGIN_RECORD_NAME);
        needLoginRecordCache = new ConcurrentHashMap<>();
    }

    public static void clearNeedLoginStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af7f5640", new Object[0]);
            return;
        }
        needLoginRecordCache.remove(NEED_LOGIN_INFO_DATA_KEY);
        AliUserLogin.clearCacheData(NEED_LOGIN_DATA_SP_NAME);
    }

    private static ConcurrentHashMap<String, List<Long>> getActionPointsRecord() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("9b07631f", new Object[0]);
        }
        try {
            return (ConcurrentHashMap) needLoginRecordCache.get(ACTION_POINTS_RECORD_KEY);
        } catch (Exception e) {
            e.printStackTrace();
            return new ConcurrentHashMap<>();
        }
    }

    public static Map<String, Object> getCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("497e9948", new Object[0]);
        }
        return needLoginRecordCache;
    }

    private static synchronized ConcurrentHashMap<String, List<Long>> getLoginShowUIMap() {
        synchronized (NeedLoginPresenter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ConcurrentHashMap) ipChange.ipc$dispatch("e530f1a7", new Object[0]);
            }
            try {
                ConcurrentHashMap<String, List<Long>> concurrentHashMap = (ConcurrentHashMap) needLoginRecordCache.get(SHOW_UI_RECORD_KEY);
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap<>();
                }
                return concurrentHashMap;
            } catch (Exception e) {
                e.printStackTrace();
                return new ConcurrentHashMap<>();
            }
        }
    }

    private static NeedLoginCheckData getNeedLoginCheckData(SharedPreferences sharedPreferences) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NeedLoginCheckData) ipChange.ipc$dispatch("5f80aa", new Object[]{sharedPreferences});
        }
        try {
            return (NeedLoginCheckData) JSON.parseObject(sharedPreferences.getString(NEED_LOGIN_INFO_DATA_KEY, "{}"), NeedLoginCheckData.class);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static NeedLoginCheckData getNeedLoginInfoIfValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NeedLoginCheckData) ipChange.ipc$dispatch("1e0584b7", new Object[0]);
        }
        try {
            NeedLoginCheckData needLoginCheckData = (NeedLoginCheckData) needLoginRecordCache.get(NEED_LOGIN_INFO_DATA_KEY);
            if (needLoginCheckData == null || needLoginCheckData.needLoginInfo == null) {
                return null;
            }
            LoginTLogAdapter.e(TAG, "getNeedLoginInfoIfValid expire time = " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(needLoginCheckData.expireTimestamp * 1000)));
            if (System.currentTimeMillis() / 1000 > needLoginCheckData.expireTimestamp) {
                return null;
            }
            return needLoginCheckData;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static ConcurrentHashMap<String, NeedLoginStrategy> getValidStrategies(List<NeedLoginStrategy> list, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("5594c1d1", new Object[]{list, new Long(j)});
        }
        ConcurrentHashMap<String, NeedLoginStrategy> concurrentHashMap = new ConcurrentHashMap<>();
        if (list == null) {
            return concurrentHashMap;
        }
        for (NeedLoginStrategy needLoginStrategy : list) {
            if (needLoginStrategy.limitLoginTimeWindow > 0 && needLoginStrategy.judgeLoginTimeWindow > 0 && needLoginStrategy.judgeLoginCapacity > 0 && needLoginStrategy.limitLoginCapacity > 0 && needLoginStrategy.startTime <= j && j <= needLoginStrategy.endTime) {
                concurrentHashMap.put(needLoginStrategy.actionPoint, needLoginStrategy);
            }
        }
        return concurrentHashMap;
    }

    public static void initCacheIfNotExist() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2169051a", new Object[0]);
            return;
        }
        try {
            if (needLoginRecordCache == null) {
                needLoginRecordCache = new ConcurrentHashMap<>();
            }
            LoginTLogAdapter.e(TAG, "start init needlogin cache");
            SharedPreferences sharedPreferences = DataProviderFactory.getApplicationContext().getSharedPreferences(NEED_LOGIN_RECORD_NAME, 0);
            initializeCacheEntry(ACTION_POINTS_RECORD_KEY, sharedPreferences);
            initializeCacheEntry(SHOW_UI_RECORD_KEY, sharedPreferences);
            if (!needLoginRecordCache.containsKey(NEED_LOGIN_INFO_DATA_KEY)) {
                String string = DataProviderFactory.getApplicationContext().getSharedPreferences(NEED_LOGIN_DATA_SP_NAME, 0).getString(NEED_LOGIN_INFO_DATA_KEY, "");
                if (hsq.g(string)) {
                    needLoginRecordCache.put(NEED_LOGIN_INFO_DATA_KEY, (NeedLoginCheckData) JSON.parseObject(string, NeedLoginCheckData.class));
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static boolean isActionPointCountReach(List<Long> list, NeedLoginStrategy needLoginStrategy, long j) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b7a37c5", new Object[]{list, needLoginStrategy, new Long(j)})).booleanValue();
        }
        if (list == null || (i = needLoginStrategy.judgeLoginTimeWindow) <= 0) {
            return false;
        }
        long j2 = j - i;
        int i2 = 0;
        for (Long l : list) {
            if (l.longValue() >= j2) {
                i2++;
            }
        }
        if (i2 >= needLoginStrategy.judgeLoginCapacity) {
            return true;
        }
        return false;
    }

    private static boolean isLimitValid(long j, NeedLoginLimitStrategies needLoginLimitStrategies) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f018e938", new Object[]{new Long(j), needLoginLimitStrategies})).booleanValue();
        }
        if (needLoginLimitStrategies == null || (list = needLoginLimitStrategies.actionPoints) == null || list.isEmpty() || needLoginLimitStrategies.limitLoginTimeWindow <= 0 || needLoginLimitStrategies.limitLoginCapacity <= 0 || needLoginLimitStrategies.startTime > j || j > needLoginLimitStrategies.endTime) {
            return false;
        }
        return true;
    }

    private static boolean isShowUICountReachLimit(List<Long> list, NeedLoginStrategy needLoginStrategy, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("469a8b6d", new Object[]{list, needLoginStrategy, new Long(j)})).booleanValue();
        }
        if (list == null) {
            return false;
        }
        long j2 = needLoginStrategy.limitLoginTimeWindow;
        if (j2 <= 0) {
            return true;
        }
        long j3 = j - j2;
        int i = 0;
        for (Long l : list) {
            if (l.longValue() > j3) {
                i++;
            }
        }
        if (i >= needLoginStrategy.limitLoginCapacity) {
            return true;
        }
        return false;
    }

    private static boolean isValidNeedLoginCheckData(NeedLoginCheckData needLoginCheckData) {
        NeedLoginInfo needLoginInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97d24518", new Object[]{needLoginCheckData})).booleanValue();
        }
        if (needLoginCheckData == null || (needLoginInfo = needLoginCheckData.needLoginInfo) == null || needLoginInfo.needLoginStrategies == null) {
            return false;
        }
        return true;
    }

    public static void putNeedLoginData(final NeedLoginCheckData needLoginCheckData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f97bd1", new Object[]{needLoginCheckData});
        } else if (needLoginCheckData != null) {
            needLoginRecordCache.put(NEED_LOGIN_INFO_DATA_KEY, needLoginCheckData);
            CoordinatorWrapper.executeSafely(new Runnable() { // from class: com.ali.user.mobile.login.presenter.NeedLoginPresenter.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    SharedPreferences.Editor edit = DataProviderFactory.getApplicationContext().getSharedPreferences(NeedLoginPresenter.NEED_LOGIN_DATA_SP_NAME, 0).edit();
                    edit.putString(NeedLoginPresenter.NEED_LOGIN_INFO_DATA_KEY, JSON.toJSONString(NeedLoginCheckData.this));
                    edit.apply();
                }
            });
        }
    }

    private static void saveActionPointsRecord(final ConcurrentHashMap<String, List<Long>> concurrentHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("288439e", new Object[]{concurrentHashMap});
            return;
        }
        needLoginRecordCache.put(ACTION_POINTS_RECORD_KEY, concurrentHashMap);
        CoordinatorWrapper.executeSafely(new Runnable() { // from class: com.ali.user.mobile.login.presenter.NeedLoginPresenter.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                String jSONString = JSON.toJSONString(concurrentHashMap);
                LoginTLogAdapter.e(NeedLoginPresenter.TAG, "saveActionPointsRecord recordStr=" + jSONString);
                DataProviderFactory.getApplicationContext().getSharedPreferences(NeedLoginPresenter.NEED_LOGIN_RECORD_NAME, 0).edit().putString(NeedLoginPresenter.ACTION_POINTS_RECORD_KEY, jSONString).apply();
            }
        });
    }

    private static void sendNeedLoginUT(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("309bb859", new Object[]{str, str2, str3, str4});
            return;
        }
        Properties properties = new Properties();
        properties.setProperty("source", str);
        if (hsq.g(str3)) {
            properties.setProperty("needLoginTrackInfo", str3);
        }
        properties.setProperty("result", str2);
        if (hsq.g(str4)) {
            properties.setProperty("reason", str4);
        }
        UserTrackAdapter.sendUT(ICallService.KEY_NEED_LOGIN, properties);
    }

    private static void updateRecordList(ConcurrentHashMap<String, List<Long>> concurrentHashMap, String str, long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("200bfa18", new Object[]{concurrentHashMap, str, new Long(j), new Integer(i)});
            return;
        }
        List<Long> list = concurrentHashMap.get(str);
        if (list == null) {
            list = new ArrayList<>();
            concurrentHashMap.put(str, list);
        }
        if (list.size() >= i) {
            list.remove(0);
        }
        list.add(Long.valueOf(j));
    }

    public static synchronized void updateShowUIRecord(String str) {
        synchronized (NeedLoginPresenter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("228e1bc", new Object[]{str});
            } else if (LoginSwitch.getSwitch("check_need_login", "true")) {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                final ConcurrentHashMap<String, List<Long>> loginShowUIMap = getLoginShowUIMap();
                int i = LoginSwitch.getSwitch("need_login_show_ui_list_size", 20);
                int i2 = LoginSwitch.getSwitch("global_need_login_show_ui_list_size", 20);
                if (hsq.g(str)) {
                    updateRecordList(loginShowUIMap, str, currentTimeMillis, i);
                }
                updateRecordList(loginShowUIMap, "global", currentTimeMillis, i2);
                needLoginRecordCache.put(SHOW_UI_RECORD_KEY, loginShowUIMap);
                CoordinatorWrapper.executeSafely(new Runnable() { // from class: com.ali.user.mobile.login.presenter.NeedLoginPresenter.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        SharedPreferences sharedPreferences = DataProviderFactory.getApplicationContext().getSharedPreferences(NeedLoginPresenter.NEED_LOGIN_RECORD_NAME, 0);
                        String jSONString = JSON.toJSONString(loginShowUIMap);
                        LoginTLogAdapter.e(NeedLoginPresenter.TAG, "after updateShowUIRecord recordStr = " + jSONString);
                        sharedPreferences.edit().putString(NeedLoginPresenter.SHOW_UI_RECORD_KEY, jSONString).apply();
                    }
                });
            }
        }
    }

    private static void initializeCacheEntry(String str, SharedPreferences sharedPreferences) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("522e3cf3", new Object[]{str, sharedPreferences});
        } else if (!needLoginRecordCache.containsKey(str)) {
            String string = sharedPreferences.getString(str, "");
            LoginTLogAdapter.e(TAG, "get need_login cache key= " + str + "record= " + string);
            if (hsq.g(string)) {
                needLoginRecordCache.put(str, (ConcurrentHashMap) JSON.parseObject(string, new TypeReference<ConcurrentHashMap<String, List<Long>>>() { // from class: com.ali.user.mobile.login.presenter.NeedLoginPresenter.1
                }, new Feature[0]));
            } else {
                needLoginRecordCache.put(str, new ConcurrentHashMap());
            }
        }
    }

    private static void updateActionPoints(ConcurrentHashMap<String, List<Long>> concurrentHashMap, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c06a6d21", new Object[]{concurrentHashMap, str, new Long(j)});
        } else if (!hsq.e(str)) {
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap<>();
            }
            List<Long> list = concurrentHashMap.get(str);
            if (list == null) {
                list = new ArrayList<>();
                concurrentHashMap.put(str, list);
            }
            if (list.size() >= LoginSwitch.getSwitch("need_login_action_points_list_size", 20)) {
                list.remove(0);
            }
            list.add(Long.valueOf(j));
        }
    }

    public static synchronized boolean checkNeedShowUI(String str) {
        synchronized (NeedLoginPresenter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("11549b04", new Object[]{str})).booleanValue();
            } else if (hsq.e(str)) {
                return false;
            } else {
                LoginTLogAdapter.e(TAG, "checkNeedShowUI source=" + str);
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                NeedLoginCheckData needLoginCheckData = getNeedLoginCheckData(DataProviderFactory.getApplicationContext().getSharedPreferences(NEED_LOGIN_DATA_SP_NAME, 0));
                if (!isValidNeedLoginCheckData(needLoginCheckData)) {
                    sendNeedLoginUT(str, "false", "", "noStrategy");
                    return false;
                }
                NeedLoginStrategy currentValidStrategy = getCurrentValidStrategy(needLoginCheckData.needLoginInfo.needLoginStrategies, str, currentTimeMillis);
                if (currentValidStrategy == null) {
                    LoginTLogAdapter.e(TAG, "checkNeedShowUI source=" + str + " , result = false, getCurrentValidStrategy is null");
                    return false;
                }
                SessionManager.sendCustomTrack("actionPoint", str, null);
                ConcurrentHashMap<String, List<Long>> actionPointsRecord = getActionPointsRecord();
                if (actionPointsRecord == null) {
                    actionPointsRecord = new ConcurrentHashMap<>();
                }
                updateActionPoints(actionPointsRecord, str, currentTimeMillis);
                if (!isActionPointCountReach(actionPointsRecord.get(str), currentValidStrategy, currentTimeMillis)) {
                    sendNeedLoginUT(str, RESULT_LIMIT, currentValidStrategy.needLoginTrackInfo, "judgeLogin");
                    LoginTLogAdapter.e(TAG, "checkNeedShowUI source=" + str + " , result = false, ActionPointCountReach is false");
                    saveActionPointsRecord(actionPointsRecord);
                    return false;
                }
                ConcurrentHashMap<String, List<Long>> loginShowUIMap = getLoginShowUIMap();
                if (loginShowUIMap == null) {
                    loginShowUIMap = new ConcurrentHashMap<>();
                }
                if (isShowUICountReachLimit(loginShowUIMap.get(str), currentValidStrategy, currentTimeMillis)) {
                    sendNeedLoginUT(str, RESULT_LIMIT, currentValidStrategy.needLoginTrackInfo, "limitLogin");
                    LoginTLogAdapter.e(TAG, "checkNeedShowUI source=" + str + " , result = limit_isShowUICountReachLimit");
                    saveActionPointsRecord(actionPointsRecord);
                    return false;
                } else if (isStrategyLimitReach(currentValidStrategy, needLoginCheckData, loginShowUIMap, str, currentTimeMillis)) {
                    LoginTLogAdapter.e(TAG, "checkNeedShowUI source=" + str + " , result = limit_isStrategyLimitReach");
                    saveActionPointsRecord(actionPointsRecord);
                    return false;
                } else {
                    actionPointsRecord.remove(str);
                    LoginTLogAdapter.e(TAG, "checkNeedShowUI source=" + str + " , result = true");
                    sendNeedLoginUT(str, "true", currentValidStrategy.needLoginTrackInfo, "");
                    saveActionPointsRecord(actionPointsRecord);
                    return true;
                }
            }
        }
    }

    private static NeedLoginStrategy getCurrentValidStrategy(List<NeedLoginStrategy> list, String str, long j) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NeedLoginStrategy) ipChange.ipc$dispatch("c8e9d3f5", new Object[]{list, str, new Long(j)});
        }
        if (list == null) {
            return null;
        }
        for (NeedLoginStrategy needLoginStrategy : list) {
            if (needLoginStrategy != null && str.equals(needLoginStrategy.actionPoint)) {
                if (needLoginStrategy.limitLoginTimeWindow <= 0 || needLoginStrategy.judgeLoginTimeWindow <= 0 || needLoginStrategy.judgeLoginCapacity <= 0 || needLoginStrategy.limitLoginCapacity <= 0) {
                    sendNeedLoginUT(str, RESULT_LIMIT, needLoginStrategy.needLoginTrackInfo, "errorData");
                } else if (needLoginStrategy.startTime < j && j < needLoginStrategy.endTime) {
                    return needLoginStrategy;
                } else {
                    sendNeedLoginUT(str, RESULT_LIMIT, needLoginStrategy.needLoginTrackInfo, "expired");
                }
                z = true;
            }
        }
        if (!z) {
            sendNeedLoginUT(str, "false", "", "noStrategy");
        }
        return null;
    }

    private static boolean isStrategyLimitReach(NeedLoginStrategy needLoginStrategy, NeedLoginCheckData needLoginCheckData, ConcurrentHashMap<String, List<Long>> concurrentHashMap, String str, long j) {
        NeedLoginInfo needLoginInfo;
        List<NeedLoginLimitStrategies> list;
        List<Long> list2;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23f08cbf", new Object[]{needLoginStrategy, needLoginCheckData, concurrentHashMap, str, new Long(j)})).booleanValue();
        }
        if (!(needLoginCheckData == null || (needLoginInfo = needLoginCheckData.needLoginInfo) == null || (list = needLoginInfo.needLoginLimitStrategies) == null || list.isEmpty())) {
            ConcurrentHashMap<String, NeedLoginStrategy> validStrategies = getValidStrategies(needLoginCheckData.needLoginInfo.needLoginStrategies, j);
            for (NeedLoginLimitStrategies needLoginLimitStrategies : list) {
                if (isLimitValid(j, needLoginLimitStrategies)) {
                    List<String> list3 = needLoginLimitStrategies.actionPoints;
                    long j2 = j - needLoginLimitStrategies.limitLoginTimeWindow;
                    if (list3.size() == 1) {
                        int i = z ? 1 : 0;
                        int i2 = z ? 1 : 0;
                        int i3 = z ? 1 : 0;
                        int i4 = z ? 1 : 0;
                        int i5 = z ? 1 : 0;
                        int i6 = z ? 1 : 0;
                        int i7 = z ? 1 : 0;
                        int i8 = z ? 1 : 0;
                        if ("global".equals(list3.get(i))) {
                            List<Long> list4 = concurrentHashMap.get("global");
                            if (list4 != null && !list4.isEmpty()) {
                                int i9 = 0;
                                for (Long l : list4) {
                                    if (l.longValue() > j2 && (i9 = i9 + 1) >= needLoginLimitStrategies.limitLoginCapacity) {
                                        sendNeedLoginUT(str, RESULT_LIMIT, needLoginStrategy.needLoginTrackInfo, "globalLimitLogin");
                                        return true;
                                    }
                                }
                                z = false;
                            }
                        }
                    }
                    if (list3.contains(str)) {
                        int i10 = 0;
                        for (String str2 : list3) {
                            if (validStrategies.get(str2) != null && (list2 = concurrentHashMap.get(str2)) != null && !list2.isEmpty()) {
                                for (Long l2 : list2) {
                                    if (l2.longValue() > j2 && (i10 = i10 + 1) >= needLoginLimitStrategies.limitLoginCapacity) {
                                        sendNeedLoginUT(str, RESULT_LIMIT, needLoginStrategy.needLoginTrackInfo, "moduleLimitLogin");
                                        return true;
                                    }
                                }
                                continue;
                            }
                        }
                    }
                    z = false;
                }
            }
        }
        return z;
    }
}
