package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.falco.m;
import com.taobao.kmp.nexus.arch.openArch.falco.OpenArchFalcoStage;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class xt implements e3d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public tz8 f31589a;
    public final boolean b;
    public m c;
    public uy8 d;
    public final Map<String, uy8> e = new HashMap();
    public final Map<String, OpenArchFalcoStage> f = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements m.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.falco.m.a
        public void a(m mVar) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd090d9d", new Object[]{this, mVar});
            } else if (xt.f(xt.this) != null) {
                xt xtVar = xt.this;
                xtVar.c = xt.f(xtVar).d(m.MODULE, "tap").f(mVar).e();
                xt.this.c.r0(mVar);
                xt.this.c.h0("live");
                m mVar2 = xt.this.c;
                if (pvs.k0()) {
                    str = "kmp";
                } else {
                    str = "native";
                }
                mVar2.Z(str);
                xt.this.h(System.currentTimeMillis());
                o3s.b("BaseAnalysis", "创建BusinessSpan");
                xt xtVar2 = xt.this;
                xtVar2.d = xt.f(xtVar2).d("LiveRoom", "tap").f(xt.this.c).d();
                if (!tz3.b(xt.g(xt.this))) {
                    for (String str2 : xt.g(xt.this).keySet()) {
                        if (xt.g(xt.this).get(str2) != null) {
                            o3s.b("BaseAnalysis", "从PendingMap中创建StageBusinessSpan，stageName:" + str2);
                            xt xtVar3 = xt.this;
                            xtVar3.b((OpenArchFalcoStage) xt.g(xtVar3).get(str2));
                        }
                    }
                    xt.g(xt.this).clear();
                }
            }
        }
    }

    static {
        t2o.a(779093413);
        t2o.a(779093418);
    }

    public xt() {
        if (((v73) this).t()) {
            tz8 tz8Var = FalcoGlobalTracer.get();
            this.f31589a = tz8Var;
            if (tz8Var != null) {
                this.b = true;
            }
        }
    }

    public static /* synthetic */ tz8 f(xt xtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tz8) ipChange.ipc$dispatch("eef5b87", new Object[]{xtVar});
        }
        return xtVar.f31589a;
    }

    public static /* synthetic */ Map g(xt xtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("287d41da", new Object[]{xtVar});
        }
        return xtVar.f;
    }

    @Override // tb.e3d
    public void a(OpenArchFalcoStage openArchFalcoStage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b588bbf", new Object[]{this, openArchFalcoStage});
        } else {
            r(openArchFalcoStage, "failed");
        }
    }

    @Override // tb.e3d
    public void b(OpenArchFalcoStage openArchFalcoStage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a39ff49", new Object[]{this, openArchFalcoStage});
        } else if (this.f31589a != null) {
            if (this.d == null) {
                o(openArchFalcoStage);
                return;
            }
            String rawValue = openArchFalcoStage.getRawValue();
            o3s.b("BaseAnalysis", "创建BusinessSpanStage,start:" + rawValue);
            ((HashMap) this.e).put(rawValue, this.f31589a.d(rawValue, "tap").f(this.d).d());
        }
    }

    @Override // tb.e3d
    public void c(OpenArchFalcoStage openArchFalcoStage, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4019ea7a", new Object[]{this, openArchFalcoStage, str});
        } else if (i()) {
            if (openArchFalcoStage != null) {
                uy8 m = m(openArchFalcoStage.getRawValue());
                if (m != null) {
                    m.A(str);
                    return;
                }
                return;
            }
            this.d.A(str);
        }
    }

    @Override // tb.e3d
    public void d(OpenArchFalcoStage openArchFalcoStage, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15406089", new Object[]{this, openArchFalcoStage, str, str2});
        } else if (i()) {
            if (openArchFalcoStage != null) {
                uy8 m = m(openArchFalcoStage.getRawValue());
                if (m != null) {
                    m.X(str, str2);
                }
            } else {
                this.d.X(str, str2);
            }
            o3s.b("BaseAnalysis", "BusinessSpanStage,setTag，" + str + ",value" + str2);
        }
    }

    @Override // tb.e3d
    public void e(OpenArchFalcoStage openArchFalcoStage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("202c977b", new Object[]{this, openArchFalcoStage});
        } else {
            r(openArchFalcoStage, "succeed");
        }
    }

    public void h(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf482ade", new Object[]{this, new Long(j)});
        } else if (i()) {
            o3s.b("BaseAnalysis", "spanStart,pageFirstFrameRenderStart: " + j);
            this.c.L(Long.valueOf(j));
        }
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abc043a9", new Object[]{this})).booleanValue();
        }
        if (!j() || this.c == null || this.d == null) {
            return false;
        }
        return true;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1727589b", new Object[]{this})).booleanValue();
        }
        if (((v73) this).t() && this.b && this.f31589a != null) {
            return true;
        }
        return false;
    }

    public void k(OpenArchFalcoStage openArchFalcoStage, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a90bf7c6", new Object[]{this, openArchFalcoStage, str});
        } else if (i()) {
            if (openArchFalcoStage != null) {
                uy8 m = m(openArchFalcoStage.getRawValue());
                if (m != null) {
                    m.I(str);
                    return;
                }
                return;
            }
            this.d.I(str);
        }
    }

    public void l(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99c3676c", new Object[]{this, new Long(j)});
        } else if (i()) {
            o3s.b("BaseAnalysis", "spanFinish,pageBizDisplayTime: " + j);
            this.c.h(Long.valueOf(j));
        }
    }

    public uy8 m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uy8) ipChange.ipc$dispatch("7c6047c8", new Object[]{this, str});
        }
        if (j() && !tz3.b(this.e)) {
            return (uy8) ((HashMap) this.e).get(str);
        }
        return null;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        o3s.b("BaseAnalysis", "span onDestroy");
        if (this.f31589a != null) {
            this.f31589a = null;
        }
        m mVar = this.c;
        if (mVar != null) {
            mVar.finish();
            this.c = null;
        }
        uy8 uy8Var = this.d;
        if (uy8Var != null) {
            uy8Var.finish();
            this.d = null;
        }
        s(null);
    }

    public final void o(OpenArchFalcoStage openArchFalcoStage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e184132", new Object[]{this, openArchFalcoStage});
            return;
        }
        String rawValue = openArchFalcoStage.getRawValue();
        if (!TextUtils.isEmpty(rawValue) && !((HashMap) this.f).containsKey(rawValue)) {
            o3s.b("BaseAnalysis", "mPendingStageMap增加OpenArchFalcoStage，stageName:" + rawValue);
            ((HashMap) this.f).put(rawValue, openArchFalcoStage);
        }
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3935f4e", new Object[]{this, str});
        } else if (i()) {
            s(str);
            this.d.t(str);
            this.c.t(str);
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd4003bf", new Object[]{this});
        } else if (j()) {
            this.f31589a.j(new a());
        }
    }

    public final void r(OpenArchFalcoStage openArchFalcoStage, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("378e989", new Object[]{this, openArchFalcoStage, str});
            return;
        }
        String rawValue = openArchFalcoStage.getRawValue();
        uy8 m = m(rawValue);
        if (m != null) {
            m.t(str);
            o3s.b("BaseAnalysis", "stageFinish,stage" + rawValue + ",status" + str);
        }
    }

    public final void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("949aae6c", new Object[]{this, str});
        } else if (!tz3.b(this.e)) {
            for (uy8 uy8Var : ((HashMap) this.e).values()) {
                if (uy8Var != null) {
                    if (!TextUtils.isEmpty(str)) {
                        uy8Var.t(str);
                    } else {
                        uy8Var.finish();
                    }
                }
            }
            ((HashMap) this.e).clear();
        }
    }
}
