package com.taobao.android.detail.ttdetail.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.TBSkuWrapper;
import com.taobao.android.detail.ttdetail.TTDetailPageManager;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import java.util.HashMap;
import java.util.Map;
import tb.jns;
import tb.kns;
import tb.q2q;
import tb.t2o;
import tb.tgh;
import tb.vbl;
import tb.ywk;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DetailUpdateDataReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f6699a;
    public final TBSkuWrapper b;
    public final a c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
    }

    static {
        t2o.a(912261345);
    }

    public DetailUpdateDataReceiver(ze7 ze7Var, TBSkuWrapper tBSkuWrapper, a aVar) {
        this.f6699a = ze7Var;
        this.b = tBSkuWrapper;
        this.c = aVar;
    }

    public static /* synthetic */ Object ipc$super(DetailUpdateDataReceiver detailUpdateDataReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/broadcast/DetailUpdateDataReceiver");
    }

    public final Map<String, String> a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("acaed8b2", new Object[]{this, intent});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("apiInfo", intent.getStringExtra("apiInfo"));
        hashMap.put("headerInfo", intent.getStringExtra("headerInfo"));
        hashMap.put("data", intent.getStringExtra("data"));
        hashMap.put("updateWithCustomApi", intent.getStringExtra("updateWithCustomApi"));
        hashMap.put("streamMode", intent.getStringExtra("streamMode"));
        return hashMap;
    }

    public final Map<String, String> b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("dc851f48", new Object[]{this, intent});
        }
        if (!TextUtils.equals((String) this.f6699a.i().c("requestItemId"), intent.getStringExtra("originalItemId"))) {
            return null;
        }
        String stringExtra = intent.getStringExtra("targetItemId");
        tgh.b("DetailUpdateDataReceiver", "from intent targetItemId= " + stringExtra);
        if (vbl.b()) {
            stringExtra = ywk.c(this.f6699a, stringExtra);
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = DataUtils.v((Item) this.f6699a.e().f(Item.class));
            }
        } else {
            jns jnsVar = (jns) this.f6699a.e().e(kns.PARSER_ID);
            boolean g = ywk.g(jnsVar);
            boolean i = ywk.i(jnsVar);
            if (g && !i) {
                String d = ywk.d(jnsVar);
                if (!TextUtils.isEmpty(d)) {
                    stringExtra = d;
                }
            }
        }
        tgh.b("DetailUpdateDataReceiver", "actually request targetItemId= " + stringExtra);
        HashMap hashMap = new HashMap();
        hashMap.put("detail_item_id", stringExtra);
        String stringExtra2 = intent.getStringExtra(q2q.KEY_AREA_ID);
        if (!TextUtils.isEmpty(stringExtra2)) {
            hashMap.put(q2q.KEY_AREA_ID, stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("addressId");
        ((TTDetailPageManager.g0) this.c).a(stringExtra3);
        if (!TextUtils.isEmpty(stringExtra3)) {
            hashMap.put("addressId", stringExtra3);
        }
        String stringExtra4 = intent.getStringExtra("params");
        if (!TextUtils.isEmpty(stringExtra4)) {
            hashMap.put("params", stringExtra4);
        }
        String stringExtra5 = intent.getStringExtra("relatedAuctionParams");
        if (!TextUtils.isEmpty(stringExtra5)) {
            hashMap.put("relatedAuctionParams", stringExtra5);
        }
        return hashMap;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        String b = this.f6699a.i().b();
        String stringExtra = intent.getStringExtra("skuToken");
        boolean equals = TextUtils.equals(intent.getStringExtra("from"), "appletBridge");
        tgh.b("DetailUpdateDataReceiver", "onReceive skuToken=" + stringExtra + ", fromApplet=" + equals);
        if (b.equals(stringExtra) || equals) {
            if (Boolean.parseBoolean(intent.getStringExtra("updateWithCustomApi"))) {
                map = a(intent);
            } else {
                map = b(intent);
            }
            if (map != null) {
                String stringExtra2 = intent.getStringExtra("areaChangedByUser");
                if (!TextUtils.isEmpty(stringExtra2)) {
                    map.put("areaChangedByUser", stringExtra2);
                }
                tgh.b("DetailUpdateDataReceiver", "onUpdateDetail");
                ((TTDetailPageManager.g0) this.c).b(map);
                if (!"true".equalsIgnoreCase(intent.getStringExtra("forbidLoading"))) {
                    this.b.H();
                    return;
                }
                return;
            }
            return;
        }
        tgh.b("DetailUpdateDataReceiver", "skuToken不相等，containerToken=".concat(b));
    }
}
