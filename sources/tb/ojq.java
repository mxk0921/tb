package tb;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.WeakHashMap;
import tb.pki;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ojq extends bu2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<Bitmap, Map<ojq, Boolean>> l = new WeakHashMap(300);
    public final Bitmap i;
    public final Rect j;
    public a k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
    }

    static {
        t2o.a(620757064);
    }

    public ojq(Bitmap bitmap, Rect rect, String str, String str2, int i, int i2) {
        super(str, str2, i, i2);
        this.i = bitmap;
        this.j = rect;
        m();
        fiv.a(sie.TAG_RECYCLE, "new image=%s", this);
    }

    public static /* synthetic */ Object ipc$super(ojq ojqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/cache/memory/StaticCachedImage");
    }

    @Override // tb.bu2
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue();
        }
        return q0q.b(this.i);
    }

    @Override // tb.bu2
    public dtl d(String str, String str2, int i, int i2, boolean z, Resources resources) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dtl) ipChange.ipc$dispatch("a6a39e79", new Object[]{this, str, str2, new Integer(i), new Integer(i2), new Boolean(z), resources});
        }
        if (z) {
            return new uwn(resources, this.i, this.j, str, str2, i, i2);
        }
        return new dtl(resources, this.i, this.j, str, str2, i, i2);
    }

    @Override // tb.bu2
    public void f() {
        a aVar;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a7723ec", new Object[]{this});
            return;
        }
        Map<Bitmap, Map<ojq, Boolean>> map = l;
        synchronized (map) {
            try {
                Map map2 = (Map) ((WeakHashMap) map).get(this.i);
                if (map2 != null) {
                    map2.remove(this);
                    int size = map2.size();
                    if (size == 0) {
                        ((WeakHashMap) map).remove(this.i);
                        fiv.a(sie.TAG_RECYCLE, "bitmap in the image can be recycled now, image=%s", this);
                        z = true;
                    } else {
                        fiv.k(sie.TAG_RECYCLE, "cannot recycled the image(bitmap referenced by %d image still), image=%s", Integer.valueOf(size), this);
                    }
                } else {
                    fiv.k(sie.TAG_RECYCLE, "cannot recycled the image(bitmap has been recycled ever), image=%s", this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z && (aVar = this.k) != null) {
            ((pki.a) aVar).a(this);
        }
    }

    @Override // tb.bu2
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9467888", new Object[]{this});
            return;
        }
        fiv.a(sie.TAG_RECYCLE, "image change to not recycled, image=%s", this);
        m();
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feff541f", new Object[]{this});
            return;
        }
        Map<Bitmap, Map<ojq, Boolean>> map = l;
        synchronized (map) {
            try {
                Map map2 = (Map) ((WeakHashMap) map).get(this.i);
                if (map2 == null) {
                    map2 = new WeakHashMap(1);
                    ((WeakHashMap) map).put(this.i, map2);
                }
                map2.put(this, Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ojq n(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ojq) ipChange.ipc$dispatch("e180f1f9", new Object[]{this, aVar});
        }
        this.k = aVar;
        return this;
    }

    @Override // tb.bu2
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "StaticCachedImage(" + Integer.toHexString(hashCode()) + ", bmp@" + this.i + ", key@" + b() + f7l.BRACKET_END_STR;
    }
}
