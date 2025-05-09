package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.activelocation.location.impl.NLPLocation;
import com.taobao.activelocation.location.impl.TBServerLocation;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.falco.f;
import com.taobao.location.aidl.ITBLocationCallback;
import com.taobao.location.common.LocationTypeEnum;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class awv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$location$common$LocationTypeEnum;

        static {
            int[] iArr = new int[LocationTypeEnum.values().length];
            $SwitchMap$com$taobao$location$common$LocationTypeEnum = iArr;
            try {
                iArr[LocationTypeEnum.GDLOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$location$common$LocationTypeEnum[LocationTypeEnum.MEMORYLOCATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$location$common$LocationTypeEnum[LocationTypeEnum.NLPLOCATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$location$common$LocationTypeEnum[LocationTypeEnum.TBSEVERLOCATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        t2o.a(789577760);
    }

    public static String a(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a700d570", new Object[]{tBLocationDTO});
        }
        return "通过经纬度查地址成功!lon:" + tBLocationDTO.longitude + ",lat:" + tBLocationDTO.latitude + ",citycode:" + tBLocationDTO.cityCode + ",cityName:" + tBLocationDTO.cityName + ",address:" + tBLocationDTO.getAddress();
    }

    public static void b(String str, boolean z, String str2, String str3) {
        f environment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f56c061", new Object[]{str, new Boolean(z), str2, str3});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("TBLocation_Event_RequestLocation");
        uTHitBuilders$UTCustomHitBuilder.setEventPage("TBLocation");
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (!(tz8Var == null || (environment = tz8Var.getEnvironment()) == null)) {
            String i = environment.i();
            if (!TextUtils.isEmpty(i)) {
                uTHitBuilders$UTCustomHitBuilder.setProperty("pageName", i);
            }
            String c = environment.c();
            if (!TextUtils.isEmpty(c)) {
                uTHitBuilders$UTCustomHitBuilder.setProperty("falcoId", c);
            }
            try {
                String encode = TextUtils.isEmpty(environment.f()) ? null : Uri.encode(environment.f());
                if (!TextUtils.isEmpty(encode)) {
                    uTHitBuilders$UTCustomHitBuilder.setProperty("pageUrl", encode);
                }
            } catch (Exception unused) {
            }
        }
        uTHitBuilders$UTCustomHitBuilder.setProperty("locationType", str);
        String str4 = "false";
        uTHitBuilders$UTCustomHitBuilder.setProperty("isCompensation", str4);
        if (z) {
            str4 = "true";
        }
        uTHitBuilders$UTCustomHitBuilder.setProperty("isSuccess", str4);
        if (!TextUtils.isEmpty(str3)) {
            uTHitBuilders$UTCustomHitBuilder.setProperty("bizCode", str3);
        }
        if (!TextUtils.isEmpty(str2)) {
            uTHitBuilders$UTCustomHitBuilder.setProperty("extra", str2);
        }
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7ad2619", new Object[]{context})).booleanValue();
        }
        if (ContextCompat.checkSelfPermission(context, p78.ACCESS_FINE_LOCATION) == 0 || ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            return true;
        }
        return false;
    }

    public static TBLocationDTO d(Location location) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("8eff1ce0", new Object[]{location});
        }
        if (location == null) {
            return null;
        }
        TBLocationDTO tBLocationDTO = new TBLocationDTO();
        try {
            tBLocationDTO.latitude = String.valueOf(location.getLatitude());
            tBLocationDTO.longitude = String.valueOf(location.getLongitude());
            tBLocationDTO.accuracy = Integer.valueOf((int) location.getAccuracy());
            return tBLocationDTO;
        } catch (Exception unused) {
            return null;
        }
    }

    public static e20 e(int i, Handler handler, TBLocationOption tBLocationOption, ITBLocationCallback iTBLocationCallback, anc ancVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e20) ipChange.ipc$dispatch("67953fab", new Object[]{new Integer(i), handler, tBLocationOption, iTBLocationCallback, ancVar, hashMap});
        }
        int i2 = a.$SwitchMap$com$taobao$location$common$LocationTypeEnum[LocationTypeEnum.valueOfType(i).ordinal()];
        if (i2 == 1) {
            return new u2a(handler, tBLocationOption, iTBLocationCallback, hashMap);
        }
        if (i2 == 2) {
            return new ali(handler, tBLocationOption, iTBLocationCallback, ancVar, hashMap);
        }
        if (i2 == 3) {
            return new NLPLocation(handler, tBLocationOption, iTBLocationCallback, hashMap);
        }
        if (i2 != 4) {
            return null;
        }
        return new TBServerLocation(handler, tBLocationOption, iTBLocationCallback, hashMap);
    }

    public static String[] g(double[] dArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("6af7e9", new Object[]{dArr});
        }
        String d = Double.toString(dArr[0]);
        int indexOf = d.indexOf(".");
        String substring = d.substring(0, indexOf);
        String substring2 = d.substring(indexOf + 1);
        if (substring2.length() > 6) {
            substring2 = substring2.substring(0, 6);
        }
        String str = substring + "." + substring2;
        String d2 = Double.toString(dArr[1]);
        int indexOf2 = d2.indexOf(".");
        String substring3 = d2.substring(0, indexOf2);
        String substring4 = d2.substring(indexOf2 + 1);
        if (substring4.length() > 6) {
            substring4 = substring4.substring(0, 6);
        }
        return new String[]{str, substring3 + "." + substring4};
    }

    public static void i(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bcd014a", new Object[]{tBLocationDTO});
            return;
        }
        tBLocationDTO.cityCode = "330100";
        tBLocationDTO.cityName = "杭州";
        tBLocationDTO.countryName = "中国";
        tBLocationDTO.countryCode = "中国";
        tBLocationDTO.longitude = "118.915499";
        tBLocationDTO.latitude = "29.547461";
        tBLocationDTO.address = "";
        tBLocationDTO.accuracy = 1000;
        tBLocationDTO.locationType = Integer.valueOf(LocationTypeEnum.NOLOCATION.getType());
        tBLocationDTO.timeStamp = Long.valueOf(System.currentTimeMillis());
    }

    public static TBLocationDTO f(Context context) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("4144ba04", new Object[]{context});
        }
        TBLocationDTO tBLocationDTO = null;
        if (context == null || (sharedPreferences = context.getSharedPreferences("tb_passive_location91", 0)) == null || !sharedPreferences.getBoolean("location_mock_on", false)) {
            return null;
        }
        String string = sharedPreferences.getString("location_mock_data", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String[] split = string.split("_");
        if (split.length != 5) {
            return null;
        }
        String str = split[0];
        String str2 = split[1];
        String str3 = split[2];
        String str4 = split[3];
        String str5 = split[4];
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            tBLocationDTO = new TBLocationDTO();
            tBLocationDTO.longitude = str;
            tBLocationDTO.latitude = str2;
            if (!"-1".equals(str5)) {
                tBLocationDTO.address = str5;
            }
            if (!"-1".equals(str3)) {
                tBLocationDTO.cityCode = str3;
            }
            if (!"-1".equals(str4)) {
                tBLocationDTO.cityName = str4;
            }
            tBLocationDTO.isNavSuccess = true;
            tBLocationDTO.timeStamp = Long.valueOf(System.currentTimeMillis());
            tBLocationDTO.locationType = Integer.valueOf(LocationTypeEnum.GPSLOCATION.getType());
            mdh.b("Test", "读取mock数据:" + a(tBLocationDTO));
        }
        return tBLocationDTO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
        if (r7.getAccuracy() == com.taobao.location.common.TBLocationOption.Accuracy.TENMETER) goto L_0x0062;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r3 != false) goto L_0x0062;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean h(android.content.Context r6, com.taobao.location.common.TBLocationOption r7, android.location.LocationListener r8) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.awv.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001f
            java.lang.String r3 = "d8723c84"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r6
            r4[r0] = r7
            r6 = 2
            r4[r6] = r8
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001f:
            java.lang.String r2 = "requestSystemLocation"
            if (r6 == 0) goto L_0x006b
            if (r8 == 0) goto L_0x006b
            if (r7 != 0) goto L_0x0029
            goto L_0x006b
        L_0x0029:
            boolean r3 = c(r6)
            if (r3 != 0) goto L_0x0036
            java.lang.String r6 = "权限不足, 降级定位"
            com.taobao.tao.log.TLog.logd(r2, r6)
            return r1
        L_0x0036:
            java.lang.String r2 = "location"
            java.lang.Object r6 = r6.getSystemService(r2)
            android.location.LocationManager r6 = (android.location.LocationManager) r6
            if (r6 != 0) goto L_0x0041
            return r1
        L_0x0041:
            java.lang.String r2 = "gps"
            boolean r3 = r6.isProviderEnabled(r2)
            java.lang.String r4 = "network"
            boolean r5 = r6.isProviderEnabled(r4)
            if (r3 == 0) goto L_0x005d
            if (r5 == 0) goto L_0x005d
            com.taobao.location.common.TBLocationOption$Accuracy r7 = r7.getAccuracy()
            com.taobao.location.common.TBLocationOption$Accuracy r3 = com.taobao.location.common.TBLocationOption.Accuracy.TENMETER
            if (r7 != r3) goto L_0x005b
            goto L_0x0062
        L_0x005b:
            r2 = r4
            goto L_0x0062
        L_0x005d:
            if (r5 == 0) goto L_0x0060
            goto L_0x005b
        L_0x0060:
            if (r3 == 0) goto L_0x006a
        L_0x0062:
            android.os.Looper r7 = android.os.Looper.getMainLooper()     // Catch: Exception -> 0x006a
            r6.requestSingleUpdate(r2, r8, r7)     // Catch: Exception -> 0x006a
            return r0
        L_0x006a:
            return r1
        L_0x006b:
            java.lang.String r6 = "参数不合法"
            com.taobao.tao.log.TLog.logd(r2, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.awv.h(android.content.Context, com.taobao.location.common.TBLocationOption, android.location.LocationListener):boolean");
    }
}
