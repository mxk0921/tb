package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.tbliveinteractive.business.tradetrack.sign.MtopContentlivekitComponentTradeSignResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ddu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f17748a;
    public String b = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f17749a;

        public a(b bVar) {
            this.f17749a = bVar;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if ((netBaseOutDo instanceof MtopContentlivekitComponentTradeSignResponse) && (netBaseOutDo.getData() instanceof JSONObject)) {
                ddu.b(ddu.this, ((JSONObject) netBaseOutDo.getData()).getString("result"));
                this.f17749a.a(ddu.a(ddu.this));
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void a(String str);
    }

    static {
        t2o.a(806356580);
    }

    public ddu(String str) {
        this.f17748a = str;
    }

    public static /* synthetic */ String a(ddu dduVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4aefc3b", new Object[]{dduVar});
        }
        return dduVar.b;
    }

    public static /* synthetic */ String b(ddu dduVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea8b43f3", new Object[]{dduVar, str});
        }
        dduVar.b = str;
        return str;
    }

    public boolean c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c5c5468", new Object[]{this, bVar})).booleanValue();
        }
        if (bVar == null || TextUtils.isEmpty(this.f17748a)) {
            return false;
        }
        if (!TextUtils.isEmpty(this.b)) {
            bVar.a(this.b);
        } else {
            new cdu(new a(bVar)).K(this.f17748a);
        }
        return true;
    }
}
