package tb;

import android.graphics.Color;
import android.graphics.Typeface;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class y43 extends zio {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TextView d;

    public y43(boolean z, TextView textView) {
        this.c = z;
        this.d = textView;
    }

    public static /* synthetic */ Object ipc$super(y43 y43Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/CaptureBottomAreaNavBarViewV1$updateTabBtnState$1");
    }

    @Override // tb.zio
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c1193f", new Object[]{this});
        } else if (this.c) {
            this.d.setTextColor(Color.parseColor("#FFFFFF"));
            this.d.setTypeface(Typeface.DEFAULT_BOLD);
            TextView textView = this.d;
            textView.setContentDescription(((Object) this.d.getText()) + (char) 65292 + Localization.q(R.string.taobao_app_1007_selected) + (char) 65292 + Localization.q(R.string.taobao_app_1007_button));
        } else {
            this.d.setTextColor(Color.parseColor("#99FFFFFF"));
            this.d.setTypeface(Typeface.DEFAULT);
            TextView textView2 = this.d;
            textView2.setContentDescription(((Object) this.d.getText()) + (char) 65292 + Localization.q(R.string.taobao_app_1007_button));
        }
    }
}
