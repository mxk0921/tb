package com.alipay.android.msp.network.pb.rpcv3;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MspChannelValueEx extends Message {
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
    public MspCardInfoEx cardInfo;
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

    public MspChannelValueEx(MspChannelValueEx mspChannelValueEx) {
        super(mspChannelValueEx);
        if (mspChannelValueEx != null) {
            this.assignedChannel = mspChannelValueEx.assignedChannel;
            this.availableAmount = mspChannelValueEx.availableAmount;
            this.cardInfo = mspChannelValueEx.cardInfo;
            this.channelFullName = mspChannelValueEx.channelFullName;
            this.channelIndex = mspChannelValueEx.channelIndex;
            this.channelName = mspChannelValueEx.channelName;
            this.channelType = mspChannelValueEx.channelType;
            this.largeLimitSignable = mspChannelValueEx.largeLimitSignable;
            this.extinfo = mspChannelValueEx.extinfo;
        }
    }

    public static /* synthetic */ Object ipc$super(MspChannelValueEx mspChannelValueEx, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/network/pb/rpcv3/MspChannelValueEx");
    }

    public final boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MspChannelValueEx)) {
            return false;
        }
        MspChannelValueEx mspChannelValueEx = (MspChannelValueEx) obj;
        if (!equals(this.assignedChannel, mspChannelValueEx.assignedChannel) || !equals(this.availableAmount, mspChannelValueEx.availableAmount) || !equals(this.cardInfo, mspChannelValueEx.cardInfo) || !equals(this.channelFullName, mspChannelValueEx.channelFullName) || !equals(this.channelIndex, mspChannelValueEx.channelIndex) || !equals(this.channelName, mspChannelValueEx.channelName) || !equals(this.channelType, mspChannelValueEx.channelType) || !equals(this.largeLimitSignable, mspChannelValueEx.largeLimitSignable) || !equals(this.extinfo, mspChannelValueEx.extinfo)) {
            return false;
        }
        return true;
    }

    public final MspChannelValueEx fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspChannelValueEx) ipChange.ipc$dispatch("8aaa6971", new Object[]{this, new Integer(i), obj});
        }
        switch (i) {
            case 1:
                this.assignedChannel = (String) obj;
                break;
            case 2:
                this.availableAmount = (String) obj;
                break;
            case 3:
                this.cardInfo = (MspCardInfoEx) obj;
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
        MspCardInfoEx mspCardInfoEx = this.cardInfo;
        if (mspCardInfoEx != null) {
            i3 = mspCardInfoEx.hashCode();
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

    public MspChannelValueEx() {
    }
}
