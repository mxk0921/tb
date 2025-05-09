package tb;

import com.alibaba.triver.triver_render.render.a;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.jwk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class u0k implements com.alibaba.triver.triver_render.render.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef<jwk> f29058a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements jwk.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a.a f29059a;

        public a(a.a aVar) {
            this.f29059a = aVar;
        }

        @Override // tb.jwk.a
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8682cdb2", new Object[]{this})).booleanValue();
            }
            a.a aVar = this.f29059a;
            if (aVar == null) {
                return false;
            }
            return aVar.a();
        }
    }

    public u0k(Ref$ObjectRef<jwk> ref$ObjectRef) {
        this.f29058a = ref$ObjectRef;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da2b03ee", new Object[]{this})).booleanValue();
        }
        jwk jwkVar = this.f29058a.element;
        if (jwkVar == null) {
            return false;
        }
        return jwkVar.a();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9daca77a", new Object[]{this});
            return;
        }
        jwk jwkVar = this.f29058a.element;
        if (jwkVar != null) {
            jwkVar.b();
        }
    }

    public void c(a.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afd802ae", new Object[]{this, aVar});
            return;
        }
        jwk jwkVar = this.f29058a.element;
        if (jwkVar != null) {
            jwkVar.c(new a(aVar));
        }
    }
}
