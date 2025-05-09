package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qso {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(760217737);
    }

    public static void a(LayoutInflater layoutInflater, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2465534", new Object[]{layoutInflater, context, str});
        } else if (context != null && layoutInflater != null && !TextUtils.isEmpty(str)) {
            Toast toast = new Toast(context);
            View inflate = layoutInflater.inflate(R.layout.scancode_gateway_toast, (ViewGroup) null);
            ((TextView) inflate.findViewById(R.id.content)).setText(str);
            toast.setDuration(1);
            toast.setGravity(17, 0, 0);
            toast.setView(inflate);
            toast.show();
        }
    }
}
