package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.TextModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.TextStyleModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class rhm extends ubm<TextModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626479);
    }

    public rhm(oe8 oe8Var, TextModel textModel, boolean z) {
        super(oe8Var, textModel, z);
    }

    public static /* synthetic */ Object ipc$super(rhm rhmVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/nativerender/render/component/PopTextComponent");
    }

    @Override // tb.ubm
    public StyleModel f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StyleModel) ipChange.ipc$dispatch("14e3d48a", new Object[]{this});
        }
        T t = this.b;
        if (t != 0) {
            return ((TextModel) t).style;
        }
        return null;
    }

    @Override // tb.ubm
    public View c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        TextView textView = new TextView(context);
        jl1 g = this.f29277a.g();
        TextStyleModel textStyleModel = ((TextModel) this.b).style;
        i(textView, textStyleModel);
        oe8 oe8Var = this.f29277a;
        TextModel textModel = (TextModel) this.b;
        String h = a1n.h(oe8Var, textModel.text, !textModel.enableEmpty);
        if (!plj.c(h, ((TextModel) this.b).enableEmpty)) {
            oe8 oe8Var2 = this.f29277a;
            oe8Var2.s("TEXT_CONTENT_INVALID", "id=" + ((TextModel) this.b).id + ".text=" + h);
            return textView;
        }
        if (h == null) {
            h = "";
        }
        textView.setText(h);
        textView.setIncludeFontPadding(false);
        try {
            textView.setTextSize(0, g.c(this.f29277a.j().e(), Float.parseFloat(textStyleModel.fontSize)));
            if (!TextUtils.isEmpty(textStyleModel.color)) {
                try {
                    textView.setTextColor(Color.parseColor(a1n.h(this.f29277a, textStyleModel.color, false)));
                } catch (Throwable th) {
                    wdm.h("PopTextComponent.parseColor.textColor.error.", th);
                    oe8 oe8Var3 = this.f29277a;
                    oe8Var3.s("TEXT_COLOR_INVALID.ID=" + ((TextModel) this.b).id, String.valueOf(th.getMessage()));
                    return textView;
                }
            }
            int parseInt = !TextUtils.isEmpty(textStyleModel.maxLines) ? Integer.parseInt(textStyleModel.maxLines) : 1;
            if (parseInt > 1) {
                textView.setMaxLines(parseInt);
            } else {
                textView.setSingleLine();
            }
            float parseFloat = !TextUtils.isEmpty(textStyleModel.lineSpace) ? Float.parseFloat(textStyleModel.lineSpace) : 0.0f;
            if (parseFloat > 0.0f) {
                textView.setLineSpacing(g.c(context, parseFloat), 1.0f);
            } else {
                float parseFloat2 = !TextUtils.isEmpty(textStyleModel.lineHeight) ? Float.parseFloat(textStyleModel.lineHeight) : 0.0f;
                if (parseFloat2 > 0.0f && Build.VERSION.SDK_INT >= 28) {
                    textView.setLineHeight((int) g.c(context, parseFloat2));
                }
            }
            textView.setEllipsize(TextUtils.TruncateAt.END);
            if ("bold".equals(textStyleModel.fontWeight) || "bolder".equals(textStyleModel.fontWeight)) {
                textView.setTypeface(Typeface.defaultFromStyle(1));
            }
            textView.setGravity(17);
            if ("left".equals(textStyleModel.textAlign)) {
                textView.setGravity(19);
            } else if ("right".equals(textStyleModel.textAlign)) {
                textView.setGravity(21);
            }
            textView.setHorizontallyScrolling(false);
            return textView;
        } catch (Throwable th2) {
            wdm.h("PopTextComponent.parseFontSize.error.", th2);
            oe8 oe8Var4 = this.f29277a;
            oe8Var4.s("TEXT_SIZE_INVALID.ID=" + ((TextModel) this.b).id, String.valueOf(th2.getMessage()));
            return textView;
        }
    }
}
