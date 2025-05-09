package org.android.spdy;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class StrategyInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int seq;
    private StrategyStatus status;
    private String tunnelHost;
    private int tunnelPort;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public enum StrategyStatus {
        UNUSED(0),
        SUCCESS(1),
        FAIL(2);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int strategyStatus;

        StrategyStatus(int i) {
            this.strategyStatus = i;
        }

        public static /* synthetic */ Object ipc$super(StrategyStatus strategyStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/android/spdy/StrategyInfo$StrategyStatus");
        }

        public static StrategyStatus valueOf(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (StrategyStatus) ipChange.ipc$dispatch("7c653496", new Object[]{str}) : (StrategyStatus) Enum.valueOf(StrategyStatus.class, str);
        }

        public int getStrategyStatusInt() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("61a9b22e", new Object[]{this})).intValue();
            }
            return this.strategyStatus;
        }

        public void setStrategyStatus(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1913e175", new Object[]{this, new Integer(i)});
            } else {
                this.strategyStatus = i;
            }
        }

        public static StrategyStatus valueOf(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StrategyStatus) ipChange.ipc$dispatch("86de1afb", new Object[]{new Integer(i)});
            }
            if (i == 1) {
                return SUCCESS;
            }
            if (i != 2) {
                return UNUSED;
            }
            return FAIL;
        }
    }

    public StrategyInfo(String str, int i, int i2) {
        this.status = StrategyStatus.UNUSED;
        this.tunnelPort = 443;
        this.tunnelHost = str;
        if (i > 0) {
            this.tunnelPort = i;
        }
        this.seq = i2 < 0 ? -i2 : i2;
    }

    public String getTunnelStrategyHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50137660", new Object[]{this});
        }
        return this.tunnelHost;
    }

    public int getTunnelStrategyPort() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3238548c", new Object[]{this})).intValue();
        }
        return this.tunnelPort;
    }

    public int getTunnelStrategySeq() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e8ed328", new Object[]{this})).intValue();
        }
        return this.seq;
    }

    public StrategyStatus getTunnelStrategyStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StrategyStatus) ipChange.ipc$dispatch("83e690a5", new Object[]{this});
        }
        return this.status;
    }

    public String infoToString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("190009ff", new Object[]{this});
        }
        return this.tunnelHost + "_" + this.tunnelPort + "_" + this.seq;
    }

    public void setStrategyStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1913e175", new Object[]{this, new Integer(i)});
        } else {
            this.status.setStrategyStatus(i);
        }
    }

    public StrategyInfo(StrategyInfo strategyInfo) {
        this.status = StrategyStatus.UNUSED;
        this.tunnelPort = 443;
        if (strategyInfo != null) {
            this.tunnelHost = strategyInfo.tunnelHost;
            this.tunnelPort = strategyInfo.tunnelPort;
            this.seq = strategyInfo.seq;
            this.status = strategyInfo.status;
        }
    }
}
