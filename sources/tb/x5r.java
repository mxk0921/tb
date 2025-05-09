package tb;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.monitor.procedure.ProcedureImpl;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.module.TrackerModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class x5r extends vy1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final List<String> Q;
    public boolean L = true;
    public boolean M = false;
    public boolean N = true;
    public boolean O = true;
    public boolean P = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ProcedureImpl.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o f31167a;

        public a(o oVar) {
            this.f31167a = oVar;
        }

        @Override // com.taobao.monitor.procedure.ProcedureImpl.b
        public void a(r1w r1wVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50322ff2", new Object[]{this, r1wVar});
            }
        }

        @Override // com.taobao.monitor.procedure.ProcedureImpl.b
        public void b(r1w r1wVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1397a624", new Object[]{this, r1wVar});
            } else {
                x5r.o0(x5r.this, r1wVar, this.f31167a);
            }
        }

        @Override // com.taobao.monitor.procedure.ProcedureImpl.b
        public void c(r1w r1wVar, cj8 cj8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ece8aa82", new Object[]{this, r1wVar, cj8Var});
            }
        }

        @Override // com.taobao.monitor.procedure.ProcedureImpl.b
        public void d(r1w r1wVar, ugq ugqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2612f02", new Object[]{this, r1wVar, ugqVar});
            }
        }
    }

    static {
        t2o.a(503316928);
        ArrayList arrayList = new ArrayList();
        Q = arrayList;
        arrayList.add(hx9.KEY_FRAGMENT_IS_FRAGMENT_MODEL);
        arrayList.add("lastJumpPageSchemaUrl");
        arrayList.add("fullPageName");
        arrayList.add("activityName");
    }

    public x5r(o oVar, cll cllVar) {
        super(cllVar);
        mdd mddVar = this.d;
        mddVar = mddVar instanceof wxm ? ((wxm) mddVar).y() : mddVar;
        if (mddVar instanceof ProcedureImpl) {
            ((ProcedureImpl) mddVar).x(new a(oVar));
        }
        W();
        Q(cllVar.v());
        b0(cllVar.getPageName(), cllVar.x(), new HashMap(), cllVar.v());
    }

    public static /* synthetic */ Object ipc$super(x5r x5rVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -410389705) {
            super.R();
            return null;
        } else if (hashCode == 1003547306) {
            super.X();
            return null;
        } else if (hashCode == 1096318669) {
            super.Q(((Number) objArr[0]).longValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/component/perf/TBAPMPageProcessor");
        }
    }

    public static /* synthetic */ void o0(x5r x5rVar, r1w r1wVar, o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19ad1c6", new Object[]{x5rVar, r1wVar, oVar});
        } else {
            x5rVar.r0(r1wVar, oVar);
        }
    }

    @Override // com.taobao.monitor.impl.trace.l.c
    public void A(Activity activity, KeyEvent keyEvent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b5c8321", new Object[]{this, activity, keyEvent, new Long(j)});
        }
    }

    @Override // com.taobao.monitor.impl.trace.c.AbstractC0626c
    public void F(float f, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d77c72", new Object[]{this, new Float(f), new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.monitor.impl.trace.c.AbstractC0626c
    public void J(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbfef539", new Object[]{this, str});
        }
    }

    @Override // com.taobao.monitor.procedure.IPage.b
    public void K(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb5b476", new Object[]{this, new Long(j)});
        }
    }

    @Override // tb.vy1
    public void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bd0eaaa", new Object[]{this});
        } else {
            super.X();
        }
    }

    @Override // tb.vy1
    public void Z(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39024f3b", new Object[]{this, str, new Long(j)});
        } else if (this.L) {
            this.L = false;
            this.d.a("leaveType", str);
            this.d.j("leaveTime", j);
        }
    }

    @Override // tb.vy1
    public void a0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ed55e2a", new Object[]{this, new Long(j)});
            return;
        }
        zq6.a("PageProcessor", "onPageAppear", this.c.getPageName());
        long a2 = out.a();
        this.d.d("onPageAppear", new HashMap(1));
        nca.r = this.c.getPageName();
        nca.p = a2;
    }

    @Override // tb.vy1
    public void b0(String str, String str2, Map<String, Object> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a494634", new Object[]{this, str, str2, map, new Long(j)});
            return;
        }
        zq6.a("PageProcessor", "onPageCreate", str, str2, map);
        q0(map);
        p0(str, str2, j);
    }

    @Override // tb.vy1
    public void c0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88e43e3a", new Object[]{this, new Long(j)});
        } else {
            this.d.j("customFirstScreenPaint", j);
        }
    }

    @Override // tb.vy1
    public void f0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceaa1f39", new Object[]{this, new Long(j)});
            return;
        }
        zq6.a("PageProcessor", "onPageInteractive", Long.valueOf(j));
        if (this.O) {
            this.O = false;
            this.d.a("errorCode", 0);
        }
    }

    @Override // tb.vy1
    public void g0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3da6b118", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.vy1
    public void h0(float f, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("336a65dc", new Object[]{this, new Float(f), new Long(j)});
        }
    }

    @Override // com.taobao.monitor.impl.trace.c.AbstractC0626c
    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50fe35c7", new Object[]{this, str});
        }
    }

    @Override // tb.vy1
    public void i0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9be833ef", new Object[]{this, new Long(j)});
        }
    }

    @Override // tb.vy1
    public void j0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91b206a9", new Object[]{this, new Long(j)});
            return;
        }
        zq6.a("PageProcessor", "onPageVisible", Long.valueOf(j));
        if (this.N) {
            this.N = false;
        }
    }

    @Override // tb.vy1
    public void k0(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("362a79ae", new Object[]{this, cllVar, new Long(j)});
        }
    }

    @Override // com.taobao.monitor.impl.trace.l.c
    public void o(Activity activity, int i, float f, float f2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("747a3d9a", new Object[]{this, activity, new Integer(i), new Float(f), new Float(f2), new Long(j)});
        } else if (qgw.c(activity, this.c.w())) {
            if (this.P) {
                this.P = false;
            }
            nca.r = xol.c(activity);
            nca.p = j;
        }
    }

    public final void q0(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14506db7", new Object[]{this, map});
        } else if (map != null) {
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (!TextUtils.isEmpty(entry.getKey()) && ((ArrayList) Q).contains(entry.getKey()) && entry.getValue() != null) {
                        this.d.a(entry.getKey(), entry.getValue());
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher.b
    public void r(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("903f52fd", new Object[]{this, new Integer(i), new Long(j)});
        }
    }

    @Override // com.taobao.monitor.impl.trace.c.AbstractC0626c
    public void s(String str, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2363ef", new Object[]{this, str, new Integer(i), new Long(j)});
        }
    }

    @Override // com.taobao.monitor.impl.trace.MemoryDispatcher.b
    public void y(long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b34dc7", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Long(j4)});
        }
    }

    @Override // tb.vy1, tb.px
    public void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e789f337", new Object[]{this});
            return;
        }
        super.R();
        if (!this.M && this.d.isAlive()) {
            this.M = true;
            c21.g();
            this.d.u("fps", this.z.toString());
            this.d.u("scrollHitchRate", this.I.toString());
            this.d.u("scrollFps", this.A.toString());
            this.d.u("slowFrameCount", Integer.valueOf(this.D));
            this.d.u("jankCount", Integer.valueOf(this.E));
            this.d.u("movieJankCount", Integer.valueOf(this.F));
            this.d.u("movieBigJankCount", Integer.valueOf(this.G));
            this.d.j("procedureEndTime", out.a());
            this.d.end();
        }
    }

    @Override // com.taobao.monitor.impl.trace.b.AbstractC0625b
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("timestamp", Long.valueOf(out.a()));
        this.d.d("onLowMemory", hashMap);
    }

    public final void p0(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbec0713", new Object[]{this, str, str2, new Long(j)});
            return;
        }
        this.d.a("pageName", str);
        this.d.a(pl4.KEY_LOAD_TYPE, "push");
        yxm.b(this.d, "schemaUrl", str2);
        this.d.d("onPageCreate", new HashMap(1));
    }

    public final void r0(r1w r1wVar, o oVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f254d7ae", new Object[]{this, r1wVar, oVar});
        } else if (r1wVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                Map<String, Object> s = r1wVar.s();
                Map<String, Object> n = r1wVar.n();
                Object obj = n.get("pageName");
                Object obj2 = n.get(pl4.KEY_LOAD_TYPE);
                Object obj3 = n.get("leaveType");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject.put("pageName", (Object) "ShortVideoMonitor");
                jSONObject.put(PopConst.POP_EVENT_ID_KEY, (Object) 19997);
                jSONObject.put("arg1", (Object) "APM_DATA");
                jSONObject.put("arg2", (Object) String.valueOf(obj));
                jSONObject.put("arg3", (Object) String.valueOf(obj3));
                jSONObject.put("args", (Object) jSONObject2);
                jSONObject2.put("pageName", (Object) String.valueOf(obj));
                jSONObject2.put(pl4.KEY_LOAD_TYPE, (Object) String.valueOf(obj2));
                jSONObject2.put("leaveType", (Object) String.valueOf(obj3));
                if (s != null && s.size() > 0) {
                    for (Map.Entry<String, Object> entry : s.entrySet()) {
                        Object value = entry.getValue();
                        if (entry.getValue() instanceof String) {
                            str = (String) value;
                        } else {
                            str = String.valueOf(value);
                        }
                        jSONObject2.put(entry.getKey(), (Object) str);
                    }
                }
                TrackerModule.commit(new d.j(oVar, jSONObject, null), false);
            } catch (Exception e) {
                tfs.e("PageProcessor", "APM_END error, " + e.getMessage());
            }
        }
    }

    @Override // tb.px
    public void Q(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41587ecd", new Object[]{this, new Long(j)});
            return;
        }
        super.Q(j);
        this.d.j("procedureStartTime", j);
        this.d.a("errorCode", 1);
        this.d.a("installType", nca.g);
        this.d.a("timestampInterval", Long.valueOf(System.currentTimeMillis() - SystemClock.uptimeMillis()));
        this.d.a("leaveType", "other");
        this.d.a("saveMode", Boolean.valueOf(e81.b().getBoolean("saveMode", false)));
    }

    @Override // tb.vy1
    public void d0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5178cc21", new Object[]{this, new Long(j)});
            return;
        }
        zq6.a("PageProcessor", "onPageDestroy");
        HashMap hashMap = new HashMap(1);
        hashMap.put("timestamp", Long.valueOf(j));
        this.d.d("onPageDestroy", hashMap);
    }

    @Override // tb.vy1
    public void e0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183c6698", new Object[]{this, new Long(j)});
            return;
        }
        zq6.a("PageProcessor", "onPageDisappear");
        HashMap hashMap = new HashMap(1);
        hashMap.put("timestamp", Long.valueOf(j));
        this.d.d("onPageDisappear", hashMap);
    }
}
