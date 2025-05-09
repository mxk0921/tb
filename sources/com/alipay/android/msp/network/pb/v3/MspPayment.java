package com.alipay.android.msp.network.pb.v3;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.framework.wire.Message;
import com.alipay.android.msp.framework.wire.ProtoField;
import com.alipay.android.msp.utils.JsonUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import tb.amo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MspPayment extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_AVAILABLETITLE = "";
    public static final String DEFAULT_CHILDREN = "";
    public static final String DEFAULT_CLOSEMSG = "";
    public static final String DEFAULT_DETAIL = "";
    public static final String DEFAULT_DETAILACTION = "";
    public static final String DEFAULT_DISCOUNTTITLE = "";
    public static final String DEFAULT_DLG = "";
    public static final String DEFAULT_ENDCODE = "";
    public static final String DEFAULT_EXTINFO = "";
    public static final String DEFAULT_FANTITLE = "";
    public static final String DEFAULT_HUITITLE = "";
    public static final String DEFAULT_LOGO = "";
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_PAYMENTFLAG = 0;
    public static final String DEFAULT_TAIL = "";
    public static final String DEFAULT_VALUE = "";
    public static final int TAG_AVAILABLETITLE = 11;
    public static final int TAG_CHANNELVALUE = 16;
    public static final int TAG_CHILDREN = 9;
    public static final int TAG_CLOSEMSG = 10;
    public static final int TAG_DETAIL = 7;
    public static final int TAG_DETAILACTION = 5;
    public static final int TAG_DISCOUNTTITLE = 12;
    public static final int TAG_DLG = 8;
    public static final int TAG_ENDCODE = 15;
    public static final int TAG_EXTINFO = 17;
    public static final int TAG_FANTITLE = 13;
    public static final int TAG_HUITITLE = 14;
    public static final int TAG_LOGO = 2;
    public static final int TAG_NAME = 3;
    public static final int TAG_PAYMENTFLAG = 1;
    public static final int TAG_TAIL = 4;
    public static final int TAG_VALUE = 6;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public String availableTitle;
    @ProtoField(tag = 16)
    public MspChannelValue channelValue;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public String children;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public String closeMsg;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public String detail;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public String detailAction;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public String discountTitle;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public String dlg;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public String endCode;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public String extinfo;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public String fanTitle;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public String huiTitle;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public String logo;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public String name;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public Integer paymentFlag;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public String tail;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public String value;

    public MspPayment(MspPayment mspPayment) {
        super(mspPayment);
        if (mspPayment != null) {
            this.paymentFlag = mspPayment.paymentFlag;
            this.logo = mspPayment.logo;
            this.name = mspPayment.name;
            this.tail = mspPayment.tail;
            this.detailAction = mspPayment.detailAction;
            this.value = mspPayment.value;
            this.detail = mspPayment.detail;
            this.dlg = mspPayment.dlg;
            this.children = mspPayment.children;
            this.closeMsg = mspPayment.closeMsg;
            this.availableTitle = mspPayment.availableTitle;
            this.discountTitle = mspPayment.discountTitle;
            this.fanTitle = mspPayment.fanTitle;
            this.huiTitle = mspPayment.huiTitle;
            this.endCode = mspPayment.endCode;
            this.channelValue = mspPayment.channelValue;
            this.extinfo = mspPayment.extinfo;
        }
    }

    public static /* synthetic */ Object ipc$super(MspPayment mspPayment, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/network/pb/v3/MspPayment");
    }

    public final boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MspPayment)) {
            return false;
        }
        MspPayment mspPayment = (MspPayment) obj;
        if (!equals(this.paymentFlag, mspPayment.paymentFlag) || !equals(this.logo, mspPayment.logo) || !equals(this.name, mspPayment.name) || !equals(this.tail, mspPayment.tail) || !equals(this.detailAction, mspPayment.detailAction) || !equals(this.value, mspPayment.value) || !equals(this.detail, mspPayment.detail) || !equals(this.dlg, mspPayment.dlg) || !equals(this.children, mspPayment.children) || !equals(this.closeMsg, mspPayment.closeMsg) || !equals(this.availableTitle, mspPayment.availableTitle) || !equals(this.discountTitle, mspPayment.discountTitle) || !equals(this.fanTitle, mspPayment.fanTitle) || !equals(this.huiTitle, mspPayment.huiTitle) || !equals(this.endCode, mspPayment.endCode) || !equals(this.channelValue, mspPayment.channelValue) || !equals(this.extinfo, mspPayment.extinfo)) {
            return false;
        }
        return true;
    }

    public final MspPayment fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspPayment) ipChange.ipc$dispatch("f717d641", new Object[]{this, new Integer(i), obj});
        }
        switch (i) {
            case 1:
                this.paymentFlag = (Integer) obj;
                break;
            case 2:
                this.logo = (String) obj;
                break;
            case 3:
                this.name = (String) obj;
                break;
            case 4:
                this.tail = (String) obj;
                break;
            case 5:
                this.detailAction = (String) obj;
                break;
            case 6:
                this.value = (String) obj;
                break;
            case 7:
                this.detail = (String) obj;
                break;
            case 8:
                this.dlg = (String) obj;
                break;
            case 9:
                this.children = (String) obj;
                break;
            case 10:
                this.closeMsg = (String) obj;
                break;
            case 11:
                this.availableTitle = (String) obj;
                break;
            case 12:
                this.discountTitle = (String) obj;
                break;
            case 13:
                this.fanTitle = (String) obj;
                break;
            case 14:
                this.huiTitle = (String) obj;
                break;
            case 15:
                this.endCode = (String) obj;
                break;
            case 16:
                this.channelValue = (MspChannelValue) obj;
                break;
            case 17:
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
        int i17 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i18 = this.hashCode;
        if (i18 != 0) {
            return i18;
        }
        Integer num = this.paymentFlag;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int i19 = i * 37;
        String str = this.logo;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i20 = (i19 + i2) * 37;
        String str2 = this.name;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i21 = (i20 + i3) * 37;
        String str3 = this.tail;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i22 = (i21 + i4) * 37;
        String str4 = this.detailAction;
        if (str4 != null) {
            i5 = str4.hashCode();
        } else {
            i5 = 0;
        }
        int i23 = (i22 + i5) * 37;
        String str5 = this.value;
        if (str5 != null) {
            i6 = str5.hashCode();
        } else {
            i6 = 0;
        }
        int i24 = (i23 + i6) * 37;
        String str6 = this.detail;
        if (str6 != null) {
            i7 = str6.hashCode();
        } else {
            i7 = 0;
        }
        int i25 = (i24 + i7) * 37;
        String str7 = this.dlg;
        if (str7 != null) {
            i8 = str7.hashCode();
        } else {
            i8 = 0;
        }
        int i26 = (i25 + i8) * 37;
        String str8 = this.children;
        if (str8 != null) {
            i9 = str8.hashCode();
        } else {
            i9 = 0;
        }
        int i27 = (i26 + i9) * 37;
        String str9 = this.closeMsg;
        if (str9 != null) {
            i10 = str9.hashCode();
        } else {
            i10 = 0;
        }
        int i28 = (i27 + i10) * 37;
        String str10 = this.availableTitle;
        if (str10 != null) {
            i11 = str10.hashCode();
        } else {
            i11 = 0;
        }
        int i29 = (i28 + i11) * 37;
        String str11 = this.discountTitle;
        if (str11 != null) {
            i12 = str11.hashCode();
        } else {
            i12 = 0;
        }
        int i30 = (i29 + i12) * 37;
        String str12 = this.fanTitle;
        if (str12 != null) {
            i13 = str12.hashCode();
        } else {
            i13 = 0;
        }
        int i31 = (i30 + i13) * 37;
        String str13 = this.huiTitle;
        if (str13 != null) {
            i14 = str13.hashCode();
        } else {
            i14 = 0;
        }
        int i32 = (i31 + i14) * 37;
        String str14 = this.endCode;
        if (str14 != null) {
            i15 = str14.hashCode();
        } else {
            i15 = 0;
        }
        int i33 = (i32 + i15) * 37;
        MspChannelValue mspChannelValue = this.channelValue;
        if (mspChannelValue != null) {
            i16 = mspChannelValue.hashCode();
        } else {
            i16 = 0;
        }
        int i34 = (i33 + i16) * 37;
        String str15 = this.extinfo;
        if (str15 != null) {
            i17 = str15.hashCode();
        }
        int i35 = i34 + i17;
        this.hashCode = i35;
        return i35;
    }

    public final JSONObject formatPayChannel() throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8d895539", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        Integer num = this.paymentFlag;
        if (num != null) {
            if ((1 & num.intValue()) != 0) {
                jSONObject.put("hui", (Object) Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 2) != 0) {
                jSONObject.put("fan", (Object) Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 4) != 0) {
                jSONObject.put("busy", (Object) Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 8) != 0) {
                jSONObject.put("disable", (Object) Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 16) != 0) {
                jSONObject.put(Constants.Name.CHECKED, (Object) Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 32) != 0) {
                jSONObject.put("add", (Object) Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 64) != 0) {
                jSONObject.put("chargeFree", (Object) Boolean.TRUE);
            }
        }
        jSONObject.put(MspFlybirdDefine.FLYBIRD_DIALOG_LOGO, (Object) this.logo);
        jSONObject.put("name", (Object) this.name);
        jSONObject.put("tail", (Object) this.tail);
        jSONObject.put("detailAction", (Object) this.detailAction);
        jSONObject.put("value", (Object) this.value);
        jSONObject.put("detail", (Object) this.detail);
        jSONObject.put(MspFlybirdDefine.FLYBIRD_WIN_TYPE_DIALOG, (Object) JSON.parseObject(this.dlg));
        jSONObject.put("children", (Object) JSON.parseArray(this.children));
        JsonUtil.addExtInfo(this.extinfo, jSONObject);
        return jSONObject;
    }

    public final JSONObject formatPreChannel() throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97be045e", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        Integer num = this.paymentFlag;
        if (num != null) {
            if ((1 & num.intValue()) != 0) {
                jSONObject.put(amo.a.POINT_NAME, Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 2) != 0) {
                jSONObject.put("busy", Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 4) != 0) {
                jSONObject.put(Constants.Name.CHECKED, Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 8) != 0) {
                jSONObject.put("discount", Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 16) != 0) {
                jSONObject.put("fan", Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 32) != 0) {
                jSONObject.put("hui", Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 64) != 0) {
                jSONObject.put("new_card", Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 128) != 0) {
                jSONObject.put("togo", Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 256) != 0) {
                jSONObject.put("usable", Boolean.TRUE);
            }
        }
        jSONObject.put(MspFlybirdDefine.FLYBIRD_DIALOG_LOGO, this.logo);
        jSONObject.put("name", this.name);
        jSONObject.put("tail", this.tail);
        jSONObject.put("detailAction", this.detailAction);
        jSONObject.put("close_msg", this.closeMsg);
        jSONObject.put("available_title", this.availableTitle);
        jSONObject.put("discount_title", this.discountTitle);
        jSONObject.put("fan_title", this.fanTitle);
        jSONObject.put("hui_title", this.huiTitle);
        jSONObject.put("end_code", this.endCode);
        if (this.channelValue != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assignedChannel", (Object) this.channelValue.assignedChannel);
            jSONObject2.put("availableAmount", (Object) this.channelValue.availableAmount);
            jSONObject2.put("channelFullName", (Object) this.channelValue.channelFullName);
            jSONObject2.put("channelIndex", (Object) this.channelValue.channelIndex);
            jSONObject2.put("channelName", (Object) this.channelValue.channelName);
            jSONObject2.put("channelType", (Object) this.channelValue.channelType);
            if (this.channelValue.largeLimitSignable != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.channelValue.largeLimitSignable);
                jSONObject2.put("largeLimitSignable", (Object) sb.toString());
            }
            if (this.channelValue.cardInfo != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("bankName", (Object) this.channelValue.cardInfo.bankName);
                jSONObject3.put("cardNo", (Object) this.channelValue.cardInfo.cardNo);
                jSONObject3.put("instId", (Object) this.channelValue.cardInfo.instId);
                jSONObject3.put("principalId", (Object) this.channelValue.cardInfo.principalId);
                jSONObject3.put("signId", (Object) this.channelValue.cardInfo.signId);
                jSONObject3.put("userName", (Object) this.channelValue.cardInfo.userName);
                JsonUtil.addExtInfo(this.channelValue.cardInfo.extinfo, jSONObject3);
                jSONObject2.put("cardInfo", (Object) jSONObject3);
            }
            JsonUtil.addExtInfo(this.channelValue.extinfo, jSONObject2);
            jSONObject.put("value", (Object) jSONObject2);
        }
        JsonUtil.addExtInfo(this.extinfo, jSONObject);
        return jSONObject;
    }

    public MspPayment() {
    }
}
