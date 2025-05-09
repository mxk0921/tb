package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jdl extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "orderJSTrackerReport";

    static {
        t2o.a(614465550);
    }

    public static /* synthetic */ Object ipc$super(jdl jdlVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/ext/OrderJSTrackerReportSubscriber");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "734081694296469013";
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        float parseFloat;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
            return;
        }
        JSONObject E = E(b8vVar);
        if (E != null) {
            String string = E.getString("code");
            String string2 = E.getString("pageName");
            String string3 = E.getString("success");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                String string4 = E.getString("message");
                String string5 = E.getString(hxj.UNIQID);
                String string6 = E.getString("sampling");
                h15 create = h15.create(string2, string);
                create.success(Boolean.parseBoolean(string3));
                if (string4 == null) {
                    string4 = "";
                }
                create.message(string4);
                if (string5 == null) {
                    string5 = "";
                }
                create.setUuid(string5);
                if (string6 != null) {
                    try {
                        parseFloat = Float.parseFloat(string6);
                    } catch (Throwable unused) {
                        create.sampling(1.0f);
                    }
                } else {
                    parseFloat = 1.0f;
                }
                create.sampling(parseFloat);
                f9v.p(create);
            }
        }
    }
}
