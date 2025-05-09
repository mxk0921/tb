package tb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class g1u {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601440);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final void a(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc761d92", new Object[]{this, context, str});
                return;
            }
            ckf.g(context, "context");
            ckf.g(str, "message");
            TextView textView = null;
            View inflate = LayoutInflater.from(context).inflate(R.layout.no_logo_toast, (ViewGroup) null);
            ckf.f(inflate, "inflater.inflate(R.layout.no_logo_toast, null)");
            View findViewById = inflate.findViewById(R.id.message);
            if (findViewById instanceof TextView) {
                textView = findViewById;
            }
            TextView textView2 = textView;
            if (textView2 != null) {
                textView2.setText(str);
            }
            Toast toast = new Toast(context.getApplicationContext());
            toast.setGravity(17, 0, 0);
            toast.setDuration(0);
            toast.setView(inflate);
            toast.show();
        }
    }

    static {
        t2o.a(919601439);
    }
}
