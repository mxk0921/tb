package tb;

import android.content.Intent;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class d9s implements qcs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f17670a;
    public final ocs b;
    public volatile boolean c;
    public final bbs d;

    static {
        t2o.a(839909929);
        t2o.a(839909932);
    }

    public d9s(ITMSPage iTMSPage, ocs ocsVar) {
        ckf.g(iTMSPage, "mPage");
        ckf.g(ocsVar, "mRenderListener");
        this.f17670a = iTMSPage;
        this.b = ocsVar;
        this.d = iTMSPage.getInstance();
    }

    @Override // tb.qcs
    public void D0(String str, String str2, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b91c0a1", new Object[]{this, str, str2, json});
            return;
        }
        ckf.g(str, "target");
        ckf.g(str2, "event");
    }

    @Override // tb.qcs
    public void X0(String str, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1761c13a", new Object[]{this, str, json});
        } else {
            ckf.g(str, "event");
        }
    }

    @Override // tb.qcs
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.c = true;
        }
    }

    @Override // tb.qcs
    public void i0(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a50b91", new Object[]{this, str, obj});
        }
    }

    @Override // tb.qcs
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        }
    }

    @Override // tb.qcs
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    @Override // tb.qcs
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    @Override // tb.qcs
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.qcs
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    @Override // tb.qcs
    public void onViewAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ffcf3e0", new Object[]{this});
        }
    }

    @Override // tb.qcs
    public void onViewDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83841fe6", new Object[]{this});
        }
    }

    @Override // tb.qcs
    public void reload(pcs pcsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("961bd7e0", new Object[]{this, pcsVar});
        }
    }

    @Override // tb.qcs
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a0b1d", new Object[]{this});
        }
    }
}
