package anet.channel.entity;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum ENV {
    ONLINE(0),
    PREPARE(1),
    TEST(2);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int envMode;

    ENV(int i) {
        this.envMode = i;
    }

    public static /* synthetic */ Object ipc$super(ENV env, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/entity/ENV");
    }

    public static ENV valueOf(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ENV) ipChange.ipc$dispatch("d4d5266a", new Object[]{str}) : (ENV) Enum.valueOf(ENV.class, str);
    }

    public int getEnvMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6022b74", new Object[]{this})).intValue();
        }
        return this.envMode;
    }

    public void setEnvMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("308cb2ae", new Object[]{this, new Integer(i)});
        } else {
            this.envMode = i;
        }
    }

    public static ENV valueOf(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ENV) ipChange.ipc$dispatch("d66f6ae5", new Object[]{new Integer(i)});
        }
        if (i == 1) {
            return PREPARE;
        }
        if (i != 2) {
            return ONLINE;
        }
        return TEST;
    }
}
