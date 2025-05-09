package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IConfigService;
import tb.hfc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wz4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements hfc.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ActivityOptionsCompat f31029a;
        public final /* synthetic */ Bundle b;

        public a(wz4 wz4Var, ActivityOptionsCompat activityOptionsCompat, Bundle bundle) {
            this.f31029a = activityOptionsCompat;
            this.b = bundle;
        }

        @Override // tb.hfc.b
        public /* synthetic */ Fragment a() {
            return null;
        }

        @Override // tb.hfc.b
        public Bundle b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("d234f1f3", new Object[]{this});
            }
            return this.f31029a.toBundle();
        }

        @Override // tb.hfc.b
        public /* synthetic */ boolean c() {
            return false;
        }

        @Override // tb.hfc.b
        public Bundle getExtras() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("66060624", new Object[]{this});
            }
            return this.b;
        }

        @Override // tb.hfc.b
        public /* synthetic */ int getRequestCode() {
            return 0;
        }
    }

    static {
        t2o.a(486539322);
    }

    public final Activity a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("fd2a4a96", new Object[]{this, view});
        }
        Context context = view.getContext();
        while (context != null && !(context instanceof Activity)) {
            boolean z = context instanceof bew;
            if (z) {
                context = ((bew) context).b();
            } else if (z) {
                context = ((bew) context).b();
            } else {
                context = null;
            }
        }
        if (context == null) {
            return null;
        }
        return (Activity) context;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e89be20", new Object[]{this})).intValue();
        }
        Integer b = sue.b();
        if (b == null) {
            return -1;
        }
        return b.intValue();
    }

    public final int c(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cec7b65", new Object[]{this, cfcVar})).intValue();
        }
        IConfigService iConfigService = (IConfigService) cfcVar.a(IConfigService.class);
        if (iConfigService != null) {
            return iConfigService.getIntValue("transitionScore", 40);
        }
        fve.e("CustomAnimationNav", "configService is null.");
        return 40;
    }

    public final boolean e(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d735623", new Object[]{this, cfcVar})).booleanValue();
        }
        int c = c(cfcVar);
        int b = b();
        fve.b("CustomAnimationNav", "isSupportTransition: configScore=" + c + ", deviceScore=" + b);
        if (b >= c) {
            return true;
        }
        return false;
    }

    public boolean d(cfc cfcVar, String str, View view) {
        Activity a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33d6f254", new Object[]{this, cfcVar, str, view})).booleanValue();
        }
        try {
            if (!e(cfcVar) || (a2 = a(view)) == null) {
                return false;
            }
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("image");
            String queryParameter2 = parse.getQueryParameter("transition");
            if (!TextUtils.isEmpty(queryParameter) && TextUtils.equals("scale", queryParameter2)) {
                ViewCompat.setTransitionName(view, "similar_activity_transition");
                s0m.B().T(queryParameter).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, "5401").fetch();
                if (((RecyclerView) view.getParent()).getItemAnimator().isRunning()) {
                    fve.e("CustomAnimationNav", "======= getItemAnimator isRunning =========");
                    ((RecyclerView) view.getParent()).getItemAnimator().endAnimations();
                }
                Bundle bundle = new Bundle();
                bundle.putString("transition", queryParameter2);
                bundle.putString("imageUrl", queryParameter);
                a aVar = new a(this, ActivityOptionsCompat.makeSceneTransitionAnimation(a2, view, "similar_activity_transition"), bundle);
                jve.f(a2, aVar, str + "&wx_mute_loading_indicator=true");
                return true;
            }
            return false;
        } catch (Throwable th) {
            fve.c("CustomAnimationNav", "handleScaleNav error", th);
            return false;
        }
    }
}
