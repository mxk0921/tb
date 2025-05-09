package com.google.android.material.transition;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import com.google.android.material.shape.b;
import com.google.android.material.transition.MaterialContainerTransform;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final Path f5203a = new Path();
    public final Path b = new Path();
    public final Path c = new Path();
    public final b d = new b();
    public com.google.android.material.shape.a e;

    public void a(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 23) {
            canvas.clipPath(this.f5203a);
            return;
        }
        canvas.clipPath(this.b);
        canvas.clipPath(this.c, Region.Op.UNION);
    }

    public void b(float f, com.google.android.material.shape.a aVar, com.google.android.material.shape.a aVar2, RectF rectF, RectF rectF2, RectF rectF3, MaterialContainerTransform.c cVar) {
        com.google.android.material.shape.a m = b.m(aVar, aVar2, rectF, rectF3, cVar.d(), cVar.c(), f);
        this.e = m;
        Path path = this.b;
        b bVar = this.d;
        bVar.d(m, 1.0f, rectF2, path);
        com.google.android.material.shape.a aVar3 = this.e;
        Path path2 = this.c;
        bVar.d(aVar3, 1.0f, rectF3, path2);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f5203a.op(path, path2, Path.Op.UNION);
        }
    }

    public com.google.android.material.shape.a c() {
        return this.e;
    }

    public Path d() {
        return this.f5203a;
    }
}
