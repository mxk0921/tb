package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.behavior.UTEventId;
import java.util.Map;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class t2v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f28443a = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final t2v f28444a = new t2v();

        static {
            t2o.a(962593189);
        }

        public static /* synthetic */ t2v access$000() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (t2v) ipChange.ipc$dispatch("3fccf5e9", new Object[0]);
            }
            return f28444a;
        }
    }

    static {
        t2o.a(962593188);
    }

    public static t2v getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t2v) ipChange.ipc$dispatch("db8e192e", new Object[0]);
        }
        return a.access$000();
    }

    public final synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0f8c0f", new Object[]{this});
            return;
        }
        nhh.f("UTScrollTracker", "endScroll scrollKey", this.f28443a);
        if (!TextUtils.isEmpty(this.f28443a)) {
            y0v.getInstance().endEvent(y0v.getInstance().getEventByKey(this.f28443a));
            this.f28443a = "";
        }
    }

    public synchronized void endScroll(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7f82e39", new Object[]{this, str, new Integer(i), new Integer(i2)});
            return;
        }
        nhh.f("UTScrollTracker", "endScroll scrollKey", str, "scrollX", Integer.valueOf(i), "scrollY", Integer.valueOf(i2));
        if (!TextUtils.isEmpty(str)) {
            if (!str.equals(this.f28443a)) {
                nhh.v("UTScrollTracker", "miss beginScroll scrollKey", str);
                return;
            }
            v0v eventByKey = y0v.getInstance().getEventByKey(this.f28443a);
            eventByKey.setScrollPosition(i, i2);
            y0v.getInstance().endEvent(eventByKey);
            this.f28443a = "";
        }
    }

    public synchronized void beginScroll(String str, int i, int i2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbcbbb1e", new Object[]{this, str, new Integer(i), new Integer(i2), map});
            return;
        }
        nhh.f("UTScrollTracker", "beginScroll scrollKey", str, "scrollX", Integer.valueOf(i), "scrollY", Integer.valueOf(i2), wua.KEY_PROPERTIES, map);
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(this.f28443a)) {
                if (this.f28443a.equals(str)) {
                    nhh.v("UTScrollTracker", "repeat beginScroll", str);
                    return;
                }
                a();
            }
            this.f28443a = str;
            v0v eventByKey = y0v.getInstance().getEventByKey(str);
            eventByKey.setEventId(UTEventId.SCROLL.getEventId());
            eventByKey.setPageName(str);
            eventByKey.setScrollPosition(i, i2);
            eventByKey.updateProperties(map);
            eventByKey.setToLog(false);
            y0v.getInstance().beginEvent(eventByKey);
        }
    }
}
