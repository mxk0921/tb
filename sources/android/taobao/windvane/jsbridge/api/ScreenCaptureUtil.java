package android.taobao.windvane.jsbridge.api;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import tb.itw;
import tb.opw;
import tb.t2o;
import tb.voe;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ScreenCaptureUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class BackFragment extends Fragment {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(989856243);
        }

        public static /* synthetic */ Object ipc$super(BackFragment backFragment, String str, Object... objArr) {
            if (str.hashCode() == 1257714799) {
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/api/ScreenCaptureUtil$BackFragment");
        }

        @Override // android.app.Fragment
        public void onActivityResult(int i, int i2, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            } else {
                super.onActivityResult(i, i2, intent);
            }
        }
    }

    static {
        t2o.a(989856242);
    }

    public static long a(View view, boolean z, long j, long j2, long j3, boolean z2) throws IOException {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b804d213", new Object[]{view, new Boolean(z), new Long(j), new Long(j2), new Long(j3), new Boolean(z2)})).longValue();
        }
        Bitmap c = c(view);
        if (c != null) {
            opw.e().b(true);
            if (z2) {
                bitmap = voe.k(c, j2, j3);
            } else {
                bitmap = c;
            }
            long e = itw.e(bitmap);
            if (!z) {
                return e;
            }
            voe.e(view.getContext(), c);
            return e;
        }
        throw new RuntimeException("can't get bitmap from the view");
    }

    public static long b(Activity activity, boolean z, long j, long j2, long j3, boolean z2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4e528f8", new Object[]{activity, new Boolean(z), new Long(j), new Long(j2), new Long(j3), new Boolean(z2)})).longValue();
        }
        activity.getWindow().getDecorView().setDrawingCacheEnabled(true);
        Bitmap drawingCache = activity.getWindow().getDecorView().getDrawingCache();
        if (drawingCache != null) {
            opw.e().b(true);
            if (z2) {
                drawingCache = voe.k(drawingCache, j2, j3);
            }
            long e = itw.e(drawingCache);
            if (!z) {
                return e;
            }
            voe.e(activity, drawingCache);
            return e;
        }
        throw new RuntimeException("can't get bitmap from the view");
    }

    public static Bitmap c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("df37ab95", new Object[]{view});
        }
        view.setDrawingCacheEnabled(true);
        view.destroyDrawingCache();
        view.buildDrawingCache();
        return view.getDrawingCache();
    }
}
