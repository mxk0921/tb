package anet.channel.strategy;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.PolicyVersionStat;
import anet.channel.statist.StrategyStatistic;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.hxj;
import tb.t2o;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class StrategyCollection implements Serializable, Parcelable {
    public static final Parcelable.Creator<StrategyCollection> CREATOR = new Parcelable.Creator<StrategyCollection>() { // from class: anet.channel.strategy.StrategyCollection.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StrategyCollection createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (StrategyCollection) ipChange.ipc$dispatch("57f8740", new Object[]{this, parcel}) : new StrategyCollection(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StrategyCollection[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (StrategyCollection[]) ipChange.ipc$dispatch("1f7ebee9", new Object[]{this, new Integer(i)}) : new StrategyCollection[i];
        }
    };
    public static final int DEFAULT_STRATEGY_MODE = 0;
    private static final long MAX_AVAILABLE_PERIOD = 172800000;
    private static final String TAG = "awcn.StrategyCollection";
    private static final int UPDATE_MODE_DEFAULT = 0;
    private static final int UPDATE_MODE_LAZY = 2;
    private static final int UPDATE_MODE_ONCE = 3;
    private static final int UPDATE_MODE_PRE = 1;
    private static final long serialVersionUID = 1454976454894208229L;
    Map<String, Boolean> abStrategy;
    volatile String cname;
    String host;
    private transient boolean isFirstUsed;
    boolean isFixed;
    private transient boolean isUpdated;
    private transient long lastAmdcRequestSend;
    volatile long lastLongModified;
    volatile long lastMtopModified;
    volatile long lastOtherModified;
    private StrategyEntity strategyEntity;
    private StrategyList strategyList;
    volatile long ttl;
    int updateMode;
    int version;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum StrategyClear {
        UNKNOWN,
        NO,
        YES;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(StrategyClear strategyClear, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/strategy/StrategyCollection$StrategyClear");
        }

        public static StrategyClear valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StrategyClear) ipChange.ipc$dispatch("fd3f2f28", new Object[]{str});
            }
            return (StrategyClear) Enum.valueOf(StrategyClear.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum StrategyType {
        DEFAULT_STRATEGY,
        MTOP_STRATEGY,
        OTHER_STRATEGY,
        LONG_STRATEGY,
        CANCEL_HARD_EXPIRY;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(StrategyType strategyType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/strategy/StrategyCollection$StrategyType");
        }

        public static StrategyType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StrategyType) ipChange.ipc$dispatch("bece6167", new Object[]{str});
            }
            return (StrategyType) Enum.valueOf(StrategyType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum StrategyValid {
        NO,
        VALID,
        INVALID;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(StrategyValid strategyValid, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/strategy/StrategyCollection$StrategyValid");
        }

        public static StrategyValid valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StrategyValid) ipChange.ipc$dispatch("1d138b59", new Object[]{str});
            }
            return (StrategyValid) Enum.valueOf(StrategyValid.class, str);
        }
    }

    static {
        t2o.a(607125849);
    }

    public StrategyCollection() {
        this.strategyList = null;
        this.strategyEntity = null;
        this.ttl = 0L;
        this.cname = null;
        this.isFixed = false;
        this.version = 0;
        this.updateMode = 0;
        this.lastAmdcRequestSend = 0L;
        this.isFirstUsed = true;
        this.isUpdated = false;
        this.lastLongModified = 0L;
        this.lastMtopModified = 0L;
        this.lastOtherModified = 0L;
    }

    public synchronized void checkInit() {
        long j;
        try {
            if (!AwcnConfig.isCancelHardExpiryEnable()) {
                if (AwcnConfig.isAmdcStrategyOptEnable()) {
                    j = AwcnConfig.getLongAmdcThreshold();
                } else {
                    j = 172800000;
                }
                if (System.currentTimeMillis() - this.ttl > j) {
                    this.strategyList = null;
                    this.strategyEntity = null;
                    return;
                }
            }
            StrategyEntity strategyEntity = this.strategyEntity;
            if (strategyEntity != null) {
                strategyEntity.checkInit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean clearStrategy() {
        StrategyEntity strategyEntity = this.strategyEntity;
        if (strategyEntity != null) {
            return strategyEntity.clearStrategy(this.strategyList);
        }
        StrategyList strategyList = this.strategyList;
        if (strategyList == null) {
            return false;
        }
        return strategyList.clearStrategy();
    }

    public void commitStrategyMonitor(StrategyStatistic strategyStatistic) {
        StrategyEntity strategyEntity = this.strategyEntity;
        if (!(strategyEntity == null || strategyEntity.getIpStrategyList() == null)) {
            strategyStatistic.ipStrategyListSize += this.strategyEntity.getIpStrategyList().size();
        }
        StrategyEntity strategyEntity2 = this.strategyEntity;
        if (strategyEntity2 != null && strategyEntity2.getHistoryItemMap() != null) {
            strategyStatistic.historyItemMapSize += this.strategyEntity.getHistoryItemMap().size();
            strategyStatistic.connHistoryItemSize += this.strategyEntity.getHistoryItemMap().entrySet().size();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public synchronized boolean getAbStrategyStatus(String str) {
        Map<String, Boolean> map = this.abStrategy;
        boolean z = false;
        if (map == null) {
            return false;
        }
        Boolean bool = map.get(str);
        if (bool != null) {
            z = bool.booleanValue();
        }
        return z;
    }

    public StrategyTypeStat getExpireType(String str, long j) {
        StrategyValid strategyValid;
        if (AwcnConfig.isCancelHardExpiryEnable()) {
            if (GlobalAppRuntimeInfo.getInitTime() > j) {
                strategyValid = StrategyValid.INVALID;
            } else {
                strategyValid = StrategyValid.VALID;
            }
            return new StrategyTypeStat(StrategyType.CANCEL_HARD_EXPIRY, strategyValid);
        } else if (!AwcnConfig.isAmdcStrategyOptEnable()) {
            return new StrategyTypeStat(StrategyType.DEFAULT_STRATEGY);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (AwcnConfig.isHostInLongAmdcWhiteList(this.host)) {
                return dueToExpireType(str + " long ", this.lastLongModified, j, currentTimeMillis, new StrategyTypeStat(StrategyType.LONG_STRATEGY, AwcnConfig.getLongAmdcThreshold(), AwcnConfig.getLongAmdcThreshold()));
            } else if (AwcnConfig.isHostInMtopAmdcWhiteList(this.host)) {
                return dueToExpireType(str + " mtop ", this.lastMtopModified, j, currentTimeMillis, new StrategyTypeStat(StrategyType.MTOP_STRATEGY, AwcnConfig.getAmdcClearThreshold(), AwcnConfig.getMtopAmdcThreshold()));
            } else {
                return dueToExpireType(str + " other ", this.lastOtherModified, j, currentTimeMillis, new StrategyTypeStat(StrategyType.OTHER_STRATEGY, AwcnConfig.getAmdcClearThreshold(), AwcnConfig.getOtherAmdcThreshold()));
            }
        }
    }

    public boolean isExpired() {
        if (System.currentTimeMillis() > this.ttl) {
            return true;
        }
        return false;
    }

    public boolean isExpiredStrategy() {
        if (System.currentTimeMillis() - this.ttl >= 86400000) {
            return true;
        }
        return false;
    }

    public boolean isSupportUpdateMode(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    public synchronized void notifyConnEvent(IConnStrategy iConnStrategy, ConnEvent connEvent) {
        StrategyEntity strategyEntity = this.strategyEntity;
        if (strategyEntity != null) {
            strategyEntity.notifyConnEvent(iConnStrategy, connEvent);
            if (!connEvent.isSuccess && this.strategyEntity.shouldRefresh()) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.lastAmdcRequestSend > 60000) {
                    StrategyCenter.getInstance().forceRefreshStrategy(this.host);
                    this.lastAmdcRequestSend = currentTimeMillis;
                }
            }
        }
    }

    public boolean parseStrategyData() {
        StrategyList strategyList;
        if (this.strategyEntity != null || (strategyList = this.strategyList) == null) {
            return false;
        }
        this.strategyEntity = parseToStrategyEntity(strategyList);
        this.strategyList = null;
        ALog.e(TAG, "parseStrategyData to strategyEntity success.", null, new Object[0]);
        return true;
    }

    public StrategyEntity parseToStrategyEntity(StrategyList strategyList) {
        try {
            return new StrategyEntity(strategyList.getIpStrategyList(this.host), strategyList.getHistoryItemMap(this.host), strategyList.isContainsStaticIp());
        } catch (Exception e) {
            ALog.e(TAG, "parseToStrategyEntity error!", null, e, new Object[0]);
            return null;
        }
    }

    public synchronized List<IConnStrategy> queryStrategyList() {
        return queryStrategyList("", false, "", null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("\nStrategyCollection = ");
        sb.append(this.ttl);
        if (this.strategyList != null) {
            sb.append("\nStrategyList = ");
            sb.append(this.strategyList.toString());
        } else if (this.strategyEntity != null) {
            sb.append("\nstrategyEntity = ");
            sb.append(this.strategyEntity.toString());
        } else if (this.cname != null) {
            sb.append('[');
            sb.append(this.host);
            sb.append("=>");
            sb.append(this.cname);
            sb.append(']');
        } else {
            sb.append(MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
        parcel.writeString(this.host);
        parcel.writeParcelable(this.strategyList, i);
        parcel.writeParcelable(this.strategyEntity, i);
        parcel.writeLong(this.ttl);
        parcel.writeString(this.cname);
        parcel.writeInt(this.isFixed ? 1 : 0);
        parcel.writeInt(this.version);
        parcel.writeInt(this.updateMode);
        parcel.writeMap(this.abStrategy);
        parcel.writeLong(this.lastLongModified);
        parcel.writeLong(this.lastMtopModified);
        parcel.writeLong(this.lastOtherModified);
    }

    public synchronized List<IConnStrategy> queryStrategyList(String str, boolean z, String str2, StrategyTypeStat strategyTypeStat) {
        if (this.strategyEntity == null) {
            ALog.e(TAG, "[strategy opt] queryStrategyList, strategyEntity null", null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", str, hxj.UNIQID, str2);
            return Collections.EMPTY_LIST;
        }
        if (this.isFirstUsed) {
            this.isFirstUsed = false;
            PolicyVersionStat policyVersionStat = new PolicyVersionStat(str, this.version);
            policyVersionStat.reportType = 0;
            AppMonitor.getInstance().commitStat(policyVersionStat);
        }
        return this.strategyEntity.getStrategyList(str, z, str2, strategyTypeStat);
    }

    public boolean isAllowUpdate(boolean z) {
        if (!AmdcRuntimeInfo.isUpdateModeEnable()) {
            return true;
        }
        int i = this.updateMode;
        if (!(i == 0 || i == 1)) {
            if (i != 2) {
                if (i == 3) {
                    z = !this.isUpdated;
                }
            }
            ALog.i(TAG, "[isAllowUpdate]", null, "host", this.host, "updateMode", Integer.valueOf(i), "status", Boolean.valueOf(z));
            return z;
        }
        z = true;
        ALog.i(TAG, "[isAllowUpdate]", null, "host", this.host, "updateMode", Integer.valueOf(i), "status", Boolean.valueOf(z));
        return z;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class StrategyTypeStat {
        public StrategyClear strategyClear;
        public long strategyClearThreshold;
        public long strategyThreshold;
        public StrategyType strategyType;
        public StrategyValid strategyValid;

        static {
            t2o.a(607125853);
        }

        public StrategyTypeStat(StrategyType strategyType, long j, long j2) {
            this.strategyType = StrategyType.DEFAULT_STRATEGY;
            this.strategyValid = StrategyValid.NO;
            this.strategyClear = StrategyClear.UNKNOWN;
            this.strategyType = strategyType;
            this.strategyClearThreshold = j;
            this.strategyThreshold = j2;
        }

        public StrategyTypeStat(StrategyType strategyType) {
            this.strategyType = StrategyType.DEFAULT_STRATEGY;
            this.strategyValid = StrategyValid.NO;
            this.strategyClear = StrategyClear.UNKNOWN;
            this.strategyType = strategyType;
            this.strategyClearThreshold = 172800000L;
            this.strategyThreshold = 172800000L;
        }

        public StrategyTypeStat(StrategyType strategyType, StrategyValid strategyValid) {
            this.strategyType = StrategyType.DEFAULT_STRATEGY;
            this.strategyValid = StrategyValid.NO;
            this.strategyClear = StrategyClear.UNKNOWN;
            this.strategyClearThreshold = -1L;
            this.strategyThreshold = -1L;
            this.strategyType = strategyType;
            this.strategyClear = StrategyClear.NO;
            this.strategyValid = strategyValid;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0084 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x000a, B:6:0x0013, B:9:0x001a, B:12:0x002a, B:13:0x007a, B:15:0x0084, B:18:0x00a4, B:20:0x00aa, B:21:0x00be, B:23:0x00c6, B:25:0x00cc, B:27:0x00d0, B:28:0x00d7, B:29:0x00de, B:31:0x00e6, B:32:0x00ea, B:34:0x00f0, B:37:0x00f5, B:39:0x00f9, B:41:0x0132, B:43:0x0138, B:44:0x016f, B:46:0x0173, B:47:0x01aa, B:49:0x01ae, B:50:0x01e4, B:53:0x01ef), top: B:58:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x000a, B:6:0x0013, B:9:0x001a, B:12:0x002a, B:13:0x007a, B:15:0x0084, B:18:0x00a4, B:20:0x00aa, B:21:0x00be, B:23:0x00c6, B:25:0x00cc, B:27:0x00d0, B:28:0x00d7, B:29:0x00de, B:31:0x00e6, B:32:0x00ea, B:34:0x00f0, B:37:0x00f5, B:39:0x00f9, B:41:0x0132, B:43:0x0138, B:44:0x016f, B:46:0x0173, B:47:0x01aa, B:49:0x01ae, B:50:0x01e4, B:53:0x01ef), top: B:58:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void updateStrategy(anet.channel.strategy.StrategyResultParser.Dns r17, java.lang.String r18, java.lang.String r19, anet.channel.strategy.StrategyCollection.StrategyTypeStat r20) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.strategy.StrategyCollection.updateStrategy(anet.channel.strategy.StrategyResultParser$Dns, java.lang.String, java.lang.String, anet.channel.strategy.StrategyCollection$StrategyTypeStat):void");
    }

    private StrategyTypeStat dueToExpireType(String str, long j, long j2, long j3, StrategyTypeStat strategyTypeStat) {
        if (strategyTypeStat == null) {
            ALog.e(TAG, "[strategy opt] dueToExpireType, st is null!!" + str, null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", this.host);
            return null;
        }
        long j4 = j == 0 ? j2 : j;
        if (AwcnConfig.isAmdcStrategyUpdateEnable()) {
            int i = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
            if (i != 0) {
                long j5 = j3 - j4;
                if (j5 > strategyTypeStat.strategyClearThreshold) {
                    ALog.e(TAG, "[strategy opt] [clear strategy!] " + str + " ,strategy curTime - lastModified = " + j5, null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", this.host);
                    strategyTypeStat.strategyValid = StrategyValid.INVALID;
                    strategyTypeStat.strategyClear = StrategyClear.YES;
                    return strategyTypeStat;
                }
            }
            if (i != 0) {
                long j6 = j3 - j4;
                if (j6 > strategyTypeStat.strategyThreshold) {
                    ALog.e(TAG, "[strategy opt] [clear strategy!] " + str + " ,strategy curTime - lastModified = " + j6, null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", this.host);
                    strategyTypeStat.strategyValid = StrategyValid.INVALID;
                    strategyTypeStat.strategyClear = StrategyClear.NO;
                    return strategyTypeStat;
                }
            }
            strategyTypeStat.strategyClear = StrategyClear.NO;
        } else if (j4 != 0) {
            long j7 = j3 - j4;
            if (j7 > strategyTypeStat.strategyThreshold) {
                ALog.e(TAG, "[strategy opt] " + str + " ,strategy curTime - lastModified = " + j7, null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", this.host);
                strategyTypeStat.strategyValid = StrategyValid.INVALID;
                return strategyTypeStat;
            }
        }
        strategyTypeStat.strategyValid = StrategyValid.VALID;
        return strategyTypeStat;
    }

    public StrategyCollection(String str) {
        this.strategyList = null;
        this.strategyEntity = null;
        this.ttl = 0L;
        this.cname = null;
        this.isFixed = false;
        this.version = 0;
        this.updateMode = 0;
        this.lastAmdcRequestSend = 0L;
        this.isFirstUsed = true;
        this.isUpdated = false;
        this.lastLongModified = 0L;
        this.lastMtopModified = 0L;
        this.lastOtherModified = 0L;
        this.host = str;
        this.isFixed = DispatchConstants.isAmdcServerDomain(str);
    }

    public StrategyCollection(String str, long j) {
        this.strategyList = null;
        this.strategyEntity = null;
        this.ttl = 0L;
        this.cname = null;
        this.isFixed = false;
        this.version = 0;
        this.updateMode = 0;
        this.lastAmdcRequestSend = 0L;
        this.isFirstUsed = true;
        this.isUpdated = false;
        this.lastLongModified = 0L;
        this.lastMtopModified = 0L;
        this.lastOtherModified = 0L;
        this.host = str;
        this.isFixed = DispatchConstants.isAmdcServerDomain(str);
        this.ttl = j;
    }

    public StrategyCollection(Parcel parcel) {
        this.strategyList = null;
        this.strategyEntity = null;
        this.ttl = 0L;
        this.cname = null;
        boolean z = false;
        this.isFixed = false;
        this.version = 0;
        this.updateMode = 0;
        this.lastAmdcRequestSend = 0L;
        this.isFirstUsed = true;
        this.isUpdated = false;
        this.lastLongModified = 0L;
        this.lastMtopModified = 0L;
        this.lastOtherModified = 0L;
        int readInt = parcel.readInt();
        if (readInt == 1) {
            this.host = parcel.readString();
            this.strategyList = (StrategyList) parcel.readParcelable(StrategyList.class.getClassLoader());
            this.strategyEntity = (StrategyEntity) parcel.readParcelable(StrategyEntity.class.getClassLoader());
            this.ttl = parcel.readLong();
            this.cname = parcel.readString();
            this.isFixed = parcel.readInt() == 1 ? true : z;
            this.version = parcel.readInt();
            this.updateMode = parcel.readInt();
            if (this.abStrategy == null) {
                this.abStrategy = new ConcurrentHashMap();
            }
            parcel.readMap(this.abStrategy, Boolean.class.getClassLoader());
            this.lastLongModified = parcel.readLong();
            this.lastMtopModified = parcel.readLong();
            this.lastOtherModified = parcel.readLong();
            return;
        }
        throw new IllegalArgumentException("StrategyCollection Unsupported Parcelable version: " + readInt);
    }
}
