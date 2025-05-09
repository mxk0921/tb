package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXRichTextLinkEvent;
import com.taobao.android.dinamicx.expression.event.DXRichTextPressEvent;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.t;
import java.util.HashMap;
import tb.ane;
import tb.fwb;
import tb.keo;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class y06 extends DXImageWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXIMAGESPAN_CORNERRADIUS = 6313115730157071869L;
    public static final long DXIMAGESPAN_IMAGESPAN = 7700670379007126142L;
    public static final long DXIMAGESPAN_ISTRUNCATED = -1735247218921453423L;
    public static final long DXIMAGESPAN_LINK = 35873943762L;
    public static final long DXIMAGESPAN_ONLINK = 9859228430928305L;
    public static final long DXIMAGESPAN_ONPRESS = 5176476879387311985L;
    public static final long DXIMAGESPAN_PRESS = 19050239308914L;

    /* renamed from: a  reason: collision with root package name */
    public String f31753a;
    public String b;
    public boolean c;
    public ane d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements keo.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f31754a;

        public a(long j) {
            this.f31754a = j;
        }

        @Override // tb.keo.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f43e0d7b", new Object[]{this, str});
                return;
            }
            DXRichTextLinkEvent dXRichTextLinkEvent = new DXRichTextLinkEvent(this.f31754a);
            dXRichTextLinkEvent.setLink(str);
            y06.this.postEvent(dXRichTextLinkEvent);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements keo.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f31755a;

        public b(long j) {
            this.f31755a = j;
        }

        @Override // tb.keo.b
        public boolean a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7caedc9d", new Object[]{this, str})).booleanValue();
            }
            DXRichTextPressEvent dXRichTextPressEvent = new DXRichTextPressEvent(this.f31755a);
            dXRichTextPressEvent.setData(str);
            y06.this.postEvent(dXRichTextPressEvent);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements keo.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.keo.d
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3bebbcb", new Object[]{this});
            } else {
                y06.this.postEvent(new DXEvent(18903999933159L));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements keo.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.keo.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6134112f", new Object[]{this});
            } else {
                y06.this.postEvent(new DXEvent(-6544685697300501093L));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ane f31758a;

        public e(ane aneVar) {
            this.f31758a = aneVar;
        }

        public void a(Bitmap bitmap) {
            View view;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52430b43", new Object[]{this, bitmap});
            } else if (!zg5.P3() || y06.this.getAspectRatio() > vu3.b.GEO_NOT_SUPPORT) {
                this.f31758a.A(bitmap);
                DXWidgetNode parentWidget = y06.this.getParentWidget();
                if (parentWidget.getWRView() != null) {
                    view = parentWidget.getWRView().get();
                } else if (parentWidget.getReferenceNode() == null || parentWidget.getReferenceNode().getWRView() == null) {
                    view = null;
                } else {
                    view = parentWidget.getReferenceNode().getWRView().get();
                }
                if (view != null) {
                    view.invalidate();
                }
            } else {
                this.f31758a.A(bitmap);
                y06.this.setAspectRatio(bitmap.getWidth() / bitmap.getHeight());
                y06.this.requestLayout();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class f implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597662);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new y06();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface g {
    }

    static {
        t2o.a(444597656);
    }

    public static /* synthetic */ Object ipc$super(y06 y06Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/richtext/DXImageSpanWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new y06();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else if (this.d == null) {
            if (!zg5.b4(this)) {
                super.onBindEvent(context, view, j);
            }
        } else if (j == 9859228430928305L && !TextUtils.isEmpty(this.f31753a)) {
            this.d.B(new a(j));
        } else if (j == 5176476879387311985L && !TextUtils.isEmpty(this.b)) {
            this.d.C(new b(j));
        } else if (j == 18903999933159L) {
            this.d.E(new c());
        } else if (j == -6544685697300501093L) {
            this.d.D(new d());
        } else if (!zg5.b4(this)) {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof y06)) {
            super.onClone(dXWidgetNode, z);
            y06 y06Var = (y06) dXWidgetNode;
            this.f31753a = y06Var.f31753a;
            this.b = y06Var.b;
            this.c = y06Var.c;
            this.d = y06Var.d;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        if (zg5.b4(this)) {
            return null;
        }
        return super.onCreateView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, tb.sqm
    public void onPrefetchSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfda7834", new Object[]{this});
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == -1735247218921453423L) {
            if (i == 0) {
                z = false;
            }
            this.c = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 35873943762L) {
            this.f31753a = str;
        } else if (j == 19050239308914L) {
            this.b = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public ane t(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ane) ipChange.ipc$dispatch("1cb27fb7", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
        if (getLayoutWidth() <= 0 && getLayoutHeight() <= 0) {
            return null;
        }
        ane.i iVar = new ane.i();
        iVar.g(getLayoutWidth()).c(getLayoutHeight()).d(this.f31753a).e(this.b).f(getAspectRatio()).b(getCornerRadius());
        ane a2 = iVar.a();
        if (z) {
            v(a2, z2);
        }
        this.d = a2;
        return a2;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62da2c3f", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public void v(ane aneVar, boolean z) {
        pwb g2;
        t i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaae0d3", new Object[]{this, aneVar, new Boolean(z)});
        } else if (aneVar != null && (g2 = com.taobao.android.dinamicx.g.g(getDXRuntimeContext())) != null && getDXRuntimeContext() != null && getDXRuntimeContext().h() != null) {
            String imageUrl = getImageUrl();
            if (!z && !TextUtils.isEmpty(imageUrl) && (i = com.taobao.android.dinamicx.g.i()) != null) {
                String a2 = i.a(imageUrl, aneVar.w(), aneVar.v(), buildSimpleImageOption());
                if (!TextUtils.isEmpty(a2)) {
                    imageUrl = a2;
                }
            }
            aneVar.F();
            e eVar = new e(aneVar);
            if (g2 instanceof fwb) {
                HashMap hashMap = new HashMap();
                String c2 = getDXRuntimeContext().c();
                if (c2 == null) {
                    c2 = "";
                }
                hashMap.put(nd2.BUNDLE_BIZ_CODE, c2);
                fwb.a aVar = new fwb.a();
                aVar.a(hashMap);
                ((fwb) g2).b(getDXRuntimeContext().h(), imageUrl, aVar, eVar);
                return;
            }
            g2.a(getDXRuntimeContext().h(), imageUrl, eVar);
        }
    }
}
