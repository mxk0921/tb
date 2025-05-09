package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rc7 extends ux1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String b;
    public final JSONObject c;
    public final RuntimeAbilityParam[] d;

    static {
        t2o.a(912261315);
    }

    public rc7(String str, JSONObject jSONObject, RuntimeAbilityParam... runtimeAbilityParamArr) {
        this.b = str;
        this.c = jSONObject;
        this.d = runtimeAbilityParamArr;
    }

    public static /* synthetic */ Object ipc$super(rc7 rc7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/bizmessage/DescForwardingMessage");
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
        }
        return null;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cf36e223", new Object[]{this});
        }
        JSONObject jSONObject = this.c;
        if (jSONObject != null) {
            return jSONObject;
        }
        return null;
    }

    public RuntimeAbilityParam[] d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RuntimeAbilityParam[]) ipChange.ipc$dispatch("acaf1455", new Object[]{this});
        }
        return this.d;
    }

    /* renamed from: b  reason: collision with other method in class */
    public String m1123b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        return null;
    }
}
