package tb;

import android.app.Activity;
import android.content.res.Configuration;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class nmz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public OnScreenChangedListener f24835a;
    public final jfr<?> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a implements OnScreenChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onActivityChanged(Activity activity, int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("994f466c", new Object[]{this, activity, new Integer(i), configuration});
                return;
            }
            ckf.g(activity, "activity");
            ckf.g(configuration, VideoControllerManager.ARRAY_KEY_CONFIGURATION);
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onScreenChanged(int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                return;
            }
            ckf.g(configuration, VideoControllerManager.ARRAY_KEY_CONFIGURATION);
            if (i == 1 || i == 2) {
                wfr.INSTANCE.d("ScreenOrientationManager", "Screen orientation changed, refreshing page");
                kfr d = nmz.a(nmz.this).d();
                xb7 xb7Var = (xb7) d.b();
                if (xb7Var != null) {
                    ofr ofrVar = (ofr) d;
                    ofrVar.f((ofr) ofrVar.e(xb7Var));
                }
                nmz.a(nmz.this).a().a("PageRefresh", new JSONObject(), null);
            }
        }
    }

    static {
        t2o.a(440401985);
    }

    public nmz(jfr<?> jfrVar) {
        ckf.g(jfrVar, "context");
        this.b = jfrVar;
        c();
    }

    public static final /* synthetic */ jfr a(nmz nmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfr) ipChange.ipc$dispatch("b8b874bb", new Object[]{nmzVar});
        }
        return nmzVar.b;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        OnScreenChangedListener onScreenChangedListener = this.f24835a;
        if (onScreenChangedListener != null) {
            TBAutoSizeConfig.x().h0(onScreenChangedListener);
        }
        this.f24835a = null;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4cf01ee", new Object[]{this});
            return;
        }
        this.f24835a = new a();
        TBAutoSizeConfig x = TBAutoSizeConfig.x();
        OnScreenChangedListener onScreenChangedListener = this.f24835a;
        ckf.d(onScreenChangedListener);
        x.d0(onScreenChangedListener);
    }
}
