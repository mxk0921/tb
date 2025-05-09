package com.mobile.auth.gatewayauth.manager;

import com.mobile.auth.O0o;
import com.mobile.auth.O0o0;
import com.mobile.auth.O0o000;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.model.VendorConfig;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O0000OOo {
    private SystemManager O000000o;
    private O000000o O00000Oo;
    private O000000o O00000o;
    private O000000o O00000o0;
    private O00000o O00000oO;

    public O0000OOo(SystemManager systemManager, O00000o o00000o) {
        this.O000000o = systemManager;
        this.O00000oO = o00000o;
        this.O00000Oo = new O0o000(systemManager.O00000oO(), this.O00000oO);
        this.O00000o0 = new O0o(this.O000000o.O00000oO(), this.O00000oO);
        this.O00000o = new O0o0(this.O000000o.O00000oO(), this.O00000oO);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0045 A[Catch: all -> 0x0021, TRY_LEAVE, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0001, B:10:0x0017, B:15:0x0023, B:18:0x002d, B:26:0x003f, B:28:0x0042, B:30:0x0045), top: B:37:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.mobile.auth.gatewayauth.manager.O000000o O000000o(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            int r1 = r6.hashCode()     // Catch: all -> 0x0021
            r2 = -1350608857(0xffffffffaf7f5827, float:-2.3223433E-10)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x002d
            r2 = 95009260(0x5a9b9ec, float:1.596098E-35)
            if (r1 == r2) goto L_0x0023
            r2 = 880617272(0x347d2738, float:2.3576729E-7)
            if (r1 == r2) goto L_0x0017
            goto L_0x0037
        L_0x0017:
            java.lang.String r1 = "cm_zyhl"
            boolean r6 = r6.equals(r1)     // Catch: all -> 0x0021
            if (r6 == 0) goto L_0x0037
            r6 = 0
            goto L_0x0038
        L_0x0021:
            r6 = move-exception
            goto L_0x0048
        L_0x0023:
            java.lang.String r1 = "cu_xw"
            boolean r6 = r6.equals(r1)     // Catch: all -> 0x0021
            if (r6 == 0) goto L_0x0037
            r6 = 1
            goto L_0x0038
        L_0x002d:
            java.lang.String r1 = "ct_sjl"
            boolean r6 = r6.equals(r1)     // Catch: all -> 0x0021
            if (r6 == 0) goto L_0x0037
            r6 = 2
            goto L_0x0038
        L_0x0037:
            r6 = -1
        L_0x0038:
            if (r6 == 0) goto L_0x0045
            if (r6 == r4) goto L_0x0042
            if (r6 == r3) goto L_0x003f
            return r0
        L_0x003f:
            com.mobile.auth.gatewayauth.manager.O000000o r6 = r5.O00000o     // Catch: all -> 0x0021
            return r6
        L_0x0042:
            com.mobile.auth.gatewayauth.manager.O000000o r6 = r5.O00000o0     // Catch: all -> 0x0021
            return r6
        L_0x0045:
            com.mobile.auth.gatewayauth.manager.O000000o r6 = r5.O00000Oo     // Catch: all -> 0x0021
            return r6
        L_0x0048:
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r6)     // Catch: all -> 0x004c
            return r0
        L_0x004c:
            r6 = move-exception
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.gatewayauth.manager.O0000OOo.O000000o(java.lang.String):com.mobile.auth.gatewayauth.manager.O000000o");
    }

    public List<O000000o> O000000o() {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.O00000Oo);
            arrayList.add(this.O00000o0);
            arrayList.add(this.O00000o);
            return arrayList;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public boolean O000000o(VendorSdkInfoManager vendorSdkInfoManager) {
        int i;
        try {
            VendorConfig O000000o = vendorSdkInfoManager.O000000o(1);
            VendorConfig O000000o2 = vendorSdkInfoManager.O000000o(2);
            VendorConfig O000000o3 = vendorSdkInfoManager.O000000o(3);
            if (O000000o != null) {
                this.O00000Oo.O000000o(O000000o.getVendorAccessId(), O000000o.getVendorAccessSecret());
                i = 1;
            } else {
                i = 0;
            }
            if (O000000o2 != null) {
                this.O00000o0.O000000o(O000000o2.getVendorAccessId(), O000000o2.getVendorAccessSecret());
                i++;
            }
            if (O000000o3 != null) {
                this.O00000o.O000000o(O000000o3.getVendorAccessId(), O000000o3.getVendorAccessSecret());
                i++;
            }
            return i == 3;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }
}
