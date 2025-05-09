package tb;

import android.text.TextUtils;
import androidx.appcompat.taobao.util.Globals;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.falco.n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dnj extends ku1<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            jgh.a("NavEvent", "handleEvent getBootImageContentListener().onClose ");
            dnj.g(dnj.this).c().e(2001);
        }
    }

    static {
        t2o.a(573571089);
    }

    public static /* synthetic */ nwi g(dnj dnjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nwi) ipChange.ipc$dispatch("d928ca73", new Object[]{dnjVar});
        }
        return dnjVar.b;
    }

    public static /* synthetic */ Object ipc$super(dnj dnjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/ability/biz/NavEvent");
    }

    @Override // tb.ku1
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("adef98ca", new Object[]{this});
        }
        return n.LEAVE_TYPE_JUMP_NEXT_PAGE;
    }

    /* renamed from: h */
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6adffea7", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            jgh.a("NavEvent", "targetUrl is empty");
        } else {
            jgh.a("NavEvent", "ready to jump targetPage, and targetUrl:  " + str);
            Nav.from(Globals.getApplication()).toUri(str);
            this.b.b().b().postDelayed(new a(), 500L);
        }
    }
}
