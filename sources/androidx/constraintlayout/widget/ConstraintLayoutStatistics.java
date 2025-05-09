package androidx.constraintlayout.widget;

import androidx.constraintlayout.core.Metrics;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.DecimalFormat;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ConstraintLayoutStatistics {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DURATION_OF_CHILD_MEASURES = 5;
    public static final int DURATION_OF_LAYOUT = 7;
    public static final int DURATION_OF_MEASURES = 6;
    private static int MAX_WORD = 25;
    public static final int NUMBER_OF_CHILD_MEASURES = 4;
    public static final int NUMBER_OF_CHILD_VIEWS = 3;
    public static final int NUMBER_OF_EQUATIONS = 9;
    public static final int NUMBER_OF_LAYOUTS = 1;
    public static final int NUMBER_OF_ON_MEASURES = 2;
    public static final int NUMBER_OF_SIMPLE_EQUATIONS = 10;
    public static final int NUMBER_OF_VARIABLES = 8;
    private static final String WORD_PAD = new String(new char[25]).replace((char) 0, ' ');
    public ConstraintLayout mConstraintLayout;
    private final Metrics mMetrics;

    public ConstraintLayoutStatistics(ConstraintLayout constraintLayout) {
        this.mMetrics = new Metrics();
        attach(constraintLayout);
    }

    private String compare(DecimalFormat decimalFormat, ConstraintLayoutStatistics constraintLayoutStatistics, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3178d89", new Object[]{this, decimalFormat, constraintLayoutStatistics, new Integer(i)});
        }
        String str = fmt(decimalFormat, ((float) getValue(i)) * 1.0E-6f, 7) + " -> " + fmt(decimalFormat, ((float) constraintLayoutStatistics.getValue(i)) * 1.0E-6f, 7) + "ms";
        String str2 = WORD_PAD + geName(i);
        return "CL Perf: " + (str2.substring(str2.length() - MAX_WORD) + " = ") + str;
    }

    private String fmt(DecimalFormat decimalFormat, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ffbb7e3", new Object[]{this, decimalFormat, new Float(f), new Integer(i)});
        }
        String str = new String(new char[i]).replace((char) 0, ' ') + decimalFormat.format(f);
        return str.substring(str.length() - i);
    }

    private void log(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            return;
        }
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        StringBuilder sb = new StringBuilder("CL Perf: --------  Performance .(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(")  ------ ");
        DecimalFormat decimalFormat = new DecimalFormat("###.000");
        log(decimalFormat, 5);
        log(decimalFormat, 7);
        log(decimalFormat, 6);
        log(1);
        log(2);
        log(3);
        log(4);
        log(8);
        log(9);
        log(10);
    }

    public void attach(ConstraintLayout constraintLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d95925", new Object[]{this, constraintLayout});
            return;
        }
        constraintLayout.fillMetrics(this.mMetrics);
        this.mConstraintLayout = constraintLayout;
    }

    public void detach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b39a9a", new Object[]{this});
            return;
        }
        ConstraintLayout constraintLayout = this.mConstraintLayout;
        if (constraintLayout != null) {
            constraintLayout.fillMetrics(null);
        }
    }

    public String geName(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d6ef88d", new Object[]{this, new Integer(i)});
        }
        switch (i) {
            case 1:
                return "NumberOfLayouts";
            case 2:
                return "MeasureCalls";
            case 3:
                return "ChildCount";
            case 4:
                return "ChildrenMeasures";
            case 5:
                return "MeasuresWidgetsDuration ";
            case 6:
                return "MeasureDuration";
            case 7:
                return "MeasuresLayoutDuration";
            case 8:
                return "SolverVariables";
            case 9:
                return "SolverEquations";
            case 10:
                return "SimpleEquations";
            default:
                return "";
        }
    }

    public long getValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6535e475", new Object[]{this, new Integer(i)})).longValue();
        }
        switch (i) {
            case 1:
                return this.mMetrics.mNumberOfLayouts;
            case 2:
                return this.mMetrics.mMeasureCalls;
            case 3:
                return this.mMetrics.mChildCount;
            case 4:
                return this.mMetrics.mNumberOfMeasures;
            case 5:
                return this.mMetrics.measuresWidgetsDuration;
            case 6:
                return this.mMetrics.mMeasureDuration;
            case 7:
                return this.mMetrics.measuresLayoutDuration;
            case 8:
                return this.mMetrics.mVariables;
            case 9:
                return this.mMetrics.mEquations;
            case 10:
                return this.mMetrics.mSimpleEquations;
            default:
                return 0L;
        }
    }

    public void logSummary(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a78a44d3", new Object[]{this, str});
        } else {
            log(str);
        }
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.mMetrics.reset();
        }
    }

    public ConstraintLayoutStatistics clone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConstraintLayoutStatistics) ipChange.ipc$dispatch("adbd0522", new Object[]{this}) : new ConstraintLayoutStatistics(this);
    }

    public void logSummary(String str, ConstraintLayoutStatistics constraintLayoutStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fe9719b", new Object[]{this, str, constraintLayoutStatistics});
        } else if (constraintLayoutStatistics == null) {
            log(str);
        } else {
            DecimalFormat decimalFormat = new DecimalFormat("###.000");
            StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
            StringBuilder sb = new StringBuilder("CL Perf: -=  Performance .(");
            sb.append(stackTraceElement.getFileName());
            sb.append(":");
            sb.append(stackTraceElement.getLineNumber());
            sb.append(")  =- ");
            compare(decimalFormat, constraintLayoutStatistics, 5);
            compare(decimalFormat, constraintLayoutStatistics, 7);
            compare(decimalFormat, constraintLayoutStatistics, 6);
            compare(constraintLayoutStatistics, 1);
            compare(constraintLayoutStatistics, 2);
            compare(constraintLayoutStatistics, 3);
            compare(constraintLayoutStatistics, 4);
            compare(constraintLayoutStatistics, 8);
            compare(constraintLayoutStatistics, 9);
            compare(constraintLayoutStatistics, 10);
        }
    }

    public ConstraintLayoutStatistics(ConstraintLayoutStatistics constraintLayoutStatistics) {
        Metrics metrics = new Metrics();
        this.mMetrics = metrics;
        metrics.copy(constraintLayoutStatistics.mMetrics);
    }

    private String compare(ConstraintLayoutStatistics constraintLayoutStatistics, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c94d199f", new Object[]{this, constraintLayoutStatistics, new Integer(i)});
        }
        String str = getValue(i) + " -> " + constraintLayoutStatistics.getValue(i);
        String str2 = WORD_PAD + geName(i);
        return "CL Perf: " + (str2.substring(str2.length() - MAX_WORD) + " = ") + str;
    }

    private String log(DecimalFormat decimalFormat, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17519380", new Object[]{this, decimalFormat, new Integer(i)});
        }
        String fmt = fmt(decimalFormat, ((float) getValue(i)) * 1.0E-6f, 7);
        String str = WORD_PAD + geName(i);
        return "CL Perf: " + (str.substring(str.length() - MAX_WORD) + " = ") + fmt;
    }

    private String log(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("569bb108", new Object[]{this, new Integer(i)});
        }
        String l = Long.toString(getValue(i));
        String str = WORD_PAD + geName(i);
        return "CL Perf: " + (str.substring(str.length() - MAX_WORD) + " = ") + l;
    }
}
