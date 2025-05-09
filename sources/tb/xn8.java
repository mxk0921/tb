package tb;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xn8 extends f25 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int i;

    static {
        t2o.a(295699247);
    }

    public static /* synthetic */ Object ipc$super(xn8 xn8Var, String str, Object... objArr) {
        if (str.hashCode() == -340027132) {
            super.e();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/utils/ExpandRPToast");
    }

    @Override // tb.f25
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        hha.b("ExpandRPToast", "show | mShowTime=" + this.i);
        if (this.i > 0) {
            super.e();
        }
    }

    public xn8(ViewGroup viewGroup) {
        super(viewGroup, 3000);
        String w0 = yga.w0();
        if (w0 != null) {
            JSONObject d = fkx.d(w0);
            String string = d.getString("tieleText");
            String string2 = d.getString("leftIconImageViewUrl");
            String string3 = d.getString("rightArrowImageViewUrl");
            int g = zqq.g(d.getString(StEvent.SHOW_TIME), 0);
            this.i = g;
            View findViewById = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.taolive_gl_toast_expand_rp_flexalocal, (ViewGroup) null).findViewById(R.id.taolive_good_toast_root);
            TUrlImageView tUrlImageView = (TUrlImageView) findViewById.findViewById(R.id.taolive_gl_expand_rp_left_icon);
            if (!TextUtils.isEmpty(string2)) {
                tUrlImageView.setImageUrl(string2);
            }
            TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById.findViewById(R.id.taolive_gl_expand_rp_right_icon);
            if (!TextUtils.isEmpty(string3)) {
                tUrlImageView2.setImageUrl(string3);
            }
            ((TextView) findViewById.findViewById(R.id.taolive_gl_expand_rp_text)).setText(string);
            d(findViewById);
            b(nw0.d(this.f18955a, 42.0f));
            c(g * 1000);
        }
    }
}
