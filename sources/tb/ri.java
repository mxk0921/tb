package tb;

import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ri extends bp<AURAEventIO, AURAEventIO> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE = "aura.service.event";
    public oi c;

    static {
        t2o.a(80740431);
    }

    public static /* synthetic */ Object ipc$super(ri riVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -576780562) {
            super.B((AURAInputData) objArr[0], (pt) objArr[1]);
            return null;
        } else if (hashCode == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/service/event/AURAEventService");
        }
    }

    @Override // tb.bp
    public void B(AURAInputData<AURAEventIO> aURAInputData, pt<AURAEventIO> ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd9f06ee", new Object[]{this, aURAInputData, ptVar});
            return;
        }
        super.B(aURAInputData, ptVar);
        oi oiVar = this.c;
        if (oiVar != null) {
            oiVar.d(aURAInputData.getData(), ptVar);
            ptVar.c(yk.a(aURAInputData.getData(), aURAInputData));
        }
    }

    @Override // tb.gn, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        super.onCreate(loVar, yiVar);
        this.c = new oi(loVar, r());
        for (ibb ibbVar : r().f(ibb.class)) {
            this.c.e(ibbVar.t0(), ibbVar);
        }
    }

    @Override // tb.gn, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (!(r() == null || this.c == null)) {
            for (ibb ibbVar : r().f(ibb.class)) {
                this.c.g(ibbVar.t0());
                ibbVar.onDestroy();
            }
        }
        super.onDestroy();
    }
}
