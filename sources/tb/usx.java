package tb;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.alipay.security.mobile.module.http.UploadFactory;
import com.alipay.security.mobile.module.http.model.DeviceDataReponseModel;
import com.alipay.security.mobile.module.http.model.DeviceDataRequestModel;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class usx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f29592a;
    public final pyx b = pyx.a();
    public int c = 4;

    public usx(Context context) {
        this.f29592a = context;
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        String f = f(context);
        if (vux.c(f)) {
            return yby.n(context);
        }
        return f;
    }

    public static String c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        try {
            String a2 = bcy.a(str);
            if (!vux.c(a2)) {
                return a2;
            }
            String a3 = sby.a(context, str);
            bcy.c(str, a3);
            if (!vux.c(a3)) {
                return a3;
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String[] strArr = {"2017-01-27 2017-01-28", "2017-11-10 2017-11-11", "2017-12-11 2017-12-12"};
        int random = (int) (Math.random() * 24.0d * 60.0d * 60.0d);
        for (int i = 0; i < 3; i++) {
            try {
                String[] split = strArr[i].split(" ");
                if (split != null && split.length == 2) {
                    Date date = new Date();
                    Date parse = simpleDateFormat.parse(split[0] + " 00:00:00");
                    Date parse2 = simpleDateFormat.parse(split[1] + " 23:59:59");
                    Calendar instance = Calendar.getInstance();
                    instance.setTime(parse2);
                    instance.add(13, random);
                    Date time = instance.getTime();
                    if (date.after(parse) && date.before(time)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        try {
            String g = bcy.g();
            if (!vux.c(g)) {
                return g;
            }
            zay d = cby.d(context);
            if (d != null) {
                bcy.e(d);
                String str = d.f32658a;
                if (vux.f(str)) {
                    return str;
                }
            }
            oay d2 = y9y.d(context);
            if (d2 == null) {
                return "";
            }
            bcy.d(d2);
            String str2 = d2.f25271a;
            if (vux.f(str2)) {
                return str2;
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public final DeviceDataReponseModel e(Map<String, String> map) {
        String str;
        String str2;
        oay e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceDataReponseModel) ipChange.ipc$dispatch("42483dd3", new Object[]{this, map});
        }
        try {
            Context context = this.f29592a;
            DeviceDataRequestModel deviceDataRequestModel = new DeviceDataRequestModel();
            String b = vux.b(map, "appName", "");
            String b2 = vux.b(map, "sessionId", "");
            String b3 = vux.b(map, TransportConstants.KEY_RPC_VERSION, "");
            String c = c(context, b);
            String securityToken = UmidSdkWrapper.getSecurityToken(context);
            String j = yby.j(context);
            if (vux.f(b2)) {
                deviceDataRequestModel.token = b2;
            } else {
                deviceDataRequestModel.token = c;
            }
            deviceDataRequestModel.umidToken = securityToken;
            deviceDataRequestModel.dynamicKey = j;
            deviceDataRequestModel.os = "android";
            zay e2 = cby.e(context);
            if (e2 != null) {
                str = e2.f32658a;
                str2 = e2.c;
            } else {
                str2 = "";
                str = str2;
            }
            if (vux.c(str) && (e = y9y.e(context)) != null) {
                str = e.f25271a;
                str2 = e.c;
            }
            deviceDataRequestModel.priApdid = str;
            deviceDataRequestModel.pubApdid = "";
            deviceDataRequestModel.rpcVersion = b3;
            if (vux.c(str)) {
                deviceDataRequestModel.apdid = "";
                deviceDataRequestModel.lastTimeApdidGenerated = "";
            } else {
                deviceDataRequestModel.apdid = str;
                deviceDataRequestModel.lastTimeApdidGenerated = str2;
            }
            deviceDataRequestModel.dataMap = n9y.b(context, map);
            return UploadFactory.createV2(this.f29592a, this.b.b()).updateStaticData(deviceDataRequestModel);
        } catch (Throwable th) {
            th.printStackTrace();
            q4y.c(th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115 A[Catch: Exception -> 0x00a7, TryCatch #0 {Exception -> 0x00a7, blocks: (B:6:0x0024, B:8:0x0055, B:11:0x006b, B:14:0x0078, B:17:0x008e, B:19:0x009c, B:24:0x00aa, B:26:0x00b0, B:29:0x00bb, B:32:0x00c4, B:35:0x00d1, B:39:0x00e0, B:42:0x00ed, B:45:0x00fa, B:48:0x0101, B:51:0x0115, B:53:0x0126, B:58:0x0131, B:59:0x0141, B:61:0x0148, B:65:0x015a, B:67:0x01af, B:69:0x01b9, B:70:0x01bd, B:71:0x01c1, B:73:0x01ce, B:75:0x01d8, B:76:0x01dc, B:77:0x01e0, B:78:0x0217, B:80:0x0231, B:83:0x0239, B:85:0x023f, B:87:0x0245, B:89:0x024b), top: B:93:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0231 A[Catch: Exception -> 0x00a7, TryCatch #0 {Exception -> 0x00a7, blocks: (B:6:0x0024, B:8:0x0055, B:11:0x006b, B:14:0x0078, B:17:0x008e, B:19:0x009c, B:24:0x00aa, B:26:0x00b0, B:29:0x00bb, B:32:0x00c4, B:35:0x00d1, B:39:0x00e0, B:42:0x00ed, B:45:0x00fa, B:48:0x0101, B:51:0x0115, B:53:0x0126, B:58:0x0131, B:59:0x0141, B:61:0x0148, B:65:0x015a, B:67:0x01af, B:69:0x01b9, B:70:0x01bd, B:71:0x01c1, B:73:0x01ce, B:75:0x01d8, B:76:0x01dc, B:77:0x01e0, B:78:0x0217, B:80:0x0231, B:83:0x0239, B:85:0x023f, B:87:0x0245, B:89:0x024b), top: B:93:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0239 A[Catch: Exception -> 0x00a7, TryCatch #0 {Exception -> 0x00a7, blocks: (B:6:0x0024, B:8:0x0055, B:11:0x006b, B:14:0x0078, B:17:0x008e, B:19:0x009c, B:24:0x00aa, B:26:0x00b0, B:29:0x00bb, B:32:0x00c4, B:35:0x00d1, B:39:0x00e0, B:42:0x00ed, B:45:0x00fa, B:48:0x0101, B:51:0x0115, B:53:0x0126, B:58:0x0131, B:59:0x0141, B:61:0x0148, B:65:0x015a, B:67:0x01af, B:69:0x01b9, B:70:0x01bd, B:71:0x01c1, B:73:0x01ce, B:75:0x01d8, B:76:0x01dc, B:77:0x01e0, B:78:0x0217, B:80:0x0231, B:83:0x0239, B:85:0x023f, B:87:0x0245, B:89:0x024b), top: B:93:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.usx.a(java.util.Map):int");
    }
}
