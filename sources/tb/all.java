package tb;

import android.content.Context;
import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class all {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final all INSTANCE = new all();

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f15825a;

    static {
        t2o.a(442499218);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            f15825a = null;
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0b7f365", new Object[]{this})).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b != null) {
            return Boolean.parseBoolean(b.getConfig(byj.DETAIL_TAOBAO_GROUP_NAME, "enable_fold_device_single_column", "false"));
        }
        return false;
    }

    public final String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ee669c5", new Object[]{this, context});
        }
        ckf.g(context, "context");
        if (TBDeviceUtils.P(context)) {
            return "pad";
        }
        if (TBDeviceUtils.p(context)) {
            return ytc.TYPE_FOLD;
        }
        return null;
    }

    public final Rect d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("e0b0f696", new Object[]{this, context});
        }
        ckf.g(context, "context");
        if (!f(context)) {
            return null;
        }
        TBAutoSizeConfig x = TBAutoSizeConfig.x();
        Rect rect = new Rect();
        rect.left = 0;
        rect.top = 0;
        rect.bottom = x.B(context);
        rect.right = e(context, x);
        return rect;
    }

    public final int e(Context context, TBAutoSizeConfig tBAutoSizeConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ed09b6", new Object[]{this, context, tBAutoSizeConfig})).intValue();
        }
        if (g(context)) {
            return tBAutoSizeConfig.H(context);
        }
        if (!b() || h(context)) {
            return tBAutoSizeConfig.J(context);
        }
        return tBAutoSizeConfig.H(context);
    }

    public final boolean f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("291a7758", new Object[]{this, context})).booleanValue();
        }
        ckf.g(context, "context");
        if (f15825a == null) {
            f15825a = Boolean.valueOf(o2q.c("allowPadMode"));
        }
        if (!ckf.b(f15825a, Boolean.TRUE)) {
            return false;
        }
        if (TBDeviceUtils.p(context) || TBDeviceUtils.P(context)) {
            return true;
        }
        return false;
    }

    public final boolean g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("802a3d16", new Object[]{this, context})).booleanValue();
        }
        ckf.g(context, "context");
        return TBAutoSizeConfig.x().T(context);
    }

    public final boolean h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc1a5af5", new Object[]{this, context})).booleanValue();
        }
        ckf.g(context, "context");
        if (f15825a == null) {
            f15825a = Boolean.valueOf(o2q.c("allowPadMode"));
        }
        if (!ckf.b(f15825a, Boolean.TRUE)) {
            return false;
        }
        return TBDeviceUtils.P(context);
    }
}
