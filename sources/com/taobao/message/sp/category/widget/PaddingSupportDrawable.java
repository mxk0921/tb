package com.taobao.message.sp.category.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.PropertyReference1Impl;
import tb.a07;
import tb.a0g;
import tb.ckf;
import tb.dun;
import tb.njg;
import tb.t2o;
import tb.vaj;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR*\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0011R*\u0010%\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0011¨\u0006)"}, d2 = {"Lcom/taobao/message/sp/category/widget/PaddingSupportDrawable;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "Ltb/xhv;", "calcOpaqueRect", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "", "alpha", "setAlpha", "(I)V", "getOpacity", "()I", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "opaqueRect", "Landroid/graphics/Rect;", "Landroid/graphics/Paint;", "paint$delegate", "Ltb/njg;", "getPaint", "()Landroid/graphics/Paint;", "paint", "value", vaj.KEY_BG_COLOR, TLogTracker.LEVEL_INFO, "getBgColor", "setBgColor", "paddingTop", "getPaddingTop", "setPaddingTop", "Companion", "message_sp_category_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class PaddingSupportDrawable extends Drawable {
    public static final /* synthetic */ a0g[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "PaddingSupportDrawable";
    private int paddingTop;
    private final Rect opaqueRect = new Rect();
    private final njg paint$delegate = a.b(new PaddingSupportDrawable$paint$2(this));
    private int bgColor = -1;

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/message/sp/category/widget/PaddingSupportDrawable$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "message_sp_category_debug"}, k = 1, mv = {1, 1, 15})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class Companion {
        static {
            t2o.a(550502435);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }
    }

    private final void calcOpaqueRect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27201161", new Object[]{this});
        } else if (getBounds().height() >= 0) {
            this.opaqueRect.top = getBounds().top + Math.max(this.paddingTop, 0);
        }
    }

    private final Paint getPaint() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("daa8bf5c", new Object[]{this});
        } else {
            njg njgVar = this.paint$delegate;
            a0g a0gVar = $$delegatedProperties[0];
            value = njgVar.getValue();
        }
        return (Paint) value;
    }

    public static /* synthetic */ Object ipc$super(PaddingSupportDrawable paddingSupportDrawable, String str, Object... objArr) {
        if (str.hashCode() == -2054040210) {
            super.onBoundsChange((Rect) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/sp/category/widget/PaddingSupportDrawable");
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        ckf.h(canvas, "canvas");
        if (this.opaqueRect.height() > 0) {
            canvas.drawRect(this.opaqueRect, getPaint());
        }
    }

    public final int getBgColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1061a262", new Object[]{this})).intValue();
        }
        return this.bgColor;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return -2;
    }

    public final int getPaddingTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c5536f4", new Object[]{this})).intValue();
        }
        return this.paddingTop;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8591d56e", new Object[]{this, rect});
            return;
        }
        ckf.h(rect, "bounds");
        super.onBoundsChange(rect);
        this.opaqueRect.set(rect);
        calcOpaqueRect();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        }
    }

    public final void setBgColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321c1980", new Object[]{this, new Integer(i)});
            return;
        }
        this.bgColor = i;
        getPaint().setColor(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        }
    }

    public final void setPaddingTop(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a528b596", new Object[]{this, new Integer(i)});
            return;
        }
        this.paddingTop = i;
        new StringBuilder("setPaddingTop: ").append(i);
        calcOpaqueRect();
        invalidateSelf();
    }

    static {
        t2o.a(550502434);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(dun.b(PaddingSupportDrawable.class), "paint", "getPaint()Landroid/graphics/Paint;");
        dun.i(propertyReference1Impl);
        $$delegatedProperties = new a0g[]{propertyReference1Impl};
    }
}
