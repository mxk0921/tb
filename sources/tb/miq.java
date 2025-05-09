package tb;

import com.alibaba.appmonitor.model.Metric;
import com.alibaba.appmonitor.pool.ReuseJSONArray;
import com.alibaba.appmonitor.pool.ReuseJSONObject;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureValue;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class miq extends ej8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Metric g;
    public Map<DimensionValueSet, a> h;

    static {
        t2o.a(962593040);
    }

    public static /* synthetic */ Metric c(miq miqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Metric) ipChange.ipc$dispatch("a7c44912", new Object[]{miqVar});
        }
        return miqVar.g;
    }

    public static /* synthetic */ Object ipc$super(miq miqVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1275793840:
                super.clean();
                return null;
            case -418211225:
                super.fill((Object[]) objArr[0]);
                return null;
            case 620746685:
                return super.b();
            case 1724855933:
                miqVar.a((Long) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/appmonitor/event/StatEvent");
        }
    }

    @Override // tb.ej8, tb.rbo
    public synchronized void clean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f4ee50", new Object[]{this});
            return;
        }
        super.clean();
        this.g = null;
        for (DimensionValueSet dimensionValueSet : ((HashMap) this.h).keySet()) {
            to1.a().c(dimensionValueSet);
        }
        ((HashMap) this.h).clear();
    }

    public synchronized void d(DimensionValueSet dimensionValueSet, MeasureValueSet measureValueSet) {
        a aVar;
        boolean z = false;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1819d4d8", new Object[]{this, dimensionValueSet, measureValueSet});
                return;
            }
            if (dimensionValueSet == null) {
                dimensionValueSet = (DimensionValueSet) to1.a().d(DimensionValueSet.class, new Object[0]);
            }
            if (((HashMap) this.h).containsKey(dimensionValueSet)) {
                aVar = (a) ((HashMap) this.h).get(dimensionValueSet);
            } else {
                DimensionValueSet dimensionValueSet2 = (DimensionValueSet) to1.a().d(DimensionValueSet.class, new Object[0]);
                dimensionValueSet2.addValues(dimensionValueSet);
                a aVar2 = new a();
                ((HashMap) this.h).put(dimensionValueSet2, aVar2);
                aVar = aVar2;
            }
            Metric metric = this.g;
            if (metric != null) {
                z = metric.valid(dimensionValueSet, measureValueSet);
            }
            if (z) {
                aVar.f();
                aVar.c(measureValueSet);
            } else {
                aVar.g();
                Metric metric2 = this.g;
                if (metric2 != null && metric2.isCommitDetail()) {
                    aVar.c(measureValueSet);
                }
            }
            a(null);
        }
    }

    @Override // tb.ej8, tb.rbo
    public void fill(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7129a67", new Object[]{this, objArr});
            return;
        }
        super.fill(objArr);
        if (this.h == null) {
            this.h = new HashMap();
        }
        this.g = lti.d().c(this.f18612a, this.b);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f24067a = 0;
        public int b = 0;
        public final List<MeasureValueSet> c = new ArrayList();

        static {
            t2o.a(962593041);
        }

        public a() {
        }

        public static /* synthetic */ int a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("34c5bd52", new Object[]{aVar})).intValue();
            }
            return aVar.f24067a;
        }

        public static /* synthetic */ int b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4ee13bf1", new Object[]{aVar})).intValue();
            }
            return aVar.b;
        }

        public void c(MeasureValueSet measureValueSet) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7956aeef", new Object[]{this, measureValueSet});
            } else if (measureValueSet == null) {
            } else {
                if (miq.c(miq.this) != null && miq.c(miq.this).isCommitDetail()) {
                    ((ArrayList) this.c).add(d(measureValueSet));
                } else if (((ArrayList) this.c).isEmpty()) {
                    MeasureValueSet d = d(measureValueSet);
                    if (!(miq.c(miq.this) == null || miq.c(miq.this).getMeasureSet() == null)) {
                        d.setBuckets(miq.c(miq.this).getMeasureSet().getMeasures());
                    }
                    ((ArrayList) this.c).add(d);
                } else {
                    ((MeasureValueSet) ((ArrayList) this.c).get(0)).merge(measureValueSet);
                }
            }
        }

        public final MeasureValueSet d(MeasureValueSet measureValueSet) {
            List<Measure> measures;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MeasureValueSet) ipChange.ipc$dispatch("a48df817", new Object[]{this, measureValueSet});
            }
            MeasureValueSet measureValueSet2 = (MeasureValueSet) to1.a().d(MeasureValueSet.class, new Object[0]);
            if (!(miq.c(miq.this) == null || miq.c(miq.this).getMeasureSet() == null || (measures = miq.c(miq.this).getMeasureSet().getMeasures()) == null)) {
                int size = measures.size();
                for (int i = 0; i < size; i++) {
                    Measure measure = measures.get(i);
                    if (measure != null) {
                        MeasureValue measureValue = (MeasureValue) to1.a().d(MeasureValue.class, new Object[0]);
                        MeasureValue value = measureValueSet.getValue(measure.getName());
                        if (value.getOffset() != null) {
                            measureValue.setOffset(value.getOffset().doubleValue());
                        }
                        measureValue.setValue(value.getValue());
                        measureValueSet2.setValue(measure.getName(), measureValue);
                    }
                }
            }
            return measureValueSet2;
        }

        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("472a1022", new Object[]{this});
            } else {
                this.f24067a++;
            }
        }

        public void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3304e8ad", new Object[]{this});
            } else {
                this.b++;
            }
        }

        public List<Map<String, Map<String, Object>>> e() {
            Map<String, MeasureValue> map;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("a89b27c8", new Object[]{this});
            }
            List<MeasureValueSet> list = this.c;
            if (list == null || ((ArrayList) list).isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = ((ArrayList) this.c).size();
            for (int i = 0; i < size; i++) {
                MeasureValueSet measureValueSet = (MeasureValueSet) ((ArrayList) this.c).get(i);
                if (!(measureValueSet == null || (map = measureValueSet.getMap()) == null || map.isEmpty())) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<String, MeasureValue> entry : map.entrySet()) {
                        HashMap hashMap2 = new HashMap();
                        String key = entry.getKey();
                        MeasureValue value = entry.getValue();
                        hashMap2.put("value", Double.valueOf(value.getValue()));
                        if (value.getOffset() != null) {
                            hashMap2.put("offset", value.getOffset());
                        }
                        Map<String, Double> buckets = value.getBuckets();
                        if (buckets != null) {
                            hashMap2.put("buckets", buckets);
                        }
                        hashMap.put(key, hashMap2);
                    }
                    arrayList.add(hashMap);
                }
            }
            return arrayList;
        }
    }

    @Override // tb.ej8
    public synchronized JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("24ffd7bd", new Object[]{this});
        }
        JSONObject b = super.b();
        Metric metric = this.g;
        if (metric != null) {
            b.put("isCommitDetail", (Object) String.valueOf(metric.isCommitDetail()));
        }
        JSONArray jSONArray = (JSONArray) to1.a().d(ReuseJSONArray.class, new Object[0]);
        Map<DimensionValueSet, a> map = this.h;
        if (map != null) {
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                JSONObject jSONObject = (JSONObject) to1.a().d(ReuseJSONObject.class, new Object[0]);
                DimensionValueSet dimensionValueSet = (DimensionValueSet) entry.getKey();
                a aVar = (a) entry.getValue();
                Integer valueOf = Integer.valueOf(a.a(aVar));
                Integer valueOf2 = Integer.valueOf(a.b(aVar));
                jSONObject.put("count", (Object) valueOf);
                jSONObject.put("noise", (Object) valueOf2);
                jSONObject.put("dimensions", (Object) (dimensionValueSet != null ? new HashMap(dimensionValueSet.getMap()) : null));
                jSONObject.put("measures", (Object) aVar.e());
                jSONArray.add(jSONObject);
            }
        }
        b.put(pg1.ATOM_values, (Object) jSONArray);
        return b;
    }
}
