package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import tb.bxf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class p0r extends at1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String JSON_CMD_DISABLEPUSH = "disablePush";
    public static final String JSON_CMD_ENABLEPUSH = "enablePush";
    public String b;
    public String c;
    public String d;

    static {
        t2o.a(343933294);
    }

    public static byte[] b(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("425f143b", new Object[]{str, str2, str3, new Boolean(z)});
        }
        p0r p0rVar = new p0r();
        p0rVar.b = str;
        p0rVar.c = str2;
        p0rVar.d = str3;
        if (z) {
            p0rVar.f15983a = JSON_CMD_ENABLEPUSH;
        } else {
            p0rVar.f15983a = JSON_CMD_DISABLEPUSH;
        }
        return p0rVar.a();
    }

    public static /* synthetic */ Object ipc$super(p0r p0rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/agoo/control/data/SwitchDO");
    }

    public byte[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3cc50cfe", new Object[]{this});
        }
        try {
            bxf.a aVar = new bxf.a();
            aVar.d("cmd", this.f15983a).d("appKey", this.b);
            if (TextUtils.isEmpty(this.c)) {
                aVar.d("utdid", this.d);
            } else {
                aVar.d("deviceId", this.c);
            }
            if (j8l.y(GlobalClientInfo.getContext())) {
                aVar.d("regId", j8l.p(GlobalClientInfo.getContext()));
                aVar.d("utdid", UtilityImpl.getDeviceId(GlobalClientInfo.getContext()));
            }
            String jSONObject = aVar.a().toString();
            ALog.i("SwitchDO", "buildData", "data", jSONObject);
            return jSONObject.getBytes("utf-8");
        } catch (Throwable th) {
            ALog.e("SwitchDO", "buildData", th, new Object[0]);
            return null;
        }
    }
}
