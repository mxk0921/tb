package tb;

import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.RpxConfigVM;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class xho {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793378);
    }

    public static final void a(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("150d8b25", new Object[]{textView});
            return;
        }
        ckf.g(textView, "<this>");
        RpxConfigVM.Companion.c(textView);
    }

    public static final void b(TextView textView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca48c4f", new Object[]{textView, new Boolean(z)});
            return;
        }
        ckf.g(textView, "<this>");
        RpxConfigVM.Companion.d(textView, z);
    }

    public static final void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13c71b48", new Object[]{view});
            return;
        }
        ckf.g(view, "<this>");
        RpxConfigVM.Companion.b(view);
    }
}
