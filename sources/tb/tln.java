package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.util.List;
import java.util.Map;
import tb.ts1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tln implements ts1.g<ts1.h<byte[]>, List<ikl>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements lzx<ts1.h<byte[]>, List<ikl>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(tln tlnVar) {
        }

        /* renamed from: a */
        public List<ikl> apply(ts1.h<byte[]> hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("eebb1c75", new Object[]{this, hVar});
            }
            return tln.e(hVar);
        }
    }

    static {
        t2o.a(628097246);
        t2o.a(628097081);
    }

    @Override // tb.ts1.g
    public Ack a(int i, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Ack) ipChange.ipc$dispatch("dcfd3915", new Object[]{this, new Integer(i), map});
        }
        return null;
    }

    /* renamed from: c */
    public l5y<List<ikl>> b(l5y<ts1.h<byte[]>> l5yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("720c918d", new Object[]{this, l5yVar});
        }
        return l5yVar.G(new a(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<tb.ikl> d(tb.ts1.h<byte[]> r27, java.util.Map<java.lang.String, java.lang.Integer> r28, java.lang.Boolean r29) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tln.d(tb.ts1$h, java.util.Map, java.lang.Boolean):java.util.List");
    }

    public static List<ikl> e(ts1.h<byte[]> hVar) {
        Exception e;
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7c965265", new Object[]{hVar});
        }
        Map<Integer, String> map = hVar.g;
        if (map != null) {
            try {
            } catch (Exception e2) {
                e = e2;
                bool = null;
            }
            if (map.containsKey(0)) {
                bool = Boolean.valueOf(Boolean.parseBoolean(hVar.g.get(0)));
                try {
                    MsgLog.e("ReceivedConverter4ACCS", "parseReceivedData ", "isFullReport:", bool);
                } catch (Exception e3) {
                    e = e3;
                    MsgLog.f("ReceivedConverter4ACCS", e, "oriExtHeader err");
                    return d(hVar, null, bool);
                }
                return d(hVar, null, bool);
            }
        }
        bool = null;
        return d(hVar, null, bool);
    }
}
