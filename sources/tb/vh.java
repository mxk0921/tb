package tb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.render.component.creator.default")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class vh extends ps {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740555);
    }

    public static /* synthetic */ Object ipc$super(vh vhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/extension/impl/AURADefaultComponentExtension");
    }

    @Override // tb.jcb
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("533be778", new Object[]{this});
        }
        return dm.d;
    }

    @Override // tb.jcb
    public View f(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("19b5d83d", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        return new Space(viewGroup.getContext());
    }

    @Override // tb.jcb
    public void g(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a87728a", new Object[]{this, aURARenderComponent, view, new Integer(i)});
        }
    }

    @Override // tb.jcb
    public String l(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7004174", new Object[]{this, aURARenderComponent});
        }
        return cm.f17147a;
    }
}
