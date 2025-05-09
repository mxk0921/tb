package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.zk9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nfs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static b f24707a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.zk9.i
        public void onClassLoaded(Class<?> cls) {
            if (cls != null) {
                try {
                    nfs.a((b) cls.newInstance());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        void close();

        void setCursorMoveAnimDuration(long j);

        void setCursorThemeColor(int i, int i2);

        void setTargetScreenSize(int i, int i2);

        void show();

        void stop();

        void update(JSONObject jSONObject);
    }

    static {
        t2o.a(503317428);
    }

    public static /* synthetic */ b a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("15febe9b", new Object[]{bVar});
        }
        f24707a = bVar;
        return bVar;
    }

    public static b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f0772f9d", new Object[0]);
        }
        if (f24707a == null) {
            c();
        }
        return f24707a;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (f24707a == null) {
            zk9.b("com.taobao.cursor.CursorManager", new a());
        }
    }
}
