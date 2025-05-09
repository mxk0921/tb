package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaSystemUtils;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.CodeUsageCounter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class z75 implements zsb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ImageStrategyConfig f32583a;
    public final Activity b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageView f32584a;
        public final /* synthetic */ String b;

        public a(ImageView imageView, String str) {
            this.f32584a = imageView;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ImageView imageView = this.f32584a;
            if (imageView != null) {
                p1m p1mVar = null;
                imageView.setImageDrawable(null);
                if (!TextUtils.isEmpty(this.b)) {
                    String d = z75.this.d(this.f32584a, this.b);
                    if (this.f32584a.getTag() == null) {
                        p1mVar = s0m.B().N0(this.f32584a.getContext()).T(d).setImageStrategyInfo(z75.a(z75.this)).into(this.f32584a);
                    } else if (this.f32584a.getTag() instanceof p1m) {
                        ((p1m) this.f32584a.getTag()).a();
                        s0m.B().N0(this.f32584a.getContext()).T(d).into(this.f32584a);
                    }
                    this.f32584a.setTag(p1mVar);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageView f32585a;
        public final /* synthetic */ int b;

        public b(ImageView imageView, int i) {
            this.f32585a = imageView;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f32585a != null && this.b > 0) {
                s0m.B().T(uuo.r(this.b)).into(this.f32585a);
            }
        }
    }

    static {
        t2o.a(451936262);
        t2o.a(452985036);
    }

    public z75(Activity activity) {
        this.b = activity;
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_adapter_DWImageAdapter);
    }

    public static /* synthetic */ ImageStrategyConfig a(z75 z75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("b6f2a410", new Object[]{z75Var});
        }
        return z75Var.f32583a;
    }

    public String b(ImageView imageView, String str) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4056ee", new Object[]{this, imageView, str});
        }
        ImageStrategyConfig c = c();
        this.f32583a = c;
        if (c == null) {
            return str;
        }
        if (imageView.getLayoutParams() != null) {
            i2 = imageView.getLayoutParams().height;
            i = imageView.getLayoutParams().width;
        } else {
            i2 = imageView.getHeight();
            i = imageView.getWidth();
        }
        if (MediaSystemUtils.isApkDebuggable()) {
            StringBuilder sb = new StringBuilder();
            sb.append("[DWImageAdapter] decideUrl---->url:");
            sb.append(str);
            sb.append("  width:");
            sb.append(i);
            sb.append("  height:");
            sb.append(i2);
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, sb.substring(0));
        }
        return ImageStrategyDecider.decideUrl(str, Integer.valueOf(i), Integer.valueOf(i2), this.f32583a);
    }

    public final ImageStrategyConfig c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("668dda2a", new Object[]{this});
        }
        return ImageStrategyConfig.v(ImageStrategyConfig.WEAPP, 70).i(TaobaoImageUrlStrategy.ImageQuality.q75).a();
    }

    public String d(ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c1ce94e9", new Object[]{this, imageView, str});
        }
        if (imageView == null || TextUtils.isEmpty(str)) {
            return str;
        }
        return b(imageView, str);
    }

    public void e(int i, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de0d0afc", new Object[]{this, new Integer(i), imageView});
        } else {
            this.b.runOnUiThread(new b(imageView, i));
        }
    }

    public void f(String str, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceb73724", new Object[]{this, str, imageView});
        } else {
            this.b.runOnUiThread(new a(imageView, str));
        }
    }
}
