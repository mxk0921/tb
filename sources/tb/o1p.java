package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class o1p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792236);
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("777b781d", new Object[]{new Float(f)})).intValue();
        }
        return DensityUtil.dip2px(Globals.getApplication(), f);
    }

    public static int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("777b8360", new Object[]{new Integer(i)})).intValue();
        }
        return DensityUtil.dip2px(Globals.getApplication(), i);
    }

    public static int c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6682cfc", new Object[]{new Integer(i)})).intValue();
        }
        return f(b(i));
    }

    public static float d(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3f6f788", new Object[]{new Float(f)})).floatValue();
        }
        return f / Globals.getApplication().getResources().getDisplayMetrics().density;
    }

    public static int e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3f702ce", new Object[]{new Integer(i)})).intValue();
        }
        return DensityUtil.px2dip(Globals.getApplication(), i);
    }

    public static int f(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("798ff4dc", new Object[]{new Float(f)})).intValue();
        }
        return (int) ((f / Globals.getApplication().getResources().getDisplayMetrics().widthPixels) * 750.0f);
    }

    public static float g(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18455c93", new Object[]{new Float(f)})).floatValue();
        }
        return (f / Globals.getApplication().getResources().getDisplayMetrics().widthPixels) * 750.0f;
    }

    public static int h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0a386f", new Object[]{new Integer(i)})).intValue();
        }
        return (zuo.e() * i) / 750;
    }

    public static float i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13123986", new Object[]{new Integer(i)})).floatValue();
        }
        return (zuo.e() * i) / 750.0f;
    }
}
