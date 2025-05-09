package tb;

import android.text.TextUtils;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.evo.internal.database.ExperimentDO;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.bucketing.expression.Expression;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentTrack;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class mwa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f24345a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public Expression h;
    public final List<ExperimentTrack> i;
    public final Map<String, String> j;

    static {
        t2o.a(961544345);
    }

    public mwa(ExperimentV5 experimentV5, do8 do8Var) {
        this.d = 0L;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        this.j = new HashMap();
        this.f24345a = experimentV5.getKey();
        this.b = experimentV5.getId();
        this.c = experimentV5.getReleaseId();
        this.g = experimentV5.getCondition();
        this.e = experimentV5.getBeginTime();
        this.f = experimentV5.getEndTime();
        if (do8Var != null && do8Var.e().size() == 1 && do8Var.e().get(0) != null && do8Var.e().get(0).getGroups().size() == 1) {
            this.d = do8Var.e().get(0).getGroups().get(0).getId();
        }
        if (experimentV5.getTracks() != null) {
            arrayList.addAll(experimentV5.getTracks());
        }
        for (String str : experimentV5.getSwitchSet()) {
            if (!TextUtils.isEmpty(str)) {
                a(str, n(do8Var, str));
            }
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c39d68d", new Object[]{this, str, str2});
        } else {
            this.j.put(str, str2);
        }
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdedbf74", new Object[]{this, str})).booleanValue();
        }
        return this.j.containsKey(str);
    }

    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c1f88db", new Object[]{this})).longValue();
        }
        return this.e;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f8db1b4", new Object[]{this});
        }
        return this.g;
    }

    public Expression e() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Expression) ipChange.ipc$dispatch("4ddc1ea", new Object[]{this});
        }
        if (this.h == null && (str = this.g) != null) {
            this.h = (Expression) uwf.a(str, Expression.class);
        }
        return this.h;
    }

    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("250d18d", new Object[]{this})).longValue();
        }
        return this.f;
    }

    public long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f5069a3f", new Object[]{this})).longValue();
        }
        return this.d;
    }

    public long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ddaaf0c", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return this.f24345a;
    }

    public long j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6756fb47", new Object[]{this})).longValue();
        }
        return this.c;
    }

    public List<ExperimentTrack> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("26216a2", new Object[]{this});
        }
        return this.i;
    }

    public Map<String, String> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2cb254a2", new Object[]{this});
        }
        return new HashMap(this.j);
    }

    public String m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75711c32", new Object[]{this, str});
        }
        return this.j.get(str);
    }

    public final String n(do8 do8Var, String str) {
        Map<String, String> g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3152c779", new Object[]{this, do8Var, str});
        }
        if (do8Var == null || (g = do8Var.g()) == null) {
            return "null";
        }
        return g.get(str);
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c26b5357", new Object[]{this})).booleanValue();
        }
        if (this.e == 0 || this.f == 0) {
            return false;
        }
        return true;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("660c8e85", new Object[]{this})).booleanValue();
        }
        if (this.j.size() > 0) {
            return true;
        }
        return false;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4d9f781", new Object[]{this})).booleanValue();
        }
        if (this.d != 0) {
            return true;
        }
        return false;
    }

    public final long r(Long l, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90414231", new Object[]{this, l, new Long(j)})).longValue();
        }
        if (l == null) {
            return j;
        }
        return l.longValue();
    }

    public void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b06c2d6e", new Object[]{this, str});
        } else {
            this.f24345a = str;
        }
    }

    public String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d4e3785", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (Object) Long.valueOf(this.b));
        jSONObject.put("releaseId", (Object) Long.valueOf(this.c));
        jSONObject.put("groupId", (Object) Long.valueOf(this.d));
        jSONObject.put("condition", (Object) this.g);
        jSONObject.put("beginTime", (Object) Long.valueOf(this.e));
        jSONObject.put("endTime", (Object) Long.valueOf(this.f));
        JSONArray jSONArray = new JSONArray();
        for (ExperimentTrack experimentTrack : this.i) {
            jSONArray.add(experimentTrack.toJsonString());
        }
        if (this.i.size() > 0) {
            jSONObject.put(ExperimentDO.COLUMN_TRACKS, (Object) jSONArray);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, String> entry : this.j.entrySet()) {
            jSONObject2.put(entry.getKey(), (Object) entry.getValue());
        }
        jSONObject.put(kva.SERIALIZE_EXP_VARIATIONS, (Object) jSONObject2);
        return jSONObject.toJSONString().replace("\"", "'");
    }

    public final String u(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c3aabe7", new Object[]{this, obj});
        }
        if (obj == null) {
            return null;
        }
        String obj2 = obj.toString();
        if (TextUtils.equals("true", obj2)) {
            return "true";
        }
        return TextUtils.equals("false", obj2) ? "false" : obj2;
    }

    public mwa(String str) {
        this.d = 0L;
        this.i = new ArrayList();
        this.j = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            JSONObject parseObject = JSON.parseObject(str);
            this.b = parseObject.getLong("id").longValue();
            this.c = parseObject.getLong("releaseId").longValue();
            this.d = parseObject.getLong("groupId").longValue();
            this.e = r(parseObject.getLong("beginTime"), 0L);
            this.f = r(parseObject.getLong("endTime"), 0L);
            this.g = parseObject.getString("condition");
            JSONArray jSONArray = parseObject.getJSONArray(ExperimentDO.COLUMN_TRACKS);
            if (jSONArray != null) {
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        ((ArrayList) this.i).add(new ExperimentTrack((JSONObject) next));
                    }
                }
            }
            for (Map.Entry<String, Object> entry : parseObject.getJSONObject(kva.SERIALIZE_EXP_VARIATIONS).entrySet()) {
                ((HashMap) this.j).put(entry.getKey(), u(entry.getValue()));
            }
        }
    }
}
