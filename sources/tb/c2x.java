package tb;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.dycontainer.BaseWVApiPlugin;
import com.taobao.android.artry.dycontainer.WebViewContainer;
import com.taobao.cameralink.miniapp.MiniAppContainerView;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class c2x {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CAMERA_LINK_VIEW_CONTAINER_KEY = "camera_link_view_container_key";

    /* renamed from: a  reason: collision with root package name */
    public WebViewContainer f16806a;
    public String b = "";
    public WeakReference<Activity> c;
    public WeakReference<MiniAppContainerView> d;
    public uae e;
    public FrameLayout f;

    static {
        t2o.a(394264620);
    }

    public final /* synthetic */ void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5056d69", new Object[]{this});
            return;
        }
        try {
            Activity activity = this.c.get();
            if (activity != null) {
                this.f = new FrameLayout(activity);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                this.d.get().addView(this.f, layoutParams);
                this.f16806a = new WebViewContainer(activity);
                this.d.get().addView(this.f16806a.a(), layoutParams);
                this.f16806a.d(this.b, null);
                this.f16806a.f(this.e);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c63154c", new Object[]{this});
            return;
        }
        try {
            if (this.f16806a != null) {
                this.d.get().removeAllViews();
                this.f16806a.e();
                this.f16806a = null;
                this.f = null;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23bfa284", new Object[]{this, str});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                str = this.b;
            }
            this.b = str;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.a2x
                @Override // java.lang.Runnable
                public final void run() {
                    c2x.this.c();
                }
            });
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("195d10dc", new Object[]{this});
            return;
        }
        try {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.b2x
                @Override // java.lang.Runnable
                public final void run() {
                    c2x.this.d();
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void g(String str, JSONObject jSONObject) {
        String json;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f530a64d", new Object[]{this, str, jSONObject});
            return;
        }
        if (jSONObject == null) {
            json = "";
        } else {
            try {
                json = jSONObject.toString();
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        BaseWVApiPlugin.fireWVEventSafety(str, json, this.f16806a.b());
    }
}
