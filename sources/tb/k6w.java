package tb;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class k6w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f22438a;
    public final List<a> b = new LinkedList();
    public final List<b> c = new LinkedList();
    public int d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f22439a;
        public final RectF b;
        public int c;
        public final float d;

        static {
            t2o.a(482345010);
        }

        public a(Bitmap bitmap, RectF rectF, float f) {
            this.f22439a = bitmap;
            this.b = rectF;
            this.d = f;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b {
        static {
            t2o.a(482345011);
        }

        public b(int i, int i2, RectF rectF) {
        }
    }

    static {
        t2o.a(482345009);
    }

    public k6w(int i) {
        this.f22438a = i;
    }

    public void a(Bitmap bitmap, RectF rectF, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("379f20cc", new Object[]{this, bitmap, rectF, new Float(f)});
        } else {
            ((LinkedList) this.b).add(new a(bitmap, rectF, f));
        }
    }

    public void b(int i, int i2, RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd190cb", new Object[]{this, new Integer(i), new Integer(i2), rectF});
        } else {
            ((LinkedList) this.c).add(new b(i, i2, rectF));
        }
    }

    public List<a> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c7cd3fa9", new Object[]{this});
        }
        return this.b;
    }

    public List<b> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9230e924", new Object[]{this});
        }
        return this.c;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aeaa0eba", new Object[]{this})).intValue();
        }
        return this.f22438a;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a57bb175", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public void g(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a4ddd45", new Object[]{this, list});
            return;
        }
        ((LinkedList) this.b).clear();
        ((LinkedList) this.b).addAll(list);
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e590fe35", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }
}
