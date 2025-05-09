package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.nexus.arch.openArch.falco.OpenArchFalcoStage;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class uxk extends f2g<fyk> implements jky {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, OpenArchFalcoStage> f29659a = new LinkedHashMap();
    public e3d b;

    static {
        t2o.a(1004535825);
        t2o.a(1003487260);
    }

    public uxk(fyk fykVar) {
        super(fykVar);
    }

    public static /* synthetic */ Object ipc$super(uxk uxkVar, String str, Object... objArr) {
        if (str.hashCode() == 2024047597) {
            super.f();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/component/OpenArchAnalysisComponent");
    }

    @Override // tb.jky
    public void b(Object obj) {
        e3d e3dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("881fd0ad", new Object[]{this, obj});
            return;
        }
        if (obj instanceof e3d) {
            e3dVar = (e3d) obj;
        } else {
            e3dVar = null;
        }
        k(e3dVar);
    }

    /* renamed from: c */
    public void a(fyk fykVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2db284e", new Object[]{this, fykVar});
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b659678d", new Object[]{this});
        } else if (this.b != null && !this.f29659a.isEmpty()) {
            for (Map.Entry entry : ((LinkedHashMap) this.f29659a).entrySet()) {
                pus pusVar = pus.INSTANCE;
                pusVar.g("OpenArchAnalysisComponent", "", "pendingStageStart:" + ((String) entry.getKey()));
                e3d e3dVar = this.b;
                ckf.d(e3dVar);
                e3dVar.b((OpenArchFalcoStage) entry.getValue());
            }
            ((LinkedHashMap) this.f29659a).clear();
        }
    }

    @Override // tb.f2g, tb.jic
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a483ed", new Object[]{this});
            return;
        }
        super.f();
        this.b = null;
        ((LinkedHashMap) this.f29659a).clear();
    }

    public final e3d g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e3d) ipChange.ipc$dispatch("a7f84c13", new Object[]{this});
        }
        return this.b;
    }

    public final void h(OpenArchFalcoStage openArchFalcoStage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e184132", new Object[]{this, openArchFalcoStage});
            return;
        }
        String rawValue = openArchFalcoStage.getRawValue();
        if (!this.f29659a.containsKey(rawValue)) {
            pus pusVar = pus.INSTANCE;
            pusVar.g("OpenArchAnalysisComponent", "", "pendingStageStart:" + rawValue);
            this.f29659a.put(rawValue, openArchFalcoStage);
        }
    }

    public final void k(e3d e3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4086f474", new Object[]{this, e3dVar});
            return;
        }
        this.b = e3dVar;
        e();
    }

    public final void l(OpenArchFalcoStage openArchFalcoStage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a39ff49", new Object[]{this, openArchFalcoStage});
            return;
        }
        ckf.g(openArchFalcoStage, v4s.PARAM_UPLOAD_STAGE);
        e3d e3dVar = this.b;
        if (e3dVar == null) {
            h(openArchFalcoStage);
        } else {
            e3dVar.b(openArchFalcoStage);
        }
    }
}
