package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.tao.log.TLog;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tkg extends kti<fjn, gjn> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public tkg(MetricContext metricContext, c0c c0cVar, fjn fjnVar) {
        super(metricContext, c0cVar, fjnVar);
    }

    public static /* synthetic */ Object ipc$super(tkg tkgVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/processor/memory/LeakMetricProcessor");
    }

    @Override // tb.kti
    public int[] c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("df81d3cb", new Object[]{this});
        }
        return new int[]{1};
    }

    /* renamed from: h */
    public void a(gjn gjnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("657ae922", new Object[]{this, gjnVar});
        } else {
            i(gjnVar.a(), gjnVar.b());
        }
    }

    public final void i(List<v4g> list, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("535edfe5", new Object[]{this, list, new Long(j)});
            return;
        }
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "ALIVE_OBJECTS");
            jSONObject.put("checkUpTime", j);
            JSONArray jSONArray = new JSONArray();
            for (v4g v4gVar : list) {
                if (v4gVar.get() != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("object", v4gVar.a());
                    jSONObject2.put("tag", v4gVar.b());
                    jSONObject2.put("watchTime", uptimeMillis - v4gVar.c());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("detail", jSONArray);
            TLog.loge("MetricKit.LeakMetricProcessor", jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
