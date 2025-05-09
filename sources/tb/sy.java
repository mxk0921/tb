package tb;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class sy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(708837527);
    }

    public abstract void a(FragmentActivity fragmentActivity, JSONObject jSONObject);

    public abstract String b();

    public abstract String c(FragmentActivity fragmentActivity);

    public abstract void d(String str, JSONObject jSONObject);

    public abstract void e(FragmentActivity fragmentActivity, int i, int i2, Intent intent);

    public void f(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e86940cc", new Object[]{this, fragmentActivity});
        }
    }

    public void g(FragmentActivity fragmentActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61af7535", new Object[]{this, fragmentActivity, str});
        }
    }

    public abstract void h(FragmentActivity fragmentActivity, View view);

    public void i(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef92798b", new Object[]{this, fragmentActivity});
        }
    }

    public void j(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf4569c7", new Object[]{this, fragmentActivity});
        }
    }

    public void k(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd2c1dc", new Object[]{this, fragmentActivity});
        }
    }

    public abstract void l(FragmentActivity fragmentActivity, boolean z);

    public abstract void m(FragmentActivity fragmentActivity);
}
