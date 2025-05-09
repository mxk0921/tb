package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.fxb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class s00<VideoData, Video> implements fxb<VideoData, Video> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Pair<List<VideoData>, pic<Video>>> f27707a = new HashMap();
    public final Map<String, Map<Video, fxb.a<VideoData>>> b = new HashMap();
    public final dxb<VideoData, Video> c;
    public final Comparator<VideoData> d;
    public final boolean e;
    public final boolean f;

    static {
        t2o.a(444597085);
        t2o.a(444597088);
    }

    public s00(dxb<VideoData, Video> dxbVar, Comparator<VideoData> comparator, boolean z, boolean z2) {
        this.c = dxbVar;
        this.d = comparator;
        this.e = z;
        this.f = z2;
    }

    public void A(String str, Video video) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9598c078", new Object[]{this, str, video});
            return;
        }
        pic<Video> l = l(str);
        if (l != null) {
            l.c(l.indexOf(video));
        }
    }

    public final void B(String str) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfdbd4df", new Object[]{this, str});
        } else if (zg5.a4() && (map = (Map) ((HashMap) this.b).get(str)) != null) {
            map.clear();
        }
    }

    public Collection<String> C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("325f3b19", new Object[]{this});
        }
        return ((km6) this.c).j();
    }

    public abstract boolean D(List<VideoData> list, List<VideoData> list2);

    public Video E(String str, Video video) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Video) ipChange.ipc$dispatch("41fd1c24", new Object[]{this, str, video});
        }
        pic<Video> l = l(str);
        if (l == null) {
            return null;
        }
        return l.remove(video);
    }

    public final Video F(Video video, Video video2, pic<Video> picVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Video) ipChange.ipc$dispatch("708f05cb", new Object[]{this, video, video2, picVar});
        }
        if (!picVar.contains(video)) {
            return null;
        }
        if (!this.f || video2 != null || picVar.isEmpty()) {
            return video2;
        }
        picVar.e();
        picVar.a(0);
        return picVar.get(0);
    }

    public void a(String str, Video video) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7120a0a", new Object[]{this, str, video});
            return;
        }
        pic<Video> l = l(str);
        if (l != null) {
            l.a(l.indexOf(video));
        }
    }

    public Collection<Video> b(String str, VideoData videodata) {
        List<VideoData> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("69ac15cf", new Object[]{this, str, videodata});
        }
        Pair pair = (Pair) ((HashMap) this.f27707a).get(str);
        if (pair != null) {
            list = (List) pair.first;
        } else {
            list = new ArrayList<>();
        }
        return z(str, q(list, videodata));
    }

    public Collection<Video> c(String str, List<VideoData> list) {
        List<VideoData> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("40e113b4", new Object[]{this, str, list});
        }
        Pair pair = (Pair) ((HashMap) this.f27707a).get(str);
        if (pair != null) {
            list2 = (List) pair.first;
        } else {
            list2 = new ArrayList<>();
        }
        return z(str, r(list2, list));
    }

    public List<Video> d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2710d352", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        Pair pair = (Pair) ((HashMap) this.f27707a).remove(str);
        if (pair != null) {
            arrayList.addAll(((pic) pair.second).i());
        }
        return arrayList;
    }

    public Map<String, List<Video>> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f9a35040", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : ((HashMap) this.f27707a).entrySet()) {
            hashMap.put(entry.getKey(), ((pic) ((Pair) entry.getValue()).second).i());
        }
        ((HashMap) this.f27707a).clear();
        return hashMap;
    }

    public boolean f(String str, Video video) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1a2e5cd", new Object[]{this, str, video})).booleanValue();
        }
        pic<Video> l = l(str);
        if (l != null && l.indexOf(video) > -1) {
            return true;
        }
        return false;
    }

    public pic<Video> g(String str, List<VideoData> list, List<VideoData> list2, pic<Video> picVar) {
        List<Video> list3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pic) ipChange.ipc$dispatch("580b4d6d", new Object[]{this, str, list, list2, picVar});
        }
        pic<Video> s = s();
        for (int i = 0; i < list.size(); i++) {
            VideoData videodata = list.get(i);
            if (picVar == null || list2.isEmpty()) {
                list3 = null;
            } else {
                list3 = u(videodata, list2, picVar);
            }
            if (list3 == null || list3.isEmpty()) {
                list3 = ((km6) this.c).e(videodata, str);
            }
            if (list3 != null && !list3.isEmpty()) {
                if (this.e) {
                    Collections.reverse(list3);
                }
                s.j(i, list3);
                for (Video video : list3) {
                    x(str, video, new fxb.a<>(videodata));
                }
            }
        }
        return s;
    }

    public List<Video> h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c1e1e254", new Object[]{this, str});
        }
        pic<Video> l = l(str);
        if (l == null) {
            return null;
        }
        return l.peek();
    }

    public Collection<Video> i(String str, VideoData videodata) {
        List<VideoData> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("7e9dd3a0", new Object[]{this, str, videodata});
        }
        Pair pair = (Pair) ((HashMap) this.f27707a).get(str);
        if (pair != null) {
            list = (List) pair.first;
        } else {
            list = new ArrayList<>();
        }
        return z(str, t(list, videodata));
    }

    public fxb.a<VideoData> j(String str, Video video) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fxb.a) ipChange.ipc$dispatch("d78ab333", new Object[]{this, str, video});
        }
        if (zg5.a4() && (map = (Map) ((HashMap) this.b).get(str)) != null) {
            return (fxb.a) map.get(video);
        }
        return null;
    }

    public int k(String str, Video video) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74080b0e", new Object[]{this, str, video})).intValue();
        }
        Pair pair = (Pair) ((HashMap) this.f27707a).get(str);
        if (pair == null) {
            return -1;
        }
        List list = (List) pair.first;
        int intValue = ((pic) pair.second).k(video).intValue();
        if (intValue < 0 || intValue >= list.size()) {
            return -1;
        }
        return v(list.get(intValue));
    }

    public final pic<Video> l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pic) ipChange.ipc$dispatch("ae6169ae", new Object[]{this, str});
        }
        Pair pair = (Pair) ((HashMap) this.f27707a).get(str);
        if (pair == null) {
            return null;
        }
        return (pic) pair.second;
    }

    public List<Video> m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("753ade08", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        Pair pair = (Pair) ((HashMap) this.f27707a).get(str);
        if (pair != null) {
            arrayList.addAll(((pic) pair.second).i());
        }
        return arrayList;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57340079", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public Video o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Video) ipChange.ipc$dispatch("55261f3a", new Object[]{this, str});
        }
        pic<Video> l = l(str);
        if (l == null) {
            return null;
        }
        return l.h();
    }

    public Video p(String str, Video video) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Video) ipChange.ipc$dispatch("1799f65d", new Object[]{this, str, video});
        }
        pic<Video> l = l(str);
        if (l == null) {
            return null;
        }
        return F(video, l.f(video), l);
    }

    public abstract List<VideoData> q(List<VideoData> list, VideoData videodata);

    public abstract List<VideoData> r(List<VideoData> list, List<VideoData> list2);

    public abstract pic<Video> s();

    public abstract List<VideoData> t(List<VideoData> list, VideoData videodata);

    public abstract List<Video> u(VideoData videodata, List<VideoData> list, pic<Video> picVar);

    public abstract int v(VideoData videodata);

    public Video w(String str, Video video) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Video) ipChange.ipc$dispatch("7a442118", new Object[]{this, str, video});
        }
        pic<Video> l = l(str);
        if (l == null) {
            return null;
        }
        return F(video, l.d(video), l);
    }

    public final void x(String str, Video video, fxb.a<VideoData> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70329d1a", new Object[]{this, str, video, aVar});
        } else if (zg5.a4()) {
            Map map = (Map) ((HashMap) this.b).get(str);
            if (map == null) {
                map = new HashMap();
                ((HashMap) this.b).put(str, map);
            }
            map.put(video, aVar);
        }
    }

    public Video y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Video) ipChange.ipc$dispatch("5083d983", new Object[]{this, str});
        }
        pic<Video> l = l(str);
        if (l == null || l.isEmpty()) {
            return null;
        }
        l.reset();
        l.a(0);
        return l.get(0);
    }

    public Collection<Video> z(String str, List<VideoData> list) {
        List<VideoData> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("7f7723cf", new Object[]{this, str, list});
        }
        if (DinamicXEngine.j0()) {
            h36.g("DXVideoManager", "start refreshQueue videoDataSize: " + list.size());
        }
        Pair pair = (Pair) ((HashMap) this.f27707a).get(str);
        if (pair != null) {
            list2 = (List) pair.first;
        } else {
            list2 = new ArrayList<>();
        }
        pic<Video> picVar = pair != null ? (pic) pair.second : null;
        if (list.size() > 1) {
            Collections.sort(list, this.d);
        }
        if (!D(list2, list)) {
            if (DinamicXEngine.j0()) {
                h36.g("DXVideoManager", "end refreshQueue(not changed)");
            }
            return null;
        }
        B(str);
        pic<Video> g = g(str, list, list2, picVar);
        ((HashMap) this.f27707a).put(str, new Pair(list, g));
        g.reset();
        if (picVar == null) {
            g.a(0);
            if (DinamicXEngine.j0()) {
                h36.g("DXVideoManager", "end refreshQueue(oldQueue empty)");
            }
            return Collections.emptyList();
        }
        List<Video> peek = picVar.peek();
        if (peek.isEmpty() && !picVar.isEmpty()) {
            g.a(Math.max(0, g.indexOf(picVar.get(picVar.size() - 1)) + 1));
            for (Video video : picVar.g()) {
                g.b(video);
            }
        }
        for (Video video2 : peek) {
            g.a(Math.max(0, g.indexOf(video2)));
        }
        if (peek.isEmpty()) {
            g.a(0);
        }
        if (DinamicXEngine.j0()) {
            h36.g("DXVideoManager", "end refreshQueue");
        }
        return picVar.i();
    }
}
