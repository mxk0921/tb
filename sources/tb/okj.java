package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class okj {
    public static final /* synthetic */ a0g<Object>[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f25443a;
    public final mjn b;
    public final mjn c;
    public final mjn d;
    public final mjn e;
    public final mjn f;
    public final mjn g;
    public final mjn h;
    public final mjn i;
    public final mjn j;
    public final mjn k;
    public final mjn l;
    public final mjn m;
    public final mjn n;
    public final mjn o;
    public final mjn p;

    public okj(Map<String, Object> map) {
        ckf.g(map, "data");
        this.f25443a = map;
        this.b = l2g.a(map, "sessionId");
        this.c = l2g.a(map, "liveId");
        this.d = l2g.a(map, "watchID");
        this.e = l2g.a(map, yj4.PARAM_PVID);
        this.f = l2g.a(map, "kandianid");
        this.g = l2g.a(map, "isAD");
        this.h = l2g.a(map, "entryLiveSource");
        this.i = l2g.a(map, "entrySpm");
        this.j = l2g.a(map, "liveUrlList");
        this.k = l2g.a(map, yj4.PARAM_IS_FIRST_ENTER);
        this.l = l2g.a(map, "liveToken");
        this.m = l2g.a(map, "customSPM");
        this.n = l2g.a(map, "entryLiveItemId");
        this.o = l2g.a(map, "needRequestLiveDetail");
        this.p = l2g.a(map, "needSendPowerMsg");
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32f830d0", new Object[]{this});
        }
        return (String) this.m.b(this, $$delegatedProperties[11]);
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65adfd43", new Object[]{this});
        }
        return (String) this.n.b(this, $$delegatedProperties[12]);
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d835ead6", new Object[]{this});
        }
        return (String) this.h.b(this, $$delegatedProperties[6]);
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60a3c12a", new Object[]{this});
        }
        return (String) this.f.b(this, $$delegatedProperties[4]);
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3e779a2", new Object[]{this});
        }
        return (String) this.l.b(this, $$delegatedProperties[10]);
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fecbce59", new Object[]{this});
        }
        return (String) this.o.b(this, $$delegatedProperties[13]);
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11b22de9", new Object[]{this});
        }
        return (String) this.p.b(this, $$delegatedProperties[14]);
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e57b9d85", new Object[]{this});
        }
        return (String) this.d.b(this, $$delegatedProperties[2]);
    }

    public void i(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("723a2dbd", new Object[]{this, map});
        } else if (map != null) {
            this.f25443a.putAll(map);
        }
    }

    static {
        t2o.a(1004535862);
        t2o.a(1002438666);
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(okj.class, "sessionId", "getSessionId()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl);
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(okj.class, "liveId", "getLiveId()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl2);
        MutablePropertyReference1Impl mutablePropertyReference1Impl3 = new MutablePropertyReference1Impl(okj.class, "watchID", "getWatchID()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl3);
        MutablePropertyReference1Impl mutablePropertyReference1Impl4 = new MutablePropertyReference1Impl(okj.class, yj4.PARAM_PVID, "getPvid()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl4);
        MutablePropertyReference1Impl mutablePropertyReference1Impl5 = new MutablePropertyReference1Impl(okj.class, "kandianid", "getKandianid()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl5);
        MutablePropertyReference1Impl mutablePropertyReference1Impl6 = new MutablePropertyReference1Impl(okj.class, "isAD", "isAD()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl6);
        MutablePropertyReference1Impl mutablePropertyReference1Impl7 = new MutablePropertyReference1Impl(okj.class, "entryLiveSource", "getEntryLiveSource()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl7);
        MutablePropertyReference1Impl mutablePropertyReference1Impl8 = new MutablePropertyReference1Impl(okj.class, "entrySpm", "getEntrySpm()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl8);
        MutablePropertyReference1Impl mutablePropertyReference1Impl9 = new MutablePropertyReference1Impl(okj.class, "liveUrlList", "getLiveUrlList()Ljava/util/List;", 0);
        dun.f(mutablePropertyReference1Impl9);
        MutablePropertyReference1Impl mutablePropertyReference1Impl10 = new MutablePropertyReference1Impl(okj.class, yj4.PARAM_IS_FIRST_ENTER, "isFirstEnter()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl10);
        MutablePropertyReference1Impl mutablePropertyReference1Impl11 = new MutablePropertyReference1Impl(okj.class, "liveToken", "getLiveToken()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl11);
        MutablePropertyReference1Impl mutablePropertyReference1Impl12 = new MutablePropertyReference1Impl(okj.class, "customSPM", "getCustomSPM()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl12);
        MutablePropertyReference1Impl mutablePropertyReference1Impl13 = new MutablePropertyReference1Impl(okj.class, "entryLiveItemId", "getEntryLiveItemId()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl13);
        MutablePropertyReference1Impl mutablePropertyReference1Impl14 = new MutablePropertyReference1Impl(okj.class, "needRequestLiveDetail", "getNeedRequestLiveDetail()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl14);
        MutablePropertyReference1Impl mutablePropertyReference1Impl15 = new MutablePropertyReference1Impl(okj.class, "needSendPowerMsg", "getNeedSendPowerMsg()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl15);
        $$delegatedProperties = new a0g[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, mutablePropertyReference1Impl3, mutablePropertyReference1Impl4, mutablePropertyReference1Impl5, mutablePropertyReference1Impl6, mutablePropertyReference1Impl7, mutablePropertyReference1Impl8, mutablePropertyReference1Impl9, mutablePropertyReference1Impl10, mutablePropertyReference1Impl11, mutablePropertyReference1Impl12, mutablePropertyReference1Impl13, mutablePropertyReference1Impl14, mutablePropertyReference1Impl15};
    }
}
