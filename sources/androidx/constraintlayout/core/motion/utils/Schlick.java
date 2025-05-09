package androidx.constraintlayout.core.motion.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Schlick extends Easing {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final boolean DEBUG = false;
    public double mEps;
    public double mS;
    public double mT;

    public Schlick(String str) {
        this.mStr = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.mS = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i = indexOf2 + 1;
        this.mT = Double.parseDouble(str.substring(i, str.indexOf(44, i)).trim());
    }

    private double dfunc(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6056945d", new Object[]{this, new Double(d)})).doubleValue();
        }
        double d2 = this.mT;
        if (d < d2) {
            double d3 = this.mS;
            return ((d3 * d2) * d2) / ((((d2 - d) * d3) + d) * ((d3 * (d2 - d)) + d));
        }
        double d4 = this.mS;
        return (((d2 - 1.0d) * d4) * (d2 - 1.0d)) / (((((-d4) * (d2 - d)) - d) + 1.0d) * ((((-d4) * (d2 - d)) - d) + 1.0d));
    }

    private double func(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a66441", new Object[]{this, new Double(d)})).doubleValue();
        }
        double d2 = this.mT;
        if (d < d2) {
            return (d2 * d) / (d + (this.mS * (d2 - d)));
        }
        return ((1.0d - d2) * (d - 1.0d)) / ((1.0d - d) - (this.mS * (d2 - d)));
    }

    public static /* synthetic */ Object ipc$super(Schlick schlick, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/motion/utils/Schlick");
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72fc02ef", new Object[]{this, new Double(d)})).doubleValue();
        }
        return func(d);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49e98cea", new Object[]{this, new Double(d)})).doubleValue();
        }
        return dfunc(d);
    }
}
