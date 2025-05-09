package tb;

import android.content.Context;
import android.content.Intent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.LocationCallBack;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lbj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23232a;

        public a(Context context) {
            this.f23232a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                LocalBroadcastManager.getInstance(this.f23232a).sendBroadcast(new Intent(LocationCallBack.ACTION_IP_BLACKLIST_CHECK));
            }
        }
    }

    static {
        t2o.a(708837618);
    }

    public static void a(TextView textView, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5a64726", new Object[]{textView, imageView});
            return;
        }
        textView.setTypeface(textView.getTypeface(), 1);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.gravity = 3;
        layoutParams.leftMargin = ai.a(53.0f);
        textView.setLayoutParams(layoutParams);
        textView.setText(Localization.q(R.string.purchase_tbbuy_title));
        imageView.setImageResource(R.drawable.mul_back_icon);
        imageView.setPadding(0, 0, 0, 0);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams2.leftMargin = ai.a(15.0f);
        imageView.setLayoutParams(layoutParams2);
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a2d288", new Object[]{context});
        } else {
            dn.h(new a(context));
        }
    }
}
