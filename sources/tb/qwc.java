package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface qwc {
    public static final a MuiseViewFactory = a.$$INSTANCE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static qwc f26967a;

        static {
            t2o.a(815792785);
        }

        public final qwc a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qwc) ipChange.ipc$dispatch("6faad611", new Object[]{this});
            }
            return f26967a;
        }

        public final void b(qwc qwcVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8894d741", new Object[]{this, qwcVar});
            } else {
                f26967a = qwcVar;
            }
        }
    }

    Object a(String str);
}
