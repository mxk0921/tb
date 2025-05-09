package com.alibaba.wireless.security.middletierplugin.open.fc;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.alibaba.wireless.security.SecExceptionCode;
import com.alibaba.wireless.security.middletierplugin.SecurityGuardMiddleTierPlugin;
import com.alibaba.wireless.security.middletierplugin.open.fc.strategy.C0129;
import com.alibaba.wireless.security.middletierplugin.open.fc.strategy.IStrategyCallback;
import com.alibaba.wireless.security.middletierplugin.open.fc.strategy.StrategyCenter;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.alibaba.wireless.security.open.middletier.fc.FCAction;
import com.alibaba.wireless.security.open.middletier.fc.IFCActionCallback;
import com.alibaba.wireless.security.open.middletier.fc.IFCComponent;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class FCComponent {

    /* renamed from: а  reason: contains not printable characters */
    private static volatile Object f70 = null;

    /* renamed from: б  reason: contains not printable characters */
    private static ISecurityGuardPlugin f71 = null;

    /* renamed from: в  reason: contains not printable characters */
    private static FCComponent f72 = null;

    /* renamed from: г  reason: contains not printable characters */
    private static StrategyCenter f73 = null;

    /* renamed from: д  reason: contains not printable characters */
    private static volatile Handler f74 = null;

    /* renamed from: е  reason: contains not printable characters */
    private static int f75 = 0;

    /* renamed from: ж  reason: contains not printable characters */
    private static final String f76 = "needFCProcessOrNot";

    /* renamed from: з  reason: contains not printable characters */
    private static final String f77 = "processFCContent";

    /* renamed from: и  reason: contains not printable characters */
    private static final String f78 = "needFCProcessOrNotV2";

    /* renamed from: й  reason: contains not printable characters */
    private static final String f79 = "processFCContentV2";

    /* renamed from: к  reason: contains not printable characters */
    private static final String f80 = "getFCPluginVersion";

    /* renamed from: л  reason: contains not printable characters */
    private static final String f81 = "secDelay";

    /* renamed from: м  reason: contains not printable characters */
    private static final String f82 = "hashCode";

    /* renamed from: н  reason: contains not printable characters */
    private static final String f83 = "equals";

    /* renamed from: о  reason: contains not printable characters */
    private static final String f84 = "toString";

    /* renamed from: ё  reason: contains not printable characters */
    private static final String f85 = "setUp";

    /* renamed from: com.alibaba.wireless.security.middletierplugin.open.fc.FCComponent$а  reason: contains not printable characters */
    /* loaded from: classes.dex */
    static class C0121 implements InvocationHandler {
        C0121() {
        }

        /* renamed from: а  reason: contains not printable characters */
        private boolean m85(Object obj, Object obj2) {
            if (obj2 != null && obj2.getClass() == obj.getClass()) {
                try {
                    return equals(Proxy.getInvocationHandler(obj2));
                } catch (Exception unused) {
                }
            }
            return false;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            char c;
            String name = method.getName();
            switch (name.hashCode()) {
                case -1776922004:
                    if (name.equals("toString")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1295482945:
                    if (name.equals(FCComponent.f83)) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -674205102:
                    if (name.equals(FCComponent.f80)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -557739155:
                    if (name.equals(FCComponent.f77)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109328029:
                    if (name.equals(FCComponent.f85)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 147696667:
                    if (name.equals(FCComponent.f82)) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 278841396:
                    if (name.equals(FCComponent.f76)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 883586761:
                    if (name.equals(FCComponent.f79)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1678611920:
                    if (name.equals(FCComponent.f78)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    FCComponent.f72.setUp((Context) objArr[0], (HashMap) objArr[1]);
                    return null;
                case 1:
                    return Boolean.valueOf(FCComponent.f72.needFCProcessOrNot(((Integer) objArr[0]).intValue(), (HashMap) objArr[1], (IFCComponent.ResponseHeaderType) objArr[2]));
                case 2:
                    return Boolean.valueOf(FCComponent.f72.needFCProcessOrNotV2(((Integer) objArr[0]).intValue(), (String) objArr[1]));
                case 3:
                    FCComponent.f72.processFCContent(((Integer) objArr[0]).intValue(), (HashMap) objArr[1], (IFCActionCallback) objArr[2], (IFCComponent.ResponseHeaderType) objArr[3]);
                    return null;
                case 4:
                    FCComponent.f72.processFCContentV2((String) objArr[0], (IFCActionCallback) objArr[1]);
                    return null;
                case 5:
                    return FCComponent.f72.getFCPluginVersion();
                case 6:
                    return obj.getClass().getName() + "&ID=" + hashCode();
                case 7:
                    return Boolean.valueOf(m85(obj, objArr[0]));
                case '\b':
                    return Integer.valueOf(hashCode());
                default:
                    return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.alibaba.wireless.security.middletierplugin.open.fc.FCComponent$б  reason: contains not printable characters */
    /* loaded from: classes.dex */
    public class C0122 implements IStrategyCallback {

        /* renamed from: а  reason: contains not printable characters */
        final /* synthetic */ IFCActionCallback f86;

        C0122(IFCActionCallback iFCActionCallback) {
            this.f86 = iFCActionCallback;
        }

        @Override // com.alibaba.wireless.security.middletierplugin.open.fc.strategy.IStrategyCallback
        public void onPreStrategy(long j, boolean z) {
            String str = "[processFCContent][processFCContent] onPreStrategy : " + j + " , hasUI = " + z;
            this.f86.onPreAction(j, z);
        }

        @Override // com.alibaba.wireless.security.middletierplugin.open.fc.strategy.IStrategyCallback
        public void onStrategy(long j, C0129.EnumC0130 r12, long j2, HashMap hashMap) {
            StringBuilder sb = new StringBuilder();
            sb.append("[processFCContent][processFCContent] onStrategy : ");
            sb.append(j);
            sb.append(" , action = ");
            sb.append(r12);
            sb.append(" ,subAction = ");
            sb.append(j2);
            sb.append(" ,actionInfo = ");
            sb.append(hashMap == null ? "null" : hashMap.toString());
            sb.toString();
            this.f86.onAction(j, FCComponent.this.m81(r12), j2, hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.alibaba.wireless.security.middletierplugin.open.fc.FCComponent$в  reason: contains not printable characters */
    /* loaded from: classes.dex */
    public class C0123 implements IStrategyCallback {

        /* renamed from: а  reason: contains not printable characters */
        final /* synthetic */ IFCActionCallback f88;

        C0123(IFCActionCallback iFCActionCallback) {
            this.f88 = iFCActionCallback;
        }

        @Override // com.alibaba.wireless.security.middletierplugin.open.fc.strategy.IStrategyCallback
        public void onPreStrategy(long j, boolean z) {
            String str = "[FCComponent][processFCContentV2] onPreStrategy : " + j + " , hasUI = " + z;
            this.f88.onPreAction(j, z);
        }

        @Override // com.alibaba.wireless.security.middletierplugin.open.fc.strategy.IStrategyCallback
        public void onStrategy(long j, C0129.EnumC0130 r12, long j2, HashMap hashMap) {
            StringBuilder sb = new StringBuilder();
            sb.append("[FCComponent][processFCContentV2] onStrategy : ");
            sb.append(j);
            sb.append(" , action = ");
            sb.append(r12);
            sb.append(" ,subAction = ");
            sb.append(j2);
            sb.append(" ,actionInfo = ");
            sb.append(hashMap == null ? "null" : hashMap.toString());
            sb.toString();
            this.f88.onAction(j, FCComponent.this.m81(r12), j2, hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.alibaba.wireless.security.middletierplugin.open.fc.FCComponent$г  reason: contains not printable characters */
    /* loaded from: classes.dex */
    public class RunnableC0124 implements Runnable {

        /* renamed from: а  reason: contains not printable characters */
        final /* synthetic */ HashMap f90;

        /* renamed from: б  reason: contains not printable characters */
        final /* synthetic */ int f91;

        RunnableC0124(HashMap hashMap, int i) {
            this.f90 = hashMap;
            this.f91 = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                HashMap hashMap = new HashMap();
                for (String str : this.f90.keySet()) {
                    hashMap.put(str, this.f90.get(str) instanceof List ? ((List) this.f90.get(str)).get(0) : this.f90.get(str));
                }
                hashMap.put("resCode", Integer.valueOf(this.f91));
                FCComponent.f71.getRouter().doCommand(70504, Integer.valueOf(this.f91), hashMap);
            } catch (Exception unused) {
            }
        }
    }

    public FCComponent(ISecurityGuardPlugin iSecurityGuardPlugin) throws ClassNotFoundException {
        f71 = iSecurityGuardPlugin;
        C0135.m124(iSecurityGuardPlugin);
        C0142.m146(f71);
    }

    public static int getAndroid14Switch() {
        return f75;
    }

    public static String getPluginVersion() {
        try {
            return f71.getSGPluginInfo().getVersion();
        } catch (Exception e) {
            String str = "getPluginVersion : " + e.getMessage();
            return "";
        }
    }

    public static Object getProxyInstance(Class cls, ISecurityGuardPlugin iSecurityGuardPlugin) throws ClassNotFoundException {
        if (f70 == null) {
            synchronized (FCComponent.class) {
                if (f70 == null && iSecurityGuardPlugin != null) {
                    f72 = new FCComponent(iSecurityGuardPlugin);
                    f70 = SecurityGuardMiddleTierPlugin.getProxyInstance(cls, new C0121());
                }
            }
        }
        return f70;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: г  reason: contains not printable characters */
    public FCAction.FCMainAction m81(C0129.EnumC0130 r3) {
        return r3 == C0129.EnumC0130.SUCCESS ? FCAction.FCMainAction.SUCCESS : r3 == C0129.EnumC0130.FAIL ? FCAction.FCMainAction.FAIL : r3 == C0129.EnumC0130.CANCEL ? FCAction.FCMainAction.CANCEL : r3 == C0129.EnumC0130.RETRY ? FCAction.FCMainAction.RETRY : r3 == C0129.EnumC0130.TIMEOUT ? FCAction.FCMainAction.TIMEOUT : FCAction.FCMainAction.FAIL;
    }

    /* renamed from: д  reason: contains not printable characters */
    private Object m82(int i, String str, int i2, Object obj) {
        try {
            return f71.getRouter().doCommand(13204, Integer.valueOf(i), str, Integer.valueOf(i2), obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: е  reason: contains not printable characters */
    private void m83() {
        Object obj;
        try {
            obj = m82(0, "atsk14", 0, 1);
        } catch (Exception e) {
            e.printStackTrace();
            obj = null;
        }
        if (obj instanceof Integer) {
            f75 = ((Integer) obj).intValue();
        }
    }

    /* renamed from: ё  reason: contains not printable characters */
    private void m84(int i, HashMap hashMap) {
        if (f74 == null) {
            synchronized (FCComponent.class) {
                if (f74 == null) {
                    HandlerThread handlerThread = new HandlerThread("FC");
                    handlerThread.start();
                    f74 = new Handler(handlerThread.getLooper());
                }
            }
        }
        if (f74 != null) {
            f74.post(new RunnableC0124(hashMap, i));
        }
    }

    public String getFCPluginVersion() {
        try {
            return f71.getSGPluginInfo().getVersion();
        } catch (Exception e) {
            String str = "getPluginVersion : " + e.getMessage();
            return "";
        }
    }

    public int init(ISecurityGuardPlugin iSecurityGuardPlugin, Object... objArr) {
        f71 = iSecurityGuardPlugin;
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean needFCProcessOrNot(int r16, java.util.HashMap r17, com.alibaba.wireless.security.open.middletier.fc.IFCComponent.ResponseHeaderType r18) throws com.alibaba.wireless.security.open.SecException {
        /*
            r15 = this;
            r0 = r16
            r1 = r17
            r2 = 419(0x1a3, float:5.87E-43)
            if (r0 != r2) goto L_0x004a
            int r3 = r18.ordinal()
            boolean r3 = com.alibaba.wireless.security.middletierplugin.open.fc.C0135.m127(r3, r1)
            if (r3 == 0) goto L_0x004a
            r4 = 100105(0x18709, float:1.40277E-40)
            r5 = 0
            r6 = 7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "Strategycenter="
            r3.append(r8)
            com.alibaba.wireless.security.middletierplugin.open.fc.strategy.StrategyCenter r8 = com.alibaba.wireless.security.middletierplugin.open.fc.FCComponent.f73
            if (r8 != 0) goto L_0x0029
            java.lang.String r8 = "0"
            goto L_0x002b
        L_0x0029:
            java.lang.String r8 = "1"
        L_0x002b:
            r3.append(r8)
            java.lang.String r10 = r3.toString()
            int r3 = r18.ordinal()
            r8 = 0
            java.lang.String r9 = "bx-uuid"
            java.lang.String r11 = "uuid="
            java.lang.String r12 = com.alibaba.wireless.security.middletierplugin.open.fc.C0139.m139(r3, r1, r8, r9, r11)
            r13 = 7
            r14 = 0
            java.lang.String r8 = ""
            java.lang.String r9 = "FccomponentNeedfcprocessornot"
            java.lang.String r11 = ""
            com.alibaba.wireless.security.middletierplugin.open.fc.C0135.m136(r4, r5, r6, r8, r9, r10, r11, r12, r13, r14)
        L_0x004a:
            if (r0 != r2) goto L_0x0053
            r2 = 100153(0x18739, float:1.40344E-40)
        L_0x004f:
            com.alibaba.wireless.security.middletierplugin.open.fc.C0142.m145(r2)
            goto L_0x0063
        L_0x0053:
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 != r2) goto L_0x005b
            r2 = 100154(0x1873a, float:1.40346E-40)
            goto L_0x004f
        L_0x005b:
            r2 = 420(0x1a4, float:5.89E-43)
            if (r0 != r2) goto L_0x0063
            r2 = 100178(0x18752, float:1.40379E-40)
            goto L_0x004f
        L_0x0063:
            com.alibaba.wireless.security.middletierplugin.open.fc.strategy.StrategyCenter r2 = com.alibaba.wireless.security.middletierplugin.open.fc.FCComponent.f73
            if (r2 == 0) goto L_0x006f
            boolean r2 = r2.needFCProcessOrNot(r0, r1)
            r15.m84(r16, r17)
            return r2
        L_0x006f:
            com.alibaba.wireless.security.open.SecException r0 = new com.alibaba.wireless.security.open.SecException
            r1 = 2302(0x8fe, float:3.226E-42)
            java.lang.String r2 = "StrategyCenter not init!"
            r0.<init>(r2, r1)
            goto L_0x007a
        L_0x0079:
            throw r0
        L_0x007a:
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.middletierplugin.open.fc.FCComponent.needFCProcessOrNot(int, java.util.HashMap, com.alibaba.wireless.security.open.middletier.fc.IFCComponent$ResponseHeaderType):boolean");
    }

    public boolean needFCProcessOrNotV2(int i, String str) throws SecException {
        StrategyCenter strategyCenter = f73;
        if (strategyCenter != null && i != 0) {
            return strategyCenter.needFCProcessOrNotV2(i, str);
        }
        throw new SecException("StrategyCenter not init!", (int) SecExceptionCode.SEC_ERROR_MIDDLE_TIER_NO_APPKEY);
    }

    public void processFCContent(int i, HashMap hashMap, IFCActionCallback iFCActionCallback, IFCComponent.ResponseHeaderType responseHeaderType) throws SecException {
        if (f73 == null) {
            if (i == 419) {
                C0135.m136(AbstractC0141.f220, 0, 0L, "", "FcomponentProcessfccontent", "Strategycenter=0", "", C0139.m139(responseHeaderType.ordinal(), hashMap, null, C0139.f199, C0139.f201), 7, false);
            }
            C0142.m145(AbstractC0141.f220);
            throw new SecException("StrategyCenter not init!", (int) SecExceptionCode.SEC_ERROR_MIDDLE_TIER_NO_APPKEY);
        } else if (iFCActionCallback != null) {
            f73.processFCContent(i, hashMap, new C0122(iFCActionCallback), responseHeaderType.ordinal());
            C0142.m145(AbstractC0141.f225);
        } else {
            if (i == 419) {
                C0135.m136(AbstractC0141.f220, 0, 0L, "", "FcomponentProcessfccontent", "Actioncallback=0", "", C0139.m139(responseHeaderType.ordinal(), hashMap, null, C0139.f199, C0139.f201), 7, false);
            }
            C0142.m145(AbstractC0141.f220);
            throw new SecException("processFCContent no cb!", 2301);
        }
    }

    public void processFCContentV2(String str, IFCActionCallback iFCActionCallback) throws SecException {
        if (f73 == null) {
            throw new SecException("StrategyCenter not init!", (int) SecExceptionCode.SEC_ERROR_MIDDLE_TIER_NO_APPKEY);
        } else if (iFCActionCallback != null) {
            f73.processFCContentV2(str, new C0123(iFCActionCallback));
        } else {
            throw new SecException("processFCContent no cb!", 2301);
        }
    }

    public void setUp(Context context, HashMap hashMap) throws SecException {
        m83();
        if (context == null || hashMap == null) {
            C0135.m136(AbstractC0141.f218, 2301, 0L, "", "FccomponentSetup", "", "", "", 3, false);
            C0142.m145(AbstractC0141.f218);
            throw new SecException("setUp param error!", 2301);
        }
        synchronized (FCComponent.class) {
            if (f73 == null) {
                f73 = new StrategyCenter(context, hashMap);
            }
        }
        C0142.m145(AbstractC0141.f234);
    }
}
