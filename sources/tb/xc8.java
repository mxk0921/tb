package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xc8 extends r9g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705483);
    }

    public static /* synthetic */ Object ipc$super(xc8 xc8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/framework/container/EmptyPlugin");
    }

    @Override // tb.r9g
    public void Y(h8g h8gVar, y7g y7gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862c830", new Object[]{this, h8gVar, y7gVar});
        }
    }

    @Override // tb.r9g
    public void Z(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1b1d9fa", new Object[]{this, jSONObject});
        }
    }

    @Override // tb.x9e
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e60ebdf", new Object[]{this})).intValue();
        }
        return R.layout.layout_plugin_empty;
    }
}
