package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.async.AsyncProcessor;
import com.taobao.android.detail.ttdetail.async.a;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ag0 implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "adjustState";
    public static final String KEY_BE_REPLACED = "beReplaced";
    public static final String KEY_PAYLOAD = "payload";
    public static final String KEY_TARGET_REPLACEMENT = "targetReplacement";
    public static final String KEY_TO_REPLACE = "toReplace";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912261842);
        }

        public b() {
        }

        public String a(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b67e1077", new Object[]{this, str, jSONObject});
            }
            if (jSONObject == null) {
                return str;
            }
            String string = jSONObject.getString(ag0.KEY_BE_REPLACED);
            String string2 = jSONObject.getString(ag0.KEY_TO_REPLACE);
            return (string == null || string2 == null) ? str : str.replace(string, string2);
        }

        public abstract List<a.b> b(JSONObject jSONObject);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public b f15721a;
        public final oa4 b;
        public final JSONObject c;

        static {
            t2o.a(912261843);
        }

        public c(oa4 oa4Var, JSONObject jSONObject) {
            this.b = oa4Var;
            this.c = jSONObject;
            a();
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4e1cd9d", new Object[]{this});
            } else if (this.c.getJSONObject("writebackRoutes") != null) {
                this.f15721a = new e();
            } else if (this.c.getJSONArray("dataMergeParams") != null) {
                this.f15721a = new d();
            }
        }

        public boolean b() {
            List<a.b> b;
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8a391d8", new Object[]{this})).booleanValue();
            }
            b bVar = this.f15721a;
            if (bVar == null || (b = bVar.b(this.c)) == null || b.isEmpty() || (jSONObject = this.c.getJSONObject("payload")) == null) {
                return false;
            }
            return AsyncProcessor.t(jSONObject, b, this.b.getComponentData());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912261844);
        }

        public d() {
            super();
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/handler/bizhandlers/AdjustStateImplementor$DataMergeAdjustStateParseStrategy");
        }

        @Override // tb.ag0.b
        public List<a.b> b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("41c0cfec", new Object[]{this, jSONObject});
            }
            JSONArray jSONArray = jSONObject.getJSONArray("dataMergeParams");
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject2 = jSONObject.getJSONObject(ag0.KEY_TARGET_REPLACEMENT);
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject jSONObject3 = (JSONObject) next;
                    String string = jSONObject3.getString("sourcePath");
                    String string2 = jSONObject3.getString("targetPath");
                    if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                        String a2 = a(string2, jSONObject2);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("source", (Object) string);
                        jSONObject4.put("target", (Object) a2);
                        arrayList.add(new a.b(jSONObject4));
                    }
                }
            }
            return arrayList;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912261845);
        }

        public e() {
            super();
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/handler/bizhandlers/AdjustStateImplementor$WriteBackAdjustStateParseStrategy");
        }

        @Override // tb.ag0.b
        public List<a.b> b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("41c0cfec", new Object[]{this, jSONObject});
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("writebackRoutes");
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject3 = jSONObject.getJSONObject(ag0.KEY_TARGET_REPLACEMENT);
            for (String str : jSONObject2.keySet()) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("source", (Object) str);
                jSONObject4.put("target", (Object) a(jSONObject2.getString(str), jSONObject3));
                arrayList.add(new a.b(jSONObject4));
            }
            return arrayList;
        }
    }

    static {
        t2o.a(912261840);
        t2o.a(912261826);
    }

    public ag0(Context context, ze7 ze7Var) {
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject a2;
        oa4 i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null || (a2 = irVar.a()) == null || (i = yc4.i(runtimeAbilityParamArr)) == null) {
            return false;
        }
        if (new c(i, a2).b()) {
            i.updateComponent();
        }
        return true;
    }
}
