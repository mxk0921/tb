package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class s7l extends l6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ScheduledExecutorService j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f27848a;
        public final /* synthetic */ int b;

        public a(JSONObject jSONObject, int i) {
            this.f27848a = jSONObject;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String string = this.f27848a.getString("page");
            if (!TextUtils.isEmpty(string)) {
                String string2 = this.f27848a.getString("arg1");
                String string3 = this.f27848a.getString("arg2");
                String string4 = this.f27848a.getString("arg3");
                String str = TextUtils.isEmpty(string3) ? "" : string3;
                String str2 = TextUtils.isEmpty(string4) ? "" : string4;
                JSONObject jSONObject = this.f27848a.getJSONObject("args");
                HashMap hashMap = new HashMap();
                if (jSONObject != null) {
                    for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (!TextUtils.isEmpty(key) && value != null) {
                            hashMap.put(key, String.valueOf(value));
                        }
                    }
                }
                try {
                    UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(string, this.b, string2, str, str2, hashMap).build());
                } catch (Throwable th) {
                    lbq.c("mytaobao", "UserTrackSubscriber.onHandleEvent", th);
                }
            }
        }
    }

    public static /* synthetic */ Object ipc$super(s7l s7lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/event/OptimizeUserTrackSubscriber");
    }

    @Override // tb.l6v
    public void t(b8v b8vVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        JSONObject fields = j().getFields();
        if (fields != null) {
            try {
                i = fields.getInteger("eventId").intValue();
            } catch (Exception unused) {
                i = -1;
            }
            if (i >= 0) {
                JSONObject jSONObject = fields.getJSONObject("nextPage");
                a aVar = new a(fields, i);
                if (jSONObject == null) {
                    j.execute(aVar);
                    return;
                }
                aVar.run();
                HashMap hashMap = new HashMap();
                if (jSONObject != null) {
                    for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (!TextUtils.isEmpty(key) && value != null) {
                            hashMap.put(key, String.valueOf(value));
                        }
                    }
                    try {
                        UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(hashMap);
                    } catch (Throwable th) {
                        UnifyLog.e("OptimizeUserTrackSubscriber", th.getMessage());
                    }
                    try {
                        UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(hashMap));
                    } catch (Throwable th2) {
                        UnifyLog.e("OptimizeUserTrackSubscriber", th2.getMessage());
                    }
                }
            }
        }
    }

    static {
        t2o.a(745538130);
        ScheduledExecutorService newScheduledThreadPool = VExecutors.newScheduledThreadPool(1, new Schedules.MyThreadNameFactory("mtbUltronUT"));
        j = newScheduledThreadPool;
        ((ThreadPoolExecutor) newScheduledThreadPool).setKeepAliveTime(3000L, TimeUnit.MILLISECONDS);
        ((ThreadPoolExecutor) newScheduledThreadPool).allowCoreThreadTimeOut(true);
    }
}
