package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bottom.album.CaptureAlbumView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class h43 extends zio {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ CaptureAlbumView c;
    public final /* synthetic */ boolean d;

    public h43(CaptureAlbumView captureAlbumView, boolean z) {
        this.c = captureAlbumView;
        this.d = z;
    }

    public static /* synthetic */ Object ipc$super(h43 h43Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/album/CaptureAlbumView$updateEmptyViewState$1");
    }

    @Override // tb.zio
    public void c() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            return;
        }
        View T = CaptureAlbumView.T(this.c);
        if (T != null) {
            T.setVisibility(this.d ? 0 : 8);
            View R = CaptureAlbumView.R(this.c);
            if (R != null) {
                if (!this.d) {
                    i = 8;
                }
                R.setVisibility(i);
                if (this.d) {
                    CaptureAlbumView captureAlbumView = this.c;
                    CaptureAlbumView.h0(captureAlbumView, CaptureAlbumView.V(captureAlbumView), CaptureAlbumView.U(this.c));
                    return;
                }
                return;
            }
            ckf.y("emptyHintView");
            throw null;
        }
        ckf.y("hintContainer");
        throw null;
    }
}
