package com.alibaba.wireless.security.mainplugin;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.wireless.security.SecExceptionCode;
import com.alibaba.wireless.security.framework.IRouterComponent;
import com.alibaba.wireless.security.framework.ISGPluginInfo;
import com.alibaba.wireless.security.framework.SGApmMonitorManager;
import com.alibaba.wireless.security.framework.utils.FLOG;
import com.alibaba.wireless.security.framework.utils.UserTrackMethodJniBridge;
import com.alibaba.wireless.security.middletierplugin.SecurityGuardMiddleTierPlugin;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.alibaba.wireless.security.open.securityguardaccsadapter.OrangeAdapter;
import com.alibaba.wireless.security.securitybody.SecurityGuardSecurityBodyPlugin;
import com.taobao.orange.OConstant;
import com.taobao.wireless.security.adapter.datacollection.C0814;
import com.taobao.wireless.security.adapter.datareport.C0819;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import tb.ku0;
import tb.z9u;

/* loaded from: classes.dex */
public class SecurityGuardMainPlugin implements ISecurityGuardPlugin {
    public static final int FLAG_KEEP_ALIVE_PROCESS = 32;

    /* renamed from: х  reason: contains not printable characters */
    private static final int f0 = 1;

    /* renamed from: ц  reason: contains not printable characters */
    private static final int f1 = 2;

    /* renamed from: ч  reason: contains not printable characters */
    private static final int f2 = 4;

    /* renamed from: ш  reason: contains not printable characters */
    private static final int f3 = 8;

    /* renamed from: щ  reason: contains not printable characters */
    private static final int f4 = 16;

    /* renamed from: ъ  reason: contains not printable characters */
    private static final String f5 = "SecurityGuardMainPlugin";

    /* renamed from: ы  reason: contains not printable characters */
    private static final boolean f6 = false;

    /* renamed from: э  reason: contains not printable characters */
    private static final HashSet<String> f7 = new HashSet<>(Arrays.asList("com.alibaba.wireless.security.open.atlasencrypt.IAtlasEncryptComponent", "com.alibaba.wireless.security.open.datacollection.IDataCollectionComponent", "com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent", "com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent", "com.alibaba.wireless.security.open.opensdk.IOpenSDKComponent", "com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent", "com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent", "com.alibaba.wireless.security.open.staticdatastore.IStaticDataStoreComponent", "com.alibaba.wireless.security.open.statickeyencrypt.IStaticKeyEncryptComponent", "com.alibaba.wireless.security.open.safetoken.ISafeTokenComponent", "com.alibaba.wireless.security.open.compat.ICompatComponent", "com.taobao.wireless.security.sdk.atlasencrypt.IAtlasEncryptComponent", "com.taobao.wireless.security.sdk.datacollection.IDataCollectionComponent", "com.taobao.wireless.security.sdk.dynamicdataencrypt.IDynamicDataEncryptComponent", "com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent", "com.taobao.wireless.security.sdk.securesignature.ISecureSignatureComponent", "com.taobao.wireless.security.sdk.staticdataencrypt.IStaticDataEncryptComponent", "com.taobao.wireless.security.sdk.staticdatastore.IStaticDataStoreComponent", "com.taobao.wireless.security.sdk.safetoken.ISafeTokenComponent"));

    /* renamed from: ю  reason: contains not printable characters */
    private static volatile HashSet<String> f8 = null;

    /* renamed from: я  reason: contains not printable characters */
    private static volatile HashSet<String> f9 = null;
    public static ClassLoader sClassLoader = null;
    public static ClassLoader sParentClassLoader = null;
    public static int sLoadVersion = 0;

    /* renamed from: а  reason: contains not printable characters */
    private ConcurrentHashMap<Class, Object> f10 = null;

    /* renamed from: б  reason: contains not printable characters */
    private ConcurrentHashMap<Class, Object> f11 = null;

