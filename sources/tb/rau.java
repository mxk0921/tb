package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import tb.c2v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class rau extends g2v implements c2v.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UT_PARAM = "utparam-cnt";

    /* renamed from: a  reason: collision with root package name */
    public String f27238a;
    public final int[] b = {2001, 2101, 2201};

    static {
        t2o.a(961544438);
        t2o.a(962593166);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a23a9ae", new Object[0])).booleanValue();
        }
        try {
            rau rauVar = new rau();
            UTAnalytics.getInstance().registerPlugin(rauVar);
            c2v.addPageChangerListener(rauVar);
            return true;
        } catch (Throwable th) {
            ku0.j("TrackUTPlugin.register", th);
            return false;
        }
    }

    public static /* synthetic */ Object ipc$super(rau rauVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/track/TrackUTPlugin");
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        return "TrackUTPlugin";
    }

    @Override // tb.g2v
    public int[] getAttentionEventIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("873e4cb7", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.c2v.a
    public void onPageAppear(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7330a6", new Object[]{this, obj});
        } else {
            this.f27238a = qbu.b(obj);
        }
    }

    @Override // tb.c2v.a
    public void onPageDisAppear(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4c99138", new Object[]{this, obj});
        } else if (!TextUtils.isEmpty(this.f27238a) && TextUtils.equals(qbu.b(obj), this.f27238a)) {
            this.f27238a = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // tb.g2v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map<java.lang.String, java.lang.String> onEventDispatch(java.lang.String r19, int r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.util.Map<java.lang.String, java.lang.String> r24) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rau.onEventDispatch(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.util.Map):java.util.Map");
    }
}
