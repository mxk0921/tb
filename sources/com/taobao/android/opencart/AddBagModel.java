package com.taobao.android.opencart;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.cdv;
import tb.fdv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AddBagModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String cartFrom;
    private JSONObject clientExParams;
    @JSONField(serialize = false)
    private c endRect;
    private String exParams;
    private String itemId;
    @JSONField(serialize = false)
    private boolean openUrlInDetail;
    @JSONField(serialize = false)
    private String pic;
    private long quantity;
    @JSONField(serialize = false)
    private String requestId;
    private boolean showSKU;
    private String skuId;
    @JSONField(serialize = false)
    private c startRect;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f9050a;
        public String b;
        public int c = 1;
        public String d;
        public String e;
        public boolean f;
        public String g;
        public JSONObject h;

        public AddBagModel a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AddBagModel) ipChange.ipc$dispatch("b6d27656", new Object[]{this});
            }
            b();
            AddBagModel addBagModel = new AddBagModel();
            AddBagModel.access$102(addBagModel, this.f9050a);
            AddBagModel.access$202(addBagModel, this.b);
            AddBagModel.access$302(addBagModel, this.c);
            AddBagModel.access$402(addBagModel, this.d);
            AddBagModel.access$502(addBagModel, this.e);
            AddBagModel.access$602(addBagModel, this.g);
            AddBagModel.access$702(addBagModel, this.f);
            AddBagModel.access$802(addBagModel, this.h);
            try {
                AddBagModel.access$902(addBagModel, this.h.getString("pic"));
                AddBagModel.access$1002(addBagModel, c(this.h.getJSONObject("startRect")));
                AddBagModel.access$1102(addBagModel, c(this.h.getJSONObject("endRect")));
                if (this.h.containsKey("openUrlInDetail")) {
                    AddBagModel.access$1202(addBagModel, ((Boolean) this.h.get("openUrlInDetail")).booleanValue());
                }
            } catch (Exception unused) {
            }
            return addBagModel;
        }

        public final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63bd6235", new Object[]{this});
            } else if (TextUtils.isEmpty(this.f9050a)) {
                cdv.a("AddBagModel", fdv.F_NETWORK_REQUEST, "", "necessary itemId miss", "");
            }
        }

        public final c c(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("20c98670", new Object[]{this, jSONObject});
            }
            c cVar = new c();
            c.a(cVar, jSONObject.getFloat("x").floatValue());
            c.b(cVar, jSONObject.getFloat("y").floatValue());
            c.c(cVar, jSONObject.getFloat("width").floatValue());
            c.d(cVar, jSONObject.getFloat("height").floatValue());
            return cVar;
        }

        public b d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ff80d267", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public b e(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("293505c2", new Object[]{this, map});
            }
            this.h = new JSONObject(map);
            return this;
        }

        public b f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4920e456", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public b g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("596b948b", new Object[]{this, str});
            }
            this.f9050a = str;
            return this;
        }

        public b h(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("adf88bd9", new Object[]{this, new Integer(i)});
            }
            this.c = i;
            return this;
        }

        public b i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("bedeedc3", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public b j(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c5fc9f39", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public b k(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("bb7d2951", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }
    }

    public static /* synthetic */ c access$1002(AddBagModel addBagModel, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("e610790d", new Object[]{addBagModel, cVar});
        }
        addBagModel.startRect = cVar;
        return cVar;
    }

    public static /* synthetic */ String access$102(AddBagModel addBagModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5492293f", new Object[]{addBagModel, str});
        }
        addBagModel.itemId = str;
        return str;
    }

    public static /* synthetic */ c access$1102(AddBagModel addBagModel, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("1f9dcace", new Object[]{addBagModel, cVar});
        }
        addBagModel.endRect = cVar;
        return cVar;
    }

    public static /* synthetic */ boolean access$1202(AddBagModel addBagModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65a83ab1", new Object[]{addBagModel, new Boolean(z)})).booleanValue();
        }
        addBagModel.openUrlInDetail = z;
        return z;
    }

    public static /* synthetic */ String access$202(AddBagModel addBagModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc0e0300", new Object[]{addBagModel, str});
        }
        addBagModel.skuId = str;
        return str;
    }

    public static /* synthetic */ long access$302(AddBagModel addBagModel, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca919623", new Object[]{addBagModel, new Long(j)})).longValue();
        }
        addBagModel.quantity = j;
        return j;
    }

    public static /* synthetic */ String access$402(AddBagModel addBagModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b05b682", new Object[]{addBagModel, str});
        }
        addBagModel.cartFrom = str;
        return str;
    }

    public static /* synthetic */ String access$502(AddBagModel addBagModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2819043", new Object[]{addBagModel, str});
        }
        addBagModel.exParams = str;
        return str;
    }

    public static /* synthetic */ String access$602(AddBagModel addBagModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99fd6a04", new Object[]{addBagModel, str});
        }
        addBagModel.requestId = str;
        return str;
    }

    public static /* synthetic */ boolean access$702(AddBagModel addBagModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8b83a47", new Object[]{addBagModel, new Boolean(z)})).booleanValue();
        }
        addBagModel.showSKU = z;
        return z;
    }

    public static /* synthetic */ JSONObject access$802(AddBagModel addBagModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fc42c780", new Object[]{addBagModel, jSONObject});
        }
        addBagModel.clientExParams = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ String access$902(AddBagModel addBagModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9070f747", new Object[]{addBagModel, str});
        }
        addBagModel.pic = str;
        return str;
    }

    public String getCartFrom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4cd1f699", new Object[]{this});
        }
        return this.cartFrom;
    }

    public Map<String, Object> getClientExParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b8315df6", new Object[]{this});
        }
        return this.clientExParams;
    }

    public c getEndRect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("3661043d", new Object[]{this});
        }
        return this.endRect;
    }

    public String getExParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1145f0ca", new Object[]{this});
        }
        return this.exParams;
    }

    public String getItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        return this.itemId;
    }

    public String getPic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c154925", new Object[]{this});
        }
        return this.pic;
    }

    public long getQuantity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9453dfc", new Object[]{this})).longValue();
        }
        return this.quantity;
    }

    public String getRequestId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91478625", new Object[]{this});
        }
        return this.requestId;
    }

    public String getSkuId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c61a6d7", new Object[]{this});
        }
        return this.skuId;
    }

    public c getStartRect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("6a99516", new Object[]{this});
        }
        return this.startRect;
    }

    public boolean isOpenUrlInDetail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de55b13c", new Object[]{this})).booleanValue();
        }
        return this.openUrlInDetail;
    }

    public boolean isShowSKU() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b42d9e1", new Object[]{this})).booleanValue();
        }
        return this.showSKU;
    }

    private AddBagModel() {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public float f9051a;
        public float b;
        public float c;
        public float d;

        public c(float f, float f2, float f3, float f4) {
            this.f9051a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public static /* synthetic */ float a(c cVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ec41edee", new Object[]{cVar, new Float(f)})).floatValue();
            }
            cVar.f9051a = f;
            return f;
        }

        public static /* synthetic */ float b(c cVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("792f050d", new Object[]{cVar, new Float(f)})).floatValue();
            }
            cVar.b = f;
            return f;
        }

        public static /* synthetic */ float c(c cVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("61c1c2c", new Object[]{cVar, new Float(f)})).floatValue();
            }
            cVar.c = f;
            return f;
        }

        public static /* synthetic */ float d(c cVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9309334b", new Object[]{cVar, new Float(f)})).floatValue();
            }
            cVar.d = f;
            return f;
        }

        public c e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("8ab8d971", new Object[]{this});
            }
            return new c(this.f9051a, this.b, this.c, this.d);
        }

        public float f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4703e214", new Object[]{this})).floatValue();
            }
            return this.d;
        }

        public float g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fc48d087", new Object[]{this})).floatValue();
            }
            return this.c;
        }

        public float h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("754e2f39", new Object[]{this})).floatValue();
            }
            return this.f9051a;
        }

        public float i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("755c46ba", new Object[]{this})).floatValue();
            }
            return this.b;
        }

        public boolean j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("22407981", new Object[]{this})).booleanValue();
            }
            if (this.f9051a == 0.0f || this.b == 0.0f || this.c == 0.0f || this.d == 0.0f) {
                return true;
            }
            return false;
        }

        public void k(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2fde3d90", new Object[]{this, new Float(f)});
            } else {
                this.d = f;
            }
        }

        public void l(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("baf5f815", new Object[]{this, new Float(f)});
            } else {
                this.c = f;
            }
        }

        public void m(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27ad55a3", new Object[]{this, new Float(f)});
            } else {
                this.f9051a = f;
            }
        }

        public void n(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29622e42", new Object[]{this, new Float(f)});
            } else {
                this.b = f;
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "CartRect{x=" + this.f9051a + ", y=" + this.b + ", width=" + this.c + ", height=" + this.d + '}';
        }

        public c() {
        }
    }
}
