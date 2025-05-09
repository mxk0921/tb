package com.alibaba.security.ccrc.service.build;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.qp0;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.y  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1201y {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final float f2636a = 3.0f;
    public static final float b = 1048576.0f;
    public final List<Float> c;

    public C1201y() {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        arrayList.add(Float.valueOf(50.0f));
        Float valueOf = Float.valueOf(100.0f);
        arrayList.add(valueOf);
        arrayList.add(Float.valueOf(150.0f));
        arrayList.add(valueOf);
    }

    public C1168ia a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C1168ia) ipChange.ipc$dispatch("c192065c", new Object[]{this, bitmap});
        }
        if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return new C1168ia("image size error: bitmap 为空", -1);
        }
        if (bitmap.getConfig() == null) {
            return new C1168ia("image size error: bitmap config 为空", 1);
        }
        int max = Math.max(bitmap.getWidth(), bitmap.getHeight());
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        if (bitmap.getByteCount() >= a() * 1048576.0f) {
            StringBuilder a2 = Kb.a("image size error: bitmap 大小过大： ");
            a2.append(a());
            return new C1168ia(a2.toString(), 2);
        } else if (max / min < 3.0f) {
            return new C1168ia(null, 0);
        } else {
            StringBuilder a3 = Kb.a("image size error: bitmap 长宽比过大： ");
            a3.append(bitmap.getWidth());
            a3.append(" ");
            a3.append(bitmap.getHeight());
            return new C1168ia(a3.toString(), 3);
        }
    }

    private float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue();
        }
        List<Float> i = vb.c().i();
        if (i == null) {
            i = this.c;
        }
        int b2 = qp0.b();
        if (b2 == 2) {
            return i.get(0).floatValue();
        }
        if (b2 == 1) {
            return i.get(1).floatValue();
        }
        if (b2 == 0) {
            return i.get(2).floatValue();
        }
        return i.get(3).floatValue();
    }
}
