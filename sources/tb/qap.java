package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qap {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static qap b;

    /* renamed from: a  reason: collision with root package name */
    public ekc f26636a;

    static {
        t2o.a(708837405);
    }

    public static qap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qap) ipChange.ipc$dispatch("74c227f1", new Object[0]);
        }
        if (b == null) {
            synchronized (qap.class) {
                try {
                    if (b == null) {
                        b = new qap();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0d5b613", new Object[]{this})).booleanValue();
        }
        ekc ekcVar = this.f26636a;
        if (ekcVar != null) {
            return ((fog) ekcVar).f("goBack", new JSONObject());
        }
        return true;
    }

    public void c(ekc ekcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66742a1a", new Object[]{this, ekcVar});
        } else {
            this.f26636a = ekcVar;
        }
    }
}
