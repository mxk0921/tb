package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Rights;
import java.util.ArrayList;
import tb.dt4;
import tb.t2o;

/* compiled from: Taobao */
@MappingKey(key = "tradeConsumerProtection")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ConsumerRights extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject data;
    private String passValue;
    private String type;
    private String url;
    private Rights.b channel = initChannel();
    private ArrayList<Rights.c> rights = initRights();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements dt4.a<Rights.c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(ConsumerRights consumerRights) {
        }

        /* renamed from: b */
        public Rights.c a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Rights.c) ipChange.ipc$dispatch("fd38a34d", new Object[]{this, obj});
            }
            return new Rights.c((JSONObject) obj);
        }
    }

    static {
        t2o.a(912261663);
    }

    public ConsumerRights(JSONObject jSONObject) {
        super(jSONObject);
        this.data = jSONObject;
        this.passValue = jSONObject.getString("passValue");
        this.url = jSONObject.getString("url");
        this.type = jSONObject.getString("type");
    }

    private Rights.b initChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rights.b) ipChange.ipc$dispatch("fd15691d", new Object[]{this});
        }
        JSONObject jSONObject = this.data.getJSONObject("channel");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return new Rights.b(jSONObject);
    }

    private ArrayList<Rights.c> initRights() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("9d07c0e8", new Object[]{this});
        }
        JSONObject jSONObject2 = this.data.getJSONObject("tradeConsumerService");
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("service")) == null) {
            return null;
        }
        return dt4.a(jSONObject.getJSONArray("items"), new a(this));
    }

    public static /* synthetic */ Object ipc$super(ConsumerRights consumerRights, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/meta/ConsumerRights");
    }
}
