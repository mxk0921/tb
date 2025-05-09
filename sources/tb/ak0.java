package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.PhotoFrom;
import com.taobao.taobao.scancode.huoyan.object.KakaLibImageWrapper;
import com.uc.webview.internal.interfaces.IWebViewExtension;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ak0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f15783a;
    public final Bitmap b;
    public final int c;
    public final PhotoFrom.Values d;
    public int e;
    public final String f;
    public KakaLibImageWrapper g;

    static {
        t2o.a(481296450);
    }

    public ak0(String str, Bitmap bitmap, int i, PhotoFrom.Values values, int i2, String str2, KakaLibImageWrapper kakaLibImageWrapper) {
        ckf.g(bitmap, IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP);
        this.f15783a = str;
        this.b = bitmap;
        this.c = i;
        this.d = values;
        this.e = i2;
        this.f = str2;
        this.g = kakaLibImageWrapper;
    }

    public final Bitmap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c5e4890a", new Object[]{this});
        }
        return this.b;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbfa2b5c", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public final PhotoFrom.Values c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhotoFrom.Values) ipChange.ipc$dispatch("d7936159", new Object[]{this});
        }
        return this.d;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6fe8c7cf", new Object[]{this});
        }
        return this.f15783a;
    }

    public final KakaLibImageWrapper e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KakaLibImageWrapper) ipChange.ipc$dispatch("93fe8e5b", new Object[]{this});
        }
        return this.g;
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad9ae414", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41e265bf", new Object[]{this});
        }
        return this.f;
    }

    public final void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff9f752e", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public final void i(KakaLibImageWrapper kakaLibImageWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65c0e29b", new Object[]{this, kakaLibImageWrapper});
        } else {
            this.g = kakaLibImageWrapper;
        }
    }

    public /* synthetic */ ak0(String str, Bitmap bitmap, int i, PhotoFrom.Values values, int i2, String str2, KakaLibImageWrapper kakaLibImageWrapper, int i3, a07 a07Var) {
        this((i3 & 1) != 0 ? null : str, bitmap, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? null : values, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? null : str2, (i3 & 64) != 0 ? null : kakaLibImageWrapper);
    }
}
