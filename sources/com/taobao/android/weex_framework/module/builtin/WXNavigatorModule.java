package com.taobao.android.weex_framework.module.builtin;

import android.app.Dialog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.module.WeexInnerModule;
import tb.bvw;
import tb.dwh;
import tb.f4x;
import tb.t2o;
import tb.yio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WXNavigatorModule extends WeexInnerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CANCEL = "Cancel";
    private static final String CANCEL_TITLE = "cancelTitle";
    private static final String DATA = "data";
    private static final String DEFAULT = "default";
    private static final String DURATION = "duration";
    public static final String INSTANCE_ID = "instanceId";
    public static final String LOG_TAG = "MUSNativeApiModel";
    private static final String MESSAGE = "message";
    private static final int MODULE_INTERVAL = 1;
    private static final int MODULE_TIMEOUT = 0;
    public static final String MSG_FAILED = "MUS_FAILED";
    private static final String MSG_PARAM_ERR = "MUS_PARAM_ERR";
    public static final String MSG_SUCCESS = "MUS_SUCCESS";
    public static final String MUS = "com.taobao.android.intent.category.MUS";
    private static final String OK = "OK";
    private static final String OK_TITLE = "okTitle";
    private static final String RESULT = "result";
    public static final String WEEX_POP_ID = "wx_popId";
    private Dialog mActiveDialog;
    public static final String[] METHODS = {"open", "close", "push", "pop", "replace", "addEventListener", "removeEventListener"};
    private static final Object LOCK = new Object();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexValue[] d;

        public a(WeexValue[] weexValueArr) {
            this.d = weexValueArr;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXNavigatorModule$1");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WXNavigatorModule wXNavigatorModule = WXNavigatorModule.this;
            bvw.f(wXNavigatorModule, WXNavigatorModule.access$000(wXNavigatorModule, this.d, 0).toJSONObjectOrNull(), WXNavigatorModule.access$100(WXNavigatorModule.this, this.d, 1), WXNavigatorModule.access$200(WXNavigatorModule.this, this.d, 2));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexValue[] d;

        public b(WeexValue[] weexValueArr) {
            this.d = weexValueArr;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXNavigatorModule$2");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WXNavigatorModule wXNavigatorModule = WXNavigatorModule.this;
            bvw.c(wXNavigatorModule, WXNavigatorModule.access$300(wXNavigatorModule, this.d, 0).toJSONObjectOrNull(), WXNavigatorModule.access$400(WXNavigatorModule.this, this.d, 1), WXNavigatorModule.access$500(WXNavigatorModule.this, this.d, 2));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexValue[] d;

        public c(WeexValue[] weexValueArr) {
            this.d = weexValueArr;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXNavigatorModule$3");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WXNavigatorModule wXNavigatorModule = WXNavigatorModule.this;
            bvw.k(wXNavigatorModule, WXNavigatorModule.access$600(wXNavigatorModule, this.d, 0).toStringValueOrNull(), WXNavigatorModule.access$700(WXNavigatorModule.this, this.d, 1));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexValue[] d;

        public d(WeexValue[] weexValueArr) {
            this.d = weexValueArr;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXNavigatorModule$4");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WXNavigatorModule wXNavigatorModule = WXNavigatorModule.this;
            bvw.h(wXNavigatorModule, WXNavigatorModule.access$800(wXNavigatorModule, this.d, 0).toStringValue(), WXNavigatorModule.access$900(WXNavigatorModule.this, this.d, 1));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexValue[] d;

        public e(WeexValue[] weexValueArr) {
            this.d = weexValueArr;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXNavigatorModule$5");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WXNavigatorModule wXNavigatorModule = WXNavigatorModule.this;
            bvw.l(wXNavigatorModule, WXNavigatorModule.access$1000(wXNavigatorModule, this.d, 0).toStringValue(), WXNavigatorModule.access$1100(WXNavigatorModule.this, this.d, 1));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexValue[] d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a extends yio {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ f4x d;

            public a(f4x f4xVar) {
                this.d = f4xVar;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXNavigatorModule$6$1");
            }

            @Override // tb.yio
            public void e() throws Exception {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4134b145", new Object[]{this});
                } else {
                    this.d.a(new Object[0]);
                }
            }
        }

        public f(WeexValue[] weexValueArr) {
            this.d = weexValueArr;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXNavigatorModule$6");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WeexInstanceImpl weexInstanceImpl = (WeexInstanceImpl) WXNavigatorModule.this.getWeexInstance();
            String stringValueOrNull = WXNavigatorModule.access$1200(WXNavigatorModule.this, this.d, 0).toStringValueOrNull();
            f4x access$1300 = WXNavigatorModule.access$1300(WXNavigatorModule.this, this.d, 1);
            if (!"goback".equalsIgnoreCase(stringValueOrNull)) {
                dwh.f("NavigatorModule", "Unknown event name: " + stringValueOrNull);
            } else if (access$1300 != null) {
                weexInstanceImpl.addGoBackEventCallback(new a(access$1300));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexValue[] d;

        public g(WeexValue[] weexValueArr) {
            this.d = weexValueArr;
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXNavigatorModule$7");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            String stringValueOrNull = WXNavigatorModule.access$1400(WXNavigatorModule.this, this.d, 0).toStringValueOrNull();
            WeexInstanceImpl weexInstanceImpl = (WeexInstanceImpl) WXNavigatorModule.this.getWeexInstance();
            if ("goback".equalsIgnoreCase(stringValueOrNull)) {
                weexInstanceImpl.clearGoBackEventCallbacks();
                return;
            }
            dwh.f("NavigatorModule", "Unknown event name: " + stringValueOrNull);
        }
    }

    public static /* synthetic */ WeexValue access$000(WXNavigatorModule wXNavigatorModule, WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("27204851", new Object[]{wXNavigatorModule, weexValueArr, new Integer(i)});
        }
        return wXNavigatorModule.getArg(weexValueArr, i);
    }

    public static /* synthetic */ f4x access$100(WXNavigatorModule wXNavigatorModule, WeexValue[] weexValueArr, int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4x) ipChange.ipc$dispatch("20b81550", new Object[]{wXNavigatorModule, weexValueArr, new Integer(i)});
        }
        return wXNavigatorModule.getCallback(weexValueArr, i);
    }

    public static /* synthetic */ WeexValue access$1000(WXNavigatorModule wXNavigatorModule, WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("1c9a87c2", new Object[]{wXNavigatorModule, weexValueArr, new Integer(i)});
        }
        return wXNavigatorModule.getArg(weexValueArr, i);
    }

    public static /* synthetic */ f4x access$1100(WXNavigatorModule wXNavigatorModule, WeexValue[] weexValueArr, int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4x) ipChange.ipc$dispatch("9dd4d43f", new Object[]{wXNavigatorModule, weexValueArr, new Integer(i)});
        }
        return wXNavigatorModule.getCallback(weexValueArr, i);
    }

    public static /* synthetic */ WeexValue access$1200(WXNavigatorModule wXNavigatorModule, WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("cdbc6c00", new Object[]{wXNavigatorModule, weexValueArr, new Integer(i)});
        }
        return wXNavigatorModule.getArg(weexValueArr, i);
    }

    public static /* synthetic */ f4x access$1300(WXNavigatorModule wXNavigatorModule, WeexValue[] weexValueArr, int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4x) ipChange.ipc$dispatch("b4d49f41", new Object[]{wXNavigatorModule, weexValueArr, new Integer(i)});
        }
        return wXNavigatorModule.getCallback(weexValueArr, i);
    }

    public static /* synthetic */ WeexValue access$1400(WXNavigatorModule wXNavigatorModule, WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("7ede503e", new Object[]{wXNavigatorModule, weexValueArr, new Integer(i)});
        }
        return wXNavigatorModule.getArg(weexValueArr, i);
    }

    public static /* synthetic */ f4x access$200(WXNavigatorModule wXNavigatorModule, WeexValue[] weexValueArr, int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4x) ipChange.ipc$dispatch("2c37fad1", new Object[]{wXNavigatorModule, weexValueArr, new Integer(i)});
        }
        return wXNavigatorModule.getCallback(weexValueArr, i);
    }

    public static /* synthetic */ WeexValue access$300(WXNavigatorModule wXNavigatorModule, WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("b0d31eae", new Object[]{wXNavigatorModule, weexValueArr, new Integer(i)});
        }
        return wXNavigatorModule.getArg(weexValueArr, i);
    }

    public static /* synthetic */ f4x access$400(WXNavigatorModule wXNavigatorModule, WeexValue[] weexValueArr, int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4x) ipChange.ipc$dispatch("4337c5d3", new Object[]{wXNavigatorModule, weexValueArr, new Integer(i)});
        }
        return wXNavigatorModule.getCallback(weexValueArr, i);
    }

    public static /* synthetic */ f4x access$500(WXNavigatorModule wXNavigatorModule, WeexValue[] weexValueArr, int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4x) ipChange.ipc$dispatch("4eb7ab54", new Object[]{wXNavigatorModule, weexValueArr, new Integer(i)});
        }
        return wXNavigatorModule.getCallback(weexValueArr, i);
    }

    public static /* synthetic */ WeexValue access$600(WXNavigatorModule wXNavigatorModule, WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("3a85f50b", new Object[]{wXNavigatorModule, weexValueArr, new Integer(i)});
        }
        return wXNavigatorModule.getArg(weexValueArr, i);
    }

    public static /* synthetic */ f4x access$700(WXNavigatorModule wXNavigatorModule, WeexValue[] weexValueArr, int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4x) ipChange.ipc$dispatch("65b77656", new Object[]{wXNavigatorModule, weexValueArr, new Integer(i)});
        }
        return wXNavigatorModule.getCallback(weexValueArr, i);
    }

    public static /* synthetic */ WeexValue access$800(WXNavigatorModule wXNavigatorModule, WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("eba7d949", new Object[]{wXNavigatorModule, weexValueArr, new Integer(i)});
        }
        return wXNavigatorModule.getArg(weexValueArr, i);
    }

    public static /* synthetic */ f4x access$900(WXNavigatorModule wXNavigatorModule, WeexValue[] weexValueArr, int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4x) ipChange.ipc$dispatch("7cb74158", new Object[]{wXNavigatorModule, weexValueArr, new Integer(i)});
        }
        return wXNavigatorModule.getCallback(weexValueArr, i);
    }

    private void addEventListener(WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb0b022b", new Object[]{this, weexValueArr});
        } else {
            executeInMain(new f(weexValueArr));
        }
    }

    public static /* synthetic */ Object ipc$super(WXNavigatorModule wXNavigatorModule, String str, Object... objArr) {
        if (str.hashCode() == -498459201) {
            super.onMainThreadDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXNavigatorModule");
    }

    private void removeEventListener(WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18942a28", new Object[]{this, weexValueArr});
        } else {
            executeInMain(new g(weexValueArr));
        }
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule, com.taobao.android.weex.WeexModule
    public void onMainThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24a1dbf", new Object[]{this});
            return;
        }
        super.onMainThreadDestroy();
        Dialog dialog = this.mActiveDialog;
        if (dialog != null && dialog.isShowing()) {
            this.mActiveDialog.dismiss();
        }
    }

    static {
        t2o.a(982516142);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (r11.equals("push") == false) goto L_0x002c;
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
            com.android.alibaba.ip.runtime.IpChange r6 = com.taobao.android.weex_framework.module.builtin.WXNavigatorModule.$ipChange
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
                case -625809843: goto L_0x0073;
                case -541487286: goto L_0x0067;
                case 111185: goto L_0x005b;
                case 3417674: goto L_0x004f;
                case 3452698: goto L_0x0045;
                case 94756344: goto L_0x003a;
                case 1094496948: goto L_0x002e;
                default: goto L_0x002c;
            }
        L_0x002c:
            r0 = -1
            goto L_0x007d
        L_0x002e:
            java.lang.String r10 = "replace"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0038
            goto L_0x002c
        L_0x0038:
            r0 = 6
            goto L_0x007d
        L_0x003a:
            java.lang.String r10 = "close"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0043
            goto L_0x002c
        L_0x0043:
            r0 = 5
            goto L_0x007d
        L_0x0045:
            java.lang.String r10 = "push"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x007d
            goto L_0x002c
        L_0x004f:
            java.lang.String r10 = "open"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0059
            goto L_0x002c
        L_0x0059:
            r0 = 3
            goto L_0x007d
        L_0x005b:
            java.lang.String r10 = "pop"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0065
            goto L_0x002c
        L_0x0065:
            r0 = 2
            goto L_0x007d
        L_0x0067:
            java.lang.String r10 = "removeEventListener"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0071
            goto L_0x002c
        L_0x0071:
            r0 = 1
            goto L_0x007d
        L_0x0073:
            java.lang.String r10 = "addEventListener"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x007c
            goto L_0x002c
        L_0x007c:
            r0 = 0
        L_0x007d:
            switch(r0) {
                case 0: goto L_0x00b2;
                case 1: goto L_0x00ae;
                case 2: goto L_0x00a5;
                case 3: goto L_0x009c;
                case 4: goto L_0x0093;
                case 5: goto L_0x008a;
                case 6: goto L_0x0081;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x00b5
        L_0x0081:
            com.taobao.android.weex_framework.module.builtin.WXNavigatorModule$e r9 = new com.taobao.android.weex_framework.module.builtin.WXNavigatorModule$e
            r9.<init>(r12)
            r8.executeInMain(r9)
            goto L_0x00b5
        L_0x008a:
            com.taobao.android.weex_framework.module.builtin.WXNavigatorModule$b r9 = new com.taobao.android.weex_framework.module.builtin.WXNavigatorModule$b
            r9.<init>(r12)
            r8.executeInMain(r9)
            goto L_0x00b5
        L_0x0093:
            com.taobao.android.weex_framework.module.builtin.WXNavigatorModule$c r9 = new com.taobao.android.weex_framework.module.builtin.WXNavigatorModule$c
            r9.<init>(r12)
            r8.executeInMain(r9)
            goto L_0x00b5
        L_0x009c:
            com.taobao.android.weex_framework.module.builtin.WXNavigatorModule$a r9 = new com.taobao.android.weex_framework.module.builtin.WXNavigatorModule$a
            r9.<init>(r12)
            r8.executeInMain(r9)
            goto L_0x00b5
        L_0x00a5:
            com.taobao.android.weex_framework.module.builtin.WXNavigatorModule$d r9 = new com.taobao.android.weex_framework.module.builtin.WXNavigatorModule$d
            r9.<init>(r12)
            r8.executeInMain(r9)
            goto L_0x00b5
        L_0x00ae:
            r8.removeEventListener(r12)
            goto L_0x00b5
        L_0x00b2:
            r8.addEventListener(r12)
        L_0x00b5:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_framework.module.builtin.WXNavigatorModule.callModuleMethod(com.taobao.android.weex.WeexInstanceImpl, java.lang.String, java.lang.String, com.taobao.android.weex.WeexValue[]):com.taobao.android.weex.WeexValue");
    }
}
