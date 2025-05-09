package tb;

import com.alibaba.android.ultron.engine.protocol.Container;
import com.alibaba.android.ultron.engine.protocol.Data;
import com.alibaba.android.ultron.engine.protocol.EndPoint;
import com.alibaba.android.ultron.engine.protocol.Global;
import com.alibaba.android.ultron.engine.protocol.Hierarchy;
import com.alibaba.android.ultron.engine.protocol.Linkage;
import com.alibaba.android.ultron.engine.protocol.UltronProtocol;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class v1n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cit f29736a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, cit citVar) {
            super(str);
            this.f29736a = citVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/engine/template/state/ProtocolRenderState$1");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                UnifyLog.g(xwm.b(this.f29736a.c), new String[0]);
            }
        }
    }

    static {
        t2o.a(157286483);
    }

    public cit a(y0o y0oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cit) ipChange.ipc$dispatch("9c82c320", new Object[]{this, y0oVar});
        }
        if (!y0oVar.n().isEmpty()) {
            Iterator<Map.Entry<String, ol7>> it = y0oVar.n().entrySet().iterator();
            while (it.hasNext()) {
                UnifyLog.g("ProtocolRenderState", "renderDeltaProtocol: " + it.next().getValue().toString());
            }
        }
        u1n u1nVar = new u1n(y0oVar);
        EndPoint a2 = he8.a();
        Hierarchy b = gwa.b(u1nVar);
        Data b2 = fs6.b(u1nVar);
        Container b3 = bn4.b(u1nVar);
        Global a3 = hca.a(u1nVar);
        Linkage a4 = lsg.a();
        UltronProtocol ultronProtocol = new UltronProtocol();
        ultronProtocol.container = b3;
        ultronProtocol.hierarchy = b;
        ultronProtocol.data = b2.components;
        ultronProtocol.global = a3;
        ultronProtocol.endpoint = a2;
        ultronProtocol.linkage = a4;
        cit d = cit.d((JSONObject) JSON.toJSON(ultronProtocol));
        Coordinator.postTask(new a("ultron_printInfo", d));
        return d;
    }
}
