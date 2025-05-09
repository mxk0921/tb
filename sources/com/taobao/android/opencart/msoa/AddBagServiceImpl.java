package com.taobao.android.opencart.msoa;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.ee0;
import tb.shv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AddBagServiceImpl implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ee0 mProxy = new ee0();
    private Handler mHandler = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9068a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Integer c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ Boolean g;
        public final /* synthetic */ Map h;
        public final /* synthetic */ Context i;

        public a(String str, String str2, Integer num, String str3, String str4, String str5, Boolean bool, Map map, Context context) {
            this.f9068a = str;
            this.b = str2;
            this.c = num;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = bool;
            this.h = map;
            this.i = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                AddBagServiceImpl.access$000(AddBagServiceImpl.this).c(this.f9068a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
            } catch (Exception e) {
                shv.c("AddBagServiceImpl", e.getMessage());
            }
        }
    }

    public static /* synthetic */ ee0 access$000(AddBagServiceImpl addBagServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ee0) ipChange.ipc$dispatch("7f22a629", new Object[]{addBagServiceImpl});
        }
        return addBagServiceImpl.mProxy;
    }

    public void addBag(String str, String str2, Integer num, String str3, String str4, String str5, Boolean bool, Map<String, Object> map, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9040c9bd", new Object[]{this, str, str2, num, str3, str4, str5, bool, map, context});
        } else {
            this.mHandler.post(new a(str, str2, num, str3, str4, str5, bool, map, context));
        }
    }
}
