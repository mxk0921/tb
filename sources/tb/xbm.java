package tb;

import android.content.Context;
import android.content.res.Resources;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class xbm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final xbm INSTANCE = new xbm();

    static {
        t2o.a(336592974);
    }

    @JvmStatic
    public static final int a() {
        Resources resources;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c34be7b7", new Object[0])).intValue();
        }
        Context a2 = q64.a();
        if (a2 == null || (resources = a2.getResources()) == null) {
            return 12;
        }
        return resources.getInteger(R.integer.std_pop_default_corner_radius);
    }

    @JvmStatic
    public static final float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f32f387", new Object[0])).floatValue();
        }
        return 1000.0f;
    }

    @JvmStatic
    public static final int c() {
        Resources resources;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10c9ade6", new Object[0])).intValue();
        }
        Context a2 = q64.a();
        if (a2 == null || (resources = a2.getResources()) == null) {
            return 250;
        }
        return resources.getInteger(R.integer.std_pop_hide_duration);
    }

    @JvmStatic
    public static final float d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91169381", new Object[0])).floatValue();
        }
        return 0.75f;
    }

    @JvmStatic
    public static final int e() {
        Resources resources;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1f0eb21", new Object[0])).intValue();
        }
        Context a2 = q64.a();
        if (a2 == null || (resources = a2.getResources()) == null) {
            return 300;
        }
        return resources.getInteger(R.integer.std_pop_show_duration);
    }
}
