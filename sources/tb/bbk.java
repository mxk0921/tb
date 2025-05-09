package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.weex.WXSDKInstance;
import tb.cbk;
import tb.rpc;
import tb.uz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bbk extends uz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final acx<?> k;

    static {
        t2o.a(993002195);
    }

    public bbk(Activity activity, yko ykoVar, acx<?> acxVar, uz.d dVar, cbk.a aVar) {
        super(activity, ykoVar, dVar, aVar);
        this.k = acxVar;
    }

    public static /* synthetic */ Object ipc$super(bbk bbkVar, String str, Object... objArr) {
        if (str.hashCode() == -1900528980) {
            return new Boolean(super.l());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/xsearchplugin/weex/weex/NxWeexDatasourceRenderer");
    }

    @Override // tb.uz
    public TemplateBean q(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateBean) ipChange.ipc$dispatch("45f37976", new Object[]{this, weexBean});
        }
        return this.k.e().getTemplate(weexBean.type);
    }

    @Override // tb.uz
    public rpc.c v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpc.c) ipChange.ipc$dispatch("5d093b77", new Object[]{this, str});
        }
        return this.k.e().getTemplateFile(str);
    }

    @Override // tb.uz
    public void x(cbk cbkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34b88638", new Object[]{this, cbkVar});
        } else {
            this.k.e().addWeexInstance(cbkVar);
        }
    }

    @Override // tb.uz
    public void y(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("802f7e43", new Object[]{this, wXSDKInstance});
        } else {
            this.k.e().removeWeexInstance(wXSDKInstance);
        }
    }

    @Override // tb.uz
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8eb83aac", new Object[]{this})).booleanValue();
        }
        if (!super.l()) {
            return false;
        }
        if (this.k != null) {
            return true;
        }
        k().l().d("NxWeexDatasourceRenderer", "model is null");
        return false;
    }
}
