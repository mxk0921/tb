package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class q5q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, f5q> f26527a = new HashMap<>();

    static {
        t2o.a(295699775);
    }

    public void a(String str, DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        f5q f5qVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4c60d83", new Object[]{this, str, dXEvent, objArr, dXRuntimeContext});
        } else if (!TextUtils.isEmpty(str) && (f5qVar = this.f26527a.get(str)) != null) {
            f5qVar.a(dXEvent, objArr, dXRuntimeContext);
        }
    }

    public void b(String str, f5q f5qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c8f8797", new Object[]{this, str, f5qVar});
        } else if (!TextUtils.isEmpty(str) && f5qVar != null) {
            this.f26527a.put(str, f5qVar);
        }
    }
}
