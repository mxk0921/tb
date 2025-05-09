package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class yra implements mvb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_EVENT_ID = k06.a("uTap");

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f32298a;

    public yra(Context context, ze7 ze7Var) {
        this.f32298a = ze7Var;
    }

    @Override // tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length > 0 && (i = dXRuntimeContext.i()) != null) {
            this.f32298a.b().g(new nb4(i, this.f32298a.b().d()).b((String) objArr[0]), e28.b(objArr, dXRuntimeContext, this.f32298a));
        }
    }

    @Override // tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        }
    }

    static {
        t2o.a(912261759);
        t2o.a(444596616);
    }
}
