package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class fne {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<String> f19418a;
    public final ArrayList<wkn> b;
    public final Bitmap c;
    public final String d;

    static {
        t2o.a(481297068);
    }

    public fne(ArrayList<String> arrayList, ArrayList<wkn> arrayList2, Bitmap bitmap, String str) {
        this.f19418a = arrayList;
        this.b = arrayList2;
        this.c = bitmap;
        this.d = str;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ff2c1d1", new Object[]{this});
        }
        return this.d;
    }

    public final ArrayList<wkn> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("be83a5bf", new Object[]{this});
        }
        return this.b;
    }

    public final Bitmap c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a80786ae", new Object[]{this});
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
        if (!(obj instanceof fne)) {
            return false;
        }
        fne fneVar = (fne) obj;
        if (ckf.b(this.f19418a, fneVar.f19418a) && ckf.b(this.b, fneVar.b) && ckf.b(this.c, fneVar.c) && ckf.b(this.d, fneVar.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        ArrayList<String> arrayList = this.f19418a;
        if (arrayList == null) {
            i = 0;
        } else {
            i = arrayList.hashCode();
        }
        int i5 = i * 31;
        ArrayList<wkn> arrayList2 = this.b;
        if (arrayList2 == null) {
            i2 = 0;
        } else {
            i2 = arrayList2.hashCode();
        }
        int i6 = (i5 + i2) * 31;
        Bitmap bitmap = this.c;
        if (bitmap == null) {
            i3 = 0;
        } else {
            i3 = bitmap.hashCode();
        }
        int i7 = (i6 + i3) * 31;
        String str = this.d;
        if (str != null) {
            i4 = str.hashCode();
        }
        return i7 + i4;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ImageOutput(actions=" + this.f19418a + ", objects=" + this.b + ", resizedBitmap=" + this.c + ", extraInfo=" + ((Object) this.d) + ')';
    }
}
