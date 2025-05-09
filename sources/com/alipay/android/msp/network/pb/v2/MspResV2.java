package com.alipay.android.msp.network.pb.v2;

import com.alipay.android.msp.framework.wire.Message;
import com.alipay.android.msp.framework.wire.ProtoField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MspResV2 extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_CLIENT_KEY = "";
    public static final String DEFAULT_CODE = "";
    public static final String DEFAULT_DATA = "";
    public static final String DEFAULT_END_CODE = "";
    public static final String DEFAULT_ERR_MSG = "";
    public static final String DEFAULT_EXTINFO = "";
    public static final String DEFAULT_MEMO = "";
    public static final String DEFAULT_ONLOAD = "";
    public static final String DEFAULT_PAGE = "";
    public static final String DEFAULT_PKEY = "";
    public static final String DEFAULT_RESULT = "";
    public static final String DEFAULT_SESSION = "";
    public static final String DEFAULT_SYNCH = "";
    public static final String DEFAULT_TID = "";
    public static final String DEFAULT_TPL = "";
    public static final String DEFAULT_TPLID = "";
    public static final String DEFAULT_TRADE_NO = "";
    public static final String DEFAULT_UNAME = "";
    public static final String DEFAULT_USER_ID = "";
    public static final String DEFAULT_UURL = "";
    public static final String DEFAULT_WND = "";
    public static final int TAG_AJAX = 23;
    public static final int TAG_CLIENT_KEY = 22;
    public static final int TAG_CODE = 1;
    public static final int TAG_DATA = 14;
    public static final int TAG_DG = 17;
    public static final int TAG_END_CODE = 5;
    public static final int TAG_ERR_MSG = 2;
    public static final int TAG_EXTINFO = 28;
    public static final int TAG_IAJAX = 24;
    public static final int TAG_MEMO = 3;
    public static final int TAG_NOBACK = 9;
    public static final int TAG_ONLOAD = 25;
    public static final int TAG_PAGE = 19;
    public static final int TAG_PKEY = 27;
    public static final int TAG_RESULT = 4;
    public static final int TAG_SESSION = 20;
    public static final int TAG_SYNCH = 6;
    public static final int TAG_TID = 21;
    public static final int TAG_TIME = 15;
    public static final int TAG_TPL = 13;
    public static final int TAG_TPLID = 12;
    public static final int TAG_TRADE_NO = 7;
    public static final int TAG_UAC = 16;
    public static final int TAG_UNAME = 10;
    public static final int TAG_USER_ID = 26;
    public static final int TAG_UURL = 11;
    public static final int TAG_WND = 18;
    public static final int TAG_WPAGE = 8;
    @ProtoField(tag = 23, type = Message.Datatype.INT32)
    public Integer ajax;
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public String client_key;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public String code;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public String data;
    @ProtoField(tag = 17, type = Message.Datatype.INT32)
    public Integer dg;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public String end_code;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public String err_msg;
    @ProtoField(tag = 28, type = Message.Datatype.STRING)
    public String extinfo;
    @ProtoField(tag = 24, type = Message.Datatype.INT32)
    public Integer iajax;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public String memo;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public Integer noBack;
    @ProtoField(tag = 25, type = Message.Datatype.STRING)
    public String onload;
    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public String page;
    @ProtoField(tag = 27, type = Message.Datatype.STRING)
    public String pkey;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public String result;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public String session;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public String synch;
    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public String tid;
    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public Integer time;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public String tpl;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public String tplid;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public String trade_no;
    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public Integer uac;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public String uname;
    @ProtoField(tag = 26, type = Message.Datatype.STRING)
    public String user_id;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public String uurl;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public String wnd;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public Integer wpage;
    public static final Integer DEFAULT_WPAGE = 0;
    public static final Integer DEFAULT_NOBACK = 0;
    public static final Integer DEFAULT_TIME = 0;
    public static final Integer DEFAULT_UAC = 0;
    public static final Integer DEFAULT_DG = 0;
    public static final Integer DEFAULT_AJAX = 0;
    public static final Integer DEFAULT_IAJAX = 0;

    public MspResV2(MspResV2 mspResV2) {
        super(mspResV2);
        if (mspResV2 != null) {
            this.code = mspResV2.code;
            this.err_msg = mspResV2.err_msg;
            this.memo = mspResV2.memo;
            this.result = mspResV2.result;
            this.end_code = mspResV2.end_code;
            this.synch = mspResV2.synch;
            this.trade_no = mspResV2.trade_no;
            this.wpage = mspResV2.wpage;
            this.noBack = mspResV2.noBack;
            this.uname = mspResV2.uname;
            this.uurl = mspResV2.uurl;
            this.tplid = mspResV2.tplid;
            this.tpl = mspResV2.tpl;
            this.data = mspResV2.data;
            this.time = mspResV2.time;
            this.uac = mspResV2.uac;
            this.dg = mspResV2.dg;
            this.wnd = mspResV2.wnd;
            this.page = mspResV2.page;
            this.session = mspResV2.session;
            this.tid = mspResV2.tid;
            this.client_key = mspResV2.client_key;
            this.ajax = mspResV2.ajax;
            this.iajax = mspResV2.iajax;
            this.onload = mspResV2.onload;
            this.user_id = mspResV2.user_id;
            this.pkey = mspResV2.pkey;
            this.extinfo = mspResV2.extinfo;
        }
    }

    public static /* synthetic */ Object ipc$super(MspResV2 mspResV2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/network/pb/v2/MspResV2");
    }

    public final boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MspResV2)) {
            return false;
        }
        MspResV2 mspResV2 = (MspResV2) obj;
        if (!equals(this.code, mspResV2.code) || !equals(this.err_msg, mspResV2.err_msg) || !equals(this.memo, mspResV2.memo) || !equals(this.result, mspResV2.result) || !equals(this.end_code, mspResV2.end_code) || !equals(this.synch, mspResV2.synch) || !equals(this.trade_no, mspResV2.trade_no) || !equals(this.wpage, mspResV2.wpage) || !equals(this.noBack, mspResV2.noBack) || !equals(this.uname, mspResV2.uname) || !equals(this.uurl, mspResV2.uurl) || !equals(this.tplid, mspResV2.tplid) || !equals(this.tpl, mspResV2.tpl) || !equals(this.data, mspResV2.data) || !equals(this.time, mspResV2.time) || !equals(this.uac, mspResV2.uac) || !equals(this.dg, mspResV2.dg) || !equals(this.wnd, mspResV2.wnd) || !equals(this.page, mspResV2.page) || !equals(this.session, mspResV2.session) || !equals(this.tid, mspResV2.tid) || !equals(this.client_key, mspResV2.client_key) || !equals(this.ajax, mspResV2.ajax) || !equals(this.iajax, mspResV2.iajax) || !equals(this.onload, mspResV2.onload) || !equals(this.user_id, mspResV2.user_id) || !equals(this.pkey, mspResV2.pkey) || !equals(this.extinfo, mspResV2.extinfo)) {
            return false;
        }
        return true;
    }

    public final MspResV2 fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspResV2) ipChange.ipc$dispatch("8f37c40a", new Object[]{this, new Integer(i), obj});
        }
        switch (i) {
            case 1:
                this.code = (String) obj;
                break;
            case 2:
                this.err_msg = (String) obj;
                break;
            case 3:
                this.memo = (String) obj;
                break;
            case 4:
                this.result = (String) obj;
                break;
            case 5:
                this.end_code = (String) obj;
                break;
            case 6:
                this.synch = (String) obj;
                break;
            case 7:
                this.trade_no = (String) obj;
                break;
            case 8:
                this.wpage = (Integer) obj;
                break;
            case 9:
                this.noBack = (Integer) obj;
                break;
            case 10:
                this.uname = (String) obj;
                break;
            case 11:
                this.uurl = (String) obj;
                break;
            case 12:
                this.tplid = (String) obj;
                break;
            case 13:
                this.tpl = (String) obj;
                break;
            case 14:
                this.data = (String) obj;
                break;
            case 15:
                this.time = (Integer) obj;
                break;
            case 16:
                this.uac = (Integer) obj;
                break;
            case 17:
                this.dg = (Integer) obj;
                break;
            case 18:
                this.wnd = (String) obj;
                break;
            case 19:
                this.page = (String) obj;
                break;
            case 20:
                this.session = (String) obj;
                break;
            case 21:
                this.tid = (String) obj;
                break;
            case 22:
                this.client_key = (String) obj;
                break;
            case 23:
                this.ajax = (Integer) obj;
                break;
            case 24:
                this.iajax = (Integer) obj;
                break;
            case 25:
                this.onload = (String) obj;
                break;
            case 26:
                this.user_id = (String) obj;
                break;
            case 27:
                this.pkey = (String) obj;
                break;
            case 28:
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
        int i25;
        int i26;
        int i27;
        int i28 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i29 = this.hashCode;
        if (i29 != 0) {
            return i29;
        }
        String str = this.code;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i30 = i * 37;
        String str2 = this.err_msg;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i31 = (i30 + i2) * 37;
        String str3 = this.memo;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i32 = (i31 + i3) * 37;
        String str4 = this.result;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i33 = (i32 + i4) * 37;
        String str5 = this.end_code;
        if (str5 != null) {
            i5 = str5.hashCode();
        } else {
            i5 = 0;
        }
        int i34 = (i33 + i5) * 37;
        String str6 = this.synch;
        if (str6 != null) {
            i6 = str6.hashCode();
        } else {
            i6 = 0;
        }
        int i35 = (i34 + i6) * 37;
        String str7 = this.trade_no;
        if (str7 != null) {
            i7 = str7.hashCode();
        } else {
            i7 = 0;
        }
        int i36 = (i35 + i7) * 37;
        Integer num = this.wpage;
        if (num != null) {
            i8 = num.hashCode();
        } else {
            i8 = 0;
        }
        int i37 = (i36 + i8) * 37;
        Integer num2 = this.noBack;
        if (num2 != null) {
            i9 = num2.hashCode();
        } else {
            i9 = 0;
        }
        int i38 = (i37 + i9) * 37;
        String str8 = this.uname;
        if (str8 != null) {
            i10 = str8.hashCode();
        } else {
            i10 = 0;
        }
        int i39 = (i38 + i10) * 37;
        String str9 = this.uurl;
        if (str9 != null) {
            i11 = str9.hashCode();
        } else {
            i11 = 0;
        }
        int i40 = (i39 + i11) * 37;
        String str10 = this.tplid;
        if (str10 != null) {
            i12 = str10.hashCode();
        } else {
            i12 = 0;
        }
        int i41 = (i40 + i12) * 37;
        String str11 = this.tpl;
        if (str11 != null) {
            i13 = str11.hashCode();
        } else {
            i13 = 0;
        }
        int i42 = (i41 + i13) * 37;
        String str12 = this.data;
        if (str12 != null) {
            i14 = str12.hashCode();
        } else {
            i14 = 0;
        }
        int i43 = (i42 + i14) * 37;
        Integer num3 = this.time;
        if (num3 != null) {
            i15 = num3.hashCode();
        } else {
            i15 = 0;
        }
        int i44 = (i43 + i15) * 37;
        Integer num4 = this.uac;
        if (num4 != null) {
            i16 = num4.hashCode();
        } else {
            i16 = 0;
        }
        int i45 = (i44 + i16) * 37;
        Integer num5 = this.dg;
        if (num5 != null) {
            i17 = num5.hashCode();
        } else {
            i17 = 0;
        }
        int i46 = (i45 + i17) * 37;
        String str13 = this.wnd;
        if (str13 != null) {
            i18 = str13.hashCode();
        } else {
            i18 = 0;
        }
        int i47 = (i46 + i18) * 37;
        String str14 = this.page;
        if (str14 != null) {
            i19 = str14.hashCode();
        } else {
            i19 = 0;
        }
        int i48 = (i47 + i19) * 37;
        String str15 = this.session;
        if (str15 != null) {
            i20 = str15.hashCode();
        } else {
            i20 = 0;
        }
        int i49 = (i48 + i20) * 37;
        String str16 = this.tid;
        if (str16 != null) {
            i21 = str16.hashCode();
        } else {
            i21 = 0;
        }
        int i50 = (i49 + i21) * 37;
        String str17 = this.client_key;
        if (str17 != null) {
            i22 = str17.hashCode();
        } else {
            i22 = 0;
        }
        int i51 = (i50 + i22) * 37;
        Integer num6 = this.ajax;
        if (num6 != null) {
            i23 = num6.hashCode();
        } else {
            i23 = 0;
        }
        int i52 = (i51 + i23) * 37;
        Integer num7 = this.iajax;
        if (num7 != null) {
            i24 = num7.hashCode();
        } else {
            i24 = 0;
        }
        int i53 = (i52 + i24) * 37;
        String str18 = this.onload;
        if (str18 != null) {
            i25 = str18.hashCode();
        } else {
            i25 = 0;
        }
        int i54 = (i53 + i25) * 37;
        String str19 = this.user_id;
        if (str19 != null) {
            i26 = str19.hashCode();
        } else {
            i26 = 0;
        }
        int i55 = (i54 + i26) * 37;
        String str20 = this.pkey;
        if (str20 != null) {
            i27 = str20.hashCode();
        } else {
            i27 = 0;
        }
        int i56 = (i55 + i27) * 37;
        String str21 = this.extinfo;
        if (str21 != null) {
            i28 = str21.hashCode();
        }
        int i57 = i56 + i28;
        this.hashCode = i57;
        return i57;
    }

    public MspResV2() {
    }
}
