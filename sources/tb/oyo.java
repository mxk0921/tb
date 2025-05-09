package tb;

import android.view.ViewTreeObserver;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.MUSView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class oyo implements ViewTreeObserver.OnScrollChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MUSView f25752a;
    public boolean b = false;
    public boolean c = true;

    static {
        t2o.a(986710062);
    }

    public oyo(MUSView mUSView) {
        this.f25752a = mUSView;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f7278b", new Object[]{this});
        } else if (this.c && !this.b) {
            this.b = true;
            this.f25752a.getViewTreeObserver().addOnScrollChangedListener(this);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
        } else if (this.c && this.b) {
            this.f25752a.getViewTreeObserver().removeOnScrollChangedListener(this);
            this.b = false;
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c = z;
        boolean z2 = this.b;
        if (z2 && !z) {
            this.f25752a.getViewTreeObserver().removeOnScrollChangedListener(this);
            this.b = false;
        } else if (z && !z2) {
            this.b = true;
            this.f25752a.getViewTreeObserver().addOnScrollChangedListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d815a80f", new Object[]{this});
            return;
        }
        MUSView mUSView = this.f25752a;
        if (mUSView.isAttach) {
            try {
                mUSView.performIncrementalMount();
            } catch (Exception e) {
                dwh.i(e);
            }
        }
    }
}
