package tb;

import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bd3 extends vcv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String f;

    static {
        t2o.a(479199603);
    }

    public static /* synthetic */ Object ipc$super(bd3 bd3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/view/model/CartRebuildParams");
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this});
        }
        return this.f;
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b780bae9", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void m(StreamRemoteMainResponse streamRemoteMainResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("153898b", new Object[]{this, streamRemoteMainResponse});
        }
    }
}
