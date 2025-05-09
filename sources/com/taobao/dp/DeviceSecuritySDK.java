package com.taobao.dp;

import android.content.Context;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.compat.ICompatComponent;
import com.alibaba.wireless.security.open.umid.IUMIDComponent;
import com.alibaba.wireless.security.open.umid.IUMIDInitListenerEx;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dp.client.IInitResultListener;
import com.taobao.dp.http.IUrlRequestService;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class DeviceSecuritySDK {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ENVIRONMENT_DAILY = 2;
    public static final int ENVIRONMENT_ONLINE = 0;
    public static final int ENVIRONMENT_PRE = 1;
    private static DeviceSecuritySDK instance = null;
    private ICompatComponent mCompatComponent;
    private IUMIDComponent mUmidComponent;
    private String mVersion;

    static {
        t2o.a(421527553);
    }

    private DeviceSecuritySDK(Context context) {
        this.mUmidComponent = null;
        this.mCompatComponent = null;
        try {
            SecurityGuardManager instance2 = SecurityGuardManager.getInstance(context);
            IUMIDComponent iUMIDComponent = (IUMIDComponent) instance2.getInterface(IUMIDComponent.class);
            this.mUmidComponent = iUMIDComponent;
            if (iUMIDComponent == null) {
                this.mCompatComponent = (ICompatComponent) instance2.getInterface(ICompatComponent.class);
            }
            this.mVersion = instance2.getSDKVerison();
        } catch (SecException e) {
            e.printStackTrace();
        }
    }

    public static DeviceSecuritySDK getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceSecuritySDK) ipChange.ipc$dispatch("2c84b133", new Object[]{context});
        }
        if (instance == null) {
            synchronized (DeviceSecuritySDK.class) {
                try {
                    if (instance == null) {
                        instance = new DeviceSecuritySDK(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    @Deprecated
    public String getSecurityToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("900fd3f6", new Object[]{this});
        }
        String str = "000000000000000000000000";
        try {
            IUMIDComponent iUMIDComponent = this.mUmidComponent;
            if (iUMIDComponent != null) {
                str = iUMIDComponent.getSecurityToken();
            } else {
                ICompatComponent iCompatComponent = this.mCompatComponent;
                if (iCompatComponent != null) {
                    str = iCompatComponent.getCachedSecurityToken(0);
                }
            }
        } catch (SecException e) {
            e.printStackTrace();
        }
        return str;
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return this.mVersion;
    }

    @Deprecated
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        try {
            IUMIDComponent iUMIDComponent = this.mUmidComponent;
            if (iUMIDComponent != null) {
                iUMIDComponent.initUMID();
            }
        } catch (SecException e) {
            e.printStackTrace();
        }
    }

    public void initAsync(String str, int i, IUrlRequestService iUrlRequestService, IInitResultListener iInitResultListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d684ab1", new Object[]{this, str, new Integer(i), iUrlRequestService, iInitResultListener});
        } else {
            initAsync(str, "", i, iUrlRequestService, iInitResultListener);
        }
    }

    public int initSync(String str, int i, IUrlRequestService iUrlRequestService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("437521ca", new Object[]{this, str, new Integer(i), iUrlRequestService})).intValue() : initSync(str, "", i, iUrlRequestService);
    }

    @Deprecated
    public void sendLoginResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61475c4f", new Object[]{this, str});
        }
    }

    public void setEnvironment(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aea9dab", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            IUMIDComponent iUMIDComponent = this.mUmidComponent;
            if (iUMIDComponent != null) {
                iUMIDComponent.setEnvironment(i);
            }
        } catch (SecException e) {
            e.printStackTrace();
        }
    }

    public synchronized void setOnlineHost(OnlineHost onlineHost) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bfa90e8", new Object[]{this, onlineHost});
        } else if (onlineHost != null) {
            try {
                IUMIDComponent iUMIDComponent = this.mUmidComponent;
                if (iUMIDComponent != null) {
                    iUMIDComponent.setOnlineHost(onlineHost.getHost());
                }
            } catch (SecException e) {
                e.printStackTrace();
            }
        } else {
            throw new IllegalArgumentException("host is null");
        }
    }

    public void initAsync(String str, String str2, int i, IUrlRequestService iUrlRequestService, final IInitResultListener iInitResultListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564838bb", new Object[]{this, str, str2, new Integer(i), iUrlRequestService, iInitResultListener});
            return;
        }
        IUMIDInitListenerEx iUMIDInitListenerEx = iInitResultListener != null ? new IUMIDInitListenerEx() { // from class: com.taobao.dp.DeviceSecuritySDK.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.wireless.security.open.umid.IUMIDInitListenerEx
            public void onUMIDInitFinishedEx(String str3, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1c2fc40b", new Object[]{this, str3, new Integer(i2)});
                } else {
                    iInitResultListener.onInitFinished(str3, i2);
                }
            }
        } : null;
        try {
            IUMIDComponent iUMIDComponent = this.mUmidComponent;
            if (iUMIDComponent != null) {
                iUMIDComponent.initUMID(i, iUMIDInitListenerEx);
            }
        } catch (SecException e) {
            e.printStackTrace();
            if (iInitResultListener != null) {
                iInitResultListener.onInitFinished(null, -1);
            }
        }
    }

    public int initSync(String str, String str2, int i, IUrlRequestService iUrlRequestService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfd9ea94", new Object[]{this, str, str2, new Integer(i), iUrlRequestService})).intValue();
        }
        try {
            IUMIDComponent iUMIDComponent = this.mUmidComponent;
            if (iUMIDComponent != null) {
                return iUMIDComponent.initUMIDSync(i);
            }
            return -1;
        } catch (SecException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Deprecated
    public void init(IUrlRequestService iUrlRequestService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("907114a7", new Object[]{this, iUrlRequestService});
            return;
        }
        try {
            IUMIDComponent iUMIDComponent = this.mUmidComponent;
            if (iUMIDComponent != null) {
                iUMIDComponent.initUMID();
            }
        } catch (SecException e) {
            e.printStackTrace();
        }
    }

    public String getSecurityToken(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b3699367", new Object[]{this, new Integer(i)});
        }
        String str = "000000000000000000000000";
        try {
            IUMIDComponent iUMIDComponent = this.mUmidComponent;
            if (iUMIDComponent != null) {
                str = iUMIDComponent.getSecurityToken(i);
            } else {
                ICompatComponent iCompatComponent = this.mCompatComponent;
                if (iCompatComponent != null) {
                    str = iCompatComponent.getCachedSecurityToken(i);
                }
            }
        } catch (SecException e) {
            e.printStackTrace();
        }
        return str;
    }
}
