package tb;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.login4android.qrcode.data.QrCodeData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class r8r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static TBLocationDTO f27196a;
    public static long b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TBLocationDTO d = TBLocationClient.d();
            if (d != null) {
                r8r.a(d);
            }
        }
    }

    public static /* synthetic */ TBLocationDTO a(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("3289da3d", new Object[]{tBLocationDTO});
        }
        f27196a = tBLocationDTO;
        return tBLocationDTO;
    }

    public static String b() {
        TBLocationDTO d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f2e4644", new Object[0]);
        }
        d();
        if (f27196a == null && (d = TBLocationClient.d()) != null) {
            f27196a = d;
        }
        JSONObject jSONObject = new JSONObject();
        TBLocationDTO tBLocationDTO = f27196a;
        if (tBLocationDTO != null) {
            jSONObject.put(DispatchConstants.LONGTITUDE, (Object) tBLocationDTO.longitude);
            jSONObject.put(DispatchConstants.LATITUDE, (Object) f27196a.latitude);
            jSONObject.put("provinceDivisionCode", (Object) f27196a.provinceCode);
            jSONObject.put("cityDivisionCode", (Object) f27196a.cityCode);
            jSONObject.put("areaDivisionCode", (Object) f27196a.areaCode);
        }
        return jSONObject.toJSONString();
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30a1d5e2", new Object[0])).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b < QrCodeData.QR_CODE_VALID_PERIOD) {
            return true;
        }
        b = currentTimeMillis;
        return false;
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fe6910b", new Object[0]);
        } else if (!c()) {
            dn.h(new a());
        }
    }
}
