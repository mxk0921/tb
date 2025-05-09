package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.jwd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class fas implements jwd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f19149a;

    static {
        t2o.a(839909675);
        t2o.a(839909651);
    }

    public fas(ITMSPage iTMSPage) {
        ckf.g(iTMSPage, "mPage");
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
        } else {
            jwd.a.b(this, iTMSPage);
        }
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            jwd.a.c(this);
        }
    }

    @Override // tb.jwd
    public boolean isHitSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39726cf8", new Object[]{this})).booleanValue();
        }
        return this.f19149a;
    }

    @Override // tb.jwd
    public void setHitSnapshot(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96c82398", new Object[]{this, new Boolean(z)});
        } else {
            this.f19149a = z;
        }
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        } else {
            jwd.a.a(this);
        }
    }
}
