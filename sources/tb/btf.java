package tb;

import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.analysis.stat.FalcoJankStatistic;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class btf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16612a;
    public final Map<String, d> b = new HashMap();
    public final Map<String, c> c = new HashMap();
    public c d;
    public int e;
    public int f;
    public b g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private long f16613a;
        private boolean b;

        private b() {
        }

        private void d(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b9205", new Object[]{this, new Long(j)});
                return;
            }
            this.f16613a = System.currentTimeMillis() + j;
            crt.n(this, j, TimeUnit.MILLISECONDS);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a84d51", new Object[]{this});
            } else {
                this.f16613a = System.currentTimeMillis() + (ctf.j().k() * 1000);
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("810347e9", new Object[]{this});
                return;
            }
            this.b = true;
            d(ctf.j().k() * 1000);
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            } else {
                this.b = false;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.b) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.f16613a;
                if (currentTimeMillis < j) {
                    d(j - currentTimeMillis);
                } else {
                    btf.a(btf.this, 2);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f16614a;
        public String b;
        public long c;
        public long d;

        public c(btf btfVar, String str) {
            this.f16614a = str;
        }

        public JSONObject a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("807a0cf8", new Object[]{this});
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("pageName", this.f16614a);
                jSONObject.put("pageUrl", this.b);
                jSONObject.put("pageStartTime", this.c);
                jSONObject.put("pageLeaveTime", this.d);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public String f16615a;
        public String b;

        public d(btf btfVar) {
        }
    }

    public btf(String str) {
        this.f16612a = str;
    }

    public static /* synthetic */ void a(btf btfVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1e613a7", new Object[]{btfVar, new Integer(i)});
        } else {
            btfVar.b(i);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbddf72", new Object[]{this});
        } else {
            this.e++;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d203fd72", new Object[]{this});
        } else {
            this.f++;
        }
    }

    public void e(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26c490a0", new Object[]{this, str, str2, new Long(j)});
            return;
        }
        c cVar = new c(this, str);
        cVar.b = str2;
        cVar.c = j;
        this.d = cVar;
        ((HashMap) this.c).put(str, cVar);
    }

    public void f(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6aad766", new Object[]{this, str, new Long(j)});
        } else if (((HashMap) this.c).containsKey(str)) {
            ((c) ((HashMap) this.c).get(str)).d = j;
            if (this.f16612a.equals("Page_MTopReq")) {
                i();
            }
        }
    }

    public void g(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b71d8a7", new Object[]{this, str, str2, str3});
        } else if (!TextUtils.isEmpty(str) && ((HashMap) this.b).containsKey(str)) {
            d dVar = (d) ((HashMap) this.b).get(str);
            dVar.f16615a = str2;
            dVar.b = str3;
            b(1);
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abc27d64", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            d dVar = new d();
            dVar.b = tfb.UNFINISHED;
            ((HashMap) this.b).put(str, dVar);
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21e63100", new Object[]{this});
            return;
        }
        ((HashMap) this.b).clear();
        ((HashMap) this.c).clear();
        Map<String, c> map = this.c;
        c cVar = this.d;
        ((HashMap) map).put(cVar.f16614a, cVar);
        this.e = 0;
        this.f = 0;
        this.g.c();
        this.g = null;
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("957ceeae", new Object[]{this, new Integer(i)});
            return;
        }
        JSONArray jSONArray = new JSONArray();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (Map.Entry entry : ((HashMap) this.b).entrySet()) {
            d dVar = (d) entry.getValue();
            if (!tfb.UNFINISHED.equals(dVar.b)) {
                i2++;
                if (!"normal".equals(dVar.b)) {
                    i3++;
                    if ("slow".equals(dVar.b)) {
                        i4++;
                    }
                    jSONArray.put(dVar.f16615a);
                }
            }
        }
        if (i == 1 && i2 < 10) {
            b bVar = this.g;
            if (bVar == null) {
                b bVar2 = new b();
                this.g = bVar2;
                bVar2.b();
                return;
            }
            bVar.a();
        } else if (i == 2 && i2 == 0) {
            i();
        } else if (i3 / i2 >= ctf.j().l()) {
            FalcoJankStatistic falcoJankStatistic = new FalcoJankStatistic();
            falcoJankStatistic.afc_id = ctf.j().i();
            falcoJankStatistic.processId = SceneIdentifier.getProcessId();
            falcoJankStatistic.processType = SceneIdentifier.getProcessName();
            falcoJankStatistic.processStart = SceneIdentifier.getProcessStartTime();
            falcoJankStatistic.type = this.f16612a;
            falcoJankStatistic.totalCount = i2;
            falcoJankStatistic.jankCount = i3;
            falcoJankStatistic.slowJankCount = i4;
            falcoJankStatistic.pushCount = this.e;
            falcoJankStatistic.popCount = this.f;
            JSONArray jSONArray2 = new JSONArray();
            for (Map.Entry entry2 : ((HashMap) this.c).entrySet()) {
                jSONArray2.put(((c) entry2.getValue()).a());
            }
            falcoJankStatistic.pageList = jSONArray2.toString();
            falcoJankStatistic.apiList = jSONArray.toString();
            AppMonitor.getInstance().commitStat(falcoJankStatistic);
            ALog.e("falco.JankChecker", "reportJank", null, erj.TAG, falcoJankStatistic, "event", Integer.valueOf(i));
            i();
        } else if (i == 2) {
            i();
        }
    }
}
