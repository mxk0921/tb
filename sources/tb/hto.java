package tb;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.weex.RenderContainer;
import tb.cbk;
import tb.uz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hto extends dbk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793655);
    }

    public hto(Activity activity, yko ykoVar, uz.d dVar, cbk.a aVar, TemplateBean templateBean, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar) {
        super(activity, ykoVar, dVar, aVar, templateBean, acxVar);
    }

    public static /* synthetic */ Object ipc$super(hto htoVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/listcell/weex/SceneLayerSingleTemplateRender");
    }

    @Override // tb.uz
    public RenderContainer n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderContainer) ipChange.ipc$dispatch("9f0866b3", new Object[]{this, context});
        }
        RenderContainer renderContainer = new RenderContainer(context);
        renderContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return renderContainer;
    }
}
