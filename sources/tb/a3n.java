package tb;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.taobao.R;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class a3n extends a90 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public RelativeLayout c;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f15528a;

        public a(Context context) {
            this.f15528a = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Activity activity;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            Context context = this.f15528a;
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                activity = null;
            }
            if (activity != null) {
                activity.finish();
            }
        }
    }

    static {
        t2o.a(844103775);
    }

    public static /* synthetic */ Object ipc$super(a3n a3nVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub/titlebar/action/PubGameCloseMoreAction");
    }

    @Override // tb.a90
    public View l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1ed25ea8", new Object[]{this, context});
        }
        ckf.g(context, "context");
        if (this.c == null) {
            View inflate = View.inflate(context, R.layout.tms_game_close_action, null);
            if (inflate != null) {
                RelativeLayout relativeLayout = (RelativeLayout) inflate;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(xcs.a(context, 75.0f), xcs.a(context, 29.0f));
                layoutParams.rightMargin = xcs.a(context, 12.0f);
                relativeLayout.setLayoutParams(layoutParams);
                this.c = relativeLayout;
                ImageView imageView = (ImageView) relativeLayout.findViewById(R.id.right_close);
                if (imageView != null) {
                    imageView.setOnClickListener(new a(context));
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout");
            }
        }
        return this.c;
    }
}
