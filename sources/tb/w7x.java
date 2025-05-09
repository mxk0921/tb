package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher;
import com.taobao.monitor.impl.trace.b;
import com.taobao.monitor.impl.trace.g;
import com.taobao.monitor.impl.trace.i;
import com.taobao.monitor.impl.trace.j;
import com.taobao.monitor.procedure.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cw8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class w7x extends px implements abe, cw8.a, b.AbstractC0625b, ApplicationBackgroundChangedDispatcher.b, g.b, i.b, j.h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final mdd c;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    @Deprecated
    public long x;
    public final List<Integer> h = new ArrayList();
    public int i = 0;
    public int j = 0;
    public boolean k = true;
    public boolean l = true;
    public boolean m = true;
    public boolean n = true;
    public boolean w = false;
    public final zzb d = M(ic.APPLICATION_LOW_MEMORY_DISPATCHER);
    public final zzb e = M(ic.ACTIVITY_FPS_DISPATCHER);
    public final zzb f = M(ic.APPLICATION_BACKGROUND_CHANGED_DISPATCHER);
    public final zzb g = M(ic.PAGE_RENDER_DISPATCHER);

    public w7x(String str) {
        c h = new c.b().j(true).o(true).m(true).l(null).h();
        sxm sxmVar = sxm.b;
        this.c = sxmVar.a(z4u.a("/" + str), h);
    }

    public static /* synthetic */ Object ipc$super(w7x w7xVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -410389705) {
            super.R();
            return null;
        } else if (hashCode == 1096318669) {
            super.Q(((Number) objArr[0]).longValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/monitor/impl/processor/weex/WeexProcessor");
        }
    }

    @Override // com.taobao.monitor.impl.trace.j.h
    public void C(cll cllVar, float f, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("454264d4", new Object[]{this, cllVar, new Float(f), new Long(j)});
        } else if (this.k && cllVar.J()) {
            this.c.a("onRenderPercent", Float.valueOf(f));
            this.c.a("drawPercentTime", Long.valueOf(j));
        }
    }

    @Override // com.taobao.monitor.impl.trace.j.h
    public void G(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11148397", new Object[]{this, cllVar, new Long(j)});
        } else if (this.n && this.k && cllVar.J()) {
            this.c.a("displayDuration", Long.valueOf(j - this.x));
            this.c.j("displayedTime", j);
            this.n = false;
        }
    }

    @Override // tb.abe
    public void I(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8253d3e", new Object[]{this, str, new Double(d)});
        } else {
            this.c.u(str, Double.valueOf(d));
        }
    }

    @Override // com.taobao.monitor.impl.trace.j.h
    public void L(cll cllVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3af607a6", new Object[]{this, cllVar, new Integer(i)});
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
        this.x = out.a();
        this.c.c();
        this.c.a("timestampInterval", Long.valueOf(System.currentTimeMillis() - SystemClock.uptimeMillis()));
        this.c.j("procedureStartTime", out.a());
        this.d.addListener(this);
        this.e.addListener(this);
        this.f.addListener(this);
        this.g.addListener(this);
    }

    @Override // tb.abe
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539dc3c3", new Object[]{this, str, obj});
        } else {
            this.c.a(str, obj);
        }
    }

    @Override // tb.abe
    public void b(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("385ab762", new Object[]{this, str, map});
        } else {
            this.c.b(str, map);
        }
    }

    @Override // tb.abe
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5ed0dd0", new Object[]{this});
        }
        return uxm.e(ProcedureGlobal.PROCEDURE_MANAGER.v(this.c));
    }

    @Override // com.taobao.monitor.impl.trace.i.b
    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b59f8bcd", new Object[]{this, new Integer(i)});
        } else if (!this.k) {
        } else {
            if (i == 0) {
                this.s++;
            } else if (i == 1) {
                this.t++;
            } else if (i == 2) {
                this.u++;
            } else if (i == 3) {
                this.v++;
            }
        }
    }

    @Override // com.taobao.monitor.impl.trace.j.h
    public void f(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587b791e", new Object[]{this, cllVar, new Long(j)});
        }
    }

    @Override // tb.cw8.a
    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b93e51", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.cw8.a
    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e069e7c0", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.cw8.a
    public void m(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d825ceeb", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        } else if (((ArrayList) this.h).size() < 200 && this.k) {
            this.i += i2;
            this.j = this.j + i3 + i4;
            ((ArrayList) this.h).add(Integer.valueOf(i));
        }
    }

    @Override // com.taobao.monitor.impl.trace.j.h
    public void n(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68feefe6", new Object[]{this, cllVar, new Long(j)});
        }
    }

    @Override // tb.abe
    public void onEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc72903", new Object[]{this});
        } else {
            R();
        }
    }

    @Override // tb.abe
    public void onStage(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba4fb14", new Object[]{this, str, new Long(j)});
        } else {
            this.c.j(str, j);
        }
    }

    @Override // tb.abe
    public void onStart(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
            return;
        }
        Q(out.a());
        this.c.a("instanceId", str);
    }

    @Override // tb.abe
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            this.k = false;
        }
    }

    @Override // com.taobao.monitor.impl.trace.g.b
    public void q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e690afa", new Object[]{this, new Integer(i)});
        } else if (!this.k) {
        } else {
            if (i == 0) {
                this.o++;
            } else if (i == 1) {
                this.p++;
            } else if (i == 2) {
                this.q++;
            } else if (i == 3) {
                this.r++;
            }
        }
    }

    @Override // com.taobao.monitor.impl.trace.j.h
    public void E(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42a73191", new Object[]{this, cllVar, new Long(j)});
        } else if (this.m && this.k && cllVar.J()) {
            this.c.a("pageInitDuration", Long.valueOf(j - this.x));
            this.c.j("renderStartTime", j);
            this.m = false;
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
        this.c.d("onLowMemory", hashMap);
    }

    @Override // com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher.b
    public void r(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("903f52fd", new Object[]{this, new Integer(i), new Long(j)});
        } else if (i == 1) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("timestamp", Long.valueOf(j));
            this.c.d("foreground2Background", hashMap);
        } else {
            HashMap hashMap2 = new HashMap(1);
            hashMap2.put("timestamp", Long.valueOf(j));
            this.c.d("background2Foreground", hashMap2);
        }
    }

    @Override // com.taobao.monitor.impl.trace.j.h
    public void t(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f0b107", new Object[]{this, cllVar, new Long(j)});
        } else if (this.l && this.k && cllVar.J()) {
            this.c.a("interactiveDuration", Long.valueOf(j - this.x));
            this.c.a("loadDuration", Long.valueOf(j - this.x));
            this.c.j("interactiveTime", j);
            this.l = false;
        }
    }

    @Override // tb.px
    public void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e789f337", new Object[]{this});
            return;
        }
        if (!this.w) {
            this.c.j("procedureEndTime", out.a());
            this.c.u("fps", this.h.toString());
            this.c.u("jankCount", Integer.valueOf(this.i));
            this.c.u("movieJankCount", Integer.valueOf(this.j));
            this.c.u("movieBigJankCount", 0);
            this.c.a("deviceLevel", Integer.valueOf(c21.g().getInt("deviceLevel", -1)));
            if (o48.m) {
                lp0 d = lp0.d();
                this.c.a("runtimeLevel", Integer.valueOf(d.f().c));
                this.c.a("cpuUsageOfDevcie", Float.valueOf(d.b().d));
                this.c.a("memoryRuntimeLevel", Integer.valueOf(d.e().k));
            }
            this.c.u("imgLoadCount", Integer.valueOf(this.o));
            this.c.u("imgLoadSuccessCount", Integer.valueOf(this.p));
            this.c.u("imgLoadFailCount", Integer.valueOf(this.q));
            this.c.u("imgLoadCancelCount", Integer.valueOf(this.r));
            this.c.u("networkRequestCount", Integer.valueOf(this.s));
            this.c.u("networkRequestSuccessCount", Integer.valueOf(this.t));
            this.c.u("networkRequestFailCount", Integer.valueOf(this.u));
            this.c.u("networkRequestCancelCount", Integer.valueOf(this.v));
            this.d.removeListener(this);
            this.e.removeListener(this);
            this.f.removeListener(this);
            this.g.removeListener(this);
            this.c.end();
            super.R();
        }
        this.w = true;
    }

    @Override // tb.abe
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            this.k = true;
        }
    }
}
