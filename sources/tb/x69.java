package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.taobao.TBActionBar;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.festival.GloblaNavUIConfig;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class x69 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(708837617);
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af3da4c5", new Object[]{context})).intValue();
        }
        return FestivalMgr.i().h(GloblaNavUIConfig.KEY_GLOBAL_ACTIONBAR_TEXT_COLOR, b24.e("#333333", 3355443));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("963da6ae", new Object[0])).booleanValue();
        }
        return FestivalMgr.i().v("global");
    }

    public static void c(Activity activity, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12185fed", new Object[]{activity, new Integer(i), new Integer(i2)});
            return;
        }
        View view = (View) dhw.a(activity, i, View.class);
        TextView textView = (TextView) dhw.a(activity, i2, TextView.class);
        if (view != null) {
            FestivalMgr.i().E(activity, view, TBActionBar.ActionBarStyle.NORMAL);
            if (!b()) {
                view.setBackgroundColor(-855310);
            }
        }
        if (textView != null && b()) {
            textView.setTextColor(a(activity));
            Drawable drawable = activity.getResources().getDrawable(R.drawable.purchase_action_bar_back_light);
            int i3 = (int) (activity.getResources().getDisplayMetrics().density * 24.0f);
            if (drawable != null) {
                drawable.setBounds(0, 0, i3, i3);
                textView.setCompoundDrawables(drawable, null, null, null);
            }
        }
    }
}
