package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b5o extends ly1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(404750544);
    }

    public static /* synthetic */ Object ipc$super(b5o b5oVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/node/RequestNode");
    }

    @Override // tb.ly1
    public HashMap<String, Object> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("d2676537", new Object[]{this});
        }
        return null;
    }
}
