package com.taobao.dp;

import android.content.Context;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.alibaba.wireless.security.open.umid.IUMIDInitListenerEx;
import com.taobao.dp.util.C0552;
import com.taobao.dp.util.C0553;
import com.taobao.dp.util.CallbackHelper;

/* loaded from: classes.dex */
public final class DeviceSecuritySDKImpl {
    private static final boolean DEBUG = false;
    private static final int SECURITY_TOKEN_LENGTH = 32;
    private static final String TAG = "DeviceSecuritySDKImpl";
    private static final int UTDID_LENGTH = 24;
    private static DeviceSecuritySDKImpl instance;
    private Context mContext;
    private int mEnv = 0;
    private C0552 mListenerHelper;
    private ISecurityGuardPlugin mPlugin;

    public DeviceSecuritySDKImpl(ISecurityGuardPlugin iSecurityGuardPlugin) {
        this.mListenerHelper = null;
        this.mContext = null;
        this.mPlugin = null;
        this.mContext = iSecurityGuardPlugin.getContext();
        this.mPlugin = iSecurityGuardPlugin;
        this.mListenerHelper = new C0552();
        CallbackHelper.getInstance();
        CallbackHelper.init(this);
    }

    private int getEnvironment(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return this.mEnv;
            }
        }
        return i2;
    }

    private String getSecurityTokenNative(int i, boolean z) {
        return (String) this.mPlugin.getRouter().doCommand(22302, Integer.valueOf(i), Boolean.valueOf(z));
    }

    private void initUMIDNative(int i) {
        this.mPlugin.getRouter().doCommand(22301, Integer.valueOf(i));
    }

    private void resetClientDataNative(int i) {
        this.mPlugin.getRouter().doCommand(22304, Integer.valueOf(i));
    }

    private void setOnlineHostNative(String str) {
        this.mPlugin.getRouter().doCommand(22303, str);
    }

    public C0552 getListenerHelper() {
        return this.mListenerHelper;
    }

    public String getSecurityToken(int i, boolean z) {
        String securityTokenNative = getSecurityTokenNative(i, z);
        return (securityTokenNative == null || "".equals(securityTokenNative) || !(securityTokenNative.length() == 32 || securityTokenNative.length() == 24)) ? "000000000000000000000000" : securityTokenNative;
    }

    public void init(IUMIDInitListenerEx iUMIDInitListenerEx) {
        int i = this.mEnv;
        this.mListenerHelper.m329(i, iUMIDInitListenerEx);
        initUMIDNative(i);
    }

    public void initAsync(int i, IUMIDInitListenerEx iUMIDInitListenerEx) {
        int environment = getEnvironment(i);
        setEnvironment(environment);
        this.mListenerHelper.m329(environment, iUMIDInitListenerEx);
        initUMIDNative(environment);
    }

    public int initSync(int i) {
        int environment = getEnvironment(i);
        setEnvironment(environment);
        C0553 r0 = new C0553(environment);
        this.mListenerHelper.m329(environment, r0);
        initUMIDNative(environment);
        try {
            synchronized (r0) {
                r0.m331();
            }
            return r0.m330();
        } catch (Exception unused) {
            return 999;
        }
    }

    public void registerListener(IUMIDInitListenerEx iUMIDInitListenerEx) {
        this.mListenerHelper.m329(this.mEnv, iUMIDInitListenerEx);
    }

    public void setEnvironment(int i) {
        if (this.mEnv != i) {
            this.mEnv = i;
        }
    }

    public synchronized void setOnlineHost(String str) throws IllegalArgumentException {
        if (str != null) {
            if (str.length() != 0) {
                setOnlineHostNative(str);
            }
        }
        throw new IllegalArgumentException("host is null");
    }
}
