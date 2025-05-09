package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.render.ErrorModel;
import com.taobao.taolive.room.openarchitecture.OpenSingleViewController;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJSONUtils_androidKt;
import com.taobao.uniinfra_kmp.common_utils.serialization.a;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class si8 extends h32 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ErrorModel b;

    static {
        t2o.a(1001390085);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public si8(java.util.Map<java.lang.String, ? extends java.lang.Object> r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            r4.<init>()
            com.taobao.uniinfra_kmp.common_utils.serialization.a$a r1 = com.taobao.uniinfra_kmp.common_utils.serialization.a.Companion     // Catch: Exception -> 0x0010
            if (r5 == 0) goto L_0x0012
            java.lang.String r2 = r5.toString()     // Catch: Exception -> 0x0010
            if (r2 != 0) goto L_0x0015
            goto L_0x0012
        L_0x0010:
            goto L_0x0022
        L_0x0012:
            java.lang.String r2 = "{}"
        L_0x0015:
            java.lang.Class<com.taobao.kmp.render.ErrorModel> r3 = com.taobao.kmp.render.ErrorModel.class
            tb.wyf r3 = tb.dun.b(r3)     // Catch: Exception -> 0x0010
            java.io.Serializable r1 = com.taobao.uniinfra_kmp.common_utils.serialization.KMPJSONUtils_androidKt.decodeFromString(r1, r2, r3)     // Catch: Exception -> 0x0010
            com.taobao.kmp.render.ErrorModel r1 = (com.taobao.kmp.render.ErrorModel) r1     // Catch: Exception -> 0x0010
            goto L_0x003e
        L_0x0022:
            com.taobao.kmp.render.ErrorModel r1 = new com.taobao.kmp.render.ErrorModel
            r1.<init>()
            java.lang.String r2 = "error"
            r1.setTitle(r2)
            if (r5 == 0) goto L_0x0034
            java.lang.String r5 = r5.toString()
            if (r5 != 0) goto L_0x0035
        L_0x0034:
            r5 = r0
        L_0x0035:
            r1.setMessage(r5)
            java.lang.String r5 = "重试"
            r1.setButtonText(r5)
        L_0x003e:
            r4.b = r1
            tb.pus r5 = tb.pus.INSTANCE
            java.lang.String r2 = "errorViewModel"
            java.lang.String r3 = "init"
            r5.k(r2, r0, r3)
            tb.hyw r5 = new tb.hyw
            r5.<init>(r4)
            if (r1 == 0) goto L_0x005a
            tb.ri8 r0 = new tb.ri8
            r0.<init>()
            java.lang.String r5 = "*"
            r1.addObserver$cmp_foundation_release(r5, r0)
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.si8.<init>(java.util.Map):void");
    }

    public static /* synthetic */ Object ipc$super(si8 si8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/render/ErrorViewModel");
    }

    @Override // tb.h32
    public Map<String, Object> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7cb97129", new Object[]{this});
        }
        String encodeToString = KMPJSONUtils_androidKt.encodeToString(a.Companion, this.b, dun.b(ErrorModel.class));
        if (encodeToString != null) {
            return xrf.b(encodeToString);
        }
        return null;
    }

    @Override // tb.h32
    public void d(e3c e3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad9d15f", new Object[]{this, e3cVar});
            return;
        }
        ckf.g(e3cVar, "event");
        xew.a(this, e3cVar);
    }

    public final void j(e3c e3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("685a9809", new Object[]{this, e3cVar});
            return;
        }
        ckf.g(e3cVar, "event");
        pus pusVar = pus.INSTANCE;
        pusVar.k("errorViewModel", "", "onclick:" + ((OpenSingleViewController.p.a.C0752a) e3cVar).a());
    }

    public final void k(e3c e3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdebad29", new Object[]{this, e3cVar});
            return;
        }
        ckf.g(e3cVar, "event");
        h32.g(this, null, 1, null);
    }

    public static final xhv i(hyw hywVar, String str, Map map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("96dc9b8a", new Object[]{hywVar, str, map, map2});
        }
        ckf.g(str, "name");
        si8 si8Var = (si8) hywVar.a();
        if (si8Var != null) {
            h32.g(si8Var, null, 1, null);
        }
        return xhv.INSTANCE;
    }
}
