package tb;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.binder.BitmapBinder;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class upz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352322026);
    }

    public static tpz a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tpz) ipChange.ipc$dispatch("ac257f40", new Object[0]);
        }
        return new tpz();
    }

    public static tpz b(aqz aqzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tpz) ipChange.ipc$dispatch("b36c8f97", new Object[]{aqzVar});
        }
        tpz tpzVar = aqzVar.k;
        if (tpzVar == null) {
            return a().f();
        }
        return tpzVar;
    }

    public static void c(Bundle bundle, tpz tpzVar) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2d5840", new Object[]{bundle, tpzVar});
            return;
        }
        IBinder binder = bundle.getBinder("view_screenshot");
        if ((binder instanceof BitmapBinder) && (bitmap = ((BitmapBinder) binder).getBitmap()) != null) {
            tpzVar.e = new WeakReference<>(bitmap);
        }
    }

    public static void d(Intent intent, Bundle bundle, tpz tpzVar) {
        Bundle bundleExtra;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5ed8893", new Object[]{intent, bundle, tpzVar});
        } else if (intent != null && tpzVar != null && (bundleExtra = intent.getBundleExtra("nav_animation_extra")) != null) {
            tpzVar.f28877a = bundleExtra.getFloat("view_screen_start_x", -1.0f);
            tpzVar.b = bundleExtra.getFloat("view_screen_start_y", -1.0f);
            tpzVar.c = bundleExtra.getFloat("view_height", -1.0f);
            tpzVar.d = bundleExtra.getFloat("view_width", -1.0f);
            c(bundleExtra, tpzVar);
        }
    }
}
