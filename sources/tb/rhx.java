package tb;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.Pair;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class rhx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final rhx INSTANCE = new rhx();

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, Integer> f27392a = new ConcurrentHashMap<>();

    @JvmStatic
    public static final Rect a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("5350f7b3", new Object[]{activity});
        }
        ckf.h(activity, "activity");
        if (TBDeviceUtils.p(activity) || TBDeviceUtils.P(activity)) {
            Window window = activity.getWindow();
            ckf.c(window, "activity.window");
            if (window.getAttributes().width > 0) {
                Window window2 = activity.getWindow();
                ckf.c(window2, "activity.window");
                WindowManager.LayoutParams attributes = window2.getAttributes();
                int i = attributes.x;
                int i2 = attributes.y;
                return new Rect(i, i2, attributes.width + i, attributes.height + i2);
            }
            Resources resources = activity.getResources();
            ckf.c(resources, "activity.resources");
            Configuration configuration = resources.getConfiguration();
            Pair<Integer, Integer> d = d7r.d(activity, false);
            int p = TBAutoSizeConfig.p(activity, configuration.screenWidthDp);
            Object obj = d.first;
            ckf.c(obj, "it.first");
            Object obj2 = d.second;
            ckf.c(obj2, "it.second");
            if (ckf.i(((Number) obj).intValue() + p, ((Number) obj2).intValue()) <= 0) {
                Object obj3 = d.first;
                ckf.c(obj3, "it.first");
                p += ((Number) obj3).intValue();
            }
            return new Rect(0, 0, p, TBAutoSizeConfig.p(activity, configuration.screenHeightDp) + b(activity));
        }
        Resources resources2 = activity.getResources();
        ckf.c(resources2, "activity.resources");
        int i3 = resources2.getDisplayMetrics().widthPixels;
        Resources resources3 = activity.getResources();
        ckf.c(resources3, "activity.resources");
        return new Rect(0, 0, i3, resources3.getDisplayMetrics().heightPixels);
    }

    @JvmStatic
    public static final int b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9070b1e", new Object[]{activity})).intValue();
        }
        ckf.h(activity, "activity");
        ConcurrentHashMap<String, Integer> concurrentHashMap = f27392a;
        String name = activity.getClass().getName();
        Integer num = concurrentHashMap.get(name);
        if (num == null) {
            Integer valueOf = Integer.valueOf(activity.getResources().getDimensionPixelSize(hfn.c(0, activity.getResources().getIdentifier("status_bar_height", "dimen", "android"))));
            Integer putIfAbsent = concurrentHashMap.putIfAbsent(name, valueOf);
            num = putIfAbsent != null ? putIfAbsent : valueOf;
        }
        return num.intValue();
    }
}
