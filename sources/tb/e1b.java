package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class e1b extends g20 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final txd c;

    static {
        t2o.a(729809596);
    }

    public e1b(txd txdVar, f1b f1bVar) {
        super(txdVar, f1bVar);
        this.c = txdVar;
    }

    public static /* synthetic */ Object ipc$super(e1b e1bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1550115775) {
            return super.v((IHomeSubTabController) objArr[0]);
        }
        if (hashCode == 1476067720) {
            return super.C((String) objArr[0]);
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/infoflow/scene/homemainland/callback/HomeMainLandInfoFlowCallBack");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        if (r6.equals("getRightTabWebUrl") == false) goto L_0x002e;
     */
    @Override // tb.g20, tb.fdc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<java.lang.String> C(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.e1b.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "57fb0188"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r5
            r0[r1] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r0)
            java.util.List r6 = (java.util.List) r6
            return r6
        L_0x0018:
            tb.txd r3 = r5.c
            boolean r3 = r3 instanceof tb.waj
            if (r3 != 0) goto L_0x0023
            java.util.List r6 = super.C(r6)
            return r6
        L_0x0023:
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case -1793320594: goto L_0x0046;
                case 1195314547: goto L_0x003a;
                case 2061403050: goto L_0x0030;
                default: goto L_0x002e;
            }
        L_0x002e:
            r0 = -1
            goto L_0x0051
        L_0x0030:
            java.lang.String r4 = "getRightTabWebUrl"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x0051
            goto L_0x002e
        L_0x003a:
            java.lang.String r0 = "getLeftTabWebUrl"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0044
            goto L_0x002e
        L_0x0044:
            r0 = 1
            goto L_0x0051
        L_0x0046:
            java.lang.String r0 = "getLeftAndRightTabWebUrl"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0050
            goto L_0x002e
        L_0x0050:
            r0 = 0
        L_0x0051:
            switch(r0) {
                case 0: goto L_0x0068;
                case 1: goto L_0x005f;
                case 2: goto L_0x0056;
                default: goto L_0x0054;
            }
        L_0x0054:
            r6 = 0
            return r6
        L_0x0056:
            tb.txd r6 = r5.c
            tb.waj r6 = (tb.waj) r6
            java.util.List r6 = r6.S(r2, r1)
            return r6
        L_0x005f:
            tb.txd r6 = r5.c
            tb.waj r6 = (tb.waj) r6
            java.util.List r6 = r6.S(r1, r2)
            return r6
        L_0x0068:
            tb.txd r6 = r5.c
            tb.waj r6 = (tb.waj) r6
            java.util.List r6 = r6.S(r1, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.e1b.C(java.lang.String):java.util.List");
    }

    @Override // tb.g20, tb.fdc
    public JSONObject v(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a39b1c41", new Object[]{this, iHomeSubTabController});
        }
        txd txdVar = this.c;
        if (!(txdVar instanceof waj)) {
            fve.e("HomeMainLandInfoFlowCallBack", "不是MultiTabHelper");
            return super.v(iHomeSubTabController);
        }
        JSONObject P = ((waj) txdVar).P(iHomeSubTabController);
        if (P != null) {
            return P;
        }
        fve.e("HomeMainLandInfoFlowCallBack", "selfTabInformation == null");
        return super.v(iHomeSubTabController);
    }
}
