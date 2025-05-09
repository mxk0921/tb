package tb;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class wro {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Rect[] f30877a;
    public final a b;
    public final Bitmap c;
    public final boolean d;
    public final y6n e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
        void a(int i);

        void b();
    }

    static {
        t2o.a(481297514);
    }

    public wro(Bitmap bitmap, Rect[] rectArr, a aVar, boolean z, y6n y6nVar) {
        this.c = bitmap;
        this.f30877a = rectArr;
        this.b = aVar;
        this.d = z;
        this.e = y6nVar;
    }

    public Bitmap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("42620a46", new Object[]{this});
        }
        return this.c;
    }

    public y6n b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y6n) ipChange.ipc$dispatch("b92e4ce3", new Object[]{this});
        }
        return this.e;
    }

    public a c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("2f011e6d", new Object[]{this});
        }
        return this.b;
    }

    public Rect[] d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect[]) ipChange.ipc$dispatch("f604ba44", new Object[]{this});
        }
        return this.f30877a;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62fcf75f", new Object[]{this})).booleanValue();
        }
        return this.d;
    }
}
