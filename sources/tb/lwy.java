package tb;

import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IImageAdapter;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class lwy extends TMSBaseLaunchStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements IImageAdapter.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f23619a;
        public final /* synthetic */ lwy b;

        public a(Activity activity, lwy lwyVar) {
            this.f23619a = activity;
            this.b = lwyVar;
        }

        @Override // com.taobao.themis.kernel.adapter.IImageAdapter.a
        public void onImageFinish(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("782fcf9a", new Object[]{this, drawable});
                return;
            }
            Object systemService = this.f23619a.getSystemService("activity");
            if (systemService != null) {
                int launcherLargeIconSize = ((ActivityManager) systemService).getLauncherLargeIconSize();
                Bitmap bitmap = null;
                BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
                if (bitmapDrawable != null) {
                    bitmap = bitmapDrawable.getBitmap();
                }
                if (bitmap != null) {
                    bbs bbsVar = this.b.b;
                    ckf.f(bbsVar, "mInstance");
                    this.f23619a.setTaskDescription(new ActivityManager.TaskDescription(r8s.f(bbsVar), Bitmap.createScaledBitmap(bitmap, launcherLargeIconSize, launcherLargeIconSize, true)));
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        }
    }

    static {
        t2o.a(848297990);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwy(bbs bbsVar, a9s a9sVar) {
        super(bbsVar, a9sVar);
        ckf.g(bbsVar, "instance");
        ckf.g(a9sVar, wzi.LAUNCHER);
    }

    public static /* synthetic */ Object ipc$super(lwy lwyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/uniapp/launch/TMSUpdateTaskDescriptionStep");
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "TMSUpdateTaskDescriptionStep";
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef60dff", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e2985e", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67daaada", new Object[]{this});
            return;
        }
        Activity I = this.b.I();
        ckf.f(I, "mInstance.activity");
        if (this.b.getExtension(yjy.class) == null) {
            i();
            return;
        }
        IImageAdapter iImageAdapter = (IImageAdapter) p8s.b(IImageAdapter.class);
        if (iImageAdapter != null) {
            bbs bbsVar = this.b;
            ckf.f(bbsVar, "mInstance");
            iImageAdapter.loadImage(r8s.e(bbsVar), null, new a(I, this));
        }
        i();
    }
}
