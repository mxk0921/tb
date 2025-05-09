package tb;

import android.text.TextUtils;
import com.alibaba.evo.EVOExperimentCondition;
import com.alibaba.ut.abtest.bucketing.expression.Expression;
import com.alibaba.ut.abtest.bucketing.expression.ExpressionCriterion;
import com.alibaba.ut.abtest.bucketing.feature.FeatureType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class mq8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_APP_VERSION = "mtop.appVersion";
    public static final String KEY_CROWD = "service.crowd";
    public static final String KEY_PLATFORM = "mtop.platform";

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f24231a = c();
    public final Set<String> b = b();
    public final Map<String, ra2> c = a();

    static {
        t2o.a(961544278);
    }

    public static Object f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("58cb8715", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if ("mtop.platform".equals(str)) {
            return "android";
        }
        if ("mtop.appVersion".equals(str)) {
            return d3r.c().a();
        }
        if ("device.channel".equals(str)) {
            return d3r.c().b();
        }
        return null;
    }

    public final Map<String, ra2> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("81177b2e", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        kh8 kh8Var = new kh8();
        hashMap.put(kh8Var.b(), kh8Var);
        z7k z7kVar = new z7k();
        hashMap.put(z7kVar.b(), z7kVar);
        tja tjaVar = new tja();
        hashMap.put(tjaVar.b(), tjaVar);
        vja vjaVar = new vja();
        hashMap.put(vjaVar.b(), vjaVar);
        zmg zmgVar = new zmg();
        hashMap.put(zmgVar.b(), zmgVar);
        bng bngVar = new bng();
        hashMap.put(bngVar.b(), bngVar);
        eo4 eo4Var = new eo4();
        hashMap.put(eo4Var.b(), eo4Var);
        svn svnVar = new svn();
        hashMap.put(svnVar.b(), svnVar);
        return hashMap;
    }

    public final Set<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("a47074c3", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        hashSet.add("mtop.platform");
        if (n.j().a().z()) {
            hashSet.add("mtop.appVersion");
        }
        return hashSet;
    }

    public final Set<String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("e6dc5db6", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        hashSet.add("mtop.platform");
        hashSet.add("mtop.appVersion");
        hashSet.add("device.channel");
        hashSet.add(KEY_CROWD);
        return hashSet;
    }

    public boolean d(Expression expression, Map<String, Object> map, long j, long j2, boolean z) {
        List<ExpressionCriterion> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc6c10a9", new Object[]{this, expression, map, new Long(j), new Long(j2), new Boolean(z)})).booleanValue();
        }
        if (expression == null || (list = expression.criterions) == null || list.isEmpty()) {
            return true;
        }
        if (TextUtils.isEmpty(expression.operator)) {
            expression.operator = "$and";
        }
        try {
            return h(expression.operator, expression.criterions, map, j, j2, z);
        } catch (Exception e) {
            ku0.j("ExpressionEvaluator.evaluate", e);
            return false;
        }
    }

    public final String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a205c446", new Object[]{this, str});
        }
        if (TextUtils.equals(str, KEY_CROWD)) {
            return "人群";
        }
        if (TextUtils.equals(str, "mtop.appVersion")) {
            return "应用版本";
        }
        if (TextUtils.equals(str, "device.channel")) {
            return "渠道";
        }
        return TextUtils.equals(str, "mtop.platform") ? "系统平台" : str;
    }

    public final boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("808d1798", new Object[]{this, str})).booleanValue();
        }
        if ("$and".equals(str) || "$or".equals(str)) {
            return true;
        }
        return false;
    }

    public final boolean i(ExpressionCriterion expressionCriterion, Map<String, Object> map) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d07fe6c", new Object[]{this, expressionCriterion, map})).booleanValue();
        }
        if (TextUtils.isEmpty(expressionCriterion.name) || TextUtils.isEmpty(expressionCriterion.operator)) {
            return false;
        }
        if (TextUtils.equals(expressionCriterion.name, "mtop.appName")) {
            return true;
        }
        if (this.f24231a.contains(expressionCriterion.name)) {
            obj = f(expressionCriterion.name);
        } else {
            obj = map != null ? map.get(expressionCriterion.name) : null;
        }
        ogh.e("ExpressionEvaluator", "relationalOperate (" + expressionCriterion.name + "（" + obj + "）" + expressionCriterion.operator + " " + expressionCriterion.value + f7l.BRACKET_END_STR);
        if ("mtop.appVersion".equals(expressionCriterion.name)) {
            if (EVOExperimentCondition.OPERATOR_GREATER_THAN.equals(expressionCriterion.operator)) {
                return j3w.b(obj, expressionCriterion.value);
            }
            if (EVOExperimentCondition.OPERATOR_GREATER_THAN_OR_EQUALS.equals(expressionCriterion.operator)) {
                return j3w.a(obj, expressionCriterion.value) || j3w.b(obj, expressionCriterion.value);
            }
            if ("$lt".equals(expressionCriterion.operator)) {
                if (n.j().a().z()) {
                    return !j3w.b(obj, expressionCriterion.value);
                }
                return !j3w.a(obj, expressionCriterion.value) && !j3w.b(obj, expressionCriterion.value);
            } else if ("$lte".equals(expressionCriterion.operator)) {
                return j3w.a(obj, expressionCriterion.value) || !j3w.b(obj, expressionCriterion.value);
            }
        } else if (KEY_CROWD.equals(expressionCriterion.name)) {
            return n.j().i().a(FeatureType.Crowd, expressionCriterion.value);
        }
        ra2 ra2Var = this.c.get(expressionCriterion.operator);
        return ra2Var != null && ra2Var.a(obj, expressionCriterion.value);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01d7 A[Catch: Exception -> 0x007a, TryCatch #0 {Exception -> 0x007a, blocks: (B:6:0x0046, B:8:0x004e, B:9:0x0052, B:11:0x0058, B:13:0x0066, B:18:0x0090, B:20:0x009c, B:22:0x00a2, B:24:0x00b1, B:26:0x00c5, B:28:0x00cc, B:29:0x00de, B:31:0x00fc, B:34:0x010c, B:36:0x0118, B:38:0x012d, B:40:0x0134, B:42:0x0149, B:44:0x0164, B:46:0x0170, B:48:0x0185, B:50:0x018c, B:52:0x01a1, B:55:0x01c5, B:57:0x01cd, B:58:0x01d1, B:60:0x01d7, B:62:0x01e5, B:66:0x01fc), top: B:72:0x0046 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(java.lang.String r19, java.util.List<com.alibaba.ut.abtest.bucketing.expression.ExpressionCriterion> r20, java.util.Map<java.lang.String, java.lang.Object> r21, long r22, long r24, boolean r26) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mq8.h(java.lang.String, java.util.List, java.util.Map, long, long, boolean):boolean");
    }
}
