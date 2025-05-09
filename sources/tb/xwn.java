package tb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.perf.uikit.LiveLottieAnimationView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xwn extends f00 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699155);
    }

    public xwn(Context context, xea xeaVar, LiveLottieAnimationView liveLottieAnimationView, gg1 gg1Var) {
        super(context, xeaVar, liveLottieAnimationView, gg1Var);
    }

    public static /* synthetic */ Object ipc$super(xwn xwnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/showcase/hot/RemainingItemsAtmosphere");
    }

    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5fae2d26", new Object[]{this});
        }
        if (this.d == null) {
            View inflate = LayoutInflater.from(this.f18910a).inflate(R.layout.layout_gl_atmosphere_remain_flexalocal, (ViewGroup) null);
            this.d = inflate;
            TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.iv_background);
            if (tUrlImageView != null) {
                tUrlImageView.setImageUrl(wda.L());
                tUrlImageView.setSkipAutoSize(true);
            }
            TUrlImageView tUrlImageView2 = (TUrlImageView) this.d.findViewById(R.id.taolive_gl_remain_text);
            if (tUrlImageView2 != null) {
                tUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01beF1vm1qefiElUPef_!!6000000005521-2-tps-208-52.png");
                tUrlImageView2.setSkipAutoSize(true);
            }
        }
        return this.d;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        View view = this.d;
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.d.getParent()).removeView(this.d);
        }
    }

    public void f(ViewGroup viewGroup) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e127943", new Object[]{this, viewGroup});
        } else if (viewGroup != null) {
            View d = d();
            if (d.getParent() == null) {
                viewGroup.addView(d);
            }
            View view = this.d;
            if (view != null && (textView = (TextView) view.findViewById(R.id.tv_items)) != null) {
                textView.setText(this.f18910a.getString(R.string.taolive_project_show_case_atmosphere_prefix) + a(this.f.b));
            }
        }
    }
}
