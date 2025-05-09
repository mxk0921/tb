package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class usv extends m6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "userTapSender";
    public static final String NEXT_TAG_SUCCESS = "success";
    public final vsv j;

    static {
        t2o.a(745538137);
    }

    public usv(vsv vsvVar) {
        this.j = vsvVar;
    }

    public static /* synthetic */ Object ipc$super(usv usvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/event/UserTapSenderSubscriber");
    }

    @Override // tb.m6v
    public void F(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
        } else if (f() == null) {
            tj8.a(usv.class.getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "error: eventFields is null");
        } else {
            List<String> b = this.j.b();
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<String> it = b.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next());
                if (it.hasNext()) {
                    stringBuffer.append(",");
                }
            }
            this.j.a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userTaps", (Object) stringBuffer);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("result", (Object) jSONObject);
            C(b8vVar, "success", jSONObject2);
        }
    }
}
