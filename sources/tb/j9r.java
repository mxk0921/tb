package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.helper.RequestConfig;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class j9r extends rn0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Activity c;

    static {
        t2o.a(708837458);
    }

    public j9r(Activity activity) {
        super(activity);
        this.c = activity;
    }

    public static /* synthetic */ Object ipc$super(j9r j9rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/config/TBBuyQueryConfig");
    }

    @Override // tb.rn0
    public Map<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7a812bd7", new Object[]{this});
        }
        return null;
    }

    @Override // tb.rn0
    public Map<String, String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2812908d", new Object[]{this});
        }
        return RequestConfig.e(this.c);
    }
}
