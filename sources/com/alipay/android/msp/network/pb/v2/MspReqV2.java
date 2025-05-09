package com.alipay.android.msp.network.pb.v2;

import com.alipay.android.msp.framework.wire.Message;
import com.alipay.android.msp.framework.wire.ProtoField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MspReqV2 extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_ACTION = "";
    public static final String DEFAULT_API_NM = "";
    public static final String DEFAULT_API_NSP = "";
    public static final String DEFAULT_APP_KEY = "";
    public static final String DEFAULT_DECAY = "";
    public static final String DEFAULT_EXTERNAL_INFO = "";
    public static final String DEFAULT_EXTINFO = "";
    public static final String DEFAULT_SECDATA = "";
    public static final String DEFAULT_SESSION = "";
    public static final String DEFAULT_SUBUA1 = "";
    public static final String DEFAULT_SUBUA2 = "";
    public static final String DEFAULT_SUBUA3 = "";
    public static final String DEFAULT_SYNCH = "";
    public static final String DEFAULT_TRID = "";
    public static final String DEFAULT_USER_ID = "";
    public static final int TAG_ACTION = 3;
    public static final int TAG_API_NM = 2;
    public static final int TAG_API_NSP = 1;
    public static final int TAG_APP_KEY = 14;
    public static final int TAG_DECAY = 5;
    public static final int TAG_EXTERNAL_INFO = 6;
    public static final int TAG_EXTINFO = 18;
    public static final int TAG_HASALIPAY = 13;
    public static final int TAG_LOCLOGINONCE = 12;
    public static final int TAG_SECDATA = 7;
    public static final int TAG_SESSION = 9;
    public static final int TAG_SUBUA1 = 15;
    public static final int TAG_SUBUA2 = 16;
    public static final int TAG_SUBUA3 = 17;
    public static final int TAG_SYNCH = 4;
    public static final int TAG_TRDFROM = 11;
    public static final int TAG_TRID = 10;
    public static final int TAG_USER_ID = 8;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public String action;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public String api_nm;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public String api_nsp;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public String app_key;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public String decay;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public String external_info;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public String extinfo;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public Integer hasAlipay;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public Integer locLoginOnce;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public String secData;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public String session;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public String subua1;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public String subua2;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public String subua3;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public String synch;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public Integer trdfrom;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public String trid;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public String user_id;
    public static final Integer DEFAULT_TRDFROM = 0;
    public static final Integer DEFAULT_LOCLOGINONCE = 0;
    public static final Integer DEFAULT_HASALIPAY = 0;

    public MspReqV2(MspReqV2 mspReqV2) {
        super(mspReqV2);
        if (mspReqV2 != null) {
            this.api_nsp = mspReqV2.api_nsp;
            this.api_nm = mspReqV2.api_nm;
            this.action = mspReqV2.action;
            this.synch = mspReqV2.synch;
            this.decay = mspReqV2.decay;
            this.external_info = mspReqV2.external_info;
            this.secData = mspReqV2.secData;
            this.user_id = mspReqV2.user_id;
            this.session = mspReqV2.session;
            this.trid = mspReqV2.trid;
            this.trdfrom = mspReqV2.trdfrom;
            this.locLoginOnce = mspReqV2.locLoginOnce;
            this.hasAlipay = mspReqV2.hasAlipay;
            this.app_key = mspReqV2.app_key;
            this.subua1 = mspReqV2.subua1;
            this.subua2 = mspReqV2.subua2;
            this.subua3 = mspReqV2.subua3;
            this.extinfo = mspReqV2.extinfo;
        }
    }

    public static /* synthetic */ Object ipc$super(MspReqV2 mspReqV2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/network/pb/v2/MspReqV2");
    }

    public final boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MspReqV2)) {
            return false;
        }
        MspReqV2 mspReqV2 = (MspReqV2) obj;
        if (!equals(this.api_nsp, mspReqV2.api_nsp) || !equals(this.api_nm, mspReqV2.api_nm) || !equals(this.action, mspReqV2.action) || !equals(this.synch, mspReqV2.synch) || !equals(this.decay, mspReqV2.decay) || !equals(this.external_info, mspReqV2.external_info) || !equals(this.secData, mspReqV2.secData) || !equals(this.user_id, mspReqV2.user_id) || !equals(this.session, mspReqV2.session) || !equals(this.trid, mspReqV2.trid) || !equals(this.trdfrom, mspReqV2.trdfrom) || !equals(this.locLoginOnce, mspReqV2.locLoginOnce) || !equals(this.hasAlipay, mspReqV2.hasAlipay) || !equals(this.app_key, mspReqV2.app_key) || !equals(this.subua1, mspReqV2.subua1) || !equals(this.subua2, mspReqV2.subua2) || !equals(this.subua3, mspReqV2.subua3) || !equals(this.extinfo, mspReqV2.extinfo)) {
            return false;
        }
        return true;
    }

    public final MspReqV2 fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspReqV2) ipChange.ipc$dispatch("8f36db4c", new Object[]{this, new Integer(i), obj});
        }
        switch (i) {
            case 1:
                this.api_nsp = (String) obj;
                break;
            case 2:
                this.api_nm = (String) obj;
                break;
            case 3:
                this.action = (String) obj;
                break;
            case 4:
                this.synch = (String) obj;
                break;
            case 5:
                this.decay = (String) obj;
                break;
            case 6:
                this.external_info = (String) obj;
                break;
            case 7:
                this.secData = (String) obj;
                break;
            case 8:
                this.user_id = (String) obj;
                break;
            case 9:
                this.session = (String) obj;
                break;
            case 10:
                this.trid = (String) obj;
                break;
            case 11:
                this.trdfrom = (Integer) obj;
                break;
            case 12:
                this.locLoginOnce = (Integer) obj;
                break;
            case 13:
                this.hasAlipay = (Integer) obj;
                break;
            case 14:
                this.app_key = (String) obj;
                break;
            case 15:
                this.subua1 = (String) obj;
                break;
            case 16:
                this.subua2 = (String) obj;
                break;
            case 17:
                this.subua3 = (String) obj;
                break;
            case 18:
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
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i19 = this.hashCode;
        if (i19 != 0) {
            return i19;
        }
        String str = this.api_nsp;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i20 = i * 37;
        String str2 = this.api_nm;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i21 = (i20 + i2) * 37;
        String str3 = this.action;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i22 = (i21 + i3) * 37;
        String str4 = this.synch;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i23 = (i22 + i4) * 37;
        String str5 = this.decay;
        if (str5 != null) {
            i5 = str5.hashCode();
        } else {
            i5 = 0;
        }
        int i24 = (i23 + i5) * 37;
        String str6 = this.external_info;
        if (str6 != null) {
            i6 = str6.hashCode();
        } else {
            i6 = 0;
        }
        int i25 = (i24 + i6) * 37;
        String str7 = this.secData;
        if (str7 != null) {
            i7 = str7.hashCode();
        } else {
            i7 = 0;
        }
        int i26 = (i25 + i7) * 37;
        String str8 = this.user_id;
        if (str8 != null) {
            i8 = str8.hashCode();
        } else {
            i8 = 0;
        }
        int i27 = (i26 + i8) * 37;
        String str9 = this.session;
        if (str9 != null) {
            i9 = str9.hashCode();
        } else {
            i9 = 0;
        }
        int i28 = (i27 + i9) * 37;
        String str10 = this.trid;
        if (str10 != null) {
            i10 = str10.hashCode();
        } else {
            i10 = 0;
        }
        int i29 = (i28 + i10) * 37;
        Integer num = this.trdfrom;
        if (num != null) {
            i11 = num.hashCode();
        } else {
            i11 = 0;
        }
        int i30 = (i29 + i11) * 37;
        Integer num2 = this.locLoginOnce;
        if (num2 != null) {
            i12 = num2.hashCode();
        } else {
            i12 = 0;
        }
        int i31 = (i30 + i12) * 37;
        Integer num3 = this.hasAlipay;
        if (num3 != null) {
            i13 = num3.hashCode();
        } else {
            i13 = 0;
        }
        int i32 = (i31 + i13) * 37;
        String str11 = this.app_key;
        if (str11 != null) {
            i14 = str11.hashCode();
        } else {
            i14 = 0;
        }
        int i33 = (i32 + i14) * 37;
        String str12 = this.subua1;
        if (str12 != null) {
            i15 = str12.hashCode();
        } else {
            i15 = 0;
        }
        int i34 = (i33 + i15) * 37;
        String str13 = this.subua2;
        if (str13 != null) {
            i16 = str13.hashCode();
        } else {
            i16 = 0;
        }
        int i35 = (i34 + i16) * 37;
        String str14 = this.subua3;
        if (str14 != null) {
            i17 = str14.hashCode();
        } else {
            i17 = 0;
        }
        int i36 = (i35 + i17) * 37;
        String str15 = this.extinfo;
        if (str15 != null) {
            i18 = str15.hashCode();
        }
        int i37 = i36 + i18;
        this.hashCode = i37;
        return i37;
    }

    public MspReqV2() {
    }
}
