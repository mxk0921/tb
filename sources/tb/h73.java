package tb;

import android.graphics.Bitmap;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Pair;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class h73 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final h73 INSTANCE = new h73();

    /* renamed from: a  reason: collision with root package name */
    public static Pair<String, Pair<String, Integer>> f20451a;

    static {
        t2o.a(481296733);
    }

    public final boolean a(String str) {
        Pair<String, Pair<String, Integer>> pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6b729f0", new Object[]{this, str})).booleanValue();
        }
        if (str == null || str.length() == 0 || (pair = f20451a) == null) {
            return false;
        }
        return ckf.b(pair.getFirst(), str);
    }

    public final Bitmap b(String str) {
        Pair<String, Pair<String, Integer>> pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("4afe4f64", new Object[]{this, str});
        }
        if (str == null || str.length() == 0 || (pair = f20451a) == null || !ckf.b(pair.getFirst(), str)) {
            return null;
        }
        return gd2.g(Uri.parse(pair.getSecond().getFirst()), 1024, 1, pair.getSecond().getSecond().intValue());
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            f20451a = null;
        }
    }

    public final void d(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b631fa37", new Object[]{this, str, str2, new Integer(i)});
            return;
        }
        ckf.g(str, "token");
        ckf.g(str2, "path");
        c();
        f20451a = new Pair<>(str, new Pair(str2, Integer.valueOf(i)));
    }
}
