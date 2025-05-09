package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.concurrent.Callable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class l9l<T> implements Callable<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f23197a;

    static {
        t2o.a(395313328);
    }

    public l9l(Context context, Class<? extends T> cls, String str, String str2, String str3) {
        this.f23197a = context;
    }

    @Override // java.util.concurrent.Callable
    public T call() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6d249ded", new Object[]{this});
        }
        String customConfig = OrangeConfig.getInstance().getCustomConfig("chipset_catalog", null);
        SharedPreferences sharedPreferences = this.f23197a.getSharedPreferences("trtc_chipset_catalog", 0);
        if (customConfig != null) {
            sharedPreferences.edit().putString("config", customConfig).apply();
        } else {
            customConfig = sharedPreferences.getString("config", null);
        }
        if (customConfig == null) {
            return null;
        }
        return (T) JSON.parseObject(customConfig, pr3[].class);
    }
}
