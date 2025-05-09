package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bottom.CaptureBottomAreaView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class d53 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CaptureBottomAreaView f17585a;

    public d53(CaptureBottomAreaView captureBottomAreaView) {
        this.f17585a = captureBottomAreaView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        this.f17585a.b0().setDownContentHeight(CaptureBottomAreaView.N(this.f17585a));
        if (lg4.F()) {
            j = 0;
        } else {
            j = 150;
        }
        this.f17585a.b0().movePageToAssignPageLocationRatioWithAnim(1.0f, j, null);
    }
}
