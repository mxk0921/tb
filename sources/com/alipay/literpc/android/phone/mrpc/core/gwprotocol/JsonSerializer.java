package com.alipay.literpc.android.phone.mrpc.core.gwprotocol;

import com.alibaba.ability.impl.mtop.MtopAbility;
import com.alipay.literpc.android.phone.mrpc.core.RpcException;
import com.alipay.literpc.jsoncodec.JSONCodec;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import java.util.ArrayList;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class JsonSerializer extends AbstractSerializer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VERSION = "1.0.0";

    /* renamed from: a  reason: collision with root package name */
    public int f3856a;
    public Object b;

    public JsonSerializer(int i, String str, Object obj) {
        super(str, obj);
        this.f3856a = i;
    }

    public static /* synthetic */ Object ipc$super(JsonSerializer jsonSerializer, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/literpc/android/phone/mrpc/core/gwprotocol/JsonSerializer");
    }

    public int getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue();
        }
        return this.f3856a;
    }

    @Override // com.alipay.literpc.android.phone.mrpc.core.gwprotocol.Serializer
    public byte[] packet() throws RpcException {
        String str;
        String str2 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("1cd955ae", new Object[]{this});
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (this.b != null) {
                arrayList.add(new BasicNameValuePair("extParam", JSONCodec.toJSONString(this.b)));
            }
            arrayList.add(new BasicNameValuePair("operationType", this.mOperationType));
            arrayList.add(new BasicNameValuePair("id", this.f3856a + str2));
            new StringBuilder("mParams is:").append(this.mParams);
            Object obj = this.mParams;
            if (obj == null) {
                str = MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
            } else {
                str = JSONCodec.toJSONString(obj);
            }
            arrayList.add(new BasicNameValuePair(MtopAbility.API_REQUEST_DATA, str));
            String format = URLEncodedUtils.format(arrayList, "utf-8");
            new StringBuilder("request = ").append(format);
            return format.getBytes();
        } catch (Exception e) {
            if (("request  =" + this.mParams + ":" + e) != null) {
                str2 = e.getMessage();
            }
            throw new RpcException(9, str2, e);
        }
    }

    @Override // com.alipay.literpc.android.phone.mrpc.core.gwprotocol.Serializer
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
            this.f3856a = i;
        }
    }
}
