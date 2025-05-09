package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class j6w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f21804a;
    public final Bitmap b;
    public final boolean c;

    static {
        t2o.a(482345008);
    }

    public j6w(int i, Bitmap bitmap) {
        this.f21804a = i;
        this.b = bitmap;
    }

    public Bitmap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b13e959c", new Object[]{this});
        }
        return this.b;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3737eeda", new Object[]{this})).intValue();
        }
        return this.f21804a;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7893ae96", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public j6w() {
        this.c = true;
    }
}
