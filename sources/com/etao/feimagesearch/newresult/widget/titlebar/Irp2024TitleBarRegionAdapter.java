package com.etao.feimagesearch.newresult.widget.titlebar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bottom.history.CaptureHistoryAdapter;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.taobao.android.scancode.common.object.ScancodeType;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.scancode.v2.result.MaResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import tb.ckf;
import tb.hfn;
import tb.mzu;
import tb.nmf;
import tb.o4w;
import tb.p9j;
import tb.pv8;
import tb.t2o;
import tb.trl;
import tb.u1a;
import tb.xhv;
import tb.zmf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Irp2024TitleBarRegionAdapter extends RecyclerView.Adapter<IrpTitleBar2024ObjectViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IrpDatasource f4829a;
    public final boolean b;
    public final u1a<? super p9j, ? super Integer, xhv> c;
    public final LinkedList<p9j> d = new LinkedList<>();
    public p9j e;
    public p9j f;
    public Bitmap g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p9j f4830a;
        public final /* synthetic */ Irp2024TitleBarRegionAdapter b;
        public final /* synthetic */ int c;
        public final /* synthetic */ IrpTitleBar2024ObjectViewHolder d;

        public a(p9j p9jVar, Irp2024TitleBarRegionAdapter irp2024TitleBarRegionAdapter, int i, IrpTitleBar2024ObjectViewHolder irpTitleBar2024ObjectViewHolder) {
            this.f4830a = p9jVar;
            this.b = irp2024TitleBarRegionAdapter;
            this.c = i;
            this.d = irpTitleBar2024ObjectViewHolder;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (this.f4830a.a()) {
                mzu.h("Page_PhotoSearchResult", "codeBoxClick", this.f4830a.g);
                o4w.a();
                u1a<p9j, Integer, xhv> U = this.b.U();
                if (U != null) {
                    U.invoke(this.f4830a, Integer.valueOf(this.c));
                }
            } else if (!this.f4830a.d) {
                mzu.i("Page_PhotoSearchResult", "clickThumbnailNew", "bodyIndex", String.valueOf(this.d.getAdapterPosition()));
                this.f4830a.d = true;
                u1a<p9j, Integer, xhv> U2 = this.b.U();
                if (U2 != null) {
                    U2.invoke(this.f4830a, Integer.valueOf(this.c));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(481297249);
            int[] iArr = new int[ScancodeType.values().length];
            iArr[ScancodeType.EXPRESS.ordinal()] = 1;
            iArr[ScancodeType.MEDICINE.ordinal()] = 2;
            iArr[ScancodeType.ANTI_FAKE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(481297248);
    }

    public Irp2024TitleBarRegionAdapter(IrpDatasource irpDatasource, boolean z, u1a<? super p9j, ? super Integer, xhv> u1aVar) {
        this.f4829a = irpDatasource;
        this.b = z;
        this.c = u1aVar;
    }

    public static /* synthetic */ Object ipc$super(Irp2024TitleBarRegionAdapter irp2024TitleBarRegionAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/titlebar/Irp2024TitleBarRegionAdapter");
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.d.clear();
        notifyDataSetChanged();
    }

    public final int P(RectF rectF) {
        RectF rectF2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93b74de0", new Object[]{this, rectF})).intValue();
        }
        if (rectF == null) {
            return -1;
        }
        p9j p9jVar = this.e;
        if (p9jVar == null) {
            rectF2 = null;
        } else {
            rectF2 = p9jVar.b;
        }
        if (ckf.b(rectF, rectF2)) {
            return getItemCount() - 1;
        }
        int size = this.d.size();
        while (i < size) {
            int i2 = i + 1;
            p9j p9jVar2 = this.d.get(i);
            ckf.d(p9jVar2);
            if (ckf.b(p9jVar2.b, rectF)) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    public final int Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b2a74ee", new Object[]{this})).intValue();
        }
        p9j p9jVar = this.f;
        if (p9jVar == null) {
            return -1;
        }
        if (ckf.b(p9jVar, this.e)) {
            return getItemCount() - 1;
        }
        return this.d.indexOf(p9jVar);
    }

    public final LinkedList<p9j> S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("52c61a5", new Object[]{this});
        }
        return this.d;
    }

    public final Bitmap T(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ef43d8f6", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        if (i >= this.d.size()) {
            p9j p9jVar = this.e;
            if (p9jVar == null) {
                return null;
            }
            return p9jVar.c;
        }
        p9j p9jVar2 = this.d.get(i);
        ckf.f(p9jVar2, "mImageList[index]");
        return p9jVar2.c;
    }

    public final u1a<p9j, Integer, xhv> U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u1a) ipChange.ipc$dispatch("27730430", new Object[]{this});
        }
        return this.c;
    }

    public final p9j V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p9j) ipChange.ipc$dispatch("e344a94", new Object[]{this});
        }
        return this.f;
    }

    /* renamed from: X */
    public IrpTitleBar2024ObjectViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IrpTitleBar2024ObjectViewHolder) ipChange.ipc$dispatch("3ce9e50c", new Object[]{this, viewGroup, new Integer(i)});
        }
        ckf.g(viewGroup, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        Context context = viewGroup.getContext();
        ckf.f(context, "parent.context");
        return new IrpTitleBar2024ObjectViewHolder(context, viewGroup, this.b);
    }

    public final void Y(p9j p9jVar, IrpTitleBar2024ObjectViewHolder irpTitleBar2024ObjectViewHolder) {
        Bitmap bitmap;
        int i;
        int i2;
        int i3;
        int i4;
        Bitmap bitmap2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ec95236", new Object[]{this, p9jVar, irpTitleBar2024ObjectViewHolder});
            return;
        }
        Bitmap bitmap3 = p9jVar.c;
        if ((bitmap3 == null || bitmap3.isRecycled()) && (bitmap = this.g) != null) {
            RectF rectF = p9jVar.b;
            ckf.f(rectF, "bean.rectF");
            int width = (int) (bitmap.getWidth() * rectF.width());
            int height = (int) (bitmap.getHeight() * rectF.height());
            int c = hfn.c(0, (int) (bitmap.getWidth() * rectF.left));
            int c2 = hfn.c(0, (int) (bitmap.getHeight() * rectF.top));
            if (width <= 0 || width + c > bitmap.getWidth()) {
                width = bitmap.getWidth() - c;
            }
            if (height <= 0 || c2 + height > bitmap.getHeight()) {
                height = bitmap.getHeight() - height;
            }
            if (width <= 0) {
                i = bitmap.getWidth();
                i2 = 0;
            } else {
                i = width;
                i2 = c;
            }
            if (height <= 0) {
                i3 = bitmap.getHeight();
                i4 = 0;
            } else {
                i3 = height;
                i4 = c2;
            }
            float c0 = (irpTitleBar2024ObjectViewHolder.c0() * 1.0f) / hfn.c(i, i3);
            Matrix matrix = new Matrix();
            matrix.setScale(c0, c0);
            try {
                bitmap2 = Bitmap.createBitmap(bitmap, i2, i4, i, i3, matrix, false);
            } catch (Exception unused) {
                bitmap2 = null;
            }
            p9jVar.c = bitmap2;
        }
    }

    public final void Z(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff0b793b", new Object[]{this, bitmap});
        } else if (bitmap != null) {
            this.g = bitmap;
            if (!this.d.isEmpty()) {
                notifyItemRangeChanged(0, getItemCount());
            }
        }
    }

    public final void a(RectF rectF, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb5dd602", new Object[]{this, rectF, new Integer(i), str, new Boolean(z)});
        } else if (rectF != null) {
            this.d.add(i, new p9j(rectF, false, i, str, z));
        }
    }

    public final void a0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a26f410c", new Object[]{this, new Integer(i)});
        } else if (i >= 0 && i < getItemCount()) {
            p9j p9jVar = this.f;
            if (p9jVar != null) {
                ckf.d(p9jVar);
                p9jVar.d = false;
            }
            if (this.d.size() > 0) {
                this.d.get(i).d = true;
                this.f = this.d.get(i);
            }
            notifyItemRangeChanged(0, getItemCount());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        int size = this.d.size();
        if (this.e != null) {
            i = 1;
        }
        return size + i;
    }

    public final void N(RectF rectF) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c52d4d5", new Object[]{this, rectF});
            return;
        }
        p9j p9jVar = this.f;
        if (p9jVar != null) {
            p9jVar.d = false;
        }
        p9j p9jVar2 = this.e;
        if (!(p9jVar2 == null || (bitmap = p9jVar2.c) == null)) {
            bitmap.recycle();
        }
        p9j p9jVar3 = new p9j(new RectF(rectF), true, this.d.size(), pv8.REGION_SEARCH);
        p9jVar3.d = true;
        this.e = p9jVar3;
        this.f = p9jVar3;
        notifyItemRangeChanged(0, getItemCount());
    }

    public final void b(p9j p9jVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("544d96ea", new Object[]{this, p9jVar});
        } else if (p9jVar.b() && TextUtils.isEmpty(p9jVar.i)) {
            IrpDatasource irpDatasource = this.f4829a;
            zmf.a r = irpDatasource == null ? null : irpDatasource.r(p9jVar.b);
            if (r != null) {
                ScancodeType scancodeType = r.f;
                int i = scancodeType == null ? -1 : b.$EnumSwitchMapping$0[scancodeType.ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    str = CaptureHistoryAdapter.ICON_BAR_CODE;
                } else {
                    str = CaptureHistoryAdapter.ICON_QR_CODE;
                }
                p9jVar.i = str;
            }
        }
    }

    public final void b0(RectF rectF, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4281f8dc", new Object[]{this, rectF, new Boolean(z)});
            return;
        }
        ckf.g(rectF, "rectF");
        p9j p9jVar = this.f;
        if (p9jVar != null) {
            p9jVar.d = false;
        }
        if (z) {
            p9j p9jVar2 = this.e;
            if (p9jVar2 != null) {
                p9jVar2.d = true;
                this.f = p9jVar2;
                notifyItemRangeChanged(0, getItemCount());
                return;
            }
            return;
        }
        Iterator<p9j> it = this.d.iterator();
        while (it.hasNext()) {
            p9j next = it.next();
            if (ckf.b(next.b, rectF)) {
                next.d = true;
                this.f = next;
                notifyItemRangeChanged(0, getItemCount());
                return;
            }
        }
    }

    /* renamed from: W */
    public void onBindViewHolder(IrpTitleBar2024ObjectViewHolder irpTitleBar2024ObjectViewHolder, int i) {
        p9j p9jVar;
        nmf o;
        String str;
        String text;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ee0f948", new Object[]{this, irpTitleBar2024ObjectViewHolder, new Integer(i)});
            return;
        }
        ckf.g(irpTitleBar2024ObjectViewHolder, "holder");
        if (i == getItemCount() - 1) {
            p9jVar = this.e;
            if (p9jVar == null) {
                p9jVar = this.d.get(i);
            }
        } else {
            p9jVar = this.d.get(i);
        }
        if (p9jVar != null) {
            if (p9jVar.b()) {
                b(p9jVar);
            } else {
                Y(p9jVar, irpTitleBar2024ObjectViewHolder);
            }
            irpTitleBar2024ObjectViewHolder.b0(p9jVar);
            ViewProxy.setOnClickListener(irpTitleBar2024ObjectViewHolder.itemView, new a(p9jVar, this, i, irpTitleBar2024ObjectViewHolder));
            if (!p9jVar.f) {
                p9jVar.f = true;
                if (p9jVar.a()) {
                    HashMap hashMap = new HashMap();
                    IrpDatasource irpDatasource = this.f4829a;
                    String str2 = null;
                    Integer[] n = irpDatasource == null ? null : irpDatasource.n();
                    hashMap.put("region", trl.f(p9jVar.b));
                    if (n == null || n.length != 2) {
                        hashMap.put("imgSize", "unknown_unknown");
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(n[0].intValue());
                        sb.append('_');
                        sb.append(n[1].intValue());
                        hashMap.put("imgSize", sb.toString());
                    }
                    IrpDatasource irpDatasource2 = this.f4829a;
                    zmf.a r = irpDatasource2 == null ? null : irpDatasource2.r(p9jVar.b);
                    String str3 = "";
                    if (r == null) {
                        hashMap.put("type", "-1");
                        hashMap.put("content", str3);
                    } else {
                        ScancodeType scancodeType = r.f;
                        if (scancodeType == null || (str = scancodeType.toString()) == null) {
                            str = str3;
                        }
                        hashMap.put("type", str);
                        MaResult maResult = r.f32866a;
                        if (!(maResult == null || (text = maResult.getText()) == null)) {
                            str3 = text;
                        }
                        hashMap.put("content", str3);
                    }
                    IrpDatasource irpDatasource3 = this.f4829a;
                    if (!(irpDatasource3 == null || (o = irpDatasource3.o()) == null)) {
                        str2 = o.w();
                    }
                    hashMap.put("tfskey", str2);
                    mzu.p("Page_PhotoSearchResult", "codeBoxExpose", hashMap);
                    p9jVar.g = hashMap;
                    return;
                }
                mzu.q("Page_PhotoSearchResult", "showThumbnailNew", "bodyIndex", String.valueOf(i));
            }
        }
    }
}
