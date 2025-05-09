package tb;

import android.content.Intent;
import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.dressup.base.IDressUpMtopRequest;
import com.taobao.tao.recommend4.manager.d;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.text.Regex;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class tqm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_RECOMMEND_MANAGER = "recommendManager";
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static b f28885a;
    public static b b;
    public static IDressUpMtopRequest c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(918552599);
        }

        public a() {
        }

        public final void b(Intent intent) {
            nhd b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8aaa397", new Object[]{this, intent});
                return;
            }
            ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            f();
            IDressUpMtopRequest a2 = tqm.a();
            if (a2 != null) {
                String dataString = intent.getDataString();
                ckf.d(dataString);
                a2.requestDetailMtop(dataString);
            }
            g();
            b b2 = tqm.b();
            if (b2 != null && (b = b2.b()) != null) {
                Map<String, String> e = mnv.Companion.e(intent.getData());
                IDressUpMtopRequest a3 = tqm.a();
                if (a3 != null) {
                    a3.requestDetailRecommendData(b, e, true);
                }
            }
        }

        public final void c(Intent intent) {
            nhd b;
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1f44d24", new Object[]{this, intent});
                return;
            }
            ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            h();
            b c = tqm.c();
            if (c != null && (b = c.b()) != null) {
                a aVar = tqm.Companion;
                Uri data = intent.getData();
                if (data == null || (str = data.toString()) == null) {
                    str = "";
                }
                Uri parse = Uri.parse(str);
                if (parse != null) {
                    str2 = parse.getQuery();
                } else {
                    str2 = null;
                }
                JSONObject a2 = aVar.a(String.valueOf(str2));
                aVar.f();
                IDressUpMtopRequest a3 = tqm.a();
                if (a3 != null) {
                    a3.requestFeedRecommendData(b, true, a2, false);
                }
            }
        }

        public final b d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a38671f5", new Object[]{this});
            }
            b b = tqm.b();
            tqm.e(null);
            return b;
        }

        public final b e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c66c8248", new Object[]{this});
            }
            b c = tqm.c();
            tqm.f(null);
            return c;
        }

        public final void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f081ad08", new Object[]{this});
            } else if (tqm.a() == null) {
                tqm.d(jz7.Companion.f());
            }
        }

        public final void g() {
            g1c e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f0b00a0", new Object[]{this});
            } else if (tqm.b() == null && (e = jz7.Companion.e()) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(e.getInfoFlowHostServices());
                d w = d.w(z4a.REC_OUTFIT_TREND, arrayList);
                ckf.f(w, tqm.CONFIG_RECOMMEND_MANAGER);
                tqm.e(new b(w, e));
            }
        }

        public final void h() {
            g1c e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2a20f2d", new Object[]{this});
            } else if (tqm.c() == null && (e = jz7.Companion.e()) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(e.getInfoFlowHostServices());
                d w = d.w(z4a.REC_DAILY_OUTFIT, arrayList);
                ckf.f(w, tqm.CONFIG_RECOMMEND_MANAGER);
                tqm.f(new b(w, e));
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final JSONObject a(String str) {
            List list;
            Object[] array;
            List list2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("31ef06c7", new Object[]{this, str});
            }
            JSONObject jSONObject = new JSONObject();
            try {
                List<String> split = new Regex("&").split(str, 0);
                if (!split.isEmpty()) {
                    ListIterator<String> listIterator = split.listIterator(split.size());
                    while (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() != 0) {
                            list = i04.v0(split, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                list = yz3.i();
                array = list.toArray(new String[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (array != null) {
                for (String str2 : (String[]) array) {
                    List<String> split2 = new Regex("=").split(str2, 0);
                    if (!split2.isEmpty()) {
                        ListIterator<String> listIterator2 = split2.listIterator(split2.size());
                        while (listIterator2.hasPrevious()) {
                            if (listIterator2.previous().length() != 0) {
                                list2 = i04.v0(split2, listIterator2.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                    list2 = yz3.i();
                    Object[] array2 = list2.toArray(new String[0]);
                    if (array2 != null) {
                        String[] strArr = (String[]) array2;
                        if (strArr.length == 2) {
                            jSONObject.put((JSONObject) strArr[0], strArr[1]);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                return jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final nhd f28886a;
        public final g1c b;

        static {
            t2o.a(918552600);
        }

        public b(nhd nhdVar, g1c g1cVar) {
            ckf.g(nhdVar, tqm.CONFIG_RECOMMEND_MANAGER);
            ckf.g(g1cVar, "dressUpHostService");
            this.f28886a = nhdVar;
            this.b = g1cVar;
        }

        public final g1c a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g1c) ipChange.ipc$dispatch("5075540e", new Object[]{this});
            }
            return this.b;
        }

        public final nhd b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nhd) ipChange.ipc$dispatch("5787491e", new Object[]{this});
            }
            return this.f28886a;
        }
    }

    static {
        t2o.a(918552598);
    }

    public static final /* synthetic */ IDressUpMtopRequest a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDressUpMtopRequest) ipChange.ipc$dispatch("c859bd7e", new Object[0]);
        }
        return c;
    }

    public static final /* synthetic */ b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("c28be9ae", new Object[0]);
        }
        return b;
    }

    public static final /* synthetic */ b c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("eb4e95fb", new Object[0]);
        }
        return f28885a;
    }

    public static final /* synthetic */ void d(IDressUpMtopRequest iDressUpMtopRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("508285a8", new Object[]{iDressUpMtopRequest});
        } else {
            c = iDressUpMtopRequest;
        }
    }

    public static final /* synthetic */ void e(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fedd6d84", new Object[]{bVar});
        } else {
            b = bVar;
        }
    }

    public static final /* synthetic */ void f(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3154d7d7", new Object[]{bVar});
        } else {
            f28885a = bVar;
        }
    }
}
