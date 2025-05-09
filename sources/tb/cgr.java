package tb;

import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class cgr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONST_0 = "0";
    public static final String CONST_1 = "1";
    public static final int COVERAGE_RANGE_MAX = 100;
    public static final int COVERAGE_RANGE_MIN = 0;
    public static final double MEASURE_TIME_MAX_VALUE = 30000.0d;
    public static final Random b = new Random();

    /* renamed from: a  reason: collision with root package name */
    public boolean f17052a;

    public static boolean m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5aec0122", new Object[]{new Integer(i)})).booleanValue();
        }
        if (b.nextInt(100) + 1 <= i) {
            return true;
        }
        return false;
    }

    public boolean k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56741f78", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i <= 0) {
            return true;
        }
        if (i >= 100 || m(i)) {
            return false;
        }
        return true;
    }

    public void l(MeasureSet measureSet, String str, Double d, Double d2, Double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7abde1bf", new Object[]{this, measureSet, str, d, d2, d3});
            return;
        }
        Measure measure = new Measure(str, d);
        if (!(d2 == null || d3 == null)) {
            measure.setRange(d2, d3);
        }
        measureSet.addMeasure(measure);
    }
}
