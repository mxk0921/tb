package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.dee;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class cex implements dee {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f17021a;
    public boolean b;

    static {
        t2o.a(839909679);
        t2o.a(839909658);
    }

    public cex(ITMSPage iTMSPage) {
        ckf.g(iTMSPage, "page");
        this.f17021a = iTMSPage;
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

    @Override // tb.dee
    public boolean S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4278e03e", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    @Override // tb.dee
    public void a1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e4ddcbc", new Object[]{this});
        } else {
            this.b = true;
        }
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
            dee.a.a(this);
        }
    }
}
