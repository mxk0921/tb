package com.alipay.android.msp.network.pb.rpcv3;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MspCardInfoEx extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_BANKNAME = "";
    public static final String DEFAULT_CARDNO = "";
    public static final String DEFAULT_EXTINFO = "";
    public static final String DEFAULT_INSTID = "";
    public static final String DEFAULT_PRINCIPALID = "";
    public static final String DEFAULT_SIGNID = "";
    public static final String DEFAULT_USERNAME = "";
    public static final int TAG_BANKNAME = 1;
    public static final int TAG_CARDNO = 2;
    public static final int TAG_EXTINFO = 7;
    public static final int TAG_INSTID = 3;
    public static final int TAG_PRINCIPALID = 4;
    public static final int TAG_SIGNID = 5;
    public static final int TAG_USERNAME = 6;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public String bankName;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public String cardNo;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public String extinfo;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public String instId;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public String principalId;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public String signId;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public String userName;

    public MspCardInfoEx(MspCardInfoEx mspCardInfoEx) {
        super(mspCardInfoEx);
        if (mspCardInfoEx != null) {
            this.bankName = mspCardInfoEx.bankName;
            this.cardNo = mspCardInfoEx.cardNo;
            this.instId = mspCardInfoEx.instId;
            this.principalId = mspCardInfoEx.principalId;
            this.signId = mspCardInfoEx.signId;
            this.userName = mspCardInfoEx.userName;
            this.extinfo = mspCardInfoEx.extinfo;
        }
    }

    public static /* synthetic */ Object ipc$super(MspCardInfoEx mspCardInfoEx, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/network/pb/rpcv3/MspCardInfoEx");
    }

    public final boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MspCardInfoEx)) {
            return false;
        }
        MspCardInfoEx mspCardInfoEx = (MspCardInfoEx) obj;
        if (!equals(this.bankName, mspCardInfoEx.bankName) || !equals(this.cardNo, mspCardInfoEx.cardNo) || !equals(this.instId, mspCardInfoEx.instId) || !equals(this.principalId, mspCardInfoEx.principalId) || !equals(this.signId, mspCardInfoEx.signId) || !equals(this.userName, mspCardInfoEx.userName) || !equals(this.extinfo, mspCardInfoEx.extinfo)) {
            return false;
        }
        return true;
    }

    public final MspCardInfoEx fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspCardInfoEx) ipChange.ipc$dispatch("95eb141", new Object[]{this, new Integer(i), obj});
        }
        switch (i) {
            case 1:
                this.bankName = (String) obj;
                break;
            case 2:
                this.cardNo = (String) obj;
                break;
            case 3:
                this.instId = (String) obj;
                break;
            case 4:
                this.principalId = (String) obj;
                break;
            case 5:
                this.signId = (String) obj;
                break;
            case 6:
                this.userName = (String) obj;
                break;
            case 7:
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
        int i7 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i8 = this.hashCode;
        if (i8 != 0) {
            return i8;
        }
        String str = this.bankName;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i9 = i * 37;
        String str2 = this.cardNo;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (i9 + i2) * 37;
        String str3 = this.instId;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 37;
        String str4 = this.principalId;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 37;
        String str5 = this.signId;
        if (str5 != null) {
            i5 = str5.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 37;
        String str6 = this.userName;
        if (str6 != null) {
            i6 = str6.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 37;
        String str7 = this.extinfo;
        if (str7 != null) {
            i7 = str7.hashCode();
        }
        int i15 = i14 + i7;
        this.hashCode = i15;
        return i15;
    }

    public MspCardInfoEx() {
    }
}
