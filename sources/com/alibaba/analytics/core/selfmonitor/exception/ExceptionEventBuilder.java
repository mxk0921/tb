package com.alibaba.analytics.core.selfmonitor.exception;

import android.content.Context;
import com.alibaba.appmonitor.event.EventType;
import com.alibaba.appmonitor.pool.ReuseJSONArray;
import com.alibaba.appmonitor.pool.ReuseJSONObject;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import tb.hsq;
import tb.iqq;
import tb.j4v;
import tb.o2w;
import tb.ozo;
import tb.pg1;
import tb.t2o;
import tb.to1;
import tb.u51;
import tb.w0v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ExceptionEventBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum ExceptionType {
        UT,
        AP,
        COMMON;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ExceptionType exceptionType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/analytics/core/selfmonitor/exception/ExceptionEventBuilder$ExceptionType");
        }

        public static ExceptionType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExceptionType) ipChange.ipc$dispatch("8e34e5fe", new Object[]{str});
            }
            return (ExceptionType) Enum.valueOf(ExceptionType.class, str);
        }
    }

    static {
        t2o.a(962592920);
    }

    public static String a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("37a5fba1", new Object[]{th});
        }
        StringBuilder c = iqq.a().c();
        c.append(th.getClass().getName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                c.append(stackTraceElement.toString());
            }
        }
        String sb = c.toString();
        if (hsq.e(sb)) {
            sb = th.toString();
        }
        iqq.a().b(c);
        return sb;
    }

    public static String b(ExceptionType exceptionType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12d8fb3e", new Object[]{exceptionType});
        }
        if (ExceptionType.UT == exceptionType) {
            return "ut-exception";
        }
        if (ExceptionType.COMMON == exceptionType) {
            return "ut-common-exception";
        }
        return "sdk-exception";
    }

    public static void c(ExceptionType exceptionType, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa8b4ae9", new Object[]{exceptionType, th});
        } else if (th != null) {
            try {
                w0v w0vVar = (w0v) to1.a().d(w0v.class, new Object[0]);
                EventType eventType = EventType.ALARM;
                w0vVar.f30388a = eventType.getEventId();
                HashMap hashMap = new HashMap();
                hashMap.put("meta", ozo.b());
                ReuseJSONArray reuseJSONArray = (ReuseJSONArray) to1.a().d(ReuseJSONArray.class, new Object[0]);
                reuseJSONArray.add(d(exceptionType, th));
                hashMap.put("data", reuseJSONArray);
                ((HashMap) w0vVar.d).put(eventType.getAggregateEventArgsKey(), JSON.toJSONString(hashMap));
                w0vVar.b = "APPMONITOR";
                w0vVar.c = b(exceptionType);
                j4v.a(w0vVar);
                to1.a().c(reuseJSONArray);
            } catch (Throwable unused) {
            }
        }
    }

    public static JSONObject d(ExceptionType exceptionType, Throwable th) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c47e688c", new Object[]{exceptionType, th});
        }
        JSONObject jSONObject = (JSONObject) to1.a().d(ReuseJSONObject.class, new Object[0]);
        Context g = o2w.k().g();
        if (g != null) {
            jSONObject.put("pname", (Object) u51.d(g));
        }
        jSONObject.put("page", (Object) "APPMONITOR");
        jSONObject.put("monitorPoint", (Object) b(exceptionType));
        jSONObject.put("arg", (Object) th.getClass().getSimpleName());
        jSONObject.put("successCount", (Object) 0);
        jSONObject.put("failCount", (Object) 1);
        ArrayList arrayList = new ArrayList();
        String a2 = a(th);
        if (a2 != null) {
            JSONObject jSONObject2 = (JSONObject) to1.a().d(ReuseJSONObject.class, new Object[0]);
            jSONObject2.put("errorCode", (Object) a2);
            jSONObject2.put("errorCount", (Object) 1);
            arrayList.add(jSONObject2);
        }
        jSONObject.put(pg1.ATOM_errors, (Object) arrayList);
        return jSONObject;
    }
}
