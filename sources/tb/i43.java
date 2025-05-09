package tb;

import android.graphics.Color;
import android.graphics.Typeface;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bottom.album.CaptureAlbumView;
import com.taobao.taobao.R;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class i43 extends zio {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ int c;
    public final /* synthetic */ CaptureAlbumView d;
    public final /* synthetic */ boolean e;

    public i43(int i, CaptureAlbumView captureAlbumView, boolean z) {
        this.c = i;
        this.d = captureAlbumView;
        this.e = z;
    }

    public static /* synthetic */ Object ipc$super(i43 i43Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/album/CaptureAlbumView$updateTabViewState$1");
    }

    @Override // tb.zio
    public void c() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            return;
        }
        int i = this.c;
        if (i >= 0) {
            List Z = CaptureAlbumView.Z(this.d);
            if (Z == null) {
                ckf.y("tabViewHolders");
                throw null;
            } else if (i < Z.size()) {
                List Z2 = CaptureAlbumView.Z(this.d);
                if (Z2 != null) {
                    TextView textView = (TextView) Z2.get(this.c);
                    if (this.e) {
                        textView.setTextColor(Color.parseColor("#FFFFFF"));
                        textView.setTypeface(Typeface.DEFAULT_BOLD);
                        CaptureAlbumView.N(this.d).d0(this.c);
                        CaptureAlbumView captureAlbumView = this.d;
                        if (CaptureAlbumView.N(captureAlbumView).P(this.c) == 0) {
                            z = true;
                        }
                        CaptureAlbumView.f0(captureAlbumView, z);
                        textView.setContentDescription(((Object) textView.getText()) + (char) 65292 + Localization.q(R.string.taobao_app_1007_selected) + (char) 65292 + Localization.q(R.string.taobao_app_1007_button));
                        return;
                    }
                    textView.setTextColor(Color.parseColor("#80FFFFFF"));
                    textView.setTypeface(Typeface.DEFAULT);
                    textView.setContentDescription(((Object) textView.getText()) + (char) 65292 + Localization.q(R.string.taobao_app_1007_button));
                    return;
                }
                ckf.y("tabViewHolders");
                throw null;
            }
        }
    }
}
