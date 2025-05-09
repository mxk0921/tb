package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class exu extends ez {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740755);
    }

    public static /* synthetic */ Object ipc$super(exu exuVar, String str, Object... objArr) {
        if (str.hashCode() == 1970911401) {
            super.d((txu) objArr[0], (f4e) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/node/service/render/extension/impl/UMFNativeRenderComponentCreatorExtension");
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
        d4e h = h(aURARenderComponentContainer);
        if (h == null) {
            return i();
        }
        return h.f(viewGroup, aURARenderComponentContainer);
    }

    @Override // tb.d4e
    public void g(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a87728a", new Object[]{this, aURARenderComponent, view, new Integer(i)});
            return;
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null) {
            dxu.a().e("UMFNativeComponentCreatorAbility", "renderView#UMFRenderComponentData is null");
            return;
        }
        d4e h = h(aURARenderComponentData.container);
        if (h == null) {
            b4e a2 = dxu.a();
            a2.e("UMFNativeComponentCreatorAbility", "renderView#cannot find componentCreator, containerInfo=" + aURARenderComponentData.container);
            return;
        }
        h.g(aURARenderComponent, view, i);
    }

    public final d4e h(AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d4e) ipChange.ipc$dispatch("cc73d600", new Object[]{this, aURARenderComponentContainer});
        }
        if (aURARenderComponentContainer == null) {
            return null;
        }
        String str = aURARenderComponentContainer.name;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return c(str);
    }

    public final View i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("de75e74f", new Object[]{this});
        }
        dxu.a().e("UMFNativeComponentCreatorAbility", "failed to create native view, use default instead");
        return new Space(this.d);
    }

    @Override // tb.d4e
    public String l(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7004174", new Object[]{this, aURARenderComponent});
        }
        d4e h = h(aURARenderComponent.data.container);
        if (h == null) {
            return cm.f17147a;
        }
        return h.l(aURARenderComponent);
    }
}
