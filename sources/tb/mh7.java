package tb;

import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class mh7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final RectF f24039a;
    public final String b;
    public final boolean c;

    static {
        t2o.a(481297234);
    }

    public mh7(RectF rectF, String str) {
        this(rectF, str, false);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DetectPartBean{region =" + this.f24039a + '}';
    }

    public mh7(RectF rectF, String str, boolean z) {
        boolean z2 = false;
        this.c = false;
        this.f24039a = new RectF(rectF);
        this.b = str;
        if (!pv8.REGION_SEARCH.equals(str) && z) {
            z2 = true;
        }
        this.c = z2;
    }
}
