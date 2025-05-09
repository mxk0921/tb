package com.taobao.android.dinamicx.videoc;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import tb.iew;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXVideoControlConfig<VideoData> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_MAX_PLAYING_VIDEO = 1;
    public static final long DEFAULT_PLAY_DELAY = 300;
    public static final String DEFAULT_SCENE_NAME = "video";
    public static final float DEFAULT_VIEW_AREA_PERCENT = 0.8f;
    public static final int PLAY_ORDER_POSITIVE = 0;
    public static final int PLAY_ORDER_REVERSE = 1;

    /* renamed from: a  reason: collision with root package name */
    public float f7344a;
    public long b;
    public int d;
    public boolean e;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final Map<String, List<Class<? extends DXWidgetNode>>> c = new HashMap();
    public boolean f = false;
    public int g = 0;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface PlayOrder {
    }

    static {
        t2o.a(444597078);
    }

    public static DXVideoControlConfig<iew> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("e2c6deef", new Object[0]);
        }
        return o();
    }

    public static <VideoData> DXVideoControlConfig<VideoData> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("3ddf61c", new Object[0]);
        }
        return new DXVideoControlConfig().m(0.8f).d(1).f(300L).h(true);
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bca1975", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57340079", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("507a409e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2156c9ba", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public DXVideoControlConfig<VideoData> F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("3a4abcf9", new Object[]{this, str});
        }
        HashSet hashSet = new HashSet();
        for (List list : ((HashMap) this.c).values()) {
            hashSet.addAll(list);
        }
        ((HashMap) this.c).clear();
        ((HashMap) this.c).put(str, new ArrayList(hashSet));
        return this;
    }

    public DXVideoControlConfig<VideoData> a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("3722992f", new Object[]{this, new Boolean(z)});
        }
        this.k = z;
        return this;
    }

    public DXVideoControlConfig<VideoData> b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("71391870", new Object[]{this, new Boolean(z)});
        }
        this.j = z;
        return this;
    }

    public DXVideoControlConfig<VideoData> c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("e2d45218", new Object[]{this, new Boolean(z)});
        }
        this.f = z;
        return this;
    }

    public DXVideoControlConfig<VideoData> d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("bb3aa9f2", new Object[]{this, new Integer(i)});
        }
        this.h = Math.max(1, i);
        return this;
    }

    public DXVideoControlConfig<VideoData> e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("98df4d1a", new Object[]{this, new Integer(i)});
        }
        this.g = i;
        return this;
    }

    public DXVideoControlConfig<VideoData> f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("766e56b5", new Object[]{this, new Long(j)});
        }
        this.b = Math.max(j, 0L);
        return this;
    }

    @Deprecated
    public DXVideoControlConfig<VideoData> g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("b5fd6009", new Object[]{this, new Integer(i)});
        }
        this.d = i;
        return this;
    }

    public DXVideoControlConfig<VideoData> h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("51110665", new Object[]{this, new Boolean(z)});
        }
        return g(!z ? 1 : 0);
    }

    public DXVideoControlConfig<VideoData> i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("77c96ed7", new Object[]{this, new Boolean(z)});
        }
        this.e = z;
        return this;
    }

    public DXVideoControlConfig<VideoData> j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("21ac57cb", new Object[]{this, new Boolean(z)});
        }
        this.i = z;
        return this;
    }

    @SafeVarargs
    public final DXVideoControlConfig<VideoData> k(String str, Class<? extends DXWidgetNode>... clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("2c8039f5", new Object[]{this, str, clsArr});
        }
        List list = (List) ((HashMap) this.c).get(str);
        if (list == null) {
            list = new ArrayList();
        }
        list.addAll(Arrays.asList(clsArr));
        ((HashMap) this.c).put(str, list);
        return this;
    }

    @SafeVarargs
    public final DXVideoControlConfig<VideoData> l(Class<? extends DXWidgetNode>... clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("1276102b", new Object[]{this, clsArr});
        }
        return k("video", clsArr);
    }

    public DXVideoControlConfig<VideoData> m(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("bf03c44d", new Object[]{this, new Float(f)});
        }
        if (f > 1.0f || f < 0.0f) {
            f = 0.8f;
        }
        this.f7344a = f;
        return this;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef429d4", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e410535", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public int r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef50cbb5", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public long s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("926c6ff4", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970b603e", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public Map<String, List<Class<? extends DXWidgetNode>>> u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fc0636ec", new Object[]{this});
        }
        return this.c;
    }

    public Comparator<VideoData> v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Comparator) ipChange.ipc$dispatch("ced80778", new Object[]{this});
        }
        return null;
    }

    public float w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97de46d4", new Object[]{this})).floatValue();
        }
        return this.f7344a;
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5d98dd6", new Object[]{this})).booleanValue();
        }
        return this.k;
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7978524d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f238b58d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d356effd", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
