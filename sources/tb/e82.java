package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.bhxbridge.BHXCXXBaseBridge;
import com.taobao.android.ucp.bridge.NativeBroadcast;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e82 extends m02 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ JSONObject b;
    public final /* synthetic */ f82 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e82(f82 f82Var, String str, JSONObject jSONObject) {
        super(str);
        this.c = f82Var;
        this.b = jSONObject;
    }

    public static /* synthetic */ Object ipc$super(e82 e82Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/BehaviX$1");
    }

    @Override // tb.m02
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4134b145", new Object[]{this});
            return;
        }
        BHXCXXBaseBridge.setupBHXCpp();
        NativeBroadcast.sendMessageFromJava(NativeBroadcast.REGISTER_EXTERNAL_CONFIG, this.b, null);
    }
}
