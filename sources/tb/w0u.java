package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class w0u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Toast f30387a;

    static {
        t2o.a(295698826);
    }

    public static void a(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd073db", new Object[]{context, charSequence});
        } else {
            g4s.b(context, charSequence);
        }
    }

    public static void b(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2f6110f", new Object[]{context, charSequence});
        } else if (context != null && !TextUtils.isEmpty(charSequence)) {
            if (f30387a == null) {
                f30387a = Toast.makeText(context.getApplicationContext(), charSequence, 0);
            }
            TextView textView = new TextView(context.getApplicationContext());
            textView.setText(charSequence);
            textView.setTextColor(context.getResources().getColor(R.color.white_flexalocal));
            textView.setTextSize(2, 18.0f);
            int b = hw0.b(context, 37.0f);
            textView.setPadding(b, b, b, b);
            textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            textView.setGravity(17);
            textView.setLineSpacing(hw0.b(context, 18.0f), 1.0f);
            textView.setBackground(context.getResources().getDrawable(R.drawable.taolive_toast_bg_flexalocal));
            f30387a.setView(textView);
            f30387a.setGravity(17, 0, 0);
            f30387a.show();
        }
    }
}
