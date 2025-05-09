package com.alipay.android.msp.network.pb.v3;

import com.alipay.android.msp.framework.wire.Message;
import com.alipay.android.msp.framework.wire.ProtoField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MspChannelValue extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_ASSIGNEDCHANNEL = "";
    public static final String DEFAULT_AVAILABLEAMOUNT = "";
    public static final String DEFAULT_CHANNELFULLNAME = "";
    public static final String DEFAULT_CHANNELINDEX = "";
    public static final String DEFAULT_CHANNELNAME = "";
    public static final String DEFAULT_CHANNELTYPE = "";
    public static final String DEFAULT_EXTINFO = "";
    public static final Integer DEFAULT_LARGELIMITSIGNABLE = 0;
    public static final int TAG_ASSIGNEDCHANNEL = 1;
    public static final int TAG_AVAILABLEAMOUNT = 2;
    public static final int TAG_CARDINFO = 3;
    public static final int TAG_CHANNELFULLNAME = 4;
    public static final int TAG_CHANNELINDEX = 5;
    public static final int TAG_CHANNELNAME = 6;
    public static final int TAG_CHANNELTYPE = 7;
    public static final int TAG_EXTINFO = 9;
    public static final int TAG_LARGELIMITSIGNABLE = 8;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public String assignedChannel;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public String availableAmount;
    @ProtoField(tag = 3)
    public MspCardInfo cardInfo;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public String channelFullName;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public String channelIndex;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public String channelName;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public String channelType;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public String extinfo;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public Integer largeLimitSignable;

    public MspChannelValue(MspChannelValue mspChannelValue) {
        super(mspChannelValue);
        if (mspChannelValue != null) {
            this.assignedChannel = mspChannelValue.assignedChannel;
            this.availableAmount = mspChannelValue.availableAmount;
            this.cardInfo = mspChannelValue.cardInfo;
            this.channelFullName = mspChannelValue.channelFullName;
            this.channelIndex = mspChannelValue.channelIndex;
            this.channelName = mspChannelValue.channelName;
            this.channelType = mspChannelValue.channelType;
            this.largeLimitSignable = mspChannelValue.largeLimitSignable;
            this.extinfo = mspChannelValue.extinfo;
        }
    }

    public static /* synthetic */ Object ipc$super(MspChannelValue mspChannelValue, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/network/pb/v3/MspChannelValue");
    }

    public final boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MspChannelValue)) {
            return false;
        }
        MspChannelValue mspChannelValue = (MspChannelValue) obj;
        if (!equals(this.assignedChannel, mspChannelValue.assignedChannel) || !equals(this.availableAmount, mspChannelValue.availableAmount) || !equals(this.cardInfo, mspChannelValue.cardInfo) || !equals(this.channelFullName, mspChannelValue.channelFullName) || !equals(this.channelIndex, mspChannelValue.channelIndex) || !equals(this.channelName, mspChannelValue.channelName) || !equals(this.channelType, mspChannelValue.channelType) || !equals(this.largeLimitSignable, mspChannelValue.largeLimitSignable) || !equals(this.extinfo, mspChannelValue.extinfo)) {
            return false;
        }
        return true;
    }

    public final MspChannelValue fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspChannelValue) ipChange.ipc$dispatch("af3de001", new Object[]{this, new Integer(i), obj});
        }
        switch (i) {
            case 1:
                this.assignedChannel = (String) obj;
                break;
            case 2:
                this.availableAmount = (String) obj;
                break;
            case 3:
                this.cardInfo = (MspCardInfo) obj;
                break;
            case 4:
                this.channelFullName = (String) obj;
                break;
            case 5:
                this.channelIndex = (String) obj;
                break;
            case 6:
                this.channelName = (String) obj;
                break;
            case 7:
                this.channelType = (String) obj;
                break;
            case 8:
                this.largeLimitSignable = (Integer) obj;
                break;
            case 9:
                this.extinfo = (String) obj;
                break;
        }
        return this;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        String str = this.assignedChannel;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i11 = i * 37;
        String str2 = this.availableAmount;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i12 = (i11 + i2) * 37;
        MspCardInfo mspCardInfo = this.cardInfo;
        if (mspCardInfo != null) {
            i3 = mspCardInfo.hashCode();
        } else {
            i3 = 0;
        }
        int i13 = (i12 + i3) * 37;
        String str3 = this.channelFullName;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i14 = (i13 + i4) * 37;
        String str4 = this.channelIndex;
        if (str4 != null) {
            i5 = str4.hashCode();
        } else {
            i5 = 0;
        }
        int i15 = (i14 + i5) * 37;
        String str5 = this.channelName;
        if (str5 != null) {
            i6 = str5.hashCode();
        } else {
            i6 = 0;
        }
        int i16 = (i15 + i6) * 37;
        String str6 = this.channelType;
        if (str6 != null) {
            i7 = str6.hashCode();
        } else {
            i7 = 0;
        }
        int i17 = (i16 + i7) * 37;
        Integer num = this.largeLimitSignable;
        if (num != null) {
            i8 = num.hashCode();
        } else {
            i8 = 0;
        }
        int i18 = (i17 + i8) * 37;
        String str7 = this.extinfo;
        if (str7 != null) {
            i9 = str7.hashCode();
        }
        int i19 = i18 + i9;
        this.hashCode = i19;
        return i19;
    }

    public MspChannelValue() {
    }
}
