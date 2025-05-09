package android.taobao.windvane.embed;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.extension.EmbedViewConfig;
import org.json.JSONException;
import org.json.JSONObject;
import tb.t2o;
import tb.tkt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class EmbedViewDemo extends BaseEmbedView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: tv  reason: collision with root package name */
    public TextView f1757tv;

    static {
        t2o.a(989855825);
    }

    public static /* synthetic */ Object ipc$super(EmbedViewDemo embedViewDemo, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/embed/EmbedViewDemo");
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public View generateView(Context context) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7334ca29", new Object[]{this, context});
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        EmbedViewConfig embedViewConfig = this.params;
        int i2 = embedViewConfig.mWidth;
        int i3 = embedViewConfig.mHeight;
        if (context instanceof Activity) {
            Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            i = displayMetrics.widthPixels;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (i3 * (i / i2)));
        layoutParams.addRule(13);
        TextView textView = new TextView(context);
        this.f1757tv = textView;
        textView.setBackgroundColor(tkt.DEFAULT_SHADOW_COLOR);
        this.f1757tv.setText("EmbedView DEMO");
        this.f1757tv.setTextColor(-65536);
        this.f1757tv.setTextSize(30.0f);
        this.f1757tv.setGravity(17);
        relativeLayout.addView(this.f1757tv, layoutParams);
        return relativeLayout;
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public String getViewType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35692924", new Object[]{this});
        }
        return "demo";
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (str2 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                if ("setText".equals(str)) {
                    TextView textView = this.f1757tv;
                    if (textView != null) {
                        textView.setText(jSONObject.getString("text"));
                        wVCallBackContext.success();
                    }
                    return true;
                } else if ("setTextSize".equals(str)) {
                    TextView textView2 = this.f1757tv;
                    if (textView2 != null) {
                        textView2.setTextSize(Float.valueOf(jSONObject.getString("size")).floatValue());
                        wVCallBackContext.success();
                    }
                    return true;
                } else if ("setBackground".equals(str)) {
                    TextView textView3 = this.f1757tv;
                    if (textView3 != null) {
                        textView3.setBackgroundColor(Color.parseColor(jSONObject.getString("color")));
                        wVCallBackContext.success();
                    }
                    return true;
                } else if ("setTextColor".equals(str)) {
                    TextView textView4 = this.f1757tv;
                    if (textView4 != null) {
                        textView4.setTextColor(Color.parseColor(jSONObject.getString("color")));
                        wVCallBackContext.success();
                    }
                    return true;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
