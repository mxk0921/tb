package tb;

import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class a53 extends zio {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ int c;
    public final /* synthetic */ z43 d;

    public a53(z43 z43Var, int i) {
        this.d = z43Var;
        this.c = i;
    }

    public static /* synthetic */ Object ipc$super(a53 a53Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/CaptureBottomAreaNavBarViewV2$3");
    }

    @Override // tb.zio
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            return;
        }
        agh.h("AutoSize__Bottom_NavBarViewV2", "switchShowType " + this.c);
        int R = z43.R(this.d);
        int i = this.c;
        if (R == i) {
            agh.h("AutoSize__Bottom_NavBarViewV2", "curShowType not change");
            return;
        }
        z43.S(this.d, i);
        if (z43.R(this.d) == 0) {
            z43.T(this.d).setText(Localization.q(R.string.taobao_app_1007_1_18987));
        } else if (z43.R(this.d) == 2) {
            z43.T(this.d).setText(Localization.q(R.string.taobao_app_1007_1_18919));
        } else {
            z43.T(this.d).setText(Localization.q(R.string.taobao_app_1007_1_19914));
        }
        TextView T = z43.T(this.d);
        T.setContentDescription(((Object) z43.T(this.d).getText()) + "，" + Localization.q(R.string.taobao_app_1007_selected));
        z43.U(this.d).onTabChanged(z43.R(this.d));
    }
}
