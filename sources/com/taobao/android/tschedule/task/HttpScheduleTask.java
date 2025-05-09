package com.taobao.android.tschedule.task;

import android.os.AsyncTask;
import anetwork.channel.Network;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.TScheduleInitialize;
import com.taobao.android.tschedule.cache.TScheduleHttpCache;
import com.taobao.android.tschedule.task.ScheduleTask;
import com.taobao.android.tschedule.taskcontext.HttpTaskContext;
import com.taobao.android.tscheduleprotocol.ScheduleCacheCallBack;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import tb.dms;
import tb.t2o;
import tb.wms;
import tb.zms;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class HttpScheduleTask extends ScheduleTask<HttpTaskContext> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TS.http";
    private static TScheduleHttpCache cache = new TScheduleHttpCache();
    public Network network = new DegradableNetwork(TScheduleInitialize.b());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends AsyncTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9714a;
        public final /* synthetic */ Object[] b;

        public a(String str, Object[] objArr) {
            this.f9714a = str;
            this.b = objArr;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/task/HttpScheduleTask$1");
        }

        /* renamed from: a */
        public Void doInBackground(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6d120651", new Object[]{this, objArr});
            }
            HttpScheduleTask httpScheduleTask = HttpScheduleTask.this;
            String str = ((HttpTaskContext) httpScheduleTask.taskContext).params.url;
            try {
                HttpScheduleTask.access$100().finish((Object) str, HttpScheduleTask.access$000(httpScheduleTask, this.f9714a, this.b), Long.valueOf(((HttpTaskContext) HttpScheduleTask.this.taskContext).params.timeout));
            } catch (Throwable th) {
                try {
                    dms.a("downgrade", str, "1.0", "TSchedule", ((HttpTaskContext) HttpScheduleTask.this.taskContext).type, null, "TS_HTTP_EXCEPTION", th.getMessage());
                    HttpScheduleTask.access$100().finish((Object) str, (Response) null, Long.valueOf(((HttpTaskContext) HttpScheduleTask.this.taskContext).params.timeout));
                } catch (Throwable th2) {
                    HttpScheduleTask.access$100().finish((Object) str, (Response) null, Long.valueOf(((HttpTaskContext) HttpScheduleTask.this.taskContext).params.timeout));
                    throw th2;
                }
            }
            return null;
        }
    }

    static {
        t2o.a(329252977);
    }

    public HttpScheduleTask(String str, HttpTaskContext httpTaskContext) {
        super(str, httpTaskContext);
        init();
    }

    public static /* synthetic */ Response access$000(HttpScheduleTask httpScheduleTask, String str, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("bf59abda", new Object[]{httpScheduleTask, str, objArr});
        }
        return httpScheduleTask.syncReq(str, objArr);
    }

    public static /* synthetic */ TScheduleHttpCache access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TScheduleHttpCache) ipChange.ipc$dispatch("f2791176", new Object[0]);
        }
        return cache;
    }

    public static void fetchData(Object obj, ScheduleCacheCallBack scheduleCacheCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4707b345", new Object[]{obj, scheduleCacheCallBack});
        } else {
            cache.fetch(obj, scheduleCacheCallBack, new Object[0]);
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        T t = this.taskContext;
        if (t != 0 && ((HttpTaskContext) t).params != null && ((HttpTaskContext) t).params.apiParams != null) {
            prepareTaskParams(((HttpTaskContext) t).params.apiParams);
        }
    }

    public static /* synthetic */ Object ipc$super(HttpScheduleTask httpScheduleTask, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/task/HttpScheduleTask");
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
    public void realExecute(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f156e9", new Object[]{this, str, objArr});
            return;
        }
        a aVar = new a(str, objArr);
        cache.prefetch((Object) ((HttpTaskContext) this.taskContext).params.url, (AsyncTask) aVar, this.taskCallback);
        aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public boolean validate(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("152894ae", new Object[]{this, str, objArr})).booleanValue();
        }
        T t = this.taskContext;
        if (t == 0 || ((HttpTaskContext) t).params == null || ((HttpTaskContext) t).params.url == null || ((HttpTaskContext) t).params.url == "" || !zms.b(wms.SWITCH_KEY_ENABLE_TASK_HTTP, false)) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public ScheduleTask.THREAD_TYPE workThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduleTask.THREAD_TYPE) ipChange.ipc$dispatch("4b063569", new Object[]{this});
        }
        return ScheduleTask.THREAD_TYPE.CURRENT;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private anetwork.channel.Response syncReq(java.lang.String r9, java.lang.Object... r10) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tschedule.task.HttpScheduleTask.syncReq(java.lang.String, java.lang.Object[]):anetwork.channel.Response");
    }

    public HttpScheduleTask(String str, HttpTaskContext httpTaskContext, ScheduleProtocolCallback scheduleProtocolCallback) {
        super(str, httpTaskContext, scheduleProtocolCallback);
        init();
    }
}
