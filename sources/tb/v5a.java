package tb;

import android.location.Location;
import android.telephony.TelephonyManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.passivelocation.domain.LBSCellDTO;
import com.taobao.passivelocation.domain.LBSDTO;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class v5a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(789577850);
    }

    public static LBSCellDTO[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LBSCellDTO[]) ipChange.ipc$dispatch("cb24bd1c", new Object[0]);
        }
        return cyv.b();
    }

    public static LBSDTO a(Location location) {
        Short sh;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LBSDTO) ipChange.ipc$dispatch("b3a33ca", new Object[]{location});
        }
        LBSDTO lbsdto = new LBSDTO();
        if (location != null) {
            lbsdto.setAccuracy(Integer.valueOf((int) location.getAccuracy()));
            lbsdto.setHasLocation(Boolean.TRUE);
            lbsdto.setLatitude(Double.valueOf(location.getLatitude()));
            lbsdto.setLongitude(Double.valueOf(location.getLongitude()));
            lbsdto.setAltitude(Double.valueOf(location.getAltitude()));
        } else {
            lbsdto.setHasLocation(Boolean.FALSE);
        }
        lbsdto.setTime(System.currentTimeMillis());
        lbsdto.setVersion(1);
        LBSCellDTO[] b = b();
        if (b != null) {
            String networkOperator = ((TelephonyManager) Globals.getApplication().getSystemService("phone")).getNetworkOperator();
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
        lbsdto.wifiNum = (short) 0;
        lbsdto.setUtdId(cyv.f());
        lbsdto.setIp(cyv.d());
        if (cyv.e() != null) {
            lbsdto.setMacAddr(Long.valueOf(rnh.b(cyv.e(), ":").a()));
        } else {
            lbsdto.setMacAddr(-1L);
        }
        return lbsdto;
    }
}
