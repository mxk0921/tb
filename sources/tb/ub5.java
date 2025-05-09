package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class ub5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356571);
    }

    public abstract DXRootView a(Context context, String str);

    public void b(Context context, String str, bvb bvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e5ba4c6", new Object[]{this, context, str, bvbVar});
        }
    }

    public void c(long j, mvb mvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f9307d", new Object[]{this, new Long(j), mvbVar});
        }
    }

    public void d(long j, qub qubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31e964cf", new Object[]{this, new Long(j), qubVar});
        }
    }

    public abstract void e(DXRootView dXRootView, JSONObject jSONObject, String str);
}
