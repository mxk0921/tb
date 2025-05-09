package tb;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fjv extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_KEY_NEED_MERGE = "needMerge";
    public static final String FIELD_KEY_UPDATE_FIELDS = "updateFields";
    public final Handler j = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b8v f19346a;
        public final /* synthetic */ ArrayList b;

        public a(b8v b8vVar, ArrayList arrayList) {
            this.f19346a = b8vVar;
            this.b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.f19346a.n().e(this.b);
            } catch (Throwable th) {
                ldv.e(null, "UpdateComponentV2Subscr", "refreshComponents-error = " + th.getMessage(), null);
            }
        }
    }

    static {
        t2o.a(614465571);
    }

    public static /* synthetic */ Object ipc$super(fjv fjvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/ext/UpdateComponentV2Subscriber");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "-8746045296934679719";
    }

    public final void J(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba3b717b", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        for (String str : jSONObject2.keySet()) {
            Object obj = jSONObject.get(str);
            Object obj2 = jSONObject2.get(str);
            if (obj instanceof JSONObject) {
                if (obj2 instanceof JSONObject) {
                    J((JSONObject) obj, (JSONObject) obj2);
                }
            } else if (!(obj instanceof JSONArray)) {
                jSONObject.put(str, obj2);
            } else if (obj2 instanceof JSONArray) {
                ((JSONArray) obj).addAll((JSONArray) obj2);
            }
        }
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
        } else if (E(b8vVar) == null || !(E(b8vVar).get("updateFields") instanceof JSONObject) || b8vVar.d() == null || b8vVar.d().getFields() == null) {
            uj8.a("UpdateComponentV2Subscr", "onHandleEventChain", "");
        } else {
            if ("false".equals(E(b8vVar).getString(FIELD_KEY_NEED_MERGE))) {
                b8vVar.d().getFields().clear();
            }
            if (ycv.a(b8vVar.n().getBizName())) {
                JSONObject fields = b8vVar.d().getFields();
                JSONObject jSONObject = E(b8vVar).getJSONObject("updateFields");
                if (fields != null && jSONObject != null) {
                    for (String str : jSONObject.keySet()) {
                        if (!fields.containsKey(str)) {
                            Object obj = jSONObject.get(str);
                            if (obj instanceof JSONObject) {
                                fields.put(str, (Object) new JSONObject());
                            } else if (obj instanceof JSONArray) {
                                fields.put(str, (Object) new JSONArray());
                            }
                        }
                    }
                    J(b8vVar.d().getFields(), E(b8vVar).getJSONObject("updateFields"));
                } else {
                    return;
                }
            } else {
                axf.c(b8vVar.d().getFields(), E(b8vVar).getJSONObject("updateFields"));
            }
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(b8vVar.d());
            if (wbl.a()) {
                b8vVar.n().e(arrayList);
            } else {
                this.j.post(new a(b8vVar, arrayList));
            }
        }
    }
}
