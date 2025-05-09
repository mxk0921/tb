package com.taobao.falco;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import com.alibaba.wireless.security.SecExceptionCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.internal.ArtcParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.vz8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FalcoVisualTool$DetailSectionView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int currentColorIdx;
    private final int mContentSize;
    private final Context mContext;
    private final List<Integer> mTitleColors;
    private final int mTitleSize;
    private final Map<Integer, FalcoVisualTool$MetricListItemView> mItems = new HashMap();
    private final int mContentColor = -1;

    public FalcoVisualTool$DetailSectionView(Context context) {
        super(context);
        this.mContext = context;
        this.mTitleSize = vz8.h(context, 12);
        ArrayList arrayList = new ArrayList(4);
        this.mTitleColors = arrayList;
        arrayList.add(Integer.valueOf(Color.rgb(255, 98, 0)));
        arrayList.add(Integer.valueOf(Color.rgb(255, 179, 0)));
        arrayList.add(Integer.valueOf(Color.rgb(69, (int) SecExceptionCode.SEC_ERROR_INIT_PLUGIN_MERGED_INIT_CONFIG_MODIFY_ERROR, (int) ArtcParams.SD244pVideoParams.WIDTH)));
        arrayList.add(Integer.valueOf(Color.rgb(0, 255, 0)));
        this.mContentSize = vz8.h(context, 12);
        setOrientation(1);
    }

    public static /* synthetic */ Object ipc$super(FalcoVisualTool$DetailSectionView falcoVisualTool$DetailSectionView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/falco/FalcoVisualTool$DetailSectionView");
    }

    public void addItem(int i, String str, Map<Integer, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("548490f3", new Object[]{this, new Integer(i), str, map});
        } else if (!this.mItems.containsKey(Integer.valueOf(i))) {
            FalcoVisualTool$MetricListItemView falcoVisualTool$MetricListItemView = new FalcoVisualTool$MetricListItemView(this.mContext);
            int i2 = this.mTitleSize;
            List<Integer> list = this.mTitleColors;
            int i3 = this.currentColorIdx;
            this.currentColorIdx = 1 + i3;
            falcoVisualTool$MetricListItemView.setTitle(str, i2, list.get(i3 % list.size()).intValue());
            if (map != null) {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    falcoVisualTool$MetricListItemView.updateItem(entry.getKey().intValue(), entry.getValue(), this.mContentSize, this.mContentColor);
                }
            }
            falcoVisualTool$MetricListItemView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            addView(falcoVisualTool$MetricListItemView);
            this.mItems.put(Integer.valueOf(i), falcoVisualTool$MetricListItemView);
        }
    }

    public String getItemContent(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f85295a9", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        FalcoVisualTool$MetricListItemView falcoVisualTool$MetricListItemView = this.mItems.get(Integer.valueOf(i));
        if (falcoVisualTool$MetricListItemView != null) {
            return falcoVisualTool$MetricListItemView.getContent(i2);
        }
        return null;
    }

    public void setItemVisibility(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("737f516e", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        FalcoVisualTool$MetricListItemView falcoVisualTool$MetricListItemView = this.mItems.get(Integer.valueOf(i));
        if (falcoVisualTool$MetricListItemView != null) {
            falcoVisualTool$MetricListItemView.setVisibility(i2);
        }
    }

    public void updateItem(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61114ad", new Object[]{this, new Integer(i), new Integer(i2), str});
            return;
        }
        FalcoVisualTool$MetricListItemView falcoVisualTool$MetricListItemView = this.mItems.get(Integer.valueOf(i));
        if (falcoVisualTool$MetricListItemView != null) {
            falcoVisualTool$MetricListItemView.updateItem(i2, str, this.mContentSize, this.mContentColor);
        }
    }

    public void setItemVisibility(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc6b4f55", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        FalcoVisualTool$MetricListItemView falcoVisualTool$MetricListItemView = this.mItems.get(Integer.valueOf(i));
        if (falcoVisualTool$MetricListItemView != null) {
            falcoVisualTool$MetricListItemView.setItemVisibility(i2, i3);
        }
    }
}
