package com.taobao.android.sku.presenter;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.presenter.a;
import tb.t2o;
import tb.yv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9459a;
    public yv b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements a.j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AbstractC0487b f9460a;

        public a(b bVar, AbstractC0487b bVar2) {
            this.f9460a = bVar2;
        }

        @Override // com.taobao.android.sku.presenter.a.j
        public void a(com.taobao.android.sku.presenter.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c77bbee", new Object[]{this, aVar});
                return;
            }
            AbstractC0487b bVar = this.f9460a;
            if (bVar != null) {
                bVar.a(aVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.sku.presenter.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static abstract class AbstractC0487b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(442499252);
        }

        public abstract void a(yv yvVar);
    }

    static {
        t2o.a(442499250);
    }

    public b(Context context) {
        this.f9459a = context;
        a();
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f63fd8a", new Object[]{this});
        } else {
            this.b = new com.taobao.android.sku.presenter.a(this.f9459a);
        }
    }

    public yv b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yv) ipChange.ipc$dispatch("a37e1eef", new Object[]{this});
        }
        return this.b;
    }

    public void c(AbstractC0487b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfc35566", new Object[]{this, bVar});
            return;
        }
        yv yvVar = this.b;
        if (yvVar instanceof com.taobao.android.sku.presenter.a) {
            ((com.taobao.android.sku.presenter.a) yvVar).C(new a(this, bVar));
        }
    }
}
