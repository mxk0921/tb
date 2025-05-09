package com.loc;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import anet.channel.Constants;
import com.uc.webview.base.cyclone.BSError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.k7y;
import tb.l7y;
import tb.p78;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class fb {
    TelephonyManager b;
    SignalStrength d;
    private Context h;
    private ez m;
    private TelephonyManager.CellInfoCallback q;
    private es u;
    private boolean i = false;
    private boolean j = false;

    /* renamed from: a  reason: collision with root package name */
    ArrayList<fa> f5690a = new ArrayList<>();
    private String k = null;
    private ArrayList<fa> l = new ArrayList<>();
    private long n = 0;
    PhoneStateListener c = null;
    private boolean o = false;
    private Object p = new Object();
    private boolean r = false;
    boolean e = false;
    StringBuilder f = null;
    private String s = null;
    private String t = null;
    String g = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends TelephonyManager.CellInfoCallback {
        public a() {
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public final void onCellInfo(List<CellInfo> list) {
            try {
                if (fy.b() - fb.this.n >= 500) {
                    fb.this.r = true;
                    fb.this.a(fb.this.t());
                    fb.this.a(list);
                    fb.this.n = fy.b();
                }
            } catch (SecurityException e) {
                fb.this.g = e.getMessage();
            } catch (Throwable th) {
                fr.a(th, "Cgi", "cellInfo");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends PhoneStateListener {
        public b() {
        }

        @Override // android.telephony.PhoneStateListener
        public final void onCellInfoChanged(List<CellInfo> list) {
            try {
                if (fb.this.u != null) {
                    fb.this.u.c();
                }
                if (fy.b() - fb.this.n >= 500) {
                    fb.this.a(fb.this.t());
                    fb.this.a(list);
                    fb.this.n = fy.b();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.telephony.PhoneStateListener
        public final void onCellLocationChanged(CellLocation cellLocation) {
            if (fy.b() - fb.this.n >= 500) {
                try {
                    fb.this.a(cellLocation);
                    fb.this.a(fb.this.u());
                    fb.this.n = fy.b();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        @Override // android.telephony.PhoneStateListener
        public final void onDataConnectionStateChanged(int i) {
            super.onDataConnectionStateChanged(i);
        }

        @Override // android.telephony.PhoneStateListener
        public final void onServiceStateChanged(ServiceState serviceState) {
            try {
                int state = serviceState.getState();
                if (state == 0) {
                    fb.this.a(false, false);
                } else if (state == 1) {
                    fb.this.j();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.telephony.PhoneStateListener
        public final void onSignalStrengthChanged(int i) {
            super.onSignalStrengthChanged(i);
        }

        @Override // android.telephony.PhoneStateListener
        public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
            if (signalStrength != null) {
                fb fbVar = fb.this;
                fbVar.d = signalStrength;
                try {
                    if (fbVar.u != null) {
                        fb.this.u.c();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public fb(Context context, Handler handler) {
        this.b = null;
        this.m = null;
        this.h = context;
        this.b = (TelephonyManager) fy.a(context, "phone");
        o();
        ez ezVar = new ez(context, "cellAge", handler);
        this.m = ezVar;
        ezVar.a();
    }

    private static int b(int i) {
        return (i * 2) + BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA;
    }

    private void o() {
        if (this.b != null) {
            p();
        }
    }

    private void p() {
        int checkSelfPermission;
        boolean z;
        int checkSelfPermission2;
        String str;
        int checkSelfPermission3;
        try {
            if (this.c == null) {
                this.c = new b();
            }
            int i = Build.VERSION.SDK_INT;
            String str2 = "hasNoFineLocPerm";
            int i2 = 336;
            if (i >= 31) {
                checkSelfPermission3 = this.h.checkSelfPermission(p78.ACCESS_FINE_LOCATION);
                if (checkSelfPermission3 == 0) {
                    this.t = "hasFineLocPerm";
                } else {
                    this.t = str2;
                    i2 = 320;
                }
            }
            if (i >= 31) {
                checkSelfPermission = this.h.checkSelfPermission("android.permission.READ_PHONE_STATE");
                boolean z2 = false;
                if (checkSelfPermission == 0) {
                    z = true;
                } else {
                    z = false;
                }
                checkSelfPermission2 = this.h.checkSelfPermission(p78.ACCESS_FINE_LOCATION);
                if (checkSelfPermission2 == 0) {
                    z2 = true;
                }
                if (z && z2) {
                    i2 |= 1024;
                }
                if (z) {
                    str = "hasReadPhoneStatePerm";
                } else {
                    str = "hasNoReadPhoneStatePerm";
                }
                this.s = str;
                if (z2) {
                    str2 = "hasFineLocPerm";
                }
                this.t = str2;
            } else {
                i2 |= 1024;
            }
            PhoneStateListener phoneStateListener = this.c;
            if (phoneStateListener != null) {
                this.b.listen(phoneStateListener, i2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int q() {
        fa e = e();
        if (e != null) {
            return e.l;
        }
        return 0;
    }

    private CellLocation r() {
        TelephonyManager telephonyManager = this.b;
        if (telephonyManager != null) {
            try {
                CellLocation cellLocation = telephonyManager.getCellLocation();
                this.g = null;
                return cellLocation;
            } catch (SecurityException e) {
                this.g = e.getMessage();
            } catch (Throwable th) {
                this.g = null;
                fr.a(th, "CgiManager", "getCellLocation");
            }
        }
        return null;
    }

    private boolean s() {
        if (!this.e && fy.b() - this.n >= Constants.MAX_SESSION_IDLE_TIME) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CellLocation t() {
        if (this.b == null) {
            return null;
        }
        return r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<CellInfo> u() {
        TelephonyManager telephonyManager;
        List<CellInfo> list;
        SecurityException e;
        try {
            if (fy.c() < 18 || (telephonyManager = this.b) == null) {
                return null;
            }
            try {
                list = telephonyManager.getAllCellInfo();
                try {
                    this.g = null;
                } catch (SecurityException e2) {
                    e = e2;
                    this.g = e.getMessage();
                    return list;
                }
            } catch (SecurityException e3) {
                e = e3;
                list = null;
            }
            return list;
        } catch (Throwable th) {
            fr.a(th, "Cgi", "getNewCells");
            return null;
        }
    }

    public final synchronized ArrayList<fa> d() {
        ArrayList<fa> arrayList;
        arrayList = new ArrayList<>();
        ArrayList<fa> arrayList2 = this.l;
        if (arrayList2 != null) {
            Iterator<fa> it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().clone());
            }
        }
        return arrayList;
    }

    public final synchronized fa f() {
        if (this.e) {
            return null;
        }
        ArrayList<fa> arrayList = this.l;
        if (arrayList.size() <= 0) {
            return null;
        }
        Iterator<fa> it = arrayList.iterator();
        while (it.hasNext()) {
            fa next = it.next();
            if (next.n) {
                return next.clone();
            }
        }
        return arrayList.get(0).clone();
    }

    public final int g() {
        int i;
        int q = q();
        int i2 = 0;
        if (this.i) {
            i = 4;
        } else {
            i = 0;
        }
        int i3 = q | i;
        if (this.j) {
            i2 = 8;
        }
        return i3 | i2;
    }

    public final int h() {
        return q() & 3;
    }

    public final TelephonyManager i() {
        return this.b;
    }

    public final synchronized void j() {
        this.g = null;
        this.f5690a.clear();
        this.l.clear();
        this.i = false;
        this.j = false;
    }

    public final String k() {
        return this.g;
    }

    public final String l() {
        return this.k;
    }

    public final synchronized String m() {
        try {
            if (this.e) {
                j();
            }
            StringBuilder sb = this.f;
            if (sb == null) {
                this.f = new StringBuilder();
            } else {
                sb.delete(0, sb.length());
            }
            if (h() == 1) {
                for (int i = 1; i < this.f5690a.size(); i++) {
                    StringBuilder sb2 = this.f;
                    sb2.append("#");
                    sb2.append(this.f5690a.get(i).b);
                    StringBuilder sb3 = this.f;
                    sb3.append("|");
                    sb3.append(this.f5690a.get(i).c);
                    StringBuilder sb4 = this.f;
                    sb4.append("|");
                    sb4.append(this.f5690a.get(i).d);
                }
            }
            for (int i2 = 1; i2 < this.l.size(); i2++) {
                fa faVar = this.l.get(i2);
                int i3 = faVar.l;
                if (!(i3 == 1 || i3 == 3 || i3 == 4 || i3 == 5)) {
                    if (i3 == 2) {
                        StringBuilder sb5 = this.f;
                        sb5.append("#");
                        sb5.append(faVar.l);
                        StringBuilder sb6 = this.f;
                        sb6.append("|");
                        sb6.append(faVar.f5689a);
                        StringBuilder sb7 = this.f;
                        sb7.append("|");
                        sb7.append(faVar.h);
                        StringBuilder sb8 = this.f;
                        sb8.append("|");
                        sb8.append(faVar.i);
                        StringBuilder sb9 = this.f;
                        sb9.append("|");
                        sb9.append(faVar.j);
                    }
                }
                StringBuilder sb10 = this.f;
                sb10.append("#");
                sb10.append(faVar.l);
                StringBuilder sb11 = this.f;
                sb11.append("|");
                sb11.append(faVar.f5689a);
                StringBuilder sb12 = this.f;
                sb12.append("|");
                sb12.append(faVar.b);
                StringBuilder sb13 = this.f;
                sb13.append("|");
                sb13.append(faVar.c);
                StringBuilder sb14 = this.f;
                sb14.append("|");
                sb14.append(faVar.a());
            }
            if (this.f.length() > 0) {
                this.f.deleteCharAt(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f.toString();
    }

    public final boolean n() {
        try {
            TelephonyManager telephonyManager = this.b;
            if (telephonyManager != null) {
                if (!TextUtils.isEmpty(telephonyManager.getSimOperator())) {
                    return true;
                }
                if (!TextUtils.isEmpty(this.b.getSimCountryIso())) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            int a2 = fy.a(fy.c(this.h));
            if (a2 == 0 || a2 == 4 || a2 == 2 || a2 == 5 || a2 == 3) {
                return true;
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public final void b() {
        int checkSelfPermission;
        int checkSelfPermission2;
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                checkSelfPermission = this.h.checkSelfPermission(p78.ACCESS_FINE_LOCATION);
                String str = checkSelfPermission == 0 ? "hasFineLocPerm" : "hasNoFineLocPerm";
                checkSelfPermission2 = this.h.checkSelfPermission("android.permission.READ_PHONE_STATE");
                String str2 = checkSelfPermission2 == 0 ? "hasReadPhoneStatePerm" : "hasNoReadPhoneStatePerm";
                boolean z = true;
                z = !TextUtils.isEmpty(this.t) && !this.t.equals(str);
                if (TextUtils.isEmpty(this.s) || this.s.equals(str2)) {
                }
                if (z) {
                    p();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final synchronized ArrayList<fa> c() {
        ArrayList<fa> arrayList;
        arrayList = new ArrayList<>();
        ArrayList<fa> arrayList2 = this.f5690a;
        if (arrayList2 != null) {
            Iterator<fa> it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().clone());
            }
        }
        return arrayList;
    }

    public final synchronized fa e() {
        if (this.e) {
            return null;
        }
        ArrayList<fa> arrayList = this.f5690a;
        if (arrayList.size() <= 0) {
            return null;
        }
        return arrayList.get(0).clone();
    }

    private static fa a(int i, boolean z, int i2, int i3, int i4, int i5, int i6) {
        fa faVar = new fa(i, z);
        faVar.f5689a = i2;
        faVar.b = i3;
        faVar.c = i4;
        faVar.d = i5;
        faVar.k = i6;
        return faVar;
    }

    private void b(boolean z, boolean z2) {
        if (!this.e && this.b != null && Build.VERSION.SDK_INT >= 29 && this.h.getApplicationInfo().targetSdkVersion >= 29) {
            if (this.q == null) {
                this.q = new a();
            }
            this.b.requestCellInfoUpdate(cr.a().b(), this.q);
            if (z2 || z) {
                for (int i = 0; !this.r && i < 20; i++) {
                    try {
                        Thread.sleep(5L);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        this.j = false;
        TelephonyManager telephonyManager = this.b;
        if (telephonyManager != null) {
            String networkOperator = telephonyManager.getNetworkOperator();
            this.k = networkOperator;
            if (!TextUtils.isEmpty(networkOperator)) {
                this.j = true;
            }
        }
        this.n = fy.b();
    }

    private fa a(CellInfoCdma cellInfoCdma, boolean z) {
        int i;
        int i2;
        if (!(cellInfoCdma == null || cellInfoCdma.getCellIdentity() == null)) {
            CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
            if (cellIdentity.getSystemId() > 0 && cellIdentity.getNetworkId() >= 0 && cellIdentity.getBasestationId() >= 0) {
                CellIdentityCdma cellIdentity2 = cellInfoCdma.getCellIdentity();
                String[] a2 = fy.a(this.b);
                try {
                    i2 = Integer.parseInt(a2[0]);
                } catch (Throwable unused) {
                    i2 = 0;
                }
                try {
                    i = Integer.parseInt(a2[1]);
                    i2 = i2;
                } catch (Throwable unused2) {
                    i = 0;
                    fa a3 = a(2, z, i2, i, 0, 0, cellInfoCdma.getCellSignalStrength().getCdmaDbm());
                    a3.h = cellIdentity2.getSystemId();
                    a3.i = cellIdentity2.getNetworkId();
                    a3.j = cellIdentity2.getBasestationId();
                    a3.f = cellIdentity2.getLatitude();
                    a3.g = cellIdentity2.getLongitude();
                    a3.s = cellInfoCdma.getCellSignalStrength().getCdmaDbm();
                    return a3;
                }
                fa a32 = a(2, z, i2, i, 0, 0, cellInfoCdma.getCellSignalStrength().getCdmaDbm());
                a32.h = cellIdentity2.getSystemId();
                a32.i = cellIdentity2.getNetworkId();
                a32.j = cellIdentity2.getBasestationId();
                a32.f = cellIdentity2.getLatitude();
                a32.g = cellIdentity2.getLongitude();
                a32.s = cellInfoCdma.getCellSignalStrength().getCdmaDbm();
                return a32;
            }
        }
        return null;
    }

    private static fa a(CellInfoGsm cellInfoGsm, boolean z) {
        int bsic;
        int arfcn;
        int timingAdvance;
        if (cellInfoGsm == null || cellInfoGsm.getCellIdentity() == null) {
            return null;
        }
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        fa a2 = a(1, z, cellIdentity.getMcc(), cellIdentity.getMnc(), cellIdentity.getLac(), cellIdentity.getCid(), cellInfoGsm.getCellSignalStrength().getDbm());
        bsic = cellInfoGsm.getCellIdentity().getBsic();
        a2.o = bsic;
        arfcn = cellInfoGsm.getCellIdentity().getArfcn();
        a2.p = arfcn;
        timingAdvance = cellInfoGsm.getCellSignalStrength().getTimingAdvance();
        a2.q = timingAdvance;
        a2.s = cellInfoGsm.getCellSignalStrength().getDbm();
        return a2;
    }

    private static fa a(CellInfoLte cellInfoLte, boolean z) {
        int earfcn;
        if (cellInfoLte == null || cellInfoLte.getCellIdentity() == null) {
            return null;
        }
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        fa a2 = a(3, z, cellIdentity.getMcc(), cellIdentity.getMnc(), cellIdentity.getTac(), cellIdentity.getCi(), cellInfoLte.getCellSignalStrength().getDbm());
        a2.o = cellIdentity.getPci();
        if (Build.VERSION.SDK_INT >= 24) {
            earfcn = cellIdentity.getEarfcn();
            a2.p = earfcn;
        }
        a2.q = cellInfoLte.getCellSignalStrength().getTimingAdvance();
        a2.s = cellInfoLte.getCellSignalStrength().getDbm();
        return a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.loc.fa a(android.telephony.CellInfoNr r14, boolean r15) {
        /*
            if (r14 == 0) goto L_0x0097
            android.telephony.CellIdentity r0 = tb.m7y.a(r14)
            if (r0 != 0) goto L_0x000a
            goto L_0x0097
        L_0x000a:
            android.telephony.CellIdentity r0 = tb.m7y.a(r14)
            android.telephony.CellIdentityNr r0 = tb.b7y.a(r0)
            int r1 = tb.n7y.a(r0)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            if (r1 != r2) goto L_0x0033
            java.lang.String r2 = "HUAWEI"
            java.lang.String r4 = android.os.Build.MANUFACTURER
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0033
            java.lang.String r2 = "getHwTac"
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: all -> 0x002f
            int r1 = com.loc.fu.b(r0, r2, r4)     // Catch: all -> 0x002f
            goto L_0x0033
        L_0x002f:
            r2 = move-exception
            r2.printStackTrace()
        L_0x0033:
            long r4 = tb.c7y.a(r0)
            java.lang.String r2 = tb.d7y.a(r0)     // Catch: all -> 0x004c
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: all -> 0x004c
            java.lang.String r6 = tb.e7y.a(r0)     // Catch: all -> 0x004a
            int r3 = java.lang.Integer.parseInt(r6)     // Catch: all -> 0x004a
            r9 = r2
            r10 = r3
            goto L_0x0053
        L_0x004a:
            r6 = move-exception
            goto L_0x004e
        L_0x004c:
            r6 = move-exception
            r2 = 0
        L_0x004e:
            r6.printStackTrace()
            r9 = r2
            r10 = 0
        L_0x0053:
            android.telephony.CellSignalStrength r2 = tb.a7y.a(r14)
            android.telephony.CellSignalStrengthNr r2 = tb.jvj.a(r2)
            int r13 = tb.nvj.a(r2)
            int r11 = tb.n7y.a(r0)
            r12 = 0
            r7 = 5
            r8 = r15
            com.loc.fa r15 = a(r7, r8, r9, r10, r11, r12, r13)
            r15.e = r4
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r1 <= r2) goto L_0x0077
            r15.c = r3
            goto L_0x0080
        L_0x0077:
            if (r1 <= r3) goto L_0x007e
            r15.c = r3
            r15.q = r1
            goto L_0x0080
        L_0x007e:
            r15.c = r1
        L_0x0080:
            int r1 = tb.y6y.a(r0)
            r15.o = r1
            int r0 = tb.z6y.a(r0)
            r15.p = r0
            android.telephony.CellSignalStrength r14 = tb.a7y.a(r14)
            int r14 = r14.getDbm()
            r15.s = r14
            return r15
        L_0x0097:
            r14 = 0
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fb.a(android.telephony.CellInfoNr, boolean):com.loc.fa");
    }

    private static fa a(CellInfoWcdma cellInfoWcdma, boolean z) {
        int uarfcn;
        if (cellInfoWcdma == null || cellInfoWcdma.getCellIdentity() == null) {
            return null;
        }
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        fa a2 = a(4, z, cellIdentity.getMcc(), cellIdentity.getMnc(), cellIdentity.getLac(), cellIdentity.getCid(), cellInfoWcdma.getCellSignalStrength().getDbm());
        a2.o = cellIdentity.getPsc();
        uarfcn = cellInfoWcdma.getCellIdentity().getUarfcn();
        a2.p = uarfcn;
        a2.s = cellInfoWcdma.getCellSignalStrength().getDbm();
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<dz> a() {
        int earfcn;
        int uarfcn;
        int arfcn;
        int bsic;
        ea eaVar;
        ArrayList arrayList = new ArrayList();
        List<CellInfo> allCellInfo = this.b.getAllCellInfo();
        if (allCellInfo != null) {
            for (CellInfo cellInfo : allCellInfo) {
                if (cellInfo instanceof CellInfoCdma) {
                    CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
                    CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
                    ea eaVar2 = new ea(cellInfo.isRegistered(), true);
                    eaVar2.m = cellIdentity.getLatitude();
                    eaVar2.n = cellIdentity.getLongitude();
                    eaVar2.j = cellIdentity.getSystemId();
                    eaVar2.k = cellIdentity.getNetworkId();
                    eaVar2.l = cellIdentity.getBasestationId();
                    eaVar2.d = cellInfoCdma.getCellSignalStrength().getAsuLevel();
                    eaVar2.c = cellInfoCdma.getCellSignalStrength().getCdmaDbm();
                    eaVar = eaVar2;
                } else if (cellInfo instanceof CellInfoGsm) {
                    CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                    CellIdentityGsm cellIdentity2 = cellInfoGsm.getCellIdentity();
                    eb ebVar = new eb(cellInfo.isRegistered(), true);
                    ebVar.f5660a = String.valueOf(cellIdentity2.getMcc());
                    ebVar.b = String.valueOf(cellIdentity2.getMnc());
                    ebVar.j = cellIdentity2.getLac();
                    ebVar.k = cellIdentity2.getCid();
                    ebVar.c = cellInfoGsm.getCellSignalStrength().getDbm();
                    ebVar.d = cellInfoGsm.getCellSignalStrength().getAsuLevel();
                    if (Build.VERSION.SDK_INT >= 24) {
                        arfcn = cellIdentity2.getArfcn();
                        ebVar.m = arfcn;
                        bsic = cellIdentity2.getBsic();
                        ebVar.n = bsic;
                    }
                    arrayList.add(ebVar);
                } else if (cellInfo instanceof CellInfoLte) {
                    CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                    CellIdentityLte cellIdentity3 = cellInfoLte.getCellIdentity();
                    ec ecVar = new ec(cellInfo.isRegistered());
                    ecVar.f5660a = String.valueOf(cellIdentity3.getMcc());
                    ecVar.b = String.valueOf(cellIdentity3.getMnc());
                    ecVar.l = cellIdentity3.getPci();
                    ecVar.d = cellInfoLte.getCellSignalStrength().getAsuLevel();
                    ecVar.k = cellIdentity3.getCi();
                    ecVar.j = cellIdentity3.getTac();
                    ecVar.n = cellInfoLte.getCellSignalStrength().getTimingAdvance();
                    ecVar.c = cellInfoLte.getCellSignalStrength().getDbm();
                    eaVar = ecVar;
                    if (Build.VERSION.SDK_INT >= 24) {
                        earfcn = cellIdentity3.getEarfcn();
                        ecVar.m = earfcn;
                        eaVar = ecVar;
                    }
                } else {
                    int i = Build.VERSION.SDK_INT;
                    if (cellInfo instanceof CellInfoWcdma) {
                        CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                        CellIdentityWcdma cellIdentity4 = cellInfoWcdma.getCellIdentity();
                        ed edVar = new ed(cellInfo.isRegistered(), true);
                        edVar.f5660a = String.valueOf(cellIdentity4.getMcc());
                        edVar.b = String.valueOf(cellIdentity4.getMnc());
                        edVar.j = cellIdentity4.getLac();
                        edVar.k = cellIdentity4.getCid();
                        edVar.l = cellIdentity4.getPsc();
                        edVar.d = cellInfoWcdma.getCellSignalStrength().getAsuLevel();
                        edVar.c = cellInfoWcdma.getCellSignalStrength().getDbm();
                        if (i >= 24) {
                            uarfcn = cellIdentity4.getUarfcn();
                            edVar.m = uarfcn;
                        }
                        arrayList.add(edVar);
                    }
                }
                arrayList.add(eaVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(CellLocation cellLocation) {
        try {
            String[] a2 = fy.a(this.b);
            this.f5690a.clear();
            if (cellLocation instanceof GsmCellLocation) {
                GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                fa faVar = new fa(1, true);
                faVar.f5689a = fy.e(a2[0]);
                faVar.b = fy.e(a2[1]);
                faVar.c = gsmCellLocation.getLac();
                faVar.d = gsmCellLocation.getCid();
                SignalStrength signalStrength = this.d;
                if (signalStrength != null) {
                    int gsmSignalStrength = signalStrength.getGsmSignalStrength();
                    faVar.s = gsmSignalStrength == 99 ? Integer.MAX_VALUE : b(gsmSignalStrength);
                }
                faVar.r = false;
                this.m.a((ez) faVar);
                this.f5690a.add(faVar);
                return;
            }
            if (cellLocation instanceof CdmaCellLocation) {
                CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                fa faVar2 = new fa(2, true);
                faVar2.f5689a = Integer.parseInt(a2[0]);
                faVar2.b = Integer.parseInt(a2[1]);
                faVar2.f = cdmaCellLocation.getBaseStationLatitude();
                faVar2.g = cdmaCellLocation.getBaseStationLongitude();
                faVar2.h = cdmaCellLocation.getSystemId();
                faVar2.i = cdmaCellLocation.getNetworkId();
                faVar2.j = cdmaCellLocation.getBaseStationId();
                SignalStrength signalStrength2 = this.d;
                if (signalStrength2 != null) {
                    faVar2.s = signalStrength2.getCdmaDbm();
                }
                faVar2.r = false;
                this.m.a((ez) faVar2);
                this.f5690a.add(faVar2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(es esVar) {
        this.u = esVar;
    }

    public final synchronized void a(List<CellInfo> list) {
        try {
            ArrayList<fa> arrayList = this.l;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (list != null && list.size() > 0) {
                for (int i = 0; i < list.size(); i++) {
                    CellInfo cellInfo = list.get(i);
                    if (cellInfo != null) {
                        boolean isRegistered = cellInfo.isRegistered();
                        fa a2 = cellInfo instanceof CellInfoCdma ? a((CellInfoCdma) cellInfo, isRegistered) : cellInfo instanceof CellInfoGsm ? a((CellInfoGsm) cellInfo, isRegistered) : cellInfo instanceof CellInfoWcdma ? a((CellInfoWcdma) cellInfo, isRegistered) : cellInfo instanceof CellInfoLte ? a((CellInfoLte) cellInfo, isRegistered) : (Build.VERSION.SDK_INT < 29 || !k7y.a(cellInfo)) ? null : a(l7y.a(cellInfo), isRegistered);
                        if (a2 != null) {
                            this.m.a((ez) a2);
                            a2.m = (short) Math.min(65535L, this.m.e((ez) a2));
                            a2.r = true;
                            this.l.add(a2);
                        }
                    }
                }
                this.i = false;
                ArrayList<fa> arrayList2 = this.l;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    this.i = true;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(boolean z) {
        PhoneStateListener phoneStateListener;
        this.m.a(z);
        this.n = 0L;
        synchronized (this.p) {
            this.o = true;
        }
        TelephonyManager telephonyManager = this.b;
        if (!(telephonyManager == null || (phoneStateListener = this.c) == null)) {
            try {
                telephonyManager.listen(phoneStateListener, 0);
            } catch (Throwable th) {
                fr.a(th, "CgiManager", "destroy");
            }
        }
        this.c = null;
        this.d = null;
        this.b = null;
    }

    public final void a(boolean z, boolean z2) {
        try {
            this.e = fy.a(this.h);
            if (s()) {
                b(z, z2);
                a(t());
                a(u());
            }
            if (this.e) {
                j();
            }
        } catch (SecurityException e) {
            this.g = e.getMessage();
        } catch (Throwable th) {
            fr.a(th, "CgiManager", "refresh");
        }
    }

    public static boolean a(int i) {
        return i > 0 && i <= 15;
    }
}
