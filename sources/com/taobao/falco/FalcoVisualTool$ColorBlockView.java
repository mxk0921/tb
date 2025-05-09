package com.taobao.falco;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FalcoVisualTool$ColorBlockView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int backgroundColor;
    public String content;
    public int contentColor;
    public int contentSize;
    private TextView mContentView;
    private final Context mContext;
    private TextView mTitleView;
    public long orderIdx = -1;
    public String title;
    public int titleColor;
    public int titleSize;

    public FalcoVisualTool$ColorBlockView(Context context) {
        super(context);
        this.mContext = context;
        setOrientation(1);
    }

    public static /* synthetic */ Object ipc$super(FalcoVisualTool$ColorBlockView falcoVisualTool$ColorBlockView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/falco/FalcoVisualTool$ColorBlockView");
    }

    public void setContent(long j, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bf809da", new Object[]{this, new Long(j), str, str2});
            return;
        }
        TextView textView = this.mTitleView;
        if (textView == null) {
            setBackgroundColor(this.backgroundColor);
            TextView textView2 = new TextView(this.mContext);
            this.mTitleView = textView2;
            textView2.setText(str);
            this.mTitleView.setTextSize(0, this.titleSize);
            this.mTitleView.setTextColor(this.titleColor);
            this.mTitleView.setGravity(17);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams.weight = 1.0f;
            addView(this.mTitleView, layoutParams);
            TextView textView3 = new TextView(this.mContext);
            this.mContentView = textView3;
            textView3.setText(str2);
            this.mContentView.setTextSize(0, this.contentSize);
            this.mContentView.setTextColor(this.contentColor);
            this.mContentView.setGravity(17);
            addView(this.mContentView, layoutParams);
        } else {
            textView.setText(str);
            this.mContentView.setText(str2);
        }
        this.orderIdx = j;
        this.title = str;
        this.content = str2;
    }
}
