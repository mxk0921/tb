package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.minivideo.MiniVideoType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d8n extends ux1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912261328);
    }

    public static /* synthetic */ Object ipc$super(d8n d8nVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/bizmessage/QueryMsgIsMiniVideoActive");
    }

    public MiniVideoType e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MiniVideoType) ipChange.ipc$dispatch("60aaa2b6", new Object[]{this});
        }
        return null;
    }
}
