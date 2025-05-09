package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.umf.datamodel.protocol.ultron.Hierarchy;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronDeltaProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Delta;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class l02 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f23035a;
    public pt<AURAParseIO> b;

    static {
        t2o.a(80740642);
    }

    public pt<AURAParseIO> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pt) ipChange.ipc$dispatch("9bd575e6", new Object[]{this});
        }
        return this.b;
    }

    public abstract String c();

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bc50efed", new Object[]{this});
        }
        return this.f23035a;
    }

    public UltronDeltaProtocol e(rxu rxuVar, JSONObject jSONObject, pt<AURAParseIO> ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronDeltaProtocol) ipChange.ipc$dispatch("7207b030", new Object[]{this, rxuVar, jSONObject, ptVar});
        }
        if (TextUtils.isEmpty(rxuVar.b)) {
            return null;
        }
        this.f23035a = jSONObject;
        this.b = ptVar;
        return a(rxuVar.b, f(rxuVar));
    }

    public abstract Map<String, Component> f(rxu rxuVar);

    public final UltronDeltaProtocol a(String str, Map<String, Component> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronDeltaProtocol) ipChange.ipc$dispatch("5747f66b", new Object[]{this, str, map});
        }
        if (map == null) {
            return null;
        }
        UltronDeltaProtocol ultronDeltaProtocol = new UltronDeltaProtocol();
        Delta delta = new Delta();
        delta.opType = "merge";
        delta.target = str;
        Hierarchy hierarchy = new Hierarchy();
        hierarchy.delta = new ArrayList(Arrays.asList(delta));
        ultronDeltaProtocol.hierarchy = hierarchy;
        ultronDeltaProtocol.data = map;
        return ultronDeltaProtocol;
    }
}
