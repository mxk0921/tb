package com.alibaba.ability.impl.screen;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;
import com.alibaba.ability.impl.screen.observer.ScreenOrientationObserver;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsScreenAbility;
import com.taobao.android.abilityidl.ability.ScreenInfoResult;
import com.taobao.android.abilityidl.ability.ScreenSetBrightnessParams;
import java.util.Map;
import tb.a07;
import tb.bnd;
import tb.ckf;
import tb.cnd;
import tb.cvo;
import tb.cwo;
import tb.hfn;
import tb.jdb;
import tb.jvo;
import tb.kdb;
import tb.pg1;
import tb.rvo;
import tb.t2o;
import tb.tao;
import tb.xhv;
import tb.ywo;
import tb.zmd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ScreenAbility extends AbsScreenAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public cwo f2019a;
    public ScreenOrientationObserver b;

    static {
        t2o.a(130023426);
    }

    public static /* synthetic */ Object ipc$super(ScreenAbility screenAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/screen/ScreenAbility");
    }

    public final synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c55054d5", new Object[]{this});
            return;
        }
        cwo cwoVar = this.f2019a;
        if (cwoVar != null) {
            cwoVar.i();
        }
        this.f2019a = null;
    }

    public final synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bb2ab5f", new Object[]{this});
            return;
        }
        ScreenOrientationObserver screenOrientationObserver = this.b;
        if (screenOrientationObserver != null) {
            screenOrientationObserver.e();
        }
        this.b = null;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScreenAbility
    public tao<Integer, ErrorResult> getBrightness(kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("ce07b9b5", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "context");
        Context context = kdbVar.l().getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("Context 为空, 或者 Context 不是 Activity"));
        }
        try {
            return new tao<>(Integer.valueOf(a(activity)), null, 2, null);
        } catch (Exception unused) {
            return new tao<>(null, new ErrorResult("500", "getBrightness 获取失败", (Map) null, 4, (a07) null));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScreenAbility
    public tao<ScreenInfoResult, ErrorResult> getInfo(kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("d13bc338", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "abilityContext");
        Context context = kdbVar.l().getContext();
        if (context == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("Context 为空"));
        }
        DisplayMetrics b = ywo.b(context);
        ScreenInfoResult screenInfoResult = new ScreenInfoResult();
        screenInfoResult.dpr = Double.valueOf(b.density);
        screenInfoResult.width = Integer.valueOf(b.widthPixels);
        screenInfoResult.height = Integer.valueOf(b.heightPixels);
        screenInfoResult.statusBarHeight = Integer.valueOf(ywo.c(context));
        return new tao<>(screenInfoResult, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScreenAbility
    public tao<Integer, ErrorResult> getStatusBarHeight(kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("e892958a", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "abilityContext");
        Context context = kdbVar.l().getContext();
        if (context != null) {
            return new tao<>(Integer.valueOf(ywo.c(context)), null, 2, null);
        }
        return new tao<>(null, ErrorResult.a.Companion.g("Context 为空"));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScreenAbility
    public void keepOn(kdb kdbVar, jvo jvoVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("261bd617", new Object[]{this, kdbVar, jvoVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(jvoVar, "params");
        ckf.g(jdbVar, "callback");
        Context context = kdbVar.l().getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity == null) {
            jdbVar.O(ErrorResult.a.Companion.g("Context 为空, 或者 Context 不是 Activity"));
        } else if (jvoVar.f22242a) {
            activity.getWindow().addFlags(128);
        } else {
            activity.getWindow().clearFlags(128);
        }
    }

    @Override // tb.st, tb.odb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        b();
        c();
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScreenAbility
    public void requestBrightness(kdb kdbVar, zmd zmdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0443c7", new Object[]{this, kdbVar, zmdVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(zmdVar, "events");
        Context context = kdbVar.l().getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            try {
                ScreenSetBrightnessParams screenSetBrightnessParams = new ScreenSetBrightnessParams();
                screenSetBrightnessParams.brightness = Integer.valueOf(a(activity));
                xhv xhvVar = xhv.INSTANCE;
                zmdVar.U0(screenSetBrightnessParams);
            } catch (Exception unused) {
                zmdVar.O(new ErrorResult("500", "getBrightness 获取失败", (Map) null, 4, (a07) null));
            }
        } else {
            zmdVar.O(ErrorResult.a.Companion.g("Context 为空, 或者 Context 不是 Activity"));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScreenAbility
    public void setCaptureEnabled(kdb kdbVar, cvo cvoVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("377eef07", new Object[]{this, kdbVar, cvoVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(cvoVar, "params");
        ckf.g(jdbVar, "callback");
        Context context = kdbVar.l().getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            Boolean bool = cvoVar.f17357a;
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            boolean booleanValue = bool.booleanValue();
            Window window = activity.getWindow();
            ckf.f(window, "activity.window");
            try {
                if (booleanValue) {
                    window.clearFlags(8192);
                } else {
                    window.addFlags(8192);
                }
            } catch (Exception unused) {
                jdbVar.O(new ErrorResult("500", "setCaptureEnabled 设置失败", (Map) null, 4, (a07) null));
            }
        } else {
            jdbVar.O(ErrorResult.a.Companion.g("Context 为空, 或者 Context 不是 Activity"));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScreenAbility
    public void setCaptureEnabledForAndroid(kdb kdbVar, cvo cvoVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f97ea4d", new Object[]{this, kdbVar, cvoVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(cvoVar, "params");
        ckf.g(jdbVar, "callback");
        setCaptureEnabled(kdbVar, cvoVar, jdbVar);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScreenAbility
    public synchronized void setCaptureListener(kdb kdbVar, bnd bndVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1813c59", new Object[]{this, kdbVar, bndVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(bndVar, "events");
        Context context = kdbVar.l().getContext();
        if (context != null) {
            if (this.f2019a == null) {
                ContentResolver contentResolver = context.getContentResolver();
                ckf.f(contentResolver, "context.contentResolver");
                cwo cwoVar = new cwo(contentResolver);
                this.f2019a = cwoVar;
                cwoVar.g(new ScreenAbility$setCaptureListener$1(bndVar));
                cwo cwoVar2 = this.f2019a;
                if (cwoVar2 != null) {
                    cwoVar2.h();
                }
            } else {
                bndVar.O(new ErrorResult("CAPTURE_LISTENER_ALREADY_SET", "已经设置过截屏监听了，请先取消后再重新设置", (Map) null, 4, (a07) null));
            }
            return;
        }
        bndVar.O(ErrorResult.a.Companion.g("Context 为空"));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScreenAbility
    public synchronized void setOrientationListener(kdb kdbVar, cnd cndVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69dab099", new Object[]{this, kdbVar, cndVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(cndVar, "events");
        Context context = kdbVar.l().getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            if (this.b == null) {
                ScreenOrientationObserver screenOrientationObserver = new ScreenOrientationObserver(activity, new ScreenAbility$setOrientationListener$1(cndVar));
                screenOrientationObserver.d();
                xhv xhvVar = xhv.INSTANCE;
                this.b = screenOrientationObserver;
            } else {
                cndVar.O(new ErrorResult("ORIENTATION_LISTENER_ALREADY_SET", (String) null, (Map) null, 6, (a07) null));
            }
            return;
        }
        cndVar.O(ErrorResult.a.Companion.g("Context 为空, 或者 Context 不是 Activity"));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScreenAbility
    public void unsetCaptureListener(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cc76763", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(jdbVar, "callback");
        b();
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScreenAbility
    public void unsetOrientationListener(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("289d60ed", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(jdbVar, "callback");
        c();
    }

    public final int a(Activity activity) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("459c5613", new Object[]{this, activity})).intValue();
        }
        Window window = activity.getWindow();
        ckf.f(window, pg1.ATOM_EXT_window);
        WindowManager.LayoutParams attributes = window.getAttributes();
        Float valueOf = attributes != null ? Float.valueOf(attributes.screenBrightness) : null;
        if (valueOf == null || valueOf.floatValue() < 0.0f) {
            try {
                i = Settings.System.getInt(activity.getContentResolver(), "screen_brightness");
            } catch (Exception unused) {
            }
            valueOf = Float.valueOf(i / 255);
        }
        return (int) (valueOf.floatValue() * 100);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScreenAbility
    public tao<String, ErrorResult> getOrientation(kdb kdbVar) {
        String str;
        Configuration configuration;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("3f106902", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "context");
        Context context = kdbVar.l().getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("Context 为空, 或者 Context 不是 Activity"));
        }
        Resources resources = activity.getResources();
        Integer valueOf = (resources == null || (configuration = resources.getConfiguration()) == null) ? null : Integer.valueOf(configuration.orientation);
        if (valueOf != null && valueOf.intValue() == 2) {
            str = "landscape";
        } else if (valueOf != null && valueOf.intValue() == 1) {
            str = "portrait";
        } else {
            str = "unknown";
        }
        return new tao<>(str, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScreenAbility
    public void setOrientation(kdb kdbVar, rvo rvoVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc4fa2b", new Object[]{this, kdbVar, rvoVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(rvoVar, "params");
        ckf.g(jdbVar, "callback");
        Context context = kdbVar.l().getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            String str = rvoVar.f27641a;
            if (str == null) {
                str = "portrait";
            }
            int hashCode = str.hashCode();
            if (hashCode != -1626174665) {
                if (hashCode != 729267099) {
                    if (hashCode == 1430647483 && str.equals("landscape")) {
                        activity.setRequestedOrientation(0);
                        return;
                    }
                } else if (str.equals("portrait")) {
                    activity.setRequestedOrientation(1);
                    return;
                }
            } else if (str.equals("unspecified")) {
                activity.setRequestedOrientation(-1);
                return;
            }
            jdbVar.O(ErrorResult.a.Companion.g("orientation 为空或值不合法"));
            return;
        }
        jdbVar.O(ErrorResult.a.Companion.g("Context 为空, 或者 Context 不是 Activity"));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScreenAbility
    public void setBrightness(kdb kdbVar, ScreenSetBrightnessParams screenSetBrightnessParams, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb51a039", new Object[]{this, kdbVar, screenSetBrightnessParams, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(screenSetBrightnessParams, "params");
        ckf.g(jdbVar, "callback");
        Context context = kdbVar.l().getContext();
        Integer num = null;
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            Integer num2 = screenSetBrightnessParams.brightness;
            if (num2 != null) {
                int intValue = num2.intValue();
                if (intValue >= 0 && 100 >= intValue) {
                    num = num2;
                }
                if (num != null) {
                    float b = hfn.b(-1.0f, hfn.e(1.0f, num.intValue() / 100.0f));
                    Window window = activity.getWindow();
                    ckf.f(window, "activity.window");
                    try {
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.screenBrightness = b;
                        window.setAttributes(attributes);
                        return;
                    } catch (Exception unused) {
                        jdbVar.O(new ErrorResult("500", "setBrightness 设置失败", (Map) null, 4, (a07) null));
                        return;
                    }
                }
            }
            jdbVar.O(new ErrorResult("INVALID_BRIGHTNESS", "brightness 为空或值不合法", (Map) null, 4, (a07) null));
            return;
        }
        jdbVar.O(ErrorResult.a.Companion.g("Context 为空, 或者 Context 不是 Activity"));
    }
}
