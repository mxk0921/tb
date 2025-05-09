package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.accs.utl.ALog;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.mass.MassClient;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.bxf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class x5i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f31157a = x5i.class.getSimpleName();

    static {
        t2o.a(343933313);
    }

    public static byte[] a(Context context, String str, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("abc5dbca", new Object[]{context, str, str2, str3});
        }
        byte[] bArr = null;
        try {
            bxf.a aVar = new bxf.a();
            if (j8l.y(context)) {
                str4 = j8l.p(context);
            } else {
                str4 = UTDevice.getUtdid(context);
            }
            JSONObject a2 = aVar.d("deviceId", str4).d("appKey", str).d(FluidException.SERVICE_NAME, str2).d("operation", str3).d("version", "1.0").d("appVersion", context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName).a();
            JSONArray jSONArray = new JSONArray();
            for (String str5 : MassClient.getInstance().getTopicsByService(str2)) {
                jSONArray.put(str5);
            }
            a2.put("topic", jSONArray);
            bArr = a2.toString().getBytes("utf-8");
            ALog.i(f31157a, "buildMassData", "data", a2.toString());
            return bArr;
        } catch (Throwable th) {
            ALog.e(f31157a, "buildMassData", th, new Object[0]);
            return bArr;
        }
    }
}
