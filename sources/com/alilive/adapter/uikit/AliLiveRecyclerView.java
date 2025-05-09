package com.alilive.adapter.uikit;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alilive.adapter.uikit.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fq0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AliLiveRecyclerView extends RecyclerView implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mAdapter;
    private int mDrawHeight;
    private LinearGradient mLinearGradient;
    private Paint mPaint;
    private boolean needCustomDraw;

    static {
        t2o.a(806354969);
        t2o.a(806354973);
    }

    public AliLiveRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDrawHeight = 0;
    }

    public static /* synthetic */ Object ipc$super(AliLiveRecyclerView aliLiveRecyclerView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1665133574) {
            super.draw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alilive/adapter/uikit/AliLiveRecyclerView");
        }
    }

    public static void setUrlImageViewImpl(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6d46ad1", new Object[]{aVar});
        }
    }

    @Override // com.alilive.adapter.uikit.a
    public boolean addFeature(fq0<? super RecyclerView> fq0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fb2eb7b", new Object[]{this, fq0Var})).booleanValue();
        }
        a aVar = this.mAdapter;
        if (aVar != null) {
            return aVar.addFeature(fq0Var);
        }
        return false;
    }

    @Override // com.alilive.adapter.uikit.a
    public void addFooterView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df49456a", new Object[]{this, view});
            return;
        }
        a aVar = this.mAdapter;
        if (aVar != null) {
            aVar.addFooterView(view);
        }
    }

    @Override // com.alilive.adapter.uikit.a
    public void addHeaderView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59909138", new Object[]{this, view});
            return;
        }
        a aVar = this.mAdapter;
        if (aVar != null) {
            aVar.addHeaderView(view);
        }
    }

    @Override // com.alilive.adapter.uikit.a
    public void clearFeatures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed050131", new Object[]{this});
            return;
        }
        a aVar = this.mAdapter;
        if (aVar != null) {
            aVar.clearFeatures();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        super.draw(canvas);
        if (this.needCustomDraw && this.mPaint != null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), this.mDrawHeight, this.mPaint);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, com.alilive.adapter.uikit.a
    public RecyclerView.ViewHolder findViewHolderForAdapterPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("6430d8d7", new Object[]{this, new Integer(i)});
        }
        a aVar = this.mAdapter;
        if (aVar == null) {
            return null;
        }
        aVar.findViewHolderForAdapterPosition(i);
        return null;
    }

    @Override // com.alilive.adapter.uikit.a
    public int getHeaderViewsCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("643b079e", new Object[]{this})).intValue();
        }
        a aVar = this.mAdapter;
        if (aVar != null) {
            return aVar.getHeaderViewsCount();
        }
        return 0;
    }

    @Override // com.alilive.adapter.uikit.a
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        a aVar = this.mAdapter;
        if (aVar != null) {
            return aVar.getItemCount();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Paint paint;
        LinearGradient linearGradient;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.needCustomDraw && (paint = this.mPaint) != null && (linearGradient = this.mLinearGradient) != null) {
            paint.setShader(linearGradient);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, com.alilive.adapter.uikit.a
    public void removeOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4205c2e0", new Object[]{this, onScrollListener});
            return;
        }
        a aVar = this.mAdapter;
        if (aVar != null) {
            aVar.removeOnScrollListener(onScrollListener);
        }
    }

    public void setCustomDraw(Paint paint, LinearGradient linearGradient, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77b7e584", new Object[]{this, paint, linearGradient, new Boolean(z), new Integer(i)});
            return;
        }
        this.mPaint = paint;
        this.needCustomDraw = z;
        this.mLinearGradient = linearGradient;
        this.mDrawHeight = i;
    }

    @Override // com.alilive.adapter.uikit.a
    public void setOnItemClickListener(a.AbstractC0194a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b9e6656", new Object[]{this, aVar});
            return;
        }
        a aVar2 = this.mAdapter;
        if (aVar2 != null) {
            aVar2.setOnItemClickListener(aVar);
        }
    }

    public AliLiveRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.mDrawHeight = 0;
    }

    public AliLiveRecyclerView(Context context) {
        this(context, null);
    }
}
