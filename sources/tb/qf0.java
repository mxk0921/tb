package tb;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.core.address.NewErrorDialogStructure;
import tb.icu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qf0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements icu.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f26713a;

        public a(Context context) {
            this.f26713a = context;
        }

        @Override // tb.icu.d
        public void a(icu icuVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d10d10ed", new Object[]{this, icuVar});
                return;
            }
            icuVar.f();
            hh.d(this.f26713a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements icu.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f26714a;

        public b(Context context) {
            this.f26714a = context;
        }

        @Override // tb.icu.e
        public void a(icu icuVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d10d10ed", new Object[]{this, icuVar});
                return;
            }
            icuVar.f();
            Context context = this.f26714a;
            if (context != null) {
                qf0.b(context, new Bundle(), 69);
            }
        }
    }

    static {
        t2o.a(714080265);
    }

    public static void a(Context context, String str) {
        NewErrorDialogStructure newErrorDialogStructure;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7847eca", new Object[]{context, str});
            return;
        }
        try {
            newErrorDialogStructure = (NewErrorDialogStructure) JSON.parseObject(str, NewErrorDialogStructure.class);
        } catch (Throwable unused) {
            newErrorDialogStructure = null;
        }
        icu icuVar = new icu(context);
        if (newErrorDialogStructure != null) {
            com.taobao.android.purchase.core.address.a.a(icuVar, newErrorDialogStructure);
        } else {
            icuVar.v(gf0.TO_SET_ADDRESS_ERROR_MSG);
            icuVar.q(str);
        }
        icuVar.n("");
        icuVar.r(new a(context));
        icuVar.s(new b(context));
        icuVar.x();
    }

    public static void b(Context context, Bundle bundle, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87712bd9", new Object[]{context, bundle, new Integer(i)});
            return;
        }
        switch (i) {
            case 52:
                xq0.c().a(context).d(bundle).b(i).c("http://my.m.taobao.com/deliver/select_address_list.htm");
                return;
            case 53:
            case 54:
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("bookReturnFields", true);
                if (i == 53) {
                    xq0.c().a(context).d(bundle).b(1001).c("http://m.taobao.com/awp/mtb/location_component_addressbook.htm");
                    return;
                } else {
                    xq0.c().a(context).d(bundle).b(1003).c("http://m.taobao.com/awp/mtb/location_component_addressbook.htm");
                    return;
                }
            default:
                switch (i) {
                    case 69:
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("setAsDefault", true);
                        xq0.c().a(context).b(i).d(bundle2).c("http://my.m.taobao.com/deliver/add_address.htm");
                        return;
                    case 70:
                    case 71:
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBoolean("addressReturnFields", true);
                        bundle.putBoolean(k5n.ACTIVITY_ADD_ADDRESS_AUTO_FILL, true);
                        if (i == 70) {
                            xq0.c().a(context).b(1002).d(bundle).c("http://m.taobao.com/awp/mtb/location_component_addaddress.htm");
                            return;
                        } else {
                            xq0.c().a(context).d(bundle).b(1003).c("http://m.taobao.com/awp/mtb/location_component_addaddress.htm");
                            return;
                        }
                    default:
                        return;
                }
        }
    }
}
