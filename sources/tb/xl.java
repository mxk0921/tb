package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xl extends tin {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final nbb c;

    static {
        t2o.a(81789015);
    }

    public xl(nbb nbbVar, fyc fycVar) {
        super(fycVar);
        this.c = nbbVar;
    }

    public static /* synthetic */ Object ipc$super(xl xlVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/common/render/rax/AURARaxFloatCloseListener");
    }

    @Override // tb.tin
    public boolean b(List<Event> list, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5505cb8", new Object[]{this, list, aURARenderComponent})).booleanValue();
        }
        for (Event event : list) {
            qi qiVar = new qi();
            qiVar.p(event.getId());
            qiVar.t(aURARenderComponent);
            qiVar.n(event.getFields());
            d(qiVar);
            pi.b(this.c, event.getType(), qiVar);
        }
        return true;
    }

    public final void d(qi qiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4987c17", new Object[]{this, qiVar});
            return;
        }
        JSONObject c = qiVar.c();
        if (c == null) {
            c = new JSONObject();
            qiVar.n(c);
        }
        String string = c.getString("option");
        if ("cancel".equals(string) || TextUtils.isEmpty(string)) {
            c.put("isCancel", (Object) Boolean.TRUE);
        }
    }
}
