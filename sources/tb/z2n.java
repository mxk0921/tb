package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.CommonExtKt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class z2n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DISFAVOR_SUCCESS_TYPE = 2;
    public static final int FAVOR_SUCCESS_TYPE = 1;

    /* renamed from: a  reason: collision with root package name */
    public static final Pair<String, String> f32495a = new Pair<>("添加成功，可在首页二楼查看", "还可以在消息中查看频道最新动态");
    public static final String b = "已取消添加";
    public static final String c = "取消添加失败，请重试";
    public static final String d = "添加失败，请重试";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f32499a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ String c;

        public b(View view, Context context, String str) {
            this.f32499a = view;
            this.b = context;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Rect rect = new Rect();
            if (this.f32499a.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.f32499a.getParent()).getGlobalVisibleRect(rect);
            }
            Rect rect2 = new Rect();
            Context context = this.b;
            if (context instanceof Activity) {
                ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
            }
            int i = rect2.top;
            Toast makeText = Toast.makeText(this.b.getApplicationContext(), this.c, 0);
            Point point = new Point();
            View view = makeText.getView();
            if (view != null) {
                ((WindowManager) view.getContext().getApplicationContext().getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getSize(point);
                makeText.getView().setBackgroundResource(R.drawable.tms_pub_favor_toast_background);
                try {
                    ((TextView) makeText.getView().findViewById(16908299)).setTextColor(-1);
                } catch (Exception e) {
                    TMSLogger.c("PubFavorChangeToast", "toast: ", e);
                }
                makeText.setGravity(48, 0, rect.bottom - i);
                makeText.show();
            }
        }
    }

    public static void a(Context context, View view, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1c84c46", new Object[]{context, view, new Integer(i), str});
        } else if ((context instanceof Activity) && !((Activity) context).isFinishing() && view != null) {
            CommonExtKt.n(new a(i, str, context, view));
        }
    }

    public static void b(Context context, View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b825344", new Object[]{context, view, str});
        } else if (view != null && context != null) {
            CommonExtKt.n(new b(view, context, str));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f32496a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ View d;

        /* compiled from: Taobao */
        /* renamed from: tb.z2n$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class View$OnClickListenerC1114a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ PopupWindow f32497a;

            public View$OnClickListenerC1114a(a aVar, PopupWindow popupWindow) {
                this.f32497a = popupWindow;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (this.f32497a.isShowing()) {
                    this.f32497a.dismiss();
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ PopupWindow f32498a;

            public b(PopupWindow popupWindow) {
                this.f32498a = popupWindow;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (this.f32498a.isShowing()) {
                    this.f32498a.dismiss();
                }
            }
        }

        public a(int i, String str, Context context, View view) {
            this.f32496a = i;
            this.b = str;
            this.c = context;
            this.d = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int i = this.f32496a;
            if (i == 1) {
                str = (String) z2n.f32495a.first;
            } else if (i == 2) {
                str = z2n.b + this.b;
            } else {
                return;
            }
            View inflate = View.inflate(this.c, R.layout.tms_pub_favor_change_tips_layout, null);
            ((TextView) inflate.findViewById(R.id.title)).setText(str);
            Display defaultDisplay = ((WindowManager) this.c.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            defaultDisplay.getMetrics(new DisplayMetrics());
            PopupWindow popupWindow = new PopupWindow(this.c);
            popupWindow.setContentView(inflate);
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
            popupWindow.setOutsideTouchable(true);
            popupWindow.setFocusable(false);
            popupWindow.setClippingEnabled(false);
            popupWindow.setHeight(-2);
            popupWindow.setWidth(-2);
            ViewProxy.setOnClickListener(inflate, new View$OnClickListenerC1114a(this, popupWindow));
            try {
                popupWindow.showAtLocation(this.d, 81, 0, displayMetrics.heightPixels / 10);
                CommonExtKt.p(new b(popupWindow), 3000L);
            } catch (Exception e) {
                TMSLogger.c("PubFavorChangeToast", "showFavorSuccessWindow: failed with exception ", e);
            }
        }
    }

    static {
        t2o.a(845152287);
    }
}
