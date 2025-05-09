package com.taobao.falco;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.vz8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FalcoVisualTool$MetricListItemView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private StyleSpan mBoldSpan;
    private final Context mContext;
    private final Map<Integer, a> mItems = new HashMap();
    private RelativeSizeSpan mSizeSpan;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f10455a;
        public TextView b;

        public a() {
        }

        public /* synthetic */ a(vz8.a aVar) {
            this();
        }
    }

    public FalcoVisualTool$MetricListItemView(Context context) {
        super(context);
        this.mContext = context;
        setOrientation(1);
    }

    public static /* synthetic */ Object ipc$super(FalcoVisualTool$MetricListItemView falcoVisualTool$MetricListItemView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/falco/FalcoVisualTool$MetricListItemView");
    }

    public String getContent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d2524c7", new Object[]{this, new Integer(i)});
        }
        a aVar = this.mItems.get(Integer.valueOf(i));
        if (aVar != null) {
            return aVar.f10455a;
        }
        return null;
    }

    public void setItemVisibility(int i, int i2) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("737f516e", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        a aVar = this.mItems.get(Integer.valueOf(i));
        if (aVar != null) {
            textView = aVar.b;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setVisibility(i2);
        }
    }

    public void setTitle(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8432bbc7", new Object[]{this, str, new Integer(i), new Integer(i2)});
            return;
        }
        TextView textView = new TextView(this.mContext);
        textView.setText(str);
        textView.setTextSize(0, i);
        textView.setTypeface(null, 1);
        textView.setTextColor(i2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(20, 20, 20, 0);
        addView(textView, layoutParams);
    }

    public void updateItem(int i, String str, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("822f810a", new Object[]{this, new Integer(i), str, new Integer(i2), new Integer(i3)});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (this.mBoldSpan == null) {
            this.mBoldSpan = new StyleSpan(1);
        }
        if (this.mSizeSpan == null) {
            this.mSizeSpan = new RelativeSizeSpan(1.2f);
        }
        SpannableString spannableString = new SpannableString("• " + str);
        spannableString.setSpan(this.mBoldSpan, 0, 1, 18);
        spannableString.setSpan(this.mSizeSpan, 0, 1, 18);
        a aVar = this.mItems.get(Integer.valueOf(i));
        TextView textView = aVar != null ? aVar.b : null;
        if (textView != null) {
            textView.setText(spannableString);
            aVar.f10455a = str;
            return;
        }
        TextView textView2 = new TextView(this.mContext);
        textView2.setText(spannableString);
        textView2.setTextSize(0, i2);
        textView2.setTextColor(i3);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(20, 15, 20, 0);
        addView(textView2, layoutParams);
        a aVar2 = new a(null);
        aVar2.f10455a = str;
        aVar2.b = textView2;
        this.mItems.put(Integer.valueOf(i), aVar2);
    }
}
