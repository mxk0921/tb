package com.alibaba.triver.triver_shop.newShop.view.extend;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.nsl;
import tb.osl;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class PartAlphaSupportFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float alphaWidth = 100.0f;
    private Paint leftAlphaPaint;
    private Paint rightAlphaPaint;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                PartAlphaSupportFrameLayout.access$initPaint(PartAlphaSupportFrameLayout.this);
            }
        }
    }

    static {
        t2o.a(766510091);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartAlphaSupportFrameLayout(Context context) {
        super(context);
        ckf.g(context, "context");
        setWillNotDraw(false);
        post(new a());
    }

    public static final /* synthetic */ void access$initPaint(PartAlphaSupportFrameLayout partAlphaSupportFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ae9febd", new Object[]{partAlphaSupportFrameLayout});
        } else {
            partAlphaSupportFrameLayout.initPaint();
        }
    }

    public static /* synthetic */ Object ipc$super(PartAlphaSupportFrameLayout partAlphaSupportFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == -1665133574) {
            super.draw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/extend/PartAlphaSupportFrameLayout");
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
        } else if (canvas != null) {
            if (this.leftAlphaPaint == null) {
                super.draw(canvas);
                return;
            }
            canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            super.draw(canvas);
            float height = getHeight();
            Paint paint = this.leftAlphaPaint;
            if (paint != null) {
                canvas.drawRect(0.0f, 0.0f, 250.0f, height, paint);
                float right = getRight() - this.alphaWidth;
                float right2 = getRight();
                float height2 = getHeight();
                Paint paint2 = this.rightAlphaPaint;
                if (paint2 != null) {
                    canvas.drawRect(right, 0.0f, right2, height2, paint2);
                    canvas.restore();
                    return;
                }
                ckf.y("rightAlphaPaint");
                throw null;
            }
            ckf.y("leftAlphaPaint");
            throw null;
        }
    }

    public final void setAlphaSize(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e78bb9fc", new Object[]{this, new Float(f)});
            return;
        }
        this.alphaWidth = f;
        initPaint();
        invalidate();
    }

    private final void initPaint() {
        ColorSpace.Named named;
        ColorSpace colorSpace;
        long convert;
        ColorSpace.Named named2;
        ColorSpace colorSpace2;
        long convert2;
        ColorSpace.Named named3;
        ColorSpace colorSpace3;
        long convert3;
        ColorSpace.Named named4;
        ColorSpace colorSpace4;
        long convert4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b778ab5", new Object[]{this});
            return;
        }
        Paint paint = new Paint();
        this.leftAlphaPaint = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.leftAlphaPaint;
        if (paint2 != null) {
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint3 = this.leftAlphaPaint;
            if (paint3 != null) {
                osl.a();
                float f = this.alphaWidth;
                int argb = Color.argb(0, 0, 0, 0);
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                convert = Color.convert(argb, colorSpace);
                int argb2 = Color.argb(255, 0, 0, 0);
                named2 = ColorSpace.Named.SRGB;
                colorSpace2 = ColorSpace.get(named2);
                convert2 = Color.convert(argb2, colorSpace2);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint3.setShader(nsl.a(0.0f, 0.0f, f, 0.0f, convert, convert2, tileMode));
                Paint paint4 = new Paint();
                this.rightAlphaPaint = paint4;
                paint4.setAntiAlias(true);
                Paint paint5 = this.rightAlphaPaint;
                if (paint5 != null) {
                    paint5.setXfermode(new PorterDuffXfermode(mode));
                    Paint paint6 = this.rightAlphaPaint;
                    if (paint6 != null) {
                        osl.a();
                        int argb3 = Color.argb(255, 0, 0, 0);
                        named3 = ColorSpace.Named.SRGB;
                        colorSpace3 = ColorSpace.get(named3);
                        convert3 = Color.convert(argb3, colorSpace3);
                        int argb4 = Color.argb(0, 0, 0, 0);
                        named4 = ColorSpace.Named.SRGB;
                        colorSpace4 = ColorSpace.get(named4);
                        convert4 = Color.convert(argb4, colorSpace4);
                        paint6.setShader(nsl.a(getRight() - this.alphaWidth, 0.0f, getRight(), 0.0f, convert3, convert4, tileMode));
                        return;
                    }
                    ckf.y("rightAlphaPaint");
                    throw null;
                }
                ckf.y("rightAlphaPaint");
                throw null;
            }
            ckf.y("leftAlphaPaint");
            throw null;
        }
        ckf.y("leftAlphaPaint");
        throw null;
    }
}