    /* renamed from: в  reason: contains not printable characters */
    private ConcurrentHashMap<Class, Object> f12 = null;

    /* renamed from: г  reason: contains not printable characters */
    private final Object f13 = new Object();

    /* renamed from: д  reason: contains not printable characters */
    private final Object f14 = new Object();

    /* renamed from: е  reason: contains not printable characters */
    private final Object f15 = new Object();

    /* renamed from: ё  reason: contains not printable characters */
    private final boolean f31 = true;

    /* renamed from: ж  reason: contains not printable characters */
    private volatile boolean f16 = false;

    /* renamed from: з  reason: contains not printable characters */
    private volatile boolean f17 = false;

    /* renamed from: и  reason: contains not printable characters */
    private volatile boolean f18 = false;

    /* renamed from: й  reason: contains not printable characters */
    private volatile boolean f19 = false;

    /* renamed from: к  reason: contains not printable characters */
    private volatile int f20 = 0;

    /* renamed from: л  reason: contains not printable characters */
    private volatile int f21 = 0;

    /* renamed from: м  reason: contains not printable characters */
    private volatile int f22 = 0;

    /* renamed from: н  reason: contains not printable characters */
    private boolean f23 = true;

    /* renamed from: о  reason: contains not printable characters */
    private boolean f24 = false;

    /* renamed from: п  reason: contains not printable characters */
    private Context f25 = null;

    /* renamed from: р  reason: contains not printable characters */
    private ISGPluginInfo f26 = null;

    /* renamed from: с  reason: contains not printable characters */
    private IRouterComponent f27 = null;

    /* renamed from: т  reason: contains not printable characters */
    private C0117 f28 = new C0117();

    /* renamed from: у  reason: contains not printable characters */
    private final SecurityGuardSecurityBodyPlugin f29 = new SecurityGuardSecurityBodyPlugin();

    /* renamed from: ф  reason: contains not printable characters */
    private final SecurityGuardMiddleTierPlugin f30 = new SecurityGuardMiddleTierPlugin();

    /* renamed from: com.alibaba.wireless.security.mainplugin.SecurityGuardMainPlugin$а  reason: contains not printable characters */
    /* loaded from: classes.dex */
    class C0108 extends Thread {

        /* renamed from: а  reason: contains not printable characters */
        final /* synthetic */ Context f32;

        /* renamed from: б  reason: contains not printable characters */
        final /* synthetic */ int f33;

        /* renamed from: в  reason: contains not printable characters */
        final /* synthetic */ String f34;

        /* renamed from: г  reason: contains not printable characters */
        final /* synthetic */ String f35;

        /* renamed from: д  reason: contains not printable characters */
        final /* synthetic */ String f36;

        /* renamed from: е  reason: contains not printable characters */
        final /* synthetic */ String f37;

        /* renamed from: ж  reason: contains not printable characters */
        final /* synthetic */ String f38;

        /* renamed from: з  reason: contains not printable characters */
        final /* synthetic */ String f39;

        /* renamed from: и  reason: contains not printable characters */
        final /* synthetic */ boolean f40;

        /* renamed from: й  reason: contains not printable characters */
        final /* synthetic */ ISGPluginInfo f41;

        /* renamed from: к  reason: contains not printable characters */
        final /* synthetic */ String f42;

        /* renamed from: ё  reason: contains not printable characters */
        final /* synthetic */ String f44;

        /* renamed from: com.alibaba.wireless.security.mainplugin.SecurityGuardMainPlugin$а$а  reason: contains not printable characters */
        /* loaded from: classes.dex */
        class C0109 extends TimerTask {

            /* renamed from: com.alibaba.wireless.security.mainplugin.SecurityGuardMainPlugin$а$а$а  reason: contains not printable characters */
            /* loaded from: classes.dex */
            class C0110 extends Thread {
                C0110() {
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        C0814.m381(SecurityGuardMainPlugin.this.getContext(), SecurityGuardMainPlugin.this.f27);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }

