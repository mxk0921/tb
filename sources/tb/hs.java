package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class hs extends zs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81789140);
    }

    public static /* synthetic */ Object ipc$super(hs hsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/linkage/service/extension/AbsAURAAdjustDataExtension");
    }

    public abstract void L(JSONObject jSONObject);
}
