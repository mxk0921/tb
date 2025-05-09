package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vyv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(817889362);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[0])).intValue();
        }
        return Globals.getApplication().getResources().getDisplayMetrics().widthPixels;
    }

    public static final Map<String, String> b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c9090be0", new Object[]{uri});
        }
        HashMap hashMap = new HashMap();
        if (uri != null) {
            for (String str : uri.getQueryParameterNames()) {
                String queryParameter = uri.getQueryParameter(str);
                if (!TextUtils.isEmpty(queryParameter)) {
                    hashMap.put(str, queryParameter);
                }
            }
        }
        return hashMap;
    }

    public static void c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1b2e41", new Object[]{context, str});
        } else if (context instanceof Activity) {
            TBToast.makeText(context, str).show();
        } else {
            Toast.makeText(Globals.getApplication().getApplicationContext(), str, 0).show();
        }
    }
}
