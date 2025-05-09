package tb;

import android.content.Intent;
import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class myj extends kxj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321605);
        t2o.a(578814049);
    }

    public static /* synthetic */ Object ipc$super(myj myjVar, String str, Object... objArr) {
        if (str.hashCode() == 1796792727) {
            return new Boolean(super.g((Intent) objArr[0], (zmj) objArr[1]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/NewDetailSimpleNavProcessor");
    }

    @Override // tb.kxj
    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("243dfd00", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void F(Intent intent, x7l x7lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a2d13f4", new Object[]{this, intent, x7lVar});
            return;
        }
        try {
            String uri = x7lVar.b.toString();
            String handleAdUrl = AlimamaAdvertising.instance().handleAdUrl(uri);
            txj.e("NewDetailSimpleNavProcessor", "广告链路兜底处理中... oldUrl: " + uri + " newUrl:" + handleAdUrl);
            intent.setData(Uri.parse(handleAdUrl));
            intent.putExtra("ad_type", "1.0");
        } catch (Exception e) {
            txj.f("NewDetailSimpleNavProcessor", "广告拦截器处理出错", e);
        }
    }

    @Override // tb.kxj
    public boolean g(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b18e197", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        r19.T("simpleNav");
        r19.V("simpleNav");
        r19.U();
        zmjVar.x("com.taobao.taobao");
        zmjVar.r("com.taobao.android.detail2.core.framework.NewDetailActivity");
        boolean g = super.g(intent, zmjVar);
        txj.e("NewDetailSimpleNavProcessor", "拦截器调用 super.process  >>> result = " + g);
        return g;
    }

    @Override // tb.kxj
    public boolean w(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d14676ea", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        p(intent);
        h();
        efj<JSONObject, JSONObject> efjVar = new efj<>();
        if (r19.N()) {
            txj.e("NewDetailSimpleNavProcessor", "CheckEUrl: SkipCheck ad e url .");
        } else {
            E(intent, zmjVar);
        }
        return x(intent, zmjVar, efjVar);
    }

    public final void E(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a1c8c0e", new Object[]{this, intent, zmjVar});
            return;
        }
        boolean F = r19.F();
        Uri a2 = y7l.a(intent.getData());
        x7l x7lVar = new x7l();
        x7lVar.b = a2;
        new vc0().a(intent, zmjVar, x7lVar);
        if (F) {
            txj.e("NewDetailSimpleNavProcessor", "CheckEUrl: ForceCheck ad e url .");
            x7lVar.f31193a = true;
        }
        if (x7lVar.f31193a) {
            F(intent, x7lVar);
            txj.e("NewDetailSimpleNavProcessor", "广告拦截器拦截成功。");
            return;
        }
        intent.setData(a2);
        txj.e("NewDetailSimpleNavProcessor", "广告拦截器拦截失败。");
    }
}
