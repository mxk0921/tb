package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.net.ResultException;
import java.util.HashMap;
import tb.zzo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class glo extends u0p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793066);
    }

    public glo() {
        super("suggest");
    }

    public static /* synthetic */ Object ipc$super(glo gloVar, String str, Object... objArr) {
        if (str.hashCode() == 1569381830) {
            super.accept((Throwable) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/rx/SDSuggestErrorConsumer");
    }

    @Override // tb.u0p
    public void a(Throwable th) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d8addc6", new Object[]{this, th});
            return;
        }
        super.accept(th);
        HashMap hashMap = new HashMap();
        if (th instanceof ResultException) {
            ResultException resultException = (ResultException) th;
            if (resultException.getError() != null) {
                hashMap.put("code", "1");
                hashMap.put("msg", resultException.getError().getMtopCode() + "::" + resultException.getError().getErrorMsg());
                zzo.d.b().e(zzo.d.b().a("failure", hashMap));
            }
        }
        hashMap.put("code", "0");
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        hashMap.put("msg", str);
        zzo.d.b().e(zzo.d.b().a("failure", hashMap));
    }
}
