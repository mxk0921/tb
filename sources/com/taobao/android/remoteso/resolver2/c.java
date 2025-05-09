package com.taobao.android.remoteso.resolver2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.d;
import tb.a7o;
import tb.abn;
import tb.bbn;
import tb.obn;
import tb.t49;
import tb.trq;
import tb.z6o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class c implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final bbn f9271a;
    public final obn b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements bbn.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d.a f9272a;
        public final /* synthetic */ z6o b;

        public a(c cVar, d.a aVar, z6o z6oVar) {
            this.f9272a = aVar;
            this.b = z6oVar;
        }

        @Override // tb.bbn.b
        public void a(abn abnVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7319aaaa", new Object[]{this, abnVar});
                return;
            }
            RSoLog.d("PeekResolver ->  ExtractResolver, onFinished " + abnVar.d() + ", " + abnVar.g());
            String c = abnVar.c();
            RSoException b = abnVar.b();
            if (b != null) {
                this.f9272a.a(a7o.a(this.b, t49.ARG_EXTRAT, b));
            } else if (trq.c(c)) {
                this.f9272a.a(a7o.a(this.b, t49.ARG_EXTRAT, RSoException.error(5004)));
            } else {
                this.f9272a.a(a7o.k(this.b, c, t49.ARG_EXTRAT));
            }
        }
    }

    public c(bbn bbnVar, obn obnVar) {
        this.f9271a = bbnVar;
        this.b = obnVar;
    }

    @Override // com.taobao.android.remoteso.resolver2.d
    public void a(z6o z6oVar, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97fb7dd7", new Object[]{this, z6oVar, aVar});
            return;
        }
        RSoLog.d("PeekResolver ->  ExtractResolver, enter " + z6oVar.b());
        this.f9271a.d(z6oVar.b(), z6oVar.c(), this.b.a(z6oVar.j().provideStorageKey()), z6oVar.j(), new a(this, aVar, z6oVar));
    }

    @Override // com.taobao.android.remoteso.resolver2.d
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb25e99", new Object[]{this});
        }
        return "Compressed-assets";
    }
}
