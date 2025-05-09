package tb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ywu extends fz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740754);
    }

    public static /* synthetic */ Object ipc$super(ywu ywuVar, String str, Object... objArr) {
        if (str.hashCode() == 1970911401) {
            super.d((txu) objArr[0], (f4e) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/node/service/render/extension/impl/UMFDefaultRenderComponentCreatorExtension");
    }

    @Override // tb.d4e
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("533be778", new Object[]{this});
        }
        return dm.d;
    }

    @Override // tb.fz, tb.d4e
    public void d(txu txuVar, f4e f4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7579b8a9", new Object[]{this, txuVar, f4eVar});
        } else {
            super.d(txuVar, f4eVar);
        }
    }

    @Override // tb.d4e
    public View f(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("19b5d83d", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        return new Space(viewGroup.getContext());
    }

    @Override // tb.d4e
    public void g(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a87728a", new Object[]{this, aURARenderComponent, view, new Integer(i)});
        }
    }

    @Override // tb.d4e
    public String l(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7004174", new Object[]{this, aURARenderComponent});
        }
        return cm.f17147a;
    }
}
