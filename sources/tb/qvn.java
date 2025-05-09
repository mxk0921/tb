package tb;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import tb.bxf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qvn extends at1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String JSON_CMD_REGISTER = "register";
    public String b;
    public String c;
    public String d;
    public final String e = String.valueOf(402);
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;

    static {
        t2o.a(343933293);
    }

    public static /* synthetic */ Object ipc$super(qvn qvnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/agoo/control/data/RegisterDO");
    }

    public byte[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3cc50cfe", new Object[]{this});
        }
        try {
            String jSONObject = new bxf.a().d("cmd", this.f15983a).d("appKey", this.b).d("utdid", this.c).d("appVersion", this.d).d("sdkVersion", this.e).d("ttid", this.f).d("packageName", this.g).d("notifyEnable", this.h).d("romInfo", this.i).d("c0", this.j).d("c1", this.k).d("c2", null).d("c3", null).d("c4", null).d("c5", null).d("c6", null).a().toString();
            ALog.i("RegisterDO", "buildData", "data", jSONObject);
            return jSONObject.getBytes("utf-8");
        } catch (Throwable th) {
            ALog.e("RegisterDO", "buildData", th, new Object[0]);
            return null;
        }
    }

    public static byte[] b(Context context, String str, String str2) {
        Throwable th;
        qvn qvnVar;
        String deviceId;
        String packageName;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bfcd5cb9", new Object[]{context, str, str2});
        }
        try {
            deviceId = UtilityImpl.getDeviceId(context);
            packageName = context.getPackageName();
            str3 = GlobalClientInfo.getInstance(context).getPackageInfo().versionName;
        } catch (Throwable th2) {
            th = th2;
            qvnVar = null;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(deviceId) && !TextUtils.isEmpty(str3)) {
            qvnVar = new qvn();
            try {
                qvnVar.f15983a = "register";
                qvnVar.b = str;
                qvnVar.c = deviceId;
                qvnVar.d = str3;
                qvnVar.f = str2;
                qvnVar.g = packageName;
                qvnVar.j = Build.BRAND;
                qvnVar.k = Build.MODEL;
                String j = xd0.j(context);
                qvnVar.h = j;
                UtilityImpl.saveNotificationState(context, Constants.SP_CHANNEL_FILE_NAME, j);
                qvnVar.i = pfo.b().a();
            } catch (Throwable th3) {
                th = th3;
                try {
                    ALog.w("RegisterDO", "buildRegister", th.getMessage());
                    if (qvnVar == null) {
                        return null;
                    }
                    return qvnVar.a();
                } finally {
                    if (qvnVar != null) {
                        qvnVar.a();
                    }
                }
            }
            return qvnVar.a();
        }
        ALog.e("RegisterDO", "buildRegister param null", "appKey", str, "utdid", deviceId, "appVersion", str3);
        return null;
    }
}
