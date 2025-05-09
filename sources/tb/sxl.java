package tb;

import android.os.SystemClock;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.startup.UCInitializerInfo;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.hhc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sxl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CREATE_VIEW_TIME = "onCreateViewStart";
    public static final String LAUNCHER_FINISH_TIME = "onLaunchFinish";
    public static final String LAUNCHER_START_TIME = "onLaunchStart";
    public static final String RENDER_START_TIME = "onRenderStart";
    public static final String RENDER_SUCCESS_TIME = "onRenderSuccess";
    public static final String TAB_CLICKED_TIME = "onTabClicked";
    public static final long h = System.currentTimeMillis() - SystemClock.uptimeMillis();
    public final hhc.a b;
    public final hhc c;
    public final String d;
    public final String e;
    public boolean g;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f28341a = new JSONObject();
    public final List<dce> f = new CopyOnWriteArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements hhc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.hhc.a
        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("70020a6e", new Object[]{this});
            }
            return "commitPerformancePoint";
        }

        @Override // tb.hhc.a
        public void b(String str, JSONObject jSONObject, hhc.a.AbstractC0939a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2afe60b", new Object[]{this, str, jSONObject, aVar});
            } else if (jSONObject == null || jSONObject.isEmpty()) {
                ((mvf) aVar).c("bridge params is empty");
            } else {
                boolean booleanValue = jSONObject.getBooleanValue("isCommit");
                sxl.a(sxl.this).putAll(jSONObject);
                mvf mvfVar = (mvf) aVar;
                mvfVar.d("收到性能阶段数据");
                if (booleanValue) {
                    try {
                        sxl.b(sxl.this, jSONObject.getString("bizType"));
                    } catch (Exception e) {
                        fve.e("PerformancePointService", "commit exception:" + e);
                    }
                    mvfVar.d("性能点位上报成功");
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b extends TypeReference<Map<String, String>> {
        public b(sxl sxlVar) {
        }
    }

    static {
        t2o.a(490733595);
    }

    public sxl(hhc hhcVar, String str, String str2) {
        this.c = hhcVar;
        this.d = str;
        this.e = str2;
        hhc.a e = e();
        this.b = e;
        hhcVar.a(e);
    }

    public static /* synthetic */ JSONObject a(sxl sxlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ec5417ca", new Object[]{sxlVar});
        }
        return sxlVar.f28341a;
    }

    public static /* synthetic */ void b(sxl sxlVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd10f993", new Object[]{sxlVar, str});
        } else {
            sxlVar.d(str);
        }
    }

    public void c(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf6f53c9", new Object[]{this, str, new Long(j)});
        } else {
            this.f28341a.put(str, (Object) String.valueOf(j));
        }
    }

    public final hhc.a e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhc.a) ipChange.ipc$dispatch("c6588eb3", new Object[]{this});
        }
        return new a();
    }

    public final long f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("754710ac", new Object[]{this, new Long(j)})).longValue();
        }
        if (j != 0) {
            return j + h;
        }
        return j;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("688088ed", new Object[]{this});
        } else if (!((CopyOnWriteArrayList) this.f).isEmpty()) {
            Iterator it = ((CopyOnWriteArrayList) this.f).iterator();
            while (it.hasNext()) {
                ((dce) it.next()).b(this.f28341a);
            }
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af0e9234", new Object[]{this});
        } else if (!((CopyOnWriteArrayList) this.f).isEmpty()) {
            Iterator it = ((CopyOnWriteArrayList) this.f).iterator();
            while (it.hasNext()) {
                ((dce) it.next()).a(this.f28341a);
            }
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        this.c.b(this.b);
        this.f28341a.clear();
        ((CopyOnWriteArrayList) this.f).clear();
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0ec68a2", new Object[]{this, str});
        } else {
            this.f28341a.put("homeNativeExpBucket", (Object) str);
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a055dbfe", new Object[]{this, str});
            return;
        }
        if (TextUtils.equals(str, LAUNCHER_START_TIME)) {
            this.f28341a.put("isUcSupport", (Object) Boolean.valueOf(WVCore.getInstance().isUCSupport()));
        }
        this.f28341a.put(str, (Object) String.valueOf(System.currentTimeMillis()));
        h();
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89329703", new Object[]{this});
        } else {
            this.g = true;
        }
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df0d9088", new Object[]{this, str});
            return;
        }
        this.f28341a.put("isOutLinkTrigger", (Object) Boolean.valueOf(this.g));
        this.f28341a.put("businessId", (Object) this.e);
        g();
        chb g = c21.g();
        if (g != null) {
            this.f28341a.put("startProcessSystem", (Object) Long.valueOf(g.getLong("startProcessSystemTime", -1L)));
        }
        long b2 = UCInitializerInfo.a().b(7);
        long b3 = UCInitializerInfo.a().b(0);
        long b4 = UCInitializerInfo.a().b(8);
        this.f28341a.put("ucInitSuccessTime", (Object) Long.valueOf(f(b2)));
        this.f28341a.put("ucInitStartTime", (Object) Long.valueOf(f(b3)));
        this.f28341a.put("ucInitFailTime", (Object) Long.valueOf(f(b4)));
        tve.c("containerPerformanceStage", str, "1.0", nm4.MAIN_BIZ_NAME, this.d, (Map) JSON.parseObject(this.f28341a.toJSONString(), new b(this), new Feature[0]));
        this.f28341a.clear();
        this.g = false;
    }
}
