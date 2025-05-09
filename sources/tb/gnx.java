package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.transfer.widget.srich.XSimpleRichTextViewV3;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import java.util.Iterator;
import tb.lx7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gnx extends gi6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_ID;
    public static final long DX_SIMPLERICHTEXT_imageSpace = 2897545864002613241L;
    public static final long DX_SIMPLERICHTEXT_imageTextSpace = -6439738081440321374L;
    public static final long DX_SIMPLERICHTEXT_images = 9421717623643260L;
    public static final long DX_SIMPLERICHTEXT_text = 38178040921L;
    public static final long DX_SIMPLERICHTEXT_textColor = 5737767606580872653L;
    public static final long DX_SIMPLERICHTEXT_textSize = 6751005219504497256L;
    public static final long d;
    public static final String dImageSpace = "dImageSpace";
    public static final String dImageTextSpace = "dImageTextSpace";
    public static final String dImages = "dImages";
    public static final String dTextColor = "dTextColor";
    public static final String dTextSize = "dTextSize";

    /* renamed from: a  reason: collision with root package name */
    public JSONArray f20119a;
    public int b;
    public int c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements lx7.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ XSimpleRichTextViewV3 f20120a;
        public final /* synthetic */ String b;

        public a(gnx gnxVar, XSimpleRichTextViewV3 xSimpleRichTextViewV3, String str) {
            this.f20120a = xSimpleRichTextViewV3;
            this.b = str;
        }

        @Override // tb.lx7.b
        public void a(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("766e21b6", new Object[]{this, drawable});
            } else {
                this.f20120a.addIcon(drawable, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262723);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new gnx();
        }
    }

    static {
        t2o.a(912262721);
        long a2 = k06.a("XSimpleRichText");
        DX_EVENT_ID = a2;
        d = a2;
    }

    public gnx() {
    }

    public static /* synthetic */ Object ipc$super(gnx gnxVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -732824995:
                super.onBeforeMeasure((TextView) objArr[0]);
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1184746505:
                return super.getDefaultValueForAttr(((Number) objArr[0]).longValue());
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/widget/XSimpleRichTextWidgetNode");
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new gnx();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public Object getDefaultValueForAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("469dcc09", new Object[]{this, new Long(j)});
        }
        return super.getDefaultValueForAttr(j);
    }

    @Override // tb.gi6
    public void onBeforeMeasure(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d451fa5d", new Object[]{this, textView});
            return;
        }
        super.onBeforeMeasure(textView);
        t(textView);
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof gnx) {
            gnx gnxVar = (gnx) dXWidgetNode;
            this.b = gnxVar.b;
            this.c = gnxVar.c;
            JSONArray jSONArray = gnxVar.f20119a;
            if (!z || jSONArray == null) {
                this.f20119a = jSONArray;
            } else {
                this.f20119a = (JSONArray) jSONArray.clone();
            }
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new XSimpleRichTextViewV3(context);
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view != null || !(view instanceof XSimpleRichTextViewV3)) {
            t((XSimpleRichTextViewV3) view);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d2)});
            return;
        }
        super.onSetDoubleAttribute(j, d2);
        if (2897545864002613241L == j) {
            this.b = (int) d2;
        }
        if (-6439738081440321374L == j) {
            this.c = (int) d2;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
            return;
        }
        super.onSetListAttribute(j, jSONArray);
        if (9421717623643260L == j) {
            this.f20119a = jSONArray;
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
            return;
        }
        super.onSetStringAttribute(j, str);
        if (2897545864002613241L == j) {
            try {
                this.b = mr7.a(Integer.parseInt(str));
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        if (-6439738081440321374L == j) {
            this.c = mr7.a(Integer.parseInt(str));
        }
    }

    public final void t(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6db4d9c4", new Object[]{this, textView});
            return;
        }
        w(textView, this.f20119a);
        u(textView, this.b);
        v(textView, this.c);
    }

    public void u(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f24ef0b3", new Object[]{this, textView, new Integer(i)});
        } else if (textView instanceof XSimpleRichTextViewV3) {
            ((XSimpleRichTextViewV3) textView).setImageSpace(i);
        }
    }

    public void v(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72ad90c6", new Object[]{this, textView, new Integer(i)});
        } else if (textView instanceof XSimpleRichTextViewV3) {
            ((XSimpleRichTextViewV3) textView).setImageTextSpace(i);
        }
    }

    public void w(TextView textView, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cafc3ef", new Object[]{this, textView, jSONArray});
        } else if (textView instanceof XSimpleRichTextViewV3) {
            XSimpleRichTextViewV3 xSimpleRichTextViewV3 = (XSimpleRichTextViewV3) textView;
            ArrayList arrayList = new ArrayList();
            ArrayList<XSimpleRichTextViewV3.DrawableHolder> drawableArrayList = xSimpleRichTextViewV3.getDrawableArrayList();
            if (jSONArray != null) {
                Iterator<Object> it = jSONArray.iterator();
                while (it != null && it.hasNext()) {
                    Object next = it.next();
                    if (next != null && (next instanceof String)) {
                        String str = (String) next;
                        if (!arrayList.contains(str)) {
                            Iterator<XSimpleRichTextViewV3.DrawableHolder> it2 = drawableArrayList.iterator();
                            boolean z = false;
                            while (it2.hasNext()) {
                                if (it2.next().url.equals(str)) {
                                    z = true;
                                }
                            }
                            if (!z) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                xSimpleRichTextViewV3.setDrawableCount(arrayList.size());
                for (int i = 0; i < arrayList.size(); i++) {
                    String str2 = (String) arrayList.get(i);
                    xSimpleRichTextViewV3.setUrlIndex(str2, i);
                    lx7.c(str2, tq4.d(xSimpleRichTextViewV3), new a(this, xSimpleRichTextViewV3, str2), null);
                }
            }
        }
    }

    public gnx(Context context) {
    }
}
