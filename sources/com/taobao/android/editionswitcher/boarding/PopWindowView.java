package com.taobao.android.editionswitcher.boarding;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.boarding.LocaleModel;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class PopWindowView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public PopupWindow f7617a;
    public LocaleAdapter b;
    public TextView c;
    public TextView d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f7618a;

        public a(c cVar) {
            this.f7618a = cVar;
        }

        @Override // com.taobao.android.editionswitcher.boarding.PopWindowView.c
        public void a(LocaleModel.LocaleData localeData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fbb2132", new Object[]{this, localeData});
                return;
            }
            PopWindowView.this.d();
            this.f7618a.a(localeData);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                PopWindowView.this.d();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
        void a(LocaleModel.LocaleData localeData);
    }

    static {
        t2o.a(456130643);
    }

    public static /* synthetic */ void a(Window window, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e53450f0", new Object[]{window, new Float(f)});
        } else {
            f(window, f);
        }
    }

    public static PopWindowView c(Activity activity, List<LocaleModel.LocaleData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopWindowView) ipChange.ipc$dispatch("3d6591b3", new Object[]{activity, list});
        }
        PopWindowView popWindowView = new PopWindowView();
        popWindowView.b = new LocaleAdapter(list);
        popWindowView.e(activity);
        return popWindowView;
    }

    public static void f(Window window, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b26b035", new Object[]{window, new Float(f)});
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = f;
        window.setAttributes(attributes);
    }

    public PopWindowView b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopWindowView) ipChange.ipc$dispatch("35aae4e9", new Object[]{this, cVar});
        }
        this.b.P(new a(cVar));
        return this;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        PopupWindow popupWindow = this.f7617a;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final void e(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59aed7ca", new Object[]{this, activity});
            return;
        }
        View inflate = LayoutInflater.from(activity).inflate(R.layout.ovs_layout_locale_popwindow, (ViewGroup) null, false);
        PopupWindow popupWindow = new PopupWindow(inflate, -1, -2);
        this.f7617a = popupWindow;
        popupWindow.setOutsideTouchable(true);
        this.f7617a.setTouchable(true);
        this.f7617a.setFocusable(true);
        this.f7617a.setAnimationStyle(R.style.OvsPopupAnimation);
        this.f7617a.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.taobao.android.editionswitcher.boarding.PopWindowView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                } else {
                    PopWindowView.a(activity.getWindow(), 1.0f);
                }
            }
        });
        this.c = (TextView) inflate.findViewById(R.id.title_tx);
        this.d = (TextView) inflate.findViewById(R.id.chosen_tx);
        ViewProxy.setOnClickListener(inflate.findViewById(R.id.close_btn), new b());
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.list);
        recyclerView.setAdapter(this.b);
        int i = activity.getResources().getDisplayMetrics().heightPixels;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (this.b.getItemCount() > 7) {
            layoutParams.height = (int) (i * 0.75f);
        } else {
            layoutParams.height = (int) (i * 0.17f);
        }
        recyclerView.setLayoutParams(layoutParams);
    }

    public PopWindowView g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopWindowView) ipChange.ipc$dispatch("fc068ea4", new Object[]{this, str});
        }
        TextView textView = this.d;
        if (textView != null) {
            textView.setText(str);
        }
        return this;
    }

    public PopWindowView h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopWindowView) ipChange.ipc$dispatch("4de8ada2", new Object[]{this, str});
        }
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(str);
        }
        return this;
    }

    public void i(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7429b556", new Object[]{this, activity});
            return;
        }
        PopupWindow popupWindow = this.f7617a;
        if (popupWindow != null) {
            popupWindow.showAtLocation(activity.getWindow().getDecorView(), 80, 0, 0);
            f(activity.getWindow(), 0.6f);
        }
    }
}
