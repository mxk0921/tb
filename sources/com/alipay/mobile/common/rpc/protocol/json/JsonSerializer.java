package com.alipay.mobile.common.rpc.protocol.json;

import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.ability.impl.mtop.MtopAbility;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alipay.mobile.common.rpc.protocol.AbstractSerializer;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class JsonSerializer extends AbstractSerializer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "JsonSerializer";
    public static final String VERSION = "1.0.0";

    /* renamed from: a  reason: collision with root package name */
    public int f4037a;
    public Object b;
    public String mRequestDataJson;

    public JsonSerializer(int i, String str, Object obj) {
        super(str, obj);
        this.f4037a = i;
    }

    public static /* synthetic */ Object ipc$super(JsonSerializer jsonSerializer, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/rpc/protocol/json/JsonSerializer");
    }

    public void buildNameValuePairs(List<BasicNameValuePair> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b63dd9", new Object[]{this, list});
            return;
        }
        if (this.b != null) {
            list.add(new BasicNameValuePair("extParam", JSON.toJSONString(this.b)));
        }
        list.add(new BasicNameValuePair("operationType", this.mOperationType));
        if (!TextUtils.isEmpty(this.scene)) {
            list.add(new BasicNameValuePair("scene", this.scene));
        }
        LogCatUtil.printInfo("JsonSerializer", "mParams = " + this.mParams + " scene = " + this.scene);
        list.add(buildReqDataNVPair());
    }

    public BasicNameValuePair buildReqDataNVPair() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasicNameValuePair) ipChange.ipc$dispatch("5fac3b37", new Object[]{this});
        }
        return new BasicNameValuePair(MtopAbility.API_REQUEST_DATA, getRequestDataJson());
    }

    public int getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue();
        }
        return this.f4037a;
    }

    public String getOperationType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76cb9a4e", new Object[]{this});
        }
        return this.mOperationType;
    }

    public String getRequestDataDigest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("315012", new Object[]{this});
        }
        try {
            return new String(Base64.encode(MessageDigest.getInstance("MD5").digest(getRequestDataJson().getBytes()), 0));
        } catch (Exception e) {
            LogCatUtil.warn("JsonSerializer", e);
            return "";
        }
    }

    public String getRequestDataJson() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8af12ae", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.mRequestDataJson)) {
            return this.mRequestDataJson;
        }
        Object obj = this.mParams;
        if (obj == null) {
            str = MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        } else {
            str = JSON.toJSONString(obj, SerializerFeature.DisableCircularReferenceDetect);
        }
        this.mRequestDataJson = str;
        return str;
    }

    public byte[] nvpairs2Bytes(List<BasicNameValuePair> list) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ccb1a3fb", new Object[]{this, list});
        }
        String format = URLEncodedUtils.format(list, "utf-8");
        StringBuilder sb = new StringBuilder("request = ");
        if (format == null) {
            str = "";
        } else {
            str = URLDecoder.decode(format);
        }
        sb.append(str);
        LogCatUtil.printInfo("JsonSerializer", sb.toString());
        return format.getBytes();
    }

    @Override // com.alipay.mobile.common.rpc.protocol.Serializer
    public byte[] packet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("1cd955ae", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        prePacket(arrayList);
        buildNameValuePairs(arrayList);
        postPacket(arrayList);
        return nvpairs2Bytes(arrayList);
    }

    public void postPacket(List<BasicNameValuePair> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("467f88c0", new Object[]{this, list});
        }
    }

    public void prePacket(List<BasicNameValuePair> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b35503", new Object[]{this, list});
        }
    }

    @Override // com.alipay.mobile.common.rpc.protocol.Serializer
    public void setExtParam(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e618391", new Object[]{this, obj});
        } else {
            this.b = obj;
        }
    }

    public void setId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ecf45f", new Object[]{this, new Integer(i)});
        } else {
            this.f4037a = i;
        }
    }
}
