package tb;

import android.content.SharedPreferences;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.badge.BadgeDrawable;
import com.taobao.login4android.api.Login;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class f98 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ fs0 f19114a;

        public a(fs0 fs0Var) {
            this.f19114a = fs0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String userId = Login.getUserId();
            if (userId == null) {
                TLog.loge("tab3edlp", "userId is null");
            }
            if (this.f19114a != null) {
                SharedPreferences.Editor edit = b98.a().getSharedPreferences("ShowPromotionCount", 0).edit();
                long currentTimeMillis = System.currentTimeMillis();
                edit.putLong(userId + this.f19114a.k, currentTimeMillis);
                edit.apply();
            }
        }
    }

    static {
        t2o.a(1032847448);
    }

    public static void b(fs0 fs0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b427fdd5", new Object[]{fs0Var});
        } else {
            uto.a().execute(new a(fs0Var));
        }
    }

    public static void c(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dc79181", new Object[]{new Integer(i), view});
        } else if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.edlp_tab_badge);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(gt9.COLOR_UNFOLLOW_DEFAULT);
            gradientDrawable.setStroke(2, -1);
            float b = ir7.b();
            if (i > 0) {
                if (i < 10) {
                    textView.setText(i + "");
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
                    int i2 = (int) (20.0f * b);
                    layoutParams.width = i2;
                    layoutParams.height = i2;
                    layoutParams.topMargin = (int) (b * 4.6d);
                    layoutParams.gravity = BadgeDrawable.TOP_END;
                    textView.setLayoutParams(layoutParams);
                } else if (i < 99) {
                    textView.setText(i + "");
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView.getLayoutParams();
                    layoutParams2.width = (int) (24.0f * b);
                    layoutParams2.height = (int) (20.0f * b);
                    layoutParams2.topMargin = (int) (b * 5.5d);
                    layoutParams2.gravity = BadgeDrawable.TOP_END;
                    textView.setLayoutParams(layoutParams2);
                    textView.setPadding(10, 0, 10, 0);
                } else {
                    textView.setText("99+");
                    FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) textView.getLayoutParams();
                    layoutParams3.width = -2;
                    layoutParams3.height = (int) (18.0f * b);
                    layoutParams3.topMargin = (int) (b * 4.6d);
                    layoutParams3.gravity = BadgeDrawable.TOP_END;
                    textView.setLayoutParams(layoutParams3);
                    textView.setPadding(12, 0, 12, 0);
                }
                if (i <= 9) {
                    gradientDrawable.setCornerRadius(ir7.a(10.0f));
                    textView.setBackground(gradientDrawable);
                } else {
                    gradientDrawable.setCornerRadius(ir7.a(10.0f));
                    textView.setBackground(gradientDrawable);
                }
                textView.setVisibility(0);
                return;
            }
            textView.setVisibility(4);
        }
    }

    public static boolean a(fs0 fs0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8af5832", new Object[]{fs0Var})).booleanValue();
        }
        String userId = Login.getUserId();
        if (userId == null) {
            TLog.loge("EdlpTabBarActionButtonProvider", "userId is null");
        }
        if (fs0Var == null) {
            return false;
        }
        SharedPreferences sharedPreferences = b98.a().getSharedPreferences("ShowPromotionCount", 0);
        long j = sharedPreferences.getLong(userId + fs0Var.k, 0L);
        long currentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return !simpleDateFormat.format(new Date(currentTimeMillis)).equals(simpleDateFormat.format(new Date(j)));
    }
}
