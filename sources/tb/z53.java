package tb;

import android.content.DialogInterface;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bottom.history.CaptureHistoryView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class z53 implements DialogInterface.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CaptureHistoryView f32548a;

    public z53(CaptureHistoryView captureHistoryView) {
        this.f32548a = captureHistoryView;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            return;
        }
        CaptureHistoryView.P(this.f32548a).M();
        RecyclerView W = CaptureHistoryView.W(this.f32548a);
        if (W != null) {
            W.setVisibility(8);
            View O = CaptureHistoryView.O(this.f32548a);
            if (O != null) {
                O.setVisibility(0);
                CaptureHistoryView captureHistoryView = this.f32548a;
                CaptureHistoryView.Y(captureHistoryView, CaptureHistoryView.U(captureHistoryView), CaptureHistoryView.T(this.f32548a));
                CaptureHistoryView.X(this.f32548a, false);
                dialogInterface.cancel();
                CaptureHistoryView.R(this.f32548a).clear();
                v53 v53Var = (v53) CaptureHistoryView.V(this.f32548a);
                if (v53Var != null) {
                    v53Var.H();
                }
                CaptureHistoryView.S(this.f32548a).invoke();
                return;
            }
            ckf.y("hintContainer");
            throw null;
        }
        ckf.y("rvHistory");
        throw null;
    }
}
