package com.taobao.weex.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXThread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class BoxShadowUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f14139a = true;
    public static Pattern b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class BoxShadowOptions {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List<IParser> f14140a;
        public final int b;
        public float blur;
        public int color;
        public float hShadow;
        public boolean isInset;
        public float[] radii;
        public float spread;
        public PointF topLeft;
        public float vShadow;
        public int viewHeight;
        public int viewWidth;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public interface IParser {
            void parse(String str);
        }

        static {
            t2o.a(985661794);
        }

        public static /* synthetic */ List access$500(BoxShadowOptions boxShadowOptions) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("8ef94f7f", new Object[]{boxShadowOptions});
            }
            return boxShadowOptions.f14140a;
        }

        public static /* synthetic */ int access$600(BoxShadowOptions boxShadowOptions) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("244e5a3c", new Object[]{boxShadowOptions})).intValue();
            }
            return boxShadowOptions.b;
        }

        public Rect getTargetCanvasRect() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Rect) ipChange.ipc$dispatch("2b605413", new Object[]{this});
            }
            return new Rect(0, 0, this.viewWidth + (((int) (this.blur + this.spread + Math.abs(this.hShadow))) * 2), this.viewHeight + (((int) (this.blur + this.spread + Math.abs(this.vShadow))) * 2));
        }

        public BoxShadowOptions scale(WXSDKInstance wXSDKInstance, float f) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BoxShadowOptions) ipChange.ipc$dispatch("c6b0745f", new Object[]{this, wXSDKInstance, new Float(f)});
            }
            if (f <= 0.0f || f > 1.0f) {
                return null;
            }
            BoxShadowOptions boxShadowOptions = new BoxShadowOptions(wXSDKInstance, this.b);
            boxShadowOptions.hShadow = this.hShadow * f;
            boxShadowOptions.vShadow = this.vShadow * f;
            boxShadowOptions.blur = this.blur * f;
            boxShadowOptions.spread = this.spread * f;
            while (true) {
                float[] fArr = this.radii;
                if (i >= fArr.length) {
                    break;
                }
                boxShadowOptions.radii[i] = fArr[i] * f;
                i++;
            }
            boxShadowOptions.viewHeight = (int) (this.viewHeight * f);
            boxShadowOptions.viewWidth = (int) (this.viewWidth * f);
            if (this.topLeft != null) {
                PointF pointF = new PointF();
                boxShadowOptions.topLeft = pointF;
                PointF pointF2 = this.topLeft;
                pointF.x = pointF2.x * f;
                pointF.y = pointF2.y * f;
            }
            boxShadowOptions.color = this.color;
            boxShadowOptions.isInset = this.isInset;
            WXLogUtils.d("BoxShadowUtil", "Scaled BoxShadowOptions: [" + f + "] " + boxShadowOptions);
            return boxShadowOptions;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuffer stringBuffer = new StringBuffer("BoxShadowOptions{h-shadow=");
            stringBuffer.append(this.hShadow);
            stringBuffer.append(", v-shadow=");
            stringBuffer.append(this.vShadow);
            stringBuffer.append(", blur=");
            stringBuffer.append(this.blur);
            stringBuffer.append(", spread=");
            stringBuffer.append(this.spread);
            stringBuffer.append(", corner-radius=");
            stringBuffer.append("[" + this.radii[0] + "," + this.radii[2] + "," + this.radii[4] + "," + this.radii[6] + "]");
            stringBuffer.append(", color=#");
            stringBuffer.append(Integer.toHexString(this.color));
            stringBuffer.append(", inset=");
            stringBuffer.append(this.isInset);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }

        public BoxShadowOptions(final WXSDKInstance wXSDKInstance, int i) {
            this.b = 750;
            this.blur = 0.0f;
            this.spread = 0.0f;
            this.radii = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
            this.color = -16777216;
            this.isInset = false;
            this.viewWidth = 0;
            this.viewHeight = 0;
            this.topLeft = null;
            this.b = i;
            ArrayList arrayList = new ArrayList();
            this.f14140a = arrayList;
            IParser iParser = new IParser() { // from class: com.taobao.weex.utils.BoxShadowUtil.BoxShadowOptions.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.weex.utils.BoxShadowUtil.BoxShadowOptions.IParser
                public void parse(String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("f571fd04", new Object[]{this, str});
                    } else if (!TextUtils.isEmpty(str)) {
                        float floatValue = WXUtils.getFloat(str, Float.valueOf(0.0f)).floatValue();
                        BoxShadowOptions boxShadowOptions = BoxShadowOptions.this;
                        boxShadowOptions.spread = WXViewInnerUtils.getRealSubPxByWidth(wXSDKInstance, floatValue, BoxShadowOptions.access$600(boxShadowOptions));
                        WXLogUtils.w("BoxShadowUtil", "Experimental box-shadow attribute: spread");
                    }
                }
            };
            arrayList.add(new IParser() { // from class: com.taobao.weex.utils.BoxShadowUtil.BoxShadowOptions.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.weex.utils.BoxShadowUtil.BoxShadowOptions.IParser
                public void parse(String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("f571fd04", new Object[]{this, str});
                    } else if (!TextUtils.isEmpty(str)) {
                        float floatValue = WXUtils.getFloat(str, Float.valueOf(0.0f)).floatValue();
                        BoxShadowOptions boxShadowOptions = BoxShadowOptions.this;
                        boxShadowOptions.blur = WXViewInnerUtils.getRealSubPxByWidth(wXSDKInstance, floatValue, BoxShadowOptions.access$600(boxShadowOptions));
                    }
                }
            });
            arrayList.add(iParser);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class InsetShadowDrawable extends Drawable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final float f14141a;
        public final int b;
        public final float[] c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final Shader[] h;
        public final Path[] i;
        public Paint j;

        static {
            t2o.a(985661798);
        }

        public static /* synthetic */ Object ipc$super(InsetShadowDrawable insetShadowDrawable, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/utils/BoxShadowUtil$InsetShadowDrawable");
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1afb60e", new Object[]{this});
                return;
            }
            PointF pointF = new PointF(0.0f, 0.0f);
            PointF pointF2 = new PointF(this.d, 0.0f);
            PointF pointF3 = new PointF(pointF2.x, this.e);
            PointF pointF4 = new PointF(pointF.x, pointF3.y);
            PointF pointF5 = new PointF(this.f, this.g);
            PointF pointF6 = new PointF(pointF2.x - this.f, pointF5.y);
            PointF pointF7 = new PointF(pointF6.x, pointF3.y - this.g);
            PointF pointF8 = new PointF(pointF5.x, pointF7.y);
            float f = pointF5.x;
            float f2 = f - this.f14141a;
            float f3 = pointF5.y;
            int i = this.b;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(f2, f3, f, f3, i, 0, tileMode);
            float f4 = pointF5.x;
            float f5 = pointF5.y;
            LinearGradient linearGradient2 = new LinearGradient(f4, f5 - this.f14141a, f4, f5, this.b, 0, tileMode);
            float f6 = pointF7.x;
            float f7 = f6 + this.f14141a;
            float f8 = pointF7.y;
            LinearGradient linearGradient3 = new LinearGradient(f7, f8, f6, f8, this.b, 0, tileMode);
            float f9 = pointF7.x;
            float f10 = pointF7.y;
            LinearGradient linearGradient4 = new LinearGradient(f9, f10 + this.f14141a, f9, f10, this.b, 0, tileMode);
            Shader[] shaderArr = this.h;
            shaderArr[0] = linearGradient;
            shaderArr[1] = linearGradient2;
            shaderArr[2] = linearGradient3;
            shaderArr[3] = linearGradient4;
            Path path = new Path();
            path.moveTo(pointF.x, pointF.y);
            path.lineTo(pointF5.x, pointF5.y);
            path.lineTo(pointF8.x, pointF8.y);
            path.lineTo(pointF4.x, pointF4.y);
            path.close();
            Path path2 = new Path();
            path2.moveTo(pointF.x, pointF.y);
            path2.lineTo(pointF2.x, pointF2.y);
            path2.lineTo(pointF6.x, pointF6.y);
            path2.lineTo(pointF5.x, pointF5.y);
            path2.close();
            Path path3 = new Path();
            path3.moveTo(pointF2.x, pointF2.y);
            path3.lineTo(pointF3.x, pointF3.y);
            path3.lineTo(pointF7.x, pointF7.y);
            path3.lineTo(pointF6.x, pointF6.y);
            path3.close();
            Path path4 = new Path();
            path4.moveTo(pointF4.x, pointF4.y);
            path4.lineTo(pointF3.x, pointF3.y);
            path4.lineTo(pointF7.x, pointF7.y);
            path4.lineTo(pointF8.x, pointF8.y);
            path4.close();
            Path[] pathArr = this.i;
            pathArr[0] = path;
            pathArr[1] = path2;
            pathArr[2] = path3;
            pathArr[3] = path4;
            Paint paint = new Paint();
            this.j = paint;
            paint.setAntiAlias(true);
            this.j.setStyle(Paint.Style.FILL);
            this.j.setColor(this.b);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
                return;
            }
            Rect clipBounds = canvas.getClipBounds();
            Path path = new Path();
            path.addRoundRect(new RectF(clipBounds), this.c, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(clipBounds.left, clipBounds.top);
            for (int i = 0; i < 4; i++) {
                Shader shader = this.h[i];
                Path path2 = this.i[i];
                this.j.setShader(shader);
                canvas.drawPath(path2, this.j);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
            }
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
            }
        }

        public InsetShadowDrawable(int i, int i2, float f, float f2, float f3, float f4, int i3, float[] fArr) {
            this.h = new Shader[4];
            this.i = new Path[4];
            this.f14141a = f3;
            this.b = i3;
            this.d = i + (f * 2.0f);
            this.e = i2 + (2.0f * f2);
            this.f = f + f4;
            this.g = f2 + f4;
            this.c = fArr;
            setBounds(0, 0, i, i2);
            a();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class OverflowBitmapDrawable extends BitmapDrawable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f14142a;
        public final int b;
        public final float[] c;

        static {
            t2o.a(985661799);
        }

        public static /* synthetic */ Object ipc$super(OverflowBitmapDrawable overflowBitmapDrawable, String str, Object... objArr) {
            if (str.hashCode() == -1665133574) {
                super.draw((Canvas) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/utils/BoxShadowUtil$OverflowBitmapDrawable");
        }

        @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
                return;
            }
            Rect clipBounds = canvas.getClipBounds();
            Rect rect = new Rect(clipBounds);
            rect.inset((-this.f14142a) * 2, (-this.b) * 2);
            try {
                if (WXEnvironment.sApplication.getApplicationInfo().targetSdkVersion > 26) {
                    canvas.clipRect(rect);
                } else {
                    canvas.clipRect(rect, Region.Op.REPLACE);
                }
            } catch (NullPointerException unused) {
                canvas.clipRect(rect);
            }
            Path path = new Path();
            path.addRoundRect(new RectF(clipBounds), this.c, Path.Direction.CCW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.translate(clipBounds.left, clipBounds.top);
            super.draw(canvas);
        }

        public OverflowBitmapDrawable(Resources resources, Bitmap bitmap, Point point, Rect rect, float[] fArr) {
            super(resources, bitmap);
            int i = point.x;
            this.f14142a = i;
            int i2 = point.y;
            this.b = i2;
            this.c = fArr;
            setBounds(-i, -i2, rect.width() + i, rect.height() + i2);
        }
    }

    static {
        t2o.a(985661792);
    }

    public static void a(Canvas canvas, BoxShadowOptions boxShadowOptions) {
        float f;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("505a3946", new Object[]{canvas, boxShadowOptions});
            return;
        }
        float f2 = boxShadowOptions.spread;
        RectF rectF = new RectF(0.0f, 0.0f, boxShadowOptions.viewWidth + (f2 * 2.0f), boxShadowOptions.viewHeight + (f2 * 2.0f));
        PointF pointF = boxShadowOptions.topLeft;
        if (pointF != null) {
            rectF.offset(pointF.x, pointF.y);
        }
        float f3 = boxShadowOptions.blur;
        float f4 = boxShadowOptions.hShadow;
        if (f4 > 0.0f) {
            f = (f4 * 2.0f) + f3;
        } else {
            f = f3;
        }
        float f5 = boxShadowOptions.vShadow;
        if (f5 > 0.0f) {
            f3 += f5 * 2.0f;
        }
        rectF.offset(f, f3);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(boxShadowOptions.color);
        paint.setStyle(Paint.Style.FILL);
        if (boxShadowOptions.blur > 0.0f) {
            paint.setMaskFilter(new BlurMaskFilter(boxShadowOptions.blur, BlurMaskFilter.Blur.NORMAL));
        }
        Path path = new Path();
        float[] fArr = new float[8];
        while (true) {
            float[] fArr2 = boxShadowOptions.radii;
            if (i < fArr2.length) {
                float f6 = fArr2[i];
                if (f6 == 0.0f) {
                    fArr[i] = 0.0f;
                } else {
                    fArr[i] = f6 + boxShadowOptions.spread;
                }
                i++;
            } else {
                path.addRoundRect(rectF, fArr, Path.Direction.CCW);
                canvas.drawPath(path, paint);
                return;
            }
        }
    }

    public static /* synthetic */ void access$000(WXSDKInstance wXSDKInstance, View view, List list, float f, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fa5893f", new Object[]{wXSDKInstance, view, list, new Float(f), fArr});
        } else {
            d(wXSDKInstance, view, list, f, fArr);
        }
    }

    public static /* synthetic */ void access$100(View view, List list, float f, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb8417a0", new Object[]{view, list, new Float(f), fArr});
        } else {
            c(view, list, f, fArr);
        }
    }

    public static void c(View view, List<BoxShadowOptions> list, float f, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df9b8d5f", new Object[]{view, list, new Float(f), fArr});
        } else if (view == null || list == null) {
            WXLogUtils.w("BoxShadowUtil", "Illegal arguments");
        } else if (view.getWidth() == 0 || view.getHeight() == 0) {
            WXLogUtils.w("BoxShadowUtil", "Target view is invisible, ignore set shadow.");
        } else {
            Drawable[] drawableArr = new Drawable[list.size()];
            for (int i = 0; i < list.size(); i++) {
                BoxShadowOptions boxShadowOptions = list.get(i);
                drawableArr[i] = new InsetShadowDrawable(view.getWidth(), view.getHeight(), boxShadowOptions.hShadow, boxShadowOptions.vShadow, boxShadowOptions.blur, boxShadowOptions.spread, boxShadowOptions.color, fArr);
            }
            view.getOverlay().add(new LayerDrawable(drawableArr));
            view.invalidate();
        }
    }

    public static void d(WXSDKInstance wXSDKInstance, View view, List<BoxShadowOptions> list, float f, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8affa38d", new Object[]{wXSDKInstance, view, list, new Float(f), fArr});
            return;
        }
        int height = view.getHeight();
        int width = view.getWidth();
        view.getLayoutParams();
        if (!(height == 0 || width == 0)) {
            int i = 0;
            int i2 = 0;
            for (BoxShadowOptions boxShadowOptions : list) {
                boxShadowOptions.viewWidth = width;
                boxShadowOptions.viewHeight = height;
                boxShadowOptions.radii = fArr;
                Rect targetCanvasRect = boxShadowOptions.getTargetCanvasRect();
                if (i < targetCanvasRect.width()) {
                    i = targetCanvasRect.width();
                }
                if (i2 < targetCanvasRect.height()) {
                    i2 = targetCanvasRect.height();
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap((int) (i * f), (int) (i2 * f), Bitmap.Config.ARGB_4444);
            WXLogUtils.d("BoxShadowUtil", "Allocation memory for box-shadow: " + (createBitmap.getAllocationByteCount() / 1024) + " KB");
            Canvas canvas = new Canvas(createBitmap);
            for (BoxShadowOptions boxShadowOptions2 : list) {
                Rect targetCanvasRect2 = boxShadowOptions2.getTargetCanvasRect();
                boxShadowOptions2.topLeft = new PointF((i - targetCanvasRect2.width()) / 2.0f, (i2 - targetCanvasRect2.height()) / 2.0f);
                a(canvas, boxShadowOptions2.scale(wXSDKInstance, f));
            }
            OverflowBitmapDrawable overflowBitmapDrawable = new OverflowBitmapDrawable(view.getResources(), createBitmap, new Point((i - width) / 2, (i2 - height) / 2), new Rect(0, 0, width, height), fArr);
            view.getOverlay().add(overflowBitmapDrawable);
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestLayout();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).invalidate(overflowBitmapDrawable.getBounds());
                }
            }
        }
    }

    public static boolean isBoxShadowEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc6f7bcb", new Object[0])).booleanValue();
        }
        return f14139a;
    }

    public static BoxShadowOptions[] parseBoxShadows(WXSDKInstance wXSDKInstance, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BoxShadowOptions[]) ipChange.ipc$dispatch("f70f733e", new Object[]{wXSDKInstance, str, new Integer(i)});
        }
        if (b == null) {
            b = Pattern.compile("([rR][gG][bB][aA]?)\\((\\d+\\s*),\\s*(\\d+\\s*),\\s*(\\d+\\s*)(?:,\\s*(\\d+(?:\\.\\d+)?))?\\)");
        }
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            String group = matcher.group();
            str = str.replace(group, "#" + String.format("%8s", Integer.toHexString(WXResourceUtils.getColor(group, -16777216))).replaceAll("\\s", "0"));
        }
        String[] split = str.split(",");
        if (split == null || split.length <= 0) {
            return null;
        }
        BoxShadowOptions[] boxShadowOptionsArr = new BoxShadowOptions[split.length];
        for (int i2 = 0; i2 < split.length; i2++) {
            boxShadowOptionsArr[i2] = b(wXSDKInstance, split[i2], i);
        }
        return boxShadowOptionsArr;
    }

    public static void setBoxShadow(final WXSDKInstance wXSDKInstance, final View view, String str, final float[] fArr, int i, final float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a84608a6", new Object[]{wXSDKInstance, view, str, fArr, new Integer(i), new Float(f)});
        } else if (!f14139a) {
            WXLogUtils.w("BoxShadowUtil", "box-shadow was disabled by config");
        } else if (view == null) {
            WXLogUtils.w("BoxShadowUtil", "Target view is null!");
        } else if (TextUtils.isEmpty(str)) {
            view.getOverlay().clear();
            WXLogUtils.d("BoxShadowUtil", "Remove all box-shadow");
        } else {
            BoxShadowOptions[] parseBoxShadows = parseBoxShadows(wXSDKInstance, str, i);
            if (parseBoxShadows == null || parseBoxShadows.length == 0) {
                WXLogUtils.w("BoxShadowUtil", "Failed to parse box-shadow: " + str);
                return;
            }
            final ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = new ArrayList();
            for (BoxShadowOptions boxShadowOptions : parseBoxShadows) {
                if (boxShadowOptions != null) {
                    if (boxShadowOptions.isInset) {
                        arrayList2.add(0, boxShadowOptions);
                    } else {
                        arrayList.add(0, boxShadowOptions);
                    }
                }
            }
            if (fArr != null) {
                if (fArr.length != 8) {
                    WXLogUtils.w("BoxShadowUtil", "Length of radii must be 8");
                } else {
                    for (int i2 = 0; i2 < fArr.length; i2++) {
                        fArr[i2] = WXViewInnerUtils.getRealSubPxByWidth(wXSDKInstance, fArr[i2], i);
                    }
                }
            }
            view.post(WXThread.secure(new Runnable() { // from class: com.taobao.weex.utils.BoxShadowUtil.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    view.getOverlay().clear();
                    if (arrayList.size() > 0) {
                        BoxShadowUtil.access$000(wXSDKInstance, view, arrayList, f, fArr);
                    }
                    if (arrayList2.size() > 0) {
                        BoxShadowUtil.access$100(view, arrayList2, f, fArr);
                    }
                }
            }));
        }
    }

    public static void setBoxShadowEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23f333b5", new Object[]{new Boolean(z)});
            return;
        }
        f14139a = z;
        WXLogUtils.w("BoxShadowUtil", "Switch box-shadow status: " + z);
    }

    public static BoxShadowOptions b(WXSDKInstance wXSDKInstance, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BoxShadowOptions) ipChange.ipc$dispatch("58eee538", new Object[]{wXSDKInstance, str, new Integer(i)});
        }
        BoxShadowOptions boxShadowOptions = new BoxShadowOptions(wXSDKInstance, i);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String replaceAll = str.replaceAll("\\s*,\\s+", ",");
        if (replaceAll.contains("inset")) {
            boxShadowOptions.isInset = true;
            replaceAll = replaceAll.replace("inset", "");
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(replaceAll.trim().split("\\s+")));
        String str2 = (String) arrayList.get(arrayList.size() - 1);
        if (!TextUtils.isEmpty(str2) && (str2.startsWith("#") || str2.startsWith("rgb") || WXResourceUtils.isNamedColor(str2))) {
            boxShadowOptions.color = WXResourceUtils.getColor(str2, -16777216);
            arrayList.remove(arrayList.size() - 1);
        }
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (arrayList.size() < 2) {
            return null;
        }
        if (!TextUtils.isEmpty((CharSequence) arrayList.get(0))) {
            boxShadowOptions.hShadow = WXViewInnerUtils.getRealSubPxByWidth(wXSDKInstance, WXUtils.getFloat(((String) arrayList.get(0)).trim(), Float.valueOf(0.0f)).floatValue(), i);
        }
        if (!TextUtils.isEmpty((CharSequence) arrayList.get(1))) {
            boxShadowOptions.vShadow = WXViewInnerUtils.getRealPxByWidth(wXSDKInstance, WXUtils.getFloat(((String) arrayList.get(1)).trim(), Float.valueOf(0.0f)).floatValue(), i);
        }
        for (int i2 = 2; i2 < arrayList.size(); i2++) {
            ((BoxShadowOptions.IParser) BoxShadowOptions.access$500(boxShadowOptions).get(i2 - 2)).parse((String) arrayList.get(i2));
        }
        return boxShadowOptions;
    }
}
