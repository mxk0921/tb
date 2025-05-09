package android.taobao.windvane.extra.storage.strategy;

import android.taobao.windvane.jsbridge.api.WVDevelopTool;
import android.taobao.windvane.util.DeviceUtils;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.b2c;
import tb.ka8;
import tb.pa8;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FccStrategy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEVICE_LEVEL_VARIABLE = "DL";
    private static final String OR_SEPARATOR = ",";
    private static final String RANGE_SEPARATOR = "_";
    private static final String TAG = "WindVane/FccStrategy";
    private static final Map<ConditionOperation, ConditionOperator> sOperatorMap;
    public b2c scheduleGrade = pa8.c().f();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Condition {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Map<String, Object> environment;
        public String expression;
        public ConditionOperation operation;
        public ConditionValue value;
        public String variable;

        static {
            t2o.a(989856028);
        }

        public Condition(String str, ConditionOperation conditionOperation, ConditionValue conditionValue, String str2) {
            this.variable = str;
            this.operation = conditionOperation;
            this.value = conditionValue;
            this.expression = str2;
        }

        public boolean checkValid() {
            ConditionValue conditionValue;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2b6d1a5f", new Object[]{this})).booleanValue();
            }
            if (!TextUtils.isEmpty(this.variable) && FccStrategy.access$000().containsKey(this.operation) && (conditionValue = this.value) != null && conditionValue.checkValid()) {
                return true;
            }
            return false;
        }

        public boolean evaluate() {
            Object obj;
            ConditionOperator conditionOperator;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("17f03ca4", new Object[]{this})).booleanValue();
            }
            Map<String, Object> map = this.environment;
            if (map == null || (obj = map.get(this.variable)) == null || (conditionOperator = (ConditionOperator) FccStrategy.access$000().get(this.operation)) == null || !conditionOperator.evaluate(this.value, obj)) {
                return false;
            }
            return true;
        }

        public void setEnvironment(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3928402d", new Object[]{this, map});
            } else {
                this.environment = map;
            }
        }

        public void setExpression(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("551003ab", new Object[]{this, str});
            } else {
                this.expression = str;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ConditionEqualOperator implements ConditionOperator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(989856029);
            t2o.a(989856031);
        }

        @Override // android.taobao.windvane.extra.storage.strategy.FccStrategy.ConditionOperator
        public boolean evaluate(ConditionValue conditionValue, Object obj) {
            ConditionValueRange conditionValueRange;
            Float parseAsFloat;
            Float parseAsFloat2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ac5d6cfb", new Object[]{this, conditionValue, obj})).booleanValue();
            }
            ConditionValueType conditionValueType = conditionValue.valueType;
            if (conditionValueType == ConditionValueType.STRING) {
                if (obj == null || !TextUtils.equals(String.valueOf(obj), conditionValue.valueString)) {
                    return false;
                }
                return true;
            } else if (conditionValueType == ConditionValueType.NUMBER) {
                if (!(obj == null || conditionValue.valueNumber == null)) {
                    if (obj instanceof Number) {
                        if (((Number) obj).floatValue() == conditionValue.valueNumber.floatValue()) {
                            return true;
                        }
                        return false;
                    } else if (!(obj instanceof String) || (parseAsFloat2 = FccStrategy.parseAsFloat((String) obj)) == null || conditionValue.valueNumber.compareTo(parseAsFloat2) != 0) {
                        return false;
                    } else {
                        return true;
                    }
                }
                return false;
            } else {
                if (!(conditionValueType != ConditionValueType.RANGE || obj == null || (conditionValueRange = conditionValue.valueRange) == null)) {
                    if (obj instanceof Number) {
                        return conditionValueRange.isInRange(((Number) obj).floatValue());
                    }
                    if (!(obj instanceof String) || (parseAsFloat = FccStrategy.parseAsFloat((String) obj)) == null || !conditionValue.valueRange.isInRange(parseAsFloat.floatValue())) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum ConditionOperation {
        EQUAL("=");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final String operationName;

        ConditionOperation(String str) {
            this.operationName = str;
        }

        public static /* synthetic */ Object ipc$super(ConditionOperation conditionOperation, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/storage/strategy/FccStrategy$ConditionOperation");
        }

        public static ConditionOperation valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ConditionOperation) ipChange.ipc$dispatch("e1ff7b6e", new Object[]{str});
            }
            return (ConditionOperation) Enum.valueOf(ConditionOperation.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface ConditionOperator {
        boolean evaluate(ConditionValue conditionValue, Object obj);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ConditionValue {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Float valueNumber;
        public ConditionValueRange valueRange;
        public String valueString;
        public ConditionValueType valueType;

        static {
            t2o.a(989856032);
        }

        public ConditionValue(ConditionValueType conditionValueType) {
            this.valueType = conditionValueType;
        }

        public boolean checkValid() {
            ConditionValueRange conditionValueRange;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2b6d1a5f", new Object[]{this})).booleanValue();
            }
            ConditionValueType conditionValueType = this.valueType;
            if (conditionValueType == ConditionValueType.STRING) {
                return !TextUtils.isEmpty(this.valueString);
            }
            if (conditionValueType == ConditionValueType.NUMBER) {
                if (this.valueNumber != null) {
                    return true;
                }
                return false;
            } else if (conditionValueType != ConditionValueType.RANGE || (conditionValueRange = this.valueRange) == null || !conditionValueRange.checkValid()) {
                return false;
            } else {
                return true;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum ConditionValueType {
        STRING,
        RANGE,
        NUMBER;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ConditionValueType conditionValueType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/storage/strategy/FccStrategy$ConditionValueType");
        }

        public static ConditionValueType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ConditionValueType) ipChange.ipc$dispatch("5af1b90a", new Object[]{str});
            }
            return (ConditionValueType) Enum.valueOf(ConditionValueType.class, str);
        }
    }

    static {
        t2o.a(989856027);
        HashMap hashMap = new HashMap();
        sOperatorMap = hashMap;
        hashMap.put(ConditionOperation.EQUAL, new ConditionEqualOperator());
    }

    public static /* synthetic */ Map access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c8ee3d6c", new Object[0]);
        }
        return sOperatorMap;
    }

    private Map<String, Object> getEnvironment() {
        Map<String, Integer> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d1657a19", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        b2c b2cVar = this.scheduleGrade;
        if (!(b2cVar == null || (c = ((ka8) b2cVar).c()) == null)) {
            hashMap.putAll(c);
        }
        hashMap.put(DEVICE_LEVEL_VARIABLE, Integer.valueOf(DeviceUtils.c()));
        Map<String, Object> mockL2Info = WVDevelopTool.getMockL2Info();
        if (mockL2Info != null) {
            hashMap.putAll(mockL2Info);
        }
        return hashMap;
    }

    public static Float parseAsFloat(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("2168b6b1", new Object[]{str});
        }
        try {
            return Float.valueOf(Float.parseFloat(str));
        } catch (Exception unused) {
            return null;
        }
    }

    private Condition parseCondition(String str) {
        ConditionValue conditionValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Condition) ipChange.ipc$dispatch("a9b64ae1", new Object[]{this, str});
        }
        ConditionOperation conditionOperation = new ConditionOperation[]{ConditionOperation.EQUAL}[0];
        String[] split = str.split(conditionOperation.operationName);
        if (split.length != 2) {
            return null;
        }
        String trim = split[0].trim();
        String trim2 = split[1].trim();
        String[] split2 = trim2.split("_", -1);
        if (split2.length == 2) {
            String trim3 = split2[0].trim();
            String trim4 = split2[1].trim();
            Float parseAsFloat = parseAsFloat(trim3);
            Float parseAsFloat2 = parseAsFloat(trim4);
            conditionValue = new ConditionValue(ConditionValueType.RANGE);
            conditionValue.valueRange = new ConditionValueRange(parseAsFloat, parseAsFloat2);
        } else {
            Float parseAsFloat3 = parseAsFloat(trim2);
            if (parseAsFloat3 != null) {
                conditionValue = new ConditionValue(ConditionValueType.NUMBER);
                conditionValue.valueNumber = parseAsFloat3;
            } else {
                conditionValue = new ConditionValue(ConditionValueType.STRING);
                conditionValue.valueString = trim2;
            }
        }
        return new Condition(trim, conditionOperation, conditionValue, str);
    }

    public boolean useFccStrategyCache(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd60c65", new Object[]{this, str})).booleanValue();
        }
        return evaluateConditions(parseExpression(str));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ConditionValueRange {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Float left;
        public Float right;

        static {
            t2o.a(989856033);
        }

        public ConditionValueRange(Float f, Float f2) {
            this.left = f;
            this.right = f2;
        }

        public boolean checkValid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2b6d1a5f", new Object[]{this})).booleanValue();
            }
            Float f = this.left;
            if (f == null && this.right == null) {
                return false;
            }
            if (f == null || this.right == null || f.floatValue() <= this.right.floatValue()) {
                return true;
            }
            return false;
        }

        public boolean isInRange(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fc8cea4f", new Object[]{this, new Float(f)})).booleanValue();
            }
            Float f2 = this.left;
            if (f2 != null && this.right != null) {
                return f >= f2.floatValue() && f <= this.right.floatValue();
            }
            Float f3 = this.right;
            return f3 != null ? f <= f3.floatValue() : f2 != null && f >= f2.floatValue();
        }
    }

    private List<Condition> parseExpression(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d6f5bccb", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        for (String str2 : str.split(",")) {
            Condition parseCondition = parseCondition(str2);
            if (parseCondition != null && parseCondition.checkValid()) {
                arrayList.add(parseCondition);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean evaluateConditions(java.util.List<android.taobao.windvane.extra.storage.strategy.FccStrategy.Condition> r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = android.taobao.windvane.extra.storage.strategy.FccStrategy.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "1407b52d"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            if (r6 == 0) goto L_0x0088
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L_0x0025
            goto L_0x0088
        L_0x0025:
            java.util.Map r2 = r5.getEnvironment()
            java.util.Iterator r6 = r6.iterator()
        L_0x002d:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x0045
            java.lang.Object r3 = r6.next()
            android.taobao.windvane.extra.storage.strategy.FccStrategy$Condition r3 = (android.taobao.windvane.extra.storage.strategy.FccStrategy.Condition) r3
            r3.setEnvironment(r2)
            boolean r4 = r3.evaluate()
            if (r4 == 0) goto L_0x002d
            java.lang.String r6 = r3.expression
            goto L_0x0047
        L_0x0045:
            r6 = 0
            r0 = 0
        L_0x0047:
            int r1 = r2.size()
            r3 = 15
            if (r1 >= r3) goto L_0x0054
            java.lang.String r1 = com.alibaba.fastjson.JSON.toJSONString(r2)     // Catch: Exception -> 0x0054
            goto L_0x0057
        L_0x0054:
            java.lang.String r1 = "size exceeds 15, not show"
        L_0x0057:
            com.taobao.android.riverlogger.RVLLevel r2 = com.taobao.android.riverlogger.RVLLevel.Info
            java.lang.String r3 = "WindVane/FccStrategy"
            tb.icn r2 = tb.lcn.a(r2, r3)
            java.lang.String r3 = "evaluate"
            tb.icn r2 = r2.j(r3)
            java.lang.String r3 = "environment"
            tb.icn r1 = r2.a(r3, r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r3 = "result"
            tb.icn r1 = r1.a(r3, r2)
            if (r6 == 0) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            java.lang.String r6 = ""
        L_0x007d:
            java.lang.String r2 = "matchedExpression"
            tb.icn r6 = r1.a(r2, r6)
            r6.f()
            return r0
        L_0x0088:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.storage.strategy.FccStrategy.evaluateConditions(java.util.List):boolean");
    }
}
