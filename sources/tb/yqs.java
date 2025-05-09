package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.yxd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class yqs implements yxd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f32287a;
    public final ITMSPage b;

    static {
        t2o.a(839909707);
        t2o.a(839909689);
    }

    public yqs(ITMSPage iTMSPage, ITMSPage iTMSPage2) {
        ckf.g(iTMSPage, "page");
        ckf.g(iTMSPage2, "tabPage");
        this.f32287a = iTMSPage;
        this.b = iTMSPage2;
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
        } else {
            ckf.g(iTMSPage, "page");
        }
    }

    @Override // tb.yxd
    public ITMSPage L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("379cf5cc", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.yxd
    public int V0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e994f05a", new Object[]{this})).intValue();
        }
        dyd dydVar = (dyd) this.b.getExtension(dyd.class);
        if (dydVar == null) {
            return -1;
        }
        return dydVar.O0(this.f32287a);
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        }
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        } else {
            yxd.a.a(this);
        }
    }
}
