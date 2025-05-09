package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class df2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f17769a;
    public final int b;

    static {
        t2o.a(481297037);
    }

    public df2(Bitmap bitmap, int i) {
        this.f17769a = bitmap;
        this.b = i;
    }

    public Bitmap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c5e4890a", new Object[]{this});
        }
        return this.f17769a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24ea6426", new Object[]{this})).intValue();
        }
        return this.b;
    }
}
