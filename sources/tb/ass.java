package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.link.pop.PopMessageData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ass extends acm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ass f15979a = new ass();

        static {
            t2o.a(1030750329);
        }

        public static /* synthetic */ ass a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ass) ipChange.ipc$dispatch("50a57ea4", new Object[0]);
            }
            return f15979a;
        }
    }

    static {
        t2o.a(1030750327);
    }

    public static ass c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ass) ipChange.ipc$dispatch("9a2f6549", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(ass assVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wireless/link/pop/client/TablePushClient");
    }

    @Override // tb.acm
    public void b(Context context, PopMessageData popMessageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa8cd800", new Object[]{this, context, popMessageData});
            return;
        }
        irg.a("link_tag", "TablePushClient === execute == 开始展示桌面push");
        xfm.i(context, popMessageData);
        cno.b(context).d("msg_last_show_time", Long.valueOf(jsg.f()));
    }

    public ass() {
    }
}
