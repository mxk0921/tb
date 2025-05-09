package com.taobao.android.nanocompose.runtime.component_descriptor;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement;
import com.taobao.android.nanocompose.foundation.layout.RowColumn.LayoutOrientation;
import com.taobao.android.nanocompose.foundation.layout.RowColumn.RowColumnMeasurePolicy;
import tb.can;
import tb.d3z;
import tb.j2z;
import tb.mdz;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class InnerComponentProviderKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final mdz c;
    public static final mdz e;

    /* renamed from: a  reason: collision with root package name */
    public static final j2z f9024a = new j2z(new ComponentDescriptorParameters("View", -1, null, null, InnerComponentProviderKt$VIEW_PROVIDER$1.INSTANCE, InnerComponentProviderKt$VIEW_PROVIDER$2.INSTANCE, false, null, null, 456, null), InnerComponentProviderKt$VIEW_PROVIDER$3.INSTANCE);
    public static final j2z b = new j2z(new ComponentDescriptorParameters("RootView", -73401881, null, InnerComponentProviderKt$ROOT_PROVIDER$1.INSTANCE, InnerComponentProviderKt$ROOT_PROVIDER$2.INSTANCE, InnerComponentProviderKt$ROOT_PROVIDER$3.INSTANCE, false, null, null, 448, null), InnerComponentProviderKt$ROOT_PROVIDER$4.INSTANCE);
    public static final j2z d = new j2z(new ComponentDescriptorParameters("Row", 378804431, null, InnerComponentProviderKt$ROW_PROVIDER$1.INSTANCE, InnerComponentProviderKt$ROW_PROVIDER$2.INSTANCE, InnerComponentProviderKt$ROW_PROVIDER$3.INSTANCE, false, null, null, 448, null), InnerComponentProviderKt$ROW_PROVIDER$4.INSTANCE);
    public static final j2z f = new j2z(new ComponentDescriptorParameters("Column", 1635318672, null, InnerComponentProviderKt$COLUMN_PROVIDER$1.INSTANCE, InnerComponentProviderKt$COLUMN_PROVIDER$2.INSTANCE, InnerComponentProviderKt$COLUMN_PROVIDER$3.INSTANCE, false, null, null, 448, null), InnerComponentProviderKt$COLUMN_PROVIDER$4.INSTANCE);
    public static final j2z g = new j2z(new ComponentDescriptorParameters("Box", -1924200418, null, InnerComponentProviderKt$BOX_PROVIDER$1.INSTANCE, InnerComponentProviderKt$BOX_PROVIDER$2.INSTANCE, InnerComponentProviderKt$BOX_PROVIDER$3.INSTANCE, false, null, null, 448, null), InnerComponentProviderKt$BOX_PROVIDER$4.INSTANCE);

    static {
        t2o.a(598737248);
        LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.d d2 = arrangement.d();
        d3z.b bVar = d3z.Companion;
        can.a aVar = can.Companion;
        c = new RowColumnMeasurePolicy(layoutOrientation, d2, null, bVar.b(aVar.g()));
        e = new RowColumnMeasurePolicy(LayoutOrientation.Vertical, null, arrangement.e(), bVar.a(aVar.f()));
    }

    public static final j2z a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j2z) ipChange.ipc$dispatch("2c41da79", new Object[0]);
        }
        return g;
    }

    public static final j2z b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j2z) ipChange.ipc$dispatch("ffdd8142", new Object[0]);
        }
        return f;
    }

    public static final mdz c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdz) ipChange.ipc$dispatch("6ea2224c", new Object[0]);
        }
        return e;
    }

    public static final mdz d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdz) ipChange.ipc$dispatch("f4dbe8da", new Object[0]);
        }
        return c;
    }

    public static final j2z e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j2z) ipChange.ipc$dispatch("ed2829b6", new Object[0]);
        }
        return b;
    }

    public static final j2z f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j2z) ipChange.ipc$dispatch("fa5b43ca", new Object[0]);
        }
        return d;
    }

    public static final j2z g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j2z) ipChange.ipc$dispatch("b9f3f5d3", new Object[0]);
        }
        return f9024a;
    }
}
