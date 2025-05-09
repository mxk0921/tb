package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class hs3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final hs3 INSTANCE = new hs3();

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Bitmap> f20850a = new LinkedHashMap();

    static {
        t2o.a(481296915);
    }

    public final Bitmap a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("384667aa", new Object[]{this, str, new Boolean(z)});
        }
        if (str == null) {
            return null;
        }
        if (z) {
            return f20850a.remove(str);
        }
        return (Bitmap) ((LinkedHashMap) f20850a).get(str);
    }

    public final void b(Bitmap bitmap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3700b305", new Object[]{this, bitmap, str});
            return;
        }
        ckf.g(bitmap, IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP);
        ckf.g(str, "token");
        f20850a.put(str, bitmap);
    }
}
