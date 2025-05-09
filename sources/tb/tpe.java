package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class tpe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(944767061);
    }

    public static Bitmap a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("578c0a8", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.split(",");
            String str2 = split[0];
            if (split.length >= 2) {
                str2 = split[1];
            }
            byte[] decode = Base64.decode(str2, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2511e38", new Object[]{context, str});
        }
        Bitmap a2 = a(str);
        if (a2 == null) {
            return null;
        }
        String e = i8g.e(context);
        if (ed2.q(a2, e)) {
            return e;
        }
        return null;
    }
}
