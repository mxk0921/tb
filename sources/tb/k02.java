package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.umf.datamodel.protocol.ultron.Hierarchy;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronDeltaProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Delta;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class k02 implements fld {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public pt<AURAParseIO> f22318a;

    static {
        t2o.a(80740692);
        t2o.a(80740683);
    }

    @Override // tb.fld
    public UltronDeltaProtocol a(rxu rxuVar, pt<AURAParseIO> ptVar, k4e k4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronDeltaProtocol) ipChange.ipc$dispatch("cdf63d95", new Object[]{this, rxuVar, ptVar, k4eVar});
        }
        if (TextUtils.isEmpty(rxuVar.b)) {
            return null;
        }
        this.f22318a = ptVar;
        return b(rxuVar.b, d(rxuVar, k4eVar));
    }

    public void c(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9785c6a3", new Object[]{this, new Integer(i), str, str2});
            return;
        }
        pt<AURAParseIO> ptVar = this.f22318a;
        if (ptVar != null) {
            ptVar.b(new mi(i, "AURARulesServiceDomain", str, str2));
        }
    }

    public abstract Map<String, Component> d(rxu rxuVar, k4e k4eVar);

    public final UltronDeltaProtocol b(String str, Map<String, Component> map) {
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