            C0109() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                new C0110().start();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0108(String str, Context context, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, ISGPluginInfo iSGPluginInfo, String str9) {
            super(str);
            this.f32 = context;
            this.f33 = i;
            this.f34 = str2;
            this.f35 = str3;
            this.f36 = str4;
            this.f37 = str5;
            this.f44 = str6;
            this.f38 = str7;
            this.f39 = str8;
            this.f40 = z;
            this.f41 = iSGPluginInfo;
            this.f42 = str9;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int intValue;
            long j = FLOG.get_currentTime();
            synchronized (SecurityGuardMainPlugin.this.f13) {
                try {
                    IRouterComponent router = SecurityGuardMainPlugin.this.getRouter();
                    Object[] objArr = new Object[10];
                    objArr[0] = this.f32;
                    objArr[1] = Integer.valueOf(this.f33);
                    objArr[2] = this.f34;
                    objArr[3] = this.f35;
                    objArr[4] = this.f36;
                    objArr[5] = this.f37;
                    objArr[6] = this.f44;
                    objArr[7] = this.f38;
                    objArr[8] = this.f39;
                    objArr[9] = Integer.valueOf(this.f40 ? 1 : 0);
                    intValue = ((Integer) router.doCommand(10101, objArr)).intValue();
                } catch (SecException e) {
                    SecurityGuardMainPlugin.this.f20 = e.getErrorCode();
                    SecurityGuardMainPlugin.this.m51("main", this.f41.getVersion(), SecurityGuardMainPlugin.this.f20);
                }
                if (intValue == 0) {
                    C0819.m394(SecurityGuardMainPlugin.this);
                    new Timer().schedule(new C0109(), 3000L);
                    SecurityGuardMainPlugin.this.f16 = true;
                    SecurityGuardMainPlugin.this.f13.notifyAll();
                } else {
                    throw new SecException(intValue);
                }
            }
            FLOG.printTimeCost("main", "onPluginLoaded", "main doCommand", j);
            long j2 = FLOG.get_currentTime();
            if (!SecurityGuardMainPlugin.this.f19) {
                SGApmMonitorManager.getInstance().monitorStart("securitybody");
                synchronized (SecurityGuardMainPlugin.this.f14) {
                    if (SecurityGuardMainPlugin.this.f20 == 0) {
                        try {
                            SecurityGuardMainPlugin.this.f29.onPluginLoaded(this.f32, SecurityGuardMainPlugin.this.f27, this.f41, this.f42, Integer.valueOf(this.f33 & 1), Boolean.TRUE, SecurityGuardMainPlugin.this.f11);
                        } catch (SecException e2) {
                            SecurityGuardMainPlugin.this.f21 = e2.getErrorCode();
                            SecurityGuardMainPlugin.this.m51("securitybody", this.f41.getVersion(), SecurityGuardMainPlugin.this.f21);
                        }
                    } else {
                        SecurityGuardMainPlugin.this.f21 = SecurityGuardMainPlugin.this.f20;
                    }
                    SecurityGuardMainPlugin.this.f18 = true;
                    SecurityGuardMainPlugin.this.f14.notifyAll();
                }
                SGApmMonitorManager.getInstance().monitorEnd("securitybody");
                FLOG.printTimeCost("main", "onPluginLoaded", "securityBody", j2);
                long j3 = FLOG.get_currentTime();
                SGApmMonitorManager.getInstance().monitorStart("middletier");
                synchronized (SecurityGuardMainPlugin.this.f15) {
                    if (SecurityGuardMainPlugin.this.f21 == 0) {
                        try {
                            SecurityGuardMainPlugin.this.f30.onPluginLoaded(this.f32, SecurityGuardMainPlugin.this.f27, this.f41, this.f42, Integer.valueOf(this.f33 & 1), Boolean.TRUE, SecurityGuardMainPlugin.this.f12);
                        } catch (SecException e3) {
                            SecurityGuardMainPlugin.this.f22 = e3.getErrorCode();
                            SecurityGuardMainPlugin.this.m51("middletier", this.f41.getVersion(), SecurityGuardMainPlugin.this.f22);
                        }
                    } else {
                        SecurityGuardMainPlugin.this.f22 = SecurityGuardMainPlugin.this.f21;
                    }
                    SecurityGuardMainPlugin.this.f17 = true;
                    SecurityGuardMainPlugin.this.f15.notifyAll();
                }
                SGApmMonitorManager.getInstance().monitorEnd("middletier");
                FLOG.printTimeCost("main", "onPluginLoaded", "middleTier", j3);
            }
            SGApmMonitorManager.getInstance().monitorEnd(ku0.TRACK_PAGE_COUNTER_TYPE_PLUGIN);
        }
    }

