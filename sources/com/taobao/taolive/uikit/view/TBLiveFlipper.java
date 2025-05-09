package com.taobao.taolive.uikit.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import tb.t2d;
import tb.t2o;
import tb.v5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBLiveFlipper extends TaoliveHomeFlipperView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private t2d mCardChangeListener;

    static {
        t2o.a(779093695);
        t2o.a(779093577);
        t2o.a(779093579);
    }

    public TBLiveFlipper(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(TBLiveFlipper tBLiveFlipper, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1179718721) {
            super.setDisplayedChild(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == -489906275) {
            super.pageChange(((Number) objArr[0]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/uikit/view/TBLiveFlipper");
        }
    }

    public void addChildView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51bfb6ab", new Object[]{this, view});
        } else if (view != null) {
            addView(view);
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public v5d getInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v5d) ipChange.ipc$dispatch("d003153", new Object[]{this});
        }
        return null;
    }

    public void makeView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("960c80ba", new Object[]{this});
        }
    }

    public boolean needLazyLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c7455bb", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.taolive.uikit.view.TaoliveHomeFlipperView, com.taobao.taolive.uikit.component.ViewFlipperExt
    public void pageChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2cc9f9d", new Object[]{this, new Integer(i)});
            return;
        }
        super.pageChange(i);
        t2d t2dVar = this.mCardChangeListener;
        if (t2dVar != null) {
            t2dVar.b(i);
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            stopFlipping();
        }
    }

    public void removeChildViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4d36fdd", new Object[]{this});
        } else {
            removeAllViews();
        }
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else {
            startFlipping();
        }
    }

    public void setChildViews(ArrayList<View> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f643e54f", new Object[]{this, arrayList});
        } else if (arrayList != null && arrayList.size() > 0) {
            removeChildViews();
            Iterator<View> it = arrayList.iterator();
            while (it.hasNext()) {
                addChildView(it.next());
            }
        }
    }

    public void setCurrentCard(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e45e555", new Object[]{this, new Integer(i)});
        } else {
            setDisplayedChild(i);
        }
    }

    @Override // com.taobao.taolive.uikit.component.ViewAnimatorExt
    public void setDisplayedChild(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9aeebbf", new Object[]{this, new Integer(i)});
            return;
        }
        super.setDisplayedChild(i);
        t2d t2dVar = this.mCardChangeListener;
        if (t2dVar != null) {
            t2dVar.a(i);
        }
    }

    public void setOnCardChangeListener(t2d t2dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a757c6ec", new Object[]{this, t2dVar});
        } else {
            this.mCardChangeListener = t2dVar;
        }
    }

    public TBLiveFlipper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
