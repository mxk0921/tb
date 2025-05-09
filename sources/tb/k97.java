package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.base.weex.ContainerError;
import com.taobao.android.detail2.core.framework.base.weex.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class k97 implements qtk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321733);
        t2o.a(352321752);
        t2o.a(352321758);
    }

    @Override // tb.qtk
    public void a(a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ab357c9", new Object[]{this, aVar, str, str2});
        }
    }

    @Override // tb.qtk
    public void b(a aVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609ae9fe", new Object[]{this, aVar, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.qtk
    public void c(a aVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc9eb57", new Object[]{this, aVar, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.qtk
    public void d(a aVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6430871", new Object[]{this, aVar, view});
        }
    }

    @Override // tb.qtk
    public void e(a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f7accc7", new Object[]{this, aVar, str, str2});
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d083db97", new Object[]{this});
        }
    }

    public void g(a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f8b7f51", new Object[]{this, aVar, jSONObject});
        }
    }

    public void h(a aVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f50e29b", new Object[]{this, aVar, str, jSONObject});
        }
    }

    public void i(a aVar, ContainerError containerError, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e94c61", new Object[]{this, aVar, containerError, str});
        }
    }
}
