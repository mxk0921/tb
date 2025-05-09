package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cash.activity.CustomBrowserActivity;
import com.taobao.android.cash.activity.TMGWeex2Activity;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class y7s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(416284707);
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("186e75a1", new Object[]{context, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && str.contains("renderType=2")) {
            Intent intent = new Intent(context, TMGWeex2Activity.class);
            intent.setData(Uri.parse(Uri.decode(str)));
            context.startActivity(intent);
            if (context instanceof Activity) {
                ((Activity) context).overridePendingTransition(R.anim.push_left_in, R.anim.push_right_out);
            }
            return true;
        } else if (str.contains("wh_weex=true")) {
            return false;
        } else {
            Intent intent2 = new Intent(context, CustomBrowserActivity.class);
            intent2.putExtra("url", str);
            intent2.putExtra("hasNavBar", str.contains("hasNavBar=1") ? 1 : 0);
            context.startActivity(intent2);
            if (context instanceof Activity) {
                ((Activity) context).overridePendingTransition(R.anim.push_left_in, R.anim.push_right_out);
            }
            return true;
        }
    }
}
