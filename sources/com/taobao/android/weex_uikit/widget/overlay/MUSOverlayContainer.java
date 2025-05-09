package com.taobao.android.weex_uikit.widget.overlay;

import android.content.Context;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.t2o;
import tb.yio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MUSOverlayContainer extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<MUSOverlaySlice, Integer> mZIndexMap = new LinkedHashMap();
    private List<Integer> mZIndexSort = new LinkedList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/overlay/MUSOverlayContainer$1");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            for (Map.Entry entry : MUSOverlayContainer.access$000(MUSOverlayContainer.this).entrySet()) {
                ((MUSOverlaySlice) entry.getKey()).onContainerLayoutChanged();
            }
        }
    }

    static {
        t2o.a(986710192);
    }

    public MUSOverlayContainer(Context context) {
        super(context);
    }

    public static /* synthetic */ Map access$000(MUSOverlayContainer mUSOverlayContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a802c551", new Object[]{mUSOverlayContainer});
        }
        return mUSOverlayContainer.mZIndexMap;
    }

    private int addToZIndexSort(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b7a103d", new Object[]{this, new Integer(i)})).intValue();
        }
        for (int i2 = 0; i2 < this.mZIndexSort.size(); i2++) {
            if (this.mZIndexSort.get(i2).intValue() > i) {
                return i2;
            }
        }
        return this.mZIndexSort.size();
    }

    public static /* synthetic */ Object ipc$super(MUSOverlayContainer mUSOverlayContainer, String str, Object... objArr) {
        if (str.hashCode() == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/overlay/MUSOverlayContainer");
    }

    public void addOverlay(MUSOverlaySlice mUSOverlaySlice, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a32c508d", new Object[]{this, mUSOverlaySlice, num});
            return;
        }
        if (num == null) {
            if (this.mZIndexSort.size() == 0) {
                num = 0;
            } else {
                List<Integer> list = this.mZIndexSort;
                num = Integer.valueOf(list.get(list.size() - 1).intValue() + 1);
            }
        }
        this.mZIndexMap.put(mUSOverlaySlice, num);
        int addToZIndexSort = addToZIndexSort(num.intValue());
        this.mZIndexSort.add(addToZIndexSort, num);
        addView(mUSOverlaySlice, addToZIndexSort, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            post(new a());
        }
    }

    public void removeOverlay(MUSOverlaySlice mUSOverlaySlice) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b481cd27", new Object[]{this, mUSOverlaySlice});
        } else if (indexOfChild(mUSOverlaySlice) >= 0) {
            Integer remove = this.mZIndexMap.remove(mUSOverlaySlice);
            while (true) {
                if (i >= this.mZIndexSort.size()) {
                    break;
                } else if (this.mZIndexSort.get(i).intValue() == remove.intValue()) {
                    this.mZIndexSort.remove(i);
                    break;
                } else {
                    i++;
                }
            }
            removeView(mUSOverlaySlice);
            mUSOverlaySlice.release();
        }
    }
}
