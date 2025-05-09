package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bnx implements Observer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_VALUE_OBSERVER = "XSValueObserver";

    /* renamed from: a  reason: collision with root package name */
    public final a f16498a;
    public final HashSet<Observable> b = new HashSet<>();

    static {
        t2o.a(993002162);
    }

    public bnx(a aVar) {
        this.f16498a = aVar;
    }

    public static bnx b(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bnx) ipChange.ipc$dispatch("c685f8b0", new Object[]{aVar, new Boolean(z)});
        }
        bnx bnxVar = (bnx) aVar.getTag(KEY_VALUE_OBSERVER);
        if (bnxVar != null || !z) {
            return bnxVar;
        }
        bnx bnxVar2 = new bnx(aVar);
        aVar.setTag(KEY_VALUE_OBSERVER, bnxVar2);
        return bnxVar2;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Iterator<Observable> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().deleteObserver(this);
        }
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
        } else if ((observable instanceof clk) && (obj instanceof JSONObject)) {
            this.b.add(observable);
            JSONObject jSONObject = (JSONObject) obj;
            if (TextUtils.equals(((clk) observable).b(), "page")) {
                str = "pageStorageChanged";
            } else {
                str = "observableMapValue";
            }
            this.f16498a.sendInstanceMessage("MUISE", str, jSONObject);
        }
    }
}
