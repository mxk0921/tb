package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.behavior.data.Data;
import com.ut.mini.behavior.data.LogicalType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class lq8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, qa2> f23509a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final lq8 f23510a = new lq8();

        static {
            t2o.a(962593242);
        }

        public static /* synthetic */ lq8 access$100() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (lq8) ipChange.ipc$dispatch("4599b7e2", new Object[0]);
            }
            return f23510a;
        }
    }

    static {
        t2o.a(962593240);
    }

    public static lq8 getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lq8) ipChange.ipc$dispatch("3ca9353c", new Object[0]);
        }
        return b.access$100();
    }

    public final Map<String, qa2> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("81177b2e", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        jh8 jh8Var = new jh8();
        hashMap.put(jh8Var.getOperatorSymbol(), jh8Var);
        y7k y7kVar = new y7k();
        hashMap.put(y7kVar.getOperatorSymbol(), y7kVar);
        sja sjaVar = new sja();
        hashMap.put(sjaVar.getOperatorSymbol(), sjaVar);
        uja ujaVar = new uja();
        hashMap.put(ujaVar.getOperatorSymbol(), ujaVar);
        ymg ymgVar = new ymg();
        hashMap.put(ymgVar.getOperatorSymbol(), ymgVar);
        ang angVar = new ang();
        hashMap.put(angVar.getOperatorSymbol(), angVar);
        mak makVar = new mak();
        hashMap.put(makVar.getOperatorSymbol(), makVar);
        mse mseVar = new mse();
        hashMap.put(mseVar.getOperatorSymbol(), mseVar);
        g3k g3kVar = new g3k();
        hashMap.put(g3kVar.getOperatorSymbol(), g3kVar);
        da8 da8Var = new da8();
        hashMap.put(da8Var.getOperatorSymbol(), da8Var);
        frj frjVar = new frj();
        hashMap.put(frjVar.getOperatorSymbol(), frjVar);
        return hashMap;
    }

    public final boolean b(Data data, Map<String, String> map) {
        qa2 qa2Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("927a2c26", new Object[]{this, data, map})).booleanValue();
        }
        if (data == null || map == null || (qa2Var = this.f23509a.get(data.operator)) == null) {
            return false;
        }
        return qa2Var.apply(map.get(oq6.getInstance().getDataKey(data.key)), data.value);
    }

    public final boolean c(Data data, v0v v0vVar) {
        qa2 qa2Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d72f5f9d", new Object[]{this, data, v0vVar})).booleanValue();
        }
        if (data == null || v0vVar == null || (qa2Var = this.f23509a.get(data.operator)) == null) {
            return false;
        }
        return qa2Var.apply(v0vVar.get(oq6.getInstance().getDataKey(data.key)), data.value);
    }

    public boolean evaluateData(Data data, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b78e8f8", new Object[]{this, data, map})).booleanValue();
        }
        if (data == null || map == null) {
            return false;
        }
        List<Data> list = data.dataList;
        if (list == null) {
            return b(data, map);
        }
        String str = data.operator;
        if (str == null) {
            str = LogicalType.AND.getValue();
        }
        if (str.equalsIgnoreCase(LogicalType.AND.getValue())) {
            for (Data data2 : list) {
                if (!evaluateData(data2, map)) {
                    return false;
                }
            }
            return true;
        }
        if (str.equalsIgnoreCase(LogicalType.OR.getValue())) {
            for (Data data3 : list) {
                if (evaluateData(data3, map)) {
                    return true;
                }
            }
        }
        return false;
    }

    public lq8() {
        this.f23509a = a();
    }

    public boolean evaluateData(Data data, v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b20db6ef", new Object[]{this, data, v0vVar})).booleanValue();
        }
        if (data == null || v0vVar == null) {
            return false;
        }
        List<Data> list = data.dataList;
        if (list == null) {
            return c(data, v0vVar);
        }
        String str = data.operator;
        if (str == null) {
            str = LogicalType.AND.getValue();
        }
        if (str.equalsIgnoreCase(LogicalType.AND.getValue())) {
            for (Data data2 : list) {
                if (!evaluateData(data2, v0vVar)) {
                    return false;
                }
            }
            return true;
        }
        if (str.equalsIgnoreCase(LogicalType.OR.getValue())) {
            for (Data data3 : list) {
                if (evaluateData(data3, v0vVar)) {
                    return true;
                }
            }
        }
        return false;
    }
}
