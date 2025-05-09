package tb;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xoe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(507510812);
    }

    public static Drawable a(Resources resources, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("bd9b712f", new Object[]{resources, str});
        }
        if (str == null) {
            return null;
        }
        try {
            try {
                return new BitmapDrawable(resources, BitmapFactory.decodeStream(new ByteArrayInputStream(Base64.decode(str, 0))));
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
                return null;
            }
        } catch (IllegalArgumentException unused) {
        }
    }
}
