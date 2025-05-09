package tb;

import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.appmonitor.IAppMonitor;
import anet.channel.statist.AlarmObject;
import anet.channel.statist.CountObject;
import anet.channel.statist.RequestStatistic;
import anet.channel.statist.StatObject;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xqr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final yxb f31548a = new aih();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements IAppMonitor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // anet.channel.appmonitor.IAppMonitor
        public void commitAlarm(AlarmObject alarmObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5af4398", new Object[]{this, alarmObject});
            }
        }

        @Override // anet.channel.appmonitor.IAppMonitor
        public void commitCount(CountObject countObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6908fad8", new Object[]{this, countObject});
            }
        }

        @Override // anet.channel.appmonitor.IAppMonitor
        public void commitStat(StatObject statObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbe12d44", new Object[]{this, statObject});
            } else if (statObject instanceof RequestStatistic) {
                xqr.b((RequestStatistic) statObject);
                wuq.a().b(statObject);
            }
        }

        @Override // anet.channel.appmonitor.IAppMonitor
        public void register() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
            }
        }

        @Override // anet.channel.appmonitor.IAppMonitor
        public void register(Class<?> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21a0f6d3", new Object[]{this, cls});
            }
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else {
            AppMonitor.setApmMonitor(new a());
        }
    }

    public static void b(RequestStatistic requestStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b82fc6", new Object[]{requestStatistic});
        } else if (requestStatistic != null) {
            try {
                if (o48.d) {
                    String jSONString = JSON.toJSONString(requestStatistic);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("procedureName", (Object) "NetworkLib");
                    jSONObject.put(v4s.PARAM_UPLOAD_STAGE, (Object) "procedureSuccess");
                    jSONObject.put("content", (Object) jSONString);
                    ((aih) f31548a).b("network", jSONObject.toJSONString(), new Object[0]);
                }
            } catch (Exception unused) {
            }
            String str = requestStatistic.url;
            StringBuilder sb = new StringBuilder("");
            sb.append((str + System.currentTimeMillis()).hashCode());
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                HashMap hashMap = new HashMap();
                hashMap.put("timestamp", Long.valueOf(requestStatistic.start - requestStatistic.retryCostTime));
                qtj.b().onRequest(sb2, str, hashMap);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("timestamp", Long.valueOf(requestStatistic.start));
                qtj.b().a(sb2, str, hashMap2);
                HashMap hashMap3 = new HashMap();
                hashMap3.put("timestamp", Long.valueOf(requestStatistic.reqStart));
                qtj.b().onEvent(sb2, "data_request", hashMap3);
                HashMap hashMap4 = new HashMap();
                hashMap4.put("timestamp", Long.valueOf(requestStatistic.rspStart));
                qtj.b().onEvent(sb2, "first_package_response", hashMap4);
                HashMap hashMap5 = new HashMap();
                hashMap5.put("timestamp", Long.valueOf(requestStatistic.rspEnd));
                hashMap5.put("statusCode", Integer.valueOf(requestStatistic.statusCode));
                hashMap5.put("tnetErrorCode", Integer.valueOf(requestStatistic.tnetErrorCode));
                qtj.b().c(sb2, hashMap5);
            }
        }
    }
}
