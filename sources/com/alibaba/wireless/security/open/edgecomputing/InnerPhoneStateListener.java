package com.alibaba.wireless.security.open.edgecomputing;

import android.os.Build;
import android.telephony.CellSignalStrength;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import java.lang.reflect.Method;
import java.util.Iterator;

/* loaded from: classes.dex */
public class InnerPhoneStateListener extends PhoneStateListener {

    /* renamed from: а  reason: contains not printable characters */
    private Method f346;

    public InnerPhoneStateListener() {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                this.f346 = SignalStrength.class.getMethod("getLteLevel", new Class[0]);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.telephony.PhoneStateListener
    public void onSignalStrengthsChanged(SignalStrength signalStrength) {
        Integer num;
        super.onSignalStrengthsChanged(signalStrength);
        try {
            int gsmSignalStrength = signalStrength.getGsmSignalStrength();
            StringBuilder sb = new StringBuilder();
            sb.append(gsmSignalStrength);
            sb.append(" ");
            try {
                if (!(this.f346 == null || (num = (Integer) this.f346.invoke(signalStrength, new Object[0])) == null)) {
                    sb.append(num);
                    sb.append(" ");
                }
            } catch (Throwable unused) {
            }
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator<CellSignalStrength> it = signalStrength.getCellSignalStrengths().iterator();
                while (it.hasNext()) {
                    sb.append(it.next().getAsuLevel() + " ");
                }
            }
            C0165.m221().doCommand(13814, sb.toString());
        } catch (Exception unused2) {
        }
    }
}
