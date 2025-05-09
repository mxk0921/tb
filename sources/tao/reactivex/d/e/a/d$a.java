package tao.reactivex.d.e.a;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.tzx;
import tb.vxx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public enum d$a implements vxx<tzx> {
    INSTANCE;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(d$a d_a, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/e/a/d$a");
    }

    public static d$a valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("5c5b75c9", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(d$a.class, str);
        }
        return (d$a) valueOf;
    }

    public void a(tzx tzxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faddc9bb", new Object[]{this, tzxVar});
        } else {
            tzxVar.a(Long.MAX_VALUE);
        }
    }

    @Override // tb.vxx
    public /* synthetic */ void accept(tzx tzxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b028bfab", new Object[]{this, tzxVar});
        } else {
            a(tzxVar);
        }
    }
}
