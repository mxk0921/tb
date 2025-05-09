package tb;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class lso {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f23545a;
    public final Rect[] b;
    public final kso[] c;
    public final HashMap<String, String> d;

    static {
        t2o.a(481296705);
    }

    public lso(Bitmap bitmap, Rect[] rectArr, kso[] ksoVarArr, HashMap<String, String> hashMap) {
        ckf.g(hashMap, "extParam");
        this.f23545a = bitmap;
        this.b = rectArr;
        this.c = ksoVarArr;
        this.d = hashMap;
    }

    public final HashMap<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("b09bf90c", new Object[]{this});
        }
        return this.d;
    }

    public final Bitmap b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("33ba19c8", new Object[]{this});
        }
        return this.f23545a;
    }

    public final Rect[] c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect[]) ipChange.ipc$dispatch("f604ba44", new Object[]{this});
        }
        return this.b;
    }

    public final kso[] d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kso[]) ipChange.ipc$dispatch("f91e6aea", new Object[]{this});
        }
        return this.c;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lso)) {
            return false;
        }
        lso lsoVar = (lso) obj;
        if (ckf.b(this.f23545a, lsoVar.f23545a) && ckf.b(this.b, lsoVar.b) && ckf.b(this.c, lsoVar.c) && ckf.b(this.d, lsoVar.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        Bitmap bitmap = this.f23545a;
        if (bitmap == null) {
            i = 0;
        } else {
            i = bitmap.hashCode();
        }
        int i4 = i * 31;
        Rect[] rectArr = this.b;
        if (rectArr == null) {
            i2 = 0;
        } else {
            i2 = Arrays.hashCode(rectArr);
        }
        int i5 = (i4 + i2) * 31;
        kso[] ksoVarArr = this.c;
        if (ksoVarArr != null) {
            i3 = Arrays.hashCode(ksoVarArr);
        }
        return ((i5 + i3) * 31) + this.d.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ScanResultWrapper(scaleBitmap=" + this.f23545a + ", scanCodeRects=" + Arrays.toString(this.b) + ", scanResults=" + Arrays.toString(this.c) + ", extParam=" + this.d + ')';
    }
}
