package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.alibaba.android.umf.datamodel.service.render.UMFRenderOutput;
import com.alibaba.android.umf.taobao.adapter.widget.floatview.container.impl.dialogfragment.NUTFragmentFloatContainer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class cij implements dyc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a4e f17083a;
    public fyc b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends hz<UMFBaseIO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ eyc f17084a;
        public final /* synthetic */ txu b;

        public a(cij cijVar, eyc eycVar, txu txuVar) {
            this.f17084a = eycVar;
            this.b = txuVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/taobao/adapter/widget/floatview/render/impl/NUTFloatContentUMFRender$1");
        }

        public void a(axu axuVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2664cb35", new Object[]{this, axuVar});
                return;
            }
            dxu.a().e("MainActivity", axuVar.toString());
            ((NUTFragmentFloatContainer.c) this.f17084a).b(new mi(1, "NUTFloatView", "render-exception", axuVar.toString()));
            gxu.a(this.b.a(), "DX_FLOAT_VIEW_COMMON_EXCEPTION", "umf", axuVar.a());
        }

        public void b(UMFBaseIO uMFBaseIO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78fce183", new Object[]{this, uMFBaseIO});
            } else if (uMFBaseIO instanceof UMFRenderOutput) {
                Map<String, View> views = ((UMFRenderOutput) uMFBaseIO).getViews();
                if (views == null || views.isEmpty()) {
                    dxu.a().e("NUTFloatContentUMFRender", "add failed, view is null");
                    ((NUTFragmentFloatContainer.c) this.f17084a).b(new mi(0, "NUTFloatView", "render-exception", "add failed, view is null"));
                    gxu.a(this.b.a(), "DX_FLOAT_VIEW_COMMON_EXCEPTION", "umf", "add failed, view is null");
                    return;
                }
                View view = null;
                for (Map.Entry<String, View> entry : views.entrySet()) {
                    view = entry.getValue();
                }
                ((NUTFragmentFloatContainer.c) this.f17084a).c(view);
            } else {
                dxu.a().e("NUTFloatContentUMFRender", "add failed, not render output");
                ((NUTFragmentFloatContainer.c) this.f17084a).b(new mi(0, "NUTFloatView", "render-exception", "illegal output, not render output"));
                gxu.a(this.b.a(), "DX_FLOAT_VIEW_COMMON_EXCEPTION", "umf", "illegal output, not render output");
            }
        }
    }

    static {
        t2o.a(81789349);
        t2o.a(81789345);
    }

    @Override // tb.dyc
    public void a(fyc fycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d743f67", new Object[]{this, fycVar});
        } else {
            this.b = fycVar;
        }
    }

    public final String c(Map<String, Object> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6fe2b12", new Object[]{this, map, str, str2});
        }
        if (map == null) {
            return str2;
        }
        Object obj = map.get(str);
        if (!(obj instanceof String)) {
            return str2;
        }
        return (String) obj;
    }

    @Override // tb.dyc
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        a4e a4eVar = this.f17083a;
        if (a4eVar != null) {
            a4eVar.destroy();
            this.f17083a = null;
        }
    }

    @Override // tb.dyc
    public boolean b(Context context, Map<String, Object> map, eyc eycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edc8f8b0", new Object[]{this, context, map, eycVar})).booleanValue();
        }
        a4e a4eVar = (a4e) fk.b(map, "umfInstance", a4e.class, null);
        a4e a4eVar2 = this.f17083a;
        if (!(a4eVar == a4eVar2 || a4eVar2 == null)) {
            a4eVar2.destroy();
            this.f17083a = null;
        }
        this.f17083a = a4eVar;
        if (a4eVar == null) {
            ((NUTFragmentFloatContainer.c) eycVar).b(new mi(0, "NUTFloatView", "render-exception", "请设置UMFInstance参数到params中，key为：NUTFloatViewConstants.RenderParam.KEY_UMF_INSTANCE"));
            return false;
        }
        String c = c(map, "startPointWorkflow", null);
        if (TextUtils.isEmpty(c)) {
            ((NUTFragmentFloatContainer.c) eycVar).b(new mi(0, "NUTFloatView", "render-exception", "param: startPointWorkflow is empty"));
            return false;
        }
        UMFBaseIO uMFBaseIO = (UMFBaseIO) fk.b(map, "startPointInputIO", UMFBaseIO.class, null);
        if (uMFBaseIO == null) {
            uMFBaseIO = new UMFBaseIO();
        }
        txu txuVar = (txu) fk.b(map, hn.KEY_USER_CONTEXT_UMF_RUNTIME_CONTEXT, txu.class, new txu());
        txuVar.f("nutFloatView", this.b);
        txuVar.g(a4eVar);
        a4eVar.a(c, uMFBaseIO, txuVar, new a(this, eycVar, txuVar));
        return true;
    }
}
