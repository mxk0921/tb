package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.powermsg.common.PowerMessage;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class grl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ParseKit";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements lzx<List<ikl>, List<PowerMessage>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public List<PowerMessage> apply(List<ikl> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("6ec325a1", new Object[]{this, list});
            }
            ArrayList arrayList = new ArrayList();
            for (ikl iklVar : list) {
                if (iklVar.f21366a.type() == 1) {
                    arrayList.add(iyv.b((BaseMessage) iklVar.f21366a));
                }
            }
            return arrayList;
        }
    }

    static {
        t2o.a(628097243);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements vxx<List<PowerMessage>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ack f20181a;

        public a(Ack ack) {
            this.f20181a = ack;
        }

        /* renamed from: a */
        public void accept(List<PowerMessage> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1d130480", new Object[]{this, list});
                return;
            }
            MsgLog.e(grl.TAG, "pullHistory >", Integer.valueOf(list.size()));
            this.f20181a.data = list;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.ikl<com.taobao.tao.messagekit.core.model.BaseMessage> a(tb.cs6 r19, java.lang.String r20, int r21, java.lang.String r22, long r23, java.util.Map<java.lang.String, java.lang.Integer> r25, java.lang.Boolean r26) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.grl.a(tb.cs6, java.lang.String, int, java.lang.String, long, java.util.Map, java.lang.Boolean):tb.ikl");
    }
}
