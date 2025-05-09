package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.media.DWViewUtil;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class uli {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CHILD_TYPE_ALARM = 1002;
    public static final int CHILD_TYPE_SHARE = 1001;

    /* renamed from: a  reason: collision with root package name */
    public final Context f29465a;
    public LinearLayout b;
    public c c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            uli.this.c();
            uli.a(uli.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            uli.this.c();
            if (uli.b(uli.this) != null) {
                uli.b(uli.this).onClick();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
        void onClick();
    }

    static {
        t2o.a(452985176);
    }

    public uli(Context context, DWContext dWContext) {
        this.f29465a = context;
        DWViewUtil.dip2px(context, 187.0f);
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_sdk_MenuWindow);
    }

    public static /* synthetic */ void a(uli uliVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a38d84", new Object[]{uliVar});
        } else {
            uliVar.g();
        }
    }

    public static /* synthetic */ c b(uli uliVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("5daeacfd", new Object[]{uliVar});
        }
        return uliVar.c;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.b;
        if (linearLayout != null) {
            linearLayout.setVisibility(4);
        }
    }

    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.b;
    }

    public void f(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2726fe6", new Object[]{this, cVar});
        } else {
            this.c = cVar;
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1a1cce6", new Object[]{this});
        }
    }

    public void e(ArrayList<Integer> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18ee47d4", new Object[]{this, arrayList});
        } else if (arrayList != null && !arrayList.isEmpty()) {
            LinearLayout linearLayout = new LinearLayout(this.f29465a);
            this.b = linearLayout;
            linearLayout.setBackgroundResource(R.drawable.hiv_menu_window_bg);
            this.b.setOrientation(1);
            ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, DWViewUtil.dip2px(this.f29465a, 48.0f));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(DWViewUtil.dip2px(this.f29465a, 125.0f), 1);
            layoutParams2.setMargins(DWViewUtil.dip2px(this.f29465a, 36.0f), 0, 0, 0);
            for (int i = 0; i < arrayList.size(); i++) {
                DWViewUtil.dip2px(this.f29465a, 48.0f);
                LinearLayout linearLayout2 = new LinearLayout(this.f29465a);
                linearLayout2.setOrientation(0);
                ImageView imageView = new ImageView(this.f29465a);
                TextView textView = new TextView(this.f29465a);
                int intValue = arrayList.get(i).intValue();
                if (intValue == 1001) {
                    imageView.setImageDrawable(ContextCompat.getDrawable(this.f29465a, R.drawable.hiv_share_icon));
                    textView.setText("分享");
                    linearLayout2.setOnClickListener(new a());
                } else if (intValue == 1002) {
                    imageView.setImageDrawable(ContextCompat.getDrawable(this.f29465a, R.drawable.hiv_alarm_icon));
                    textView.setText("我要举报");
                    linearLayout2.setOnClickListener(new b());
                }
                int dip2px = DWViewUtil.dip2px(this.f29465a, 40.0f);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(dip2px, dip2px);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(DWViewUtil.dip2px(this.f29465a, 126.0f), -2);
                layoutParams3.gravity = 17;
                layoutParams4.gravity = 17;
                imageView.setLayoutParams(layoutParams3);
                textView.setLayoutParams(layoutParams4);
                textView.setTextSize(16.0f);
                textView.setGravity(19);
                linearLayout2.addView(imageView, layoutParams3);
                linearLayout2.addView(textView, layoutParams4);
                if (i > 0) {
                    View view = new View(this.f29465a);
                    view.setBackgroundResource(R.color.detail_action_bar_divider_bg);
                    this.b.addView(view, layoutParams2);
                }
                this.b.addView(linearLayout2, layoutParams);
            }
        }
    }
}
