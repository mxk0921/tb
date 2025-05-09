package com.alibaba.triver.triver_shop.shop2023;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.g1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class FlagShipV25$initComponent$2 extends FunctionReferenceImpl implements g1a<String, JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public FlagShipV25$initComponent$2(FlagShipV25 flagShipV25) {
        super(1, flagShipV25, FlagShipV25.class, "getBottomTabPositionInfo", "getBottomTabPositionInfo(Ljava/lang/String;)Lcom/alibaba/fastjson/JSONObject;", 0);
    }

    public static /* synthetic */ Object ipc$super(FlagShipV25$initComponent$2 flagShipV25$initComponent$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/FlagShipV25$initComponent$2");
    }

    public final JSONObject invoke(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("81029c29", new Object[]{this, str}) : FlagShipV25.g1((FlagShipV25) this.receiver, str);
    }
}
