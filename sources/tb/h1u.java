package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class h1u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Toast f20364a;

    static {
        t2o.a(468713759);
    }

    public static void a(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a0332e", new Object[]{context, charSequence});
        } else {
            b(context, charSequence, 0);
        }
    }

    public static void b(Context context, CharSequence charSequence, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf66a595", new Object[]{context, charSequence, new Integer(i)});
            return;
        }
        Toast makeText = Toast.makeText(context.getApplicationContext(), charSequence, i);
        makeText.setGravity(17, 0, 0);
        View view = makeText.getView();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                View childAt = viewGroup.getChildAt(0);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setGravity(17);
                }
            }
        }
        makeText.show();
    }

    public static void c(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f88f4f4", new Object[]{context, charSequence});
        } else if (p91.k(context)) {
            b(context, "Debug：" + ((Object) charSequence), 1);
        }
    }

    public static void d(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd073db", new Object[]{context, charSequence});
        } else if (!TextUtils.isEmpty(charSequence)) {
            Toast toast = f20364a;
            if (toast == null) {
                f20364a = Toast.makeText(context.getApplicationContext(), charSequence, 0);
            } else {
                toast.setText(charSequence);
            }
            f20364a.show();
        }
    }
}
