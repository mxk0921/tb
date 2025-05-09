package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.j;
import com.taobao.android.dinamicx.widget.r;
import java.util.List;
import tb.fae;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class s4z<K extends View, T extends fae> extends r<K, T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a<K extends View, T extends an6> implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final nu<K, T> f27802a;

        static {
            t2o.a(444597420);
            t2o.a(444597451);
        }

        public a(nu<K, T> nuVar) {
            this.f27802a = nuVar;
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new s4z(this.f27802a);
        }
    }

    static {
        t2o.a(444597419);
    }

    public s4z(nu<K, T> nuVar) {
        super(nuVar);
    }

    public static /* synthetic */ Object ipc$super(s4z s4zVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXV3TemplateWidgetNode");
    }

    @Override // com.taobao.android.dinamicx.widget.r, tb.rl6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new s4z(this.f27455a);
    }

    @Override // com.taobao.android.dinamicx.widget.r
    public DXRuntimeContext c(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("274536e7", new Object[]{this, dXWidgetNode});
        }
        DXRuntimeContext b = getDXRuntimeContext().b(dXWidgetNode);
        DXRuntimeContext.a aVar = new DXRuntimeContext.a();
        aVar.f7293a = dXWidgetNode.getDXRuntimeContext().p();
        aVar.b = b.i();
        aVar.c = b.m();
        b.A0(aVar);
        return b;
    }

    @Override // com.taobao.android.dinamicx.widget.r, tb.bwb
    public void cloneChildNode(DXRuntimeContext dXRuntimeContext) {
        List<DXWidgetNode> children;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86bff9d9", new Object[]{this, dXRuntimeContext});
            return;
        }
        DXWidgetNode originNode = getOriginNode();
        if (!(originNode == null || (children = originNode.getChildren()) == null)) {
            for (int i = 0; i < children.size(); i++) {
                DXWidgetNode dXWidgetNode = children.get(i);
                DXWidgetNode shallowButterClone = dXWidgetNode.shallowButterClone(dXRuntimeContext);
                DXRuntimeContext.a aVar = new DXRuntimeContext.a();
                aVar.f7293a = dXWidgetNode.getDXRuntimeContext().p();
                aVar.b = dXRuntimeContext.i();
                aVar.c = dXRuntimeContext.m();
                shallowButterClone.getDXRuntimeContext().A0(aVar);
                if (shallowButterClone instanceof j) {
                    ((j) shallowButterClone).setDisableFlatten(true);
                }
                addChild(shallowButterClone, false);
            }
        }
    }
}
