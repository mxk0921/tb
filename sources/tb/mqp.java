package tb;

import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mqp extends ox<nqp, oqp> implements s4p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ArrayList<String> b;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f24237a;

    public static /* synthetic */ Object ipc$super(mqp mqpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/shop/widget/ShopSearchDoorPresenter");
    }

    @Override // tb.ox, tb.ddd
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    @Override // tb.ddd
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            n0(getWidget().getActivity().getIntent());
        }
    }

    public Map<String, String> l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8545f2a7", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        String str = this.f24237a.get("shopId");
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            str = str2;
        }
        hashMap.put("shop_id", str);
        String str3 = this.f24237a.get("sellerId");
        if (!TextUtils.isEmpty(str3)) {
            str2 = str3;
        }
        hashMap.put("seller_id", str2);
        hashMap.put("inshops", "search");
        hashMap.put("spm-cnt", "a2141.7631685.0.0");
        hashMap.put("encode_rainbow", g6p.d(oen.j()));
        Map<String, String> C2 = getWidget().C2();
        if (C2 != null) {
            hashMap.putAll(C2);
        }
        return hashMap;
    }

    @Override // tb.s4p
    public Map<String, String> w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("67d0f21f", new Object[]{this});
        }
        return this.f24237a;
    }

    static {
        t2o.a(815793298);
        t2o.a(815793328);
        ArrayList<String> arrayList = new ArrayList<>();
        b = arrayList;
        arrayList.add(m7r.URL_REFERER_ORIGIN);
        arrayList.add("referrer");
        arrayList.add("gotoSearch");
    }

    public void n0(Intent intent) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("545d7c28", new Object[]{this, intent});
            return;
        }
        this.f24237a = bql.c(intent);
        String[] strArr = {"sellerId", "seller_id", "userId", "user_id"};
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                break;
            }
            String str = strArr[i2];
            if (!TextUtils.isEmpty(this.f24237a.get(str))) {
                Map<String, String> map = this.f24237a;
                map.put("sellerId", map.remove(str));
                break;
            }
            i2++;
        }
        String[] strArr2 = {"shopId", "shop_id"};
        while (true) {
            if (i >= 2) {
                break;
            }
            String str2 = strArr2[i];
            if (!TextUtils.isEmpty(this.f24237a.get(str2))) {
                Map<String, String> map2 = this.f24237a;
                map2.put("shopId", map2.remove(str2));
                break;
            }
            i++;
        }
        Iterator<String> it = b.iterator();
        while (it.hasNext()) {
            this.f24237a.remove(it.next());
        }
    }
}
