package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class amh extends esh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final HashMap<String, String> j;
    public static final HashMap<String, String> k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792906);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public static final void e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c94ffd3", new Object[]{view});
        }
    }

    public static final void h(LottieAnimationView lottieAnimationView, kkh kkhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cedd451f", new Object[]{lottieAnimationView, kkhVar});
        } else {
            lottieAnimationView.playAnimation();
        }
    }

    public static /* synthetic */ Object ipc$super(amh amhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/refactor/state/LottieStateView");
    }

    public final String Y() {
        oxb oxbVar;
        HashMap<String, String> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("222c9c9f", new Object[]{this});
        }
        Activity activity = this.c;
        if (activity instanceof oxb) {
            oxbVar = (oxb) activity;
        } else {
            oxbVar = null;
        }
        if (oxbVar == null || !oxbVar.E1()) {
            hashMap = j;
        } else {
            hashMap = k;
        }
        String str = hashMap.get(P().J().getTab());
        if (TextUtils.isEmpty(str)) {
            str = hashMap.get("all");
        }
        ckf.d(str);
        return str;
    }

    @Override // tb.esh
    public void showLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        View inflate = LayoutInflater.from(S().getContext()).inflate(R.layout.sf_tbsearch_ms_skeleton_loading, (ViewGroup) S(), false);
        inflate.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_IGNORE);
        ViewProxy.setOnClickListener(inflate, new View.OnClickListener() { // from class: tb.mbz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                amh.e(view);
            }
        });
        S().addView(inflate);
        Q();
        Activity activity = this.c;
        ckf.f(activity, "mActivity");
        prh.b(activity, inflate);
        final LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate.findViewById(R.id.lottie_view);
        hgw.a(lottieAnimationView);
        lottieAnimationView.setRepeatMode(1);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.setScaleType(ImageView.ScaleType.FIT_XY);
        lottieAnimationView.setImageAssetsFolder("");
        lottieAnimationView.addLottieOnCompositionLoadedListener(new ulh() { // from class: tb.nbz
            @Override // tb.ulh
            public final void onCompositionLoaded(kkh kkhVar) {
                amh.h(LottieAnimationView.this, kkhVar);
            }
        });
        lottieAnimationView.setAnimationFromUrl(Y());
    }

    static {
        t2o.a(815792905);
        HashMap<String, String> hashMap = new HashMap<>();
        j = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        k = hashMap2;
        hashMap.put("all", "https://g.alicdn.com/ani-assets/7c9dc9371773250d314c11c1ff7e5e9e/0.0.1/lottie.json");
        hashMap2.put("all", "https://g.alicdn.com/ani-assets/fb3661d329c8e1fc3536a45fa5451d08/0.0.1/lottie.json");
        hashMap.put("live", "https://g.alicdn.com/eva-assets/76b59e1aba5b289c96a5afacf982bcec/0.0.1/tmp/7da68bc/7da68bc.json");
        hashMap2.put("live", "https://g.alicdn.com/eva-assets/6d5403bb789609d3f1404c24ef68be72/0.0.1/tmp/f7a0555/f7a0555.json");
        hashMap.put("shop", "https://g.alicdn.com/eva-assets/8ad7bbf31586541caefd1426f0580920/0.0.1/tmp/3a89e48/3a89e48.json");
        hashMap2.put("shop", "https://g.alicdn.com/eva-assets/9af6bbd3fd859127424cae4fecc0393f/0.0.1/tmp/a18dc57/a18dc57.json");
        hashMap.put("tbexperience", "https://g.alicdn.com/eva-assets/957822826ed1033557321a20d97c8321/0.0.1/tmp/62ec4d1/62ec4d1.json");
        hashMap2.put("tbexperience", "https://g.alicdn.com/eva-assets/a6ffde41881944ba5f731e51de2171f1/0.0.1/tmp/53bef61/53bef61.json");
    }
}
