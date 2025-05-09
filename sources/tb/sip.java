package tb;

import com.alibaba.android.icart.core.data.DataBizContext;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class sip extends xu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199295);
    }

    public sip(zxb zxbVar) {
        super(zxbVar);
    }

    public static /* synthetic */ Object ipc$super(sip sipVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/data/chain/impl/ShareContextHandleProcessor");
    }

    @Override // tb.xu
    public void e(fsb fsbVar, RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc977bbd", new Object[]{this, fsbVar, requestConfig});
        } else {
            oa3.e();
        }
    }

    @Override // tb.xu
    public void f(fsb fsbVar, RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bca381e", new Object[]{this, fsbVar, requestConfig});
        }
    }

    @Override // tb.xu
    public void g(IDMComponent iDMComponent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31396c29", new Object[]{this, iDMComponent, new Integer(i), new Integer(i2)});
        } else if (iDMComponent != null && "header".equals(iDMComponent.getTag())) {
            DataBizContext.ShareContext n = this.f31607a.B().n();
            JSONObject fields = iDMComponent.getFields();
            if (fields != null) {
                fields.put("isHideAddress", (Object) Boolean.valueOf(n.getIsHideAddress()));
            }
        }
    }
}
