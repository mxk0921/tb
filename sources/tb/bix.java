package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bix implements iee {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements NotifyManager.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final C0882a f16419a;

        /* compiled from: Taobao */
        /* renamed from: tb.bix$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class C0882a implements jqw {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final NotifyManager.h f16420a;

            static {
                t2o.a(502267971);
                t2o.a(989856388);
            }

            public C0882a(a aVar, NotifyManager.h hVar) {
                this.f16420a = hVar;
            }

            @Override // tb.jqw
            public kqw onEvent(int i, iqw iqwVar, Object... objArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (kqw) ipChange.ipc$dispatch("75ee5a2a", new Object[]{this, new Integer(i), iqwVar, objArr});
                }
                if (i != 3005 || objArr == null || objArr.length <= 0) {
                    return null;
                }
                Object obj = objArr[0];
                if (!(obj instanceof String)) {
                    return null;
                }
                try {
                    JSONObject parseObject = JSON.parseObject((String) obj);
                    NotifyManager.h hVar = this.f16420a;
                    if (hVar == null) {
                        return null;
                    }
                    ((NotifyManager.i.a) hVar).a(parseObject);
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }

        static {
            t2o.a(502267970);
            t2o.a(503317339);
        }

        public a(NotifyManager.h hVar) {
            C0882a aVar = new C0882a(this, hVar);
            this.f16419a = aVar;
            lqw.d().b(aVar);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager.g
        public void unregister() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50cd9ac3", new Object[]{this});
            } else if (this.f16419a != null) {
                lqw.d().h(this.f16419a);
            }
        }
    }

    static {
        t2o.a(502267969);
        t2o.a(503316610);
    }

    @Override // tb.iee
    public NotifyManager.g a(NotifyManager.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotifyManager.g) ipChange.ipc$dispatch("4f7f5e23", new Object[]{this, hVar});
        }
        return new a(hVar);
    }
}
