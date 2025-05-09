package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTUtdid;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.viewmodel.SmartLayerViewModel;
import java.util.HashMap;
import tb.z6q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class g6q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SmartLayerConfig";

    /* renamed from: a  reason: collision with root package name */
    public String f19759a;
    public String b;
    public String c;
    public String d;
    public String e = "DX";
    public a f;
    public String g;
    public HashMap<String, String> h;
    public Class<? extends SmartLayerViewModel> i;
    public Class<? extends x6q> j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
    }

    static {
        t2o.a(295699744);
    }

    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e23491a", new Object[]{this, context})).booleanValue();
        }
        a aVar = this.f;
        if (aVar == null) {
            return true;
        }
        return ((z6q.a) aVar).a(context);
    }

    /* renamed from: b */
    public g6q clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g6q) ipChange.ipc$dispatch("ab97cea5", new Object[]{this});
        }
        g6q g6qVar = new g6q();
        g6qVar.f19759a = this.f19759a;
        g6qVar.c = this.c;
        g6qVar.d = this.d;
        g6qVar.g = this.g;
        g6qVar.i = this.i;
        g6qVar.j = this.j;
        g6qVar.e = this.e;
        g6qVar.h = this.h;
        g6qVar.f = this.f;
        return g6qVar;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a4963da", new Object[]{this});
        }
        if (d()) {
            return this.e;
        }
        return null;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79522337", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.d)) {
            return false;
        }
        if (!"PopLayer".equals(this.d) && !"BottomLayer".equals(this.d)) {
            return false;
        }
        return true;
    }

    public boolean e() {
        Class<? extends SmartLayerViewModel> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7baa95f", new Object[]{this})).booleanValue();
        }
        if (!TextUtils.isEmpty(this.c) && (cls = this.i) != null && this.j != null && SmartLayerViewModel.class.isAssignableFrom(cls) && x6q.class.isAssignableFrom(this.j)) {
            return true;
        }
        return false;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfb428e5", new Object[]{this});
        } else if (v2s.o().f() == null || v2s.o().f().getApplication() == null) {
            this.b = this.c + "_default_" + System.currentTimeMillis();
        } else {
            this.b = this.c + "_" + UTUtdid.instance(v2s.o().f().getApplication()).getValue() + "_" + System.currentTimeMillis();
        }
    }

    public void g(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee6f417", new Object[]{this, hashMap});
            return;
        }
        this.h = hashMap;
        if (hashMap != null) {
            String str = hashMap.get(yh6.CONFIG_KEY_TEMPLATE_NAME);
            if (!TextUtils.isEmpty(str)) {
                this.g = str;
            }
            String str2 = hashMap.get("popId");
            if (!TextUtils.isEmpty(str2)) {
                this.f19759a = str2;
            }
            hashMap.put("smartBizId", this.c);
            f();
        }
    }
}
