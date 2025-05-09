package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dkx extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_SKINSWITCH = -7288660920866700495L;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f17887a;

    static {
        t2o.a(745538096);
    }

    public dkx(boolean z) {
        this.f17887a = z;
    }

    public static /* synthetic */ Object ipc$super(dkx dkxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/dinamicX/dataParser/XDinamicSkinSwitch");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    @Override // tb.nb5, tb.evb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object evalWithArgs(java.lang.Object[] r6, com.taobao.android.dinamicx.DXRuntimeContext r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.dkx.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "ccd8bd96"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            r6 = 2
            r4[r6] = r7
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            return r6
        L_0x0019:
            if (r6 != 0) goto L_0x001e
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L_0x001e:
            int r7 = r6.length
            if (r7 <= 0) goto L_0x002a
            r7 = r6[r1]
            boolean r2 = r7 instanceof java.lang.String
            if (r2 == 0) goto L_0x002a
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x002b
        L_0x002a:
            r7 = 0
        L_0x002b:
            tb.ish r2 = tb.ish.g()
            java.lang.String r2 = r2.b
            int r3 = r6.length
            if (r3 <= r0) goto L_0x005e
            r6 = r6[r0]
            boolean r3 = r6 instanceof java.lang.String
            if (r3 == 0) goto L_0x005e
            boolean r3 = r5.f17887a
            if (r3 == 0) goto L_0x0043
            boolean r6 = com.taobao.mytaobao.pagev2.dataservice.MtbDataServiceFacade.m()
            goto L_0x0050
        L_0x0043:
            java.lang.String r6 = (java.lang.String) r6
            if (r2 == 0) goto L_0x004e
            boolean r6 = r2.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            r6 = r0
        L_0x0050:
            if (r6 == 0) goto L_0x005b
            boolean r6 = r5.a(r7)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L_0x005b:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L_0x005e:
            boolean r6 = r5.a(r7)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dkx.evalWithArgs(java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):java.lang.Object");
    }

    public final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a9c4568", new Object[]{this, str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        if ("useSkin".equalsIgnoreCase(str)) {
            return j1q.b();
        }
        return !j1q.b();
    }
}
