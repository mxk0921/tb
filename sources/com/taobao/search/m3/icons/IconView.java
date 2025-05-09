package com.taobao.search.m3.icons;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.search.m3.BaseItemView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.a07;
import tb.ckf;
import tb.jeo;
import tb.knh;
import tb.kre;
import tb.lfe;
import tb.mfe;
import tb.o1p;
import tb.olt;
import tb.t2o;
import tb.wfe;
import tb.xfe;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class IconView extends BaseItemView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int iconHeight;
    private static final int viewHeight;
    private wfe currentInfo;
    private final ArrayList<lfe> drawList = new ArrayList<>();
    private mfe exposeListener;
    private boolean onlyAdIcon;
    private final knh provider;
    private int totalWidth;
    private final boolean waterfall;
    public static final a Companion = new a(null);
    private static final int itemMargin = o1p.a(4.0f);
    private static final int itemPadding = o1p.a(1.5f);
    private static final int iconRightPadding = o1p.a(3.0f);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792382);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ef1b8c70", new Object[]{this})).intValue();
            }
            return IconView.access$getIconHeight$cp();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792381);
        int a2 = o1p.a(14.0f);
        viewHeight = a2;
        iconHeight = a2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconView(Context context, knh knhVar, boolean z) {
        super(context);
        ckf.g(knhVar, "provider");
        this.provider = knhVar;
        this.waterfall = z;
    }

    public static final /* synthetic */ int access$getIconHeight$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10532b15", new Object[0])).intValue();
        }
        return iconHeight;
    }

    public static /* synthetic */ Object ipc$super(IconView iconView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/m3/icons/IconView");
        }
    }

    private final void load() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6def666d", new Object[]{this});
            return;
        }
        Iterator<lfe> it = this.drawList.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            lfe next = it.next();
            ckf.f(next, "next(...)");
            lfe lfeVar = next;
            if (lfeVar.b()) {
                lfeVar.j();
            }
        }
    }

    private final void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        Iterator<lfe> it = this.drawList.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            lfe next = it.next();
            ckf.f(next, "next(...)");
            next.release();
        }
    }

    private final void updateDrawList() {
        List<xfe> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4f46af2", new Object[]{this});
            return;
        }
        release();
        this.drawList.clear();
        if (this.onlyAdIcon) {
            wfe wfeVar = this.currentInfo;
            ckf.d(wfeVar);
            list = wfeVar.a();
        } else {
            wfe wfeVar2 = this.currentInfo;
            ckf.d(wfeVar2);
            list = wfeVar2.c();
        }
        if (list != null) {
            for (xfe xfeVar : list) {
                ckf.d(xfeVar);
                String e = xfeVar.e();
                int hashCode = e.hashCode();
                if (hashCode != -1551543255) {
                    if (hashCode != 104387) {
                        if (hashCode == 3556653 && e.equals("text") && !TextUtils.isEmpty(xfeVar.d())) {
                            this.drawList.add(new olt(xfeVar, this, this.provider));
                        }
                    } else if (e.equals("img")) {
                        this.drawList.add(new kre(xfeVar, this));
                    }
                } else if (e.equals("richText")) {
                    this.drawList.add(new jeo(xfeVar, this, this.provider));
                }
            }
        }
    }

    public final List<xfe> getDisplayIcons() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("64cf632", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList(this.drawList.size());
        Iterator<lfe> it = this.drawList.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            lfe next = it.next();
            ckf.f(next, "next(...)");
            lfe lfeVar = next;
            if (lfeVar.b()) {
                arrayList.add(lfeVar.h());
            }
        }
        return arrayList;
    }

    @Override // com.taobao.search.m3.BaseItemView
    public int getFixedHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2531fe7f", new Object[]{this})).intValue();
        }
        return viewHeight;
    }

    @Override // com.taobao.search.m3.BaseItemView
    public int getWrapContentWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe693fa7", new Object[]{this})).intValue();
        }
        return this.totalWidth;
    }

    @Override // com.taobao.search.m3.BaseItemView
    public boolean isWrapContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("920aeb50", new Object[]{this})).booleanValue();
        }
        return this.onlyAdIcon;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        load();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        release();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDraw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.search.m3.icons.IconView.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "bd69fddb"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r10
            r4[r0] = r11
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0015:
            java.lang.String r2 = "canvas"
            tb.ckf.g(r11, r2)
            java.util.ArrayList<tb.lfe> r2 = r10.drawList
            java.util.Iterator r2 = r2.iterator()
            java.lang.String r3 = "iterator(...)"
            tb.ckf.f(r2, r3)
            r3 = 0
            r4 = 0
        L_0x0028:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0087
            java.lang.Object r5 = r2.next()
            java.lang.String r6 = "next(...)"
            tb.ckf.f(r5, r6)
            tb.lfe r5 = (tb.lfe) r5
            boolean r6 = r5.b()
            if (r6 == 0) goto L_0x0028
            if (r0 != 0) goto L_0x0051
            boolean r6 = r5.i()
            if (r6 != 0) goto L_0x004f
            int r6 = com.taobao.search.m3.icons.IconView.itemPadding
            float r6 = (float) r6
            r11.translate(r6, r3)
            goto L_0x0053
        L_0x004f:
            r6 = 0
            goto L_0x0053
        L_0x0051:
            r0 = 0
            goto L_0x004f
        L_0x0053:
            r5.draw(r11)
            boolean r7 = r5.i()
            if (r7 == 0) goto L_0x0069
            int r7 = r5.getWidth()
            float r7 = (float) r7
            int r8 = com.taobao.search.m3.icons.IconView.itemMargin
            float r8 = (float) r8
            float r7 = r7 + r8
            r11.translate(r7, r3)
            goto L_0x007b
        L_0x0069:
            int r7 = com.taobao.search.m3.icons.IconView.itemPadding
            float r8 = (float) r7
            float r6 = r6 + r8
            int r8 = r5.getWidth()
            float r8 = (float) r8
            int r9 = com.taobao.search.m3.icons.IconView.itemMargin
            float r9 = (float) r9
            float r8 = r8 + r9
            float r7 = (float) r7
            float r8 = r8 + r7
            r11.translate(r8, r3)
        L_0x007b:
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r4 = r4 + r5
            int r5 = com.taobao.search.m3.icons.IconView.itemMargin
            float r5 = (float) r5
            float r4 = r4 + r5
            float r4 = r4 + r6
            goto L_0x0028
        L_0x0087:
            float r0 = -r4
            r11.translate(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.m3.icons.IconView.onDraw(android.graphics.Canvas):void");
    }

    @Override // com.taobao.search.m3.BaseItemView
    public void onWidthChanged() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ee6394", new Object[]{this});
            return;
        }
        int measuredWidth = getMeasuredWidth();
        if (!this.onlyAdIcon && this.waterfall) {
            measuredWidth -= iconRightPadding;
        }
        this.totalWidth = 0;
        Iterator<lfe> it = this.drawList.iterator();
        ckf.f(it, "iterator(...)");
        boolean z = true;
        while (it.hasNext()) {
            lfe next = it.next();
            ckf.f(next, "next(...)");
            lfe lfeVar = next;
            int width = lfeVar.getWidth();
            if (!lfeVar.i()) {
                if (z) {
                    i = itemPadding;
                } else {
                    i = itemPadding * 2;
                }
                width += i;
            }
            if (measuredWidth < width) {
                lfeVar.c(false);
                lfeVar.release();
            } else {
                int i2 = this.totalWidth + width;
                this.totalWidth = i2;
                if (!z) {
                    this.totalWidth = i2 + itemMargin;
                } else {
                    z = false;
                }
                lfeVar.c(true);
                lfeVar.j();
                measuredWidth = (measuredWidth - itemMargin) - width;
            }
        }
        wfe wfeVar = this.currentInfo;
        if (wfeVar != null && !wfeVar.b()) {
            wfeVar.d(true);
            mfe mfeVar = this.exposeListener;
            if (mfeVar != null) {
                mfeVar.C(getDisplayIcons());
            }
        }
    }

    public final void update(wfe wfeVar, boolean z, mfe mfeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39eebe52", new Object[]{this, wfeVar, new Boolean(z), mfeVar});
            return;
        }
        ckf.g(wfeVar, "iconInfo");
        ckf.g(mfeVar, DataReceiveMonitor.CB_LISTENER);
        this.exposeListener = mfeVar;
        if (this.currentInfo != wfeVar) {
            this.onlyAdIcon = z;
            reset();
            this.currentInfo = wfeVar;
            updateDrawList();
        }
    }
}
