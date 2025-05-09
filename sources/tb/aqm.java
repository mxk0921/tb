package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.index.d;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.j;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class aqm implements agd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final agd f15940a;
    public final kgd b;
    public final d c;
    public String d;

    public aqm(agd agdVar, kgd kgdVar, d dVar) {
        this.f15940a = agdVar;
        this.b = kgdVar;
        this.c = dVar;
        f();
    }

    @Override // tb.agd
    public void a(String str, nan nanVar) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("202931b2", new Object[]{this, str, nanVar});
            return;
        }
        pan e = e(str);
        if (e != null) {
            nanVar.a(e);
        } else {
            this.f15940a.a(str, nanVar);
        }
    }

    @Override // tb.agd
    public pan b(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pan) ipChange.ipc$dispatch("74404968", new Object[]{this, str});
        }
        pan e = e(str);
        if (e != null) {
            return e;
        }
        return this.f15940a.b(str);
    }

    @Override // tb.agd
    public pan c(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pan) ipChange.ipc$dispatch("f3fef1e3", new Object[]{this, str});
        }
        pan e = e(str);
        if (e != null) {
            return e;
        }
        return this.f15940a.c(str);
    }

    public final pan d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pan) ipChange.ipc$dispatch("2a8dd467", new Object[]{this, str});
        }
        RSoLog.d("preferApk, enabled try apk lib = " + str);
        File file = new File(this.d, uos.c(str));
        if (file.isFile()) {
            RSoLog.d("preferApk, found lib in apk, file=" + file);
            z6o e = j.e(str);
            return new pan(e, j.h(e, file.getPath(), "prefer-apk"));
        }
        String l = j.l(str);
        if (l == null) {
            return null;
        }
        z6o e2 = j.e(str);
        return new pan(e2, j.h(e2, l, "prefer-apk"));
    }

    public final pan e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pan) ipChange.ipc$dispatch("7090a92f", new Object[]{this, str});
        }
        SoIndexData.SoFileInfo l = this.c.l(str, this.c.i());
        if (l == null) {
            RSoLog.d("preferApk, fileInfo == null, fallback to preferApk, " + str);
            return d(str);
        } else if (trq.d("InApk", l.getFrom())) {
            RSoLog.d("preferApk, fileInfo from inapk, go to preferApk, " + str);
            return d(str);
        } else if (!d1r.a(".enablePreferApk")) {
            return null;
        } else {
            RSoLog.d("preferApk, localDevPrefer enabled, fallback to preferApk, " + str);
            return d(str);
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            this.d = this.b.getApp().getApplicationInfo().nativeLibraryDir;
        }
    }
}
