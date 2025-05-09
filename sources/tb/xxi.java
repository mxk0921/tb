package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.IPage;
import com.taobao.monitor.procedure.ProcedureImpl;
import com.taobao.monitor.procedure.b;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xxi implements pdd, x6d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final mdd f31661a;
    public volatile mdd b;
    public final Map<Activity, IPage> c = new ConcurrentHashMap();
    public final Map<Fragment, IPage> d = new ConcurrentHashMap();
    public final Map<IPage, mdd> e = new ConcurrentHashMap();
    public final Map<String, mdd> f = new ConcurrentHashMap();
    public final Map<IPage, WeakReference<View>> g = new ConcurrentHashMap();

    public xxi() {
        mdd mddVar = mdd.DEFAULT;
        this.f31661a = mddVar;
        this.b = mddVar;
    }

    public IPage A(Activity activity, IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("f620a270", new Object[]{this, activity, iPage});
        }
        if (activity == null || iPage == null) {
            return null;
        }
        ((ConcurrentHashMap) this.c).put(activity, iPage);
        return iPage;
    }

    public final void B(mdd mddVar, r1w r1wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("704cda44", new Object[]{this, mddVar, r1wVar});
        } else if (mddVar != null && r1wVar != null && v(mddVar) != null) {
            for (ugq ugqVar : v(mddVar).r()) {
                if ("phaPageNavigationStart".equals(ugqVar.a())) {
                    r1wVar.r().add(new ugq(ugqVar.a(), ugqVar.b()));
                }
                if ("phaStartTime".equals(ugqVar.a())) {
                    r1wVar.r().add(new ugq(ugqVar.a(), ugqVar.b()));
                }
                if ("phaManifestFinishLoad".equals(ugqVar.a())) {
                    r1wVar.r().add(new ugq(ugqVar.a(), ugqVar.b()));
                }
                if ("phaPageCreateStart".equals(ugqVar.a())) {
                    r1wVar.r().add(new ugq(ugqVar.a(), ugqVar.b()));
                }
                if ("phaStartTime".equals(ugqVar.a())) {
                    r1wVar.r().add(new ugq(ugqVar.a(), ugqVar.b()));
                }
                if ("navStartTime".equals(ugqVar.a())) {
                    r1wVar.r().add(new ugq(ugqVar.a(), ugqVar.b()));
                }
            }
        }
    }

    public IPage C(Fragment fragment, IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("edc569a9", new Object[]{this, fragment, iPage});
        }
        if (fragment == null || iPage == null) {
            return null;
        }
        ((ConcurrentHashMap) this.d).put(fragment, iPage);
        return iPage;
    }

    public mdd D(IPage iPage, mdd mddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("d7ebbe50", new Object[]{this, iPage, mddVar});
        }
        if (iPage == null) {
            return null;
        }
        ((ConcurrentHashMap) this.f).put(iPage.b(), mddVar);
        return (mdd) ((ConcurrentHashMap) this.e).put(iPage, mddVar);
    }

    public mdd E(IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("a7a2ddd4", new Object[]{this, iPage});
        }
        if (iPage == null) {
            return null;
        }
        ((ConcurrentHashMap) this.c).values().remove(iPage);
        ((ConcurrentHashMap) this.d).values().remove(iPage);
        ((ConcurrentHashMap) this.g).remove(iPage);
        ((ConcurrentHashMap) this.f).remove(iPage.b());
        return (mdd) ((ConcurrentHashMap) this.e).remove(iPage);
    }

    public mdd F(mdd mddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("52aff7fe", new Object[]{this, mddVar});
        }
        if (mddVar == null) {
            this.b = mdd.DEFAULT;
        } else {
            this.b = mddVar;
        }
        return this.b;
    }

    @Override // tb.pdd
    public mdd a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("d755854a", new Object[]{this, activity});
        }
        if (activity == null) {
            return mdd.DEFAULT;
        }
        return x(t((IPage) ((ConcurrentHashMap) this.c).get(activity)));
    }

    @Override // tb.pdd
    public mdd b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("13a17e51", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return mdd.DEFAULT;
        }
        return x((mdd) ((ConcurrentHashMap) this.f).get(str));
    }

    @Override // tb.pdd
    @Deprecated
    public mdd c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("1b99f2eb", new Object[]{this});
        }
        return x(null);
    }

    @Override // tb.x6d
    public synchronized IPage d(View view) {
        IPage iPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("aaa26240", new Object[]{this, view});
        }
        if (view == null) {
            return IPage.DEFAULT_PAGE;
        }
        Map<View, IPage> y = y();
        ArrayList arrayList = new ArrayList();
        do {
            if (y.containsKey(view) && (iPage = y.get(view)) != null) {
                arrayList.add(iPage);
            }
            if (view.getParent() == null || !(view.getParent() instanceof View)) {
                view = null;
                continue;
            } else {
                view = (View) view.getParent();
                continue;
            }
        } while (view != null);
        return new b(arrayList);
    }

    @Override // tb.pdd
    public mdd e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("ea1481c7", new Object[]{this});
        }
        return x(this.b);
    }

    @Override // tb.x6d
    public IPage f(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("d0731da4", new Object[]{this, activity});
        }
        if (activity == null) {
            return IPage.DEFAULT_PAGE;
        }
        return w((IPage) ((ConcurrentHashMap) this.c).get(activity));
    }

    @Override // tb.pdd
    public synchronized mdd g(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("be362f91", new Object[]{this, view});
        } else if (view == null) {
            return mdd.DEFAULT;
        } else {
            Map<View, mdd> z = z();
            while (!z.containsKey(view)) {
                if (view.getParent() == null || !(view.getParent() instanceof View)) {
                    view = null;
                    continue;
                } else {
                    view = (View) view.getParent();
                    continue;
                }
                if (view == null) {
                    return mdd.DEFAULT;
                }
            }
            return x(z.get(view));
        }
    }

    @Override // tb.pdd
    public mdd h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("33a90ac5", new Object[]{this});
        }
        return x(this.f31661a);
    }

    @Override // tb.x6d
    public IPage i(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("9f5ca21d", new Object[]{this, fragment});
        }
        if (fragment == null) {
            return IPage.DEFAULT_PAGE;
        }
        return w((IPage) ((ConcurrentHashMap) this.d).get(fragment));
    }

    @Override // tb.pdd
    public mdd j(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("19c020f", new Object[]{this, fragment});
        }
        if (fragment == null) {
            return mdd.DEFAULT;
        }
        return x(t((IPage) ((ConcurrentHashMap) this.d).get(fragment)));
    }

    @Override // tb.x6d
    public synchronized IPage k(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("aa5a030b", new Object[]{this, view});
        } else if (view == null) {
            return IPage.DEFAULT_PAGE;
        } else {
            Map<View, IPage> y = y();
            while (!y.containsKey(view)) {
                if (view.getParent() == null || !(view.getParent() instanceof View)) {
                    view = null;
                    continue;
                } else {
                    view = (View) view.getParent();
                    continue;
                }
                if (view == null) {
                    return IPage.DEFAULT_PAGE;
                }
            }
            return w(y.get(view));
        }
    }

    @Override // tb.pdd
    @Deprecated
    public mdd l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("f1358a4a", new Object[]{this});
        }
        return x(null);
    }

    public final r1w m(mdd mddVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r1w) ipChange.ipc$dispatch("9d8729ed", new Object[]{this, mddVar, str});
        }
        r1w v = v(mddVar);
        if (v != null && v.n().get("H5_URL") != null && !TextUtils.isEmpty(v.n().get("H5_URL").toString()) && o(str, v.n().get("H5_URL").toString())) {
            return v;
        }
        if (v == null || v.n().get("schemaUrl") == null || TextUtils.isEmpty(v.n().get("schemaUrl").toString()) || !o(str, v.n().get("schemaUrl").toString())) {
            return null;
        }
        return v;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26ba60be", new Object[]{this});
            return;
        }
        ((ConcurrentHashMap) this.c).clear();
        ((ConcurrentHashMap) this.d).clear();
        ((ConcurrentHashMap) this.f).clear();
        ((ConcurrentHashMap) this.e).clear();
        ((ConcurrentHashMap) this.g).clear();
    }

    public final boolean o(String str, String str2) {
        URI uri;
        URI uri2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c0b74ba", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            uri = new URI(str);
            uri2 = new URI(str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (uri2.equals(uri)) {
            return true;
        }
        if (str.substring(uri.getScheme().length()).equals(str2.substring(uri2.getScheme().length()))) {
            return true;
        }
        return false;
    }

    public final mdd p(Fragment fragment) {
        IPage iPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("add98a97", new Object[]{this, fragment});
        }
        FragmentActivity activity = fragment.getActivity();
        if (activity == null || (iPage = (IPage) ((ConcurrentHashMap) this.c).get(activity)) == null) {
            return null;
        }
        return (mdd) ((ConcurrentHashMap) this.e).get(iPage);
    }

    public List<JSONObject> q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cd15af1d", new Object[]{this, str});
        }
        return r(str);
    }

    public final List<JSONObject> r(String str) {
        r1w m;
        r1w m2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d3df03e6", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((ConcurrentHashMap) this.d).entrySet()) {
            IPage iPage = (IPage) entry.getValue();
            if (!(iPage == null || (m2 = m((mdd) ((ConcurrentHashMap) this.e).get(iPage), str)) == null)) {
                B(p((Fragment) entry.getKey()), m2);
                try {
                    arrayList.add(new JSONObject(uxm.e(m2)));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        r1w m3 = m(null, str);
        if (m3 != null) {
            try {
                arrayList.add(new JSONObject(uxm.e(m3)));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        for (IPage iPage2 : ((ConcurrentHashMap) this.c).values()) {
            if (!(iPage2 == null || (m = m((mdd) ((ConcurrentHashMap) this.e).get(iPage2), str)) == null)) {
                try {
                    arrayList.add(new JSONObject(uxm.e(m)));
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public mdd s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("c25d97ba", new Object[]{this});
        }
        if (this.b == null || !this.b.isAlive()) {
            return x(this.f31661a);
        }
        return this.b;
    }

    public mdd t(IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("1ca4c742", new Object[]{this, iPage});
        }
        if (iPage == null) {
            return mdd.DEFAULT;
        }
        return x((mdd) ((ConcurrentHashMap) this.e).get(iPage));
    }

    public String u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("873286db", new Object[]{this, str});
        }
        List<JSONObject> r = r(str);
        if (r == null || r.isEmpty()) {
            return null;
        }
        return r.get(0).toString();
    }

    public r1w v(mdd mddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r1w) ipChange.ipc$dispatch("72ee2c7", new Object[]{this, mddVar});
        }
        if (mddVar instanceof wxm) {
            return ((ProcedureImpl) ((wxm) mddVar).y()).y();
        }
        if (mddVar instanceof ProcedureImpl) {
            return ((ProcedureImpl) mddVar).y();
        }
        return null;
    }

    public final IPage w(IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("89268e18", new Object[]{this, iPage});
        }
        if (iPage == null) {
            return IPage.DEFAULT_PAGE;
        }
        return iPage;
    }

    public final mdd x(mdd mddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("fd7e7a44", new Object[]{this, mddVar});
        }
        if (mddVar == null) {
            return mdd.DEFAULT;
        }
        return mddVar;
    }

    public final Map<View, IPage> y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8fd9ed3a", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : ((ConcurrentHashMap) this.c).entrySet()) {
            if (!(entry.getKey() == null || ((Activity) entry.getKey()).getWindow() == null || ((Activity) entry.getKey()).getWindow().getDecorView() == null || entry.getValue() == null || ((ConcurrentHashMap) this.e).get(entry.getValue()) == null)) {
                hashMap.put(((Activity) entry.getKey()).getWindow().getDecorView(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : ((ConcurrentHashMap) this.d).entrySet()) {
            if (!(entry2.getKey() == null || ((Fragment) entry2.getKey()).getView() == null || entry2.getValue() == null || ((ConcurrentHashMap) this.e).get(entry2.getValue()) == null)) {
                hashMap.put(((Fragment) entry2.getKey()).getView(), entry2.getValue());
            }
        }
        return hashMap;
    }

    public final Map<View, mdd> z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("84cf4eb4", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : ((ConcurrentHashMap) this.c).entrySet()) {
            if (!(entry.getKey() == null || ((Activity) entry.getKey()).getWindow() == null || ((Activity) entry.getKey()).getWindow().peekDecorView() == null || entry.getValue() == null || ((ConcurrentHashMap) this.e).get(entry.getValue()) == null)) {
                hashMap.put(((Activity) entry.getKey()).getWindow().peekDecorView(), ((ConcurrentHashMap) this.e).get(entry.getValue()));
            }
        }
        for (Map.Entry entry2 : ((ConcurrentHashMap) this.d).entrySet()) {
            if (!(entry2.getKey() == null || ((Fragment) entry2.getKey()).getView() == null || entry2.getValue() == null || ((ConcurrentHashMap) this.e).get(entry2.getValue()) == null)) {
                hashMap.put(((Fragment) entry2.getKey()).getView(), ((ConcurrentHashMap) this.e).get(entry2.getValue()));
            }
        }
        return hashMap;
    }
}