    public static ClassLoader getMainPluginClassLoader() {
        return sClassLoader;
    }

    public static ClassLoader getMainPluginParentClassLoader() {
        return sParentClassLoader;
    }

    public static String getProcessName(Context context) {
        String str = m55();
        if (str != null) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            if (context == null) {
                return "";
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName != null ? runningAppProcessInfo.processName : "";
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: α  reason: contains not printable characters */
    private void m31() {
        if (!this.f18) {
            synchronized (this.f14) {
                while (!this.f18) {
                    try {
                        this.f14.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    /* renamed from: т  reason: contains not printable characters */
    private static void m50(JSONObject jSONObject) throws JSONException {
        f8 = new HashSet<>(Arrays.asList("com.alibaba.wireless.security.open.lbsrisk.ILBSRiskComponent", "com.alibaba.wireless.security.open.securitybodysdk.ISecurityBodyPageTrack", "com.taobao.wireless.security.sdk.rootdetect.IRootDetectComponent", "com.taobao.wireless.security.sdk.securitybody.ISecurityBodyComponent", "com.taobao.wireless.security.sdk.simulatordetect.ISimulatorDetectComponent", "com.alibaba.wireless.security.open.maldetection.IMalDetect", "com.alibaba.wireless.security.open.securitybody.ISecurityBodyComponent", "com.alibaba.wireless.security.open.simulatordetect.ISimulatorDetectComponent", "com.alibaba.wireless.security.open.umid.IUMIDComponent", "com.alibaba.wireless.security.jaq.securitybody.IJAQVerificationComponent"));
        f9 = new HashSet<>(Arrays.asList("com.alibaba.wireless.security.open.middletier.IMiddleTierGenericComponent", "com.alibaba.wireless.security.open.middletier.fc.IFCComponent", "com.alibaba.wireless.security.open.middletier.IUnifiedSecurityComponent", "com.alibaba.wireless.security.open.middletier.ISensorComponent", "com.alibaba.wireless.security.jaq.avmp.IJAQAVMPSignComponent", "com.alibaba.wireless.security.open.avmp.IAVMPGenericComponent", "com.alibaba.wireless.security.open.avmp.IAVMPSafeTokenComponent", "com.alibaba.wireless.security.open.avmp.IAVMPSoftCertComponent"));
        Iterator<String> it = f8.iterator();
        while (it.hasNext()) {
            jSONObject.put(it.next(), "main");
        }
        Iterator<String> it2 = f9.iterator();
        while (it2.hasNext()) {
            jSONObject.put(it2.next(), "main");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: у  reason: contains not printable characters */
    public void m51(String str, String str2, int i) {
        UserTrackMethodJniBridge.addUtRecord("100044", 111, 0, str2, 0L, "SGLOAD", str, z9u.ARG_TAOKE_ERROR + i, "", "");
    }

    /* renamed from: ф  reason: contains not printable characters */
    private boolean m52() {
        boolean z;
        Method method;
        Method method2;
        String str = "0";
        boolean z2 = false;
        try {
            z = ((Boolean) Class.forName(OConstant.REFLECT_SECURITYGUARD).getMethod("getSilentMode", new Class[0]).invoke(null, new Object[0])).booleanValue();
        } catch (Exception unused) {
            z = false;
        }
        try {
            Class<?> cls = Class.forName("com.alibaba.wireless.security.open.securityguardaccsadapter.OrangeListener");
            if (!(cls == null || (method2 = cls.getMethod("getOrangeConfig", String.class, String.class, String.class)) == null)) {
                str = (String) method2.invoke(cls, OrangeAdapter.SECURITYGUARD_ORANGE_NAMESPACE, "113", str);
            }
        } catch (Throwable unused2) {
        }
        boolean equals = "1".equals(str) | z;
        try {
            Class<?> cls2 = Class.forName("com.taobao.adaemon.ADaemon");
            if (!(cls2 == null || (method = cls2.getMethod("isChannelMemOptimizeEnable", Context.class)) == null)) {
                z2 = ((Boolean) method.invoke(cls2, this.f25)).booleanValue();
            }
        } catch (Throwable unused3) {
        }
        return equals | z2;
    }

    /* renamed from: х  reason: contains not printable characters */
    private <T> T m53(Class<T> cls) {
        if (!f7.contains(cls.getName())) {
            return null;
        }
        m61();
        if (this.f20 > 0) {
            Log.e("SGLOAD", "SecException ErrorCode: " + this.f20);
            return null;
        }
        T t = (T) this.f10.get(cls);
        if (t != null && cls.isAssignableFrom(t.getClass())) {
            return t;
        }
        try {
            m58(cls.getName());
            return (T) this.f10.get(cls);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ц  reason: contains not printable characters */
    private <T> T m54(Class<T> cls) {
        if (!f9.contains(cls.getName())) {
            return null;
        }
        m62();
        if (this.f22 > 0) {
            Log.e("SGLOAD", "SecException ErrorCode: " + this.f22);
            return null;
        }
        T t = (T) this.f12.get(cls);
        if (t == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    /* renamed from: ч  reason: contains not printable characters */
    private static String m55() {
        try {
            Method declaredMethod = Class.forName(ProcessUtils.ACTIVITY_THREAD, false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ш  reason: contains not printable characters */
    private <T> T m56(Class<T> cls) {
        if (!f8.contains(cls.getName())) {
            return null;
        }
        m31();
        if (this.f21 > 0) {
            Log.e("SGLOAD", "SecException ErrorCode: " + this.f21);
            return null;
        }
        T t = (T) this.f11.get(cls);
        if (t == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    /* renamed from: щ  reason: contains not printable characters */
    private static boolean m57(String str) {
        return "com.taobao.taobao:channel".equals(str) || "com.alibaba.wireless.securityguard:channel2".equals(str);
    }

    /* renamed from: ъ  reason: contains not printable characters */
    private void m58(String str) {
        if (str != null) {
            this.f28.m69(this.f10, str, this);
        }
    }

    /* renamed from: ы  reason: contains not printable characters */
    private static void m59(String str) throws SecException {
        Field field;
        boolean z;
        try {
            boolean isEmpty = str.isEmpty();
            Object obj = C0111.m64();
            if (obj != null) {
                Field[] declaredFields = obj.getClass().getDeclaredFields();
                int length = declaredFields.length;
                int i = 0;
                Field field2 = null;
                while (true) {
                    if (i >= length) {
                        field = null;
                        break;
                    }
                    Field field3 = declaredFields[i];
                    if (!field3.isSynthetic() && !field3.getType().isPrimitive() && !Modifier.isStatic(field3.getModifiers()) && Modifier.isPrivate(field3.getModifiers()) && !Modifier.isFinal(field3.getModifiers()) && !field3.getType().getPackage().getName().startsWith("android.") && !field3.getType().getPackage().getName().startsWith("java.")) {
                        Field[] declaredFields2 = field3.getType().getDeclaredFields();
                        int length2 = declaredFields2.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length2) {
                                z = false;
                                break;
                            }
                            Field field4 = declaredFields2[i2];
                            if (!field4.isSynthetic() && !field4.getType().isPrimitive() && !Modifier.isStatic(field4.getModifiers()) && Modifier.isPrivate(field4.getModifiers()) && !Modifier.isFinal(field4.getModifiers()) && !field3.getType().getPackage().getName().startsWith("android.") && !field3.getType().getPackage().getName().startsWith("java.") && "org.json.JSONObject".equals(field4.getType().getName())) {
                                field2 = field4;
                                z = true;
                                break;
                            }
                            i2++;
                        }
                        if (z) {
                            field = field3;
                            break;
                        }
                    }
                    i++;
                }
                if (field != null) {
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    if (isEmpty) {
                        Constructor<?> declaredConstructor = field.getType().getDeclaredConstructor(JSONObject.class);
                        declaredConstructor.setAccessible(true);
                        obj2 = declaredConstructor.newInstance(new JSONObject());
                    }
                    if (obj2 != null) {
                        field2.setAccessible(true);
                        Object obj3 = field2.get(obj2);
                        if (obj3 != null) {
                            JSONObject jSONObject = (JSONObject) obj3;
                            m50(jSONObject);
                            field2.set(obj2, jSONObject);
                            if (isEmpty) {
                                field.set(obj, obj2);
                                return;
                            }
                            return;
                        }
                        throw new Exception("SecurityGuardMainPlugin jsonObjectObj is null");
                    }
                    throw new Exception("SecurityGuardMainPlugin initConfigObj is null");
                }
                throw new Exception("SecurityGuardMainPlugin initConfigField is null");
            }
            throw new Exception("SecurityGuardMainPlugin pluginManagerObj is null");
        } catch (Exception e) {
            throw new SecException(e.toString(), (int) SecExceptionCode.SEC_ERROR_INIT_PLUGIN_MERGED_INIT_CONFIG_MODIFY_ERROR);
        }
    }

    /* renamed from: э  reason: contains not printable characters */
    private void m60() {
        this.f10 = new ConcurrentHashMap<>();
        this.f11 = new ConcurrentHashMap<>();
        this.f12 = new ConcurrentHashMap<>();
        this.f28.m70(this.f10, this);
    }

    /* renamed from: ю  reason: contains not printable characters */
    private void m61() {
        if (!this.f16) {
            synchronized (this.f13) {
                while (!this.f16) {
                    try {
                        this.f13.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    /* renamed from: я  reason: contains not printable characters */
    private void m62() {
        if (!this.f17) {
            synchronized (this.f15) {
                while (!this.f17) {
                    try {
                        this.f15.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    @Override // com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin
    public Context getContext() {
        return this.f25;
    }

    @Override // com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin
    public <T> T getInterface(Class<T> cls) {
        if (cls == null) {
            return null;
        }
        T t = (T) m53(cls);
        if (this.f19) {
            return t;
        }
        if (t == null) {
            t = (T) m56(cls);
        }
        return t == null ? (T) m54(cls) : t;
    }

    @Override // com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin
    public IRouterComponent getRouter() {
        return this.f27;
    }

    @Override // com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin
    public ISGPluginInfo getSGPluginInfo() {
        return this.f26;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0106  */
    @Override // com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.wireless.security.framework.IRouterComponent onPluginLoaded(android.content.Context r23, com.alibaba.wireless.security.framework.IRouterComponent r24, com.alibaba.wireless.security.framework.ISGPluginInfo r25, java.lang.String r26, java.lang.Object... r27) throws com.alibaba.wireless.security.open.SecException {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.mainplugin.SecurityGuardMainPlugin.onPluginLoaded(android.content.Context, com.alibaba.wireless.security.framework.IRouterComponent, com.alibaba.wireless.security.framework.ISGPluginInfo, java.lang.String, java.lang.Object[]):com.alibaba.wireless.security.framework.IRouterComponent");
    }
}
