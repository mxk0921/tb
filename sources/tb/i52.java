package tb;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class i52 extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_KEY_UPDATE_FIELDS = "updateFields";
    public final Handler j = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b8v f21097a;
        public final /* synthetic */ ArrayList b;

        public a(b8v b8vVar, ArrayList arrayList) {
            this.f21097a = b8vVar;
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
                this.f21097a.n().e(this.b);
            } catch (Throwable th) {
                ldv.e(null, "batchUpdateComponentV2Subscriber", "BatchUpdateComponent-error = " + th.getMessage(), null);
            }
        }
    }

    static {
        t2o.a(614465749);
    }

    public static /* synthetic */ Object ipc$super(i52 i52Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/subscriber/BatchUpdateComponentV2Subscriber");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "-3886977793003145152";
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        IDMComponent componentByName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
            return;
        }
        try {
            JSONObject E = E(b8vVar);
            JSONObject jSONObject = null;
            JSONObject jSONObject2 = E == null ? null : E.getJSONObject("updateFields");
            if (jSONObject2 != null) {
                if (E != null) {
                    jSONObject = E.getJSONObject("updatePrefixFields");
                }
                if (jSONObject != null) {
                    for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                        for (IDMComponent iDMComponent : b8vVar.n().b().getComponents()) {
                            if (iDMComponent.getKey().startsWith(entry.getKey())) {
                                jSONObject2.put(iDMComponent.getKey(), entry.getValue());
                            }
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, Object> entry2 : jSONObject2.entrySet()) {
                    String key = entry2.getKey();
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(key);
                    if (!(jSONObject3 == null || (componentByName = b8vVar.n().b().getComponentByName(key)) == null)) {
                        axf.c(componentByName.getFields(), jSONObject3);
                        arrayList.add(componentByName);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                if (wbl.a()) {
                    b8vVar.n().e(arrayList);
                } else {
                    this.j.post(new a(b8vVar, arrayList));
                }
            }
        } catch (Throwable th) {
            String simpleName = i52.class.getSimpleName();
            uj8.a(simpleName, "EVENT_CHAIN_TRY_EXCEPTION_ERROR", "batchupdate error = " + th.getMessage());
            kor.d("batchUpdateComponentV2Subscriber", "batchUpdateComponent", th);
        }
    }
}
