package tb;

import android.telephony.TelephonyManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.passivelocation.domain.LBSCellDTO;
import com.taobao.passivelocation.domain.LBSDTO;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class w5a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(789577759);
    }

    public static void b(LBSDTO lbsdto) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31b2b0b9", new Object[]{lbsdto});
            return;
        }
        try {
            lbsdto.setImei(cyv.c());
        } catch (Exception unused) {
        }
    }

    public static void c(LBSDTO lbsdto) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55664766", new Object[]{lbsdto});
        } else {
            lbsdto.wifiNum = (short) 0;
        }
    }

    public static void a(LBSDTO lbsdto) {
        Short sh;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fd345f3", new Object[]{lbsdto});
            return;
        }
        LBSCellDTO[] b = cyv.b();
        if (b != null) {
            TelephonyManager telephonyManager = (TelephonyManager) Globals.getApplication().getSystemService("phone");
            String networkOperator = telephonyManager == null ? null : telephonyManager.getNetworkOperator();
            if (networkOperator != null && networkOperator.length() == 5) {
                lbsdto.setCellMCC(Short.valueOf(Short.parseShort(networkOperator.substring(0, 3))));
                lbsdto.setCellMNC(Short.valueOf(Short.parseShort(networkOperator.substring(3, 5))));
            }
            if (b[0].getBaseStationId() == null) {
                sh = LBSDTO.CELL_TYPE_GSM;
            } else {
                sh = LBSDTO.CELL_TYPE_CDMA;
            }
            lbsdto.setCellType(sh);
            lbsdto.setCells(b);
            lbsdto.setCellNum(Short.valueOf((short) b.length));
        } else {
            lbsdto.setCellNum((short) 0);
        }
        lbsdto.setUtdId(cyv.f());
        lbsdto.setIp(cyv.d());
        if (cyv.e() != null) {
            lbsdto.setMacAddr(Long.valueOf(rnh.b(cyv.e(), ":").a()));
        } else {
            lbsdto.setMacAddr(-1L);
        }
    }
}
