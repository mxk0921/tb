package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.barcode.util.ScancodeBaseBrowserActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kp1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(760217633);
    }

    public static void a(Activity activity, String str, nmd nmdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2df22ab7", new Object[]{activity, str, nmdVar});
            return;
        }
        String queryParameter = activity.getIntent().getData().getQueryParameter("pssource");
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = l53.PsSourceSY_SYS;
        }
        yoj.b(activity.getApplicationContext(), nmdVar).d(Uri.parse("https://h5.m.taobao.com/tusou/image_editor/index.html").buildUpon().appendQueryParameter("pssource", queryParameter).appendQueryParameter(wxi.KEY_PHOTO_FROM, "productCode").appendQueryParameter("barcode", str).build().toString());
    }

    public static boolean b(Activity activity, ryu ryuVar, String str, int i, String str2, boolean z, nmd nmdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b20927b", new Object[]{activity, ryuVar, str, new Integer(i), str2, new Boolean(z), nmdVar})).booleanValue();
        }
        Context applicationContext = activity.getApplicationContext();
        if (i == 1) {
            try {
                ScancodeBaseBrowserActivity.v3();
                a(activity, str, nmdVar);
                return true;
            } catch (Exception unused) {
            }
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append("taobao://tb.cn/n/scancode/h5/barcode/info?barcode=");
        sb.append(str);
        if (i == 3) {
            sb.append("&type=3&linkUrl=");
            sb.append(str2);
        }
        sb.append("&saveHistory=");
        sb.append(z);
        if (ryuVar != null) {
            sb.append("&");
            sb.append(ryuVar.a());
        }
        String sb2 = sb.toString();
        boolean d = yoj.b(applicationContext, nmdVar).d(sb2);
        ey3.g().i("Recommend_Nav_lunchBarcodePage", "finalUrl", sb2);
        return d;
    }
}
