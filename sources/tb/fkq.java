package tb;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.text.TextDirectionHeuristicCompat;
import androidx.core.text.TextDirectionHeuristicsCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fkq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Constructor f19370a;
    public static boolean b;

    static {
        t2o.a(986710256);
    }

    public static StaticLayout a(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i4, int i5, TextDirectionHeuristicCompat textDirectionHeuristicCompat) throws Exception {
        c();
        try {
            Constructor constructor = f19370a;
            if (constructor != null) {
                return (StaticLayout) constructor.newInstance(charSequence, Integer.valueOf(i), Integer.valueOf(i2), textPaint, Integer.valueOf(i3), alignment, b(textDirectionHeuristicCompat), Float.valueOf(f), Float.valueOf(f2), Boolean.valueOf(z), truncateAt, Integer.valueOf(i4), Integer.valueOf(i5));
            }
            return new StaticLayout(charSequence, i, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4);
        } catch (Exception e) {
            if (e.getMessage().contains("utext_close")) {
                return new StaticLayout(charSequence, i, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4);
            }
            throw e;
        }
    }

    public static TextDirectionHeuristic b(TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextDirectionHeuristic) ipChange.ipc$dispatch("c6be58bd", new Object[]{textDirectionHeuristicCompat});
        }
        if (textDirectionHeuristicCompat == TextDirectionHeuristicsCompat.LTR) {
            return TextDirectionHeuristics.LTR;
        }
        if (textDirectionHeuristicCompat == TextDirectionHeuristicsCompat.RTL) {
            return TextDirectionHeuristics.RTL;
        }
        if (textDirectionHeuristicCompat == TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (textDirectionHeuristicCompat == TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (textDirectionHeuristicCompat == TextDirectionHeuristicsCompat.ANYRTL_LTR) {
            return TextDirectionHeuristics.ANYRTL_LTR;
        }
        if (textDirectionHeuristicCompat == TextDirectionHeuristicsCompat.LOCALE) {
            return TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dd06051", new Object[0]);
        } else if (!b) {
            b = true;
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Constructor constructor = StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                constructor.setAccessible(true);
                f19370a = constructor;
            } catch (NoSuchMethodException e) {
                wvh.a().b("StaticLayoutProxy.initConstructor", e);
                dwh.h(fkq.class.getSimpleName(), e);
            }
        }
    }
}
