package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.dt4;
import tb.t2o;

/* compiled from: Taobao */
@MappingKey(key = "price")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Price extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String basePrice;
    private final ArrayList<b> extraPrices;
    private final b price;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements dt4.a<b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Price price) {
        }

        /* renamed from: b */
        public b a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("171da66f", new Object[]{this, obj});
            }
            if (obj instanceof JSONObject) {
                return new b((JSONObject) obj, null);
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f6754a;
        public final int b;

        static {
            t2o.a(912261679);
        }

        public /* synthetic */ b(JSONObject jSONObject, a aVar) {
            this(jSONObject);
        }

        public static b a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4a54210a", new Object[]{jSONObject});
            }
            if (jSONObject != null) {
                return new b(jSONObject);
            }
            return null;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5c477b99", new Object[]{this});
            }
            return this.f6754a;
        }

        public int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("687a5f67", new Object[]{this})).intValue();
            }
            return this.b;
        }

        public b(JSONObject jSONObject) {
            this.f6754a = jSONObject.getString("priceText");
            this.b = jSONObject.getIntValue("type");
        }
    }

    static {
        t2o.a(912261677);
    }

    public Price(JSONObject jSONObject) {
        super(jSONObject);
        this.price = b.a(jSONObject.getJSONObject("price"));
        this.extraPrices = initExtraPrices(jSONObject);
        this.basePrice = jSONObject.getString("basePrice");
    }

    private ArrayList<b> initExtraPrices(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("605a3299", new Object[]{this, jSONObject});
        }
        return dt4.a(jSONObject.getJSONArray("extraPrices"), new a(this));
    }

    public static /* synthetic */ Object ipc$super(Price price, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/meta/Price");
    }

    public String getBasePrice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be4845f7", new Object[]{this});
        }
        return this.basePrice;
    }

    public ArrayList<b> getExtraPrices() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("c9a94625", new Object[]{this});
        }
        return this.extraPrices;
    }

    public b getPrice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b6a5606b", new Object[]{this});
        }
        return this.price;
    }
}
