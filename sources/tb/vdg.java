package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vdg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ajc f29942a;
    public final ghc b;
    public final fhc c;

    static {
        t2o.a(507510803);
    }

    public vdg(ajc ajcVar, String str, String str2, ghc ghcVar, fhc fhcVar) {
        this.f29942a = ajcVar;
        this.b = ghcVar;
        this.c = fhcVar;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72e35699", new Object[]{this, str});
            return;
        }
        fhc fhcVar = this.c;
        if (fhcVar != null) {
            fhcVar.fail(str);
        }
    }

    public void b(afg afgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbee06a4", new Object[]{this, afgVar});
        } else if (afgVar != null) {
            a(afgVar.d());
        }
    }

    public ajc c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ajc) ipChange.ipc$dispatch("33d1b2d5", new Object[]{this});
        }
        return this.f29942a;
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b54654", new Object[]{this, str});
            return;
        }
        ghc ghcVar = this.b;
        if (ghcVar != null) {
            ghcVar.succeed(str);
        }
    }

    public void e(afg afgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64fdfd1f", new Object[]{this, afgVar});
        } else if (afgVar != null) {
            afgVar.c();
            d(afgVar.d());
        }
    }
}
