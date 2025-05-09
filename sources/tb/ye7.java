package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.TBOrderDetailActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ye7 implements brb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TBOrderDetailActivity f32019a;

    static {
        t2o.a(713031973);
        t2o.a(614465608);
    }

    public ye7(TBOrderDetailActivity tBOrderDetailActivity) {
        this.f32019a = tBOrderDetailActivity;
    }

    @Override // tb.brb
    public void a(View view, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54e405cb", new Object[]{this, view, new Integer(i), str});
        }
    }

    @Override // tb.brb
    public void c(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91cfdf99", new Object[]{this, view, new Boolean(z)});
        }
    }

    @Override // tb.brb
    public void d(View view, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f221", new Object[]{this, view, new Integer(i), str});
        }
    }

    @Override // tb.brb
    public ViewGroup f(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("20dc6cb9", new Object[]{this, view});
        }
        return null;
    }

    @Override // tb.brb
    public LinearLayout g(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("1c8bb1c7", new Object[]{this, view});
        }
        return null;
    }

    @Override // tb.brb
    public ViewGroup h(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("23a09fc8", new Object[]{this, view});
        }
        return null;
    }

    @Override // tb.brb
    public RecyclerView i(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("7c42c9a5", new Object[]{this, view});
        }
        return null;
    }

    @Override // tb.brb
    public View j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("cc1d2d6c", new Object[]{this, context});
        }
        return null;
    }

    @Override // tb.brb
    public LinearLayout k(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("9de0ab79", new Object[]{this, view});
        }
        return null;
    }

    @Override // tb.brb
    public void l(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c662229b", new Object[]{this, jSONObject});
            return;
        }
        TBOrderDetailActivity tBOrderDetailActivity = this.f32019a;
        if (tBOrderDetailActivity != null) {
            tBOrderDetailActivity.e4(jSONObject);
        }
    }

    @Override // tb.brb
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        }
    }
}
