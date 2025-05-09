package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.Pair;
import tb.idb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class nr implements qqc<rq> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final Pair<String, rq> f24895a = new Pair<>("", new rq(new b(1, kotlin.collections.a.h()), null, 2, null));

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public final Pair<String, rq> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("86c92464", new Object[]{this});
            }
            return nr.b();
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements idb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, i11> f24896a;

        public b(int i, Map<String, i11> map) {
            ckf.g(map, "apiSpecs");
            this.f24896a = map;
        }

        @Override // tb.idb
        public int a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e589b895", new Object[]{this, str})).intValue();
            }
            ckf.g(str, "api");
            return idb.a.a(this, str);
        }

        @Override // tb.idb
        public boolean b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("96108063", new Object[]{this, str})).booleanValue();
            }
            ckf.g(str, "api");
            return true;
        }

        @Override // tb.idb
        public hdb build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hdb) ipChange.ipc$dispatch("c75cea09", new Object[]{this});
            }
            return null;
        }

        @Override // tb.idb
        public int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("52ec830e", new Object[]{this})).intValue();
            }
            return 1;
        }
    }

    public static final /* synthetic */ Pair b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("63ae95cd", new Object[0]);
        }
        return f24895a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(45:6|(2:93|7)|9|(2:101|10)|(4:121|12|13|(5:131|14|15|115|16))|(4:99|20|21|(4:109|22|23|(4:113|24|25|(3:117|26|27))))|(5:129|28|29|95|30)|37|103|38|40|127|41|42|119|43|46|(2:133|47)|49|107|50|(2:141|52)|91|54|55|97|56|57|111|58|59|123|60|61|(4:137|62|63|(4:139|64|65|(3:143|66|67)))|(2:145|68)|77|125|78|105|80|135|82|84|85) */
    /* JADX WARN: Can't wrap try/catch for region: R(46:6|93|7|9|(2:101|10)|(4:121|12|13|(5:131|14|15|115|16))|(4:99|20|21|(4:109|22|23|(4:113|24|25|(3:117|26|27))))|(5:129|28|29|95|30)|37|103|38|40|127|41|42|119|43|46|(2:133|47)|49|107|50|(2:141|52)|91|54|55|97|56|57|111|58|59|123|60|61|(4:137|62|63|(4:139|64|65|(3:143|66|67)))|(2:145|68)|77|125|78|105|80|135|82|84|85) */
    /* JADX WARN: Can't wrap try/catch for region: R(50:6|93|7|9|101|10|(4:121|12|13|(5:131|14|15|115|16))|99|20|21|(4:109|22|23|(4:113|24|25|(3:117|26|27)))|(5:129|28|29|95|30)|37|103|38|40|127|41|42|119|43|46|(2:133|47)|49|107|50|(2:141|52)|91|54|55|97|56|57|111|58|59|123|60|61|(4:137|62|63|(4:139|64|65|(3:143|66|67)))|(2:145|68)|77|125|78|105|80|135|82|84|85) */
    /* JADX WARN: Can't wrap try/catch for region: R(53:6|93|7|9|101|10|(4:121|12|13|(5:131|14|15|115|16))|99|20|21|109|22|23|(4:113|24|25|(3:117|26|27))|(5:129|28|29|95|30)|37|103|38|40|127|41|42|119|43|46|(2:133|47)|49|107|50|(2:141|52)|91|54|55|97|56|57|111|58|59|123|60|61|(4:137|62|63|(4:139|64|65|(3:143|66|67)))|(2:145|68)|77|125|78|105|80|135|82|84|85) */
    /* JADX WARN: Can't wrap try/catch for region: R(58:6|93|7|9|101|10|(4:121|12|13|(5:131|14|15|115|16))|99|20|21|109|22|23|113|24|25|117|26|27|(5:129|28|29|95|30)|37|103|38|40|127|41|42|119|43|46|(2:133|47)|49|107|50|(2:141|52)|91|54|55|97|56|57|111|58|59|123|60|61|(4:137|62|63|(4:139|64|65|(3:143|66|67)))|(2:145|68)|77|125|78|105|80|135|82|84|85) */
    /* JADX WARN: Can't wrap try/catch for region: R(61:6|93|7|9|101|10|121|12|13|(5:131|14|15|115|16)|99|20|21|109|22|23|113|24|25|117|26|27|(5:129|28|29|95|30)|37|103|38|40|127|41|42|119|43|46|(2:133|47)|49|107|50|(2:141|52)|91|54|55|97|56|57|111|58|59|123|60|61|(4:137|62|63|(4:139|64|65|(3:143|66|67)))|(2:145|68)|77|125|78|105|80|135|82|84|85) */
    /* JADX WARN: Can't wrap try/catch for region: R(70:6|93|7|9|101|10|121|12|13|131|14|15|115|16|99|20|21|109|22|23|113|24|25|117|26|27|129|28|29|95|30|37|103|38|40|127|41|42|119|43|46|133|47|49|107|50|(2:141|52)|91|54|55|97|56|57|111|58|59|123|60|61|(4:137|62|63|(4:139|64|65|(3:143|66|67)))|(2:145|68)|77|125|78|105|80|135|82|84|85) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x06aa, code lost:
        r1 = tb.nr.Companion.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x085c, code lost:
        r7 = "send";
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x085e, code lost:
        r1 = tb.nr.Companion.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0ae9, code lost:
        r5 = tb.nr.Companion.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0c1d, code lost:
        r39 = r0;
        r38 = r1;
        r37 = r2;
        r36 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0c26, code lost:
        r39 = r0;
        r38 = r1;
        r37 = r2;
        r36 = r3;
        r35 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0c31, code lost:
        r39 = r0;
        r38 = r1;
        r37 = r2;
        r36 = r3;
        r35 = r4;
        r34 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0c3e, code lost:
        r39 = r0;
        r38 = r1;
        r37 = r2;
        r36 = r3;
        r35 = r4;
        r34 = r5;
        r33 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0c9c, code lost:
        r2 = tb.nr.Companion.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0ce9, code lost:
        r3 = tb.nr.Companion.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0d17, code lost:
        r4 = tb.nr.Companion.a();
     */
    @Override // tb.qqc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map<java.lang.String, tb.rq> a() {
        /*
            Method dump skipped, instructions count: 3515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.nr.a():java.util.Map");
    }
}
