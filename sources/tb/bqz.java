package tb;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.binder.BitmapBinder;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bqz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352322033);
    }

    public static aqz a(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aqz) ipChange.ipc$dispatch("ff0e6eda", new Object[]{str, view});
        }
        return new aqz(str, view);
    }

    public static aqz b(String str, View view, Intent intent, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aqz) ipChange.ipc$dispatch("9a0b9629", new Object[]{str, view, intent, bundle});
        }
        aqz a2 = a(str, view);
        d(intent, bundle, a2);
        return a2;
    }

    public static aqz c(aqz aqzVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aqz) ipChange.ipc$dispatch("525d22f5", new Object[]{aqzVar, view});
        }
        if (view == null) {
            view = new FrameLayout(Globals.getApplication());
        }
        if (aqzVar == null) {
            return a("UnknownPage", view).h();
        }
        return aqzVar;
    }

    public static void e(Intent intent, Bundle bundle, aqz aqzVar) {
        IBinder iBinder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cb22cb7", new Object[]{intent, bundle, aqzVar});
            return;
        }
        aqzVar.h = intent.getBooleanExtra("extraEnablePageSnapshot", false);
        aqzVar.i = intent.getBooleanExtra("extraPageForDecorView", false);
        if (bundle == null) {
            iBinder = null;
        } else {
            iBinder = bundle.getBinder("extraPageSnapshotBinder");
        }
        if (iBinder instanceof BitmapBinder) {
            aqzVar.j = (BitmapBinder) iBinder;
        }
    }

    public static void d(Intent intent, Bundle bundle, aqz aqzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66650772", new Object[]{intent, bundle, aqzVar});
        } else if (intent != null && aqzVar != null) {
            if (bundle == null) {
                bundle = intent.getExtras();
            }
            boolean booleanExtra = intent.getBooleanExtra("extraEnableDragBackAnim", false);
            aqzVar.g = booleanExtra;
            if (booleanExtra) {
                e(intent, bundle, aqzVar);
            }
            if (aqzVar.k == null) {
                tpz a2 = upz.a();
                upz.d(intent, bundle, a2);
                aqzVar.k = a2;
            }
            if (aqzVar.n == null) {
                rpz a3 = spz.a();
                spz.d(a3);
                aqzVar.n = a3;
            }
            if (aqzVar.m == null) {
                aqzVar.m = wpz.a(aqzVar.b());
            }
            if (aqzVar.o == null) {
                String a1 = byj.a1(aqzVar.b());
                txj.e("ParamsFactory无极缩放", "动画Orange参数解析。bizCode:" + aqzVar.b() + " animOrangeConfigStr:" + a1);
                if (!TextUtils.isEmpty(a1)) {
                    try {
                        aqzVar.o = JSON.parseObject(a1);
                    } catch (Exception e) {
                        txj.f("ParamsFactory无极缩放", "动画Orange参数解析失败。animOrangeConfigStr:" + a1, e);
                    }
                }
            }
        }
    }
}
