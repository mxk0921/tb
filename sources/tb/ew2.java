package tb;

import androidx.collection.ArrayMap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.AccsConnInfo;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.messagekit.core.utils.MsgMonitor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.android.agoo.common.AgooConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ew2 implements vxx<ikl> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, lkd> f18845a = new ConcurrentHashMap<>();

    static {
        t2o.a(628097050);
        t2o.a(628097383);
    }

    public boolean b(String str, int i, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc62ddd4", new Object[]{this, str, new Integer(i), map})).booleanValue();
        }
        MsgLog.e("CallbackManager", "callback:", Integer.valueOf(i), str);
        if (str == null) {
            return false;
        }
        if (i == 1000) {
            MsgMonitor.f("MKT", "MKT_MSG_RATE");
        } else {
            MsgMonitor.c("MKT", "MKT_MSG_RATE", "" + i, null);
        }
        lkd lkdVar = this.f18845a.get(str);
        if (lkdVar != null) {
            lkdVar.onResult(i, map);
            this.f18845a.remove(str);
        }
        return true;
    }

    public boolean c(String str, lkd lkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca9df52", new Object[]{this, str, lkdVar})).booleanValue();
        }
        if (lkdVar == null) {
            return false;
        }
        this.f18845a.put(str, lkdVar);
        return true;
    }

    /* renamed from: a */
    public void accept(ikl iklVar) {
        dh2 dh2Var;
        String str;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d52d87ce", new Object[]{this, iklVar});
        } else if (iklVar.f21366a instanceof AccsConnInfo) {
            MsgLog.e("CallbackManager", "callback AccsConnInfo, ignore");
        } else {
            ArrayMap arrayMap = new ArrayMap(10);
            arrayMap.put("mqtt_type", Integer.valueOf(((Ack) iklVar.f21366a).msgType));
            arrayMap.put("msg_type", Integer.valueOf(((Ack) iklVar.f21366a).type()));
            arrayMap.put("sub_type", Integer.valueOf(((Ack) iklVar.f21366a).header.g));
            arrayMap.put("type", Integer.valueOf(((Ack) iklVar.f21366a).header.g));
            arrayMap.put(AgooConstants.MESSAGE_BODY, ((Ack) iklVar.f21366a).body);
            arrayMap.put("data", ((Ack) iklVar.f21366a).data);
            arrayMap.put("context", iklVar.n);
            M m = iklVar.f21366a;
            if (((Ack) m).msgType == 9) {
                obj = ((Ack) m).header.n;
                str = "systemExt";
            } else {
                if (n8l.e()) {
                    M m2 = iklVar.f21366a;
                    if (((Ack) m2).msgType == 8 && (dh2Var = (dh2) ((Ack) m2).data) != null) {
                        arrayMap.put(y1r.COL_STREAM, dh2Var.h);
                        str = "stream_seq";
                        obj = dh2Var.i;
                    }
                }
                M m3 = iklVar.f21366a;
                b(((Ack) m3).header.f, ((Ack) m3).statusCode(), arrayMap);
                Integer valueOf = Integer.valueOf(((Ack) iklVar.f21366a).statusCode());
                M m4 = iklVar.f21366a;
                MsgLog.e("CallbackManager", "callback:", valueOf, ((Ack) m4).header.f, "subType:", Integer.valueOf(((Ack) m4).header.g));
            }
            arrayMap.put(str, obj);
            M m32 = iklVar.f21366a;
            b(((Ack) m32).header.f, ((Ack) m32).statusCode(), arrayMap);
            Integer valueOf2 = Integer.valueOf(((Ack) iklVar.f21366a).statusCode());
            M m42 = iklVar.f21366a;
            MsgLog.e("CallbackManager", "callback:", valueOf2, ((Ack) m42).header.f, "subType:", Integer.valueOf(((Ack) m42).header.g));
        }
    }
}
