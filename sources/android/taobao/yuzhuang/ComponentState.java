package android.taobao.yuzhuang;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import tb.t2o;
import tb.xc4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ComponentState implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(775946273);
    }

    public static boolean hasRecovered(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("412bca3c", new Object[]{context})).booleanValue();
        }
        return xc4.a(context);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else if (!hasRecovered(application)) {
            xc4.e(application, hashMap);
            xc4.d(application);
        }
    }
}
