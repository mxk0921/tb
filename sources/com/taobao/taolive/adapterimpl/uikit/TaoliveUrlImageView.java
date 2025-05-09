package com.taobao.taolive.adapterimpl.uikit;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.effects.RoundedCornersBitmapProcessor;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.bec;
import tb.cy0;
import tb.iy4;
import tb.s8d;
import tb.t2o;
import tb.uwn;
import tb.yf2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TaoliveUrlImageView extends TUrlImageView implements AliUrlImageView.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private bec mIImageLoadListener;
    private int mLoopCount;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (TaoliveUrlImageView.access$000(TaoliveUrlImageView.this) > 0) {
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                if (drawable instanceof cy0) {
                    ((cy0) drawable).B(TaoliveUrlImageView.access$000(TaoliveUrlImageView.this));
                }
            }
            if (!(TaoliveUrlImageView.access$100(TaoliveUrlImageView.this) == null || succPhenixEvent == null)) {
                if (succPhenixEvent.getDrawable() instanceof uwn) {
                    ((uwn) succPhenixEvent.getDrawable()).l();
                }
                TaoliveUrlImageView.access$100(TaoliveUrlImageView.this).a(succPhenixEvent.getDrawable());
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            if (TaoliveUrlImageView.access$100(TaoliveUrlImageView.this) != null) {
                TaoliveUrlImageView.access$100(TaoliveUrlImageView.this).onFailed();
            }
            return false;
        }
    }

    static {
        t2o.a(779092379);
        t2o.a(806354971);
    }

    public TaoliveUrlImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.succListener(new a());
        super.failListener(new b());
    }

    public static /* synthetic */ int access$000(TaoliveUrlImageView taoliveUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc1ebe5b", new Object[]{taoliveUrlImageView})).intValue();
        }
        return taoliveUrlImageView.mLoopCount;
    }

    public static /* synthetic */ bec access$100(TaoliveUrlImageView taoliveUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bec) ipChange.ipc$dispatch("8c15c170", new Object[]{taoliveUrlImageView});
        }
        return taoliveUrlImageView.mIImageLoadListener;
    }

    public static /* synthetic */ Object ipc$super(TaoliveUrlImageView taoliveUrlImageView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -818596364) {
            return super.failListener((s8d) objArr[0]);
        }
        if (hashCode == 101738488) {
            super.setPhenixOptions((PhenixOptions) objArr[0]);
            return null;
        } else if (hashCode == 1123925784) {
            return super.succListener((s8d) objArr[0]);
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/adapterimpl/uikit/TaoliveUrlImageView");
        }
    }

    @Override // com.alilive.adapter.uikit.AliUrlImageView.a
    public void initAttr(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15121a6e", new Object[]{this, context, attributeSet});
        }
    }

    public void onDestory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbef83c", new Object[]{this});
        } else {
            setLoadListener(null);
        }
    }

    @Override // com.alilive.adapter.uikit.AliUrlImageView.a
    public void setBlur(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e71dc38", new Object[]{this, context, new Integer(i), new Integer(i2)});
        } else {
            super.setPhenixOptions(new PhenixOptions().bitmapProcessors(new yf2(context, i, i2)));
        }
    }

    @Override // com.alilive.adapter.uikit.AliUrlImageView.a
    public void setCircleView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bda86a9e", new Object[]{this});
        } else {
            super.setPhenixOptions(new PhenixOptions().bitmapProcessors(new iy4()));
        }
    }

    @Override // com.alilive.adapter.uikit.AliUrlImageView.a
    public void setCropCircleView(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5b0c11", new Object[]{this, new Float(f), new Integer(i)});
        } else {
            super.setPhenixOptions(new PhenixOptions().bitmapProcessors(new iy4(f, i)));
        }
    }

    @Override // com.alilive.adapter.uikit.AliUrlImageView.a
    public void setLoadListener(bec becVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7596f526", new Object[]{this, becVar});
        } else {
            this.mIImageLoadListener = becVar;
        }
    }

    @Override // com.alilive.adapter.uikit.AliUrlImageView.a
    public void setMaxLoopCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4742ebb3", new Object[]{this, new Integer(i)});
        } else {
            this.mLoopCount = i;
        }
    }

    @Override // com.alilive.adapter.uikit.AliUrlImageView.a
    public void setPlaceHolder(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ffa0e2b", new Object[]{this, new Integer(i)});
        } else {
            setPlaceHoldImageResId(i);
        }
    }

    @Override // com.alilive.adapter.uikit.AliUrlImageView.a
    public void setRoundeCornerView(int i, int i2, int i3, int i4, int i5) {
        RoundedCornersBitmapProcessor.CornerType cornerType;
        RoundedCornersBitmapProcessor.CornerType cornerType2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bd52869", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        RoundedCornersBitmapProcessor.CornerType cornerType3 = RoundedCornersBitmapProcessor.CornerType.ALL;
        if (i5 != 0) {
            if (i5 == 1) {
                cornerType2 = RoundedCornersBitmapProcessor.CornerType.TOP;
            } else if (i5 == 2) {
                cornerType2 = RoundedCornersBitmapProcessor.CornerType.BOTTOM;
            } else if (i5 == 3) {
                cornerType2 = RoundedCornersBitmapProcessor.CornerType.LEFT;
            } else if (i5 == 4) {
                cornerType2 = RoundedCornersBitmapProcessor.CornerType.RIGHT;
            }
            cornerType = cornerType2;
            super.setPhenixOptions(new PhenixOptions().bitmapProcessors(new RoundedCornersBitmapProcessor(i, i2, i3, i4, cornerType)));
        }
        cornerType = cornerType3;
        super.setPhenixOptions(new PhenixOptions().bitmapProcessors(new RoundedCornersBitmapProcessor(i, i2, i3, i4, cornerType)));
    }

    public TaoliveUrlImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TaoliveUrlImageView(Context context) {
        this(context, null);
    }
}
