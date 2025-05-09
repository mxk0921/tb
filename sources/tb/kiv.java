package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class kiv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAB2_TOAST_IMG_URL = "https://img.alicdn.com/imgextra/i3/O1CN01390Bje2AIxAk3X9f5_!!6000000008181-2-tps-60-60.png";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f22696a;
        public final /* synthetic */ TUrlImageView b;
        public final /* synthetic */ TextView c;
        public final /* synthetic */ float d;

        public a(boolean z, TUrlImageView tUrlImageView, TextView textView, float f) {
            this.f22696a = z;
            this.b = tUrlImageView;
            this.c = textView;
            this.d = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f22696a) {
                this.b.setImageUrl(kiv.TAB2_TOAST_IMG_URL);
            } else {
                ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.leftMargin += (int) ((this.d * 10.0f) + 0.5f);
                    this.c.setLayoutParams(marginLayoutParams);
                }
                this.b.setVisibility(8);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PopupWindow f22697a;

        public b(PopupWindow popupWindow) {
            this.f22697a = popupWindow;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f22697a.dismiss();
            }
        }
    }

    static {
        t2o.a(806355865);
    }

    public static void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9b34573", new Object[]{context, str, new Boolean(z)});
        } else if (!TextUtils.isEmpty(str) && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            if (!activity.isFinishing()) {
                View inflate = LayoutInflater.from(context).inflate(R.layout.taolive_tab2_favor_toast_view, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(R.id.tab2_toast_text);
                textView.setText(str);
                float f = context.getResources().getDisplayMetrics().density;
                inflate.post(new a(z, (TUrlImageView) inflate.findViewById(R.id.tab2_toast_image), textView, f));
                PopupWindow popupWindow = new PopupWindow(inflate, -2, -2);
                popupWindow.setAnimationStyle(R.style.ToastAnimation);
                popupWindow.showAtLocation(activity.getWindow().getDecorView(), 80, 0, (int) ((f * 75.0f) + 0.5f));
                new Handler().postDelayed(new b(popupWindow), 2600L);
            }
        }
    }

    public static void b(Context context, View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da15567b", new Object[]{context, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (view != null && context != null) {
            Toast toast = new Toast(context.getApplicationContext());
            toast.setDuration(i);
            toast.setView(view);
            toast.setGravity(i2, i3, i4);
            try {
                toast.show();
            } catch (Exception unused) {
            }
        }
    }

    public static void c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1b2e41", new Object[]{context, str});
        } else {
            d(context, str, 0);
        }
    }

    public static void d(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("994b0ce2", new Object[]{context, str, new Integer(i)});
        } else if (!TextUtils.isEmpty(str) && context != null) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.taolive_favor_toast_view, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(R.id.fellow_favor_tv);
            textView.setText(str);
            if (qvs.f0()) {
                textView.setPadding(1, 0, 1, 0);
            }
            b(context, inflate, i, 17, 0, 0);
        }
    }
}
