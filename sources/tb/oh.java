package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.List;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class oh extends ph {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_URULETAP = 7023701163946200378L;

    static {
        t2o.a(81789050);
    }

    public static /* synthetic */ Object ipc$super(oh ohVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -929276007) {
            return new Boolean(super.c((qi) objArr[0], (nbb) objArr[1]));
        }
        if (hashCode == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/taobao/adapter/extension/event/AURADXURulesTapEventHandler");
    }

    @Override // tb.ph, tb.ts
    public boolean c(qi qiVar, nbb nbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c89c5f99", new Object[]{this, qiVar, nbbVar})).booleanValue();
        }
        qi qiVar2 = new qi(qiVar);
        k(qiVar2);
        b("adjustRules", qiVar2, nbbVar);
        return super.c(qiVar, nbbVar);
    }

    public final void k(qi qiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee239d86", new Object[]{this, qiVar});
            return;
        }
        String m = m(qiVar.a());
        JSONObject c = qiVar.c();
        if (c == null) {
            c = new JSONObject();
            qiVar.n(c);
        }
        c.put("actionType", (Object) m);
    }

    public final Object l(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7a2f357", new Object[]{this, objArr});
        }
        List<String> b = gio.b();
        for (Object obj : objArr) {
            if (b.contains(obj)) {
                return obj;
            }
        }
        return null;
    }

    @Override // tb.ph, tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    public final String m(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a8a4dc62", new Object[]{this, objArr});
        }
        if (objArr == null || objArr.length < 2) {
            ck.g().f("getRuleType#", ck.b.b().l("AURADXURulesTapEventHandler").a());
            return null;
        }
        Object l = l(objArr);
        if (l instanceof String) {
            return (String) l;
        }
        ck.g().f("getRuleType#args[1] is not string type", ck.b.b().l("AURADXURulesTapEventHandler").f("ruleType", l).a());
        return null;
    }
}
