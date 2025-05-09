package com.taobao.android.searchbaseframe.uikit.screentype;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.weex_framework.a;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.c4p;
import tb.d7r;
import tb.guk;
import tb.k7m;
import tb.pwo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ScreenType implements LifecycleObserver, OnScreenChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SCREEN_TYPE_FOLDABLE_EXPAND = 3;
    public static final int SCREEN_TYPE_PAD_LANDSCAPE = 2;
    public static final int SCREEN_TYPE_PAD_PORTRAIT = 1;
    public static final int SCREEN_TYPE_PHONE_NORMAL = 0;

    /* renamed from: a  reason: collision with root package name */
    public final LifecycleOwner f9348a;
    public final Activity b;
    public int c;
    public List<pwo> d = new LinkedList();
    public boolean e;
    public boolean f;
    public static final Map<Context, ScreenType> g = new HashMap();
    public static final boolean IS_FOLDABLE = TBDeviceUtils.p(Globals.getApplication());
    public static final boolean IS_PAD = TBDeviceUtils.P(Globals.getApplication());

    static {
        t2o.a(993001960);
    }

    public ScreenType(Activity activity) {
        int i;
        this.b = activity;
        if (activity instanceof LifecycleOwner) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) activity;
            this.f9348a = lifecycleOwner;
            lifecycleOwner.getLifecycle().addObserver(this);
        }
        d7r.a(activity);
        int i2 = 0;
        if (IS_PAD || IS_FOLDABLE) {
            TBAutoSizeConfig.x().d0(this);
            boolean T = TBAutoSizeConfig.x().T(activity);
            if (IS_FOLDABLE) {
                this.c = !T ? 3 : i2;
                return;
            }
            if (T) {
                i = 1;
            } else {
                i = 2;
            }
            this.c = i;
            return;
        }
        this.c = 0;
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc97e274", new Object[]{map});
            return;
        }
        String d = d();
        if (!TextUtils.isEmpty(d)) {
            map.put(k7m.KEY_DEVICE_TYPE, d);
        }
    }

    public static ScreenType b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScreenType) ipChange.ipc$dispatch("629c5d7e", new Object[]{context});
        }
        if (!(context instanceof Activity)) {
            return null;
        }
        HashMap hashMap = (HashMap) g;
        ScreenType screenType = (ScreenType) hashMap.get(context);
        if (screenType != null) {
            return screenType;
        }
        ScreenType screenType2 = new ScreenType((Activity) context);
        hashMap.put(context, screenType2);
        return screenType2;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("37b43413", new Object[0]);
        }
        if (IS_FOLDABLE) {
            return "Fold";
        }
        if (IS_PAD) {
            return "Pad";
        }
        return null;
    }

    public static ScreenType g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScreenType) ipChange.ipc$dispatch("c8215a35", new Object[]{context});
        }
        return (ScreenType) ((HashMap) g).get(context);
    }

    public static void k(a aVar) {
        ScreenType g2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9ef0807", new Object[]{aVar});
        } else if (aVar != null && (g2 = g(aVar.getUIContext())) != null) {
            aVar.addInstanceEnv(k7m.KEY_SCREEN_STYLE, h(g2.c()));
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        TBAutoSizeConfig.x().h0(this);
        LifecycleOwner lifecycleOwner = this.f9348a;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
        this.d = null;
        ((HashMap) g).remove(this.b);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.e = false;
        }
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f281b363", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd3967d", new Object[]{this});
            return;
        }
        this.f = false;
        for (pwo pwoVar : new LinkedList(this.d)) {
            pwoVar.w(this.c);
        }
    }

    public void i(pwo pwoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("739034c3", new Object[]{this, pwoVar});
        } else {
            this.d.add(pwoVar);
        }
    }

    public void j(pwo pwoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbe4ee4a", new Object[]{this, pwoVar});
        } else {
            this.d.remove(pwoVar);
        }
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
        guk.a(this, activity, i, configuration);
    }

    public static String h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a341c55c", new Object[]{new Integer(i)});
        }
        if (i == 0) {
            return "normal";
        }
        if (i == 1) {
            return "regular";
        }
        if (i == 2) {
            return "compact";
        }
        if (i != 3) {
            return "";
        }
        return "expand";
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.e = true;
        if (this.f) {
            c4p.D("XS.ScreenType", "page resume, notify previous screen type change", new Object[0]);
            f();
        }
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public void onScreenChanged(int i, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
            return;
        }
        int e = e(i);
        if (e != this.c) {
            this.c = e;
            this.f = true;
            if (this.e) {
                f();
                return;
            }
            c4p.D("XS.ScreenType", "page[" + this.b.getClass().getSimpleName() + "] is not active,do not notify", new Object[0]);
        }
    }

    public final int e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2774d532", new Object[]{this, new Integer(i)})).intValue();
        }
        StringBuilder sb = new StringBuilder("judge screen type: ScreenChangeType=");
        sb.append(i);
        sb.append(", isFoldable=");
        boolean z = IS_FOLDABLE;
        sb.append(z);
        sb.append(", isPad=");
        boolean z2 = IS_PAD;
        sb.append(z2);
        c4p.D("XS.ScreenType", sb.toString(), new Object[0]);
        if (z) {
            return i == 1 ? 0 : 3;
        }
        if (z2) {
            return i == 1 ? 1 : 2;
        }
        return 0;
    }
}
