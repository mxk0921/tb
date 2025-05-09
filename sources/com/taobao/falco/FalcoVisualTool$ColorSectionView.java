package com.taobao.falco;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.AConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.vz8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FalcoVisualTool$ColorSectionView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final TextView mBackgroundTextView;
    private final List<Integer> mBlockColors;
    private final int mColorBlockCount;
    private final List<FalcoVisualTool$ColorBlockView> mColorBlocks;
    private final int mContentColor;
    private final int mContentSize;
    private final Context mContext;
    private int mCurrentIdx;
    private final int mTitleColor;
    private final int mTitleSize;
    private final Set<String> mTitles;

    public FalcoVisualTool$ColorSectionView(Context context) {
        this(context, 0);
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setOrientation(0);
        setClipToPadding(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        this.mBackgroundTextView.setText("Falco RUM");
        this.mBackgroundTextView.setGravity(17);
        this.mBackgroundTextView.setTextAlignment(4);
        TextView textView = this.mBackgroundTextView;
        textView.setTypeface(textView.getTypeface(), 1);
        this.mBackgroundTextView.setTextSize(vz8.h(this.mContext, 8));
        this.mBackgroundTextView.setTextColor(-1);
        addView(this.mBackgroundTextView, layoutParams);
        for (int i = 0; i < this.mColorBlockCount; i++) {
            FalcoVisualTool$ColorBlockView falcoVisualTool$ColorBlockView = new FalcoVisualTool$ColorBlockView(this.mContext);
            List<Integer> list = this.mBlockColors;
            falcoVisualTool$ColorBlockView.backgroundColor = list.get(i % list.size()).intValue();
            falcoVisualTool$ColorBlockView.titleColor = this.mTitleColor;
            falcoVisualTool$ColorBlockView.contentColor = this.mContentColor;
            falcoVisualTool$ColorBlockView.titleSize = this.mTitleSize;
            falcoVisualTool$ColorBlockView.contentSize = this.mContentSize;
            falcoVisualTool$ColorBlockView.setVisibility(8);
            addView(falcoVisualTool$ColorBlockView, layoutParams);
            this.mColorBlocks.add(falcoVisualTool$ColorBlockView);
        }
    }

    public static /* synthetic */ Object ipc$super(FalcoVisualTool$ColorSectionView falcoVisualTool$ColorSectionView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/falco/FalcoVisualTool$ColorSectionView");
    }

    public void addItem(long j, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bccd4cdd", new Object[]{this, new Long(j), str, str2});
            return;
        }
        if (this.mBackgroundTextView.getVisibility() != 8) {
            this.mBackgroundTextView.setVisibility(8);
        }
        if (this.mCurrentIdx < this.mColorBlockCount) {
            int i = 0;
            while (true) {
                if (i >= this.mCurrentIdx) {
                    i = -1;
                    break;
                } else if (j < this.mColorBlocks.get(i).orderIdx) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                while (i < this.mCurrentIdx) {
                    FalcoVisualTool$ColorBlockView falcoVisualTool$ColorBlockView = this.mColorBlocks.get(i);
                    long j2 = falcoVisualTool$ColorBlockView.orderIdx;
                    String str3 = falcoVisualTool$ColorBlockView.title;
                    String str4 = falcoVisualTool$ColorBlockView.content;
                    falcoVisualTool$ColorBlockView.setContent(j, str, str2);
                    i++;
                    j = j2;
                    str = str3;
                    str2 = str4;
                }
            }
            FalcoVisualTool$ColorBlockView falcoVisualTool$ColorBlockView2 = this.mColorBlocks.get(this.mCurrentIdx);
            falcoVisualTool$ColorBlockView2.setContent(j, str, str2);
            falcoVisualTool$ColorBlockView2.setVisibility(0);
            this.mCurrentIdx++;
            this.mTitles.add(str);
        }
    }

    public void clearAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c823e69b", new Object[]{this});
            return;
        }
        for (FalcoVisualTool$ColorBlockView falcoVisualTool$ColorBlockView : this.mColorBlocks) {
            falcoVisualTool$ColorBlockView.setVisibility(8);
        }
        this.mCurrentIdx = 0;
        this.mBackgroundTextView.setVisibility(0);
        this.mTitles.clear();
    }

    public boolean containTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2c0e979", new Object[]{this, str})).booleanValue();
        }
        return this.mTitles.contains(str);
    }

    public FalcoVisualTool$ColorSectionView(Context context, int i) {
        super(context);
        this.mCurrentIdx = 0;
        this.mContext = context;
        this.mColorBlockCount = i;
        this.mColorBlocks = new ArrayList(i);
        ArrayList arrayList = new ArrayList(4);
        this.mBlockColors = arrayList;
        arrayList.add(Integer.valueOf(Color.rgb(174, 38, 26)));
        arrayList.add(Integer.valueOf(Color.rgb(186, 99, 45)));
        arrayList.add(Integer.valueOf(Color.rgb((int) AConstants.ArtcErrorServerErrorDropByMobility, 132, 71)));
        arrayList.add(Integer.valueOf(Color.rgb(55, 223, 111)));
        this.mTitleColor = -1;
        this.mContentColor = -1;
        this.mTitleSize = vz8.h(context, 12);
        this.mContentSize = vz8.h(context, 12);
        this.mBackgroundTextView = new TextView(context);
        this.mTitles = new HashSet();
        init();
    }
}
