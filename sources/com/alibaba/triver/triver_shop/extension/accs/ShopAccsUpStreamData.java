package com.alibaba.triver.triver_shop.extension.accs;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopAccsUpStreamData {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ChannelCode f3033a;
    public final String b;
    public final String c;
    public final String d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class ChannelCode extends Enum<ChannelCode> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final ChannelCode onShopEnter = new ChannelCode("onShopEnter", 0);
        public static final ChannelCode onShopExit = new ChannelCode("onShopExit", 1);
        private static final /* synthetic */ ChannelCode[] $VALUES = $values();

        private static final /* synthetic */ ChannelCode[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ChannelCode[]) ipChange.ipc$dispatch("594df163", new Object[0]) : new ChannelCode[]{onShopEnter, onShopExit};
        }

        private ChannelCode(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(ChannelCode channelCode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/extension/accs/ShopAccsUpStreamData$ChannelCode");
        }

        public static ChannelCode valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("bb9e17ce", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(ChannelCode.class, str);
            }
            return (ChannelCode) valueOf;
        }

        public static ChannelCode[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("7b52b63f", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (ChannelCode[]) clone;
        }
    }

    static {
        t2o.a(766509311);
    }

    public ShopAccsUpStreamData(ChannelCode channelCode, String str, String str2, String str3) {
        ckf.g(channelCode, "channel");
        ckf.g(str, "userId");
        ckf.g(str2, "sellerId");
        ckf.g(str3, "shopId");
        this.f3033a = channelCode;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "channel", this.f3033a.toString());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "sellerId", this.c);
        jSONObject2.put((JSONObject) "shopId", this.d);
        jSONObject2.put((JSONObject) "clientTime", (String) Long.valueOf(System.currentTimeMillis()));
        jSONObject.put((JSONObject) "data", (String) jSONObject2);
        String jSONString = jSONObject.toJSONString();
        ckf.f(jSONString, "json.toJSONString()");
        return jSONString;
    }
}
