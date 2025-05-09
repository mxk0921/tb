package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class zy9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int AT_MOST = Integer.MIN_VALUE;
    public static final int EXACTLY = 1073741824;
    public static final int MATCH_PARENT = -1;
    public static final int UNSPECIFIED = 0;
    public static final int WRAP_CONTENT = -2;

    /* renamed from: a  reason: collision with root package name */
    public final int f33098a;
    public final int b;
    public final int c;

    static {
        t2o.a(912261418);
    }

    public zy9() {
        this.c = 0;
    }

    public static int d(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a4dd645", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        return View.MeasureSpec.makeMeasureSpec(i, i2);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19666692", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return this.f33098a;
    }

    public zy9(int i, int i2, int i3) {
        this.f33098a = i;
        this.b = i2;
        this.c = i3;
    }
}
