package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.weex.WXSDKInstance;
import tb.cbk;
import tb.rpc;
import tb.uz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dbk extends uz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final TemplateBean k;
    public final acx<? extends o02<? extends BaseSearchResult, ?>> l;

    static {
        t2o.a(993002198);
    }

    public dbk(Activity activity, yko ykoVar, uz.d dVar, cbk.a aVar, TemplateBean templateBean, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar) {
        super(activity, ykoVar, dVar, aVar);
        this.k = templateBean;
        this.l = acxVar;
    }

    public static /* synthetic */ Object ipc$super(dbk dbkVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/xsearchplugin/weex/weex/NxWeexSingleTemplateRender");
    }

    @Override // tb.uz
    public TemplateBean q(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateBean) ipChange.ipc$dispatch("45f37976", new Object[]{this, weexBean});
        }
        return this.k;
    }

    @Override // tb.uz
    public rpc.c v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpc.c) ipChange.ipc$dispatch("5d093b77", new Object[]{this, str});
        }
        acx<? extends o02<? extends BaseSearchResult, ?>> acxVar = this.l;
        if (acxVar == null) {
            return null;
        }
        return acxVar.e().getTemplateFile(str);
    }

    @Override // tb.uz
    public void x(cbk cbkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34b88638", new Object[]{this, cbkVar});
        }
    }

    @Override // tb.uz
    public void y(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("802f7e43", new Object[]{this, wXSDKInstance});
        }
    }
}
