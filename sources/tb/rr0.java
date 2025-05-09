package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import tb.bxf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rr0 extends at1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String JSON_CMD_REMOVEALIAS = "removeAlias";
    public static final String JSON_CMD_REMOVEALLALIAS = "unbindAllAlias";
    public static final String JSON_CMD_SETALIAS = "setAlias";
    public static final String JSON_PUSH_USER_TOKEN = "pushAliasToken";
    public String b;
    public String c;
    public String d;
    public String e;

    static {
        t2o.a(343933290);
    }

    public static byte[] b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("e203b761", new Object[]{str, str2});
        }
        rr0 rr0Var = new rr0();
        rr0Var.b = str;
        rr0Var.c = str2;
        rr0Var.f15983a = JSON_CMD_REMOVEALLALIAS;
        return rr0Var.a();
    }

    public static byte[] c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ba6a0a9a", new Object[]{str, str2, str3});
        }
        rr0 rr0Var = new rr0();
        rr0Var.b = str;
        rr0Var.c = str2;
        rr0Var.e = str3;
        rr0Var.f15983a = JSON_CMD_REMOVEALIAS;
        return rr0Var.a();
    }

    public static byte[] d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("24c4038", new Object[]{str, str2, str3});
        }
        rr0 rr0Var = new rr0();
        rr0Var.b = str;
        rr0Var.c = str2;
        rr0Var.d = str3;
        rr0Var.f15983a = JSON_CMD_REMOVEALIAS;
        return rr0Var.a();
    }

    public static byte[] e(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("40c57d5c", new Object[]{str, str2, str3});
        }
        rr0 rr0Var = new rr0();
        rr0Var.b = str;
        rr0Var.c = str2;
        rr0Var.d = str3;
        rr0Var.f15983a = JSON_CMD_SETALIAS;
        return rr0Var.a();
    }

    public static /* synthetic */ Object ipc$super(rr0 rr0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/agoo/control/data/AliasDO");
    }

    public byte[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3cc50cfe", new Object[]{this});
        }
        try {
            bxf.a d = new bxf.a().d("cmd", this.f15983a).d("appKey", this.b).d("deviceId", this.c).d("alias", this.d).d(JSON_PUSH_USER_TOKEN, this.e);
            if (j8l.y(GlobalClientInfo.getContext())) {
                d.d("regId", j8l.p(GlobalClientInfo.getContext()));
                d.d("utdid", UtilityImpl.getDeviceId(GlobalClientInfo.getContext()));
            }
            String jSONObject = d.a().toString();
            ALog.i("AliasDO", "buildData", "data", jSONObject);
            return jSONObject.getBytes("utf-8");
        } catch (Throwable th) {
            ALog.e("AliasDO", "buildData", th, new Object[0]);
            return null;
        }
    }
}
