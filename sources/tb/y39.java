package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class y39 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f31826a;
    public final Map<String, String> b;

    static {
        t2o.a(481297048);
    }

    public y39(Bitmap bitmap, Map<String, String> map) {
        ckf.g(bitmap, IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP);
        this.f31826a = bitmap;
        this.b = map;
    }

    public final Bitmap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c5e4890a", new Object[]{this});
        }
        return this.f31826a;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc942c5a", new Object[]{this})).intValue();
        }
        return this.f31826a.hashCode();
    }

    public /* synthetic */ y39(Bitmap bitmap, Map map, int i, a07 a07Var) {
        this(bitmap, (i & 2) != 0 ? null : map);
    }
}
