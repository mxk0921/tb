package tb;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bottom.CaptureBottomAreaView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class c53 implements ViewTreeObserver.OnGlobalLayoutListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CaptureBottomAreaView f16865a;
    public final /* synthetic */ int b;

    public c53(CaptureBottomAreaView captureBottomAreaView, int i) {
        this.f16865a = captureBottomAreaView;
        this.b = i;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
            return;
        }
        FrameLayout O = CaptureBottomAreaView.O(this.f16865a);
        if (O != null) {
            ViewGroup.LayoutParams layoutParams = O.getLayoutParams();
            FrameLayout O2 = CaptureBottomAreaView.O(this.f16865a);
            if (O2 != null) {
                layoutParams.height = O2.getHeight() - this.b;
                FrameLayout O3 = CaptureBottomAreaView.O(this.f16865a);
                if (O3 != null) {
                    O3.setLayoutParams(layoutParams);
                    FrameLayout O4 = CaptureBottomAreaView.O(this.f16865a);
                    if (O4 != null) {
                        O4.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        ckf.y("bizContainer");
                        throw null;
                    }
                } else {
                    ckf.y("bizContainer");
                    throw null;
                }
            } else {
                ckf.y("bizContainer");
                throw null;
            }
        } else {
            ckf.y("bizContainer");
            throw null;
        }
    }
}
