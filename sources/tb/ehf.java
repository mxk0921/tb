package tb;

import android.content.Context;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ehf extends ub5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "InteractiveDxAdapter";

    static {
        t2o.a(779092967);
    }

    public static /* synthetic */ Object ipc$super(ehf ehfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/mediaplatform/InteractiveDxAdapter");
    }

    @Override // tb.ub5
    public DXRootView a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("e00af95c", new Object[]{this, context, str});
        }
        return w36.k().a(context, str);
    }

    @Override // tb.ub5
    public void b(Context context, String str, bvb bvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e5ba4c6", new Object[]{this, context, str, bvbVar});
        } else {
            w36.k().b(context, str, bvbVar);
        }
    }

    @Override // tb.ub5
    public void c(long j, mvb mvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f9307d", new Object[]{this, new Long(j), mvbVar});
            return;
        }
        DinamicXEngine j2 = w36.k().j();
        if (j2 != null) {
            j2.W0(j, mvbVar);
        } else {
            Log.e(TAG, "registerHandler, DinamicXEngine released");
        }
    }

    @Override // tb.ub5
    public void d(long j, qub qubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31e964cf", new Object[]{this, new Long(j), qubVar});
            return;
        }
        DinamicXEngine j2 = w36.k().j();
        if (j2 != null) {
            j2.e1(j, qubVar);
        } else {
            Log.e(TAG, "registerWidget, DinamicXEngine released");
        }
    }

    @Override // tb.ub5
    public void e(DXRootView dXRootView, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bbf92c8", new Object[]{this, dXRootView, jSONObject, str});
        } else {
            w36.k().h(dXRootView, jSONObject);
        }
    }
}
