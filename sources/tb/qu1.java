package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import java.util.HashSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class qu1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f26932a = "BaseFaceDetector";
    public final HashSet<Integer> b = new HashSet<>();
    public utm c;

    static {
        t2o.a(481296935);
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76ce7722", new Object[]{this})).booleanValue();
        }
        return this.b.isEmpty();
    }

    public void b(int i, Bitmap bitmap, g5c g5cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2feac3", new Object[]{this, new Integer(i), bitmap, g5cVar});
        } else {
            ckf.g(bitmap, IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP);
        }
    }

    public final utm c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (utm) ipChange.ipc$dispatch("b3a321b7", new Object[]{this});
        }
        return this.c;
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e4fa23a", new Object[]{this, new Integer(i)});
            return;
        }
        agh.r(hx8.SCENE, this.f26932a, ckf.p("Preparing model ", Integer.valueOf(i)));
        this.b.add(Integer.valueOf(i));
    }

    public void e(utm utmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85ebd9e4", new Object[]{this, utmVar});
            return;
        }
        ckf.g(utmVar, "prepareResultCallback");
        this.c = utmVar;
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7364fd3a", new Object[]{this, new Integer(i)});
            return;
        }
        agh.r(hx8.SCENE, this.f26932a, ckf.p("releaseModel ", Integer.valueOf(i)));
        this.b.remove(Integer.valueOf(i));
    }

    public final void g(utm utmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("281592d9", new Object[]{this, utmVar});
        } else {
            this.c = utmVar;
        }
    }

    public void h(utm utmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b472ab", new Object[]{this, utmVar});
            return;
        }
        ckf.g(utmVar, "prepareResultCallback");
        if (ckf.b(this.c, utmVar)) {
            this.c = null;
        }
    }
}
