package tb;

import android.graphics.Color;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class mvn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float DASH_WIDTH = 3.0f;
    public static final float DOT_INNER_RADIUS = 7.0f;
    public static final float DOT_OUTER_RADIUS = 12.0f;
    public static final float LENGTH = 17.0f;
    public static final float RADIUS = 4.0f;

    /* renamed from: a  reason: collision with root package name */
    public static final int f24336a = Color.parseColor("#BFBFBF");
    public static final int b = Color.parseColor("#111111");

    static {
        t2o.a(481297385);
    }

    public static final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("293ce948", new Object[0])).intValue();
        }
        return f24336a;
    }

    public static final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("884112d", new Object[0])).intValue();
        }
        return b;
    }
}
