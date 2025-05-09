package tb;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ipl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f21492a;
    public FrameLayout b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                ipl.a(ipl.this).setVisibility(8);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int[] f21494a;

        public b(int[] iArr) {
            this.f21494a = iArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int[] iArr = this.f21494a;
            int i = iArr[0] + (iArr[2] / 2);
            int i2 = iArr[1] + iArr[3];
            int[] iArr2 = new int[2];
            ipl.b(ipl.this).getLocationOnScreen(iArr2);
            ipl.b(ipl.this).setTranslationX(i - (iArr2[0] + (ipl.b(ipl.this).getWidth() / 2)));
            ipl.b(ipl.this).setTranslationY(i2 - iArr2[1]);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ipl.a(ipl.this).setVisibility(8);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int[] f21496a;

        public d(int[] iArr) {
            this.f21496a = iArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            int[] iArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (ipl.a(ipl.this).getParent() != null) {
                ((View) ipl.a(ipl.this).getParent()).getLocationOnScreen(new int[2]);
                int[] iArr2 = new int[2];
                ipl.a(ipl.this).getLocationOnScreen(iArr2);
                int[] iArr3 = this.f21496a;
                float width = (iArr3[0] + (iArr3[2] / 2)) - (iArr2[0] + (ipl.a(ipl.this).getWidth() / 2));
                int i = iArr2[0];
                if (i + width <= iArr[0]) {
                    ipl.a(ipl.this).setX(iArr[0] + 23);
                } else if (i + width + ipl.a(ipl.this).getWidth() >= view.getWidth()) {
                    ipl.a(ipl.this).setX((view.getWidth() - ipl.a(ipl.this).getWidth()) - 23);
                } else {
                    ipl.a(ipl.this).setTranslationX(width);
                }
                int[] iArr4 = this.f21496a;
                ipl.a(ipl.this).setTranslationY((iArr4[1] + iArr4[3]) - iArr2[1]);
            }
        }
    }

    static {
        t2o.a(729809566);
    }

    public static /* synthetic */ FrameLayout a(ipl iplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("e4eb1cec", new Object[]{iplVar});
        }
        return iplVar.b;
    }

    public static /* synthetic */ View b(ipl iplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f51e010", new Object[]{iplVar});
        }
        return iplVar.f21492a;
    }

    public final void c(JSONObject jSONObject, int i) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1683119", new Object[]{this, jSONObject, new Integer(i)});
        } else if (i != -1 && (jSONObject2 = jSONObject.getJSONObject(i2b.TRACK_EXPOSURE_PARAM)) != null) {
            jSONObject.put("isTracked", (Object) Boolean.FALSE);
            vaj.e(jSONObject2, i);
            r5a.l(jSONObject);
        }
    }

    public final View d(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a7d4df24", new Object[]{this, context, jSONObject});
        }
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(pb6.c(context, 8.0f), pb6.c(context, 4.0f));
        layoutParams.gravity = 48;
        tUrlImageView.setLayoutParams(layoutParams);
        String string = jSONObject.getString(hpl.ARROW_IMG);
        if (!TextUtils.isEmpty(string)) {
            tUrlImageView.setImageUrl(string);
        }
        return tUrlImageView;
    }

    public final View e(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1d1b9fb0", new Object[]{this, context, jSONObject});
        }
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(pb6.c(context, 184.0f), pb6.c(context, 36.0f));
        layoutParams.gravity = 80;
        tUrlImageView.setLayoutParams(layoutParams);
        String string = jSONObject.getString(vaj.KEY_BG_IMG);
        if (!TextUtils.isEmpty(string)) {
            tUrlImageView.setImageUrl(string);
        }
        return tUrlImageView;
    }

    public final View f(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("11982815", new Object[]{this, context, jSONObject});
        }
        String string = jSONObject.getString(hpl.PANEL_GUIDE_CLOSE_IMG);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(pb6.c(context, 10.0f), pb6.c(context, 10.0f));
        layoutParams.gravity = 8388629;
        layoutParams.topMargin = 4;
        layoutParams.rightMargin = pb6.c(context, 16.0f);
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        tUrlImageView.setLayoutParams(layoutParams);
        if (!TextUtils.isEmpty(string)) {
            tUrlImageView.setImageUrl(string);
        }
        return tUrlImageView;
    }

    public final FrameLayout g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("3e97d094", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(pb6.c(context, 184.0f), pb6.c(context, 40.0f)));
        return frameLayout;
    }

    public View h(Context context, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c040bd7c", new Object[]{this, context, jSONObject, new Integer(i)});
        }
        d9j.c("PanelGuidePopView", "createPopView");
        FrameLayout g = g(context);
        this.b = g;
        g.setOnClickListener(new a());
        JSONObject jSONObject2 = jSONObject.getJSONObject("content");
        if (jSONObject2 == null) {
            return this.b;
        }
        j(jSONObject2);
        View d2 = d(context, jSONObject2);
        this.f21492a = d2;
        this.b.addView(d2);
        this.b.addView(e(context, jSONObject2));
        this.b.addView(i(context, jSONObject2));
        this.b.addView(f(context, jSONObject2));
        c(jSONObject, i);
        return this.b;
    }

    public final View i(Context context, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("78c75f2", new Object[]{this, context, jSONObject});
        }
        TextView textView = new TextView(context);
        textView.setText(jSONObject.getString("text"));
        textView.setTextSize(TextUtils.isEmpty(jSONObject.getString("textSize")) ? 14.0f : Integer.parseInt(jSONObject.getString("textSize")));
        if (TextUtils.isEmpty(jSONObject.getString("textColor"))) {
            str = "#FFFFFF";
        } else {
            str = jSONObject.getString("textColor");
        }
        textView.setTextColor(Color.parseColor(str));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        layoutParams.leftMargin = pb6.c(context, 16.0f);
        layoutParams.topMargin = 4;
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public final void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d2fa516", new Object[]{this, jSONObject});
        } else {
            this.b.postDelayed(new c(), jSONObject.getIntValue("showTimeMills") == 0 ? 3000 : jSONObject.getIntValue("showTimeMills"));
        }
    }

    public final void k(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bda2eaa", new Object[]{this, iArr});
        } else {
            this.f21492a.post(new b(iArr));
        }
    }

    public void l(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f4cc2f3", new Object[]{this, iArr});
        } else if (iArr != null && iArr.length >= 4) {
            k(iArr);
            m(iArr);
        }
    }

    public final void m(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8256ceb7", new Object[]{this, iArr});
        } else {
            this.b.post(new d(iArr));
        }
    }
}
