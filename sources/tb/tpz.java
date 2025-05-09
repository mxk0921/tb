package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class tpz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f28877a;
    public float b;
    public float c;
    public float d;
    public WeakReference<Bitmap> e;

    static {
        t2o.a(352322025);
    }

    public void a(WeakReference<Bitmap> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fabf4f45", new Object[]{this, weakReference});
        } else {
            this.e = weakReference;
        }
    }

    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("672d6cd9", new Object[]{this, new Float(f)});
        } else {
            this.f28877a = f;
        }
    }

    public void c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68e24578", new Object[]{this, new Float(f)});
        } else {
            this.b = f;
        }
    }

    public void d(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5126620e", new Object[]{this, new Float(f)});
        } else {
            this.c = f;
        }
    }

    public void e(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f84bd7", new Object[]{this, new Float(f)});
        } else {
            this.d = f;
        }
    }

    public tpz f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tpz) ipChange.ipc$dispatch("9fb240de", new Object[]{this});
        }
        return this;
    }
}
