package tb;

import com.alibaba.poplayer.norm.IPopLayerViewAdapter;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zsr implements IPopLayerViewAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final zsr f32995a = new zsr();

        static {
            t2o.a(790626350);
        }

        public static /* synthetic */ zsr a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (zsr) ipChange.ipc$dispatch("d3e0e6ba", new Object[0]);
            }
            return f32995a;
        }
    }

    static {
        t2o.a(790626349);
        t2o.a(625999975);
    }

    public static zsr a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zsr) ipChange.ipc$dispatch("1d6acd5f", new Object[0]);
        }
        return a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf A[Catch: all -> 0x00af, TryCatch #2 {all -> 0x0068, blocks: (B:9:0x002a, B:10:0x002e, B:12:0x0034, B:15:0x0041, B:17:0x004f, B:19:0x0059, B:24:0x006b, B:26:0x0078, B:29:0x0081, B:32:0x008f, B:37:0x00a7, B:40:0x00b1, B:49:0x00c9, B:51:0x00cf, B:53:0x00d9, B:55:0x00e1, B:57:0x00ef), top: B:62:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f5 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x002e A[SYNTHETIC] */
    @Override // com.alibaba.poplayer.norm.IPopLayerViewAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isHitBlackList(android.net.Uri r8, com.alibaba.poplayer.trigger.BaseConfigItem r9, java.util.List<java.lang.String> r10) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.zsr.isHitBlackList(android.net.Uri, com.alibaba.poplayer.trigger.BaseConfigItem, java.util.List):boolean");
    }
}
