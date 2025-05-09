package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.uikit.extend.component.TBErrorViewWidget;
import com.taobao.uikit.extend.component.error.Error;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class li8 extends Component<TBErrorViewWidget, a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends jfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String w0;
        public String x0;
        public int y0;
        public String z0;

        static {
            t2o.a(502268199);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/ErrorViewComponent$ErrorViewParams");
        }

        @Override // tb.jfw
        public void v(Context context, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7bb1f3f", new Object[]{this, context, str, obj});
            } else if ("errorInfo".equals(str) && (obj instanceof Map)) {
                Map map = (Map) obj;
                this.w0 = nwv.I(map.get("code"), null);
                this.x0 = nwv.I(map.get("msg"), null);
                this.y0 = nwv.t(map.get("httpResponseCode"), 0);
                this.z0 = nwv.I(map.get("title"), null);
            }
        }
    }

    static {
        t2o.a(502268198);
    }

    public static /* synthetic */ Object ipc$super(li8 li8Var, String str, Object... objArr) {
        if (str.hashCode() == -703216504) {
            super.applyAttrForView((View) objArr[0], (jfw) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/ErrorViewComponent");
    }

    /* renamed from: i */
    public void applyAttrForView(TBErrorViewWidget tBErrorViewWidget, a aVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc8d16c7", new Object[]{this, tBErrorViewWidget, aVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(tBErrorViewWidget, aVar, map, z);
        if (TextUtils.isEmpty(aVar.z0)) {
            tBErrorViewWidget.setError(Error.Factory.fromMtopResponse(aVar.y0, null, aVar.w0, aVar.x0));
        } else {
            tBErrorViewWidget.setStatus(TBErrorViewWidget.Status.STATUS_CUSTOM);
            tBErrorViewWidget.setCustomTitle(aVar.z0);
        }
        tBErrorViewWidget.setRefreshButton(new View.OnClickListener() { // from class: tb.ki8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                li8.this.k(view);
            }
        });
    }

    /* renamed from: j */
    public a generateViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4f0731be", new Object[]{this});
        }
        return new a();
    }

    public final /* synthetic */ void k(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ace8072", new Object[]{this, view});
            return;
        }
        Object H = this.node.H("onrefresh");
        if (H instanceof String) {
            sendMessage(this.node, "onrefresh", (String) H, null, null);
        }
    }

    /* renamed from: l */
    public TBErrorViewWidget onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorViewWidget) ipChange.ipc$dispatch("30cafa96", new Object[]{this, context});
        }
        return new TBErrorViewWidget(context);
    }
}
