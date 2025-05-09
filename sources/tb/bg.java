package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import tb.ck;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.aspect.error.logger")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class bg extends ls {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81789148);
    }

    public static /* synthetic */ Object ipc$super(bg bgVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/taobao/adapter/extension/logger/AURAAspectErrorLoggerExtension");
        }
    }

    @Override // tb.wab
    public void b(mi miVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
            return;
        }
        try {
            ck.b b = ck.b.b();
            ck.b g = b.l("AURAAspectErrorLoggerExtension").i("AURA/error").g("bizName", x().e()).g("event", "CORE_EXCEPTION");
            g.g("AURA_error_code", miVar.c() + "_" + miVar.b()).e("ext", tj.b(miVar.d())).g("errorMsg", miVar.e());
            if (th.c()) {
                b.e("ext", tj.b(miVar.d()));
            }
            kk kkVar = (kk) fk.b(miVar.d(), "NextRPCRemoteResponse", kk.class, null);
            if (kkVar != null) {
                String h = kkVar.h();
                String i = kkVar.i();
                b.g(jk.KEY_RET_CODE, h).g(jk.KEY_RET_MSG, i).c(TBImageFlowMonitor.RESPONSE_CODE_MEASURE, vl.b(kkVar)).g(jk.KEY_MAPPING_CODE, vl.a(kkVar)).g("eagleeye-traceid", vl.c(kkVar));
            }
            ck.g().e("onError", b.a());
        } catch (Throwable unused) {
        }
    }

    @Override // tb.ls, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        super.onCreate(loVar, yiVar);
        ck.j(ul.h());
    }

    @Override // tb.ls, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }
}
