package tb;

import android.graphics.Bitmap;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class q0m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f26429a;
    public by0 b;
    public String c;

    static {
        t2o.a(618659851);
    }

    public static q0m a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q0m) ipChange.ipc$dispatch("82fe0d2f", new Object[]{bitmap});
        }
        if (bitmap == null) {
            return null;
        }
        q0m q0mVar = new q0m();
        q0mVar.f26429a = bitmap;
        if (Build.VERSION.SDK_INT > 23) {
            bitmap.prepareToDraw();
        }
        return q0mVar;
    }

    public static q0m b(by0 by0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q0m) ipChange.ipc$dispatch("53215c77", new Object[]{by0Var});
        }
        if (by0Var == null) {
            return null;
        }
        q0m q0mVar = new q0m();
        q0mVar.b = by0Var;
        return q0mVar;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PexodeResult(bitmap=" + this.f26429a + ", animated=" + this.b + f7l.BRACKET_END_STR;
    }
}
