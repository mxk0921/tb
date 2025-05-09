package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.IPage;
import tb.afx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gfx implements afx.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public vex f19958a;
    public IPage b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (gfx.a(gfx.this) != null) {
                gfx.a(gfx.this).g(gfx.this);
            }
        }
    }

    public static /* synthetic */ vex a(gfx gfxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vex) ipChange.ipc$dispatch("988cd8b3", new Object[]{gfxVar});
        }
        return gfxVar.f19958a;
    }

    public void b(vex vexVar, IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e02b419e", new Object[]{this, vexVar, iPage});
            return;
        }
        this.f19958a = vexVar;
        this.b = iPage;
        if (vexVar != null) {
            vexVar.c(this);
        }
    }

    @Override // tb.afx.b
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        IPage iPage = this.b;
        if (iPage != null) {
            vxm.b.b(iPage.b()).m("windowFirstFocus", out.a());
            zq6.b("WindowFirstFocus", this.b.b(), this.b.getPageName());
        }
        w9a.g().i().post(new a());
    }
}
