package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xln extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NEXT_TAG_RECEIVER = "onReceive";
    public static final String NEXT_TAG_SUCESS = "success";
    public final Set<String> j = new HashSet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends lmi {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String d;
        public final /* synthetic */ b8v e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ppi ppiVar, String str2, b8v b8vVar) {
            super(str, ppiVar);
            this.d = str2;
            this.e = b8vVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/subscriber/ReceiverWithUpdateV2Subscriber$1");
        }

        @Override // tb.lmi
        public void c(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a88433cb", new Object[]{this, obj});
            } else if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.getString("key").equals(this.d)) {
                    xln.J(xln.this, this.e, jSONObject);
                }
            }
        }
    }

    static {
        t2o.a(614465760);
    }

    public static /* synthetic */ void J(xln xlnVar, b8v b8vVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b154e963", new Object[]{xlnVar, b8vVar, jSONObject});
        } else {
            xlnVar.K(b8vVar, jSONObject);
        }
    }

    public static /* synthetic */ Object ipc$super(xln xlnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/subscriber/ReceiverWithUpdateV2Subscriber");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "-100577986237887704";
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
            return;
        }
        String string = E(b8vVar).getString("key");
        b8vVar.n().g().b(new a(string, b8vVar.n().g(), string, b8vVar));
        ((HashSet) this.j).add(string);
    }

    public final void K(b8v b8vVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b103daac", new Object[]{this, b8vVar, jSONObject});
        } else {
            D(b8vVar, "onReceive", jSONObject);
        }
    }
}
