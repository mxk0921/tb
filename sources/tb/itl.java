package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.taopassword.busniess.mtop.request.PasswordJudgeRequestI;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class itl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final itl f21575a = new itl();

        static {
            t2o.a(665845859);
        }

        public static /* synthetic */ itl a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (itl) ipChange.ipc$dispatch("fce2af1c", new Object[0]);
            }
            return f21575a;
        }
    }

    static {
        t2o.a(665845857);
    }

    public static itl a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (itl) ipChange.ipc$dispatch("daf5ae37", new Object[0]);
        }
        return b.a();
    }

    public void b(Context context, String str, jtl jtlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d99c03c", new Object[]{this, context, str, jtlVar});
        } else {
            new PasswordJudgeRequestI().request(context, str, jtlVar);
        }
    }

    public itl() {
    }
}
