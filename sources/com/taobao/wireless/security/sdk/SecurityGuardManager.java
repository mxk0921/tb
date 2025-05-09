package com.taobao.wireless.security.sdk;

import android.content.Context;
import com.alibaba.wireless.security.open.SecException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.security.sdk.atlasencrypt.IAtlasEncryptComponent;
import com.taobao.wireless.security.sdk.datacollection.IDataCollectionComponent;
import com.taobao.wireless.security.sdk.dynamicdataencrypt.IDynamicDataEncryptComponent;
import com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent;
import com.taobao.wireless.security.sdk.indiekit.IIndieKitComponent;
import com.taobao.wireless.security.sdk.initialize.IInitializeComponent;
import com.taobao.wireless.security.sdk.initialize.a;
import com.taobao.wireless.security.sdk.nocaptcha.INoCaptchaComponent;
import com.taobao.wireless.security.sdk.pkgvaliditycheck.IPkgValidityCheckComponent;
import com.taobao.wireless.security.sdk.rootdetect.IRootDetectComponent;
import com.taobao.wireless.security.sdk.safetoken.ISafeTokenComponent;
import com.taobao.wireless.security.sdk.securesignature.ISecureSignatureComponent;
import com.taobao.wireless.security.sdk.securityDNS.ISecurityDNSComponent;
import com.taobao.wireless.security.sdk.securitybody.ISecurityBodyComponent;
import com.taobao.wireless.security.sdk.simulatordetect.ISimulatorDetectComponent;
import com.taobao.wireless.security.sdk.staticdataencrypt.IStaticDataEncryptComponent;
import com.taobao.wireless.security.sdk.staticdatastore.IStaticDataStoreComponent;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SecurityGuardManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile SecurityGuardManager b;
    private static volatile IInitializeComponent c;
    private static final Object d = new Object();

    /* renamed from: a  reason: collision with root package name */
    private com.alibaba.wireless.security.open.SecurityGuardManager f14177a;

    static {
        t2o.a(659554437);
    }

    private SecurityGuardManager(Context context) {
        try {
            this.f14177a = com.alibaba.wireless.security.open.SecurityGuardManager.getInstance(context);
        } catch (SecException e) {
            e.printStackTrace();
        }
    }

    private <T> T a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bd4d3fd", new Object[]{this, cls});
        }
        try {
            com.alibaba.wireless.security.open.SecurityGuardManager securityGuardManager = this.f14177a;
            if (securityGuardManager != null) {
                return (T) securityGuardManager.getInterface(cls);
            }
            return null;
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static IInitializeComponent getInitializer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IInitializeComponent) ipChange.ipc$dispatch("de4e8e15", new Object[0]);
        }
        if (c == null) {
            synchronized (d) {
                try {
                    if (c == null) {
                        c = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public static SecurityGuardManager getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SecurityGuardManager) ipChange.ipc$dispatch("f061ec39", new Object[]{context});
        }
        if (b == null) {
            synchronized (SecurityGuardManager.class) {
                try {
                    if (context == null) {
                        return null;
                    }
                    if (b == null && getInitializer().initialize(context) == 0) {
                        b = new SecurityGuardManager(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public IAtlasEncryptComponent getAtlasEncryptComp() {
        Object component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            component = ipChange.ipc$dispatch("b40dfc56", new Object[]{this});
        } else {
            component = getComponent(15);
        }
        return (IAtlasEncryptComponent) component;
    }

    public IComponent getComponent(int i) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IComponent) ipChange.ipc$dispatch("7dc3774c", new Object[]{this, new Integer(i)});
        }
        switch (i) {
            case 1:
                obj = ISecureSignatureComponent.class;
                break;
            case 2:
                obj = IDynamicDataStoreComponent.class;
                break;
            case 3:
                obj = IIndieKitComponent.class;
                break;
            case 4:
                obj = IStaticDataStoreComponent.class;
                break;
            case 5:
                obj = IRootDetectComponent.class;
                break;
            case 6:
                obj = IDataCollectionComponent.class;
                break;
            case 7:
                obj = IStaticDataEncryptComponent.class;
                break;
            case 8:
                obj = ISecurityBodyComponent.class;
                break;
            case 9:
                obj = IDynamicDataEncryptComponent.class;
                break;
            case 10:
                obj = ISimulatorDetectComponent.class;
                break;
            case 11:
                obj = ISecurityDNSComponent.class;
                break;
            case 12:
                obj = IPkgValidityCheckComponent.class;
                break;
            case 13:
            default:
                return null;
            case 14:
                obj = INoCaptchaComponent.class;
                break;
            case 15:
                obj = IAtlasEncryptComponent.class;
                break;
            case 16:
                obj = ISafeTokenComponent.class;
                break;
        }
        return (IComponent) a(obj);
    }

    public IDataCollectionComponent getDataCollectionComp() {
        Object component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            component = ipChange.ipc$dispatch("c8c03ce4", new Object[]{this});
        } else {
            component = getComponent(6);
        }
        return (IDataCollectionComponent) component;
    }

    public IDynamicDataEncryptComponent getDynamicDataEncryptComp() {
        Object component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            component = ipChange.ipc$dispatch("5240a178", new Object[]{this});
        } else {
            component = getComponent(9);
        }
        return (IDynamicDataEncryptComponent) component;
    }

    public IDynamicDataStoreComponent getDynamicDataStoreComp() {
        Object component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            component = ipChange.ipc$dispatch("ce040e34", new Object[]{this});
        } else {
            component = getComponent(2);
        }
        return (IDynamicDataStoreComponent) component;
    }

    public IIndieKitComponent getIndieKitComp() {
        Object component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            component = ipChange.ipc$dispatch("45a10277", new Object[]{this});
        } else {
            component = getComponent(3);
        }
        return (IIndieKitComponent) component;
    }

    public <T> T getInterface(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("9842089f", new Object[]{this, cls});
        }
        try {
            return (T) this.f14177a.getInterface(cls);
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    public INoCaptchaComponent getNoCaptchaComp() {
        Object component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            component = ipChange.ipc$dispatch("2ea66e7b", new Object[]{this});
        } else {
            component = getComponent(14);
        }
        return (INoCaptchaComponent) component;
    }

    public IPkgValidityCheckComponent getPackageValidityCheckComp() {
        Object component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            component = ipChange.ipc$dispatch("5008a7a0", new Object[]{this});
        } else {
            component = getComponent(12);
        }
        return (IPkgValidityCheckComponent) component;
    }

    public IRootDetectComponent getRootDetectComp() {
        Object component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            component = ipChange.ipc$dispatch("b0fc2bc1", new Object[]{this});
        } else {
            component = getComponent(5);
        }
        return (IRootDetectComponent) component;
    }

    public String getSDKVerison() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76412af1", new Object[]{this});
        }
        com.alibaba.wireless.security.open.SecurityGuardManager securityGuardManager = this.f14177a;
        if (securityGuardManager != null) {
            return securityGuardManager.getSDKVerison();
        }
        return null;
    }

    public ISafeTokenComponent getSafeTokenComp() {
        Object component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            component = ipChange.ipc$dispatch("b066f048", new Object[]{this});
        } else {
            component = getComponent(16);
        }
        return (ISafeTokenComponent) component;
    }

    public ISecureSignatureComponent getSecureSignatureComp() {
        Object component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            component = ipChange.ipc$dispatch("a1ac5833", new Object[]{this});
        } else {
            component = getComponent(1);
        }
        return (ISecureSignatureComponent) component;
    }

    public ISecurityBodyComponent getSecurityBodyComp() {
        Object component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            component = ipChange.ipc$dispatch("1f8fc8be", new Object[]{this});
        } else {
            component = getComponent(8);
        }
        return (ISecurityBodyComponent) component;
    }

    public ISecurityDNSComponent getSecurityDNSComp() {
        Object component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            component = ipChange.ipc$dispatch("f4c5820b", new Object[]{this});
        } else {
            component = getComponent(11);
        }
        return (ISecurityDNSComponent) component;
    }

    public ISimulatorDetectComponent getSimulatorDetectComp() {
        Object component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            component = ipChange.ipc$dispatch("a7a7cead", new Object[]{this});
        } else {
            component = getComponent(10);
        }
        return (ISimulatorDetectComponent) component;
    }

    public IStaticDataEncryptComponent getStaticDataEncryptComp() {
        Object component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            component = ipChange.ipc$dispatch("f13a43c7", new Object[]{this});
        } else {
            component = getComponent(7);
        }
        return (IStaticDataEncryptComponent) component;
    }

    public IStaticDataStoreComponent getStaticDataStoreComp() {
        Object component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            component = ipChange.ipc$dispatch("121d2a8b", new Object[]{this});
        } else {
            component = getComponent(4);
        }
        return (IStaticDataStoreComponent) component;
    }

    public Boolean isOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("78f53dd8", new Object[]{this});
        }
        return Boolean.FALSE;
    }
}
