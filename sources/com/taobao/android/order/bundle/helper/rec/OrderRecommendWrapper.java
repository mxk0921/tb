package com.taobao.android.order.bundle.helper.rec;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.widget.recycle.OrderRecyclerView;
import tb.fdl;
import tb.gel;
import tb.t2o;
import tb.zw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class OrderRecommendWrapper extends zw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final zw f9106a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum RecType {
        GUESS,
        MAIN_SEARCH;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(RecType recType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/helper/rec/OrderRecommendWrapper$RecType");
        }

        public static RecType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecType) ipChange.ipc$dispatch("37ba7268", new Object[]{str});
            }
            return (RecType) Enum.valueOf(RecType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$order$bundle$helper$rec$OrderRecommendWrapper$RecType;

        static {
            int[] iArr = new int[RecType.values().length];
            $SwitchMap$com$taobao$android$order$bundle$helper$rec$OrderRecommendWrapper$RecType = iArr;
            try {
                iArr[RecType.MAIN_SEARCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$order$bundle$helper$rec$OrderRecommendWrapper$RecType[RecType.GUESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        t2o.a(713031824);
    }

    public OrderRecommendWrapper(OrderRecyclerView orderRecyclerView, Context context, RecType recType, String str, JSONObject jSONObject) {
        if (a.$SwitchMap$com$taobao$android$order$bundle$helper$rec$OrderRecommendWrapper$RecType[recType.ordinal()] != 1) {
            this.f9106a = new fdl(orderRecyclerView, context, str);
        } else {
            this.f9106a = new gel(orderRecyclerView, context, jSONObject, str);
        }
    }

    public static /* synthetic */ Object ipc$super(OrderRecommendWrapper orderRecommendWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/helper/rec/OrderRecommendWrapper");
    }

    @Override // tb.zw
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5d844df4", new Object[]{this});
        }
        return this.f9106a.a();
    }

    @Override // tb.zw
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.f9106a.b();
        }
    }

    @Override // tb.zw
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff947e", new Object[]{this, new Boolean(z)});
        } else {
            this.f9106a.c(z);
        }
    }

    @Override // tb.zw
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            this.f9106a.d();
        }
    }

    @Override // tb.zw
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40975dc", new Object[]{this});
        } else {
            this.f9106a.e();
        }
    }

    @Override // tb.zw
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db85b704", new Object[]{this});
        } else {
            this.f9106a.f();
        }
    }

    @Override // tb.zw
    public void g(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6613746", new Object[]{this, jSONObject, str});
        } else {
            this.f9106a.g(jSONObject, str);
        }
    }

    public zw h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zw) ipChange.ipc$dispatch("7e78b121", new Object[]{this});
        }
        return this.f9106a;
    }
}
