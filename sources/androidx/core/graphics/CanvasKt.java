package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.g1a;
import tb.pg1;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\u00020\u0002*\u00020\u00002\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001aA\u0010\n\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\n\u0010\u000b\u001aK\u0010\u000f\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001aU\u0010\u0011\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012\u001aA\u0010\u0013\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u0013\u0010\u000b\u001a7\u0010\u0016\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a5\u0010\u001a\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a5\u0010\u001a\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001c2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u001a\u0010\u001d\u001aM\u0010\u001a\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u001e2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u001a\u0010#\u001aM\u0010\u001a\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u001a\u0010\u0012\u001a5\u0010\u001a\u001a\u00020\u0002*\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u001a\u0010&¨\u0006'"}, d2 = {"Landroid/graphics/Canvas;", "Lkotlin/Function1;", "Ltb/xhv;", "Lkotlin/ExtensionFunctionType;", pg1.ATOM_EXT_block, "withSave", "(Landroid/graphics/Canvas;Ltb/g1a;)V", "", "x", "y", "withTranslation", "(Landroid/graphics/Canvas;FFLtb/g1a;)V", "degrees", "pivotX", "pivotY", "withRotation", "(Landroid/graphics/Canvas;FFFLtb/g1a;)V", "withScale", "(Landroid/graphics/Canvas;FFFFLtb/g1a;)V", "withSkew", "Landroid/graphics/Matrix;", "matrix", "withMatrix", "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Ltb/g1a;)V", "Landroid/graphics/Rect;", "clipRect", "withClip", "(Landroid/graphics/Canvas;Landroid/graphics/Rect;Ltb/g1a;)V", "Landroid/graphics/RectF;", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;Ltb/g1a;)V", "", "left", "top", "right", "bottom", "(Landroid/graphics/Canvas;IIIILtb/g1a;)V", "Landroid/graphics/Path;", "clipPath", "(Landroid/graphics/Canvas;Landroid/graphics/Path;Ltb/g1a;)V", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class CanvasKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final void withClip(Canvas canvas, Rect rect, g1a<? super Canvas, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d07ca217", new Object[]{canvas, rect, g1aVar});
            return;
        }
        int save = canvas.save();
        canvas.clipRect(rect);
        try {
            g1aVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withMatrix(Canvas canvas, Matrix matrix, g1a<? super Canvas, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f8f80b", new Object[]{canvas, matrix, g1aVar});
            return;
        }
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            g1aVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static /* synthetic */ void withMatrix$default(Canvas canvas, Matrix matrix, g1a g1aVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6699b437", new Object[]{canvas, matrix, g1aVar, new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            matrix = new Matrix();
        }
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            g1aVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withRotation(Canvas canvas, float f, float f2, float f3, g1a<? super Canvas, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2536286c", new Object[]{canvas, new Float(f), new Float(f2), new Float(f3), g1aVar});
            return;
        }
        int save = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            g1aVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static /* synthetic */ void withRotation$default(Canvas canvas, float f, float f2, float f3, g1a g1aVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6abcf76", new Object[]{canvas, new Float(f), new Float(f2), new Float(f3), g1aVar, new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        int save = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            g1aVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withSave(Canvas canvas, g1a<? super Canvas, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da22d801", new Object[]{canvas, g1aVar});
            return;
        }
        int save = canvas.save();
        try {
            g1aVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withScale(Canvas canvas, float f, float f2, float f3, float f4, g1a<? super Canvas, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48f1f1e0", new Object[]{canvas, new Float(f), new Float(f2), new Float(f3), new Float(f4), g1aVar});
            return;
        }
        int save = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            g1aVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withSkew(Canvas canvas, float f, float f2, g1a<? super Canvas, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942ccc14", new Object[]{canvas, new Float(f), new Float(f2), g1aVar});
            return;
        }
        int save = canvas.save();
        canvas.skew(f, f2);
        try {
            g1aVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withTranslation(Canvas canvas, float f, float f2, g1a<? super Canvas, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaba3999", new Object[]{canvas, new Float(f), new Float(f2), g1aVar});
            return;
        }
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            g1aVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static /* synthetic */ void withTranslation$default(Canvas canvas, float f, float f2, g1a g1aVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63620343", new Object[]{canvas, new Float(f), new Float(f2), g1aVar, new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            g1aVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static /* synthetic */ void withSkew$default(Canvas canvas, float f, float f2, g1a g1aVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d52bbe8", new Object[]{canvas, new Float(f), new Float(f2), g1aVar, new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        int save = canvas.save();
        canvas.skew(f, f2);
        try {
            g1aVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withClip(Canvas canvas, RectF rectF, g1a<? super Canvas, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81421a1f", new Object[]{canvas, rectF, g1aVar});
            return;
        }
        int save = canvas.save();
        canvas.clipRect(rectF);
        try {
            g1aVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static /* synthetic */ void withScale$default(Canvas canvas, float f, float f2, float f3, float f4, g1a g1aVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23d335c", new Object[]{canvas, new Float(f), new Float(f2), new Float(f3), new Float(f4), g1aVar, new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        int save = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            g1aVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withClip(Canvas canvas, int i, int i2, int i3, int i4, g1a<? super Canvas, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13d8dbce", new Object[]{canvas, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), g1aVar});
            return;
        }
        int save = canvas.save();
        canvas.clipRect(i, i2, i3, i4);
        try {
            g1aVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withClip(Canvas canvas, float f, float f2, float f3, float f4, g1a<? super Canvas, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23a1a30e", new Object[]{canvas, new Float(f), new Float(f2), new Float(f3), new Float(f4), g1aVar});
            return;
        }
        int save = canvas.save();
        canvas.clipRect(f, f2, f3, f4);
        try {
            g1aVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withClip(Canvas canvas, Path path, g1a<? super Canvas, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("945ea836", new Object[]{canvas, path, g1aVar});
            return;
        }
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            g1aVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
