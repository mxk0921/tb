package com.taobao.android.weex_framework.module.builtin;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.module.WeexInnerModule;
import java.util.Map;
import tb.eoq;
import tb.f4x;
import tb.pg1;
import tb.qpc;
import tb.r3x;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class WXStorageModule extends WeexInnerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String[] METHODS = {"setItem", "removeItem", "getItem", pg1.ATOM_length, "getAllKeys", "setItemPersistent"};
    public static final String NAME = "storage";
    private final qpc mStorageAdapter = r3x.k();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements qpc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f4x f9973a;

        public a(WXStorageModule wXStorageModule, f4x f4xVar) {
            this.f9973a = f4xVar;
        }

        @Override // tb.qpc.a
        public void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7ef1df3e", new Object[]{this, map});
                return;
            }
            f4x f4xVar = this.f9973a;
            if (f4xVar != null) {
                f4xVar.b(map);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements qpc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f4x f9974a;

        public b(WXStorageModule wXStorageModule, f4x f4xVar) {
            this.f9974a = f4xVar;
        }

        @Override // tb.qpc.a
        public void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7ef1df3e", new Object[]{this, map});
                return;
            }
            f4x f4xVar = this.f9974a;
            if (f4xVar != null) {
                f4xVar.b(map);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements qpc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f4x f9975a;

        public c(WXStorageModule wXStorageModule, f4x f4xVar) {
            this.f9975a = f4xVar;
        }

        @Override // tb.qpc.a
        public void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7ef1df3e", new Object[]{this, map});
                return;
            }
            f4x f4xVar = this.f9975a;
            if (f4xVar != null) {
                f4xVar.b(map);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements qpc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f4x f9976a;

        public d(WXStorageModule wXStorageModule, f4x f4xVar) {
            this.f9976a = f4xVar;
        }

        @Override // tb.qpc.a
        public void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7ef1df3e", new Object[]{this, map});
                return;
            }
            f4x f4xVar = this.f9976a;
            if (f4xVar != null) {
                f4xVar.b(map);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements qpc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f4x f9977a;

        public e(WXStorageModule wXStorageModule, f4x f4xVar) {
            this.f9977a = f4xVar;
        }

        @Override // tb.qpc.a
        public void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7ef1df3e", new Object[]{this, map});
                return;
            }
            f4x f4xVar = this.f9977a;
            if (f4xVar != null) {
                f4xVar.b(map);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements qpc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f4x f9978a;

        public f(WXStorageModule wXStorageModule, f4x f4xVar) {
            this.f9978a = f4xVar;
        }

        @Override // tb.qpc.a
        public void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7ef1df3e", new Object[]{this, map});
                return;
            }
            f4x f4xVar = this.f9978a;
            if (f4xVar != null) {
                f4xVar.b(map);
            }
        }
    }

    private void getAllKeys(WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb08a0dd", new Object[]{this, weexValueArr});
            return;
        }
        argCount(weexValueArr, 1);
        this.mStorageAdapter.b(new e(this, getCallback(weexValueArr, 0)));
    }

    private void getItem(WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cae21367", new Object[]{this, weexValueArr});
            return;
        }
        argCount(weexValueArr, 2);
        String stringValueOrNull = getArg(weexValueArr, 0).toStringValueOrNull();
        f4x callback = getCallback(weexValueArr, 1);
        if (TextUtils.isEmpty(stringValueOrNull)) {
            eoq.d(callback);
        } else {
            this.mStorageAdapter.a(stringValueOrNull, new c(this, callback));
        }
    }

    public static /* synthetic */ Object ipc$super(WXStorageModule wXStorageModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXStorageModule");
    }

    private void length(WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c13c09c4", new Object[]{this, weexValueArr});
            return;
        }
        argCount(weexValueArr, 1);
        this.mStorageAdapter.h(new d(this, getCallback(weexValueArr, 0)));
    }

    private void removeItem(WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c254ef95", new Object[]{this, weexValueArr});
            return;
        }
        argCount(weexValueArr, 2);
        String stringValueOrNull = getArg(weexValueArr, 0).toStringValueOrNull();
        f4x callback = getCallback(weexValueArr, 1);
        if (TextUtils.isEmpty(stringValueOrNull)) {
            eoq.d(callback);
        } else {
            this.mStorageAdapter.g(stringValueOrNull, new b(this, callback));
        }
    }

    private void setItem(WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c9bde73", new Object[]{this, weexValueArr});
            return;
        }
        argCount(weexValueArr, 3);
        String stringValueOrNull = getArg(weexValueArr, 0).toStringValueOrNull();
        String stringValueOrNull2 = getArg(weexValueArr, 1).toStringValueOrNull();
        f4x callback = getCallback(weexValueArr, 2);
        if (TextUtils.isEmpty(stringValueOrNull)) {
            eoq.d(callback);
        } else {
            this.mStorageAdapter.f(stringValueOrNull, stringValueOrNull2, new a(this, callback));
        }
    }

    private void setItemPersistent(WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7378cfea", new Object[]{this, weexValueArr});
            return;
        }
        argCount(weexValueArr, 3);
        String stringValueOrNull = getArg(weexValueArr, 0).toStringValueOrNull();
        String stringValueOrNull2 = getArg(weexValueArr, 1).toStringValueOrNull();
        f4x callback = getCallback(weexValueArr, 2);
        if (TextUtils.isEmpty(stringValueOrNull) || stringValueOrNull2 == null) {
            eoq.d(callback);
        } else {
            this.mStorageAdapter.e(stringValueOrNull, stringValueOrNull2, new f(this, callback));
        }
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule, com.taobao.android.weex.WeexModule
    public void onMainThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24a1dbf", new Object[]{this});
        } else {
            this.mStorageAdapter.close();
        }
    }

    static {
        t2o.a(982516153);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r11.equals("setItemPersistent") == false) goto L_0x002c;
     */
    @Override // com.taobao.android.weex.module.WeexInnerModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.weex.WeexValue callModuleMethod(com.taobao.android.weex.WeexInstanceImpl r9, java.lang.String r10, java.lang.String r11, com.taobao.android.weex.WeexValue[] r12) throws java.lang.Exception {
        /*
            r8 = this;
            r0 = 4
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 5
            com.android.alibaba.ip.runtime.IpChange r6 = com.taobao.android.weex_framework.module.builtin.WXStorageModule.$ipChange
            boolean r7 = r6 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r7 == 0) goto L_0x0021
            java.lang.String r7 = "ffafd8f7"
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r8
            r5[r3] = r9
            r5[r2] = r10
            r5[r1] = r11
            r5[r0] = r12
            java.lang.Object r9 = r6.ipc$dispatch(r7, r5)
            com.taobao.android.weex.WeexValue r9 = (com.taobao.android.weex.WeexValue) r9
            return r9
        L_0x0021:
            r11.hashCode()
            r9 = -1
            int r10 = r11.hashCode()
            switch(r10) {
                case -1106363674: goto L_0x0066;
                case -75439223: goto L_0x005b;
                case 124428031: goto L_0x0050;
                case 1098253751: goto L_0x0044;
                case 1907924748: goto L_0x003a;
                case 1984670357: goto L_0x002e;
                default: goto L_0x002c;
            }
        L_0x002c:
            r0 = -1
            goto L_0x0071
        L_0x002e:
            java.lang.String r10 = "setItem"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0038
            goto L_0x002c
        L_0x0038:
            r0 = 5
            goto L_0x0071
        L_0x003a:
            java.lang.String r10 = "setItemPersistent"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0071
            goto L_0x002c
        L_0x0044:
            java.lang.String r10 = "removeItem"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x004e
            goto L_0x002c
        L_0x004e:
            r0 = 3
            goto L_0x0071
        L_0x0050:
            java.lang.String r10 = "getAllKeys"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0059
            goto L_0x002c
        L_0x0059:
            r0 = 2
            goto L_0x0071
        L_0x005b:
            java.lang.String r10 = "getItem"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0064
            goto L_0x002c
        L_0x0064:
            r0 = 1
            goto L_0x0071
        L_0x0066:
            java.lang.String r10 = "length"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0070
            goto L_0x002c
        L_0x0070:
            r0 = 0
        L_0x0071:
            switch(r0) {
                case 0: goto L_0x0089;
                case 1: goto L_0x0085;
                case 2: goto L_0x0081;
                case 3: goto L_0x007d;
                case 4: goto L_0x0079;
                case 5: goto L_0x0075;
                default: goto L_0x0074;
            }
        L_0x0074:
            goto L_0x008c
        L_0x0075:
            r8.setItem(r12)
            goto L_0x008c
        L_0x0079:
            r8.setItemPersistent(r12)
            goto L_0x008c
        L_0x007d:
            r8.removeItem(r12)
            goto L_0x008c
        L_0x0081:
            r8.getAllKeys(r12)
            goto L_0x008c
        L_0x0085:
            r8.getItem(r12)
            goto L_0x008c
        L_0x0089:
            r8.length(r12)
        L_0x008c:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_framework.module.builtin.WXStorageModule.callModuleMethod(com.taobao.android.weex.WeexInstanceImpl, java.lang.String, java.lang.String, com.taobao.android.weex.WeexValue[]):com.taobao.android.weex.WeexValue");
    }
}
