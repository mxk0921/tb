package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.datasource.CommonBaseDatasource;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qse extends mmi {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements fmi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CommonBaseDatasource f26904a;

        public a(CommonBaseDatasource commonBaseDatasource) {
            this.f26904a = commonBaseDatasource;
        }

        @Override // tb.fmi
        public void b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a88433cb", new Object[]{this, obj});
            } else if ((obj instanceof JSONObject) && "true".equals(((JSONObject) obj).getString("gotoTop"))) {
                this.f26904a.postEvent(vxo.a());
            }
        }
    }

    static {
        t2o.a(815793732);
    }

    public qse(Context context, CommonBaseDatasource commonBaseDatasource) {
        super(context, "allitems_inShop_channel", new a(commonBaseDatasource));
    }
}
