package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class m7n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_QUALITY_SWITCH_TIPS = "com.taobao.taolive.room.quality_switch_tips";

    /* renamed from: a  reason: collision with root package name */
    public final PopupWindow f23823a;
    public final Context b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f23824a;

        /* compiled from: Taobao */
        /* renamed from: tb.m7n$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class RunnableC0988a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0988a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (m7n.b(m7n.this) != null) {
                    eir.a("QualitySwitchTips", "dismiss");
                    m7n.b(m7n.this).dismiss();
                }
            }
        }

        public a(View view) {
            this.f23824a = view;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            view.removeOnLayoutChangeListener(this);
            if (m7n.a(m7n.this) != null && m7n.b(m7n.this) != null && (m7n.a(m7n.this) instanceof Activity) && !((Activity) m7n.a(m7n.this)).isDestroyed() && !((Activity) m7n.a(m7n.this)).isFinishing()) {
                m7n.b(m7n.this).showAsDropDown(this.f23824a, ((-iw0.a(m7n.a(m7n.this), 164.0f)) / 2) + (this.f23824a.getWidth() / 2), ((-this.f23824a.getHeight()) - iw0.a(m7n.a(m7n.this), 49.0f)) - iw0.a(m7n.a(m7n.this), 10.0f));
                z1i.a().d(new RunnableC0988a(), 3000L);
            }
        }
    }

    static {
        t2o.a(806356022);
    }

    public m7n(Context context) {
        TextView textView;
        this.b = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.taolive_quality_switch_tips, (ViewGroup) null);
        PopupWindow popupWindow = new PopupWindow(context);
        this.f23823a = popupWindow;
        popupWindow.setContentView(inflate);
        popupWindow.setWidth(iw0.a(context, 164.0f));
        popupWindow.setHeight(iw0.a(context, 49.0f));
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(false);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        if (inflate != null && (textView = (TextView) inflate.findViewById(R.id.tblive_tips_content)) != null) {
            SpannableString spannableString = new SpannableString("在这里调整清晰度哦~");
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FFCC33")), 3, 8, 33);
            textView.setText(spannableString);
        }
    }

    public static /* synthetic */ Context a(m7n m7nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("de198308", new Object[]{m7nVar});
        }
        return m7nVar.b;
    }

    public static /* synthetic */ PopupWindow b(m7n m7nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindow) ipChange.ipc$dispatch("9725cf65", new Object[]{m7nVar});
        }
        return m7nVar.f23823a;
    }

    public void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc9d94e", new Object[]{this, view});
        } else if (!qvs.Y()) {
            eir.a(soq.TAG, "show enableShowQualitySwitchTips = false");
        } else if (view != null) {
            view.requestLayout();
            view.addOnLayoutChangeListener(new a(view));
        }
    }
}
