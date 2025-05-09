package tb;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.NinePatchDrawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dtl extends BitmapDrawable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Rect f18057a;
    public String b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final boolean g;

    static {
        t2o.a(620757061);
    }

    public dtl(Resources resources, Bitmap bitmap, Rect rect, String str, String str2, int i, int i2) {
        super(resources, bitmap);
        this.f18057a = rect;
        this.g = (bitmap == null || bitmap.getNinePatchChunk() == null || !NinePatch.isNinePatchChunk(bitmap.getNinePatchChunk())) ? false : true;
        f(str, str2, i, i2);
    }

    public static /* synthetic */ Object ipc$super(dtl dtlVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/cache/memory/PassableBitmapDrawable");
    }

    public NinePatchDrawable a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NinePatchDrawable) ipChange.ipc$dispatch("b75ec9e6", new Object[]{this});
        }
        if (!this.g) {
            return null;
        }
        Bitmap bitmap = getBitmap();
        byte[] ninePatchChunk = bitmap.getNinePatchChunk();
        Rect rect = this.f18057a;
        if (rect == null) {
            rect = new Rect();
        }
        return new NinePatchDrawable(bitmap, ninePatchChunk, rect, null);
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e6b326", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8c8fcc2", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1f4883", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d3506e5", new Object[]{this});
        }
        return this.b;
    }

    public final void f(String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e38798cb", new Object[]{this, str, str2, new Integer(i), new Integer(i2)});
        } else {
            this.b = str;
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52ae9fbc", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83db4820", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("471f646b", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("134aa8e6", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac2268e8", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return getClass().getSimpleName() + f7l.BRACKET_START_STR + Integer.toHexString(hashCode()) + ", key@" + this.b + f7l.BRACKET_END_STR;
    }

    public dtl(String str, String str2, int i, int i2) {
        f(str, str2, i, i2);
    }
}
