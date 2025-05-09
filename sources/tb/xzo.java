package tb;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xzo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final xzo f31742a = new xzo();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                return;
            }
            b4p.a("SearchAddCartUtil", "fail to add to cart: " + str + "::" + str2);
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
            } else if (map != null && "1".equals(map.get("resultCode"))) {
                b4p.a("SearchAddCartUtil", "add to cart successfully: " + map);
                xzo.this.d();
            }
        }
    }

    static {
        t2o.a(815792582);
    }

    public static xzo c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xzo) ipChange.ipc$dispatch("60a691e6", new Object[0]);
        }
        return f31742a;
    }

    public final ArrayMap<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayMap) ipChange.ipc$dispatch("fba1ab5e", new Object[]{this});
        }
        return new ArrayMap<>();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a8194bf", new Object[]{this});
            return;
        }
        b4p.a("SearchAddCartUtil", "success");
        sen.f("ClickAddToCartSuccess", b());
    }

    public boolean a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ccb3b36", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("actionType", "0");
        hashMap.put("bizName", "taobao_main_search");
        if (o4p.q0()) {
            str2 = "2.0";
        } else {
            str2 = "1.0";
        }
        try {
            rrh.e().o(new vrh("msoa.taobao.search", "msoa.taobao.detail.showsku", str2, "msoa.taobao.search", hashMap), new a());
        } catch (Exception unused) {
            b4p.b("SearchAddCartUtil", "add to cart exception");
        }
        return true;
    }
}
