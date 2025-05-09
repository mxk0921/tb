package com.taobao.location.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.StringUtil;
import java.util.List;
import tb.krg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TBLocationOption implements Parcelable {
    public static final Parcelable.Creator<TBLocationOption> CREATOR = new a();
    private int accuracy;
    private int dataModel;
    private String optionId;
    private int regionType;
    private int timeLimit;
    private long timeout;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum Accuracy {
        DEFAULT(0, 100, 999),
        TENMETER(1, 10, 99),
        HEKTOMETER(2, 100, 999),
        KILOMETER(3, 1000, krg.LOG_LEVEL_DEBUG);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int key;
        private int maxMeter;
        private int minMeter;

        Accuracy(int i, int i2, int i3) {
            this.key = i;
            this.minMeter = i2;
            this.maxMeter = i3;
        }

        public static /* synthetic */ Object ipc$super(Accuracy accuracy, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/location/common/TBLocationOption$Accuracy");
        }

        public static Accuracy valueOf(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Accuracy) ipChange.ipc$dispatch("dc7aac24", new Object[]{str}) : (Accuracy) Enum.valueOf(Accuracy.class, str);
        }

        public int getKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d201723", new Object[]{this})).intValue();
            }
            return this.key;
        }

        public int getMaxMeter() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d41f20f5", new Object[]{this})).intValue();
            }
            return this.maxMeter;
        }

        public int getMinMeter() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f0664bc7", new Object[]{this})).intValue();
            }
            return this.minMeter;
        }

        public boolean matchAccuray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a8d643ef", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i <= this.maxMeter) {
                return true;
            }
            return false;
        }

        public static Accuracy valueOf(int i) {
            Accuracy[] values;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Accuracy) ipChange.ipc$dispatch("e9ad5d89", new Object[]{new Integer(i)});
            }
            for (Accuracy accuracy : values()) {
                if (accuracy.key == i) {
                    return accuracy;
                }
            }
            return DEFAULT;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum DataModel {
        DEFAULT(0),
        NEED_ADDRESS(1),
        NEED_POI(2),
        NEED_ADDRESS_POI(3);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int type;

        DataModel(int i) {
            this.type = i;
        }

        public static /* synthetic */ Object ipc$super(DataModel dataModel, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/location/common/TBLocationOption$DataModel");
        }

        public static DataModel valueOf(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DataModel) ipChange.ipc$dispatch("ecc7d0fa", new Object[]{str}) : (DataModel) Enum.valueOf(DataModel.class, str);
        }

        public int getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
            }
            return this.type;
        }

        public boolean matchAddressModel(TBLocationDTO tBLocationDTO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("42e35b95", new Object[]{this, tBLocationDTO})).booleanValue();
            }
            int i = this.type;
            if (i != 1 && i != 3) {
                return true;
            }
            if (tBLocationDTO == null || StringUtil.isEmpty(tBLocationDTO.getAddress())) {
                return false;
            }
            return true;
        }

        public boolean matchPoiModel(TBLocationDTO tBLocationDTO) {
            List<TBPoiDetailDO> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1aa7fbff", new Object[]{this, tBLocationDTO})).booleanValue();
            }
            int i = this.type;
            if (i != 2 && i != 3) {
                return true;
            }
            if (tBLocationDTO == null || (list = tBLocationDTO.pois) == null || list.isEmpty()) {
                return false;
            }
            return true;
        }

        public static DataModel valueOf(int i) {
            DataModel[] values;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DataModel) ipChange.ipc$dispatch("85eb4c35", new Object[]{new Integer(i)});
            }
            for (DataModel dataModel : values()) {
                if (dataModel.getType() == i) {
                    return dataModel;
                }
            }
            return DEFAULT;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum RegionType {
        DEFAULT(0),
        DISTRICT(1);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int key;

        RegionType(int i) {
            this.key = i;
        }

        public static /* synthetic */ Object ipc$super(RegionType regionType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/location/common/TBLocationOption$RegionType");
        }

        public static RegionType valueOf(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RegionType) ipChange.ipc$dispatch("5d7056ef", new Object[]{str}) : (RegionType) Enum.valueOf(RegionType.class, str);
        }

        public int getKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d201723", new Object[]{this})).intValue();
            }
            return this.key;
        }

        public boolean matchRegionType(TBLocationDTO tBLocationDTO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9154edce", new Object[]{this, tBLocationDTO})).booleanValue();
            }
            if (tBLocationDTO == null || tBLocationDTO.getRegionType() == null || this.key < tBLocationDTO.getRegionType().intValue()) {
                return false;
            }
            return true;
        }

        public static RegionType valueOf(int i) {
            RegionType[] values;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RegionType) ipChange.ipc$dispatch("e8bc4314", new Object[]{new Integer(i)});
            }
            for (RegionType regionType : values()) {
                if (regionType.key == i) {
                    return regionType;
                }
            }
            return DEFAULT;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum TimeLimit {
        DEFAULT(0, 30),
        NO_CACHE(1, 0),
        TEN_MIN(2, 10),
        HALF_HOUR(3, 30),
        ONE_HOUR(4, 60),
        HALF_DAY(5, 720),
        ONE_DAY(6, 1440),
        ONE_MIN(7, 1),
        SEC_MIN(8, 2),
        THR_MIN(9, 3),
        FOR_MIN(10, 4),
        FIR_MIN(11, 5),
        TWO_HOUR(12, 120);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int key;
        private int time;

        TimeLimit(int i, int i2) {
            this.key = i;
            this.time = i2;
        }

        public static /* synthetic */ Object ipc$super(TimeLimit timeLimit, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/location/common/TBLocationOption$TimeLimit");
        }

        public static TimeLimit valueOf(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TimeLimit) ipChange.ipc$dispatch("cdedcf8b", new Object[]{str}) : (TimeLimit) Enum.valueOf(TimeLimit.class, str);
        }

        public int getKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d201723", new Object[]{this})).intValue();
            }
            return this.key;
        }

        public int getTime() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fff5e63d", new Object[]{this})).intValue();
            }
            return this.time;
        }

        public boolean matchTimeLimit(long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9706a934", new Object[]{this, new Long(j), new Long(j2)})).booleanValue();
            }
            if (j2 - j < this.time * 60000) {
                return true;
            }
            return false;
        }

        public static TimeLimit valueOf(int i) {
            TimeLimit[] values;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TimeLimit) ipChange.ipc$dispatch("67114ac6", new Object[]{new Integer(i)});
            }
            for (TimeLimit timeLimit : values()) {
                if (timeLimit.key == i) {
                    return timeLimit;
                }
            }
            return DEFAULT;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum Timeout {
        DEFAULT(0),
        HALF_SECOND(500),
        ONE_SECOND(1000),
        TWO_SECONDS(2000),
        THREE_SECONDS(3000),
        FIVE_SECONDS(5000),
        TEN_SECONDS(10000);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private long length;

        Timeout(long j) {
            this.length = j;
        }

        public static /* synthetic */ Object ipc$super(Timeout timeout, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/location/common/TBLocationOption$Timeout");
        }

        public static Timeout valueOf(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Timeout) ipChange.ipc$dispatch("864558f8", new Object[]{str}) : (Timeout) Enum.valueOf(Timeout.class, str);
        }

        public long getLength() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("33609457", new Object[]{this})).longValue();
            }
            return this.length;
        }

        public static Timeout valueOf(long j) {
            Timeout[] values;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Timeout) ipChange.ipc$dispatch("b848bc34", new Object[]{new Long(j)});
            }
            for (Timeout timeout : values()) {
                if (timeout.length == j) {
                    return timeout;
                }
            }
            return DEFAULT;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Parcelable.Creator<TBLocationOption> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public TBLocationOption createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBLocationOption) ipChange.ipc$dispatch("87719ff3", new Object[]{this, parcel});
            }
            return new TBLocationOption(parcel, null);
        }

        /* renamed from: b */
        public TBLocationOption[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBLocationOption[]) ipChange.ipc$dispatch("d25fdbaa", new Object[]{this, new Integer(i)});
            }
            return new TBLocationOption[i];
        }
    }

    static {
        t2o.a(756023323);
    }

    public /* synthetic */ TBLocationOption(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Accuracy getAccuracy() {
        return Accuracy.valueOf(this.accuracy);
    }

    public DataModel getDataModel() {
        return DataModel.valueOf(this.dataModel);
    }

    public String getOptionId() {
        return this.optionId;
    }

    public RegionType getRegionType() {
        return RegionType.valueOf(this.regionType);
    }

    public TimeLimit getTimeLimit() {
        return TimeLimit.valueOf(this.timeLimit);
    }

    public Timeout getTimeout() {
        return Timeout.valueOf(this.timeout);
    }

    public void readFromParcel(Parcel parcel) {
        this.dataModel = parcel.readInt();
        this.timeLimit = parcel.readInt();
        this.accuracy = parcel.readInt();
        this.regionType = parcel.readInt();
        this.optionId = parcel.readString();
    }

    public void setAccuracy(Accuracy accuracy) {
        this.accuracy = accuracy.getKey();
    }

    public void setDataModel(DataModel dataModel) {
        this.dataModel = dataModel.getType();
    }

    public void setOptionId(String str) {
        this.optionId = str;
    }

    public void setRegionType(RegionType regionType) {
        if (regionType != null) {
            this.regionType = regionType.getKey();
        }
    }

    public void setTimeLimit(TimeLimit timeLimit) {
        this.timeLimit = timeLimit.getKey();
    }

    public void setTimeout(Timeout timeout) {
        this.timeout = timeout.getLength();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.dataModel);
        parcel.writeInt(this.timeLimit);
        parcel.writeInt(this.accuracy);
        parcel.writeInt(this.regionType);
        parcel.writeString(this.optionId);
    }

    public TBLocationOption() {
    }

    private TBLocationOption(Parcel parcel) {
        readFromParcel(parcel);
    }
}
