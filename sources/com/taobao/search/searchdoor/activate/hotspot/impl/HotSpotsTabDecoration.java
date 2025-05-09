package com.taobao.search.searchdoor.activate.hotspot.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a07;
import tb.ckf;
import tb.o1p;
import tb.oxb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class HotSpotsTabDecoration extends RecyclerView.ItemDecoration {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final int f = Color.parseColor("#222222");
    public static final float g = o1p.a(12.0f);
    public static final float h = o1p.a(16.0f);
    public static final int i = o1p.a(12.0f);
    public static final int j = o1p.a(16.0f);
    public static final int k = o1p.a(31.0f);
    public static final int l = o1p.a(16.0f);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11627a;
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(1);
    public boolean d;
    public int e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815793025);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a29ee62c", new Object[]{this})).intValue();
            }
            return HotSpotsTabDecoration.a();
        }

        public final int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2427b22c", new Object[]{this})).intValue();
            }
            return HotSpotsTabDecoration.b();
        }

        public a() {
        }
    }

    static {
        t2o.a(815793024);
    }

    public HotSpotsTabDecoration(boolean z) {
        this.f11627a = z;
    }

    public static final /* synthetic */ int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32baa7d9", new Object[0])).intValue();
        }
        return i;
    }

    public static final /* synthetic */ int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1530bbd9", new Object[0])).intValue();
        }
        return j;
    }

    public static /* synthetic */ Object ipc$super(HotSpotsTabDecoration hotSpotsTabDecoration, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/activate/hotspot/impl/HotSpotsTabDecoration");
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.d = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
            return;
        }
        ckf.g(rect, "outRect");
        ckf.g(view, "view");
        ckf.g(recyclerView, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            if (this.f11627a) {
                i3 = j;
            } else {
                i3 = i;
            }
            rect.left = i3;
        }
        if (this.f11627a) {
            i2 = l;
        } else {
            i2 = k;
        }
        rect.right = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1107a21a", new Object[]{this, canvas, recyclerView, state});
            return;
        }
        ckf.g(canvas, "c");
        ckf.g(recyclerView, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        if (!this.d || this.e != recyclerView.getWidth()) {
            this.e = recyclerView.getWidth();
            Context context = recyclerView.getContext();
            oxb oxbVar = context instanceof oxb ? (oxb) context : null;
            int i2 = (oxbVar == null || !oxbVar.E1()) ? -1 : f;
            if (this.f11627a) {
                f2 = h;
            } else {
                f2 = g;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f2, 0.0f, i2, 0, tileMode);
            LinearGradient linearGradient2 = new LinearGradient(recyclerView.getWidth(), 0.0f, recyclerView.getWidth() - f2, 0.0f, i2, 0, tileMode);
            this.b.setShader(linearGradient);
            this.c.setShader(linearGradient2);
            this.d = true;
        }
        canvas.drawPaint(this.b);
        canvas.drawPaint(this.c);
    }
}
