package androidx.appcompat.taobao;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TIconFontTextView extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Typeface sIconfont;
    private static int sReference = 0;

    static {
        t2o.a(927989763);
    }

    public TIconFontTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public static /* synthetic */ Object ipc$super(TIconFontTextView tIconFontTextView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/appcompat/taobao/TIconFontTextView");
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        setTypeface(null);
        int i = sReference - 1;
        sReference = i;
        if (i == 0) {
            sIconfont = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (sIconfont == null) {
            try {
                sIconfont = Typeface.createFromAsset(getContext().getAssets(), "uik_iconfont.ttf");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        setTypeface(sIconfont);
        sReference++;
    }

    public TIconFontTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setTextSize(1, 24.0f);
        setTextColor(getResources().getColor(R.color.appcompat_default_icon));
        setIncludeFontPadding(false);
    }

    public TIconFontTextView(Context context) {
        this(context, null, 0);
    }
}
