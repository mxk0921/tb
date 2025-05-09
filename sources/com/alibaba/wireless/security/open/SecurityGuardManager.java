package com.alibaba.wireless.security.open;

import android.content.Context;
import com.alibaba.wireless.security.SecExceptionCode;
import com.alibaba.wireless.security.framework.ISGPluginManager;
import com.alibaba.wireless.security.framework.d;
import com.alibaba.wireless.security.open.atlasencrypt.IAtlasEncryptComponent;
import com.alibaba.wireless.security.open.compat.ICompatComponent;
import com.alibaba.wireless.security.open.datacollection.IDataCollectionComponent;
import com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent;
import com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent;
import com.alibaba.wireless.security.open.initialize.IInitializeComponent;
import com.alibaba.wireless.security.open.initialize.c;
import com.alibaba.wireless.security.open.maldetection.IMalDetect;
import com.alibaba.wireless.security.open.nocaptcha.INoCaptchaComponent;
import com.alibaba.wireless.security.open.opensdk.IOpenSDKComponent;
import com.alibaba.wireless.security.open.pkgvaliditycheck.IPkgValidityCheckComponent;
import com.alibaba.wireless.security.open.safetoken.ISafeTokenComponent;
import com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent;
import com.alibaba.wireless.security.open.securitybody.ISecurityBodyComponent;
import com.alibaba.wireless.security.open.simulatordetect.ISimulatorDetectComponent;
import com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent;
import com.alibaba.wireless.security.open.staticdatastore.IStaticDataStoreComponent;
import com.alibaba.wireless.security.open.statickeyencrypt.IStaticKeyEncryptComponent;
import com.alibaba.wireless.security.open.umid.IUMIDComponent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SecurityGuardManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile SecurityGuardManager c;
    private static volatile IInitializeComponent d;
    private static JSONObject f;
    private static boolean g;

    /* renamed from: a  reason: collision with root package name */
    private ISGPluginManager f3432a;
    private final Map<Integer, Class> b = new a(this);
    private static final Object e = new Object();
    private static Object h = new Object();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a extends HashMap<Integer, Class> {
        static {
            t2o.a(659554352);
        }

        public a(SecurityGuardManager securityGuardManager) {
            put(1, ISecureSignatureComponent.class);
            put(2, IDynamicDataStoreComponent.class);
            put(3, IStaticDataStoreComponent.class);
            put(5, IDataCollectionComponent.class);
            put(6, IStaticDataEncryptComponent.class);
            put(7, IDynamicDataEncryptComponent.class);
            put(8, ISimulatorDetectComponent.class);
            put(9, IStaticKeyEncryptComponent.class);
            put(10, IOpenSDKComponent.class);
            put(11, IUMIDComponent.class);
            put(12, IPkgValidityCheckComponent.class);
            put(13, IAtlasEncryptComponent.class);
            put(14, IMalDetect.class);
            put(15, INoCaptchaComponent.class);
            put(16, ISafeTokenComponent.class);
            put(17, ISecurityBodyComponent.class);
            put(18, ICompatComponent.class);
        }
    }

    static {
        t2o.a(659554351);
    }

    private SecurityGuardManager(ISGPluginManager iSGPluginManager) {
        this.f3432a = iSGPluginManager;
    }

    private static String getGlobalUserData() {
        String jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab7e7eb", new Object[0]);
        }
        synchronized (h) {
            jSONObject = f.toString();
        }
        return jSONObject;
    }

    public static IInitializeComponent getInitializer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IInitializeComponent) ipChange.ipc$dispatch("d3b61e55", new Object[0]) : getInitializer(null);
    }

    public static SecurityGuardManager getInstance(Context context) throws SecException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SecurityGuardManager) ipChange.ipc$dispatch("8f946f39", new Object[]{context}) : getInstance(context, null);
    }

    public static boolean getSilentMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b8bd519", new Object[0])).booleanValue();
        }
        return g;
    }

    public static void setSilentMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cc619d3", new Object[]{new Boolean(z)});
        } else {
            g = z;
        }
    }

    public IComponent a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IComponent) ipChange.ipc$dispatch("7ba2b232", new Object[]{this, new Integer(i)});
        }
        try {
            return (IComponent) getInterface(this.b.get(Integer.valueOf(i)));
        } catch (SecException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public IAtlasEncryptComponent getAtlasEncryptComp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAtlasEncryptComponent) ipChange.ipc$dispatch("16631d56", new Object[]{this});
        }
        IAtlasEncryptComponent iAtlasEncryptComponent = (IAtlasEncryptComponent) a(13);
        if (iAtlasEncryptComponent == null) {
            new SecException(SecExceptionCode.SEC_ERROR_ATLAS_UNSUPPORTED).printStackTrace();
        }
        return iAtlasEncryptComponent;
    }

    public ICompatComponent getCompatComp() {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            a2 = ipChange.ipc$dispatch("6baa7dde", new Object[]{this});
        } else {
            a2 = a(18);
        }
        return (ICompatComponent) a2;
    }

    public IDataCollectionComponent getDataCollectionComp() {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            a2 = ipChange.ipc$dispatch("72357964", new Object[]{this});
        } else {
            a2 = a(5);
        }
        return (IDataCollectionComponent) a2;
    }

    public IDynamicDataEncryptComponent getDynamicDataEncryptComp() {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            a2 = ipChange.ipc$dispatch("71ce1af8", new Object[]{this});
        } else {
            a2 = a(7);
        }
        return (IDynamicDataEncryptComponent) a2;
    }

    public IDynamicDataStoreComponent getDynamicDataStoreComp() {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            a2 = ipChange.ipc$dispatch("bc1166b4", new Object[]{this});
        } else {
            a2 = a(2);
        }
        return (IDynamicDataStoreComponent) a2;
    }

    public <T> T getInterface(Class<T> cls) throws SecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("9842089f", new Object[]{this, cls});
        }
        return (T) this.f3432a.getInterface(cls);
    }

    public IMalDetect getMalDetectionComp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMalDetect) ipChange.ipc$dispatch("107f789e", new Object[]{this});
        }
        IMalDetect iMalDetect = (IMalDetect) a(14);
        if (iMalDetect == null) {
            new SecException(SecExceptionCode.SEC_ERROR_MALDETECT_UNSUPPORTED).printStackTrace();
        }
        return iMalDetect;
    }

    public INoCaptchaComponent getNoCaptchaComp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (INoCaptchaComponent) ipChange.ipc$dispatch("8dda183b", new Object[]{this});
        }
        INoCaptchaComponent iNoCaptchaComponent = (INoCaptchaComponent) a(15);
        if (iNoCaptchaComponent == null) {
            new SecException(1299).printStackTrace();
        }
        return iNoCaptchaComponent;
    }

    public IOpenSDKComponent getOpenSDKComp() {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            a2 = ipChange.ipc$dispatch("eda4d8a4", new Object[]{this});
        } else {
            a2 = a(10);
        }
        return (IOpenSDKComponent) a2;
    }

    public IPkgValidityCheckComponent getPackageValidityCheckComp() {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            a2 = ipChange.ipc$dispatch("af72be20", new Object[]{this});
        } else {
            a2 = a(12);
        }
        return (IPkgValidityCheckComponent) a2;
    }

    public String getSDKVerison() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76412af1", new Object[]{this});
        }
        return c.a();
    }

    public ISGPluginManager getSGPluginManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISGPluginManager) ipChange.ipc$dispatch("efc343a1", new Object[]{this});
        }
        return this.f3432a;
    }

    public ISafeTokenComponent getSafeTokenComp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISafeTokenComponent) ipChange.ipc$dispatch("f56b62c8", new Object[]{this});
        }
        ISafeTokenComponent iSafeTokenComponent = (ISafeTokenComponent) a(16);
        if (iSafeTokenComponent == null) {
            new SecException(SecExceptionCode.SEC_ERROR_SAFETOKEN_UNKNOWN_ERR).printStackTrace();
        }
        return iSafeTokenComponent;
    }

    public ISecureSignatureComponent getSecureSignatureComp() {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            a2 = ipChange.ipc$dispatch("6ea303f3", new Object[]{this});
        } else {
            a2 = a(1);
        }
        return (ISecureSignatureComponent) a2;
    }

    public ISecurityBodyComponent getSecurityBodyComp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISecurityBodyComponent) ipChange.ipc$dispatch("2f1e73be", new Object[]{this});
        }
        ISecurityBodyComponent iSecurityBodyComponent = (ISecurityBodyComponent) a(17);
        if (iSecurityBodyComponent == null) {
            new SecException(SecExceptionCode.SEC_ERROR_SECURITYBODY_UNSUPPORTED).printStackTrace();
        }
        return iSecurityBodyComponent;
    }

    public ISimulatorDetectComponent getSimulatorDetectComp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISimulatorDetectComponent) ipChange.ipc$dispatch("611103ed", new Object[]{this});
        }
        ISimulatorDetectComponent iSimulatorDetectComponent = (ISimulatorDetectComponent) a(8);
        if (iSimulatorDetectComponent == null) {
            new SecException(SecExceptionCode.SEC_ERROR_SIMULATORDETECT_UNSUPPORTED).printStackTrace();
        }
        return iSimulatorDetectComponent;
    }

    public IStaticDataEncryptComponent getStaticDataEncryptComp() {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            a2 = ipChange.ipc$dispatch("32b8e287", new Object[]{this});
        } else {
            a2 = a(6);
        }
        return (IStaticDataEncryptComponent) a2;
    }

    public IStaticDataStoreComponent getStaticDataStoreComp() {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            a2 = ipChange.ipc$dispatch("42d4584b", new Object[]{this});
        } else {
            a2 = a(3);
        }
        return (IStaticDataStoreComponent) a2;
    }

    public IStaticKeyEncryptComponent getStaticKeyEncryptComp() {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            a2 = ipChange.ipc$dispatch("f5653430", new Object[]{this});
        } else {
            a2 = a(9);
        }
        return (IStaticKeyEncryptComponent) a2;
    }

    public IUMIDComponent getUMIDComp() {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            a2 = ipChange.ipc$dispatch("8622d12f", new Object[]{this});
        } else {
            a2 = a(11);
        }
        return (IUMIDComponent) a2;
    }

    public Boolean isOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("78f53dd8", new Object[]{this});
        }
        return Boolean.TRUE;
    }

    public static IInitializeComponent getInitializer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IInitializeComponent) ipChange.ipc$dispatch("2853770b", new Object[]{str});
        }
        if (d == null) {
            synchronized (e) {
                try {
                    if (d == null) {
                        d = new com.alibaba.wireless.security.open.initialize.a(str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public static SecurityGuardManager getInstance(Context context, String str) throws SecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SecurityGuardManager) ipChange.ipc$dispatch("1d3fa183", new Object[]{context, str});
        }
        if (c == null) {
            synchronized (SecurityGuardManager.class) {
                try {
                    if (context == null) {
                        return null;
                    }
                    if (c == null && getInitializer(str).initialize(context) == 0) {
                        ISGPluginManager a2 = ((com.alibaba.wireless.security.open.initialize.a) getInitializer(str)).a();
                        if (a2 instanceof d) {
                            ((d) a2).a(g);
                        }
                        c = new SecurityGuardManager(a2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (c.f3432a instanceof d) {
            ((d) c.f3432a).a(g);
        }
        return c;
    }

    public static boolean setGlobalUserData(String str, String str2) throws SecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d99c9bf9", new Object[]{str, str2})).booleanValue();
        }
        try {
            synchronized (h) {
                if (str == null && str2 == null) {
                    f = null;
                } else if (str == null || str2 == null) {
                    throw new SecException(118);
                } else {
                    if (f == null) {
                        f = new JSONObject();
                    }
                    f.put(str, str2);
                }
            }
            return true;
        } catch (JSONException e2) {
            throw new SecException(e2.getMessage(), 119);
        }
    }
}
