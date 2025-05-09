package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = gj.CODE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class gj extends ft {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE = "aura.impl.parse.renderTreeFilter.freeNode";

    static {
        t2o.a(81789111);
    }

    public static /* synthetic */ Object ipc$super(gj gjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/freenode/AURAFreeNodeFilterExtension");
    }

    public final boolean J0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2cb926d", new Object[]{this, str})).booleanValue();
        }
        for (bt btVar : x().f(bt.class)) {
            if (!TextUtils.isEmpty(str) && str.equals(btVar.L())) {
                return true;
            }
        }
        return false;
    }

    public final void K0(String str, RenderComponent renderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cd1b4e", new Object[]{this, str, renderComponent});
            return;
        }
        Map map = (Map) L().get("aura_global_data_free_node", Map.class);
        if (map == null) {
            map = new HashMap();
        }
        map.put(str, renderComponent);
        L().update("aura_global_data_free_node", map);
    }

    @Override // tb.ft, tb.ccb
    public boolean Y(RenderComponent renderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ce203d8", new Object[]{this, renderComponent})).booleanValue();
        }
        if (renderComponent == null) {
            return false;
        }
        String position = renderComponent.component.getPosition();
        if (TextUtils.isEmpty(position)) {
            return false;
        }
        boolean J0 = J0(position);
        if (J0) {
            K0(position, renderComponent);
        }
        return J0;
    }
}
