package tb;

import android.util.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vei extends LruCache<String, rgi> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(774897924);
    }

    public vei(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(vei veiVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobaoavsdk/recycle/MediaLivePlayerLruCache");
    }

    /* renamed from: a */
    public final rgi create(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgi) ipChange.ipc$dispatch("9a474efb", new Object[]{this, str});
        }
        return wei.n().b(str);
    }

    /* renamed from: b */
    public final void entryRemoved(boolean z, String str, rgi rgiVar, rgi rgiVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e23c5f8d", new Object[]{this, new Boolean(z), str, rgiVar, rgiVar2});
        } else {
            wei.n().c(z, str, rgiVar);
        }
    }

    /* renamed from: c */
    public final int sizeOf(String str, rgi rgiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e6f864e", new Object[]{this, str, rgiVar})).intValue();
        }
        return 1;
    }
}
