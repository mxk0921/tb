package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.s7d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class yql implements s7d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f32283a;
    public final ITMSPage b;

    static {
        t2o.a(839909667);
        t2o.a(839909639);
    }

    public yql(ITMSPage iTMSPage, ITMSPage iTMSPage2) {
        ckf.g(iTMSPage, "page");
        ckf.g(iTMSPage2, "parentPage");
        this.f32283a = iTMSPage;
        this.b = iTMSPage2;
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
        } else {
            s7d.a.b(this, iTMSPage);
        }
    }

    @Override // tb.s7d
    public ITMSPage L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("fef4f46b", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            s7d.a.c(this);
        }
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        } else {
            s7d.a.a(this);
        }
    }
}
