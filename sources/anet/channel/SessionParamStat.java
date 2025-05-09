package anet.channel;

import anet.channel.entity.ProtocolType;
import anet.channel.entity.SessionType;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SessionParamStat {
    public int forceCellType;
    public boolean isNoStrategy;
    public boolean isRetry;
    public int protocolType;
    public String req;
    public UseRetryType retryType;
    public int sessionFlag;
    public int sessionType;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum UseConnectType {
        DEFAULT,
        IPV6,
        H3,
        INVALID_STRATEGY,
        UNIT,
        ACCESS_POINT,
        DEF_NIC;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(UseConnectType useConnectType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/SessionParamStat$UseConnectType");
        }

        public static UseConnectType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UseConnectType) ipChange.ipc$dispatch("6c0ef3d5", new Object[]{str});
            }
            return (UseConnectType) Enum.valueOf(UseConnectType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum UseRetryType {
        SHORT_LINK,
        LONG_LINK,
        AMDC_LONG_LINK,
        VALID_AMDC_LONG_LINK;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(UseRetryType useRetryType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/SessionParamStat$UseRetryType");
        }

        public static UseRetryType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UseRetryType) ipChange.ipc$dispatch("dce0b057", new Object[]{str});
            }
            return (UseRetryType) Enum.valueOf(UseRetryType.class, str);
        }
    }

    static {
        t2o.a(607125537);
    }

    public SessionParamStat(int i) {
        this.req = "";
        this.isRetry = false;
        this.retryType = UseRetryType.SHORT_LINK;
        this.sessionFlag = UseConnectType.DEFAULT.ordinal();
        this.isNoStrategy = false;
        this.forceCellType = -1;
        this.sessionType = SessionType.ALL;
        this.protocolType = ProtocolType.ALL;
        this.sessionFlag = i;
    }

    public SessionParamStat(String str, boolean z, int i, int i2) {
        this.req = "";
        this.isRetry = false;
        this.retryType = UseRetryType.SHORT_LINK;
        this.sessionFlag = UseConnectType.DEFAULT.ordinal();
        this.isNoStrategy = false;
        this.forceCellType = -1;
        this.sessionType = SessionType.ALL;
        this.protocolType = ProtocolType.ALL;
        this.req = str;
        this.isRetry = z;
        this.forceCellType = i2;
        if (i >= 0 && i < UseConnectType.values().length) {
            this.retryType = UseRetryType.values()[i];
        }
    }
}
