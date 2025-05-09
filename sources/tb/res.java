package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class res extends c40 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ gld f27322a;
    public final /* synthetic */ ITMSPage c;

    public res(qes qesVar, gld gldVar, ITMSPage iTMSPage) {
        this.f27322a = gldVar;
        this.c = iTMSPage;
    }

    public static /* synthetic */ Object ipc$super(res resVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 428975361) {
            super.onProperty((String) objArr[0], objArr[1]);
            return null;
        } else if (hashCode == 1805974292) {
            super.onStage((String) objArr[0], ((Number) objArr[1]).longValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/themis/web/runtime/TMSWebRender$3");
        }
    }

    @Override // tb.c40, tb.cce
    public void onProperty(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1991a501", new Object[]{this, str, obj});
            return;
        }
        super.onProperty(str, obj);
        gld gldVar = this.f27322a;
        if (gldVar != null) {
            gldVar.D(str, obj.toString());
        }
    }

    @Override // tb.c40, tb.cce
    public void onStage(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba4fb14", new Object[]{this, str, new Long(j)});
            return;
        }
        super.onStage(str, j);
        gld gldVar = this.f27322a;
        if (gldVar != null) {
            gldVar.f(str, j);
        }
        pgd pgdVar = (pgd) this.c.getExtension(pgd.class);
        if (!q9s.p4()) {
            return;
        }
        if ((TextUtils.equals(str, "H5_JST_displayedTime_SSR") || TextUtils.equals(str, "H5_JST_displayedTime")) && pgdVar != null) {
            pgdVar.a(str, Long.valueOf(j));
        }
    }
}
