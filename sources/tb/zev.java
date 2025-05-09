package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zev implements g6e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f32714a;

        public a(zev zevVar, Runnable runnable) {
            this.f32714a = runnable;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.f32714a.run();
            }
        }
    }

    static {
        t2o.a(944767012);
        t2o.a(944767007);
    }

    @Override // tb.g6e
    public View a(Context context, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("76f65d28", new Object[]{this, context, runnable, runnable2});
        }
        TBErrorView tBErrorView = new TBErrorView(context);
        tBErrorView.setTitle(Localization.q(R.string.gg_pub_load_failed));
        tBErrorView.setSubTitle(Localization.q(R.string.gg_pub_try_refresh_page));
        TBErrorView.ButtonType buttonType = TBErrorView.ButtonType.BUTTON_LEFT;
        tBErrorView.setButtonVisibility(buttonType, 0);
        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 0);
        tBErrorView.setButton(buttonType, Localization.q(R.string.gg_pub_refresh), new a(this, runnable));
        return tBErrorView;
    }
}
