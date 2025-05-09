package tb;

import com.alibaba.appmonitor.model.Metric;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureValue;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class u08 extends ej8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Long l = 300000L;
    public Metric g;
    public MeasureValueSet h;
    public DimensionValueSet i;
    public Map<String, MeasureValue> j;
    public Long k;

    static {
        t2o.a(962593031);
    }

    public static /* synthetic */ Object ipc$super(u08 u08Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1275793840) {
            super.clean();
            return null;
        } else if (hashCode == -418211225) {
            super.fill((Object[]) objArr[0]);
            return null;
        } else if (hashCode == 1724855933) {
            u08Var.a((Long) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/appmonitor/event/DurationEvent");
        }
    }

    public void c(DimensionValueSet dimensionValueSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a1a82f2", new Object[]{this, dimensionValueSet});
            return;
        }
        DimensionValueSet dimensionValueSet2 = this.i;
        if (dimensionValueSet2 == null) {
            this.i = dimensionValueSet;
        } else {
            dimensionValueSet2.addValues(dimensionValueSet);
        }
    }

    @Override // tb.ej8, tb.rbo
    public void clean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f4ee50", new Object[]{this});
            return;
        }
        super.clean();
        this.g = null;
        this.k = null;
        for (MeasureValue measureValue : ((HashMap) this.j).values()) {
            to1.a().c(measureValue);
        }
        ((HashMap) this.j).clear();
        if (this.h != null) {
            to1.a().c(this.h);
            this.h = null;
        }
        if (this.i != null) {
            to1.a().c(this.i);
            this.i = null;
        }
    }

    public DimensionValueSet e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DimensionValueSet) ipChange.ipc$dispatch("f11fbae6", new Object[]{this});
        }
        return this.i;
    }

    public MeasureValueSet f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeasureValueSet) ipChange.ipc$dispatch("2a3f44f6", new Object[]{this});
        }
        return this.h;
    }

    @Override // tb.ej8, tb.rbo
    public void fill(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7129a67", new Object[]{this, objArr});
            return;
        }
        super.fill(objArr);
        if (this.j == null) {
            this.j = new HashMap();
        }
        Metric c = lti.d().c(this.f18612a, this.b);
        this.g = c;
        if (c.getDimensionSet() != null) {
            this.i = (DimensionValueSet) to1.a().d(DimensionValueSet.class, new Object[0]);
            this.g.getDimensionSet().setConstantValue(this.i);
        }
        this.h = (MeasureValueSet) to1.a().d(MeasureValueSet.class, new Object[0]);
    }

    public boolean g() {
        double d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a65eada6", new Object[]{this})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        List<Measure> measures = this.g.getMeasureSet().getMeasures();
        if (measures != null) {
            int size = measures.size();
            for (int i = 0; i < size; i++) {
                Measure measure = measures.get(i);
                if (measure != null) {
                    if (measure.getMax() != null) {
                        d = measure.getMax().doubleValue();
                    } else {
                        d = l.longValue();
                    }
                    MeasureValue measureValue = (MeasureValue) ((HashMap) this.j).get(measure.getName());
                    if (measureValue != null && !measureValue.isFinish() && currentTimeMillis - measureValue.getValue() > d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a37a973", new Object[]{this, str});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (((HashMap) this.j).isEmpty()) {
            this.k = Long.valueOf(currentTimeMillis);
        }
        ((HashMap) this.j).put(str, (MeasureValue) to1.a().d(MeasureValue.class, Double.valueOf(currentTimeMillis), Double.valueOf(currentTimeMillis - this.k.longValue())));
        a(null);
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41f4dd30", new Object[]{this, str})).booleanValue();
        }
        MeasureValue measureValue = (MeasureValue) ((HashMap) this.j).get(str);
        if (measureValue != null) {
            double currentTimeMillis = System.currentTimeMillis();
            nhh.f("DurationEvent", "statEvent consumeTime. module:", this.f18612a, " monitorPoint:", this.b, " measureName:", str, " time:", Double.valueOf(currentTimeMillis - measureValue.getValue()));
            measureValue.setValue(currentTimeMillis - measureValue.getValue());
            measureValue.setFinish(true);
            this.h.setValue(str, measureValue);
            if (this.g.getMeasureSet().valid(this.h)) {
                return true;
            }
        }
        a(null);
        return false;
    }
}
