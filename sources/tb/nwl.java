package tb;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.TaobaoImageUrlStrategy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class nwl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BASE_64 = "base64,";
    public static final String BASE_64_PREFIX = "data:image/";
    public static final int BIZ_ID = 8900;

    static {
        t2o.a(815792662);
    }

    public static final /* synthetic */ ImageStrategyConfig a(TaobaoImageUrlStrategy.ImageQuality imageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("890626a5", new Object[]{imageQuality});
        }
        return c(imageQuality);
    }

    public static final Bitmap b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("578c0a8", new Object[]{str});
        }
        ckf.g(str, "base64Data");
        byte[] decode = Base64.decode(str, 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    public static final ImageStrategyConfig c(TaobaoImageUrlStrategy.ImageQuality imageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("df48b5e5", new Object[]{imageQuality});
        }
        ImageStrategyConfig.b w = ImageStrategyConfig.w("muise", "8900");
        w.o(true);
        w.i(imageQuality);
        ImageStrategyConfig a2 = w.a();
        ckf.f(a2, "build(...)");
        return a2;
    }
}
