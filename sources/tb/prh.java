package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class prh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792911);
    }

    public static final void a(Activity activity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34d0f732", new Object[]{activity, view});
            return;
        }
        ckf.g(activity, "activity");
        ckf.g(view, "view");
        oxb oxbVar = activity instanceof oxb ? (oxb) activity : null;
        if (oxbVar != null && oxbVar.E1()) {
            view.setBackgroundResource(R.color.tbsearch_main_card_bg_night);
            ((TextView) view.findViewById(R.id.tipTitle)).setTextColor(-1);
            ((TextView) view.findViewById(R.id.tipContent)).setTextColor(-1);
            int i = R.id.expandBtn;
            ((TextView) view.findViewById(i)).setTextColor(-1);
            ((TextView) view.findViewById(i)).setBackgroundResource(R.drawable.tbsearch_rounded_corner_reload_dk);
        }
    }

    public static final void b(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8876fa58", new Object[]{context, view});
            return;
        }
        ckf.g(context, "activity");
        ckf.g(view, "view");
        oxb oxbVar = context instanceof oxb ? (oxb) context : null;
        if (oxbVar == null || !oxbVar.E1()) {
            int parseColor = Color.parseColor("#999999");
            view.setBackgroundColor(-1);
            TextView textView = (TextView) view.findViewById(R.id.tv_loading);
            if (textView != null) {
                textView.setTextColor(parseColor);
                return;
            }
            return;
        }
        view.setBackgroundResource(R.color.tbsearch_main_card_bg_night);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_loading);
        if (textView2 != null) {
            textView2.setTextColor(-1);
        }
    }
}
