package com.taobao.umipublish.extension.preview.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.widget.LCTabView;
import com.taobao.taobao.R;
import tb.bxo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PreviewIndexTabView extends LCTabView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a extends LCTabView.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public View d;
        public final int e;

        static {
            t2o.a(944767060);
        }

        public a(int i, int i2, String str) {
            super(i, str);
            this.e = i2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/preview/widget/PreviewIndexTabView$PreviewIndexItem");
        }

        @Override // com.taobao.android.litecreator.base.widget.LCTabView.b
        public View a(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("faf2c689", new Object[]{this, viewGroup});
            }
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lay_preview_index_tab_item, viewGroup, false);
            if (frameLayout.getLayoutParams() != null && this.e > 0) {
                frameLayout.getLayoutParams().width = bxo.b() / this.e;
            }
            this.d = frameLayout.findViewById(R.id.v_tab_item_bg);
            return frameLayout;
        }

        @Override // com.taobao.android.litecreator.base.widget.LCTabView.b
        public void c(boolean z) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("86a838c1", new Object[]{this, new Boolean(z)});
                return;
            }
            View view = this.d;
            if (z) {
                i = R.drawable.dw_umi_index_tab_item_bg_focus;
            } else {
                i = R.drawable.dw_umi_index_tab_item_bg;
            }
            view.setBackgroundResource(i);
        }
    }

    static {
        t2o.a(944767059);
    }

    public PreviewIndexTabView(Context context) {
        super(context);
    }

    private static int getTabItemWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bde782fb", new Object[]{new Integer(i)})).intValue();
        }
        if (i <= 0) {
            return 0;
        }
        return bxo.b() / i;
    }

    public static /* synthetic */ Object ipc$super(PreviewIndexTabView previewIndexTabView, String str, Object... objArr) {
        if (str.hashCode() == 405794049) {
            super.addTab((LCTabView.b) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/preview/widget/PreviewIndexTabView");
    }

    @Override // com.taobao.android.litecreator.base.widget.LCTabView
    public void addTab(LCTabView.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("182fed01", new Object[]{this, bVar});
            return;
        }
        super.addTab(bVar);
        this.mTabSlider.getLayoutParams().width = getTabItemWidth(this.mItemList.size());
    }

    public void clearTabs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ee94672", new Object[]{this});
            return;
        }
        this.mItemList.clear();
        this.mTabItemContainer.removeAllViews();
    }

    @Override // com.taobao.android.litecreator.base.widget.LCTabView
    public boolean isItemChecked(LCTabView.b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65af47c", new Object[]{this, bVar, new Integer(i)})).booleanValue();
        }
        if (bVar.c) {
            if (bVar.f8242a <= i) {
                return true;
            }
            return false;
        } else if (bVar.f8242a < i) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.taobao.android.litecreator.base.widget.LCTabView
    public int rootViewId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2fd8d9c", new Object[]{this})).intValue();
        }
        return R.layout.lay_preview_index_tab;
    }

    @Override // com.taobao.android.litecreator.base.widget.LCTabView
    public int sliderId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ea90456", new Object[]{this})).intValue();
        }
        return R.id.v_tab_slider;
    }

    @Override // com.taobao.android.litecreator.base.widget.LCTabView
    public int tabViewId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f2fd488f", new Object[]{this})).intValue();
        }
        return R.id.rg_index_tab;
    }

    public PreviewIndexTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.taobao.android.litecreator.base.widget.LCTabView
    public ObjectAnimator generateSliderAnimByIndex(View view, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ObjectAnimator) ipChange.ipc$dispatch("723edf68", new Object[]{this, view, new Integer(i)}) : ObjectAnimator.ofFloat(view, "translationX", view.getTranslationX(), getTabItemWidth(this.mItemList.size()) * i);
    }

    public PreviewIndexTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
