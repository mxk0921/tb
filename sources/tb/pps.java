package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class pps {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONArray f26227a;
    public final ShopDataParser b;
    public final int c;
    public int d;
    public ups[] e;

    static {
        t2o.a(766509467);
    }

    public pps(JSONArray jSONArray, ShopDataParser shopDataParser, int i) {
        this.f26227a = jSONArray;
        this.b = shopDataParser;
        this.c = i;
        c();
    }

    public final ups a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ups) ipChange.ipc$dispatch("19e2362d", new Object[]{this, new Integer(i)});
        }
        ups[] upsVarArr = this.e;
        if (upsVarArr == null || i >= this.d) {
            return null;
        }
        ckf.d(upsVarArr);
        return upsVarArr[i];
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("538d4dd0", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd55ed21", new Object[]{this});
            return;
        }
        JSONArray jSONArray = this.f26227a;
        if (jSONArray != null) {
            int size = jSONArray.size();
            ups[] upsVarArr = new ups[size];
            for (int i = 0; i < size; i++) {
                upsVarArr[i] = new ups(this.f26227a.getJSONObject(i), this.b, this.c, i);
            }
            this.e = upsVarArr;
            this.d = this.f26227a.size();
        }
    }
}
