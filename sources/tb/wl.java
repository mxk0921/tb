package tb;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.annotation.AURAInputField;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.taobao.adapter.extension.common.render.rax.AURARaxJSBridgeApiPlugin;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.render.component.creator.rax")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class wl extends ps {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public sin g;
    @AURAInputField(name = "floatView", required = false)
    public fyc h;
    public xl i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements w3e<String, AURARenderComponent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public AURARenderComponent b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AURARenderComponent) ipChange.ipc$dispatch("185e8eaa", new Object[]{this, str});
            }
            return wl.L(wl.this).l(str);
        }
    }

    static {
        t2o.a(81789013);
    }

    public static /* synthetic */ sin L(wl wlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sin) ipChange.ipc$dispatch("c0ce939d", new Object[]{wlVar});
        }
        return wlVar.g;
    }

    public static /* synthetic */ Object ipc$super(wl wlVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/taobao/adapter/extension/common/render/rax/AURARaxComponentExtension");
        }
    }

    @Override // tb.jcb
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("533be778", new Object[]{this});
        }
        return this.g.i();
    }

    @Override // tb.jcb
    public View f(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("19b5d83d", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        sin sinVar = this.g;
        if (sinVar != null) {
            return sinVar.d(viewGroup, aURARenderComponentContainer, new AURARaxJSBridgeApiPlugin(this.c.c(), new a()));
        }
        ck.g().b("AURARaxComponentExtension", "createView", "RaxComponentCreator为null");
        return new tm().a(viewGroup.getContext());
    }

    @Override // tb.jcb
    public void g(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a87728a", new Object[]{this, aURARenderComponent, view, new Integer(i)});
        } else if (this.g == null || this.h == null) {
            ck.g().b("AURARaxComponentExtension", "createView", "floatView为null");
        } else {
            this.i.c(aURARenderComponent);
            this.g.n(aURARenderComponent, view, this.h, this.i);
        }
    }

    @Override // tb.jcb
    public String l(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7004174", new Object[]{this, aURARenderComponent});
        }
        return this.g.j(aURARenderComponent);
    }

    @Override // tb.ps, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        sin sinVar = this.g;
        if (sinVar != null) {
            sinVar.e();
        }
        this.g = null;
        this.h = null;
    }

    @Override // tb.ps, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        super.onCreate(loVar, yiVar);
        this.g = new sin(this.f26268a, true);
        fyc fycVar = (fyc) r().d(this, "floatView", fyc.class);
        this.h = fycVar;
        if (fycVar == null) {
            ck.g().b("AURARaxComponentExtension", "renderView", "没有注入floatView参数");
        }
        this.i = new xl(this.c.c(), this.h);
    }
}
