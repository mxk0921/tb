package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class t4s implements fwd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28492a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f28492a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AppMonitor.Counter.commit("TLOG_STATISTICS", "TLOG_ERROR", this.f28492a, 1.0d);
            TLog.loge("TLOG", "TLogDataStatistics", "TLOG_ERROR: event=" + this.b + ", content=" + this.f28492a);
        }
    }

    public t4s(Context context) {
    }

    public final void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6d10feb", new Object[]{this, str, map});
            return;
        }
        try {
            if (!str.startsWith("ut_tlog_file_upload_") && !str.startsWith("ut_tlog_arup_")) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("event=");
            sb.append(str);
            sb.append(";");
            sb.append("ts=");
            sb.append(System.currentTimeMillis());
            sb.append(";");
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    sb.append(entry.getKey());
                    sb.append("=");
                    sb.append(entry.getValue());
                    sb.append(";");
                }
            }
            AppMonitor.Alarm.commitSuccess("TLOG_STATISTICS", "TLOG_UPLOAD", sb.toString());
        } catch (Exception e) {
            Log.e("TLogDataStatistics", "eventToDP2", e);
        }
    }

    public final void b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8fb0202", new Object[]{this, str, map});
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("event=");
            sb.append(str);
            sb.append(";");
            sb.append("ts=");
            sb.append(System.currentTimeMillis());
            sb.append(";");
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    sb.append(entry.getKey());
                    sb.append("=");
                    sb.append(entry.getValue());
                    sb.append(";");
                }
            }
            e6s.d().c(new a(sb.toString(), str));
        } catch (Exception e) {
            Log.e("TLogDataStatistics", "eventToDP2", e);
        }
    }

    public final void c(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3957f90", new Object[]{this, map});
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
                sb.append(";");
            }
        }
        if (map != null) {
            str = sb.toString();
        } else {
            str = "";
        }
        Log.e("TLogDataStatistics", "TLog fileSizeEventToDP2: data=" + str);
        AppMonitor.Alarm.commitSuccess("TLOG_STATISTICS", "TLOG_FILE", sb.toString());
    }

    @Override // tb.fwd
    public void d(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d365127a", new Object[]{this, str, map});
        } else if (!TextUtils.isEmpty(str)) {
            if (v4s.UT_TLOG_FILE_SIZE.equals(str)) {
                c(map);
            } else if (v4s.a(str)) {
                b(str, map);
            } else {
                UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder(str);
                uTHitBuilders$UTCustomHitBuilder.setEventPage("TLOG_STATISTICS");
                uTHitBuilders$UTCustomHitBuilder.setProperty("ts", String.valueOf(System.currentTimeMillis()));
                if (map != null) {
                    uTHitBuilders$UTCustomHitBuilder.setProperties(map);
                }
                UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
                if (map != null) {
                    map.toString();
                }
                a(str, map);
            }
        }
    }
}
