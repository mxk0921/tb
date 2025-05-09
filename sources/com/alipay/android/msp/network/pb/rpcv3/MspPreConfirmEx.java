package com.alipay.android.msp.network.pb.rpcv3;

import com.ali.user.mobile.login.model.LoginConstant;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.ui.webview.jsbridge.exec.SetTitleApi;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import com.taobao.android.turbo.model.UserModel;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MspPreConfirmEx extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_ACCOUNT = "";
    public static final String DEFAULT_AUTHACTION = "";
    public static final String DEFAULT_BTNACTION = "";
    public static final String DEFAULT_BTNNAME = "";
    public static final String DEFAULT_CHARGEMSG = "";
    public static final String DEFAULT_COST = "";
    public static final String DEFAULT_COSTTITLE = "";
    public static final String DEFAULT_DETAIL = "";
    public static final String DEFAULT_EXTINFO = "";
    public static final String DEFAULT_FPPROTOCOLTYPE = "";
    public static final String DEFAULT_GONGGAO = "";
    public static final String DEFAULT_NAVTITLE = "";
    public static final String DEFAULT_ORDER = "";
    public static final Integer DEFAULT_PAGEFLAG = 0;
    public static final String DEFAULT_PAGESWITCH = "";
    public static final String DEFAULT_PAYACT = "";
    public static final String DEFAULT_PAYTOOL = "";
    public static final String DEFAULT_PRODUCT = "";
    public static final String DEFAULT_PRODUCTDETAIL = "";
    public static final String DEFAULT_PROPAGATE = "";
    public static final String DEFAULT_PROTOCOLNAME = "";
    public static final String DEFAULT_PROTOCOLTITLE = "";
    public static final String DEFAULT_PROTOCOLURL = "";
    public static final String DEFAULT_PWDTIP = "";
    public static final int TAG_ACCOUNT = 7;
    public static final int TAG_AUTHACTION = 20;
    public static final int TAG_BTNACTION = 16;
    public static final int TAG_BTNNAME = 15;
    public static final int TAG_CHARGEMSG = 18;
    public static final int TAG_COST = 10;
    public static final int TAG_COSTTITLE = 9;
    public static final int TAG_DETAIL = 11;
    public static final int TAG_EXTINFO = 25;
    public static final int TAG_FPPROTOCOLTYPE = 19;
    public static final int TAG_GONGGAO = 2;
    public static final int TAG_NAVTITLE = 3;
    public static final int TAG_ORDER = 4;
    public static final int TAG_PAGEFLAG = 1;
    public static final int TAG_PAGESWITCH = 21;
    public static final int TAG_PAYACT = 22;
    public static final int TAG_PAYTOOL = 8;
    public static final int TAG_PRODUCT = 5;
    public static final int TAG_PRODUCTDETAIL = 6;
    public static final int TAG_PROPAGATE = 17;
    public static final int TAG_PROTOCOLNAME = 12;
    public static final int TAG_PROTOCOLTITLE = 14;
    public static final int TAG_PROTOCOLURL = 13;
    public static final int TAG_PWDTIP = 23;
    public static final int TAG_TPL = 24;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public String account;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public String authAction;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public String btnAction;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public String btnName;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public String chargeMsg;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public String cost;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public String costTitle;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public String detail;
    @ProtoField(tag = 25, type = Message.Datatype.STRING)
    public String extinfo;
    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public String fpProtocolType;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public String gonggao;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public String navTitle;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public String order;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public Integer pageFlag;
    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public String pageSwitch;
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public String payAct;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public String payTool;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public String product;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public String productDetail;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public String propagate;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public String protocolName;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public String protocolTitle;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public String protocolUrl;
    @ProtoField(tag = 23, type = Message.Datatype.STRING)
    public String pwdTip;
    @ProtoField(tag = 24)
    public MspTplEx tpl;

    public MspPreConfirmEx(MspPreConfirmEx mspPreConfirmEx) {
        super(mspPreConfirmEx);
        if (mspPreConfirmEx != null) {
            this.pageFlag = mspPreConfirmEx.pageFlag;
            this.gonggao = mspPreConfirmEx.gonggao;
            this.navTitle = mspPreConfirmEx.navTitle;
            this.order = mspPreConfirmEx.order;
            this.product = mspPreConfirmEx.product;
            this.productDetail = mspPreConfirmEx.productDetail;
            this.account = mspPreConfirmEx.account;
            this.payTool = mspPreConfirmEx.payTool;
            this.costTitle = mspPreConfirmEx.costTitle;
            this.cost = mspPreConfirmEx.cost;
            this.detail = mspPreConfirmEx.detail;
            this.protocolName = mspPreConfirmEx.protocolName;
            this.protocolUrl = mspPreConfirmEx.protocolUrl;
            this.protocolTitle = mspPreConfirmEx.protocolTitle;
            this.btnName = mspPreConfirmEx.btnName;
            this.btnAction = mspPreConfirmEx.btnAction;
            this.propagate = mspPreConfirmEx.propagate;
            this.chargeMsg = mspPreConfirmEx.chargeMsg;
            this.fpProtocolType = mspPreConfirmEx.fpProtocolType;
            this.authAction = mspPreConfirmEx.authAction;
            this.pageSwitch = mspPreConfirmEx.pageSwitch;
            this.payAct = mspPreConfirmEx.payAct;
            this.pwdTip = mspPreConfirmEx.pwdTip;
            this.tpl = mspPreConfirmEx.tpl;
            this.extinfo = mspPreConfirmEx.extinfo;
        }
    }

    public static /* synthetic */ Object ipc$super(MspPreConfirmEx mspPreConfirmEx, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/network/pb/rpcv3/MspPreConfirmEx");
    }

    public final boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MspPreConfirmEx)) {
            return false;
        }
        MspPreConfirmEx mspPreConfirmEx = (MspPreConfirmEx) obj;
        if (!equals(this.pageFlag, mspPreConfirmEx.pageFlag) || !equals(this.gonggao, mspPreConfirmEx.gonggao) || !equals(this.navTitle, mspPreConfirmEx.navTitle) || !equals(this.order, mspPreConfirmEx.order) || !equals(this.product, mspPreConfirmEx.product) || !equals(this.productDetail, mspPreConfirmEx.productDetail) || !equals(this.account, mspPreConfirmEx.account) || !equals(this.payTool, mspPreConfirmEx.payTool) || !equals(this.costTitle, mspPreConfirmEx.costTitle) || !equals(this.cost, mspPreConfirmEx.cost) || !equals(this.detail, mspPreConfirmEx.detail) || !equals(this.protocolName, mspPreConfirmEx.protocolName) || !equals(this.protocolUrl, mspPreConfirmEx.protocolUrl) || !equals(this.protocolTitle, mspPreConfirmEx.protocolTitle) || !equals(this.btnName, mspPreConfirmEx.btnName) || !equals(this.btnAction, mspPreConfirmEx.btnAction) || !equals(this.propagate, mspPreConfirmEx.propagate) || !equals(this.chargeMsg, mspPreConfirmEx.chargeMsg) || !equals(this.fpProtocolType, mspPreConfirmEx.fpProtocolType) || !equals(this.authAction, mspPreConfirmEx.authAction) || !equals(this.pageSwitch, mspPreConfirmEx.pageSwitch) || !equals(this.payAct, mspPreConfirmEx.payAct) || !equals(this.pwdTip, mspPreConfirmEx.pwdTip) || !equals(this.tpl, mspPreConfirmEx.tpl) || !equals(this.extinfo, mspPreConfirmEx.extinfo)) {
            return false;
        }
        return true;
    }

    public final MspPreConfirmEx fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspPreConfirmEx) ipChange.ipc$dispatch("b936c862", new Object[]{this, new Integer(i), obj});
        }
        switch (i) {
            case 1:
                this.pageFlag = (Integer) obj;
                break;
            case 2:
                this.gonggao = (String) obj;
                break;
            case 3:
                this.navTitle = (String) obj;
                break;
            case 4:
                this.order = (String) obj;
                break;
            case 5:
                this.product = (String) obj;
                break;
            case 6:
                this.productDetail = (String) obj;
                break;
            case 7:
                this.account = (String) obj;
                break;
            case 8:
                this.payTool = (String) obj;
                break;
            case 9:
                this.costTitle = (String) obj;
                break;
            case 10:
                this.cost = (String) obj;
                break;
            case 11:
                this.detail = (String) obj;
                break;
            case 12:
                this.protocolName = (String) obj;
                break;
            case 13:
                this.protocolUrl = (String) obj;
                break;
            case 14:
                this.protocolTitle = (String) obj;
                break;
            case 15:
                this.btnName = (String) obj;
                break;
            case 16:
                this.btnAction = (String) obj;
                break;
            case 17:
                this.propagate = (String) obj;
                break;
            case 18:
                this.chargeMsg = (String) obj;
                break;
            case 19:
                this.fpProtocolType = (String) obj;
                break;
            case 20:
                this.authAction = (String) obj;
                break;
            case 21:
                this.pageSwitch = (String) obj;
                break;
            case 22:
                this.payAct = (String) obj;
                break;
            case 23:
                this.pwdTip = (String) obj;
                break;
            case 24:
                this.tpl = (MspTplEx) obj;
                break;
            case 25:
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
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i26 = this.hashCode;
        if (i26 != 0) {
            return i26;
        }
        Integer num = this.pageFlag;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int i27 = i * 37;
        String str = this.gonggao;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i28 = (i27 + i2) * 37;
        String str2 = this.navTitle;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i29 = (i28 + i3) * 37;
        String str3 = this.order;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i30 = (i29 + i4) * 37;
        String str4 = this.product;
        if (str4 != null) {
            i5 = str4.hashCode();
        } else {
            i5 = 0;
        }
        int i31 = (i30 + i5) * 37;
        String str5 = this.productDetail;
        if (str5 != null) {
            i6 = str5.hashCode();
        } else {
            i6 = 0;
        }
        int i32 = (i31 + i6) * 37;
        String str6 = this.account;
        if (str6 != null) {
            i7 = str6.hashCode();
        } else {
            i7 = 0;
        }
        int i33 = (i32 + i7) * 37;
        String str7 = this.payTool;
        if (str7 != null) {
            i8 = str7.hashCode();
        } else {
            i8 = 0;
        }
        int i34 = (i33 + i8) * 37;
        String str8 = this.costTitle;
        if (str8 != null) {
            i9 = str8.hashCode();
        } else {
            i9 = 0;
        }
        int i35 = (i34 + i9) * 37;
        String str9 = this.cost;
        if (str9 != null) {
            i10 = str9.hashCode();
        } else {
            i10 = 0;
        }
        int i36 = (i35 + i10) * 37;
        String str10 = this.detail;
        if (str10 != null) {
            i11 = str10.hashCode();
        } else {
            i11 = 0;
        }
        int i37 = (i36 + i11) * 37;
        String str11 = this.protocolName;
        if (str11 != null) {
            i12 = str11.hashCode();
        } else {
            i12 = 0;
        }
        int i38 = (i37 + i12) * 37;
        String str12 = this.protocolUrl;
        if (str12 != null) {
            i13 = str12.hashCode();
        } else {
            i13 = 0;
        }
        int i39 = (i38 + i13) * 37;
        String str13 = this.protocolTitle;
        if (str13 != null) {
            i14 = str13.hashCode();
        } else {
            i14 = 0;
        }
        int i40 = (i39 + i14) * 37;
        String str14 = this.btnName;
        if (str14 != null) {
            i15 = str14.hashCode();
        } else {
            i15 = 0;
        }
        int i41 = (i40 + i15) * 37;
        String str15 = this.btnAction;
        if (str15 != null) {
            i16 = str15.hashCode();
        } else {
            i16 = 0;
        }
        int i42 = (i41 + i16) * 37;
        String str16 = this.propagate;
        if (str16 != null) {
            i17 = str16.hashCode();
        } else {
            i17 = 0;
        }
        int i43 = (i42 + i17) * 37;
        String str17 = this.chargeMsg;
        if (str17 != null) {
            i18 = str17.hashCode();
        } else {
            i18 = 0;
        }
        int i44 = (i43 + i18) * 37;
        String str18 = this.fpProtocolType;
        if (str18 != null) {
            i19 = str18.hashCode();
        } else {
            i19 = 0;
        }
        int i45 = (i44 + i19) * 37;
        String str19 = this.authAction;
        if (str19 != null) {
            i20 = str19.hashCode();
        } else {
            i20 = 0;
        }
        int i46 = (i45 + i20) * 37;
        String str20 = this.pageSwitch;
        if (str20 != null) {
            i21 = str20.hashCode();
        } else {
            i21 = 0;
        }
        int i47 = (i46 + i21) * 37;
        String str21 = this.payAct;
        if (str21 != null) {
            i22 = str21.hashCode();
        } else {
            i22 = 0;
        }
        int i48 = (i47 + i22) * 37;
        String str22 = this.pwdTip;
        if (str22 != null) {
            i23 = str22.hashCode();
        } else {
            i23 = 0;
        }
        int i49 = (i48 + i23) * 37;
        MspTplEx mspTplEx = this.tpl;
        if (mspTplEx != null) {
            i24 = mspTplEx.hashCode();
        } else {
            i24 = 0;
        }
        int i50 = (i49 + i24) * 37;
        String str23 = this.extinfo;
        if (str23 != null) {
            i25 = str23.hashCode();
        }
        int i51 = i50 + i25;
        this.hashCode = i51;
        return i51;
    }

    public final String format() throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9662a762", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        Integer num = this.pageFlag;
        if (num != null) {
            if ((1 & num.intValue()) != 0) {
                jSONObject.put("showLogo", (Object) Boolean.TRUE);
            }
            if ((this.pageFlag.intValue() & 2) != 0) {
                jSONObject.put("switchAcc", (Object) Boolean.TRUE);
            }
            if ((this.pageFlag.intValue() & 4) != 0) {
                jSONObject.put(UserModel.AvatarIcon.LIGHT_TYPE_RED_POINT, (Object) Boolean.TRUE);
            }
            if ((this.pageFlag.intValue() & 8) != 0) {
                jSONObject.put("channels", (Object) Boolean.TRUE);
            }
            if ((this.pageFlag.intValue() & 16) != 0) {
                jSONObject.put("selDis", (Object) Boolean.TRUE);
            }
            if ((this.pageFlag.intValue() & 32) != 0) {
                jSONObject.put("npwdPay", (Object) Boolean.TRUE);
            }
            if ((this.pageFlag.intValue() & 64) != 0) {
                jSONObject.put(MspFlybirdDefine.FLYBIRD_FINGERPAY, (Object) Boolean.TRUE);
            }
            if ((this.pageFlag.intValue() & 128) != 0) {
                jSONObject.put("wearablePay", (Object) Boolean.TRUE);
            }
            if ((this.pageFlag.intValue() & 256) != 0) {
                jSONObject.put("braceletPay", (Object) Boolean.TRUE);
            }
            if ((this.pageFlag.intValue() & 512) != 0) {
                jSONObject.put(MspFlybirdDefine.FLYBIRD_SETTING_SPASSWORDPAY, (Object) Boolean.TRUE);
            }
            if ((this.pageFlag.intValue() & 1024) != 0) {
                jSONObject.put("show_aggr", (Object) "Y");
            }
            if ((this.pageFlag.intValue() & 2048) != 0) {
                jSONObject.put("is_fqg", (Object) "Y");
            }
        }
        jSONObject.put("gonggao", (Object) this.gonggao);
        jSONObject.put(SetTitleApi.NAME_NAV_TITLE, (Object) this.navTitle);
        jSONObject.put("order", (Object) this.order);
        jSONObject.put(DraftMediaHelper.DraftType.PRODUCT, (Object) this.product);
        jSONObject.put("productDetail", (Object) this.productDetail);
        jSONObject.put(LoginConstant.ACCOUNT, (Object) this.account);
        jSONObject.put("payTool", (Object) this.payTool);
        jSONObject.put("costTitle", (Object) this.costTitle);
        jSONObject.put("cost", (Object) this.cost);
        jSONObject.put("detail", (Object) JSON.parseArray(this.detail));
        jSONObject.put("protocolName", (Object) this.protocolName);
        jSONObject.put("protocolUrl", (Object) this.protocolUrl);
        jSONObject.put("protocolTitle", (Object) this.protocolTitle);
        jSONObject.put("btnName", (Object) this.btnName);
        jSONObject.put("btnAction", (Object) this.btnAction);
        jSONObject.put("propagate", (Object) JSON.parseObject(this.propagate));
        jSONObject.put("chargeMsg", (Object) this.chargeMsg);
        jSONObject.put("fpProtocolType", (Object) this.fpProtocolType);
        jSONObject.put(MspFlybirdDefine.FLYBIRD_SETTING_AUTHACTION, (Object) this.authAction);
        jSONObject.put(IMainFeedsLoopStartStopService.a.PAGE_SWITCH, (Object) JSON.parseObject(this.pageSwitch));
        jSONObject.put("payAct", (Object) this.payAct);
        jSONObject.put(BaseFBPlugin.ACT_CONF.pwdTip, (Object) this.pwdTip);
        MspTplEx mspTplEx = this.tpl;
        if (mspTplEx != null) {
            jSONObject.put("tpl", (Object) mspTplEx.format(null));
        }
        JsonUtil.addExtInfo(this.extinfo, jSONObject);
        return jSONObject.toString();
    }

    public MspPreConfirmEx() {
    }
}
