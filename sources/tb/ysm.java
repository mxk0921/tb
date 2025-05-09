package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.core.task.PreloadTaskEntity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ysm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ddt f32320a;
    public final kzd b;
    public final PreloadTaskEntity c;
    public final yjd d;
    public final on8 e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ddt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(PreloadTaskEntity preloadTaskEntity, Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("665a2e03", new Object[]{this, preloadTaskEntity, exc});
                return;
            }
            try {
                ysm.a(ysm.this, preloadTaskEntity, exc);
            } catch (Exception e) {
                wsm.b(csm.a("PreloadTask"), "requester taskCallback", e);
            }
        }

        public void b(PreloadTaskEntity preloadTaskEntity, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1af7a838", new Object[]{this, preloadTaskEntity, obj});
                return;
            }
            try {
                ysm.b(ysm.this, preloadTaskEntity, obj);
            } catch (Exception e) {
                wsm.b(csm.a("PreloadTask"), "requester taskCallback", e);
            }
        }
    }

    public ysm() {
    }

    public static /* synthetic */ void a(ysm ysmVar, PreloadTaskEntity preloadTaskEntity, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2b480a", new Object[]{ysmVar, preloadTaskEntity, exc});
        } else {
            ysmVar.f(preloadTaskEntity, exc);
        }
    }

    public static /* synthetic */ void b(ysm ysmVar, PreloadTaskEntity preloadTaskEntity, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cf09899", new Object[]{ysmVar, preloadTaskEntity, obj});
        } else {
            ysmVar.g(preloadTaskEntity, obj);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        try {
            d();
        } catch (Exception e) {
            f(this.c, e);
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a4b7ce1", new Object[]{this});
        } else if (TextUtils.isEmpty(this.c.bizName)) {
            f(this.c, null);
            wsm.c(csm.a("PreloadTask"), "acquire preloadTaskEntity bizName is null");
        } else {
            yjd yjdVar = this.d;
            if (yjdVar == null) {
                f(this.c, null);
                wsm.c(csm.a("PreloadTask"), "acquire requester is null");
                return;
            }
            yjdVar.request(this.c, new a());
        }
    }

    public PreloadTaskEntity e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreloadTaskEntity) ipChange.ipc$dispatch("6c4965c5", new Object[]{this});
        }
        return this.c;
    }

    public final void f(PreloadTaskEntity preloadTaskEntity, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2824998e", new Object[]{this, preloadTaskEntity, exc});
            return;
        }
        new ctm().a(this.b, this, this.e);
        ddt ddtVar = this.f32320a;
        if (ddtVar != null) {
            ((a) ddtVar).a(preloadTaskEntity, exc);
        }
    }

    public final void g(PreloadTaskEntity preloadTaskEntity, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c568dc0d", new Object[]{this, preloadTaskEntity, obj});
            return;
        }
        new ctm().a(this.b, this, this.e);
        ddt ddtVar = this.f32320a;
        if (ddtVar != null) {
            ((a) ddtVar).b(preloadTaskEntity, obj);
        }
    }

    public ysm(ddt ddtVar, kzd kzdVar, PreloadTaskEntity preloadTaskEntity, yjd yjdVar, on8 on8Var) {
        this.f32320a = ddtVar;
        this.b = kzdVar;
        this.c = preloadTaskEntity;
        this.d = yjdVar;
        this.e = on8Var;
    }
}
