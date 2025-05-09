package tb;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.internal.interfaces.IWebViewExtension;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class oi3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f25403a;
    public final String b;

    static {
        t2o.a(481297041);
    }

    public oi3(Bitmap bitmap, String str) {
        ckf.g(bitmap, IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP);
        this.f25403a = bitmap;
        this.b = str;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc0f76", new Object[]{this});
        }
        return this.b;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc942c5a", new Object[]{this})).intValue();
        }
        return this.f25403a.hashCode();
    }

    public final Bitmap c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("e0b773fa", new Object[]{this});
        }
        if (hfn.c(this.f25403a.getWidth(), this.f25403a.getHeight()) <= 640) {
            return this.f25403a;
        }
        Bitmap m = gd2.m(this.f25403a, 640);
        if (m == null) {
            return this.f25403a;
        }
        return m;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71ddfb38", new Object[]{this})).booleanValue();
        }
        return !TextUtils.isEmpty(this.b) && !ckf.b("unknown", this.b) && !ckf.b("notScreenShots", this.b);
    }
}
