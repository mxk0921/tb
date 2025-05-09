package tb;

import android.content.Context;
import android.content.Intent;
import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.passivelocation.domain.LBSDTO;
import com.taobao.passivelocation.gathering.service.LocationGatheringService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class bgj extends PhoneStateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static short b;

    /* renamed from: a  reason: collision with root package name */
    public final Context f16372a;

    static {
        t2o.a(789577845);
    }

    public bgj(Context context) {
        mdh.d("lbs_passive.loc_MyPhoneStateListener", "MyPhoneStateListener init");
        this.f16372a = context;
        AppMonitor.Counter.commit("passivelocation", "MyPhoneStateListener", 1.0d);
    }

    public static /* synthetic */ Object ipc$super(bgj bgjVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2058329889) {
            super.onSignalStrengthsChanged((SignalStrength) objArr[0]);
            return null;
        } else if (hashCode == -565358330) {
            super.onCellLocationChanged((CellLocation) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/passivelocation/features/cell/MyPhoneStateListener");
        }
    }

    @Override // android.telephony.PhoneStateListener
    public void onSignalStrengthsChanged(SignalStrength signalStrength) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("855060df", new Object[]{this, signalStrength});
            return;
        }
        mdh.d("lbs_passive.loc_MyPhoneStateListener", "[onSignalStrengthsChanged]");
        super.onSignalStrengthsChanged(signalStrength);
        try {
            TelephonyManager telephonyManager = (TelephonyManager) yah.f31937a.getSystemService("phone");
            if (telephonyManager.getSimState() == 5) {
                CellLocation cellLocation = telephonyManager.getCellLocation();
                if (cellLocation instanceof GsmCellLocation) {
                    mdh.d("lbs_passive.loc_MyPhoneStateListener", "[onSignalStrengthsChanged] GsmCellLocation signalStrength: " + signalStrength.getGsmSignalStrength());
                    b = (short) signalStrength.getGsmSignalStrength();
                } else if (cellLocation instanceof CdmaCellLocation) {
                    mdh.d("lbs_passive.loc_MyPhoneStateListener", "[onSignalStrengthsChanged] CdmaCellLocation signalStrength: " + signalStrength.getCdmaDbm());
                    b = (short) signalStrength.getCdmaDbm();
                } else {
                    mdh.a("lbs_passive.loc_MyPhoneStateListener", "[onSignalStrengthsChanged] other type CellLocation: " + cellLocation);
                }
            } else {
                mdh.e("lbs_passive.loc_MyPhoneStateListener", "[onSignalStrengthsChanged] SIM state is not ok!");
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.telephony.PhoneStateListener
    public void onCellLocationChanged(CellLocation cellLocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de4d5106", new Object[]{this, cellLocation});
            return;
        }
        mdh.d("lbs_passive.loc_MyPhoneStateListener", "[onCellLocationChanged]");
        super.onCellLocationChanged(cellLocation);
        try {
            if (cellLocation instanceof GsmCellLocation) {
                mdh.a("lbs_passive.loc_MyPhoneStateListener", "[onCellLocationChanged] cid = " + ((GsmCellLocation) cellLocation).getCid());
            } else if (cellLocation instanceof CdmaCellLocation) {
                mdh.a("lbs_passive.loc_MyPhoneStateListener", "[onCellLocationChanged] baseStationId = " + ((CdmaCellLocation) cellLocation).getBaseStationId());
            }
            LBSDTO b2 = np6.b();
            if (cellLocation instanceof GsmCellLocation) {
                mdh.d("lbs_passive.loc_MyPhoneStateListener", "[onCellLocationChanged] current CellLocation is GsmCellLocation");
                GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                if (!(b2 == null || b2.getCells() == null || b2.getCells().length <= 0 || b2.getCells()[0] == null || gsmCellLocation == null || b2.getCells()[0].getCellId().intValue() != gsmCellLocation.getCid())) {
                    return;
                }
            } else if (cellLocation instanceof CdmaCellLocation) {
                mdh.d("lbs_passive.loc_MyPhoneStateListener", "[onCellLocationChanged] current CellLocation is CdmaCellLocation");
                CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                if (!(b2 == null || b2.getCells() == null || b2.getCells().length <= 0 || b2.getCells()[0] == null || cdmaCellLocation == null || b2.getCells()[0].getBaseStationId().intValue() != cdmaCellLocation.getBaseStationId())) {
                    return;
                }
            } else {
                mdh.d("lbs_passive.loc_MyPhoneStateListener", "[onCellLocationChanged] current CellLocation is other unknown CellLocation: " + cellLocation);
            }
            Intent intent = new Intent(LocationGatheringService.LOCATION_CHANGED_ACTION);
            intent.setPackage(this.f16372a.getPackageName());
            intent.putExtra("location_source_key", "MyPhoneStateListener");
            this.f16372a.startService(intent);
        } catch (Exception e) {
            mdh.b("lbs_passive.loc_MyPhoneStateListener", "[onCellLocationChanged] processing error: " + e.getMessage());
        }
    }
}
