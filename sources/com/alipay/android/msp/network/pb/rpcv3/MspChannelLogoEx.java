package com.alipay.android.msp.network.pb.rpcv3;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.sdk.sys.BizContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tb.k5n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MspChannelLogoEx extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_BIZTYPE = "";
    public static final String DEFAULT_EXTINFO = "";
    public static final String DEFAULT_NEWCARDCHANNEL = "";
    public static final int TAG_BIZTYPE = 3;
    public static final int TAG_EXIT = 1;
    public static final int TAG_EXTINFO = 6;
    public static final int TAG_NEWCARDCHANNEL = 5;
    public static final int TAG_PAYMENTS = 4;
    public static final int TAG_SETTING = 2;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public String biztype;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public Integer exit;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public String extinfo;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public String newCardChannel;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public List<MspPaymentEx> payments;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public Integer setting;
    public static final Integer DEFAULT_EXIT = 0;
    public static final Integer DEFAULT_SETTING = 0;
    public static final List<MspPaymentEx> DEFAULT_PAYMENTS = Collections.emptyList();

    public MspChannelLogoEx(MspChannelLogoEx mspChannelLogoEx) {
        super(mspChannelLogoEx);
        if (mspChannelLogoEx != null) {
            this.exit = mspChannelLogoEx.exit;
            this.setting = mspChannelLogoEx.setting;
            this.biztype = mspChannelLogoEx.biztype;
            this.payments = Message.copyOf(mspChannelLogoEx.payments);
            this.newCardChannel = mspChannelLogoEx.newCardChannel;
            this.extinfo = mspChannelLogoEx.extinfo;
        }
    }

    public static /* synthetic */ Object ipc$super(MspChannelLogoEx mspChannelLogoEx, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/network/pb/rpcv3/MspChannelLogoEx");
    }

    public final boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MspChannelLogoEx)) {
            return false;
        }
        MspChannelLogoEx mspChannelLogoEx = (MspChannelLogoEx) obj;
        if (!equals(this.exit, mspChannelLogoEx.exit) || !equals(this.setting, mspChannelLogoEx.setting) || !equals(this.biztype, mspChannelLogoEx.biztype) || !equals((List<?>) this.payments, (List<?>) mspChannelLogoEx.payments) || !equals(this.newCardChannel, mspChannelLogoEx.newCardChannel) || !equals(this.extinfo, mspChannelLogoEx.extinfo)) {
            return false;
        }
        return true;
    }

    public final MspChannelLogoEx fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspChannelLogoEx) ipChange.ipc$dispatch("c9047e43", new Object[]{this, new Integer(i), obj});
        }
        switch (i) {
            case 1:
                this.exit = (Integer) obj;
                break;
            case 2:
                this.setting = (Integer) obj;
                break;
            case 3:
                this.biztype = (String) obj;
                break;
            case 4:
                this.payments = Message.immutableCopyOf((List) obj);
                break;
            case 5:
                this.newCardChannel = (String) obj;
                break;
            case 6:
                this.extinfo = (String) obj;
                break;
        }
        return this;
    }

    public final String format(boolean z) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d93069ca", new Object[]{this, new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject();
        if (this.exit != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.exit);
            jSONObject.put("exit", (Object) Boolean.valueOf(TextUtils.equals("1", sb.toString())));
        }
        if (this.setting != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.setting);
            jSONObject.put(BizContext.KEY_SETTING_FILTER, (Object) Boolean.valueOf(TextUtils.equals("1", sb2.toString())));
        }
        jSONObject.put(k5n.ACTIVITY_KEY_BIZ_TYPE, (Object) this.biztype);
        jSONObject.put("newCardChannel", (Object) JSON.parseObject(this.newCardChannel));
        if (this.payments != null) {
            JSONArray jSONArray = new JSONArray();
            for (MspPaymentEx mspPaymentEx : this.payments) {
                if (z) {
                    jSONArray.add(mspPaymentEx.formatPreChannel());
                } else {
                    jSONArray.add(mspPaymentEx.formatPayChannel());
                }
            }
            if (z) {
                jSONObject.put("channels", (Object) jSONArray);
            } else {
                jSONObject.put("payments", (Object) jSONArray);
            }
        }
        JsonUtil.addExtInfo(this.extinfo, jSONObject);
        return jSONObject.toString();
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i7 = this.hashCode;
        if (i7 != 0) {
            return i7;
        }
        Integer num = this.exit;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int i8 = i * 37;
        Integer num2 = this.setting;
        if (num2 != null) {
            i2 = num2.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 37;
        String str = this.biztype;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 37;
        List<MspPaymentEx> list = this.payments;
        if (list != null) {
            i6 = list.hashCode();
        }
        int i11 = (i10 + i6) * 37;
        String str2 = this.newCardChannel;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 37;
        String str3 = this.extinfo;
        if (str3 != null) {
            i5 = str3.hashCode();
        }
        int i13 = i12 + i5;
        this.hashCode = i13;
        return i13;
    }

    public MspChannelLogoEx() {
    }
}
