package com.taobao.orange;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConfig;
import com.taobao.orange.OConstant;
import java.util.List;
import java.util.Map;
import tb.obk;
import tb.t2o;
import tb.y8l;
import tb.z8l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class OrangeConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(613417006);
    }

    public static OrangeConfig getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrangeConfig) ipChange.ipc$dispatch("19e3d995", new Object[0]);
        }
        return OrangeConfigImpl.p;
    }

    public abstract void addCandidate(OCandidate oCandidate);

    @Deprecated
    public abstract void enterBackground();

    @Deprecated
    public abstract void enterForeground();

    public abstract void fetchCriticalConfigs(Context context, String str, String str2, int i);

    public abstract void forceCheckUpdate();

    public abstract String getConfig(String str, String str2, String str3);

    public abstract Map<String, String> getConfigs(String str);

    public abstract String getCustomConfig(String str, String str2);

    @Deprecated
    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else {
            init(context, null, null);
        }
    }

    public abstract void init(Context context, OConfig oConfig);

    public abstract void registerListener(String[] strArr, obk obkVar, boolean z);

    @Deprecated
    public abstract void registerListener(String[] strArr, y8l y8lVar);

    @Deprecated
    public abstract void registerListener(String[] strArr, z8l z8lVar);

    @Deprecated
    public abstract void setAppSecret(String str);

    @Deprecated
    public abstract void setEnableDiffIndex(boolean z);

    @Deprecated
    public abstract void setHosts(List<String> list);

    @Deprecated
    public abstract void setIndexUpdateMode(int i);

    public abstract void setUserId(String str);

    public abstract void unregisterListener(String[] strArr);

    public abstract void unregisterListener(String[] strArr, obk obkVar);

    @Deprecated
    public abstract void unregisterListener(String[] strArr, z8l z8lVar);

    @Deprecated
    public void init(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72712a5", new Object[]{this, context, str, str2});
        } else {
            init(context, str, str2, OConstant.ENV.ONLINE.getEnvMode());
        }
    }

    @Deprecated
    public void init(Context context, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddbbb4fe", new Object[]{this, context, str, str2, new Integer(i)});
        } else {
            init(context, str, str2, i, OConstant.SERVER.TAOBAO.ordinal());
        }
    }

    @Deprecated
    public void init(Context context, String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9bb5dc5", new Object[]{this, context, str, str2, new Integer(i), new Integer(i2)});
        } else {
            init(context, str, str2, i, i2, null, null);
        }
    }

    @Deprecated
    public void init(Context context, String str, String str2, int i, int i2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4099d459", new Object[]{this, context, str, str2, new Integer(i), new Integer(i2), str3, str4});
        } else {
            init(context, str, str2, i, i2, null, null, null);
        }
    }

    @Deprecated
    public void init(Context context, String str, String str2, int i, int i2, String str3, String str4, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4007826", new Object[]{this, context, str, str2, new Integer(i), new Integer(i2), str3, str4, strArr});
        } else {
            init(context, str, str2, i, i2, str3, str4, strArr, false);
        }
    }

    @Deprecated
    public void init(Context context, String str, String str2, int i, int i2, String str3, String str4, String[] strArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc0f3f6e", new Object[]{this, context, str, str2, new Integer(i), new Integer(i2), str3, str4, strArr, new Boolean(z)});
        } else {
            init(context, new OConfig.Builder().setAppKey(str).setAppVersion(str2).setEnv(i).setServerType(i2).setIndexUpdateMode(OConstant.UPDMODE.O_XMD.ordinal()).setDcHost(str3).setAckHost(str4).setProbeHosts(strArr).setEnableDiffIndex(z).build());
        }
    }
}
