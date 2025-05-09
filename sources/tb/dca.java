package tb;

import android.content.Intent;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher;
import com.taobao.monitor.impl.trace.c;
import com.taobao.monitor.impl.trace.d;
import com.taobao.monitor.procedure.c;
import com.taobao.orange.OConstant;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dca implements ApplicationBackgroundChangedDispatcher.b, c.AbstractC0626c, d.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public mdd f;

    /* renamed from: a  reason: collision with root package name */
    public int f17722a = 0;
    public int b = -1;
    public long c = -1;
    public boolean d = false;
    public long e = out.a();
    public int g = 0;
    public long h = 0;
    public long i = 0;
    public long j = 0;
    public final Map<String, Float> k = new LinkedHashMap();
    public boolean l = true;
    public final Runnable m = new a();
    public final Map<String, Long> n = new HashMap();
    public final Map<String, JSONObject> o = new HashMap();

    public static /* synthetic */ Map a(dca dcaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cec63723", new Object[]{dcaVar});
        }
        return dcaVar.n;
    }

    @Override // com.taobao.monitor.impl.trace.c.AbstractC0626c
    public void F(float f, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d77c72", new Object[]{this, new Float(f), new Integer(i), new Integer(i2)});
        } else if (this.d) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i3 = this.b;
            if (i3 > 0 && i2 > 0 && this.f17722a == 0 && i3 - i2 >= 0) {
                this.h += elapsedRealtime - this.c;
                this.g += i3 - i2;
            }
            if (f > 0.0f && this.k.size() < 400) {
                long a2 = out.a();
                if (a2 - this.j > 3000) {
                    this.k.put(String.valueOf(a2), Float.valueOf(f));
                    this.j = a2;
                }
            }
            this.f17722a = i;
            this.c = elapsedRealtime;
            this.b = i2;
        }
    }

    @Override // com.taobao.monitor.impl.trace.d.e
    public void H(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1aff1f", new Object[]{this, cllVar, new Long(j)});
        }
    }

    @Override // com.taobao.monitor.impl.trace.c.AbstractC0626c
    public void J(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbfef539", new Object[]{this, str});
        }
    }

    public final long d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c945e418", new Object[]{this, new Long(j)})).longValue();
        }
        long a2 = out.a();
        long j2 = 0;
        for (Map.Entry entry : ((HashMap) this.n).entrySet()) {
            long max = Math.max(((Long) entry.getValue()).longValue(), j);
            if (max < a2) {
                j2 += a2 - max;
            }
        }
        return j2;
    }

    @Override // com.taobao.monitor.impl.trace.c.AbstractC0626c
    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50fe35c7", new Object[]{this, str});
            return;
        }
        long longValue = ((Long) ((HashMap) this.n).remove(str)).longValue();
        if (this.d) {
            this.i += out.a() - Math.max(longValue, this.e);
        }
    }

    @Override // com.taobao.monitor.impl.trace.d.e
    public void p(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fdaffc8", new Object[]{this, cllVar, new Long(j)});
        }
    }

    @Override // com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher.b
    public void r(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("903f52fd", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        Intent a2 = l52.a(w9a.g().a());
        if (1 == i) {
            b(a2);
            w9a.g().f().postDelayed(this.m, 10000L);
        }
        if (i == 0) {
            c(a2);
            w9a.g().f().removeCallbacks(this.m);
        }
    }

    @Override // com.taobao.monitor.impl.trace.d.e
    public void v(cll cllVar, Map<String, Object> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81656cc6", new Object[]{this, cllVar, map, new Long(j)});
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            HashSet hashSet = new HashSet(dca.a(dca.this).keySet());
            for (String str : dca.a(dca.this).keySet()) {
                if (i < 20) {
                    i++;
                    hashSet.add(str);
                }
            }
            w9a.g().k().edit().putString("leakSensor", hashSet.toString()).apply();
        }
    }

    public final void b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe36db9", new Object[]{this, intent});
            return;
        }
        if (intent != null) {
            F(intent.getIntExtra("temperature", -1) / 10.0f, intent.getIntExtra("plugged", 0), (intent.getIntExtra(m09.TASK_TYPE_LEVEL, 0) * 100) / intent.getIntExtra("scale", 100));
        }
        this.d = false;
        mdd mddVar = this.f;
        if (mddVar != null) {
            mddVar.u("consumeBatteryPct", Integer.valueOf(this.g));
            this.f.u("unChargeDuration", Long.valueOf(this.h));
            this.f.u("batteryTemperature", this.k.toString().replace("=", ":"));
            this.f.j("procedureEndTime", out.a());
            this.f.u("highSpeedSensor", new JSONObject(this.o));
            this.f.u("SensorTotalDuration", Long.valueOf(d(this.e) + this.i));
            this.g = 0;
            this.h = 0L;
            ((LinkedHashMap) this.k).clear();
            ((HashMap) this.o).clear();
            this.f.end();
            this.i = 0L;
        }
    }

    @Override // com.taobao.monitor.impl.trace.d.e
    public void x(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8786d6", new Object[]{this, cllVar, new Long(j)});
        } else if (this.f != null && cllVar != null) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("pageName", cllVar.getPageName());
            hashMap.put("timestamp", Long.valueOf(j));
            this.f.d("onPageAppear", hashMap);
            op0.c().a(cllVar.x());
        }
    }

    public final void c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e148cf0", new Object[]{this, intent});
            return;
        }
        this.d = true;
        this.e = out.a();
        mdd a2 = sxm.b.a(z4u.a("/pageLoad"), new c.b().j(false).o(true).m(true).l(null).h());
        this.f = a2;
        a2.c();
        this.f.a("pageName", "APMGlobalForeground");
        this.f.j("procedureStartTime", this.e);
        this.f.j(OConstant.DIMEN_PROCESS_START_TIME, nca.i);
        this.f.a("timestampInterval", Long.valueOf(System.currentTimeMillis() - SystemClock.uptimeMillis()));
        if (this.l) {
            this.f.a("launchType", "COLD");
            this.l = false;
        }
        this.b = -1;
        this.j = 0L;
        if (intent != null) {
            F(intent.getIntExtra("temperature", -1) / 10.0f, intent.getIntExtra("plugged", 0), (intent.getIntExtra(m09.TASK_TYPE_LEVEL, 0) * 100) / intent.getIntExtra("scale", 100));
        }
        this.f.u("leakSensor", w9a.g().k().getString("leakSensor", ""));
    }

    @Override // com.taobao.monitor.impl.trace.c.AbstractC0626c
    public void s(String str, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2363ef", new Object[]{this, str, new Integer(i), new Long(j)});
            return;
        }
        ((HashMap) this.n).put(str, Long.valueOf(j));
        if (i <= 66667) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("delay", i);
                jSONObject.put("pageName", xol.a(b21.s().q()));
            } catch (JSONException e) {
                zq6.a("GlobalPageProcessor", e);
            }
            ((HashMap) this.o).put(str, jSONObject);
        }
    }
}
