package tb;

import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xk1 extends k5l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(155189305);
    }

    public static /* synthetic */ Object ipc$super(xk1 xk1Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1883580241) {
            super.j((lcu) objArr[0]);
            return null;
        } else if (hashCode == 185817069) {
            super.p((Intent) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/ultron/trade/event/AutoJumpOpenUrlResultSubscriber");
        }
    }

    @Override // tb.k5l, tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
        } else {
            super.j(lcuVar);
        }
    }

    @Override // tb.k5l
    public void p(Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1357ed", new Object[]{this, intent, new Integer(i)});
        } else if (i != -1 || intent == null) {
            t();
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", (Object) yk1.KEY_STATUS_H5_ASYNC_REQUEST);
            n(this.k, jSONObject);
            super.p(intent, i);
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af32bd5c", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", (Object) "H5Back");
        n(this.k, jSONObject);
        this.c.d().g(this.e);
    }
}
