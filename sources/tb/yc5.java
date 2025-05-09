package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class yc5 implements mub {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements OnScreenChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
            guk.a(this, activity, i, configuration);
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public final void onScreenChanged(int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                return;
            }
            ckf.g(configuration, VideoControllerManager.ARRAY_KEY_CONFIGURATION);
            DinamicXEngine.H0(true);
        }
    }

    public yc5() {
        TBAutoSizeConfig.x().d0(a.INSTANCE);
    }

    @Override // tb.mub
    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc1a5af5", new Object[]{this, context})).booleanValue();
        }
        ckf.g(context, "ctx");
        return TBDeviceUtils.P(context);
    }

    @Override // tb.mub
    public boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afe54a44", new Object[]{this, context})).booleanValue();
        }
        ckf.g(context, "ctx");
        return TBDeviceUtils.p(context);
    }

    @Override // tb.mub
    public boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("802a3d16", new Object[]{this, context})).booleanValue();
        }
        ckf.g(context, "ctx");
        return TBAutoSizeConfig.x().T(context);
    }

    @Override // tb.mub
    public String d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ca91a5b", new Object[]{this, context});
        }
        ckf.g(context, "ctx");
        return TBAutoSizeConfig.x().D(context).toString();
    }

    @Override // tb.mub
    public String e(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3980a5e7", new Object[]{this, activity});
        }
        ckf.g(activity, "activity");
        return TBAutoSizeConfig.x().M(activity).toString();
    }

    @Override // tb.mub
    public int f(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba74224a", new Object[]{this, context, new Boolean(z)})).intValue();
        }
        ckf.g(context, "context");
        return d7r.f(context, z);
    }

    @Override // tb.mub
    public float g(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29cfeb43", new Object[]{this, activity})).floatValue();
        }
        ckf.g(activity, "activity");
        return TBAutoSizeConfig.x().A(activity);
    }

    @Override // tb.mub
    public int h(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fbf34b0c", new Object[]{this, activity})).intValue();
        }
        ckf.g(activity, "activity");
        return rhx.a(activity).width();
    }
}
