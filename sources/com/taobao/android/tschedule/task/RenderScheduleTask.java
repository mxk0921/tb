package com.taobao.android.tschedule.task;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.android.tschedule.TScheduleInitialize;
import com.taobao.android.tschedule.task.ScheduleTask;
import com.taobao.android.tschedule.taskcontext.RenderTaskContext;
import com.taobao.android.tschedule.taskcontext.baseparams.TimeContent;
import com.taobao.android.tscheduleprotocol.RenderScheduleProtocol;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import mtopsdk.mtop.global.SDKUtils;
import tb.bns;
import tb.cms;
import tb.cns;
import tb.dms;
import tb.nms;
import tb.o78;
import tb.t2o;
import tb.vms;
import tb.wms;
import tb.yms;
import tb.z1x;
import tb.zdh;
import tb.zms;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RenderScheduleTask extends ScheduleTask<RenderTaskContext> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TS.render";
    private String[] subParams;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$tscheduleprotocol$ScheduleProtocolCallback$ScheduleProtocolCallbackType;

        static {
            int[] iArr = new int[ScheduleProtocolCallback.ScheduleProtocolCallbackType.values().length];
            $SwitchMap$com$taobao$android$tscheduleprotocol$ScheduleProtocolCallback$ScheduleProtocolCallbackType = iArr;
            try {
                iArr[ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_HIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$tscheduleprotocol$ScheduleProtocolCallback$ScheduleProtocolCallbackType[ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_MISS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$tscheduleprotocol$ScheduleProtocolCallback$ScheduleProtocolCallbackType[ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_CLEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$android$tscheduleprotocol$ScheduleProtocolCallback$ScheduleProtocolCallbackType[ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_EXPIRE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$android$tscheduleprotocol$ScheduleProtocolCallback$ScheduleProtocolCallbackType[ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_FULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$android$tscheduleprotocol$ScheduleProtocolCallback$ScheduleProtocolCallbackType[ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_OUT_OF_SERVICE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$taobao$android$tscheduleprotocol$ScheduleProtocolCallback$ScheduleProtocolCallbackType[ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_NOT_READY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$taobao$android$tscheduleprotocol$ScheduleProtocolCallback$ScheduleProtocolCallbackType[ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_SRC_NOT_EQUAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        t2o.a(329252985);
    }

    public RenderScheduleTask(String str, RenderTaskContext renderTaskContext) {
        super(str, renderTaskContext);
    }

    public static /* synthetic */ boolean access$000(RenderScheduleTask renderScheduleTask, RenderScheduleProtocol renderScheduleProtocol, ScheduleProtocolCallback.ScheduleProtocolCallbackType scheduleProtocolCallbackType, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55e1dd64", new Object[]{renderScheduleTask, renderScheduleProtocol, scheduleProtocolCallbackType, str, str2})).booleanValue();
        }
        return renderScheduleTask.clearRenderCache(renderScheduleProtocol, scheduleProtocolCallbackType, str, str2);
    }

    public static /* synthetic */ String access$100(RenderScheduleTask renderScheduleTask, ScheduleProtocolCallback.ScheduleProtocolCallbackType scheduleProtocolCallbackType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f12e04e", new Object[]{renderScheduleTask, scheduleProtocolCallbackType});
        }
        return renderScheduleTask.getUCode(scheduleProtocolCallbackType);
    }

    private static void asyncLog(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fa034ad", new Object[]{runnable});
        } else {
            bns.a().d(runnable);
        }
    }

    private boolean clearRenderCache(RenderScheduleProtocol renderScheduleProtocol, ScheduleProtocolCallback.ScheduleProtocolCallbackType scheduleProtocolCallbackType, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("527f461f", new Object[]{this, renderScheduleProtocol, scheduleProtocolCallbackType, str, str2})).booleanValue();
        }
        if (scheduleProtocolCallbackType == ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_OUT_OF_SERVICE || scheduleProtocolCallbackType == ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_SRC_NOT_EQUAL) {
            return false;
        }
        renderScheduleProtocol.removePreloadedInstance(str);
        yms.m(str2);
        return true;
    }

    private String getUCode(ScheduleProtocolCallback.ScheduleProtocolCallbackType scheduleProtocolCallbackType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a24e63d", new Object[]{this, scheduleProtocolCallbackType});
        }
        switch (a.$SwitchMap$com$taobao$android$tscheduleprotocol$ScheduleProtocolCallback$ScheduleProtocolCallbackType[scheduleProtocolCallbackType.ordinal()]) {
            case 1:
                return "TS_RENDER_HIT";
            case 2:
                return "TS_RENDER_MISS";
            case 3:
                return "TS_RENDER_CLEAR";
            case 4:
                return "TS_RENDER_EXPIRE";
            case 5:
                return "TS_RENDER_FULL";
            case 6:
                return "TS_RENDER_OUT_OF_SERVICE";
            case 7:
                return "TYPE_NOT_READY";
            case 8:
                return "TYPE_SRC_NOT_EQUAL";
            default:
                return "TS_RENDER_OTHER";
        }
    }

    public static /* synthetic */ Object ipc$super(RenderScheduleTask renderScheduleTask, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/task/RenderScheduleTask");
    }

    private boolean isValidContext(RenderTaskContext renderTaskContext) {
        RenderTaskContext.RenderParams renderParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89525f3f", new Object[]{this, renderTaskContext})).booleanValue();
        }
        if (renderTaskContext == null || (renderParams = renderTaskContext.params) == null || TextUtils.isEmpty(renderParams.url)) {
            return false;
        }
        return true;
    }

    private boolean isValidEdition(RenderTaskContext renderTaskContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84b274e", new Object[]{this, renderTaskContext})).booleanValue();
        }
        if (TextUtils.isEmpty(renderTaskContext.params.editions)) {
            return true;
        }
        return Arrays.asList(renderTaskContext.params.editions.split(",")).contains(o78.i(TScheduleInitialize.b()).editionCode);
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public boolean cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("707fe605", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public boolean isFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9673ae47", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public boolean validate(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("152894ae", new Object[]{this, str, objArr})).booleanValue();
        }
        return isValid();
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public ScheduleTask.THREAD_TYPE workThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduleTask.THREAD_TYPE) ipChange.ipc$dispatch("4b063569", new Object[]{this});
        }
        return ScheduleTask.THREAD_TYPE.MAIN;
    }

    public RenderScheduleTask(String str, RenderTaskContext renderTaskContext, ScheduleProtocolCallback scheduleProtocolCallback) {
        super(str, renderTaskContext, scheduleProtocolCallback);
    }

    private String executeRender(final String str, String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b89a25d0", new Object[]{this, str, str2, str3});
        }
        final RenderScheduleProtocol e = vms.c().e(((RenderTaskContext) this.taskContext).bizCode);
        if (e == null) {
            return "TS_NO_PROTOCOL";
        }
        final String str4 = ((RenderTaskContext) this.taskContext).bizCode;
        if (!TextUtils.isEmpty(str2)) {
            e.removePreloadedInstance(str2);
            yms.m(this.taskKey);
            zdh.a(TAG, "TS_RENDER_URL_CHANGE, remove old webview");
        } else if (TextUtils.isEmpty(str)) {
            e.clearPreloadedInstances();
            yms.m(this.taskKey);
            zdh.a(TAG, "empty url, clearPreloadedInstances");
            return "TS_EMPTY_URL_SCHEDULED";
        }
        ScheduleProtocolCallback scheduleProtocolCallback = new ScheduleProtocolCallback() { // from class: com.taobao.android.tschedule.task.RenderScheduleTask.1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public Map<String, String> extraParams = null;

            @Override // com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback
            public boolean resolveParameter(String str5, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("1ba0efdb", new Object[]{this, str5, map})).booleanValue();
                }
                if (map != null && this.extraParams == null) {
                    HashMap hashMap = new HashMap(map.size());
                    this.extraParams = hashMap;
                    hashMap.putAll(map);
                }
                return cns.b(str5, map, ((RenderTaskContext) RenderScheduleTask.this.taskContext).params.spmVerifyValue);
            }

            @Override // com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback
            public boolean resolveType(ScheduleProtocolCallback.ScheduleProtocolCallbackType scheduleProtocolCallbackType) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("8945bdc1", new Object[]{this, scheduleProtocolCallbackType})).booleanValue();
                }
                if (scheduleProtocolCallbackType == ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_NOT_READY) {
                    return ((RenderTaskContext) RenderScheduleTask.this.taskContext).params.ignoreStatusCheck;
                }
                return false;
            }

            @Override // com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback
            public void onPreload(ScheduleProtocolCallback.ScheduleProtocolCallbackType scheduleProtocolCallbackType, HashMap<String, String> hashMap) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("df1a7672", new Object[]{this, scheduleProtocolCallbackType, hashMap});
                    return;
                }
                zdh.a(RenderScheduleTask.TAG, "preload finish, result=" + scheduleProtocolCallbackType.name());
                HashMap hashMap2 = new HashMap();
                hashMap2.put("task_version", ((RenderTaskContext) RenderScheduleTask.this.taskContext).version);
                hashMap2.put("prefetchUrl", str);
                hashMap2.put("bizCode", str4);
                hashMap2.put("configPath", str3);
                if (hashMap != null) {
                    if (hashMap.containsKey("url")) {
                        hashMap2.put("realUrl", hashMap.get("url"));
                    }
                    hashMap2.putAll(hashMap);
                }
                Map<String, String> map = this.extraParams;
                if (map != null) {
                    hashMap2.putAll(map);
                    this.extraParams.clear();
                    this.extraParams = null;
                }
                RenderScheduleTask renderScheduleTask = RenderScheduleTask.this;
                RenderScheduleTask.access$000(renderScheduleTask, e, scheduleProtocolCallbackType, str, renderScheduleTask.taskKey);
                if (a.$SwitchMap$com$taobao$android$tscheduleprotocol$ScheduleProtocolCallback$ScheduleProtocolCallbackType[scheduleProtocolCallbackType.ordinal()] != 1) {
                    String str5 = str3;
                    RenderScheduleTask renderScheduleTask2 = RenderScheduleTask.this;
                    T t = renderScheduleTask2.taskContext;
                    dms.a("downgrade", str5, ((RenderTaskContext) t).version, "TSchedule", ((RenderTaskContext) t).type, hashMap2, RenderScheduleTask.access$100(renderScheduleTask2, scheduleProtocolCallbackType), null);
                    return;
                }
                String str6 = str3;
                T t2 = RenderScheduleTask.this.taskContext;
                dms.b("downgrade", str6, ((RenderTaskContext) t2).version, "TSchedule", ((RenderTaskContext) t2).type, hashMap2);
            }
        };
        HashMap hashMap = new HashMap(3);
        String e2 = zms.e("injectJs", "");
        if (!TextUtils.isEmpty(e2)) {
            hashMap.put("injectJs", e2);
        }
        T t = this.taskContext;
        if (((RenderTaskContext) t).params.timeout > 0) {
            hashMap.put("timeout", String.valueOf(((RenderTaskContext) t).params.timeout * 1000));
        } else {
            hashMap.put("timeout", String.valueOf(1800000));
        }
        String str5 = ((RenderTaskContext) this.taskContext).type;
        str5.hashCode();
        if (!str5.equals(z1x.PRE_RENDER)) {
            if (!str5.equals("preCreate")) {
                return "TS_ERROR_TASK_TYPE";
            }
            if (!e.preCreateInstanceWithUrl(TScheduleInitialize.b(), str, scheduleProtocolCallback, hashMap)) {
                return "TS_PRE_CREATE_RENDER_ERROR";
            }
            yms.d(this.taskKey, str);
            zdh.a(TAG, "预创建方法preCreateInstanceWithUrl已调用，并且返回true");
            return null;
        } else if (!e.preloadWithUrl(TScheduleInitialize.b(), str, scheduleProtocolCallback, hashMap)) {
            return "TS_PRE_RENDER_RENDER_ERROR";
        } else {
            yms.d(this.taskKey, str);
            zdh.a(TAG, "预渲染方法preloadWithUrl已调用，并且返回true");
            return null;
        }
    }

    private boolean isTaskEnabled(RenderTaskContext renderTaskContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e188f554", new Object[]{this, renderTaskContext})).booleanValue();
        }
        String str = this.taskKey;
        return zms.b("render_task_switch_" + str, false);
    }

    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        return zms.b(wms.SWITCH_KEY_ENABLE_TASK_RENDER, false) && isValidContext((RenderTaskContext) this.taskContext) && isTaskEnabled((RenderTaskContext) this.taskContext) && isValidEdition((RenderTaskContext) this.taskContext);
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public void realExecute(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f156e9", new Object[]{this, str, objArr});
            return;
        }
        if (nms.f) {
            try {
                long correctionTimeMillis = SDKUtils.getCorrectionTimeMillis();
                T t = this.taskContext;
                TimeContent i = cns.i(((RenderTaskContext) t).params.url, ((RenderTaskContext) t).params.timeContent);
                if (correctionTimeMillis < cms.sDateFormat.parse(i.validTime).getTime() + (new Random().nextInt(Math.max(i.delayTimeMax, 3) * 60) * 1000)) {
                    zdh.a(TAG, "renderTask currentTime < validTime");
                    return;
                }
            } catch (Exception e) {
                zdh.b(TAG, "execute RenderTask error, type=" + ((RenderTaskContext) this.taskContext).type, e);
                return;
            }
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        String c = cns.c(str);
        try {
            String i2 = yms.i(this.taskKey);
            if (TextUtils.equals(i2, str)) {
                zdh.a(TAG, "execute RenderTask discard, cache exist");
                return;
            }
            String executeRender = executeRender(str, i2, c);
            zdh.a(TAG, "execute RenderTask finish, result=".concat(executeRender == null ? "success" : executeRender));
            HashMap hashMap = new HashMap();
            hashMap.put(HiAnalyticsConstant.BI_KEY_COST_TIME, String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            hashMap.put("targetUrl", str);
            if (executeRender == null) {
                String str2 = ((RenderTaskContext) this.taskContext).version;
                dms.b("downgrade", c, str2, "TSchedule", ((RenderTaskContext) this.taskContext).type + "_execute", hashMap);
                return;
            }
            String str3 = ((RenderTaskContext) this.taskContext).version;
            dms.a("downgrade", c, str3, "TSchedule", ((RenderTaskContext) this.taskContext).type + "_execute", hashMap, executeRender, "");
        } catch (Throwable th) {
            zdh.b(TAG, "execute RenderTask error, type=" + ((RenderTaskContext) this.taskContext).type, th);
            String str4 = ((RenderTaskContext) this.taskContext).version;
            dms.a("downgrade", c, str4, "TSchedule", ((RenderTaskContext) this.taskContext).type + "_execute", null, "TS_RENDER_EXCEPTION", th.getMessage());
        }
    }
}
