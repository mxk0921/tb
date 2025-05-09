package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.AVSDKLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class h85 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final DWContext f20465a;
    public final FrameLayout b;

    static {
        t2o.a(452985095);
    }

    public h85(DWContext dWContext) {
        this.f20465a = dWContext;
        this.b = new FrameLayout(dWContext.getActivity());
    }

    public void a(View view, FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89eba158", new Object[]{this, view, layoutParams});
            return;
        }
        ige ictAddWeexCallback = this.f20465a.getIctAddWeexCallback();
        if (ictAddWeexCallback == null) {
            this.b.addView(view, layoutParams);
            return;
        }
        String str = (String) view.getTag(R.id.weex_view_source);
        String str2 = (String) view.getTag(R.id.target_screen_type);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str = "";
            str2 = str;
        }
        if (!ictAddWeexCallback.a(view, str, str2)) {
            try {
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
            } catch (Throwable th) {
                AVSDKLog.e("DWInteractiveView", th.toString());
            }
            if (view.getParent() == null) {
                this.b.addView(view, layoutParams);
            }
        }
    }

    public void b(View view, FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d66eaf47", new Object[]{this, view, layoutParams});
        } else {
            this.b.addView(view, layoutParams);
        }
    }

    public View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.b;
    }
}
