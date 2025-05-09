package com.taobao.android.tschedule.cache;

import android.os.AsyncTask;
import android.os.SystemClock;
import anetwork.channel.Header;
import anetwork.channel.Param;
import anetwork.channel.Request;
import anetwork.channel.Response;
import anetwork.channel.statist.StatisticData;
import com.alibaba.fastjson.JSON;
import com.alibaba.security.realidentity.u2;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.android.tscheduleprotocol.ScheduleCache;
import com.taobao.android.tscheduleprotocol.ScheduleCacheCallBack;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.bns;
import tb.dms;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TScheduleHttpCache implements ScheduleCache<Object, Response, AsyncTask> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TS.httpCache";
    private static Map<Object, HttpCacheData> cacheData = new ConcurrentHashMap(32);
    private static final Response EMPTAY_RESPONSE = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class HttpCacheData implements Serializable {
        public ScheduleCacheCallBack callback;
        public Object key;
        public Request reqData;
        public Response response;
        public AsyncTask runningTask;
        public long startTime = SystemClock.uptimeMillis();
        public ScheduleProtocolCallback taskCallback;

        static {
            t2o.a(329252897);
        }

        public HttpCacheData(Object obj, ScheduleProtocolCallback scheduleProtocolCallback) {
            this.key = obj;
            this.taskCallback = scheduleProtocolCallback;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Response {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // anetwork.channel.Response
        public byte[] getBytedata() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("6e9b5c0e", new Object[]{this});
            }
            return new byte[0];
        }

        @Override // anetwork.channel.Response
        public Map<String, List<String>> getConnHeadFields() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("3de6d7b7", new Object[]{this});
            }
            return null;
        }

        @Override // anetwork.channel.Response
        public String getDesc() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f24b4252", new Object[]{this});
            }
            return null;
        }

        @Override // anetwork.channel.Response
        public Throwable getError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Throwable) ipChange.ipc$dispatch("4db6723e", new Object[]{this});
            }
            return null;
        }

        @Override // anetwork.channel.Response
        public StatisticData getStatisticData() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StatisticData) ipChange.ipc$dispatch("396a8f27", new Object[]{this});
            }
            return null;
        }

        @Override // anetwork.channel.Response
        public int getStatusCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("eae362ef", new Object[]{this})).intValue();
            }
            return -20190718;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f9708a;

        public b(Object obj) {
            this.f9708a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TScheduleHttpCache.access$000(TScheduleHttpCache.this, this.f9708a, ScheduleCacheCallBack.ScheduleCacheCallBackType.EXPIRE);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$tscheduleprotocol$ScheduleCacheCallBack$ScheduleCacheCallBackType;

        static {
            int[] iArr = new int[ScheduleCacheCallBack.ScheduleCacheCallBackType.values().length];
            $SwitchMap$com$taobao$android$tscheduleprotocol$ScheduleCacheCallBack$ScheduleCacheCallBackType = iArr;
            try {
                iArr[ScheduleCacheCallBack.ScheduleCacheCallBackType.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$tscheduleprotocol$ScheduleCacheCallBack$ScheduleCacheCallBackType[ScheduleCacheCallBack.ScheduleCacheCallBackType.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$tscheduleprotocol$ScheduleCacheCallBack$ScheduleCacheCallBackType[ScheduleCacheCallBack.ScheduleCacheCallBackType.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$android$tscheduleprotocol$ScheduleCacheCallBack$ScheduleCacheCallBackType[ScheduleCacheCallBack.ScheduleCacheCallBackType.EXPIRE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$android$tscheduleprotocol$ScheduleCacheCallBack$ScheduleCacheCallBackType[ScheduleCacheCallBack.ScheduleCacheCallBackType.FULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        t2o.a(329252893);
    }

    public static /* synthetic */ void access$000(TScheduleHttpCache tScheduleHttpCache, Object obj, ScheduleCacheCallBack.ScheduleCacheCallBackType scheduleCacheCallBackType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66c67e6b", new Object[]{tScheduleHttpCache, obj, scheduleCacheCallBackType});
        } else {
            tScheduleHttpCache.clearBefore(obj, scheduleCacheCallBackType);
        }
    }

    private void clearBefore(Object obj, ScheduleCacheCallBack.ScheduleCacheCallBackType scheduleCacheCallBackType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5acf41a7", new Object[]{this, obj, scheduleCacheCallBackType});
            return;
        }
        try {
            HttpCacheData remove = cacheData.remove(obj);
            if (remove != null) {
                AsyncTask asyncTask = remove.runningTask;
                if (asyncTask != null || remove.response != null) {
                    if (asyncTask != null) {
                        try {
                            asyncTask.cancel(true);
                        } catch (Throwable unused) {
                        }
                    }
                    track(scheduleCacheCallBackType, remove);
                }
            }
        } catch (Throwable th) {
            dms.a("downgrade", obj.toString(), "1.0", "TSchedule", "http", null, "TS_HTTP_EXCEPTION", th.getMessage());
        }
    }

    private String getConfigPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5818c912", new Object[]{this, str});
        }
        int indexOf = str.indexOf("?");
        if (indexOf > 0) {
            return str.substring(0, indexOf);
        }
        return str;
    }

    private String getUCode(ScheduleCacheCallBack.ScheduleCacheCallBackType scheduleCacheCallBackType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb44a055", new Object[]{this, scheduleCacheCallBackType});
        }
        int i = c.$SwitchMap$com$taobao$android$tscheduleprotocol$ScheduleCacheCallBack$ScheduleCacheCallBackType[scheduleCacheCallBackType.ordinal()];
        if (i == 1) {
            return "TS_HTTP_SUCCESS";
        }
        if (i == 2) {
            return "TS_HTTP_FAILED";
        }
        if (i == 3) {
            return "TS_HTTP_CANCEL";
        }
        if (i == 4) {
            return "TS_HTTP_EXPIRE";
        }
        if (i != 5) {
            return "TS_HTTP_OTHER";
        }
        return "TS_HTTP_FULL";
    }

    private HashMap<String, String> sumNetStat(StatisticData statisticData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e1c0b4cc", new Object[]{this, statisticData});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("isSuccess", String.valueOf(statisticData.isRequestSuccess));
        hashMap.put("host", String.valueOf(statisticData.host));
        hashMap.put("resultCode", String.valueOf(statisticData.resultCode));
        hashMap.put(u2.k, String.valueOf(statisticData.retryTime));
        return hashMap;
    }

    @Override // com.taobao.android.tscheduleprotocol.ScheduleCache
    public void fetch(Object obj, ScheduleCacheCallBack scheduleCacheCallBack, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df0a1056", new Object[]{this, obj, scheduleCacheCallBack, objArr});
        } else if (scheduleCacheCallBack != null) {
            if (obj == null) {
                scheduleCacheCallBack.onFinish(ScheduleCacheCallBack.ScheduleCacheCallBackType.FAILED, null, new Object[0]);
                return;
            }
            String configPath = getConfigPath(obj.toString());
            HttpCacheData httpCacheData = cacheData.get(configPath);
            if (httpCacheData == null) {
                scheduleCacheCallBack.onFinish(ScheduleCacheCallBack.ScheduleCacheCallBackType.FAILED, null, new Object[0]);
                return;
            }
            httpCacheData.callback = scheduleCacheCallBack;
            if (httpCacheData.runningTask == null) {
                callbackBiz(configPath);
            }
        }
    }

    public void saveReqData(Object obj, Request request) {
        HttpCacheData httpCacheData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e0105c", new Object[]{this, obj, request});
        } else if (request != null && (httpCacheData = cacheData.get(obj)) != null) {
            httpCacheData.reqData = request;
        }
    }

    private void callbackBiz(Object obj) {
        ScheduleCacheCallBack.ScheduleCacheCallBackType scheduleCacheCallBackType;
        ScheduleProtocolCallback.ScheduleProtocolCallbackType scheduleProtocolCallbackType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5cfc4b1", new Object[]{this, obj});
            return;
        }
        try {
            HttpCacheData remove = cacheData.remove(obj);
            Response response = remove == null ? null : remove.response;
            if (response == null) {
                scheduleCacheCallBackType = ScheduleCacheCallBack.ScheduleCacheCallBackType.FAILED;
            } else {
                scheduleCacheCallBackType = ScheduleCacheCallBack.ScheduleCacheCallBackType.SUCCESS;
            }
            HashMap<String, String> track = track(scheduleCacheCallBackType, remove);
            ScheduleCacheCallBack scheduleCacheCallBack = remove.callback;
            if (scheduleCacheCallBack != null) {
                scheduleCacheCallBack.onFinish(scheduleCacheCallBackType, response, new Object[0]);
            }
            if (remove.taskCallback != null) {
                if (response == null) {
                    scheduleProtocolCallbackType = ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_MISS;
                } else {
                    scheduleProtocolCallbackType = ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_HIT;
                }
                track.put("taskType", "http");
                remove.taskCallback.onPreload(scheduleProtocolCallbackType, track);
            }
        } catch (Throwable th) {
            dms.a("downgrade", obj.toString(), "1.0", "TSchedule", "http", null, "TS_HTTP_EXCEPTION", th.getMessage());
        }
    }

    public void finish(Object obj, Response response, Object... objArr) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ecb7b55", new Object[]{this, obj, response, objArr});
            return;
        }
        HttpCacheData httpCacheData = cacheData.get(obj);
        if (httpCacheData != null) {
            if (response == null) {
                response = EMPTAY_RESPONSE;
            }
            httpCacheData.response = response;
            httpCacheData.runningTask = null;
            if (httpCacheData.callback != null) {
                callbackBiz(obj);
                return;
            }
            if (objArr != null && objArr.length > 0) {
                try {
                    j = Long.valueOf(objArr[0].toString()).longValue();
                } catch (Throwable unused) {
                }
                bns.a().e(new b(obj), j);
            }
            j = 10000;
            bns.a().e(new b(obj), j);
        }
    }

    public void prefetch(Object obj, AsyncTask asyncTask, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ae4cbfe", new Object[]{this, obj, asyncTask, objArr});
            return;
        }
        clearBefore(obj, ScheduleCacheCallBack.ScheduleCacheCallBackType.CANCEL);
        cacheData.put(obj, new HttpCacheData(obj, (objArr == null || objArr.length == 0) ? null : objArr[0]));
    }

    private HashMap<String, String> track(ScheduleCacheCallBack.ScheduleCacheCallBackType scheduleCacheCallBackType, HttpCacheData httpCacheData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("15980627", new Object[]{this, scheduleCacheCallBackType, httpCacheData});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(HiAnalyticsConstant.BI_KEY_COST_TIME, String.valueOf(SystemClock.uptimeMillis() - httpCacheData.startTime));
        if (scheduleCacheCallBackType == ScheduleCacheCallBack.ScheduleCacheCallBackType.SUCCESS) {
            dms.b("downgrade", httpCacheData.key.toString(), "1.0", "TSchedule", "http", hashMap);
        } else {
            Request request = httpCacheData.reqData;
            if (request != null) {
                hashMap.put("req_url", request.getUrlString());
                List<Header> headers = httpCacheData.reqData.getHeaders();
                if (headers != null && !headers.isEmpty()) {
                    hashMap.put("headers", JSON.toJSONString(headers));
                }
                List<Param> params = httpCacheData.reqData.getParams();
                if (params != null && !params.isEmpty()) {
                    hashMap.put("api_params", JSON.toJSONString(params));
                }
            }
            Response response = httpCacheData.response;
            StatisticData statisticData = response == null ? null : response.getStatisticData();
            if (statisticData != null) {
                hashMap = sumNetStat(statisticData);
            }
            dms.a("downgrade", httpCacheData.key.toString(), "1.0", "TSchedule", "http", hashMap, getUCode(scheduleCacheCallBackType), null);
        }
        return hashMap;
    }
}
