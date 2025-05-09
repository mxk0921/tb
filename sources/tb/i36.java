package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i36 extends m8 implements hdb, w8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final i36 b = new i36();

    static {
        t2o.a(444596690);
        t2o.a(144703491);
        t2o.a(336592930);
    }

    public static /* synthetic */ Object ipc$super(i36 i36Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/eventchain/DXLogAbility");
    }

    @Override // tb.w8
    public m8 build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m8) ipChange.ipc$dispatch("e57df123", new Object[]{this, obj});
        }
        return b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (r7.equals("log_change") == false) goto L_0x002c;
     */
    @Override // tb.hdb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.ability.result.ExecuteResult execute(java.lang.String r7, tb.kdb r8, java.util.Map<java.lang.String, ?> r9, tb.vq r10) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.i36.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0021
            java.lang.String r4 = "b2cd7d0b"
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r7 = 3
            r5[r7] = r9
            r7 = 4
            r5[r7] = r10
            java.lang.Object r7 = r3.ipc$dispatch(r4, r5)
            com.alibaba.ability.result.ExecuteResult r7 = (com.alibaba.ability.result.ExecuteResult) r7
            return r7
        L_0x0021:
            r7.hashCode()
            r8 = -1
            int r10 = r7.hashCode()
            switch(r10) {
                case 3327392: goto L_0x0044;
                case 3327393: goto L_0x0038;
                case 1955068171: goto L_0x002e;
                default: goto L_0x002c;
            }
        L_0x002c:
            r0 = -1
            goto L_0x004f
        L_0x002e:
            java.lang.String r10 = "log_change"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x004f
            goto L_0x002c
        L_0x0038:
            java.lang.String r10 = "loge"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x0042
            goto L_0x002c
        L_0x0042:
            r0 = 1
            goto L_0x004f
        L_0x0044:
            java.lang.String r10 = "logd"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x004e
            goto L_0x002c
        L_0x004e:
            r0 = 0
        L_0x004f:
            switch(r0) {
                case 0: goto L_0x005d;
                case 1: goto L_0x0053;
                case 2: goto L_0x0060;
                default: goto L_0x0052;
            }
        L_0x0052:
            goto L_0x0060
        L_0x0053:
            java.lang.String r7 = "DXLogAbility"
            java.lang.String r8 = com.alibaba.fastjson.JSON.toJSONString(r9)
            android.util.Log.e(r7, r8)
            goto L_0x0060
        L_0x005d:
            com.alibaba.fastjson.JSON.toJSONString(r9)
        L_0x0060:
            com.alibaba.ability.result.FinishResult r7 = new com.alibaba.ability.result.FinishResult
            r7.<init>()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.i36.execute(java.lang.String, tb.kdb, java.util.Map, tb.vq):com.alibaba.ability.result.ExecuteResult");
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        new StringBuilder("onExecuteWithData").append(JSON.toJSONString(n8Var));
        return new f8(new JSONObject());
    }
}
