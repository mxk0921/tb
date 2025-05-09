package com.alipay.android.msp.network.pb.v3;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.wire.Message;
import com.alipay.android.msp.framework.wire.ProtoField;
import com.alipay.android.msp.utils.JsonUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MspTpl extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_EXTINFO = "";
    public static final String DEFAULT_FORMAT = "";
    public static final String DEFAULT_PLATFORM = "";
    public static final String DEFAULT_PUBLISHVERSION = "";
    public static final String DEFAULT_TAG = "";
    public static final String DEFAULT_TIME = "";
    public static final String DEFAULT_TPLID = "";
    public static final String DEFAULT_TPLVERSION = "";
    public static final int TAG_EXTINFO = 8;
    public static final int TAG_FORMAT = 1;
    public static final int TAG_PLATFORM = 2;
    public static final int TAG_PUBLISHVERSION = 3;
    public static final int TAG_TAG = 4;
    public static final int TAG_TIME = 5;
    public static final int TAG_TPLID = 6;
    public static final int TAG_TPLVERSION = 7;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public String extinfo;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public String format;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public String platform;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public String publishVersion;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public String tag;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public String time;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public String tplId;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public String tplVersion;

    public MspTpl(MspTpl mspTpl) {
        super(mspTpl);
        if (mspTpl != null) {
            this.format = mspTpl.format;
            this.platform = mspTpl.platform;
            this.publishVersion = mspTpl.publishVersion;
            this.tag = mspTpl.tag;
            this.time = mspTpl.time;
            this.tplId = mspTpl.tplId;
            this.tplVersion = mspTpl.tplVersion;
            this.extinfo = mspTpl.extinfo;
        }
    }

    public static /* synthetic */ Object ipc$super(MspTpl mspTpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/network/pb/v3/MspTpl");
    }

    public final boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MspTpl)) {
            return false;
        }
        MspTpl mspTpl = (MspTpl) obj;
        if (!equals(this.format, mspTpl.format) || !equals(this.platform, mspTpl.platform) || !equals(this.publishVersion, mspTpl.publishVersion) || !equals(this.tag, mspTpl.tag) || !equals(this.time, mspTpl.time) || !equals(this.tplId, mspTpl.tplId) || !equals(this.tplVersion, mspTpl.tplVersion) || !equals(this.extinfo, mspTpl.extinfo)) {
            return false;
        }
        return true;
    }

    public final MspTpl fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspTpl) ipChange.ipc$dispatch("2223ba17", new Object[]{this, new Integer(i), obj});
        }
        switch (i) {
            case 1:
                this.format = (String) obj;
                break;
            case 2:
                this.platform = (String) obj;
                break;
            case 3:
                this.publishVersion = (String) obj;
                break;
            case 4:
                this.tag = (String) obj;
                break;
            case 5:
                this.time = (String) obj;
                break;
            case 6:
                this.tplId = (String) obj;
                break;
            case 7:
                this.tplVersion = (String) obj;
                break;
            case 8:
                this.extinfo = (String) obj;
                break;
        }
        return this;
    }

    public final String format(String str) throws JSONException {
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27a69e58", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(this.time)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.platform)) {
            str2 = this.platform;
        } else {
            str2 = "common";
        }
        jSONObject.put("platform", (Object) str2);
        if (!TextUtils.isEmpty(this.format)) {
            str3 = this.format;
        } else {
            str3 = "JSON";
        }
        jSONObject.put("format", (Object) str3);
        if (!TextUtils.isEmpty(this.tag)) {
            str4 = this.tag;
        } else {
            str4 = "QUICKPAY";
        }
        jSONObject.put("tag", (Object) str4);
        jSONObject.put("publishVersion", (Object) this.publishVersion);
        jSONObject.put("tplVersion", (Object) this.tplVersion);
        jSONObject.put("time", (Object) this.time);
        if (!TextUtils.isEmpty(this.tplId)) {
            str = this.tplId;
        } else if (str == null) {
            str = "";
        }
        jSONObject.put("tplId", (Object) str);
        JsonUtil.addExtInfo(this.extinfo, jSONObject);
        return jSONObject.toString() + " ";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i9 = this.hashCode;
        if (i9 != 0) {
            return i9;
        }
        String str = this.format;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i10 = i * 37;
        String str2 = this.platform;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (i10 + i2) * 37;
        String str3 = this.publishVersion;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 37;
        String str4 = this.tag;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 37;
        String str5 = this.time;
        if (str5 != null) {
            i5 = str5.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 37;
        String str6 = this.tplId;
        if (str6 != null) {
            i6 = str6.hashCode();
        } else {
            i6 = 0;
        }
        int i15 = (i14 + i6) * 37;
        String str7 = this.tplVersion;
        if (str7 != null) {
            i7 = str7.hashCode();
        } else {
            i7 = 0;
        }
        int i16 = (i15 + i7) * 37;
        String str8 = this.extinfo;
        if (str8 != null) {
            i8 = str8.hashCode();
        }
        int i17 = i16 + i8;
        this.hashCode = i17;
        return i17;
    }

    public MspTpl() {
    }
}
