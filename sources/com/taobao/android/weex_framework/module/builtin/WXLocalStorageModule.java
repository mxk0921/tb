package com.taobao.android.weex_framework.module.builtin;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex.module.WeexInnerModule;
import tb.p4x;
import tb.r3x;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class WXLocalStorageModule extends WeexInnerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String[] METHODS = {"setItem", "removeItem", "getItem"};
    public static final String NAME = "localStorage";

    private WeexValue getItem(WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("2b97ac23", new Object[]{this, weexValueArr});
        }
        argCount(weexValueArr, 1);
        String a2 = p4x.a(getWeexInstance(), getArg(weexValueArr, 0).toStringValueOrNull());
        if (a2 == null) {
            return null;
        }
        return WeexValueImpl.ofString(r3x.k().d(a2));
    }

    public static /* synthetic */ Object ipc$super(WXLocalStorageModule wXLocalStorageModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXLocalStorageModule");
    }

    private void removeItem(WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c254ef95", new Object[]{this, weexValueArr});
            return;
        }
        argCount(weexValueArr, 1);
        String a2 = p4x.a(getWeexInstance(), getArg(weexValueArr, 0).toStringValueOrNull());
        if (a2 != null) {
            r3x.k().g(a2, null);
        }
    }

    private void setItem(WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c9bde73", new Object[]{this, weexValueArr});
            return;
        }
        argCount(weexValueArr, 2);
        r3x.k().f(p4x.a(getWeexInstance(), getArg(weexValueArr, 0).toStringValueOrNull()), getArg(weexValueArr, 1).toStringValueOrNull(), null);
    }

    static {
        t2o.a(982516118);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (r9.equals("setItem") == false) goto L_0x002c;
     */
    @Override // com.taobao.android.weex.module.WeexInnerModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.weex.WeexValue callModuleMethod(com.taobao.android.weex.WeexInstanceImpl r7, java.lang.String r8, java.lang.String r9, com.taobao.android.weex.WeexValue[] r10) throws java.lang.Exception {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.weex_framework.module.builtin.WXLocalStorageModule.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0021
            java.lang.String r4 = "ffafd8f7"
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
            com.taobao.android.weex.WeexValue r7 = (com.taobao.android.weex.WeexValue) r7
            return r7
        L_0x0021:
            r9.hashCode()
            r7 = -1
            int r8 = r9.hashCode()
            switch(r8) {
                case -75439223: goto L_0x0044;
                case 1098253751: goto L_0x0038;
                case 1984670357: goto L_0x002e;
                default: goto L_0x002c;
            }
        L_0x002c:
            r0 = -1
            goto L_0x004e
        L_0x002e:
            java.lang.String r8 = "setItem"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x004e
            goto L_0x002c
        L_0x0038:
            java.lang.String r8 = "removeItem"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x0042
            goto L_0x002c
        L_0x0042:
            r0 = 1
            goto L_0x004e
        L_0x0044:
            java.lang.String r8 = "getItem"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x004d
            goto L_0x002c
        L_0x004d:
            r0 = 0
        L_0x004e:
            switch(r0) {
                case 0: goto L_0x005b;
                case 1: goto L_0x0056;
                case 2: goto L_0x0052;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x0059
        L_0x0052:
            r6.setItem(r10)
            goto L_0x0059
        L_0x0056:
            r6.removeItem(r10)
        L_0x0059:
            r7 = 0
            return r7
        L_0x005b:
            com.taobao.android.weex.WeexValue r7 = r6.getItem(r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_framework.module.builtin.WXLocalStorageModule.callModuleMethod(com.taobao.android.weex.WeexInstanceImpl, java.lang.String, java.lang.String, com.taobao.android.weex.WeexValue[]):com.taobao.android.weex.WeexValue");
    }
}
