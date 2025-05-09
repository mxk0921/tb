package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.a;
import com.taobao.mytaobao.basement.MTBBasementContainerView;
import com.taobao.mytaobao.basement.weex.BasementWeexView;
import com.taobao.mytaobao.view.MTPtrRecyclerView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class okv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f25453a;
    public boolean b;
    public final MTBBasementContainerView c;

    static {
        t2o.a(745537627);
    }

    public okv(MTPtrRecyclerView mTPtrRecyclerView, MTBBasementContainerView mTBBasementContainerView) {
        ckf.h(mTPtrRecyclerView, "rv");
        ckf.h(mTBBasementContainerView, "mtbBasementContainerView");
        this.c = mTBBasementContainerView;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66d7ccc3", new Object[]{this, new Boolean(z)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            b(currentTimeMillis);
        } else if (currentTimeMillis - this.f25453a >= 300 && !this.b) {
            b(currentTimeMillis);
        }
    }

    public final void b(long j) {
        a mInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788eee5a", new Object[]{this, new Long(j)});
            return;
        }
        BasementWeexView weexView = this.c.getWeexView();
        if (weexView != null && (mInstance = weexView.getMInstance()) != null) {
            mInstance.updateViewport();
            this.f25453a = j;
        }
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cd98b9c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc013898", new Object[]{this, new Boolean(z)});
        }
    }
}
